package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.h */
public final class C99283h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291142d;

    /* renamed from: e */
    public final /* synthetic */ String f291143e;

    /* renamed from: f */
    public final /* synthetic */ String f291144f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99283h(int i, String str, String str2) {
        super(0);
        this.f291142d = i;
        this.f291143e = str;
        this.f291144f = str2;
    }

    public Object invoke() {
        String str = "";
        C13598b0 b0Var = null;
        if (this.f291142d == 2) {
            C99279f fVar = C99279f.f291124a;
            String str2 = this.f291143e;
            String str3 = this.f291144f;
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str2);
            if (a != null) {
                if (str3 != null) {
                    str = str3;
                }
                a.f265736x = a.mo86045b("FullScreen_FileKey", str, true);
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenFileKey >> " + str2 + ", " + str3);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenFileKey >> " + str2 + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str4 = this.f291143e;
            String str5 = this.f291144f;
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str4);
            if (a2 != null) {
                if (str5 != null) {
                    str = str5;
                }
                a2.f265726n = a2.mo86045b("Preview_FileKey", str, true);
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewFileKey >> " + str4 + ", " + str5);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewFileKey >> " + str4 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
