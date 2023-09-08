package v21;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* renamed from: v21.a */
public class C102123a extends View {

    /* renamed from: d */
    public Paint f300709d;

    /* renamed from: e */
    public RectF f300710e;

    /* renamed from: f */
    public RectF f300711f;

    /* renamed from: g */
    public RectF f300712g;

    /* renamed from: h */
    public RectF f300713h;

    /* renamed from: i */
    public int f300714i;

    /* renamed from: j */
    public int f300715j;

    /* renamed from: n */
    public int f300716n;

    /* renamed from: o */
    public int f300717o;

    /* renamed from: p */
    public int f300718p;

    /* renamed from: q */
    public int f300719q;

    /* renamed from: r */
    public C102124a f300720r;

    /* renamed from: v21.a$a */
    public interface C102124a {
    }

    public C102123a(Context context, int i, int i2, int i3, int i4, C102124a aVar) {
        super(context);
        this.f300719q = i;
        this.f300715j = i2;
        this.f300716n = i3;
        int i5 = (i2 * 2) / 5;
        this.f300714i = i5;
        this.f300717o = i5;
        this.f300718p = (i5 * 3) / 4;
        Paint paint = new Paint(1);
        this.f300709d = paint;
        paint.setColor(i4);
        this.f300720r = aVar;
        int i6 = this.f300717o;
        int i7 = this.f300715j;
        int i8 = this.f300714i;
        this.f300710e = new RectF((float) i6, (float) i7, (float) (i6 + (i8 * 2)), (float) (i7 + (i8 * 2)));
        int i9 = this.f300718p;
        int i15 = this.f300714i;
        int i16 = this.f300715j;
        this.f300711f = new RectF((float) (i9 - i15), (float) i16, (float) (i9 + i15), (float) (i16 + (i15 * 2)));
        int i17 = this.f300717o;
        int i18 = this.f300715j;
        int i19 = this.f300714i;
        this.f300712g = new RectF((float) i17, (float) i18, (float) (i17 + (i19 * 2)), (float) (i18 + (i19 * 2)));
        int i25 = this.f300717o;
        int i26 = this.f300716n;
        int i27 = this.f300715j;
        int i28 = i25 + i26;
        int i29 = this.f300714i;
        this.f300713h = new RectF((float) (i25 + i26), (float) i27, (float) (i28 + (i29 * 2)), (float) (i27 + (i29 * 2)));
    }

    public int getOffsetForCursorMid() {
        return this.f300717o + this.f300714i + 1;
    }

    public int getType() {
        return this.f300719q;
    }

    public int getViewHeight() {
        return this.f300715j + (this.f300714i * 2) + this.f300717o;
    }

    public int getViewPadding() {
        return this.f300717o;
    }

    public int getViewWidth() {
        int i;
        int i2;
        int i3 = this.f300719q;
        if (i3 == 3 || i3 == 4) {
            i = this.f300717o + this.f300714i;
            i2 = this.f300718p;
        } else {
            i = this.f300716n;
            i2 = (this.f300717o + this.f300714i) * 2;
        }
        return i + i2;
    }

    public void onDraw(Canvas canvas) {
        int i = this.f300719q;
        if (i == 2) {
            int i2 = this.f300717o;
            int i3 = this.f300714i;
            canvas.drawRect((float) (i2 + i3), 0.0f, (float) (i2 + i3 + this.f300716n), (float) (this.f300715j + (i3 * 2)), this.f300709d);
            canvas.drawArc(this.f300712g, 90.0f, 180.0f, true, this.f300709d);
            canvas.drawArc(this.f300713h, 270.0f, 180.0f, true, this.f300709d);
        } else if (i == 3) {
            int i4 = this.f300717o;
            int i5 = this.f300714i;
            int i6 = this.f300718p;
            canvas.drawRect((float) (((i4 + i5) + i6) - this.f300716n), 0.0f, (float) (i4 + i5 + i6), (float) this.f300715j, this.f300709d);
            canvas.drawArc(this.f300710e, 90.0f, 180.0f, true, this.f300709d);
            int i7 = this.f300717o;
            int i8 = this.f300714i;
            int i9 = this.f300715j;
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) (i7 + i8), (float) i9, (float) (i7 + i8 + this.f300718p), (float) (i9 + (i8 * 2)), this.f300709d);
        } else if (i == 4) {
            canvas.drawRect(0.0f, 0.0f, (float) this.f300716n, (float) this.f300715j, this.f300709d);
            int i15 = this.f300715j;
            canvas.drawRect(0.0f, (float) i15, (float) this.f300718p, (float) (i15 + (this.f300714i * 2)), this.f300709d);
            canvas.drawArc(this.f300711f, 270.0f, 180.0f, true, this.f300709d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r3 != 3) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            v21.a$a r0 = r7.f300720r
            r1 = 1
            if (r0 == 0) goto L_0x00de
            int r2 = r7.f300719q
            v21.i r0 = (v21.C102132i) r0
            boolean r3 = v21.C102132i.f300744K
            if (r3 == 0) goto L_0x00de
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r0.f300745A
            if (r3 != 0) goto L_0x0013
            goto L_0x00de
        L_0x0013:
            v21.b r3 = r0.f300777x
            if (r3 == 0) goto L_0x0025
            int r3 = r3.mo141641a()
            if (r3 != r1) goto L_0x0025
            v21.b r3 = r0.f300777x
            int r3 = r3.f300721a
            if (r3 == r2) goto L_0x0025
            goto L_0x00de
        L_0x0025:
            int r3 = r8.getAction()
            r4 = -1
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 0
            if (r3 == 0) goto L_0x0087
            if (r3 == r1) goto L_0x0058
            r2 = 2
            if (r3 == r2) goto L_0x0039
            r8 = 3
            if (r3 == r8) goto L_0x0058
            goto L_0x00de
        L_0x0039:
            v21.b r2 = r0.f300777x
            if (r2 == 0) goto L_0x00de
            int r2 = r2.mo141641a()
            if (r2 != r1) goto L_0x00de
            v21.b r2 = r0.f300777x
            float r3 = r8.getRawX()
            r2.f300722b = r3
            v21.b r2 = r0.f300777x
            float r8 = r8.getRawY()
            r2.f300723c = r8
            r0.mo141653G(r1)
            goto L_0x00de
        L_0x0058:
            v21.b r8 = r0.f300777x
            if (r8 != 0) goto L_0x0064
            v21.b r8 = new v21.b
            r8.<init>()
            r0.f300777x = r8
            goto L_0x007a
        L_0x0064:
            r8.f300721a = r6
            r8.f300722b = r5
            r8.f300723c = r5
            r8.f300724d = r5
            r8.f300725e = r5
            r8.f300726f = r4
            r8.f300727g = r5
            r8.f300728h = r5
            r8.f300729i = r5
            r8.f300730j = r5
            r8.f300731k = r4
        L_0x007a:
            com.tencent.mm.sdk.platformtools.MMHandler r8 = r0.f300745A
            v21.l r2 = new v21.l
            r2.<init>(r0)
            r3 = 200(0xc8, double:9.9E-322)
            r8.postDelayed(r2, r3)
            goto L_0x00de
        L_0x0087:
            v21.b r3 = r0.f300777x
            if (r3 != 0) goto L_0x0093
            v21.b r3 = new v21.b
            r3.<init>()
            r0.f300777x = r3
            goto L_0x00a9
        L_0x0093:
            r3.f300721a = r6
            r3.f300722b = r5
            r3.f300723c = r5
            r3.f300724d = r5
            r3.f300725e = r5
            r3.f300726f = r4
            r3.f300727g = r5
            r3.f300728h = r5
            r3.f300729i = r5
            r3.f300730j = r5
            r3.f300731k = r4
        L_0x00a9:
            android.widget.PopupWindow r3 = r0.f300774u
            if (r3 == 0) goto L_0x00b5
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x00b5
            r3 = 1
            goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            if (r3 != 0) goto L_0x00bb
            r0.mo141677z(r1)
        L_0x00bb:
            v21.b r0 = r0.f300777x
            float r3 = r8.getRawX()
            float r4 = r8.getRawY()
            float r5 = r8.getX()
            float r8 = r8.getY()
            r0.f300721a = r2
            r0.f300722b = r3
            r0.f300723c = r4
            r0.f300724d = r5
            r0.f300725e = r8
            if (r2 != r1) goto L_0x00dc
            r0.f300726f = r6
            goto L_0x00de
        L_0x00dc:
            r0.f300726f = r6
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v21.C102123a.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
