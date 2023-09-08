package p972h5;

import a14.C53921m;
import android.content.Context;
import android.graphics.Paint;
import coil.size.Size;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import o24.C21760d0;
import o24.C21766h;
import o24.C21768j;
import o24.C21772m;
import p1106e5.C107228a;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: h5.a */
public final class C108134a implements C108139e {

    /* renamed from: c */
    public static final String[] f323792c = {"image/jpeg", "image/webp", "image/heic", "image/heif"};

    /* renamed from: a */
    public final Context f323793a;

    /* renamed from: b */
    public final Paint f323794b = new Paint(3);

    /* renamed from: h5.a$a */
    public static final class C108135a extends C21772m {

        /* renamed from: e */
        public Exception f323795e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108135a(C21760d0 d0Var) {
            super(d0Var);
            C87412m.m108594g(d0Var, "delegate");
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            C87412m.m108594g(hVar, "sink");
            try {
                return super.mo32327L0(hVar, j);
            } catch (Exception e) {
                this.f323795e = e;
                throw e;
            }
        }
    }

    public C108134a(Context context) {
        C87412m.m108594g(context, "context");
        this.f323793a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0240, code lost:
        if ((r3.top == 0.0f) == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02b6, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        cy3.C58003b.m67160a(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ba, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02bb, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02bc, code lost:
        if (r7 != null) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02bf, code lost:
        r1.mo157693b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c7, code lost:
        r1.mo157693b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02ca, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:98:0x01cd, B:153:0x02b4] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p972h5.C108137c m146467c(p972h5.C108134a r27, p1106e5.C107228a r28, o24.C21760d0 r29, coil.size.Size r30, p972h5.C108143i r31) {
        /*
            r0 = r27
            r1 = r28
            r2 = r30
            r3 = r31
            r27.getClass()
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            h5.a$a r5 = new h5.a$a
            r6 = r29
            r5.<init>(r6)
            o24.j r6 = o24.C21777r.m24935b(r5)
            r7 = 1
            r4.inJustDecodeBounds = r7
            r8 = r6
            o24.x r8 = (o24.C21783x) r8
            o24.u r9 = new o24.u
            r9.<init>(r8)
            o24.j r9 = o24.C21777r.m24935b(r9)
            o24.x r9 = (o24.C21783x) r9
            o24.w r10 = new o24.w
            r10.<init>(r9)
            r9 = 0
            android.graphics.BitmapFactory.decodeStream(r10, r9, r4)
            java.lang.Exception r10 = r5.f323795e
            if (r10 != 0) goto L_0x02cb
            r10 = 0
            r4.inJustDecodeBounds = r10
            java.lang.String r11 = r4.outMimeType
            if (r11 == 0) goto L_0x004a
            java.lang.String[] r12 = f323792c
            boolean r11 = sx3.C110823p.m151009y(r12, r11)
            if (r11 == 0) goto L_0x004a
            r11 = 1
            goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            if (r11 == 0) goto L_0x0075
            androidx.exifinterface.media.ExifInterface r11 = new androidx.exifinterface.media.ExifInterface
            h5.a$b r12 = new h5.a$b
            o24.u r13 = new o24.u
            r13.<init>(r8)
            o24.j r8 = o24.C21777r.m24935b(r13)
            o24.x r8 = (o24.C21783x) r8
            o24.w r13 = new o24.w
            r13.<init>(r8)
            r12.<init>(r13)
            r11.<init>((java.io.InputStream) r12)
            java.lang.Exception r8 = r5.f323795e
            if (r8 != 0) goto L_0x0074
            boolean r8 = r11.isFlipped()
            int r11 = r11.getRotationDegrees()
            goto L_0x0077
        L_0x0074:
            throw r8
        L_0x0075:
            r8 = 0
            r11 = 0
        L_0x0077:
            r12 = 270(0x10e, float:3.78E-43)
            r13 = 90
            if (r11 == r13) goto L_0x0082
            if (r11 != r12) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r14 = 0
            goto L_0x0083
        L_0x0082:
            r14 = 1
        L_0x0083:
            if (r14 == 0) goto L_0x0088
            int r15 = r4.outHeight
            goto L_0x008a
        L_0x0088:
            int r15 = r4.outWidth
        L_0x008a:
            if (r14 == 0) goto L_0x008f
            int r14 = r4.outWidth
            goto L_0x0091
        L_0x008f:
            int r14 = r4.outHeight
        L_0x0091:
            android.graphics.Bitmap$Config r12 = r3.f323811b
            if (r8 != 0) goto L_0x0097
            if (r11 <= 0) goto L_0x00a1
        L_0x0097:
            if (r12 == 0) goto L_0x009f
            boolean r16 = p864t5.C110902a.m151200c(r12)
            if (r16 == 0) goto L_0x00a1
        L_0x009f:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x00a1:
            boolean r13 = r3.f323815f
            if (r13 == 0) goto L_0x00b5
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888
            if (r12 != r13) goto L_0x00b5
            java.lang.String r13 = r4.outMimeType
            java.lang.String r9 = "image/jpeg"
            boolean r9 = gy3.C87412m.m108589b(r13, r9)
            if (r9 == 0) goto L_0x00b5
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.RGB_565
        L_0x00b5:
            int r9 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r9 < r13) goto L_0x00c7
            android.graphics.Bitmap$Config r7 = r4.outConfig
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGBA_F16
            if (r7 != r10) goto L_0x00c7
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.HARDWARE
            if (r12 == r7) goto L_0x00c7
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.RGBA_F16
        L_0x00c7:
            r4.inPreferredConfig = r12
            if (r9 < r13) goto L_0x00d1
            android.graphics.ColorSpace r7 = r3.f323812c
            if (r7 == 0) goto L_0x00d1
            r4.inPreferredColorSpace = r7
        L_0x00d1:
            boolean r7 = r3.f323816g
            r4.inPremultiplied = r7
            r7 = 24
            if (r9 >= r7) goto L_0x00db
            r7 = 1
            goto L_0x00dc
        L_0x00db:
            r7 = 0
        L_0x00dc:
            r4.inMutable = r7
            r9 = 0
            r4.inScaled = r9
            int r10 = r4.outWidth
            java.lang.String r13 = "inPreferredConfig"
            if (r10 <= 0) goto L_0x01b2
            int r9 = r4.outHeight
            if (r9 > 0) goto L_0x00ed
            goto L_0x01b2
        L_0x00ed:
            boolean r0 = r2 instanceof coil.size.PixelSize
            if (r0 != 0) goto L_0x0107
            r0 = 1
            r4.inSampleSize = r0
            r0 = 0
            r4.inScaled = r0
            if (r7 == 0) goto L_0x0102
            gy3.C87412m.m108593f(r12, r13)
            android.graphics.Bitmap r0 = r1.mo157695d(r10, r9, r12)
            r4.inBitmap = r0
        L_0x0102:
            r30 = r8
            r2 = r11
            goto L_0x01b0
        L_0x0107:
            r0 = r2
            coil.size.PixelSize r0 = (coil.size.PixelSize) r0
            int r2 = r0.f309028d
            int r0 = r0.f309029e
            p5.e r7 = r3.f323813d
            int r7 = p972h5.C108138d.m146471a(r15, r14, r2, r0, r7)
            r4.inSampleSize = r7
            double r9 = (double) r15
            r12 = r8
            double r7 = (double) r7
            double r18 = r9 / r7
            double r9 = (double) r14
            double r20 = r9 / r7
            double r7 = (double) r2
            double r9 = (double) r0
            p5.e r0 = r3.f323813d
            r22 = r7
            r24 = r9
            r26 = r0
            double r7 = p972h5.C108138d.m146473c(r18, r20, r22, r24, r26)
            boolean r0 = r3.f323814e
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x0137
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0137
            r7 = r9
        L_0x0137:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x013f
            r0 = 1
            r17 = 1
            goto L_0x0142
        L_0x013f:
            r0 = 1
            r17 = 0
        L_0x0142:
            r2 = r17 ^ 1
            r4.inScaled = r2
            if (r2 == 0) goto L_0x0165
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x015a
            double r9 = (double) r0
            double r9 = r9 / r7
            int r2 = iy3.C60641c.m70920a(r9)
            r4.inDensity = r2
            r4.inTargetDensity = r0
            goto L_0x0165
        L_0x015a:
            r4.inDensity = r0
            double r9 = (double) r0
            double r9 = r9 * r7
            int r0 = iy3.C60641c.m70920a(r9)
            r4.inTargetDensity = r0
        L_0x0165:
            boolean r0 = r4.inMutable
            if (r0 == 0) goto L_0x01ad
            int r0 = r4.inSampleSize
            r2 = 1
            if (r0 != r2) goto L_0x0183
            boolean r2 = r4.inScaled
            if (r2 != 0) goto L_0x0183
            int r0 = r4.outWidth
            int r2 = r4.outHeight
            android.graphics.Bitmap$Config r7 = r4.inPreferredConfig
            gy3.C87412m.m108593f(r7, r13)
            android.graphics.Bitmap r0 = r1.mo157695d(r0, r2, r7)
            r2 = r11
            r30 = r12
            goto L_0x01aa
        L_0x0183:
            int r2 = r4.outWidth
            double r9 = (double) r2
            double r14 = (double) r0
            double r9 = r9 / r14
            int r0 = r4.outHeight
            r2 = r11
            r30 = r12
            double r11 = (double) r0
            double r11 = r11 / r14
            double r9 = r9 * r7
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 + r14
            double r9 = java.lang.Math.ceil(r9)
            int r0 = (int) r9
            double r7 = r7 * r11
            double r7 = r7 + r14
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            android.graphics.Bitmap$Config r8 = r4.inPreferredConfig
            gy3.C87412m.m108593f(r8, r13)
            android.graphics.Bitmap r0 = r1.mo157695d(r0, r7, r8)
        L_0x01aa:
            r4.inBitmap = r0
            goto L_0x01b0
        L_0x01ad:
            r2 = r11
            r30 = r12
        L_0x01b0:
            r9 = 0
            goto L_0x01be
        L_0x01b2:
            r30 = r8
            r2 = r11
            r0 = 1
            r4.inSampleSize = r0
            r9 = 0
            r4.inScaled = r9
            r7 = 0
            r4.inBitmap = r7
        L_0x01be:
            android.graphics.Bitmap r7 = r4.inBitmap
            r0 = r6
            o24.x r0 = (o24.C21783x) r0     // Catch:{ all -> 0x02b1 }
            o24.w r8 = new o24.w     // Catch:{ all -> 0x02b1 }
            r8.<init>(r0)     // Catch:{ all -> 0x02b1 }
            r10 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8, r10, r4)     // Catch:{ all -> 0x02af }
            cy3.C58003b.m67160a(r6, r10)     // Catch:{ all -> 0x02ad }
            java.lang.Exception r0 = r5.f323795e     // Catch:{ all -> 0x02aa }
            if (r0 != 0) goto L_0x02a9
            if (r8 == 0) goto L_0x029d
            android.content.Context r0 = r3.f323810a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r8.setDensity(r0)
            android.graphics.Bitmap$Config r0 = r4.inPreferredConfig
            gy3.C87412m.m108593f(r0, r13)
            if (r2 <= 0) goto L_0x01ee
            r3 = 1
            goto L_0x01ef
        L_0x01ee:
            r3 = 0
        L_0x01ef:
            if (r30 != 0) goto L_0x01f7
            if (r3 != 0) goto L_0x01f7
            r3 = r27
            goto L_0x027a
        L_0x01f7:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r6 = r8.getWidth()
            float r6 = (float) r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r10 = r8.getHeight()
            float r10 = (float) r10
            float r10 = r10 / r7
            if (r30 == 0) goto L_0x0213
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.postScale(r7, r11, r6, r10)
        L_0x0213:
            if (r3 == 0) goto L_0x0219
            float r3 = (float) r2
            r5.postRotate(r3, r6, r10)
        L_0x0219:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r6 = r8.getWidth()
            float r6 = (float) r6
            int r7 = r8.getHeight()
            float r7 = (float) r7
            r10 = 0
            r3.<init>(r10, r10, r6, r7)
            r5.mapRect(r3)
            float r6 = r3.left
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0234
            r7 = 1
            goto L_0x0235
        L_0x0234:
            r7 = 0
        L_0x0235:
            if (r7 == 0) goto L_0x0242
            float r7 = r3.top
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x023f
            r7 = 1
            goto L_0x0240
        L_0x023f:
            r7 = 0
        L_0x0240:
            if (r7 != 0) goto L_0x0249
        L_0x0242:
            float r6 = -r6
            float r3 = r3.top
            float r3 = -r3
            r5.postTranslate(r6, r3)
        L_0x0249:
            r3 = 90
            if (r2 == r3) goto L_0x025e
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 == r3) goto L_0x025e
            int r2 = r8.getWidth()
            int r3 = r8.getHeight()
            android.graphics.Bitmap r0 = r1.mo157694c(r2, r3, r0)
            goto L_0x026a
        L_0x025e:
            int r2 = r8.getHeight()
            int r3 = r8.getWidth()
            android.graphics.Bitmap r0 = r1.mo157694c(r2, r3, r0)
        L_0x026a:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r3 = r27
            android.graphics.Paint r6 = r3.f323794b
            r2.drawBitmap(r8, r5, r6)
            r1.mo157693b(r8)
            r8 = r0
        L_0x027a:
            h5.c r0 = new h5.c
            android.content.Context r1 = r3.f323793a
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r2 = "context.resources"
            gy3.C87412m.m108593f(r1, r2)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r1, r8)
            int r1 = r4.inSampleSize
            r3 = 1
            if (r1 > r3) goto L_0x0298
            boolean r1 = r4.inScaled
            if (r1 == 0) goto L_0x0296
            goto L_0x0298
        L_0x0296:
            r7 = 0
            goto L_0x0299
        L_0x0298:
            r7 = 1
        L_0x0299:
            r0.<init>(r2, r7)
            return r0
        L_0x029d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a9:
            throw r0     // Catch:{ all -> 0x02aa }
        L_0x02aa:
            r0 = move-exception
            r9 = r8
            goto L_0x02bc
        L_0x02ad:
            r0 = move-exception
            goto L_0x02bb
        L_0x02af:
            r0 = move-exception
            goto L_0x02b3
        L_0x02b1:
            r0 = move-exception
            r10 = 0
        L_0x02b3:
            r2 = r0
            throw r2     // Catch:{ all -> 0x02b5 }
        L_0x02b5:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r6, r2)     // Catch:{ all -> 0x02ad }
            throw r3     // Catch:{ all -> 0x02ad }
        L_0x02bb:
            r9 = r10
        L_0x02bc:
            if (r7 != 0) goto L_0x02bf
            goto L_0x02c2
        L_0x02bf:
            r1.mo157693b(r7)
        L_0x02c2:
            if (r9 == r7) goto L_0x02ca
            if (r9 != 0) goto L_0x02c7
            goto L_0x02ca
        L_0x02c7:
            r1.mo157693b(r9)
        L_0x02ca:
            throw r0
        L_0x02cb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p972h5.C108134a.m146467c(h5.a, e5.a, o24.d0, coil.size.Size, h5.i):h5.c");
    }

    /* renamed from: a */
    public boolean mo158532a(C21768j jVar, String str) {
        C87412m.m108594g(jVar, FirebaseAnalytics.C113379b.SOURCE);
        return true;
    }

    /* renamed from: b */
    public Object mo158533b(C107228a aVar, C21768j jVar, Size size, C108143i iVar, C15601d<? super C108137c> dVar) {
        C108142h hVar;
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        try {
            hVar = new C108142h(mVar, jVar);
            mVar.resumeWith(Result.m168114constructorimpl(m146467c(this, aVar, hVar, size, iVar)));
            hVar.mo158538a();
            return mVar.mo74608o();
        } catch (Exception e) {
            if ((e instanceof InterruptedException) || (e instanceof InterruptedIOException)) {
                Throwable initCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e);
                C87412m.m108593f(initCause, "CancellationException(\"B…n.\").initCause(exception)");
                throw initCause;
            }
            throw e;
        } catch (Throwable th) {
            hVar.mo158538a();
            throw th;
        }
    }

    /* renamed from: h5.a$b */
    public static final class C87434b extends InputStream {

        /* renamed from: d */
        public final InputStream f253339d;

        /* renamed from: e */
        public volatile int f253340e = 1073741824;

        public C87434b(InputStream inputStream) {
            C87412m.m108594g(inputStream, "delegate");
            this.f253339d = inputStream;
        }

        public int available() {
            return this.f253340e;
        }

        public void close() {
            this.f253339d.close();
        }

        public int read() {
            int read = this.f253339d.read();
            if (read == -1) {
                this.f253340e = 0;
            }
            return read;
        }

        public long skip(long j) {
            return this.f253339d.skip(j);
        }

        public int read(byte[] bArr) {
            C87412m.m108594g(bArr, "b");
            int read = this.f253339d.read(bArr);
            if (read == -1) {
                this.f253340e = 0;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            C87412m.m108594g(bArr, "b");
            int read = this.f253339d.read(bArr, i, i2);
            if (read == -1) {
                this.f253340e = 0;
            }
            return read;
        }
    }
}
