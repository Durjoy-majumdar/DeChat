package lw1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingQueue;
import o40.C61926c;
import p143ds.C7510m;
import rx3.C13598b0;
import zt3.C103084e;
import zt3.C119143b;

/* renamed from: lw1.b */
public final class C99685b implements C7510m {

    /* renamed from: e */
    public static final C99686a f292170e = new C99686a((C8480h) null);

    /* renamed from: a */
    public C99684a<String, C7510m.C7513c> f292171a;

    /* renamed from: b */
    public C99684a<String, C7510m.C7513c> f292172b;

    /* renamed from: c */
    public C99684a<String, C7510m.C7513c> f292173c;

    /* renamed from: d */
    public final C119143b f292174d = new C119143b("MediaTailor", 3, 3, new LinkedBlockingQueue(), C99691e.f292188a);

    /* renamed from: lw1.b$a */
    public static final class C99686a {
        public C99686a(C8480h hVar) {
        }

        /* renamed from: a */
        public final Bitmap mo139055a(InputStream inputStream, int i, int i2, boolean z, boolean z2, boolean z3) {
            float f;
            C87412m.m108594g(inputStream, "inputStream");
            if (i > i2) {
                int i3 = i2;
                i2 = i;
                i = i3;
            }
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(inputStream, false);
            int i4 = imageOptions.outWidth;
            int i5 = imageOptions.outHeight;
            if (i4 <= i5) {
                float f2 = (((float) i) * 1.0f) / ((float) i4);
                float f3 = (((float) i2) * 1.0f) / ((float) i5);
                if (f2 > f3) {
                    f2 = f3;
                }
                f = Math.min(1.0f, f2);
            } else {
                float f4 = (((float) i) * 1.0f) / ((float) i5);
                float f5 = (((float) i2) * 1.0f) / ((float) i4);
                if (f4 > f5) {
                    f4 = f5;
                }
                f = Math.min(1.0f, f4);
            }
            inputStream.reset();
            Bitmap decodeStream = BitmapUtil.decodeStream(inputStream, 0.0f, (int) (((float) imageOptions.outWidth) * f), (int) (((float) imageOptions.outHeight) * f), z3);
            if (z) {
                inputStream.reset();
                int orientationInDegree = Exif.fromStream(inputStream).getOrientationInDegree();
                Log.m105925i("MediaTailor", "read exif rotate degree %d", Integer.valueOf(orientationInDegree));
                decodeStream = BitmapUtil.rotate(decodeStream, ((float) orientationInDegree) * 1.0f);
            }
            if (z2) {
                inputStream.close();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[decodeBitmap] [");
            sb.append(imageOptions.outWidth);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(imageOptions.outHeight);
            sb.append("]->[");
            Integer num = null;
            sb.append(decodeStream != null ? Integer.valueOf(decodeStream.getWidth()) : null);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            if (decodeStream != null) {
                num = Integer.valueOf(decodeStream.getHeight());
            }
            sb.append(num);
            sb.append("] scale=");
            sb.append(f);
            sb.append(" limit[");
            sb.append(i);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(i2);
            sb.append("] decode bitmap done!");
            Log.m105924i("MediaTailor", sb.toString());
            if (decodeStream == null) {
                decodeStream = BitmapUtil.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Log.m105920e("MediaTailor", "bitmap is null. " + Util.getStack());
            }
            C87412m.m108593f(decodeStream, "bitmap");
            return decodeStream;
        }
    }

    /* renamed from: lw1.b$b */
    public static final class C99687b implements C99684a<String, C7510m.C7513c> {
        public C99687b(C7510m.C7512a aVar) {
            C87412m.m108594g(aVar, "config");
        }

        /* renamed from: a */
        public Object mo139054a(Object obj, int i, Matrix matrix, Rect rect, Rect rect2, Rect rect3) {
            C87412m.m108594g((String) obj, "input");
            C87412m.m108594g(matrix, "matrix");
            C87412m.m108594g(rect, "clipRect");
            C87412m.m108594g(rect2, "contentRect");
            C87412m.m108594g(rect3, "viewRect");
            return new C7510m.C7513c(-1);
        }
    }

    /* renamed from: lw1.b$c */
    public final class C99688c implements Runnable {

        /* renamed from: d */
        public final C99684a<String, C7510m.C7513c> f292175d;

        /* renamed from: e */
        public final C32227p<Boolean, C7510m.C7513c, C13598b0> f292176e;

        /* renamed from: f */
        public String f292177f;

        /* renamed from: g */
        public int f292178g;

        /* renamed from: h */
        public Matrix f292179h;

        /* renamed from: i */
        public Rect f292180i;

        /* renamed from: j */
        public Rect f292181j;

        /* renamed from: n */
        public Rect f292182n;

        /* renamed from: o */
        public C7510m.C7513c f292183o = new C7510m.C7513c(0);

        /* renamed from: lw1.b$c$a */
        public static final class C99689a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C99688c f292184d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99689a(C99688c cVar) {
                super(0);
                this.f292184d = cVar;
            }

            public Object invoke() {
                C99688c cVar = this.f292184d;
                cVar.f292176e.invoke(Boolean.valueOf(cVar.f292183o.f25773a == 0), this.f292184d.f292183o);
                return C13598b0.f38549a;
            }
        }

        public C99688c(C99685b bVar, C99684a<String, C7510m.C7513c> aVar, int i, C32227p<? super Boolean, ? super C7510m.C7513c, C13598b0> pVar) {
            C87412m.m108594g(aVar, "generate");
            C87412m.m108594g(pVar, "callback");
            this.f292175d = aVar;
            this.f292176e = pVar;
        }

        public void run() {
            C99689a aVar;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                C99684a<String, C7510m.C7513c> aVar2 = this.f292175d;
                String str = this.f292177f;
                if (str != null) {
                    int i = this.f292178g;
                    Matrix matrix = this.f292179h;
                    if (matrix != null) {
                        Rect rect = this.f292180i;
                        if (rect != null) {
                            Rect rect2 = this.f292182n;
                            if (rect2 != null) {
                                Rect rect3 = this.f292181j;
                                if (rect3 != null) {
                                    this.f292183o = aVar2.mo139054a(str, i, matrix, rect, rect2, rect3);
                                    Log.m105924i("MediaTailor", "generate image cost: " + (System.currentTimeMillis() - currentTimeMillis));
                                    this.f292183o.getClass();
                                    aVar = new C99689a(this);
                                    C61926c.m72668M(aVar);
                                    return;
                                }
                                C87412m.m108603p("viewRect");
                                throw null;
                            }
                            C87412m.m108603p("contentRect");
                            throw null;
                        }
                        C87412m.m108603p("clipRect");
                        throw null;
                    }
                    C87412m.m108603p("matrix");
                    throw null;
                }
                C87412m.m108603p("input");
                throw null;
            } catch (Exception e) {
                this.f292183o.f25773a = -1;
                Log.printErrStackTrace("MediaTailor", e, "", new Object[0]);
                this.f292183o.getClass();
                aVar = new C99689a(this);
            } catch (Error e2) {
                this.f292183o.f25773a = -1;
                Log.printErrStackTrace("MediaTailor", e2, "", new Object[0]);
                this.f292183o.getClass();
                aVar = new C99689a(this);
            } catch (Throwable th) {
                this.f292183o.getClass();
                C61926c.m72668M(new C99689a(this));
                throw th;
            }
        }
    }

    /* renamed from: lw1.b$d */
    public static final class C99690d implements C99684a<String, C7510m.C7513c> {

        /* renamed from: a */
        public final C7510m.C7512a f292185a;

        /* renamed from: b */
        public int f292186b;

        /* renamed from: c */
        public int f292187c;

        public C99690d(C7510m.C7512a aVar) {
            C87412m.m108594g(aVar, "config");
            this.f292185a = aVar;
        }

        /* renamed from: b */
        public final Rect mo139057b(int i, int i2, Rect rect) {
            if (rect.left < 0) {
                rect.left = 0;
            }
            if (rect.top < 0) {
                rect.top = 0;
            }
            if (rect.bottom < 0) {
                rect.bottom = 0;
            }
            if (rect.right < 0) {
                rect.right = 0;
            }
            if (rect.bottom > i2) {
                rect.bottom = i2;
            }
            if (rect.right > i) {
                rect.right = i;
            }
            return rect;
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x04bd  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x04bf  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x04e7  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x022a  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0283  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0288  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0382  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x04b4  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p143ds.C7510m.C7513c mo139054a(java.lang.String r40, int r41, android.graphics.Matrix r42, android.graphics.Rect r43, android.graphics.Rect r44, android.graphics.Rect r45) {
            /*
                r39 = this;
                r7 = r39
                r8 = r40
                r9 = r42
                r10 = r43
                r11 = r44
                java.lang.String r0 = "input"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "matrix"
                gy3.C87412m.m108594g(r9, r0)
                java.lang.String r0 = "clipRect"
                gy3.C87412m.m108594g(r10, r0)
                java.lang.String r0 = "contentRect"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.String r0 = "viewRect"
                r1 = r45
                gy3.C87412m.m108594g(r1, r0)
                java.lang.String r12 = "MediaTailor"
                nj.g$a r0 = new nj.g$a
                r0.<init>()
                r0.mo72289b()
                int r0 = r44.width()
                java.lang.String r13 = ""
                if (r0 == 0) goto L_0x05b1
                int r0 = r44.height()
                if (r0 == 0) goto L_0x05b1
                int r0 = r43.width()
                if (r0 == 0) goto L_0x05b1
                int r0 = r43.height()
                if (r0 != 0) goto L_0x004d
                goto L_0x05b1
            L_0x004d:
                r15 = 9
                float[] r0 = new float[r15]
                r9.getValues(r0)
                r16 = 0
                r17 = 0
                r18 = 1065353216(0x3f800000, float:1.0)
                r19 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
                r21 = 1127481344(0x43340000, float:180.0)
                r5 = 1
                r4 = 0
                java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r8, r4)     // Catch:{ IOException -> 0x01ea }
                gy3.C87412m.m108591d(r1)     // Catch:{ IOException -> 0x01ea }
                android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r1, r4)     // Catch:{ IOException -> 0x01ea }
                java.lang.String r2 = "newInstance(vfsPath, false)"
                gy3.C87412m.m108593f(r3, r2)     // Catch:{ IOException -> 0x01ea }
                com.tencent.mm.compatible.util.Exif r1 = com.tencent.p014mm.compatible.util.Exif.fromFile(r1)     // Catch:{ IOException -> 0x01ea }
                int r1 = r1.getOrientationInDegree()     // Catch:{ IOException -> 0x01ea }
                float r2 = (float) r1     // Catch:{ IOException -> 0x01ea }
                r1 = r0[r5]     // Catch:{ IOException -> 0x01ea }
                double r5 = (double) r1     // Catch:{ IOException -> 0x01ea }
                r0 = r0[r4]     // Catch:{ IOException -> 0x01ea }
                double r0 = (double) r0     // Catch:{ IOException -> 0x01ea }
                double r0 = java.lang.Math.atan2(r5, r0)     // Catch:{ IOException -> 0x01ea }
                double r0 = r0 * r19
                long r0 = java.lang.Math.round(r0)     // Catch:{ IOException -> 0x01ea }
                float r0 = (float) r0     // Catch:{ IOException -> 0x01ea }
                float r22 = r0 - r2
                float r1 = r22 % r21
                int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
                if (r1 != 0) goto L_0x0098
                r1 = 1
                goto L_0x0099
            L_0x0098:
                r1 = 0
            L_0x0099:
                if (r1 != 0) goto L_0x00a4
                int r1 = r3.getWidth()     // Catch:{ IOException -> 0x01ea }
                int r5 = r3.getHeight()     // Catch:{ IOException -> 0x01ea }
                goto L_0x00ac
            L_0x00a4:
                int r1 = r3.getHeight()     // Catch:{ IOException -> 0x01ea }
                int r5 = r3.getWidth()     // Catch:{ IOException -> 0x01ea }
            L_0x00ac:
                r6 = r5
                r5 = r1
                float r1 = (float) r5     // Catch:{ IOException -> 0x01ea }
                float r1 = r1 * r18
                int r4 = r44.height()     // Catch:{ IOException -> 0x01ea }
                float r4 = (float) r4     // Catch:{ IOException -> 0x01ea }
                float r4 = r1 / r4
                int r14 = r10.left     // Catch:{ IOException -> 0x01ea }
                int r15 = r11.left     // Catch:{ IOException -> 0x01ea }
                int r14 = r14 - r15
                float r14 = (float) r14     // Catch:{ IOException -> 0x01ea }
                float r14 = r14 * r18
                int r15 = r44.width()     // Catch:{ IOException -> 0x01ea }
                float r15 = (float) r15     // Catch:{ IOException -> 0x01ea }
                float r14 = r14 / r15
                int r15 = r10.top     // Catch:{ IOException -> 0x01ea }
                r24 = r2
                int r2 = r11.top     // Catch:{ IOException -> 0x01ea }
                int r15 = r15 - r2
                float r2 = (float) r15     // Catch:{ IOException -> 0x01ea }
                float r2 = r2 * r18
                int r15 = r44.height()     // Catch:{ IOException -> 0x01ea }
                float r15 = (float) r15     // Catch:{ IOException -> 0x01ea }
                float r2 = r2 / r15
                float r15 = (float) r6     // Catch:{ IOException -> 0x01ea }
                float r15 = r15 * r18
                float r15 = r15 * r14
                float r14 = r1 * r2
                int r1 = r43.width()     // Catch:{ IOException -> 0x01ea }
                float r1 = (float) r1     // Catch:{ IOException -> 0x01ea }
                float r1 = r1 * r4
                float r25 = r15 + r1
                int r1 = r43.height()     // Catch:{ IOException -> 0x01ea }
                float r1 = (float) r1
                float r4 = r4 * r1
                float r26 = r14 + r4
                r1 = r39
                r2 = r15
                r4 = r3
                r3 = r14
                r23 = r4
                r27 = r13
                r13 = 0
                r4 = r6
                r29 = r5
                r30 = r6
                r6 = r22
                android.graphics.Point r6 = r1.mo139059d(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x01e8 }
                r1 = r39
                r2 = r25
                r3 = r26
                r4 = r30
                r5 = r29
                r13 = r6
                r6 = r22
                android.graphics.Point r1 = r1.mo139059d(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x01e8 }
                android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ IOException -> 0x01e8 }
                int r3 = r13.x     // Catch:{ IOException -> 0x01e8 }
                int r4 = r1.x     // Catch:{ IOException -> 0x01e8 }
                int r3 = java.lang.Math.min(r3, r4)     // Catch:{ IOException -> 0x01e8 }
                int r4 = r13.y     // Catch:{ IOException -> 0x01e8 }
                int r5 = r1.y     // Catch:{ IOException -> 0x01e8 }
                int r4 = java.lang.Math.min(r4, r5)     // Catch:{ IOException -> 0x01e8 }
                int r5 = r13.x     // Catch:{ IOException -> 0x01e8 }
                int r6 = r1.x     // Catch:{ IOException -> 0x01e8 }
                int r5 = java.lang.Math.max(r5, r6)     // Catch:{ IOException -> 0x01e8 }
                int r6 = r13.y     // Catch:{ IOException -> 0x01e8 }
                int r1 = r1.y     // Catch:{ IOException -> 0x01e8 }
                int r1 = java.lang.Math.max(r6, r1)     // Catch:{ IOException -> 0x01e8 }
                r2.<init>(r3, r4, r5, r1)     // Catch:{ IOException -> 0x01e8 }
                int r1 = r2.width()     // Catch:{ IOException -> 0x01e8 }
                r7.f292186b = r1     // Catch:{ IOException -> 0x01e8 }
                int r1 = r2.height()     // Catch:{ IOException -> 0x01e8 }
                r7.f292187c = r1     // Catch:{ IOException -> 0x01e8 }
                int r1 = r23.getWidth()     // Catch:{ IOException -> 0x01e8 }
                int r3 = r23.getHeight()     // Catch:{ IOException -> 0x01e8 }
                r7.mo139057b(r1, r3, r2)     // Catch:{ IOException -> 0x01e8 }
                android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x01e8 }
                r1.<init>()     // Catch:{ IOException -> 0x01e8 }
                float r3 = r25 - r15
                int r3 = (int) r3     // Catch:{ IOException -> 0x01e8 }
                float r4 = r26 - r14
                int r4 = (int) r4     // Catch:{ IOException -> 0x01e8 }
                ds.m$a r5 = r7.f292185a     // Catch:{ IOException -> 0x01e8 }
                int r6 = r5.f25770e     // Catch:{ IOException -> 0x01e8 }
                int r5 = r5.f25769d     // Catch:{ IOException -> 0x01e8 }
                float r3 = (float) r3     // Catch:{ IOException -> 0x01e8 }
                float r6 = (float) r6     // Catch:{ IOException -> 0x01e8 }
                float r3 = r3 / r6
                float r4 = (float) r4     // Catch:{ IOException -> 0x01e8 }
                float r5 = (float) r5     // Catch:{ IOException -> 0x01e8 }
                float r4 = r4 / r5
                float r3 = java.lang.Math.max(r3, r4)     // Catch:{ IOException -> 0x01e8 }
                int r4 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
                if (r4 <= 0) goto L_0x0172
                int r5 = (int) r3     // Catch:{ IOException -> 0x01e8 }
                goto L_0x0173
            L_0x0172:
                r5 = 1
            L_0x0173:
                r1.inSampleSize = r5     // Catch:{ IOException -> 0x01e8 }
                rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ IOException -> 0x01e8 }
                r3 = r23
                android.graphics.Bitmap r1 = r3.decodeRegion(r2, r1)     // Catch:{ IOException -> 0x01e8 }
                if (r1 == 0) goto L_0x01dd
                int r2 = r1.getHeight()     // Catch:{ IOException -> 0x01e8 }
                float r2 = (float) r2     // Catch:{ IOException -> 0x01e8 }
                int r4 = r1.getWidth()     // Catch:{ IOException -> 0x01e8 }
                float r4 = (float) r4     // Catch:{ IOException -> 0x01e8 }
                float r2 = r2 / r4
                ds.m$a r4 = r7.f292185a     // Catch:{ IOException -> 0x01e8 }
                int r5 = r4.f25769d     // Catch:{ IOException -> 0x01e8 }
                float r5 = (float) r5     // Catch:{ IOException -> 0x01e8 }
                int r4 = r4.f25770e     // Catch:{ IOException -> 0x01e8 }
                float r4 = (float) r4     // Catch:{ IOException -> 0x01e8 }
                float r5 = r5 / r4
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 < 0) goto L_0x01b1
                int r4 = r1.getHeight()     // Catch:{ IOException -> 0x01e8 }
                ds.m$a r6 = r7.f292185a     // Catch:{ IOException -> 0x01e8 }
                int r6 = r6.f25769d     // Catch:{ IOException -> 0x01e8 }
                if (r4 <= r6) goto L_0x01b1
                float r4 = (float) r6     // Catch:{ IOException -> 0x01e8 }
                float r4 = r4 / r2
                int r2 = iy3.C60641c.m70921b(r4)     // Catch:{ IOException -> 0x01e8 }
                ds.m$a r4 = r7.f292185a     // Catch:{ IOException -> 0x01e8 }
                int r4 = r4.f25769d     // Catch:{ IOException -> 0x01e8 }
                r5 = 0
                android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r2, r4, r5)     // Catch:{ IOException -> 0x01e8 }
                goto L_0x01cb
            L_0x01b1:
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x01cb
                int r4 = r1.getWidth()     // Catch:{ IOException -> 0x01e8 }
                ds.m$a r5 = r7.f292185a     // Catch:{ IOException -> 0x01e8 }
                int r5 = r5.f25770e     // Catch:{ IOException -> 0x01e8 }
                if (r4 <= r5) goto L_0x01cb
                float r4 = (float) r5     // Catch:{ IOException -> 0x01e8 }
                float r4 = r4 * r2
                int r2 = iy3.C60641c.m70921b(r4)     // Catch:{ IOException -> 0x01e8 }
                r4 = 0
                android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r5, r2, r4)     // Catch:{ IOException -> 0x01e8 }
            L_0x01cb:
                if (r1 == 0) goto L_0x01dd
                float r2 = r24 - r0
                int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r0 != 0) goto L_0x01d5
                r5 = 1
                goto L_0x01d6
            L_0x01d5:
                r5 = 0
            L_0x01d6:
                if (r5 != 0) goto L_0x01df
                android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r2)     // Catch:{ IOException -> 0x01e8 }
                goto L_0x01df
            L_0x01dd:
                r1 = r17
            L_0x01df:
                r3.recycle()     // Catch:{ IOException -> 0x01e8 }
                r0 = r1
                r9 = 58
                r13 = 1
                goto L_0x0364
            L_0x01e8:
                r0 = move-exception
                goto L_0x01ed
            L_0x01ea:
                r0 = move-exception
                r27 = r13
            L_0x01ed:
                java.lang.String r0 = r0.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                r1 = 9
                float[] r0 = new float[r1]
                r9.getValues(r0)
                android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
                r1.<init>()
                r13 = 1
                r1.inJustDecodeBounds = r13
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r8, r1)
                r9.getValues(r0)
                r2 = r0[r13]
                double r2 = (double) r2
                r4 = 0
                r0 = r0[r4]
                double r4 = (double) r0
                double r2 = java.lang.Math.atan2(r2, r4)
                double r2 = r2 * r19
                long r2 = java.lang.Math.round(r2)
                float r0 = (float) r2
                com.tencent.mm.compatible.util.Exif r2 = com.tencent.p014mm.compatible.util.Exif.fromFile(r40)
                int r2 = r2.getOrientationInDegree()
                float r2 = (float) r2
                float r3 = r2 % r21
                int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
                if (r3 != 0) goto L_0x022c
                r5 = 1
                goto L_0x022d
            L_0x022c:
                r5 = 0
            L_0x022d:
                if (r5 != 0) goto L_0x0237
                int r3 = r1.outHeight
                int r4 = r1.outWidth
                r1.outHeight = r4
                r1.outWidth = r3
            L_0x0237:
                lw1.b$a r32 = lw1.C99685b.f292170e
                ds.m$a r3 = r7.f292185a
                int r4 = r3.f25770e
                int r3 = r3.f25769d
                r36 = 0
                java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106423E(r40)
                java.lang.String r6 = "openRead(inputPath)"
                gy3.C87412m.m108593f(r5, r6)
                r37 = 1
                r38 = 0
                r33 = r5
                r34 = r4
                r35 = r3
                android.graphics.Bitmap r3 = r32.mo139055a(r33, r34, r35, r36, r37, r38)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "rawRotate="
                r4.append(r5)
                r4.append(r2)
                java.lang.String r5 = " cropRotation="
                r4.append(r5)
                r4.append(r0)
                java.lang.String r5 = " clipRect="
                r4.append(r5)
                r4.append(r10)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
                float r2 = r2 - r0
                int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r0 != 0) goto L_0x0285
                r5 = 1
                goto L_0x0286
            L_0x0285:
                r5 = 0
            L_0x0286:
                if (r5 != 0) goto L_0x0292
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r3, r2)
                java.lang.String r0 = "rotate(source, rawRotate - cropRotation)"
                gy3.C87412m.m108593f(r3, r0)
            L_0x0292:
                int r0 = r3.getHeight()
                float r0 = (float) r0
                float r0 = r0 * r18
                int r4 = r44.height()
                float r4 = (float) r4
                float r0 = r0 / r4
                int r4 = r10.left
                int r5 = r11.left
                int r4 = r4 - r5
                float r4 = (float) r4
                float r4 = r4 * r18
                int r5 = r44.width()
                float r5 = (float) r5
                float r4 = r4 / r5
                int r5 = r10.top
                int r6 = r11.top
                int r5 = r5 - r6
                float r5 = (float) r5
                float r5 = r5 * r18
                int r6 = r44.height()
                float r6 = (float) r6
                float r5 = r5 / r6
                int r6 = r3.getWidth()
                float r6 = (float) r6
                float r6 = r6 * r18
                float r6 = r6 * r4
                int r4 = r3.getHeight()
                float r4 = (float) r4
                float r4 = r4 * r18
                float r4 = r4 * r5
                int r5 = r43.width()
                float r5 = (float) r5
                float r5 = r5 * r0
                float r5 = r5 + r6
                int r9 = r43.height()
                float r9 = (float) r9
                float r9 = r9 * r0
                float r9 = r9 + r4
                int r11 = r3.getWidth()
                int r14 = r3.getHeight()
                android.graphics.Rect r15 = new android.graphics.Rect
                int r6 = iy3.C60641c.m70921b(r6)
                int r4 = iy3.C60641c.m70921b(r4)
                int r5 = iy3.C60641c.m70921b(r5)
                int r9 = iy3.C60641c.m70921b(r9)
                r15.<init>(r6, r4, r5, r9)
                r7.mo139057b(r11, r14, r15)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "clipScale="
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = " clipRect=["
                r4.append(r0)
                r4.append(r15)
                java.lang.String r0 = " -> "
                r4.append(r0)
                r4.append(r10)
                java.lang.String r0 = "] raw=["
                r4.append(r0)
                int r0 = r1.outWidth
                r4.append(r0)
                r9 = 58
                r4.append(r9)
                int r0 = r1.outHeight
                r4.append(r0)
                java.lang.String r0 = "] source=["
                r4.append(r0)
                int r0 = r3.getWidth()
                r4.append(r0)
                r4.append(r9)
                int r0 = r3.getHeight()
                r4.append(r0)
                java.lang.String r0 = "] rotate="
                r4.append(r0)
                r4.append(r2)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                int r0 = r15.left
                int r1 = r15.top
                int r2 = r15.width()
                int r4 = r15.height()
                android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r3, r0, r1, r2, r4)
                r0 = r1
            L_0x0364:
                java.lang.String r1 = "/"
                java.lang.String[] r2 = new java.lang.String[]{r1}
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r40
                java.util.List r1 = z04.C112550d0.m153785U(r1, r2, r3, r4, r5, r6)
                java.lang.Object r1 = sx3.C110818d0.m150923U(r1)
                java.lang.String r1 = (java.lang.String) r1
                ds.m$c r2 = new ds.m$c
                r3 = 0
                r2.<init>(r3)
                if (r0 == 0) goto L_0x04b4
                ds.m$a r3 = r7.f292185a
                r3.getClass()
                boolean r3 = gy3.C87412m.m108589b(r0, r0)
                if (r3 != 0) goto L_0x0396
                boolean r3 = r0.isRecycled()
                if (r3 != 0) goto L_0x0396
                r0.recycle()
            L_0x0396:
                ds.m$a r3 = r7.f292185a
                java.lang.String r3 = r3.f25768c
                if (r3 != 0) goto L_0x03cd
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                ds.m$a r4 = r7.f292185a
                java.lang.String r4 = r4.f25766a
                r3.append(r4)
                ds.m$a r4 = r7.f292185a
                java.lang.String r4 = r4.f25767b
                if (r4 != 0) goto L_0x03c6
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                long r5 = android.os.SystemClock.currentThreadTimeMillis()
                r4.append(r5)
                r5 = 95
                r4.append(r5)
                r4.append(r1)
                java.lang.String r4 = r4.toString()
            L_0x03c6:
                r3.append(r4)
                java.lang.String r3 = r3.toString()
            L_0x03cd:
                ds.m$a r4 = r7.f292185a
                int r4 = r4.f25771f
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
                r6 = 0
                boolean r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r4, r5, r3, r6)
                r6 = r5
                r5 = 0
            L_0x03da:
                ds.m$a r11 = r7.f292185a
                int r11 = r11.f25772g
                if (r11 <= 0) goto L_0x03ff
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
                ds.m$a r11 = r7.f292185a
                int r11 = r11.f25772g
                long r9 = (long) r11
                int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x03ff
                if (r4 <= 0) goto L_0x03ff
                int r4 = r4 + -5
                android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG
                r9 = 0
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r4, r6, r3, r9)
                int r5 = r5 + 1
                r10 = r43
                r9 = 58
                goto L_0x03da
            L_0x03ff:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "save bitmap ret="
                r9.append(r10)
                r9.append(r6)
                java.lang.String r10 = " dest["
                r9.append(r10)
                int r10 = r0.getWidth()
                r9.append(r10)
                r10 = 58
                r9.append(r10)
                int r10 = r0.getHeight()
                r9.append(r10)
                java.lang.String r10 = "] maxFileLength="
                r9.append(r10)
                ds.m$a r10 = r7.f292185a
                int r10 = r10.f25772g
                r9.append(r10)
                java.lang.String r10 = " tryCount="
                r9.append(r10)
                r9.append(r5)
                java.lang.String r5 = " compressQuality="
                r9.append(r5)
                r9.append(r4)
                java.lang.String r5 = " isCircle="
                r9.append(r5)
                ds.m$a r5 = r7.f292185a
                r5.getClass()
                r5 = 0
                r9.append(r5)
                java.lang.String r10 = " size="
                r9.append(r10)
                long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r10)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
                int r9 = r7.f292186b
                if (r9 == 0) goto L_0x046e
                int r9 = r7.f292187c
                if (r9 != 0) goto L_0x047a
            L_0x046e:
                int r9 = r0.getWidth()
                r7.f292186b = r9
                int r9 = r0.getHeight()
                r7.f292187c = r9
            L_0x047a:
                java.lang.Class<h81.h> r9 = h81.C32735h.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                h81.h r9 = (h81.C32735h) r9
                h81.h$c r10 = h81.C32735h.C32737c.clicfg_finder_report_quality_info
                int r9 = r9.mo58779Qe(r10, r13)
                if (r9 != r13) goto L_0x049f
                int r9 = r7.f292186b
                int r10 = r7.f292187c
                int r11 = r0.getWidth()
                int r13 = r0.getHeight()
                float r4 = (float) r4
                r14 = 1120403456(0x42c80000, float:100.0)
                float r4 = r4 / r14
                int r4 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119558d(r9, r10, r11, r13, r4)
                goto L_0x04a0
            L_0x049f:
                r4 = 0
            L_0x04a0:
                r2.f25775c = r4
                boolean r4 = r0.isRecycled()
                if (r4 != 0) goto L_0x04ab
                r0.recycle()
            L_0x04ab:
                if (r6 == 0) goto L_0x04af
                r17 = r3
            L_0x04af:
                if (r17 == 0) goto L_0x04b5
                r0 = r17
                goto L_0x04b7
            L_0x04b4:
                r5 = 0
            L_0x04b5:
                r0 = r27
            L_0x04b7:
                boolean r3 = android.text.TextUtils.isEmpty(r0)
                if (r3 != 0) goto L_0x04bf
                r14 = 0
                goto L_0x04c0
            L_0x04bf:
                r14 = -1
            L_0x04c0:
                r2.f25773a = r14
                th2.d r3 = th2.C110992d.f332425a
                java.lang.String r3 = "KEY_IMAGE_QUALITY_INT_ARRAY"
                int r4 = r2.f25775c
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r5 = th2.C110992d.f332426b
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.lang.Object r5 = r5.mo129811b(r3, r6)
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5.add(r4)
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r4 = th2.C110992d.f332426b
                r4.mo129812c(r3, r5)
                r2.f25774b = r0
                int r3 = r2.f25773a
                if (r3 != 0) goto L_0x05b0
                lw1.c r3 = lw1.C99692c.f292189a
                r3.mo139060a(r8, r0)
                ds.m$a r3 = r7.f292185a
                r3.getClass()
                r3 = 480(0x1e0, float:6.73E-43)
                float r3 = (float) r3
                float r3 = r3 * r18
                int r4 = r43.height()
                float r4 = (float) r4
                float r4 = r3 / r4
                ds.m$a r5 = r7.f292185a
                r5.getClass()
                int r5 = r43.width()
                float r5 = (float) r5
                float r3 = r3 / r5
                float r3 = java.lang.Math.max(r4, r3)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                ds.m$a r5 = r7.f292185a
                java.lang.String r5 = r5.f25766a
                r4.append(r5)
                ds.m$a r5 = r7.f292185a
                java.lang.String r5 = r5.f25767b
                if (r5 != 0) goto L_0x0537
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                long r8 = android.os.SystemClock.currentThreadTimeMillis()
                r5.append(r8)
                java.lang.String r6 = "_thumb_"
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                goto L_0x054d
            L_0x0537:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "thumb_"
                r1.append(r5)
                ds.m$a r5 = r7.f292185a
                java.lang.String r5 = r5.f25767b
                r1.append(r5)
                java.lang.String r1 = r1.toString()
            L_0x054d:
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                java.lang.String r4 = "<set-?>"
                gy3.C87412m.m108594g(r1, r4)
                int r4 = r43.height()
                float r4 = (float) r4
                float r4 = r4 * r3
                int r29 = iy3.C60641c.m70921b(r4)
                int r4 = r43.width()
                float r4 = (float) r4
                float r4 = r4 * r3
                int r30 = iy3.C60641c.m70921b(r4)
                android.graphics.Bitmap$CompressFormat r31 = android.graphics.Bitmap.CompressFormat.JPEG
                ds.m$a r4 = r7.f292185a
                int r4 = r4.f25771f
                r28 = r0
                r32 = r4
                r33 = r1
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail(r28, r29, r30, r31, r32, r33)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "createThumbNail: "
                r0.append(r1)
                int r1 = r43.height()
                float r1 = (float) r1
                float r1 = r1 * r3
                int r1 = iy3.C60641c.m70921b(r1)
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                int r1 = r43.width()
                float r1 = (float) r1
                float r1 = r1 * r3
                int r1 = iy3.C60641c.m70921b(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            L_0x05b0:
                return r2
            L_0x05b1:
                r27 = r13
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Rect width or height contains zero. contentRect: "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r1 = " clipRect: "
                r0.append(r1)
                r1 = r43
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                ds.m$c r0 = new ds.m$c
                r1 = -1
                r0.<init>(r1)
                r1 = r27
                r0.f25774b = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lw1.C99685b.C99690d.mo139054a(java.lang.String, int, android.graphics.Matrix, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):ds.m$c");
        }

        /* renamed from: d */
        public final Point mo139059d(float f, float f2, int i, int i2, float f3) {
            float f4 = ((float) i) / 2.0f;
            float f5 = ((float) i2) / 2.0f;
            double d = ((double) (f3 / 180.0f)) * 3.141592653589793d;
            double sin = Math.sin(d);
            double cos = Math.cos(d);
            double d2 = (double) (f - f4);
            double d3 = (double) (f2 - f5);
            Float valueOf = Float.valueOf((float) ((d2 * cos) - (d3 * sin)));
            Float valueOf2 = Float.valueOf((float) ((d2 * sin) + (d3 * cos)));
            return !(((f3 % 180.0f) > 0.0f ? 1 : ((f3 % 180.0f) == 0.0f ? 0 : -1)) == 0) ? new Point(C60641c.m70921b(valueOf.floatValue() + f5), C60641c.m70921b(valueOf2.floatValue() + f4)) : new Point(C60641c.m70921b(valueOf.floatValue() + f4), C60641c.m70921b(valueOf2.floatValue() + f5));
        }
    }

    /* renamed from: lw1.b$e */
    public static final class C99691e implements C103084e {

        /* renamed from: a */
        public static final C99691e f292188a = new C99691e();

        /* renamed from: a */
        public final void mo125763a(Runnable runnable, C119143b bVar) {
        }
    }

    public C99685b(C7510m.C7512a aVar) {
        C87412m.m108594g(aVar, "config");
        this.f292171a = new C99690d(aVar);
        this.f292172b = new C99687b(aVar);
        this.f292173c = new C99687b(aVar);
    }

    /* renamed from: a */
    public void mo8635a(String str, int i, Matrix matrix, Rect rect, Rect rect2, Rect rect3, int i2, boolean z, C32227p<? super Boolean, ? super C7510m.C7513c, C13598b0> pVar) {
        C87412m.m108594g(str, "input");
        C87412m.m108594g(matrix, "matrix");
        C87412m.m108594g(rect, "clipRect");
        C87412m.m108594g(rect2, "contentRect");
        C87412m.m108594g(rect3, "viewRect");
        C87412m.m108594g(pVar, "callback");
        C99688c cVar = z ? new C99688c(this, this.f292173c, i2, pVar) : i == 1 ? new C99688c(this, this.f292171a, i2, pVar) : new C99688c(this, this.f292172b, i2, pVar);
        cVar.f292180i = rect;
        cVar.f292181j = rect3;
        cVar.f292182n = rect2;
        cVar.f292177f = str;
        cVar.f292179h = matrix;
        cVar.f292178g = i;
        this.f292174d.execute(cVar);
    }
}
