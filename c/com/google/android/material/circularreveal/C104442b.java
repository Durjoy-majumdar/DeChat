package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.C104444c;
import p1142p8.C110191a;

/* renamed from: com.google.android.material.circularreveal.b */
public class C104442b {

    /* renamed from: a */
    public final C104443a f309356a;

    /* renamed from: b */
    public final View f309357b;

    /* renamed from: c */
    public final Paint f309358c;

    /* renamed from: d */
    public C104444c.C104448d f309359d;

    /* renamed from: e */
    public Drawable f309360e;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    public interface C104443a {
        /* renamed from: b */
        void mo146665b(Canvas canvas);

        /* renamed from: d */
        boolean mo146667d();
    }

    public C104442b(C104443a aVar) {
        this.f309356a = aVar;
        View view = (View) aVar;
        this.f309357b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f309358c = paint;
        paint.setColor(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo146685a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            com.google.android.material.circularreveal.c$d r0 = r9.f309359d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            float r0 = r0.f309367c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0048
            com.google.android.material.circularreveal.b$a r0 = r9.f309356a
            r0.mo146665b(r10)
            android.graphics.Paint r0 = r9.f309358c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f309357b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f309357b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f309358c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L_0x0074
        L_0x0048:
            com.google.android.material.circularreveal.b$a r0 = r9.f309356a
            r0.mo146665b(r10)
            android.graphics.Paint r0 = r9.f309358c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f309357b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f309357b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f309358c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x0074:
            android.graphics.drawable.Drawable r0 = r9.f309360e
            if (r0 == 0) goto L_0x007d
            com.google.android.material.circularreveal.c$d r3 = r9.f309359d
            if (r3 == 0) goto L_0x007d
            r1 = 1
        L_0x007d:
            if (r1 == 0) goto L_0x00a8
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.circularreveal.c$d r1 = r9.f309359d
            float r1 = r1.f309365a
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.c$d r2 = r9.f309359d
            float r2 = r2.f309366b
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r10.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r9.f309360e
            r0.draw(r10)
            float r0 = -r1
            float r1 = -r2
            r10.translate(r0, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.C104442b.mo146685a(android.graphics.Canvas):void");
    }

    /* renamed from: b */
    public int mo146686b() {
        return this.f309358c.getColor();
    }

    /* renamed from: c */
    public C104444c.C104448d mo146687c() {
        C104444c.C104448d dVar = this.f309359d;
        if (dVar == null) {
            return null;
        }
        C104444c.C104448d dVar2 = new C104444c.C104448d(dVar);
        if (dVar2.f309367c == Float.MAX_VALUE) {
            dVar2.f309367c = C110191a.m149775a(dVar2.f309365a, dVar2.f309366b, 0.0f, 0.0f, (float) this.f309357b.getWidth(), (float) this.f309357b.getHeight());
        }
        return dVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo146688d() {
        /*
            r4 = this;
            com.google.android.material.circularreveal.b$a r0 = r4.f309356a
            boolean r0 = r0.mo146667d()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0024
            com.google.android.material.circularreveal.c$d r0 = r4.f309359d
            if (r0 == 0) goto L_0x001f
            float r0 = r0.f309367c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x0024
            r1 = 1
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.C104442b.mo146688d():boolean");
    }

    /* renamed from: e */
    public void mo146689e(Drawable drawable) {
        this.f309360e = drawable;
        this.f309357b.invalidate();
    }

    /* renamed from: f */
    public void mo146690f(int i) {
        this.f309358c.setColor(i);
        this.f309357b.invalidate();
    }

    /* renamed from: g */
    public void mo146691g(C104444c.C104448d dVar) {
        if (dVar == null) {
            this.f309359d = null;
        } else {
            C104444c.C104448d dVar2 = this.f309359d;
            if (dVar2 == null) {
                this.f309359d = new C104444c.C104448d(dVar);
            } else {
                float f = dVar.f309365a;
                float f2 = dVar.f309366b;
                float f3 = dVar.f309367c;
                dVar2.f309365a = f;
                dVar2.f309366b = f2;
                dVar2.f309367c = f3;
            }
            if (dVar.f309367c + 1.0E-4f >= C110191a.m149775a(dVar.f309365a, dVar.f309366b, 0.0f, 0.0f, (float) this.f309357b.getWidth(), (float) this.f309357b.getHeight())) {
                this.f309359d.f309367c = Float.MAX_VALUE;
            }
        }
        this.f309357b.invalidate();
    }
}
