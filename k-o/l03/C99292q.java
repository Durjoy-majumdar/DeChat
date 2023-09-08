package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.q */
public final class C99292q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f291166d;

    /* renamed from: e */
    public final /* synthetic */ long f291167e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99292q(String str, long j) {
        super(0);
        this.f291166d = str;
        this.f291167e = j;
    }

    public Object invoke() {
        C13598b0 b0Var;
        MomentsVideoDownloadSourceStruct a = C99279f.f291124a.mo138689a(this.f291166d);
        if (a != null) {
            long j = this.f291167e;
            String str = this.f291166d;
            a.f265710J = j;
            a.mo86046c("Player_SwitchSourceStartTimeMS", j);
            a.f265711K = -1;
            Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceStartTimeStamp >> " + str + ", " + j);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            String str2 = this.f291166d;
            Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceStartTimeStamp >> " + str2 + " but data is no find");
        }
        return C13598b0.f38549a;
    }
}
