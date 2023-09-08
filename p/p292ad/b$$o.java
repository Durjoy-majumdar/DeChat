package p292ad;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ad.b$$o */
public class b$$o implements C82724i0.C29521a {

    /* renamed from: a */
    public final /* synthetic */ C79502b f233133a;

    public b$$o(C79502b bVar) {
        this.f233133a = bVar;
    }

    public void onPause() {
        Log.m105924i(this.f233133a.mo109516v(), "onPause");
        C79502b.m96468q(this.f233133a);
    }

    public void onResume() {
        Log.m105924i(this.f233133a.mo109516v(), "onResume");
        this.f233133a.mo109505F();
    }

    public void onStop() {
        Log.m105924i(this.f233133a.mo109516v(), "onStop");
        C79502b.m96468q(this.f233133a);
    }
}
