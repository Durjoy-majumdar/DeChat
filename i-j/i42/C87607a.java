package i42;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.plugin.magicbrush.view.MBSurfaceStub;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import r52.C89870a;
import r52.C89872c;
import rx3.C13598b0;

/* renamed from: i42.a */
public final class C87607a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253725d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87607a(C87609c<C7594e> cVar) {
        super(0);
        this.f253725d = cVar;
    }

    public Object invoke() {
        Collection<MBSurfaceStub> values = this.f253725d.f253736j.values();
        C87412m.m108593f(values, "surfaceStubs.values");
        for (MBSurfaceStub mBSurfaceStub : values) {
            TextureView textureView = mBSurfaceStub.f248444d;
            if (textureView != null) {
                mBSurfaceStub.removeView(textureView);
            }
            mBSurfaceStub.f248444d = null;
            SurfaceTexture surfaceTexture = mBSurfaceStub.f248445e;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        this.f253725d.f253736j.clear();
        Collection<C89872c> values2 = this.f253725d.f253737k.values();
        C87412m.m108593f(values2, "externalSurfaceStubs.values");
        for (C89872c cVar : values2) {
            cVar.f258319q.post(new C89870a(cVar));
        }
        this.f253725d.f253737k.clear();
        return C13598b0.f38549a;
    }
}
