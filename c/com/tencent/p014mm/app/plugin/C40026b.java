package com.tencent.p014mm.app.plugin;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import te3.C50755oy3;

/* renamed from: com.tencent.mm.app.plugin.b */
public class C40026b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C40028c f107321d;

    /* renamed from: com.tencent.mm.app.plugin.b$a */
    public class C40027a implements DialogInterface.OnCancelListener {
        public C40027a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C40026b.this.f107321d.mo62717a(false, (C50755oy3) null);
        }
    }

    public C40026b(C40028c cVar) {
        this.f107321d = cVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.AddContact", "startShowLoading");
        C40028c cVar = this.f107321d;
        Context context = cVar.f107324e;
        cVar.f107325f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f107321d.f107324e.getString(C0966R.string.a4d), true, true, new C40027a());
    }
}
