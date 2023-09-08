package bw0;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.ball.view.FloatBallBlurView;
import lb0.C88394b;
import zp3.C23564m;

/* renamed from: bw0.d */
public final class C104168d implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ FloatBallBlurView f308401d;

    public C104168d(FloatBallBlurView floatBallBlurView) {
        this.f308401d = floatBallBlurView;
    }

    /* renamed from: b */
    public void mo1907b() {
        FloatBallBlurView floatBallBlurView = this.f308401d;
        int i = FloatBallBlurView.f311896j;
        floatBallBlurView.getClass();
        C23564m.m28136f(new C104167b(floatBallBlurView));
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return this.f308401d.f311901h;
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        FloatBallBlurView floatBallBlurView = this.f308401d;
        int i = FloatBallBlurView.f311896j;
        floatBallBlurView.mo149250d(bitmap, true);
    }
}
