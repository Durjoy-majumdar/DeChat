package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.l */
public final class C99287l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291152d;

    /* renamed from: e */
    public final /* synthetic */ String f291153e;

    /* renamed from: f */
    public final /* synthetic */ Long f291154f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99287l(int i, String str, Long l) {
        super(0);
        this.f291152d = i;
        this.f291153e = str;
        this.f291154f = l;
    }

    public Object invoke() {
        long j = 0;
        C13598b0 b0Var = null;
        if (this.f291152d == 2) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291153e;
            Long l = this.f291154f;
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                if (l != null) {
                    j = l.longValue();
                }
                a.f265704D = j;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReceiveLength >> " + str + ", " + l);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReceiveLength >> " + str + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str2 = this.f291153e;
            Long l2 = this.f291154f;
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str2);
            if (a2 != null) {
                if (l2 != null) {
                    j = l2.longValue();
                }
                a2.f265733u = j;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewReceiverLength >> " + str2 + ", " + l2);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewReceiverLength >> " + str2 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
