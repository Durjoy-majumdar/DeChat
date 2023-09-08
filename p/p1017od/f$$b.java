package p1017od;

import com.tencent.magicbrush.MBRuntime;

/* renamed from: od.f$$b */
public final /* synthetic */ class f$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MBRuntime f256927d;

    /* renamed from: e */
    public final /* synthetic */ int f256928e;

    /* renamed from: f */
    public final /* synthetic */ String f256929f;

    public /* synthetic */ f$$b(MBRuntime mBRuntime, int i, String str) {
        this.f256927d = mBRuntime;
        this.f256928e = i;
        this.f256929f = str;
    }

    public final void run() {
        MBRuntime mBRuntime = this.f256927d;
        mBRuntime.nativeUnregisterExtSurface(mBRuntime.f235052a, this.f256928e, this.f256929f);
    }
}
