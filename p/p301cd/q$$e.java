package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import org.json.JSONObject;

/* renamed from: cd.q$$e */
public final /* synthetic */ class q$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234355d;

    public /* synthetic */ q$$e(C80005q qVar) {
        this.f234355d = qVar;
    }

    public final void run() {
        C80005q qVar = this.f234355d;
        if (qVar.f234327i != null) {
            Log.m105924i(qVar.mo110227w(), "startIfForeground, do start");
            qVar.f234327i.mo21074f(IXWebBroadcastListener.STAGE_START, new JSONObject());
        }
    }
}
