package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.r */
public final class C99293r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f291168d;

    /* renamed from: e */
    public final /* synthetic */ String f291169e;

    /* renamed from: f */
    public final /* synthetic */ int f291170f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99293r(String str, String str2, int i) {
        super(0);
        this.f291168d = str;
        this.f291169e = str2;
        this.f291170f = i;
    }

    public Object invoke() {
        C94554a c = C94555d.m119567c(this.f291168d, true);
        Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setVideoBitrate >> " + this.f291169e + ", " + this.f291168d + ", " + this.f291170f + ", " + c);
        C13598b0 b0Var = null;
        int i = 0;
        if (this.f291170f == 2) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291169e;
            if (c != null) {
                i = c.f273444b;
            }
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                a.f265705E = i;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenVideoBitrate >> " + str + ", " + i);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenVideoBitrate >> " + str + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str2 = this.f291169e;
            if (c != null) {
                i = c.f273444b;
            }
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str2);
            if (a2 != null) {
                a2.f265734v = i;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewVideoBitrate >> " + str2 + ", " + i);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewVideoBitrate >> " + str2 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
