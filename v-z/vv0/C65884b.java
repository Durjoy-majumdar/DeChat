package vv0;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nj3.C88990b;

/* renamed from: vv0.b */
public final class C65884b {

    /* renamed from: vv0.b$a */
    public static final class C65885a implements C88990b.C61771c {

        /* renamed from: a */
        public final /* synthetic */ boolean f189439a;

        /* renamed from: b */
        public final /* synthetic */ Activity f189440b;

        public C65885a(boolean z, Activity activity) {
            this.f189439a = z;
            this.f189440b = activity;
        }

        public final void onComplete(boolean z) {
            Log.m105924i("MicroMsg.FloatBallPageAnimationUtils", "convertActivityToTranslucent onComplete: " + z + ", retry: " + this.f189439a);
            if (!z && !this.f189439a) {
                C65884b.m77629a(this.f189440b, true);
            }
        }
    }

    /* renamed from: a */
    public static final void m77629a(Activity activity, boolean z) {
        C88990b.m111194c(activity, new C65885a(z, activity));
    }

    /* renamed from: b */
    public static final void m77630b(Context context, Intent intent, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        intent.putExtras(ActivityOptions.makeCustomAnimation(context, C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y).toBundle());
        intent.putExtra("key_enter_from_float_ball", true);
        intent.putExtra("key_enter_with_animation", z);
        intent.putExtra("key_enter_orientation", context.getResources().getConfiguration().orientation);
    }
}
