package m03;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPVideoLayout;
import com.tencent.p014mm.plugin.thumbplayer.view.MMThumbPlayerTextureView;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: m03.i */
public final class C61428i extends C87413o implements C32226l<Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MMTPVideoLayout f174673d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61428i(MMTPVideoLayout mMTPVideoLayout) {
        super(1);
        this.f174673d = mMTPVideoLayout;
    }

    public Object invoke(Object obj) {
        ((Number) obj).longValue();
        MMTPVideoLayout mMTPVideoLayout = this.f174673d;
        int i = MMTPVideoLayout.f164629p;
        MMThumbPlayerTextureView textureView = mMTPVideoLayout.getTextureView();
        if (textureView != null) {
            textureView.setAlpha(1.0f);
        }
        C32226l<SurfaceTexture, C13598b0> onFrameAvailable = this.f174673d.getOnFrameAvailable();
        if (onFrameAvailable != null) {
            onFrameAvailable.invoke(this.f174673d.f164634h);
        }
        return C13598b0.f38549a;
    }
}
