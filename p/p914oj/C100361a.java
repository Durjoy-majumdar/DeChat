package p914oj;

import a70.C112760b;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: oj.a */
public class C100361a {

    /* renamed from: oj.a$a */
    public static class C77012a {

        /* renamed from: a */
        public String f224997a = null;

        /* renamed from: b */
        public Bitmap f224998b = null;

        /* renamed from: c */
        public int f224999c = 0;
    }

    /* renamed from: a */
    public static String m131252a(Context context, Uri uri) {
        OutputStream outputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String type = contentResolver.getType(uri);
        Log.m105924i("MicroMsg.GetVideoMetadata", "copyFileFromUri typeStr:" + type);
        if (TextUtils.isEmpty(type)) {
            return null;
        }
        String[] split = type.split("/");
        String str = "." + split[1];
        String str2 = "share_file_" + uri.getHost().replaceAll("\\.", "_") + "_" + split[0] + "_" + uri.getPath().replaceAll("/", "_");
        if (!str2.endsWith(str)) {
            str2 = str2 + str;
        }
        Log.m105924i("MicroMsg.GetVideoMetadata", "copyFileFromUri path:" + str2);
        C86009m1 m1Var = new C86009m1(C112760b.m154198F(), str2);
        if (!m1Var.mo119974l().mo119967g()) {
            m1Var.mo119974l().mo119987x();
        }
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        try {
            m1Var.mo119964e();
            outputStream = C86013q1.m106426H(m1Var);
            try {
                inputStream = contentResolver.openInputStream(uri);
                if (inputStream != null) {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                outputStream.write(bArr, 0, read);
                            } else {
                                String i = m1Var.mo119971i();
                                Util.qualityClose(inputStream);
                                Util.qualityClose(outputStream);
                                return i;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            Log.printErrStackTrace("MicroMsg.GetVideoMetadata", e, "copy fail", new Object[0]);
                            Util.qualityClose(inputStream);
                            Util.qualityClose(outputStream);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
                Log.printErrStackTrace("MicroMsg.GetVideoMetadata", e, "copy fail", new Object[0]);
                Util.qualityClose(inputStream);
                Util.qualityClose(outputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                Util.qualityClose(inputStream2);
                Util.qualityClose(outputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            outputStream = null;
            Log.printErrStackTrace("MicroMsg.GetVideoMetadata", e, "copy fail", new Object[0]);
            Util.qualityClose(inputStream);
            Util.qualityClose(outputStream);
            return null;
        } catch (Throwable th5) {
            th = th5;
            outputStream = null;
            Util.qualityClose(inputStream2);
            Util.qualityClose(outputStream);
            throw th;
        }
        Util.qualityClose(inputStream);
        Util.qualityClose(outputStream);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0330, code lost:
        if (r12 == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        if (r12 == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d3, code lost:
        if (r10 != null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e6, code lost:
        if (r10 != null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e8, code lost:
        r10.release();
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x038a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x038b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0203  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p914oj.C100361a.C77012a m131253b(android.content.Context r25, android.content.Intent r26, int r27) {
        /*
            r1 = r25
            r2 = r27
            r3 = 0
            java.lang.String r4 = "MicroMsg.GetVideoMetadata"
            if (r26 == 0) goto L_0x038d
            android.net.Uri r0 = r26.getData()
            if (r0 != 0) goto L_0x0011
            goto L_0x038d
        L_0x0011:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r0 = r26.getDataString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "dataString "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "dataString empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return r3
        L_0x0035:
            android.content.ContentResolver r13 = r25.getContentResolver()
            oj.a$a r14 = new oj.a$a
            r14.<init>()
            android.net.Uri r7 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            java.lang.String r7 = r7.toString()
            boolean r7 = r0.startsWith(r7)
            java.lang.String r15 = "file://"
            r12 = 0
            if (r7 == 0) goto L_0x005f
            android.net.Uri r8 = r26.getData()
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = 0
            r7 = r13
            r3 = 0
            r12 = r0
            android.database.Cursor r0 = r7.query(r8, r9, r10, r11, r12)
        L_0x005c:
            r7 = r0
            goto L_0x0184
        L_0x005f:
            r3 = 0
            java.lang.String r7 = "content://"
            boolean r7 = r0.startsWith(r7)
            r8 = 7
            if (r7 == 0) goto L_0x00d5
            android.net.Uri r0 = r26.getData()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r1, r0)
            r14.f224997a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r14.f224997a
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r7 = r0.getPath()
            if (r7 == 0) goto L_0x009f
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r3, r3)
            java.lang.String r9 = r0.getPath()
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x009f
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r7)
            android.net.Uri r0 = r0.build()
        L_0x009f:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r9 = 0
            com.tencent.mm.vfs.f0$h r0 = r7.mo177799l(r0, r9)
            boolean r7 = r0.mo177810a()
            if (r7 != 0) goto L_0x00ae
            r12 = 0
            goto L_0x00c8
        L_0x00ae:
            com.tencent.mm.vfs.FileSystem$c r7 = r0.f348991a
            java.lang.String r9 = r0.f348992b
            java.lang.String r9 = r7.mo119947w(r9, r3)
            if (r9 == 0) goto L_0x00c2
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r12 = r0.canRead()
            goto L_0x00c8
        L_0x00c2:
            java.lang.String r0 = r0.f348992b
            boolean r12 = r7.mo119948x(r0)
        L_0x00c8:
            if (r12 != 0) goto L_0x0109
        L_0x00ca:
            android.net.Uri r0 = r26.getData()
            java.lang.String r0 = m131252a(r1, r0)
            r14.f224997a = r0
            goto L_0x0109
        L_0x00d5:
            boolean r7 = r0.startsWith(r15)
            if (r7 == 0) goto L_0x0109
            android.os.Bundle r7 = r26.getExtras()
            if (r7 == 0) goto L_0x00ff
            android.os.Bundle r7 = r26.getExtras()
            java.lang.String r9 = "android.intent.extra.STREAM"
            android.os.Parcelable r7 = r7.getParcelable(r9)
            android.net.Uri r7 = (android.net.Uri) r7
            if (r7 == 0) goto L_0x00ff
            java.lang.String r9 = r7.getPath()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x00ff
            java.lang.String r7 = r7.getPath()
            r14.f224997a = r7
        L_0x00ff:
            java.lang.String r7 = r14.f224997a
            if (r7 != 0) goto L_0x0109
            java.lang.String r0 = r0.substring(r8)
            r14.f224997a = r0
        L_0x0109:
            java.lang.String r0 = r14.f224997a
            if (r0 == 0) goto L_0x0183
            java.lang.String r7 = "/storage/emulated/legacy"
            boolean r0 = r0.startsWith(r7)
            if (r0 == 0) goto L_0x0137
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r7 = p206nj.C88956h.m111061b()
            java.lang.String r7 = r7.getAbsolutePath()
            r0.append(r7)
            java.lang.String r7 = r14.f224997a
            r8 = 24
            java.lang.String r7 = r7.substring(r8)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r14.f224997a = r0
            goto L_0x0160
        L_0x0137:
            java.lang.String r0 = r14.f224997a
            java.lang.String r7 = "/sdcard"
            boolean r0 = r0.startsWith(r7)
            if (r0 == 0) goto L_0x0160
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r7 = p206nj.C88956h.m111061b()
            java.lang.String r7 = r7.getAbsolutePath()
            r0.append(r7)
            java.lang.String r7 = r14.f224997a
            java.lang.String r7 = r7.substring(r8)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r14.f224997a = r0
        L_0x0160:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "_data LIKE "
            r0.append(r7)
            java.lang.String r7 = r14.f224997a
            java.lang.String r7 = android.database.DatabaseUtils.sqlEscapeString(r7)
            r0.append(r7)
            java.lang.String r10 = r0.toString()
            android.net.Uri r8 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r13
            android.database.Cursor r0 = r7.query(r8, r9, r10, r11, r12)
            goto L_0x005c
        L_0x0183:
            r7 = 0
        L_0x0184:
            r12 = 1
            if (r7 == 0) goto L_0x0203
            int r0 = r7.getCount()
            if (r0 <= 0) goto L_0x01f8
            r7.moveToFirst()
            java.lang.String r0 = "_id"
            int r0 = r7.getColumnIndexOrThrow(r0)
            int r9 = r7.getInt(r0)
            java.lang.String r0 = r14.f224997a
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = "_data"
            int r0 = r7.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r7.getString(r0)
            r14.f224997a = r0
        L_0x01aa:
            java.lang.String r0 = "duration"
            int r0 = r7.getColumnIndexOrThrow(r0)
            int r0 = r7.getInt(r0)
            r14.f224999c = r0
            if (r0 != 0) goto L_0x01f4
            java.lang.String r0 = "get video duration through MediaPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x01d9, all -> 0x01d6 }
            java.lang.String r0 = r14.f224997a     // Catch:{ Exception -> 0x01d9, all -> 0x01d6 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x01d9, all -> 0x01d6 }
            dj.g r10 = p331dj.C97481g.m125558a(r1, r0)     // Catch:{ Exception -> 0x01d9, all -> 0x01d6 }
            if (r10 == 0) goto L_0x01d0
            int r0 = r10.getDuration()     // Catch:{ Exception -> 0x01ce }
            goto L_0x01d1
        L_0x01ce:
            r0 = move-exception
            goto L_0x01db
        L_0x01d0:
            r0 = 0
        L_0x01d1:
            r14.f224999c = r0     // Catch:{ Exception -> 0x01ce }
            if (r10 == 0) goto L_0x01f4
            goto L_0x01e8
        L_0x01d6:
            r0 = move-exception
            r3 = 0
            goto L_0x01ee
        L_0x01d9:
            r0 = move-exception
            r10 = 0
        L_0x01db:
            java.lang.String r11 = "get duration error, %s"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ all -> 0x01ec }
            java.lang.String r12 = r14.f224997a     // Catch:{ all -> 0x01ec }
            r8[r3] = r12     // Catch:{ all -> 0x01ec }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r11, r8)     // Catch:{ all -> 0x01ec }
            if (r10 == 0) goto L_0x01f4
        L_0x01e8:
            r10.release()
            goto L_0x01f4
        L_0x01ec:
            r0 = move-exception
            r3 = r10
        L_0x01ee:
            if (r3 == 0) goto L_0x01f3
            r3.release()
        L_0x01f3:
            throw r0
        L_0x01f4:
            r8 = 0
            r14.f224998b = r8
            goto L_0x01fc
        L_0x01f8:
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x01fc:
            r7.close()
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x020a
        L_0x0203:
            r8 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x020a:
            if (r9 == r7) goto L_0x0227
            if (r2 >= 0) goto L_0x0227
            long r9 = (long) r9
            r7 = 1
            android.graphics.Bitmap r0 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r13, r9, r7, r8)     // Catch:{ Exception -> 0x021c }
            r14.f224998b = r0     // Catch:{ Exception -> 0x021c }
            java.lang.String r0 = "get video thumb from mediaId"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x021c }
            goto L_0x0227
        L_0x021c:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r8, r7)
            r7 = 0
            r14.f224998b = r7
        L_0x0227:
            java.lang.String r0 = r14.f224997a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r7 = 3
            r8 = 2
            if (r0 != 0) goto L_0x0362
            android.graphics.Bitmap r0 = r14.f224998b
            if (r0 != 0) goto L_0x0362
            java.lang.String r0 = "createVideoThumbnail manual"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.lang.String r0 = r14.f224997a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x02bc
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r9 != 0) goto L_0x024a
            goto L_0x02bc
        L_0x024a:
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r3] = r0
            java.lang.String r11 = "getVideoThumb, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r12)
            oj.c r11 = new oj.c     // Catch:{ Exception -> 0x02aa }
            r11.<init>()     // Catch:{ Exception -> 0x02aa }
            r11.setDataSource(r0)     // Catch:{ Exception -> 0x02aa }
            r0 = 18
            java.lang.String r0 = r11.extractMetadata(r0)     // Catch:{ Exception -> 0x02aa }
            r12 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)     // Catch:{ Exception -> 0x02aa }
            r13 = 19
            java.lang.String r13 = r11.extractMetadata(r13)     // Catch:{ Exception -> 0x02aa }
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r12)     // Catch:{ Exception -> 0x02aa }
            r13 = r4
            long r3 = (long) r2
            android.graphics.Bitmap r3 = r11.getFrameAtTime(r3, r8)     // Catch:{ Exception -> 0x02a7 }
            r11.release()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r4 = "getVideoThumb, width: %s, height: %s, cost:%s"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x02a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02a7 }
            r16 = 0
            r11[r16] = r0     // Catch:{ Exception -> 0x02a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x02a7 }
            r12 = 1
            r11[r12] = r0     // Catch:{ Exception -> 0x02a7 }
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)     // Catch:{ Exception -> 0x02a7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x02a7 }
            r11[r8] = r0     // Catch:{ Exception -> 0x02a7 }
            r9 = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r11)     // Catch:{ Exception -> 0x02a5 }
            if (r3 == 0) goto L_0x02a2
            goto L_0x02c9
        L_0x02a2:
            r3 = 1
            r11 = 0
            goto L_0x02c8
        L_0x02a5:
            r0 = move-exception
            goto L_0x02ac
        L_0x02a7:
            r0 = move-exception
            r9 = r13
            goto L_0x02ac
        L_0x02aa:
            r0 = move-exception
            r9 = r4
        L_0x02ac:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r10 = r0.getMessage()
            r11 = 0
            r4[r11] = r10
            java.lang.String r10 = "get video thumb error! %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r4)
            goto L_0x02c8
        L_0x02bc:
            r9 = r4
            r3 = 1
            r11 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r0
            java.lang.String r0 = "getVideoThumb, %s not exist!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r4)
        L_0x02c8:
            r3 = 0
        L_0x02c9:
            r14.f224998b = r3
            if (r3 == 0) goto L_0x0333
            if (r3 == 0) goto L_0x032d
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0 = 20
            r4 = 1
            android.graphics.Bitmap r17 = android.graphics.Bitmap.createScaledBitmap(r3, r0, r0, r4)
            r0 = 400(0x190, float:5.6E-43)
            int[] r3 = new int[r0]
            r19 = 0
            r20 = 20
            r21 = 0
            r22 = 0
            r23 = 20
            r24 = 20
            r18 = r3
            r17.getPixels(r18, r19, r20, r21, r22, r23, r24)
            r12 = 0
            r7 = r12
            r12 = 0
        L_0x02f3:
            if (r12 >= r0) goto L_0x0304
            r13 = r3[r12]
            int r13 = android.graphics.Color.blue(r13)
            r17 = r5
            long r4 = (long) r13
            long r7 = r7 + r4
            int r12 = r12 + 1
            r5 = r17
            goto L_0x02f3
        L_0x0304:
            r17 = r5
            float r3 = (float) r7
            float r0 = (float) r0
            float r3 = r3 / r0
            long r7 = (long) r3
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r5 = 0
            r0[r5] = r3
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 1
            r0[r5] = r3
            java.lang.String r3 = "isBitmapDark, avg bitmap avgColor:%s, cost:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r0)
            r5 = 10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x032f
            r12 = 1
            goto L_0x0330
        L_0x032d:
            r17 = r5
        L_0x032f:
            r12 = 0
        L_0x0330:
            if (r12 == 0) goto L_0x033e
            goto L_0x0335
        L_0x0333:
            r17 = r5
        L_0x0335:
            java.lang.String r0 = r14.f224997a
            r3 = 1
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createVideoThumbnail(r0, r3, r2)
            r14.f224998b = r0
        L_0x033e:
            android.graphics.Bitmap r0 = r14.f224998b
            if (r0 != 0) goto L_0x0365
            android.content.Intent r0 = new android.content.Intent
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            android.graphics.Bitmap r3 = r14.f224998b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r0.<init>(r3, r2)
            r1.sendBroadcast(r0)
            goto L_0x0365
        L_0x0362:
            r9 = r4
            r17 = r5
        L_0x0365:
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r14.f224997a
            r2 = 1
            r0[r2] = r1
            int r1 = r14.f224999c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "get video meta data cost time: %d meta[%s, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            java.lang.String r0 = r14.f224997a
            if (r0 == 0) goto L_0x038b
            return r14
        L_0x038b:
            r1 = 0
            return r1
        L_0x038d:
            r1 = r3
            r9 = r4
            java.lang.String r0 = "input invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p914oj.C100361a.m131253b(android.content.Context, android.content.Intent, int):oj.a$a");
    }
}
