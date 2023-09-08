package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.core.utils.cache.MemoryCache;
import com.tencent.mapsdk.internal.C113846jl;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mapsdk.internal.ha */
public final class C104548ha {

    /* renamed from: a */
    public static Paint f309919a = null;

    /* renamed from: b */
    public static C104549a f309920b = null;

    /* renamed from: c */
    private static final int f309921c = 2048;

    /* renamed from: d */
    private static final String f309922d = "BitmapUtil";

    /* renamed from: e */
    private static byte[] f309923e;

    /* renamed from: com.tencent.mapsdk.internal.ha$a */
    public static class C104549a {

        /* renamed from: b */
        private static final AtomicInteger f309924b = new AtomicInteger();
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final MemoryCache<C113863ju> f309925a;

        public C104549a(Context context, int i) {
            File c = C113959ml.m157965a(context, (TencentMapOptions) null).mo172405c();
            if (C80343jx.m97837a("4.5.12.4", "4.4.6")) {
                C113884kf.m157490a(new File(c, "BitmapDescriptorCache"), new File(c, "bitmaps"));
            }
            MemoryCache.C113493a aVar = new MemoryCache.C113493a();
            aVar.f339610b = i;
            aVar.f339611c = new C113846jl.C113848b<C113863ju>() {
                /* renamed from: a */
                public final /* synthetic */ boolean mo147866a(Object obj) {
                    C113863ju juVar = (C113863ju) obj;
                    if (juVar == null) {
                        return true;
                    }
                    String str = juVar.f340648f;
                    if (!juVar.mo172248f() || str == null) {
                        return true;
                    }
                    C104549a.this.f309925a.mo170952a(str);
                    return true;
                }

                /* renamed from: a */
                private boolean m139970a(C113863ju juVar) {
                    if (juVar == null) {
                        return true;
                    }
                    String str = juVar.f340648f;
                    if (!juVar.mo172248f() || str == null) {
                        return true;
                    }
                    C104549a.this.f309925a.mo170952a(str);
                    return true;
                }
            };
            this.f309925a = (MemoryCache) C113853jp.m157303a(C113863ju.class, aVar);
            m139963a();
        }

        /* renamed from: b */
        public static int m139965b() {
            return f309924b.get();
        }

        /* renamed from: c */
        public final synchronized void mo147865c() {
            AtomicInteger atomicInteger = f309924b;
            if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() == 0) {
                this.f309925a.mo172241j();
            }
        }

        /* renamed from: a */
        public static void m139963a() {
            AtomicInteger atomicInteger = f309924b;
            if (atomicInteger.get() < 0) {
                atomicInteger.set(0);
            }
            atomicInteger.incrementAndGet();
        }

        /* renamed from: b */
        public final synchronized boolean mo147864b(String str) {
            C113863ju a = this.f309925a.mo170950a(str, C113863ju.class);
            if (a == null || !a.mo172248f()) {
                return false;
            }
            C113889km.m157545b(C0949kl.f2248r, "remove:" + str + " bitmapData:" + a);
            this.f309925a.mo170952a(str);
            return true;
        }

        /* renamed from: a */
        public final synchronized void mo147863a(String str, Bitmap bitmap) {
            m139964a(str, new C113863ju(bitmap));
        }

        /* renamed from: a */
        private synchronized void m139964a(String str, C113863ju juVar) {
            C113889km.m157545b(C0949kl.f2248r, "putCache:" + str + " id:" + juVar.f340648f + " bitmapData:" + juVar);
            C113863ju a = this.f309925a.mo170950a(str, C113863ju.class);
            if (a != null) {
                C113889km.m157545b(C0949kl.f2248r, "getCache:" + str + " id:" + a.f340648f + " recycle:" + a.mo172249g() + " bitmapData:" + a);
            }
            if (a == null || a.mo172249g() || TextUtils.isEmpty(a.f340648f) || !a.f340648f.equals(juVar.f340648f)) {
                this.f309925a.mo172239b(str, juVar);
                return;
            }
            C113889km.m157545b(C0949kl.f2248r, "same bitmap!!".concat(String.valueOf(str)));
            a.mo172247e();
        }

        /* renamed from: a */
        public final synchronized Bitmap mo147862a(String str) {
            C113863ju b = this.f309925a.mo172238b(str, C113863ju.class);
            if (b == null) {
                return null;
            }
            return b.mo172245c();
        }
    }

    static {
        Paint paint = new Paint();
        f309919a = paint;
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    private static Bitmap m139946a(int[] iArr, int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(iArr, i, i2, config);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m139952b(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            r1.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            com.tencent.mapsdk.internal.ml r2 = com.tencent.mapsdk.internal.C113959ml.m157965a((android.content.Context) r4, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) r0)     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            java.lang.String r2 = r2.mo172408e()     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            r1.append(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            r1.append(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            java.io.InputStream r1 = com.tencent.mapsdk.internal.C113886kg.m157521b((java.lang.String) r1)     // Catch:{ Exception | OutOfMemoryError -> 0x007b, all -> 0x0076 }
            if (r1 != 0) goto L_0x005d
            java.lang.String r2 = com.tencent.mapsdk.internal.C113956mi.m157946a()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            if (r2 == 0) goto L_0x003c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            r2.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.lang.String r3 = com.tencent.mapsdk.internal.C113956mi.m157946a()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            r2.append(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            r2.append(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.io.InputStream r1 = com.tencent.mapsdk.internal.C113956mi.m157952b((android.content.Context) r4, (java.lang.String) r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            goto L_0x005d
        L_0x003c:
            java.lang.String r2 = com.tencent.mapsdk.internal.C113956mi.m157953b()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            if (r2 == 0) goto L_0x005d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            r2.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.lang.String r3 = com.tencent.mapsdk.internal.C113956mi.m157953b()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            r2.append(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            r2.append(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.io.InputStream r1 = com.tencent.mapsdk.internal.C113886kg.m157521b((java.lang.String) r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r4 = move-exception
            r0 = r1
            goto L_0x0077
        L_0x005d:
            if (r1 != 0) goto L_0x006e
            java.lang.String r2 = "tencentmap/mapsdk_vector/"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.lang.String r5 = r2.concat(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            java.io.InputStream r4 = com.tencent.mapsdk.internal.C113956mi.m157952b((android.content.Context) r4, (java.lang.String) r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
            r1 = r4
        L_0x006e:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0072, all -> 0x005a }
        L_0x0072:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r1)
            goto L_0x007d
        L_0x0076:
            r4 = move-exception
        L_0x0077:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r0)
            throw r4
        L_0x007b:
            r1 = r0
            goto L_0x0072
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C104548ha.m139952b(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: c */
    private static byte[] m139957c(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                C113886kg.m157515a((Closeable) byteArrayOutputStream2);
                return byteArray;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                C113886kg.m157515a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            C113886kg.m157515a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: d */
    private static Bitmap m139958d(Bitmap bitmap) {
        Bitmap a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (bitmap.isRecycled() || width <= 0 || height <= 0 || (a = m139936a(width, height, Bitmap.Config.ARGB_8888)) == null) {
                return null;
            }
            a.setDensity(bitmap.getDensity());
            Canvas canvas = new Canvas(a);
            a.eraseColor(0);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, f309919a);
            return a;
        }
        return null;
    }

    /* renamed from: e */
    private static Bitmap m139959e(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            } catch (OutOfMemoryError unused) {
                try {
                    return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                } catch (OutOfMemoryError unused2) {
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Drawable m139960f(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    /* renamed from: g */
    private static Bitmap m139961g(Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m139950a() {
        Bitmap a;
        if (f309923e == null && (a = m139936a(256, 256, Bitmap.Config.ARGB_8888)) != null) {
            new Canvas(a).drawARGB(0, 255, 255, 255);
            f309923e = m139957c(a);
        }
        return f309923e;
    }

    /* renamed from: c */
    private static Bitmap m139956c(String str, int i) {
        Rect rect = new Rect();
        TextPaint textPaint = new TextPaint(65);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize((float) i);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, Math.round((float) rect.width()), Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        Bitmap a = m139936a(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        if (a == null) {
            return null;
        }
        Canvas canvas = new Canvas(a);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a;
    }

    /* renamed from: a */
    public static Bitmap m139943a(View view) {
        Bitmap bitmap;
        if (view != null) {
            try {
                synchronized (view) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    view.setDrawingCacheEnabled(true);
                    view.buildDrawingCache();
                    Bitmap drawingCache = view.getDrawingCache();
                    if (drawingCache != null) {
                        if (!drawingCache.isRecycled()) {
                            int width = drawingCache.getWidth();
                            int height = drawingCache.getHeight();
                            if (!drawingCache.isRecycled() && width > 0) {
                                if (height > 0) {
                                    bitmap = m139936a(width, height, Bitmap.Config.ARGB_8888);
                                    if (bitmap != null) {
                                        bitmap.setDensity(drawingCache.getDensity());
                                        Canvas canvas = new Canvas(bitmap);
                                        bitmap.eraseColor(0);
                                        canvas.drawBitmap(drawingCache, 0.0f, 0.0f, f309919a);
                                        view.destroyDrawingCache();
                                    }
                                }
                            }
                        }
                    }
                    bitmap = null;
                    view.destroyDrawingCache();
                }
                return bitmap;
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Bitmap m139953b(Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        try {
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) / C113798hb.m157078b()), (int) (((float) bitmap.getHeight()) / C113798hb.m157078b()), true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Bitmap m139954b(String str, int i) {
        Rect rect = new Rect();
        TextPaint textPaint = new TextPaint(65);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize((float) i);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, Math.round((float) rect.width()), Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        Bitmap a = m139936a(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        if (a == null) {
            return null;
        }
        Canvas canvas = new Canvas(a);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m139955c(android.content.Context r1, java.lang.String r2) {
        /*
            android.content.res.AssetManager r1 = r1.getAssets()
            r0 = 0
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ Exception -> 0x001b, OutOfMemoryError -> 0x0016, all -> 0x0011 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ Exception -> 0x001c, OutOfMemoryError -> 0x0017, all -> 0x000e }
            goto L_0x0017
        L_0x000e:
            r2 = move-exception
            r0 = r1
            goto L_0x0012
        L_0x0011:
            r2 = move-exception
        L_0x0012:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r0)
            throw r2
        L_0x0016:
            r1 = r0
        L_0x0017:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r1)
            return r0
        L_0x001b:
            r1 = r0
        L_0x001c:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C104548ha.m139955c(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static Bitmap m139940a(Bitmap bitmap, int i, int i2) {
        Bitmap a;
        if (bitmap == null || bitmap.isRecycled() || i <= 0 || i2 <= 0 || (a = m139936a(i, i2, Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        a.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(a);
        a.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, f309919a);
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r6 = java.lang.Math.min(r6, 2048);
        r7 = java.lang.Math.min(r7, 2048);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m139941a(android.graphics.Bitmap r4, android.content.Context r5, int r6, int r7) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x003a
            boolean r1 = r4.isRecycled()
            if (r1 != 0) goto L_0x003a
            if (r6 <= 0) goto L_0x003a
            if (r7 > 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r1 = 2048(0x800, float:2.87E-42)
            int r6 = java.lang.Math.min(r6, r1)
            int r7 = java.lang.Math.min(r7, r1)
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = m139936a((int) r6, (int) r7, (android.graphics.Bitmap.Config) r1)
            if (r1 != 0) goto L_0x0021
            return r0
        L_0x0021:
            r0 = 0
            r1.eraseColor(r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r5.getResources()
            r3.<init>(r5, r4)
            r3.setBounds(r0, r0, r6, r7)
            r3.draw(r2)
            return r1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C104548ha.m139941a(android.graphics.Bitmap, android.content.Context, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static String m139947a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getAllocationByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        sb.append("@");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("@");
        sb.append(Util.getMD5String(allocate.array()));
        allocate.clear();
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m139949a(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        FileOutputStream fileOutputStream;
        if (bitmap != null && !bitmap.isRecycled() && !TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Exception unused) {
                C113886kg.m157515a((Closeable) fileOutputStream2);
                return false;
            } catch (Throwable th) {
                th = th;
                C113886kg.m157515a((Closeable) fileOutputStream2);
                throw th;
            }
            try {
                bitmap.compress(compressFormat, 100, fileOutputStream);
                C113886kg.m157515a((Closeable) fileOutputStream);
                return true;
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                C113886kg.m157515a((Closeable) fileOutputStream2);
                return false;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = fileOutputStream;
                C113886kg.m157515a((Closeable) fileOutputStream2);
                throw th;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m139948a(Bitmap bitmap, String str) {
        return m139949a(bitmap, str, Bitmap.CompressFormat.PNG);
    }

    /* renamed from: a */
    private static Bitmap m139942a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (!(drawable instanceof NinePatchDrawable)) {
            return null;
        }
        Bitmap a = m139936a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        if (a == null) {
            return null;
        }
        Canvas canvas = new Canvas(a);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:2|3|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return android.graphics.Bitmap.createBitmap(r0, r1, r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m139936a(int r0, int r1, android.graphics.Bitmap.Config r2) {
        /*
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x000a }
        L_0x0009:
            return r0
        L_0x000a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C104548ha.m139936a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static Bitmap m139939a(Bitmap bitmap, float f) {
        if (bitmap == null || f == 1.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: a */
    private static byte[] m139951a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r4 != null) goto L_0x0050;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[SYNTHETIC, Splitter:B:19:0x005a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m139938a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0062
            java.lang.String r1 = r4.trim()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            if (r1 != 0) goto L_0x000e
            goto L_0x0062
        L_0x000e:
            java.lang.String r1 = r4.trim()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r2 = 0
            char r1 = r1.charAt(r2)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r2 = 47
            if (r1 == r2) goto L_0x0034
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r1.append(r3)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r1.append(r4)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            goto L_0x0047
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r1.append(r3)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r1.append(r4)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
        L_0x0047:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ Exception -> 0x005f, all -> 0x0054 }
        L_0x0050:
            r4.close()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0062
        L_0x0054:
            r3 = move-exception
            r0 = r4
            goto L_0x0058
        L_0x0057:
            r3 = move-exception
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r3
        L_0x005e:
            r4 = r0
        L_0x005f:
            if (r4 == 0) goto L_0x0062
            goto L_0x0050
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C104548ha.m139938a(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static final Bitmap m139944a(String str) {
        try {
            return BitmapFactory.decodeFile(str);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m139937a(Context context, int i) {
        try {
            return BitmapFactory.decodeResource(context.getResources(), i);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m139945a(String str, int i) {
        Rect rect = new Rect();
        TextPaint textPaint = new TextPaint(65);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize((float) i);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, Math.round((float) rect.width()), Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        Bitmap a = m139936a(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        if (a == null) {
            return null;
        }
        Canvas canvas = new Canvas(a);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a;
    }
}
