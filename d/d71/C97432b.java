package d71;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: d71.b */
public final class C97432b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C97426a f285986d;

    public C97432b(C97426a aVar) {
        this.f285986d = aVar;
    }

    public final void run() {
        Log.m105924i("MicroMsg.CapturePresenter", "voice finish called force");
        C97426a aVar = this.f285986d;
        if (!aVar.f285971h) {
            aVar.f285966c.mo127990e(aVar.f285972i);
        }
        this.f285986d.f285971h = true;
    }
}
