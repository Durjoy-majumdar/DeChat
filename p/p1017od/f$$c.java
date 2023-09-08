package p1017od;

import com.tencent.magicbrush.MBRuntime;

/* renamed from: od.f$$c */
public final /* synthetic */ class f$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MBRuntime f256930d;

    /* renamed from: e */
    public final /* synthetic */ int f256931e;

    /* renamed from: f */
    public final /* synthetic */ String f256932f;

    public /* synthetic */ f$$c(MBRuntime mBRuntime, int i, String str) {
        this.f256930d = mBRuntime;
        this.f256931e = i;
        this.f256932f = str;
    }

    public final void run() {
        MBRuntime mBRuntime = this.f256930d;
        mBRuntime.nativeNotifyExtSurfaceFrameAvailable(mBRuntime.f235052a, this.f256931e, this.f256932f);
    }
}
