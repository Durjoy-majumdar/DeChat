package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.n */
public final class C99289n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291159d;

    /* renamed from: e */
    public final /* synthetic */ String f291160e;

    /* renamed from: f */
    public final /* synthetic */ int f291161f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99289n(int i, String str, int i2) {
        super(0);
        this.f291159d = i;
        this.f291160e = str;
        this.f291161f = i2;
    }

    public Object invoke() {
        C13598b0 b0Var = null;
        if (this.f291159d == 2) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291160e;
            int i = this.f291161f;
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                a.f265702B = i;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenRespVideoFormat >> " + str + ", " + str);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenRespVideoFormat >> " + str + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str2 = this.f291160e;
            int i2 = this.f291161f;
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str2);
            if (a2 != null) {
                a2.f265731s = i2;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewRespVideoFormat >> " + str2 + ", " + i2);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewRespVideoFormat >> " + str2 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
