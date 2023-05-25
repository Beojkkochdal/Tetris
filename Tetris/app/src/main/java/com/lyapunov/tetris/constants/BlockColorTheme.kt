package com.lyapunov.tetris.constants

object BlockColorTheme {
    const val THEME_MODERN: String = "MODERN"
    const val THEME_ESPRESSO: String = "ESPRESSO"
    const val THEME_SPECTRUM: String = "SPECTRUM"

    private val MODERN: Array<IntArray> = arrayOf(
            intArrayOf(255, 254, 114, 149),
            intArrayOf(255, 255, 146, 177),
            intArrayOf(255, 244, 183, 198),
            intArrayOf(255, 255, 229, 229),
            intArrayOf(255, 255, 197, 186),
            intArrayOf(255, 251, 179, 165),
            intArrayOf(255, 255, 146, 134),
            intArrayOf(255, 245, 248, 251))
    private val ESPRESSO: Array<IntArray> = arrayOf (
            intArrayOf(255, 54, 54, 54),
            intArrayOf(255, 208, 83, 85),
            intArrayOf(255, 166, 193, 102),
            intArrayOf(255, 254, 197, 116),
            intArrayOf(255, 109, 154, 186),
            intArrayOf(255, 208, 153, 215),
            intArrayOf(255, 191, 215, 253),
            intArrayOf(255, 238, 238, 236))
    private val SPECTRUM: Array<IntArray> = arrayOf (
            intArrayOf(255, 251, 99, 142),
            intArrayOf(255, 127, 215, 146),
            intArrayOf(255, 251, 228, 111),
            intArrayOf(255, 251, 147, 90),
            intArrayOf(255, 149, 140, 124),
            intArrayOf(255, 96, 212, 229),
            intArrayOf(255, 51, 51, 52),
            intArrayOf(255, 247, 241, 255))

    fun getTheme(themeName: String): Array<IntArray> {
        return when (themeName){
            THEME_ESPRESSO -> ESPRESSO
            THEME_SPECTRUM -> SPECTRUM
            else -> MODERN
        }
    }
}