package cj1;

import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.p */
public final class C54799p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54769i f153621d;

    /* renamed from: e */
    public final /* synthetic */ int f153622e;

    /* renamed from: f */
    public final /* synthetic */ String f153623f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54799p(C54769i iVar, int i, String str) {
        super(0);
        this.f153621d = iVar;
        this.f153622e = i;
        this.f153623f = str;
    }

    public Object invoke() {
        C54769i iVar = this.f153621d;
        if (iVar.f153505c == 5) {
            int i = this.f153622e;
            if (i > 0) {
                C56032b bVar = iVar.f153504b;
                if (bVar != null) {
                    bVar.updateVerificationButtonState(C54769i.m61632b(iVar, this.f153623f, i), false);
                }
            } else {
                C56032b bVar2 = iVar.f153504b;
                if (bVar2 != null) {
                    bVar2.updateVerificationButtonState(iVar.f153511i, true);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
