package com.lyapunov.tetris.constants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000fR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/lyapunov/tetris/constants/BlockColorTheme;", "", "()V", "ESPRESSO", "", "", "[[I", "MODERN", "SPECTRUM", "THEME_ESPRESSO", "", "THEME_MODERN", "THEME_SPECTRUM", "getTheme", "themeName", "(Ljava/lang/String;)[[I", "app_debug"})
public final class BlockColorTheme {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String THEME_MODERN = "MODERN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String THEME_ESPRESSO = "ESPRESSO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String THEME_SPECTRUM = "SPECTRUM";
    private static final int[][] MODERN = {{255, 254, 114, 149}, {255, 255, 146, 177}, {255, 244, 183, 198}, {255, 255, 229, 229}, {255, 255, 197, 186}, {255, 251, 179, 165}, {255, 255, 146, 134}, {255, 245, 248, 251}};
    private static final int[][] ESPRESSO = {{255, 54, 54, 54}, {255, 208, 83, 85}, {255, 166, 193, 102}, {255, 254, 197, 116}, {255, 109, 154, 186}, {255, 208, 153, 215}, {255, 191, 215, 253}, {255, 238, 238, 236}};
    private static final int[][] SPECTRUM = {{255, 251, 99, 142}, {255, 127, 215, 146}, {255, 251, 228, 111}, {255, 251, 147, 90}, {255, 149, 140, 124}, {255, 96, 212, 229}, {255, 51, 51, 52}, {255, 247, 241, 255}};
    @org.jetbrains.annotations.NotNull()
    public static final com.lyapunov.tetris.constants.BlockColorTheme INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final int[][] getTheme(@org.jetbrains.annotations.NotNull()
    java.lang.String themeName) {
        return null;
    }
    
    private BlockColorTheme() {
        super();
    }
}