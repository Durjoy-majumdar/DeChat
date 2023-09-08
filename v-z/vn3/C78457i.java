package vn3;

import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vn3.i */
public final class C78457i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f229862d;

    /* renamed from: e */
    public long f229863e;

    /* renamed from: f */
    public final /* synthetic */ VASCommonFragment f229864f;

    public C78457i(VASCommonFragment vASCommonFragment) {
        this.f229864f = vASCommonFragment;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f229862d++;
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.f229864f.f348641n;
        StringBuilder sb = new StringBuilder();
        sb.append("onAnimationUpdate:");
        sb.append(valueAnimator);
        sb.append(" %");
        sb.append(valueAnimator != null ? Float.valueOf(valueAnimator.getAnimatedFraction()) : null);
        sb.append(" cnt:");
        sb.append(this.f229862d);
        sb.append(" duration:");
        sb.append(currentTimeMillis - this.f229863e);
        Log.m105918d(str, sb.toString());
        this.f229863e = currentTimeMillis;
    }
}
