package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.o */
public final class C99290o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291162d;

    /* renamed from: e */
    public final /* synthetic */ String f291163e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99290o(int i, String str) {
        super(0);
        this.f291162d = i;
        this.f291163e = str;
    }

    public Object invoke() {
        C13598b0 b0Var = null;
        if (this.f291162d == 2) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291163e;
            fVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                a.f265708H = currentTimeMillis;
                a.mo86046c("FullScreen_DownloadStartTimeMS", currentTimeMillis);
                a.f265703C = 0;
                a.f265738z = 0;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenStartToDownLoad >> " + str + ", " + currentTimeMillis);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenStartToDownLoad >> " + str + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str2 = this.f291163e;
            fVar2.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str2);
            if (a2 != null) {
                a2.f265706F = currentTimeMillis2;
                a2.mo86046c("Preview_DownloadStartTimeMS", currentTimeMillis2);
                a2.f265732t = 0;
                a2.f265729q = 0;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewStartDownLoadTimeStamp >> " + str2 + ' ' + a2.f265706F + ' ' + Thread.currentThread());
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewStartDownLoadTimeStamp >> " + str2 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
