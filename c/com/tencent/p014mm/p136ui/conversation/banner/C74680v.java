package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75598w3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.conversation.banner.v */
public class C74680v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219554d;

    /* renamed from: e */
    public final /* synthetic */ int f219555e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219556f;

    public C74680v(C74665a0 a0Var, int i, int i2) {
        this.f219556f = a0Var;
        this.f219554d = i;
        this.f219555e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219554d, this.f219555e);
        C74665a0 a0Var = this.f219556f;
        a0Var.getClass();
        Intent intent = new Intent();
        intent.putExtra("preceding_scence", 17);
        C88144b.m109791i(a0Var.f230570g.get(), "emoji", ".ui.v2.EmojiStoreV2UI", intent, (Bundle) null);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 10, 1);
        nVar.mo160131h(12065, 2);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
