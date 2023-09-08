package com.tencent.p014mm.plugin.vlog.p117ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.p117ui.LabelSlider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/SliderTrackView;", "Landroid/view/View;", "", "pointCount", "Lrx3/b0;", "setPointCount", "index", "setSelection", "color", "setTrackColor", "", "lineWidth", "setTrackLineWidth", "offset", "setStartOffset", "Landroid/graphics/drawable/Drawable;", "drawable", "setThumbDrawable", "", "getTrackPoint", "Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;", "z", "Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;", "getCallback", "()Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;", "setCallback", "(Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.SliderTrackView */
public final class SliderTrackView extends View {

    /* renamed from: d */
    public final String f207408d;

    /* renamed from: e */
    public final int f207409e;

    /* renamed from: f */
    public float f207410f;

    /* renamed from: g */
    public float f207411g;

    /* renamed from: h */
    public float f207412h;

    /* renamed from: i */
    public float f207413i;

    /* renamed from: j */
    public boolean f207414j;

    /* renamed from: n */
    public boolean f207415n;

    /* renamed from: o */
    public final Paint f207416o;

    /* renamed from: p */
    public int f207417p;

    /* renamed from: q */
    public int f207418q;

    /* renamed from: r */
    public int f207419r;

    /* renamed from: s */
    public final LinkedList<PointF> f207420s;

    /* renamed from: t */
    public int f207421t;

    /* renamed from: u */
    public float f207422u;

    /* renamed from: v */
    public final Rect f207423v;

    /* renamed from: w */
    public int f207424w;

    /* renamed from: x */
    public int f207425x;

    /* renamed from: y */
    public Drawable f207426y;

    /* renamed from: z */
    public LabelSlider.C71571b f207427z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderTrackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f207408d = "MicroMsg.LabelSlider";
        Paint paint = new Paint();
        this.f207416o = paint;
        this.f207417p = 5;
        this.f207418q = C76577a.m92157h(context, C0966R.dimen.f3753d4);
        this.f207419r = C76577a.m92157h(context, C0966R.dimen.f3766df);
        this.f207420s = new LinkedList<>();
        this.f207423v = new Rect();
        this.f207424w = 48;
        this.f207425x = 48;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-855638017);
        paint.setStrokeWidth(C76577a.m92156g(context));
        this.f207409e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    public final void mo98712a() {
        Rect rect = this.f207423v;
        float f = this.f207422u;
        float f2 = (float) (this.f207425x / 2);
        rect.top = (int) (f - f2);
        rect.bottom = (int) (f + f2);
        float f3 = this.f207420s.get(this.f207421t).x;
        Rect rect2 = this.f207423v;
        float f4 = (float) (this.f207424w / 2);
        rect2.left = (int) (f3 - f4);
        rect2.right = (int) (f3 + f4);
    }

    /* renamed from: b */
    public final void mo98713b() {
        int width = getWidth();
        int i = this.f207418q;
        int i2 = (width - (i * 2)) / (this.f207417p - 1);
        float f = (float) i;
        float height = ((float) getHeight()) / 2.0f;
        this.f207420s.clear();
        this.f207420s.add(new PointF(f, height));
        int i3 = this.f207417p - 1;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f207420s.add(new PointF(((float) (i2 * i4)) + f + ((float) i2), height));
        }
        this.f207422u = height;
        mo98712a();
        postInvalidate();
    }

    public final LabelSlider.C71571b getCallback() {
        return this.f207427z;
    }

    public final List<Float> getTrackPoint() {
        LinkedList<PointF> linkedList = this.f207420s;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (PointF pointF : linkedList) {
            arrayList.add(Float.valueOf(pointF.x));
        }
        return arrayList;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f207420s.size() >= 2) {
            float height = ((float) getHeight()) / 2.0f;
            int i = this.f207419r;
            float f = height - ((float) (i / 2));
            float f2 = ((float) (i / 2)) + height;
            int i2 = 0;
            canvas.drawLine(this.f207420s.get(0).x, f, this.f207420s.get(0).x, f2, this.f207416o);
            int i3 = this.f207417p - 1;
            while (i2 < i3) {
                int i4 = i2 + 1;
                canvas.drawLine(this.f207420s.get(i2).x, height, this.f207420s.get(i4).x, height, this.f207416o);
                canvas.drawLine(this.f207420s.get(i4).x, f, this.f207420s.get(i4).x, f2, this.f207416o);
                i2 = i4;
            }
            Drawable drawable = this.f207426y;
            if (drawable != null) {
                drawable.setBounds(this.f207423v);
            }
            Drawable drawable2 = this.f207426y;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo98713b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r9, r0)
            int r0 = r9.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0131
            r2 = 2
            if (r0 == r1) goto L_0x00d1
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x00d1
            goto L_0x0157
        L_0x0016:
            float r0 = r9.getX()
            r8.f207412h = r0
            float r9 = r9.getY()
            r8.f207413i = r9
            boolean r9 = r8.f207415n
            if (r9 != 0) goto L_0x0048
            float r9 = r8.f207412h
            float r0 = r8.f207410f
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r0 = r8.f207409e
            float r0 = (float) r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0046
            float r9 = r8.f207413i
            float r0 = r8.f207411g
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r0 = r8.f207409e
            float r0 = (float) r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0048
        L_0x0046:
            r8.f207415n = r1
        L_0x0048:
            boolean r9 = r8.f207414j
            if (r9 == 0) goto L_0x0157
            float r9 = r8.f207412h
            java.util.LinkedList<android.graphics.PointF> r0 = r8.f207420s
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = sx3.C36907w.m41090l(r0, r4)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x005f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0075
            java.lang.Object r4 = r0.next()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            float r4 = r4.x
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.add(r4)
            goto L_0x005f
        L_0x0075:
            java.util.Iterator r0 = r3.iterator()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x0081
            r0 = 0
            goto L_0x00a4
        L_0x0081:
            java.lang.Object r4 = r0.next()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
        L_0x008b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00a0
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = java.lang.Math.min(r4, r5)
            goto L_0x008b
        L_0x00a0:
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
        L_0x00a4:
            java.lang.Float r3 = sx3.C110818d0.m150928Z(r3)
            if (r0 == 0) goto L_0x00bd
            if (r3 != 0) goto L_0x00ad
            goto L_0x00bd
        L_0x00ad:
            float r0 = r0.floatValue()
            float r3 = r3.floatValue()
            float r9 = java.lang.Math.min(r3, r9)
            float r9 = java.lang.Math.max(r0, r9)
        L_0x00bd:
            android.graphics.Rect r0 = r8.f207423v
            int r3 = r8.f207424w
            int r3 = r3 / r2
            float r2 = (float) r3
            float r3 = r9 - r2
            int r3 = (int) r3
            r0.left = r3
            float r9 = r9 + r2
            int r9 = (int) r9
            r0.right = r9
            r8.postInvalidate()
            goto L_0x0157
        L_0x00d1:
            float r0 = r9.getX()
            r8.f207412h = r0
            float r9 = r9.getY()
            r8.f207413i = r9
            boolean r9 = r8.f207415n
            r0 = 0
            if (r9 == 0) goto L_0x00e6
            boolean r9 = r8.f207414j
            if (r9 == 0) goto L_0x012c
        L_0x00e6:
            float r9 = r8.f207412h
            java.util.LinkedList<android.graphics.PointF> r3 = r8.f207420s
            int r3 = r3.size()
            if (r3 >= r2) goto L_0x00f1
            goto L_0x0129
        L_0x00f1:
            int r2 = r8.getWidth()
            float r2 = (float) r2
            r3 = -1
            java.util.LinkedList<android.graphics.PointF> r4 = r8.f207420s
            int r4 = r4.size()
            r5 = 0
        L_0x00fe:
            if (r5 >= r4) goto L_0x0119
            java.util.LinkedList<android.graphics.PointF> r6 = r8.f207420s
            java.lang.Object r6 = r6.get(r5)
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            float r6 = r6.x
            float r6 = r9 - r6
            float r6 = java.lang.Math.abs(r6)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0116
            r3 = r5
            r2 = r6
        L_0x0116:
            int r5 = r5 + 1
            goto L_0x00fe
        L_0x0119:
            if (r3 < 0) goto L_0x0129
            r8.f207421t = r3
            r8.mo98712a()
            com.tencent.mm.plugin.vlog.ui.LabelSlider$b r9 = r8.f207427z
            if (r9 == 0) goto L_0x0129
            int r2 = r8.f207421t
            r9.mo98710a(r2)
        L_0x0129:
            r8.postInvalidate()
        L_0x012c:
            r8.f207414j = r0
            r8.f207415n = r0
            goto L_0x0157
        L_0x0131:
            float r0 = r9.getX()
            r8.f207410f = r0
            float r0 = r9.getY()
            r8.f207411g = r0
            float r0 = r9.getX()
            r8.f207412h = r0
            float r9 = r9.getY()
            r8.f207413i = r9
            android.graphics.Rect r9 = r8.f207423v
            float r0 = r8.f207410f
            int r0 = (int) r0
            float r2 = r8.f207411g
            int r2 = (int) r2
            boolean r9 = r9.contains(r0, r2)
            r8.f207414j = r9
        L_0x0157:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.SliderTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCallback(LabelSlider.C71571b bVar) {
        this.f207427z = bVar;
    }

    public final void setPointCount(int i) {
        if (i < 2) {
            Log.m105920e(this.f207408d, "invalid pointCount " + i);
            return;
        }
        this.f207417p = i;
        mo98713b();
        if (this.f207421t >= i) {
            int i2 = i - 1;
            this.f207421t = i2;
            LabelSlider.C71571b bVar = this.f207427z;
            if (bVar != null) {
                bVar.mo98710a(i2);
            }
        }
    }

    public final void setSelection(int i) {
        this.f207421t = i;
        mo98712a();
        invalidate();
    }

    public final void setStartOffset(int i) {
        this.f207418q = i;
        mo98713b();
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.f207426y = drawable;
        int i = 0;
        this.f207424w = drawable != null ? drawable.getIntrinsicWidth() : 0;
        Drawable drawable2 = this.f207426y;
        if (drawable2 != null) {
            i = drawable2.getIntrinsicHeight();
        }
        this.f207425x = i;
    }

    public final void setTrackColor(int i) {
        this.f207416o.setColor(i);
        postInvalidate();
    }

    public final void setTrackLineWidth(float f) {
        this.f207416o.setStrokeWidth(f);
        postInvalidate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SliderTrackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
