package p169ib;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: ib.b */
public final class C8870b implements C87685a {

    /* renamed from: ib.b$a */
    public static final class C8871a implements C84795y.C40572a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f28135a;

        public C8871a(C8870b bVar, C32226l<? super Bitmap, C13598b0> lVar) {
            this.f28135a = lVar;
        }

        /* renamed from: a */
        public final void mo1966a(String str) {
            C13598b0 b0Var;
            Log.m105924i("MicroMsg.LogoCaptureDelegate", "loadIcon, localPath: " + str);
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(str);
            if (bitmapNative != null) {
                this.f28135a.invoke(BitmapUtil.fastblur(bitmapNative, 3));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f28135a.invoke(null);
            }
        }
    }

    /* renamed from: a */
    public void mo9700a(AppBrandRuntime appBrandRuntime, C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C87412m.m108594g(lVar, "callback");
        String str = appBrandRuntime.mo113036W().f239364f;
        C87412m.m108593f(str, "runtime.initConfig.iconUrl");
        C84795y.m104477c(appBrandRuntime.mo113047b0(), str, (String) null, new C8871a(this, lVar));
    }
}
