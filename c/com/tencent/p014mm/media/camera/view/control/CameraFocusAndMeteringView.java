package com.tencent.p014mm.media.camera.view.control;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Range;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import e80.C107260h;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import j80.C108654b;
import j80.C108655d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import sn0.C90259e;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000e¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView;", "Landroid/widget/RelativeLayout;", "", "isShowAdjustExpo", "Lrx3/b0;", "setIsShowAdjustExpo", "Le80/h;", "setting", "setCameraUISetting", "Lcom/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$b;", "callback", "setTouchCallback", "Lcom/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$a;", "setExpoDataCallback", "", "orientation", "setCurrentOrientation", "getCurrentExpo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView */
public final class CameraFocusAndMeteringView extends RelativeLayout {

    /* renamed from: A */
    public final GestureDetector f310718A;

    /* renamed from: d */
    public C104642b f310719d;

    /* renamed from: e */
    public long f310720e;

    /* renamed from: f */
    public float f310721f = -1.0f;

    /* renamed from: g */
    public int f310722g;

    /* renamed from: h */
    public C108655d f310723h;

    /* renamed from: i */
    public C107260h f310724i;

    /* renamed from: j */
    public float f310725j;

    /* renamed from: n */
    public float f310726n;

    /* renamed from: o */
    public boolean f310727o;

    /* renamed from: p */
    public float f310728p;

    /* renamed from: q */
    public float f310729q;

    /* renamed from: r */
    public Range<Integer> f310730r;

    /* renamed from: s */
    public int f310731s;

    /* renamed from: t */
    public int f310732t;

    /* renamed from: u */
    public boolean f310733u;

    /* renamed from: v */
    public boolean f310734v = true;

    /* renamed from: w */
    public C104641a f310735w;

    /* renamed from: x */
    public C0000n0 f310736x = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: y */
    public C53973z1 f310737y;

    /* renamed from: z */
    public int f310738z;

    /* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$a */
    public interface C104641a {
        /* renamed from: g */
        Object mo148269g(C15601d<? super C13604l<Range<Integer>, Integer>> dVar);
    }

    /* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$b */
    public interface C104642b {
        /* renamed from: a */
        void mo148263a();

        /* renamed from: b */
        void mo148264b();

        /* renamed from: c */
        void mo148265c();

        /* renamed from: e */
        void mo148267e(float f, float f2);

        /* renamed from: h */
        void mo148272h(int i);

        /* renamed from: j */
        void mo148274j(int i);
    }

    /* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$c */
    public static final class C104643c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ CameraFocusAndMeteringView f310739d;

        @C91590f(mo125468c = "com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$simpleGestureListener$1$onSingleTapUp$1", mo125469f = "CameraFocusAndMeteringView.kt", mo125470l = {63, 64}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$c$a */
        public static final class C104644a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f310740d;

            /* renamed from: e */
            public final /* synthetic */ CameraFocusAndMeteringView f310741e;

            /* renamed from: f */
            public final /* synthetic */ float f310742f;

            /* renamed from: g */
            public final /* synthetic */ float f310743g;

            @C91590f(mo125468c = "com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$simpleGestureListener$1$onSingleTapUp$1$1", mo125469f = "CameraFocusAndMeteringView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$c$a$a */
            public static final class C104645a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C13604l<Range<Integer>, Integer> f310744d;

                /* renamed from: e */
                public final /* synthetic */ CameraFocusAndMeteringView f310745e;

                /* renamed from: f */
                public final /* synthetic */ float f310746f;

                /* renamed from: g */
                public final /* synthetic */ float f310747g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C104645a(C13604l<Range<Integer>, Integer> lVar, CameraFocusAndMeteringView cameraFocusAndMeteringView, float f, float f2, C15601d<? super C104645a> dVar) {
                    super(2, dVar);
                    this.f310744d = lVar;
                    this.f310745e = cameraFocusAndMeteringView;
                    this.f310746f = f;
                    this.f310747g = f2;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C104645a(this.f310744d, this.f310745e, this.f310746f, this.f310747g, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C104645a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C13604l<Range<Integer>, Integer> lVar = this.f310744d;
                    if (lVar != null) {
                        CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f310745e;
                        float f = this.f310746f;
                        float f2 = this.f310747g;
                        cameraFocusAndMeteringView.f310730r = (Range) lVar.f38555d;
                        int intValue = ((Number) lVar.f38556e).intValue();
                        cameraFocusAndMeteringView.f310731s = intValue;
                        cameraFocusAndMeteringView.f310732t = intValue;
                        Range<Integer> range = cameraFocusAndMeteringView.f310730r;
                        if (range != null) {
                            float f3 = cameraFocusAndMeteringView.f310725j;
                            C87412m.m108591d(range);
                            int intValue2 = range.getUpper().intValue();
                            Range<Integer> range2 = cameraFocusAndMeteringView.f310730r;
                            C87412m.m108591d(range2);
                            Integer lower = range2.getLower();
                            C87412m.m108593f(lower, "expoRange!!.lower");
                            cameraFocusAndMeteringView.f310726n = f3 / (((float) (intValue2 - lower.intValue())) / 2.0f);
                            C108655d dVar = cameraFocusAndMeteringView.f310723h;
                            if (dVar != null) {
                                dVar.mo76563a(f, f2, cameraFocusAndMeteringView.mo148287a());
                            }
                            C104642b bVar = cameraFocusAndMeteringView.f310719d;
                            if (bVar != null) {
                                bVar.mo148267e(f, f2);
                            }
                        }
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C104644a(CameraFocusAndMeteringView cameraFocusAndMeteringView, float f, float f2, C15601d<? super C104644a> dVar) {
                super(2, dVar);
                this.f310741e = cameraFocusAndMeteringView;
                this.f310742f = f;
                this.f310743g = f2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C104644a(this.f310741e, this.f310742f, this.f310743g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C104644a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r9.f310740d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x001c
                    if (r1 == r3) goto L_0x0018
                    if (r1 != r2) goto L_0x0010
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L_0x004d
                L_0x0010:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x0018:
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L_0x002e
                L_0x001c:
                    kotlin.ResultKt.throwOnFailure(r10)
                    com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView r10 = r9.f310741e
                    com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$a r10 = r10.f310735w
                    if (r10 == 0) goto L_0x0031
                    r9.f310740d = r3
                    java.lang.Object r10 = r10.mo148269g(r9)
                    if (r10 != r0) goto L_0x002e
                    return r0
                L_0x002e:
                    rx3.l r10 = (rx3.C13604l) r10
                    goto L_0x0032
                L_0x0031:
                    r10 = 0
                L_0x0032:
                    r4 = r10
                    a14.h0 r10 = a14.C53872d1.f151117a
                    a14.k2 r10 = f14.C58901s.f168555a
                    com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$c$a$a r1 = new com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$c$a$a
                    com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView r5 = r9.f310741e
                    float r6 = r9.f310742f
                    float r7 = r9.f310743g
                    r8 = 0
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8)
                    r9.f310740d = r2
                    java.lang.Object r10 = a14.C53895h.m60469g(r10, r1, r9)
                    if (r10 != r0) goto L_0x004d
                    return r0
                L_0x004d:
                    rx3.b0 r10 = rx3.C13598b0.f38549a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.media.camera.view.control.CameraFocusAndMeteringView.C104643c.C104644a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C104643c(CameraFocusAndMeteringView cameraFocusAndMeteringView) {
            this.f310739d = cameraFocusAndMeteringView;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(motionEvent, "e");
            StringBuilder sb = new StringBuilder();
            sb.append("onDoubleTap enable:[");
            C107260h hVar = this.f310739d.f310724i;
            sb.append(hVar != null ? Boolean.valueOf(hVar.f320919b) : null);
            sb.append(']');
            Log.m105924i("MicroMsg.Camera.CameraFocusAndMeteringView", sb.toString());
            long currentTimeMillis = System.currentTimeMillis();
            CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f310739d;
            if (currentTimeMillis - cameraFocusAndMeteringView.f310720e > 1000) {
                C107260h hVar2 = cameraFocusAndMeteringView.f310724i;
                if (!(hVar2 != null && !hVar2.f320919b)) {
                    C104642b bVar = cameraFocusAndMeteringView.f310719d;
                    if (bVar != null) {
                        bVar.mo148265c();
                    }
                    this.f310739d.f310720e = System.currentTimeMillis();
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "e");
            Log.m105924i("MicroMsg.Camera.CameraFocusAndMeteringView", "onSingleTapConfirmed");
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(motionEvent, "e");
            Log.m105924i("MicroMsg.Camera.CameraFocusAndMeteringView", "onSingleTapUp " + motionEvent.getX() + ", " + motionEvent.getY());
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f310739d;
            cameraFocusAndMeteringView.getClass();
            C61926c.m72668M(new C108654b(cameraFocusAndMeteringView));
            CameraFocusAndMeteringView cameraFocusAndMeteringView2 = this.f310739d;
            if (!cameraFocusAndMeteringView2.f310727o || cameraFocusAndMeteringView2.f310730r != null) {
                C108655d dVar = cameraFocusAndMeteringView2.f310723h;
                if (dVar != null) {
                    dVar.mo76563a(x, y, cameraFocusAndMeteringView2.mo148287a());
                }
                C104642b bVar = this.f310739d.f310719d;
                if (bVar != null) {
                    bVar.mo148267e(x, y);
                }
            } else {
                cameraFocusAndMeteringView2.f310737y = C53895h.m60466d(cameraFocusAndMeteringView2.f310736x, (C66212f) null, (C53934p0) null, new C104644a(cameraFocusAndMeteringView2, x, y, (C15601d<? super C104644a>) null), 3, (Object) null);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraFocusAndMeteringView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C104643c(this));
        this.f310718A = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* renamed from: a */
    public final boolean mo148287a() {
        Range<Integer> range;
        if (this.f310727o && (range = this.f310730r) != null) {
            C87412m.m108591d(range);
            int intValue = range.getUpper().intValue();
            Range<Integer> range2 = this.f310730r;
            C87412m.m108591d(range2);
            Integer lower = range2.getLower();
            C87412m.m108593f(lower, "expoRange!!.lower");
            if (intValue - lower.intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    public final int getCurrentExpo() {
        return this.f310732t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r12, r0)
            android.view.GestureDetector r0 = r11.f310718A
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r12)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView"
            java.lang.String r4 = "onTouchEvent"
            java.lang.String r5 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r6 = "android/view/GestureDetector_EXEC_"
            java.lang.String r7 = "onTouchEvent"
            java.lang.String r8 = "(Landroid/view/MotionEvent;)Z"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r10 = 0
            java.lang.Object r1 = r9.mo10231a(r10)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r2 = r0.onTouchEvent(r1)
            java.lang.String r3 = "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView"
            java.lang.String r4 = "onTouchEvent"
            java.lang.String r5 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r6 = "android/view/GestureDetector_EXEC_"
            java.lang.String r7 = "onTouchEvent"
            java.lang.String r8 = "(Landroid/view/MotionEvent;)Z"
            r1 = r0
            j20.C117292a.m165360f(r1, r2, r3, r4, r5, r6, r7, r8)
            int r0 = r12.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r2 = "MicroMsg.Camera.CameraFocusAndMeteringView"
            r3 = 1
            if (r0 == 0) goto L_0x0252
            r4 = 0
            if (r0 == r3) goto L_0x0244
            r1 = 2
            if (r0 == r1) goto L_0x0076
            r12 = 5
            if (r0 == r12) goto L_0x006a
            r12 = 6
            if (r0 == r12) goto L_0x0059
            goto L_0x026a
        L_0x0059:
            java.lang.String r12 = "ACTION_POINTER_UP"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r12)
            int r12 = r11.f310722g
            int r12 = r12 + -1
            r11.f310722g = r12
            r11.f310729q = r4
            r11.f310728p = r4
            goto L_0x026a
        L_0x006a:
            java.lang.String r12 = "ACTION_POINTER_DOWN"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r12)
            int r12 = r11.f310722g
            int r12 = r12 + r3
            r11.f310722g = r12
            goto L_0x026a
        L_0x0076:
            int r0 = r11.f310722g
            if (r0 < r1) goto L_0x00f1
            if (r0 < r1) goto L_0x00a6
            float r0 = r12.getX(r10)     // Catch:{ Exception -> 0x0098 }
            float r1 = r12.getY(r10)     // Catch:{ Exception -> 0x0098 }
            float r5 = r12.getX(r3)     // Catch:{ Exception -> 0x0098 }
            float r12 = r12.getY(r3)     // Catch:{ Exception -> 0x0098 }
            float r0 = r0 - r5
            float r0 = java.lang.Math.abs(r0)     // Catch:{ Exception -> 0x0098 }
            float r1 = r1 - r12
            float r12 = java.lang.Math.abs(r1)     // Catch:{ Exception -> 0x0098 }
            float r0 = r0 + r12
            goto L_0x00a7
        L_0x0098:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r12 = r12.getMessage()
            r0[r10] = r12
            java.lang.String r12 = "pointerDistance error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r12, r0)
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r12[r10] = r1
            java.lang.String r1 = "distance: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r1, r12)
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x026a
            float r12 = r11.f310721f
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x00c2
            r11.f310721f = r0
            goto L_0x026a
        L_0x00c2:
            float r12 = r0 - r12
            float r12 = java.lang.Math.abs(r12)
            r1 = 1097859072(0x41700000, float:15.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x026a
            float r12 = r11.f310721f
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x00e1
            java.lang.String r12 = "zoom out"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r12)
            com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$b r12 = r11.f310719d
            if (r12 == 0) goto L_0x00ed
            r12.mo148263a()
            goto L_0x00ed
        L_0x00e1:
            java.lang.String r12 = "zoom in"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r12)
            com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView$b r12 = r11.f310719d
            if (r12 == 0) goto L_0x00ed
            r12.mo148264b()
        L_0x00ed:
            r11.f310721f = r0
            goto L_0x026a
        L_0x00f1:
            if (r0 != r3) goto L_0x026a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dealExpoMove >> move one pointer, x: "
            r0.append(r1)
            float r1 = r12.getX()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r5 = r12.getY()
            r0.append(r5)
            r0.append(r1)
            float r5 = r11.f310728p
            r0.append(r5)
            r0.append(r1)
            float r5 = r11.f310729q
            r0.append(r5)
            r0.append(r1)
            int r5 = r11.f310738z
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            boolean r0 = r11.mo148287a()
            if (r0 != 0) goto L_0x013c
            java.lang.String r12 = "no to deal expo"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            goto L_0x026a
        L_0x013c:
            float r0 = r11.f310728p
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0144
            r5 = 1
            goto L_0x0145
        L_0x0144:
            r5 = 0
        L_0x0145:
            if (r5 != 0) goto L_0x026a
            float r5 = r11.f310729q
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x014f
            r5 = 1
            goto L_0x0150
        L_0x014f:
            r5 = 0
        L_0x0150:
            if (r5 != 0) goto L_0x026a
            boolean r5 = r11.f310733u
            if (r5 != 0) goto L_0x026a
            r11.f310733u = r3
            int r5 = r11.f310738z
            if (r5 == 0) goto L_0x0171
            r6 = 180(0xb4, float:2.52E-43)
            if (r5 != r6) goto L_0x0161
            goto L_0x0171
        L_0x0161:
            r6 = 90
            if (r5 != r6) goto L_0x016a
            float r5 = r12.getX()
            goto L_0x0177
        L_0x016a:
            float r0 = r12.getX()
            float r5 = r11.f310728p
            goto L_0x0177
        L_0x0171:
            float r0 = r12.getY()
            float r5 = r11.f310729q
        L_0x0177:
            float r0 = r0 - r5
            float r5 = java.lang.Math.abs(r0)
            r6 = 100
            float r6 = (float) r6
            float r6 = r5 / r6
            int r6 = (int) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "dealExpoMove >> multi: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = ", curExpo: "
            r7.append(r8)
            int r8 = r11.f310732t
            r7.append(r8)
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r6 <= 0) goto L_0x022d
            float r1 = r12.getX()
            r11.f310728p = r1
            float r12 = r12.getY()
            r11.f310729q = r12
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x01de
            android.util.Range<java.lang.Integer> r12 = r11.f310730r
            gy3.C87412m.m108591d(r12)
            int r0 = r11.f310732t
            int r0 = r0 - r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x01d2
            int r12 = r11.f310732t
            int r12 = r12 - r6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0203
        L_0x01d2:
            android.util.Range<java.lang.Integer> r12 = r11.f310730r
            gy3.C87412m.m108591d(r12)
            java.lang.Comparable r12 = r12.getLower()
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L_0x0203
        L_0x01de:
            android.util.Range<java.lang.Integer> r12 = r11.f310730r
            gy3.C87412m.m108591d(r12)
            int r0 = r11.f310732t
            int r0 = r0 + r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x01f8
            int r12 = r11.f310732t
            int r12 = r12 + r6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0203
        L_0x01f8:
            android.util.Range<java.lang.Integer> r12 = r11.f310730r
            gy3.C87412m.m108591d(r12)
            java.lang.Comparable r12 = r12.getUpper()
            java.lang.Integer r12 = (java.lang.Integer) r12
        L_0x0203:
            int r0 = r11.f310732t
            if (r12 != 0) goto L_0x0208
            goto L_0x0216
        L_0x0208:
            int r1 = r12.intValue()
            if (r1 != r0) goto L_0x0216
            java.lang.String r12 = "toDur is same to curDur "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            r11.f310733u = r10
            goto L_0x026a
        L_0x0216:
            j80.d r0 = r11.f310723h
            if (r0 == 0) goto L_0x026a
            int r1 = r12.intValue()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r11.f310726n
            float r1 = r1 * r2
            j80.a r2 = new j80.a
            r2.<init>(r11, r12, r6)
            r0.mo76565c(r1, r2)
            goto L_0x026a
        L_0x022d:
            r12 = 1112014848(0x42480000, float:50.0)
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0241
            boolean r12 = r11.f310734v
            if (r12 == 0) goto L_0x0241
            r11.f310734v = r10
            j80.d r12 = r11.f310723h
            if (r12 == 0) goto L_0x0241
            r0 = 0
            r12.mo76565c(r4, r0)
        L_0x0241:
            r11.f310733u = r10
            goto L_0x026a
        L_0x0244:
            java.lang.String r12 = "ACTION_UP"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r12)
            r11.f310721f = r1
            r11.f310722g = r10
            r11.f310729q = r4
            r11.f310728p = r4
            goto L_0x026a
        L_0x0252:
            java.lang.String r0 = "ACTION_DOWN"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r0)
            r11.f310721f = r1
            int r0 = r11.f310722g
            int r0 = r0 + r3
            r11.f310722g = r0
            float r0 = r12.getX()
            r11.f310728p = r0
            float r12 = r12.getY()
            r11.f310729q = r12
        L_0x026a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.media.camera.view.control.CameraFocusAndMeteringView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCameraUISetting(C107260h hVar) {
        Log.m105924i("MicroMsg.Camera.CameraFocusAndMeteringView", "setCameraUISetting:" + hVar);
        if (hVar != null) {
            C108655d dVar = this.f310723h;
            if (dVar != null) {
                dVar.setFocusColor(hVar.f320918a);
            }
            this.f310724i = hVar;
        }
    }

    public final void setCurrentOrientation(int i) {
        int i2 = (i + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1;
        C108655d dVar = this.f310723h;
        if (dVar != null) {
            dVar.setOrientation(i2);
        }
        if (this.f310738z != i2) {
            this.f310738z = i2;
        }
    }

    public final void setExpoDataCallback(C104641a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f310735w = aVar;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [com.tencent.mm.media.camera.view.control.ImproveCameraFocusView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setIsShowAdjustExpo(boolean r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setIsShowAdjustExpo >> "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Camera.CameraFocusAndMeteringView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r2.f310727o = r3
            if (r3 == 0) goto L_0x0024
            com.tencent.mm.media.camera.view.control.ImproveCameraFocusView r3 = new com.tencent.mm.media.camera.view.control.ImproveCameraFocusView
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0)
            goto L_0x002d
        L_0x0024:
            com.tencent.mm.media.camera.view.control.CameraFocusView r3 = new com.tencent.mm.media.camera.view.control.CameraFocusView
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0)
        L_0x002d:
            r2.f310723h = r3
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            r2.addView(r3)
            android.content.Context r0 = r2.getContext()
            r1 = 120(0x78, float:1.68E-43)
            int r0 = kg3.C76577a.m92151b(r0, r1)
            r3.mo76564b(r0, r0)
            float r3 = (float) r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 / r0
            r2.f310725j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.media.camera.view.control.CameraFocusAndMeteringView.setIsShowAdjustExpo(boolean):void");
    }

    public final void setTouchCallback(C104642b bVar) {
        this.f310719d = bVar;
    }
}
