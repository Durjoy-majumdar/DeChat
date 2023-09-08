package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import ml0.C21511u;
import org.json.JSONObject;
import p830xc.C91165a;

/* renamed from: cd.y$$a */
public final /* synthetic */ class y$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80015y f234414d;

    /* renamed from: e */
    public final /* synthetic */ String f234415e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f234416f;

    /* renamed from: g */
    public final /* synthetic */ C91165a f234417g;

    public /* synthetic */ y$$a(C80015y yVar, String str, JSONObject jSONObject, C91165a aVar) {
        this.f234414d = yVar;
        this.f234415e = str;
        this.f234416f = jSONObject;
        this.f234417g = aVar;
    }

    public final void run() {
        C80015y yVar = this.f234414d;
        String str = this.f234415e;
        JSONObject jSONObject = this.f234416f;
        C91165a aVar = this.f234417g;
        C80005q qVar = yVar.f234413d;
        C79999m mVar = qVar.f234327i;
        if (mVar == null) {
            Log.m105928w(qVar.mo110227w(), "convertResourcePathAndOperateLivePusher#onLoad, adapter is null");
            return;
        }
        C21511u f = mVar.mo21074f(str, jSONObject);
        Log.m105925i(yVar.f234413d.mo110227w(), "convertResourcePathAndOperateLivePusher#onLoad, type:%s, error:[%s, %s]", str, Integer.valueOf(f.f60905a), f.f60906b);
        aVar.mo62547h(f.f60905a == 0 ? C86920e.f252311a : C86920e.f252314d, f.f60907c);
    }
}
