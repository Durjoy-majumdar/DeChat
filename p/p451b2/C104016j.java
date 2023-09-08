package p451b2;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: b2.j */
public final class C104016j extends C87413o implements C32226l<C104006a0, Object> {

    /* renamed from: d */
    public final /* synthetic */ C104017k f307637d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104016j(C104017k kVar) {
        super(1);
        this.f307637d = kVar;
    }

    public Object invoke(Object obj) {
        C104006a0 a0Var = (C104006a0) obj;
        C87412m.m108594g(a0Var, LocaleUtil.ITALIAN);
        C104017k kVar = this.f307637d;
        C104022q qVar = a0Var.f307626b;
        int i = a0Var.f307627c;
        int i2 = a0Var.f307628d;
        Object obj2 = a0Var.f307629e;
        C87412m.m108594g(qVar, "fontWeight");
        return kVar.mo145611b(new C104006a0((C104014i) null, qVar, i, i2, obj2, (C8480h) null)).getValue();
    }
}
