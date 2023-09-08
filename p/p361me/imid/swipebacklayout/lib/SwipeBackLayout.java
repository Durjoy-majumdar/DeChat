package p361me.imid.swipebacklayout.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p361me.imid.swipebacklayout.lib.C21493b;
import p374qa.C22080a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: me.imid.swipebacklayout.lib.SwipeBackLayout */
public class SwipeBackLayout extends FrameLayout {

    /* renamed from: x */
    public static final int[] f60818x = {1, 2, 8, 11};

    /* renamed from: d */
    public int f60819d;

    /* renamed from: e */
    public float f60820e;

    /* renamed from: f */
    public boolean f60821f;

    /* renamed from: g */
    public View f60822g;

    /* renamed from: h */
    public C21493b f60823h;

    /* renamed from: i */
    public float f60824i;

    /* renamed from: j */
    public int f60825j;

    /* renamed from: n */
    public int f60826n;

    /* renamed from: o */
    public CopyOnWriteArrayList<C21490b> f60827o;

    /* renamed from: p */
    public Drawable f60828p;

    /* renamed from: q */
    public Drawable f60829q;

    /* renamed from: r */
    public Drawable f60830r;

    /* renamed from: s */
    public float f60831s;

    /* renamed from: t */
    public int f60832t;

    /* renamed from: u */
    public boolean f60833u;

    /* renamed from: v */
    public Rect f60834v;

    /* renamed from: w */
    public int f60835w;

    /* renamed from: me.imid.swipebacklayout.lib.SwipeBackLayout$b */
    public interface C21490b {
        /* renamed from: a */
        void mo33673a(MotionEvent motionEvent);

        /* renamed from: b */
        int mo33674b(boolean z);

        /* renamed from: c */
        void mo33675c();

        /* renamed from: d */
        void mo33676d(int i, float f);

        /* renamed from: f */
        void mo33677f(int i);
    }

    /* renamed from: me.imid.swipebacklayout.lib.SwipeBackLayout$d */
    public class C21491d extends C21493b.C21496c {

        /* renamed from: a */
        public boolean f60836a;

        public C21491d(C21489a aVar) {
        }

        /* renamed from: a */
        public void mo33678a(View view, int i, int i2, int i3, int i4) {
            CopyOnWriteArrayList<C21490b> copyOnWriteArrayList;
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            int i5 = swipeBackLayout.f60835w;
            if ((i5 & 1) != 0) {
                swipeBackLayout.f60824i = Math.abs(((float) i) / ((float) (swipeBackLayout.f60822g.getWidth() + SwipeBackLayout.this.f60828p.getIntrinsicWidth())));
            } else if ((i5 & 2) != 0) {
                swipeBackLayout.f60824i = Math.abs(((float) i) / ((float) (swipeBackLayout.f60822g.getWidth() + SwipeBackLayout.this.f60829q.getIntrinsicWidth())));
            } else if ((i5 & 8) != 0) {
                swipeBackLayout.f60824i = Math.abs(((float) i2) / ((float) (swipeBackLayout.f60822g.getHeight() + SwipeBackLayout.this.f60830r.getIntrinsicHeight())));
            }
            SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
            swipeBackLayout2.f60825j = i;
            swipeBackLayout2.f60826n = i2;
            swipeBackLayout2.invalidate();
            SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
            if (swipeBackLayout3.f60824i < swipeBackLayout3.f60820e && !this.f60836a) {
                this.f60836a = true;
            }
            CopyOnWriteArrayList<C21490b> copyOnWriteArrayList2 = swipeBackLayout3.f60827o;
            if (copyOnWriteArrayList2 != null && !copyOnWriteArrayList2.isEmpty()) {
                Iterator<C21490b> it = SwipeBackLayout.this.f60827o.iterator();
                while (it.hasNext()) {
                    SwipeBackLayout swipeBackLayout4 = SwipeBackLayout.this;
                    it.next().mo33676d(swipeBackLayout4.f60823h.f60839a, swipeBackLayout4.f60824i);
                }
            }
            CopyOnWriteArrayList<C21490b> copyOnWriteArrayList3 = SwipeBackLayout.this.f60827o;
            if (copyOnWriteArrayList3 != null && !copyOnWriteArrayList3.isEmpty()) {
                SwipeBackLayout swipeBackLayout5 = SwipeBackLayout.this;
                if (swipeBackLayout5.f60823h.f60839a == 1 && swipeBackLayout5.f60824i >= swipeBackLayout5.f60820e && this.f60836a) {
                    this.f60836a = false;
                    Iterator<C21490b> it4 = swipeBackLayout5.f60827o.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo33675c();
                    }
                }
            }
            SwipeBackLayout swipeBackLayout6 = SwipeBackLayout.this;
            if (swipeBackLayout6.f60824i >= 1.0f && (copyOnWriteArrayList = swipeBackLayout6.f60827o) != null && !copyOnWriteArrayList.isEmpty()) {
                Iterator<C21490b> it5 = SwipeBackLayout.this.f60827o.iterator();
                while (it5.hasNext()) {
                    C21490b next = it5.next();
                    if (next instanceof C21492c) {
                        ((C21492c) next).mo33679e();
                    }
                }
            }
        }
    }

    /* renamed from: me.imid.swipebacklayout.lib.SwipeBackLayout$c */
    public interface C21492c extends C21490b {
        /* renamed from: e */
        void mo33679e();
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2619t);
    }

    /* renamed from: a */
    public void mo33654a(C21490b bVar) {
        if (this.f60827o == null) {
            this.f60827o = new CopyOnWriteArrayList<>();
        }
        this.f60827o.add(bVar);
    }

    /* renamed from: c */
    public void mo33655c() {
        this.f60824i = 0.0f;
        this.f60823h.mo33680a();
        this.f60823h.mo33694o(0);
        if (this.f60825j != 0 || this.f60826n != 0) {
            this.f60826n = 0;
            this.f60825j = 0;
            requestLayout();
        }
    }

    public void computeScroll() {
        this.f60831s = 1.0f - this.f60824i;
        C21493b bVar = this.f60823h;
        if (bVar.f60839a == 2) {
            boolean computeScrollOffset = bVar.f60855q.f306426a.computeScrollOffset();
            int currX = bVar.f60855q.f306426a.getCurrX();
            int b = bVar.f60855q.mo145036b();
            int left = currX - bVar.f60857s.getLeft();
            int top = b - bVar.f60857s.getTop();
            if (left != 0) {
                bVar.f60857s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                bVar.f60857s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                bVar.f60856r.mo33678a(bVar.f60857s, currX, b, left, top);
            }
            if (computeScrollOffset && currX == bVar.f60855q.f306426a.getFinalX() && b == bVar.f60855q.f306426a.getFinalY()) {
                bVar.f60855q.mo145035a();
                computeScrollOffset = bVar.f60855q.mo145037c();
            }
            if (!computeScrollOffset) {
                bVar.f60859u.post(bVar.f60860v);
            }
        }
        if (bVar.f60839a == 2) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    /* renamed from: d */
    public void mo33657d(int i, int i2) {
        Drawable drawable = getResources().getDrawable(i);
        if ((i2 & 1) != 0) {
            this.f60828p = drawable;
        } else if ((i2 & 2) != 0) {
            this.f60829q = drawable;
        } else if ((i2 & 8) != 0) {
            this.f60830r = drawable;
        }
        invalidate();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f60821f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        CopyOnWriteArrayList<C21490b> copyOnWriteArrayList = this.f60827o;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<C21490b> it = this.f60827o.iterator();
            while (it.hasNext()) {
                it.next().mo33673a(motionEvent);
            }
        }
        C21493b bVar = this.f60823h;
        if (bVar.f60839a == 1) {
            bVar.mo33689j(motionEvent);
            return true;
        }
        try {
            if (bVar.mo33695p(motionEvent)) {
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | NullPointerException unused) {
            return false;
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.f60822g;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.f60831s > 0.0f && z && this.f60823h.f60839a != 0) {
            Rect rect = this.f60834v;
            view.getHitRect(rect);
            if ((this.f60819d & 1) != 0) {
                Drawable drawable = this.f60828p;
                drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
                this.f60828p.setAlpha((int) (this.f60831s * 255.0f));
                this.f60828p.draw(canvas);
            }
            if ((this.f60819d & 2) != 0) {
                Drawable drawable2 = this.f60829q;
                int i = rect.right;
                drawable2.setBounds(i, rect.top, drawable2.getIntrinsicWidth() + i, rect.bottom);
                this.f60829q.setAlpha((int) (this.f60831s * 255.0f));
                this.f60829q.draw(canvas);
            }
            if ((this.f60819d & 8) != 0) {
                Drawable drawable3 = this.f60830r;
                int i2 = rect.left;
                int i3 = rect.bottom;
                drawable3.setBounds(i2, i3, rect.right, drawable3.getIntrinsicHeight() + i3);
                this.f60830r.setAlpha((int) (this.f60831s * 255.0f));
                this.f60830r.draw(canvas);
            }
            int i4 = this.f60832t;
            int i5 = (i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * this.f60831s)) << 24);
            int i6 = this.f60835w;
            if ((i6 & 1) != 0) {
                canvas.clipRect(0, 0, view.getLeft(), getHeight());
            } else if ((i6 & 2) != 0) {
                canvas.clipRect(view.getRight(), 0, getRight(), getHeight());
            } else if ((i6 & 8) != 0) {
                canvas.clipRect(view.getLeft(), view.getBottom(), getRight(), getHeight());
            }
            canvas.drawColor(i5);
        }
        return drawChild;
    }

    public View getTargetView() {
        return this.f60822g;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f60833u = true;
        View view = this.f60822g;
        if (view != null) {
            int i5 = this.f60825j;
            view.layout(i5, this.f60826n, view.getMeasuredWidth() + i5, this.f60826n + this.f60822g.getMeasuredHeight());
        }
        this.f60833u = false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f60821f) {
            return false;
        }
        this.f60823h.mo33689j(motionEvent);
        return true;
    }

    public void requestLayout() {
        if (!this.f60833u) {
            super.requestLayout();
        }
    }

    public void setContentView(View view) {
        this.f60822g = view;
    }

    public void setEdgeSize(int i) {
        this.f60823h.f60853o = i;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.f60819d = i;
        this.f60823h.f60854p = i;
    }

    public void setEnableGesture(boolean z) {
        this.f60821f = z;
    }

    public void setMaxVelocity(float f) {
        this.f60823h.f60851m = f;
    }

    public void setMinVelocity(float f) {
        this.f60823h.f60852n = f;
    }

    public void setScrimColor(int i) {
        this.f60832t = i;
        invalidate();
    }

    public void setScrollThresHold(float f) {
        if (f >= 1.0f || f <= 0.0f) {
            throw new IllegalArgumentException("Threshold value should be between 0 and 1.0");
        }
        this.f60820e = f;
    }

    @Deprecated
    public void setSwipeListener(C21490b bVar) {
        mo33654a(bVar);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f60820e = 0.3f;
        this.f60821f = true;
        this.f60832t = -1728053248;
        this.f60834v = new Rect();
        this.f60823h = new C21493b(getContext(), this, new C21491d((C21489a) null));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C22080a.f62467a, i, C0966R.style.f8763ug);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize > 0) {
            setEdgeSize(dimensionPixelSize);
        }
        setEdgeTrackingEnabled(f60818x[obtainStyledAttributes.getInt(0, 0)]);
        int resourceId = obtainStyledAttributes.getResourceId(3, C0966R.C0969drawable.bqb);
        int resourceId2 = obtainStyledAttributes.getResourceId(4, C0966R.C0969drawable.bqc);
        int resourceId3 = obtainStyledAttributes.getResourceId(2, C0966R.C0969drawable.bqa);
        mo33657d(resourceId, 1);
        mo33657d(resourceId2, 2);
        mo33657d(resourceId3, 8);
        obtainStyledAttributes.recycle();
        float f = getResources().getDisplayMetrics().density * 400.0f;
        C21493b bVar = this.f60823h;
        bVar.f60852n = f;
        bVar.f60851m = f * 2.0f;
    }
}
