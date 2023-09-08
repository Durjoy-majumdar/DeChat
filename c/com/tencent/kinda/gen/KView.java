package com.tencent.kinda.gen;

public interface KView {
    void accessibilityClickFrom(KView kView);

    void accessibilityStatesType(StatesType statesType);

    void accessibilityTraitsType(TraitsType traitsType);

    void addBlurEffect(int i);

    void autoHeight();

    void autoWidth();

    KPoint convertPointToScreen(KPoint kPoint);

    KPoint convertPointToView(KPoint kPoint, KView kView);

    void expandHitSize(float f, float f2);

    String getAccessibilityString();

    boolean getAccessible();

    Align getAlignSelf();

    float getAlpha();

    float getAspectRatio();

    DynamicColor getBackgroundColor();

    DynamicColor getBorderColor();

    DynamicColor getBorderPressedColor();

    float getBorderWidth();

    float getBottom();

    float getBottomLeftCornerRadius();

    float getBottomPercent();

    float getBottomRightCornerRadius();

    boolean getClickable();

    float getCornerRadius();

    boolean getDisableHighlightDarkMode();

    boolean getEnableHighLight();

    float getFlexBasis();

    float getFlexGrow();

    float getFlexShrink();

    float getFrameOriginX();

    float getFrameOriginY();

    float getHeight();

    float getHeightPercent();

    boolean getIsRefreshing();

    float getLeft();

    float getLeftPercent();

    float getMarginBottom();

    float getMarginBottomPercent();

    float getMarginLeft();

    float getMarginLeftPercent();

    float getMarginRight();

    float getMarginRightPercent();

    float getMarginTop();

    float getMarginTopPercent();

    float getMaxHeight();

    float getMaxWidth();

    float getMinHeight();

    float getMinWidth();

    float getPaddingBottom();

    float getPaddingBottomPercent();

    float getPaddingLeft();

    float getPaddingLeftPercent();

    float getPaddingRight();

    float getPaddingRightPercent();

    float getPaddingTop();

    float getPaddingTopPercent();

    PositionType getPositionType();

    String getReportId();

    float getRight();

    float getRightPercent();

    float getRotation();

    float getScaleX();

    float getScaleY();

    boolean getSecure();

    DynamicColor getShadowColor();

    float getShadowOffset();

    float getShadowRadius();

    boolean getSupportDynamicSize();

    float getTop();

    float getTopLeftCornerRadius();

    float getTopPercent();

    float getTopRightCornerRadius();

    float getTranslateX();

    float getTranslateY();

    String getViewId();

    Visible getVisible();

    float getWidth();

    float getWidthPercent();

    void initWithPlatformDelegate(IUIPagePlatformDelegate iUIPagePlatformDelegate);

    void removeBlurEffect();

    void requestFrameImpl(VoidKRectCallback voidKRectCallback);

    void requestLayout();

    void setAccessibilityString(String str);

    void setAccessible(boolean z);

    void setAlignSelf(Align align);

    void setAlpha(float f);

    void setAspectRatio(float f);

    void setBackgroundColor(DynamicColor dynamicColor);

    void setBorderColor(DynamicColor dynamicColor);

    void setBorderPressedColor(DynamicColor dynamicColor);

    void setBorderWidth(float f);

    void setBottom(float f);

    void setBottomLeftCornerRadius(float f);

    void setBottomPercent(float f);

    void setBottomRightCornerRadius(float f);

    void setClickable(boolean z);

    void setCornerRadius(float f);

    void setDisableHighlightDarkMode(boolean z);

    void setEnableHighLight(boolean z);

    void setFlexBasis(float f);

    void setFlexGrow(float f);

    void setFlexShrink(float f);

    void setFrameImpl(KRect kRect, VoidCallback voidCallback);

    void setHeight(float f);

    void setHeightPercent(float f);

    void setIsRefreshing(boolean z);

    void setLeft(float f);

    void setLeftPercent(float f);

    void setMarginBottom(float f);

    void setMarginBottomPercent(float f);

    void setMarginLeft(float f);

    void setMarginLeftPercent(float f);

    void setMarginRight(float f);

    void setMarginRightPercent(float f);

    void setMarginTop(float f);

    void setMarginTopPercent(float f);

    void setMaxHeight(float f);

    void setMaxWidth(float f);

    void setMinHeight(float f);

    void setMinWidth(float f);

    void setOnClickCallback(KViewOnClickCallback kViewOnClickCallback);

    void setOnLongClickCallback(KViewOnLongClickCallback kViewOnLongClickCallback);

    void setOnTouchCallback(KViewOnTouchCallback kViewOnTouchCallback);

    void setPaddingBottom(float f);

    void setPaddingBottomPercent(float f);

    void setPaddingLeft(float f);

    void setPaddingLeftPercent(float f);

    void setPaddingRight(float f);

    void setPaddingRightPercent(float f);

    void setPaddingTop(float f);

    void setPaddingTopPercent(float f);

    void setPositionType(PositionType positionType);

    void setReportId(String str);

    void setRight(float f);

    void setRightPercent(float f);

    void setRotation(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setSecure(boolean z);

    void setShadowColor(DynamicColor dynamicColor);

    void setShadowOffset(float f);

    void setShadowRadius(float f);

    void setSupportDynamicSize(boolean z);

    void setTop(float f);

    void setTopLeftCornerRadius(float f);

    void setTopPercent(float f);

    void setTopRightCornerRadius(float f);

    void setTranslateX(float f);

    void setTranslateY(float f);

    void setViewId(String str);

    void setVisible(Visible visible);

    void setWidth(float f);

    void setWidthPercent(float f);
}
