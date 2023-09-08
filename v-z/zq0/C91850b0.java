package zq0;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87413o;
import js0.C88024r;
import rx3.C13598b0;
import te3.C51625v04;

/* renamed from: zq0.b0 */
public final class C91850b0 extends C87413o implements C32226l<C51625v04, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91921x f262985d;

    /* renamed from: e */
    public final /* synthetic */ ProgressDialog f262986e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91850b0(C91921x xVar, ProgressDialog progressDialog) {
        super(1);
        this.f262985d = xVar;
        this.f262986e = progressDialog;
    }

    public Object invoke(Object obj) {
        C51625v04 v042 = (C51625v04) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("sendSms success");
        sb.append(v042 != null);
        Log.m105924i("PhoneNumberAddLogic", sb.toString());
        if (v042 != null) {
            Log.m105925i("PhoneNumberAddLogic", "sendSms:%d", Integer.valueOf(v042.f143227d));
            MMHandlerThread.postToMainThread(new C91927y(v042, this.f262985d));
        } else {
            MMHandlerThread.postToMainThread(new C91929z(this.f262985d));
        }
        C88024r.m109572b(new C91847a0(this.f262986e));
        return C13598b0.f38549a;
    }
}
