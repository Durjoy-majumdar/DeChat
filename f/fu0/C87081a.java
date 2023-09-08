package fu0;

import a14.C0000n0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82969i;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import p206nj.C11171e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fu0.a */
public final class C87081a {

    /* renamed from: a */
    public final Context f252668a;

    /* renamed from: b */
    public ViewManager f252669b;

    /* renamed from: c */
    public View f252670c;

    /* renamed from: d */
    public int f252671d;

    /* renamed from: e */
    public Animator f252672e;

    /* renamed from: f */
    public String f252673f = "";

    /* renamed from: g */
    public String f252674g = "";

    /* renamed from: h */
    public C87082a f252675h;

    /* renamed from: i */
    public final C87083b f252676i = new C87083b(this);

    /* renamed from: j */
    public boolean f252677j;

    /* renamed from: fu0.a$a */
    public interface C87082a {
        /* renamed from: a */
        void mo121075a(C87081a aVar);

        /* renamed from: b */
        void mo121076b(C87081a aVar);

        /* renamed from: c */
        void mo121077c(C87081a aVar);
    }

    /* renamed from: fu0.a$b */
    public static final class C87083b implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ C87081a f252678d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WMPFVoipCallInPopupWindow$appForegroundDelegateListener$1$onAppBackground$1", mo125469f = "WMPFVoipCallInPopupWindow.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: fu0.a$b$a */
        public static final class C87084a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C87081a f252679d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C87084a(C87081a aVar, C15601d<? super C87084a> dVar) {
                super(2, dVar);
                this.f252679d = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C87084a(this.f252679d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C87084a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C87081a aVar = this.f252679d;
                if (aVar.f252670c != null) {
                    aVar.f252677j = true;
                    aVar.mo121547a(true, true);
                }
                return C13598b0.f38549a;
            }
        }

        public C87083b(C87081a aVar) {
            this.f252678d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r0 = r0.getContext();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAppBackground(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r9 = "MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow"
                java.lang.String r0 = "onAppBackground: "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                fu0.a r0 = r8.f252678d
                android.view.View r0 = r0.f252670c
                r1 = 0
                if (r0 == 0) goto L_0x001c
                android.content.Context r0 = r0.getContext()
                if (r0 == 0) goto L_0x001c
                java.lang.String r2 = "power"
                java.lang.Object r0 = r0.getSystemService(r2)
                goto L_0x001d
            L_0x001c:
                r0 = r1
            L_0x001d:
                boolean r2 = r0 instanceof android.os.PowerManager
                if (r2 == 0) goto L_0x0024
                android.os.PowerManager r0 = (android.os.PowerManager) r0
                goto L_0x0025
            L_0x0024:
                r0 = r1
            L_0x0025:
                if (r0 == 0) goto L_0x002c
                boolean r0 = r0.isInteractive()
                goto L_0x002d
            L_0x002c:
                r0 = 1
            L_0x002d:
                if (r0 == 0) goto L_0x0047
                java.lang.String r0 = "onAppBackground: hideCard"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                a14.s1 r2 = a14.C0001s1.f0d
                a14.h0 r9 = a14.C53872d1.f151117a
                a14.k2 r3 = f14.C58901s.f168555a
                r4 = 0
                fu0.a$b$a r5 = new fu0.a$b$a
                fu0.a r9 = r8.f252678d
                r5.<init>(r9, r1)
                r6 = 2
                r7 = 0
                a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fu0.C87081a.C87083b.onAppBackground(java.lang.String):void");
        }

        public void onAppForeground(String str) {
            C87081a aVar = this.f252678d;
            if (aVar.f252677j) {
                aVar.f252677j = false;
                aVar.mo121548b(true);
            }
        }
    }

    /* renamed from: fu0.a$c */
    public static final class C87085c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f252680d;

        /* renamed from: e */
        public final /* synthetic */ C87081a f252681e;

        public C87085c(View view, C87081a aVar) {
            this.f252680d = view;
            this.f252681e = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f252680d.getLayoutParams();
            WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                C87081a aVar = this.f252681e;
                View view = this.f252680d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.y = ((Integer) animatedValue).intValue();
                ViewManager viewManager = aVar.f252669b;
                if (viewManager != null) {
                    viewManager.updateViewLayout(view, layoutParams2);
                }
            }
        }
    }

    /* renamed from: fu0.a$d */
    public static final class C87086d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f252682d;

        public C87086d(C32224a<C13598b0> aVar) {
            this.f252682d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f252682d.invoke();
        }
    }

    /* renamed from: fu0.a$e */
    public static final class C87087e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87081a f252683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87087e(C87081a aVar) {
            super(0);
            this.f252683d = aVar;
        }

        public Object invoke() {
            C87081a aVar = this.f252683d;
            ViewManager viewManager = aVar.f252669b;
            if (viewManager != null) {
                viewManager.removeView(aVar.f252670c);
            }
            C87081a aVar2 = this.f252683d;
            aVar2.f252669b = null;
            aVar2.f252672e = null;
            aVar2.f252670c = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fu0.a$f */
    public static final class C87088f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87081a f252684d;

        public C87088f(C87081a aVar) {
            this.f252684d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87081a aVar = this.f252684d;
            C87082a aVar2 = aVar.f252675h;
            if (aVar2 != null) {
                aVar2.mo121076b(aVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fu0.a$g */
    public static final class C87089g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87081a f252685d;

        public C87089g(C87081a aVar) {
            this.f252685d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87081a aVar = this.f252685d;
            C87082a aVar2 = aVar.f252675h;
            if (aVar2 != null) {
                aVar2.mo121077c(aVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fu0.a$h */
    public static final class C87090h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87081a f252686d;

        public C87090h(C87081a aVar) {
            this.f252686d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87081a aVar = this.f252686d;
            C87082a aVar2 = aVar.f252675h;
            if (aVar2 != null) {
                aVar2.mo121075a(aVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fu0.a$i */
    public static final class C87091i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f252687d;

        /* renamed from: e */
        public final /* synthetic */ View f252688e;

        /* renamed from: f */
        public final /* synthetic */ C87081a f252689f;

        /* renamed from: fu0.a$i$a */
        public static final class C87092a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ View f252690d;

            /* renamed from: e */
            public final /* synthetic */ C87081a f252691e;

            public C87092a(View view, C87081a aVar) {
                this.f252690d = view;
                this.f252691e = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = this.f252690d.getLayoutParams();
                WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    C87081a aVar = this.f252691e;
                    View view = this.f252690d;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams2.y = ((Integer) animatedValue).intValue();
                    ViewManager viewManager = aVar.f252669b;
                    if (viewManager != null) {
                        viewManager.updateViewLayout(view, layoutParams2);
                    }
                }
            }
        }

        /* renamed from: fu0.a$i$b */
        public static final class C87093b extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ View f252692d;

            /* renamed from: e */
            public final /* synthetic */ C87081a f252693e;

            public C87093b(View view, C87081a aVar) {
                this.f252692d = view;
                this.f252693e = aVar;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f252693e.getClass();
                this.f252693e.f252672e = null;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                View view = this.f252692d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C87091i(boolean z, View view, C87081a aVar) {
            this.f252687d = z;
            this.f252688e = view;
            this.f252689f = aVar;
        }

        public final void run() {
            if (this.f252687d) {
                View view = this.f252688e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f252689f.f252671d = this.f252688e.getMeasuredHeight();
            Animator animator = this.f252689f.f252672e;
            if (animator != null) {
                animator.cancel();
            }
            C87081a aVar2 = this.f252689f;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-aVar2.f252671d, 0});
            C87081a aVar3 = this.f252689f;
            View view3 = this.f252688e;
            View view4 = aVar3.f252670c;
            if (view4 != null) {
                ofInt.addUpdateListener(new C87092a(view4, aVar3));
            }
            ofInt.addListener(new C87093b(view3, aVar3));
            ofInt.setDuration(200);
            ofInt.start();
            aVar2.f252672e = ofInt;
        }
    }

    public C87081a(Context context) {
        C87412m.m108594g(context, "context");
        this.f252668a = context;
    }

    /* renamed from: a */
    public final void mo121547a(boolean z, boolean z2) {
        Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "dismissCard() called with: quickHide = " + z);
        if (!z2) {
            AppForegroundDelegate.INSTANCE.mo174215k(this.f252676i);
        }
        View view = this.f252670c;
        if (view != null) {
            C87087e eVar = new C87087e(this);
            if (z) {
                eVar.invoke();
                return;
            }
            Animator animator = this.f252672e;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, -this.f252671d});
            ofInt.addUpdateListener(new C87085c(view, this));
            ofInt.addListener(new C87086d(eVar));
            ofInt.setDuration(200);
            ofInt.start();
            this.f252672e = ofInt;
        }
    }

    /* renamed from: b */
    public final void mo121548b(boolean z) {
        AppForegroundDelegate.INSTANCE.mo174208a(this.f252676i);
        if (this.f252669b == null) {
            Object systemService = this.f252668a.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f252669b = new C87094b((WindowManager) systemService);
        }
        if (this.f252670c == null) {
            this.f252670c = LayoutInflater.from(this.f252668a).inflate(C0966R.C0971layout.cuc, (ViewGroup) null, false);
        }
        View view = this.f252670c;
        C87412m.m108591d(view);
        ((TextView) view.findViewById(C0966R.C0970id.hjz)).setText(this.f252674g);
        View view2 = this.f252670c;
        C87412m.m108591d(view2);
        ((TextView) view2.findViewById(C0966R.C0970id.f358874hk1)).setText(this.f252673f);
        View view3 = this.f252670c;
        C87412m.m108591d(view3);
        view3.findViewById(C0966R.C0970id.ead).setOnClickListener(new C87088f(this));
        View view4 = this.f252670c;
        C87412m.m108591d(view4);
        view4.findViewById(C0966R.C0970id.hjj).setOnClickListener(new C87089g(this));
        View view5 = this.f252670c;
        C87412m.m108591d(view5);
        view5.findViewById(C0966R.C0970id.hjx).setOnClickListener(new C87090h(this));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = C11171e.m11046c(26) ? 2038 : 2002;
        layoutParams.flags = C82969i.CTRL_INDEX;
        layoutParams.format = 1;
        layoutParams.packageName = this.f252668a.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        View view6 = this.f252670c;
        if (view6 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view7 = view6;
            C117292a.m165358d(view7, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow", "show", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow", "show", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewManager viewManager = this.f252669b;
            if (viewManager != null) {
                viewManager.addView(view6, layoutParams);
            }
            view6.post(new C87091i(z, view6, this));
        }
    }
}
