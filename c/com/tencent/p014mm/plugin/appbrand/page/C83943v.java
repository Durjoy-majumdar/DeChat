package com.tencent.p014mm.plugin.appbrand.page;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import bt0.C79808b;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import go3.C87282f;
import gy3.C87412m;
import in3.C87763b;
import j20.C117292a;
import java.util.ArrayList;
import p225rc.C89917h;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;

/* renamed from: com.tencent.mm.plugin.appbrand.page.v */
public final class C83943v extends SwipeBackLayout implements DialogInterface {

    /* renamed from: A */
    public Animation f245080A;

    /* renamed from: B */
    public Animation f245081B;

    /* renamed from: C */
    public C83849m0 f245082C;

    /* renamed from: D */
    public C87763b f245083D;

    /* renamed from: E */
    public C79808b f245084E;

    /* renamed from: F */
    public ImageView f245085F;

    /* renamed from: y */
    public DialogInterface.OnClickListener f245086y;

    /* renamed from: z */
    public DialogInterface.OnClickListener f245087z;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.v$a */
    public static final class C83944a implements SwipeBackLayout.C21492c {

        /* renamed from: a */
        public final /* synthetic */ C83943v f245088a;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.v$a$a */
        public static final class C83945a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C83943v f245089d;

            public C83945a(C83943v vVar) {
                this.f245089d = vVar;
            }

            public final void run() {
                ViewParent parent = this.f245089d.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f245089d);
                }
            }
        }

        public C83944a(C83943v vVar) {
            this.f245088a = vVar;
        }

        /* renamed from: a */
        public void mo33673a(MotionEvent motionEvent) {
        }

        /* renamed from: b */
        public int mo33674b(boolean z) {
            return 1;
        }

        /* renamed from: c */
        public void mo33675c() {
        }

        /* renamed from: d */
        public void mo33676d(int i, float f) {
        }

        /* renamed from: e */
        public void mo33679e() {
            this.f245088a.setVisibility(8);
            C83943v vVar = this.f245088a;
            vVar.post(new C83945a(vVar));
        }

        /* renamed from: f */
        public void mo33677f(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.v$b */
    public static final class C83946b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C83943v f245090d;

        public C83946b(C83943v vVar) {
            this.f245090d = vVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f245090d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.v$c */
    public static final class C83947c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C83943v f245091d;

        public C83947c(C83943v vVar) {
            this.f245091d = vVar;
        }

        public final void onClick(View view) {
            AppBrandRuntime runtime;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C83849m0 m0Var = this.f245091d.f245082C;
            if (!(m0Var == null || (runtime = m0Var.getRuntime()) == null)) {
                C83231l.m102146g(runtime.f238147j, C83231l.C83235e.CLOSE);
                runtime.mo113063k();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.v$d */
    public static final class C83948d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C83943v f245092d;

        public C83948d(C83943v vVar) {
            this.f245092d = vVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            DialogInterface.OnClickListener positiveButton = this.f245092d.getPositiveButton();
            if (positiveButton != null) {
                positiveButton.onClick(this.f245092d, -1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.v$e */
    public static final class C83949e extends C87282f {

        /* renamed from: a */
        public final /* synthetic */ C83943v f245093a;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.v$e$a */
        public static final class C83950a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C83943v f245094d;

            public C83950a(C83943v vVar) {
                this.f245094d = vVar;
            }

            public final void run() {
                this.f245094d.mo116561e();
            }
        }

        public C83949e(C83943v vVar) {
            this.f245093a = vVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f245093a.setVisibility(8);
            MMHandlerThread.postToMainThread(new C83950a(this.f245093a));
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C83943v(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r8, r0)
            r0 = 0
            r7.<init>(r8, r0)
            com.tencent.p014mm.plugin.appbrand.page.C83769b5.m102908a(r7)
            com.tencent.mm.plugin.appbrand.page.v$a r1 = new com.tencent.mm.plugin.appbrand.page.v$a
            r1.<init>(r7)
            r7.mo33654a(r1)
            in3.b r1 = new in3.b
            r1.<init>(r8)
            r2 = 1
            r1.setClickable(r2)
            r3 = -1
            r1.setBackgroundColor(r3)
            r4 = 0
            r1.setWillNotDraw(r4)
            r1.mo122166H(r4)
            r1.mo122168R(r4, r2, r2)
            r7.f245083D = r1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r3, r3)
            r7.addView(r1, r2)
            in3.b r1 = r7.f245083D
            r7.setContentView(r1)
            bt0.b r1 = new bt0.b
            r1.<init>(r8)
            r1.setFullscreenMode(r4)
            com.tencent.mm.plugin.appbrand.page.v$b r2 = new com.tencent.mm.plugin.appbrand.page.v$b
            r2.<init>(r7)
            r1.setBackButtonClickListener(r2)
            com.tencent.mm.plugin.appbrand.page.v$c r2 = new com.tencent.mm.plugin.appbrand.page.v$c
            r2.<init>(r7)
            r1.setCloseButtonClickListener(r2)
            in3.b r2 = r7.f245083D
            gy3.C87412m.m108591d(r2)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            int r6 = com.tencent.p014mm.plugin.appbrand.widget.C84921b.m104660a(r8)
            r5.<init>(r3, r6)
            r2.addView(r1, r5)
            r7.f245084E = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r2 = 2131493100(0x7f0c00ec, float:1.860967E38)
            in3.b r3 = r7.f245083D
            android.view.View r1 = r1.inflate(r2, r3, r4)
            r2 = 2131297036(0x7f09030c, float:1.8212006E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131821204(0x7f110294, float:1.9275145E38)
            r2.setText(r3)
            r2 = 2131297034(0x7f09030a, float:1.8212002E38)
            android.view.View r3 = r1.findViewById(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131821203(0x7f110293, float:1.9275143E38)
            r3.setText(r4)
            in3.b r3 = r7.f245083D
            gy3.C87412m.m108591d(r3)
            r3.addView(r1)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r3 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x00a3
            r0 = r1
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
        L_0x00a3:
            if (r0 != 0) goto L_0x00a6
            goto L_0x00ac
        L_0x00a6:
            int r8 = com.tencent.p014mm.plugin.appbrand.widget.C84921b.m104660a(r8)
            r0.topMargin = r8
        L_0x00ac:
            r8 = 2131297035(0x7f09030b, float:1.8212004E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r7.f245085F = r8
            android.view.View r8 = r7.findViewById(r2)
            com.tencent.mm.plugin.appbrand.page.v$d r0 = new com.tencent.mm.plugin.appbrand.page.v$d
            r0.<init>(r7)
            r8.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83943v.<init>(android.content.Context):void");
    }

    public void cancel() {
        dismiss();
        DialogInterface.OnClickListener onClickListener = this.f245087z;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
    }

    public void dismiss() {
        Animation animation = this.f245080A;
        if (animation != null) {
            animation.cancel();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), MMFragmentActivity$$c.f318647d);
        this.f245080A = loadAnimation;
        C87412m.m108591d(loadAnimation);
        loadAnimation.setAnimationListener(new C83949e(this));
        Animation animation2 = this.f245080A;
        C87412m.m108591d(animation2);
        startAnimation(animation2);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.f245080A != null || this.f245081B != null) {
            return true;
        }
        boolean z = false;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4) {
                z = true;
            }
            if (z) {
                C89917h.m112458a(getContext());
                dismiss();
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f245080A == null && this.f245081B == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116561e() {
        /*
            r3 = this;
            android.view.animation.Animation r0 = r3.getAnimation()
            if (r0 == 0) goto L_0x0009
            r0.cancel()
        L_0x0009:
            android.view.animation.Animation r0 = r3.getAnimation()
            r1 = 0
            if (r0 == 0) goto L_0x0013
            r0.setAnimationListener(r1)
        L_0x0013:
            android.view.ViewParent r0 = r3.getParent()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x001e
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r1.removeView(r3)
        L_0x0023:
            bt0.b r0 = r3.f245084E
            if (r0 == 0) goto L_0x002a
            r0.mo109942k()
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83943v.mo116561e():void");
    }

    public final DialogInterface.OnClickListener getNegativeButton() {
        return this.f245087z;
    }

    public final DialogInterface.OnClickListener getPositiveButton() {
        return this.f245086y;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f245086y = null;
        this.f245087z = null;
        this.f245080A = null;
        this.f245081B = null;
        this.f245082C = null;
    }

    public final void setNegativeButton(DialogInterface.OnClickListener onClickListener) {
        this.f245087z = onClickListener;
    }

    public final void setPositiveButton(DialogInterface.OnClickListener onClickListener) {
        this.f245086y = onClickListener;
    }
}
