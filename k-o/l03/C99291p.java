package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.p */
public final class C99291p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f291164d;

    /* renamed from: e */
    public final /* synthetic */ int f291165e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99291p(String str, int i) {
        super(0);
        this.f291164d = str;
        this.f291165e = i;
    }

    public Object invoke() {
        C13598b0 b0Var;
        MomentsVideoDownloadSourceStruct a = C99279f.f291124a.mo138689a(this.f291164d);
        if (a != null) {
            int i = this.f291165e;
            String str = this.f291164d;
            a.f265711K = i;
            Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceDurationMS >> " + str + ", " + i);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            String str2 = this.f291164d;
            Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setSwitchSourceDurationMS >> " + str2 + " but data is no find");
        }
        return C13598b0.f38549a;
    }
}
