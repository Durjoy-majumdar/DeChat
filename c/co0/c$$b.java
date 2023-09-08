package co0;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.sdk.platformtools.Log;

public class c$$b implements C82724i0.C29521a {

    /* renamed from: a */
    public final /* synthetic */ C80129c f234632a;

    public c$$b(C80129c cVar) {
        this.f234632a = cVar;
    }

    public void onPause() {
        Log.m105924i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus lossTransient");
        this.f234632a.f234629a.mo110358A();
    }

    public void onResume() {
        Log.m105924i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus gain");
        this.f234632a.f234629a.mo110362O();
    }

    public void onStop() {
        Log.m105924i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus loss, passive pause");
        this.f234632a.f234629a.mo110364Q();
        this.f234632a.mo110378a();
    }
}
