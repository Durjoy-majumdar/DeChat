package p1017od;

import android.view.Surface;
import com.tencent.magicbrush.MBRuntime;
import p416qd.C89598h;

/* renamed from: od.g */
public class C89161g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f256933d;

    /* renamed from: e */
    public final /* synthetic */ int f256934e;

    /* renamed from: f */
    public final /* synthetic */ int f256935f;

    /* renamed from: g */
    public final /* synthetic */ int f256936g;

    /* renamed from: h */
    public final /* synthetic */ MBRuntime f256937h;

    public C89161g(MBRuntime mBRuntime, Surface surface, int i, int i2, int i3) {
        this.f256937h = mBRuntime;
        this.f256933d = surface;
        this.f256934e = i;
        this.f256935f = i2;
        this.f256936g = i3;
    }

    public void run() {
        if (this.f256933d == null) {
            C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", new RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowChanged. maybe released by other module", new Object[0]);
            return;
        }
        MBRuntime mBRuntime = this.f256937h;
        mBRuntime.nativeNotifyWindowChangedForSurface(mBRuntime.f235052a, this.f256934e, this.f256933d, this.f256935f, this.f256936g);
    }
}
