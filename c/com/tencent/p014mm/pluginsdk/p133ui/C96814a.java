package com.tencent.p014mm.pluginsdk.p133ui;

import android.graphics.Bitmap;
import com.tencent.thumbplayer.api.ITPPlayer;
import vd3.C102173o;

/* renamed from: com.tencent.mm.pluginsdk.ui.a */
public interface C96814a {

    /* renamed from: com.tencent.mm.pluginsdk.ui.a$b */
    public interface C57541b {
        /* renamed from: F */
        void mo22955F(String str, String str2);

        /* renamed from: I1 */
        void mo22956I1(String str, String str2);

        /* renamed from: I3 */
        void mo22957I3(String str, String str2, Boolean bool);

        /* renamed from: L */
        void mo22958L(String str, String str2);

        /* renamed from: T */
        void mo22960T(String str, String str2, String str3, int i, int i2);

        /* renamed from: V5 */
        void mo22961V5(String str, String str2, int i, int i2, int i3);

        /* renamed from: Z */
        void mo22962Z(String str, String str2);

        /* renamed from: a0 */
        void mo22963a0(String str, String str2);

        /* renamed from: l0 */
        void mo22964l0(String str, String str2, int i, int i2);

        /* renamed from: m0 */
        void mo22965m0(String str, String str2);

        void onSeekComplete(ITPPlayer iTPPlayer);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.a$d */
    public interface C57542d {
        /* renamed from: b */
        void mo81284b();
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.a$a */
    public interface C96815a {
        /* renamed from: o */
        void mo129208o(String str, boolean z);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.a$c */
    public interface C96816c {
        void idkeyStat(long j, long j2, long j3, boolean z);

        void kvStat(int i, String str);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.a$e */
    public enum C96817e {
        DEFAULT,
        FILL,
        CONTAIN,
        COVER,
        CROP
    }

    /* renamed from: a */
    boolean mo79613a(double d, boolean z);

    /* renamed from: b */
    void mo79614b();

    /* renamed from: c */
    void mo79616c();

    /* renamed from: f */
    void mo79617f();

    int getCacheTimeSec();

    int getCurrPosMs();

    int getCurrPosSec();

    int getPlayerType();

    int getVideoDurationSec();

    /* renamed from: h */
    void mo76636h(boolean z, String str, int i);

    /* renamed from: i */
    boolean mo129198i();

    boolean isPlaying();

    boolean pause();

    boolean play();

    void setCover(Bitmap bitmap);

    void setFullDirection(int i);

    void setIsShowBasicControls(boolean z);

    void setLoop(boolean z);

    void setLoopCompletionCallback(C57542d dVar);

    void setMute(boolean z);

    boolean setPlayRate(float f);

    void setScaleType(C96817e eVar);

    void setVideoFooterView(C102173o oVar);

    void start();

    void stop();
}
