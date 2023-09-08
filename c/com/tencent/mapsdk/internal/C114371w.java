package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.tencent.mapsdk.engine.jni.models.IconImageInfo;
import com.tencent.mapsdk.internal.C113961mq;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.w */
public final class C114371w {

    /* renamed from: f */
    private static final int f342824f = -16711681;

    /* renamed from: g */
    private static final int f342825g = 16711680;

    /* renamed from: h */
    private static final int f342826h = -256;

    /* renamed from: i */
    private static final int f342827i = 255;

    /* renamed from: a */
    public C113536be f342828a;

    /* renamed from: b */
    public C114009oc f342829b;

    /* renamed from: c */
    public float f342830c = 1.0f;

    /* renamed from: d */
    public Lock f342831d = new ReentrantLock();

    /* renamed from: e */
    public Lock f342832e = new ReentrantLock();

    /* renamed from: j */
    private WeakReference<Context> f342833j;

    /* renamed from: k */
    private C114005ny f342834k;

    /* renamed from: l */
    private C113792gv f342835l;

    public C114371w(Context context, C113536be beVar, C114009oc ocVar, C114005ny nyVar) {
        this.f342833j = new WeakReference<>(context);
        this.f342828a = beVar;
        this.f342829b = ocVar;
        this.f342834k = nyVar;
        this.f342830c = C113801hf.m157135a(context);
        if (beVar.mo171634b() != null) {
            this.f342835l = ((C114322sx) beVar.mo171634b()).f342647aD.f339861d;
        }
    }

    /* renamed from: a */
    private static int m160592a(int i) {
        return (i & f342824f & f342826h) | ((i & 255) << 16) | ((f342825g & i) >> 16);
    }

    /* renamed from: b */
    private IconImageInfo m160595b(String str) {
        IconImageInfo iconImageInfo = new IconImageInfo();
        iconImageInfo.scale = this.f342830c;
        iconImageInfo.anchorPointX1 = 0.5f;
        iconImageInfo.anchorPointY1 = 0.5f;
        iconImageInfo.bitmap = mo173078a(str, Bitmap.Config.RGB_565);
        return iconImageInfo;
    }

    /* renamed from: d */
    private C113536be m160598d() {
        return this.f342828a;
    }

    /* renamed from: a */
    public final IconImageInfo mo173079a(String str) {
        C113792gv gvVar;
        C113792gv gvVar2;
        C113792gv gvVar3;
        String[] split;
        Bitmap bitmap = null;
        if (this.f342834k == null) {
            return null;
        }
        IconImageInfo iconImageInfo = new IconImageInfo();
        iconImageInfo.anchorPointX1 = 0.5f;
        iconImageInfo.anchorPointY1 = 0.5f;
        if (str.startsWith("drawRoundRect")) {
            iconImageInfo.scale = 1.0f;
            String substring = str.substring(14);
            if (!C40002he.m42805a(substring) && (split = substring.split(", ")) != null && split.length >= 5) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                long parseLong = Long.parseLong(split[2]);
                long parseLong2 = Long.parseLong(split[3]);
                float parseFloat = Float.parseFloat(split[4]);
                if (parseInt >= 0 && parseInt2 >= 0) {
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setStrokeWidth(parseFloat);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(m160592a((int) parseLong2));
                    Bitmap createBitmap = Bitmap.createBitmap(parseInt, parseInt2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(m160592a((int) parseLong));
                    RectF rectF = new RectF();
                    rectF.left = 0.0f;
                    rectF.top = 0.0f;
                    rectF.right = (float) parseInt;
                    rectF.bottom = (float) parseInt2;
                    canvas.drawRoundRect(rectF, (float) (parseInt >> 3), (float) (parseInt2 >> 3), paint);
                    bitmap = createBitmap;
                }
            }
            iconImageInfo.bitmap = bitmap;
            if (bitmap == null && (gvVar3 = this.f342835l) != null) {
                gvVar3.mo172154a().mo172142a(System.currentTimeMillis(), str);
            }
            return iconImageInfo;
        }
        try {
            this.f342832e.lock();
            this.f342834k.mo172562a(str, iconImageInfo);
            this.f342832e.unlock();
            if (iconImageInfo.bitmap == null) {
                str.equals(C114005ny.f340983a);
            }
            if (iconImageInfo.bitmap == null && (gvVar2 = this.f342835l) != null) {
                gvVar2.mo172154a().mo172142a(System.currentTimeMillis(), str);
            }
            return iconImageInfo;
        } catch (Exception unused) {
            if (iconImageInfo.bitmap == null && (gvVar = this.f342835l) != null) {
                gvVar.mo172154a().mo172142a(System.currentTimeMillis(), str);
            }
            return null;
        } catch (Throwable th) {
            this.f342832e.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo173082c() {
        C114216sq f = this.f342828a.mo171638f();
        f.mo172914a((C113961mq.C113963a) new C113961mq.C113963a("") {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeUpdateMapResource(C114216sq.this.f342024e, str);
                }
            }
        });
    }

    /* renamed from: c */
    private static Bitmap m160597c(String str) {
        String[] split;
        String substring = str.substring(14);
        if (!C40002he.m42805a(substring) && (split = substring.split(", ")) != null && split.length >= 5) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            long parseLong = Long.parseLong(split[2]);
            long parseLong2 = Long.parseLong(split[3]);
            float parseFloat = Float.parseFloat(split[4]);
            if (parseInt >= 0 && parseInt2 >= 0) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStrokeWidth(parseFloat);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(m160592a((int) parseLong2));
                Bitmap createBitmap = Bitmap.createBitmap(parseInt, parseInt2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(m160592a((int) parseLong));
                RectF rectF = new RectF();
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = (float) parseInt;
                rectF.bottom = (float) parseInt2;
                canvas.drawRoundRect(rectF, (float) (parseInt >> 3), (float) (parseInt2 >> 3), paint);
                return createBitmap;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo173081b() {
        this.f342831d.unlock();
    }

    /* renamed from: b */
    private boolean m160596b(String str, byte[] bArr) {
        C114009oc ocVar = this.f342829b;
        if (ocVar == null) {
            return false;
        }
        return m160593a(new File(ocVar.mo172568e()), str, bArr, this.f342832e);
    }

    /* renamed from: a */
    public final void mo173080a() {
        this.f342831d.lock();
    }

    /* renamed from: a */
    private boolean m160594a(String str, byte[] bArr) {
        C114009oc ocVar = this.f342829b;
        if (ocVar == null) {
            return false;
        }
        return m160593a(new File(ocVar.mo172566c()), str, bArr, this.f342831d);
    }

    /* renamed from: a */
    public final Bitmap mo173078a(String str, Bitmap.Config config) {
        WeakReference<Context> weakReference;
        if (!(!new File(str).exists() || (weakReference = this.f342833j) == null || weakReference.get() == null)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = config;
            try {
                return BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079 A[Catch:{ all -> 0x00bd, Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m160593a(java.io.File r4, java.lang.String r5, byte[] r6, java.util.concurrent.locks.Lock r7) {
        /*
            boolean r0 = com.tencent.mapsdk.internal.C40002he.m42805a((java.lang.String) r5)
            r1 = 0
            if (r0 != 0) goto L_0x00c2
            if (r6 == 0) goto L_0x00c2
            int r0 = r6.length
            if (r0 != 0) goto L_0x000e
            goto L_0x00c2
        L_0x000e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r2 = "_"
            r0.append(r2)
            int r2 = java.util.Arrays.hashCode(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r2 = r4.exists()     // Catch:{ Exception -> 0x00c2 }
            if (r2 != 0) goto L_0x002f
            r4.mkdirs()     // Catch:{ Exception -> 0x00c2 }
        L_0x002f:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00c2 }
            r2.<init>(r4, r0)     // Catch:{ Exception -> 0x00c2 }
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x00c2 }
            if (r0 == 0) goto L_0x003d
            r2.delete()     // Catch:{ Exception -> 0x00c2 }
        L_0x003d:
            r2.createNewFile()     // Catch:{ Exception -> 0x00c2 }
            com.tencent.mapsdk.internal.C113884kf.m157491a((java.io.File) r2, (byte[]) r6)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r6 = com.tencent.map.tools.Util.getMD5String((byte[]) r6)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r0 = com.tencent.mapsdk.internal.C113903kv.m157738a((java.io.File) r2)     // Catch:{ FileNotFoundException -> 0x0052 }
            boolean r6 = r6.equals(r0)     // Catch:{ FileNotFoundException -> 0x0052 }
            if (r6 != 0) goto L_0x0052
            return r1
        L_0x0052:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00c2 }
            r6.<init>(r4, r5)     // Catch:{ Exception -> 0x00c2 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00c2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2 }
            r3.<init>()     // Catch:{ Exception -> 0x00c2 }
            r3.append(r5)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r5 = ".bak"
            r3.append(r5)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x00c2 }
            r0.<init>(r4, r5)     // Catch:{ Exception -> 0x00c2 }
            boolean r4 = r0.exists()     // Catch:{ Exception -> 0x00c2 }
            if (r4 == 0) goto L_0x007d
            boolean r4 = r0.delete()     // Catch:{ Exception -> 0x00c2 }
            if (r4 != 0) goto L_0x007d
            r0.deleteOnExit()     // Catch:{ Exception -> 0x00c2 }
            return r1
        L_0x007d:
            r7.lock()     // Catch:{ all -> 0x00bd }
            boolean r4 = r6.exists()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0099
            boolean r4 = r6.renameTo(r0)     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x0099
            boolean r4 = r2.delete()     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x0095
            r2.deleteOnExit()     // Catch:{ all -> 0x00bd }
        L_0x0095:
            r7.unlock()     // Catch:{ Exception -> 0x00c2 }
            return r1
        L_0x0099:
            boolean r4 = r2.renameTo(r6)     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x00af
            r0.renameTo(r6)     // Catch:{ all -> 0x00bd }
            boolean r4 = r2.delete()     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x00ab
            r2.deleteOnExit()     // Catch:{ all -> 0x00bd }
        L_0x00ab:
            r7.unlock()     // Catch:{ Exception -> 0x00c2 }
            return r1
        L_0x00af:
            boolean r4 = r0.delete()     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x00b8
            r0.deleteOnExit()     // Catch:{ all -> 0x00bd }
        L_0x00b8:
            r7.unlock()     // Catch:{ Exception -> 0x00c2 }
            r4 = 1
            return r4
        L_0x00bd:
            r4 = move-exception
            r7.unlock()     // Catch:{ Exception -> 0x00c2 }
            throw r4     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114371w.m160593a(java.io.File, java.lang.String, byte[], java.util.concurrent.locks.Lock):boolean");
    }
}
