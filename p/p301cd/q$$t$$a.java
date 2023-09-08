package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import ml0.C21511u;
import org.json.JSONObject;
import p830xc.C91165a;

/* renamed from: cd.q$$t$$a */
public final /* synthetic */ class q$$t$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ q$$t f234344d;

    /* renamed from: e */
    public final /* synthetic */ int f234345e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f234346f;

    /* renamed from: g */
    public final /* synthetic */ C91165a f234347g;

    public /* synthetic */ q$$t$$a(q$$t q__t, int i, JSONObject jSONObject, C91165a aVar) {
        this.f234344d = q__t;
        this.f234345e = i;
        this.f234346f = jSONObject;
        this.f234347g = aVar;
    }

    public final void run() {
        q$$t q__t = this.f234344d;
        int i = this.f234345e;
        JSONObject jSONObject = this.f234346f;
        C91165a aVar = this.f234347g;
        C80005q qVar = q__t.f234390g;
        C79999m mVar = qVar.f234327i;
        if (mVar == null) {
            Log.m105929w(qVar.mo110227w(), "convertPathAndApplyMakeupInner#onLoad#%d, adapter is null", Integer.valueOf(i));
            return;
        }
        C21511u f = mVar.mo21074f("applyMakeup", jSONObject);
        Log.m105925i(q__t.f234390g.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, type:applyMakeup, error:[%s, %s]", Integer.valueOf(i), Integer.valueOf(f.f60905a), f.f60906b);
        aVar.mo62547h(f.f60905a == 0 ? C86920e.f252311a : C86920e.f252314d, f.f60907c);
    }
}
