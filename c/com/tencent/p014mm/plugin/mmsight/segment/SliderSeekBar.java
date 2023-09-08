package com.tencent.p014mm.plugin.mmsight.segment;

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

/* renamed from: com.tencent.mm.plugin.mmsight.segment.SliderSeekBar */
public class SliderSeekBar extends View {

    /* renamed from: A */
    public int f313622A;

    /* renamed from: B */
    public Rect f313623B;

    /* renamed from: C */
    public Rect f313624C;

    /* renamed from: D */
    public boolean f313625D;

    /* renamed from: E */
    public View.OnTouchListener f313626E;

    /* renamed from: d */
    public C105469b f313627d;

    /* renamed from: e */
    public boolean f313628e;

    /* renamed from: f */
    public boolean f313629f;

    /* renamed from: g */
    public int f313630g;

    /* renamed from: h */
    public int f313631h;

    /* renamed from: i */
    public boolean f313632i;

    /* renamed from: j */
    public boolean f313633j;

    /* renamed from: n */
    public Drawable f313634n;

    /* renamed from: o */
    public Drawable f313635o;

    /* renamed from: p */
    public int f313636p;

    /* renamed from: q */
    public int f313637q;

    /* renamed from: r */
    public float f313638r;

    /* renamed from: s */
    public Paint f313639s;

    /* renamed from: t */
    public Paint f313640t;

    /* renamed from: u */
    public int f313641u;

    /* renamed from: v */
    public float f313642v;

    /* renamed from: w */
    public Paint f313643w;

    /* renamed from: x */
    public Paint f313644x;

    /* renamed from: y */
    public float f313645y;

    /* renamed from: z */
    public int f313646z;

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.SliderSeekBar$a */
    public class C105468a implements View.OnTouchListener {

        /* renamed from: d */
        public int f313647d = -1;

        /* renamed from: e */
        public int f313648e = -1;

        /* renamed from: f */
        public int f313649f;

        /* renamed from: g */
        public int f313650g;

        /* renamed from: h */
        public float f313651h;

        /* renamed from: i */
        public float f313652i;

        public C105468a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (!SliderSeekBar.this.f313628e) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked != 6) {
                                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                                    return false;
                                }
                            }
                        }
                    } else if (!SliderSeekBar.this.mo150252c(true) && !SliderSeekBar.this.mo150252c(false)) {
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    } else if (SliderSeekBar.this.f313629f) {
                        C117292a.m165362h(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    } else {
                        this.f313650g = 0;
                        boolean z = false;
                        while (this.f313650g < motionEvent.getPointerCount()) {
                            int pointerId = motionEvent.getPointerId(this.f313650g);
                            this.f313649f = pointerId;
                            int i = this.f313647d;
                            if (pointerId == i || pointerId == this.f313648e) {
                                boolean e = SliderSeekBar.this.mo150254e(pointerId == i, motionEvent.getX(this.f313650g));
                                SliderSeekBar sliderSeekBar = SliderSeekBar.this;
                                if (sliderSeekBar.f313633j && e && !sliderSeekBar.f313632i) {
                                    sliderSeekBar.performHapticFeedback(0, 2);
                                }
                                SliderSeekBar sliderSeekBar2 = SliderSeekBar.this;
                                sliderSeekBar2.f313632i = e;
                                C105469b bVar = sliderSeekBar2.f313627d;
                                if (bVar != null) {
                                    bVar.mo150249c(this.f313649f == this.f313647d);
                                }
                                z = true;
                            }
                            this.f313650g++;
                        }
                        C117292a.m165362h(z, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return z;
                    }
                }
                int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f313649f = pointerId2;
                int i2 = this.f313647d;
                if (pointerId2 == i2 || pointerId2 == this.f313648e) {
                    C105469b bVar2 = SliderSeekBar.this.f313627d;
                    if (bVar2 != null) {
                        bVar2.mo150248b(pointerId2 == i2);
                    }
                    SliderSeekBar.m141640a(SliderSeekBar.this, this.f313649f == this.f313647d, false);
                    if (this.f313649f == this.f313647d) {
                        this.f313647d = -1;
                    } else {
                        this.f313648e = -1;
                    }
                    SliderSeekBar.this.f313632i = false;
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            int actionIndex = motionEvent.getActionIndex();
            this.f313650g = actionIndex;
            this.f313649f = motionEvent.getPointerId(actionIndex);
            this.f313651h = motionEvent.getX(this.f313650g);
            float y = motionEvent.getY(this.f313650g);
            this.f313652i = y;
            SliderSeekBar sliderSeekBar3 = SliderSeekBar.this;
            if (!SliderSeekBar.m141641b(sliderSeekBar3, sliderSeekBar3.f313634n, this.f313651h, y)) {
                SliderSeekBar sliderSeekBar4 = SliderSeekBar.this;
                if (!SliderSeekBar.m141641b(sliderSeekBar4, sliderSeekBar4.f313635o, this.f313651h, this.f313652i)) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else if (SliderSeekBar.this.mo150252c(false)) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else {
                    C105469b bVar3 = SliderSeekBar.this.f313627d;
                    if (bVar3 != null) {
                        bVar3.mo150247a(false);
                    }
                    this.f313648e = this.f313649f;
                    SliderSeekBar sliderSeekBar5 = SliderSeekBar.this;
                    int i3 = sliderSeekBar5.f313635o.getBounds().right;
                    sliderSeekBar5.getClass();
                    SliderSeekBar.m141640a(SliderSeekBar.this, false, true);
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            } else if (SliderSeekBar.this.mo150252c(true)) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                C105469b bVar4 = SliderSeekBar.this.f313627d;
                if (bVar4 != null) {
                    bVar4.mo150247a(true);
                }
                this.f313647d = this.f313649f;
                SliderSeekBar sliderSeekBar6 = SliderSeekBar.this;
                int i4 = sliderSeekBar6.f313634n.getBounds().left;
                sliderSeekBar6.getClass();
                SliderSeekBar.m141640a(SliderSeekBar.this, true, true);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.SliderSeekBar$b */
    public interface C105469b {
        /* renamed from: a */
        void mo150247a(boolean z);

        /* renamed from: b */
        void mo150248b(boolean z);

        /* renamed from: c */
        void mo150249c(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.SliderSeekBar$c */
    public class C105470c extends Drawable {

        /* renamed from: a */
        public boolean f313654a = false;

        /* renamed from: b */
        public Drawable f313655b;

        /* renamed from: c */
        public Drawable f313656c;

        public C105470c(Drawable drawable, Drawable drawable2) {
            this.f313655b = drawable;
            this.f313656c = drawable2;
        }

        public void draw(Canvas canvas) {
            Drawable drawable = this.f313654a ? this.f313655b : this.f313656c;
            if (!getBounds().equals(drawable.getBounds())) {
                drawable.setBounds(getBounds());
            }
            drawable.draw(canvas);
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
            this.f313655b.setAlpha(i);
            this.f313656c.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f313655b.setColorFilter(colorFilter);
            this.f313656c.setColorFilter(colorFilter);
        }
    }

    public SliderSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m141640a(SliderSeekBar sliderSeekBar, boolean z, boolean z2) {
        Drawable drawable;
        if (sliderSeekBar.f313628e && (drawable = sliderSeekBar.f313634n) != null && sliderSeekBar.f313635o != null && drawable.getBounds().width() > 0 && sliderSeekBar.f313635o.getBounds().width() > 0) {
            C105470c cVar = z ? (C105470c) sliderSeekBar.f313634n : (C105470c) sliderSeekBar.f313635o;
            if (cVar.f313654a != z2) {
                cVar.f313654a = z2;
                SliderSeekBar.this.invalidate();
            }
            sliderSeekBar.postInvalidate();
        }
    }

    /* renamed from: b */
    public static boolean m141641b(SliderSeekBar sliderSeekBar, Drawable drawable, float f, float f2) {
        if (!sliderSeekBar.f313628e || drawable == null) {
            return false;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        int i2 = sliderSeekBar.f313622A;
        return f2 <= ((float) (i + i2)) && f2 >= ((float) (bounds.top - i2)) && f >= ((float) (bounds.left - i2)) && f <= ((float) (bounds.right + i2));
    }

    /* renamed from: c */
    public final boolean mo150252c(boolean z) {
        return z ? ((C105470c) this.f313634n).f313654a : ((C105470c) this.f313635o).f313654a;
    }

    /* renamed from: d */
    public void mo150253d() {
        if (this.f313623B != null && this.f313624C != null) {
            Rect rect = this.f313623B;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
            Rect rect3 = this.f313624C;
            Rect rect4 = new Rect(rect3.left, rect3.top, rect3.right, rect3.bottom);
            this.f313634n.setBounds(rect2);
            this.f313635o.setBounds(rect4);
            this.f313638r = 0.0f;
            postInvalidate();
        }
    }

    /* renamed from: e */
    public boolean mo150254e(boolean z, float f) {
        Drawable drawable;
        float f2;
        float f3;
        if (!this.f313628e || (drawable = this.f313634n) == null || this.f313635o == null || drawable.getBounds().width() <= 0 || this.f313635o.getBounds().width() <= 0) {
            return false;
        }
        if (z) {
            f3 = (float) (this.f313635o.getBounds().left - this.f313631h);
            f2 = (float) Math.max(this.f313646z, this.f313635o.getBounds().left - this.f313630g);
        } else {
            f2 = (float) (this.f313634n.getBounds().right + this.f313631h);
            f3 = (float) Math.min(getWidth() - this.f313646z, this.f313634n.getBounds().right + this.f313630g);
        }
        float max = Math.max(f2, Math.min(f, f3));
        boolean z2 = max == f2 || max == f3;
        if (z) {
            Rect bounds = this.f313634n.getBounds();
            bounds.offsetTo((int) Math.ceil((double) (max - ((float) this.f313636p))), 0);
            this.f313634n.setBounds(bounds);
        } else {
            Rect bounds2 = this.f313635o.getBounds();
            bounds2.offsetTo((int) Math.floor((double) max), 0);
            this.f313635o.setBounds(bounds2);
        }
        postInvalidate();
        return z2;
    }

    public int getLeftSliderBound() {
        return this.f313634n.getBounds().right;
    }

    public int getRightSliderBound() {
        return this.f313635o.getBounds().left;
    }

    public void onDraw(Canvas canvas) {
        if (this.f313638r > 0.0f) {
            float width = ((float) getWidth()) * this.f313638r;
            int i = this.f313637q;
            canvas.drawRect(width - (((float) i) * 0.5f), 0.0f, width + (((float) i) * 0.5f), (float) getHeight(), this.f313639s);
        }
        if (this.f313628e) {
            int centerX = this.f313634n.getBounds().centerX();
            int centerX2 = this.f313635o.getBounds().centerX();
            if ((mo150252c(true) || mo150252c(false)) && this.f313625D) {
                float f = this.f313645y;
                canvas.drawRect(((float) this.f313646z) + f, f, ((float) (getWidth() - this.f313646z)) - this.f313645y, ((float) getBottom()) - this.f313645y, this.f313644x);
            }
            if (this.f313634n.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, (float) centerX, (float) getHeight(), this.f313643w);
            }
            if (this.f313635o.getBounds().right < getWidth()) {
                canvas.drawRect((float) centerX2, 0.0f, (float) getWidth(), (float) getHeight(), this.f313643w);
            }
            if (this.f313625D) {
                float f2 = this.f313642v;
                float f3 = (float) centerX;
                float f4 = (float) centerX2;
                canvas.drawLine(f3, f2, f4, f2, this.f313640t);
                canvas.drawLine(f3, ((float) getHeight()) - this.f313642v, f4, ((float) getHeight()) - this.f313642v, this.f313640t);
            }
            this.f313634n.draw(canvas);
            this.f313635o.draw(canvas);
        }
    }

    public void setCursorColor(int i) {
        this.f313639s.setColor(i);
    }

    public void setCursorPos(float f) {
        if (this.f313628e) {
            this.f313638r = f;
            invalidate();
        }
    }

    public void setCursorWidth(int i) {
        this.f313637q = i;
    }

    public void setEnableHapticAtEdge(boolean z) {
        this.f313633j = z;
    }

    public void setMaskColor(int i) {
        this.f313643w.setColor(i);
    }

    public void setOnSliderTouchListener(C105469b bVar) {
        this.f313627d = bVar;
    }

    public SliderSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f313628e = false;
        this.f313629f = false;
        this.f313632i = false;
        this.f313633j = false;
        this.f313638r = -1.0f;
        this.f313646z = 0;
        this.f313625D = true;
        this.f313626E = new C105468a();
        this.f313636p = C76577a.m92151b(getContext(), 8);
        this.f313622A = C76577a.m92151b(getContext(), 8);
        this.f313634n = new C105470c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f313635o = new C105470c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f313625D = true;
        postInvalidate();
        this.f313637q = C76577a.m92151b(getContext(), 1);
        C76577a.m92157h(getContext(), C0966R.dimen.as5);
        this.f313638r = -1.0f;
        Paint paint = new Paint();
        this.f313639s = paint;
        paint.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f313639s.setAlpha(102);
        Paint paint2 = new Paint();
        this.f313643w = paint2;
        paint2.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        this.f313643w.setAlpha(102);
        Paint paint3 = new Paint();
        this.f313640t = paint3;
        paint3.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f313640t.setStyle(Paint.Style.STROKE);
        int round = Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f313641u = round;
        this.f313640t.setStrokeWidth((float) round);
        this.f313642v = ((float) this.f313641u) * 0.5f;
        Paint paint4 = new Paint();
        this.f313644x = paint4;
        paint4.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f313644x.setStyle(Paint.Style.STROKE);
        float round2 = (float) Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f313645y = 0.5f * round2;
        this.f313644x.setStrokeWidth(round2);
        this.f313644x.setAlpha(WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED);
        setOnTouchListener(this.f313626E);
    }
}
