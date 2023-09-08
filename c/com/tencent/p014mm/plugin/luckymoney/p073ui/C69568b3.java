package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import wc3.C15140v;
import wd3.C78545b;
import wd3.C78574s0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.b3 */
public class C69568b3 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C69248m2 f200869g;

    /* renamed from: h */
    public final /* synthetic */ Context f200870h;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.b3$a */
    public class C69569a implements C78574s0 {
        public C69569a() {
        }

        /* renamed from: a */
        public void mo708a(int i) {
            if (i == -2 || i == 1) {
                C69568b3 b3Var = C69568b3.this;
                C75228t.m90215H(b3Var.f200870h, b3Var.f200869g.f199273g);
            }
        }
    }

    public C69568b3(C69558a3.C69560b bVar, C69248m2 m2Var, Context context) {
        this.f200869g = m2Var;
        this.f200870h = context;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C115669n.INSTANCE.mo160131h(11701, 14, 0, 0, 0, 2, Integer.valueOf(this.f200869g.f199274h));
        C69248m2 m2Var = this.f200869g;
        if (m2Var.f199276j != 1) {
            ((C78545b) ((C15140v) C86312j.m106911c(C15140v.class)).mo14097Ck(this.f200870h, this.f200869g.f199273g, 0, new C69569a())).mo108519f();
        } else {
            C75228t.m90223P(this.f200870h, m2Var.f199273g);
        }
    }
}
