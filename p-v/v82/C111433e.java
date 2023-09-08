package v82;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import x82.C112087d;

/* renamed from: v82.e */
public final class C111433e extends RecyclerView.C16631z {

    /* renamed from: W */
    public static final /* synthetic */ int f333603W = 0;

    /* renamed from: A */
    public View f333604A;

    /* renamed from: B */
    public ImageView f333605B;

    /* renamed from: C */
    public ImageView f333606C;

    /* renamed from: D */
    public WeImageView f333607D;

    /* renamed from: E */
    public ImageView f333608E;

    /* renamed from: F */
    public TextView f333609F;

    /* renamed from: G */
    public View f333610G;

    /* renamed from: H */
    public View f333611H;

    /* renamed from: I */
    public String f333612I;

    /* renamed from: J */
    public String f333613J;

    /* renamed from: K */
    public MTimerHandler f333614K;

    /* renamed from: L */
    public C32226l<? super String, C13598b0> f333615L;

    /* renamed from: M */
    public final FrameLayout f333616M;

    /* renamed from: N */
    public boolean f333617N = true;

    /* renamed from: P */
    public View f333618P;

    /* renamed from: Q */
    public View f333619Q;

    /* renamed from: R */
    public View f333620R;

    /* renamed from: S */
    public int f333621S;

    /* renamed from: T */
    public C112087d f333622T;

    /* renamed from: U */
    public RelativeLayout f333623U;

    /* renamed from: V */
    public boolean f333624V;

    /* renamed from: z */
    public MultitalkFrameView f333625z;

    /* renamed from: v82.e$a */
    public static final class C111434a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C111433e f333626d;

        public C111434a(C111433e eVar) {
            this.f333626d = eVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C32226l<? super String, C13598b0> lVar;
            TextView textView = this.f333626d.f333609F;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.f333626d.f333611H;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder$hideUserName$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder$hideUserName$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C111433e eVar = this.f333626d;
            String str = eVar.f333612I;
            if (str != null && (lVar = eVar.f333615L) != null) {
                lVar.invoke(str);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: v82.e$b */
    public static final class C111435b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C111433e f333627d;

        public C111435b(C111433e eVar) {
            this.f333627d = eVar;
        }

        public final boolean onTimerExpired() {
            this.f333627d.mo163107B();
            return true;
        }
    }

    /* renamed from: v82.e$c */
    public static final class C111436c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C111433e f333628d;

        public C111436c(C111433e eVar) {
            this.f333628d = eVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MTimerHandler mTimerHandler = this.f333628d.f333614K;
            if (mTimerHandler != null) {
                mTimerHandler.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111433e(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.a1x);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.avatar_cell_overlay)");
        this.f333616M = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.kfm);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.talking_avatar_layout)");
        this.f333618P = findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.ev8);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.header_stub)");
        this.f333619Q = findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.edf);
        C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.footer_stub)");
        this.f333620R = findViewById4;
        this.f333621S = -1;
        this.f333625z = (MultitalkFrameView) view.findViewById(C0966R.C0970id.kft);
        this.f333604A = view.findViewById(C0966R.C0970id.goy);
        View findViewById5 = view.findViewById(C0966R.C0970id.laa);
        C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
        this.f333605B = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.h5c);
        C87412m.m108592e(findViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        this.f333606C = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(C0966R.C0970id.kay);
        C87412m.m108592e(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById7;
        View findViewById8 = view.findViewById(C0966R.C0970id.g3d);
        C87412m.m108592e(findViewById8, "null cannot be cast to non-null type android.widget.ImageView");
        this.f333608E = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(C0966R.C0970id.h4m);
        C87412m.m108592e(findViewById9, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        this.f333607D = (WeImageView) findViewById9;
        View findViewById10 = view.findViewById(C0966R.C0970id.a2k);
        C87412m.m108592e(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        this.f333609F = (TextView) findViewById10;
        this.f333611H = view.findViewById(C0966R.C0970id.a2j);
        this.f333610G = view.findViewById(C0966R.C0970id.a2a);
        this.f333623U = (RelativeLayout) view.findViewById(C0966R.C0970id.j2w);
        Context context = view.getContext();
        C87412m.m108593f(context, "itemView.context");
        this.f333622T = new C112087d(context);
    }

    /* renamed from: B */
    public final void mo163107B() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        View view = this.f333610G;
        if (!(view == null || (animate2 = view.animate()) == null)) {
            animate2.cancel();
        }
        View view2 = this.f333610G;
        if (!(view2 == null || (animate = view2.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(150)) == null)) {
            duration.setListener(new C111434a(this));
        }
        MTimerHandler mTimerHandler = this.f333614K;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f333614K;
        if (mTimerHandler2 != null) {
            mTimerHandler2.removeCallbacksAndMessages((Object) null);
        }
        MTimerHandler mTimerHandler3 = this.f333614K;
        if (mTimerHandler3 != null) {
            mTimerHandler3.quitSafely();
        }
    }

    /* renamed from: C */
    public final void mo163108C(View view, int i, int i2, boolean z) {
        Bitmap createBitmap;
        C87412m.m108594g(view, "centerView");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2, 17);
        if (z) {
            FrameLayout frameLayout = new FrameLayout(this.f44854d.getContext());
            MultitalkFrameView multitalkFrameView = this.f333625z;
            boolean z2 = false;
            if (!(multitalkFrameView == null || (createBitmap = BitmapUtil.createBitmap(this.f333616M.getWidth() / 4, this.f333616M.getHeight() / 4, Bitmap.Config.ARGB_8888)) == null)) {
                try {
                    new Canvas(createBitmap).drawColor(-16777216);
                    MultitalkFrameView.C105887a elementPrev = multitalkFrameView.getElementPrev();
                    C13598b0 b0Var = null;
                    if (!(elementPrev.f314997a != null)) {
                        elementPrev = null;
                    }
                    if (elementPrev != null) {
                        String str = this.f333612I;
                        C87412m.m108591d(str);
                        Bitmap bitmap = elementPrev.f314997a;
                        C87412m.m108591d(bitmap);
                        multitalkFrameView.mo150771a(str, bitmap, 0, 0);
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f44854d.getResources(), BitmapUtil.fastblur(createBitmap, 10));
                        bitmapDrawable.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
                        frameLayout.setBackground(bitmapDrawable);
                        z2 = true;
                    }
                } catch (Exception e) {
                    Log.m105920e("AvatarLayoutHolder", e.getMessage() + ' ' + C13598b0.f38549a);
                }
            }
            if (!z2) {
                frameLayout.setBackgroundColor(this.f44854d.getResources().getColor(C0966R.color.a6f));
            }
            frameLayout.addView(view, layoutParams);
            this.f333616M.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        this.f333616M.addView(view, layoutParams);
    }

    /* renamed from: D */
    public final void mo163109D(boolean z, boolean z2) {
        int i = this.f333621S;
        if (i != 3) {
            if (z && i == 2) {
                return;
            }
            if (z || i == -1) {
                Object systemService = this.f44854d.getContext().getSystemService("layout_inflater");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(C0966R.C0971layout.bhb, this.f333616M, false);
                C87412m.m108593f(inflate, "getLayoutInflater().infl…im, avatarOverlay, false)");
                View findViewById = inflate.findViewById(C0966R.C0970id.f358794h43);
                C87412m.m108593f(findViewById, "center.findViewById(R.id…ltitalk_center_info_anim)");
                ImageView imageView = (ImageView) findViewById;
                if (!z || !z2) {
                    ((TextView) inflate.findViewById(C0966R.C0970id.h44)).setVisibility(8);
                }
                mo163108C(inflate, -2, -2, true);
                if (imageView.getBackground() instanceof AnimationDrawable) {
                    Drawable background = imageView.getBackground();
                    C87412m.m108592e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((AnimationDrawable) background).start();
                }
                if (z) {
                    this.f333621S = 2;
                } else {
                    this.f333621S = 1;
                }
            }
        }
    }

    /* renamed from: E */
    public final void mo163110E(int i) {
        WeImageView weImageView = this.f333607D;
        if (weImageView != null) {
            weImageView.setImageDrawable(C74933u4.m89768e(this.f44854d.getContext(), C0966R.raw.icon_filled_mike_off, -65536));
        }
        WeImageView weImageView2 = this.f333607D;
        if (weImageView2 != null) {
            weImageView2.setIconColor(this.f44854d.getContext().getResources().getColor(C0966R.color.a_0));
        }
        MultitalkFrameView multitalkFrameView = this.f333625z;
        if (multitalkFrameView != null) {
            multitalkFrameView.setTag(C0966R.C0970id.kec, Boolean.valueOf(i == 0));
        }
        ((RelativeLayout) this.f44854d.findViewById(C0966R.C0970id.h4l)).setBackground(C74933u4.m89768e(this.f44854d.getContext(), C0966R.C0969drawable.ai5, this.f44854d.getContext().getResources().getColor(C0966R.color.f2975b6)));
        ((RelativeLayout) this.f44854d.findViewById(C0966R.C0970id.h4l)).setVisibility(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163111F(int r14) {
        /*
            r13 = this;
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.a r0 = r0.mo150670m()
            boolean r0 = r0.mo150708j()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003f
            if (r14 != 0) goto L_0x003f
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r14 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.lang.String r0 = r13.f333613J
            r14.mo150636M(r0)
            r13.mo163107B()
            r13.f333624V = r2
            android.widget.RelativeLayout r14 = r13.f333623U
            if (r14 != 0) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            r14.setVisibility(r1)
        L_0x0028:
            android.widget.RelativeLayout r14 = r13.f333623U
            if (r14 == 0) goto L_0x0036
            r14.removeAllViews()
            x82.d r0 = r13.f333622T
            if (r0 == 0) goto L_0x0036
            r0.mo163789a(r14)
        L_0x0036:
            x82.d r14 = r13.f333622T
            if (r14 == 0) goto L_0x017a
            r14.mo163790b()
            goto L_0x017a
        L_0x003f:
            r0 = 0
            r3 = 8
            java.lang.String r4 = "AvatarLayoutHolder"
            if (r14 != 0) goto L_0x0122
            boolean r5 = r13.f333624V
            if (r5 != 0) goto L_0x0122
            java.lang.String r5 = r13.f333613J
            if (r5 != 0) goto L_0x004f
            goto L_0x0063
        L_0x004f:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r6 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            r6.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r8 = r6.f314490Y
            r7.<init>(r8)
            boolean r8 = r7.contains(r5)
            if (r8 == 0) goto L_0x0065
        L_0x0063:
            r5 = 1
            goto L_0x0070
        L_0x0065:
            r7.add(r5)
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            r5.<init>(r7)
            r6.f314490Y = r5
            r5 = 0
        L_0x0070:
            if (r5 != 0) goto L_0x0122
            java.lang.String r14 = "showScreenCastIcon visible first times"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            r13.mo163107B()
            r13.f333624V = r2
            android.widget.RelativeLayout r14 = r13.f333623U
            if (r14 != 0) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r14.setVisibility(r1)
        L_0x0084:
            android.widget.RelativeLayout r14 = r13.f333623U
            if (r14 == 0) goto L_0x0092
            r14.removeAllViews()
            x82.d r2 = r13.f333622T
            if (r2 == 0) goto L_0x0092
            r2.mo163789a(r14)
        L_0x0092:
            x82.d r14 = r13.f333622T
            if (r14 == 0) goto L_0x017a
            r14.f335581h = r1
            com.tencent.mm.sdk.platformtools.MMHandler r2 = new com.tencent.mm.sdk.platformtools.MMHandler
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ScreenAvatarNavAnimatorUI_Hide"
            r4.append(r5)
            int r5 = r14.hashCode()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>((java.lang.String) r4)
            r14.f335577d = r2
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r14.f335575b
            if (r2 != 0) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            r2.setVisibility(r1)
        L_0x00bc:
            android.widget.TextView r2 = r14.f335579f
            if (r2 != 0) goto L_0x00c1
            goto L_0x00c4
        L_0x00c1:
            r2.setVisibility(r1)
        L_0x00c4:
            android.view.View r2 = r14.f335576c
            if (r2 != 0) goto L_0x00c9
            goto L_0x0107
        L_0x00c9:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI"
            java.lang.String r7 = "showScreenAvatarNav"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r12.mo10231a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r5 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI"
            java.lang.String r6 = "showScreenAvatarNav"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0107:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r14.f335580g
            if (r1 != 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r1.setVisibility(r3)
        L_0x010f:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r14.f335577d
            if (r1 == 0) goto L_0x0116
            r1.removeCallbacksAndMessages(r0)
        L_0x0116:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f335577d
            if (r0 == 0) goto L_0x017a
            java.lang.Runnable r14 = r14.f335584k
            r1 = 5000(0x1388, double:2.4703E-320)
            r0.postUIDelayed(r14, r1)
            goto L_0x017a
        L_0x0122:
            if (r14 != 0) goto L_0x0142
            java.lang.String r0 = "showScreenCastIcon invisible cause VISIBLE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r13.mo163107B()
            android.widget.RelativeLayout r0 = r13.f333623U
            if (r0 == 0) goto L_0x013a
            r0.removeAllViews()
            x82.d r1 = r13.f333622T
            if (r1 == 0) goto L_0x013a
            r1.mo163789a(r0)
        L_0x013a:
            x82.d r0 = r13.f333622T
            if (r0 == 0) goto L_0x017a
            r0.mo163791c(r14)
            goto L_0x017a
        L_0x0142:
            java.lang.String r14 = "showScreenCastIcon invisible cause INVISIBLE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            android.widget.RelativeLayout r14 = r13.f333623U
            if (r14 != 0) goto L_0x014c
            goto L_0x014f
        L_0x014c:
            r14.setVisibility(r3)
        L_0x014f:
            x82.d r14 = r13.f333622T
            if (r14 == 0) goto L_0x017a
            r14.f335581h = r2
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r14.f335577d
            if (r1 == 0) goto L_0x015e
            java.lang.Runnable r2 = r14.f335584k
            r1.removeCallbacks(r2)
        L_0x015e:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r14.f335577d
            if (r1 == 0) goto L_0x0165
            r1.removeCallbacksAndMessages(r0)
        L_0x0165:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r14.f335577d
            if (r0 == 0) goto L_0x016c
            r0.quitSafely()
        L_0x016c:
            android.view.View r0 = r14.f335576c
            if (r0 == 0) goto L_0x0173
            r0.clearAnimation()
        L_0x0173:
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = r14.f335575b
            if (r14 == 0) goto L_0x017a
            r14.clearAnimation()
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111433e.mo163111F(int):void");
    }

    /* renamed from: G */
    public final void mo163112G(C32226l<? super String, C13598b0> lVar, boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        TextView textView = this.f333609F;
        if (textView != null && textView.getVisibility() == 8) {
            this.f333615L = lVar;
            TextView textView2 = this.f333609F;
            if (textView2 != null) {
                textView2.setText(this.f333612I);
            }
            View view = this.f333610G;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view3 = this.f333611H;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView3 = this.f333609F;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            MTimerHandler mTimerHandler = this.f333614K;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            MTimerHandler mTimerHandler2 = this.f333614K;
            if (mTimerHandler2 != null) {
                mTimerHandler2.removeCallbacksAndMessages((Object) null);
            }
            MTimerHandler mTimerHandler3 = this.f333614K;
            if (mTimerHandler3 != null) {
                mTimerHandler3.quitSafely();
            }
            this.f333614K = new MTimerHandler(new C111435b(this), false);
            View view5 = this.f333610G;
            if (!(view5 == null || (animate2 = view5.animate()) == null)) {
                animate2.cancel();
            }
            View view6 = this.f333610G;
            if (view6 != null && (animate = view6.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(150)) != null) {
                duration.setListener(new C111436c(this));
                return;
            }
            return;
        }
        mo163107B();
    }

    /* renamed from: y */
    public final void mo163113y() {
        int i = this.f333621S;
        if (i == 2 || i == 1) {
            mo163114z(true);
        }
        this.f333616M.removeAllViews();
        this.f333621S = -1;
    }

    /* renamed from: z */
    public final void mo163114z(boolean z) {
        if (z || this.f333621S != 2) {
            int i = this.f333621S;
            if ((i == 1 || i == 2) && this.f333616M.getChildCount() == 1) {
                View childAt = this.f333616M.getChildAt(0);
                C87412m.m108593f(childAt, "avatarOverlay.getChildAt(0)");
                ImageView imageView = (ImageView) childAt.findViewById(C0966R.C0970id.f358794h43);
                if ((imageView != null ? imageView.getBackground() : null) instanceof AnimationDrawable) {
                    Drawable background = imageView.getBackground();
                    C87412m.m108592e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((AnimationDrawable) background).stop();
                }
                this.f333616M.removeViewAt(0);
                this.f333621S = -1;
            }
        }
    }
}
