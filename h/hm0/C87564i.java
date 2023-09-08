package hm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;

/* renamed from: hm0.i */
public interface C87564i {

    /* renamed from: hm0.i$a */
    public interface C87565a {
    }

    /* renamed from: hm0.i$b */
    public enum C87566b {
        Video,
        LivePlayer,
        LivePusher
    }

    /* renamed from: b */
    Integer mo110185b();

    /* renamed from: d */
    void mo110187d(C87565a aVar);

    String getKey();

    C87566b getType();

    int getVideoHeight();

    int getVideoWidth();

    /* renamed from: i */
    boolean mo110196i();

    /* renamed from: k */
    C82732k0 mo110199k();

    void pause();

    void release();

    void start();
}
