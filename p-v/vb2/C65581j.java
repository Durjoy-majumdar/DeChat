package vb2;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import j20.C117292a;
import k20.C9556a;

/* renamed from: vb2.j */
public class C65581j {

    /* renamed from: a */
    public final Context f188704a;

    /* renamed from: b */
    public final C65582a f188705b;

    /* renamed from: c */
    public boolean f188706c;

    /* renamed from: d */
    public float f188707d;

    /* renamed from: e */
    public float f188708e;

    /* renamed from: f */
    public float f188709f;

    /* renamed from: g */
    public boolean f188710g;

    /* renamed from: h */
    public int f188711h;

    /* renamed from: i */
    public int f188712i;

    /* renamed from: j */
    public float f188713j;

    /* renamed from: k */
    public float f188714k;

    /* renamed from: l */
    public int f188715l = 0;

    /* renamed from: m */
    public GestureDetector f188716m;

    /* renamed from: n */
    public boolean f188717n;

    /* renamed from: vb2.j$a */
    public interface C65582a {
        /* renamed from: a */
        boolean mo80693a(C65581j jVar);

        /* renamed from: b */
        boolean mo80694b(C65581j jVar);

        /* renamed from: c */
        void mo80695c(C65581j jVar);
    }

    public C65581j(Context context, C65582a aVar) {
        this.f188704a = context;
        this.f188705b = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f188711h = viewConfiguration.getScaledTouchSlop() * 2;
        this.f188712i = viewConfiguration.getScaledTouchSlop() * 4;
        if (context.getApplicationInfo().targetSdkVersion > 18) {
            this.f188706c = true;
            if (this.f188716m == null) {
                this.f188716m = new GestureDetector(context, new C65580i(this), (Handler) null);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo89656a() {
        return this.f188715l != 0;
    }

    /* renamed from: b */
    public boolean mo89657b(MotionEvent motionEvent) {
        float f;
        float f2;
        MotionEvent motionEvent2 = motionEvent;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f188706c) {
            GestureDetector gestureDetector = this.f188716m;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent2);
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/widget/ScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/mv/ui/widget/ScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z = this.f188715l == 2;
        boolean z2 = actionMasked == 1 || actionMasked == 3 || z;
        float f3 = 0.0f;
        if (actionMasked == 0 || z2) {
            if (this.f188710g) {
                this.f188705b.mo80695c(this);
                this.f188710g = false;
                this.f188709f = 0.0f;
                this.f188715l = 0;
            } else if (mo89656a() && z2) {
                this.f188710g = false;
                this.f188709f = 0.0f;
                this.f188715l = 0;
            }
            if (z2) {
                return true;
            }
        }
        boolean z3 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z;
        boolean z4 = actionMasked == 6;
        int actionIndex = z4 ? motionEvent.getActionIndex() : -1;
        int i = z4 ? pointerCount - 1 : pointerCount;
        if (mo89656a()) {
            f2 = this.f188713j;
            f = this.f188714k;
            if (motionEvent.getY() < f) {
                this.f188717n = true;
            } else {
                this.f188717n = false;
            }
        } else {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (actionIndex != i2) {
                    f4 += motionEvent2.getX(i2);
                    f5 += motionEvent2.getY(i2);
                }
            }
            float f6 = (float) i;
            float f7 = f4 / f6;
            f = f5 / f6;
            f2 = f7;
        }
        float f8 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                f3 += Math.abs(motionEvent2.getX(i3) - f2);
                f8 += Math.abs(motionEvent2.getY(i3) - f);
            }
        }
        float f9 = (float) i;
        float f15 = (f3 / f9) * 2.0f;
        float f16 = (f8 / f9) * 2.0f;
        if (!mo89656a()) {
            f16 = (float) Math.hypot((double) f15, (double) f16);
        }
        boolean z5 = this.f188710g;
        if (!mo89656a() && this.f188710g && (f16 < ((float) this.f188712i) || z3)) {
            this.f188705b.mo80695c(this);
            this.f188710g = false;
            this.f188709f = f16;
        }
        if (z3) {
            this.f188707d = f16;
            this.f188708e = f16;
            this.f188709f = f16;
        }
        int i4 = mo89656a() ? this.f188711h : this.f188712i;
        if (!this.f188710g && f16 >= ((float) i4) && (z5 || Math.abs(f16 - this.f188709f) > ((float) this.f188711h))) {
            this.f188707d = f16;
            this.f188708e = f16;
            this.f188710g = this.f188705b.mo80694b(this);
        }
        if (actionMasked == 2) {
            this.f188707d = f16;
            if (this.f188710g ? this.f188705b.mo80693a(this) : true) {
                this.f188708e = this.f188707d;
            }
        }
        return true;
    }
}
