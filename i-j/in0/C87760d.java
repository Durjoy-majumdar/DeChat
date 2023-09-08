package in0;

import android.view.Surface;

/* renamed from: in0.d */
public interface C87760d {
    /* renamed from: a */
    void mo22532a(float f, float f2);

    /* renamed from: b */
    void mo22533b(boolean z);

    /* renamed from: c */
    void mo22576c(d$$d d__d);

    /* renamed from: d */
    void mo22534d(String str, String str2);

    /* renamed from: e */
    void mo22535e(double d);

    /* renamed from: g */
    void mo22577g(String str, String str2, int i);

    int getCurrentPosition();

    int getDuration();

    int getPlayerType();

    int getState();

    int getVideoHeight();

    int getVideoWidth();

    /* renamed from: h */
    void mo22541h(String str, int i);

    /* renamed from: i */
    void mo22579i(d$$i d__i);

    boolean isPlaying();

    /* renamed from: l */
    boolean mo22543l(float f);

    /* renamed from: m */
    void mo22580m(String str, String str2, d$$e d__e);

    /* renamed from: n */
    void mo22581n(d$$f d__f);

    /* renamed from: o */
    <PlayerImpl extends C87760d> PlayerImpl mo22544o(Class<PlayerImpl> cls);

    /* renamed from: p */
    void mo22582p(d$$h d__h);

    void pause();

    void prepareAsync();

    /* renamed from: q */
    void mo22583q(d$$g d__g);

    /* renamed from: r */
    void mo22547r(String str, String str2, String str3, boolean z);

    void release();

    void reset();

    /* renamed from: s */
    void mo22584s(d$$c d__c);

    void seekTo(long j);

    void setDataSource(String str);

    void setMute(boolean z);

    void setSurface(Surface surface);

    void start();

    void stop();

    /* renamed from: t */
    void mo22585t(d$$l d__l);

    /* renamed from: u */
    void mo22586u(d$$j d__j);

    /* renamed from: v */
    void mo22587v(d$$k d__k);
}
