package x82;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.p475ui.C71599n0;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import kg3.C76577a;
import p196ln.C76705f;
import v82.C111418b0;
import zt3.C119157j;

/* renamed from: x82.l */
public final class C112102l {

    /* renamed from: a */
    public RelativeLayout f335629a;

    /* renamed from: b */
    public C112075a f335630b;

    /* renamed from: c */
    public VoIPRenderTextureView f335631c;

    /* renamed from: d */
    public ImageView f335632d;

    /* renamed from: e */
    public int f335633e;

    /* renamed from: f */
    public Paint f335634f;

    /* renamed from: g */
    public String f335635g;

    /* renamed from: h */
    public String f335636h;

    /* renamed from: i */
    public Long f335637i;

    /* renamed from: j */
    public Context f335638j;

    /* renamed from: k */
    public ImageView f335639k;

    /* renamed from: l */
    public View f335640l;

    /* renamed from: m */
    public RelativeLayout f335641m;

    /* renamed from: n */
    public boolean f335642n;

    /* renamed from: x82.l$a */
    public static final class C112103a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112102l f335643d;

        /* renamed from: e */
        public final /* synthetic */ String f335644e;

        /* renamed from: x82.l$a$a */
        public static final class C112104a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ C112102l f335645d;

            /* renamed from: e */
            public final /* synthetic */ String f335646e;

            public C112104a(C112102l lVar, String str) {
                this.f335645d = lVar;
                this.f335646e = str;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                VoIPRenderTextureView voIPRenderTextureView = this.f335645d.f335631c;
                if (voIPRenderTextureView != null) {
                    voIPRenderTextureView.setVisibility(8);
                }
                C112102l lVar = this.f335645d;
                lVar.f335642n = false;
                ImageView imageView = lVar.f335632d;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.f335645d.f335632d;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                RelativeLayout relativeLayout = this.f335645d.f335629a;
                StringBuilder sb = new StringBuilder();
                Context context = this.f335645d.f335638j;
                sb.append(context != null ? context.getString(C0966R.string.bcm) : null);
                sb.append(',');
                sb.append(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f335646e).getNickname());
                relativeLayout.setContentDescription(sb.toString());
            }
        }

        /* renamed from: x82.l$a$b */
        public static final class C112105b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112102l f335647d;

            public C112105b(C112102l lVar) {
                this.f335647d = lVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                r0 = r0.animate();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r3 = this;
                    x82.l r0 = r3.f335647d
                    android.widget.ImageView r0 = r0.f335632d
                    if (r0 != 0) goto L_0x0007
                    goto L_0x000b
                L_0x0007:
                    r1 = 0
                    r0.setAlpha(r1)
                L_0x000b:
                    x82.l r0 = r3.f335647d
                    android.widget.ImageView r0 = r0.f335632d
                    if (r0 == 0) goto L_0x001e
                    android.view.ViewPropertyAnimator r0 = r0.animate()
                    if (r0 == 0) goto L_0x001e
                    r1 = 1065353216(0x3f800000, float:1.0)
                    android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
                    goto L_0x001f
                L_0x001e:
                    r0 = 0
                L_0x001f:
                    if (r0 != 0) goto L_0x0022
                    goto L_0x0027
                L_0x0022:
                    r1 = 300(0x12c, double:1.48E-321)
                    r0.setDuration(r1)
                L_0x0027:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: x82.C112102l.C112103a.C112105b.run():void");
            }
        }

        public C112103a(C112102l lVar, String str) {
            this.f335643d = lVar;
            this.f335644e = str;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator listener;
            VoIPRenderTextureView voIPRenderTextureView = this.f335643d.f335631c;
            if (voIPRenderTextureView != null && (animate = voIPRenderTextureView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(300)) != null && (listener = duration.setListener(new C112104a(this.f335643d, this.f335644e))) != null) {
                listener.withStartAction(new C112105b(this.f335643d));
            }
        }
    }

    /* renamed from: x82.l$b */
    public static final class C112106b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112102l f335648d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f335649e;

        /* renamed from: f */
        public final /* synthetic */ int f335650f;

        /* renamed from: g */
        public final /* synthetic */ int f335651g;

        /* renamed from: h */
        public final /* synthetic */ String f335652h;

        /* renamed from: x82.l$b$a */
        public static final class C112107a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ C112102l f335653d;

            /* renamed from: e */
            public final /* synthetic */ String f335654e;

            public C112107a(C112102l lVar, String str) {
                this.f335653d = lVar;
                this.f335654e = str;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                ImageView imageView = this.f335653d.f335632d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                C112102l lVar = this.f335653d;
                lVar.f335642n = false;
                VoIPRenderTextureView voIPRenderTextureView = lVar.f335631c;
                if (voIPRenderTextureView != null) {
                    voIPRenderTextureView.setAlpha(1.0f);
                }
                VoIPRenderTextureView voIPRenderTextureView2 = this.f335653d.f335631c;
                if (voIPRenderTextureView2 != null) {
                    voIPRenderTextureView2.setVisibility(0);
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                RelativeLayout relativeLayout = this.f335653d.f335629a;
                StringBuilder sb = new StringBuilder();
                Context context = this.f335653d.f335638j;
                sb.append(context != null ? context.getString(C0966R.string.bcm) : null);
                sb.append(',');
                sb.append(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f335654e).getNickname());
                relativeLayout.setContentDescription(sb.toString());
            }
        }

        /* renamed from: x82.l$b$b */
        public static final class C112108b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112102l f335655d;

            public C112108b(C112102l lVar) {
                this.f335655d = lVar;
            }

            public final void run() {
                ViewPropertyAnimator animate;
                ViewPropertyAnimator alpha;
                ViewPropertyAnimator duration;
                VoIPRenderTextureView voIPRenderTextureView = this.f335655d.f335631c;
                if (voIPRenderTextureView != null) {
                    voIPRenderTextureView.setAlpha(0.0f);
                }
                VoIPRenderTextureView voIPRenderTextureView2 = this.f335655d.f335631c;
                if (voIPRenderTextureView2 != null && (animate = voIPRenderTextureView2.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(300)) != null) {
                    duration.start();
                }
            }
        }

        public C112106b(C112102l lVar, Bitmap bitmap, int i, int i2, String str) {
            this.f335648d = lVar;
            this.f335649e = bitmap;
            this.f335650f = i;
            this.f335651g = i2;
            this.f335652h = str;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator listener;
            ViewPropertyAnimator withStartAction;
            ImageView imageView = this.f335648d.f335632d;
            if (!(imageView == null || (animate = imageView.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300)) == null || (listener = duration.setListener(new C112107a(this.f335648d, this.f335652h))) == null || (withStartAction = listener.withStartAction(new C112108b(this.f335648d))) == null)) {
                withStartAction.start();
            }
            this.f335648d.mo163819e(this.f335649e, this.f335650f, this.f335651g, 1);
        }
    }

    public C112102l(RelativeLayout relativeLayout, C112075a aVar) {
        C87412m.m108594g(relativeLayout, "rootView");
        C87412m.m108594g(aVar, "statusManager");
        this.f335629a = relativeLayout;
        this.f335630b = aVar;
        float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 2);
        Context context = this.f335629a.getContext();
        this.f335638j = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bhp, this.f335629a);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate;
        this.f335641m = relativeLayout2;
        relativeLayout2.setClipToOutline(true);
        RelativeLayout relativeLayout3 = this.f335641m;
        if (relativeLayout3 != null) {
            relativeLayout3.setOutlineProvider(new C71599n0(b));
        }
        RelativeLayout relativeLayout4 = this.f335641m;
        View view = null;
        VoIPRenderTextureView voIPRenderTextureView = relativeLayout4 != null ? (VoIPRenderTextureView) relativeLayout4.findViewById(C0966R.C0970id.f358799h51) : null;
        this.f335631c = voIPRenderTextureView;
        if (voIPRenderTextureView != null) {
            voIPRenderTextureView.setClipToOutline(true);
        }
        VoIPRenderTextureView voIPRenderTextureView2 = this.f335631c;
        if (voIPRenderTextureView2 != null) {
            voIPRenderTextureView2.setOutlineProvider(new C71599n0(b));
        }
        Paint paint = new Paint();
        this.f335634f = paint;
        paint.setColor(-16777216);
        Paint paint2 = this.f335634f;
        if (paint2 != null) {
            paint2.setFilterBitmap(true);
        }
        Paint paint3 = this.f335634f;
        if (paint3 != null) {
            paint3.setTextSize(40.0f);
        }
        RelativeLayout relativeLayout5 = this.f335641m;
        this.f335632d = relativeLayout5 != null ? (ImageView) relativeLayout5.findViewById(C0966R.C0970id.f357479a22) : null;
        RelativeLayout relativeLayout6 = this.f335641m;
        this.f335639k = relativeLayout6 != null ? (ImageView) relativeLayout6.findViewById(C0966R.C0970id.laa) : null;
        RelativeLayout relativeLayout7 = this.f335641m;
        this.f335640l = relativeLayout7 != null ? relativeLayout7.findViewById(C0966R.C0970id.lab) : view;
    }

    /* renamed from: a */
    public final void mo163815a(int i) {
        RelativeLayout relativeLayout;
        String str;
        if (this.f335630b.mo163770a() == 0 && (relativeLayout = this.f335641m) != null) {
            if (i != 180) {
                if (i == 0) {
                    ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.removeRule(21);
                    layoutParams2.removeRule(20);
                    layoutParams2.removeRule(10);
                    layoutParams2.removeRule(12);
                    layoutParams2.addRule(10, -1);
                    layoutParams2.addRule(21, -1);
                    relativeLayout.setLayoutParams(layoutParams2);
                    relativeLayout.requestLayout();
                    View view = this.f335640l;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                        layoutParams4.removeRule(21);
                        layoutParams4.removeRule(20);
                        layoutParams4.removeRule(10);
                        layoutParams4.removeRule(12);
                        layoutParams4.addRule(12, -1);
                        layoutParams4.addRule(21, -1);
                        layoutParams4.setMarginEnd(C111418b0.f333542c / 2);
                        view.setLayoutParams(layoutParams4);
                        view.requestLayout();
                    }
                    if (this.f335630b.mo163770a() == 0) {
                        RelativeLayout relativeLayout2 = this.f335629a;
                        ViewGroup.LayoutParams layoutParams5 = relativeLayout2.getLayoutParams();
                        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                        layoutParams6.removeRule(21);
                        layoutParams6.removeRule(20);
                        layoutParams6.removeRule(10);
                        layoutParams6.removeRule(12);
                        layoutParams6.addRule(21, -1);
                        layoutParams6.addRule(10, -1);
                        layoutParams6.bottomMargin = 0;
                        layoutParams6.setMarginEnd(C111418b0.f333545f);
                        relativeLayout2.setLayoutParams(layoutParams6);
                        relativeLayout2.requestLayout();
                    }
                } else if (i == 90) {
                    ViewGroup.LayoutParams layoutParams7 = relativeLayout.getLayoutParams();
                    C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
                    layoutParams8.removeRule(21);
                    layoutParams8.removeRule(20);
                    layoutParams8.removeRule(10);
                    layoutParams8.removeRule(12);
                    layoutParams8.addRule(20, -1);
                    layoutParams8.addRule(10, -1);
                    relativeLayout.setLayoutParams(layoutParams8);
                    relativeLayout.requestLayout();
                    View view2 = this.f335640l;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams9 = view2.getLayoutParams();
                        C87412m.m108592e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) layoutParams9;
                        layoutParams10.removeRule(21);
                        layoutParams10.removeRule(20);
                        layoutParams10.removeRule(10);
                        layoutParams10.removeRule(12);
                        layoutParams10.addRule(10, -1);
                        layoutParams10.addRule(21, -1);
                        layoutParams10.setMarginEnd(C111418b0.f333542c / 2);
                        view2.setLayoutParams(layoutParams10);
                        view2.requestLayout();
                    }
                    if (this.f335630b.mo163770a() == 0) {
                        RelativeLayout relativeLayout3 = this.f335629a;
                        ViewGroup.LayoutParams layoutParams11 = relativeLayout3.getLayoutParams();
                        C87412m.m108592e(layoutParams11, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) layoutParams11;
                        layoutParams12.removeRule(21);
                        layoutParams12.removeRule(20);
                        layoutParams12.removeRule(10);
                        layoutParams12.removeRule(12);
                        layoutParams12.setMarginStart(C111418b0.f333545f);
                        layoutParams12.bottomMargin = 0;
                        layoutParams12.addRule(20, -1);
                        layoutParams12.addRule(10, -1);
                        relativeLayout3.setLayoutParams(layoutParams12);
                        relativeLayout3.requestLayout();
                    }
                } else if (i == 270) {
                    ViewGroup.LayoutParams layoutParams13 = relativeLayout.getLayoutParams();
                    C87412m.m108592e(layoutParams13, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) layoutParams13;
                    layoutParams14.removeRule(21);
                    layoutParams14.removeRule(20);
                    layoutParams14.removeRule(10);
                    layoutParams14.removeRule(12);
                    layoutParams14.addRule(21, -1);
                    layoutParams14.addRule(12, -1);
                    relativeLayout.setLayoutParams(layoutParams14);
                    relativeLayout.requestLayout();
                    if (this.f335630b.mo163770a() == 0) {
                        RelativeLayout relativeLayout4 = this.f335629a;
                        ViewGroup.LayoutParams layoutParams15 = relativeLayout4.getLayoutParams();
                        C87412m.m108592e(layoutParams15, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) layoutParams15;
                        layoutParams16.removeRule(21);
                        layoutParams16.removeRule(20);
                        layoutParams16.removeRule(10);
                        layoutParams16.removeRule(12);
                        layoutParams16.bottomMargin = C111418b0.f333553n;
                        layoutParams16.addRule(21, -1);
                        layoutParams16.addRule(12, -1);
                        relativeLayout4.setLayoutParams(layoutParams16);
                        relativeLayout4.requestLayout();
                    }
                    View view3 = this.f335640l;
                    if (view3 != null) {
                        ViewGroup.LayoutParams layoutParams17 = view3.getLayoutParams();
                        C87412m.m108592e(layoutParams17, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams18 = (RelativeLayout.LayoutParams) layoutParams17;
                        layoutParams18.removeRule(21);
                        layoutParams18.removeRule(20);
                        layoutParams18.removeRule(10);
                        layoutParams18.removeRule(12);
                        layoutParams18.addRule(12, -1);
                        layoutParams18.addRule(20, -1);
                        layoutParams18.setMarginStart(C111418b0.f333542c / 2);
                        view3.setLayoutParams(layoutParams18);
                        view3.requestLayout();
                    }
                }
            }
            if (!(this.f335633e == 1 || (str = this.f335635g) == null)) {
                mo163818d(str);
            }
            if (i != 180) {
                ImageView imageView = this.f335632d;
                if (imageView != null) {
                    imageView.setRotation(((float) v2helper.VOIP_ENC_HEIGHT_LV1) - ((float) i));
                }
                ImageView imageView2 = this.f335639k;
                if (imageView2 != null) {
                    imageView2.setRotation(((float) v2helper.VOIP_ENC_HEIGHT_LV1) - ((float) i));
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo163816b(String str) {
        Log.m105925i("MicroMsg.ScreenProjectAvatarCellLayout", "changeRenderAnimation %s ", str);
        if (C87412m.m108589b(this.f335636h, str) || this.f335631c == null || this.f335633e == 0) {
            return false;
        }
        this.f335637i = str == null ? null : Long.valueOf(Util.currentTicks());
        this.f335635g = str;
        this.f335636h = str;
        this.f335642n = true;
        ((C119157j) C119157j.f356862d).mo183895z(new C112103a(this, str));
        this.f335633e = 0;
        return true;
    }

    /* renamed from: c */
    public final boolean mo163817c(String str, Bitmap bitmap, int i, int i2, int i3) {
        Log.m105925i("MicroMsg.ScreenProjectAvatarCellLayout", "changeRenderAnimation %s and target is %s", str, Integer.valueOf(i3));
        if (C87412m.m108589b(this.f335636h, str) || this.f335631c == null || this.f335633e == 1) {
            return false;
        }
        this.f335637i = str == null ? null : Long.valueOf(Util.currentTicks());
        this.f335635g = str;
        this.f335636h = str;
        this.f335642n = true;
        ((C119157j) C119157j.f356862d).mo183895z(new C112106b(this, bitmap, i, i2, str));
        return true;
    }

    /* renamed from: d */
    public final synchronized boolean mo163818d(String str) {
        C87412m.m108594g(str, "userName");
        if (this.f335631c == null) {
            Log.m105920e("MicroMsg.ScreenProjectAvatarCellLayout", "drawAvatar view is null");
            return false;
        } else if (this.f335642n) {
            Log.m105920e("MicroMsg.ScreenProjectAvatarCellLayout", "renderVideoBitmap img false cause isDoingAnimationChange");
            return false;
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).zv0(this.f335632d, str);
            if (!mo163816b(str)) {
                ImageView imageView = this.f335632d;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                VoIPRenderTextureView voIPRenderTextureView = this.f335631c;
                if (voIPRenderTextureView != null) {
                    voIPRenderTextureView.setVisibility(8);
                }
                ((C119157j) C119157j.f356862d).mo183895z(new C112109m(this, str));
            }
            return true;
        }
    }

    /* renamed from: e */
    public final synchronized void mo163819e(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                VoIPRenderTextureView voIPRenderTextureView = this.f335631c;
                if (voIPRenderTextureView != null) {
                    Canvas lockCanvas = voIPRenderTextureView.lockCanvas((Rect) null);
                    if (lockCanvas == null) {
                        Log.m105920e("MicroMsg.ScreenProjectAvatarCellLayout", "getCanvasError");
                        return;
                    }
                    Matrix matrix = new Matrix();
                    int b = this.f335630b.mo163771b();
                    if (i3 == 1) {
                        if (b == 90 || b == 270) {
                            int i4 = OpenGlRender.f318118B;
                            if (i == 12) {
                                matrix.setRotate(-90.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                            } else if (i == 4) {
                                matrix.setRotate(-270.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                            }
                        } else {
                            int i5 = OpenGlRender.f318118B;
                            if (i == 12) {
                                matrix.setRotate(270.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                            } else if (i == 4) {
                                matrix.setRotate(90.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                            }
                        }
                    } else if (this.f335630b.mo163770a() == 0) {
                        matrix.setRotate(((float) v2helper.VOIP_ENC_HEIGHT_LV1) - ((float) b), ((float) width) / 2.0f, ((float) height) / 2.0f);
                    }
                    int i6 = OpenGlRender.f318118B;
                    if (i2 == 16) {
                        matrix.postScale(-1.0f, 1.0f);
                        matrix.postTranslate((float) width, 0.0f);
                    }
                    matrix.postScale(((float) lockCanvas.getWidth()) / ((float) height), ((float) lockCanvas.getHeight()) / ((float) width));
                    lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    if (!bitmap.isRecycled()) {
                        try {
                            lockCanvas.drawBitmap(bitmap, matrix, this.f335634f);
                            this.f335633e = i3;
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.ScreenProjectAvatarCellLayout", "draw bitmap error");
                        }
                    }
                    try {
                        VoIPRenderTextureView voIPRenderTextureView2 = this.f335631c;
                        if (voIPRenderTextureView2 != null) {
                            voIPRenderTextureView2.unlockCanvasAndPost(lockCanvas);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ScreenProjectAvatarCellLayout", e, "drawBitmap unlockCanvasAndPost crash", new Object[0]);
                    }
                } else {
                    return;
                }
            }
        }
        Log.m105920e("MicroMsg.ScreenProjectAvatarCellLayout", "DrawBitmap, bitmap is null or recycled");
        C115669n.INSTANCE.idkeyStat(220, 27, 1, false);
        return;
    }

    /* renamed from: f */
    public final void mo163820f() {
        if (this.f335630b.mo163771b() == 90 || this.f335630b.mo163771b() == 270) {
            RelativeLayout relativeLayout = this.f335629a;
            int i = C111418b0.f333555p;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            if (this.f335630b.mo163773d()) {
                layoutParams.setMarginEnd(C111418b0.f333553n);
            } else {
                layoutParams.setMarginEnd(C111418b0.f333545f);
            }
            layoutParams.addRule(21);
            relativeLayout.setLayoutParams(layoutParams);
        }
    }
}
