package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86921f;
import java.util.HashMap;
import lo0.C88606e;
import org.json.JSONObject;

/* renamed from: cd.s$$a */
public final /* synthetic */ class s$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80009s f234402d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f234403e;

    /* renamed from: f */
    public final /* synthetic */ String f234404f;

    public /* synthetic */ s$$a(C80009s sVar, JSONObject jSONObject, String str) {
        this.f234402d = sVar;
        this.f234403e = jSONObject;
        this.f234404f = str;
    }

    public final void run() {
        C80009s sVar = this.f234402d;
        JSONObject jSONObject = this.f234403e;
        String str = this.f234404f;
        C79999m mVar = sVar.f234401b.f234327i;
        if (mVar != null && mVar.mo21074f("playBGM", jSONObject).f60905a != 0) {
            Log.m105921e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, play bgm fail, url:%s", str);
            if (sVar.f234401b.f234329n != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", str);
                C80005q qVar = sVar.f234401b;
                ((C88606e) qVar.f234329n).mo123053b(qVar.f253971d, C86921f.f252339m, 10003, "play bgm fail", hashMap);
            }
        }
    }
}
