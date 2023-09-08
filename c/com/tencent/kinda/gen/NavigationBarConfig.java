package com.tencent.kinda.gen;

public final class NavigationBarConfig {
    public DynamicColor mBackgroundColor;
    public String mBarTitle;
    public LeftBarButtonType mLeftBarButtonType;
    public DynamicColor mLeftButtonColor;
    public DynamicColor mRightButtonColor;
    public String mRightButtonImage;
    public String mRightButtonTitle;
    public DynamicColor mTitleColor;
    public boolean mUseBlackStatusbar;

    public NavigationBarConfig() {
    }

    public NavigationBarConfig(DynamicColor dynamicColor, boolean z, String str, DynamicColor dynamicColor2, LeftBarButtonType leftBarButtonType, DynamicColor dynamicColor3, String str2, String str3, DynamicColor dynamicColor4) {
        this.mBackgroundColor = dynamicColor;
        this.mUseBlackStatusbar = z;
        this.mBarTitle = str;
        this.mTitleColor = dynamicColor2;
        this.mLeftBarButtonType = leftBarButtonType;
        this.mLeftButtonColor = dynamicColor3;
        this.mRightButtonTitle = str2;
        this.mRightButtonImage = str3;
        this.mRightButtonColor = dynamicColor4;
    }

    public DynamicColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public String getBarTitle() {
        return this.mBarTitle;
    }

    public LeftBarButtonType getLeftBarButtonType() {
        return this.mLeftBarButtonType;
    }

    public DynamicColor getLeftButtonColor() {
        return this.mLeftButtonColor;
    }

    public DynamicColor getRightButtonColor() {
        return this.mRightButtonColor;
    }

    public String getRightButtonImage() {
        return this.mRightButtonImage;
    }

    public String getRightButtonTitle() {
        return this.mRightButtonTitle;
    }

    public DynamicColor getTitleColor() {
        return this.mTitleColor;
    }

    public boolean getUseBlackStatusbar() {
        return this.mUseBlackStatusbar;
    }

    public String toString() {
        return "NavigationBarConfig{mBackgroundColor=" + this.mBackgroundColor + ",mUseBlackStatusbar=" + this.mUseBlackStatusbar + ",mBarTitle=" + this.mBarTitle + ",mTitleColor=" + this.mTitleColor + ",mLeftBarButtonType=" + this.mLeftBarButtonType + ",mLeftButtonColor=" + this.mLeftButtonColor + ",mRightButtonTitle=" + this.mRightButtonTitle + ",mRightButtonImage=" + this.mRightButtonImage + ",mRightButtonColor=" + this.mRightButtonColor + "}";
    }
}
