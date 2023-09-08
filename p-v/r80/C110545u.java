package r80;

import android.opengl.GLES20;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import m80.C109537f;
import n80.C109697b;
import n80.C109715i;
import r80.C110524i0;
import rx3.C13598b0;

/* renamed from: r80.u */
public final class C110545u extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330624d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110545u(C110538r rVar) {
        super(1);
        this.f330624d = rVar;
    }

    public Object invoke(Object obj) {
        C32224a<C13598b0> aVar;
        if (!((Boolean) obj).booleanValue()) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawFailed");
            C115669n.INSTANCE.mo175913w(986, 19, 1);
        }
        C110538r rVar = this.f330624d;
        rVar.f330582c0++;
        rVar.f330594i0 = true;
        Log.m105924i(this.f330624d.f330612w, "onFrameDraw, drawFrameCount:" + this.f330624d.f330582c0 + ", encodeFrameCount:" + this.f330624d.f330580b0 + ", isDecodeEnd:" + this.f330624d.f330592h0);
        C110524i0 i0Var = this.f330624d.f330570T;
        if (!(i0Var == null || (aVar = i0Var.f330519o) == null)) {
            ((C110524i0.C110526b) aVar).invoke();
        }
        C110538r rVar2 = this.f330624d;
        long j = 0;
        if (rVar2.f330604o) {
            GLES20.glFinish();
            C110538r rVar3 = this.f330624d;
            C109715i iVar = rVar3.f330557G;
            if (iVar != null) {
                C110505a aVar2 = rVar3.f330559I;
                if (aVar2 != null) {
                    j = aVar2.f330457u;
                }
                iVar.mo160944b(j);
            }
            C110538r rVar4 = this.f330624d;
            C109715i iVar2 = rVar4.f330557G;
            rVar4.f330580b0 = iVar2 != null ? iVar2.f328411o : 0;
            C110538r.m150463e(this.f330624d);
        } else {
            C109697b bVar = rVar2.f330556F;
            if (bVar != null) {
                bVar.mo160917a(0);
            }
        }
        C109537f fVar = this.f330624d.f330555E;
        if (fVar != null) {
            fVar.mo145768d(false);
        }
        return C13598b0.f38549a;
    }
}
