package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.recyclerview.widget.n */
public class C16656n extends RecyclerView.C0129l implements RecyclerView.C16622o {

    /* renamed from: I */
    public static final int[] f44966I = {16842919};

    /* renamed from: J */
    public static final int[] f44967J = new int[0];

    /* renamed from: A */
    public boolean f44968A = false;

    /* renamed from: B */
    public int f44969B = 0;

    /* renamed from: C */
    public int f44970C = 0;

    /* renamed from: D */
    public final int[] f44971D = new int[2];

    /* renamed from: E */
    public final int[] f44972E = new int[2];

    /* renamed from: F */
    public final ValueAnimator f44973F;

    /* renamed from: G */
    public int f44974G;

    /* renamed from: H */
    public final Runnable f44975H;

    /* renamed from: d */
    public final int f44976d;

    /* renamed from: e */
    public final int f44977e;

    /* renamed from: f */
    public final StateListDrawable f44978f;

    /* renamed from: g */
    public final Drawable f44979g;

    /* renamed from: h */
    public final int f44980h;

    /* renamed from: i */
    public final int f44981i;

    /* renamed from: j */
    public final StateListDrawable f44982j;

    /* renamed from: n */
    public final Drawable f44983n;

    /* renamed from: o */
    public final int f44984o;

    /* renamed from: p */
    public final int f44985p;

    /* renamed from: q */
    public int f44986q;

    /* renamed from: r */
    public int f44987r;

    /* renamed from: s */
    public float f44988s;

    /* renamed from: t */
    public int f44989t;

    /* renamed from: u */
    public int f44990u;

    /* renamed from: v */
    public float f44991v;

    /* renamed from: w */
    public int f44992w = 0;

    /* renamed from: x */
    public int f44993x = 0;

    /* renamed from: y */
    public RecyclerView f44994y;

    /* renamed from: z */
    public boolean f44995z = false;

    /* renamed from: androidx.recyclerview.widget.n$a */
    public class C16657a implements Runnable {
        public C16657a() {
        }

        public void run() {
            C16656n nVar = C16656n.this;
            int i = nVar.f44974G;
            if (i == 1) {
                nVar.f44973F.cancel();
            } else if (i != 2) {
                return;
            }
            nVar.f44974G = 3;
            ValueAnimator valueAnimator = nVar.f44973F;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            nVar.f44973F.setDuration((long) 500);
            nVar.f44973F.start();
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    public class C16658b extends RecyclerView.C0130p {
        public C16658b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C16656n nVar = C16656n.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = nVar.f44994y.computeVerticalScrollRange();
            int i3 = nVar.f44993x;
            nVar.f44995z = computeVerticalScrollRange - i3 > 0 && i3 >= nVar.f44976d;
            int computeHorizontalScrollRange = nVar.f44994y.computeHorizontalScrollRange();
            int i4 = nVar.f44992w;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= nVar.f44976d;
            nVar.f44968A = z;
            boolean z2 = nVar.f44995z;
            if (z2 || z) {
                if (z2) {
                    float f = (float) i3;
                    nVar.f44987r = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                    nVar.f44986q = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (nVar.f44968A) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    nVar.f44990u = (int) ((f3 * (f2 + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    nVar.f44989t = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = nVar.f44969B;
                if (i5 == 0 || i5 == 1) {
                    nVar.mo17514l(1);
                }
            } else if (nVar.f44969B != 0) {
                nVar.mo17514l(0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$c */
    public class C16659c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public boolean f44998d = false;

        public C16659c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f44998d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f44998d) {
                this.f44998d = false;
            } else if (((Float) C16656n.this.f44973F.getAnimatedValue()).floatValue() == 0.0f) {
                C16656n nVar = C16656n.this;
                nVar.f44974G = 0;
                nVar.mo17514l(0);
            } else {
                C16656n nVar2 = C16656n.this;
                nVar2.f44974G = 2;
                nVar2.f44994y.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$d */
    public class C16660d implements ValueAnimator.AnimatorUpdateListener {
        public C16660d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C16656n.this.f44978f.setAlpha(floatValue);
            C16656n.this.f44979g.setAlpha(floatValue);
            C16656n.this.f44994y.invalidate();
        }
    }

    public C16656n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f44973F = ofFloat;
        this.f44974G = 0;
        C16657a aVar = new C16657a();
        this.f44975H = aVar;
        C16658b bVar = new C16658b();
        this.f44978f = stateListDrawable;
        this.f44979g = drawable;
        this.f44982j = stateListDrawable2;
        this.f44983n = drawable2;
        this.f44980h = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f44981i = Math.max(i, drawable.getIntrinsicWidth());
        this.f44984o = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f44985p = Math.max(i, drawable2.getIntrinsicWidth());
        this.f44976d = i2;
        this.f44977e = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C16659c());
        ofFloat.addUpdateListener(new C16660d());
        RecyclerView recyclerView2 = this.f44994y;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo17093j1(this);
                this.f44994y.mo17096l1(this);
                this.f44994y.mo17098m1(bVar);
                this.f44994y.removeCallbacks(aVar);
            }
            this.f44994y = recyclerView;
            if (recyclerView != null) {
                recyclerView.mo17085h0(this);
                this.f44994y.mo17092j0(this);
                this.f44994y.mo17043c(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (r7 >= 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0116, code lost:
        if (r4 >= 0) goto L_0x0118;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126c(androidx.recyclerview.widget.RecyclerView r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            int r11 = r10.f44969B
            if (r11 != 0) goto L_0x0005
            return
        L_0x0005:
            int r11 = r12.getAction()
            r0 = 2
            r1 = 1
            if (r11 != 0) goto L_0x0047
            float r11 = r12.getX()
            float r2 = r12.getY()
            boolean r11 = r10.mo17513k(r11, r2)
            float r2 = r12.getX()
            float r3 = r12.getY()
            boolean r2 = r10.mo17512j(r2, r3)
            if (r11 != 0) goto L_0x0029
            if (r2 == 0) goto L_0x0121
        L_0x0029:
            if (r2 == 0) goto L_0x0036
            r10.f44970C = r1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r11 = (float) r11
            r10.f44991v = r11
            goto L_0x0042
        L_0x0036:
            if (r11 == 0) goto L_0x0042
            r10.f44970C = r0
            float r11 = r12.getY()
            int r11 = (int) r11
            float r11 = (float) r11
            r10.f44988s = r11
        L_0x0042:
            r10.mo17514l(r0)
            goto L_0x0121
        L_0x0047:
            int r11 = r12.getAction()
            r2 = 0
            if (r11 != r1) goto L_0x005e
            int r11 = r10.f44969B
            if (r11 != r0) goto L_0x005e
            r11 = 0
            r10.f44988s = r11
            r10.f44991v = r11
            r10.mo17514l(r1)
            r10.f44970C = r2
            goto L_0x0121
        L_0x005e:
            int r11 = r12.getAction()
            if (r11 != r0) goto L_0x0121
            int r11 = r10.f44969B
            if (r11 != r0) goto L_0x0121
            r10.mo17515m()
            int r11 = r10.f44970C
            r3 = 1073741824(0x40000000, float:2.0)
            if (r11 != r1) goto L_0x00c7
            float r11 = r12.getX()
            int[] r4 = r10.f44972E
            int r5 = r10.f44977e
            r4[r2] = r5
            int r6 = r10.f44992w
            int r6 = r6 - r5
            r4[r1] = r6
            float r5 = (float) r5
            float r6 = (float) r6
            float r11 = java.lang.Math.min(r6, r11)
            float r11 = java.lang.Math.max(r5, r11)
            int r5 = r10.f44990u
            float r5 = (float) r5
            float r5 = r5 - r11
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0097
            goto L_0x00c7
        L_0x0097:
            float r5 = r10.f44991v
            androidx.recyclerview.widget.RecyclerView r6 = r10.f44994y
            int r6 = r6.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r7 = r10.f44994y
            int r7 = r7.computeHorizontalScrollOffset()
            int r8 = r10.f44992w
            r9 = r4[r1]
            r4 = r4[r2]
            int r9 = r9 - r4
            if (r9 != 0) goto L_0x00b0
        L_0x00ae:
            r4 = 0
            goto L_0x00be
        L_0x00b0:
            float r4 = r11 - r5
            float r5 = (float) r9
            float r4 = r4 / r5
            int r6 = r6 - r8
            float r5 = (float) r6
            float r4 = r4 * r5
            int r4 = (int) r4
            int r7 = r7 + r4
            if (r7 >= r6) goto L_0x00ae
            if (r7 < 0) goto L_0x00ae
        L_0x00be:
            if (r4 == 0) goto L_0x00c5
            androidx.recyclerview.widget.RecyclerView r5 = r10.f44994y
            r5.scrollBy(r4, r2)
        L_0x00c5:
            r10.f44991v = r11
        L_0x00c7:
            int r11 = r10.f44970C
            if (r11 != r0) goto L_0x0121
            float r11 = r12.getY()
            int[] r12 = r10.f44971D
            int r0 = r10.f44977e
            r12[r2] = r0
            int r4 = r10.f44993x
            int r4 = r4 - r0
            r12[r1] = r4
            float r0 = (float) r0
            float r4 = (float) r4
            float r11 = java.lang.Math.min(r4, r11)
            float r11 = java.lang.Math.max(r0, r11)
            int r0 = r10.f44987r
            float r0 = (float) r0
            float r0 = r0 - r11
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f1
            goto L_0x0121
        L_0x00f1:
            float r0 = r10.f44988s
            androidx.recyclerview.widget.RecyclerView r3 = r10.f44994y
            int r3 = r3.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r4 = r10.f44994y
            int r4 = r4.computeVerticalScrollOffset()
            int r5 = r10.f44993x
            r1 = r12[r1]
            r12 = r12[r2]
            int r1 = r1 - r12
            if (r1 != 0) goto L_0x010a
        L_0x0108:
            r12 = 0
            goto L_0x0118
        L_0x010a:
            float r12 = r11 - r0
            float r0 = (float) r1
            float r12 = r12 / r0
            int r3 = r3 - r5
            float r0 = (float) r3
            float r12 = r12 * r0
            int r12 = (int) r12
            int r4 = r4 + r12
            if (r4 >= r3) goto L_0x0108
            if (r4 < 0) goto L_0x0108
        L_0x0118:
            if (r12 == 0) goto L_0x011f
            androidx.recyclerview.widget.RecyclerView r0 = r10.f44994y
            r0.scrollBy(r2, r12)
        L_0x011f:
            r10.f44988s = r11
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C16656n.mo126c(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    /* renamed from: d */
    public void mo127d(boolean z) {
    }

    /* renamed from: e */
    public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f44969B;
        if (i != 1) {
            return i == 2;
        }
        boolean k = mo17513k(motionEvent.getX(), motionEvent.getY());
        boolean j = mo17512j(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!k && !j) {
            return false;
        }
        if (j) {
            this.f44970C = 1;
            this.f44991v = (float) ((int) motionEvent.getX());
        } else if (k) {
            this.f44970C = 2;
            this.f44988s = (float) ((int) motionEvent.getY());
        }
        mo17514l(2);
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        if (this.f44992w != this.f44994y.getWidth() || this.f44993x != this.f44994y.getHeight()) {
            this.f44992w = this.f44994y.getWidth();
            this.f44993x = this.f44994y.getHeight();
            mo17514l(0);
        } else if (this.f44974G != 0) {
            if (this.f44995z) {
                int i = this.f44992w;
                int i2 = this.f44980h;
                int i3 = i - i2;
                int i4 = this.f44987r;
                int i5 = this.f44986q;
                int i6 = i4 - (i5 / 2);
                this.f44978f.setBounds(0, 0, i2, i5);
                this.f44979g.setBounds(0, 0, this.f44981i, this.f44993x);
                RecyclerView recyclerView2 = this.f44994y;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                boolean z = true;
                if (C107207u.C107209c.m145195d(recyclerView2) != 1) {
                    z = false;
                }
                if (z) {
                    this.f44979g.draw(canvas);
                    canvas.translate((float) this.f44980h, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f44978f.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.f44980h), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f44979g.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f44978f.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f44968A) {
                int i7 = this.f44993x;
                int i8 = this.f44984o;
                int i9 = i7 - i8;
                int i15 = this.f44990u;
                int i16 = this.f44989t;
                int i17 = i15 - (i16 / 2);
                this.f44982j.setBounds(0, 0, i16, i8);
                this.f44983n.setBounds(0, 0, this.f44992w, this.f44985p);
                canvas.translate(0.0f, (float) i9);
                this.f44983n.draw(canvas);
                canvas.translate((float) i17, 0.0f);
                this.f44982j.draw(canvas);
                canvas.translate((float) (-i17), (float) (-i9));
            }
        }
    }

    /* renamed from: j */
    public boolean mo17512j(float f, float f2) {
        if (f2 >= ((float) (this.f44993x - this.f44984o))) {
            int i = this.f44990u;
            int i2 = this.f44989t;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: k */
    public boolean mo17513k(float f, float f2) {
        RecyclerView recyclerView = this.f44994y;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107209c.m145195d(recyclerView) == 1) {
            if (f > ((float) (this.f44980h / 2))) {
                return false;
            }
        } else if (f < ((float) (this.f44992w - this.f44980h))) {
            return false;
        }
        int i = this.f44987r;
        int i2 = this.f44986q / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    /* renamed from: l */
    public void mo17514l(int i) {
        if (i == 2 && this.f44969B != 2) {
            this.f44978f.setState(f44966I);
            this.f44994y.removeCallbacks(this.f44975H);
        }
        if (i == 0) {
            this.f44994y.invalidate();
        } else {
            mo17515m();
        }
        if (this.f44969B == 2 && i != 2) {
            this.f44978f.setState(f44967J);
            this.f44994y.removeCallbacks(this.f44975H);
            this.f44994y.postDelayed(this.f44975H, (long) 1200);
        } else if (i == 1) {
            this.f44994y.removeCallbacks(this.f44975H);
            this.f44994y.postDelayed(this.f44975H, (long) 1500);
        }
        this.f44969B = i;
    }

    /* renamed from: m */
    public void mo17515m() {
        int i = this.f44974G;
        if (i != 0) {
            if (i == 3) {
                this.f44973F.cancel();
            } else {
                return;
            }
        }
        this.f44974G = 1;
        ValueAnimator valueAnimator = this.f44973F;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f44973F.setDuration(500);
        this.f44973F.setStartDelay(0);
        this.f44973F.start();
    }
}
