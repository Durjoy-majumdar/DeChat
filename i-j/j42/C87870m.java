package j42;

import com.tencent.p014mm.libwxaudio.WxAudioNative;

/* renamed from: j42.m */
public final class C87870m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87830a f254362d;

    public C87870m(C87830a aVar) {
        this.f254362d = aVar;
    }

    public final void run() {
        WxAudioNative wxAudioNative = this.f254362d.f254290p;
        if (wxAudioNative != null) {
            wxAudioNative.forcePauseAllPlayer();
        }
    }
}
