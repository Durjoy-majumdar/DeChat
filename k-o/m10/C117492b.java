package m10;

import android.content.Context;
import android.view.Surface;

/* renamed from: m10.b */
public interface C117492b {
    /* renamed from: a */
    void mo182201a(boolean z);

    /* renamed from: b */
    void mo182202b(String str);

    /* renamed from: c */
    void mo182203c(Surface surface);

    /* renamed from: d */
    void mo182204d(C117493c cVar);

    /* renamed from: e */
    void mo182205e(int i);

    /* renamed from: f */
    void mo182206f();

    long getCurrentPosition();

    void init(Context context);

    void release();

    void seekTo(int i);

    void setOutputMute(boolean z);

    void setVolume(float f);
}
