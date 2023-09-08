package com.tencent.kinda.framework.widget.base;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.tencent.kinda.framework.animate.KindaGlobalAnimator;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.gen.Align;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.IUIPagePlatformDelegate;
import com.tencent.kinda.gen.KPoint;
import com.tencent.kinda.gen.KRect;
import com.tencent.kinda.gen.KView;
import com.tencent.kinda.gen.KViewOnClickCallback;
import com.tencent.kinda.gen.KViewOnLongClickCallback;
import com.tencent.kinda.gen.KViewOnTouchCallback;
import com.tencent.kinda.gen.PositionType;
import com.tencent.kinda.gen.StatesType;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.kinda.gen.Visible;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidKRectCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

public class KViewAnimatorProxy implements KView {
    /* access modifiers changed from: private */
    public KView mKView;

    public KViewAnimatorProxy(KView kView) {
        this.mKView = kView;
    }

    public void accessibilityClickFrom(KView kView) {
    }

    public void accessibilityStatesType(StatesType statesType) {
    }

    public void accessibilityTraitsType(TraitsType traitsType) {
    }

    public void addBlurEffect(int i) {
    }

    public void autoHeight() {
    }

    public void autoWidth() {
    }

    public KPoint convertPointToScreen(KPoint kPoint) {
        return null;
    }

    public KPoint convertPointToView(KPoint kPoint, KView kView) {
        return null;
    }

    public void expandHitSize(float f, float f2) {
    }

    public String getAccessibilityString() {
        return null;
    }

    public boolean getAccessible() {
        return false;
    }

    public Align getAlignSelf() {
        return null;
    }

    public float getAlpha() {
        return 0.0f;
    }

    public float getAspectRatio() {
        return 0.0f;
    }

    public DynamicColor getBackgroundColor() {
        return null;
    }

    public DynamicColor getBorderColor() {
        return null;
    }

    public DynamicColor getBorderPressedColor() {
        return null;
    }

    public float getBorderWidth() {
        return 0.0f;
    }

    public float getBottom() {
        return 0.0f;
    }

    public float getBottomLeftCornerRadius() {
        return 0.0f;
    }

    public float getBottomPercent() {
        return 0.0f;
    }

    public float getBottomRightCornerRadius() {
        return 0.0f;
    }

    public boolean getClickable() {
        return false;
    }

    public float getCornerRadius() {
        return 0.0f;
    }

    public boolean getDisableHighlightDarkMode() {
        return false;
    }

    public boolean getEnableHighLight() {
        return false;
    }

    public float getFlexBasis() {
        return 0.0f;
    }

    public float getFlexGrow() {
        return 0.0f;
    }

    public float getFlexShrink() {
        return 0.0f;
    }

    public float getFrameOriginX() {
        return 0.0f;
    }

    public float getFrameOriginY() {
        return 0.0f;
    }

    public float getHeight() {
        return 0.0f;
    }

    public float getHeightPercent() {
        return 0.0f;
    }

    public boolean getIsRefreshing() {
        return false;
    }

    public float getLeft() {
        return 0.0f;
    }

    public float getLeftPercent() {
        return 0.0f;
    }

    public float getMarginBottom() {
        return this.mKView.getMarginBottom();
    }

    public float getMarginBottomPercent() {
        return 0.0f;
    }

    public float getMarginLeft() {
        return this.mKView.getMarginLeft();
    }

    public float getMarginLeftPercent() {
        return 0.0f;
    }

    public float getMarginRight() {
        return this.mKView.getMarginRight();
    }

    public float getMarginRightPercent() {
        return 0.0f;
    }

    public float getMarginTop() {
        return this.mKView.getMarginTop();
    }

    public float getMarginTopPercent() {
        return 0.0f;
    }

    public float getMaxHeight() {
        return 0.0f;
    }

    public float getMaxWidth() {
        return 0.0f;
    }

    public float getMinHeight() {
        return 0.0f;
    }

    public float getMinWidth() {
        return 0.0f;
    }

    public float getPaddingBottom() {
        return 0.0f;
    }

    public float getPaddingBottomPercent() {
        return 0.0f;
    }

    public float getPaddingLeft() {
        return 0.0f;
    }

    public float getPaddingLeftPercent() {
        return 0.0f;
    }

    public float getPaddingRight() {
        return 0.0f;
    }

    public float getPaddingRightPercent() {
        return 0.0f;
    }

    public float getPaddingTop() {
        return 0.0f;
    }

    public float getPaddingTopPercent() {
        return 0.0f;
    }

    public PositionType getPositionType() {
        return null;
    }

    public String getReportId() {
        return null;
    }

    public float getRight() {
        return 0.0f;
    }

    public float getRightPercent() {
        return 0.0f;
    }

    public float getRotation() {
        return 0.0f;
    }

    public float getScaleX() {
        return 0.0f;
    }

    public float getScaleY() {
        return 0.0f;
    }

    public boolean getSecure() {
        return false;
    }

    public DynamicColor getShadowColor() {
        return null;
    }

    public float getShadowOffset() {
        return 0.0f;
    }

    public float getShadowRadius() {
        return 0.0f;
    }

    public boolean getSupportDynamicSize() {
        return false;
    }

    public float getTop() {
        return 0.0f;
    }

    public float getTopLeftCornerRadius() {
        return 0.0f;
    }

    public float getTopPercent() {
        return 0.0f;
    }

    public float getTopRightCornerRadius() {
        return 0.0f;
    }

    public float getTranslateX() {
        return 0.0f;
    }

    public float getTranslateY() {
        return 0.0f;
    }

    public String getViewId() {
        return null;
    }

    public Visible getVisible() {
        return null;
    }

    public float getWidth() {
        return 0.0f;
    }

    public float getWidthPercent() {
        return 0.0f;
    }

    public void initWithPlatformDelegate(IUIPagePlatformDelegate iUIPagePlatformDelegate) {
    }

    public void removeBlurEffect() {
    }

    public void requestFrameImpl(VoidKRectCallback voidKRectCallback) {
    }

    public void requestLayout() {
    }

    public void setAccessibilityString(String str) {
    }

    public void setAccessible(boolean z) {
    }

    public void setAlignSelf(Align align) {
    }

    public void setAlpha(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "alpha", new float[]{kView.getAlpha(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setAspectRatio(float f) {
    }

    public void setBackgroundColor(DynamicColor dynamicColor) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{(int) ColorUtil.getColorByMode(this.mKView.getBackgroundColor()), (int) ColorUtil.getColorByMode(dynamicColor)});
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                long intValue = (long) ((Integer) valueAnimator.getAnimatedValue()).intValue();
                KViewAnimatorProxy.this.mKView.setBackgroundColor(new DynamicColor(intValue, 0));
                Log.m105918d(MMKView.TAG, "已经给背景颜色设置动画KView：" + KViewAnimatorProxy.this.mKView + "，value：" + Long.toHexString(ColorUtil.absColor(intValue)));
            }
        });
        KindaGlobalAnimator.addAnimator(ofArgb);
    }

    public void setBorderColor(DynamicColor dynamicColor) {
    }

    public void setBorderPressedColor(DynamicColor dynamicColor) {
    }

    public void setBorderWidth(float f) {
    }

    public void setBottom(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "bottom", new float[]{kView.getBottom(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setBottomLeftCornerRadius(float f) {
    }

    public void setBottomPercent(float f) {
    }

    public void setBottomRightCornerRadius(float f) {
    }

    public void setClickable(boolean z) {
    }

    public void setCornerRadius(float f) {
    }

    public void setDisableHighlightDarkMode(boolean z) {
    }

    public void setEnableHighLight(boolean z) {
    }

    public void setFlexBasis(float f) {
    }

    public void setFlexGrow(float f) {
    }

    public void setFlexShrink(float f) {
    }

    public void setFrameImpl(KRect kRect, VoidCallback voidCallback) {
    }

    public void setHeight(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "height", new float[]{kView.getHeight(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setHeightPercent(float f) {
    }

    public void setIsRefreshing(boolean z) {
    }

    public void setLeft(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "left", new float[]{kView.getLeft(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setLeftPercent(float f) {
    }

    public void setMarginBottom(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "marginBottom", new float[]{kView.getMarginBottom(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setMarginBottomPercent(float f) {
    }

    public void setMarginLeft(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "marginLeft", new float[]{kView.getMarginLeft(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setMarginLeftPercent(float f) {
    }

    public void setMarginRight(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "marginRight", new float[]{kView.getMarginRight(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setMarginRightPercent(float f) {
    }

    public void setMarginTop(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "marginTop", new float[]{kView.getMarginTop(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setMarginTopPercent(float f) {
    }

    public void setMaxHeight(float f) {
    }

    public void setMaxWidth(float f) {
    }

    public void setMinHeight(float f) {
    }

    public void setMinWidth(float f) {
    }

    public void setOnClickCallback(KViewOnClickCallback kViewOnClickCallback) {
    }

    public void setOnLongClickCallback(KViewOnLongClickCallback kViewOnLongClickCallback) {
    }

    public void setOnTouchCallback(KViewOnTouchCallback kViewOnTouchCallback) {
    }

    public void setPaddingBottom(float f) {
    }

    public void setPaddingBottomPercent(float f) {
    }

    public void setPaddingLeft(float f) {
    }

    public void setPaddingLeftPercent(float f) {
    }

    public void setPaddingRight(float f) {
    }

    public void setPaddingRightPercent(float f) {
    }

    public void setPaddingTop(float f) {
    }

    public void setPaddingTopPercent(float f) {
    }

    public void setPositionType(PositionType positionType) {
    }

    public void setReportId(String str) {
    }

    public void setRight(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "right", new float[]{kView.getRight(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setRightPercent(float f) {
    }

    public void setRotation(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "rotation", new float[]{kView.getRotation(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setScaleX(float f) {
        Log.m105918d(MMKView.TAG, "setScaleX此时进入动画setter状态。");
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "scaleX", new float[]{kView.getScaleX(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setScaleY(float f) {
        Log.m105918d(MMKView.TAG, "setScaleY此时进入动画setter状态。");
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "scaleY", new float[]{kView.getScaleY(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setSecure(boolean z) {
    }

    public void setShadowColor(DynamicColor dynamicColor) {
    }

    public void setShadowOffset(float f) {
    }

    public void setShadowRadius(float f) {
    }

    public void setSupportDynamicSize(boolean z) {
    }

    public void setTop(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "top", new float[]{kView.getTop(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setTopLeftCornerRadius(float f) {
    }

    public void setTopPercent(float f) {
    }

    public void setTopRightCornerRadius(float f) {
    }

    public void setTranslateX(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "translateX", new float[]{kView.getTranslateX(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setTranslateY(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "translateY", new float[]{kView.getTranslateY(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setViewId(String str) {
    }

    public void setVisible(Visible visible) {
    }

    public void setWidth(float f) {
        KView kView = this.mKView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kView, "width", new float[]{kView.getWidth(), f});
        ofFloat.setDuration(KindaGlobalAnimator.animateDuration());
        KindaGlobalAnimator.addAnimator(ofFloat);
    }

    public void setWidthPercent(float f) {
    }
}
