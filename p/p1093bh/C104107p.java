package p1093bh;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import cp3.C45142d;
import java.util.LinkedList;
import me3.C109612c;
import p520fi.C107550j;
import p520fi.C107551k;
import z20.C112576e;

/* renamed from: bh.p */
public class C104107p extends C104085b<C107551k> {

    /* renamed from: o */
    public boolean f308008o = true;

    /* renamed from: p */
    public boolean f308009p = false;

    /* renamed from: q */
    public float f308010q;

    /* renamed from: r */
    public float f308011r;

    /* renamed from: s */
    public Path f308012s = new Path();

    /* renamed from: t */
    public Bitmap f308013t;

    /* renamed from: u */
    public LinkedList<C112576e.C112578b> f308014u = new LinkedList<>();

    /* renamed from: v */
    public C112576e.C112577a f308015v = C112576e.C112577a.ONE;

    /* renamed from: A */
    public void mo145688A(boolean z) {
        super.mo145688A(z);
        C107551k C = mo145692c();
        Bitmap d = mo145693d();
        C.getClass();
        Bitmap copy = d.copy(Bitmap.Config.ARGB_8888, true);
        String str = C112760b.m154239k() + String.format("%s%d.%s", new Object[]{"wx_photo_edit_", Long.valueOf(System.currentTimeMillis()), "MOSAIC"});
        Log.m105925i("MicroMsg.MosaicCache", "[saveCacheToLocal] path:%s size:%s", str, Integer.valueOf(C.mo157975D1(true)));
        String str2 = C.f321784f.get(C.mo157975D1(true));
        if (!Util.isNullOrNil(str2)) {
            C86013q1.m106447h(str2);
            C.f321784f.remove(C.mo157975D1(true));
        }
        C.f321784f.put(C.mo157975D1(true), str);
        C.f321785g.put(str, copy);
        ThreadPool.postAtFront(new C107550j(C, copy, str), "[saveCacheToLocal] mosaic path:" + str);
    }

    /* renamed from: C */
    public C107551k mo145692c() {
        return (C107551k) super.mo145692c();
    }

    /* renamed from: k */
    public C104084a mo145700k() {
        return C104084a.MOSAIC;
    }

    /* renamed from: q */
    public void mo145706q() {
        Bitmap bitmap;
        super.mo145706q();
        if (mo145692c() != null) {
            Bitmap a = mo145692c().mo157994a();
            if (mo145693d() != null && !mo145693d().isRecycled()) {
                mo145693d().recycle();
            }
            this.f307889f = a;
        }
        Bitmap bitmap2 = ((C109612c) this.f307884a).f328163f;
        if (bitmap2 == null) {
            Log.m105920e("MicroMsg.MosaicArtist", "[generateMosaicImage] bitmap is null");
            bitmap = null;
        } else {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int b = C45142d.m49971b(6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            float f = (float) b;
            int ceil = (int) Math.ceil((double) (((float) width) / f));
            int ceil2 = (int) Math.ceil((double) (((float) height) / f));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            for (int i = 0; i < ceil; i++) {
                int i2 = 0;
                while (i2 < ceil2) {
                    int i3 = b * i;
                    int i4 = b * i2;
                    int i5 = i3 + b;
                    if (i5 > width) {
                        i5 = width;
                    }
                    int i6 = i4 + b;
                    int i7 = width;
                    if (i6 > height) {
                        i6 = height;
                    }
                    int pixel = bitmap2.getPixel(i3, i4);
                    Bitmap bitmap3 = bitmap2;
                    Rect rect = new Rect(i3, i4, i5, i6);
                    paint.setColor(pixel);
                    canvas.drawRect(rect, paint);
                    i2++;
                    width = i7;
                    bitmap2 = bitmap3;
                }
                Bitmap bitmap4 = bitmap2;
                int i8 = width;
            }
            bitmap = createBitmap;
        }
        this.f308013t = bitmap;
    }

    /* renamed from: t */
    public void mo145709t() {
        super.mo145709t();
        Bitmap bitmap = this.f308013t;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f308013t.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r15 != 5) goto L_0x0188;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo145710u(android.view.MotionEvent r15) {
        /*
            r14 = this;
            z20.e$a r0 = z20.C112576e.C112577a.TWO
            z20.e$a r1 = z20.C112576e.C112577a.ONE
            boolean r2 = r14.mo145703n()
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            bh.b$c r2 = r14.f307896m
            if (r2 == 0) goto L_0x0013
            r2.mo145717a(r15)
        L_0x0013:
            float r2 = r15.getX()
            float r4 = r15.getY()
            float[] r2 = r14.mo145690a(r2, r4)
            int r15 = r15.getActionMasked()
            r4 = 1
            if (r15 == 0) goto L_0x016b
            java.lang.String r5 = "MicroMsg.MosaicArtist"
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r15 == r4) goto L_0x00f1
            r7 = 2
            if (r15 == r7) goto L_0x0034
            r2 = 5
            if (r15 == r2) goto L_0x00f1
            goto L_0x0188
        L_0x0034:
            boolean r15 = r14.f308008o
            if (r15 == 0) goto L_0x00da
            boolean r8 = r14.f308009p
            if (r8 == 0) goto L_0x00da
            float r15 = r14.f308010q
            float r8 = r14.f308011r
            r9 = r2[r3]
            r14.f308010q = r9
            r2 = r2[r4]
            r14.f308011r = r2
            z20.e$a r10 = r14.f308015v
            if (r10 != r1) goto L_0x0059
            android.graphics.Path r0 = r14.f308012s
            float r9 = r9 + r15
            r1 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r1
            float r2 = r2 + r8
            float r2 = r2 / r1
            r0.quadTo(r15, r8, r9, r2)
            goto L_0x00d5
        L_0x0059:
            if (r10 != r0) goto L_0x00d5
            float r9 = r9 - r15
            float r2 = r2 - r8
            float r9 = r9 / r2
            double r0 = (double) r9
            double r0 = java.lang.Math.atan(r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r15 = r14.mo145697h()
            r2 = 1127481344(0x43340000, float:180.0)
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L_0x0074
            r15 = 180(0xb4, float:2.52E-43)
            goto L_0x0075
        L_0x0074:
            r15 = 0
        L_0x0075:
            double r8 = (double) r15
            double r0 = r0 + r8
            float r15 = (float) r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r11 = r15 % r0
            java.util.LinkedList<z20.e$b> r15 = r14.f308014u
            z20.e$b r0 = new z20.e$b
            float r1 = r14.mo145699j()
            float r9 = r6 / r1
            float r1 = r14.f308010q
            float r2 = r14.f308011r
            me3.f r6 = r14.f307884a
            me3.c r6 = (me3.C109612c) r6
            android.graphics.Bitmap r6 = r6.f328163f
            if (r6 == 0) goto L_0x00b6
            int r8 = r6.getWidth()
            float r8 = (float) r8
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b6
            int r8 = r6.getHeight()
            float r8 = (float) r8
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b6
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b6
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            int r1 = (int) r1
            int r2 = (int) r2
            int r3 = r6.getPixel(r1, r2)
            r10 = r3
            goto L_0x00ca
        L_0x00b6:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6[r3] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r6[r4] = r1
            java.lang.String r1 = "[getPosColor] X:%s,Y:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r1, r6)
            r10 = 0
        L_0x00ca:
            float r12 = r14.f308010q
            float r13 = r14.f308011r
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r15.add(r0)
        L_0x00d5:
            r14.mo145704o()
            goto L_0x0188
        L_0x00da:
            if (r15 == 0) goto L_0x0188
            boolean r15 = r14.f308009p
            if (r15 != 0) goto L_0x0188
            z20.e$a r15 = r14.f308015v
            if (r15 != r1) goto L_0x00ed
            android.graphics.Path r15 = r14.f308012s
            r0 = r2[r3]
            r1 = r2[r4]
            r15.moveTo(r0, r1)
        L_0x00ed:
            r14.f308009p = r4
            goto L_0x0188
        L_0x00f1:
            boolean r15 = r14.f308008o
            if (r15 == 0) goto L_0x015c
            boolean r15 = r14.f308009p
            if (r15 == 0) goto L_0x015c
            fi.k r15 = r14.mo145692c()
            if (r15 != 0) goto L_0x0105
            java.lang.String r15 = "getCache is null???"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r15)
            return r4
        L_0x0105:
            z20.e$a r15 = r14.f308015v
            if (r15 != r1) goto L_0x012d
            fi.k r15 = r14.mo145692c()
            z20.e r0 = new z20.e
            z20.e$a r1 = r14.f308015v
            android.graphics.Path r2 = new android.graphics.Path
            android.graphics.Path r4 = r14.f308012s
            r2.<init>(r4)
            float r4 = r14.mo145699j()
            float r6 = r6 / r4
            android.graphics.Bitmap r4 = r14.f308013t
            r0.<init>(r1, r2, r6, r4)
            java.util.Stack<z20.e> r15 = r15.f321782d
            if (r15 == 0) goto L_0x0129
            r15.push(r0)
        L_0x0129:
            r14.mo145688A(r3)
            goto L_0x0150
        L_0x012d:
            if (r15 != r0) goto L_0x0150
            fi.k r15 = r14.mo145692c()
            z20.e r0 = new z20.e
            z20.e$a r1 = r14.f308015v
            java.util.LinkedList r2 = new java.util.LinkedList
            java.util.LinkedList<z20.e$b> r4 = r14.f308014u
            r2.<init>(r4)
            float r4 = r14.mo145699j()
            float r6 = r6 / r4
            r0.<init>(r1, r2, r6)
            java.util.Stack<z20.e> r15 = r15.f321782d
            if (r15 == 0) goto L_0x014d
            r15.push(r0)
        L_0x014d:
            r14.mo145688A(r3)
        L_0x0150:
            fi.c r15 = p520fi.C107546c.f321771c
            ug.t r0 = p248ug.C111167t.MOSAIC
            java.util.Stack<ug.t> r15 = r15.f321773b
            r15.push(r0)
            r14.mo145705p()
        L_0x015c:
            java.util.LinkedList<z20.e$b> r15 = r14.f308014u
            r15.clear()
            android.graphics.Path r15 = r14.f308012s
            r15.reset()
            r14.f308009p = r3
            r14.f308008o = r3
            goto L_0x0188
        L_0x016b:
            android.graphics.Rect r15 = r14.f307886c
            r0 = r2[r3]
            int r0 = (int) r0
            r1 = r2[r4]
            int r1 = (int) r1
            boolean r15 = r15.contains(r0, r1)
            if (r15 == 0) goto L_0x0184
            r15 = r2[r3]
            r14.f308010q = r15
            r15 = r2[r4]
            r14.f308011r = r15
            r14.f308008o = r4
            goto L_0x0186
        L_0x0184:
            r14.f308008o = r3
        L_0x0186:
            r14.f308009p = r3
        L_0x0188:
            boolean r15 = r14.f308008o
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p1093bh.C104107p.mo145710u(android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public void mo145711v(Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f307886c);
        C112576e.C112577a aVar = this.f308015v;
        if (aVar == C112576e.C112577a.ONE) {
            mo145708s(canvas);
            new C112576e(this.f308015v, this.f308012s, 1.0f / mo145699j(), this.f308013t).mo164322a(canvas);
        } else if (aVar == C112576e.C112577a.TWO) {
            new C112576e(this.f308015v, new LinkedList(this.f308014u), 1.0f / mo145699j()).mo164322a(new Canvas(mo145693d()));
            mo145708s(canvas);
        }
        canvas.restore();
    }

    /* renamed from: y */
    public void mo145714y() {
        if (mo145693d() != null && !mo145693d().isRecycled()) {
            mo145693d().recycle();
        }
        Bitmap a = mo145692c().mo157994a();
        if (mo145693d() != null && !mo145693d().isRecycled()) {
            mo145693d().recycle();
        }
        this.f307889f = a;
    }
}
