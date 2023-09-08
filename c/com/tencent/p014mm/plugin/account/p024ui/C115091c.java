package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.account.ui.c */
public class C115091c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f345085d;

    /* renamed from: e */
    public final /* synthetic */ C115118e f345086e;

    /* renamed from: com.tencent.mm.plugin.account.ui.c$a */
    public class C115092a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345087d;

        public C115092a(C115091c cVar, C117747y yVar) {
            this.f345087d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345087d);
        }
    }

    public C115091c(C115118e eVar, Context context) {
        this.f345086e = eVar;
        this.f345085d = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115118e eVar = this.f345086e;
        C117747y c = eVar.mo174697c(eVar.f345146c, eVar.f345145b.getSecImgCode());
        C86709a0.m107524d().mo123460f(c);
        Context context = this.f345085d;
        C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f345085d.getString(C0966R.string.gda), true, true, new C115092a(this, c));
    }
}
