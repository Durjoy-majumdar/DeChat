package com.tencent.p014mm.plugin.brandservice.p028ui.profile;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kw0.C46746a;
import l31.C61212e;
import nx0.C11304c;
import nx0.C76973a;
import nx0.C76974b;
import rx3.C13598b0;
import vn3.C118694m;
import vn3.C78456a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/profile/BizContactInfoDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/r;", "Lnx0/c;", "Lrx3/b0;", "onFragmentViewCreate", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Context;Landroid/content/Intent;)V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment */
public final class BizContactInfoDialogFragment extends DialogFragment implements C0124r, C11304c {

    /* renamed from: r */
    public static final /* synthetic */ int f197545r = 0;

    /* renamed from: d */
    public final Context f197546d;

    /* renamed from: e */
    public final Intent f197547e;

    /* renamed from: f */
    public View f197548f;

    /* renamed from: g */
    public VASCommonFragment f197549g;

    /* renamed from: h */
    public AppBarLayout f197550h;

    /* renamed from: i */
    public C76973a f197551i;

    /* renamed from: j */
    public int f197552j;

    /* renamed from: n */
    public float f197553n;

    /* renamed from: o */
    public RecyclerViewDrawerSquares.C45117c f197554o;

    /* renamed from: p */
    public int f197555p;

    /* renamed from: q */
    public final Runnable f197556q = new C68770h(this);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$a */
    public static final class C68762a implements DialogInterface.OnShowListener {

        /* renamed from: d */
        public final /* synthetic */ BizContactInfoDialogFragment f197557d;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$a$a */
        public static final class C68763a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ BizContactInfoDialogFragment f197558d;

            public C68763a(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
                this.f197558d = bizContactInfoDialogFragment;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                float floatValue = f != null ? f.floatValue() : 0.0f;
                RecyclerViewDrawerSquares.C45117c cVar = this.f197558d.f197554o;
                if (cVar != null) {
                    cVar.mo9497e(1.0f - floatValue);
                }
            }
        }

        public C68762a(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            this.f197557d = bizContactInfoDialogFragment;
        }

        public final void onShow(DialogInterface dialogInterface) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            BizContactInfoDialogFragment bizContactInfoDialogFragment = this.f197557d;
            ofFloat.setDuration(300);
            ofFloat.addUpdateListener(new C68763a(bizContactInfoDialogFragment));
            ofFloat.start();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$b */
    public static final class C68764b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ BizContactInfoDialogFragment f197559d;

        public C68764b(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            this.f197559d = bizContactInfoDialogFragment;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            float floatValue = f != null ? f.floatValue() : 0.0f;
            RecyclerViewDrawerSquares.C45117c cVar = this.f197559d.f197554o;
            if (cVar != null) {
                cVar.mo9497e(floatValue);
            }
            if (floatValue == 1.0f) {
                RecyclerViewDrawerSquares.C45117c cVar2 = this.f197559d.f197554o;
                if (cVar2 != null) {
                    cVar2.mo3766g(false, false, 0);
                }
                RecyclerViewDrawerSquares.C45117c cVar3 = this.f197559d.f197554o;
                if (cVar3 != null) {
                    cVar3.mo9498f();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$c */
    public static final class C68765c implements AppBarLayout.C67445c {

        /* renamed from: a */
        public final /* synthetic */ BizContactInfoDialogFragment f197560a;

        public C68765c(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            this.f197560a = bizContactInfoDialogFragment;
        }

        /* renamed from: a */
        public final void mo3128a(AppBarLayout appBarLayout, int i) {
            this.f197560a.f197552j = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$d */
    public static final class C68766d implements C32226l<VASActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizContactInfoDialogFragment f197561d;

        public C68766d(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            this.f197561d = bizContactInfoDialogFragment;
        }

        public Object invoke(Object obj) {
            VASActivity vASActivity = (VASActivity) obj;
            if (vASActivity instanceof C78456a) {
                ((C78456a) vASActivity).mo96589j4(new C68771a(this.f197561d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$e */
    public static final class C68767e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ BizContactInfoDialogFragment f197562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68767e(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            super(0);
            this.f197562d = bizContactInfoDialogFragment;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f197562d.f197552j == 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$f */
    public static final class C68768f extends C87413o implements C32227p<Integer, Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizContactInfoDialogFragment f197563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68768f(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            super(2);
            this.f197563d = bizContactInfoDialogFragment;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            float floatValue = ((Number) obj2).floatValue();
            BizContactInfoDialogFragment bizContactInfoDialogFragment = this.f197563d;
            bizContactInfoDialogFragment.f197553n = floatValue;
            RecyclerViewDrawerSquares.C45117c cVar = bizContactInfoDialogFragment.f197554o;
            if (cVar != null) {
                cVar.mo9497e(floatValue);
            }
            C76973a aVar = this.f197563d.f197551i;
            if (aVar != null) {
                float b = (((float) intValue) - 0.0f) / (((float) C76577a.m92151b(aVar.f224915d, 56)) - 0.0f);
                float f = (b - 0.5f) * 2.0f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                if (b > 1.0f) {
                    b = 1.0f;
                }
                if (0.0f >= b) {
                    b = 0.0f;
                }
                int b2 = C76577a.m92151b(aVar.f224915d, 16);
                int b3 = C76577a.m92151b(aVar.f224915d, 4);
                View view = aVar.f224913b;
                C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.profile.BizDragHeaderView");
                BizDragHeaderView bizDragHeaderView = (BizDragHeaderView) view;
                BizDragHeaderView bizDragHeaderView2 = (BizDragHeaderView) aVar.f224913b;
                RectF rectF = bizDragHeaderView2.f197567e;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = (float) bizDragHeaderView2.f197569g;
                rectF.bottom = (float) ((int) (((float) b3) + (b * ((float) (b2 - b3)))));
                bizDragHeaderView2.postInvalidate();
                View view2 = aVar.f224914c;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderComponent", "onDragTranslation", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderComponent", "onDragTranslation", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$g */
    public static final class C68769g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizContactInfoDialogFragment f197564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68769g(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            super(0);
            this.f197564d = bizContactInfoDialogFragment;
        }

        public Object invoke() {
            this.f197564d.dismissAllowingStateLoss();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment$h */
    public static final class C68770h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BizContactInfoDialogFragment f197565d;

        public C68770h(BizContactInfoDialogFragment bizContactInfoDialogFragment) {
            this.f197565d = bizContactInfoDialogFragment;
        }

        public final void run() {
            Window window;
            Dialog dialog = this.f197565d.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(C0966R.style.f8428i5);
            }
        }
    }

    public BizContactInfoDialogFragment(Context context, Intent intent) {
        C87412m.m108594g(context, "activityContext");
        C87412m.m108594g(intent, "intent");
        this.f197546d = context;
        this.f197547e = intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 16973839);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.coc, (ViewGroup) null);
        Dialog dialog = getDialog();
        C87412m.m108591d(dialog);
        dialog.requestWindowFeature(1);
        Dialog dialog2 = getDialog();
        C87412m.m108591d(dialog2);
        Window window = dialog2.getWindow();
        C87412m.m108591d(window);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setWindowAnimations(C0966R.style.f8428i5);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        window.setLayout(-1, -2);
        C46746a.f125826a.mo71977j(window.getDecorView(), (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
        window.setBackgroundDrawableResource(C0966R.color.ahf);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setBackgroundResource(C0966R.color.ahf);
        C87412m.m108593f(inflate, "layout");
        this.f197548f = inflate;
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnShowListener(new C68762a(this));
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        View view = this.f197548f;
        if (view != null) {
            view.removeCallbacks(this.f197556q);
            VASCommonFragment vASCommonFragment = this.f197549g;
            if (vASCommonFragment != null) {
                vASCommonFragment.getLifecycle().removeObserver(this);
            } else {
                C87412m.m108603p("profileFragment");
                throw null;
            }
        } else {
            C87412m.m108603p("contentView");
            throw null;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C87412m.m108594g(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86150RW(this, true);
        float f = this.f197553n;
        if (f >= 1.0f) {
            RecyclerViewDrawerSquares.C45117c cVar = this.f197554o;
            if (cVar != null) {
                cVar.mo9497e(1.0f);
            }
            RecyclerViewDrawerSquares.C45117c cVar2 = this.f197554o;
            if (cVar2 != null) {
                cVar2.mo3766g(false, false, 0);
            }
            RecyclerViewDrawerSquares.C45117c cVar3 = this.f197554o;
            if (cVar3 != null) {
                cVar3.mo9498f();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C68764b(this));
        ofFloat.start();
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onFragmentViewCreate() {
        View view = null;
        if (this.f197550h == null) {
            VASCommonFragment vASCommonFragment = this.f197549g;
            if (vASCommonFragment != null) {
                View view2 = vASCommonFragment.f165494h;
                AppBarLayout appBarLayout = view2 != null ? (AppBarLayout) view2.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout") : null;
                this.f197550h = appBarLayout;
                if (appBarLayout != null) {
                    appBarLayout.mo146159a(new C68765c(this));
                }
            } else {
                C87412m.m108603p("profileFragment");
                throw null;
            }
        }
        if (this.f197551i == null) {
            VASCommonFragment vASCommonFragment2 = this.f197549g;
            if (vASCommonFragment2 != null) {
                View view3 = vASCommonFragment2.f165494h;
                View findViewWithTag = view3 != null ? view3.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarContainer") : null;
                VASCommonFragment vASCommonFragment3 = this.f197549g;
                if (vASCommonFragment3 != null) {
                    View view4 = vASCommonFragment3.f165494h;
                    View findViewWithTag2 = view4 != null ? view4.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarLine") : null;
                    VASCommonFragment vASCommonFragment4 = this.f197549g;
                    if (vASCommonFragment4 != null) {
                        View view5 = vASCommonFragment4.f165494h;
                        if (view5 != null) {
                            view = view5.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarArrow");
                        }
                        if (findViewWithTag != null && findViewWithTag2 != null && view != null) {
                            this.f197551i = new C76973a(findViewWithTag, findViewWithTag2, view);
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("profileFragment");
                    throw null;
                }
                C87412m.m108603p("profileFragment");
                throw null;
            }
            C87412m.m108603p("profileFragment");
            throw null;
        }
    }

    public void onPause() {
        Window window;
        super.onPause();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
    }

    public void onResume() {
        super.onResume();
        View view = this.f197548f;
        if (view != null) {
            view.postDelayed(this.f197556q, 200);
        } else {
            C87412m.m108603p("contentView");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setBackgroundResource(C0966R.color.ahf);
        }
        int j = C76577a.m92159j(MMApplicationContext.getContext());
        View view3 = this.f197548f;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            int i = this.f197555p;
            if (i <= 0) {
                i = (int) (((double) j) * 0.75d);
            }
            layoutParams.height = i;
            View view4 = this.f197548f;
            if (view4 != null) {
                view4.setLayoutParams(layoutParams);
                View view5 = this.f197548f;
                if (view5 != null) {
                    view5.setBackgroundResource(C0966R.color.BW_100);
                    C112919c0 beginTransaction = getChildFragmentManager().beginTransaction();
                    C87412m.m108593f(beginTransaction, "childFragmentManager.beginTransaction()");
                    VASCommonFragment b = C118694m.m167384b("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", this.f197547e, false, 4, (Object) null);
                    this.f197549g = b;
                    b.f348636F = new C68766d(this);
                    b.getLifecycle().addObserver(this);
                    VASCommonFragment vASCommonFragment = this.f197549g;
                    if (vASCommonFragment != null) {
                        beginTransaction.mo165200l(C0966R.C0970id.lyu, vASCommonFragment);
                        beginTransaction.mo165163e();
                        Dialog dialog2 = getDialog();
                        C87412m.m108591d(dialog2);
                        Window window = dialog2.getWindow();
                        KeyEvent.Callback decorView = window != null ? window.getDecorView() : null;
                        if (decorView instanceof ViewGroup) {
                            viewGroup = (ViewGroup) decorView;
                        }
                        if (viewGroup != null) {
                            C76974b bVar = new C76974b(this.f197546d, viewGroup, new C68767e(this), new C68768f(this));
                            bVar.setOnDragToClose(new C68769g(this));
                            bVar.setBackgroundResource(C0966R.color.ahf);
                            View childAt = bVar.f224916d.getChildAt(0);
                            bVar.f224919g = childAt;
                            bVar.f224916d.removeView(childAt);
                            bVar.addView(bVar.f224919g);
                            bVar.f224916d.addView(bVar);
                            C46746a.f125826a.mo71977j(bVar.f224919g, (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
                            int j2 = C76577a.m92159j(MMApplicationContext.getContext());
                            bVar.f224922j = j2;
                            bVar.f224921i = ((float) j2) * 0.3f;
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("profileFragment");
                    throw null;
                }
                C87412m.m108603p("contentView");
                throw null;
            }
            C87412m.m108603p("contentView");
            throw null;
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    /* renamed from: u */
    public VASCommonFragment mo11344u() {
        VASCommonFragment vASCommonFragment = this.f197549g;
        if (vASCommonFragment != null) {
            return vASCommonFragment;
        }
        C87412m.m108603p("profileFragment");
        throw null;
    }
}
