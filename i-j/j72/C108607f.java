package j72;

import android.graphics.Point;
import i72.C108382h;
import p375qh.C89658b;

/* renamed from: j72.f */
public interface C108607f {

    /* renamed from: j72.f$a */
    public interface C108608a {
        /* renamed from: d */
        void mo150355d(int i);
    }

    /* renamed from: j72.f$b */
    public interface C108609b {
        /* renamed from: a */
        void mo159633a();

        /* renamed from: b */
        void mo159634b();

        void onStart();

        void onStop();
    }

    /* renamed from: j72.f$c */
    public enum C108610c {
        WaitStart,
        Start,
        PrepareStop,
        WaitStop,
        Stop,
        Error,
        Initialized,
        Pause
    }

    /* renamed from: a */
    String mo159600a();

    /* renamed from: b */
    String mo159601b();

    /* renamed from: c */
    float mo159602c();

    void cancel();

    void clear();

    /* renamed from: d */
    void mo159605d(float f);

    /* renamed from: e */
    void mo159606e(C108608a aVar);

    /* renamed from: f */
    boolean mo159607f();

    /* renamed from: g */
    boolean mo159608g();

    String getFilePath();

    C108382h getFrameDataCallback();

    String getMd5();

    /* renamed from: i */
    void mo159612i(int i, int i2, int i3, int i4);

    /* renamed from: j */
    C108610c mo159613j();

    /* renamed from: k */
    int mo159614k();

    /* renamed from: m */
    void mo159615m(String str);

    /* renamed from: n */
    void mo159616n(Runnable runnable);

    /* renamed from: o */
    void mo159617o(int i);

    /* renamed from: p */
    boolean mo159618p(int i);

    void pause();

    /* renamed from: q */
    void mo159620q(int i, int i2, int i3);

    /* renamed from: r */
    Point mo159621r();

    void reset();

    /* renamed from: s */
    long mo159623s();

    void setMirror(boolean z);

    void setMute(boolean z);

    /* renamed from: t */
    C89658b mo159626t();

    /* renamed from: u */
    String mo159627u();

    /* renamed from: v */
    void mo159628v(String str);

    /* renamed from: w */
    void mo159629w(boolean z);

    /* renamed from: x */
    void mo159630x(String str);

    /* renamed from: y */
    int mo159631y();

    /* renamed from: z */
    int mo159632z(int i, boolean z, int i2);
}
