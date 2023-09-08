package es2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.vfs.C86013q1;
import es2.C97696c;
import os2.C100408j0;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: es2.g */
public class C97703g extends C97704h {
    public C97703g(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
    }

    /* renamed from: l */
    public int mo136974l() {
        SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
        SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d2, code lost:
        if (r5 != 0) goto L_0x01d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x03e0  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136976q() {
        /*
            r32 = this;
            r0 = r32
            java.lang.String r1 = "processData"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            es2.a r3 = r0.f286589f
            java.lang.String r3 = r3.f286546j
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0022
            es2.a r3 = r0.f286589f
            java.lang.String r3 = r3.f286547k
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x002a
            es2.a r3 = r0.f286589f
            java.lang.String r3 = r3.f286547k
            goto L_0x0030
        L_0x002a:
            te3.kv2 r3 = r0.f286590g
            java.lang.String r3 = vr2.C102236a0.m134717L(r3)
        L_0x0030:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            es2.a r7 = r0.f286589f
            java.lang.String r7 = r7.mo136951c()
            r6.append(r7)
            es2.a r7 = r0.f286589f
            java.lang.String r7 = r7.mo136954f()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inJustDecodeBounds = r5
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r6, r7)
            java.lang.String r8 = r7.outMimeType
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x0060
            java.lang.String r8 = r8.toLowerCase()
            goto L_0x0061
        L_0x0060:
            r8 = r9
        L_0x0061:
            long r17 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            java.lang.String r6 = "webp"
            boolean r6 = r8.contains(r6)
            r15 = 2
            r14 = 3
            if (r6 == 0) goto L_0x0072
            r6 = 0
            goto L_0x0089
        L_0x0072:
            java.lang.String r6 = "vcodec"
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L_0x007d
            r6 = 1
            goto L_0x0089
        L_0x007d:
            java.lang.String r6 = "wxam"
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L_0x0088
            r6 = 3
            goto L_0x0089
        L_0x0088:
            r6 = 2
        L_0x0089:
            java.lang.String r13 = "MicroMsg.SnsDownloadImage"
            if (r6 == 0) goto L_0x02b8
            if (r6 == r5) goto L_0x0202
            if (r6 == r15) goto L_0x00a0
            r5 = r13
            r8 = 3
            if (r6 == r14) goto L_0x009b
            r10 = -1
            r21 = 2
            goto L_0x0356
        L_0x009b:
            r10 = 1
            r21 = 2
            goto L_0x0207
        L_0x00a0:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            es2.a r10 = r0.f286589f
            java.lang.String r10 = r10.mo136951c()
            r12.append(r10)
            es2.a r10 = r0.f286589f
            java.lang.String r10 = r10.mo136954f()
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            android.os.Vibrator r11 = vr2.C102236a0.f301037a
            java.lang.String r11 = "isTooMax"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            r14 = 4194304(0x400000, float:5.877472E-39)
            android.graphics.BitmapFactory$Options r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r10)     // Catch:{ Exception -> 0x00f1 }
            int r15 = r10.outWidth     // Catch:{ Exception -> 0x00f1 }
            int r10 = r10.outHeight     // Catch:{ Exception -> 0x00f1 }
            if (r10 > 0) goto L_0x00d7
            if (r15 > 0) goto L_0x00d7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x00fb
        L_0x00d7:
            int r5 = r15 * 2
            if (r10 >= r5) goto L_0x00ed
            int r5 = r10 * 2
            if (r15 < r5) goto L_0x00e0
            goto L_0x00ed
        L_0x00e0:
            int r10 = r10 * r15
            if (r10 <= r14) goto L_0x00e9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            r5 = 1
            goto L_0x00fc
        L_0x00e9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x00fb
        L_0x00ed:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x00fb
        L_0x00f1:
            java.lang.String r5 = "MicroMsg.SnsUtil"
            java.lang.String r10 = "get error setImageExtInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
        L_0x00fb:
            r5 = 0
        L_0x00fc:
            if (r5 == 0) goto L_0x018e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "the "
            r5.append(r10)
            es2.a r10 = r0.f286589f
            java.lang.String r10 = r10.f286538b
            r5.append(r10)
            java.lang.String r10 = " is too max ! "
            r5.append(r10)
            es2.a r10 = r0.f286589f
            java.lang.String r10 = r10.f286539c
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            es2.a r10 = r0.f286589f
            java.lang.String r10 = r10.mo136951c()
            r5.append(r10)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            es2.a r5 = r0.f286589f
            java.lang.String r5 = r5.mo136951c()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            es2.a r14 = r0.f286589f
            java.lang.String r14 = r14.mo136951c()
            r12.append(r14)
            es2.a r14 = r0.f286589f
            java.lang.String r14 = r14.mo136954f()
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            os2.C100408j0.m131387bD(r5, r12, r3, r4)
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            es2.a r12 = r0.f286589f
            java.lang.String r12 = r12.mo136951c()
            r5.append(r12)
            es2.a r12 = r0.f286589f
            java.lang.String r12 = r12.mo136954f()
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            r22 = r10
            r19 = r14
            goto L_0x01a3
        L_0x018e:
            es2.a r5 = r0.f286589f
            java.lang.String r5 = r5.mo136951c()
            es2.a r10 = r0.f286589f
            java.lang.String r10 = r10.mo136954f()
            com.tencent.p014mm.vfs.C86013q1.m106435Q(r5, r10, r3)
            r10 = 0
            r22 = r10
            r19 = -1
        L_0x01a3:
            java.lang.String r5 = "jpg"
            boolean r5 = r8.contains(r5)
            r10 = -1
            if (r5 != 0) goto L_0x01b9
            java.lang.String r5 = "jpeg"
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x01b7
            goto L_0x01b9
        L_0x01b7:
            r5 = -1
            goto L_0x01d5
        L_0x01b9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            es2.a r8 = r0.f286589f
            java.lang.String r8 = r8.mo136951c()
            r5.append(r8)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            int r5 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r5)
            if (r5 != 0) goto L_0x01d5
            goto L_0x01b7
        L_0x01d5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            es2.a r10 = r0.f286589f
            java.lang.String r10 = r10.mo136951c()
            r8.append(r10)
            r8.append(r3)
            java.lang.String r10 = r8.toString()
            es2.a r8 = r0.f286589f
            java.lang.String r11 = r8.f286539c
            r12 = 0
            java.lang.String r8 = r7.outMimeType
            int r14 = r7.outWidth
            int r15 = r7.outHeight
            r7 = r13
            r13 = r8
            r8 = 3
            r21 = 2
            r16 = r5
            com.tencent.p014mm.plugin.sns.statistics.C94994j.m120749c(r10, r11, r12, r13, r14, r15, r16, r17, r19)
            r5 = r7
            goto L_0x0354
        L_0x0202:
            r5 = r13
            r8 = 3
            r21 = 2
            r10 = 1
        L_0x0207:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            es2.a r12 = r0.f286589f
            java.lang.String r12 = r12.mo136951c()
            r10.append(r12)
            es2.a r12 = r0.f286589f
            java.lang.String r12 = r12.mo136954f()
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r11[r4] = r10
            java.lang.String r10 = "found vcodec:%s, reencoded."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            es2.a r11 = r0.f286589f
            java.lang.String r11 = r11.mo136951c()
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            es2.a r12 = r0.f286589f
            java.lang.String r12 = r12.mo136951c()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            es2.a r14 = r0.f286589f
            java.lang.String r14 = r14.mo136951c()
            r13.append(r14)
            es2.a r14 = r0.f286589f
            java.lang.String r14 = r14.mo136954f()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            os2.C100408j0.m131387bD(r12, r13, r3, r4)
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            es2.a r13 = r0.f286589f
            java.lang.String r13 = r13.mo136951c()
            r12.append(r13)
            es2.a r13 = r0.f286589f
            java.lang.String r13 = r13.mo136954f()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
            long r22 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            es2.a r11 = r0.f286589f
            java.lang.String r11 = r11.mo136951c()
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            es2.a r11 = r0.f286589f
            java.lang.String r11 = r11.f286539c
            r12 = 0
            java.lang.String r13 = r7.outMimeType
            int r14 = r7.outWidth
            int r15 = r7.outHeight
            r16 = -1
            com.tencent.p014mm.plugin.sns.statistics.C94994j.m120749c(r10, r11, r12, r13, r14, r15, r16, r17, r19)
            goto L_0x0354
        L_0x02b8:
            r5 = r13
            r8 = 3
            r21 = 2
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r25 = 22
            r27 = 64
            r29 = 1
            r31 = 1
            r24.idkeyStat(r25, r27, r29, r31)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            es2.a r11 = r0.f286589f
            java.lang.String r11 = r11.mo136951c()
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            es2.a r12 = r0.f286589f
            java.lang.String r12 = r12.mo136951c()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            es2.a r14 = r0.f286589f
            java.lang.String r14 = r14.mo136951c()
            r13.append(r14)
            es2.a r14 = r0.f286589f
            java.lang.String r14 = r14.mo136954f()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            os2.C100408j0.m131387bD(r12, r13, r3, r4)
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            es2.a r13 = r0.f286589f
            java.lang.String r13 = r13.mo136951c()
            r12.append(r13)
            es2.a r13 = r0.f286589f
            java.lang.String r13 = r13.mo136954f()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
            long r22 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            es2.a r11 = r0.f286589f
            java.lang.String r11 = r11.mo136951c()
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            es2.a r11 = r0.f286589f
            java.lang.String r11 = r11.f286539c
            r12 = 0
            java.lang.String r13 = r7.outMimeType
            int r14 = r7.outWidth
            int r15 = r7.outHeight
            r16 = -1
            com.tencent.p014mm.plugin.sns.statistics.C94994j.m120749c(r10, r11, r12, r13, r14, r15, r16, r17, r19)
        L_0x0354:
            r10 = r22
        L_0x0356:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "donwload big pic isWebp "
            r7.append(r12)
            if (r6 != 0) goto L_0x0364
            r6 = 1
            goto L_0x0365
        L_0x0364:
            r6 = 0
        L_0x0365:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            es2.a r6 = r0.f286589f
            java.lang.String r6 = r6.mo136951c()
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 6
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r13[r4] = r14
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 1
            r13[r11] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            r13[r21] = r10
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r13[r8] = r10
            com.tencent.p014mm.plugin.sns.model.C94866e1.Ex0()
            r10 = 4
            r13[r10] = r9
            java.lang.String r11 = a70.C112760b.m154230f0()
            r14 = 5
            r13[r14] = r11
            r11 = 11696(0x2db0, float:1.639E-41)
            r7.mo160131h(r11, r13)
            es2.a r13 = r0.f286589f
            int r13 = r13.mo136952d()
            if (r13 == r8) goto L_0x03c6
            r13 = 1
            goto L_0x03c7
        L_0x03c6:
            r13 = 0
        L_0x03c7:
            es2.a r15 = r0.f286589f
            vr2.v r15 = r15.f286544h
            if (r15 == 0) goto L_0x03de
            int r15 = r15.mo141829a()
            if (r15 == r10) goto L_0x03de
            es2.a r15 = r0.f286589f
            vr2.v r15 = r15.f286544h
            int r15 = r15.mo141829a()
            if (r15 == r14) goto L_0x03de
            r13 = 0
        L_0x03de:
            if (r13 == 0) goto L_0x04d1
            te3.kv2 r13 = r0.f286590g
            java.lang.String r13 = vr2.C102236a0.m134729X(r13)
            java.lang.Class<h81.h> r15 = h81.C32735h.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            h81.h r15 = (h81.C32735h) r15
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_sns_use_high_thumb
            int r11 = r15.mo58779Qe(r11, r4)
            r15 = 1
            if (r15 != r11) goto L_0x03f9
            r11 = 1
            goto L_0x03fa
        L_0x03f9:
            r11 = 0
        L_0x03fa:
            boolean r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r15 != 0) goto L_0x0406
            boolean r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r15 != 0) goto L_0x0406
            boolean r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r15 == 0) goto L_0x0407
        L_0x0406:
            r11 = 1
        L_0x0407:
            if (r11 == 0) goto L_0x0435
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            es2.a r15 = r0.f286589f
            java.lang.String r15 = r15.mo136951c()
            r11.append(r15)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r11 == 0) goto L_0x0435
            es2.a r4 = r0.f286589f
            te3.kv2 r5 = r0.f286590g
            int r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Hx0()
            float r6 = (float) r6
            r0.mo136983u(r4, r5, r3, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x0433:
            r1 = 1
            return r1
        L_0x0435:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            es2.a r15 = r0.f286589f
            java.lang.String r15 = r15.mo136951c()
            r11.append(r15)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r11 == 0) goto L_0x0468
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            es2.a r15 = r0.f286589f
            java.lang.String r15 = r15.mo136951c()
            r11.append(r15)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r11)
        L_0x0468:
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            es2.a r11 = r0.f286589f
            java.lang.String r11 = r11.mo136951c()
            int r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ox0()
            float r15 = (float) r15
            os2.C100408j0.m131392kD(r11, r3, r13, r15)
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            es2.a r15 = r0.f286589f
            java.lang.String r15 = r15.mo136951c()
            r11.append(r15)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            java.lang.Object[] r11 = new java.lang.Object[r12]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r11[r4] = r12
            java.lang.Long r4 = java.lang.Long.valueOf(r17)
            r12 = 1
            r11[r12] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r11[r21] = r4
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r11[r8] = r4
            com.tencent.p014mm.plugin.sns.model.C94866e1.Ex0()
            r11[r10] = r9
            java.lang.String r4 = a70.C112760b.m154230f0()
            r11[r14] = r4
            r4 = 11696(0x2db0, float:1.639E-41)
            r7.mo160131h(r4, r11)
            es2.a r4 = r0.f286589f
            te3.kv2 r5 = r0.f286590g
            int r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Hx0()
            float r6 = (float) r6
            r0.mo136983u(r4, r5, r3, r6)
        L_0x04d1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x0433
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.C97703g.mo136976q():boolean");
    }

    /* renamed from: u */
    public final void mo136983u(C97694a aVar, C101804kv2 kv22, String str, float f) {
        SnsMethodCalculate.markStartTimeMs("createUserAlbum", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
        String g0 = C102236a0.m134745g0(kv22);
        if (!C86013q1.m106450k(aVar.mo136951c() + g0)) {
            C100408j0.m131393mI(aVar.mo136951c(), str, g0, f);
        }
        SnsMethodCalculate.markEndTimeMs("createUserAlbum", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
    }
}
