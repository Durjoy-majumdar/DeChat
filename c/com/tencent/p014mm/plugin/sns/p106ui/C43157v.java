package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.sns.ui.v */
public class C43157v implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f116747d;

    /* renamed from: e */
    public final /* synthetic */ List f116748e;

    /* renamed from: f */
    public final /* synthetic */ C57394a0 f116749f;

    public C43157v(C57394a0 a0Var, List list, List list2) {
        this.f116749f = a0Var;
        this.f116747d = list;
        this.f116748e = list2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$1");
        C57394a0 a0Var = this.f116749f;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
        C77407n nVar = a0Var.f164403b;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
        nVar.mo107567l((View) null);
        e0Var.clear();
        for (int i = 0; i < this.f116747d.size(); i++) {
            e0Var.mo107142f(((Integer) this.f116748e.get(i)).intValue(), (CharSequence) this.f116747d.get(i));
        }
        SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$1");
    }
}
