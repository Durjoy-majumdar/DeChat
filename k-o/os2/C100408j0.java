package os2;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import java.nio.ByteBuffer;
import lr2.C99590a;
import p663qo.C101211h;
import p663qo.C101213l;
import p823sg.C90193h;
import sf0.C90188n0;
import te3.C101821nv2;
import te3.C64376fv2;
import v51.C102150l;
import vr2.C102236a0;
import vr2.C102270y;
import zh3.C91753f;

/* renamed from: os2.j0 */
public class C100408j0 extends MStorage {

    /* renamed from: e */
    public static final String[] f294137e = {"CREATE TABLE IF NOT EXISTS SnsMedia ( local_id INTEGER PRIMARY KEY, seqId LONG, type INT, createTime LONG, userName VARCHAR(40), totallen INT, offset INT, local_flag INT, tmp_path TEXT, nums INT, try_times INT, StrId VARCHAR(40), upload_buf TEXT, reserved1 INT, reserved2 TEXT, reserved3 TEXT, reserved4 TEXT, reserved5 TEXT )", "CREATE INDEX IF NOT EXISTS serverSnsMediaTimeIndex ON SnsMedia ( createTime )"};

    /* renamed from: f */
    public static int f294138f = 0;

    /* renamed from: g */
    public static int f294139g = 0;

    /* renamed from: d */
    public C91753f f294140d;

    static {
        new Point();
    }

    public C100408j0(C91753f fVar) {
        this.f294140d = fVar;
    }

    /* renamed from: CP */
    public static boolean m131378CP(BitmapFactory.Options options) {
        SnsMethodCalculate.markStartTimeMs("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (options == null) {
            SnsMethodCalculate.markEndTimeMs("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        String str = options.outMimeType;
        Log.m105918d("MicroMsg.snsMediaStorage", "mimetype: " + str);
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.indexOf("jpg") >= 0) {
            SnsMethodCalculate.markEndTimeMs("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        } else if (lowerCase.indexOf("jpeg") >= 0) {
            SnsMethodCalculate.markEndTimeMs("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        } else if (lowerCase.indexOf("png") >= 0) {
            SnsMethodCalculate.markEndTimeMs("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[SYNTHETIC, Splitter:B:24:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[SYNTHETIC, Splitter:B:31:0x0064] */
    /* renamed from: CZ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m131379CZ(java.lang.String r8) {
        /*
            java.lang.String r0 = "isWebp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            r3 = 0
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r8)     // Catch:{ Exception -> 0x0061, all -> 0x0057 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r4.<init>()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r5 = 1
            r4.inJustDecodeBounds = r5     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r8, r3, r4)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r3 = r4.outMimeType     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r4 = "MicroMsg.snsMediaStorage"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r6.<init>()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r7 = "mineType "
            r6.append(r7)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r6.append(r3)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r6)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r4 = "webp"
            int r3 = r3.indexOf(r4)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            if (r3 < 0) goto L_0x0048
            if (r8 == 0) goto L_0x0044
            r8.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0051:
            r2 = move-exception
            r3 = r8
            goto L_0x0058
        L_0x0054:
            r3 = r8
            goto L_0x0062
        L_0x0057:
            r2 = move-exception
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            r3.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r2
        L_0x0061:
        L_0x0062:
            if (r3 == 0) goto L_0x0067
            r3.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.m131379CZ(java.lang.String):boolean");
    }

    /* renamed from: Lo */
    public static boolean m131380Lo(Bitmap bitmap, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean z = false;
        try {
            if (((C102150l) C86312j.m106911c(C102150l.class)).wx0(m131391jo(bitmap), str, str2, bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), bitmap.getHeight(), 0) == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z;
        } catch (OutOfMemoryError unused) {
            Log.m105928w("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip bmp OutOfMemoryError! rollback");
            SnsMethodCalculate.markEndTimeMs("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    /* renamed from: NQ */
    public static boolean m131381NQ() {
        SnsMethodCalculate.markStartTimeMs("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if ("hevc".equals(C90188n0.f258923Q)) {
            SnsMethodCalculate.markEndTimeMs("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        } else if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.snsMediaStorage", "isUseHevcUpload: hevc not support");
            SnsMethodCalculate.markEndTimeMs("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        } else {
            boolean ry02 = C94866e1.ry0();
            SnsMethodCalculate.markEndTimeMs("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return ry02;
        }
    }

    /* renamed from: Ow */
    public static boolean m131382Ow(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("createPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean bD = m131387bD(str, str2, str3, true);
        SnsMethodCalculate.markEndTimeMs("createPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return bD;
    }

    /* renamed from: SE */
    public static boolean m131383SE(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, String str3, boolean z, boolean z2) {
        int i4;
        int i5;
        SnsMethodCalculate.markStartTimeMs("createThumbNail", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
        if (imageOptions == null || (i4 = imageOptions.outWidth) <= 0 || (i5 = imageOptions.outHeight) <= 0) {
            SnsMethodCalculate.markEndTimeMs("createThumbNail", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        boolean TE = m131384TE(imageOptions, str, i4, i5, i, i2, compressFormat, i3, str2, str3, z, z2);
        SnsMethodCalculate.markEndTimeMs("createThumbNail", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return TE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0213, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0214, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0216, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0217, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0254, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0256, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0257, code lost:
        r4 = r18;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0260, code lost:
        r3 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG == false) goto L_0x00ac;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0213 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:96:0x0209] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0253 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:109:0x023b] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025f A[ExcHandler: IOException (e java.io.IOException), Splitter:B:44:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0282 A[SYNTHETIC, Splitter:B:136:0x0282] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a1 A[SYNTHETIC, Splitter:B:144:0x02a1] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x00ed A[EDGE_INSN: B:149:0x00ed->B:59:0x00ed ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4  */
    /* renamed from: TE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m131384TE(android.graphics.BitmapFactory.Options r35, java.lang.String r36, int r37, int r38, int r39, int r40, android.graphics.Bitmap.CompressFormat r41, int r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46) {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            java.lang.Class<h81.h> r10 = h81.C32735h.class
            java.lang.String r11 = "create thumbnail from orig failed: %s"
            java.lang.String r12 = "MicroMsg.snsMediaStorage"
            java.lang.String r13 = "createThumbNailUnScale"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.String r15 = "createThumbNailUnScale, srcWidth: %s, srcHeight: %s, width: %s, height: %s"
            r18 = r11
            r11 = 4
            java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r37)     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            r16 = 0
            r6[r16] = r19     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r38)     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            r17 = 1
            r6[r17] = r19     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r40)     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            r11 = 2
            r6[r11] = r19     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r39)     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            r20 = 3
            r6[r20] = r19     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r6)     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x0269, IOException -> 0x0267 }
            r15 = r12
            double r11 = (double) r3
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r23 = r11 * r21
            double r7 = (double) r4
            double r23 = r23 / r7
            r25 = r7
            double r7 = (double) r2
            double r27 = r7 * r21
            r29 = r7
            double r7 = (double) r5
            double r27 = r27 / r7
            if (r2 != r5) goto L_0x0077
            if (r3 != r4) goto L_0x0077
            android.graphics.Bitmap r0 = lr2.C99590a.m130020c(r1, r6, r0)     // Catch:{ OutOfMemoryError -> 0x0073, IOException -> 0x006f }
            r32 = r11
            r3 = r15
            goto L_0x0102
        L_0x006f:
            r0 = move-exception
            r3 = r15
            goto L_0x0274
        L_0x0073:
            r0 = move-exception
            r3 = r15
            goto L_0x026b
        L_0x0077:
            r31 = r15
            r15 = 1
            r6.inSampleSize = r15     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            if (r3 > r4) goto L_0x0084
            if (r2 <= r5) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r32 = r11
            goto L_0x00c9
        L_0x0084:
            di3.d r15 = di3.C86312j.m106911c(r10)     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            h81.h r15 = (h81.C32735h) r15     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_sns_use_high_thumb     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            r5 = 0
            int r4 = r15.mo58779Qe(r4, r5)     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            r5 = 1
            if (r5 != r4) goto L_0x0096
            r4 = 1
            goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            if (r5 != 0) goto L_0x00ab
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ OutOfMemoryError -> 0x00a4, IOException -> 0x025f }
            if (r5 != 0) goto L_0x00ab
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ OutOfMemoryError -> 0x00a4, IOException -> 0x025f }
            if (r5 == 0) goto L_0x00ac
            goto L_0x00ab
        L_0x00a4:
            r0 = move-exception
            r4 = r18
            r3 = r31
            goto L_0x026d
        L_0x00ab:
            r4 = 1
        L_0x00ac:
            int r5 = (r23 > r27 ? 1 : (r23 == r27 ? 0 : -1))
            r32 = r11
            if (r5 >= 0) goto L_0x00b5
            r11 = r27
            goto L_0x00b7
        L_0x00b5:
            r11 = r23
        L_0x00b7:
            int r11 = (int) r11
            if (r4 == 0) goto L_0x00c2
            if (r5 >= 0) goto L_0x00bf
            r4 = r23
            goto L_0x00c1
        L_0x00bf:
            r4 = r27
        L_0x00c1:
            int r11 = (int) r4
        L_0x00c2:
            r6.inSampleSize = r11     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            r4 = 1
            if (r11 > r4) goto L_0x00c9
            r6.inSampleSize = r4     // Catch:{ OutOfMemoryError -> 0x00a4, IOException -> 0x025f }
        L_0x00c9:
            di3.d r4 = di3.C86312j.m106911c(r10)     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_max_decode_pic_size     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            r10 = 10240000(0x9c4000, float:1.4349296E-38)
            int r4 = r4.mo58779Qe(r5, r10)     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            long r4 = (long) r4     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
        L_0x00d9:
            int r10 = r3 * r2
            int r11 = r6.inSampleSize     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            int r10 = r10 / r11
            int r10 = r10 / r11
            long r2 = (long) r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ed
            int r11 = r11 + 1
            r6.inSampleSize = r11     // Catch:{ OutOfMemoryError -> 0x00a4, IOException -> 0x025f }
            r2 = r37
            r3 = r38
            goto L_0x00d9
        L_0x00ed:
            java.lang.String r2 = "createThumbNailUnScale, sampleSize: %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            r5 = 0
            r4[r5] = r3     // Catch:{ OutOfMemoryError -> 0x0263, IOException -> 0x025f }
            r3 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            android.graphics.Bitmap r0 = lr2.C99590a.m130020c(r1, r6, r0)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
        L_0x0102:
            java.lang.String r2 = "createThumbNailUnScale, result bm: %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r4 = 0
            r5[r4] = r0     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r5)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            if (r0 != 0) goto L_0x0113
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r4
        L_0x0113:
            if (r46 == 0) goto L_0x01a2
            int r2 = (r23 > r27 ? 1 : (r23 == r27 ? 0 : -1))
            if (r2 >= 0) goto L_0x0127
            double r7 = r7 * r21
            double r7 = r7 * r32
            double r7 = r7 / r29
            double r4 = java.lang.Math.ceil(r7)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r2 = (int) r4     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r4 = r40
            goto L_0x0135
        L_0x0127:
            double r7 = r25 * r21
            double r7 = r7 * r29
            double r7 = r7 / r32
            double r4 = java.lang.Math.ceil(r7)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r2 = (int) r4     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r4 = r2
            r2 = r39
        L_0x0135:
            int r5 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r36)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r6 = 90
            if (r5 == r6) goto L_0x0147
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 != r6) goto L_0x0142
            goto L_0x0147
        L_0x0142:
            r34 = r4
            r4 = r2
            r2 = r34
        L_0x0147:
            java.lang.String r5 = "createThumbNailUnScale, bm.width: %s, bm.height: %s, newWidth: %s, newHeight: %s"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r7 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r8 = 0
            r6[r8] = r7     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r7 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r8 = 1
            r6[r8] = r7     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r8 = 2
            r6[r8] = r7     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r6[r20] = r7     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r6)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r5 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r4, r5)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            if (r2 == 0) goto L_0x0183
            if (r0 == r2) goto L_0x0182
            com.tencent.mm.memory.l r4 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r4.mo126912d(r0)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
        L_0x0182:
            r0 = r2
        L_0x0183:
            java.lang.String r2 = "createThumbNailUnScalebyUpload, bm.width: %s, bm.height: %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r5 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r6 = 0
            r4[r6] = r5     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r5 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r6 = 1
            r4[r6] = r5     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            goto L_0x01c0
        L_0x01a2:
            java.lang.String r2 = "createThumbNailUnScale, bm.width: %s, bm.height: %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r5 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r6 = 0
            r4[r6] = r5     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            int r5 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r6 = 1
            r4[r6] = r5     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
        L_0x01c0:
            boolean r2 = m131390gY()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            if (r2 == 0) goto L_0x0221
            if (r46 == 0) goto L_0x0221
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r4 = r43
            r2.append(r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r2.append(r9)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.String r2 = r2.toString()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            boolean r1 = m131380Lo(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            if (r1 != 0) goto L_0x0219
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.append(r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.append(r9)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.append(r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.append(r9)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r2 = 0
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r2)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r5 = r41
            r6 = r42
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToStream(r0, r6, r5, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0216, IOException -> 0x0213 }
            r1.close()     // Catch:{ OutOfMemoryError -> 0x0210, IOException -> 0x0213 }
            goto L_0x0219
        L_0x0210:
            r0 = move-exception
            r15 = r1
            goto L_0x024e
        L_0x0213:
            r0 = move-exception
            r15 = r1
            goto L_0x0254
        L_0x0216:
            r0 = move-exception
            r15 = r1
            goto L_0x0257
        L_0x0219:
            com.tencent.mm.memory.l r1 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.mo126912d(r0)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            goto L_0x0248
        L_0x0221:
            r5 = r41
            r6 = r42
            r4 = r43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.append(r4)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r1.append(r9)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            r2 = 0
            java.io.OutputStream r15 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r2)     // Catch:{ OutOfMemoryError -> 0x025d, IOException -> 0x025b }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToStream(r0, r6, r5, r15, r2)     // Catch:{ OutOfMemoryError -> 0x0256, IOException -> 0x0253 }
            com.tencent.mm.memory.l r1 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ OutOfMemoryError -> 0x024d, IOException -> 0x0253 }
            r1.mo126912d(r0)     // Catch:{ OutOfMemoryError -> 0x024d, IOException -> 0x0253 }
            r15.close()     // Catch:{ OutOfMemoryError -> 0x024d, IOException -> 0x0253 }
        L_0x0248:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            r1 = 1
            return r1
        L_0x024d:
            r0 = move-exception
        L_0x024e:
            r4 = r18
            r1 = 1
            r2 = 0
            goto L_0x028f
        L_0x0253:
            r0 = move-exception
        L_0x0254:
            r1 = 1
            goto L_0x0276
        L_0x0256:
            r0 = move-exception
        L_0x0257:
            r4 = r18
            r1 = 1
            goto L_0x028f
        L_0x025b:
            r0 = move-exception
            goto L_0x0274
        L_0x025d:
            r0 = move-exception
            goto L_0x026b
        L_0x025f:
            r0 = move-exception
            r3 = r31
            goto L_0x0274
        L_0x0263:
            r0 = move-exception
            r3 = r31
            goto L_0x026b
        L_0x0267:
            r0 = move-exception
            goto L_0x0273
        L_0x0269:
            r0 = move-exception
            r3 = r12
        L_0x026b:
            r4 = r18
        L_0x026d:
            r1 = 1
            r2 = 0
            goto L_0x028e
        L_0x0270:
            r0 = move-exception
            r18 = r11
        L_0x0273:
            r3 = r12
        L_0x0274:
            r1 = 1
            r15 = 0
        L_0x0276:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            r4 = r18
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r1)
            if (r15 == 0) goto L_0x0285
            r15.close()     // Catch:{ IOException -> 0x0285 }
        L_0x0285:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r2
        L_0x0289:
            r0 = move-exception
            r4 = r11
            r3 = r12
            r2 = 0
            r1 = 1
        L_0x028e:
            r15 = 0
        L_0x028f:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r1)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1487(0x5cf, double:7.347E-321)
            r3 = 1
            r0.mo175912v(r1, r3)
            if (r15 == 0) goto L_0x02a4
            r15.close()     // Catch:{ IOException -> 0x02a4 }
        L_0x02a4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.m131384TE(android.graphics.BitmapFactory$Options, java.lang.String, int, int, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    /* renamed from: TY */
    public static boolean m131385TY() {
        SnsMethodCalculate.markStartTimeMs("isUseWxpcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if ("wxpc".equals(C90188n0.f258923Q)) {
            SnsMethodCalculate.markEndTimeMs("isUseWxpcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        boolean sy02 = C94866e1.sy0();
        SnsMethodCalculate.markEndTimeMs("isUseWxpcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return sy02;
    }

    /* renamed from: Yt */
    public static boolean m131386Yt(Bitmap bitmap, String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("convertImg2WxamZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean z = false;
        try {
            if (((C102150l) C86312j.m106911c(C102150l.class)).wx0(m131391jo(bitmap), str, str2, bitmap.getWidth(), bitmap.getHeight(), i, i2, 0) == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("convertImg2WxamZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z;
        } catch (OutOfMemoryError unused) {
            Log.m105928w("MicroMsg.snsMediaStorage", "convertImg2WxamZip bmp OutOfMemoryError! rollback");
            SnsMethodCalculate.markEndTimeMs("convertImg2WxamZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    public static boolean b00(BitmapFactory.Options options) {
        SnsMethodCalculate.markStartTimeMs("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (options == null) {
            SnsMethodCalculate.markEndTimeMs("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        String str = options.outMimeType;
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        } else if (str.toLowerCase().indexOf("wxam") >= 0) {
            SnsMethodCalculate.markEndTimeMs("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x039b A[SYNTHETIC, Splitter:B:105:0x039b] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x07c7  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x09de A[SYNTHETIC, Splitter:B:329:0x09de] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0324 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0372  */
    /* renamed from: bD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m131387bD(java.lang.String r36, java.lang.String r37, java.lang.String r38, boolean r39) {
        /*
            r12 = r36
            r13 = r37
            r14 = r38
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            java.lang.String r15 = "createPic"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r11)
            android.graphics.BitmapFactory$Options r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r37)
            boolean r10 = m131378CP(r2)
            boolean r3 = m131396vP(r2)
            boolean r16 = b00(r2)
            java.lang.String r7 = "MicroMsg.snsMediaStorage"
            r5 = 0
            r20 = -1
            if (r39 == 0) goto L_0x01df
            r0 = 60
            boolean r22 = m131389fY()     // Catch:{ Exception -> 0x01a7 }
            if (r22 != 0) goto L_0x00a3
            boolean r22 = m131381NQ()     // Catch:{ Exception -> 0x01a7 }
            if (r22 != 0) goto L_0x00a3
            boolean r22 = m131385TY()     // Catch:{ Exception -> 0x01a7 }
            if (r22 != 0) goto L_0x00a3
            boolean r22 = m131390gY()     // Catch:{ Exception -> 0x01a7 }
            if (r22 == 0) goto L_0x0041
            goto L_0x00a3
        L_0x0041:
            android.content.Context r22 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a7 }
            boolean r22 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r22)     // Catch:{ Exception -> 0x01a7 }
            if (r22 == 0) goto L_0x0065
            k40.a r22 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a7 }
            lc3.b r22 = (lc3.C10485b) r22     // Catch:{ Exception -> 0x01a7 }
            pj.f r4 = r22.vh0()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "SnsCompressPicLevelForWifi"
            java.lang.String r4 = r4.mo107405c(r9)     // Catch:{ Exception -> 0x01a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01a7 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0118
        L_0x0065:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a7 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r4)     // Catch:{ Exception -> 0x01a7 }
            if (r4 == 0) goto L_0x0089
            k40.a r4 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a7 }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x01a7 }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "SnsCompressPicLevelFor2G"
            java.lang.String r4 = r4.mo107405c(r9)     // Catch:{ Exception -> 0x01a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01a7 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0118
        L_0x0089:
            k40.a r4 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a7 }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x01a7 }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "SnsCompressPicLevelFor3G"
            java.lang.String r4 = r4.mo107405c(r9)     // Catch:{ Exception -> 0x01a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01a7 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0118
        L_0x00a3:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a7 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r4)     // Catch:{ Exception -> 0x01a7 }
            if (r4 == 0) goto L_0x00c4
            k40.a r4 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a7 }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x01a7 }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "SnsWebpCompressPicLevelForWifi"
            java.lang.String r4 = r4.mo107405c(r9)     // Catch:{ Exception -> 0x01a7 }
            r9 = 70
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r9)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0118
        L_0x00c4:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a7 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r4)     // Catch:{ Exception -> 0x01a7 }
            if (r4 == 0) goto L_0x00e5
            k40.a r4 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a7 }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x01a7 }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "SnsWebpCompressPicLevelFor2G"
            java.lang.String r4 = r4.mo107405c(r9)     // Catch:{ Exception -> 0x01a7 }
            r9 = 70
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r9)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0118
        L_0x00e5:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01a7 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r4)     // Catch:{ Exception -> 0x01a7 }
            if (r4 == 0) goto L_0x0104
            k40.a r4 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a7 }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x01a7 }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "SnsWebpCompressPicLevelFor3G"
            java.lang.String r4 = r4.mo107405c(r9)     // Catch:{ Exception -> 0x01a7 }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r0)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0118
        L_0x0104:
            k40.a r4 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a7 }
            lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x01a7 }
            pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "SnsWebpCompressPicLevelFor4G"
            java.lang.String r4 = r4.mo107405c(r9)     // Catch:{ Exception -> 0x01a7 }
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r0)     // Catch:{ Exception -> 0x01a7 }
        L_0x0118:
            java.lang.String r9 = "createPic comLev---webpWifi:%s, webp2G:%s, webp3G:%s,webp4G:%s   wifi:%s, 2G:%s, 3G:%s"
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x01a5 }
            k40.a r25 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a5 }
            lc3.b r25 = (lc3.C10485b) r25     // Catch:{ Exception -> 0x01a5 }
            pj.f r8 = r25.vh0()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r6 = "SnsWebpCompressPicLevelForWifi"
            java.lang.String r6 = r8.mo107405c(r6)     // Catch:{ Exception -> 0x01a5 }
            r0[r5] = r6     // Catch:{ Exception -> 0x01a5 }
            k40.a r6 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a5 }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x01a5 }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r8 = "SnsWebpCompressPicLevelFor2G"
            java.lang.String r6 = r6.mo107405c(r8)     // Catch:{ Exception -> 0x01a5 }
            r8 = 1
            r0[r8] = r6     // Catch:{ Exception -> 0x01a5 }
            k40.a r6 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a5 }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x01a5 }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r8 = "SnsWebpCompressPicLevelFor3G"
            java.lang.String r6 = r6.mo107405c(r8)     // Catch:{ Exception -> 0x01a5 }
            r8 = 2
            r0[r8] = r6     // Catch:{ Exception -> 0x01a5 }
            k40.a r6 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a5 }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x01a5 }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r8 = "SnsWebpCompressPicLevelFor4G"
            java.lang.String r6 = r6.mo107405c(r8)     // Catch:{ Exception -> 0x01a5 }
            r8 = 3
            r0[r8] = r6     // Catch:{ Exception -> 0x01a5 }
            k40.a r6 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a5 }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x01a5 }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r8 = "SnsCompressPicLevelForWifi"
            java.lang.String r6 = r6.mo107405c(r8)     // Catch:{ Exception -> 0x01a5 }
            r8 = 4
            r0[r8] = r6     // Catch:{ Exception -> 0x01a5 }
            k40.a r6 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a5 }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x01a5 }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r8 = "SnsCompressPicLevelFor2G"
            java.lang.String r6 = r6.mo107405c(r8)     // Catch:{ Exception -> 0x01a5 }
            r8 = 5
            r0[r8] = r6     // Catch:{ Exception -> 0x01a5 }
            k40.a r6 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x01a5 }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x01a5 }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r8 = "SnsCompressPicLevelFor3G"
            java.lang.String r6 = r6.mo107405c(r8)     // Catch:{ Exception -> 0x01a5 }
            r8 = 6
            r0[r8] = r6     // Catch:{ Exception -> 0x01a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r9, r0)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01aa
        L_0x01a5:
            goto L_0x01aa
        L_0x01a7:
            r4 = 100
        L_0x01aa:
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r0[r5] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r39)
            r8 = 1
            r0[r8] = r6
            java.lang.String r6 = "CompresssnsPicLevel-level:%d isUpload: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r0)
            r6 = 10
            if (r4 <= r6) goto L_0x01ca
            r0 = 100
            if (r4 <= r0) goto L_0x01c8
            goto L_0x01ca
        L_0x01c8:
            r0 = r4
            goto L_0x01cc
        L_0x01ca:
            r0 = 60
        L_0x01cc:
            if (r3 == 0) goto L_0x01dc
            int r4 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r37)
            if (r4 >= r0) goto L_0x01da
            r6 = 25
            if (r4 <= r6) goto L_0x01da
            r8 = r4
            goto L_0x01e2
        L_0x01da:
            r8 = r0
            goto L_0x01e2
        L_0x01dc:
            r8 = r0
            r4 = -1
            goto L_0x01e2
        L_0x01df:
            r4 = -1
            r8 = 100
        L_0x01e2:
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r37)
            int r6 = (int) r5
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r5 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r0[r5] = r9
            java.lang.String r5 = "FaceCnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r0)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x02dc }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r5)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r0 = "\\*"
            if (r5 == 0) goto L_0x0236
            k40.a r5 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x02dc }
            lc3.b r5 = (lc3.C10485b) r5     // Catch:{ Exception -> 0x02dc }
            pj.f r5 = r5.vh0()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r9 = "SnsCompressResolutionForWifi"
            java.lang.String r5 = r5.mo107405c(r9)     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r9 = r5.split(r0)     // Catch:{ Exception -> 0x02dc }
            r24 = 0
            r27 = r9[r24]     // Catch:{ Exception -> 0x02dc }
            java.lang.Integer r24 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x02dc }
            int r24 = r24.intValue()     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r0 = r5.split(r0)     // Catch:{ Exception -> 0x0233 }
            r5 = 1
            r0 = r0[r5]     // Catch:{ Exception -> 0x0233 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0233 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0233 }
            goto L_0x02d9
        L_0x0233:
            goto L_0x02df
        L_0x0236:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x02dc }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r5)     // Catch:{ Exception -> 0x02dc }
            if (r5 == 0) goto L_0x0270
            k40.a r5 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x02dc }
            lc3.b r5 = (lc3.C10485b) r5     // Catch:{ Exception -> 0x02dc }
            pj.f r5 = r5.vh0()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r9 = "SnsCompressResolutionFor2G"
            java.lang.String r5 = r5.mo107405c(r9)     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r9 = r5.split(r0)     // Catch:{ Exception -> 0x02dc }
            r24 = 0
            r27 = r9[r24]     // Catch:{ Exception -> 0x02dc }
            java.lang.Integer r24 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x02dc }
            int r24 = r24.intValue()     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r0 = r5.split(r0)     // Catch:{ Exception -> 0x0233 }
            r5 = 1
            r0 = r0[r5]     // Catch:{ Exception -> 0x0233 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0233 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0233 }
            goto L_0x02d9
        L_0x0270:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x02dc }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r5)     // Catch:{ Exception -> 0x02dc }
            if (r5 == 0) goto L_0x02aa
            k40.a r5 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x02dc }
            lc3.b r5 = (lc3.C10485b) r5     // Catch:{ Exception -> 0x02dc }
            pj.f r5 = r5.vh0()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r9 = "SnsCompressResolutionFor3G"
            java.lang.String r5 = r5.mo107405c(r9)     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r9 = r5.split(r0)     // Catch:{ Exception -> 0x02dc }
            r24 = 0
            r27 = r9[r24]     // Catch:{ Exception -> 0x02dc }
            java.lang.Integer r24 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x02dc }
            int r24 = r24.intValue()     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r0 = r5.split(r0)     // Catch:{ Exception -> 0x0233 }
            r5 = 1
            r0 = r0[r5]     // Catch:{ Exception -> 0x0233 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0233 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0233 }
            goto L_0x02d9
        L_0x02aa:
            k40.a r5 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x02dc }
            lc3.b r5 = (lc3.C10485b) r5     // Catch:{ Exception -> 0x02dc }
            pj.f r5 = r5.vh0()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r9 = "SnsCompressResolutionFor4G"
            java.lang.String r5 = r5.mo107405c(r9)     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r9 = r5.split(r0)     // Catch:{ Exception -> 0x02dc }
            r24 = 0
            r27 = r9[r24]     // Catch:{ Exception -> 0x02dc }
            java.lang.Integer r24 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x02dc }
            int r24 = r24.intValue()     // Catch:{ Exception -> 0x02dc }
            java.lang.String[] r0 = r5.split(r0)     // Catch:{ Exception -> 0x0233 }
            r5 = 1
            r0 = r0[r5]     // Catch:{ Exception -> 0x0233 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0233 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0233 }
        L_0x02d9:
            r5 = r24
            goto L_0x02e3
        L_0x02dc:
            r24 = 0
        L_0x02df:
            r5 = r24
            r0 = 1080(0x438, float:1.513E-42)
        L_0x02e3:
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r19 = java.lang.Integer.valueOf(r5)
            r24 = 0
            r9[r24] = r19
            java.lang.Integer r24 = java.lang.Integer.valueOf(r0)
            r25 = 1
            r9[r25] = r24
            int r24 = f294139g
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r26 = 2
            r9[r26] = r24
            int r24 = f294138f
            java.lang.Integer r24 = java.lang.Integer.valueOf(r24)
            r22 = 3
            r9[r22] = r24
            java.lang.Integer r24 = java.lang.Integer.valueOf(r8)
            r23 = 4
            r9[r23] = r24
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r39)
            r21 = 5
            r9[r21] = r23
            r21 = r8
            java.lang.String r8 = "server target conf_long config_short %d %d screen %d %d comLev: %d isUpload%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)
            if (r5 > 0) goto L_0x0327
            if (r0 > 0) goto L_0x0327
            goto L_0x032b
        L_0x0327:
            r8 = 2160(0x870, float:3.027E-42)
            if (r0 < r8) goto L_0x032f
        L_0x032b:
            r5 = 1080(0x438, float:1.513E-42)
            r9 = 0
            goto L_0x033b
        L_0x032f:
            if (r0 > 0) goto L_0x0339
            r8 = 3240(0xca8, float:4.54E-42)
            if (r5 <= r8) goto L_0x0339
            r9 = 1620(0x654, float:2.27E-42)
            r5 = 0
            goto L_0x033b
        L_0x0339:
            r9 = r5
            r5 = r0
        L_0x033b:
            k40.a r0 = f40.C86709a0.m107533q(r1)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r8 = "PicCompressAvoidanceActiveSizeNormal"
            java.lang.String r0 = r0.mo107405c(r8)
            r8 = 100
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r8)
            if (r0 > 0) goto L_0x0355
            r0 = 100
        L_0x0355:
            int r8 = r0 * 1024
            k40.a r0 = f40.C86709a0.m107533q(r1)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r20 = r11
            java.lang.String r11 = "PicCompressAvoidanceActiveSizeLong"
            java.lang.String r0 = r0.mo107405c(r11)
            r11 = 200(0xc8, float:2.8E-43)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)
            if (r0 > 0) goto L_0x0372
            goto L_0x0373
        L_0x0372:
            r11 = r0
        L_0x0373:
            int r11 = r11 * 1024
            k40.a r0 = f40.C86709a0.m107533q(r1)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r23 = r11
            java.lang.String r11 = "PicCompressAvoidanceRemainderPerc"
            java.lang.String r0 = r0.mo107405c(r11)
            r11 = 10
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)
            if (r0 <= 0) goto L_0x0397
            r11 = 100
            if (r0 < r11) goto L_0x0394
            goto L_0x0397
        L_0x0394:
            r17 = r0
            goto L_0x0399
        L_0x0397:
            r17 = 10
        L_0x0399:
            if (r3 == 0) goto L_0x03c9
            com.tencent.mm.compatible.util.Exif r0 = com.tencent.p014mm.compatible.util.Exif.fromFile(r37)     // Catch:{ Exception -> 0x03ac }
            if (r0 == 0) goto L_0x03a8
            int r0 = r0.getOrientationInDegree()     // Catch:{ Exception -> 0x03ac }
            int r0 = r0 % 360
            goto L_0x03a9
        L_0x03a8:
            r0 = 0
        L_0x03a9:
            r24 = r15
            goto L_0x03cf
        L_0x03ac:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r24 = r15
            java.lang.String r15 = "get degree error "
            r11.append(r15)
            java.lang.String r0 = r0.getMessage()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            r0 = 0
            goto L_0x03cf
        L_0x03c9:
            r24 = r15
            int r0 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r37)
        L_0x03cf:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = "option info "
            r11.append(r15)
            int r15 = r2.outWidth
            r11.append(r15)
            java.lang.String r15 = " "
            r11.append(r15)
            int r13 = r2.outHeight
            r11.append(r13)
            r11.append(r15)
            r11.append(r10)
            java.lang.String r13 = " origQuality: "
            r11.append(r13)
            r11.append(r4)
            java.lang.String r4 = " degree:"
            r11.append(r4)
            r11.append(r0)
            java.lang.String r4 = " filelen "
            r11.append(r4)
            r11.append(r6)
            java.lang.String r4 = " target "
            r11.append(r4)
            r11.append(r9)
            r11.append(r15)
            r11.append(r5)
            java.lang.String r4 = " isJpeg:"
            r11.append(r4)
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r3 = "CompressLongImageRatio"
            java.lang.String r1 = r1.mo107405c(r3)
            r3 = 10
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r3)
            int r3 = r2.outWidth
            int r4 = r2.outHeight
            int r1 = r4 * 2
            r27 = 100
            java.lang.String r13 = "filelen %d newFileLen %d picCompressAvoidanceRemainderPerc %d"
            r29 = 0
            if (r3 >= r1) goto L_0x07c7
            int r1 = r3 * 2
            if (r4 < r1) goto L_0x044d
            goto L_0x07c7
        L_0x044d:
            if (r6 >= r8) goto L_0x04df
            if (r10 == 0) goto L_0x04df
            if (r0 != 0) goto L_0x04df
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "filelen is control in picCompressAvoidanceActiveSizeNormal "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            boolean r0 = m131390gY()
            if (r0 == 0) goto L_0x04bb
            if (r39 == 0) goto L_0x04bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r15 = r37
            boolean r0 = m131395qq(r15, r0)
            if (r0 != 0) goto L_0x04b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r15, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x04b1
            r6 = 1
            goto L_0x04b2
        L_0x04b1:
            r6 = 0
        L_0x04b2:
            r0 = r6
        L_0x04b3:
            r11 = r20
            r8 = r24
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)
            return r0
        L_0x04bb:
            r15 = r37
            r11 = r20
            r8 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r15, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x04da
            r6 = 1
            goto L_0x04db
        L_0x04da:
            r6 = 0
        L_0x04db:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)
            return r6
        L_0x04df:
            r15 = r37
            r11 = r20
            r8 = r24
            if (r3 <= r4) goto L_0x04e9
            r1 = r3
            goto L_0x04ea
        L_0x04e9:
            r1 = r4
        L_0x04ea:
            r18 = r4
            if (r3 >= r4) goto L_0x04ef
            r4 = r3
        L_0x04ef:
            if (r5 <= 0) goto L_0x04f6
            if (r4 <= r5) goto L_0x04f4
            goto L_0x04f6
        L_0x04f4:
            r5 = 3
            goto L_0x04fb
        L_0x04f6:
            if (r5 > 0) goto L_0x06b4
            if (r1 > r9) goto L_0x06b4
            goto L_0x04f4
        L_0x04fb:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r1[r4] = r3
            int r3 = r2.outWidth
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r1[r4] = r3
            int r3 = r2.outHeight
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r16 = 2
            r1[r16] = r3
            java.lang.String r3 = "hello ieg this is little img  %d w: %d h: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r1)
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r37)
            r22 = 71680(0x11800, double:3.54146E-319)
            int r1 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r1 >= 0) goto L_0x05c5
            if (r10 == 0) goto L_0x05a0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r9 = 0
            r0[r9] = r15
            java.lang.String r1 = "isSysSupportedPic %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            boolean r0 = m131390gY()
            if (r0 == 0) goto L_0x0582
            if (r39 == 0) goto L_0x0582
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            boolean r0 = m131395qq(r15, r0)
            if (r0 != 0) goto L_0x057e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r15, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x057c
            r6 = 1
            goto L_0x057d
        L_0x057c:
            r6 = 0
        L_0x057d:
            r0 = r6
        L_0x057e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)
            return r0
        L_0x0582:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r15, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x059b
            r6 = 1
            goto L_0x059c
        L_0x059b:
            r6 = 0
        L_0x059c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)
            return r6
        L_0x05a0:
            r9 = 0
            int r3 = r2.outWidth
            r1 = 150(0x96, float:2.1E-43)
            if (r3 >= r1) goto L_0x05c6
            int r1 = r2.outHeight
            r4 = 150(0x96, float:2.1E-43)
            if (r1 >= r4) goto L_0x05c6
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 1
            r2 = r1
            r1 = r37
            r5 = r21
            r6 = r36
            r7 = r38
            r10 = r8
            r8 = r0
            r9 = r39
            boolean r0 = m131383SE(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return r0
        L_0x05c5:
            r9 = 0
        L_0x05c6:
            int r3 = r2.outHeight
            int r4 = r2.outWidth
            android.graphics.Bitmap$CompressFormat r18 = android.graphics.Bitmap.CompressFormat.JPEG
            r19 = 1
            r1 = r37
            r2 = r3
            r3 = r4
            r20 = 1
            r4 = r18
            r9 = 3
            r5 = r21
            r20 = r6
            r6 = r36
            r22 = r11
            r11 = r7
            r7 = r38
            r31 = r8
            r24 = 2
            r8 = r19
            r15 = 3
            r9 = r39
            boolean r1 = m131383SE(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r10 == 0) goto L_0x06ac
            if (r0 != 0) goto L_0x06ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r15 = 0
            r0[r15] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r8 = 1
            r0[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r0[r24] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r0)
            r7 = r20
            long r4 = (long) r7
            long r4 = r4 - r2
            long r4 = r4 * r27
            int r0 = r17 * r7
            long r2 = (long) r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x06a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            boolean r0 = m131390gY()
            if (r0 == 0) goto L_0x0680
            if (r39 == 0) goto L_0x0680
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r6 = r37
            boolean r0 = m131395qq(r6, r0)
            if (r0 != 0) goto L_0x0678
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r6, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x0676
            r6 = 1
            goto L_0x0677
        L_0x0676:
            r6 = 0
        L_0x0677:
            r0 = r6
        L_0x0678:
            r4 = r22
            r2 = r31
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return r0
        L_0x0680:
            r6 = r37
            r4 = r22
            r2 = r31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r6, r0)
            int r3 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r3 < 0) goto L_0x069f
            r6 = 1
            goto L_0x06a0
        L_0x069f:
            r6 = 0
        L_0x06a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return r6
        L_0x06a4:
            r4 = r22
            r2 = r31
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return r1
        L_0x06ac:
            r4 = r22
            r2 = r31
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return r1
        L_0x06b4:
            r32 = r8
            r4 = r11
            r8 = 1
            r24 = 2
            r11 = r7
            r7 = r6
            r6 = r15
            r15 = 3
            if (r5 <= 0) goto L_0x06e2
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = r2
            r2 = r37
            r19 = r4
            r4 = r18
            r6 = r9
            r9 = r7
            r7 = r21
            r8 = r36
            r20 = r9
            r9 = r38
            r22 = r10
            r10 = r39
            r33 = r11
            r34 = r19
            r11 = r16
            boolean r1 = m131388bF(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x070a
        L_0x06e2:
            r34 = r4
            r20 = r7
            r22 = r10
            r33 = r11
            double r1 = (double) r1
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 * r4
            double r4 = (double) r9
            double r1 = r1 / r4
            double r3 = (double) r3
            double r3 = r3 / r1
            int r3 = (int) r3
            r4 = r18
            double r4 = (double) r4
            double r4 = r4 / r1
            int r2 = (int) r4
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            r8 = 1
            r1 = r37
            r5 = r21
            r6 = r36
            r7 = r38
            r9 = r39
            boolean r1 = m131383SE(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x070a:
            if (r22 == 0) goto L_0x07bf
            if (r0 != 0) goto L_0x07bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r5 = 0
            r0[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r6 = 1
            r0[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r0[r24] = r4
            r7 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r0)
            r8 = r20
            long r9 = (long) r8
            long r9 = r9 - r2
            long r9 = r9 * r27
            int r0 = r17 * r8
            long r2 = (long) r0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x07bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            boolean r0 = m131390gY()
            if (r0 == 0) goto L_0x079c
            if (r39 == 0) goto L_0x079c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1 = r37
            boolean r0 = m131395qq(r1, r0)
            if (r0 != 0) goto L_0x0794
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x0792
            goto L_0x0793
        L_0x0792:
            r6 = 0
        L_0x0793:
            r0 = r6
        L_0x0794:
            r11 = r32
            r10 = r34
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r0
        L_0x079c:
            r1 = r37
            r11 = r32
            r10 = r34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x07ba
            goto L_0x07bb
        L_0x07ba:
            r6 = 0
        L_0x07bb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r6
        L_0x07bf:
            r11 = r32
            r10 = r34
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r1
        L_0x07c7:
            r1 = r37
            r8 = r6
            r22 = r10
            r5 = r15
            r10 = r20
            r11 = r24
            r6 = 1
            r9 = 0
            r15 = 3
            r24 = 2
            int r3 = r3 * r4
            r4 = 10240000(0x9c4000, float:1.4349296E-38)
            if (r3 > r4) goto L_0x09ef
            r3 = r23
            if (r8 >= r3) goto L_0x0863
            if (r22 == 0) goto L_0x0863
            if (r0 != 0) goto L_0x0863
            boolean r0 = m131390gY()
            if (r0 == 0) goto L_0x0832
            if (r39 == 0) goto L_0x0832
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            boolean r0 = m131395qq(r1, r0)
            if (r0 != 0) goto L_0x082e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x082c
            goto L_0x082d
        L_0x082c:
            r6 = 0
        L_0x082d:
            r0 = r6
        L_0x082e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r0
        L_0x0832:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "filelen is control in picCompressAvoidanceActiveSizeLong "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x085e
            goto L_0x085f
        L_0x085e:
            r6 = 0
        L_0x085f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r6
        L_0x0863:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r2)
            r3 = 0
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106423E(r37)     // Catch:{ IOException -> 0x09c0 }
            boolean r4 = r3.markSupported()     // Catch:{ IOException -> 0x09c0 }
            if (r4 != 0) goto L_0x087c
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x09c0 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x09c0 }
            r3 = r4
        L_0x087c:
            r4 = 1048576(0x100000, float:1.469368E-39)
            r3.mark(r4)     // Catch:{ IOException -> 0x09c0 }
            r4 = 0
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r3, r4, r2)     // Catch:{ IOException -> 0x09c0 }
            r3.reset()     // Catch:{ IOException -> 0x09c0 }
            if (r2 != 0) goto L_0x0892
            r3.close()     // Catch:{ IOException -> 0x088e }
        L_0x088e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r9
        L_0x0892:
            float r4 = (float) r0
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r2, r4)     // Catch:{ IOException -> 0x09c0 }
            boolean r4 = m131390gY()     // Catch:{ IOException -> 0x09c0 }
            if (r4 == 0) goto L_0x08e8
            if (r39 == 0) goto L_0x08e8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09c0 }
            r4.<init>()     // Catch:{ IOException -> 0x09c0 }
            r4.append(r12)     // Catch:{ IOException -> 0x09c0 }
            r4.append(r14)     // Catch:{ IOException -> 0x09c0 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x09c0 }
            boolean r4 = m131380Lo(r2, r1, r4)     // Catch:{ IOException -> 0x09c0 }
            if (r4 != 0) goto L_0x08dc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09c0 }
            r4.<init>()     // Catch:{ IOException -> 0x09c0 }
            r4.append(r12)     // Catch:{ IOException -> 0x09c0 }
            r4.append(r14)     // Catch:{ IOException -> 0x09c0 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x09c0 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ IOException -> 0x09c0 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x09c0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09c0 }
            r5.<init>()     // Catch:{ IOException -> 0x09c0 }
            r5.append(r12)     // Catch:{ IOException -> 0x09c0 }
            r5.append(r14)     // Catch:{ IOException -> 0x09c0 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x09c0 }
            r9 = r21
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, r9, r4, r5, r6)     // Catch:{ IOException -> 0x09c0 }
        L_0x08dc:
            if (r2 == 0) goto L_0x08fe
            boolean r4 = r2.isRecycled()     // Catch:{ IOException -> 0x09c0 }
            if (r4 != 0) goto L_0x08fe
            r2.recycle()     // Catch:{ IOException -> 0x09c0 }
            goto L_0x08fe
        L_0x08e8:
            r9 = r21
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x09c0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09c0 }
            r5.<init>()     // Catch:{ IOException -> 0x09c0 }
            r5.append(r12)     // Catch:{ IOException -> 0x09c0 }
            r5.append(r14)     // Catch:{ IOException -> 0x09c0 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x09c0 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, r9, r4, r5, r6)     // Catch:{ IOException -> 0x09c0 }
        L_0x08fe:
            if (r22 == 0) goto L_0x09b6
            if (r0 != 0) goto L_0x09b6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09c0 }
            r0.<init>()     // Catch:{ IOException -> 0x09c0 }
            r0.append(r12)     // Catch:{ IOException -> 0x09c0 }
            r0.append(r14)     // Catch:{ IOException -> 0x09c0 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x09c0 }
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)     // Catch:{ IOException -> 0x09c0 }
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ IOException -> 0x09c0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x09c0 }
            r9 = 0
            r0[r9] = r2     // Catch:{ IOException -> 0x09c0 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x09c0 }
            r0[r6] = r2     // Catch:{ IOException -> 0x09c0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x09c0 }
            r0[r24] = r2     // Catch:{ IOException -> 0x09c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r0)     // Catch:{ IOException -> 0x09c0 }
            r33 = r7
            long r6 = (long) r8
            long r6 = r6 - r4
            long r6 = r6 * r27
            int r0 = r17 * r8
            long r4 = (long) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x09ae
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09ac }
            r0.<init>()     // Catch:{ IOException -> 0x09ac }
            r0.append(r12)     // Catch:{ IOException -> 0x09ac }
            r0.append(r14)     // Catch:{ IOException -> 0x09ac }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x09ac }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ IOException -> 0x09ac }
            boolean r0 = m131390gY()     // Catch:{ IOException -> 0x09ac }
            if (r0 == 0) goto L_0x098b
            if (r39 == 0) goto L_0x098b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09ac }
            r0.<init>()     // Catch:{ IOException -> 0x09ac }
            r0.append(r12)     // Catch:{ IOException -> 0x09ac }
            r0.append(r14)     // Catch:{ IOException -> 0x09ac }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x09ac }
            boolean r0 = m131395qq(r1, r0)     // Catch:{ IOException -> 0x09ac }
            if (r0 != 0) goto L_0x0984
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09ac }
            r0.<init>()     // Catch:{ IOException -> 0x09ac }
            r0.append(r12)     // Catch:{ IOException -> 0x09ac }
            r0.append(r14)     // Catch:{ IOException -> 0x09ac }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x09ac }
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)     // Catch:{ IOException -> 0x09ac }
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x0982
            r6 = 1
            goto L_0x0983
        L_0x0982:
            r6 = 0
        L_0x0983:
            r0 = r6
        L_0x0984:
            r3.close()     // Catch:{ IOException -> 0x0987 }
        L_0x0987:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r0
        L_0x098b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x09ac }
            r0.<init>()     // Catch:{ IOException -> 0x09ac }
            r0.append(r12)     // Catch:{ IOException -> 0x09ac }
            r0.append(r14)     // Catch:{ IOException -> 0x09ac }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x09ac }
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)     // Catch:{ IOException -> 0x09ac }
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x09a4
            r6 = 1
            goto L_0x09a5
        L_0x09a4:
            r6 = 0
        L_0x09a5:
            r3.close()     // Catch:{ IOException -> 0x09a8 }
        L_0x09a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r6
        L_0x09ac:
            r0 = move-exception
            goto L_0x09c3
        L_0x09ae:
            r3.close()     // Catch:{ IOException -> 0x09b1 }
        L_0x09b1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            r1 = 1
            return r1
        L_0x09b6:
            r3.close()     // Catch:{ IOException -> 0x09b9 }
        L_0x09b9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            r1 = 1
            return r1
        L_0x09be:
            r0 = move-exception
            goto L_0x09e6
        L_0x09c0:
            r0 = move-exception
            r33 = r7
        L_0x09c3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x09be }
            r2.<init>()     // Catch:{ all -> 0x09be }
            java.lang.String r4 = "Decode bitmap failed: "
            r2.append(r4)     // Catch:{ all -> 0x09be }
            r2.append(r1)     // Catch:{ all -> 0x09be }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x09be }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x09be }
            r6 = r33
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r1, r4)     // Catch:{ all -> 0x09be }
            if (r3 == 0) goto L_0x09e1
            r3.close()     // Catch:{ IOException -> 0x09e1 }
        L_0x09e1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            r1 = 0
            return r1
        L_0x09e6:
            if (r3 == 0) goto L_0x09eb
            r3.close()     // Catch:{ IOException -> 0x09eb }
        L_0x09eb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            throw r0
        L_0x09ef:
            r6 = r7
            r9 = r21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "too max pic "
            r0.append(r3)
            int r3 = r2.outWidth
            r0.append(r3)
            r0.append(r5)
            int r3 = r2.outHeight
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            int r0 = r2.outHeight
            r3 = 1
            if (r0 > 0) goto L_0x0a18
            r2.outHeight = r3
        L_0x0a18:
            int r0 = r2.outWidth
            if (r0 > 0) goto L_0x0a1e
            r2.outWidth = r3
        L_0x0a1e:
            int r0 = r2.outWidth
            int r4 = r2.outHeight
            if (r0 <= r4) goto L_0x0a26
            int r0 = r0 / r4
            goto L_0x0a28
        L_0x0a26:
            int r4 = r4 / r0
            r0 = r4
        L_0x0a28:
            if (r0 != 0) goto L_0x0a2b
            r0 = 1
        L_0x0a2b:
            r3 = 10240000(0x9c4000, float:1.4349296E-38)
            int r3 = r3 / r0
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            int r3 = (int) r3
            int r4 = r2.outWidth
            int r2 = r2.outHeight
            if (r4 <= r2) goto L_0x0a43
            int r2 = r3 * r0
            r35 = r3
            r3 = r2
            r2 = r35
            goto L_0x0a45
        L_0x0a43:
            int r2 = r3 * r0
        L_0x0a45:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "new width height "
            r4.append(r7)
            r4.append(r3)
            r4.append(r5)
            r4.append(r2)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            r8 = 1
            r1 = r37
            r5 = r9
            r6 = r36
            r7 = r38
            r9 = r39
            boolean r0 = m131383SE(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.m131387bD(java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0209, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020a, code lost:
        r13 = r1;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020e, code lost:
        r13 = r1;
        r4 = r19;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0227, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0228, code lost:
        r3 = r8;
        r4 = "create thumbnail from orig failed: %s";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x022d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022e, code lost:
        r3 = r8;
        r19 = "create thumbnail from orig failed: %s";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x025e A[SYNTHETIC, Splitter:B:102:0x025e] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0209 A[ExcHandler: IOException (e java.io.IOException), PHI: r1 r3 
      PHI: (r1v11 java.io.OutputStream) = (r1v19 java.io.OutputStream), (r1v19 java.io.OutputStream), (r1v19 java.io.OutputStream), (r1v19 java.io.OutputStream), (r1v26 java.io.OutputStream), (r1v26 java.io.OutputStream), (r1v26 java.io.OutputStream), (r1v26 java.io.OutputStream) binds: [B:60:0x01bd, B:61:?, B:62:0x01c0, B:63:?, B:53:0x0195, B:54:?, B:55:0x0198, B:56:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v20 java.lang.String) = (r3v23 java.lang.String), (r3v23 java.lang.String), (r3v23 java.lang.String), (r3v23 java.lang.String), (r3v24 java.lang.String), (r3v24 java.lang.String), (r3v24 java.lang.String), (r3v24 java.lang.String) binds: [B:60:0x01bd, B:61:?, B:62:0x01c0, B:63:?, B:53:0x0195, B:54:?, B:55:0x0198, B:56:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:53:0x0195] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0227 A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x022d A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023f A[SYNTHETIC, Splitter:B:94:0x023f] */
    /* renamed from: bF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m131388bF(android.graphics.BitmapFactory.Options r22, java.lang.String r23, int r24, int r25, int r26, android.graphics.Bitmap.CompressFormat r27, int r28, java.lang.String r29, java.lang.String r30, boolean r31, boolean r32) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            java.lang.String r9 = "create thumbnail from orig failed: %s"
            java.lang.String r10 = "MicroMsg.snsMediaStorage"
            java.lang.String r11 = "createThumbNailUnScaleFixShort"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            java.lang.String r13 = "createThumbNailUnScale, srcWidth: %d, srcHeight: %d, fixShort: %d, quality:%d"
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r24)     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            r17 = 0
            r15[r17] = r18     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r25)     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            r16 = 1
            r15[r16] = r18     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r26)     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            r14 = 2
            r15[r14] = r18     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r28)     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            r14 = 3
            r15[r14] = r18     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r15)     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            r13.<init>()     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            if (r3 <= r2) goto L_0x004c
            r15 = r2
            goto L_0x004d
        L_0x004c:
            r15 = r3
        L_0x004d:
            if (r15 != r4) goto L_0x0056
            android.graphics.Bitmap r0 = lr2.C99590a.m130020c(r1, r13, r0)     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            r19 = r9
            goto L_0x00a5
        L_0x0056:
            r14 = 1
            r13.inSampleSize = r14     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x022d }
            if (r15 <= r4) goto L_0x006c
            int r14 = r15 / r4
            r13.inSampleSize = r14     // Catch:{ OutOfMemoryError -> 0x0227, IOException -> 0x0067 }
            r19 = r9
            r9 = 1
            if (r14 > r9) goto L_0x006e
            r13.inSampleSize = r9     // Catch:{ OutOfMemoryError -> 0x0222, IOException -> 0x021f }
            goto L_0x006e
        L_0x0067:
            r0 = move-exception
            r19 = r9
            goto L_0x0220
        L_0x006c:
            r19 = r9
        L_0x006e:
            java.lang.Class<h81.h> r9 = h81.C32735h.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ OutOfMemoryError -> 0x0222, IOException -> 0x021f }
            h81.h r9 = (h81.C32735h) r9     // Catch:{ OutOfMemoryError -> 0x0222, IOException -> 0x021f }
            h81.h$c r14 = h81.C32735h.C32737c.clicfg_sns_max_decode_pic_size     // Catch:{ OutOfMemoryError -> 0x0222, IOException -> 0x021f }
            r5 = 10240000(0x9c4000, float:1.4349296E-38)
            int r5 = r9.mo58779Qe(r14, r5)     // Catch:{ OutOfMemoryError -> 0x0222, IOException -> 0x021f }
            long r5 = (long) r5     // Catch:{ OutOfMemoryError -> 0x0222, IOException -> 0x021f }
        L_0x0080:
            int r9 = r3 * r2
            int r14 = r13.inSampleSize     // Catch:{ OutOfMemoryError -> 0x0222, IOException -> 0x021f }
            int r9 = r9 / r14
            int r9 = r9 / r14
            long r8 = (long) r9
            int r20 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r20 <= 0) goto L_0x0092
            int r14 = r14 + 1
            r13.inSampleSize = r14     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r8 = r30
            goto L_0x0080
        L_0x0092:
            java.lang.String r5 = "createThumbNailUnScale, sampleSize: %s"
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r9 = 0
            r8[r9] = r6     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r8)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            android.graphics.Bitmap r0 = lr2.C99590a.m130020c(r1, r13, r0)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
        L_0x00a5:
            java.lang.String r5 = "createThumbNailUnScale, result bm: %s"
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r6 = 0
            r8[r6] = r0     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r8)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            if (r0 != 0) goto L_0x00b6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            return r6
        L_0x00b6:
            int r5 = r2 * r4
            int r5 = r5 / r15
            int r4 = r4 * r3
            int r4 = r4 / r15
            int r6 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r23)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r8 = 90
            if (r6 == r8) goto L_0x00c8
            r8 = 270(0x10e, float:3.78E-43)
            if (r6 != r8) goto L_0x00cd
        L_0x00c8:
            r21 = r5
            r5 = r4
            r4 = r21
        L_0x00cd:
            java.lang.String r8 = "createThumbNailUnScale, bm.width: %s, bm.height: %s, new:[%d,%d], src:[%d, %d], shortEdge:%d,degree:%d"
            r9 = 8
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            int r13 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r14 = 0
            r9[r14] = r13     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            int r13 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r14 = 1
            r9[r14] = r13     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r14 = 2
            r9[r14] = r13     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r14 = 3
            r9[r14] = r13     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r13 = 4
            r9[r13] = r2     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r2 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r9[r2] = r3     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r2 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r9[r2] = r3     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r2 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r9[r2] = r3     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r9)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r2 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r0, r5, r4, r2)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            if (r3 == 0) goto L_0x0127
            if (r0 == r3) goto L_0x0126
            com.tencent.mm.memory.l r2 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r2.mo126912d(r0)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
        L_0x0126:
            r0 = r3
        L_0x0127:
            java.lang.String r2 = "createThumbNailUnScaleFixShort, bm.width: %s, bm.height: %s, quality:%d"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            int r6 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r8 = 0
            r3[r8] = r6     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            int r6 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r8 = 1
            r3[r8] = r6     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r28)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r8 = 2
            r3[r8] = r6     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r3)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            boolean r2 = m131390gY()     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            if (r2 == 0) goto L_0x01a3
            if (r31 == 0) goto L_0x01a3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r2.append(r7)     // Catch:{ OutOfMemoryError -> 0x021b, IOException -> 0x0217 }
            r3 = r30
            r2.append(r3)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.String r2 = r2.toString()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            boolean r1 = m131386Yt(r0, r1, r2, r5, r4)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            if (r1 != 0) goto L_0x019b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.append(r3)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.append(r3)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2 = 0
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r4 = r27
            r5 = r28
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToStream(r0, r5, r4, r1, r2)     // Catch:{ OutOfMemoryError -> 0x020d, IOException -> 0x0209 }
            r1.close()     // Catch:{ OutOfMemoryError -> 0x0202, IOException -> 0x0209 }
        L_0x019b:
            com.tencent.mm.memory.l r1 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.mo126912d(r0)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            goto L_0x01ca
        L_0x01a3:
            r4 = r27
            r5 = r28
            r3 = r30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r1.append(r3)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2 = 0
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToStream(r0, r5, r4, r1, r2)     // Catch:{ OutOfMemoryError -> 0x020d, IOException -> 0x0209 }
            com.tencent.mm.memory.l r2 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ OutOfMemoryError -> 0x0202, IOException -> 0x0209 }
            r2.mo126912d(r0)     // Catch:{ OutOfMemoryError -> 0x0202, IOException -> 0x0209 }
            r1.close()     // Catch:{ OutOfMemoryError -> 0x0202, IOException -> 0x0209 }
        L_0x01ca:
            java.lang.String r0 = "createThumbNailUnScaleFixShort saving to %s, size:%d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2.append(r7)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2.append(r3)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.String r2 = r2.toString()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r4 = 0
            r1[r4] = r2     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2.append(r7)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r2.append(r3)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.String r2 = r2.toString()     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            r4 = 1
            r1[r4] = r2     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0215, IOException -> 0x0213 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            return r4
        L_0x0202:
            r0 = move-exception
            r13 = r1
            r4 = r19
            r1 = 1
            r2 = 0
            goto L_0x024c
        L_0x0209:
            r0 = move-exception
            r13 = r1
            r1 = 1
            goto L_0x0233
        L_0x020d:
            r0 = move-exception
            r13 = r1
            r4 = r19
            r1 = 1
            goto L_0x024c
        L_0x0213:
            r0 = move-exception
            goto L_0x0231
        L_0x0215:
            r0 = move-exception
            goto L_0x0224
        L_0x0217:
            r0 = move-exception
            r3 = r30
            goto L_0x0231
        L_0x021b:
            r0 = move-exception
            r3 = r30
            goto L_0x0224
        L_0x021f:
            r0 = move-exception
        L_0x0220:
            r3 = r8
            goto L_0x0231
        L_0x0222:
            r0 = move-exception
            r3 = r8
        L_0x0224:
            r4 = r19
            goto L_0x022a
        L_0x0227:
            r0 = move-exception
            r3 = r8
            r4 = r9
        L_0x022a:
            r1 = 1
            r2 = 0
            goto L_0x024b
        L_0x022d:
            r0 = move-exception
            r3 = r8
            r19 = r9
        L_0x0231:
            r1 = 1
            r13 = 0
        L_0x0233:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r4 = r19
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r4, r1)
            if (r13 == 0) goto L_0x0242
            r13.close()     // Catch:{ IOException -> 0x0242 }
        L_0x0242:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            return r2
        L_0x0246:
            r0 = move-exception
            r3 = r8
            r4 = r9
            r2 = 0
            r1 = 1
        L_0x024b:
            r13 = 0
        L_0x024c:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r4, r1)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1487(0x5cf, double:7.347E-321)
            r3 = 0
            r0.mo175912v(r1, r3)
            if (r13 == 0) goto L_0x0261
            r13.close()     // Catch:{ IOException -> 0x0261 }
        L_0x0261:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.m131388bF(android.graphics.BitmapFactory$Options, java.lang.String, int, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    /* renamed from: fY */
    public static boolean m131389fY() {
        SnsMethodCalculate.markStartTimeMs("isUseWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean dm02 = ((C101213l) C86312j.m106911c(C101213l.class)).dm0(64);
        SnsMethodCalculate.markEndTimeMs("isUseWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return dm02;
    }

    /* renamed from: gY */
    public static boolean m131390gY() {
        SnsMethodCalculate.markStartTimeMs("isUseWxamUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean z = true;
        if ("wxam".equals(C90188n0.f258923Q)) {
            SnsMethodCalculate.markEndTimeMs("isUseWxamUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        int i = C94866e1.f274866V;
        SnsMethodCalculate.markStartTimeMs("isUploadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.SnsCore", "isUploadUseWxamImg: hevc not support");
            z = false;
            SnsMethodCalculate.markEndTimeMs("isUploadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        } else if (BuildInfo.IS_FLAVOR_RED) {
            SnsMethodCalculate.markEndTimeMs("isUploadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        } else {
            z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_upload_use_wxam, true);
            SnsMethodCalculate.markEndTimeMs("isUploadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
        SnsMethodCalculate.markEndTimeMs("isUseWxamUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return z;
    }

    /* renamed from: jo */
    public static byte[] m131391jo(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("bitmap2RgbA", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        SnsMethodCalculate.markEndTimeMs("bitmap2RgbA", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return array;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c8 A[SYNTHETIC, Splitter:B:49:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* renamed from: kD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m131392kD(java.lang.String r26, java.lang.String r27, java.lang.String r28, float r29) {
        /*
            r8 = r26
            r0 = r27
            r1 = r29
            java.lang.String r12 = "createThumb"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r4 = 0
            r9 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            r7.<init>()     // Catch:{ Exception -> 0x00c1 }
            r7.append(r8)     // Catch:{ Exception -> 0x00c1 }
            r7.append(r0)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00c1 }
            java.io.InputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106423E(r7)     // Catch:{ Exception -> 0x00c1 }
            r2.inJustDecodeBounds = r3     // Catch:{ Exception -> 0x00bb }
            com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r7, r4, r2)     // Catch:{ Exception -> 0x00bb }
            r7.close()     // Catch:{ Exception -> 0x00bb }
            int r7 = r2.outWidth     // Catch:{ Exception -> 0x00c1 }
            double r14 = (double) r7     // Catch:{ Exception -> 0x00c1 }
            int r7 = r2.outHeight     // Catch:{ Exception -> 0x00c1 }
            double r3 = (double) r7
            r16 = 4638144666238189568(0x405e000000000000, double:120.0)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x0044
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0053
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r18 = r3
            r16 = r14
            goto L_0x0057
        L_0x0053:
            r16 = 4642648265865560064(0x406e000000000000, double:240.0)
            r18 = 4642648265865560064(0x406e000000000000, double:240.0)
        L_0x0057:
            double r5 = (double) r1
            r11 = 1128792064(0x43480000, float:200.0)
            float r1 = r1 / r11
            r11 = 1110441984(0x42300000, float:44.0)
            float r11 = r11 * r1
            double r9 = (double) r11
            r11 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 * r11
            r22 = r3
            double r3 = (double) r1
            r20 = 0
            int r1 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b1
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b1
            double r3 = r5 / r16
            r24 = r14
            double r14 = r5 / r18
            double r3 = java.lang.Math.min(r3, r14)     // Catch:{ Exception -> 0x00aa }
            double r16 = r16 * r3
            double r18 = r18 * r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x008d
            double r14 = r9 * r3
            double r14 = r14 / r16
            double r16 = r16 * r14
            double r18 = r18 * r14
        L_0x008d:
            int r1 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0099
            double r9 = r9 * r3
            double r9 = r9 / r18
            double r16 = r16 * r9
            double r18 = r18 * r9
        L_0x0099:
            int r1 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x009f
            r16 = r5
        L_0x009f:
            int r1 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r5 = r18
        L_0x00a6:
            r3 = r5
            r5 = r16
            goto L_0x00b4
        L_0x00aa:
            r3 = r7
            r20 = r22
            r9 = r24
            goto L_0x00c5
        L_0x00b1:
            r24 = r14
            r5 = r3
        L_0x00b4:
            r9 = r5
            r14 = r24
            r5 = r3
            r3 = r22
            goto L_0x00d5
        L_0x00bb:
            r20 = r9
            r4 = r7
            r3 = 1
            goto L_0x00c6
        L_0x00c1:
            r20 = r9
            r3 = 1
        L_0x00c5:
            r4 = 0
        L_0x00c6:
            if (r4 == 0) goto L_0x00cd
            r4.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            r7 = r3
            r14 = r9
            r3 = r20
            r5 = 4642648265865560064(0x406e000000000000, double:240.0)
            r9 = 4642648265865560064(0x406e000000000000, double:240.0)
        L_0x00d5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            int r11 = (int) r14
            int r3 = (int) r3
            int r4 = (int) r5
            int r5 = (int) r9
            if (r7 == 0) goto L_0x00ed
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x00ef
        L_0x00ed:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x00ef:
            r6 = r0
            r7 = 70
            r10 = 1
            r14 = 0
            r0 = r2
            r2 = r11
            r8 = r26
            r9 = r28
            r11 = r14
            boolean r0 = m131384TE(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.m131392kD(java.lang.String, java.lang.String, java.lang.String, float):boolean");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0242, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0243, code lost:
        r5 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0249, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x024a, code lost:
        r5 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b5, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b8, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0184 A[Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019d A[Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0210 A[Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0242 A[ExcHandler: Exception (e java.lang.Exception), PHI: r19 r20 
      PHI: (r19v2 java.lang.String) = (r19v3 java.lang.String), (r19v3 java.lang.String), (r19v4 java.lang.String) binds: [B:56:0x01b7, B:58:0x01bf, B:49:0x0160] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v3 java.lang.String) = (r20v4 java.lang.String), (r20v4 java.lang.String), (r20v5 java.lang.String) binds: [B:56:0x01b7, B:58:0x01bf, B:49:0x0160] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x0160] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0287 A[Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x028a A[Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02b7 A[ExcHandler: Exception (e java.lang.Exception), PHI: r5 r6 
      PHI: (r5v5 java.lang.String) = (r5v0 java.lang.String), (r5v0 java.lang.String), (r5v18 java.lang.String), (r5v18 java.lang.String) binds: [B:1:0x0013, B:7:0x0043, B:44:0x0151, B:45:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v24 java.lang.String), (r6v24 java.lang.String) binds: [B:1:0x0013, B:7:0x0043, B:44:0x0151, B:45:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0013] */
    /* renamed from: mI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m131393mI(java.lang.String r30, java.lang.String r31, java.lang.String r32, float r33) {
        /*
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "MicroMsg.snsMediaStorage"
            java.lang.String r5 = "createUserAlbum"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r7 = 0
            r8 = 1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.<init>()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.append(r0)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.append(r2)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r9 = r9.toString()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r9)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.<init>()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.append(r0)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.append(r1)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r9 = r9.toString()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            android.graphics.BitmapFactory$Options r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r9)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            if (r9 != 0) goto L_0x0043
            java.lang.String r0 = "createUserAlbum, getImageOptions error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return r7
        L_0x0043:
            java.lang.String r10 = r9.outMimeType     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r11 = 2
            if (r10 == 0) goto L_0x008d
            java.lang.String r10 = r10.toLowerCase()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r12 = "png"
            boolean r10 = r10.endsWith(r12)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            if (r10 != 0) goto L_0x0073
            java.lang.String r10 = r9.outMimeType     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r10 = r10.toLowerCase()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r12 = "vcodec"
            boolean r10 = r10.endsWith(r12)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            if (r10 != 0) goto L_0x0073
            java.lang.String r10 = r9.outMimeType     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r10 = r10.toLowerCase()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r12 = "wxam"
            boolean r10 = r10.endsWith(r12)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            if (r10 == 0) goto L_0x008d
        L_0x0073:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.<init>()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.append(r0)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.append(r1)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r9 = r9.toString()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            int r3 = (int) r3     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r9, r3, r3, r8)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
        L_0x0087:
            r19 = r5
            r20 = r6
            goto L_0x020e
        L_0x008d:
            int r10 = r9.outWidth     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            int r12 = r9.outHeight     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            int r3 = (int) r3     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9.inJustDecodeBounds = r7     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r13 = "createUserAlbum, srcWidth: %s, srcHeight: %s, dstWidth: %s, dstHeight: %s"
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r15[r7] = r16     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r15[r8] = r16     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r15[r11] = r16     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r17 = 3
            r15[r17] = r16     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r15)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            if (r10 != r3) goto L_0x00ce
            if (r12 != r3) goto L_0x00ce
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r3.<init>()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r3.append(r0)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r3.append(r1)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.String r3 = r3.toString()     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            android.graphics.Bitmap r3 = lr2.C99590a.m130020c(r3, r9, r9)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            goto L_0x0087
        L_0x00ce:
            double r14 = (double) r12     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r20 = r14 * r18
            r16 = r9
            double r8 = (double) r3     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            double r22 = r20 / r8
            r24 = r12
            double r11 = (double) r10     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            double r25 = r11 * r18
            double r27 = r25 / r8
            int r29 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r29 <= 0) goto L_0x00f0
            double r8 = r8 * r18
            double r8 = r8 * r14
            double r8 = r8 / r11
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            int r8 = (int) r8     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9 = r8
            r8 = r3
            goto L_0x00fb
        L_0x00f0:
            double r8 = r8 * r18
            double r8 = r8 * r11
            double r8 = r8 / r14
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            int r8 = (int) r8     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r9 = r3
        L_0x00fb:
            java.lang.String r11 = "createUserAlbum, newWidth: %s, newHeight: %s"
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r14[r7] = r12     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r13 = 1
            r14[r13] = r12     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r14)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r11 = r16
            r11.inSampleSize = r13     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r12 = r24
            if (r12 > r9) goto L_0x0120
            if (r10 <= r8) goto L_0x011b
            goto L_0x0120
        L_0x011b:
            r19 = r5
            r20 = r6
            goto L_0x0168
        L_0x0120:
            r11.inSampleSize = r13     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            if (r12 > r9) goto L_0x0126
            if (r10 <= r8) goto L_0x013d
        L_0x0126:
            double r14 = (double) r9     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            double r20 = r20 / r14
            double r14 = (double) r8     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            double r25 = r25 / r14
            int r14 = (r20 > r25 ? 1 : (r20 == r25 ? 0 : -1))
            if (r14 >= 0) goto L_0x0133
            r14 = r25
            goto L_0x0135
        L_0x0133:
            r14 = r20
        L_0x0135:
            int r14 = (int) r14     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r11.inSampleSize = r14     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r13 = 1
            if (r14 > r13) goto L_0x013d
            r11.inSampleSize = r13     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
        L_0x013d:
            java.lang.Class<h81.h> r14 = h81.C32735h.class
            di3.d r14 = di3.C86312j.m106911c(r14)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            h81.h r14 = (h81.C32735h) r14     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            h81.h$c r15 = h81.C32735h.C32737c.clicfg_sns_max_decode_pic_size     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            r13 = 10240000(0x9c4000, float:1.4349296E-38)
            int r13 = r14.mo58779Qe(r15, r13)     // Catch:{ OutOfMemoryError -> 0x02d3, Exception -> 0x02b7 }
            long r13 = (long) r13
        L_0x014f:
            int r15 = r12 * r10
            int r7 = r11.inSampleSize     // Catch:{ OutOfMemoryError -> 0x02b4, Exception -> 0x02b7 }
            int r15 = r15 / r7
            int r15 = r15 / r7
            r19 = r5
            r20 = r6
            long r5 = (long) r15
            int r15 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0168
            int r7 = r7 + 1
            r11.inSampleSize = r7     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r5 = r19
            r6 = r20
            r7 = 0
            goto L_0x014f
        L_0x0168:
            java.lang.String r5 = "createUserAlbum, inSampleSize: %s"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            int r6 = r11.inSampleSize     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r14 = 0
            r7[r14] = r6     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            float r5 = (float) r12     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            float r6 = (float) r10     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            float r7 = r5 / r6
            float r3 = (float) r3     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            float r14 = r3 / r3
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x019d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.<init>()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.append(r0)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.append(r1)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.String r3 = r3.toString()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            android.graphics.Bitmap r3 = lr2.C99590a.m130020c(r3, r11, r11)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.String r5 = "createUserAlbum, directly use inSampleSize"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            goto L_0x020e
        L_0x019d:
            float r7 = (float) r8     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            float r7 = r7 / r6
            float r6 = (float) r9     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            float r6 = r6 / r5
            float r5 = java.lang.Math.max(r7, r6)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            float r3 = r3 / r5
            int r3 = (int) r3     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            int r6 = java.lang.Math.min(r10, r3)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            int r3 = java.lang.Math.min(r12, r3)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            int r10 = r10 - r6
            r7 = 1
            int r8 = r10 >> 1
            int r12 = r12 - r3
            int r9 = r12 >> 1
            r7 = 0
            int r8 = java.lang.Math.max(r7, r8)     // Catch:{ OutOfMemoryError -> 0x02ae, Exception -> 0x0242 }
            int r9 = java.lang.Math.max(r7, r9)     // Catch:{ OutOfMemoryError -> 0x02ae, Exception -> 0x0242 }
            android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r7.<init>()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r7.left = r8     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            int r10 = r8 + r6
            r7.right = r10     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r7.top = r9     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            int r10 = r9 + r3
            r7.bottom = r10     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r10.append(r0)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r10.append(r1)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            android.graphics.Bitmap r7 = lr2.C99590a.m130021d(r10, r7, r11)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.String r10 = "createUserAlbum, dstWidth: %s, dstHeight: %s, startX: %s, startY: %s, scaleFactor: %s"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r12 = 0
            r11[r12] = r6     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r6 = 1
            r11[r6] = r3     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r6 = 2
            r11[r6] = r3     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r11[r17] = r3     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.Float r3 = java.lang.Float.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r5 = 4
            r11[r5] = r3     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r11)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3 = r7
        L_0x020e:
            if (r3 != 0) goto L_0x024f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.<init>()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.String r5 = "bitmap error "
            r3.append(r5)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.append(r0)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.append(r1)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.String r3 = r3.toString()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.<init>()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.append(r0)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r3.append(r1)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            java.lang.String r0 = r3.toString()     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ OutOfMemoryError -> 0x0249, Exception -> 0x0242 }
            r5 = r19
            r1 = r20
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            r1 = 0
            return r1
        L_0x0242:
            r0 = move-exception
            r5 = r19
            r1 = r20
            goto L_0x02b9
        L_0x0249:
            r0 = move-exception
            r5 = r19
            r1 = r20
            goto L_0x02ab
        L_0x024f:
            r5 = r19
            r1 = r20
            java.lang.String r6 = "createUserAlbum, bm.width: %s, bm.height: %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            int r8 = r3.getWidth()     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r9 = 0
            r7[r9] = r8     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            int r8 = r3.getHeight()     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r9 = 1
            r7[r9] = r8     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r7)     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            int r6 = r3.getHeight()     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r7 = 120(0x78, float:1.68E-43)
            if (r6 > r7) goto L_0x0282
            int r6 = r3.getWidth()     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            if (r6 <= r7) goto L_0x0280
            goto L_0x0282
        L_0x0280:
            r6 = 1
            goto L_0x0283
        L_0x0282:
            r6 = 0
        L_0x0283:
            r7 = 100
            if (r6 == 0) goto L_0x028a
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            goto L_0x028c
        L_0x028a:
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
        L_0x028c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r8.<init>()     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r8.append(r0)     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r8.append(r2)     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            java.lang.String r0 = r8.toString()     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r8 = 0
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r3, r7, r6, r0, r8)     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            com.tencent.mm.memory.l r0 = com.tencent.p014mm.memory.C92712l.m116840c()     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r0.mo126912d(r3)     // Catch:{ OutOfMemoryError -> 0x02aa, Exception -> 0x02a8 }
            r3 = 1
            goto L_0x02cf
        L_0x02a8:
            r0 = move-exception
            goto L_0x02b9
        L_0x02aa:
            r0 = move-exception
        L_0x02ab:
            r3 = 1
            r7 = 0
            goto L_0x02d6
        L_0x02ae:
            r0 = move-exception
            r5 = r19
            r1 = r20
            goto L_0x02d5
        L_0x02b4:
            r0 = move-exception
            r1 = r6
            goto L_0x02ab
        L_0x02b7:
            r0 = move-exception
            r1 = r6
        L_0x02b9:
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r6 = r0.getMessage()
            r7 = 0
            r2[r7] = r6
            java.lang.String r6 = "createUserAlbum error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r6, r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r2)
        L_0x02cf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            return r3
        L_0x02d3:
            r0 = move-exception
            r1 = r6
        L_0x02d5:
            r3 = 1
        L_0x02d6:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r2
            java.lang.String r2 = "create thumbnail from orig failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r3)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1487(0x5cf, double:7.347E-321)
            r8 = 2
            r0.mo175912v(r2, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.m131393mI(java.lang.String, java.lang.String, java.lang.String, float):boolean");
    }

    /* renamed from: mL */
    public static Bitmap m131394mL(String str) {
        SnsMethodCalculate.markStartTimeMs("decodeBitmapWithSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
        int i = imageOptions.outWidth;
        int i2 = imageOptions.outHeight;
        int i3 = 960;
        int i4 = i >= i2 ? 960 : 640;
        if (i >= i2) {
            i3 = 640;
        }
        Bitmap extractThumbNail = BitmapUtil.extractThumbNail(str, i3, i4, false);
        if (extractThumbNail == null) {
            SnsMethodCalculate.markEndTimeMs("decodeBitmapWithSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        Bitmap rotate = BitmapUtil.rotate(extractThumbNail, (float) Exif.fromFile(str).getOrientationInDegree());
        SnsMethodCalculate.markEndTimeMs("decodeBitmapWithSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return rotate;
    }

    /* renamed from: qq */
    public static boolean m131395qq(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean z = true;
        try {
            Bitmap a = C99590a.m130018a(str, (BitmapFactory.Options) null, 0.0f);
            byte[] jo = m131391jo(a);
            a.recycle();
            if (((C102150l) C86312j.m106911c(C102150l.class)).wx0(jo, str, str2, a.getWidth(), a.getHeight(), a.getWidth(), a.getHeight(), 0) != 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z;
        } catch (OutOfMemoryError unused) {
            Log.m105929w("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip origPath:%s OutOfMemoryError! rollback", str);
            SnsMethodCalculate.markEndTimeMs("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    /* renamed from: vP */
    public static boolean m131396vP(BitmapFactory.Options options) {
        SnsMethodCalculate.markStartTimeMs("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (options == null) {
            SnsMethodCalculate.markEndTimeMs("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        String str = options.outMimeType;
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.indexOf("jpg") >= 0) {
            SnsMethodCalculate.markEndTimeMs("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        } else if (lowerCase.indexOf("jpeg") >= 0) {
            SnsMethodCalculate.markEndTimeMs("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    /* renamed from: DN */
    public C100406i0 mo139866DN(String str) {
        SnsMethodCalculate.markStartTimeMs("getByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        C100406i0 i0Var = new C100406i0();
        C91753f fVar = this.f294140d;
        Cursor query = fVar.query("SnsMedia", (String[]) null, "StrId=?", new String[]{"" + str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            i0Var.mo139847a(query);
            query.close();
            SnsMethodCalculate.markEndTimeMs("getByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return i0Var;
        }
        query.close();
        SnsMethodCalculate.markEndTimeMs("getByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return null;
    }

    /* renamed from: LL */
    public C100406i0 mo139867LL(long j) {
        SnsMethodCalculate.markStartTimeMs("getByMediaLocalId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        C100406i0 i0Var = new C100406i0();
        C91753f fVar = this.f294140d;
        Cursor query = fVar.query("SnsMedia", (String[]) null, "local_id=?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            query.close();
            SnsMethodCalculate.markEndTimeMs("getByMediaLocalId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        i0Var.mo139847a(query);
        query.close();
        SnsMethodCalculate.markEndTimeMs("getByMediaLocalId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return i0Var;
    }

    /* renamed from: TO */
    public int mo139868TO() {
        int i;
        SnsMethodCalculate.markStartTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (C85875k4.m106157N()) {
            i = f294138f;
        } else {
            i = f294138f;
            int i2 = f294139g;
            if (i > i2) {
                i = i2;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return i;
    }

    /* renamed from: bO */
    public String mo139869bO(String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        String str3 = "";
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return str3;
        }
        String f = C90193h.m112878f(str.getBytes());
        if (f.length() >= 1) {
            str2 = f.charAt(0) + "/";
        } else {
            str2 = str3;
        }
        if (f.length() >= 2) {
            str3 = f.charAt(1) + "/";
        }
        String str4 = C94866e1.m120262YO() + str2 + str3;
        SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return str4;
    }

    public void c40(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setScreenSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        f294138f = i;
        f294139g = i2;
        Log.m105925i("MicroMsg.snsMediaStorage", "SCREEN %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        SnsMethodCalculate.markEndTimeMs("setScreenSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r3 == null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final vr2.C102270y h30(vr2.C102270y r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "setImageExtInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            r3 = 0
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            r5 = 1
            r4.inJustDecodeBounds = r5     // Catch:{ Exception -> 0x0053 }
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106423E(r11)     // Catch:{ Exception -> 0x0053 }
            boolean r5 = r3.markSupported()     // Catch:{ Exception -> 0x0053 }
            if (r5 != 0) goto L_0x0022
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0053 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            r3 = r5
        L_0x0022:
            r5 = 1048576(0x100000, float:1.469368E-39)
            r3.mark(r5)     // Catch:{ Exception -> 0x0053 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r11, r4)     // Catch:{ Exception -> 0x0053 }
            r3.reset()     // Catch:{ Exception -> 0x0053 }
            com.tencent.mm.compatible.util.Exif r5 = new com.tencent.mm.compatible.util.Exif     // Catch:{ Exception -> 0x0053 }
            r5.<init>()     // Catch:{ Exception -> 0x0053 }
            r5.parseFromStream(r3)     // Catch:{ Exception -> 0x0053 }
            int r5 = r5.getOrientationInDegree()     // Catch:{ Exception -> 0x0053 }
            r6 = 90
            if (r5 == r6) goto L_0x0047
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 != r6) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            int r5 = r4.outHeight     // Catch:{ Exception -> 0x0053 }
            int r2 = r4.outWidth     // Catch:{ Exception -> 0x004f }
            goto L_0x004b
        L_0x0047:
            int r5 = r4.outWidth     // Catch:{ Exception -> 0x0053 }
            int r2 = r4.outHeight     // Catch:{ Exception -> 0x004f }
        L_0x004b:
            r3.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0071
        L_0x004f:
            r4 = move-exception
            goto L_0x0055
        L_0x0051:
            r10 = move-exception
            goto L_0x0080
        L_0x0053:
            r4 = move-exception
            r5 = 0
        L_0x0055:
            java.lang.String r6 = "MicroMsg.snsMediaStorage"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r7.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r8 = "setImageExtInfo failed: "
            r7.append(r8)     // Catch:{ all -> 0x0051 }
            r7.append(r11)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0051 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0051 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r4, r7, r8)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0071
            goto L_0x004b
        L_0x0071:
            r10.f301220g = r2
            r10.f301221h = r5
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            int r11 = (int) r2
            r10.f301222i = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        L_0x0080:
            if (r3 == 0) goto L_0x0085
            r3.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.h30(vr2.y, java.lang.String):vr2.y");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x06b4 A[LOOP:0: B:5:0x001c->B:72:0x06b4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x06ae A[SYNTHETIC] */
    /* renamed from: nP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<vr2.C102270y> mo139872nP(java.util.List<vr2.C102270y> r29) {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = "insertElment"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            if (r29 == 0) goto L_0x06dc
            int r0 = r29.size()
            if (r0 != 0) goto L_0x0018
            goto L_0x06dc
        L_0x0018:
            java.util.Iterator r6 = r29.iterator()
        L_0x001c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x06d8
            java.lang.Object r0 = r6.next()
            r7 = r0
            vr2.y r7 = (vr2.C102270y) r7
            java.lang.String r8 = "insert"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r0
            r13 = 1
            r11[r13] = r9
            java.lang.String r14 = "MicroMsg.snsMediaStorage"
            java.lang.String r15 = "SnsMediaStorage %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r11)
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = r7.f301214a
            int r5 = r7.f301218e
            boolean r17 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r17 != 0) goto L_0x005d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            r19 = r4
            r18 = r6
            goto L_0x00f4
        L_0x005d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r18 = r11
            long r10 = java.lang.System.currentTimeMillis()
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            byte[] r10 = r10.getBytes()
            java.lang.String r10 = p823sg.C90193h.m112878f(r10)
            java.lang.String r11 = vr2.C102236a0.m134733a0(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r12 = "insert : original img path = "
            r13.append(r12)
            r12 = r18
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r13)
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r13 != 0) goto L_0x00b4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r18 = r6
            java.lang.String r6 = "create snstmp path "
            r13.append(r6)
            r13.append(r9)
            java.lang.String r6 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r9)
            goto L_0x00b6
        L_0x00b4:
            r18 = r6
        L_0x00b6:
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r6 != 0) goto L_0x00d3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "create snsPath "
            r6.append(r13)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
        L_0x00d3:
            f12.b r6 = new f12.b
            r6.<init>()
            r1.h30(r7, r12)
            int r0 = r7.f301220g
            int r13 = r7.f301221h
            r19 = r4
            int r4 = r7.f301222i
            r6.f286934a = r12
            r6.f286936c = r0
            r6.f286937d = r13
            r6.f286938e = r4
            boolean r0 = m131382Ow(r9, r12, r11)
            if (r0 != 0) goto L_0x00fc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
        L_0x00f4:
            r20 = r2
            r24 = r7
            r2 = -1
            r5 = -1
            goto L_0x06ac
        L_0x00fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "insert0 "
            r0.append(r4)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r15
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "insert: compressed bigMediaPath = "
            r0.append(r4)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r11)
            java.lang.String r4 = r0.toString()
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            int r0 = (int) r12
            int r12 = vr2.C102236a0.m134709D(r4)
            java.lang.String r13 = ""
            r20 = r2
            r2 = 2
            if (r12 != r2) goto L_0x017e
            r2 = 0
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r4, r2, r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getYUVType(r0)
            if (r0 == 0) goto L_0x017e
            r21 = r3
            r12 = 1
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r2] = r0
            java.lang.String r12 = "insert yuvInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r12, r3)
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r2)     // Catch:{ Exception -> 0x0177 }
            if (r3 != 0) goto L_0x0166
            r3 = r4
        L_0x0166:
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch:{ Exception -> 0x0174 }
            r2.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r3 = "UserComment"
            r2.setAttribute(r3, r0)     // Catch:{ Exception -> 0x0174 }
            r2.saveAttributes()     // Catch:{ Exception -> 0x0174 }
            goto L_0x0180
        L_0x0174:
            r0 = move-exception
            r2 = 0
            goto L_0x0178
        L_0x0177:
            r0 = move-exception
        L_0x0178:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r13, r3)
            goto L_0x0180
        L_0x017e:
            r21 = r3
        L_0x0180:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r0 = (int) r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.h30(r7, r2)
            int r2 = r7.f301220g
            int r3 = r7.f301221h
            r6.f286939f = r2
            r6.f286940g = r3
            r6.f286941h = r0
            os2.i0 r2 = new os2.i0
            r2.<init>()
            r2.mo139857k(r10)
            r10 = r4
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r4 = (int) r3
            long r3 = (long) r4
            java.lang.String r12 = "setCreateTime"
            r22 = r8
            java.lang.String r8 = "com.tencent.mm.plugin.sns.storage.SnsMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
            r2.f294125e = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
            java.lang.String r3 = "setType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r8)
            r2.f294123c = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
            te3.nv2 r3 = new te3.nv2
            r3.<init>()
            int r4 = r7.f301217d
            r3.f298915f = r4
            int r4 = r7.f301216c
            r3.f298914e = r4
            java.lang.String r4 = r7.f301223j
            r3.f298923q = r4
            java.lang.String r4 = r7.f301224k
            r3.f298924r = r4
            r4 = 0
            r3.f298917h = r4
            te3.fv2 r5 = new te3.fv2
            r5.<init>()
            r3.f298916g = r5
            r3.f298919j = r4
            java.lang.String r4 = r7.f301225l
            r3.f298921o = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "upload.filterId "
            r4.append(r5)
            int r5 = r7.f301215b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r4)
            int r4 = r7.f301215b
            r3.f298913d = r4
            r4 = 2
            r3.f298920n = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106456q(r4)
            r3.f298929w = r4
            byte[] r4 = r3.toByteArray()     // Catch:{ Exception -> 0x0239 }
            r2.mo139858l(r4)     // Catch:{ Exception -> 0x0239 }
            goto L_0x023f
        L_0x0239:
            java.lang.String r4 = "uploadInfo to byteArray error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r4)
        L_0x023f:
            java.lang.String r4 = "setUpload"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            int r5 = r2.f294129i
            r5 = r5 | 4
            java.lang.String r12 = "setLocalFlag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
            r2.f294129i = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            java.lang.String r4 = "setTotallen"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            r2.f294127g = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "insert a local snsMedia  totallen  :"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " filepath: "
            r4.append(r0)
            r4.append(r9)
            r4.append(r11)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            zh3.f r0 = r1.f294140d
            android.content.ContentValues r4 = r2.mo139848b()
            java.lang.String r5 = "SnsMedia"
            java.lang.String r8 = "local_id"
            r12 = 0
            long r4 = r0.mo125627q(r5, r8, r4, r12)
            int r5 = (int) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "insert localId "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Locall_path"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.f286935b = r0
            java.lang.String r0 = r3.f298929w
            r6.f286942i = r0
            java.lang.String r0 = r6.f286934a
            com.tencent.mm.compatible.util.Exif r3 = com.tencent.p014mm.compatible.util.Exif.fromFile(r0)
            java.lang.String r0 = r6.f286934a
            int r0 = r6.mo137149b(r0)
            java.lang.String r8 = r3.dateTimeOriginal
            java.lang.String r12 = r6.f286934a
            boolean r23 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r23 != 0) goto L_0x02ee
            java.lang.String r8 = r6.mo137148a(r8)
            r25 = r2
            r24 = r7
            r7 = r11
            r23 = r13
            goto L_0x034f
        L_0x02ee:
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            r23 = r13
            java.lang.String r13 = "yyyy:MM:dd HH:mm:ss"
            r8.<init>(r13)
            java.util.Date r13 = new java.util.Date
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)
            r24 = r7
            java.lang.String r7 = r12.getPath()
            r25 = r2
            if (r7 == 0) goto L_0x0323
            r2 = 0
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r2, r2)
            java.lang.String r2 = r12.getPath()
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0323
            android.net.Uri$Builder r2 = r12.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r7)
            android.net.Uri r12 = r2.build()
        L_0x0323:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r7 = 0
            com.tencent.mm.vfs.f0$h r2 = r2.mo177799l(r12, r7)
            boolean r7 = r2.mo177810a()
            r26 = 0
            if (r7 != 0) goto L_0x0333
            goto L_0x033d
        L_0x0333:
            com.tencent.mm.vfs.FileSystem$c r7 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            com.tencent.mm.vfs.b0 r2 = r7.mo119945q(r2)
            if (r2 != 0) goto L_0x0341
        L_0x033d:
            r7 = r11
            r11 = r26
            goto L_0x0344
        L_0x0341:
            r7 = r11
            long r11 = r2.f250475e
        L_0x0344:
            r13.<init>(r11)
            java.lang.String r2 = r8.format(r13)
            java.lang.String r8 = r6.mo137148a(r2)
        L_0x034f:
            ad0.t r2 = new ad0.t
            r2.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r6.f286935b
            r11.append(r12)
            java.lang.String r12 = ","
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "20 localID"
            r2.mo32a(r13, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r12)
            java.lang.String r0 = r11.toString()
            java.lang.String r11 = "21 MediaType"
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r11 = r6.f286936c
            r0.append(r11)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "22 OriginWidth"
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r11 = r6.f286937d
            r0.append(r11)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "23 OriginHeight"
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r11 = r6.f286939f
            r0.append(r11)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "24 CompressedWidth"
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r11 = r6.f286940g
            r0.append(r11)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "25 CompressedHeight"
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r11 = r6.f286938e
            r0.append(r11)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "26 OriginSize"
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r11 = r6.f286941h
            r0.append(r11)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "27 CompressedSize"
            r2.mo32a(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r11 = r14
            double r13 = r3.fNumber
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "28 FNumber"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r13 = r3.exposureTime
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "29 ExposureTime"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short r13 = r3.isoSpeedRatings
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "30 ISO"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte r13 = r3.flash
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "31 Flash"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r3.model
            java.lang.String r13 = r6.mo137148a(r13)
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "32 LensModel"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "33 CreatTime"
            r2.mo32a(r8, r0)
            java.lang.String r8 = "0,"
            java.lang.String r0 = "34 IsFromWeChat"
            r2.mo32a(r0, r8)
            java.lang.String r0 = "35 Scene"
            r2.mo32a(r0, r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r13 = r3.sceneType
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "36 sceneType"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r13 = r3.fileSource
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "37 fileSource"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r3.make
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "38 make"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r3.software
            r0.append(r13)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "39 software"
            r2.mo32a(r13, r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r6.f286934a
            r14 = 6
            r26 = r15
            r15 = 0
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r15, r14)
            java.lang.String r15 = "MicroMsg.ImgExtInfoReport"
            r16 = r7
            if (r0 == 0) goto L_0x0525
            int r7 = r0.length
            if (r7 == r14) goto L_0x0508
            goto L_0x0525
        L_0x0508:
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0510 }
            java.lang.String r14 = "UTF-8"
            r7.<init>(r0, r14)     // Catch:{ UnsupportedEncodingException -> 0x0510 }
            goto L_0x0527
        L_0x0510:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "getFileExt UnsupportedEncodingException:"
            r7.append(r14)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x0525:
            r7 = r23
        L_0x0527:
            r13.append(r7)
            r13.append(r12)
            java.lang.String r0 = r13.toString()
            java.lang.String r7 = "40 fileExt"
            r2.mo32a(r7, r0)
            java.lang.String r0 = "41 faceCount"
            r2.mo32a(r0, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.yCbCrSubSampling
            r0.append(r3)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "42 YCbCrSubSampling"
            r2.mo32a(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r6.f286942i
            r0.append(r3)
            r3 = 44
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "43 md5"
            r2.mo32a(r3, r0)
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r2.mo34c()
            r7 = 0
            r0[r7] = r3
            java.lang.String r3 = r6.f286934a
            r8 = 1
            r0[r8] = r3
            java.lang.String r3 = "report logbuffer MMImageExifInfo(14525): %s, orgPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r15, r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 14525(0x38bd, float:2.0354E-41)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r2
            r0.mo160131h(r3, r8)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "getInstance"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic r7 = com.tencent.p014mm.plugin.sns.statistics.SnsPostReportLogic.f275499c
            if (r7 != 0) goto L_0x059f
            com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic r7 = new com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic
            r7.<init>()
            com.tencent.p014mm.plugin.sns.statistics.SnsPostReportLogic.f275499c = r7
        L_0x059f:
            com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic r7 = com.tencent.p014mm.plugin.sns.statistics.SnsPostReportLogic.f275499c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            int r2 = r6.mo137149b(r10)
            r7.getClass()
            java.lang.String r6 = "noteSnsMediaRptContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$a> r8 = r7.f275500a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$a r12 = new com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$a
            r12.<init>(r7, r2, r0)
            r8.put(r10, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            java.lang.String r0 = vr2.C102236a0.m134733a0(r4)
            java.lang.String r2 = r1.mo139869bO(r4)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "checkcntpath "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r6 = r16
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r6 = vr2.C102236a0.m134730Y(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r7 = "getSnsUserNameWithoutEnc"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "snsu_"
            r9.append(r10)
            java.lang.String r10 = vr2.C102236a0.m134768s(r4)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "insert done "
            r7.append(r8)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r26
            r7.append(r8)
            java.lang.String r8 = " targetPath : "
            r7.append(r8)
            r7.append(r2)
            r7.append(r0)
            java.lang.String r8 = " totalLen:"
            r7.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r7.append(r8)
            java.lang.String r0 = "  now delete...:"
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = " & "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r2 = r25
            r2.mo139857k(r4)
            r1.r50(r5, r2)
            r3 = r21
            r2 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r2 = -1
        L_0x06ac:
            if (r5 != r2) goto L_0x06b4
            r2 = r20
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x06df
        L_0x06b4:
            r2 = r20
            vr2.y r0 = new vr2.y
            r4 = r24
            int r6 = r4.f301218e
            r0.<init>((int) r5, (int) r6)
            int r5 = r4.f301221h
            r0.f301221h = r5
            int r5 = r4.f301220g
            r0.f301220g = r5
            int r5 = r4.f301222i
            r0.f301222i = r5
            java.util.List<com.tencent.mm.api.EmotionStrategyInfo> r4 = r4.f301228o
            r0.f301228o = r4
            r4 = r19
            r4.add(r0)
            r6 = r18
            goto L_0x001c
        L_0x06d8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x06dc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x06df:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: os2.C100408j0.mo139872nP(java.util.List):java.util.List");
    }

    public int r50(int i, C100406i0 i0Var) {
        SnsMethodCalculate.markStartTimeMs("updateMediaByLocal", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        ContentValues b = i0Var.mo139848b();
        C91753f fVar = this.f294140d;
        int update = fVar.update("SnsMedia", b, "local_id=?", new String[]{"" + i});
        SnsMethodCalculate.markEndTimeMs("updateMediaByLocal", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return update;
    }

    /* renamed from: uP */
    public C102270y mo139874uP(C102270y yVar, String str, String str2, String str3, String str4) {
        C102270y yVar2 = yVar;
        String str5 = str;
        String str6 = str2;
        SnsMethodCalculate.markStartTimeMs("insertSight", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        C100406i0 i0Var = new C100406i0();
        SnsMethodCalculate.markStartTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        i0Var.f294125e = (long) ((int) Util.nowSecond());
        SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i = yVar2.f301218e;
        SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        i0Var.f294123c = i;
        SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        C101821nv2 nv22 = new C101821nv2();
        nv22.f298915f = yVar2.f301217d;
        nv22.f298914e = yVar2.f301216c;
        nv22.f298923q = yVar2.f301223j;
        nv22.f298924r = yVar2.f301224k;
        nv22.f298917h = 0;
        nv22.f298916g = new C64376fv2();
        nv22.f298919j = 0;
        nv22.f298921o = yVar2.f301225l;
        Log.m105918d("MicroMsg.snsMediaStorage", "upload.filterId " + yVar2.f301215b);
        nv22.f298913d = yVar2.f301215b;
        nv22.f298920n = 2;
        nv22.f298926t = str5;
        nv22.f298927u = str6;
        nv22.f298929w = yVar2.f301226m;
        try {
            i0Var.mo139858l(nv22.toByteArray());
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
        }
        SnsMethodCalculate.markStartTimeMs("setUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        SnsMethodCalculate.markStartTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        i0Var.f294129i |= 4;
        SnsMethodCalculate.markEndTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        SnsMethodCalculate.markEndTimeMs("setUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int q = (int) this.f294140d.mo125627q("SnsMedia", "local_id", i0Var.mo139848b(), false);
        String str7 = "Locall_path" + q;
        Log.m105918d("MicroMsg.snsMediaStorage", "insert localId " + q);
        String a0 = C102236a0.m134733a0(str7);
        String e0 = C102236a0.m134741e0(str7);
        String f0 = C102236a0.m134743f0(str7);
        String c0 = C102236a0.m134737c0(str7);
        String str8 = "insertSight";
        String bO = mo139869bO(str7);
        C86013q1.m106461v(bO);
        C86013q1.m106442c(str6, bO + a0);
        C86013q1.m106442c(str6, bO + e0);
        C86013q1.m106442c(str6, bO + f0);
        C86013q1.m106442c(str5, bO + c0);
        nv22.f298926t = bO + c0;
        nv22.f298927u = bO + e0;
        nv22.f298929w = yVar2.f301226m;
        try {
            i0Var.mo139858l(nv22.toByteArray());
        } catch (Exception unused2) {
            Log.m105920e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
        }
        i0Var.mo139857k(str7);
        SnsMethodCalculate.markStartTimeMs("setHasCdnUrl", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            SnsMethodCalculate.markEndTimeMs("setHasCdnUrl", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        } else {
            C64376fv2 fv22 = new C64376fv2();
            fv22.f183229e = 1;
            fv22.f183228d = str3;
            nv22.f298916g = fv22;
            nv22.f298920n = 0;
            nv22.f298910A = ((C101211h) C86312j.m106911c(C101211h.class)).mo140292k7(str5);
            if (!Util.isNullOrNil(str4)) {
                C64376fv2 fv23 = new C64376fv2();
                fv23.f183229e = 1;
                fv23.f183228d = str4;
                nv22.f298918i.add(fv23);
            }
            try {
                i0Var.mo139858l(nv22.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.snsMediaStorage", e, "", new Object[0]);
            }
            i0Var.mo139859m();
            SnsMethodCalculate.markEndTimeMs("setHasCdnUrl", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        }
        r50(q, i0Var);
        h30(yVar2, nv22.f298927u);
        yVar2.f301219f = q;
        SnsMethodCalculate.markEndTimeMs(str8, "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return yVar2;
    }

    public boolean v10(String str, C100406i0 i0Var) {
        boolean z;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("replaceMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        Log.m105918d("MicroMsg.snsMediaStorage", "replace AlbumLikeList " + str2);
        C91753f fVar = this.f294140d;
        boolean z2 = false;
        Cursor query = fVar.query("SnsMedia", (String[]) null, "StrId=?", new String[]{"" + str2}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            query.close();
            SnsMethodCalculate.markStartTimeMs("insertMedia", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            Log.m105918d("MicroMsg.snsMediaStorage", "snsMedia Insert");
            if (i0Var == null) {
                SnsMethodCalculate.markEndTimeMs("insertMedia", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                z = false;
            } else {
                if (((int) this.f294140d.mo125627q("SnsMedia", "local_id", i0Var.mo139848b(), false)) != -1) {
                    z2 = true;
                }
                SnsMethodCalculate.markEndTimeMs("insertMedia", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                z = z2;
            }
            SnsMethodCalculate.markEndTimeMs("replaceMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z;
        }
        query.close();
        SnsMethodCalculate.markStartTimeMs("updateMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        ContentValues b = i0Var.mo139848b();
        C91753f fVar2 = this.f294140d;
        if (fVar2.update("SnsMedia", b, "StrId=?", new String[]{"" + str2}) > 0) {
            z2 = true;
        }
        SnsMethodCalculate.markEndTimeMs("updateMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        SnsMethodCalculate.markEndTimeMs("replaceMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return z2;
    }
}
