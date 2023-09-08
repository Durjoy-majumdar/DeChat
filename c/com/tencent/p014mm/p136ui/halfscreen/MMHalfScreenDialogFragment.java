package com.tencent.p014mm.p136ui.halfscreen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C0124r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditDialogFragment;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fj3.C20713c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p206nj.C76866m;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vn3.C118694m;
import zl3.C79402d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/r;", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "", "activityClassName", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "drawerListener", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment */
public class MMHalfScreenDialogFragment extends DialogFragment implements C0124r {

    /* renamed from: x */
    public static final /* synthetic */ int f219861x = 0;

    /* renamed from: d */
    public final Context f219862d;

    /* renamed from: e */
    public final Intent f219863e;

    /* renamed from: f */
    public final String f219864f;

    /* renamed from: g */
    public final String f219865g;

    /* renamed from: h */
    public final C13601g f219866h;

    /* renamed from: i */
    public final C13601g f219867i;

    /* renamed from: j */
    public final int f219868j;

    /* renamed from: n */
    public View f219869n;

    /* renamed from: o */
    public View f219870o;

    /* renamed from: p */
    public HalfScreenPullDownCloseLayout f219871p;

    /* renamed from: q */
    public View f219872q;

    /* renamed from: r */
    public boolean f219873r;

    /* renamed from: s */
    public RecyclerViewDrawerSquares.C45117c f219874s;

    /* renamed from: t */
    public VASActivity f219875t;

    /* renamed from: u */
    public C32224a<C13598b0> f219876u;

    /* renamed from: v */
    public final DialogInterface.OnShowListener f219877v;

    /* renamed from: w */
    public boolean f219878w;

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$a */
    public static final class C74766a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ MMHalfScreenDialogFragment f219879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74766a(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
            super(0);
            this.f219879d = mMHalfScreenDialogFragment;
        }

        public Object invoke() {
            boolean z;
            VASActivity vASActivity = this.f219879d.f219875t;
            if (vASActivity != null) {
                vASActivity.onBackPressed();
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$b */
    public static final class C74767b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMHalfScreenDialogFragment f219880d;

        public C74767b(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
            this.f219880d = mMHalfScreenDialogFragment;
        }

        public final void onClick(View view) {
            VASActivity vASActivity;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            VASActivity vASActivity2 = this.f219880d.f219875t;
            boolean z = true;
            if (vASActivity2 == null || !vASActivity2.onClickDialogSpaceOnHalfScreenMode()) {
                z = false;
            }
            if (!z && (vASActivity = this.f219880d.f219875t) != null) {
                vASActivity.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$c */
    public static final class C74768c implements DialogInterface.OnShowListener {

        /* renamed from: d */
        public final /* synthetic */ MMHalfScreenDialogFragment f219881d;

        /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$c$a */
        public static final class C74769a extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ ValueAnimator f219882d;

            /* renamed from: e */
            public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f219883e;

            public C74769a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
                this.f219882d = valueAnimator;
                this.f219883e = animatorUpdateListener;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f219882d.removeListener(this);
                this.f219882d.removeUpdateListener(this.f219883e);
            }
        }

        /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$c$b */
        public static final class C74770b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ MMHalfScreenDialogFragment f219884d;

            public C74770b(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
                this.f219884d = mMHalfScreenDialogFragment;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                float floatValue = f != null ? f.floatValue() : 0.0f;
                RecyclerViewDrawerSquares.C45117c cVar = this.f219884d.f219874s;
                if (cVar != null) {
                    cVar.mo9497e(1.0f - floatValue);
                }
            }
        }

        public C74768c(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
            this.f219881d = mMHalfScreenDialogFragment;
        }

        public final void onShow(DialogInterface dialogInterface) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            C74770b bVar = new C74770b(this.f219881d);
            C74769a aVar = new C74769a(ofFloat, bVar);
            ofFloat.addUpdateListener(bVar);
            ofFloat.addListener(aVar);
            RecyclerViewDrawerSquares.C45117c cVar = this.f219881d.f219874s;
            if (cVar != null) {
                cVar.mo3766g(true, false, 0);
            }
            ofFloat.start();
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$d */
    public static final class C74771d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ValueAnimator f219885d;

        /* renamed from: e */
        public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f219886e;

        public C74771d(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.f219885d = valueAnimator;
            this.f219886e = animatorUpdateListener;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f219885d.removeListener(this);
            this.f219885d.removeUpdateListener(this.f219886e);
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$e */
    public static final class C74772e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ MMHalfScreenDialogFragment f219887d;

        public C74772e(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
            this.f219887d = mMHalfScreenDialogFragment;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            float floatValue = f != null ? f.floatValue() : 0.0f;
            RecyclerViewDrawerSquares.C45117c cVar = this.f219887d.f219874s;
            if (cVar != null) {
                cVar.mo9497e(floatValue);
            }
            if (floatValue == 1.0f) {
                RecyclerViewDrawerSquares.C45117c cVar2 = this.f219887d.f219874s;
                if (cVar2 != null) {
                    cVar2.mo3766g(false, false, 0);
                }
                RecyclerViewDrawerSquares.C45117c cVar3 = this.f219887d.f219874s;
                if (cVar3 != null) {
                    cVar3.mo9498f();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$f */
    public static final class C74773f extends C87413o implements C32226l<MotionEvent, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ MMHalfScreenDialogFragment f219888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74773f(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
            super(1);
            this.f219888d = mMHalfScreenDialogFragment;
        }

        public Object invoke(Object obj) {
            boolean z;
            MotionEvent motionEvent = (MotionEvent) obj;
            C87412m.m108594g(motionEvent, LocaleUtil.ITALIAN);
            MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f219888d;
            int i = MMHalfScreenDialogFragment.f219861x;
            mMHalfScreenDialogFragment.getClass();
            boolean z2 = true;
            if (motionEvent.getAction() == 0) {
                View L = mMHalfScreenDialogFragment.mo103943L();
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int[] iArr = new int[2];
                L.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int measuredWidth = L.getMeasuredWidth() + i2;
                int measuredHeight = L.getMeasuredHeight() + i3;
                if (i2 <= rawX && rawX <= measuredWidth) {
                    if (i3 <= rawY && rawY <= measuredHeight) {
                        z = true;
                        mMHalfScreenDialogFragment.f219878w = z;
                    }
                }
                z = false;
                mMHalfScreenDialogFragment.f219878w = z;
            }
            if (mMHalfScreenDialogFragment.f219878w) {
                VASActivity vASActivity = mMHalfScreenDialogFragment.f219875t;
                z2 = vASActivity != null ? vASActivity.isContentAtTop() : false;
            }
            String str = mMHalfScreenDialogFragment.f219865g;
            Log.m105918d(str, "dialogCanPullDown:   isDownInListViewArea:" + mMHalfScreenDialogFragment.f219878w + "  result:" + z2);
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$g */
    public static final class C74774g implements C32226l<VASActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMHalfScreenDialogFragment f219889d;

        public C74774g(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
            this.f219889d = mMHalfScreenDialogFragment;
        }

        public Object invoke(Object obj) {
            VASActivity vASActivity = (VASActivity) obj;
            MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f219889d;
            mMHalfScreenDialogFragment.f219875t = vASActivity;
            mMHalfScreenDialogFragment.mo98536Q(vASActivity);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$h */
    public static final class C74775h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C74775h f219890d = new C74775h();

        public C74775h() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92159j(MMApplicationContext.getContext()));
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$i */
    public static final class C74776i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C74776i f219891d = new C74776i();

        public C74776i() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92145A(MMApplicationContext.getContext()));
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$j */
    public static final class C74777j implements DialogInterface.OnShowListener {

        /* renamed from: d */
        public final /* synthetic */ MMHalfScreenDialogFragment f219892d;

        public C74777j(MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
            this.f219892d = mMHalfScreenDialogFragment;
        }

        public void onShow(DialogInterface dialogInterface) {
            MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f219892d;
            mMHalfScreenDialogFragment.getClass();
            if (mMHalfScreenDialogFragment instanceof TextStatusEditDialogFragment) {
                MMHalfScreenDialogFragment mMHalfScreenDialogFragment2 = this.f219892d;
                View O = mMHalfScreenDialogFragment2.mo103944O();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(O, aVar.mo10232b(), "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "showAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(O, "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "showAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                float alpha = mMHalfScreenDialogFragment2.mo103945P().getAlpha();
                View P = mMHalfScreenDialogFragment2.mo103945P();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(P, aVar2.mo10232b(), "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "showAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                P.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(P, "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "showAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ViewPropertyAnimator alpha2 = mMHalfScreenDialogFragment2.mo103945P().animate().alpha(alpha);
                C20713c cVar = C20713c.f58572a;
                alpha2.setInterpolator(cVar.mo32435a());
                alpha2.setDuration(300);
                alpha2.start();
                mMHalfScreenDialogFragment2.mo103943L().setTranslationY((float) mMHalfScreenDialogFragment2.mo103943L().getMeasuredHeight());
                ViewPropertyAnimator translationY = mMHalfScreenDialogFragment2.mo103943L().animate().translationY(0.0f);
                translationY.setDuration(300);
                translationY.setInterpolator(cVar.mo32435a());
                translationY.start();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MMHalfScreenDialogFragment(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar, int i, C8480h hVar) {
        this(context, intent, str, (i & 8) != 0 ? null : cVar);
    }

    /* renamed from: K */
    public C79402d mo98534K(Context context) {
        C87412m.m108594g(context, "context");
        String str = this.f219865g;
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        Log.m105925i(str, "onCreateView() called with: isHonor:%s isHUAWEI:%s SDK_INT:%s", Boolean.valueOf(C76866m.m92672a()), Boolean.valueOf(C76866m.m92673b()), Integer.valueOf(i));
        if ((!C76866m.m92672a() && !C76866m.m92673b()) || i < 31) {
            z = false;
        }
        return (C76866m.m92676e() || z) ? new C79402d(context, C0966R.style.a8_) : new C79402d(context, 0, 2, (C8480h) null);
    }

    /* renamed from: L */
    public final View mo103943L() {
        View view = this.f219870o;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("activityContainer");
        throw null;
    }

    /* renamed from: M */
    public int mo97705M() {
        return this.f219868j;
    }

    /* renamed from: N */
    public float mo98535N() {
        return 0.5f;
    }

    /* renamed from: O */
    public final View mo103944O() {
        View view = this.f219869n;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("rootView");
        throw null;
    }

    /* renamed from: P */
    public final View mo103945P() {
        View view = this.f219872q;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("vMask");
        throw null;
    }

    /* renamed from: Q */
    public void mo98536Q(VASActivity vASActivity) {
        HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = this.f219871p;
        if (halfScreenPullDownCloseLayout != null) {
            halfScreenPullDownCloseLayout.setDragEnableBlock(new C74773f(this));
        }
    }

    /* renamed from: R */
    public void mo103946R(Window window) {
        C87412m.m108594g(window, "window");
        window.setWindowAnimations(C0966R.style.f8428i5);
    }

    /* renamed from: S */
    public final void mo103947S(int i) {
        ViewGroup.LayoutParams layoutParams = mo103943L().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            mo103943L().setLayoutParams(layoutParams);
        }
        HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = this.f219871p;
        if (halfScreenPullDownCloseLayout != null) {
            halfScreenPullDownCloseLayout.f219854i = i;
            halfScreenPullDownCloseLayout.f219853h = ((float) i) * 0.3f;
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        String str = this.f219865g;
        Log.m105918d(str, "onCreateDialog() called with: savedInstanceState = " + bundle);
        C79402d K = mo98534K(this.f219862d);
        K.f232922d = new C74766a(this);
        Window window = K.getWindow();
        if (window != null) {
            if (this instanceof TextStatusEditDialogFragment) {
                window.setWindowAnimations(0);
            } else {
                mo103946R(window);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
        }
        return K;
    }

    /* JADX WARNING: type inference failed for: r13v20, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            java.lang.String r0 = "inflaterOri"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = r11.f219865g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onCreateView() called with: inflater = "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = ", container = "
            r1.append(r12)
            r1.append(r13)
            java.lang.String r12 = ", savedInstanceState = "
            r1.append(r12)
            r1.append(r14)
            java.lang.String r12 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r12)
            android.content.Context r12 = r11.f219862d
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            r13 = 2131495951(0x7f0c0c0f, float:1.8615453E38)
            r14 = 0
            android.view.View r12 = r12.inflate(r13, r14)
            java.lang.String r13 = "layout"
            gy3.C87412m.m108593f(r12, r13)
            r11.f219869n = r12
            android.view.View r13 = r11.mo103944O()
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$b r0 = new com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$b
            r0.<init>(r11)
            r13.setOnClickListener(r0)
            android.view.View r13 = r11.mo103944O()
            r0 = 2131305833(0x7f092569, float:1.8229848E38)
            android.view.View r13 = r13.findViewById(r0)
            java.lang.String r0 = "rootView.findViewById(R.…creen_activity_container)"
            gy3.C87412m.m108593f(r13, r0)
            r11.f219870o = r13
            android.view.View r13 = r11.mo103944O()
            r0 = 2131316066(0x7f094d62, float:1.8250603E38)
            android.view.View r13 = r13.findViewById(r0)
            java.lang.String r0 = "rootView.findViewById(R.id.v_mask)"
            gy3.C87412m.m108593f(r13, r0)
            r11.f219872q = r13
            boolean r13 = r11.f219873r
            if (r13 == 0) goto L_0x0082
            android.view.View r13 = r11.mo103944O()
            r14 = 2131305843(0x7f092573, float:1.8229868E38)
            android.view.View r13 = r13.findViewById(r14)
            r14 = r13
            com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout r14 = (com.tencent.p014mm.p136ui.halfscreen.HalfScreenPullDownCloseLayout) r14
        L_0x0082:
            r11.f219871p = r14
            if (r14 == 0) goto L_0x008c
            android.view.View r13 = r11.mo103943L()
            r14.f219850e = r13
        L_0x008c:
            android.view.View r13 = r11.mo103943L()
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 12
            int r14 = kg3.C76577a.m92151b(r14, r0)
            float r14 = (float) r14
            zo3.a r0 = new zo3.a
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r14)
            r13.setOutlineProvider(r0)
            r13.setClipToOutline(r1)
            android.app.Dialog r13 = r11.getDialog()
            if (r13 == 0) goto L_0x00b6
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$c r14 = new com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment$c
            r14.<init>(r11)
            r13.setOnShowListener(r14)
        L_0x00b6:
            boolean r13 = r11 instanceof com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditDialogFragment
            if (r13 == 0) goto L_0x0152
            android.view.View r13 = r11.mo103945P()
            float r14 = r11.mo98535N()
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r0.mo10233c(r14)
            java.lang.Object[] r4 = r0.mo10232b()
            java.lang.String r5 = "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment"
            java.lang.String r6 = "onCreateView"
            java.lang.String r7 = "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            r3 = r13
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r14 = r0.mo10231a(r2)
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            r13.setAlpha(r14)
            java.lang.String r4 = "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment"
            java.lang.String r5 = "onCreateView"
            java.lang.String r6 = "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r9 = "(F)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            android.app.Dialog r13 = r11.getDialog()
            if (r13 == 0) goto L_0x0110
            android.view.Window r13 = r13.getWindow()
            if (r13 == 0) goto L_0x0110
            r14 = 0
            r13.setDimAmount(r14)
        L_0x0110:
            android.view.View r13 = r11.mo103944O()
            r14 = 4
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.mo10233c(r14)
            java.lang.Object[] r4 = r0.mo10232b()
            java.lang.String r5 = "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment"
            java.lang.String r6 = "onCreateView"
            java.lang.String r7 = "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r13
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r14 = r0.mo10231a(r2)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r13.setVisibility(r14)
            java.lang.String r4 = "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment"
            java.lang.String r5 = "onCreateView"
            java.lang.String r6 = "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0165
        L_0x0152:
            android.app.Dialog r13 = r11.getDialog()
            if (r13 == 0) goto L_0x0165
            android.view.Window r13 = r13.getWindow()
            if (r13 == 0) goto L_0x0165
            float r14 = r11.mo98535N()
            r13.setDimAmount(r14)
        L_0x0165:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.halfscreen.MMHalfScreenDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C87412m.m108594g(dialogInterface, "dialog");
        Log.m105924i(this.f219865g, "onDismiss");
        super.onDismiss(dialogInterface);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        C74772e eVar = new C74772e(this);
        C74771d dVar = new C74771d(ofFloat, eVar);
        ofFloat.addUpdateListener(eVar);
        ofFloat.addListener(dVar);
        ofFloat.start();
        C32224a<C13598b0> aVar = this.f219876u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onPause() {
        Window window;
        super.onPause();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (this instanceof TextStatusEditDialogFragment)) {
            window.setWindowAnimations(-1);
        }
    }

    public void onStart() {
        Log.m105924i(this.f219865g, "onStart called");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(this.f219877v);
        }
        super.onStart();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        mo103947S(mo97705M());
        C112919c0 beginTransaction = getChildFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "childFragmentManager.beginTransaction()");
        VASCommonFragment b = C118694m.m167384b(this.f219864f, this.f219863e, false, 4, (Object) null);
        b.f348636F = new C74774g(this);
        beginTransaction.mo165200l(C0966R.C0970id.n_8, b);
        beginTransaction.mo165163e();
    }

    public MMHalfScreenDialogFragment(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar) {
        C87412m.m108594g(context, "activityContext");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "activityClassName");
        this.f219862d = context;
        this.f219863e = intent;
        this.f219864f = str;
        this.f219865g = "MMHalfScreen.DialogFragment" + hashCode();
        setArguments(new Bundle());
        View view = getView();
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f219866h = C36568h.m40985a(C74776i.f219891d);
        C13601g a = C36568h.m40985a(C74775h.f219890d);
        this.f219867i = a;
        this.f219868j = (int) (((double) ((Number) ((C36570n) a).getValue()).intValue()) * 0.75d);
        this.f219874s = cVar;
        this.f219877v = new C74777j(this);
    }
}
