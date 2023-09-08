package gq0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C9515s;
import lb0.C88394b;
import nj3.C76875f0;

/* renamed from: gq0.r */
public final class C76022r implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C76875f0 f222888d;

    /* renamed from: e */
    public final /* synthetic */ C107895q f222889e;

    public C76022r(C76875f0 f0Var, C107895q qVar) {
        this.f222888d = f0Var;
        this.f222889e = qVar;
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onLoadFailed");
    }

    /* renamed from: d */
    public void mo1908d() {
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "beforeLoadBitmap");
    }

    public String key() {
        return C9515s.m9209a(this);
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onBitmapLoaded");
        if (bitmap == null) {
            Log.m105928w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onBitmapLoaded, bitmap is null");
        } else {
            this.f222888d.mo107180e(new BitmapDrawable(this.f222889e.mo158331f(bitmap)), 0);
        }
    }
}
