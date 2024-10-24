package com.example.ballloon.lib

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.ArrowOrientationRules
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.createBalloon

class WidgetBalloonFactory : Balloon.Factory() {

    override fun create(context: Context, lifecycle: LifecycleOwner?): Balloon {
        return createBalloon(context) {
            setArrowOrientation(ArrowOrientation.BOTTOM)
            setArrowOrientationRules(ArrowOrientationRules.ALIGN_FIXED)
            setLifecycleOwner(lifecycle)
            setMarginLeft(25)
            setMarginTop(19)
            setArrowSize(8)
            setArrowPosition(0.1f)
            setCornerRadius(10f)
            setBalloonAnimation(BalloonAnimation.ELASTIC)
        }
    }
}