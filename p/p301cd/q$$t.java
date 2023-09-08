package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import org.json.JSONObject;
import p830xc.C91165a;
import p954dd.C86224a;

/* renamed from: cd.q$$t */
public class q$$t implements C86224a.C86225a {

    /* renamed from: a */
    public final /* synthetic */ int f234384a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f234385b;

    /* renamed from: c */
    public final /* synthetic */ String[] f234386c;

    /* renamed from: d */
    public final /* synthetic */ C91165a f234387d;

    /* renamed from: e */
    public final /* synthetic */ q$$w f234388e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f234389f;

    /* renamed from: g */
    public final /* synthetic */ C80005q f234390g;

    public q$$t(C80005q qVar, int i, JSONObject jSONObject, String[] strArr, C91165a aVar, q$$w q__w, JSONObject jSONObject2) {
        this.f234390g = qVar;
        this.f234384a = i;
        this.f234385b = jSONObject;
        this.f234386c = strArr;
        this.f234387d = aVar;
        this.f234388e = q__w;
        this.f234389f = jSONObject2;
    }

    /* renamed from: a */
    public void mo110249a(String str, String str2) {
        Log.m105925i(this.f234390g.mo110227w(), "convertPathAndApplyMakeupInner#onLoad#%d, path: %s, localPath: %s", Integer.valueOf(this.f234384a), str, str2);
        try {
            this.f234385b.put(this.f234386c[this.f234384a], str2);
            this.f234388e.f234395a--;
            Log.m105925i(this.f234390g.mo110227w(), "convertPathAndApplyMakeupInner#onLoad#%d, pendingConvertCount: %d", Integer.valueOf(this.f234384a), Integer.valueOf(this.f234388e.f234395a));
            if (this.f234388e.f234395a == 0) {
                this.f234390g.mo110217G(new q$$t$$a(this, this.f234384a, this.f234389f, this.f234387d));
            }
        } catch (Exception e) {
            Log.m105929w(this.f234390g.mo110227w(), "convertPathAndApplyMakeupInner#onLoad#%d, put fail since %s", Integer.valueOf(this.f234384a), e);
            this.f234387d.mo62551l(C86920e.f252314d);
        }
    }

    /* renamed from: b */
    public void mo110255b(String str) {
        String w = this.f234390g.mo110227w();
        Log.m105928w(w, "convertPathAndApplyMakeupInner#onLoadFailure#" + this.f234384a);
    }
}
