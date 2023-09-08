package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$d */
public class SDKOAuthUI$$d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f249434d;

    /* renamed from: e */
    public final /* synthetic */ boolean f249435e;

    /* renamed from: f */
    public final /* synthetic */ SDKOAuthUI f249436f;

    public SDKOAuthUI$$d(SDKOAuthUI sDKOAuthUI, String str, boolean z) {
        this.f249436f = sDKOAuthUI;
        this.f249434d = str;
        this.f249435e = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SDKOAuthUI sDKOAuthUI = this.f249436f;
        if (!sDKOAuthUI.f249426v) {
            sDKOAuthUI.mo118957J7(-1, this.f249434d);
        }
        if (this.f249435e) {
            this.f249436f.finish();
        }
    }
}
