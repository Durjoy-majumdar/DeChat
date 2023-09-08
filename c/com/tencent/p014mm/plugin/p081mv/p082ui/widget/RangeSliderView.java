package com.tencent.p014mm.plugin.p081mv.p082ui.widget;

import a14.C53973z1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Range;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import my3.C61595o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000256B'\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR*\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010%\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/RangeSliderView;", "Landroid/widget/FrameLayout;", "", "value", "d", "I", "getStart", "()I", "setStart", "(I)V", "start", "e", "getEnd", "setEnd", "end", "f", "getProgress", "setProgress", "progress", "g", "getMinWidth", "setMinWidth", "minWidth", "h", "getMaxEnd", "setMaxEnd", "maxEnd", "", "i", "Z", "isActive", "()Z", "setActive", "(Z)V", "E", "getKeepSizeOnStartChanged", "setKeepSizeOnStartChanged", "keepSizeOnStartChanged", "Lcom/tencent/mm/plugin/mv/ui/widget/RangeSliderView$a;", "F", "Lcom/tencent/mm/plugin/mv/ui/widget/RangeSliderView$a;", "getCallback", "()Lcom/tencent/mm/plugin/mv/ui/widget/RangeSliderView$a;", "setCallback", "(Lcom/tencent/mm/plugin/mv/ui/widget/RangeSliderView$a;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.widget.RangeSliderView */
public final class RangeSliderView extends FrameLayout {

    /* renamed from: A */
    public Range<Float> f163742A;

    /* renamed from: B */
    public final int[] f163743B;

    /* renamed from: C */
    public RecyclerView f163744C;

    /* renamed from: D */
    public int f163745D;

    /* renamed from: E */
    public boolean f163746E;

    /* renamed from: F */
    public C57145a f163747F;

    /* renamed from: G */
    public float f163748G;

    /* renamed from: H */
    public C53973z1 f163749H;

    /* renamed from: d */
    public int f163750d;

    /* renamed from: e */
    public int f163751e;

    /* renamed from: f */
    public int f163752f;

    /* renamed from: g */
    public int f163753g;

    /* renamed from: h */
    public int f163754h;

    /* renamed from: i */
    public boolean f163755i;

    /* renamed from: j */
    public final Drawable f163756j;

    /* renamed from: n */
    public final Drawable f163757n;

    /* renamed from: o */
    public final Paint f163758o;

    /* renamed from: p */
    public final Paint f163759p;

    /* renamed from: q */
    public final int f163760q;

    /* renamed from: r */
    public final Rect f163761r;

    /* renamed from: s */
    public float f163762s;

    /* renamed from: t */
    public int f163763t;

    /* renamed from: u */
    public int f163764u;

    /* renamed from: v */
    public C57146b f163765v;

    /* renamed from: w */
    public boolean f163766w;

    /* renamed from: x */
    public final Path f163767x;

    /* renamed from: y */
    public final RectF f163768y;

    /* renamed from: z */
    public final float f163769z;

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$a */
    public interface C57145a {
        /* renamed from: a */
        void mo80722a(int i, int i2);

        /* renamed from: b */
        void mo80723b(C57146b bVar, int i, int i2);

        /* renamed from: c */
        void mo80724c(C57146b bVar, int i, int i2);

        /* renamed from: d */
        void mo80725d(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b */
    public enum C57146b {
        None,
        Left,
        Right
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RangeSliderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final int mo80696a(int i) {
        return (int) (getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: b */
    public final boolean mo80697b(int i, boolean z) {
        Log.m105918d("MicroMsg.RangeSliderView", "handle drag: offsetX=" + i + ", outOfRange=" + z);
        C57146b bVar = this.f163765v;
        if (bVar == C57146b.Left) {
            int e = C61595o.m72297e(this.f163763t + i, 0, this.f163751e - this.f163753g);
            int i2 = this.f163750d;
            if (e != i2) {
                setStart(e);
                C57145a aVar = this.f163747F;
                if (aVar != null) {
                    aVar.mo80725d(i2, e);
                }
                this.f163766w = false;
                if (z) {
                    mo80698c(e - i2);
                } else if (!this.f163746E) {
                    RecyclerView recyclerView = this.f163744C;
                    if (recyclerView != null) {
                        recyclerView.scrollBy(-(e - i2), 0);
                    }
                    Log.m105918d("MicroMsg.RangeSliderView", "scrollBy not outOfRange: " + (-(e - i2)));
                }
                return true;
            } else if (!this.f163766w && (i2 == 0 || this.f163751e - i2 <= this.f163753g)) {
                performHapticFeedback(0, 2);
                this.f163766w = true;
            }
        } else if (bVar == C57146b.Right) {
            int e2 = C61595o.m72297e(this.f163764u + i, this.f163750d + this.f163753g, this.f163754h);
            int i3 = this.f163751e;
            if (e2 != i3) {
                setEnd(e2);
                C57145a aVar2 = this.f163747F;
                if (aVar2 != null) {
                    aVar2.mo80722a(i3, e2);
                }
                this.f163766w = false;
                if (z) {
                    mo80698c(e2 - i3);
                }
                return true;
            } else if (!this.f163766w && (i3 >= this.f163754h || i3 - this.f163750d <= this.f163753g)) {
                performHapticFeedback(0, 2);
                this.f163766w = true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo80698c(int i) {
        RecyclerView recyclerView = this.f163744C;
        if (recyclerView != null) {
            if (i < 0) {
                if (this.f163765v == C57146b.Left) {
                    int i2 = -i;
                    recyclerView.setTranslationX(recyclerView.getTranslationX() + ((float) i2));
                    Log.m105918d("MicroMsg.RangeSliderView", "1 translateX " + i2);
                } else {
                    recyclerView.scrollBy(i, 0);
                    Log.m105918d("MicroMsg.RangeSliderView", "2 scrollBy " + i);
                }
            } else if (recyclerView.getTranslationX() > 0.0f) {
                int i3 = -i;
                recyclerView.setTranslationX(recyclerView.getTranslationX() + ((float) i3));
                Log.m105918d("MicroMsg.RangeSliderView", "3 translateX " + i3);
            } else {
                recyclerView.scrollBy(i, 0);
                Log.m105918d("MicroMsg.RangeSliderView", "4 translateX " + (-i));
            }
            this.f163745D += i;
        }
    }

    /* renamed from: d */
    public final boolean mo80699d() {
        return this.f163765v == C57146b.Left && this.f163746E;
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.f163767x);
        if (mo80699d()) {
            canvas.translate((float) (-this.f163763t), 0.0f);
        } else {
            canvas.translate((float) (-this.f163750d), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.f163755i) {
            if (this.f163765v == C57146b.None) {
                int i = this.f163752f;
                int i2 = this.f163750d;
                canvas.drawRect((float) (i - i2), 0.0f, (float) ((i - i2) + this.f163760q), (float) canvas.getHeight(), this.f163759p);
            }
            canvas.drawRect((float) this.f163756j.getBounds().right, (float) (-this.f163761r.top), (float) this.f163757n.getBounds().left, 0.0f, this.f163758o);
            canvas.drawRect((float) this.f163756j.getBounds().right, (float) canvas.getHeight(), (float) this.f163757n.getBounds().left, ((float) canvas.getHeight()) + ((float) this.f163761r.bottom), this.f163758o);
            this.f163756j.draw(canvas);
            this.f163757n.draw(canvas);
        }
    }

    public final C57145a getCallback() {
        return this.f163747F;
    }

    public final int getEnd() {
        return this.f163751e;
    }

    public final boolean getKeepSizeOnStartChanged() {
        return this.f163746E;
    }

    public final int getMaxEnd() {
        return this.f163754h;
    }

    public final int getMinWidth() {
        return this.f163753g;
    }

    public final int getProgress() {
        return this.f163752f;
    }

    public final int getStart() {
        return this.f163750d;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011  */
    public void onAttachedToWindow() {
        /*
            r2 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x000e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 == 0) goto L_0x0025
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L_0x001a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r2.f163744C = r0
            return
        L_0x001a:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x000e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x000f
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RangeSliderView should be used inside a RecyclerView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C53973z1 z1Var = this.f163749H;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f163749H = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        if (mo80699d()) {
            RectF rectF = this.f163768y;
            int i6 = this.f163750d;
            int i7 = this.f163763t;
            rectF.left = (float) (i6 - i7);
            rectF.right = (float) (this.f163751e - i7);
        } else {
            RectF rectF2 = this.f163768y;
            rectF2.left = 0.0f;
            rectF2.right = (float) (this.f163751e - this.f163750d);
        }
        RectF rectF3 = this.f163768y;
        rectF3.top = 0.0f;
        rectF3.bottom = (float) i5;
        this.f163767x.reset();
        Path path = this.f163767x;
        RectF rectF4 = this.f163768y;
        float f = this.f163769z;
        path.addRoundRect(rectF4, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CW);
        Rect rect = this.f163761r;
        float f2 = (float) (rect.top + i5 + rect.bottom);
        int intrinsicHeight = (int) ((f2 / ((float) this.f163756j.getIntrinsicHeight())) * ((float) this.f163756j.getIntrinsicWidth()));
        if (mo80699d()) {
            Drawable drawable = this.f163756j;
            int i8 = this.f163750d;
            int i9 = this.f163763t;
            Rect rect2 = this.f163761r;
            drawable.setBounds((i8 - i9) - rect2.left, -rect2.top, (i8 - i9) + intrinsicHeight, rect2.bottom + i5);
        } else {
            Drawable drawable2 = this.f163756j;
            Rect rect3 = this.f163761r;
            drawable2.setBounds(-rect3.left, -rect3.top, intrinsicHeight, rect3.bottom + i5);
        }
        int intrinsicHeight2 = (int) ((f2 / ((float) this.f163757n.getIntrinsicHeight())) * ((float) this.f163757n.getIntrinsicWidth()));
        if (mo80699d()) {
            Drawable drawable3 = this.f163757n;
            int i15 = this.f163751e;
            int i16 = this.f163763t;
            int i17 = (i15 - i16) - intrinsicHeight2;
            Rect rect4 = this.f163761r;
            drawable3.setBounds(i17, -rect4.top, (i15 - i16) + rect4.right, i5 + rect4.bottom);
        } else {
            Drawable drawable4 = this.f163757n;
            int i18 = this.f163751e;
            int i19 = this.f163750d;
            int i25 = (i18 - i19) - intrinsicHeight2;
            Rect rect5 = this.f163761r;
            drawable4.setBounds(i25, -rect5.top, (i18 - i19) + rect5.right, i5 + rect5.bottom);
        }
        View childAt = getChildAt(0);
        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.widget.MvFrameListView");
        MvFrameListView mvFrameListView = (MvFrameListView) childAt;
        mvFrameListView.setDrawStart(this.f163750d);
        mvFrameListView.setDrawEnd(this.f163751e);
    }

    public void onMeasure(int i, int i2) {
        if (mo80699d()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f163751e - this.f163763t, 1073741824), i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f163751e - this.f163750d, 1073741824), i2);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RecyclerView recyclerView = this.f163744C;
        if (recyclerView != null) {
            recyclerView.getLocationOnScreen(this.f163743B);
            this.f163742A = new Range<>(Float.valueOf(((float) this.f163743B[0]) + (getResources().getDisplayMetrics().density * 40.0f)), Float.valueOf(((float) (this.f163743B[0] + recyclerView.getWidth())) - (getResources().getDisplayMetrics().density * 40.0f)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r2 != 3) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r0 = com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView.C57146b.Left
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r1 = com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView.C57146b.None
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r13, r2)
            boolean r2 = r12.f163755i
            if (r2 != 0) goto L_0x0012
            boolean r13 = super.onTouchEvent(r13)
            return r13
        L_0x0012:
            int r2 = r13.getActionMasked()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00c1
            r5 = 0
            if (r2 == r4) goto L_0x009a
            r6 = 2
            if (r2 == r6) goto L_0x0025
            r0 = 3
            if (r2 == r0) goto L_0x009a
            goto L_0x00bf
        L_0x0025:
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r2 = r12.f163765v
            if (r2 == r1) goto L_0x00bf
            android.util.Range<java.lang.Float> r1 = r12.f163742A
            float r2 = r13.getRawX()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x007d
            a14.z1 r1 = r12.f163749H
            if (r1 == 0) goto L_0x0047
            a14.a r1 = (a14.C53851a) r1
            boolean r1 = r1.mo74466a()
            if (r1 != r4) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x007a
            a14.z1 r1 = r12.f163749H
            if (r1 == 0) goto L_0x0051
            a14.C53973z1.C53974a.m60623a(r1, r5, r4, r5)
        L_0x0051:
            gy3.d0 r1 = new gy3.d0
            r1.<init>()
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r2 = r12.f163765v
            if (r2 != r0) goto L_0x005f
            int r0 = r12.f163750d
            int r2 = r12.f163763t
            goto L_0x0063
        L_0x005f:
            int r0 = r12.f163751e
            int r2 = r12.f163764u
        L_0x0063:
            int r0 = r0 - r2
            r1.f27483d = r0
            a14.s1 r6 = a14.C0001s1.f0d
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r7 = f14.C58901s.f168555a
            r8 = 0
            vb2.h r9 = new vb2.h
            r9.<init>(r12, r1, r5)
            r10 = 2
            r11 = 0
            a14.z1 r0 = a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            r12.f163749H = r0
        L_0x007a:
            r0 = 1
            goto L_0x0125
        L_0x007d:
            float r0 = r13.getRawX()
            float r1 = r12.f163762s
            float r0 = r0 - r1
            int r0 = iy3.C60641c.m70921b(r0)
            int r1 = r12.f163745D
            int r0 = r0 + r1
            boolean r0 = r12.mo80697b(r0, r3)
            a14.z1 r1 = r12.f163749H
            if (r1 == 0) goto L_0x0096
            a14.C53973z1.C53974a.m60623a(r1, r5, r4, r5)
        L_0x0096:
            r12.f163749H = r5
            goto L_0x0125
        L_0x009a:
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r0 = r12.f163765v
            if (r0 == r1) goto L_0x00b6
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$a r2 = r12.f163747F
            if (r2 == 0) goto L_0x00a9
            int r6 = r12.f163750d
            int r7 = r12.f163751e
            r2.mo80723b(r0, r6, r7)
        L_0x00a9:
            r12.f163765v = r1
            androidx.recyclerview.widget.RecyclerView r0 = r12.f163744C
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            r1 = 0
            r0.setTranslationX(r1)
        L_0x00b4:
            r12.f163745D = r3
        L_0x00b6:
            a14.z1 r0 = r12.f163749H
            if (r0 == 0) goto L_0x00bd
            a14.C53973z1.C53974a.m60623a(r0, r5, r4, r5)
        L_0x00bd:
            r12.f163749H = r5
        L_0x00bf:
            r0 = 0
            goto L_0x0125
        L_0x00c1:
            float r1 = r13.getRawX()
            r12.f163762s = r1
            int r1 = r12.f163750d
            r12.f163763t = r1
            int r1 = r12.f163751e
            r12.f163764u = r1
            float r1 = r13.getX()
            android.graphics.drawable.Drawable r2 = r12.f163756j
            android.graphics.Rect r2 = r2.getBounds()
            int r2 = r2.right
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00f7
            r12.f163765v = r0
            android.view.ViewParent r0 = r12.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$a r0 = r12.f163747F
            if (r0 == 0) goto L_0x0120
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r1 = r12.f163765v
            int r2 = r12.f163750d
            int r5 = r12.f163751e
            r0.mo80724c(r1, r2, r5)
            goto L_0x0120
        L_0x00f7:
            float r0 = r13.getX()
            android.graphics.drawable.Drawable r1 = r12.f163757n
            android.graphics.Rect r1 = r1.getBounds()
            int r1 = r1.left
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0122
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r0 = com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView.C57146b.Right
            r12.f163765v = r0
            android.view.ViewParent r0 = r12.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$a r0 = r12.f163747F
            if (r0 == 0) goto L_0x0120
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$b r1 = r12.f163765v
            int r2 = r12.f163750d
            int r5 = r12.f163751e
            r0.mo80724c(r1, r2, r5)
        L_0x0120:
            r0 = 1
            goto L_0x0123
        L_0x0122:
            r0 = 0
        L_0x0123:
            r12.f163766w = r3
        L_0x0125:
            float r1 = r13.getRawX()
            r12.f163748G = r1
            if (r0 != 0) goto L_0x0133
            boolean r13 = super.onTouchEvent(r13)
            if (r13 == 0) goto L_0x0134
        L_0x0133:
            r3 = 1
        L_0x0134:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setActive(boolean z) {
        this.f163755i = z;
        invalidate();
    }

    public final void setCallback(C57145a aVar) {
        this.f163747F = aVar;
    }

    public final void setEnd(int i) {
        if (i < 0) {
            this.f163751e = 0;
        } else {
            this.f163751e = i;
        }
        requestLayout();
    }

    public final void setKeepSizeOnStartChanged(boolean z) {
        this.f163746E = z;
    }

    public final void setMaxEnd(int i) {
        this.f163754h = i;
    }

    public final void setMinWidth(int i) {
        this.f163753g = i;
    }

    public final void setProgress(int i) {
        this.f163752f = C61595o.m72297e(i, this.f163750d, this.f163751e);
        postInvalidate();
    }

    public final void setStart(int i) {
        if (i < 0) {
            this.f163750d = 0;
        } else {
            this.f163750d = i;
        }
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RangeSliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f163756j = new BitmapDrawable(getResources(), BitmapUtil.getBitmapNative((int) C0966R.raw.music_mv_slider_left_bar, getResources().getDisplayMetrics().density));
        this.f163757n = new BitmapDrawable(getResources(), BitmapUtil.getBitmapNative((int) C0966R.raw.music_mv_slider_right_bar, getResources().getDisplayMetrics().density));
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.f163758o = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1761607681);
        paint2.setStyle(Paint.Style.FILL);
        this.f163759p = paint2;
        this.f163760q = mo80696a(2);
        this.f163761r = new Rect(mo80696a(2), mo80696a(2), mo80696a(2), mo80696a(2));
        this.f163762s = -1.0f;
        this.f163765v = C57146b.None;
        this.f163767x = new Path();
        this.f163768y = new RectF();
        this.f163769z = getResources().getDisplayMetrics().density * 4.0f;
        Float valueOf = Float.valueOf(0.0f);
        this.f163742A = new Range<>(valueOf, valueOf);
        this.f163743B = new int[2];
        setClipToPadding(false);
        setClipChildren(false);
    }
}
