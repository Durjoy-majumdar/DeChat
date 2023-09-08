package com.tencent.p014mm.plugin.appbrand.jsapi.video;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c */
public interface C17978c {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$a */
    public interface C17979a {
        /* renamed from: A */
        void mo22335A();

        /* renamed from: B */
        void mo22336B();

        /* renamed from: C */
        void mo22337C();

        /* renamed from: D */
        void mo22338D(C17984f fVar);

        /* renamed from: E */
        void mo22339E();

        void hide();

        void onDestroy();

        /* renamed from: p */
        void mo22342p();

        /* renamed from: q */
        boolean mo22343q();

        /* renamed from: r */
        void mo22344r();

        /* renamed from: s */
        boolean mo22345s();

        void seek(int i);

        void setDanmakuBtnOnClickListener(C17985g gVar);

        void setDanmakuBtnOpen(boolean z);

        void setExitFullScreenBtnOnClickListener(View.OnClickListener onClickListener);

        void setFullScreenBtnOnClickListener(View.OnClickListener onClickListener);

        void setIplaySeekCallback(C17982d dVar);

        void setIsPlay(boolean z);

        void setMuteBtnOnClickListener(View.OnClickListener onClickListener);

        void setMuteBtnState(boolean z);

        void setOnPlayButtonClickListener(View.OnClickListener onClickListener);

        void setOnUpdateProgressLenListener(C17983e eVar);

        void setPlayBtnInCenterPosition(boolean z);

        void setShowControlProgress(boolean z);

        void setShowDanmakuBtn(boolean z);

        void setShowFullScreenBtn(boolean z);

        void setShowMuteBtn(boolean z);

        void setShowPlayBtn(boolean z);

        void setShowProgress(boolean z);

        void setStatePorter(C17987i iVar);

        void setTitle(String str);

        /* renamed from: t */
        void mo22366t();

        /* renamed from: v */
        boolean mo22367v();

        /* renamed from: w */
        void mo22368w();

        /* renamed from: x */
        boolean mo22369x();

        /* renamed from: y */
        boolean mo22370y();

        /* renamed from: z */
        void mo22371z();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$b */
    public interface C17980b {
        /* renamed from: a */
        void mo22372a(int i);

        /* renamed from: c */
        void mo22373c(boolean z);

        int getVideoTotalTime();

        void setVideoTotalTime(int i);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$c */
    public interface C17981c {
        /* renamed from: F */
        void mo22290F(String str, String str2);

        /* renamed from: L */
        void mo22291L(String str, String str2);

        /* renamed from: T */
        void mo22292T(String str, String str2, String str3, int i, int i2);

        /* renamed from: Z */
        void mo22293Z(String str, String str2);

        /* renamed from: a0 */
        void mo22295a0(String str, String str2);

        /* renamed from: l0 */
        void mo22311l0(String str, String str2, int i, int i2);

        /* renamed from: m0 */
        void mo22312m0(String str, String str2);

        /* renamed from: n0 */
        void mo22313n0(String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$d */
    public interface C17982d {
        /* renamed from: a */
        void mo22286a(int i);

        void onSeekPre();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$e */
    public interface C17983e {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$f */
    public interface C17984f {
        /* renamed from: a */
        void mo22281a(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$g */
    public interface C17985g {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$h */
    public enum C17986h {
        DEFAULT,
        FILL,
        CONTAIN,
        COVER
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.c$i */
    public interface C17987i {
    }

    /* renamed from: a */
    boolean mo22294a(double d, boolean z);

    /* renamed from: b */
    void mo22296b();

    /* renamed from: c */
    void mo22297c();

    /* renamed from: d */
    boolean mo22298d(double d);

    /* renamed from: f */
    void mo22299f();

    int getCacheTimeSec();

    int getCurrPosMs();

    int getCurrPosSec();

    int getPlayerType();

    int getVideoDurationSec();

    View getView();

    /* renamed from: h */
    void mo22307h(boolean z, String str, int i);

    /* renamed from: i */
    boolean mo22308i();

    boolean isPlaying();

    /* renamed from: j */
    void mo22310j();

    boolean pause();

    boolean play();

    void setCover(Bitmap bitmap);

    void setFullDirection(int i);

    void setIMMVideoViewCallback(C17981c cVar);

    void setIsShowBasicControls(boolean z);

    void setMute(boolean z);

    boolean setPlayRate(float f);

    void setScaleType(C17986h hVar);

    void setVideoFooterView(C17980b bVar);

    void setVideoSource(int i);

    void start();

    void stop();
}
