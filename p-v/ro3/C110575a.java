package ro3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.PopupWindow;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ro3.a */
public final class C110575a extends View {

    /* renamed from: u */
    public static final /* synthetic */ int f330737u = 0;

    /* renamed from: d */
    public final C110588j f330738d;

    /* renamed from: e */
    public boolean f330739e;

    /* renamed from: f */
    public final PopupWindow f330740f;

    /* renamed from: g */
    public final Paint f330741g;

    /* renamed from: h */
    public final int f330742h;

    /* renamed from: i */
    public final int f330743i;

    /* renamed from: j */
    public final int f330744j;

    /* renamed from: n */
    public final int f330745n = 25;

    /* renamed from: o */
    public boolean f330746o;

    /* renamed from: p */
    public int f330747p;

    /* renamed from: q */
    public int f330748q;

    /* renamed from: r */
    public int f330749r;

    /* renamed from: s */
    public final int[] f330750s = new int[2];

    /* renamed from: t */
    public final int[] f330751t = new int[2];

    /* renamed from: ro3.a$a */
    public static final class C110576a {
        public C110576a(C8480h hVar) {
        }
    }

    static {
        new C110576a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110575a(C110588j jVar, boolean z) {
        super(jVar.f330832g);
        C87412m.m108594g(jVar, "selectableEditTextHelper");
        this.f330738d = jVar;
        this.f330739e = z;
        Paint paint = new Paint(1);
        this.f330741g = paint;
        paint.setColor(jVar.f330846u);
        int i = jVar.f330847v / 2;
        this.f330742h = i;
        int i2 = i * 2;
        this.f330743i = i2;
        int i3 = i * 2;
        this.f330744j = i3;
        PopupWindow popupWindow = new PopupWindow(this);
        this.f330740f = popupWindow;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i2 + (25 * 2));
        popupWindow.setHeight(i3 + (25 / 2));
        invalidate();
    }

    /* renamed from: a */
    public final int mo162069a(int i, Layout layout) {
        int lineBottom = layout.getLineBottom(layout.getLineForOffset(i)) + getExtraY();
        int height = (this.f330751t[1] + this.f330738d.f330833h.getHeight()) - this.f330738d.f330833h.getPaddingBottom();
        if (lineBottom > height) {
            lineBottom = height;
        }
        int i2 = this.f330751t[1];
        return lineBottom < i2 ? i2 : lineBottom;
    }

    /* renamed from: b */
    public final void mo162070b(int i, int i2) {
        this.f330738d.f330833h.getLocationInWindow(this.f330751t);
        int extraX = (i - (this.f330739e ? this.f330743i : 0)) + getExtraX();
        int extraY = i2 + getExtraY();
        int i3 = this.f330751t[1];
        if (extraY >= i3 && extraY <= ((i3 + this.f330738d.f330833h.getHeight()) - this.f330738d.f330833h.getPaddingBottom()) + C74942w4.m89784a(this.f330738d.f330832g, 5)) {
            mo162071c(extraX, extraY);
        }
    }

    /* renamed from: c */
    public final void mo162071c(int i, int i2) {
        try {
            if (this.f330740f.isShowing()) {
                this.f330740f.update(i, i2, -1, -1);
            } else {
                this.f330740f.showAtLocation(this.f330738d.f330833h, 0, i, i2);
            }
        } catch (Exception e) {
            C85975v4.m106305b("SelectableEditTextHelper", "cursor error!: %s.", e.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo162072d() {
        this.f330738d.f330833h.getLocationInWindow(this.f330751t);
        Layout layout = this.f330738d.f330833h.getLayout();
        if (this.f330739e) {
            int i = this.f330738d.f330831f.f330855a;
            C87412m.m108593f(layout, "layout");
            mo162071c((((int) layout.getPrimaryHorizontal(this.f330738d.f330831f.f330855a)) - this.f330743i) + getExtraX(), mo162069a(i, layout));
            return;
        }
        int i2 = this.f330738d.f330831f.f330856b;
        C87412m.m108593f(layout, "layout");
        mo162071c(((int) layout.getPrimaryHorizontal(this.f330738d.f330831f.f330856b)) + getExtraX(), mo162069a(i2, layout));
    }

    public final int getExtraX() {
        return (this.f330751t[0] - this.f330745n) + this.f330738d.f330833h.getPaddingLeft();
    }

    public final int getExtraY() {
        return (this.f330751t[1] + this.f330738d.f330833h.getPaddingTop()) - this.f330738d.f330833h.getScrollY();
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        int i = this.f330742h;
        canvas.drawCircle((float) (this.f330745n + i), (float) i, (float) i, this.f330741g);
        if (this.f330739e) {
            int i2 = this.f330742h;
            int i3 = this.f330745n;
            canvas.drawRect((float) (i2 + i3), 0.0f, (float) ((i2 * 2) + i3), (float) i2, this.f330741g);
            return;
        }
        int i4 = this.f330745n;
        int i5 = this.f330742h;
        canvas.drawRect((float) i4, 0.0f, (float) (i4 + i5), (float) i5, this.f330741g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r0 != 3) goto L_0x0137;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r7, r0)
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0118
            r2 = 0
            if (r0 == r1) goto L_0x010c
            r3 = 2
            if (r0 == r3) goto L_0x0017
            r7 = 3
            if (r0 == r7) goto L_0x010c
            goto L_0x0137
        L_0x0017:
            r6.f330746o = r1
            ro3.j r0 = r6.f330738d
            ro3.g r3 = r0.mo162138h()
            r0.mo148757e(r3)
            float r0 = r7.getRawX()
            int r0 = (int) r0
            float r7 = r7.getRawY()
            int r7 = (int) r7
            int[] r3 = r6.f330750s
            r3 = r3[r2]
            int r0 = r0 - r3
            int r3 = r6.f330747p
            int r7 = r7 + r3
            int r3 = r6.f330744j
            int r7 = r7 - r3
            ro3.j r3 = r6.f330738d
            int r4 = r3.f330850y
            int r7 = r7 - r4
            android.widget.TextView r3 = r3.f330833h
            int r3 = r3.getScrollY()
            int r7 = r7 + r3
            ro3.j r3 = r6.f330738d
            android.widget.TextView r3 = r3.f330833h
            int[] r4 = r6.f330751t
            r3.getLocationInWindow(r4)
            boolean r3 = r6.f330739e
            if (r3 == 0) goto L_0x0057
            ro3.j r3 = r6.f330738d
            ro3.j$d r3 = r3.f330831f
            int r3 = r3.f330855a
            goto L_0x005d
        L_0x0057:
            ro3.j r3 = r6.f330738d
            ro3.j$d r3 = r3.f330831f
            int r3 = r3.f330856b
        L_0x005d:
            int[] r4 = r6.f330751t
            r4 = r4[r1]
            int r7 = r7 - r4
            ro3.j r4 = r6.f330738d
            android.widget.TextView r4 = r4.f330833h
            int r7 = xo3.C78967g.m95468a(r4, r0, r7, r3)
            if (r7 == r3) goto L_0x00f3
            ro3.j r0 = r6.f330738d
            r0.mo148760m()
            boolean r0 = r6.f330739e
            if (r0 == 0) goto L_0x00b4
            int r3 = r6.f330749r
            if (r7 <= r3) goto L_0x00aa
            ro3.j r3 = r6.f330738d
            ro3.a r4 = r3.f330827b
            if (r4 == 0) goto L_0x0085
            boolean r5 = r4.f330739e
            if (r5 != 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r5 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            ro3.a r4 = r3.f330828c
        L_0x008b:
            r0 = r0 ^ r1
            r6.f330739e = r0
            r6.invalidate()
            if (r4 == 0) goto L_0x009b
            boolean r0 = r4.f330739e
            r0 = r0 ^ r1
            r4.f330739e = r0
            r4.invalidate()
        L_0x009b:
            int r0 = r6.f330749r
            r6.f330748q = r0
            ro3.j r3 = r6.f330738d
            r3.mo148761n(r0, r7)
            if (r4 == 0) goto L_0x00b0
            r4.mo162072d()
            goto L_0x00b0
        L_0x00aa:
            ro3.j r0 = r6.f330738d
            r3 = -1
            r0.mo148761n(r7, r3)
        L_0x00b0:
            r6.mo162072d()
            goto L_0x00f3
        L_0x00b4:
            int r0 = r6.f330748q
            if (r7 >= r0) goto L_0x00eb
            ro3.j r0 = r6.f330738d
            ro3.a r3 = r0.f330827b
            if (r3 == 0) goto L_0x00c4
            boolean r4 = r3.f330739e
            if (r4 != r1) goto L_0x00c4
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            ro3.a r3 = r0.f330828c
        L_0x00ca:
            if (r3 == 0) goto L_0x00d4
            boolean r0 = r3.f330739e
            r0 = r0 ^ r1
            r3.f330739e = r0
            r3.invalidate()
        L_0x00d4:
            boolean r0 = r6.f330739e
            r0 = r0 ^ r1
            r6.f330739e = r0
            r6.invalidate()
            int r0 = r6.f330748q
            r6.f330749r = r0
            ro3.j r4 = r6.f330738d
            r4.mo148761n(r7, r0)
            if (r3 == 0) goto L_0x00f0
            r3.mo162072d()
            goto L_0x00f0
        L_0x00eb:
            ro3.j r3 = r6.f330738d
            r3.mo148761n(r0, r7)
        L_0x00f0:
            r6.mo162072d()
        L_0x00f3:
            ro3.j r7 = r6.f330738d
            boolean r0 = r6.f330739e
            r0 = r0 ^ r1
            ro3.a r3 = r7.f330827b
            if (r3 == 0) goto L_0x0101
            boolean r4 = r3.f330739e
            if (r4 != r0) goto L_0x0101
            r2 = 1
        L_0x0101:
            if (r2 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            ro3.a r3 = r7.f330828c
        L_0x0106:
            if (r3 == 0) goto L_0x0137
            r3.mo162072d()
            goto L_0x0137
        L_0x010c:
            r6.f330746o = r2
            ro3.j r7 = r6.f330738d
            ro3.g r0 = r7.mo162138h()
            r7.mo148763q(r0)
            goto L_0x0137
        L_0x0118:
            ro3.j r0 = r6.f330738d
            ro3.j$d r0 = r0.f330831f
            int r2 = r0.f330855a
            r6.f330748q = r2
            int r0 = r0.f330856b
            r6.f330749r = r0
            r7.getX()
            float r7 = r7.getY()
            int r7 = (int) r7
            r6.f330747p = r7
            ro3.j r7 = r6.f330738d
            android.widget.TextView r7 = r7.f330833h
            int[] r0 = r6.f330750s
            r7.getLocationOnScreen(r0)
        L_0x0137:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ro3.C110575a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLeft(boolean z) {
        this.f330739e = z;
    }

    public final void setMoving(boolean z) {
        this.f330746o = z;
    }
}
