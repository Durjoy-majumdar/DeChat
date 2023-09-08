package com.tencent.kinda.gen;

public interface KLabelView extends KView {
    boolean getAdjustsFontSizeToFitWidth();

    BaselineAdjustmentAlign getBaselineAdjustment();

    Ellipsize getEllipsize();

    FontStyle getFontStyle();

    float getLineSpacingFactor();

    int getLines();

    int getMaxLength();

    String getText();

    TextAlign getTextAlign();

    DynamicColor getTextColor();

    String getTextFont();

    float getTextSize();

    void setAdjustsFontSizeToFitWidth(boolean z);

    void setBaselineAdjustment(BaselineAdjustmentAlign baselineAdjustmentAlign);

    void setEllipsize(Ellipsize ellipsize);

    void setFontStyle(FontStyle fontStyle);

    void setLineSpacingFactor(float f);

    void setLines(int i);

    void setMaxLength(int i);

    void setText(String str);

    void setTextAlign(TextAlign textAlign);

    void setTextColor(DynamicColor dynamicColor);

    void setTextFont(String str);

    void setTextSize(float f);
}
