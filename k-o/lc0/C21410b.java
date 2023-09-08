package lc0;

import android.graphics.Bitmap;
import com.tencent.p014mm.modelimage.loader.impr.C114733a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20829b;
import gc0.C20830c;
import hc0.C20935b;
import hc0.C20937c;
import ic0.C117152b;
import ic0.C21067a;
import ic0.C21068c;
import ic0.C21069f;
import ic0.C21070h;
import ic0.C21072l;
import ic0.C21073n;
import ic0.C21074o;
import ic0.C60271e;
import ic0.C60272i;
import ic0.C87693m;
import ic0.C98661k;
import ic0.C98662p;
import jc0.C21210b;

/* renamed from: lc0.b */
public class C21410b implements Runnable {

    /* renamed from: d */
    public final String f60571d;

    /* renamed from: e */
    public final C20830c f60572e;

    /* renamed from: f */
    public final MMHandler f60573f;

    /* renamed from: g */
    public final C20829b f60574g;

    /* renamed from: h */
    public final C20937c f60575h;

    /* renamed from: i */
    public final C98661k f60576i;

    /* renamed from: j */
    public final C21072l f60577j;

    /* renamed from: n */
    public final C21070h f60578n;

    /* renamed from: o */
    public final C20935b f60579o;

    /* renamed from: p */
    public final C21068c f60580p;

    /* renamed from: q */
    public final C21074o f60581q;

    /* renamed from: r */
    public final C117152b f60582r;

    /* renamed from: s */
    public final C87693m f60583s;

    /* renamed from: t */
    public final C98662p f60584t;

    /* renamed from: u */
    public final C21067a f60585u;

    /* renamed from: v */
    public final C60272i f60586v;

    public C21410b(String str, C20830c cVar, MMHandler mMHandler, C20937c cVar2, C98661k kVar, C21072l lVar, C20829b bVar, C21070h hVar, C21069f fVar, C60271e eVar, C21073n nVar) {
        this.f60571d = str;
        this.f60572e = cVar;
        this.f60573f = mMHandler;
        this.f60574g = bVar;
        this.f60578n = hVar;
        C20935b bVar2 = bVar.f58840a;
        this.f60579o = bVar2;
        if (cVar2 == null) {
            this.f60575h = bVar2.f59290e;
        } else {
            this.f60575h = cVar2;
        }
        if (kVar == null) {
            this.f60576i = kVar;
        } else {
            this.f60576i = kVar;
        }
        if (lVar == null) {
            this.f60577j = bVar2.f59295j;
        } else {
            this.f60577j = lVar;
        }
        C20937c cVar3 = this.f60575h;
        C21068c cVar4 = cVar3.f59342z;
        if (cVar4 != null) {
            this.f60580p = cVar4;
        } else {
            this.f60580p = bVar2.f59293h;
        }
        this.f60585u = cVar3.f59314A;
        this.f60586v = cVar3.f59315B;
        this.f60581q = bVar2.f59291f;
        this.f60582r = bVar2.f59292g;
        this.f60583s = bVar2.f59296k;
        this.f60584t = bVar2.f59299n;
    }

    /* renamed from: a */
    public final void mo33537a(byte[] bArr) {
        C20937c cVar = this.f60575h;
        if (cVar.f59319c) {
            ((C114733a) this.f60582r).mo174351d(this.f60571d, bArr, cVar);
        }
        C20937c cVar2 = this.f60575h;
        if (cVar2.f59318b) {
            ((C114733a) this.f60582r).mo174351d(this.f60571d, bArr, cVar2);
        }
    }

    /* renamed from: b */
    public String mo33538b(String str) {
        C20937c cVar;
        if (Util.isNullOrNil(str) || (cVar = this.f60575h) == null) {
            return null;
        }
        if (cVar.f59338v) {
            str = str + "round" + this.f60575h.f59339w;
        }
        if (!Util.isNullOrNil(this.f60575h.f59336t)) {
            str = str + this.f60575h.f59336t;
        }
        return str + "size" + this.f60575h.f59325i + this.f60575h.f59326j;
    }

    /* renamed from: c */
    public final Bitmap mo33539c(C21210b bVar, Bitmap bitmap) {
        C21070h hVar = this.f60578n;
        if (!(hVar == null || bVar == null)) {
            bVar.f59988d = bitmap;
            Bitmap c = hVar.mo6678c(this.f60571d, this.f60572e.mo32531a(), bVar);
            return (c == null || c.isRecycled()) ? bitmap : c;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:45|(0)|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x011f */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0250 A[SYNTHETIC, Splitter:B:130:0x0250] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d1 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e6 A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c A[SYNTHETIC, Splitter:B:60:0x011c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:126:0x0249=Splitter:B:126:0x0249, B:62:0x011f=Splitter:B:62:0x011f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "MicroMsg.imageloader.ImageLoadTask"
            ic0.i r0 = r1.f60586v
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = r1.f60571d
            wd3.o r0 = (wd3.C22904o) r0
            r0.mo36086b(r3)
        L_0x000f:
            jc0.b r3 = new jc0.b
            r3.<init>()
            r4 = 1
            r3.f59986b = r4
            r0 = 0
            java.lang.String r5 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r5 = r1.mo33538b(r5)     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r6 = "[cpan] run. get bitmap from disk. key:%s"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r8 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            r7[r0] = r8     // Catch:{ Exception -> 0x03f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r6, r7)     // Catch:{ Exception -> 0x03f8 }
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x03f8 }
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            int r7 = r6.f59324h     // Catch:{ Exception -> 0x03f8 }
            boolean r8 = r6.f59328l     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r6 = r6.f59323g     // Catch:{ Exception -> 0x03f8 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f8 }
            r9.<init>()     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r10 = "hy: should check md5:"
            r9.append(r10)     // Catch:{ Exception -> 0x03f8 }
            r9.append(r8)     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r9 = "hy: fileType: %d"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03f8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x03f8 }
            r10[r0] = r11     // Catch:{ Exception -> 0x03f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r10)     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r9 = "[cpan] test view width:%d height:%d"
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x03f8 }
            gc0.c r12 = r1.f60572e     // Catch:{ Exception -> 0x03f8 }
            r12.getClass()     // Catch:{ Exception -> 0x03f8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03f8 }
            r11[r0] = r12     // Catch:{ Exception -> 0x03f8 }
            gc0.c r12 = r1.f60572e     // Catch:{ Exception -> 0x03f8 }
            r12.getClass()     // Catch:{ Exception -> 0x03f8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03f8 }
            r11[r4] = r12     // Catch:{ Exception -> 0x03f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r11)     // Catch:{ Exception -> 0x03f8 }
            r9 = 0
            r11 = 4
            r12 = 5
            r13 = 3
            if (r7 == r4) goto L_0x0177
            if (r7 == r10) goto L_0x0167
            if (r7 == r13) goto L_0x0144
            if (r7 == r11) goto L_0x0123
            if (r7 == r12) goto L_0x0090
            java.lang.String r9 = "[cpan] unknow file type :%d"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03f8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x03f8 }
            r11[r0] = r12     // Catch:{ Exception -> 0x03f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r9, r11)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0248
        L_0x0090:
            ic0.a r11 = r1.f60585u     // Catch:{ all -> 0x0117 }
            if (r11 == 0) goto L_0x0099
            java.lang.String r12 = r1.f60571d     // Catch:{ all -> 0x0117 }
            r11.mo32785a(r12)     // Catch:{ all -> 0x0117 }
        L_0x0099:
            ic0.b r11 = r1.f60582r     // Catch:{ all -> 0x0117 }
            java.lang.String r12 = r1.f60571d     // Catch:{ all -> 0x0117 }
            hc0.c r13 = r1.f60575h     // Catch:{ all -> 0x0117 }
            com.tencent.mm.modelimage.loader.impr.a r11 = (com.tencent.p014mm.modelimage.loader.impr.C114733a) r11     // Catch:{ all -> 0x0117 }
            java.io.InputStream r11 = r11.mo174349b(r12, r13)     // Catch:{ all -> 0x0117 }
            ic0.a r12 = r1.f60585u     // Catch:{ all -> 0x0115 }
            if (r12 == 0) goto L_0x00ac
            r12.mo32786b(r11)     // Catch:{ all -> 0x0115 }
        L_0x00ac:
            if (r11 == 0) goto L_0x00f9
            if (r8 == 0) goto L_0x00bd
            ic0.m r12 = r1.f60583s     // Catch:{ all -> 0x0115 }
            com.tencent.mm.modelimage.loader.impr.e r12 = (com.tencent.p014mm.modelimage.loader.impr.C81002e) r12     // Catch:{ all -> 0x0115 }
            boolean r12 = r12.mo112880c(r6, r11)     // Catch:{ all -> 0x0115 }
            if (r12 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r0 = 0
            goto L_0x00f3
        L_0x00bd:
            ic0.a r12 = r1.f60585u     // Catch:{ all -> 0x0115 }
            if (r12 == 0) goto L_0x00c6
            java.lang.String r13 = r1.f60571d     // Catch:{ all -> 0x0115 }
            r12.mo32787c(r13, r3)     // Catch:{ all -> 0x0115 }
        L_0x00c6:
            hc0.c r12 = r1.f60575h     // Catch:{ all -> 0x0115 }
            int r13 = r12.f59325i     // Catch:{ all -> 0x0115 }
            int r14 = r12.f59326j     // Catch:{ all -> 0x0115 }
            boolean r15 = r12.f59331o     // Catch:{ all -> 0x0115 }
            r12.getClass()     // Catch:{ all -> 0x0115 }
            hc0.c r12 = r1.f60575h     // Catch:{ all -> 0x0115 }
            r12.getClass()     // Catch:{ all -> 0x0115 }
            if (r13 <= 0) goto L_0x00e0
            if (r14 > 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r11, r9, r13, r14)     // Catch:{ all -> 0x0115 }
            goto L_0x00e4
        L_0x00e0:
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r11)     // Catch:{ all -> 0x0115 }
        L_0x00e4:
            if (r15 == 0) goto L_0x00eb
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r9, r13, r14, r0, r4)     // Catch:{ all -> 0x0115 }
            r9 = r0
        L_0x00eb:
            ic0.a r0 = r1.f60585u     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00f2
            r0.mo32788d(r9)     // Catch:{ all -> 0x00f7 }
        L_0x00f2:
            r0 = r9
        L_0x00f3:
            r9 = 1
            r9 = r0
            r0 = 1
            goto L_0x00fd
        L_0x00f7:
            r0 = move-exception
            goto L_0x011a
        L_0x00f9:
            r9 = 0
            r0 = 0
            r9 = r0
            r0 = 0
        L_0x00fd:
            if (r11 == 0) goto L_0x0104
            r11.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0104
        L_0x0103:
        L_0x0104:
            if (r0 == 0) goto L_0x0249
            if (r9 != 0) goto L_0x0249
            ic0.b r0 = r1.f60582r     // Catch:{ Exception -> 0x0120 }
            java.lang.String r11 = r1.f60571d     // Catch:{ Exception -> 0x0120 }
            hc0.c r12 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.modelimage.loader.impr.a r0 = (com.tencent.p014mm.modelimage.loader.impr.C114733a) r0     // Catch:{ Exception -> 0x0120 }
            r0.mo174348a(r11, r12)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0249
        L_0x0115:
            r0 = move-exception
            goto L_0x0119
        L_0x0117:
            r0 = move-exception
            r11 = 0
        L_0x0119:
            r9 = 0
        L_0x011a:
            if (r11 == 0) goto L_0x011f
            r11.close()     // Catch:{ IOException -> 0x011f }
        L_0x011f:
            throw r0     // Catch:{ Exception -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            goto L_0x03fa
        L_0x0123:
            java.lang.String r0 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x03f8 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x03f8 }
            hc0.c r9 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            int r11 = r9.f59325i     // Catch:{ Exception -> 0x03f8 }
            int r9 = r9.f59326j     // Catch:{ Exception -> 0x03f8 }
            if (r11 <= 0) goto L_0x013d
            if (r9 > 0) goto L_0x0138
            goto L_0x013d
        L_0x0138:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r0, (int) r11, (int) r9)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0141
        L_0x013d:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r0)     // Catch:{ Exception -> 0x03f8 }
        L_0x0141:
            r9 = r0
            goto L_0x0249
        L_0x0144:
            hc0.b r0 = r1.f60579o     // Catch:{ Exception -> 0x03f8 }
            android.content.res.Resources r9 = r0.f59287b     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r11 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r12 = "drawable"
            java.lang.String r0 = r0.f59286a     // Catch:{ Exception -> 0x03f8 }
            int r0 = r9.getIdentifier(r11, r12, r0)     // Catch:{ Exception -> 0x03f8 }
            hc0.c r9 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            int r11 = r9.f59325i     // Catch:{ Exception -> 0x03f8 }
            int r9 = r9.f59326j     // Catch:{ Exception -> 0x03f8 }
            if (r11 <= 0) goto L_0x0162
            if (r9 > 0) goto L_0x015d
            goto L_0x0162
        L_0x015d:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r0, (int) r11, (int) r9)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0141
        L_0x0162:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r0)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0141
        L_0x0167:
            gc0.c r0 = r1.f60572e     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r9 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            hc0.c r11 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            int r12 = r11.f59325i     // Catch:{ Exception -> 0x03f8 }
            int r11 = r11.f59326j     // Catch:{ Exception -> 0x03f8 }
            android.graphics.Bitmap r9 = mc0.C99826a.m130344a(r0, r9, r12, r11)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0249
        L_0x0177:
            hc0.c r9 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            r9.getClass()     // Catch:{ Exception -> 0x03f8 }
            hc0.c r9 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            r9.getClass()     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r9 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x03f8 }
            if (r9 != 0) goto L_0x0243
            java.lang.String r9 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ Exception -> 0x03f8 }
            if (r9 == 0) goto L_0x0231
            if (r8 == 0) goto L_0x01ad
            ic0.m r9 = r1.f60583s     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r11 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            com.tencent.mm.modelimage.loader.impr.e r9 = (com.tencent.p014mm.modelimage.loader.impr.C81002e) r9     // Catch:{ Exception -> 0x03f8 }
            boolean r9 = r9.mo112879b(r6, r11)     // Catch:{ Exception -> 0x03f8 }
            if (r9 == 0) goto L_0x01a0
            goto L_0x01ad
        L_0x01a0:
            java.lang.String r9 = "hy: file md5 check failed %s"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r12 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            r11[r0] = r12     // Catch:{ Exception -> 0x03f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r9, r11)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0248
        L_0x01ad:
            hc0.c r9 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            boolean r11 = r9.f59340x     // Catch:{ Exception -> 0x03f8 }
            if (r11 == 0) goto L_0x0207
            gc0.c r11 = r1.f60572e     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r12 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            int r13 = r9.f59325i     // Catch:{ Exception -> 0x03f8 }
            int r9 = r9.f59326j     // Catch:{ Exception -> 0x03f8 }
            android.graphics.BitmapFactory$Options r14 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r12)     // Catch:{ Exception -> 0x03f8 }
            if (r14 == 0) goto L_0x0201
            int r0 = r14.outWidth     // Catch:{ Exception -> 0x03f8 }
            int r14 = r14.outHeight     // Catch:{ Exception -> 0x03f8 }
            int r15 = r14 * 2
            if (r0 >= r15) goto L_0x01d0
            int r0 = r0 * 2
            if (r0 > r14) goto L_0x01ce
            goto L_0x01d0
        L_0x01ce:
            r0 = 0
            goto L_0x0201
        L_0x01d0:
            if (r13 <= 0) goto L_0x01da
            if (r9 > 0) goto L_0x01d5
            goto L_0x01da
        L_0x01d5:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r12, r9, r13, r4)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0205
        L_0x01da:
            if (r11 == 0) goto L_0x01f3
            android.widget.ImageView r0 = r11.mo32531a()     // Catch:{ Exception -> 0x03f8 }
            if (r0 == 0) goto L_0x01f3
            android.widget.ImageView r0 = r11.mo32531a()     // Catch:{ Exception -> 0x03f8 }
            int r0 = r0.getMeasuredWidth()     // Catch:{ Exception -> 0x03f8 }
            android.widget.ImageView r9 = r11.mo32531a()     // Catch:{ Exception -> 0x03f8 }
            int r9 = r9.getMeasuredHeight()     // Catch:{ Exception -> 0x03f8 }
            goto L_0x01fc
        L_0x01f3:
            java.lang.String r0 = "MicroMsg.imageloader.ImageLoaderUtils"
            java.lang.String r9 = "crop bitmap cant not un set width or height"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)     // Catch:{ Exception -> 0x03f8 }
            r0 = 0
            r9 = 0
        L_0x01fc:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r12, r9, r0, r4)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0205
        L_0x0201:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r12, r9, r13, r0)     // Catch:{ Exception -> 0x03f8 }
        L_0x0205:
            r9 = r0
            goto L_0x021f
        L_0x0207:
            java.lang.String r0 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            int r11 = r9.f59325i     // Catch:{ Exception -> 0x03f8 }
            int r12 = r9.f59326j     // Catch:{ Exception -> 0x03f8 }
            android.graphics.Bitmap$Config r9 = r9.f59327k     // Catch:{ Exception -> 0x03f8 }
            if (r11 <= 0) goto L_0x021a
            if (r12 > 0) goto L_0x0214
            goto L_0x021a
        L_0x0214:
            r9 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r0, r12, r11, r9)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0205
        L_0x021a:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r0, (android.graphics.Bitmap.Config) r9)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0205
        L_0x021f:
            hc0.c r0 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            r0.getClass()     // Catch:{ Exception -> 0x0120 }
            if (r9 == 0) goto L_0x022b
            hc0.c r0 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            r0.getClass()     // Catch:{ Exception -> 0x0120 }
        L_0x022b:
            java.lang.String r0 = "hy: file md5 check success or do not need md5 check"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0249
        L_0x0231:
            hc0.c r0 = r1.f60575h     // Catch:{ Exception -> 0x03f8 }
            r0.getClass()     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r0 = "[cpan] file does not exist. %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03f8 }
            java.lang.String r11 = r1.f60571d     // Catch:{ Exception -> 0x03f8 }
            r12 = 0
            r9[r12] = r11     // Catch:{ Exception -> 0x03f8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r9)     // Catch:{ Exception -> 0x03f8 }
            goto L_0x0248
        L_0x0243:
            java.lang.String r0 = "[cpan] url is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ Exception -> 0x03f8 }
        L_0x0248:
            r9 = 0
        L_0x0249:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0120 }
            java.lang.String r0 = "[cpan] run. put key %s to memory cache."
            if (r9 == 0) goto L_0x02cf
            boolean r11 = r9.isRecycled()     // Catch:{ Exception -> 0x0120 }
            if (r11 == 0) goto L_0x0258
            goto L_0x02cf
        L_0x0258:
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            boolean r7 = r6.f59338v     // Catch:{ Exception -> 0x0120 }
            if (r7 == 0) goto L_0x02af
            float r6 = r6.f59339w     // Catch:{ Exception -> 0x0120 }
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x02a9
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r7 = r9.getHeight()     // Catch:{ Exception -> 0x0120 }
            if (r6 != r7) goto L_0x027b
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r6 = r6 / r10
            float r6 = (float) r6     // Catch:{ Exception -> 0x0120 }
            r7 = 0
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r9, r7, r6)     // Catch:{ Exception -> 0x0120 }
            goto L_0x02ae
        L_0x027b:
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r7 = r9.getHeight()     // Catch:{ Exception -> 0x0120 }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ Exception -> 0x0120 }
            if (r6 > 0) goto L_0x0295
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r7 = r9.getHeight()     // Catch:{ Exception -> 0x0120 }
            int r6 = java.lang.Math.max(r6, r7)     // Catch:{ Exception -> 0x0120 }
        L_0x0295:
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r9, r6, r6, r4)     // Catch:{ Exception -> 0x0120 }
            int r7 = r6.getWidth()     // Catch:{ Exception -> 0x02a5 }
            int r7 = r7 / r10
            float r7 = (float) r7     // Catch:{ Exception -> 0x02a5 }
            r8 = 0
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r6, r8, r7)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x02ae
        L_0x02a5:
            r0 = move-exception
            r9 = r6
            goto L_0x03fa
        L_0x02a9:
            r7 = 0
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r9, r7, r6)     // Catch:{ Exception -> 0x0120 }
        L_0x02ae:
            r9 = r6
        L_0x02af:
            android.graphics.Bitmap r9 = r1.mo33539c(r3, r9)     // Catch:{ Exception -> 0x0120 }
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            boolean r6 = r6.f59317a     // Catch:{ Exception -> 0x0120 }
            if (r6 == 0) goto L_0x02c8
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0120 }
            java.lang.String r7 = r1.f60571d     // Catch:{ Exception -> 0x0120 }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r6)     // Catch:{ Exception -> 0x0120 }
            ic0.o r0 = r1.f60581q     // Catch:{ Exception -> 0x0120 }
            r0.mo32795a(r5, r9)     // Catch:{ Exception -> 0x0120 }
        L_0x02c8:
            java.lang.String r0 = "[cpan] run. get bitmap from disk success."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0408
        L_0x02cf:
            if (r7 == r4) goto L_0x03f2
            if (r7 == r10) goto L_0x03f2
            r11 = 3
            if (r7 == r11) goto L_0x03f2
            r11 = 4
            if (r7 == r11) goto L_0x03f2
            r11 = 5
            if (r7 == r11) goto L_0x02e3
            java.lang.String r0 = "[cpan] run unknow file type"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0408
        L_0x02e3:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0120 }
            java.lang.String r7 = "[cpan] run. get bitmap from memory failed.now try to get from network."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r7)     // Catch:{ Exception -> 0x0120 }
            ic0.h r7 = r1.f60578n     // Catch:{ Exception -> 0x0120 }
            if (r7 == 0) goto L_0x02fa
            java.lang.String r11 = r1.f60571d     // Catch:{ Exception -> 0x0120 }
            gc0.c r12 = r1.f60572e     // Catch:{ Exception -> 0x0120 }
            android.widget.ImageView r12 = r12.mo32531a()     // Catch:{ Exception -> 0x0120 }
            r7.mo6676a(r11, r12)     // Catch:{ Exception -> 0x0120 }
        L_0x02fa:
            ic0.p r7 = r1.f60584t     // Catch:{ Exception -> 0x0120 }
            java.lang.String r11 = r1.f60571d     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.modelimage.loader.impr.f r7 = (com.tencent.p014mm.modelimage.loader.impr.C92838f) r7     // Catch:{ Exception -> 0x0120 }
            boolean r7 = r7.mo127156a(r11)     // Catch:{ Exception -> 0x0120 }
            if (r7 == 0) goto L_0x030f
            ic0.c r7 = r1.f60580p     // Catch:{ Exception -> 0x0120 }
            java.lang.String r11 = r1.f60571d     // Catch:{ Exception -> 0x0120 }
            jc0.b r3 = r7.mo32789a(r11)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0314
        L_0x030f:
            java.lang.String r7 = "can not download image, over limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)     // Catch:{ Exception -> 0x0120 }
        L_0x0314:
            if (r3 != 0) goto L_0x031e
            jc0.b r7 = new jc0.b     // Catch:{ Exception -> 0x0120 }
            r11 = 0
            r7.<init>(r11, r11)     // Catch:{ Exception -> 0x0120 }
            r3 = r7
            goto L_0x031f
        L_0x031e:
            r11 = 0
        L_0x031f:
            r3.f59986b = r10     // Catch:{ Exception -> 0x0120 }
            byte[] r7 = r3.f59987c     // Catch:{ Exception -> 0x0120 }
            if (r7 != 0) goto L_0x0329
            r3.f59985a = r4     // Catch:{ Exception -> 0x0120 }
            goto L_0x0408
        L_0x0329:
            if (r8 == 0) goto L_0x0340
            ic0.m r8 = r1.f60583s     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.modelimage.loader.impr.e r8 = (com.tencent.p014mm.modelimage.loader.impr.C81002e) r8     // Catch:{ Exception -> 0x0120 }
            boolean r6 = r8.mo112878a(r6, r7)     // Catch:{ Exception -> 0x0120 }
            if (r6 == 0) goto L_0x0336
            goto L_0x0340
        L_0x0336:
            r3.f59985a = r10     // Catch:{ Exception -> 0x0120 }
            java.lang.String r0 = "hy: image data md5 check failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ Exception -> 0x0120 }
            r9 = r11
            goto L_0x0408
        L_0x0340:
            java.lang.String r6 = "hy: image data md5 check success or do not need md5 check"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)     // Catch:{ Exception -> 0x0120 }
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0120 }
            byte[] r12 = r3.f59987c     // Catch:{ Exception -> 0x0120 }
            ic0.a r6 = r1.f60585u     // Catch:{ Exception -> 0x0120 }
            if (r6 == 0) goto L_0x0353
            java.lang.String r7 = r1.f60571d     // Catch:{ Exception -> 0x0120 }
            r6.mo32787c(r7, r3)     // Catch:{ Exception -> 0x0120 }
        L_0x0353:
            gc0.c r11 = r1.f60572e     // Catch:{ Exception -> 0x0120 }
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            int r13 = r6.f59325i     // Catch:{ Exception -> 0x0120 }
            int r14 = r6.f59326j     // Catch:{ Exception -> 0x0120 }
            boolean r15 = r6.f59331o     // Catch:{ Exception -> 0x0120 }
            r6.getClass()     // Catch:{ Exception -> 0x0120 }
            r16 = 0
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            r6.getClass()     // Catch:{ Exception -> 0x0120 }
            r17 = 0
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            android.graphics.Bitmap$Config r6 = r6.f59327k     // Catch:{ Exception -> 0x0120 }
            r18 = r6
            android.graphics.Bitmap r9 = mc0.C99826a.m130345b(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0120 }
            ic0.a r6 = r1.f60585u     // Catch:{ Exception -> 0x0120 }
            if (r6 == 0) goto L_0x037a
            r6.mo32788d(r9)     // Catch:{ Exception -> 0x0120 }
        L_0x037a:
            if (r9 != 0) goto L_0x0381
            r0 = 3
            r3.f59985a = r0     // Catch:{ Exception -> 0x0120 }
            goto L_0x0408
        L_0x0381:
            byte[] r6 = r3.f59987c     // Catch:{ Exception -> 0x0120 }
            r1.mo33537a(r6)     // Catch:{ Exception -> 0x0120 }
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            boolean r7 = r6.f59338v     // Catch:{ Exception -> 0x0120 }
            if (r7 == 0) goto L_0x03d8
            float r6 = r6.f59339w     // Catch:{ Exception -> 0x0120 }
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x03d3
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r7 = r9.getHeight()     // Catch:{ Exception -> 0x0120 }
            if (r6 != r7) goto L_0x03a9
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r6 = r6 / r10
            float r6 = (float) r6     // Catch:{ Exception -> 0x0120 }
            r7 = 0
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r9, r7, r6)     // Catch:{ Exception -> 0x0120 }
            goto L_0x03d8
        L_0x03a9:
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r7 = r9.getHeight()     // Catch:{ Exception -> 0x0120 }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ Exception -> 0x0120 }
            if (r6 > 0) goto L_0x03c3
            int r6 = r9.getWidth()     // Catch:{ Exception -> 0x0120 }
            int r7 = r9.getHeight()     // Catch:{ Exception -> 0x0120 }
            int r6 = java.lang.Math.max(r6, r7)     // Catch:{ Exception -> 0x0120 }
        L_0x03c3:
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r9, r6, r6, r4)     // Catch:{ Exception -> 0x0120 }
            int r7 = r6.getWidth()     // Catch:{ Exception -> 0x02a5 }
            int r7 = r7 / r10
            float r7 = (float) r7     // Catch:{ Exception -> 0x02a5 }
            r8 = 0
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r6, r8, r7)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x03d8
        L_0x03d3:
            r7 = 0
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r9, r7, r6)     // Catch:{ Exception -> 0x0120 }
        L_0x03d8:
            android.graphics.Bitmap r9 = r1.mo33539c(r3, r9)     // Catch:{ Exception -> 0x0120 }
            hc0.c r6 = r1.f60575h     // Catch:{ Exception -> 0x0120 }
            boolean r6 = r6.f59317a     // Catch:{ Exception -> 0x0120 }
            if (r6 == 0) goto L_0x0408
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0120 }
            java.lang.String r7 = r1.f60571d     // Catch:{ Exception -> 0x0120 }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r6)     // Catch:{ Exception -> 0x0120 }
            ic0.o r0 = r1.f60581q     // Catch:{ Exception -> 0x0120 }
            r0.mo32795a(r5, r9)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0408
        L_0x03f2:
            java.lang.String r0 = "[cpan] run get bitmap failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0408
        L_0x03f8:
            r0 = move-exception
            r9 = 0
        L_0x03fa:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.toString()
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "[cpan] run. exception. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)
        L_0x0408:
            if (r9 == 0) goto L_0x045b
            boolean r0 = r9.isRecycled()
            if (r0 != 0) goto L_0x045b
            java.lang.String r0 = "[cpan] run. get bitmap successs."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            hc0.c r0 = r1.f60575h
            boolean r2 = r0.f59329m
            if (r2 == 0) goto L_0x0421
            int r0 = r0.f59330n
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r9, r0)
        L_0x0421:
            r3.getClass()
            lc0.c r0 = new lc0.c
            java.lang.String r11 = r1.f60571d
            gc0.c r12 = r1.f60572e
            gc0.b r14 = r1.f60574g
            java.lang.String r15 = r1.mo33538b(r11)
            r10 = r0
            r13 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r1.f60573f
            if (r2 == 0) goto L_0x043c
            r2.post(r0)
        L_0x043c:
            r3.f59988d = r9
            r0 = 0
            r3.f59985a = r0
            hc0.c r0 = r1.f60575h
            java.lang.String r0 = r0.f59336t
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0460
            gc0.b r0 = r1.f60574g
            hc0.c r2 = r1.f60575h
            java.lang.String r2 = r2.f59336t
            hc0.b r0 = r0.f58840a
            if (r0 == 0) goto L_0x0460
            ic0.o r0 = r0.f59291f
            r0.mo32795a(r2, r9)
            goto L_0x0460
        L_0x045b:
            java.lang.String r0 = "[cpan] run. get bitmap failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
        L_0x0460:
            ic0.i r0 = r1.f60586v
            if (r0 == 0) goto L_0x0469
            wd3.o r0 = (wd3.C22904o) r0
            r0.mo36085a()
        L_0x0469:
            ic0.h r0 = r1.f60578n
            if (r0 == 0) goto L_0x047c
            if (r3 == 0) goto L_0x047c
            r3.f59988d = r9
            java.lang.String r2 = r1.f60571d
            gc0.c r4 = r1.f60572e
            android.widget.ImageView r4 = r4.mo32531a()
            r0.mo6677b(r2, r4, r3)
        L_0x047c:
            ic0.k r0 = r1.f60576i
            java.lang.String r2 = r1.f60571d
            gc0.c r3 = r1.f60572e
            android.widget.ImageView r3 = r3.mo32531a()
            hc0.c r4 = r1.f60575h
            java.lang.Object[] r4 = r4.f59316C
            r0.mo6935a(r2, r3, r9, r4)
            gc0.b r0 = r1.f60574g
            r0.mo32529a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lc0.C21410b.run():void");
    }
}
