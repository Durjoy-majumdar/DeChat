package p964fd;

import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import po0.C89427n;

/* renamed from: fd.d */
public class C86824d implements e$$s {

    /* renamed from: a */
    public final float f251984a;

    /* renamed from: b */
    public final float f251985b;

    /* renamed from: c */
    public final WeakReference<TextureImageViewLikeImpl> f251986c;

    public C86824d(C89427n nVar, TextureImageViewLikeImpl textureImageViewLikeImpl) {
        C86826e eVar = nVar.f257465a;
        float f = eVar.f252029e1;
        this.f251984a = f;
        float f2 = eVar.f252030f1;
        this.f251985b = f2;
        Log.m105925i("MicroMsg.AppBrand.TextureScaleLogic", "<init>, originWidthScale: %f, originHeightScale: %f", Float.valueOf(f), Float.valueOf(f2));
        this.f251986c = new WeakReference<>(textureImageViewLikeImpl);
    }
}
