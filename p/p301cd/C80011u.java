package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePusher;
import lo0.C88606e;
import org.json.JSONException;
import org.json.JSONObject;
import p954dd.C86227b;

/* renamed from: cd.u */
public class C80011u implements TXLivePusher.OnBGMNotify {

    /* renamed from: c */
    public final /* synthetic */ C80005q f234406c;

    public C80011u(C80005q qVar) {
        this.f234406c = qVar;
    }

    public void onBGMComplete(int i) {
        if (this.f234406c.mo110218H()) {
            C80005q qVar = this.f234406c;
            C86227b bVar = qVar.f234329n;
            int i2 = qVar.f253971d;
            C88606e eVar = (C88606e) bVar;
            eVar.getClass();
            C88606e.C88609c cVar = new C88606e.C88609c((C88606e.C88607a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i2);
                jSONObject.put("errCode", i);
                eVar.mo123052a(cVar, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMComplete fail", e);
            }
        }
    }

    public void onBGMProgress(long j, long j2) {
        if (this.f234406c.mo110218H()) {
            C80005q qVar = this.f234406c;
            C86227b bVar = qVar.f234329n;
            int i = qVar.f253971d;
            C88606e eVar = (C88606e) bVar;
            eVar.getClass();
            C88606e.C88610d dVar = new C88606e.C88610d((C88606e.C88607a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i);
                jSONObject.put("progress", j);
                jSONObject.put("duration", j2);
                eVar.mo123052a(dVar, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMProgress fail", e);
            }
        }
    }

    public void onBGMStart() {
        if (this.f234406c.mo110218H()) {
            C80005q qVar = this.f234406c;
            C86227b bVar = qVar.f234329n;
            int i = qVar.f253971d;
            C88606e eVar = (C88606e) bVar;
            eVar.getClass();
            C88606e.C88611e eVar2 = new C88606e.C88611e((C88606e.C88607a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i);
                eVar.mo123052a(eVar2, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherBGMStart fail", e);
            }
        }
    }
}
