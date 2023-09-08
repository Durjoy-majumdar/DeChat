package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import po0.C89421g;
import po0.C89422h;
import po0.g$$i;

/* renamed from: fd.y */
public class C86851y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f252115d;

    /* renamed from: e */
    public final /* synthetic */ C86826e f252116e;

    public C86851y(C86826e eVar, int i) {
        this.f252116e = eVar;
        this.f252115d = i;
    }

    public void run() {
        C86826e eVar = this.f252116e;
        int i = this.f252115d;
        if (!eVar.f251992C) {
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerBufferingUpdate, mp released");
            return;
        }
        if (i != eVar.f252002M) {
            eVar.f252002M = i;
            Log.m105925i(eVar.mo121291y(), "onBufferingUpdate, percent:%s", Integer.valueOf(i));
        }
        if (eVar.mo121279N() && eVar.f251990A) {
            C89421g gVar = (C89421g) eVar.f252035i;
            gVar.getClass();
            try {
                JSONObject b = gVar.mo123741b();
                b.put("buffered", i);
                gVar.mo123740a(new g$$i((C89422h) null), b);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoProgress fail", e);
            }
        }
    }
}
