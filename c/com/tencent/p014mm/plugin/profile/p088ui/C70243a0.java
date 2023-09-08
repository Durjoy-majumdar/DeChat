package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import gl3.C75922b;
import gl3.C75937g;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;

/* renamed from: com.tencent.mm.plugin.profile.ui.a0 */
public class C70243a0 extends C74498h1 {

    /* renamed from: j */
    public C72996z1 f202986j;

    /* renamed from: n */
    public MMHandler f202987n = new MMHandler();

    /* renamed from: o */
    public C99664b f202988o;

    /* renamed from: p */
    public List<C99681n> f202989p;

    /* renamed from: q */
    public C61173o f202990q = new C70244a();

    /* renamed from: com.tencent.mm.plugin.profile.ui.a0$a */
    public class C70244a implements C61173o {
        public C70244a() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            if (lVar.f32074c == 0) {
                C70243a0 a0Var = C70243a0.this;
                List<C99681n> list = lVar.f32076e;
                a0Var.f202989p = list;
                C74498h1.C44878a aVar = a0Var.f219051i;
                if (aVar != null) {
                    aVar.mo62789t6(lVar.f32072a.f224468c, list.size(), true);
                }
            }
            C70243a0.this.mo103564g();
            C70243a0.this.notifyDataSetChanged();
        }
    }

    public C70243a0(C74493g1 g1Var, int i, C72996z1 z1Var) {
        super(g1Var, false, i);
        this.f202986j = z1Var;
    }

    public int getCount() {
        List<C99681n> list = this.f202989p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        C75937g gVar = new C75937g(i, this.f202986j);
        gVar.mo106181j(C97625j3.m125812b().mo105907v().get(this.f202989p.get(i).f292151e));
        return gVar;
    }

    /* renamed from: q */
    public void mo96748q() {
        if (this.f202988o != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f202988o);
        }
    }

    /* renamed from: r */
    public void mo63130r(String str, int[] iArr, boolean z) {
        C76728k kVar = new C76728k();
        kVar.f224468c = str;
        kVar.f224479n = this.f202987n;
        kVar.f224478m = this.f202990q;
        kVar.f224469d = this.f202986j.getUsername();
        kVar.f224467b = 7;
        this.f202988o = ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
    }
}
