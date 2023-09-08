package cm1;

import a14.C53895h;
import a14.C53934p0;
import cm1.C0742j2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C8794p5;
import te3.C50542nh0;
import te3.C64553md1;
import wx3.C15601d;
import wx3.C66217g;

/* renamed from: cm1.n2 */
public final class C0756n2 implements C8794p5<C64553md1> {

    /* renamed from: d */
    public final /* synthetic */ C0742j2 f1780d;

    /* renamed from: e */
    public final /* synthetic */ C0742j2.C0743a f1781e;

    /* renamed from: f */
    public final /* synthetic */ String f1782f;

    /* renamed from: g */
    public final /* synthetic */ int f1783g;

    public C0756n2(C0742j2 j2Var, C0742j2.C0743a aVar, String str, int i) {
        this.f1780d = j2Var;
        this.f1781e = aVar;
        this.f1782f = str;
        this.f1783g = i;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C64553md1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        Log.m105924i("Finder.SetProfileCoverViewModel", "onModifyResult, retCode: " + nh02.f138603e + " retMsg:" + nh02.f138604f);
        C0742j2 j2Var = this.f1780d;
        C0753m2 m2Var = new C0753m2(this.f1781e, this.f1782f, this.f1783g, nh02, (C15601d<? super C0753m2>) null);
        C53895h.m60465c(j2Var.getMainScope(), C66217g.f190253d, C53934p0.DEFAULT, m2Var);
    }
}
