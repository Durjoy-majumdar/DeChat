package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75592q0;
import eb0.C75598w3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.conversation.banner.x */
public class C74682x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219560d;

    /* renamed from: e */
    public final /* synthetic */ int f219561e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219562f;

    public C74682x(C74665a0 a0Var, int i, int i2) {
        this.f219562f = a0Var;
        this.f219560d = i;
        this.f219561e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219560d, this.f219561e);
        C74665a0 a0Var = this.f219562f;
        Context context = a0Var.f230570g.get();
        a0Var.getClass();
        if ((C75592q0.m90785o() & 65536) == 0) {
            C88144b.m109789g(context, "masssend", ".ui.MassSendHistoryUI");
        } else {
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", "masssendapp"), (Bundle) null);
        }
        C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 11, 1);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
