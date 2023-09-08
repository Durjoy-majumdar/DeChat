package z90;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: z90.q */
public final class C66770q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<C66737a> f191866d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66770q(C60690y0<C66737a> y0Var) {
        super(0);
        this.f191866d = y0Var;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.MultiTemplatePreviewPage", "MultiTemplatePreviewPage: on search btn clicked");
        this.f191866d.setValue(C66737a.MusicSearchPanel);
        return C13598b0.f38549a;
    }
}
