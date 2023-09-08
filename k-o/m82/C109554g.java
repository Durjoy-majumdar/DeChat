package m82;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: m82.g */
public final class C109554g extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f327929d;

    /* renamed from: e */
    public final /* synthetic */ C109548c f327930e;

    /* renamed from: f */
    public final /* synthetic */ VideoView f327931f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109554g(String str, C109548c cVar, VideoView videoView) {
        super(1);
        this.f327929d = str;
        this.f327930e = cVar;
        this.f327931f = videoView;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C87412m.m108594g(surfaceTexture, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "onFirstFrame " + this.f327929d + ' ' + surfaceTexture);
        C32224a aVar = this.f327930e.f327916f.get(this.f327929d);
        if (aVar != null) {
            aVar.invoke();
        }
        this.f327930e.f327916f.remove(this.f327929d);
        this.f327931f.setOnSurfaceTextureUpdate(C10768f.f32242d);
        return C13598b0.f38549a;
    }
}
