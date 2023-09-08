package p152f0;

import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103618e1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C104256i0;
import p009c2.C104258j0;
import p009c2.C104269s;
import p009c2.C28482z;
import p155g0.C107601b0;
import p155g0.C107651x;
import p175j0.C108494d2;
import p175j0.C108504h;
import p415q0.C110261c;
import p463c0.C104193e;
import p463c0.C104198i;
import p721v0.C111299g;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import p735w1.C37958a;
import p735w1.C38006x;
import p759y.C112218f0;
import p868x0.C111979d;
import rx3.C13598b0;
import rx3.C13603j;

/* renamed from: f0.t */
public final class C107413t extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f321388d;

    /* renamed from: e */
    public final /* synthetic */ C111705z f321389e;

    /* renamed from: f */
    public final /* synthetic */ C107356k2 f321390f;

    /* renamed from: g */
    public final /* synthetic */ C28482z f321391g;

    /* renamed from: h */
    public final /* synthetic */ C104258j0 f321392h;

    /* renamed from: i */
    public final /* synthetic */ C65503j f321393i;

    /* renamed from: j */
    public final /* synthetic */ C65503j f321394j;

    /* renamed from: n */
    public final /* synthetic */ C65503j f321395n;

    /* renamed from: o */
    public final /* synthetic */ C65503j f321396o;

    /* renamed from: p */
    public final /* synthetic */ C104193e f321397p;

    /* renamed from: q */
    public final /* synthetic */ C107394p2 f321398q;

    /* renamed from: r */
    public final /* synthetic */ C107601b0 f321399r;

    /* renamed from: s */
    public final /* synthetic */ boolean f321400s;

    /* renamed from: t */
    public final /* synthetic */ boolean f321401t;

    /* renamed from: u */
    public final /* synthetic */ C32226l<C111703v, C13598b0> f321402u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107413t(int i, C111705z zVar, C107356k2 k2Var, C28482z zVar2, C104258j0 j0Var, C65503j jVar, C65503j jVar2, C65503j jVar3, C65503j jVar4, C104193e eVar, C107394p2 p2Var, C107601b0 b0Var, boolean z, boolean z2, C32226l<? super C111703v, C13598b0> lVar) {
        super(2);
        this.f321388d = i;
        this.f321389e = zVar;
        this.f321390f = k2Var;
        this.f321391g = zVar2;
        this.f321392h = j0Var;
        this.f321393i = jVar;
        this.f321394j = jVar2;
        this.f321395n = jVar3;
        this.f321396o = jVar4;
        this.f321397p = eVar;
        this.f321398q = p2Var;
        this.f321399r = b0Var;
        this.f321400s = z;
        this.f321401t = z2;
        this.f321402u = lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C65503j jVar;
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            int i = this.f321388d;
            C111705z zVar = this.f321389e;
            C87412m.m108594g(zVar, "textStyle");
            C32226l<C103618e1, C13598b0> lVar = C103612c1.f306063a;
            C65503j a = C111299g.m151786a(aVar, lVar, new C107299b1(i, zVar));
            C107356k2 k2Var = this.f321390f;
            C28482z zVar2 = this.f321391g;
            C104258j0 j0Var = this.f321392h;
            C107408s sVar = new C107408s(this.f321398q);
            C87412m.m108594g(a, "<this>");
            C87412m.m108594g(k2Var, "scrollerPosition");
            C87412m.m108594g(zVar2, "textFieldValue");
            C87412m.m108594g(j0Var, "visualTransformation");
            C112218f0 f0Var = (C112218f0) ((C108494d2) k2Var.f321202e).getValue();
            long j = zVar2.f78286b;
            int i2 = C38006x.f100499c;
            int i3 = (int) (j >> 32);
            if (i3 == ((int) (k2Var.f321201d >> 32))) {
                i3 = C38006x.m41695c(j) != C38006x.m41695c(k2Var.f321201d) ? C38006x.m41695c(j) : C38006x.m41698f(j);
            }
            k2Var.f321201d = zVar2.f78286b;
            C37958a aVar2 = zVar2.f78285a;
            C87412m.m108594g(aVar2, MimeTypes.BASE_TYPE_TEXT);
            C104256i0 i0Var = new C104256i0(aVar2, C104269s.C104270a.f308602a);
            int ordinal = f0Var.ordinal();
            if (ordinal == 0) {
                jVar = new C107418t2(k2Var, i3, i0Var, sVar);
            } else if (ordinal == 1) {
                jVar = new C107349i0(k2Var, i3, i0Var, sVar);
            } else {
                throw new C13603j();
            }
            C65503j i0 = C111979d.m152691b(a).mo74972i0(jVar).mo74972i0(this.f321393i).mo74972i0(this.f321394j);
            C111705z zVar3 = this.f321389e;
            C87412m.m108594g(i0, "<this>");
            C87412m.m108594g(zVar3, "style");
            C65503j i05 = C111299g.m151787b(i0, (C32226l) null, new C107390o2(zVar3), 1, (Object) null).mo74972i0(this.f321395n).mo74972i0(this.f321396o);
            C104193e eVar = this.f321397p;
            C87412m.m108594g(i05, "<this>");
            C87412m.m108594g(eVar, "bringIntoViewRequester");
            C107651x.m145826a(C111299g.m151786a(i05, lVar, new C104198i(eVar)), C110261c.m149878b(hVar, 19580180, true, new C107402r(this.f321399r, this.f321398q, this.f321400s, this.f321401t, this.f321402u)), hVar, 48, 0);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
