package zi3;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj3.C75769d;

/* renamed from: zi3.b */
public class C79335b {
    /* renamed from: a */
    public static Animation m96035a(Context context) {
        if (context == null) {
            Log.m105920e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2332x);
        loadAnimation.setInterpolator(new C75769d());
        return loadAnimation;
    }
}
