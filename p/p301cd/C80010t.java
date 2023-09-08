package p301cd;

import android.os.Bundle;
import co0.C80127b;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLiveConstants;
import lo0.C88603c;
import lo0.C88606e;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91399c0;
import p830xc.C91165a;
import p954dd.C86224a;
import p954dd.C86227b;

/* renamed from: cd.t */
public class C80010t implements ITXLivePushListener {

    /* renamed from: c */
    public final /* synthetic */ C80005q f234405c;

    public C80010t(C80005q qVar) {
        this.f234405c = qVar;
    }

    public void onNetStatus(Bundle bundle) {
        if (this.f234405c.mo110218H()) {
            C80005q qVar = this.f234405c;
            C86227b bVar = qVar.f234329n;
            int i = qVar.f253971d;
            C88606e eVar = (C88606e) bVar;
            eVar.getClass();
            C88606e.C88614h hVar = new C88606e.C88614h((C88606e.C88607a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i);
                JSONObject jSONObject2 = new JSONObject();
                if (bundle != null) {
                    for (String next : bundle.keySet()) {
                        jSONObject2.put(next, bundle.get(next));
                    }
                }
                jSONObject.put("info", jSONObject2);
                eVar.mo123052a(hVar, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherNetStatus fail", e);
            }
        }
    }

    public void onPushEvent(int i, Bundle bundle) {
        if (this.f234405c.mo110218H()) {
            Log.m105919d("MicroMsg.SameLayer.LivePusherPluginHandler", "onPushEvent, errCode:%s", Integer.valueOf(i));
            C80005q qVar = this.f234405c;
            C86227b bVar = qVar.f234329n;
            int i2 = qVar.f253971d;
            C88606e eVar = (C88606e) bVar;
            eVar.getClass();
            C88606e.C88613g gVar = new C88606e.C88613g((C88606e.C88607a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i2);
                jSONObject.put("errCode", i);
                jSONObject.put("errMsg", bundle == null ? "" : bundle.getString(TXLiveConstants.EVT_DESCRIPTION));
                eVar.mo123052a(gVar, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherEvent fail", e);
            }
        }
        C80005q qVar2 = this.f234405c;
        C86224a aVar = qVar2.f234330o;
        if (aVar == null) {
            return;
        }
        if (i == 1002 || i == 1003 || i == 1018) {
            C91165a aVar2 = qVar2.f234331p;
            C88603c cVar = (C88603c) aVar;
            cVar.f255882c = true;
            cVar.f255883d = C80127b.m97435a(aVar2);
            cVar.mo123044a();
            int i3 = 2;
            if (cVar.f255881b) {
                C83127a d = cVar.mo123047d(aVar2);
                if (d != null) {
                    AppBrandRuntime a = C80127b.m97435a(aVar2);
                    Log.m105925i(d.f242924d, "onPushBegin, runtime:%s, LivePusher:%s", a.f238147j, qVar2.mo109508b());
                    d.mo115366e(a, 1);
                } else {
                    Log.m105918d("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "pushBegin, no state manager");
                }
            } else {
                Log.m105924i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "pushBegin, not voip mode");
            }
            C91399c0 c0Var = cVar.f255885f;
            if (c0Var != null) {
                c0Var.mo110189f();
                cVar.f255885f.mo110186c(cVar.f255887h);
                return;
            }
            if (!cVar.f255887h) {
                i3 = 3;
            }
            cVar.f255886g = i3;
        } else if (i == -1307) {
            ((C88603c) aVar).mo123049f(qVar2, qVar2.f234331p);
        }
    }
}
