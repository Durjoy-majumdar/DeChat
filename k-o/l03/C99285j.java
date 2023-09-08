package l03;

import com.tencent.p014mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: l03.j */
public final class C99285j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f291147d;

    /* renamed from: e */
    public final /* synthetic */ String f291148e;

    /* renamed from: f */
    public final /* synthetic */ boolean f291149f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99285j(int i, String str, boolean z) {
        super(0);
        this.f291147d = i;
        this.f291148e = str;
        this.f291149f = z;
    }

    public Object invoke() {
        C13598b0 b0Var;
        if (this.f291147d == 1) {
            C99279f fVar = C99279f.f291124a;
            String str = this.f291148e;
            boolean z = this.f291149f;
            MomentsVideoDownloadSourceStruct a = fVar.mo138689a(str);
            if (a != null) {
                a.f265728p = z ? 1 : 0;
                Log.m105924i("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsFromPreLoad >> " + str + ", " + z);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsFromPreLoad >> " + str + "  >> is no have struct");
            }
        }
        return C13598b0.f38549a;
    }
}
