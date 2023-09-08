package qj1;

import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: qj1.lg */
public final class C62873lg extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62777fg f178411d;

    /* renamed from: e */
    public final /* synthetic */ boolean f178412e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62873lg(C62777fg fgVar, boolean z) {
        super(0);
        this.f178411d = fgVar;
        this.f178412e = z;
    }

    public Object invoke() {
        this.f178411d.f178195B.mo85376d();
        this.f178411d.f178196C.mo85430c(false);
        RelativeLayout relativeLayout = this.f178411d.f178194A.f172243a;
        relativeLayout.setTranslationY((float) C75044y4.m89990b(relativeLayout.getContext()).y);
        C62777fg fgVar = this.f178411d;
        fgVar.f178203s.setTranslationY((float) C75044y4.m89990b(fgVar.f166287d.getContext()).y);
        if (this.f178412e) {
            C62777fg fgVar2 = this.f178411d;
            fgVar2.getClass();
            C61926c.m72668M(new C62896ng(fgVar2));
        } else {
            this.f178411d.mo10792g(8);
        }
        return C13598b0.f38549a;
    }
}
