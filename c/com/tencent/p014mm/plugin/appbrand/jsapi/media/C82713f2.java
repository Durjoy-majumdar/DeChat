package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.media.MediaFormat;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.plugin.appbrand.app.C81192y0;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative;
import com.tencent.p014mm.plugin.sight.base.C85457c;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import di3.C86312j;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import p509eu.C86680e;
import p682rz.C101480j;
import p914oj.C110052b;
import r80.C101359j0;
import uf0.C102016c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.f2 */
public class C82713f2 {

    /* renamed from: a */
    public static final int f242011a = C85457c.f249058c;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.f2$a */
    public static final class C82714a {

        /* renamed from: a */
        public String f242012a;

        /* renamed from: b */
        public int f242013b;

        /* renamed from: c */
        public int f242014c;

        /* renamed from: d */
        public int f242015d;

        /* renamed from: e */
        public int f242016e;

        /* renamed from: f */
        public int f242017f;

        /* renamed from: g */
        public float f242018g;

        public C82714a(String str, int i, int i2, int i3, int i4, int i5, float f) {
            this.f242012a = str;
            this.f242013b = i;
            this.f242014c = i2;
            this.f242015d = i3;
            this.f242016e = i4;
            this.f242017f = i5;
            this.f242018g = f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.f2$b */
    public static final class C82715b {

        /* renamed from: a */
        public int f242019a;

        /* renamed from: b */
        public String f242020b;

        /* renamed from: c */
        public int f242021c;

        /* renamed from: d */
        public long f242022d;

        /* renamed from: e */
        public int f242023e;

        /* renamed from: f */
        public int f242024f;

        /* renamed from: g */
        public int f242025g;

        /* renamed from: h */
        public float f242026h;

        public C82715b(String str, int i, String str2, int i2, long j, int i3, int i4, int i5, float f) {
            this.f242019a = i;
            this.f242020b = str2;
            this.f242021c = i2;
            this.f242022d = j;
            this.f242023e = i3;
            this.f242024f = i4;
            this.f242025g = i5;
            this.f242026h = f;
        }
    }

    /* renamed from: a */
    public static int m101483a(String str) {
        int i;
        C81192y0.m99475a();
        boolean a = C102016c.m134339a(str);
        Log.m105925i("MicroMsg.RemuxHelper", "checkRemux, isMp4 = %b", Boolean.valueOf(a));
        if (a) {
            i = ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).shouldRemuxingVFS(str, JsApiResumeDownloadTaskForNative.CTRL_INDEX, 500, 26214400, 1200000.0d, 1000000);
            Log.m105925i("MicroMsg.RemuxHelper", "checkRemux, ret = %d", Integer.valueOf(i));
        } else {
            Log.m105925i("MicroMsg.RemuxHelper", "fileLength = %d", Integer.valueOf((int) C86013q1.m106451l(str)));
            i = 1;
        }
        switch (i) {
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
            case -1:
                return -50002;
            case 0:
                return -50006;
            case 1:
                return 2;
            case 2:
            case 3:
            case 4:
            case 5:
                return 1;
            default:
                Log.m105920e("MicroMsg.RemuxHelper", "unknown check type");
                return -50001;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static float m101484b(String str) {
        int i;
        C110052b bVar = new C110052b();
        try {
            bVar.mo161392k(str);
            int d = bVar.mo161385d();
            int i2 = 0;
            while (true) {
                if (i2 >= d) {
                    i = 0;
                    break;
                }
                MediaFormat e = bVar.mo161386e(i2);
                if (e.getString("mime").startsWith("video/") && e.containsKey("frame-rate")) {
                    i = e.getInteger("frame-rate");
                    break;
                }
                i2++;
            }
            bVar.mo161388g();
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.RemuxHelper", e2, "", new Object[0]);
            bVar.mo161388g();
            i = 0;
        } catch (Throwable th) {
            bVar.mo161388g();
            throw th;
        }
        Log.m105925i("MicroMsg.RemuxHelper", "getVideoFrameRate fps: %d", Integer.valueOf(i));
        return ((float) i) * 1.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.C82715b m101485c(java.lang.String r16) {
        /*
            r0 = r16
            java.lang.String r12 = "MicroMsg.RemuxHelper"
            oj.c r14 = new oj.c     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r14.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r14.setDataSource(r0)     // Catch:{ Exception -> 0x00ba }
            r1 = 24
            java.lang.String r1 = r14.extractMetadata(r1)     // Catch:{ Exception -> 0x00ba }
            r2 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00ba }
            r1 = 12
            java.lang.String r4 = r14.extractMetadata(r1)     // Catch:{ Exception -> 0x00ba }
            r1 = 9
            java.lang.String r5 = r14.extractMetadata(r1)     // Catch:{ Exception -> 0x00ba }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r2)     // Catch:{ Exception -> 0x00ba }
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r16)     // Catch:{ Exception -> 0x00ba }
            r8 = 18
            java.lang.String r8 = r14.extractMetadata(r8)     // Catch:{ Exception -> 0x00ba }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r2)     // Catch:{ Exception -> 0x00ba }
            r9 = 19
            java.lang.String r9 = r14.extractMetadata(r9)     // Catch:{ Exception -> 0x00ba }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r2)     // Catch:{ Exception -> 0x00ba }
            r10 = 20
            java.lang.String r10 = r14.extractMetadata(r10)     // Catch:{ Exception -> 0x00ba }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r2)     // Catch:{ Exception -> 0x00ba }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ba }
            r15 = 23
            r13 = 0
            if (r11 < r15) goto L_0x005b
            r11 = 25
            java.lang.String r11 = r14.extractMetadata(r11)     // Catch:{ Exception -> 0x00ba }
            float r11 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r11, r13)     // Catch:{ Exception -> 0x00ba }
            goto L_0x005c
        L_0x005b:
            r11 = 0
        L_0x005c:
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0069
            java.lang.String r11 = "fps is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)     // Catch:{ Exception -> 0x00ba }
            float r11 = m101484b(r16)     // Catch:{ Exception -> 0x00ba }
        L_0x0069:
            java.lang.String r13 = "filepath: %s, rotation: %d, type: %s, duration: %d, size %d, width: %d, height: %d, bitrate: %d, fps: %f"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r0     // Catch:{ Exception -> 0x00ba }
            r2 = 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r15     // Catch:{ Exception -> 0x00ba }
            r2 = 2
            r1[r2] = r4     // Catch:{ Exception -> 0x00ba }
            r2 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r15     // Catch:{ Exception -> 0x00ba }
            r2 = 4
            java.lang.Long r15 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r15     // Catch:{ Exception -> 0x00ba }
            r2 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r15     // Catch:{ Exception -> 0x00ba }
            r2 = 6
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r15     // Catch:{ Exception -> 0x00ba }
            r2 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r15     // Catch:{ Exception -> 0x00ba }
            r2 = 8
            java.lang.Float r15 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x00ba }
            r1[r2] = r15     // Catch:{ Exception -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r1)     // Catch:{ Exception -> 0x00ba }
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$b r13 = new com.tencent.mm.plugin.appbrand.jsapi.media.f2$b     // Catch:{ Exception -> 0x00ba }
            r1 = r13
            r2 = r16
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ba }
            r14.release()
            return r13
        L_0x00b3:
            r0 = move-exception
            r13 = r14
            goto L_0x00c6
        L_0x00b6:
            r0 = move-exception
            r13 = 0
            goto L_0x00c6
        L_0x00b9:
            r14 = 0
        L_0x00ba:
            java.lang.String r0 = "getVideoInfo error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)     // Catch:{ all -> 0x00b3 }
            if (r14 == 0) goto L_0x00c4
            r14.release()
        L_0x00c4:
            r1 = 0
            return r1
        L_0x00c6:
            if (r13 == 0) goto L_0x00cb
            r13.release()
        L_0x00cb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.m101485c(java.lang.String):com.tencent.mm.plugin.appbrand.jsapi.media.f2$b");
    }

    /* renamed from: d */
    public static String m101486d(C82714a aVar) {
        int i;
        String str;
        char c;
        char c2;
        C82714a aVar2 = aVar;
        if (aVar2 == null) {
            Log.m105920e("MicroMsg.RemuxHelper", "remuxIfNeed, compress request is null");
            return null;
        }
        Class cls = ISightJNIService.class;
        String str2 = aVar2.f242012a;
        if (m101483a(str2) != -50006) {
            C82707e0.m101478a(15);
            return str2;
        }
        Log.m105925i("MicroMsg.RemuxHelper", "compress info: filePath: %s, suggestWidth: %d, suggestHeight: %d, outputWidth: %d, outputHeight: %d, remuxBitRate %d", str2, Integer.valueOf(aVar2.f242013b), Integer.valueOf(aVar2.f242014c), Integer.valueOf(aVar2.f242015d), Integer.valueOf(aVar2.f242016e), Integer.valueOf(aVar2.f242017f));
        int i2 = aVar2.f242015d;
        if (i2 == 0 || (i = aVar2.f242016e) == 0) {
            int i3 = aVar2.f242013b;
            if (i3 <= 0) {
                i3 = TAVExporter.VIDEO_EXPORT_WIDTH;
            }
            int i4 = aVar2.f242014c;
            if (i4 <= 0) {
                i4 = TAVPlayer.VIDEO_PLAYER_WIDTH;
            }
            C82715b c3 = m101485c(str2);
            Log.m105925i("MicroMsg.RemuxHelper", "sourceWidth: %d, sourceHeight: %d", Integer.valueOf(c3 == null ? 0 : c3.f242023e), Integer.valueOf(c3 == null ? 0 : c3.f242024f));
            int[] iArr = new int[2];
            ((C101480j) C86312j.m106911c(C101480j.class)).ml0(str2, iArr, i3, i4);
            i2 = iArr[0];
            i = iArr[1];
        } else {
            if (i2 % 2 != 0) {
                i2++;
            }
            if (i % 2 != 0) {
                i++;
            }
        }
        int i5 = i2;
        int i6 = i;
        Log.m105925i("MicroMsg.RemuxHelper", "outputWidth: %d, outputHeight: %d", Integer.valueOf(i5), Integer.valueOf(i6));
        int i7 = aVar2.f242017f;
        if (i7 <= 0) {
            i7 = C85457c.f249058c;
        }
        int i8 = i7;
        float f = aVar2.f242018g;
        if (f <= 0.0f) {
            f = C85457c.f249059d;
        }
        float f2 = f;
        if (!C86013q1.m106450k(C112760b.m154203K())) {
            C86013q1.m106461v(C112760b.m154203K());
        }
        String str3 = C112760b.m154203K() + "microMsg." + System.currentTimeMillis() + ".mp4";
        PInt pInt = new PInt();
        C82707e0.m101478a(0);
        Log.m105924i("MicroMsg.RemuxHelper", "hard remux mode.");
        C82707e0.m101478a(1);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PInt pInt2 = pInt;
        float f3 = f2;
        ((C101359j0) ((C86680e) C86312j.m106911c(C86680e.class)).mo120820U8()).mo140842a(str2, str3, i5, i6, i8, (int) f2, 0, 51, new C82709e2(pInt, countDownLatch)).mo124208b();
        try {
            Log.m105918d("MicroMsg.RemuxHelper", "latch await ");
            countDownLatch.await();
        } catch (InterruptedException e) {
            Log.m105921e("MicroMsg.RemuxHelper", "latch await exception, %s.", e.getMessage());
        }
        int i9 = pInt2.value;
        if (i9 < 0) {
            Log.m105921e("MicroMsg.RemuxHelper", "remux failed, ret: %d, try soft remux mode", Integer.valueOf(i9));
            C82707e0.m101478a(12);
            c2 = 2;
            c = 1;
            str = str2;
            i9 = ((ISightJNIService) C86312j.m106911c(cls)).remuxingVFS(str2, str3, i5, i6, i8, C85457c.f249057b, 8, 2, 25.0f, f3, (byte[]) null, 0, false, 0, 51);
        } else {
            str = str2;
            c2 = 2;
            c = 1;
            C82707e0.m101478a(10);
        }
        if (i9 < 0) {
            C82707e0.m101478a(13);
        }
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[c] = str3;
        objArr[c2] = Integer.valueOf(i9);
        objArr[3] = Integer.valueOf(i5);
        objArr[4] = Integer.valueOf(i6);
        Log.m105925i("MicroMsg.RemuxHelper", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", objArr);
        return str3;
    }

    /* renamed from: e */
    public static String m101487e(String str) {
        if (str == null) {
            Log.m105920e("MicroMsg.RemuxHelper", "remuxIfNeed, filePath is null");
            return null;
        }
        C81192y0.m99475a();
        return m101486d(new C82714a(str, TAVExporter.VIDEO_EXPORT_WIDTH, TAVPlayer.VIDEO_PLAYER_WIDTH, 0, 0, C85457c.f249058c, C85457c.f249059d));
    }
}
