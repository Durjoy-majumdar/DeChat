package zj2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zj2.d */
public final class C66859d extends C87413o implements C32226l<Exception, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66862f f192041d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66859d(C66862f fVar) {
        super(1);
        this.f192041d = fVar;
    }

    public Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("onError: ");
        String str = null;
        sb.append(exc != null ? exc.getLocalizedMessage() : null);
        Log.m105920e("MicroMsg.RingtoneServiceHelper", sb.toString());
        C66862f fVar = this.f192041d;
        fVar.f192069u = false;
        if (exc != null) {
            str = exc.getLocalizedMessage();
        }
        if (str == null) {
            str = "";
        }
        fVar.f192070v = str;
        return C13598b0.f38549a;
    }
}
