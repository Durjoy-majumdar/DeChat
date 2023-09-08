package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePlayer;
import jo0.C87997d;
import org.json.JSONException;
import org.json.JSONObject;
import p932bd.C79688b;

/* renamed from: ad.i */
public class C79509i implements TXLivePlayer.ITXAudioVolumeEvaluationListener {

    /* renamed from: a */
    public final /* synthetic */ C79502b f233146a;

    public C79509i(C79502b bVar) {
        this.f233146a = bVar;
    }

    public void onAudioVolumeEvaluationNotify(int i) {
        C79502b bVar = this.f233146a;
        C79688b bVar2 = bVar.f233099j;
        if (bVar2 != null) {
            int i2 = bVar.f253971d;
            C87997d dVar = (C87997d) bVar2;
            dVar.getClass();
            C87997d.C87999b bVar3 = new C87997d.C87999b((C87997d.C87998a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i2);
                jSONObject.put("volume", i);
                dVar.mo122451a(bVar3, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerAudioVolume fail", e);
            }
        }
    }
}
