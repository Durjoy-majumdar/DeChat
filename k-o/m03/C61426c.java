package m03;

import android.graphics.Bitmap;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g03.C107680o;
import i03.C60240c;
import java.util.List;
import rx3.C13598b0;

/* renamed from: m03.c */
public interface C61426c {
    /* renamed from: a */
    void mo86373a(long j, long j2);

    /* renamed from: b */
    void mo86374b(C32226l<? super Bitmap, C13598b0> lVar);

    /* renamed from: c */
    void mo86375c();

    /* renamed from: d */
    void mo86376d();

    /* renamed from: e */
    void mo86377e();

    /* renamed from: f */
    void mo86378f(C58010a aVar, String str);

    /* renamed from: g */
    Object mo86379g(C58010a aVar);

    long getCurrentPositionMs();

    EffectManager getEffectManager();

    C60240c getReportInfo();

    /* renamed from: h */
    void mo86383h(int i, long j);

    /* renamed from: i */
    void mo86384i(int i);

    void pause();

    void release();

    void resume();

    void seekTo(long j);

    void setFirstFrameRenderCallback(C32224a<C13598b0> aVar);

    void setLoop(boolean z);

    void setMediaChangeListener(C109459m mVar);

    void setMediaList(List<? extends C58010a> list);

    void setMute(boolean z);

    void setMvMusicProxy(C109458k kVar);

    void setOnPlayFinishListener(C32224a<C13598b0> aVar);

    void setOnProgressCallback(C32227p<? super Long, ? super C58010a, C13598b0> pVar);

    void setPauseOnVideoPlay(boolean z);

    void setPlayStatusChangeListener(C107680o oVar);

    void start();

    void stop();
}
