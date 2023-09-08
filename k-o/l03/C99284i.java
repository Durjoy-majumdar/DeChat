package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.i */
public final class C99284i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291145d;

    /* renamed from: e */
    public final /* synthetic */ String f291146e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99284i(int i, String str) {
        super(0);
        this.f291145d = i;
        this.f291146e = str;
    }

    public Object invoke() {
        int i = 0;
        C13598b0 b0Var = null;
        if (this.f291145d == 2) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291146e;
            fVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                long j = a.f265708H;
                a.f265703C = 1;
                if (currentTimeMillis >= j) {
                    i = (int) (currentTimeMillis - j);
                }
                a.f265709I = i;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsDownLoadComplete >> " + str + ", " + currentTimeMillis + ", " + j);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenIsDownLoadComplete >> " + str + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str2 = this.f291146e;
            fVar2.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str2);
            if (a2 != null) {
                long j2 = a2.f265706F;
                if (currentTimeMillis2 >= j2) {
                    i = (int) (currentTimeMillis2 - j2);
                }
                a2.f265707G = i;
                a2.f265732t = 1;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewDownLoadFinish >> " + str2 + ", " + currentTimeMillis2 + ", " + j2 + ", " + Thread.currentThread().getName());
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewDownLoadFinish >> " + str2 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
