package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.m */
public final class C99288m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291155d;

    /* renamed from: e */
    public final /* synthetic */ String f291156e;

    /* renamed from: f */
    public final /* synthetic */ String f291157f;

    /* renamed from: g */
    public final /* synthetic */ String f291158g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99288m(int i, String str, String str2, String str3) {
        super(0);
        this.f291155d = i;
        this.f291156e = str;
        this.f291157f = str2;
        this.f291158g = str3;
    }

    public Object invoke() {
        C13598b0 b0Var = null;
        if (this.f291155d == 2) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291156e;
            String str2 = this.f291157f;
            String str3 = this.f291158g;
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                a.f265737y = a.mo86045b("FullScreen_ReqFlag", str2, true);
                a.f265701A = a.mo86045b("FullScreen_RespFlag", str3, true);
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReqFlagAndRepFlag >> " + str + ", " + str2 + ", " + str3);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReqFlagAndRepFlag >> " + str + ", " + str3 + ", " + str3 + " but data is no find");
            }
        } else {
            C99279f fVar2 = C99279f.f291124a;
            String str4 = this.f291156e;
            String str5 = this.f291157f;
            String str6 = this.f291158g;
            MomentsVideoDownloadSourceStruct a2 = fVar2.mo138689a(str4);
            if (a2 != null) {
                String str7 = a2.f265727o;
                a2.f265727o = a2.mo86045b("Preview_ReqFlag", str5, true);
                a2.f265730r = a2.mo86045b("Preview_RespFlag", str6, true);
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewReqAndRespFlag >> " + str4 + ", " + str5 + ", " + str6 + ", " + str7);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewReqAndRespFlag >> " + str4 + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
