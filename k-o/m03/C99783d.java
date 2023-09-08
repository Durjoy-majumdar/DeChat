package m03;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import f03.C97787h;
import l03.C21387c;

/* renamed from: m03.d */
public interface C99783d {
    /* renamed from: a */
    void mo24787a(double d, boolean z);

    /* renamed from: c */
    void mo24836c(C21387c cVar);

    /* renamed from: d */
    void mo24788d(double d);

    /* renamed from: e */
    boolean mo24789e(Context context, boolean z);

    /* renamed from: g */
    boolean mo24838g();

    int getCurrentPosition();

    int getDuration();

    double getLastProgresstime();

    long getLastSurfaceUpdateTime();

    C96814a.C96817e getScaleType();

    String getVideoPath();

    /* renamed from: h */
    boolean mo24843h();

    boolean isInitialized();

    boolean isMuted();

    boolean isPlaying();

    /* renamed from: j */
    void mo24847j();

    void onDetach();

    void pause();

    void prepare();

    void setAutoFixRotation(boolean z);

    void setDolbyEnable(boolean z);

    void setLoop(boolean z);

    void setMute(boolean z);

    void setOnInfoCallback(C96875r0.C19571b bVar);

    void setOnSeekCompleteCallback(C96875r0.C96877c cVar);

    void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar);

    void setOnlineVideo(boolean z);

    void setPlayProgressCallback(boolean z);

    void setResourceDownloader(C97787h hVar);

    void setScaleType(C96814a.C96817e eVar);

    void setVideoCallback(C96875r0.C96876a aVar);

    void setVideoPath(String str);

    boolean start();

    void stop();
}
