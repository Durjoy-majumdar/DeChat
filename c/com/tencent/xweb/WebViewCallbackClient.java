package com.tencent.xweb;

import android.view.View;

public interface WebViewCallbackClient {
    void onContentHeightChanged(int i);

    void onOverScrolled(int i, int i2, boolean z, boolean z2, View view);

    void onScrollChanged(int i, int i2, int i3, int i4, View view);

    boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view);
}
