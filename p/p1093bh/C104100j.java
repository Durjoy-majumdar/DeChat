package p1093bh;

import android.graphics.Canvas;
import android.graphics.Path;
import eq3.C107283a;
import me3.C109612c;
import z20.C112572b;

/* renamed from: bh.j */
public class C104100j extends C104085b {

    /* renamed from: o */
    public float f307954o;

    /* renamed from: p */
    public float f307955p;

    /* renamed from: q */
    public boolean f307956q = true;

    /* renamed from: r */
    public boolean f307957r = false;

    /* renamed from: s */
    public int f307958s = C107283a.f320962D[2];

    /* renamed from: t */
    public Path f307959t = new Path();

    /* renamed from: k */
    public C104084a mo145700k() {
        return C104084a.DOODLE;
    }

    /* renamed from: q */
    public void mo145706q() {
        super.mo145706q();
        ((C109612c) this.f307884a).mo160824h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r6 != 5) goto L_0x00cd;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo145710u(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo145703n()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            bh.b$c r0 = r5.f307896m
            if (r0 == 0) goto L_0x000f
            r0.mo145717a(r6)
        L_0x000f:
            float r0 = r6.getX()
            float r2 = r6.getY()
            float[] r0 = r5.mo145690a(r0, r2)
            int r6 = r6.getActionMasked()
            r2 = 1
            if (r6 == 0) goto L_0x00b0
            if (r6 == r2) goto L_0x0062
            r3 = 2
            if (r6 == r3) goto L_0x002c
            r0 = 5
            if (r6 == r0) goto L_0x0062
            goto L_0x00cd
        L_0x002c:
            boolean r6 = r5.f307956q
            if (r6 == 0) goto L_0x0050
            boolean r3 = r5.f307957r
            if (r3 == 0) goto L_0x0050
            float r6 = r5.f307954o
            float r3 = r5.f307955p
            r1 = r0[r1]
            r5.f307954o = r1
            r0 = r0[r2]
            r5.f307955p = r0
            android.graphics.Path r2 = r5.f307959t
            float r1 = r1 + r6
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r4
            float r0 = r0 + r3
            float r0 = r0 / r4
            r2.quadTo(r6, r3, r1, r0)
            r5.mo145704o()
            goto L_0x00cd
        L_0x0050:
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r5.f307957r
            if (r6 != 0) goto L_0x00cd
            android.graphics.Path r6 = r5.f307959t
            r1 = r0[r1]
            r0 = r0[r2]
            r6.moveTo(r1, r0)
            r5.f307957r = r2
            goto L_0x00cd
        L_0x0062:
            boolean r6 = r5.f307956q
            if (r6 == 0) goto L_0x00a3
            boolean r6 = r5.f307957r
            if (r6 == 0) goto L_0x00a3
            fi.g r6 = r5.mo145692c()
            if (r6 != 0) goto L_0x0071
            return r1
        L_0x0071:
            fi.g r6 = r5.mo145692c()
            z20.b r0 = new z20.b
            android.graphics.Path r2 = new android.graphics.Path
            android.graphics.Path r3 = r5.f307959t
            r2.<init>(r3)
            me3.f r3 = r5.f307884a
            me3.c r3 = (me3.C109612c) r3
            float r3 = r3.mo160824h()
            me3.f r4 = r5.f307884a
            me3.c r4 = (me3.C109612c) r4
            float r4 = r4.mo160821e()
            float r3 = r3 / r4
            int r4 = r5.f307958s
            r0.<init>(r2, r3, r4)
            r6.add(r0)
            r5.mo145688A(r1)
            fi.c r6 = p520fi.C107546c.f321771c
            ug.t r0 = p248ug.C111167t.DOODLE
            java.util.Stack<ug.t> r6 = r6.f321773b
            r6.push(r0)
        L_0x00a3:
            r5.mo145705p()
            android.graphics.Path r6 = r5.f307959t
            r6.reset()
            r5.f307957r = r1
            r5.f307956q = r1
            goto L_0x00cd
        L_0x00b0:
            android.graphics.Rect r6 = r5.f307886c
            r3 = r0[r1]
            int r3 = (int) r3
            r4 = r0[r2]
            int r4 = (int) r4
            boolean r6 = r6.contains(r3, r4)
            if (r6 == 0) goto L_0x00c9
            r6 = r0[r1]
            r5.f307954o = r6
            r6 = r0[r2]
            r5.f307955p = r6
            r5.f307956q = r2
            goto L_0x00cb
        L_0x00c9:
            r5.f307956q = r1
        L_0x00cb:
            r5.f307957r = r1
        L_0x00cd:
            boolean r6 = r5.f307956q
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1093bh.C104100j.mo145710u(android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public void mo145711v(Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f307886c);
        mo145708s(canvas);
        if (!this.f307959t.isEmpty()) {
            new C112572b(this.f307959t, ((C109612c) this.f307884a).mo160824h() / ((C109612c) this.f307884a).mo160821e(), this.f307958s).mo164305a(canvas);
        }
        canvas.restore();
    }

    /* renamed from: y */
    public void mo145714y() {
        mo145688A(true);
    }
}
