package de1;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: de1.h */
public final class C7280h extends C87413o implements C32226l<Animator, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f25358d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f25359e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f25360f;

    /* renamed from: g */
    public final /* synthetic */ Activity f25361g;

    /* renamed from: h */
    public final /* synthetic */ Intent f25362h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7280h(View view, ImageView imageView, C32224a<C13598b0> aVar, Activity activity, Intent intent) {
        super(1);
        this.f25358d = view;
        this.f25359e = imageView;
        this.f25360f = aVar;
        this.f25361g = activity;
        this.f25362h = intent;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((Animator) obj, LocaleUtil.ITALIAN);
        View view = this.f25358d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$6", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$6", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ImageView imageView = this.f25359e;
        imageView.post(new C7279g(imageView, this.f25360f, this.f25361g, this.f25362h));
        Log.m105924i("ActivityToggleAnimator", "[exitAnimation] end");
        return C13598b0.f38549a;
    }
}
