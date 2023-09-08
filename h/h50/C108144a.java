package h50;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorEventListener;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: h50.a */
public class C108144a {

    /* renamed from: u */
    public static final float f323822u = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public float[] f323823a = new float[16];

    /* renamed from: b */
    public float[] f323824b = new float[16];

    /* renamed from: c */
    public float[] f323825c = new float[16];

    /* renamed from: d */
    public float[] f323826d = new float[16];

    /* renamed from: e */
    public float[] f323827e = new float[16];

    /* renamed from: f */
    public float[] f323828f;

    /* renamed from: g */
    public boolean f323829g;

    /* renamed from: h */
    public GestureDetector f323830h;

    /* renamed from: i */
    public float f323831i;

    /* renamed from: j */
    public float f323832j;

    /* renamed from: k */
    public boolean f323833k;

    /* renamed from: l */
    public SensorEventListener f323834l;

    /* renamed from: m */
    public float f323835m;

    /* renamed from: n */
    public float f323836n;

    /* renamed from: o */
    public float f323837o;

    /* renamed from: p */
    public float f323838p;

    /* renamed from: q */
    public int f323839q;

    /* renamed from: r */
    public int f323840r;

    /* renamed from: s */
    public float f323841s;

    /* renamed from: t */
    public float f323842t;

    /* renamed from: h50.a$a */
    public class C108145a extends GestureDetector.SimpleOnGestureListener {
        public C108145a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C108144a aVar = C108144a.this;
            if (!aVar.f323829g) {
                return false;
            }
            aVar.getClass();
            C108144a aVar2 = C108144a.this;
            float f3 = aVar2.f323835m;
            float f4 = C108144a.f323822u;
            float f5 = f3 - ((((f / 1.0f) * 1.0f) / f4) * 0.2f);
            float f6 = aVar2.f323836n - ((((f2 / 1.0f) * 1.0f) / f4) * 0.2f);
            if (!aVar2.f323829g) {
                return true;
            }
            aVar2.f323835m = f5;
            aVar2.f323836n = f6;
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    public C108144a(Context context) {
        float[] fArr = new float[16];
        this.f323828f = fArr;
        this.f323829g = false;
        this.f323830h = null;
        this.f323831i = 35.0f;
        this.f323832j = 35.0f;
        this.f323833k = false;
        this.f323835m = 0.0f;
        this.f323836n = 0.0f;
        this.f323837o = 1.0f;
        this.f323838p = -1.0f;
        this.f323841s = 0.0f;
        this.f323842t = 0.0f;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(this.f323825c, 0);
        Matrix.setLookAtM(this.f323826d, 0, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.frustumM(this.f323827e, 0, -1.0f, 1.0f, -1.0f, 1.0f, 1.4f, 500.0f);
        this.f323830h = new GestureDetector(context, new C108145a());
    }

    /* renamed from: a */
    public static float m146484a(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(Math.pow((double) (f - f3), 2.0d) + Math.pow((double) (f2 - f4), 2.0d));
    }
}
