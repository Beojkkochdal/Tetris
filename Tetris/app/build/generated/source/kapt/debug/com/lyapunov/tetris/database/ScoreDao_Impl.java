package com.lyapunov.tetris.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ScoreDao_Impl implements ScoreDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Score> __insertionAdapterOfScore;

  private final EntityDeletionOrUpdateAdapter<Score> __deletionAdapterOfScore;

  public ScoreDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfScore = new EntityInsertionAdapter<Score>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Score` (`uuid`,`score_detail`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Score value) {
        stmt.bindLong(1, value.getUuid());
        if (value.getScore() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getScore());
        }
      }
    };
    this.__deletionAdapterOfScore = new EntityDeletionOrUpdateAdapter<Score>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Score` WHERE `uuid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Score value) {
        stmt.bindLong(1, value.getUuid());
      }
    };
  }

  @Override
  public Object insert(final Score[] score, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfScore.insert(score);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Score score, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfScore.handle(score);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getTopTen(final Continuation<? super List<Score>> p0) {
    final String _sql = "SELECT * FROM score ORDER BY score_detail DESC LIMIT 10";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Score>>() {
      @Override
      public List<Score> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfScore = CursorUtil.getColumnIndexOrThrow(_cursor, "score_detail");
          final List<Score> _result = new ArrayList<Score>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Score _item;
            final Integer _tmpScore;
            if (_cursor.isNull(_cursorIndexOfScore)) {
              _tmpScore = null;
            } else {
              _tmpScore = _cursor.getInt(_cursorIndexOfScore);
            }
            _item = new Score(_tmpScore);
            final int _tmpUuid;
            _tmpUuid = _cursor.getInt(_cursorIndexOfUuid);
            _item.setUuid(_tmpUuid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
