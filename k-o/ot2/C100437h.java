package ot2;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sn0.C90259e;

/* renamed from: ot2.h */
public final class C100437h extends UIComponent {

    /* renamed from: A */
    public int f294230A;

    /* renamed from: d */
    public final C13601g f294231d = C36568h.m40985a(new C100441d(this));

    /* renamed from: e */
    public final C13601g f294232e = C36568h.m40985a(new C100438a(this));

    /* renamed from: f */
    public final C13601g f294233f = C36568h.m40985a(new C100445g(this));

    /* renamed from: g */
    public final C13601g f294234g = C36568h.m40985a(new C100444f(this));

    /* renamed from: h */
    public C45059m0 f294235h;

    /* renamed from: i */
    public int f294236i;

    /* renamed from: j */
    public int f294237j;

    /* renamed from: n */
    public int f294238n;

    /* renamed from: o */
    public int f294239o;

    /* renamed from: p */
    public boolean f294240p;

    /* renamed from: q */
    public boolean f294241q;

    /* renamed from: r */
    public String f294242r = "";

    /* renamed from: s */
    public boolean f294243s;

    /* renamed from: t */
    public GestureDetector f294244t;

    /* renamed from: u */
    public VelocityTracker f294245u;

    /* renamed from: v */
    public boolean f294246v;

    /* renamed from: w */
    public boolean f294247w;

    /* renamed from: x */
    public boolean f294248x;

    /* renamed from: y */
    public float f294249y = 1.0f;

    /* renamed from: z */
    public int f294250z;

    /* renamed from: ot2.h$a */
    public static final class C100438a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C100437h f294251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100438a(C100437h hVar) {
            super(0);
            this.f294251d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$galleyBg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$galleyBg$2");
            View findViewById = this.f294251d.findViewById(C0966R.C0970id.myr);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$galleyBg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$galleyBg$2");
            return findViewById;
        }
    }

    /* renamed from: ot2.h$b */
    public static final class C100439b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ C100437h f294252d;

        public C100439b(C100437h hVar) {
            this.f294252d = hVar;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
            C100437h.m131464g3(this.f294252d, true);
            super.onLongPress(motionEvent);
            SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
            C87412m.m108591d(motionEvent2);
            float rawX = motionEvent2.getRawX();
            C87412m.m108591d(motionEvent);
            float rawX2 = rawX - motionEvent.getRawX();
            float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
            if (Math.abs(rawX2) <= ((float) C100437h.m131461d3(this.f294252d).getWidth()) && Math.abs(rawY) <= ((float) C100437h.m131461d3(this.f294252d).getHeight()) && C100437h.m131462e3(this.f294252d)) {
                C100437h.m131463f3(this.f294252d).setTranslationX(rawX2);
                C100437h.m131463f3(this.f294252d).setTranslationY(rawY);
            }
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
            C100437h hVar = this.f294252d;
            SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            boolean z = hVar.f294240p;
            SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            if (!z) {
                this.f294252d.mo139928l3(false);
            }
            SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: ot2.h$c */
    public static final class C100440c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C100437h f294253d;

        public C100440c(C100437h hVar) {
            this.f294253d = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0168, code lost:
            if (r0 != false) goto L_0x016a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x019a, code lost:
            if (r3 >= r0) goto L_0x019c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0289  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0294  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x02ac  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x02bd  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x02e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r28, android.view.MotionEvent r29) {
            /*
                r27 = this;
                r6 = r27
                r7 = r29
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r28
                r0.add(r1)
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r1 = "android/view/View$OnTouchListener"
                java.lang.String r2 = "onTouch"
                java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r27
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = "onTouch"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                ot2.h r2 = r6.f294253d
                java.lang.String r3 = "access$getMGestureDetector$p"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                android.view.GestureDetector r2 = r2.f294244t
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                gy3.C87412m.m108591d(r2)
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r7)
                java.lang.Object[] r9 = r3.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r11 = "onTouch"
                java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r13 = "android/view/GestureDetector_EXEC_"
                java.lang.String r14 = "onTouchEvent"
                java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
                r8 = r2
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r5 = 0
                java.lang.Object r3 = r3.mo10231a(r5)
                android.view.MotionEvent r3 = (android.view.MotionEvent) r3
                boolean r9 = r2.onTouchEvent(r3)
                java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r11 = "onTouch"
                java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r13 = "android/view/GestureDetector_EXEC_"
                java.lang.String r14 = "onTouchEvent"
                java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
                j20.C117292a.m165360f(r8, r9, r10, r11, r12, r13, r14, r15)
                ot2.h r2 = r6.f294253d
                android.view.VelocityTracker r2 = ot2.C100437h.m131460c3(r2)
                java.lang.String r3 = "access$setMVelocityTracker$p"
                if (r2 != 0) goto L_0x0091
                ot2.h r2 = r6.f294253d
                android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.f294245u = r8
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            L_0x0091:
                ot2.h r2 = r6.f294253d
                android.view.VelocityTracker r2 = ot2.C100437h.m131460c3(r2)
                if (r2 == 0) goto L_0x00a5
                ot2.h r2 = r6.f294253d
                android.view.VelocityTracker r2 = ot2.C100437h.m131460c3(r2)
                gy3.C87412m.m108591d(r2)
                r2.addMovement(r7)
            L_0x00a5:
                int r2 = r29.getAction()
                r2 = r2 & 255(0xff, float:3.57E-43)
                java.lang.String r7 = "access$getReset$p"
                java.lang.String r8 = "access$setReset$p"
                if (r2 == 0) goto L_0x0423
                r10 = 2
                r11 = 1
                java.lang.String r12 = "access$getLongPress$p"
                java.lang.String r13 = "access$setPreScale$p"
                java.lang.String r14 = "<get-galleyBg>(...)"
                java.lang.String r15 = "getGalleyBg"
                java.lang.String r9 = "access$getGalleyBg"
                java.lang.String r5 = "access$setScaled$p"
                if (r2 == r11) goto L_0x02f5
                if (r2 == r10) goto L_0x00c8
                r2 = r1
                r5 = 0
                r1 = r0
                goto L_0x043f
            L_0x00c8:
                ot2.h r2 = r6.f294253d
                android.view.VelocityTracker r2 = ot2.C100437h.m131460c3(r2)
                gy3.C87412m.m108591d(r2)
                r7 = 1000(0x3e8, float:1.401E-42)
                r2.computeCurrentVelocity(r7)
                float r7 = r2.getXVelocity()
                int r7 = (int) r7
                float r2 = r2.getYVelocity()
                int r2 = (int) r2
                ot2.h r10 = r6.f294253d
                android.view.View r10 = ot2.C100437h.m131463f3(r10)
                float r10 = r10.getTranslationX()
                ot2.h r11 = r6.f294253d
                android.view.View r11 = ot2.C100437h.m131463f3(r11)
                float r11 = r11.getTranslationY()
                r16 = r0
                ot2.h r0 = r6.f294253d
                r17 = r1
                int r1 = (int) r10
                r18 = r3
                java.lang.String r3 = "access$setPreDeltaX$p"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r0.f294250z = r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                ot2.h r0 = r6.f294253d
                int r1 = (int) r11
                java.lang.String r3 = "access$setPreDeltaY$p"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r0.f294230A = r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                ot2.h r1 = r6.f294253d
                boolean r1 = ot2.C100437h.m131462e3(r1)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r3 = 0
                r0[r3] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r10)
                r3 = 1
                r0[r3] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r11)
                r3 = 2
                r0[r3] = r1
                r1 = 3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
                r0[r1] = r3
                r1 = 4
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r0[r1] = r3
                java.lang.String r1 = "MicroMsg.SnsFakeVideoAniUIC"
                java.lang.String r3 = "scaled:%s, tx:%s, ty:%s, vx:%s, vy:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
                float r0 = java.lang.Math.abs(r10)
                r3 = 1132068864(0x437a0000, float:250.0)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 > 0) goto L_0x016a
                int r0 = java.lang.Math.abs(r2)
                int r3 = java.lang.Math.abs(r7)
                if (r0 <= r3) goto L_0x016a
                if (r2 <= 0) goto L_0x016a
                ot2.h r0 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r4)
                boolean r0 = r0.f294247w
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
                if (r0 == 0) goto L_0x0172
            L_0x016a:
                ot2.h r0 = r6.f294253d
                boolean r0 = ot2.C100437h.m131462e3(r0)
                if (r0 == 0) goto L_0x0277
            L_0x0172:
                r0 = 1
                float r3 = (float) r0
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131461d3(r0)
                int r0 = r0.getHeight()
                float r0 = (float) r0
                float r0 = r11 / r0
                float r3 = r3 - r0
                r0 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r7 <= 0) goto L_0x018a
                r3 = 1065353216(0x3f800000, float:1.0)
            L_0x018a:
                if (r2 <= 0) goto L_0x019c
                ot2.h r0 = r6.f294253d
                java.lang.String r7 = "access$getPreScale$p"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
                float r0 = r0.f294249y
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x019e
            L_0x019c:
                if (r2 >= 0) goto L_0x0269
            L_0x019e:
                r0 = r8
                double r7 = (double) r3
                r19 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                int r2 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
                if (r2 < 0) goto L_0x026a
                r2 = 1
                java.lang.Object[] r7 = new java.lang.Object[r2]
                java.lang.Float r2 = java.lang.Float.valueOf(r3)
                r8 = 0
                r7[r8] = r2
                java.lang.String r2 = "scale:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r7)
                ot2.h r1 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
                r1.f294249y = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
                ot2.h r1 = r6.f294253d
                android.view.View r1 = ot2.C100437h.m131463f3(r1)
                ot2.h r2 = r6.f294253d
                android.view.View r2 = ot2.C100437h.m131461d3(r2)
                int r2 = r2.getWidth()
                r7 = 2
                int r2 = r2 / r7
                float r2 = (float) r2
                r1.setPivotX(r2)
                ot2.h r1 = r6.f294253d
                android.view.View r1 = ot2.C100437h.m131463f3(r1)
                ot2.h r2 = r6.f294253d
                android.view.View r2 = ot2.C100437h.m131461d3(r2)
                int r2 = r2.getHeight()
                int r2 = r2 / r7
                float r2 = (float) r2
                r1.setPivotY(r2)
                ot2.h r1 = r6.f294253d
                android.view.View r1 = ot2.C100437h.m131463f3(r1)
                r1.setScaleX(r3)
                ot2.h r1 = r6.f294253d
                android.view.View r1 = ot2.C100437h.m131463f3(r1)
                r1.setScaleY(r3)
                ot2.h r1 = r6.f294253d
                android.view.View r1 = ot2.C100437h.m131463f3(r1)
                r1.setTranslationY(r11)
                ot2.h r1 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
                r1.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
                rx3.g r1 = r1.f294232e
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                gy3.C87412m.m108593f(r1, r14)
                android.view.View r1 = (android.view.View) r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r2.mo10233c(r3)
                java.lang.Object[] r20 = r2.mo10232b()
                java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r22 = "onTouch"
                java.lang.String r23 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r24 = "android/view/View_EXEC_"
                java.lang.String r25 = "setAlpha"
                java.lang.String r26 = "(F)V"
                r19 = r1
                j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r1.setAlpha(r2)
                java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r21 = "onTouch"
                java.lang.String r22 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setAlpha"
                java.lang.String r25 = "(F)V"
                j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
                goto L_0x026a
            L_0x0269:
                r0 = r8
            L_0x026a:
                ot2.h r1 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                r2 = 1
                r1.f294246v = r2
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                r2 = 0
                goto L_0x0283
            L_0x0277:
                r0 = r8
                ot2.h r1 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                r2 = 0
                r1.f294246v = r2
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            L_0x0283:
                r1 = 1128792064(0x43480000, float:200.0)
                int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x0294
                ot2.h r1 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
                r1.f294248x = r2
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
                goto L_0x02a5
            L_0x0294:
                r1 = 1092616192(0x41200000, float:10.0)
                int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x02a5
                ot2.h r1 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
                r2 = 1
                r1.f294248x = r2
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            L_0x02a5:
                r0 = 1112014848(0x42480000, float:50.0)
                r1 = 0
                int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x02b5
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131463f3(r0)
                r0.setOnLongClickListener(r1)
            L_0x02b5:
                ot2.h r0 = r6.f294253d
                android.view.VelocityTracker r0 = ot2.C100437h.m131460c3(r0)
                if (r0 == 0) goto L_0x02d5
                ot2.h r0 = r6.f294253d
                android.view.VelocityTracker r0 = ot2.C100437h.m131460c3(r0)
                gy3.C87412m.m108591d(r0)
                r0.recycle()
                ot2.h r0 = r6.f294253d
                r2 = r18
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
                r0.f294245u = r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            L_0x02d5:
                ot2.h r0 = r6.f294253d
                boolean r0 = ot2.C100437h.m131462e3(r0)
                r1 = r16
                r2 = r17
                if (r0 == 0) goto L_0x043e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r27
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            L_0x02f3:
                r0 = 1
                return r0
            L_0x02f5:
                r2 = r1
                r1 = r0
                ot2.h r0 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
                boolean r0 = r0.f294248x
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
                if (r0 == 0) goto L_0x03e9
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131463f3(r0)
                ot2.h r3 = r6.f294253d
                android.view.View r3 = ot2.C100437h.m131461d3(r3)
                int r3 = r3.getWidth()
                r7 = 2
                int r3 = r3 / r7
                float r3 = (float) r3
                r0.setPivotX(r3)
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131463f3(r0)
                ot2.h r3 = r6.f294253d
                android.view.View r3 = ot2.C100437h.m131461d3(r3)
                int r3 = r3.getHeight()
                int r3 = r3 / r7
                float r3 = (float) r3
                r0.setPivotY(r3)
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131463f3(r0)
                r3 = 1065353216(0x3f800000, float:1.0)
                r0.setScaleX(r3)
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131463f3(r0)
                r0.setScaleY(r3)
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131463f3(r0)
                r3 = 0
                r0.setTranslationX(r3)
                ot2.h r0 = r6.f294253d
                android.view.View r0 = ot2.C100437h.m131463f3(r0)
                r0.setTranslationY(r3)
                ot2.h r0 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
                r0.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
                rx3.g r0 = r0.f294232e
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                gy3.C87412m.m108593f(r0, r14)
                android.view.View r0 = (android.view.View) r0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                r7 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r8 = java.lang.Float.valueOf(r7)
                r3.mo10233c(r8)
                java.lang.Object[] r17 = r3.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r19 = "onTouch"
                java.lang.String r20 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setAlpha"
                java.lang.String r23 = "(F)V"
                r16 = r0
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                r7 = 0
                java.lang.Object r3 = r3.mo10231a(r7)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r0.setAlpha(r3)
                java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r18 = "onTouch"
                java.lang.String r19 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setAlpha"
                java.lang.String r22 = "(F)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                ot2.h r0 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
                r3 = 1065353216(0x3f800000, float:1.0)
                r0.f294249y = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
                ot2.h r0 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                r3 = 0
                r0.f294246v = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                ot2.h r0 = r6.f294253d
                ot2.C100437h.m131464g3(r0, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r27
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                goto L_0x02f3
            L_0x03e9:
                ot2.h r0 = r6.f294253d
                boolean r0 = ot2.C100437h.m131462e3(r0)
                if (r0 == 0) goto L_0x041c
                ot2.h r0 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r4)
                boolean r0 = r0.f294247w
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
                if (r0 != 0) goto L_0x041c
                ot2.h r0 = r6.f294253d
                r3 = 0
                r0.mo139928l3(r3)
                ot2.h r0 = r6.f294253d
                ot2.C100437h.m131464g3(r0, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r27
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                goto L_0x02f3
            L_0x041c:
                ot2.h r0 = r6.f294253d
                r3 = 0
                ot2.C100437h.m131464g3(r0, r3)
                goto L_0x043e
            L_0x0423:
                r2 = r1
                r1 = r0
                r0 = r8
                ot2.h r3 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
                boolean r3 = r3.f294248x
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
                if (r3 == 0) goto L_0x043e
                ot2.h r3 = r6.f294253d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
                r5 = 0
                r3.f294248x = r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
                goto L_0x043f
            L_0x043e:
                r5 = 0
            L_0x043f:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r27
                r8 = 0
                r5 = r7
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ot2.C100437h.C100440c.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: ot2.h$d */
    public static final class C100441d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C100437h f294254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100441d(C100437h hVar) {
            super(0);
            this.f294254d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$root$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$root$2");
            View findViewById = this.f294254d.findViewById(C0966R.C0970id.mys);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$root$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$root$2");
            return findViewById;
        }
    }

    /* renamed from: ot2.h$e */
    public static final class C100442e implements C45059m0.C45068i {

        /* renamed from: a */
        public final /* synthetic */ C100437h f294255a;

        /* renamed from: b */
        public final /* synthetic */ boolean f294256b;

        /* renamed from: ot2.h$e$a */
        public static final class C100443a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C100437h f294257d;

            /* renamed from: e */
            public final /* synthetic */ boolean f294258e;

            public C100443a(C100437h hVar, boolean z) {
                this.f294257d = hVar;
                this.f294258e = z;
            }

            public final void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1$onAnimationEnd$1");
                C100437h hVar = this.f294257d;
                SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
                boolean z = hVar.f294240p;
                SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
                if (z) {
                    Intent intent = new Intent();
                    intent.putExtra("sns_update_preview_video_del", this.f294258e);
                    this.f294257d.getActivity().setResult(-1, intent);
                }
                this.f294257d.getActivity().finish();
                this.f294257d.getActivity().overridePendingTransition(0, 0);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1$onAnimationEnd$1");
            }
        }

        public C100442e(C100437h hVar, boolean z) {
            this.f294255a = hVar;
            this.f294256b = z;
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
            new MMHandler().post(new C100443a(this.f294255a, this.f294256b));
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
        }
    }

    /* renamed from: ot2.h$f */
    public static final class C100444f extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C100437h f294259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100444f(C100437h hVar) {
            super(0);
            this.f294259d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$thumbView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$thumbView$2");
            ImageView imageView = (ImageView) this.f294259d.findViewById(C0966R.C0970id.myp);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$thumbView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$thumbView$2");
            return imageView;
        }
    }

    /* renamed from: ot2.h$g */
    public static final class C100445g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C100437h f294260d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100445g(C100437h hVar) {
            super(0);
            this.f294260d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$videoContainer$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$videoContainer$2");
            View findViewById = this.f294260d.findViewById(C0966R.C0970id.myq);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$videoContainer$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$videoContainer$2");
            return findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100437h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final /* synthetic */ VelocityTracker m131460c3(C100437h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getMVelocityTracker$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        VelocityTracker velocityTracker = hVar.f294245u;
        SnsMethodCalculate.markEndTimeMs("access$getMVelocityTracker$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return velocityTracker;
    }

    /* renamed from: d3 */
    public static final /* synthetic */ View m131461d3(C100437h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        View i3 = hVar.mo139925i3();
        SnsMethodCalculate.markEndTimeMs("access$getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return i3;
    }

    /* renamed from: e3 */
    public static final /* synthetic */ boolean m131462e3(C100437h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getScaled$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        boolean z = hVar.f294246v;
        SnsMethodCalculate.markEndTimeMs("access$getScaled$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return z;
    }

    /* renamed from: f3 */
    public static final /* synthetic */ View m131463f3(C100437h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        View k3 = hVar.mo139927k3();
        SnsMethodCalculate.markEndTimeMs("access$getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return k3;
    }

    /* renamed from: g3 */
    public static final /* synthetic */ void m131464g3(C100437h hVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$setLongPress$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        hVar.f294247w = z;
        SnsMethodCalculate.markEndTimeMs("access$setLongPress$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }

    /* renamed from: i3 */
    public final View mo139925i3() {
        SnsMethodCalculate.markStartTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        Object value = ((C36570n) this.f294231d).getValue();
        C87412m.m108593f(value, "<get-root>(...)");
        View view = (View) value;
        SnsMethodCalculate.markEndTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return view;
    }

    /* renamed from: j3 */
    public final ImageView mo139926j3() {
        SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        Object value = ((C36570n) this.f294234g).getValue();
        C87412m.m108593f(value, "<get-thumbView>(...)");
        ImageView imageView = (ImageView) value;
        SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return imageView;
    }

    /* renamed from: k3 */
    public final View mo139927k3() {
        SnsMethodCalculate.markStartTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        Object value = ((C36570n) this.f294233f).getValue();
        C87412m.m108593f(value, "<get-videoContainer>(...)");
        View view = (View) value;
        SnsMethodCalculate.markEndTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return view;
    }

    /* renamed from: l3 */
    public final void mo139928l3(boolean z) {
        int i;
        SnsMethodCalculate.markStartTimeMs("runExitAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        Log.m105924i("MicroMsg.SnsFakeVideoAniUIC", "runExitAni >> " + this.f294241q);
        int width = mo139925i3().getWidth();
        int height = mo139925i3().getHeight();
        int i2 = this.f294238n;
        if (!(i2 == 0 || (i = this.f294239o) == 0)) {
            height = (int) ((((float) width) / ((float) i2)) * ((float) i));
        }
        C45059m0 m0Var = this.f294235h;
        if (m0Var != null) {
            m0Var.f122226f = width;
            m0Var.f122227g = height;
            m0Var.mo70410e(this.f294236i, this.f294237j, i2, this.f294239o);
            if (!(((double) this.f294249y) == 1.0d)) {
                C45059m0 m0Var2 = this.f294235h;
                C87412m.m108591d(m0Var2);
                float f = (float) 1;
                m0Var2.f122234n = f / this.f294249y;
                if (!(this.f294250z == 0 && this.f294230A == 0)) {
                    int width2 = ((int) (((float) (mo139925i3().getWidth() / 2)) * (f - this.f294249y))) + this.f294250z;
                    int height2 = (int) (((float) ((mo139925i3().getHeight() / 2) + this.f294230A)) - (((float) (height / 2)) * this.f294249y));
                    C45059m0 m0Var3 = this.f294235h;
                    C87412m.m108591d(m0Var3);
                    m0Var3.f122235o = width2;
                    m0Var3.f122236p = height2;
                }
            }
            View k3 = mo139927k3();
            SnsMethodCalculate.markStartTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            Object value = ((C36570n) this.f294232e).getValue();
            C87412m.m108593f(value, "<get-galleyBg>(...)");
            SnsMethodCalculate.markEndTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            m0Var.mo70409d(k3, (View) value, new C100442e(this, z), (C45059m0.C45066g) null);
        }
        SnsMethodCalculate.markEndTimeMs("runExitAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        super.onCreate(bundle);
        this.f294236i = getIntent().getIntExtra("intent_left", 0);
        this.f294237j = getIntent().getIntExtra("intent_top", 0);
        this.f294239o = getIntent().getIntExtra("intent_height", 0);
        this.f294238n = getIntent().getIntExtra("intent_width", 0);
        this.f294240p = getIntent().getBooleanExtra("intent_video_is_preview", false);
        String stringExtra = getIntent().getStringExtra("intent_video_thumb_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f294242r = stringExtra;
        this.f294235h = new C45059m0(getActivity());
        Log.m105924i("MicroMsg.SnsFakeVideoAniUIC", "thumbPath >> " + this.f294242r);
        mo139926j3().setImageBitmap(BackwardSupportUtil.BitmapFactory.decodeFile(this.f294242r, 1.0f));
        SnsMethodCalculate.markStartTimeMs("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        Log.m105924i("MicroMsg.SnsFakeVideoAniUIC", "runEnterAni >> " + this.f294241q);
        if (this.f294241q) {
            SnsMethodCalculate.markEndTimeMs("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        } else {
            this.f294241q = true;
            C45059m0 m0Var = this.f294235h;
            if (m0Var != null) {
                m0Var.mo70410e(this.f294236i, this.f294237j, this.f294238n, this.f294239o);
                ViewTreeObserver viewTreeObserver = mo139927k3().getViewTreeObserver();
                C87412m.m108593f(viewTreeObserver, "videoContainer.viewTreeObserver");
                viewTreeObserver.addOnPreDrawListener(new C100446i(this, m0Var));
            }
            SnsMethodCalculate.markEndTimeMs("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        }
        if (!this.f294240p) {
            this.f294244t = new GestureDetector(getActivity(), new C100439b(this));
            mo139927k3().setOnTouchListener(new C100440c(this));
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }
}
