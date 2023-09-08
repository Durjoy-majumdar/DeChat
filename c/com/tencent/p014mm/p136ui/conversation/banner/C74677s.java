package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75598w3;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.ui.conversation.banner.s */
public class C74677s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219545d;

    /* renamed from: e */
    public final /* synthetic */ int f219546e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219547f;

    public C74677s(C74665a0 a0Var, int i, int i2) {
        this.f219547f = a0Var;
        this.f219545d = i;
        this.f219546e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219545d, this.f219546e);
        C74665a0 a0Var = this.f219547f;
        Context context = a0Var.f230570g.get();
        a0Var.getClass();
        if (context != null) {
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(context, (View) null);
            } else {
                Intent intent = new Intent();
                intent.putExtra("intent_set_avatar", true);
                intent.putExtra("KEnterFromBanner", true);
                C88144b.m109791i(context, "setting", ".ui.setting.SettingsPersonalInfoUI", intent, (Bundle) null);
                C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 4, 1);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
