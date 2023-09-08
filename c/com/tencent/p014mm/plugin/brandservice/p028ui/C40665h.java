package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView;
import ef2.C45654d;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.h */
public class C40665h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f109252d;

    /* renamed from: e */
    public final /* synthetic */ Context f109253e;

    /* renamed from: f */
    public final /* synthetic */ EnterpriseBizContactListView.C40614e f109254f;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.h$a */
    public class C40666a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45654d f109255d;

        public C40666a(C45654d dVar) {
            this.f109255d = dVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f109255d);
            C86709a0.m107524d().mo123470p(1394, C40665h.this.f109254f);
        }
    }

    public C40665h(EnterpriseBizContactListView.C40614e eVar, String str, Context context) {
        this.f109254f = eVar;
        this.f109252d = str;
        this.f109253e = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C45654d dVar = new C45654d(this.f109252d, true);
        C86709a0.m107524d().mo123455a(1394, this.f109254f);
        C86709a0.m107524d().mo123460f(dVar);
        EnterpriseBizContactListView.C40614e eVar = this.f109254f;
        Context context = this.f109253e;
        eVar.f109107f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f109253e.getString(C0966R.string.a4d), true, true, new C40666a(dVar));
    }
}
