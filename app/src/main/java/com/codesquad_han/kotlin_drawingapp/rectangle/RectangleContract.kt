package com.codesquad_han.kotlin_drawingapp.rectangle

import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import com.codesquad_han.kotlin_drawingapp.BasePresenter
import com.codesquad_han.kotlin_drawingapp.BaseView
import com.codesquad_han.kotlin_drawingapp.model.Rectangle
import com.codesquad_han.kotlin_drawingapp.model.RectangleImageviewData

interface RectangleContract {

    interface View : BaseView<Presenter> {
        fun showRectangle(updatedRectangleList: MutableList<Rectangle>)   // 추가된 사각형을 포함한 리스트 받아와서 새로 그리기
    }

    interface Presenter : BasePresenter {
        var liveRectangleList : MutableLiveData<MutableList<Rectangle>>

        fun addRectangle() // 사각형 생성

        fun getRectangleList()

        fun updateTransparency(id: String, transparency: Int) // 선택한 사각형 투명도 변경
    }
}