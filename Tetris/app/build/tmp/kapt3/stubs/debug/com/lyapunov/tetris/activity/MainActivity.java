package com.lyapunov.tetris.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J1\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002\u00a2\u0006\u0002\u00101J1\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\f\u00103\u001a\b\u0012\u0004\u0012\u0002000!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002\u00a2\u0006\u0002\u00101J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u000fH\u0016J\u001b\u00106\u001a\u00020*2\f\u00107\u001a\b\u0012\u0004\u0012\u0002000!H\u0016\u00a2\u0006\u0002\u00108J\u0012\u00109\u001a\u00020*2\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\b\u0010<\u001a\u00020*H\u0014J\b\u0010=\u001a\u00020*H\u0014J\b\u0010>\u001a\u00020*H\u0002J\b\u0010?\u001a\u00020*H\u0016J \u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010#R\u000e\u0010$\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/lyapunov/tetris/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/lyapunov/tetris/game/GameObserver;", "()V", "ROTATEDURATION", "", "alertBuilder", "Landroidx/appcompat/app/AlertDialog$Builder;", "binding", "Lcom/lyapunov/tetris/databinding/ActivityMainBinding;", "blockWidth", "", "canvasHeight", "canvasWidth", "initialLevel", "", "lastClickDown", "lastClickLeft", "lastClickRight", "lastClickRotate", "lastClickUp", "levelAnimator", "Landroid/animation/ObjectAnimator;", "levels", "Landroid/widget/TextView;", "lineAnimator", "lineWidth", "lines", "nextCanvasHeight", "nextCanvasWidth", "nextSurfaceHolder", "Landroid/view/SurfaceHolder;", "paintArray", "", "Landroid/graphics/Paint;", "[Landroid/graphics/Paint;", "scoreAnimator", "scores", "surfaceHolder", "themeName", "", "drawInitialBoard", "", "canvas", "Landroid/graphics/Canvas;", "drawInitialNextBoard", "drawInstantBoard", "boardMatrix", "", "(Landroid/graphics/Canvas;[[I[Landroid/graphics/Paint;)V", "drawInstantNextBoard", "nextMatrix", "gameEnd", "finalScore", "generateNewBlock", "shapeNum", "([[I)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStop", "setPaint", "updateCanvas", "updateGameInfo", "totalClearedLines", "score", "level", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.lyapunov.tetris.game.GameObserver {
    private android.view.SurfaceHolder surfaceHolder;
    private android.view.SurfaceHolder nextSurfaceHolder;
    private android.graphics.Paint[] paintArray;
    private float canvasHeight = 0.0F;
    private float canvasWidth = 0.0F;
    private float lineWidth = 0.0F;
    private float blockWidth = 0.0F;
    private float nextCanvasHeight = 0.0F;
    private float nextCanvasWidth = 0.0F;
    private int initialLevel = 1;
    private long lastClickLeft = 0L;
    private long lastClickRight = 0L;
    private long lastClickRotate = 0L;
    private long lastClickDown = 0L;
    private long lastClickUp = 0L;
    private android.widget.TextView lines;
    private android.widget.TextView levels;
    private android.widget.TextView scores;
    private androidx.appcompat.app.AlertDialog.Builder alertBuilder;
    private com.lyapunov.tetris.databinding.ActivityMainBinding binding;
    private java.lang.String themeName = "MODERN";
    private android.animation.ObjectAnimator lineAnimator;
    private android.animation.ObjectAnimator scoreAnimator;
    private android.animation.ObjectAnimator levelAnimator;
    private final long ROTATEDURATION = 1000L;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * Draw initial background and lines
     */
    private final void drawInitialBoard(android.graphics.Canvas canvas) {
    }
    
    /**
     * Draw current status of a canvas
     */
    private final void drawInstantBoard(android.graphics.Canvas canvas, int[][] boardMatrix, android.graphics.Paint[] paintArray) {
    }
    
    /**
     * Draw initial background and lines for the board showing next block
     */
    private final void drawInitialNextBoard(android.graphics.Canvas canvas) {
    }
    
    /**
     * Draw current status of a canvas for the board showing next block
     */
    private final void drawInstantNextBoard(android.graphics.Canvas canvas, int[][] nextMatrix, android.graphics.Paint[] paintArray) {
    }
    
    private final void setPaint() {
    }
    
    /**
     * Get board update
     */
    @java.lang.Override()
    public void updateCanvas() {
    }
    
    /**
     * Get update, when a new block is generated, its next block shall change
     */
    @java.lang.Override()
    public void generateNewBlock(@org.jetbrains.annotations.NotNull()
    int[][] shapeNum) {
    }
    
    @java.lang.Override()
    public void updateGameInfo(int totalClearedLines, int score, int level) {
    }
    
    @java.lang.Override()
    public void gameEnd(int finalScore) {
    }
    
    public MainActivity() {
        super();
    }
}