package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C6027c0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import te3.wp4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.b */
public class C6204b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C6027c0 f22902d;

    /* renamed from: e */
    public final /* synthetic */ int f22903e;

    public C6204b(C6210c cVar, C6027c0 c0Var, int i) {
        this.f22902d = c0Var;
        this.f22903e = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click cancel");
        C6027c0 c0Var = this.f22902d;
        c0Var.f22278f.mo7263b(C6210c.C6211a.C6212a.RET_REJECT, "cancel", (LinkedList<wp4>) null, this.f22903e, c0Var.mo6997j1().f134074d.f134688d);
    }
}
