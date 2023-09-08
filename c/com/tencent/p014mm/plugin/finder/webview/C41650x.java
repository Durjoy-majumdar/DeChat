package com.tencent.p014mm.plugin.finder.webview;

import android.content.Context;
import android.view.Window;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import d93.C45310h;
import e00.C45520t;

/* renamed from: com.tencent.mm.plugin.finder.webview.x */
public interface C41650x {
    Context getContext();

    C45520t getController();

    String getCurrentURL();

    C43791l getInvoke();

    MultiCodeMaskView getMaskView();

    C45310h getPerm();

    Float getTouchX();

    Float getTouchY();

    int getWVTopOffset();

    MMWebView getWebView();

    Window getWindow();

    boolean isRelease();
}
