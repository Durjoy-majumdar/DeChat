package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$h0 */
public class MsgHandler$$h0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f22784d;

    /* renamed from: e */
    public final /* synthetic */ String f22785e;

    /* renamed from: f */
    public final /* synthetic */ String f22786f;

    /* renamed from: g */
    public final /* synthetic */ int f22787g;

    /* renamed from: h */
    public final /* synthetic */ int f22788h;

    /* renamed from: i */
    public final /* synthetic */ int f22789i;

    /* renamed from: j */
    public final /* synthetic */ String f22790j;

    /* renamed from: n */
    public final /* synthetic */ boolean f22791n;

    /* renamed from: o */
    public final /* synthetic */ MsgHandler f22792o;

    public MsgHandler$$h0(MsgHandler msgHandler, C13851h1 h1Var, String str, String str2, int i, int i2, int i3, String str3, boolean z) {
        this.f22792o = msgHandler;
        this.f22784d = h1Var;
        this.f22785e = str;
        this.f22786f = str2;
        this.f22787g = i;
        this.f22788h = i2;
        this.f22789i = i3;
        this.f22790j = str3;
        this.f22791n = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f22792o.mo7197c7(this.f22784d, this.f22785e, this.f22786f, this.f22787g, this.f22788h, this.f22789i, this.f22790j, this.f22791n);
    }
}
