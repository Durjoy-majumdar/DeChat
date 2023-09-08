package com.tencent.p014mm.app.plugin;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76912y0;
import qo3.C89779i0;
import te3.C50755oy3;

/* renamed from: com.tencent.mm.app.plugin.a */
public class C40025a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C40028c f107320d;

    public C40025a(C40028c cVar) {
        this.f107320d = cVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.AddContact", "check short link timeout");
        this.f107320d.f107331o.set(true);
        C40028c cVar = this.f107320d;
        C89779i0 i0Var = cVar.f107325f;
        if (i0Var != null) {
            i0Var.dismiss();
            cVar.f107325f = null;
        }
        Context context = this.f107320d.f107324e;
        C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.a35), 1).show();
        this.f107320d.mo62717a(false, (C50755oy3) null);
    }
}
