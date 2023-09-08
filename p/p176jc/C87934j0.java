package p176jc;

import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineRuntime;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: jc.j0 */
public final class C87934j0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ float f254491d;

    /* renamed from: e */
    public final /* synthetic */ float f254492e;

    /* renamed from: f */
    public final /* synthetic */ SkylineView f254493f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87934j0(float f, float f2, SkylineView skylineView) {
        super(0);
        this.f254491d = f;
        this.f254492e = f2;
        this.f254493f = skylineView;
    }

    public Object invoke() {
        Log.m105924i("SkylineView", "updateViewport, waitForDone run view size[" + this.f254491d + " x " + this.f254492e + ']');
        SkylineView skylineView = this.f254493f;
        SkylineRuntime skylineRuntime = skylineView.f235005e;
        if (skylineRuntime != null) {
            skylineRuntime.updateWindowViewport(skylineView.f235004d, this.f254491d, this.f254492e);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("mSkylineRuntime");
        throw null;
    }
}
