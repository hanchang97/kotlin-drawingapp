package com.codesquad_han.kotlin_drawingapp.rectangle

interface RectangleViewClickInterface {
    fun clickDrawingView(color: String, alpha: Int, selected: Boolean, id: String)

    fun updateSelectedRectanglePoint(id: String, newX : Int, newY : Int)
}