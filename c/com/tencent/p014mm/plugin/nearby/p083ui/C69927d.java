package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.Context;
import android.content.DialogInterface;
import cc2.C54713e;
import com.tencent.p014mm.C0966R;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.nearby.ui.d */
public class C69927d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C69920a f201736d;

    /* renamed from: com.tencent.mm.plugin.nearby.ui.d$a */
    public class C69928a implements DialogInterface.OnCancelListener {
        public C69928a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(C69927d.this.f201736d.f201727h);
        }
    }

    public C69927d(C69920a aVar) {
        this.f201736d = aVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f201736d.f201727h = new C54713e(2, 0.0f, 0.0f, 0, 0, "", "");
        C86709a0.m107524d().mo123460f(this.f201736d.f201727h);
        C69920a aVar = this.f201736d;
        Context context = aVar.f201724e;
        aVar.f201726g = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f201736d.f201724e.getString(C0966R.string.h5h), true, true, new C69928a());
    }
}
