package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import org.json.JSONObject;
import p830xc.C91165a;
import p954dd.C86224a;

/* renamed from: cd.z */
public class C80016z implements C86224a.C86225a {

    /* renamed from: a */
    public final /* synthetic */ int f234418a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f234419b;

    /* renamed from: c */
    public final /* synthetic */ C91165a f234420c;

    /* renamed from: d */
    public final /* synthetic */ q$$w f234421d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f234422e;

    /* renamed from: f */
    public final /* synthetic */ C80005q f234423f;

    public C80016z(C80005q qVar, int i, JSONObject jSONObject, C91165a aVar, q$$w q__w, JSONObject jSONObject2) {
        this.f234423f = qVar;
        this.f234418a = i;
        this.f234419b = jSONObject;
        this.f234420c = aVar;
        this.f234421d = q__w;
        this.f234422e = jSONObject2;
    }

    /* renamed from: a */
    public void mo110249a(String str, String str2) {
        Log.m105925i(this.f234423f.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, path: %s, localPath: %s", Integer.valueOf(this.f234418a), str, str2);
        try {
            this.f234419b.put("path", str2);
            this.f234421d.f234395a--;
            Log.m105925i(this.f234423f.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, pendingConvertCount: %d", Integer.valueOf(this.f234418a), Integer.valueOf(this.f234421d.f234395a));
            if (this.f234421d.f234395a == 0) {
                this.f234423f.mo110217G(new z$$a(this, this.f234418a, this.f234422e, this.f234420c));
            }
        } catch (Exception e) {
            Log.m105929w(this.f234423f.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, put fail since %s", Integer.valueOf(this.f234418a), e);
            this.f234420c.mo62551l(C86920e.f252314d);
        }
    }

    /* renamed from: b */
    public void mo110255b(String str) {
        String w = this.f234423f.mo110227w();
        Log.m105928w(w, "convertResourcePathWorkaroundAndOperateLivePusher1#onLoadFailure#" + this.f234418a);
    }
}
