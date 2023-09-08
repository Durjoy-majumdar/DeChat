package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.EmbedWebView */
public class EmbedWebView extends MMWebView {

    /* renamed from: t */
    public GestureDetector f115836t = new GestureDetector(new C42787a());

    /* renamed from: u */
    public boolean f115837u = false;

    /* renamed from: v */
    public float[] f115838v = new float[2];

    /* renamed from: w */
    public float[] f115839w = new float[2];

    /* renamed from: x */
    public float[] f115840x = new float[2];

    /* renamed from: y */
    public float[] f115841y = new float[2];

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.EmbedWebView$a */
    public class C42787a extends GestureDetector.SimpleOnGestureListener {
        public C42787a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            EmbedWebView embedWebView = EmbedWebView.this;
            Log.m105918d("MicroMsg.EmbedWebView", "onDoubleTapm, before scale:" + embedWebView.getScale());
            int i = 10;
            while (embedWebView.getScale() != 1.0f && i - 1 > 0) {
                if (embedWebView.getScale() > 1.0f) {
                    embedWebView.zoomOut();
                } else {
                    embedWebView.zoomIn();
                }
            }
            Log.m105918d("MicroMsg.EmbedWebView", "onDoubleTapm, after scale:" + EmbedWebView.this.getScale());
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/qqmail/ui/EmbedWebView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.EmbedWebView$b */
    public class C42788b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.EmbedWebView$b$a */
        public class C42789a implements View.OnTouchListener {
            public C42789a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/EmbedWebView$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getPointerCount() == 2) {
                    EmbedWebView.this.onTouchEvent(motionEvent);
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/qqmail/ui/EmbedWebView$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        public C42788b() {
        }

        public void run() {
            View view;
            View view2 = (View) EmbedWebView.this.getParent();
            if (view2 != null && (view = (View) view2.getParent()) != null && (view instanceof ScrollView)) {
                EmbedWebView.this.f115837u = true;
                view.setOnTouchListener(new C42789a());
            }
        }
    }

    public EmbedWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        postDelayed(new C42788b(), 100);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f115836t;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/EmbedWebView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int i = 0;
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/qqmail/ui/EmbedWebView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.f115837u) {
            int action = motionEvent.getAction() & 255;
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount == 2) {
                if (action == 2) {
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        this.f115840x[i2] = motionEvent.getX(i2);
                        this.f115841y[i2] = motionEvent.getY(i2);
                    }
                    float[] fArr = this.f115838v;
                    double pow = Math.pow((double) (fArr[1] - fArr[0]), 2.0d);
                    float[] fArr2 = this.f115839w;
                    float pow2 = (float) (pow + Math.pow((double) (fArr2[1] - fArr2[0]), 2.0d));
                    float[] fArr3 = this.f115840x;
                    double pow3 = Math.pow((double) (fArr3[1] - fArr3[0]), 2.0d);
                    float[] fArr4 = this.f115841y;
                    float pow4 = (float) (pow3 + Math.pow((double) (fArr4[1] - fArr4[0]), 2.0d));
                    if (pow2 - pow4 > 20000.0f) {
                        zoomOut();
                    } else if (pow4 - pow2 > 20000.0f) {
                        zoomIn();
                    }
                    float[] fArr5 = this.f115838v;
                    float[] fArr6 = this.f115840x;
                    fArr5[0] = fArr6[0];
                    fArr5[1] = fArr6[1];
                    float[] fArr7 = this.f115839w;
                    float[] fArr8 = this.f115841y;
                    fArr7[0] = fArr8[0];
                    fArr7[1] = fArr8[1];
                } else if (action == 5) {
                    while (i < pointerCount) {
                        this.f115838v[i] = motionEvent.getX(i);
                        this.f115839w[i] = motionEvent.getY(i);
                        i++;
                    }
                }
                i = 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
