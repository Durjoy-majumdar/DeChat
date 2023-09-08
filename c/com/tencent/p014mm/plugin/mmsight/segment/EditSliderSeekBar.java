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

/* renamed from: com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar */
public class EditSliderSeekBar extends View {

    /* renamed from: A */
    public Rect f313529A;

    /* renamed from: B */
    public Rect f313530B;

    /* renamed from: C */
    public boolean f313531C;

    /* renamed from: D */
    public View.OnTouchListener f313532D;

    /* renamed from: d */
    public C105453b f313533d;

    /* renamed from: e */
    public boolean f313534e;

    /* renamed from: f */
    public int f313535f;

    /* renamed from: g */
    public int f313536g;

    /* renamed from: h */
    public boolean f313537h;

    /* renamed from: i */
    public boolean f313538i;

    /* renamed from: j */
    public Drawable f313539j;

    /* renamed from: n */
    public Drawable f313540n;

    /* renamed from: o */
    public int f313541o;

    /* renamed from: p */
    public int f313542p;

    /* renamed from: q */
    public float f313543q;

    /* renamed from: r */
    public Paint f313544r;

    /* renamed from: s */
    public Paint f313545s;

    /* renamed from: t */
    public int f313546t;

    /* renamed from: u */
    public float f313547u;

    /* renamed from: v */
    public Paint f313548v;

    /* renamed from: w */
    public Paint f313549w;

    /* renamed from: x */
    public float f313550x;

    /* renamed from: y */
    public int f313551y;

    /* renamed from: z */
    public int f313552z;

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar$a */
    public class C105452a implements View.OnTouchListener {

        /* renamed from: d */
        public int f313553d = -1;

        /* renamed from: e */
        public int f313554e = -1;

        /* renamed from: f */
        public int f313555f;

        /* renamed from: g */
        public int f313556g;

        /* renamed from: h */
        public float f313557h;

        /* renamed from: i */
        public float f313558i;

        public C105452a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int i;
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (!EditSliderSeekBar.this.f313534e) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked != 6) {
                                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                                    return false;
                                }
                            }
                        }
                    } else if (EditSliderSeekBar.this.mo150206d(true) || EditSliderSeekBar.this.mo150206d(false)) {
                        EditSliderSeekBar.this.getClass();
                        this.f313556g = 0;
                        boolean z = false;
                        while (this.f313556g < motionEvent.getPointerCount()) {
                            int pointerId = motionEvent.getPointerId(this.f313556g);
                            this.f313555f = pointerId;
                            int i3 = this.f313553d;
                            if (pointerId == i3 || pointerId == this.f313554e) {
                                boolean e = EditSliderSeekBar.this.mo150207e(pointerId == i3, motionEvent.getX(this.f313556g));
                                EditSliderSeekBar editSliderSeekBar = EditSliderSeekBar.this;
                                if (editSliderSeekBar.f313538i && e && !editSliderSeekBar.f313537h) {
                                    editSliderSeekBar.performHapticFeedback(0, 2);
                                }
                                EditSliderSeekBar editSliderSeekBar2 = EditSliderSeekBar.this;
                                editSliderSeekBar2.f313537h = e;
                                if (editSliderSeekBar2.f313533d != null) {
                                    int[] iArr = new int[2];
                                    editSliderSeekBar2.getLocationOnScreen(iArr);
                                    boolean z2 = this.f313555f == this.f313553d;
                                    if (z2) {
                                        i2 = iArr[0];
                                        i = EditSliderSeekBar.this.getLeftSliderBound();
                                    } else {
                                        i2 = iArr[0];
                                        i = EditSliderSeekBar.this.getRightSliderBound();
                                    }
                                    EditSliderSeekBar editSliderSeekBar3 = EditSliderSeekBar.this;
                                    editSliderSeekBar3.f313533d.mo150218c(z2, ((float) (i2 + i)) + ((float) editSliderSeekBar3.f313551y));
                                }
                                z = true;
                            }
                            this.f313556g++;
                        }
                        if (z) {
                            EditSliderSeekBar.this.getParent().getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        C117292a.m165362h(z, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return z;
                    } else {
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                }
                int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f313555f = pointerId2;
                int i4 = this.f313553d;
                if (pointerId2 == i4 || pointerId2 == this.f313554e) {
                    C105453b bVar = EditSliderSeekBar.this.f313533d;
                    if (bVar != null) {
                        bVar.mo150217b(pointerId2 == i4);
                    }
                    EditSliderSeekBar.m141620b(EditSliderSeekBar.this, this.f313555f == this.f313553d, false);
                    if (this.f313555f == this.f313553d) {
                        this.f313553d = -1;
                    } else {
                        this.f313554e = -1;
                    }
                    EditSliderSeekBar editSliderSeekBar4 = EditSliderSeekBar.this;
                    editSliderSeekBar4.f313537h = false;
                    editSliderSeekBar4.getParent().getParent().requestDisallowInterceptTouchEvent(false);
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            int actionIndex = motionEvent.getActionIndex();
            this.f313556g = actionIndex;
            this.f313555f = motionEvent.getPointerId(actionIndex);
            this.f313557h = motionEvent.getX(this.f313556g);
            float y = motionEvent.getY(this.f313556g);
            this.f313558i = y;
            EditSliderSeekBar editSliderSeekBar5 = EditSliderSeekBar.this;
            if (!EditSliderSeekBar.m141619a(editSliderSeekBar5, editSliderSeekBar5.f313539j, this.f313557h, y)) {
                EditSliderSeekBar editSliderSeekBar6 = EditSliderSeekBar.this;
                if (!EditSliderSeekBar.m141619a(editSliderSeekBar6, editSliderSeekBar6.f313540n, this.f313557h, this.f313558i)) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else if (EditSliderSeekBar.this.mo150206d(false)) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else {
                    C105453b bVar2 = EditSliderSeekBar.this.f313533d;
                    if (bVar2 != null) {
                        bVar2.mo150216a(false);
                    }
                    this.f313554e = this.f313555f;
                    EditSliderSeekBar editSliderSeekBar7 = EditSliderSeekBar.this;
                    int i5 = editSliderSeekBar7.f313540n.getBounds().right;
                    editSliderSeekBar7.getClass();
                    EditSliderSeekBar.m141620b(EditSliderSeekBar.this, false, true);
                    EditSliderSeekBar.this.getParent().getParent().requestDisallowInterceptTouchEvent(true);
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            } else if (EditSliderSeekBar.this.mo150206d(true)) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                C105453b bVar3 = EditSliderSeekBar.this.f313533d;
                if (bVar3 != null) {
                    bVar3.mo150216a(true);
                }
                this.f313553d = this.f313555f;
                EditSliderSeekBar editSliderSeekBar8 = EditSliderSeekBar.this;
                int i6 = editSliderSeekBar8.f313539j.getBounds().left;
                editSliderSeekBar8.getClass();
                EditSliderSeekBar.m141620b(EditSliderSeekBar.this, true, true);
                EditSliderSeekBar.this.getParent().getParent().requestDisallowInterceptTouchEvent(true);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar$b */
    public interface C105453b {
        /* renamed from: a */
        void mo150216a(boolean z);

        /* renamed from: b */
        void mo150217b(boolean z);

        /* renamed from: c */
        void mo150218c(boolean z, float f);
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar$c */
    public class C105454c extends Drawable {

        /* renamed from: a */
        public boolean f313560a = false;

        /* renamed from: b */
        public Drawable f313561b;

        /* renamed from: c */
        public Drawable f313562c;

        public C105454c(Drawable drawable, Drawable drawable2) {
            this.f313561b = drawable;
            this.f313562c = drawable2;
        }

        public void draw(Canvas canvas) {
            Drawable drawable = this.f313560a ? this.f313561b : this.f313562c;
            if (!getBounds().equals(drawable.getBounds())) {
                drawable.setBounds(getBounds());
            }
            drawable.draw(canvas);
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
            this.f313561b.setAlpha(i);
            this.f313562c.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f313561b.setColorFilter(colorFilter);
            this.f313562c.setColorFilter(colorFilter);
        }
    }

    public EditSliderSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static boolean m141619a(EditSliderSeekBar editSliderSeekBar, Drawable drawable, float f, float f2) {
        if (!editSliderSeekBar.f313534e || drawable == null) {
            return false;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        int i2 = editSliderSeekBar.f313552z;
        return f2 <= ((float) (i + i2)) && f2 >= ((float) (bounds.top - i2)) && f >= ((float) (bounds.left - i2)) && f <= ((float) (bounds.right + i2));
    }

    /* renamed from: b */
    public static void m141620b(EditSliderSeekBar editSliderSeekBar, boolean z, boolean z2) {
        Drawable drawable;
        if (editSliderSeekBar.f313534e && (drawable = editSliderSeekBar.f313539j) != null && editSliderSeekBar.f313540n != null && drawable.getBounds().width() > 0 && editSliderSeekBar.f313540n.getBounds().width() > 0) {
            C105454c cVar = z ? (C105454c) editSliderSeekBar.f313539j : (C105454c) editSliderSeekBar.f313540n;
            if (cVar.f313560a != z2) {
                cVar.f313560a = z2;
                EditSliderSeekBar.this.invalidate();
            }
            editSliderSeekBar.postInvalidate();
        }
    }

    /* renamed from: c */
    public void mo150205c(int i, int i2, int i3) {
        int i4 = this.f313541o;
        if (i > i4 * 2) {
            this.f313534e = true;
            this.f313551y = i3;
            this.f313535f = i;
            this.f313536g = i2;
            if (this.f313531C) {
                this.f313539j.setBounds(i3 - i4, 0, i3, getHeight());
                Drawable drawable = this.f313540n;
                int i5 = this.f313551y + this.f313535f;
                drawable.setBounds(i5, 0, this.f313541o + i5, getHeight());
            } else {
                this.f313539j.setBounds(i3 - i4, 0, i3, getHeight());
                Drawable drawable2 = this.f313540n;
                int i6 = this.f313551y + this.f313535f;
                drawable2.setBounds(i6, 0, this.f313541o + i6, getHeight());
            }
            if (this.f313529A == null && this.f313530B == null) {
                this.f313529A = new Rect(this.f313539j.getBounds().left, this.f313539j.getBounds().top, this.f313539j.getBounds().right, this.f313539j.getBounds().bottom);
                this.f313530B = new Rect(this.f313540n.getBounds().left, this.f313540n.getBounds().top, this.f313540n.getBounds().right, this.f313540n.getBounds().bottom);
            }
            invalidate();
            return;
        }
        throw new IllegalStateException("MaxExtent can not less than sliderWidth * 2");
    }

    /* renamed from: d */
    public final boolean mo150206d(boolean z) {
        return z ? ((C105454c) this.f313539j).f313560a : ((C105454c) this.f313540n).f313560a;
    }

    /* renamed from: e */
    public boolean mo150207e(boolean z, float f) {
        Drawable drawable;
        float f2;
        float f3;
        if (!this.f313534e || (drawable = this.f313539j) == null || this.f313540n == null || drawable.getBounds().width() <= 0 || this.f313540n.getBounds().width() <= 0) {
            return false;
        }
        if (z) {
            f3 = (float) (this.f313540n.getBounds().left - this.f313536g);
            f2 = (float) Math.max(this.f313551y, this.f313540n.getBounds().left - this.f313535f);
        } else {
            f2 = (float) (this.f313539j.getBounds().right + this.f313536g);
            f3 = (float) Math.min(this.f313551y + this.f313535f, this.f313539j.getBounds().right + this.f313535f);
        }
        float max = Math.max(f2, Math.min(f, f3));
        boolean z2 = max == f2 || max == f3;
        if (z) {
            Rect bounds = this.f313539j.getBounds();
            bounds.offsetTo((int) Math.ceil((double) (max - ((float) this.f313541o))), 0);
            this.f313539j.setBounds(bounds);
        } else {
            Rect bounds2 = this.f313540n.getBounds();
            bounds2.offsetTo((int) Math.floor((double) max), 0);
            this.f313540n.setBounds(bounds2);
        }
        postInvalidate();
        return z2;
    }

    public int getLeftSliderBound() {
        return this.f313539j.getBounds().right - this.f313551y;
    }

    public int getRightSliderBound() {
        return this.f313540n.getBounds().left - this.f313551y;
    }

    public void onDraw(Canvas canvas) {
        if (this.f313543q > 0.0f) {
            float width = ((float) getWidth()) * this.f313543q;
            int i = this.f313542p;
            canvas.drawRect(width - (((float) i) * 0.5f), 0.0f, width + (((float) i) * 0.5f), (float) getHeight(), this.f313544r);
        }
        if (this.f313534e) {
            int centerX = this.f313539j.getBounds().centerX();
            int centerX2 = this.f313540n.getBounds().centerX();
            if ((mo150206d(true) || mo150206d(false)) && this.f313531C) {
                float f = this.f313550x;
                canvas.drawRect(((float) this.f313551y) + f, f, ((float) (getWidth() - this.f313551y)) - this.f313550x, ((float) getBottom()) - this.f313550x, this.f313549w);
            }
            if (this.f313539j.getBounds().left > 0) {
                canvas.drawRect((float) this.f313551y, 0.0f, (float) centerX, (float) getHeight(), this.f313548v);
            }
            if (this.f313540n.getBounds().right < getWidth()) {
                canvas.drawRect((float) centerX2, 0.0f, (float) (getWidth() - this.f313551y), (float) getHeight(), this.f313548v);
            }
            if (this.f313531C) {
                float f2 = this.f313547u;
                float f3 = (float) centerX;
                float f4 = (float) centerX2;
                canvas.drawLine(f3, f2, f4, f2, this.f313545s);
                canvas.drawLine(f3, ((float) getHeight()) - this.f313547u, f4, ((float) getHeight()) - this.f313547u, this.f313545s);
            }
            this.f313539j.draw(canvas);
            this.f313540n.draw(canvas);
        }
    }

    public void setCursorPos(float f) {
        if (this.f313534e) {
            this.f313543q = f;
            invalidate();
        }
    }

    public void setEnableHapticAtEdge(boolean z) {
        this.f313538i = z;
    }

    public void setMaskColor(int i) {
        this.f313548v.setColor(i);
    }

    public void setOnSliderTouchListener(C105453b bVar) {
        this.f313533d = bVar;
    }

    public EditSliderSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f313534e = false;
        this.f313537h = false;
        this.f313538i = false;
        this.f313543q = -1.0f;
        this.f313551y = 0;
        this.f313531C = true;
        this.f313532D = new C105452a();
        this.f313541o = C76577a.m92151b(getContext(), 8);
        this.f313552z = C76577a.m92151b(getContext(), 8);
        this.f313539j = new C105454c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f313540n = new C105454c(C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_selected), C76577a.m92158i(getContext(), C0966R.raw.video_clip_slider_normal));
        this.f313531C = true;
        postInvalidate();
        this.f313542p = C76577a.m92151b(getContext(), 1);
        C76577a.m92157h(getContext(), C0966R.dimen.as5);
        this.f313543q = -1.0f;
        Paint paint = new Paint();
        this.f313544r = paint;
        paint.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f313544r.setAlpha(102);
        Paint paint2 = new Paint();
        this.f313548v = paint2;
        paint2.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        this.f313548v.setAlpha(102);
        Paint paint3 = new Paint();
        this.f313545s = paint3;
        paint3.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f313545s.setStyle(Paint.Style.STROKE);
        int round = Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f313546t = round;
        this.f313545s.setStrokeWidth((float) round);
        this.f313547u = ((float) this.f313546t) * 0.5f;
        Paint paint4 = new Paint();
        this.f313549w = paint4;
        paint4.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_BG_100));
        this.f313549w.setStyle(Paint.Style.STROKE);
        float round2 = (float) Math.round(TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f313550x = 0.5f * round2;
        this.f313549w.setStrokeWidth(round2);
        this.f313549w.setAlpha(WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED);
        setOnTouchListener(this.f313532D);
    }
}
