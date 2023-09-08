package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.r0 */
public interface C96875r0 {

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.r0$b */
    public interface C19571b {
        /* renamed from: j */
        void mo25380j(int i, int i2);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.r0$a */
    public interface C96876a {
        /* renamed from: M0 */
        int mo76207M0(int i, int i2);

        void onCompletion();

        void onError(int i, int i2);

        void onPrepared();

        /* renamed from: p3 */
        void mo76226p3(int i, int i2);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.r0$c */
    public interface C96877c {
        /* renamed from: z */
        void mo86881z(boolean z);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.r0$d */
    public interface C96878d {
        /* renamed from: k */
        void mo127239k();
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.r0$e */
    public interface C96879e {
        /* renamed from: r */
        void mo79636r();
    }

    /* renamed from: a */
    void mo24787a(double d, boolean z);

    /* renamed from: d */
    void mo24788d(double d);

    /* renamed from: e */
    boolean mo24789e(Context context, boolean z);

    int getCurrentPosition();

    int getDuration();

    double getLastProgresstime();

    long getLastSurfaceUpdateTime();

    String getVideoPath();

    boolean isPlaying();

    void onDetach();

    void pause();

    void setLoop(boolean z);

    void setMute(boolean z);

    void setOnInfoCallback(C19571b bVar);

    void setOnSeekCompleteCallback(C96877c cVar);

    void setOnSurfaceCallback(C96878d dVar);

    void setOneTimeVideoTextureUpdateCallback(C96879e eVar);

    void setPlayProgressCallback(boolean z);

    void setThumb(Bitmap bitmap);

    void setVideoCallback(C96876a aVar);

    void setVideoPath(String str);

    boolean start();

    void stop();
}
