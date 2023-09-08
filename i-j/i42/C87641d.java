package i42;

import android.view.TextureView;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.view.MBSurfaceStub;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d42.C86193x;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: i42.d */
public final class C87641d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253830d;

    /* renamed from: e */
    public final /* synthetic */ int f253831e;

    /* renamed from: f */
    public final /* synthetic */ MBSurfaceStub f253832f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87641d(C87609c<C7594e> cVar, int i, MBSurfaceStub mBSurfaceStub) {
        super(0);
        this.f253830d = cVar;
        this.f253831e = i;
        this.f253832f = mBSurfaceStub;
    }

    public Object invoke() {
        C86193x xVar;
        MBBuildConfig<T> mBBuildConfig = this.f253830d.f253732f;
        if (!(mBBuildConfig == null || (xVar = mBBuildConfig.f248375n) == null)) {
            xVar.mo109585Z(this.f253831e, this.f253832f);
        }
        MBSurfaceStub mBSurfaceStub = this.f253832f;
        if (mBSurfaceStub.f248444d == null) {
            TextureView textureView = new TextureView(mBSurfaceStub.getContext());
            textureView.setOpaque(false);
            textureView.setSurfaceTextureListener(mBSurfaceStub);
            mBSurfaceStub.f248444d = textureView;
            mBSurfaceStub.addView(textureView);
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                mBSurfaceStub.setContentDescription("MBView");
                TextureView textureView2 = mBSurfaceStub.f248444d;
                if (textureView2 != null) {
                    textureView2.setContentDescription("MBTextureView");
                }
            }
        }
        return C13598b0.f38549a;
    }
}
