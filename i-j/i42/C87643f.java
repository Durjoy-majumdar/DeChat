package i42;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.view.MBSurfaceStub;
import d42.C86193x;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: i42.f */
public final class C87643f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253836d;

    /* renamed from: e */
    public final /* synthetic */ int f253837e;

    /* renamed from: f */
    public final /* synthetic */ MBSurfaceStub f253838f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87643f(C87609c<C7594e> cVar, int i, MBSurfaceStub mBSurfaceStub) {
        super(0);
        this.f253836d = cVar;
        this.f253837e = i;
        this.f253838f = mBSurfaceStub;
    }

    public Object invoke() {
        C86193x xVar;
        MBBuildConfig<T> mBBuildConfig = this.f253836d.f253732f;
        if (!(mBBuildConfig == null || (xVar = mBBuildConfig.f248375n) == null)) {
            xVar.mo109582B(this.f253837e, this.f253838f);
        }
        MBSurfaceStub mBSurfaceStub = this.f253838f;
        TextureView textureView = mBSurfaceStub.f248444d;
        if (textureView != null) {
            mBSurfaceStub.removeView(textureView);
        }
        mBSurfaceStub.f248444d = null;
        SurfaceTexture surfaceTexture = mBSurfaceStub.f248445e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        return C13598b0.f38549a;
    }
}
