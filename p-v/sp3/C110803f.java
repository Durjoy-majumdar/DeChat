package sp3;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.asset.Asset;
import com.tencent.tav.asset.URLAsset;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.composition.resource.TAVAssetTrackResource;
import com.tencent.tavkit.composition.resource.TAVEmptyResource;
import com.tencent.tavkit.composition.resource.TAVImageResource;
import com.tencent.tavkit.composition.resource.TAVResource;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: sp3.f */
public final class C110803f {

    /* renamed from: a */
    public static int f331484a = 1080;

    /* renamed from: b */
    public static long f331485b = 10000;

    /* renamed from: c */
    public static final HashMap<String, Bitmap> f331486c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<String, TAVResource> f331487d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<String, C110806j> f331488e = new HashMap<>();

    /* renamed from: f */
    public static final HashMap<String, URLAsset> f331489f = new HashMap<>();

    /* renamed from: g */
    public static final C110803f f331490g = new C110803f();

    /* renamed from: a */
    public final void mo162371a() {
        synchronized (this) {
            f331487d.clear();
            f331486c.clear();
            f331488e.clear();
            for (Map.Entry<String, URLAsset> value : f331489f.entrySet()) {
                ((URLAsset) value.getValue()).release();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo162372b(java.lang.String r20) {
        /*
            r19 = this;
            r0 = r20
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "createRescaleBitmap:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "CompositionTrack"
            yp3.C112478a.m153625c(r6, r3, r5)
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            r5 = 1
            r3.inJustDecodeBounds = r5
            android.graphics.BitmapFactory.decodeFile(r0, r3)
            int r7 = r3.outWidth
            int r8 = r3.outHeight
            int r9 = f331484a
            r10 = 2
            if (r7 > r9) goto L_0x0038
            if (r8 <= r9) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r11 = 1
            goto L_0x0063
        L_0x0038:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 <= r7) goto L_0x0045
            float r12 = (float) r7
            float r13 = (float) r9
            float r12 = r12 / r13
            float r12 = r12 + r11
            int r11 = java.lang.Math.round(r12)
            goto L_0x004d
        L_0x0045:
            float r12 = (float) r8
            float r13 = (float) r9
            float r12 = r12 / r13
            float r12 = r12 + r11
            int r11 = java.lang.Math.round(r12)
        L_0x004d:
            float r12 = (float) r8
            float r13 = (float) r7
            float r12 = r12 * r13
            int r9 = r9 * r9
            float r9 = (float) r9
            float r13 = (float) r10
            float r9 = r9 * r13
        L_0x0057:
            int r13 = r11 * r11
            float r13 = (float) r13
            float r13 = r12 / r13
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x0063
            int r11 = r11 + 1
            goto L_0x0057
        L_0x0063:
            r3.inSampleSize = r11
            r3.inJustDecodeBounds = r4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "bitmap width:"
            r9.append(r11)
            r9.append(r7)
            java.lang.String r11 = ", height:"
            r9.append(r11)
            r9.append(r8)
            java.lang.String r11 = ", inSampleSize:"
            r9.append(r11)
            int r11 = r3.inSampleSize
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r11 = new java.lang.Object[r4]
            yp3.C112478a.m153625c(r6, r9, r11)
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r3)
            r9 = 0
            r11 = 0
            if (r3 == 0) goto L_0x00c6
            boolean r12 = r3.isRecycled()
            if (r12 != 0) goto L_0x00c6
            int r12 = r3.getWidth()
            int r12 = r12 % r10
            if (r12 != r5) goto L_0x00c7
            int r12 = r3.getWidth()
            int r12 = r12 + r5
            int r13 = r3.getHeight()
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r12, r13, r14)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            if (r12 == 0) goto L_0x00c2
            r13.<init>(r12)
            r13.drawARGB(r4, r4, r4, r4)
            r13.drawBitmap(r3, r9, r9, r11)
            r3 = r12
            goto L_0x00c7
        L_0x00c2:
            gy3.C87412m.m108601n()
            throw r11
        L_0x00c6:
            r3 = r11
        L_0x00c7:
            if (r3 != 0) goto L_0x00e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot decode bitmap:"
            r1.append(r2)
            r1.append(r0)
            r0 = 33
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            yp3.C112478a.m153624b(r6, r0, r1)
            return r11
        L_0x00e5:
            androidx.exifinterface.media.ExifInterface r11 = new androidx.exifinterface.media.ExifInterface
            java.io.FileInputStream r12 = new java.io.FileInputStream
            r12.<init>(r0)
            r11.<init>((java.io.InputStream) r12)
            java.lang.String r0 = "Orientation"
            int r0 = r11.getAttributeInt(r0, r5)
            r11 = 3
            if (r0 == r11) goto L_0x0115
            r11 = 6
            if (r0 == r11) goto L_0x010b
            r11 = 8
            if (r0 == r11) goto L_0x0101
            r0 = 0
            goto L_0x011e
        L_0x0101:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r11 = "image rotate 270"
            yp3.C112478a.m153625c(r6, r11, r0)
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x011e
        L_0x010b:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r11 = "image rotate 90"
            yp3.C112478a.m153625c(r6, r11, r0)
            r0 = 90
            goto L_0x011e
        L_0x0115:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r11 = "image rotate 180"
            yp3.C112478a.m153625c(r6, r11, r0)
            r0 = 180(0xb4, float:2.52E-43)
        L_0x011e:
            if (r0 <= 0) goto L_0x01a1
            float r0 = (float) r0
            java.lang.String r11 = "BitmapUtil"
            r12 = 360(0x168, float:5.04E-43)
            float r12 = (float) r12
            float r12 = r0 % r12
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x012d
            goto L_0x019d
        L_0x012d:
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            r9.reset()
            int r12 = r3.getWidth()
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            int r13 = r3.getHeight()
            float r13 = (float) r13
            float r13 = r13 / r10
            r9.setRotate(r0, r12, r13)
            r13 = 0
            r14 = 0
            int r15 = r3.getWidth()     // Catch:{ all -> 0x018f }
            int r16 = r3.getHeight()     // Catch:{ all -> 0x018f }
            r18 = 1
            r12 = r3
            r17 = r9
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "resultBmp is null: "
            r10.append(r12)
            if (r9 != 0) goto L_0x0166
            r12 = 1
            goto L_0x0167
        L_0x0166:
            r12 = 0
        L_0x0167:
            r10.append(r12)
            java.lang.String r12 = "  degree:"
            r10.append(r12)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.Object[] r10 = new java.lang.Object[r4]
            yp3.C112478a.m153623a(r11, r0, r10)
            boolean r0 = gy3.C87412m.m108589b(r3, r9)
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x019e
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r3
            java.lang.String r5 = "rotate bitmap recycle ajsdfasdf adsf. %s"
            yp3.C112478a.m153625c(r11, r5, r0)
            r3.recycle()
            goto L_0x019e
        L_0x018f:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = yp3.C91542c.m114880a(r0)
            r5[r4] = r0
            java.lang.String r0 = "createBitmap failed : %s "
            yp3.C112478a.m153623a(r11, r0, r5)
        L_0x019d:
            r9 = r3
        L_0x019e:
            if (r9 == 0) goto L_0x01a1
            r3 = r9
        L_0x01a1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "final rescale bitmap size:["
            r0.append(r5)
            int r5 = r3.getWidth()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.append(r5)
            java.lang.String r5 = ", "
            r0.append(r5)
            int r9 = r3.getHeight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.append(r9)
            java.lang.String r9 = "], origin size:["
            r0.append(r9)
            r0.append(r7)
            r0.append(r5)
            r0.append(r8)
            java.lang.String r5 = "], cost:"
            r0.append(r5)
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r1
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            yp3.C112478a.m153625c(r6, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sp3.C110803f.mo162372b(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public final TAVResource mo162373c(C110801c cVar) {
        C87412m.m108595h(cVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        synchronized (this) {
            HashMap<String, TAVResource> hashMap = f331487d;
            TAVResource tAVResource = hashMap.get(cVar.f331482t);
            if (tAVResource == null) {
                int i = cVar.f331483u;
                if (i == 1) {
                    Bitmap b = f331490g.mo162372b(cVar.f331482t);
                    if (b == null) {
                        TAVResource clone = new TAVEmptyResource(CMTime.CMTimeZero).clone();
                        C87412m.m108590c(clone, "resource.clone()");
                        return clone;
                    }
                    f331486c.put(cVar.f331482t, b);
                    tAVResource = new TAVImageResource(new CIImage(b), new CMTime(f331485b, 1000), true);
                } else if (i == 2 || i == 3) {
                    URLAsset uRLAsset = new URLAsset(cVar.f331482t);
                    TAVAssetTrackResource tAVAssetTrackResource = new TAVAssetTrackResource((Asset) uRLAsset);
                    f331489f.put(cVar.f331482t, uRLAsset);
                    tAVResource = tAVAssetTrackResource;
                } else {
                    tAVResource = new TAVEmptyResource(CMTime.CMTimeZero);
                }
                hashMap.put(cVar.f331482t, tAVResource);
            }
            TAVResource clone2 = tAVResource.clone();
            C87412m.m108590c(clone2, "resource.clone()");
            return clone2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b A[Catch:{ Exception -> 0x0069, all -> 0x006b }, ExcHandler: all (r10v2 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:7:0x0017] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sp3.C110806j mo162374d(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108595h(r10, r0)
            monitor-enter(r9)
            java.util.HashMap<java.lang.String, sp3.j> r0 = f331488e     // Catch:{ all -> 0x0075 }
            java.lang.Object r1 = r0.get(r10)     // Catch:{ all -> 0x0075 }
            sp3.j r1 = (sp3.C110806j) r1     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0073
        L_0x0011:
            r1 = 0
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x0075 }
            r2.<init>()     // Catch:{ all -> 0x0075 }
            r2.setDataSource(r10)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            r3 = 18
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            r4 = 0
            if (r3 == 0) goto L_0x0028
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            r5 = 19
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            if (r5 == 0) goto L_0x0036
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            r6 = 24
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            if (r6 == 0) goto L_0x0044
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 == r7) goto L_0x004d
            r7 = 90
            if (r6 != r7) goto L_0x0050
        L_0x004d:
            r8 = r5
            r5 = r3
            r3 = r8
        L_0x0050:
            r7 = 9
            java.lang.String r7 = r2.extractMetadata(r7)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            if (r7 == 0) goto L_0x005c
            int r4 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
        L_0x005c:
            sp3.j r7 = new sp3.j     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            r7.<init>(r3, r5, r6, r4)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            r0.put(r10, r7)     // Catch:{ Exception -> 0x0069, all -> 0x006b }
            r2.release()     // Catch:{ all -> 0x0075 }
            r1 = r7
            goto L_0x0073
        L_0x0069:
            r1 = r7
            goto L_0x0070
        L_0x006b:
            r10 = move-exception
            r2.release()     // Catch:{ all -> 0x0075 }
            throw r10     // Catch:{ all -> 0x0075 }
        L_0x0070:
            r2.release()     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r9)
            return r1
        L_0x0075:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sp3.C110803f.mo162374d(java.lang.String):sp3.j");
    }
}
