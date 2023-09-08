package mf1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mf1.l */
public final class C10837l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f32360d;

    /* renamed from: e */
    public final /* synthetic */ float f32361e;

    /* renamed from: f */
    public final /* synthetic */ float f32362f;

    public C10837l(View view, float f, float f2) {
        this.f32360d = view;
        this.f32361e = f;
        this.f32362f = f2;
    }

    public final void run() {
        int i = this.f32360d.getLayoutParams().height;
        int i2 = this.f32360d.getLayoutParams().width;
        float f = (float) i;
        float f2 = f / ((float) i2);
        Log.m105924i("Finder.FeedCardJumperObserver", "adjustIconRatio height:" + i + " width:" + i2 + " curRatio:" + f2 + " targetRatio:" + this.f32361e);
        if (!(f2 == this.f32361e)) {
            ViewGroup.LayoutParams layoutParams = this.f32360d.getLayoutParams();
            layoutParams.width = (int) (f / this.f32362f);
            this.f32360d.setLayoutParams(layoutParams);
        }
    }
}
