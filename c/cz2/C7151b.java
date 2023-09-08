package cz2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import zp3.C79406f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: cz2.b */
public final class C7151b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C75314h f25126d;

    /* renamed from: e */
    public final /* synthetic */ Context f25127e;

    /* renamed from: f */
    public final /* synthetic */ ViewGroup f25128f;

    /* renamed from: g */
    public final /* synthetic */ View f25129g;

    /* renamed from: h */
    public final /* synthetic */ View f25130h;

    /* renamed from: cz2.b$a */
    public static final class C7152a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75314h f25131d;

        /* renamed from: e */
        public final /* synthetic */ Context f25132e;

        public C7152a(C75314h hVar, Context context) {
            this.f25131d = hVar;
            this.f25132e = context;
        }

        public final void run() {
            C75314h hVar = this.f25131d;
            Context context = this.f25132e;
            C87412m.m108593f(context, "context");
            hVar.getClass();
            Object systemService = context.getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(hVar.f221471i, 0);
        }
    }

    public C7151b(C75314h hVar, Context context, ViewGroup viewGroup, View view, View view2) {
        this.f25126d = hVar;
        this.f25127e = context;
        this.f25128f = viewGroup;
        this.f25129g = view;
        this.f25130h = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Log.m105918d("MicroMsg.TextStatus.DoWhatCustomStatusConvert", "expand() setUpdateListener " + valueAnimator.getAnimatedFraction());
        float animatedFraction = valueAnimator.getAnimatedFraction();
        MMEditText mMEditText = this.f25126d.f221471i;
        if (mMEditText != null) {
            mMEditText.setVisibility(0);
        }
        MMEditText mMEditText2 = this.f25126d.f221471i;
        int a = (int) (((float) C79406f.m96347a(this.f25127e, 48.0f)) * animatedFraction);
        if (mMEditText2 != null) {
            ViewGroup.LayoutParams layoutParams = mMEditText2.getLayoutParams();
            layoutParams.height = a;
            mMEditText2.setLayoutParams(layoutParams);
        }
        C75314h hVar = this.f25126d;
        ViewGroup viewGroup = this.f25128f;
        int a2 = (int) (((float) C79406f.m96347a(this.f25127e, 64.0f)) * animatedFraction);
        hVar.getClass();
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = a2;
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (animatedFraction >= 0.5f) {
            View view = this.f25129g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$3$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$3$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f25130h.setBackground(this.f25127e.getDrawable(C0966R.C0969drawable.cm9));
        }
        if (((double) animatedFraction) >= 1.0d) {
            MMEditText mMEditText3 = this.f25126d.f221471i;
            if (mMEditText3 != null) {
                mMEditText3.requestFocus();
            }
            C119179t tVar = C119157j.f356862d;
            C7152a aVar2 = new C7152a(this.f25126d, this.f25127e);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar2, 50, false);
        }
    }
}
