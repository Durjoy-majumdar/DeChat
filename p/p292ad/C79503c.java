package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.IXWebBroadcastListener;
import p1066yc.C91423s;

/* renamed from: ad.c */
public class C79503c implements C91423s {

    /* renamed from: a */
    public final /* synthetic */ C79502b f233138a;

    public C79503c(C79502b bVar) {
        this.f233138a = bVar;
    }

    public void pause() {
        Log.m105924i(this.f233138a.mo109516v(), "pause");
        C79502b bVar = this.f233138a;
        bVar.getClass();
        bVar.mo109503D(new b$$n(bVar, "stop", (Runnable) null));
    }

    public void start() {
        Log.m105924i(this.f233138a.mo109516v(), IXWebBroadcastListener.STAGE_START);
        C79502b bVar = this.f233138a;
        C79501a aVar = bVar.f233097h;
        if (aVar != null && !((C79513m) aVar).isPlaying()) {
            bVar.mo109503D(new b$$n(bVar, AssetExtension.SCENE_PLAY, (Runnable) null));
        }
    }
}
