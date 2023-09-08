package p964fd;

import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: fd.c */
public class C86820c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f251977d;

    /* renamed from: e */
    public final /* synthetic */ float f251978e;

    /* renamed from: f */
    public final /* synthetic */ float f251979f;

    /* renamed from: g */
    public final /* synthetic */ C86824d f251980g;

    public C86820c(C86824d dVar, boolean z, float f, float f2) {
        this.f251980g = dVar;
        this.f251977d = z;
        this.f251978e = f;
        this.f251979f = f2;
    }

    public void run() {
        TextureImageViewLikeImpl textureImageViewLikeImpl = this.f251980g.f251986c.get();
        if (textureImageViewLikeImpl == null) {
            Log.m105924i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale#ui, textureImageViewLike already release");
        } else if (this.f251977d) {
            textureImageViewLikeImpl.setTextureViewWidthWeight(this.f251978e);
        } else {
            textureImageViewLikeImpl.setTextureViewHeightWeight(this.f251979f);
        }
    }
}
