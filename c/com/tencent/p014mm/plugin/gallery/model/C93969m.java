package com.tencent.p014mm.plugin.gallery.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.gallery.model.m */
public final class C93969m {

    /* renamed from: a */
    public static int f271188a;

    /* renamed from: b */
    public static final int f271189b;

    /* renamed from: c */
    public static final int f271190c;

    static {
        Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
        int[] iArr = {defaultDisplay.getWidth(), defaultDisplay.getHeight()};
        f271189b = Math.max(iArr[0], 960);
        f271190c = Math.max(iArr[1], 960);
    }

    /* renamed from: a */
    public static Bitmap m118771a(String str, String str2, long j, int i) {
        Bitmap bitmap = null;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.MediaManager", "filePath is null or nil");
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            bitmap = MediaStore.Images.Thumbnails.getThumbnail(MMApplicationContext.getContext().getContentResolver(), j, i, (BitmapFactory.Options) null);
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = i == 3 ? "MICRO_KIND" : "MINI_KIND";
            objArr[2] = Integer.valueOf(bitmap == null ? 0 : bitmap.getWidth());
            objArr[3] = Integer.valueOf(bitmap == null ? 0 : bitmap.getHeight());
            objArr[4] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            Log.m105927v("MicroMsg.MediaManager", "getImageThumb[%s]FromContentResolver type[%s], bmp size[%d, %d]: total time:[%dms]", objArr);
        } catch (Exception | OutOfMemoryError e) {
            Log.m105921e("MicroMsg.MediaManager", "get thumb from content resolver failed: [%s]", e.toString());
            Log.printErrStackTrace("MicroMsg.MediaManager", e, "", new Object[0]);
        }
        return bitmap;
    }

    /* renamed from: b */
    public static Bitmap m118772b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.MediaManager", "filepath is null or nil");
            return null;
        }
        try {
            if (!C86013q1.m106450k(str)) {
                Log.m105920e("MicroMsg.MediaManager", "getSuitableBmp fail, file does not exist, filePath = " + str);
                return null;
            }
            int i = f271189b;
            int i2 = f271190c;
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z = true;
            options.inJustDecodeBounds = true;
            Bitmap d = MMBitmapFactory.m98735d(str, options);
            if (d != null) {
                Log.m105925i("MicroMsg.MediaManager", "bitmap recycle %s", d.toString());
                d.recycle();
            }
            int i3 = options.outWidth;
            if (i3 > 0) {
                int i4 = options.outHeight;
                if (i4 > 0) {
                    boolean z2 = LongBitmapHandler.isLongHorizontal(i3, i4) && options.outWidth > 480;
                    if (!LongBitmapHandler.isLongVertical(options.outWidth, options.outHeight) || options.outHeight <= 480) {
                        z = false;
                    }
                    if (z2 || z) {
                        i2 = options.outHeight;
                        i = options.outWidth;
                    }
                    int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
                    if (exifOrientation != 90) {
                        if (exifOrientation != 270) {
                            int i5 = i2;
                            i2 = i;
                            i = i5;
                        }
                    }
                    Bitmap extractThumbNail = BitmapUtil.extractThumbNail(str, i, i2, false);
                    if (extractThumbNail == null) {
                        Log.m105920e("MicroMsg.MediaManager", "getSuitableBmp fail, temBmp is null, filePath = " + str);
                        return null;
                    }
                    Bitmap rotate = BitmapUtil.rotate(extractThumbNail, (float) exifOrientation);
                    Log.m105918d("MicroMsg.MediaManager", "bmp height = " + rotate.getHeight() + ",bmp width = " + rotate.getWidth());
                    return rotate;
                }
            }
            Log.m105918d("MicroMsg.MediaManager", "get bitmap fail, file is not a image file = " + str);
            return null;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MediaManager", "decode bitmap err: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static int m118773c() {
        int i = f271188a;
        if (i > 0) {
            return i;
        }
        int a = C74942w4.m89784a(MMApplicationContext.getContext(), 100);
        f271188a = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m118774d(long r5, int r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.lang.String r2 = "MicroMsg.MediaManager"
            r3 = 2
            r4 = 1
            if (r7 == r4) goto L_0x0063
            if (r7 == r3) goto L_0x0013
            goto L_0x00bb
        L_0x0013:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0020 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x0020 }
            android.graphics.Bitmap r1 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r7, r5, r4, r1)     // Catch:{ Exception -> 0x0020 }
            goto L_0x002e
        L_0x0020:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r7)
            r8[r0] = r7
            java.lang.String r7 = "exception: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r7, r8)
        L_0x002e:
            if (r1 != 0) goto L_0x00bb
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r7[r0] = r8
            r7[r4] = r9
            java.lang.String r8 = "get video thumb failed : [%d] [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r8, r7)
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createVideoThumbnail(r9, r4)
            if (r7 != 0) goto L_0x0061
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r8 != 0) goto L_0x0061
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r8[r0] = r5
            r8[r4] = r9
            java.lang.String r5 = "get video thumb failed : [%d], call media scanner : [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r8)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.p014mm.sdk.system.AndroidMediaUtil.refreshMediaScanner(r9, r5)
        L_0x0061:
            r1 = r7
            goto L_0x00bb
        L_0x0063:
            r7 = 4096(0x1000, float:5.74E-42)
            if (r10 == r7) goto L_0x00a8
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r10 == r7) goto L_0x00a3
            r7 = 12288(0x3000, float:1.7219E-41)
            if (r10 == r7) goto L_0x007d
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r5[r0] = r6
            java.lang.String r6 = "get image thumb, unknown type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r6, r5)
            goto L_0x00ae
        L_0x007d:
            int r7 = m118773c()
            android.graphics.Bitmap r7 = qw1.C101315h.m132899a(r8, r7)
            android.graphics.Bitmap r7 = m118775e(r8, r7)
            if (r7 == 0) goto L_0x0098
            boolean r10 = r7.isRecycled()
            if (r10 == 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            java.lang.String r5 = "get bitmap from file."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r5)
            goto L_0x00a1
        L_0x0098:
            java.lang.String r7 = "get bitmap from file failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r7)
            android.graphics.Bitmap r7 = m118771a(r8, r9, r5, r4)
        L_0x00a1:
            r1 = r7
            goto L_0x00ae
        L_0x00a3:
            android.graphics.Bitmap r5 = m118771a(r8, r9, r5, r4)
            goto L_0x00ad
        L_0x00a8:
            r7 = 3
            android.graphics.Bitmap r5 = m118771a(r8, r9, r5, r7)
        L_0x00ad:
            r1 = r5
        L_0x00ae:
            if (r1 != 0) goto L_0x00bb
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r8
            r5[r4] = r9
            java.lang.String r6 = "get thumb from content resolver failed: [%s], [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r6, r5)
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.model.C93969m.m118774d(long, int, java.lang.String, java.lang.String, int):android.graphics.Bitmap");
    }

    /* renamed from: e */
    public static Bitmap m118775e(String str, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
        Bitmap rotate = BitmapUtil.rotate(bitmap, (float) exifOrientation);
        Log.m105919d("MicroMsg.MediaManager", "do rotate finish, width[%d] height[%d] rotate[%d] use[%dms]", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(exifOrientation), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (rotate != null) {
            return rotate;
        }
        return null;
    }
}
