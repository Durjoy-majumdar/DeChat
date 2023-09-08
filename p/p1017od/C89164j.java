package p1017od;

import android.graphics.SurfaceTexture;
import com.tencent.magicbrush.MBRuntime;
import p416qd.C89598h;

/* renamed from: od.j */
public class C89164j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SurfaceTexture f256944d;

    /* renamed from: e */
    public final /* synthetic */ int f256945e;

    /* renamed from: f */
    public final /* synthetic */ int f256946f;

    /* renamed from: g */
    public final /* synthetic */ int f256947g;

    /* renamed from: h */
    public final /* synthetic */ MBRuntime f256948h;

    public C89164j(MBRuntime mBRuntime, SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        this.f256948h = mBRuntime;
        this.f256944d = surfaceTexture;
        this.f256945e = i;
        this.f256946f = i2;
        this.f256947g = i3;
    }

    public void run() {
        if (this.f256944d == null) {
            C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", new RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowChanged. maybe released by other module", new Object[0]);
            return;
        }
        MBRuntime mBRuntime = this.f256948h;
        mBRuntime.nativeNotifyWindowChanged(mBRuntime.f235052a, this.f256945e, this.f256944d, this.f256946f, this.f256947g);
    }
}
