package androidx.compose.p002ui.platform;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.m$$i */
public final class m$$i extends C87413o implements C32226l<C103690u1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C103662m f306195d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m$$i(C103662m mVar) {
        super(1);
        this.f306195d = mVar;
    }

    public Object invoke(Object obj) {
        C103690u1 u1Var = (C103690u1) obj;
        C87412m.m108594g(u1Var, LocaleUtil.ITALIAN);
        C103662m mVar = this.f306195d;
        mVar.getClass();
        if (u1Var.isValid()) {
            mVar.f306159e.getSnapshotObserver().mo161693a(u1Var, mVar.f306158C, new C103670o(u1Var, mVar));
        }
        return C13598b0.f38549a;
    }
}
