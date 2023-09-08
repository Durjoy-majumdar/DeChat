package cl1;

import al1.C54130j;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: cl1.e0 */
public final class C0655e0 extends C87413o implements C32226l<C54130j, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C54963d0 f1548d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0655e0(C54963d0 d0Var) {
        super(1);
        this.f1548d = d0Var;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(Util.isEqual(((C54130j) obj).f151997a, ((C54991o) this.f1548d.business(C54991o.class)).mo76015n4()));
    }
}
