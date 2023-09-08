package ot2;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import os2.C100406i0;
import os2.C100417r0;
import pe3.C47465a;
import te3.C101783gu2;
import te3.C101799k1;
import te3.C101808lv2;
import te3.C101821nv2;
import te3.C64241ar2;
import wx3.C15601d;

/* renamed from: ot2.d */
public final class C100435d {

    /* renamed from: a */
    public SnsInfo f294224a;

    /* renamed from: b */
    public TimeLineObject f294225b;

    /* renamed from: c */
    public C101808lv2 f294226c;

    /* renamed from: d */
    public int f294227d = -1;

    /* renamed from: e */
    public byte[] f294228e;

    /* renamed from: f */
    public String f294229f = "";

    /* renamed from: a */
    public static final /* synthetic */ String m131456a(C100435d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFakeVideoLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        String str = dVar.f294229f;
        SnsMethodCalculate.markEndTimeMs("access$getFakeVideoLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0048, code lost:
        r6 = r6.ContentObj;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ot2.C100435d mo139922b(java.lang.String r22, java.lang.String r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "addSightObjectByPath"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "mixPath"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "thumbPath"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106456q(r22)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "addSightObjectByPath >> mixPath: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", sightMd5: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", thumbPath: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMag.BackgroundVideoFinishUploader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r0.f294225b
            r8 = 0
            if (r6 == 0) goto L_0x004f
            te3.j00 r6 = r6.ContentObj
            if (r6 == 0) goto L_0x004f
            java.util.LinkedList<te3.kv2> r6 = r6.f298427h
            goto L_0x0050
        L_0x004f:
            r6 = r8
        L_0x0050:
            if (r6 == 0) goto L_0x0268
            int r9 = r6.size()
            if (r9 > 0) goto L_0x005a
            goto L_0x0268
        L_0x005a:
            r9 = 0
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r10 = "localMediaObjList[0]"
            gy3.C87412m.m108593f(r6, r10)
            te3.kv2 r6 = (te3.C101804kv2) r6
            int r10 = r6.f298690e
            r11 = 8
            if (r10 == r11) goto L_0x0077
            java.lang.String r1 = "mediaObj is upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r8
        L_0x0077:
            java.lang.String r10 = r6.f298689d
            java.lang.String r11 = "mediaObj.Id"
            gy3.C87412m.m108593f(r10, r11)
            r0.f294229f = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "mediaObj url: "
            r10.append(r11)
            java.lang.String r11 = r6.f298692g
            r10.append(r11)
            java.lang.String r11 = ", desc: "
            r10.append(r11)
            java.lang.String r11 = r6.f298691f
            r10.append(r11)
            java.lang.String r11 = ", thumb: "
            r10.append(r11)
            java.lang.String r11 = r6.f298694i
            r10.append(r11)
            java.lang.String r11 = ", id: "
            r10.append(r11)
            int r11 = r6.f298701s
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r10 = 0
            hi2.o r11 = hi2.C98464o.f288797a
            hi2.o$a r11 = r11.mo137832a(r1)
            if (r11 == 0) goto L_0x00d9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "addSightObjectByPath commit video_info:"
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            int r10 = r11.f288800c
            float r10 = (float) r10
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 / r11
        L_0x00d9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            r11.append(r12)
            java.nio.charset.Charset r12 = z04.C119027c.f356488a
            byte[] r13 = r1.getBytes(r12)
            java.lang.String r14 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.String r13 = p823sg.C90193h.m112878f(r13)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "checkToCreateDir"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
            java.lang.String r15 = com.tencent.p014mm.vfs.C86013q1.m106458s(r11)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120263iU()
            r1.append(r13)
            byte[] r12 = r2.getBytes(r12)
            gy3.C87412m.m108593f(r12, r14)
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r1)
            java.lang.String r2 = "sightmd5"
            gy3.C87412m.m108593f(r5, r2)
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r2 = "produceSightByPath"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            te3.kv2 r12 = ad0.C91999u.m115560f()
            java.lang.String r13 = ""
            r12.f298689d = r13
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r14 = 6
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r13[r9] = r15
            r9 = 1
            r13[r9] = r11
            r9 = 2
            r13[r9] = r5
            r9 = 3
            r13[r9] = r19
            r9 = 4
            r13[r9] = r20
            java.lang.String r9 = "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r13)
            r12.f298690e = r14
            long r15 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            r17 = 0
            int r9 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r9 > 0) goto L_0x0174
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            r12 = r8
            goto L_0x01c8
        L_0x0174:
            vr2.y r9 = new vr2.y
            r9.<init>((java.lang.String) r11, (int) r14)
            r9.f301226m = r5
            os2.j0 r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            r16 = r9
            r17 = r11
            r18 = r1
            r15.mo139874uP(r16, r17, r18, r19, r20)
            int r1 = r9.f301221h
            if (r1 <= 0) goto L_0x01a9
            int r1 = r9.f301220g
            if (r1 <= 0) goto L_0x01a9
            int r1 = r9.f301222i
            if (r1 <= 0) goto L_0x01a9
            te3.mv2 r1 = new te3.mv2
            r1.<init>()
            int r5 = r9.f301221h
            float r5 = (float) r5
            r1.f298876e = r5
            int r5 = r9.f301220g
            float r5 = (float) r5
            r1.f298875d = r5
            int r5 = r9.f301222i
            float r5 = (float) r5
            r1.f298877f = r5
            goto L_0x01aa
        L_0x01a9:
            r1 = r8
        L_0x01aa:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "Locall_path"
            r5.append(r11)
            int r11 = r9.f301219f
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r12.f298689d = r5
            r12.f298698p = r1
            int r1 = r9.f301219f
            r12.f298701s = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
        L_0x01c8:
            if (r12 != 0) goto L_0x01d4
            java.lang.String r1 = "share img o.imagePath is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r8
        L_0x01d4:
            java.lang.String r1 = r6.f298691f
            r12.f298691f = r1
            java.lang.String r1 = r12.f298697o
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x01e4
            java.lang.String r1 = r6.f298691f
            r12.f298697o = r1
        L_0x01e4:
            r12.f298684R = r10
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r0.f294225b
            gy3.C87412m.m108591d(r1)
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            r1.clear()
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r0.f294225b
            gy3.C87412m.m108591d(r1)
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            r1.add(r12)
            te3.ar2 r1 = new te3.ar2
            r1.<init>()
            int r2 = r12.f298701s
            r1.f182140d = r2
            te3.lv2 r2 = r0.f294226c
            gy3.C87412m.m108591d(r2)
            java.util.LinkedList<te3.ar2> r2 = r2.f298747h
            r2.clear()
            te3.lv2 r2 = r0.f294226c
            gy3.C87412m.m108591d(r2)
            java.util.LinkedList<te3.ar2> r2 = r2.f298747h
            r2.add(r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r0.f294224a
            gy3.C87412m.m108591d(r1)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r0.f294225b
            gy3.C87412m.m108591d(r2)
            r1.setTimeLine(r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r0.f294224a     // Catch:{ Exception -> 0x025e }
            gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x025e }
            te3.lv2 r2 = r0.f294226c     // Catch:{ Exception -> 0x025e }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x025e }
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x025e }
            r1.setPostBuf(r2)     // Catch:{ Exception -> 0x025e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "finish >> "
            r1.append(r2)
            int r2 = r12.f298701s
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r2 = r0.f294227d
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f294224a
            r1.Rv0(r2, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r0
        L_0x025e:
            java.lang.String r1 = "parse postinfo error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r8
        L_0x0268:
            java.lang.String r1 = "addSightObjectByPath >> mediaObj is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ot2.C100435d.mo139922b(java.lang.String, java.lang.String):ot2.d");
    }

    /* renamed from: c */
    public final boolean mo139923c() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        TimeLineObject timeLineObject = this.f294225b;
        C87412m.m108591d(timeLineObject);
        C101799k1 k1Var = timeLineObject.actionInfo;
        C101808lv2 lv22 = this.f294226c;
        C87412m.m108591d(lv22);
        Iterator<C64241ar2> it = lv22.f298747h.iterator();
        String str = null;
        while (true) {
            int i = 2;
            z = false;
            if (!it.hasNext()) {
                break;
            }
            C64241ar2 next = it.next();
            C100406i0 LL = C94866e1.ay0().mo139867LL((long) next.f182140d);
            try {
                C47465a parseFrom = new C101821nv2().parseFrom(LL.mo139854h());
                C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaUploadInfo");
                C101821nv2 nv22 = (C101821nv2) parseFrom;
                TimeLineObject timeLineObject2 = this.f294225b;
                C87412m.m108591d(timeLineObject2);
                if (timeLineObject2.AppInfo != null) {
                    TimeLineObject timeLineObject3 = this.f294225b;
                    C87412m.m108591d(timeLineObject3);
                    nv22.f298930x = timeLineObject3.AppInfo.f299236d;
                }
                if ((k1Var != null ? k1Var.f298580j : null) != null && !Util.isNullOrNil(k1Var.f298580j.f298271d)) {
                    nv22.f298930x = k1Var.f298580j.f298271d;
                }
                C47465a parseFrom2 = new C101783gu2().parseFrom(this.f294228e);
                if (parseFrom2 != null) {
                    ((C101783gu2) parseFrom2).f298310f = 0;
                }
                C87412m.m108592e(parseFrom2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMSightExtInfo");
                nv22.f298911B = (C101783gu2) parseFrom2;
                TimeLineObject timeLineObject4 = this.f294225b;
                C87412m.m108591d(timeLineObject4);
                int i2 = timeLineObject4.ContentObj.f298424e;
                nv22.f298931y = i2;
                if (i2 == 1 || i2 == 15) {
                    if (!Util.isNullOrNil(nv22.f298930x)) {
                        nv22.f298912C = 5;
                    } else {
                        C101783gu2 gu22 = nv22.f298911B;
                        if (gu22 != null && nv22.f298931y == 15) {
                            if (gu22.f298309e) {
                                i = 1;
                            }
                            nv22.f298912C = i;
                        }
                    }
                }
                LL.mo139858l(nv22.toByteArray());
                C94866e1.ay0().r50(next.f182140d, LL);
                str = nv22.f298929w;
            } catch (Exception unused) {
                Log.m105920e("MicroMag.BackgroundVideoFinishUploader", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
                SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
                return false;
            }
        }
        SnsInfo snsInfo = this.f294224a;
        C87412m.m108591d(snsInfo);
        Log.m105925i("MicroMag.BackgroundVideoFinishUploader", "commit sns info ret %d, typeFlag %d sightMd5 %s", Integer.valueOf(this.f294227d), Integer.valueOf(snsInfo.getTypeFlag()), str);
        if (this.f294227d > 0) {
            SnsInfo snsInfo2 = this.f294224a;
            C87412m.m108591d(snsInfo2);
            if (snsInfo2.getTypeFlag() == 15) {
                C94867e2.m120302u(C100417r0.m131421j("sns_table_", (long) this.f294227d), str);
            }
        }
        SnsMethodCalculate.markStartTimeMs("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        Log.m105924i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo: " + this.f294229f);
        if (this.f294229f.length() == 0) {
            z = true;
        }
        if (z) {
            SnsMethodCalculate.markEndTimeMs("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        } else {
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C100434c(this, (C15601d<? super C100434c>) null), 2, (Object) null);
            SnsMethodCalculate.markEndTimeMs("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        }
        C94866e1.gy0().mo131192c();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return true;
    }

    /* renamed from: d */
    public final C100435d mo139924d(int i, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("setLocalSnsInfoId", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        C87412m.m108594g(bArr, "extInfo");
        Log.m105924i("MicroMag.BackgroundVideoFinishUploader", "setLocalSnsInfoId >> snsLocalId: " + i);
        this.f294229f = "";
        SnsInfo LL = C94866e1.Yx0().mo139800LL(i);
        this.f294224a = LL;
        C100435d dVar = null;
        this.f294225b = LL != null ? LL.getTimeLine() : null;
        this.f294227d = i;
        this.f294228e = bArr;
        SnsInfo snsInfo = this.f294224a;
        C101808lv2 postInfo = snsInfo != null ? snsInfo.getPostInfo() : null;
        this.f294226c = postInfo;
        if (!(this.f294224a == null || this.f294225b == null || postInfo == null)) {
            dVar = this;
        }
        SnsMethodCalculate.markEndTimeMs("setLocalSnsInfoId", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return dVar;
    }
}
