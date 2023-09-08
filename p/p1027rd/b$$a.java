package p1027rd;

import android.graphics.SurfaceTexture;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import p1017od.f$$c;
import rx3.C13598b0;

/* renamed from: rd.b$$a */
public final /* synthetic */ class b$$a implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C89927b f258413d;

    /* renamed from: e */
    public final /* synthetic */ int f258414e;

    /* renamed from: f */
    public final /* synthetic */ b$$b f258415f;

    public /* synthetic */ b$$a(C89927b bVar, int i, b$$b b__b) {
        this.f258413d = bVar;
        this.f258414e = i;
        this.f258415f = b__b;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C89927b bVar = this.f258413d;
        int i = this.f258414e;
        b$$b b__b = this.f258415f;
        C87412m.m108594g(bVar, "this$0");
        C87412m.m108594g(b__b, "$entry");
        MBRuntime mBRuntime = bVar.f258410a;
        String str = bVar.f258411b;
        if (mBRuntime.f235052a != 0) {
            mBRuntime.mo111515k(new f$$c(mBRuntime, i, str));
        }
        C32226l<SurfaceTexture, C13598b0> lVar = b__b.f258420e;
        if (lVar != null) {
            C87412m.m108593f(surfaceTexture, LocaleUtil.ITALIAN);
            lVar.invoke(surfaceTexture);
        }
    }
}
