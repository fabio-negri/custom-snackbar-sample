package com.example.customsnackbar.chef

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.animation.OvershootInterpolator
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customsnackbar.R
import com.google.android.material.snackbar.ContentViewCallback

class ChefSnackbarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ContentViewCallback {

    private val chefImage: ImageView

    init {
        View.inflate(context, R.layout.view_snackbar_chef, this)
        clipToPadding = false
        this.chefImage = findViewById(R.id.chef_image)
    }

    override fun animateContentIn(delay: Int, duration: Int) {
        val scaleX = ObjectAnimator.ofFloat(chefImage, View.SCALE_X, 0f, 1f)
        val scaleY = ObjectAnimator.ofFloat(chefImage, View.SCALE_Y, 0f, 1f)
        val animatorSet = AnimatorSet().apply {
            interpolator = OvershootInterpolator()
            setDuration(500)
            playTogether(scaleX, scaleY)
        }
        animatorSet.start()
    }

    override fun animateContentOut(delay: Int, duration: Int) {
    }
}