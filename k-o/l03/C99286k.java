package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.k */
public final class C99286k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291150d;

    /* renamed from: e */
    public final /* synthetic */ String f291151e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99286k(int i, String str) {
        super(0);
        this.f291150d = i;
        this.f291151e = str;
    }

    public Object invoke() {
        C13598b0 b0Var = null;
        if (this.f291150d == 2) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291151e;
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                a.f265738z = 1;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsMoovReady >> " + str);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsMoovReady >> " + str + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str2 = this.f291151e;
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str2);
            if (a2 != null) {
                a2.f265729q = 1;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsMoovReady >> " + str2);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsMoovReady >> " + str2 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
