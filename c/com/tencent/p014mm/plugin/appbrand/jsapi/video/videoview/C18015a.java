package com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.a */
public interface C18015a {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.a$a */
    public interface C18016a {
        void onCompletion();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.a$b */
    public interface C18017b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.a$c */
    public interface C18018c {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.a$d */
    public interface C18019d {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.a$e */
    public interface C18020e {
    }

    /* renamed from: a */
    void mo22412a(double d, boolean z);

    /* renamed from: d */
    void mo22415d(double d);

    int getCurrentPosition();

    int getDuration();

    String getVideoPath();

    boolean isPlaying();

    void pause();

    void setMute(boolean z);

    void setOnInfoCallback(C18017b bVar);

    void setOnSeekCompleteCallback(C18018c cVar);

    void setOnSurfaceCallback(C18019d dVar);

    void setOneTimeVideoTextureUpdateCallback(C18020e eVar);

    void setVideoCallback(C18016a aVar);

    void setVideoPath(String str);

    boolean start();

    void stop();
}
