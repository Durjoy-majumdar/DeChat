package com.tencent.p014mm.plugin.appbrand.debugger;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.i0 */
public class C68596i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f197042d;

    /* renamed from: e */
    public final /* synthetic */ C68600m0 f197043e;

    public C68596i0(C68600m0 m0Var, String str) {
        this.f197043e = m0Var;
        this.f197042d = str;
    }

    public void run() {
        C68600m0 m0Var = this.f197043e;
        String str = this.f197042d;
        Context context = m0Var.getContext();
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            C77389a aVar = new C77389a();
            aVar.f225644a = "";
            aVar.f225660q = context.getString(C0966R.string.f7848to, new Object[]{str});
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.au5);
            aVar.f225620C = new C68597j0(m0Var);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.setCancelable(true);
            gVar.show();
        }
    }
}
