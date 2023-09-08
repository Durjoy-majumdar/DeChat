package p292ad;

import android.view.Surface;
import com.tencent.tav.core.AssetExtension;
import org.json.JSONObject;

/* renamed from: ad.l$$c */
public final /* synthetic */ class l$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79512l f233153d;

    public /* synthetic */ l$$c(C79512l lVar) {
        this.f233153d = lVar;
    }

    public final void run() {
        C79501a aVar;
        C79512l lVar = this.f233153d;
        if (lVar.f233150a.f233091R.get() && (aVar = lVar.f233150a.f233097h) != null) {
            aVar.setSurface((Surface) null);
            if (!lVar.f233150a.f233097h.isPlaying()) {
                lVar.f233150a.f233097h.mo33727m(AssetExtension.SCENE_PLAY, (JSONObject) null);
            }
        }
    }
}
