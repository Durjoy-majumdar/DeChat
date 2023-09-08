package u62;

import android.view.Surface;
import p1081gi.C98121d;
import p1081gi.C98127h;
import z62.C66734b;

/* renamed from: u62.d */
public interface C22583d {

    /* renamed from: u62.d$a */
    public interface C22584a {
        /* renamed from: n */
        void mo22598n(C22583d dVar);

        /* renamed from: u */
        void mo22602u(C22583d dVar);
    }

    /* renamed from: u62.d$b */
    public interface C22585b {
        /* renamed from: o */
        void mo22599o(C22583d dVar);
    }

    /* renamed from: u62.d$c */
    public interface C22586c {
        /* renamed from: e */
        void mo24015e(C66734b bVar, int i, C98121d dVar);

        /* renamed from: g */
        void mo24016g(C66734b bVar);

        /* renamed from: m */
        void mo24017m(C66734b bVar, int i, int i2);

        /* renamed from: r */
        void mo24022r(C66734b bVar, C98127h hVar, C98121d dVar);

        /* renamed from: s */
        void mo24023s(C66734b bVar, int i, int i2);

        /* renamed from: t */
        void mo24024t(C66734b bVar, int i, int i2, boolean z);

        /* renamed from: v */
        void mo24025v(C66734b bVar, int i, int i2);
    }

    /* renamed from: u62.d$d */
    public interface C22587d {
        /* renamed from: q */
        void mo22601q(C22583d dVar, int i, int i2);
    }

    /* renamed from: u62.d$e */
    public interface C22588e {
        /* renamed from: i */
        void mo22594i(C22583d dVar);
    }

    /* renamed from: u62.d$f */
    public interface C22589f {
        /* renamed from: j */
        void mo22595j(C22583d dVar, int i, long j, long j2, Object obj);
    }

    /* renamed from: u62.d$g */
    public interface C22590g {
        /* renamed from: l */
        void mo22597l(C22583d dVar, long j, long j2);
    }

    /* renamed from: u62.d$h */
    public interface C22591h {
        /* renamed from: p */
        void mo22600p(C22583d dVar, C22599h hVar);
    }

    /* renamed from: u62.d$i */
    public interface C22592i {
        /* renamed from: h */
        void mo22593h(C22583d dVar);
    }

    /* renamed from: u62.d$j */
    public interface C22593j {
        /* renamed from: k */
        void mo22596k(C22583d dVar, int i, int i2);
    }

    /* renamed from: u62.d$k */
    public interface C22594k {
        /* renamed from: f */
        void mo22592f(C22583d dVar, int i, int i2);
    }

    /* renamed from: a */
    void mo35686a(float f, float f2);

    /* renamed from: b */
    void mo35687b(boolean z);

    /* renamed from: c */
    void mo35655c(C22595e eVar);

    /* renamed from: d */
    void mo35656d(C22585b bVar);

    /* renamed from: e */
    void mo35657e(C22592i iVar);

    /* renamed from: f */
    void mo35688f(C66734b bVar);

    /* renamed from: g */
    void mo35658g(C22589f fVar);

    long getCurrentPositionMs();

    long getDurationMs();

    int getState();

    String getTag();

    int getVideoHeight();

    int getVideoWidth();

    /* renamed from: h */
    void mo35661h(C22594k kVar);

    /* renamed from: i */
    void mo35662i(C22593j jVar);

    boolean isPlaying();

    /* renamed from: j */
    void mo35663j(C22584a aVar);

    /* renamed from: k */
    void mo35664k(C22591h hVar);

    /* renamed from: l */
    void mo35665l(C22586c cVar);

    /* renamed from: m */
    void mo35666m(C22587d dVar);

    /* renamed from: n */
    void mo35667n(C22588e eVar);

    /* renamed from: o */
    void mo35668o(C22590g gVar);

    /* renamed from: p */
    Object mo35694p();

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(long j);

    void setOutputMute(boolean z);

    void setPlaySpeedRatio(float f);

    void setSurface(Surface surface);

    void start();

    void stop();
}
