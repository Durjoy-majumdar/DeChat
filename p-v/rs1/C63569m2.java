package rs1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rs1.m2 */
public final class C63569m2 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ View f180266d;

    public C63569m2(View view) {
        this.f180266d = view;
    }

    public void onAnimationEnd(Animator animator) {
        StringBuilder sb = new StringBuilder();
        sb.append("onAnimationEnd: check bg status, width = ");
        sb.append(this.f180266d.getWidth());
        sb.append(", color = ");
        Drawable background = this.f180266d.getBackground();
        String str = null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            str = Integer.toHexString(colorDrawable.getColor());
        }
        sb.append(str);
        Log.m105924i("FinderFeedMegaVideoBtnAnimUIC", sb.toString());
    }
}
