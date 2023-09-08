package com.tencent.kinda.gen;

public interface KLink {
    void setBackground(DynamicColor dynamicColor, int i);

    void setFontStyle(FontStyle fontStyle);

    void setLinkCallbackImpl(VoidCallback voidCallback);

    void setLinkColor(DynamicColor dynamicColor);

    void setLinkFont(String str);

    void setLinkStyle(LinkStyle linkStyle);

    void setText(String str);

    void setTextSize(float f);
}
