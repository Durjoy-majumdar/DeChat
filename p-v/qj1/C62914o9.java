package qj1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C0082q;
import cl1.C54991o;
import di3.C7335d;
import di3.C86312j;
import dj1.C58294z;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Map;
import l31.C61212e;
import rl1.C13022d0;
import te3.C50543nh1;
import te3.C52204z21;

/* renamed from: qj1.o9 */
public final class C62914o9 implements C58294z.C7350a {

    /* renamed from: a */
    public final /* synthetic */ C62949r8 f178533a;

    /* renamed from: b */
    public final /* synthetic */ String f178534b;

    /* renamed from: c */
    public final /* synthetic */ boolean f178535c;

    /* renamed from: d */
    public final /* synthetic */ long f178536d;

    public C62914o9(C62949r8 r8Var, String str, boolean z, long j) {
        this.f178533a = r8Var;
        this.f178534b = str;
        this.f178535c = z;
        this.f178536d = j;
    }

    /* renamed from: a */
    public void mo8521a(int i, int i2, String str, C50543nh1 nh12) {
        C87412m.m108594g(nh12, "resp");
        C62949r8.m74147j1(this.f178533a, i, i2, this.f178534b, nh12.f138606d, (C32224a) null, 16, (Object) null);
        if (this.f178533a.f178641p.getLiveRole() == 0 && i == 0 && i2 == 0) {
            C0082q qVar = ((C13022d0) ((C54991o) this.f178533a.mo87696x0(C54991o.class)).business(C13022d0.class)).f37098n;
            if (qVar != null) {
                String str2 = this.f178534b;
                C62949r8 r8Var = this.f178533a;
                if (qVar.f506a == 1) {
                    C52204z21 z212 = qVar.f509d;
                    if (C87412m.m108589b(str2, z212 != null ? z212.f145644h : null)) {
                        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_reply_lucky_comment", r8Var.f178648w, (Map<String, Object>) null, 25561);
                    }
                }
            }
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.my0((C54116w) c, C54067f0.C0071v0.SEND_SUCC_COMMENT, this.f178534b, (String) null, 0, 12, (Object) null);
            C62949r8.m74144d1(this.f178533a, this.f178535c, this.f178536d, this.f178534b);
        }
    }
}
