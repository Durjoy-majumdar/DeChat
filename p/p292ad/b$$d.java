package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import org.json.JSONObject;

/* renamed from: ad.b$$d */
public final /* synthetic */ class b$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233117d;

    public /* synthetic */ b$$d(C79502b bVar) {
        this.f233117d = bVar;
    }

    public final void run() {
        C79502b bVar = this.f233117d;
        if (bVar.f233097h != null) {
            Log.m105924i(bVar.mo109516v(), "startIfForeground, do start");
            bVar.mo109518x(AssetExtension.SCENE_PLAY, bVar.f233097h.mo33727m(AssetExtension.SCENE_PLAY, (JSONObject) null));
        }
    }
}
