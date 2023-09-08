package r80;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import m80.C109537f;
import rx3.C13598b0;

/* renamed from: r80.v */
public final class C110546v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330625d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110546v(C110538r rVar) {
        super(0);
        this.f330625d = rVar;
    }

    public Object invoke() {
        Log.m105924i(this.f330625d.f330612w, "onDrawFrameOnFrameAvailableFailed!! force use request draw");
        this.f330625d.f330596j0 = true;
        C109537f fVar = this.f330625d.f330555E;
        if (fVar != null) {
            fVar.mo145768d(false);
        }
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxOnFrameAvailableDrawFailed");
        C115669n.INSTANCE.mo175913w(986, 86, 1);
        C110505a aVar = this.f330625d.f330559I;
        if (aVar != null) {
            aVar.f330453q = null;
        }
        return C13598b0.f38549a;
    }
}
