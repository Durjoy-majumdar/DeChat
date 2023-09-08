package mh3;

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
import p972h5.C108137c;
import p972h5.C108139e;
import p972h5.C108142h;
import p972h5.C108143i;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: mh3.a */
public final class C109626a implements C108139e {

    /* renamed from: c */
    public static final String[] f328194c = {"image/jpeg", "image/webp", "image/heic", "image/heif"};

    /* renamed from: a */
    public final Context f328195a;

    /* renamed from: b */
    public final Paint f328196b = new Paint(3);

    /* renamed from: mh3.a$a */
    public static final class C109627a extends C21772m {

        /* renamed from: e */
        public Exception f328197e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109627a(C21760d0 d0Var) {
            super(d0Var);
            C87412m.m108594g(d0Var, "delegate");
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            C87412m.m108594g(hVar, "sink");
            try {
                return super.mo32327L0(hVar, j);
            } catch (Exception e) {
                this.f328197e = e;
                throw e;
            }
        }
    }

    public C109626a(Context context) {
        C87412m.m108594g(context, "context");
        this.f328195a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0247, code lost:
        if ((r3.top == 0.0f) == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02bd, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        cy3.C58003b.m67160a(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02c1, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c2, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c3, code lost:
        if (r7 != null) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c5, code lost:
        r1.mo157693b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02cc, code lost:
        r1.mo157693b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 26 && r12 == android.graphics.Bitmap.Config.HARDWARE) != false) goto L_0x00a8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:103:0x01d4, B:158:0x02bb] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p972h5.C108137c m148936c(mh3.C109626a r26, p1106e5.C107228a r27, o24.C21760d0 r28, coil.size.Size r29, p972h5.C108143i r30) {
        /*
            r0 = r26
            r1 = r27
            r2 = r29
            r3 = r30
            r26.getClass()
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            mh3.a$a r5 = new mh3.a$a
            r6 = r28
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
            com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r10, r9, r4)
            java.lang.Exception r10 = r5.f328197e
            if (r10 != 0) goto L_0x02d0
            r10 = 0
            r4.inJustDecodeBounds = r10
            java.lang.String r11 = r4.outMimeType
            if (r11 == 0) goto L_0x004a
            java.lang.String[] r12 = f328194c
            boolean r11 = sx3.C110823p.m151009y(r12, r11)
            if (r11 == 0) goto L_0x004a
            r11 = 1
            goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            if (r11 == 0) goto L_0x0075
            androidx.exifinterface.media.ExifInterface r11 = new androidx.exifinterface.media.ExifInterface
            mh3.a$b r12 = new mh3.a$b
            o24.u r13 = new o24.u
            r13.<init>(r8)
            o24.j r8 = o24.C21777r.m24935b(r13)
            o24.x r8 = (o24.C21783x) r8
            o24.w r13 = new o24.w
            r13.<init>(r8)
            r12.<init>(r13)
            r11.<init>((java.io.InputStream) r12)
            java.lang.Exception r8 = r5.f328197e
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
            r13 = 26
            if (r8 != 0) goto L_0x0099
            if (r11 <= 0) goto L_0x00aa
        L_0x0099:
            if (r12 == 0) goto L_0x00a8
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r13) goto L_0x00a5
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.HARDWARE
            if (r12 != r9) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r9 == 0) goto L_0x00aa
        L_0x00a8:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x00aa:
            boolean r9 = r3.f323815f
            if (r9 == 0) goto L_0x00be
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            if (r12 != r9) goto L_0x00be
            java.lang.String r9 = r4.outMimeType
            java.lang.String r7 = "image/jpeg"
            boolean r7 = gy3.C87412m.m108589b(r9, r7)
            if (r7 == 0) goto L_0x00be
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.RGB_565
        L_0x00be:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r13) goto L_0x00ce
            android.graphics.Bitmap$Config r9 = r4.outConfig
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGBA_F16
            if (r9 != r10) goto L_0x00ce
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.HARDWARE
            if (r12 == r9) goto L_0x00ce
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.RGBA_F16
        L_0x00ce:
            r4.inPreferredConfig = r12
            if (r7 < r13) goto L_0x00d8
            android.graphics.ColorSpace r9 = r3.f323812c
            if (r9 == 0) goto L_0x00d8
            r4.inPreferredColorSpace = r9
        L_0x00d8:
            boolean r9 = r3.f323816g
            r4.inPremultiplied = r9
            r9 = 24
            if (r7 >= r9) goto L_0x00e2
            r7 = 1
            goto L_0x00e3
        L_0x00e2:
            r7 = 0
        L_0x00e3:
            r4.inMutable = r7
            r9 = 0
            r4.inScaled = r9
            int r10 = r4.outWidth
            java.lang.String r13 = "inPreferredConfig"
            if (r10 <= 0) goto L_0x01b9
            int r9 = r4.outHeight
            if (r9 > 0) goto L_0x00f4
            goto L_0x01b9
        L_0x00f4:
            boolean r0 = r2 instanceof coil.size.PixelSize
            if (r0 != 0) goto L_0x010e
            r0 = 1
            r4.inSampleSize = r0
            r0 = 0
            r4.inScaled = r0
            if (r7 == 0) goto L_0x0109
            gy3.C87412m.m108593f(r12, r13)
            android.graphics.Bitmap r0 = r1.mo157695d(r10, r9, r12)
            r4.inBitmap = r0
        L_0x0109:
            r29 = r8
            r2 = r11
            goto L_0x01b7
        L_0x010e:
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
            double r17 = r9 / r7
            double r9 = (double) r14
            double r19 = r9 / r7
            double r7 = (double) r2
            double r9 = (double) r0
            p5.e r0 = r3.f323813d
            r21 = r7
            r23 = r9
            r25 = r0
            double r7 = p972h5.C108138d.m146473c(r17, r19, r21, r23, r25)
            boolean r0 = r3.f323814e
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x013e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x013e
            r7 = r9
        L_0x013e:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0146
            r0 = 1
            r16 = 1
            goto L_0x0149
        L_0x0146:
            r0 = 1
            r16 = 0
        L_0x0149:
            r2 = r16 ^ 1
            r4.inScaled = r2
            if (r2 == 0) goto L_0x016c
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0161
            double r9 = (double) r0
            double r9 = r9 / r7
            int r2 = iy3.C60641c.m70920a(r9)
            r4.inDensity = r2
            r4.inTargetDensity = r0
            goto L_0x016c
        L_0x0161:
            r4.inDensity = r0
            double r9 = (double) r0
            double r9 = r9 * r7
            int r0 = iy3.C60641c.m70920a(r9)
            r4.inTargetDensity = r0
        L_0x016c:
            boolean r0 = r4.inMutable
            if (r0 == 0) goto L_0x01b4
            int r0 = r4.inSampleSize
            r2 = 1
            if (r0 != r2) goto L_0x018a
            boolean r2 = r4.inScaled
            if (r2 != 0) goto L_0x018a
            int r0 = r4.outWidth
            int r2 = r4.outHeight
            android.graphics.Bitmap$Config r7 = r4.inPreferredConfig
            gy3.C87412m.m108593f(r7, r13)
            android.graphics.Bitmap r0 = r1.mo157695d(r0, r2, r7)
            r2 = r11
            r29 = r12
            goto L_0x01b1
        L_0x018a:
            int r2 = r4.outWidth
            double r9 = (double) r2
            double r14 = (double) r0
            double r9 = r9 / r14
            int r0 = r4.outHeight
            r2 = r11
            r29 = r12
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
        L_0x01b1:
            r4.inBitmap = r0
            goto L_0x01b7
        L_0x01b4:
            r2 = r11
            r29 = r12
        L_0x01b7:
            r9 = 0
            goto L_0x01c5
        L_0x01b9:
            r29 = r8
            r2 = r11
            r0 = 1
            r4.inSampleSize = r0
            r9 = 0
            r4.inScaled = r9
            r7 = 0
            r4.inBitmap = r7
        L_0x01c5:
            android.graphics.Bitmap r7 = r4.inBitmap
            r0 = r6
            o24.x r0 = (o24.C21783x) r0     // Catch:{ all -> 0x02b8 }
            o24.w r8 = new o24.w     // Catch:{ all -> 0x02b8 }
            r8.<init>(r0)     // Catch:{ all -> 0x02b8 }
            r10 = 0
            android.graphics.Bitmap r8 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r8, r10, r4)     // Catch:{ all -> 0x02b6 }
            cy3.C58003b.m67160a(r6, r10)     // Catch:{ all -> 0x02b4 }
            java.lang.Exception r0 = r5.f328197e     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x02b0
            if (r8 == 0) goto L_0x02a4
            android.content.Context r0 = r3.f323810a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r8.setDensity(r0)
            android.graphics.Bitmap$Config r0 = r4.inPreferredConfig
            gy3.C87412m.m108593f(r0, r13)
            if (r2 <= 0) goto L_0x01f5
            r3 = 1
            goto L_0x01f6
        L_0x01f5:
            r3 = 0
        L_0x01f6:
            if (r29 != 0) goto L_0x01fe
            if (r3 != 0) goto L_0x01fe
            r3 = r26
            goto L_0x0281
        L_0x01fe:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r6 = r8.getWidth()
            float r6 = (float) r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r10 = r8.getHeight()
            float r10 = (float) r10
            float r10 = r10 / r7
            if (r29 == 0) goto L_0x021a
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.postScale(r7, r11, r6, r10)
        L_0x021a:
            if (r3 == 0) goto L_0x0220
            float r3 = (float) r2
            r5.postRotate(r3, r6, r10)
        L_0x0220:
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
            if (r7 != 0) goto L_0x023b
            r7 = 1
            goto L_0x023c
        L_0x023b:
            r7 = 0
        L_0x023c:
            if (r7 == 0) goto L_0x0249
            float r7 = r3.top
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0246
            r7 = 1
            goto L_0x0247
        L_0x0246:
            r7 = 0
        L_0x0247:
            if (r7 != 0) goto L_0x0250
        L_0x0249:
            float r6 = -r6
            float r3 = r3.top
            float r3 = -r3
            r5.postTranslate(r6, r3)
        L_0x0250:
            r3 = 90
            if (r2 == r3) goto L_0x0265
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 == r3) goto L_0x0265
            int r2 = r8.getWidth()
            int r3 = r8.getHeight()
            android.graphics.Bitmap r0 = r1.mo157694c(r2, r3, r0)
            goto L_0x0271
        L_0x0265:
            int r2 = r8.getHeight()
            int r3 = r8.getWidth()
            android.graphics.Bitmap r0 = r1.mo157694c(r2, r3, r0)
        L_0x0271:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r3 = r26
            android.graphics.Paint r6 = r3.f328196b
            r2.drawBitmap(r8, r5, r6)
            r1.mo157693b(r8)
            r8 = r0
        L_0x0281:
            h5.c r0 = new h5.c
            android.content.Context r1 = r3.f328195a
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r2 = "context.resources"
            gy3.C87412m.m108593f(r1, r2)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r1, r8)
            int r1 = r4.inSampleSize
            r3 = 1
            if (r1 > r3) goto L_0x029f
            boolean r1 = r4.inScaled
            if (r1 == 0) goto L_0x029d
            goto L_0x029f
        L_0x029d:
            r7 = 0
            goto L_0x02a0
        L_0x029f:
            r7 = 1
        L_0x02a0:
            r0.<init>(r2, r7)
            return r0
        L_0x02a4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02b0:
            throw r0     // Catch:{ all -> 0x02b1 }
        L_0x02b1:
            r0 = move-exception
            r9 = r8
            goto L_0x02c3
        L_0x02b4:
            r0 = move-exception
            goto L_0x02c2
        L_0x02b6:
            r0 = move-exception
            goto L_0x02ba
        L_0x02b8:
            r0 = move-exception
            r10 = 0
        L_0x02ba:
            r2 = r0
            throw r2     // Catch:{ all -> 0x02bc }
        L_0x02bc:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r6, r2)     // Catch:{ all -> 0x02b4 }
            throw r3     // Catch:{ all -> 0x02b4 }
        L_0x02c2:
            r9 = r10
        L_0x02c3:
            if (r7 == 0) goto L_0x02c8
            r1.mo157693b(r7)
        L_0x02c8:
            if (r9 == r7) goto L_0x02cf
            if (r9 == 0) goto L_0x02cf
            r1.mo157693b(r9)
        L_0x02cf:
            throw r0
        L_0x02d0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mh3.C109626a.m148936c(mh3.a, e5.a, o24.d0, coil.size.Size, h5.i):h5.c");
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
            mVar.resumeWith(Result.m168114constructorimpl(m148936c(this, aVar, hVar, size, iVar)));
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

    /* renamed from: mh3.a$b */
    public static final class C88731b extends InputStream {

        /* renamed from: d */
        public final InputStream f256102d;

        /* renamed from: e */
        public volatile int f256103e = 1073741824;

        public C88731b(InputStream inputStream) {
            C87412m.m108594g(inputStream, "delegate");
            this.f256102d = inputStream;
        }

        public int available() {
            return this.f256103e;
        }

        public void close() {
            this.f256102d.close();
        }

        public int read() {
            int read = this.f256102d.read();
            if (read == -1) {
                this.f256103e = 0;
            }
            return read;
        }

        public long skip(long j) {
            return this.f256102d.skip(j);
        }

        public int read(byte[] bArr) {
            C87412m.m108594g(bArr, "b");
            int read = this.f256102d.read(bArr);
            if (read == -1) {
                this.f256103e = 0;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            C87412m.m108594g(bArr, "b");
            int read = this.f256102d.read(bArr, i, i2);
            if (read == -1) {
                this.f256103e = 0;
            }
            return read;
        }
    }
}
