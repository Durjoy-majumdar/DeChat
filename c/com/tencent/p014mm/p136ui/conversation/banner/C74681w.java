package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75598w3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.conversation.banner.w */
public class C74681w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f219557d;

    /* renamed from: e */
    public final /* synthetic */ int f219558e;

    /* renamed from: f */
    public final /* synthetic */ C74665a0 f219559f;

    public C74681w(C74665a0 a0Var, int i, int i2) {
        this.f219559f = a0Var;
        this.f219557d = i;
        this.f219558e = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75598w3.m90816e().mo105950b(this.f219557d, this.f219558e);
        C74665a0 a0Var = this.f219559f;
        a0Var.getClass();
        C88144b.m109789g(a0Var.f230570g.get(), "game", ".ui.GameCenterUI");
        C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 9, 1);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
