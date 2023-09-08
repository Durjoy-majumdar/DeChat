package gc0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.p014mm.modelimage.loader.impr.C114733a;
import com.tencent.p014mm.modelimage.loader.impr.C17793g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hc0.C20935b;
import hc0.C20937c;
import ic0.C108455d;
import ic0.C21069f;
import ic0.C21070h;
import ic0.C21072l;
import ic0.C21073n;
import ic0.C60271e;
import ic0.C98661k;
import lc0.C21409a;
import mc0.C34542b;

/* renamed from: gc0.a */
public class C20828a {

    /* renamed from: d */
    public static C20828a f58836d;

    /* renamed from: a */
    public C20829b f58837a;

    /* renamed from: b */
    public C20935b f58838b;

    /* renamed from: c */
    public final C98661k f58839c = new C17793g();

    public C20828a(Context context) {
        int i = C20935b.f59285o;
        mo32517f(new C20935b.C20936a(context).mo32665a());
    }

    /* renamed from: b */
    public static synchronized C20828a m22825b() {
        C20828a aVar;
        synchronized (C20828a.class) {
            if (f58836d == null) {
                f58836d = new C20828a(MMApplicationContext.getContext());
            }
            aVar = f58836d;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo32513a(String str, ImageView imageView) {
        this.f58837a.mo32530b(new C20830c(imageView, str));
    }

    /* renamed from: c */
    public void mo32514c() {
        C20935b bVar;
        C20829b bVar2 = this.f58837a;
        if (bVar2 != null && (bVar = bVar2.f58840a) != null) {
            bVar.f59291f.clear();
            ((C114733a) bVar2.f58840a.f59292g).getClass();
            C34542b.m40382a();
        }
    }

    /* renamed from: d */
    public void mo32515d(String str, C20937c cVar, C108455d dVar) {
        this.f58837a.f58841b.execute(new C21409a(str, cVar, this.f58837a, dVar));
    }

    /* renamed from: e */
    public Bitmap mo32516e(String str) {
        C20935b bVar;
        C20829b bVar2 = this.f58837a;
        if (bVar2 == null || (bVar = bVar2.f58840a) == null) {
            return null;
        }
        return bVar.f59291f.get(str);
    }

    /* renamed from: f */
    public final synchronized void mo32517f(C20935b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("[cpan] image loader configuration is null.");
        } else if (this.f58838b == null) {
            this.f58837a = new C20829b(bVar);
            this.f58838b = bVar;
        } else {
            Log.m105928w("MicroMsg.imageloader.ImageLoader", "[cpan] image loader had init.");
        }
    }

    /* renamed from: g */
    public void mo32518g(String str, ImageView imageView) {
        mo32523l(str, imageView, (C20937c) null, (C98661k) null, (C21072l) null, (C21070h) null, (C21069f) null, (C60271e) null, (C21073n) null);
    }

    /* renamed from: h */
    public void mo32519h(String str, ImageView imageView, C20937c cVar) {
        mo32523l(str, imageView, cVar, (C98661k) null, (C21072l) null, (C21070h) null, (C21069f) null, (C60271e) null, (C21073n) null);
    }

    /* renamed from: i */
    public void mo32520i(String str, ImageView imageView, C20937c cVar, C21070h hVar) {
        mo32523l(str, imageView, cVar, (C98661k) null, (C21072l) null, hVar, (C21069f) null, (C60271e) null, (C21073n) null);
    }

    /* renamed from: j */
    public void mo32521j(String str, ImageView imageView, C20937c cVar, C98661k kVar) {
        mo32523l(str, imageView, cVar, kVar, (C21072l) null, (C21070h) null, (C21069f) null, (C60271e) null, (C21073n) null);
    }

    /* renamed from: k */
    public void mo32522k(String str, ImageView imageView, C20937c cVar, C98661k kVar, C21070h hVar) {
        mo32523l(str, imageView, cVar, kVar, (C21072l) null, hVar, (C21069f) null, (C60271e) null, (C21073n) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32523l(java.lang.String r21, android.widget.ImageView r22, hc0.C20937c r23, ic0.C98661k r24, ic0.C21072l r25, ic0.C21070h r26, ic0.C21069f r27, ic0.C60271e r28, ic0.C21073n r29) {
        /*
            r20 = this;
            r0 = r20
            r13 = r21
            r14 = r22
            r15 = r26
            if (r23 != 0) goto L_0x0010
            hc0.b r1 = r0.f58838b
            hc0.c r1 = r1.f59290e
            r12 = r1
            goto L_0x0012
        L_0x0010:
            r12 = r23
        L_0x0012:
            if (r24 != 0) goto L_0x0018
            ic0.k r1 = r0.f58839c
            r6 = r1
            goto L_0x001a
        L_0x0018:
            r6 = r24
        L_0x001a:
            gc0.c r11 = new gc0.c
            r11.<init>(r14, r13)
            java.lang.String r10 = "MicroMsg.imageloader.ImageLoader"
            r9 = 0
            r8 = 1
            r7 = 0
            if (r14 == 0) goto L_0x0052
            if (r12 != 0) goto L_0x0029
            goto L_0x0052
        L_0x0029:
            int r1 = r12.f59334r
            if (r1 > 0) goto L_0x0034
            android.graphics.drawable.Drawable r2 = r12.f59335s
            if (r2 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = 0
            goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            if (r2 == 0) goto L_0x004e
            if (r1 != 0) goto L_0x004a
            hc0.b r2 = r0.f58838b
            android.content.res.Resources r2 = r2.f59287b
            if (r1 == 0) goto L_0x0044
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)
            goto L_0x0046
        L_0x0044:
            android.graphics.drawable.Drawable r1 = r12.f59335s
        L_0x0046:
            r14.setBackgroundDrawable(r1)
            goto L_0x0057
        L_0x004a:
            r14.setBackgroundResource(r1)
            goto L_0x0057
        L_0x004e:
            r14.setBackgroundDrawable(r9)
            goto L_0x0057
        L_0x0052:
            java.lang.String r1 = "[cpan] should show default background view or options is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
        L_0x0057:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = "[cpan load image url is null.]"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            r0.mo32528q(r14, r12)
            gc0.b r1 = r0.f58837a
            r1.mo32530b(r11)
            java.lang.Object[] r1 = r12.f59316C
            r6.mo6935a(r13, r14, r9, r1)
            return
        L_0x0070:
            lc0.b r5 = new lc0.b
            r12.getClass()
            com.tencent.mm.sdk.platformtools.MMHandler r4 = new com.tencent.mm.sdk.platformtools.MMHandler
            r4.<init>()
            gc0.b r3 = r0.f58837a
            r1 = r5
            r2 = r21
            r16 = r3
            r3 = r11
            r15 = r5
            r5 = r12
            r14 = 0
            r7 = r25
            r14 = 1
            r8 = r16
            r16 = r9
            r9 = r26
            r17 = r10
            r10 = r27
            r18 = r11
            r11 = r28
            r19 = r12
            r12 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = r15.mo33538b(r13)
            gc0.b r2 = r0.f58837a
            hc0.b r2 = r2.f58840a
            if (r2 == 0) goto L_0x00ae
            ic0.o r2 = r2.f59291f
            android.graphics.Bitmap r9 = r2.get(r1)
            goto L_0x00b0
        L_0x00ae:
            r9 = r16
        L_0x00b0:
            if (r9 == 0) goto L_0x00eb
            boolean r2 = r9.isRecycled()
            if (r2 != 0) goto L_0x00eb
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "[cpan] load from cache. not need to load:%s"
            r4 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r2)
            r1 = r19
            boolean r2 = r1.f59329m
            if (r2 == 0) goto L_0x00d0
            int r1 = r1.f59330n
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r9, r1)
        L_0x00d0:
            r2 = r22
            if (r2 == 0) goto L_0x00d7
            r2.setImageBitmap(r9)
        L_0x00d7:
            r1 = r26
            if (r1 == 0) goto L_0x00e3
            jc0.b r4 = new jc0.b
            r4.<init>((int) r3, (int) r3, (android.graphics.Bitmap) r9)
            r1.mo6677b(r13, r2, r4)
        L_0x00e3:
            gc0.b r1 = r0.f58837a
            r4 = r18
            r1.mo32530b(r4)
            return
        L_0x00eb:
            r2 = r22
            r5 = r15
            r4 = r18
            r1 = r19
            r3 = 0
            if (r2 == 0) goto L_0x00f8
            r0.mo32528q(r2, r1)
        L_0x00f8:
            hc0.c r2 = r5.f60575h
            boolean r2 = r2.f59320d
            if (r2 != 0) goto L_0x0108
            gc0.b r2 = r0.f58837a
            ic0.j r2 = r2.f58841b
            boolean r2 = r2.mo32790e()
            if (r2 != 0) goto L_0x01c9
        L_0x0108:
            gc0.b r2 = r0.f58837a
            r2.getClass()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r6 != 0) goto L_0x013a
            java.util.Map<java.lang.Integer, java.lang.String> r6 = r2.f58843d
            int r7 = r4.f58846b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 != 0) goto L_0x012d
            boolean r6 = r13.equals(r6)
            if (r6 != 0) goto L_0x013a
        L_0x012d:
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r2.f58843d
            int r6 = r4.f58846b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r6, r13)
            r8 = 1
            goto L_0x013b
        L_0x013a:
            r8 = 0
        L_0x013b:
            if (r8 == 0) goto L_0x01c9
            gc0.b r2 = r0.f58837a
            java.util.HashMap<java.lang.Integer, lc0.b> r6 = r2.f58844e
            if (r6 == 0) goto L_0x0178
            int r7 = r4.f58846b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            lc0.b r6 = (lc0.C21410b) r6
            if (r6 == 0) goto L_0x016d
            gc0.c r7 = r6.f60572e
            if (r7 == 0) goto L_0x016d
            int r8 = r4.f58846b
            int r7 = r7.f58846b
            if (r8 != r7) goto L_0x016d
            ic0.j r7 = r2.f58841b
            r7.remove(r6)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.lang.String r6 = r6.f60571d
            r7[r3] = r6
            java.lang.String r6 = "MicroMsg.imageloader.ImageLoaderManager"
            java.lang.String r8 = "remove taks url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r7)
        L_0x016d:
            java.util.HashMap<java.lang.Integer, lc0.b> r2 = r2.f58844e
            int r4 = r4.f58846b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r4, r5)
        L_0x0178:
            gc0.b r2 = r0.f58837a
            boolean r1 = r1.f59318b
            hc0.b r4 = r2.f58840a
            ic0.j r4 = r4.f59297l
            boolean r4 = r4.isShutdown()
            if (r4 == 0) goto L_0x0192
            hc0.b r4 = r2.f58840a
            int r6 = r4.f59288c
            int r4 = r4.f59289d
            ic0.j r4 = hc0.C98334a.m127117a(r6, r4)
            r2.f58841b = r4
        L_0x0192:
            ic0.j r4 = r2.f58841b
            r4.execute(r5)
            if (r1 == 0) goto L_0x01c9
            java.lang.String r1 = mc0.C34542b.f92924a
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = mc0.C34542b.f92925b
            long r6 = r4 - r6
            java.lang.String r1 = "MicroMsg.imageloader.ImageTmpFilehUtils"
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b5
            java.lang.String r3 = "[cpan] need clean tmp file."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            mc0.C34542b.f92925b = r4
            r8 = 1
            goto L_0x01bb
        L_0x01b5:
            java.lang.String r4 = "[cpan] need not clean tmp file."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r4)
            r8 = 0
        L_0x01bb:
            if (r8 == 0) goto L_0x01c9
            java.util.concurrent.Executor r1 = r2.f58842c
            lc0.d r2 = new lc0.d
            r2.<init>()
            zt3.b r1 = (zt3.C119143b) r1
            r1.execute(r2)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.C20828a.mo32523l(java.lang.String, android.widget.ImageView, hc0.c, ic0.k, ic0.l, ic0.h, ic0.f, ic0.e, ic0.n):void");
    }

    /* renamed from: m */
    public void mo32524m(String str, ImageView imageView, C21070h hVar) {
        mo32523l(str, imageView, (C20937c) null, (C98661k) null, (C21072l) null, hVar, (C21069f) null, (C60271e) null, (C21073n) null);
    }

    /* renamed from: n */
    public void mo32525n(int i) {
        Log.m105919d("MicroMsg.imageloader.ImageLoader", "[cpan] on scroll state changed :%d", Integer.valueOf(i));
        if (i == 0 || i == 1) {
            Log.m105918d("MicroMsg.imageloader.ImageLoader", "[cpan] resume");
            this.f58837a.f58841b.resume();
            return;
        }
        Log.m105918d("MicroMsg.imageloader.ImageLoader", "[cpan] pause");
        this.f58837a.f58841b.pause();
    }

    /* renamed from: o */
    public void mo32526o(String str, Bitmap bitmap) {
        C20935b bVar;
        C20829b bVar2 = this.f58837a;
        if (bVar2 != null && (bVar = bVar2.f58840a) != null) {
            bVar.f59291f.mo32795a(str, bitmap);
        }
    }

    /* renamed from: p */
    public void mo32527p(String str) {
        C20935b bVar;
        C20829b bVar2 = this.f58837a;
        if (bVar2 != null && (bVar = bVar2.f58840a) != null) {
            bVar.f59291f.remove(str);
        }
    }

    /* renamed from: q */
    public final void mo32528q(ImageView imageView, C20937c cVar) {
        if (imageView == null || cVar == null) {
            Log.m105928w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default image view or options is null.");
            return;
        }
        int i = cVar.f59332p;
        if (i > 0 || cVar.f59333q != null) {
            if (i == 0) {
                imageView.setImageDrawable(i != 0 ? this.f58838b.f59287b.getDrawable(i) : cVar.f59333q);
            } else {
                imageView.setImageResource(i);
            }
        } else if (cVar.f59337u) {
            imageView.setImageDrawable((Drawable) null);
        }
    }

    public C20828a(C20935b bVar) {
        mo32517f(bVar);
    }
}
