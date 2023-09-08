package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.util.WXWebReporter;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.SliderSeekBar */
public class SliderSeekBar extends View {

    /* renamed from: A */
    public Rect f315242A;

    /* renamed from: B */
    public Rect f315243B;

    /* renamed from: C */
    public boolean f315244C;

    /* renamed from: D */
    public View.OnTouchListener f315245D;

    /* renamed from: d */
    public boolean f315246d;

    /* renamed from: e */
    public boolean f315247e;

    /* renamed from: f */
    public int f315248f;

    /* renamed from: g */
    public int f315249g;

    /* renamed from: h */
    public boolean f315250h;

    /* renamed from: i */
    public boolean f315251i;

    /* renamed from: j */
    public Drawable f315252j;

    /* renamed from: n */
    public Drawable f315253n;

    /* renamed from: o */
    public int f315254o;

    /* renamed from: p */
    public int f315255p;

    /* renamed from: q */
    public float f315256q;

    /* renamed from: r */
    public Paint f315257r;

    /* renamed from: s */
    public Paint f315258s;

    /* renamed from: t */
    public int f315259t;

    /* renamed from: u */
    public float f315260u;

    /* renamed from: v */
    public Paint f315261v;

    /* renamed from: w */
    public Paint f315262w;

    /* renamed from: x */
    public float f315263x;

    /* renamed from: y */
    public int f315264y;

    /* renamed from: z */
    public int f315265z;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.SliderSeekBar$b */
    public interface C57123b {
        /* renamed from: a */
        void mo80642a(boolean z);

        /* renamed from: b */
        void mo80643b(boolean z);

        /* renamed from: c */
        void mo80644c(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.SliderSeekBar$a */
    public class C105937a implements View.OnTouchListener {

        /* renamed from: d */
        public int f315266d = -1;

        /* renamed from: e */
        public int f315267e = -1;

        /* renamed from: f */
        public int f315268f;

        /* renamed from: g */
        public int f315269g;

        /* renamed from: h */
        public float f315270h;

        /* renamed from: i */
        public float f315271i;

        public C105937a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (!SliderSeekBar.this.f315246d) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked != 6) {
                                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                                    return false;
                                }
                            }
                        }
                    } else if (!SliderSeekBar.this.mo151142e(true) && !SliderSeekBar.this.mo151142e(false)) {
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    } else if (SliderSeekBar.this.f315247e) {
                        C117292a.m165362h(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    } else {
                        this.f315269g = 0;
                        boolean z = false;
                        while (this.f315269g < motionEvent.getPointerCount()) {
                            int pointerId = motionEvent.getPointerId(this.f315269g);
                            this.f315268f = pointerId;
                            int i = this.f315266d;
                            if (pointerId == i || pointerId == this.f315267e) {
                                boolean f = SliderSeekBar.this.mo151143f(pointerId == i, motionEvent.getX(this.f315269g));
                                SliderSeekBar sliderSeekBar = SliderSeekBar.this;
                                if (sliderSeekBar.f315251i && f && !sliderSeekBar.f315250h) {
                                    sliderSeekBar.performHapticFeedback(0, 2);
                                }
                                SliderSeekBar sliderSeekBar2 = SliderSeekBar.this;
                                sliderSeekBar2.f315250h = f;
                                sliderSeekBar2.getClass();
                                z = true;
                            }
                            this.f315269g++;
                        }
                        C117292a.m165362h(z, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return z;
                    }
                }
                int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f315268f = pointerId2;
                if (pointerId2 == this.f315266d || pointerId2 == this.f315267e) {
                    SliderSeekBar.this.getClass();
                    SliderSeekBar.m142465a(SliderSeekBar.this, this.f315268f == this.f315266d, false);
                    if (this.f315268f == this.f315266d) {
                        this.f315266d = -1;
                    } else {
                        this.f315267e = -1;
                    }
                    SliderSeekBar.this.f315250h = false;
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            int actionIndex = motionEvent.getActionIndex();
            this.f315269g = actionIndex;
            this.f315268f = motionEvent.getPointerId(actionIndex);
            this.f315270h = motionEvent.getX(this.f315269g);
            float y = motionEvent.getY(this.f315269g);
            this.f315271i = y;
            SliderSeekBar sliderSeekBar3 = SliderSeekBar.this;
            if (!SliderSeekBar.m142466b(sliderSeekBar3, sliderSeekBar3.f315252j, this.f315270h, y)) {
                SliderSeekBar sliderSeekBar4 = SliderSeekBar.this;
                if (!SliderSeekBar.m142466b(sliderSeekBar4, sliderSeekBar4.f315253n, this.f315270h, this.f315271i)) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else if (SliderSeekBar.this.mo151142e(false)) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else {
                    SliderSeekBar.this.getClass();
                    this.f315267e = this.f315268f;
                    SliderSeekBar sliderSeekBar5 = SliderSeekBar.this;
                    int i2 = sliderSeekBar5.f315253n.getBounds().right;
                    sliderSeekBar5.getClass();
                    SliderSeekBar.m142465a(SliderSeekBar.this, false, true);
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            } else if (SliderSeekBar.this.mo151142e(true)) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                SliderSeekBar.this.getClass();
                this.f315266d = this.f315268f;
                SliderSeekBar sliderSeekBar6 = SliderSeekBar.this;
                int i3 = sliderSeekBar6.f315252j.getBounds().left;
                sliderSeekBar6.getClass();
                SliderSeekBar.m142465a(SliderSeekBar.this, true, true);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.SliderSeekBar$c */
    public class C105938c extends Drawable {

        /* renamed from: a */
        public boolean f315273a = false;

        /* renamed from: b */
        public Drawable f315274b;

        /* renamed from: c */
        public Drawable f315275c;

        public C105938c(Drawable drawable, Drawable drawable2) {
            this.f315274b = drawable;
            this.f315275c = drawable2;
        }

        public void draw(Canvas canvas) {
            Drawable drawable = this.f315273a ? this.f315274b : this.f315275c;
            if (!getBounds().equals(drawable.getBounds())) {
                drawable.setBounds(getBounds());
            }
            drawable.draw(canvas);
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
            this.f315274b.setAlpha(i);
            this.f315275c.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f315274b.setColorFilter(colorFilter);
            this.f315275c.setColorFilter(colorFilter);
        }
    }

    public SliderSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m142465a(SliderSeekBar sliderSeekBar, boolean z, boolean z2) {
        Drawable drawable;
        if (sliderSeekBar.f315246d && (drawable = sliderSeekBar.f315252j) != null && sliderSeekBar.f315253n != null && drawable.getBounds().width() > 0 && sliderSeekBar.f315253n.getBounds().width() > 0) {
            C105938c cVar = z ? (C105938c) sliderSeekBar.f315252j : (C105938c) sliderSeekBar.f315253n;
            if (cVar.f315273a != z2) {
                cVar.f315273a = z2;
                SliderSeekBar.this.invalidate();
            }
            sliderSeekBar.postInvalidate();
        }
    }

    /* renamed from: b */
    public static boolean m142466b(SliderSeekBar sliderSeekBar, Drawable drawable, float f, float f2) {
        if (!sliderSeekBar.f315246d || drawable == null) {
            return false;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        int i2 = sliderSeekBar.f315265z;
        return f2 <= ((float) (i + i2)) && f2 >= ((float) (bounds.top - i2)) && f >= ((float) (bounds.left - i2)) && f <= ((float) (bounds.right + i2));
    }

    /* renamed from: c */
    public void mo151139c() {
        this.f315252j = new C105938c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f315253n = new C105938c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f315244C = true;
        postInvalidate();
    }

    /* renamed from: d */
    public void mo151140d() {
        this.f315254o = C76577a.m92151b(getContext(), 8);
        this.f315265z = C76577a.m92151b(getContext(), 8);
        mo151139c();
        this.f315255p = C76577a.m92151b(getContext(), 1);
        C76577a.m92157h(getContext(), C0966R.dimen.awe);
        this.f315256q = -1.0f;
        Paint paint = new Paint();
        this.f315257r = paint;
        paint.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f315257r.setAlpha(102);
        Paint paint2 = new Paint();
        this.f315261v = paint2;
        paint2.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        this.f315261v.setAlpha(102);
        Paint paint3 = new Paint();
        this.f315258s = paint3;
        paint3.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f315258s.setStyle(Paint.Style.STROKE);
        int round = Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f315259t = round;
        this.f315258s.setStrokeWidth((float) round);
        this.f315260u = ((float) this.f315259t) * 0.5f;
        Paint paint4 = new Paint();
        this.f315262w = paint4;
        paint4.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f315262w.setStyle(Paint.Style.STROKE);
        float round2 = (float) Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f315263x = 0.5f * round2;
        this.f315262w.setStrokeWidth(round2);
        this.f315262w.setAlpha(WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED);
        setOnTouchListener(this.f315245D);
    }

    /* renamed from: e */
    public final boolean mo151142e(boolean z) {
        return z ? ((C105938c) this.f315252j).f315273a : ((C105938c) this.f315253n).f315273a;
    }

    /* renamed from: f */
    public boolean mo151143f(boolean z, float f) {
        Drawable drawable;
        float f2;
        float f3;
        if (!this.f315246d || (drawable = this.f315252j) == null || this.f315253n == null || drawable.getBounds().width() <= 0 || this.f315253n.getBounds().width() <= 0) {
            return false;
        }
        if (z) {
            f3 = (float) (this.f315253n.getBounds().left - this.f315249g);
            f2 = (float) Math.max(this.f315264y, this.f315253n.getBounds().left - this.f315248f);
        } else {
            f2 = (float) (this.f315252j.getBounds().right + this.f315249g);
            f3 = (float) Math.min(getWidth() - this.f315264y, this.f315252j.getBounds().right + this.f315248f);
        }
        float max = Math.max(f2, Math.min(f, f3));
        boolean z2 = max == f2 || max == f3;
        if (z) {
            Rect bounds = this.f315252j.getBounds();
            bounds.offsetTo((int) Math.ceil((double) (max - ((float) this.f315254o))), 0);
            this.f315252j.setBounds(bounds);
        } else {
            Rect bounds2 = this.f315253n.getBounds();
            bounds2.offsetTo((int) Math.floor((double) max), 0);
            this.f315253n.setBounds(bounds2);
        }
        postInvalidate();
        return z2;
    }

    public int getLeftSliderBound() {
        return this.f315252j.getBounds().right;
    }

    public int getRightSliderBound() {
        return this.f315253n.getBounds().left;
    }

    public void onDraw(Canvas canvas) {
        if (this.f315256q > 0.0f) {
            float width = ((float) getWidth()) * this.f315256q;
            int i = this.f315255p;
            canvas.drawRect(width - (((float) i) * 0.5f), 0.0f, width + (((float) i) * 0.5f), (float) getHeight(), this.f315257r);
        }
        if (this.f315246d) {
            int centerX = this.f315252j.getBounds().centerX();
            int centerX2 = this.f315253n.getBounds().centerX();
            if ((mo151142e(true) || mo151142e(false)) && this.f315244C) {
                float f = this.f315263x;
                canvas.drawRect(((float) this.f315264y) + f, f, ((float) (getWidth() - this.f315264y)) - this.f315263x, ((float) getBottom()) - this.f315263x, this.f315262w);
            }
            if (this.f315252j.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) centerX, (float) getHeight(), this.f315261v);
            }
            if (this.f315253n.getBounds().right < getWidth()) {
                canvas.drawRect((float) centerX2, 0.0f, (float) getWidth(), (float) getHeight(), this.f315261v);
            }
            if (this.f315244C) {
                float f2 = this.f315260u;
                float f3 = (float) centerX;
                float f4 = (float) centerX2;
                canvas.drawLine(f3, f2, f4, f2, this.f315258s);
                canvas.drawLine(f3, ((float) getHeight()) - this.f315260u, f4, ((float) getHeight()) - this.f315260u, this.f315258s);
            }
            this.f315252j.draw(canvas);
            this.f315253n.draw(canvas);
        }
    }

    public void setCursorColor(int i) {
        this.f315257r.setColor(i);
    }

    public void setCursorPos(float f) {
        if (this.f315246d) {
            this.f315256q = f;
            invalidate();
        }
    }

    public void setCursorWidth(int i) {
        this.f315255p = i;
    }

    public void setEnableHapticAtEdge(boolean z) {
        this.f315251i = z;
    }

    public void setMaskColor(int i) {
        this.f315261v.setColor(i);
    }

    public void setOnSliderTouchListener(C57123b bVar) {
    }

    public SliderSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f315246d = false;
        this.f315247e = false;
        this.f315250h = false;
        this.f315251i = false;
        this.f315256q = -1.0f;
        this.f315264y = 0;
        this.f315244C = true;
        this.f315245D = new C105937a();
        mo151140d();
    }
}
