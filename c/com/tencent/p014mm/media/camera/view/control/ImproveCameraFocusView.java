package com.tencent.p014mm.media.camera.view.control;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53965x0;
import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import j80.C108655d;
import j80.C60780c;
import java.util.concurrent.CancellationException;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB%\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001eJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/view/control/ImproveCameraFocusView;", "Landroid/view/View;", "Lj80/d;", "Lrx3/l;", "", "getLineHeight", "", "color", "Lrx3/b0;", "setFocusColor", "orientation", "setOrientation", "o", "I", "getViewWidth", "()I", "setViewWidth", "(I)V", "viewWidth", "p", "getViewHeight", "setViewHeight", "viewHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.view.control.ImproveCameraFocusView */
public final class ImproveCameraFocusView extends View implements C108655d {

    /* renamed from: A */
    public ValueAnimator f157395A;

    /* renamed from: B */
    public boolean f157396B;

    /* renamed from: C */
    public int f157397C;

    /* renamed from: d */
    public int f157398d = Color.parseColor("#FFFFFFFF");

    /* renamed from: e */
    public final Paint f157399e = new Paint();

    /* renamed from: f */
    public boolean f157400f;

    /* renamed from: g */
    public boolean f157401g;

    /* renamed from: h */
    public boolean f157402h;

    /* renamed from: i */
    public boolean f157403i;

    /* renamed from: j */
    public long f157404j;

    /* renamed from: n */
    public long f157405n;

    /* renamed from: o */
    public int f157406o;

    /* renamed from: p */
    public int f157407p;

    /* renamed from: q */
    public int f157408q;

    /* renamed from: r */
    public int f157409r;

    /* renamed from: s */
    public int f157410s;

    /* renamed from: t */
    public boolean f157411t;

    /* renamed from: u */
    public float f157412u;

    /* renamed from: v */
    public float f157413v;

    /* renamed from: w */
    public boolean f157414w;

    /* renamed from: x */
    public boolean f157415x;

    /* renamed from: y */
    public final C0000n0 f157416y = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: z */
    public C53973z1 f157417z;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.view.control.ImproveCameraFocusView$launchJob$1", mo125469f = "ImproveCameraFocusView.kt", mo125470l = {445, 446}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.media.camera.view.control.ImproveCameraFocusView$a */
    public static final class C55264a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f157418d;

        /* renamed from: e */
        public final /* synthetic */ ImproveCameraFocusView f157419e;

        @C91590f(mo125468c = "com.tencent.mm.media.camera.view.control.ImproveCameraFocusView$launchJob$1$1", mo125469f = "ImproveCameraFocusView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.media.camera.view.control.ImproveCameraFocusView$a$a */
        public static final class C55265a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImproveCameraFocusView f157420d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55265a(ImproveCameraFocusView improveCameraFocusView, C15601d<? super C55265a> dVar) {
                super(2, dVar);
                this.f157420d = improveCameraFocusView;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C55265a(this.f157420d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C55265a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                ImproveCameraFocusView improveCameraFocusView = this.f157420d;
                improveCameraFocusView.f157411t = false;
                improveCameraFocusView.invalidate();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55264a(ImproveCameraFocusView improveCameraFocusView, C15601d<? super C55264a> dVar) {
            super(2, dVar);
            this.f157419e = improveCameraFocusView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55264a(this.f157419e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55264a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f157418d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f157418d = 1;
                if (C53965x0.m60607b(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C55265a aVar2 = new C55265a(this.f157419e, (C15601d<? super C55265a>) null);
            this.f157418d = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.media.camera.view.control.ImproveCameraFocusView$b */
    public static final class C55266b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraFocusView f157421d;

        /* renamed from: e */
        public final /* synthetic */ float f157422e;

        /* renamed from: f */
        public final /* synthetic */ float f157423f;

        public C55266b(ImproveCameraFocusView improveCameraFocusView, float f, float f2) {
            this.f157421d = improveCameraFocusView;
            this.f157422e = f;
            this.f157423f = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f157421d.f157413v = this.f157422e + (this.f157423f * floatValue);
            Log.m105918d("MicroMsg.ImproveCameraFocusView", "move ani " + floatValue + ' ' + this.f157423f + ' ' + this.f157421d.f157413v + ' ' + Thread.currentThread().getName() + ' ' + this.f157422e);
            this.f157421d.postInvalidate();
        }
    }

    /* renamed from: com.tencent.mm.media.camera.view.control.ImproveCameraFocusView$c */
    public static final class C55267c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraFocusView f157424d;

        /* renamed from: e */
        public final /* synthetic */ C60780c f157425e;

        public C55267c(ImproveCameraFocusView improveCameraFocusView, C60780c cVar) {
            this.f157424d = improveCameraFocusView;
            this.f157425e = cVar;
        }

        public void onAnimationEnd(Animator animator, boolean z) {
            C60780c cVar;
            Log.m105924i("MicroMsg.ImproveCameraFocusView", "move ani is finish " + Thread.currentThread().getName());
            if (!(this.f157424d.f157395A == null || (cVar = this.f157425e) == null)) {
                cVar.mo85715a(true);
            }
            this.f157424d.f157414w = false;
        }
    }

    public ImproveCameraFocusView(Context context) {
        super(context);
    }

    private final C13604l<Float, Float> getLineHeight() {
        int i = this.f157397C;
        if (i == 90 || i == 270) {
            float f = this.f157412u;
            float f2 = this.f157413v;
            return new C13604l<>(Float.valueOf(f - f2), Float.valueOf(f + f2));
        }
        float f3 = this.f157412u;
        float f4 = this.f157413v;
        return new C13604l<>(Float.valueOf(f3 + f4), Float.valueOf(f3 - f4));
    }

    /* renamed from: a */
    public void mo76563a(float f, float f2, boolean z) {
        Log.m105924i("MicroMsg.ImproveCameraFocusView", "doAnimation >> " + f + ", " + f2 + ", " + z);
        reset();
        this.f157396B = z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.m105920e("MicroMsg.ImproveCameraFocusView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f) - (this.f157406o / 2);
        marginLayoutParams.topMargin = ((int) f2) - (this.f157407p / 2);
        setLayoutParams(layoutParams);
        setVisibility(0);
        this.f157400f = true;
        this.f157401g = false;
        this.f157402h = false;
        this.f157403i = false;
        this.f157404j = System.currentTimeMillis();
        invalidate();
    }

    /* renamed from: b */
    public void mo76564b(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        this.f157406o = i;
        this.f157407p = i2;
        this.f157408q = i / 2;
        int i3 = i2 / 2;
        this.f157409r = i3;
        this.f157412u = ((float) i3) / 2.0f;
        this.f157410s = C76577a.m92151b(getContext(), 1);
        this.f157399e.setColor(this.f157398d);
        this.f157399e.setStrokeWidth((float) this.f157410s);
        setLayerType(1, (Paint) null);
    }

    /* renamed from: c */
    public void mo76565c(float f, C60780c cVar) {
        Log.m105924i("MicroMsg.ImproveCameraFocusView", "showExpoLine >> mStayPeriod: " + this.f157402h + ", " + f + ", " + this.f157413v + 65292 + this.f157414w);
        if (!this.f157415x && this.f157402h) {
            if (f == 0.0f) {
                if (this.f157413v == 0.0f) {
                    mo76570d();
                    this.f157411t = true;
                    return;
                }
            }
        }
        if (this.f157402h) {
            if (!(f == this.f157413v) && !this.f157414w) {
                mo76570d();
                this.f157414w = true;
                this.f157411t = true;
                float f2 = this.f157413v;
                float f3 = f - f2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                this.f157395A = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setDuration(50);
                }
                ValueAnimator valueAnimator = this.f157395A;
                if (valueAnimator != null) {
                    valueAnimator.setInterpolator(new AccelerateInterpolator());
                }
                ValueAnimator valueAnimator2 = this.f157395A;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new C55266b(this, f2, f3));
                }
                ValueAnimator valueAnimator3 = this.f157395A;
                if (valueAnimator3 != null) {
                    valueAnimator3.addListener(new C55267c(this, cVar));
                }
                ValueAnimator valueAnimator4 = this.f157395A;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                    return;
                }
                return;
            }
        }
        if (cVar != null) {
            cVar.mo85715a(false);
        }
    }

    /* renamed from: d */
    public final void mo76570d() {
        C53973z1 z1Var = this.f157417z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f157417z = null;
        this.f157417z = C53895h.m60466d(this.f157416y, (C66212f) null, (C53934p0) null, new C55264a(this, (C15601d<? super C55264a>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0483  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r7 = r20
            java.lang.String r1 = "canvas"
            gy3.C87412m.m108594g(r7, r1)
            super.draw(r20)
            int r1 = r0.f157408q
            int r1 = r1 / 2
            float r1 = (float) r1
            int r2 = r0.f157409r
            int r2 = r2 / 2
            float r2 = (float) r2
            r7.translate(r1, r2)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.f157404j
            long r1 = r1 - r3
            boolean r3 = r0.f157411t
            r8 = 1
            if (r3 == 0) goto L_0x002d
            long r3 = java.lang.System.currentTimeMillis()
            r0.f157405n = r3
            r0.f157415x = r8
        L_0x002d:
            long r3 = r0.f157405n
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0041
            boolean r3 = r0.f157411t
            if (r3 != 0) goto L_0x0041
            long r3 = java.lang.System.currentTimeMillis()
            r0.f157404j = r3
            r0.f157405n = r5
        L_0x0041:
            boolean r3 = r0.f157415x
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L_0x005e
            long r9 = r0.f157405n
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x005e
            long r1 = java.lang.System.currentTimeMillis()
            long r9 = r0.f157404j
            long r1 = r1 - r9
            long r9 = (long) r4
            long r1 = r1 + r9
            r3 = 600(0x258, float:8.41E-43)
            long r9 = (long) r3
            long r1 = r1 + r9
            r3 = 2000(0x7d0, float:2.803E-42)
            long r9 = (long) r3
            long r1 = r1 + r9
        L_0x005e:
            r9 = 200(0xc8, double:9.9E-322)
            r11 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            r0.f157400f = r11
            r0.f157401g = r8
        L_0x0069:
            r9 = 800(0x320, double:3.953E-321)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0073
            r0.f157401g = r11
            r0.f157402h = r8
        L_0x0073:
            r9 = 2800(0xaf0, double:1.3834E-320)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            boolean r3 = r0.f157411t
            if (r3 != 0) goto L_0x0081
            r0.f157402h = r11
            r0.f157403i = r8
        L_0x0081:
            r9 = 3000(0xbb8, double:1.482E-320)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0094
            boolean r3 = r0.f157411t
            if (r3 != 0) goto L_0x0094
            r0.f157403i = r11
            r19.reset()
            r7.drawColor(r11)
            return
        L_0x0094:
            boolean r3 = r0.f157400f
            r9 = 255(0xff, float:3.57E-43)
            java.lang.String r10 = "MicroMsg.ImproveCameraFocusView"
            r12 = 1128792064(0x43480000, float:200.0)
            r13 = 1073741824(0x40000000, float:2.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x00d5
            long r5 = (long) r4
            long r5 = r5 - r1
            float r3 = (float) r5
            float r3 = r3 / r12
            float r3 = r3 + r14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "draw "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            int r5 = r0.f157408q
            int r5 = r5 / 2
            float r5 = (float) r5
            int r6 = r0.f157409r
            int r6 = r6 / 2
            float r6 = (float) r6
            r7.scale(r3, r3, r5, r6)
            float r5 = r13 - r3
            android.graphics.Paint r6 = r0.f157399e
            float r15 = (float) r9
            float r15 = r15 * r5
            int r5 = (int) r15
            r6.setAlpha(r5)
            r15 = r3
            goto L_0x00da
        L_0x00d5:
            r7.scale(r14, r14)
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x00da:
            boolean r3 = r0.f157401g
            if (r3 == 0) goto L_0x00fe
            long r3 = (long) r4
            long r5 = r1 - r3
            long r5 = r5 % r3
            float r3 = (float) r5
            float r3 = r3 / r12
            float r3 = r3 * r13
            android.graphics.Paint r4 = r0.f157399e
            r5 = 127(0x7f, float:1.78E-43)
            float r5 = (float) r5
            r6 = 128(0x80, float:1.794E-43)
            float r6 = (float) r6
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x00f4
            float r3 = r3 - r14
            goto L_0x00f6
        L_0x00f4:
            float r3 = r14 - r3
        L_0x00f6:
            float r6 = r6 * r3
            float r5 = r5 + r6
            int r3 = (int) r5
            r4.setAlpha(r3)
            goto L_0x0103
        L_0x00fe:
            android.graphics.Paint r3 = r0.f157399e
            r3.setAlpha(r9)
        L_0x0103:
            boolean r3 = r0.f157403i
            if (r3 == 0) goto L_0x011a
            r3 = 2800(0xaf0, float:3.924E-42)
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            long r1 = r1 - r3
            float r1 = (float) r1
            float r1 = r1 / r12
            android.graphics.Paint r2 = r0.f157399e
            float r3 = (float) r9
            float r14 = r14 - r1
            float r3 = r3 * r14
            int r1 = (int) r3
            r2.setAlpha(r1)
        L_0x011a:
            r2 = 0
            r3 = 0
            int r1 = r0.f157408q
            float r4 = (float) r1
            r5 = 0
            android.graphics.Paint r6 = r0.f157399e
            r1 = r20
            r1.drawLine(r2, r3, r4, r5, r6)
            r4 = 0
            int r1 = r0.f157409r
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f157399e
            r1 = r20
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.f157408q
            float r2 = (float) r1
            float r4 = (float) r1
            int r1 = r0.f157409r
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f157399e
            r1 = r20
            r1.drawLine(r2, r3, r4, r5, r6)
            r2 = 0
            int r1 = r0.f157409r
            float r3 = (float) r1
            int r4 = r0.f157408q
            float r4 = (float) r4
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f157399e
            r1 = r20
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.f157409r
            int r3 = r1 / 2
            float r3 = (float) r3
            int r4 = r0.f157408q
            int r4 = r4 / 10
            float r4 = (float) r4
            int r1 = r1 / 2
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f157399e
            r1 = r20
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.f157408q
            float r2 = (float) r1
            int r3 = r0.f157409r
            int r4 = r3 / 2
            float r4 = (float) r4
            int r1 = r1 * 9
            int r1 = r1 / 10
            float r5 = (float) r1
            int r3 = r3 / 2
            float r6 = (float) r3
            android.graphics.Paint r9 = r0.f157399e
            r1 = r20
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.f157408q
            int r2 = r1 / 2
            float r2 = (float) r2
            r3 = 0
            int r1 = r1 / 2
            float r4 = (float) r1
            int r1 = r0.f157409r
            int r1 = r1 / 10
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f157399e
            r1 = r20
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.f157408q
            int r2 = r1 / 2
            float r2 = (float) r2
            int r3 = r0.f157409r
            float r4 = (float) r3
            int r1 = r1 / 2
            float r5 = (float) r1
            int r3 = r3 * 9
            int r3 = r3 / 10
            float r6 = (float) r3
            android.graphics.Paint r9 = r0.f157399e
            r1 = r20
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r1.drawLine(r2, r3, r4, r5, r6)
            boolean r1 = r0.f157396B
            if (r1 == 0) goto L_0x0491
            android.content.Context r1 = r19.getContext()
            r2 = 20
            int r1 = kg3.C76577a.m92151b(r1, r2)
            float r1 = (float) r1
            float r1 = r1 * r15
            int r2 = r0.f157397C
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 12
            r5 = 90
            if (r2 == r5) goto L_0x0212
            if (r2 == r3) goto L_0x01ec
            int r2 = r0.f157408q
            float r2 = (float) r2
            float r2 = r2 * r15
            float r6 = (float) r4
            float r2 = r2 + r6
            int r6 = r0.f157409r
            float r6 = (float) r6
            float r6 = r6 * r15
            float r6 = r6 / r13
            float r8 = r1 / r13
            float r6 = r6 - r8
            float r8 = r0.f157413v
            float r6 = r6 + r8
            rx3.l r8 = new rx3.l
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8.<init>(r6, r2)
            goto L_0x0232
        L_0x01ec:
            int r2 = r0.f157409r
            float r2 = (float) r2
            float r6 = (float) r8
            float r6 = r15 - r6
            float r2 = r2 * r6
            float r6 = (float) r4
            float r2 = r2 + r6
            float r2 = r2 + r1
            float r2 = -r2
            int r6 = r0.f157408q
            float r6 = (float) r6
            float r6 = r6 * r15
            float r6 = r6 / r13
            float r8 = r1 / r13
            float r6 = r6 - r8
            float r8 = r0.f157413v
            float r6 = r6 + r8
            rx3.l r8 = new rx3.l
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r8.<init>(r2, r6)
            goto L_0x0232
        L_0x0212:
            int r2 = r0.f157409r
            float r2 = (float) r2
            float r2 = r2 * r15
            float r6 = (float) r4
            float r2 = r2 + r6
            int r6 = r0.f157408q
            float r6 = (float) r6
            float r6 = r6 * r15
            float r6 = r6 / r13
            float r8 = r1 / r13
            float r6 = r6 - r8
            float r8 = r0.f157413v
            float r6 = r6 - r8
            rx3.l r8 = new rx3.l
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r8.<init>(r2, r6)
        L_0x0232:
            B r2 = r8.f38556e
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            A r6 = r8.f38555d
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sunSize: "
            r8.append(r9)
            r8.append(r1)
            r9 = 32
            r8.append(r9)
            r8.append(r2)
            r8.append(r9)
            r8.append(r6)
            r8.append(r9)
            int r12 = r0.f157408q
            r8.append(r12)
            r8.append(r9)
            int r9 = r0.f157409r
            r8.append(r9)
            r9 = 44
            r8.append(r9)
            float r9 = r0.f157413v
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            android.content.res.Resources r8 = r19.getResources()
            r9 = 2131756057(0x7f100419, float:1.914301E38)
            r12 = 0
            android.graphics.Bitmap r8 = hi3.C87515a.m108831a(r8, r9, r12)
            android.graphics.Rect r9 = new android.graphics.Rect
            int r12 = r8.getWidth()
            int r14 = r8.getHeight()
            r9.<init>(r11, r11, r12, r14)
            android.graphics.Rect r11 = new android.graphics.Rect
            int r2 = (int) r2
            int r6 = (int) r6
            int r12 = (int) r1
            int r14 = r2 + r12
            int r12 = r12 + r6
            r11.<init>(r2, r6, r14, r12)
            android.graphics.Paint r2 = r0.f157399e
            r7.drawBitmap(r8, r9, r11, r2)
            boolean r2 = r0.f157411t
            if (r2 != 0) goto L_0x02b0
            boolean r2 = r0.f157415x
            if (r2 == 0) goto L_0x0491
        L_0x02b0:
            int r2 = r0.f157397C
            r6 = 8
            if (r2 == r5) goto L_0x02e6
            if (r2 == r3) goto L_0x02cd
            int r2 = r0.f157408q
            int r2 = r2 + r4
            float r2 = (float) r2
            float r8 = r1 / r13
            float r2 = r2 + r8
            rx3.l r8 = new rx3.l
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8.<init>(r9, r2)
            goto L_0x02ff
        L_0x02cd:
            float r2 = r0.f157412u
            float r8 = r0.f157413v
            float r2 = r2 + r8
            float r8 = (float) r6
            float r9 = r1 / r13
            float r8 = r8 + r9
            float r8 = -r8
            float r2 = r2 + r8
            rx3.l r9 = new rx3.l
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r9.<init>(r8, r2)
            goto L_0x02fe
        L_0x02e6:
            float r2 = r0.f157412u
            float r8 = r0.f157413v
            float r2 = r2 - r8
            float r8 = (float) r6
            float r9 = r1 / r13
            float r8 = r8 + r9
            float r8 = -r8
            float r2 = r2 + r8
            rx3.l r9 = new rx3.l
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r9.<init>(r8, r2)
        L_0x02fe:
            r8 = r9
        L_0x02ff:
            int r2 = r0.f157397C
            if (r2 == r5) goto L_0x0331
            if (r2 == r3) goto L_0x031e
            float r2 = r0.f157412u
            float r9 = r0.f157413v
            float r2 = r2 + r9
            float r9 = (float) r6
            float r11 = r1 / r13
            float r9 = r9 + r11
            float r9 = -r9
            float r2 = r2 + r9
            rx3.l r11 = new rx3.l
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11.<init>(r9, r2)
            goto L_0x0345
        L_0x031e:
            float r2 = (float) r4
            float r9 = r1 / r13
            float r2 = r2 + r9
            float r2 = -r2
            rx3.l r11 = new rx3.l
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11.<init>(r9, r2)
            goto L_0x0345
        L_0x0331:
            int r2 = r0.f157409r
            int r2 = r2 + r4
            float r2 = (float) r2
            float r9 = r1 / r13
            float r2 = r2 + r9
            rx3.l r11 = new rx3.l
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11.<init>(r9, r2)
        L_0x0345:
            int r2 = r0.f157397C
            if (r2 == r5) goto L_0x037c
            if (r2 == r3) goto L_0x0360
            int r2 = r0.f157408q
            int r2 = r2 + r4
            float r2 = (float) r2
            float r9 = r1 / r13
            float r2 = r2 + r9
            rx3.l r9 = new rx3.l
            java.lang.Float r12 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r9.<init>(r12, r2)
            goto L_0x0398
        L_0x0360:
            float r2 = r0.f157412u
            float r9 = r0.f157413v
            float r2 = r2 - r9
            int r9 = r0.f157408q
            int r9 = r9 + r6
            float r9 = (float) r9
            float r12 = r1 / r13
            float r9 = r9 + r12
            float r2 = r9 - r2
            rx3.l r12 = new rx3.l
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r12.<init>(r2, r9)
            goto L_0x0397
        L_0x037c:
            float r2 = r0.f157412u
            float r9 = r0.f157413v
            float r2 = r2 + r9
            int r9 = r0.f157408q
            int r9 = r9 + r6
            float r9 = (float) r9
            float r12 = r1 / r13
            float r9 = r9 + r12
            float r2 = r9 - r2
            rx3.l r12 = new rx3.l
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r12.<init>(r2, r9)
        L_0x0397:
            r9 = r12
        L_0x0398:
            int r2 = r0.f157397C
            if (r2 == r5) goto L_0x03cb
            if (r2 == r3) goto L_0x03b9
            float r2 = r0.f157412u
            float r3 = r0.f157413v
            float r2 = r2 - r3
            int r3 = r0.f157409r
            int r3 = r3 + r6
            float r3 = (float) r3
            float r1 = r1 / r13
            float r3 = r3 + r1
            float r1 = r3 - r2
            rx3.l r2 = new rx3.l
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2.<init>(r1, r3)
            goto L_0x03df
        L_0x03b9:
            float r2 = (float) r4
            float r1 = r1 / r13
            float r2 = r2 + r1
            float r1 = -r2
            rx3.l r2 = new rx3.l
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.<init>(r3, r1)
            goto L_0x03df
        L_0x03cb:
            int r2 = r0.f157409r
            int r2 = r2 + r4
            float r2 = (float) r2
            float r1 = r1 / r13
            float r2 = r2 + r1
            rx3.l r1 = new rx3.l
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.<init>(r3, r2)
            r2 = r1
        L_0x03df:
            A r1 = r8.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            float r3 = r1.floatValue()
            B r1 = r8.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            float r4 = r1.floatValue()
            A r1 = r11.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            float r5 = r1.floatValue()
            B r1 = r11.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            float r6 = r1.floatValue()
            A r1 = r9.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            float r12 = r1.floatValue()
            B r1 = r9.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            float r13 = r1.floatValue()
            A r1 = r2.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            float r14 = r1.floatValue()
            B r1 = r2.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            float r15 = r1.floatValue()
            rx3.l r1 = r19.getLineHeight()
            A r7 = r1.f38555d
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            r16 = r15
            B r15 = r1.f38556e
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r17 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r18 = r14
            java.lang.String r14 = "isStay to show line "
            r13.append(r14)
            float r14 = r0.f157413v
            r13.append(r14)
            java.lang.String r14 = "， "
            r13.append(r14)
            r13.append(r8)
            java.lang.String r8 = ", "
            r13.append(r8)
            r13.append(r11)
            r13.append(r8)
            r13.append(r9)
            r13.append(r8)
            r13.append(r2)
            r13.append(r8)
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            int r1 = (int) r7
            if (r1 == 0) goto L_0x0480
            android.graphics.Paint r7 = r0.f157399e
            r1 = r20
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x0480:
            int r1 = (int) r15
            if (r1 == 0) goto L_0x0491
            android.graphics.Paint r6 = r0.f157399e
            r1 = r20
            r2 = r12
            r3 = r18
            r4 = r17
            r5 = r16
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x0491:
            r19.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.media.camera.view.control.ImproveCameraFocusView.draw(android.graphics.Canvas):void");
    }

    public final int getViewHeight() {
        return this.f157407p;
    }

    public final int getViewWidth() {
        return this.f157406o;
    }

    public void reset() {
        this.f157414w = false;
        this.f157411t = false;
        C53973z1 z1Var = this.f157417z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f157417z = null;
        this.f157413v = 0.0f;
        ValueAnimator valueAnimator = this.f157395A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f157395A = null;
        this.f157405n = 0;
        this.f157415x = false;
    }

    public void setFocusColor(int i) {
        if (i != 0) {
            this.f157398d = i;
            this.f157399e.setColor(i);
        }
    }

    public void setOrientation(int i) {
        Log.m105924i("MicroMsg.ImproveCameraFocusView", "setCurrentOrientation >> " + i);
        if (this.f157397C != i) {
            this.f157397C = i;
        }
    }

    public final void setViewHeight(int i) {
        this.f157407p = i;
    }

    public final void setViewWidth(int i) {
        this.f157406o = i;
    }

    public ImproveCameraFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImproveCameraFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
