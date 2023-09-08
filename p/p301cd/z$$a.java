package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import ml0.C21511u;
import org.json.JSONObject;
import p830xc.C91165a;

/* renamed from: cd.z$$a */
public final /* synthetic */ class z$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80016z f234424d;

    /* renamed from: e */
    public final /* synthetic */ int f234425e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f234426f;

    /* renamed from: g */
    public final /* synthetic */ C91165a f234427g;

    public /* synthetic */ z$$a(C80016z zVar, int i, JSONObject jSONObject, C91165a aVar) {
        this.f234424d = zVar;
        this.f234425e = i;
        this.f234426f = jSONObject;
        this.f234427g = aVar;
    }

    public final void run() {
        C80016z zVar = this.f234424d;
        int i = this.f234425e;
        JSONObject jSONObject = this.f234426f;
        C91165a aVar = this.f234427g;
        C80005q qVar = zVar.f234423f;
        C79999m mVar = qVar.f234327i;
        if (mVar == null) {
            Log.m105929w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, adapter is null", Integer.valueOf(i));
            return;
        }
        C21511u f = mVar.mo21074f("applySticker", jSONObject);
        Log.m105925i(zVar.f234423f.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, type:applySticker, error:[%s, %s]", Integer.valueOf(i), Integer.valueOf(f.f60905a), f.f60906b);
        aVar.mo62547h(f.f60905a == 0 ? C86920e.f252311a : C86920e.f252314d, f.f60907c);
    }
}
