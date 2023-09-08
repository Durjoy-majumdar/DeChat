package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import vo3.C111566g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.p0 */
public final class C44353p0 implements C111566g {

    /* renamed from: a */
    public final /* synthetic */ C44341n0 f120209a;

    public C44353p0(C44341n0 n0Var) {
        this.f120209a = n0Var;
    }

    /* renamed from: a */
    public boolean mo69090a() {
        int measuredHeight = this.f120209a.mo69079C().getMeasuredHeight();
        int webScrollY = this.f120209a.mo69079C().getWebScrollY();
        this.f120209a.getClass();
        int scrollHeight = this.f120209a.mo69079C().getScrollHeight();
        boolean z = (webScrollY + 0) + measuredHeight >= scrollHeight;
        if (Log.getLogLevel() < 1) {
            this.f120209a.getClass();
            Log.m105919d("MicroMsg.MMWebViewWithController", "isOverScrollEnd ContentHeight:%s, WebScrollY:%s, ScrollHeight:%s, MeasuredHeight:%s, gap:%s, res:%s", Integer.valueOf(this.f120209a.mo69079C().getContentHeight()), Integer.valueOf(this.f120209a.mo69079C().getWebScrollY()), Integer.valueOf(scrollHeight), Integer.valueOf(measuredHeight), 0, Boolean.valueOf(z));
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo69091b() {
        boolean isOverScrollStart = this.f120209a.mo69079C().isOverScrollStart();
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.MMWebViewWithController", "isAtStart() called res:" + isOverScrollStart);
        }
        return isOverScrollStart;
    }

    /* renamed from: c */
    public View mo69092c() {
        return this.f120209a.mo69079C();
    }
}
