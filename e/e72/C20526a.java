package e72;

import c72.C16867c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;
import k34.C117388a;
import t62.C22438a;
import u62.C22583d;
import u62.C22595e;
import z62.C66735c;

/* renamed from: e72.a */
public final class C20526a extends C117388a {

    /* renamed from: d */
    public final C22595e f57765d;

    /* renamed from: e */
    public C22438a f57766e;

    /* renamed from: f */
    public final AtomicInteger f57767f = new AtomicInteger(1);

    /* renamed from: g */
    public final C20527b f57768g = new C20527b();

    /* renamed from: h */
    public C16867c f57769h;

    public C20526a(C22595e eVar, C66735c cVar, C22583d.C22586c cVar2) {
        C87412m.m108594g(eVar, "onePlayContext");
        C87412m.m108594g(cVar, "mediaSource");
        this.f57765d = eVar;
        this.f57766e = eVar.mo35701e();
        this.f57769h = new C16867c(eVar, cVar, cVar2);
    }

    /* renamed from: a */
    public final String mo32079a() {
        return this.f57765d.mo35698b("MMMarsDownloaderProxy");
    }

    public String getContentType(int i, String str) {
        String a = C22595e.C22596a.m26412a(this.f57765d, (String) null, 1, (Object) null);
        Log.m105924i(a, "getContentType() fileId:" + i + ", fileKey:" + str + " contentType:" + MimeTypes.VIDEO_MP4);
        return MimeTypes.VIDEO_MP4;
    }

    public String getDataFilePath(int i, String str) {
        String filePath = this.f57766e.getFilePath();
        String i2 = C86013q1.m106448i(filePath, false);
        String a = mo32079a();
        Log.m105924i(a, "getDataFilePath(), dataFilePath:" + i2 + " isExists:" + C86013q1.m106450k(i2) + " mediaInfoPath:" + filePath);
        return i2;
    }

    public long getDataTotalSize(int i, String str) {
        long c = this.f57766e.mo22519c();
        String a = mo32079a();
        Log.m105924i(a, "getDataTotalSize() fileId:" + i + ", fileKey:" + str + " dataTotalSize:" + c);
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x033f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onReadData(int r24, java.lang.String r25, long r26, long r28) {
        /*
            r23 = this;
            r0 = r23
            r8 = r26
            r10 = r28
            t62.a r1 = r0.f57766e
            boolean r1 = r1.mo22517a()
            java.lang.String r2 = "], originRequest[offset:"
            java.lang.String r12 = "] "
            java.lang.String r13 = " fixRequest[offset:"
            java.lang.String r14 = " length:"
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = r23.mo32079a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "notifyDataReady isCacheComplete returnLength:"
            r3.append(r4)
            r3.append(r10)
            r3.append(r13)
            r3.append(r8)
            r3.append(r14)
            r3.append(r10)
            r3.append(r2)
            r3.append(r8)
            r3.append(r14)
            r3.append(r10)
            r3.append(r12)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0380
        L_0x004e:
            c72.c r1 = r0.f57769h
            b72.a$a r1 = r1.f45277i
            b72.a$a r5 = b72.C16752a.C16753a.PROGRESS
            r7 = 0
            if (r1 == r5) goto L_0x005e
            b72.a$a r5 = b72.C16752a.C16753a.SUCCESS
            if (r1 != r5) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r1 = 0
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            java.lang.String r5 = " requestLength:"
            r6 = 32
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = r23.mo32079a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "notifyDataReady, return for downloader never start. requestOffset:"
            r2.append(r7)
            r2.append(r8)
            r2.append(r5)
            r2.append(r10)
            r2.append(r6)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
        L_0x0089:
            r10 = 0
            goto L_0x0380
        L_0x008d:
            u62.e r1 = r0.f57765d
            int r1 = r1.getPlayerState()
            r3 = 6
            if (r1 <= r3) goto L_0x00e9
            t62.a r1 = r0.f57766e
            long r3 = r1.mo22518b()
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e9
            e72.b r1 = r0.f57768g
            java.lang.String r2 = r23.mo32079a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "notifyDataReady return for pause state. request[offset:"
            r3.append(r4)
            r3.append(r8)
            r3.append(r14)
            r3.append(r10)
            java.lang.String r4 = "] cacheSize:"
            r3.append(r4)
            t62.a r4 = r0.f57766e
            long r4 = r4.mo22518b()
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 5000(0x1388, float:7.006E-42)
            r1.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r1.f57771b
            long r7 = r5 - r7
            long r9 = (long) r4
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0089
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            r1.f57771b = r5
            goto L_0x0089
        L_0x00e9:
            t62.a r1 = r0.f57766e
            boolean r1 = r1.mo22517a()
            if (r1 == 0) goto L_0x00f8
            r18 = r2
            r8 = r10
        L_0x00f4:
            r1 = 0
            goto L_0x0177
        L_0x00f8:
            r1 = 2
            long[] r1 = new long[r1]
            c72.c r3 = r0.f57769h
            r3.getClass()
            z62.c r3 = r3.f45273e
            java.lang.String r3 = r3.f191765a
            int r3 = com.tencent.mars.cdn.CdnLogic.queryContinuousSize(r3, r8, r1)
            if (r3 != 0) goto L_0x011d
            r16 = r1[r7]
            r18 = -1
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 == 0) goto L_0x011d
            int r1 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0118
            r16 = r10
        L_0x0118:
            r18 = r2
            r8 = r16
            goto L_0x00f4
        L_0x011d:
            e72.b r4 = r0.f57768g
            java.lang.String r6 = r23.mo32079a()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "notifyDataReady() queryContinuousSize error, ret:"
            r15.append(r7)
            r15.append(r3)
            java.lang.String r3 = " requestOffset:"
            r15.append(r3)
            r15.append(r8)
            java.lang.String r3 = " continuousSize:"
            r15.append(r3)
            r18 = r2
            r7 = 0
            r2 = r1[r7]
            r15.append(r2)
            java.lang.String r2 = " totalSize:"
            r15.append(r2)
            r2 = 1
            r7 = r1[r2]
            r15.append(r7)
            r1 = 32
            r15.append(r1)
            r15.append(r0)
            java.lang.String r1 = r15.toString()
            r2 = 1000(0x3e8, float:1.401E-42)
            r4.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r4.f57770a
            long r9 = r7 - r9
            long r2 = (long) r2
            int r15 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0173
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            r4.f57770a = r7
        L_0x0173:
            r1 = 0
            r8 = 0
        L_0x0177:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x033f
            c72.c r10 = r0.f57769h
            u62.e r1 = r0.f57765d
            s62.d r1 = r1.mo35700d()
            r1.getClass()
            u62.e r1 = r0.f57765d
            s62.d r1 = r1.mo35700d()
            r1.getClass()
            t62.a r1 = r10.f45278j
            boolean r1 = r1.mo22521e()
            if (r1 != 0) goto L_0x0199
            r1 = -1
            goto L_0x01a2
        L_0x0199:
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.f45590q
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x01b0
            r1 = -2
        L_0x01a2:
            r21 = r8
            r16 = r12
            r20 = r13
            r25 = r14
            r11 = r26
            r14 = r28
            goto L_0x02db
        L_0x01b0:
            r1 = 1048576(0x100000, double:5.180654E-318)
            r6 = r28
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x01bd
            r3 = r26
            r1 = r6
            goto L_0x01bf
        L_0x01bd:
            r3 = r26
        L_0x01bf:
            long r18 = r3 + r1
            t62.a r15 = r10.f45278j
            long r20 = r15.mo22519c()
            int r15 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r15 <= 0) goto L_0x020f
            t62.a r1 = r10.f45278j
            long r1 = r1.mo22519c()
            long r1 = r1 - r3
            java.lang.String r15 = r10.mo17757c()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r25 = r5
            java.lang.String r5 = "requestedResource requestLength is valid, requestOffset:"
            r11.append(r5)
            r11.append(r3)
            java.lang.String r5 = ", requestLength:"
            r11.append(r5)
            r11.append(r1)
            java.lang.String r5 = ", totalSize:"
            r11.append(r5)
            t62.a r5 = r10.f45278j
            r18 = r1
            long r1 = r5.mo22519c()
            r11.append(r1)
            r5 = 32
            r11.append(r5)
            r11.append(r10)
            java.lang.String r1 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r1)
            r1 = r18
            goto L_0x0213
        L_0x020f:
            r25 = r5
            r5 = 32
        L_0x0213:
            c72.b r11 = r10.f45593t
            if (r11 == 0) goto L_0x023c
            z62.c r15 = r10.f45273e
            java.lang.String r15 = r15.f191765a
            r5 = -2
            int r7 = (int) r5
            r18 = r1
            r1 = r11
            r2 = r15
            r5 = r3
            r3 = r26
            r21 = r8
            r16 = r12
            r20 = r13
            r8 = 32
            r13 = r25
            r11 = r5
            r25 = r14
            r14 = r28
            r5 = r18
            r9 = 0
            int r1 = r1.mo17916e(r2, r3, r5, r7)
            goto L_0x024f
        L_0x023c:
            r18 = r1
            r21 = r8
            r16 = r12
            r20 = r13
            r8 = 32
            r9 = 0
            r13 = r25
            r11 = r3
            r25 = r14
            r14 = r6
            r1 = -113(0xffffffffffffff8f, float:NaN)
        L_0x024f:
            if (r1 == 0) goto L_0x0273
            java.lang.String r2 = r10.mo17757c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestedResource requestVideoData fail, ret:"
            r3.append(r4)
            r3.append(r1)
            r3.append(r8)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            r10.mo17919l(r9)
            goto L_0x02a3
        L_0x0273:
            java.lang.String r2 = r10.mo17757c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestedResource requestVideoData success, ret:"
            r3.append(r4)
            r3.append(r1)
            r3.append(r8)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            r2 = 1
            r10.mo17919l(r2)
            u62.d$c r2 = r10.f45589p
            if (r2 == 0) goto L_0x02a3
            z62.c r3 = r10.f45273e
            int r4 = (int) r11
            r5 = r18
            int r7 = (int) r5
            r2.mo24017m(r3, r4, r7)
            goto L_0x02a5
        L_0x02a3:
            r5 = r18
        L_0x02a5:
            java.lang.String r2 = r10.mo17757c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestedResource requestVideoData requestOffset:"
            r3.append(r4)
            r3.append(r11)
            java.lang.String r4 = " requestLengthFix:"
            r3.append(r4)
            r3.append(r5)
            r3.append(r13)
            r3.append(r14)
            java.lang.String r4 = " ret:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = "  "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
        L_0x02db:
            if (r1 >= 0) goto L_0x033c
            e72.b r2 = r0.f57768g
            java.lang.String r3 = r23.mo32079a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "notifyDataReady ret:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " returnLength:"
            r4.append(r1)
            r5 = r21
            r4.append(r5)
            r1 = r20
            r4.append(r1)
            r4.append(r11)
            r7 = r25
            r4.append(r7)
            r4.append(r14)
            java.lang.String r1 = "],  originRequest[offset:"
            r4.append(r1)
            r4.append(r11)
            r4.append(r7)
            r4.append(r14)
            r8 = r16
            r4.append(r8)
            r4.append(r0)
            java.lang.String r1 = r4.toString()
            r4 = 200(0xc8, float:2.8E-43)
            r2.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r2.f57772c
            long r9 = r7 - r9
            long r11 = (long) r4
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x037f
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)
            r2.f57772c = r7
            goto L_0x037f
        L_0x033c:
            r5 = r21
            goto L_0x037f
        L_0x033f:
            r5 = r8
            r8 = r12
            r1 = r13
            r7 = r14
            r11 = r26
            r14 = r28
            java.lang.String r2 = r23.mo32079a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "notifyDataReady returnLength:"
            r3.append(r4)
            r3.append(r5)
            r3.append(r1)
            r3.append(r11)
            r3.append(r7)
            r3.append(r14)
            r1 = r18
            r3.append(r1)
            r3.append(r11)
            r3.append(r7)
            r3.append(r14)
            r3.append(r8)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x037f:
            r10 = r5
        L_0x0380:
            int r1 = (int) r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e72.C20526a.onReadData(int, java.lang.String, long, long):int");
    }

    public int onStartReadData(int i, String str, long j, long j2) {
        int andIncrement = this.f57767f.getAndIncrement();
        String a = mo32079a();
        Log.m105924i(a, "onStartReadData, requestId: " + andIncrement);
        this.f57769h.mo17758d();
        return andIncrement;
    }

    public int onStopReadData(int i, String str, int i2) {
        String a = mo32079a();
        Log.m105924i(a, "onStopReadData() fileId:" + i + ", fileKey:" + str + ", requestId:" + i2);
        return 0;
    }
}
