package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import te3.C64370fp1;

/* renamed from: cl1.f1 */
public final class C54974f1 extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f154097f = "LiveProductRecordSlice";

    /* renamed from: g */
    public C64370fp1 f154098g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54974f1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final void mo75934c3(C64370fp1 fp12) {
        String str = this.f154097f;
        Log.m105924i(str, "set recodingProduct: " + this.f154098g);
        this.f154098g = fp12;
    }

    public void onCleared() {
        mo75934c3((C64370fp1) null);
        super.onCleared();
    }
}
