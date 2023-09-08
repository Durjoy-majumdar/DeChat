package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: cd.q$$m */
public final /* synthetic */ class q$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234368d;

    /* renamed from: e */
    public final /* synthetic */ String f234369e;

    public /* synthetic */ q$$m(C80005q qVar, String str) {
        this.f234368d = qVar;
        this.f234369e = str;
    }

    public final void run() {
        C80005q qVar = this.f234368d;
        String str = this.f234369e;
        C79999m mVar = qVar.f234327i;
        if (mVar == null) {
            Log.m105928w(qVar.mo110227w(), "run#operate, adapter is null");
        } else {
            mVar.mo21074f(str, (JSONObject) null);
        }
    }
}
