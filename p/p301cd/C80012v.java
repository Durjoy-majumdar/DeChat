package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePusher;
import lo0.C88606e;
import org.json.JSONException;
import org.json.JSONObject;
import p954dd.C86227b;

/* renamed from: cd.v */
public class C80012v implements TXLivePusher.ITXAudioVolumeEvaluationListener {

    /* renamed from: c */
    public final /* synthetic */ C80005q f234407c;

    public C80012v(C80005q qVar) {
        this.f234407c = qVar;
    }

    public void onAudioVolumeEvaluationNotify(int i) {
        if (this.f234407c.mo110218H()) {
            C80005q qVar = this.f234407c;
            C86227b bVar = qVar.f234329n;
            int i2 = qVar.f253971d;
            C88606e eVar = (C88606e) bVar;
            eVar.getClass();
            C88606e.C88608b bVar2 = new C88606e.C88608b((C88606e.C88607a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i2);
                jSONObject.put("volume", i);
                eVar.mo123052a(bVar2, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherAudioVolume fail", e);
            }
        }
    }
}
