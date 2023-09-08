package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C6027c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C49293ej2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.a */
public class C6198a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C6027c0 f22881d;

    /* renamed from: e */
    public final /* synthetic */ int f22882e;

    /* renamed from: f */
    public final /* synthetic */ C49293ej2 f22883f;

    /* renamed from: g */
    public final /* synthetic */ C6210c f22884g;

    public C6198a(C6210c cVar, C6027c0 c0Var, int i, C49293ej2 ej22) {
        this.f22884g = cVar;
        this.f22881d = c0Var;
        this.f22882e = i;
        this.f22883f = ej22;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click ok");
        this.f22884g.mo7275a(this.f22881d, this.f22882e, this.f22883f);
    }
}
