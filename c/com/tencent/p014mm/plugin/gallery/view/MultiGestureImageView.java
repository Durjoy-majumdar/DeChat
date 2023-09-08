package com.tencent.p014mm.plugin.gallery.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C109752f;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView */
public class MultiGestureImageView extends LinearLayout {

    /* renamed from: d */
    public MultiTouchImageView f346121d;

    /* renamed from: e */
    public int f346122e = 0;

    /* renamed from: f */
    public long f346123f = 0;

    /* renamed from: g */
    public long f346124g = 0;

    /* renamed from: h */
    public float f346125h = 0.0f;

    /* renamed from: i */
    public float f346126i = 0.0f;

    /* renamed from: j */
    public boolean f346127j = false;

    /* renamed from: n */
    public OverScroller f346128n;

    /* renamed from: o */
    public GestureDetector f346129o;

    /* renamed from: p */
    public int f346130p;

    /* renamed from: q */
    public int f346131q;

    /* renamed from: r */
    public RectF f346132r = new RectF();

    /* renamed from: s */
    public float f346133s;

    /* renamed from: t */
    public float f346134t;

    /* renamed from: u */
    public C115450f f346135u;

    /* renamed from: v */
    public C115450f f346136v;

    /* renamed from: w */
    public C115450f f346137w;

    /* renamed from: x */
    public int f346138x;

    /* renamed from: y */
    public int f346139y;

    /* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView$b */
    public abstract class C41656b {
        /* renamed from: a */
        public abstract void mo64872a();
    }

    /* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView$c */
    public interface C41657c {
        /* renamed from: a */
        void mo64873a();
    }

    /* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView$d */
    public class C41658d extends GestureDetector.SimpleOnGestureListener {
        public C41658d(MultiGestureImageView multiGestureImageView, C41655a aVar) {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/gallery/view/MultiGestureImageView$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView$e */
    public interface C41659e {
        /* renamed from: a */
        void mo64878a();
    }

    /* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView$f */
    public class C115450f extends MMHandler {

        /* renamed from: a */
        public WeakReference<MultiGestureImageView> f346140a;

        /* renamed from: b */
        public long f346141b;

        /* renamed from: c */
        public boolean f346142c;

        /* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView$f$a */
        public class C115451a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MultiGestureImageView f346144d;

            public C115451a(C115450f fVar, MultiGestureImageView multiGestureImageView) {
                this.f346144d = multiGestureImageView;
            }

            public void run() {
                this.f346144d.getClass();
                throw null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView$f$b */
        public class C115452b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MultiGestureImageView f346145d;

            public C115452b(C115450f fVar, MultiGestureImageView multiGestureImageView) {
                this.f346145d = multiGestureImageView;
            }

            public void run() {
                this.f346145d.getClass();
                throw null;
            }
        }

        public C115450f(WeakReference<MultiGestureImageView> weakReference) {
            this.f346140a = weakReference;
        }

        public void handleMessage(Message message) {
            MultiGestureImageView multiGestureImageView;
            super.handleMessage(message);
            removeMessages(message.what);
            WeakReference<MultiGestureImageView> weakReference = this.f346140a;
            if (weakReference != null && (multiGestureImageView = weakReference.get()) != null) {
                int i = message.what;
                if (i == 0) {
                    if (multiGestureImageView.f346122e == 1 || this.f346142c) {
                        Log.m105918d("MicroMsg.MultiGestureImageView", "single click over!");
                        multiGestureImageView.getClass();
                    }
                    MultiGestureImageView.this.f346122e = 0;
                } else if (i == 1) {
                    MultiGestureImageView.this.getClass();
                    multiGestureImageView.f346135u.removeMessages(1);
                } else {
                    removeMessages(2);
                    multiGestureImageView.getClass();
                }
            }
        }
    }

    public MultiGestureImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo175371a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo175371a(Context context, AttributeSet attributeSet) {
        this.f346121d = new MultiTouchImageView(context, attributeSet);
        this.f346129o = new GestureDetector(context, new C41658d(this, (C41655a) null));
        this.f346128n = new OverScroller(context, new DecelerateInterpolator(2.0f));
        this.f346121d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        addView(this.f346121d);
        this.f346135u = new C115450f(new WeakReference(this));
        this.f346136v = new C115450f(new WeakReference(this));
        this.f346137w = new C115450f(new WeakReference(this));
    }

    public void computeScroll() {
        if (this.f346121d != null && this.f346128n.computeScrollOffset()) {
            int currX = this.f346128n.getCurrX() - this.f346130p;
            int currY = this.f346128n.getCurrY() - this.f346131q;
            this.f346130p = this.f346128n.getCurrX();
            this.f346131q = this.f346128n.getCurrY();
            float scale = this.f346121d.getScale();
            float imageWidth = ((float) this.f346121d.getImageWidth()) * scale;
            float imageHeight = scale * ((float) this.f346121d.getImageHeight());
            float[] fArr = new float[9];
            this.f346121d.getImageMatrix().getValues(fArr);
            float f = fArr[2];
            float f2 = imageWidth + f;
            float f3 = fArr[5];
            float f4 = f3 + imageHeight;
            if (currX < 0 && ((float) currX) < this.f346132r.right - ((float) Math.round(f2))) {
                currX = (int) (this.f346132r.right - ((float) Math.round(f2)));
            }
            if (currX > 0 && ((float) currX) > this.f346132r.left - ((float) Math.round(f))) {
                currX = (int) (this.f346132r.left - ((float) Math.round(f)));
            }
            if (currY < 0 && ((float) currY) < this.f346132r.bottom - ((float) Math.round(f4))) {
                currY = (int) (this.f346132r.bottom - ((float) Math.round(f4)));
            }
            if (currY > 0 && ((float) currY) > this.f346132r.top - ((float) Math.round(f3))) {
                currY = (int) (this.f346132r.top - ((float) Math.round(f3)));
            }
            int i = 0;
            if (((float) Math.round(f)) >= this.f346132r.left || ((float) Math.round(f2)) <= this.f346132r.right) {
                currX = 0;
            } else if (((float) Math.round(f3)) >= this.f346132r.top || ((float) Math.round(f4)) <= this.f346132r.bottom) {
                currY = 0;
            }
            if (imageHeight >= ((float) this.f346139y)) {
                i = currY;
            }
            this.f346121d.mo26056a((float) currX, (float) i);
            postInvalidate();
        }
    }

    public int getImageHeight() {
        return this.f346121d.getImageHeight();
    }

    public int getImageWidth() {
        return this.f346121d.getImageWidth();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f346138x = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f346139y = size;
        this.f346132r.set(0.0f, 0.0f, (float) this.f346138x, (float) size);
        Log.m105926v("MicroMsg.MultiGestureImageView", "MMGestureGallery width:" + this.f346138x + " height:" + this.f346139y);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        GestureDetector gestureDetector = this.f346129o;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent2);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/view/MultiGestureImageView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/gallery/view/MultiGestureImageView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 0) {
            this.f346128n.forceFinished(true);
            this.f346137w.removeMessages(2);
            C115450f fVar = this.f346137w;
            fVar.f346141b = 0;
            fVar.sendEmptyMessageDelayed(2, 500);
            this.f346121d.mo26076o();
            int i = this.f346122e + 1;
            this.f346122e = i;
            if (i == 1) {
                this.f346123f = System.currentTimeMillis();
                this.f346125h = C109752f.m149072b(motionEvent2, 0);
                this.f346126i = C109752f.m149073c(motionEvent2, 0);
            } else if (i == 2) {
                if (System.currentTimeMillis() - this.f346124g >= 350) {
                    this.f346122e = 1;
                } else if (Math.abs(this.f346125h - C109752f.m149072b(motionEvent2, 0)) >= 35.0f || Math.abs(this.f346126i - C109752f.m149073c(motionEvent2, 0)) >= 35.0f) {
                    this.f346122e = 1;
                } else {
                    this.f346122e = 0;
                    Log.m105918d("MicroMsg.MultiGestureImageView", "double click!");
                    if (this.f346121d.getScale() <= this.f346121d.getScaleRate()) {
                        this.f346121d.mo26075n(C109752f.m149072b(motionEvent2, 0), C109752f.m149073c(motionEvent2, 0));
                    } else {
                        this.f346121d.mo26072k(C109752f.m149072b(motionEvent2, 0), C109752f.m149073c(motionEvent2, 0));
                        this.f346121d.mo26058c();
                    }
                }
            }
        }
        if (motionEvent.getAction() == 6 || motionEvent.getAction() == 262) {
            this.f346137w.removeMessages(2);
            this.f346134t = 0.0f;
            float scale = this.f346121d.getScale();
            this.f346133s = scale;
            this.f346127j = true;
            if (scale < this.f346121d.getScaleRate()) {
                this.f346121d.mo26072k((C109752f.m149072b(motionEvent2, 0) - C109752f.m149072b(motionEvent2, 1)) + C109752f.m149072b(motionEvent2, 1), (C109752f.m149073c(motionEvent2, 0) - C109752f.m149073c(motionEvent2, 1)) + C109752f.m149073c(motionEvent2, 1));
            }
            if (this.f346133s > this.f346121d.getDoubleTabScale()) {
                this.f346121d.mo26075n((C109752f.m149072b(motionEvent2, 0) - C109752f.m149072b(motionEvent2, 1)) + C109752f.m149072b(motionEvent2, 1), (C109752f.m149073c(motionEvent2, 0) - C109752f.m149073c(motionEvent2, 1)) + C109752f.m149073c(motionEvent2, 1));
            }
        }
        if (motionEvent.getAction() == 1) {
            this.f346137w.removeMessages(2);
            this.f346134t = 0.0f;
            this.f346133s = this.f346121d.getScale();
            if (this.f346122e == 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f346124g = currentTimeMillis;
                String str = "MicroMsg.MultiGestureImageView";
                if (currentTimeMillis - this.f346123f >= 350) {
                    this.f346122e = 0;
                    Log.m105918d(str, "single long click over!");
                } else if (Math.abs(this.f346125h - C109752f.m149072b(motionEvent2, 0)) < 10.0f && Math.abs(this.f346126i - C109752f.m149073c(motionEvent2, 0)) < 10.0f) {
                    C115450f fVar2 = this.f346136v;
                    fVar2.f346142c = false;
                    fVar2.f346141b = 0;
                    fVar2.sendEmptyMessageDelayed(0, 350);
                }
            }
        }
        if (motionEvent.getAction() == 5 || motionEvent.getAction() == 261) {
            this.f346134t = 0.0f;
            this.f346133s = this.f346121d.getScale();
            this.f346127j = true;
        }
        if (motionEvent.getAction() == 2) {
            if (motionEvent.getPointerCount() == 2) {
                this.f346137w.removeMessages(2);
                this.f346127j = true;
                this.f346122e = 0;
                float b = C109752f.m149072b(motionEvent2, 0) - C109752f.m149072b(motionEvent2, 1);
                float c = C109752f.m149073c(motionEvent2, 0) - C109752f.m149073c(motionEvent2, 1);
                float sqrt = (float) Math.sqrt((double) ((b * b) + (c * c)));
                float f = this.f346134t;
                if (f == 0.0f) {
                    this.f346134t = sqrt;
                } else {
                    float f2 = sqrt / f;
                    if (this.f346127j) {
                        this.f346121d.mo26073l(this.f346133s * f2, b + C109752f.m149072b(motionEvent2, 1), c + C109752f.m149073c(motionEvent2, 1));
                        this.f346121d.mo26058c();
                    }
                }
            } else if (Math.abs(this.f346125h - C109752f.m149072b(motionEvent2, 0)) > 10.0f || Math.abs(this.f346126i - C109752f.m149073c(motionEvent2, 0)) > 10.0f) {
                this.f346137w.removeMessages(2);
                this.f346122e = 0;
                computeScroll();
            }
        }
        return true;
    }

    public void setEnableHorLongBmpMode(boolean z) {
        this.f346121d.setEnableHorLongBmpMode(z);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f346121d.setImageBitmap(bitmap);
        this.f346121d.mo26059d();
    }

    public void setImageHeight(int i) {
        this.f346121d.setImageHeight(i);
    }

    public void setImageWidth(int i) {
        this.f346121d.setImageWidth(i);
    }

    public void setLongClickOverListener(C41657c cVar) {
    }

    public void setSingleClickOverListener(C41659e eVar) {
    }

    public MultiGestureImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo175371a(context, attributeSet);
    }
}
