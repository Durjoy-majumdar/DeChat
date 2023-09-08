package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import org.json.JSONObject;
import p830xc.C91165a;
import p954dd.C86224a;

/* renamed from: cd.y */
public class C80015y implements C86224a.C86225a {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f234410a;

    /* renamed from: b */
    public final /* synthetic */ C91165a f234411b;

    /* renamed from: c */
    public final /* synthetic */ String f234412c;

    /* renamed from: d */
    public final /* synthetic */ C80005q f234413d;

    public C80015y(C80005q qVar, JSONObject jSONObject, C91165a aVar, String str) {
        this.f234413d = qVar;
        this.f234410a = jSONObject;
        this.f234411b = aVar;
        this.f234412c = str;
    }

    /* renamed from: a */
    public void mo110249a(String str, String str2) {
        Log.m105925i(this.f234413d.mo110227w(), "convertResourcePathAndOperateLivePusher#onLoad, path: %s, localPath: %s", str, str2);
        try {
            this.f234410a.put("path", str2);
            this.f234413d.mo110217G(new y$$a(this, this.f234412c, this.f234410a, this.f234411b));
        } catch (Exception e) {
            String w = this.f234413d.mo110227w();
            Log.m105928w(w, "convertResourcePathAndOperateLivePusher#onLoad, put fail since " + e);
            this.f234411b.mo62551l(C86920e.f252314d);
        }
    }

    /* renamed from: b */
    public void mo110255b(String str) {
        Log.m105928w(this.f234413d.mo110227w(), "convertResourcePathAndOperateLivePusher#onLoadFailure");
    }
}
