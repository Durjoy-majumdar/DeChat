package p152f0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p009c2.C104247d;
import p009c2.C104249e;
import p009c2.C104253h;
import p009c2.C104269s;
import p009c2.C28482z;
import p155g0.C107601b0;
import p155g0.C107622i0;
import p735w1.C38006x;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: f0.r1 */
public final class C107404r1 {

    /* renamed from: a */
    public final C107394p2 f321354a;

    /* renamed from: b */
    public final C107601b0 f321355b;

    /* renamed from: c */
    public final C28482z f321356c;

    /* renamed from: d */
    public final boolean f321357d;

    /* renamed from: e */
    public final boolean f321358e;

    /* renamed from: f */
    public final C107622i0 f321359f;

    /* renamed from: g */
    public final C104269s f321360g;

    /* renamed from: h */
    public final C107411s2 f321361h;

    /* renamed from: i */
    public final C107361l0 f321362i;

    /* renamed from: j */
    public final C32226l<C28482z, C13598b0> f321363j;

    /* renamed from: f0.r1$a */
    public static final class C107405a extends C87413o implements C32226l<C28482z, C13598b0> {

        /* renamed from: d */
        public static final C107405a f321364d = new C107405a();

        public C107405a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C28482z) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    public C107404r1(C107394p2 p2Var, C107601b0 b0Var, C28482z zVar, boolean z, boolean z2, C107622i0 i0Var, C104269s sVar, C107411s2 s2Var, C107361l0 l0Var, C32226l lVar, int i, C8480h hVar) {
        C104269s sVar2;
        C107394p2 p2Var2 = p2Var;
        C107601b0 b0Var2 = b0Var;
        C107622i0 i0Var2 = i0Var;
        int i2 = i;
        C28482z zVar2 = (i2 & 4) != 0 ? new C28482z((String) null, 0, (C38006x) null, 7, (C8480h) null) : zVar;
        boolean z3 = (i2 & 8) != 0 ? true : z;
        boolean z4 = (i2 & 16) != 0 ? false : z2;
        if ((i2 & 64) != 0) {
            int i3 = C104269s.f308601a;
            sVar2 = C104269s.C104270a.f308602a;
        } else {
            sVar2 = sVar;
        }
        C107411s2 s2Var2 = (i2 & 128) != 0 ? null : s2Var;
        C107361l0 l0Var2 = (i2 & 256) != 0 ? C107388o0.f321306a : l0Var;
        C32226l lVar2 = (i2 & 512) != 0 ? C107405a.f321364d : lVar;
        C87412m.m108594g(p2Var, "state");
        C87412m.m108594g(b0Var, "selectionManager");
        C87412m.m108594g(zVar2, "value");
        C87412m.m108594g(i0Var2, "preparedSelectionState");
        C87412m.m108594g(sVar2, "offsetMapping");
        C87412m.m108594g(l0Var2, "keyMapping");
        C87412m.m108594g(lVar2, "onValueChange");
        this.f321354a = p2Var2;
        this.f321355b = b0Var2;
        this.f321356c = zVar2;
        this.f321357d = z3;
        this.f321358e = z4;
        this.f321359f = i0Var2;
        this.f321360g = sVar2;
        this.f321361h = s2Var2;
        this.f321362i = l0Var2;
        this.f321363j = lVar2;
    }

    /* renamed from: a */
    public final void mo157816a(List<? extends C104247d> list) {
        C104249e eVar = this.f321354a.f321315c;
        List<T> B0 = C110818d0.m150900B0(list);
        ((ArrayList) B0).add(0, new C104253h());
        this.f321363j.invoke(eVar.mo145867a(B0));
    }
}
