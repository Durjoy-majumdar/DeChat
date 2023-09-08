package cb3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* renamed from: cb3.a */
public class C92389a extends View {

    /* renamed from: d */
    public Paint f264370d;

    /* renamed from: e */
    public RectF f264371e;

    /* renamed from: f */
    public RectF f264372f;

    /* renamed from: g */
    public RectF f264373g;

    /* renamed from: h */
    public RectF f264374h;

    /* renamed from: i */
    public int f264375i;

    /* renamed from: j */
    public int f264376j;

    /* renamed from: n */
    public int f264377n;

    /* renamed from: o */
    public int f264378o;

    /* renamed from: p */
    public int f264379p;

    /* renamed from: q */
    public int f264380q;

    /* renamed from: r */
    public C92390a f264381r;

    /* renamed from: cb3.a$a */
    public interface C92390a {
    }

    public C92389a(Context context, int i, int i2, int i3, int i4, C92390a aVar) {
        super(context);
        this.f264380q = i;
        this.f264376j = i2;
        this.f264377n = i3;
        int i5 = (i2 * 2) / 5;
        this.f264375i = i5;
        this.f264378o = i5;
        this.f264379p = (i5 * 3) / 4;
        Paint paint = new Paint(1);
        this.f264370d = paint;
        paint.setColor(i4);
        this.f264381r = aVar;
        int i6 = this.f264378o;
        int i7 = this.f264376j;
        int i8 = this.f264375i;
        this.f264371e = new RectF((float) i6, (float) i7, (float) (i6 + (i8 * 2)), (float) (i7 + (i8 * 2)));
        int i9 = this.f264379p;
        int i15 = this.f264375i;
        int i16 = this.f264376j;
        this.f264372f = new RectF((float) (i9 - i15), (float) i16, (float) (i9 + i15), (float) (i16 + (i15 * 2)));
        int i17 = this.f264378o;
        int i18 = this.f264376j;
        int i19 = this.f264375i;
        this.f264373g = new RectF((float) i17, (float) i18, (float) (i17 + (i19 * 2)), (float) (i18 + (i19 * 2)));
        int i25 = this.f264378o;
        int i26 = this.f264377n;
        int i27 = this.f264376j;
        int i28 = i25 + i26;
        int i29 = this.f264375i;
        this.f264374h = new RectF((float) (i25 + i26), (float) i27, (float) (i28 + (i29 * 2)), (float) (i27 + (i29 * 2)));
    }

    public int getOffsetForCursorMid() {
        return this.f264378o + this.f264375i + 1;
    }

    public int getType() {
        return this.f264380q;
    }

    public int getViewHeight() {
        return this.f264376j + (this.f264375i * 2) + this.f264378o;
    }

    public int getViewPadding() {
        return this.f264378o;
    }

    public int getViewWidth() {
        int i;
        int i2;
        int i3 = this.f264380q;
        if (i3 == 3 || i3 == 4) {
            i = this.f264378o + this.f264375i;
            i2 = this.f264379p;
        } else {
            i = this.f264377n;
            i2 = (this.f264378o + this.f264375i) * 2;
        }
        return i + i2;
    }

    public void onDraw(Canvas canvas) {
        int i = this.f264380q;
        if (i == 2) {
            int i2 = this.f264378o;
            int i3 = this.f264375i;
            canvas.drawRect((float) (i2 + i3), 0.0f, (float) (i2 + i3 + this.f264377n), (float) (this.f264376j + (i3 * 2)), this.f264370d);
            canvas.drawArc(this.f264373g, 90.0f, 180.0f, true, this.f264370d);
            canvas.drawArc(this.f264374h, 270.0f, 180.0f, true, this.f264370d);
        } else if (i == 3) {
            int i4 = this.f264378o;
            int i5 = this.f264375i;
            int i6 = this.f264379p;
            canvas.drawRect((float) (((i4 + i5) + i6) - this.f264377n), 0.0f, (float) (i4 + i5 + i6), (float) this.f264376j, this.f264370d);
            canvas.drawArc(this.f264371e, 90.0f, 180.0f, true, this.f264370d);
            int i7 = this.f264378o;
            int i8 = this.f264375i;
            int i9 = this.f264376j;
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) (i7 + i8), (float) i9, (float) (i7 + i8 + this.f264379p), (float) (i9 + (i8 * 2)), this.f264370d);
        } else if (i == 4) {
            canvas.drawRect(0.0f, 0.0f, (float) this.f264377n, (float) this.f264376j, this.f264370d);
            int i15 = this.f264376j;
            canvas.drawRect(0.0f, (float) i15, (float) this.f264379p, (float) (i15 + (this.f264375i * 2)), this.f264370d);
            canvas.drawArc(this.f264372f, 270.0f, 180.0f, true, this.f264370d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r3 != 3) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            cb3.a$a r0 = r7.f264381r
            r1 = 1
            if (r0 == 0) goto L_0x00de
            int r2 = r7.f264380q
            cb3.k r0 = (cb3.C92400k) r0
            boolean r3 = cb3.C92400k.f264411N
            if (r3 == 0) goto L_0x00de
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r0.f264412A
            if (r3 != 0) goto L_0x0013
            goto L_0x00de
        L_0x0013:
            cb3.b r3 = r0.f264447x
            if (r3 == 0) goto L_0x0025
            int r3 = r3.mo126355a()
            if (r3 != r1) goto L_0x0025
            cb3.b r3 = r0.f264447x
            int r3 = r3.f264382a
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
            cb3.b r2 = r0.f264447x
            if (r2 == 0) goto L_0x00de
            int r2 = r2.mo126355a()
            if (r2 != r1) goto L_0x00de
            cb3.b r2 = r0.f264447x
            float r3 = r8.getRawX()
            r2.f264383b = r3
            cb3.b r2 = r0.f264447x
            float r8 = r8.getRawY()
            r2.f264384c = r8
            r0.mo126375K(r1)
            goto L_0x00de
        L_0x0058:
            cb3.b r8 = r0.f264447x
            if (r8 != 0) goto L_0x0064
            cb3.b r8 = new cb3.b
            r8.<init>()
            r0.f264447x = r8
            goto L_0x007a
        L_0x0064:
            r8.f264382a = r6
            r8.f264383b = r5
            r8.f264384c = r5
            r8.f264385d = r5
            r8.f264386e = r5
            r8.f264387f = r4
            r8.f264388g = r5
            r8.f264389h = r5
            r8.f264390i = r5
            r8.f264391j = r5
            r8.f264392k = r4
        L_0x007a:
            com.tencent.mm.sdk.platformtools.MMHandler r8 = r0.f264412A
            cb3.n r2 = new cb3.n
            r2.<init>(r0)
            r3 = 200(0xc8, double:9.9E-322)
            r8.postDelayed(r2, r3)
            goto L_0x00de
        L_0x0087:
            cb3.b r3 = r0.f264447x
            if (r3 != 0) goto L_0x0093
            cb3.b r3 = new cb3.b
            r3.<init>()
            r0.f264447x = r3
            goto L_0x00a9
        L_0x0093:
            r3.f264382a = r6
            r3.f264383b = r5
            r3.f264384c = r5
            r3.f264385d = r5
            r3.f264386e = r5
            r3.f264387f = r4
            r3.f264388g = r5
            r3.f264389h = r5
            r3.f264390i = r5
            r3.f264391j = r5
            r3.f264392k = r4
        L_0x00a9:
            android.widget.PopupWindow r3 = r0.f264444u
            if (r3 == 0) goto L_0x00b5
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x00b5
            r3 = 1
            goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            if (r3 != 0) goto L_0x00bb
            r0.mo126367C(r1)
        L_0x00bb:
            cb3.b r0 = r0.f264447x
            float r3 = r8.getRawX()
            float r4 = r8.getRawY()
            float r5 = r8.getX()
            float r8 = r8.getY()
            r0.f264382a = r2
            r0.f264383b = r3
            r0.f264384c = r4
            r0.f264385d = r5
            r0.f264386e = r8
            if (r2 != r1) goto L_0x00dc
            r0.f264387f = r6
            goto L_0x00de
        L_0x00dc:
            r0.f264387f = r6
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cb3.C92389a.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
