package p1017od;

import android.view.Surface;
import com.tencent.magicbrush.MBRuntime;

/* renamed from: od.f$$a */
public final /* synthetic */ class f$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MBRuntime f256921d;

    /* renamed from: e */
    public final /* synthetic */ int f256922e;

    /* renamed from: f */
    public final /* synthetic */ String f256923f;

    /* renamed from: g */
    public final /* synthetic */ int f256924g;

    /* renamed from: h */
    public final /* synthetic */ int f256925h;

    /* renamed from: i */
    public final /* synthetic */ Surface f256926i;

    public /* synthetic */ f$$a(MBRuntime mBRuntime, int i, String str, int i2, int i3, Surface surface) {
        this.f256921d = mBRuntime;
        this.f256922e = i;
        this.f256923f = str;
        this.f256924g = i2;
        this.f256925h = i3;
        this.f256926i = surface;
    }

    public final void run() {
        MBRuntime mBRuntime = this.f256921d;
        mBRuntime.nativeRegisterExtSurface(mBRuntime.f235052a, this.f256922e, this.f256923f, this.f256924g, this.f256925h, this.f256926i);
    }
}
