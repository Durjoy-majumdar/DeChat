package p396x6;

import p295b8.C16774g;
import p370p7.C21962v;

/* renamed from: x6.p */
public interface C23017p {

    /* renamed from: x6.p$a */
    public interface C23018a {
        void onLoadingChanged(boolean z);

        void onPlaybackParametersChanged(C23016o oVar);

        void onPlayerError(C22997e eVar);

        void onPlayerStateChanged(boolean z, int i);

        void onPositionDiscontinuity();

        void onRepeatModeChanged(int i);

        void onTimelineChanged(C23027v vVar, Object obj);

        void onTracksChanged(C21962v vVar, C16774g gVar);
    }

    /* renamed from: a */
    void mo36262a(boolean z);

    /* renamed from: b */
    boolean mo36263b();

    /* renamed from: c */
    void mo36264c(C23016o oVar);

    /* renamed from: d */
    void mo36265d(C23018a aVar);

    /* renamed from: f */
    int mo36266f();

    long getCurrentPosition();

    long getDuration();

    void release();

    void stop();
}
