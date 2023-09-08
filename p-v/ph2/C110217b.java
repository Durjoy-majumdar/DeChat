package ph2;

import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;

/* renamed from: ph2.b */
public final class C110217b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110218c f329715d;

    /* renamed from: e */
    public final /* synthetic */ AudioCacheInfo f329716e;

    public C110217b(C110218c cVar, AudioCacheInfo audioCacheInfo) {
        this.f329715d = cVar;
        this.f329716e = audioCacheInfo;
    }

    public final void run() {
        this.f329715d.mo161624b(this.f329716e);
    }
}
