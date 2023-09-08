package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75573f;
import f40.C86709a0;
import f62.C75700k0;
import ob0.C35136m;
import ob0.C35141t;
import p1081gi.C98121d;
import p872ah.C67046a;
import z51.C102975i;

/* renamed from: com.tencent.mm.modelimage.r */
public class C68127r extends C75573f implements C35141t {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x03c9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.storage.C72963f4 mo71474d(ob0.C35136m.C35137a r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r32 = this;
            r3 = r34
            java.lang.Class<z51.i> r0 = z51.C102975i.class
            r1 = r33
            te3.j3 r2 = r1.f94242a
            com.tencent.mm.modelimage.m r15 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            com.tencent.mm.storage.f4 r1 = super.mo71474d(r33, r34, r35, r36)
            long r4 = r1.getMsgId()
            r16 = 0
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.lang.String r4 = r1.mo108768t()
            long r5 = r2.f227638r
            com.tencent.mm.modelimage.k r7 = r15.mo127168NQ(r4, r5)
            long r8 = r7.f267375b
            java.lang.String r14 = ""
            r13 = 0
            r12 = 1
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0031
            goto L_0x00f6
        L_0x0031:
            java.lang.String r8 = r7.f267378e
            java.lang.String r8 = r15.mo127174TY(r8, r14, r14, r12)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
            java.lang.String r8 = r7.f267379f
            java.lang.String r8 = r15.mo127174TY(r8, r14, r14, r12)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
            java.lang.String r8 = r7.f267383j
            java.lang.String r8 = r15.mo127174TY(r8, r14, r14, r12)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
            java.lang.String r8 = r7.f267380g
            java.lang.String r8 = r15.mo127174TY(r8, r14, r14, r12)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r7.f267380g
            java.lang.String r9 = r15.mo127174TY(r9, r14, r14, r12)
            r8.append(r9)
            java.lang.String r9 = "hd"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
            zh3.f r8 = r15.f267423o
            java.lang.String r10 = com.tencent.p014mm.modelimage.C92839m.C92844e.m117106b(r4)
            java.lang.String[] r11 = new java.lang.String[r12]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r11[r13] = r5
            java.lang.String r5 = "msgSvrId=?"
            r8.delete(r10, r5, r11)
            boolean r5 = r7.mo127145p()
            if (r5 == 0) goto L_0x00f6
            int r5 = r7.f267390q
            com.tencent.mm.modelimage.k r5 = r15.mo127173TO(r5)
            java.lang.String r6 = r5.f267378e
            r7 = 1
            java.lang.String r6 = r15.mo127174TY(r6, r14, r14, r7)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            java.lang.String r6 = r5.f267379f
            java.lang.String r6 = r15.mo127174TY(r6, r14, r14, r7)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            java.lang.String r6 = r5.f267383j
            java.lang.String r6 = r15.mo127174TY(r6, r14, r14, r7)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            java.lang.String r6 = r5.f267380g
            java.lang.String r6 = r15.mo127174TY(r6, r14, r14, r7)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r5.f267380g
            java.lang.String r8 = r15.mo127174TY(r8, r14, r14, r7)
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            zh3.f r6 = r15.f267423o
            java.lang.String r4 = com.tencent.p014mm.modelimage.C92839m.C92844e.m117106b(r4)
            java.lang.String[] r8 = new java.lang.String[r7]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            long r9 = r5.f267374a
            r7.append(r9)
            java.lang.String r5 = r7.toString()
            r8[r13] = r5
            java.lang.String r5 = "id=?"
            r6.delete(r4, r5, r8)
        L_0x00f6:
            int r4 = r2.f227633j
            java.lang.String r12 = "MicroMsg.ImgMsgExtension"
            r11 = 2
            if (r4 == r11) goto L_0x0103
            java.lang.String r0 = "data type img, but has no imgstatus_hasimg ?!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            return r1
        L_0x0103:
            te3.qv3 r4 = r2.f227634n
            byte[] r4 = sf0.C48374j0.m53715d(r4)
            boolean r5 = sf0.C90188n0.f258956x
            r10 = 0
            if (r5 == 0) goto L_0x0116
            java.lang.String r4 = "Test.useCdnDownThumb  set img buf null !!!!!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r4)
            r18 = r10
            goto L_0x0118
        L_0x0116:
            r18 = r4
        L_0x0118:
            java.lang.String r4 = r1.getContent()
            java.lang.String r5 = "msg"
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r4, r5, r10)
            r4 = -1
            java.lang.String r6 = r1.getContent()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x021b
            r9 = 1
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r7 = r1.getContent()
            r6[r13] = r7
            java.lang.String r7 = "cdntra content:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r6)
            if (r8 != 0) goto L_0x014b
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 111(0x6f, double:5.5E-322)
            r22 = 190(0xbe, double:9.4E-322)
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
        L_0x014b:
            if (r8 == 0) goto L_0x01cf
            java.lang.String r6 = ".msg.img.$hdlength"
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r13)
            java.lang.String r7 = ".msg.img.$tphdlength"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r13)
            if (r6 <= 0) goto L_0x01a1
            java.lang.String r5 = r1.mo108768t()
            int r7 = r2.f227633j
            long r9 = r2.f227638r
            r20 = 1
            java.lang.String r21 = r1.getContent()
            com.tencent.mm.pointers.PString r22 = new com.tencent.mm.pointers.PString
            r22.<init>()
            com.tencent.mm.pointers.PInt r23 = new com.tencent.mm.pointers.PInt
            r23.<init>()
            com.tencent.mm.pointers.PInt r24 = new com.tencent.mm.pointers.PInt
            r24.<init>()
            r4 = r15
            r6 = r18
            r25 = r0
            r0 = r8
            r19 = 1
            r8 = r9
            r3 = 0
            r10 = r20
            r11 = r21
            r27 = r12
            r12 = r22
            r13 = r23
            r28 = r14
            r14 = r24
            long r4 = r4.yu0(r5, r6, r7, r8, r10, r11, r12, r13, r14)
            goto L_0x01d7
        L_0x01a1:
            r25 = r0
            r0 = r8
            r3 = r10
            r27 = r12
            r28 = r14
            if (r7 <= 0) goto L_0x01d7
            java.lang.String r5 = r1.mo108768t()
            int r7 = r2.f227633j
            long r8 = r2.f227638r
            r10 = 1
            java.lang.String r11 = r1.getContent()
            com.tencent.mm.pointers.PString r12 = new com.tencent.mm.pointers.PString
            r12.<init>()
            com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt
            r13.<init>()
            com.tencent.mm.pointers.PInt r14 = new com.tencent.mm.pointers.PInt
            r14.<init>()
            r4 = r15
            r6 = r18
            long r4 = r4.yu0(r5, r6, r7, r8, r10, r11, r12, r13, r14)
            goto L_0x01d7
        L_0x01cf:
            r25 = r0
            r0 = r8
            r3 = r10
            r27 = r12
            r28 = r14
        L_0x01d7:
            java.lang.String r6 = r1.getContent()
            java.lang.String r7 = "msgoperation"
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r7, r3)
            if (r3 == 0) goto L_0x0216
            java.lang.String r6 = ".msgoperation.expinfo.expidstr"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r1.f230733Q = r6
            r14 = 1
            r1.f230755r = r14
            java.lang.String r6 = ".msgoperation.imagemsg.downloadcontroltype"
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r13 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r13)
            r1.f230734R = r3
            r1.f230755r = r14
            r12 = 2
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.String r7 = r1.f230733Q
            r6[r13] = r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r14] = r3
            java.lang.String r3 = "[chatting_exp] expidstr:%s, downloadcontroltype:%d"
            r11 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r6)
            goto L_0x0223
        L_0x0216:
            r11 = r27
            r12 = 2
            r13 = 0
            goto L_0x0222
        L_0x021b:
            r25 = r0
            r0 = r8
            r11 = r12
            r28 = r14
            r12 = 2
        L_0x0222:
            r14 = 1
        L_0x0223:
            r8 = r4
            java.lang.String r3 = ".msg.img.$tpthumburl"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.pointers.PString r10 = new com.tencent.mm.pointers.PString
            r10.<init>()
            com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
            r7.<init>()
            com.tencent.mm.pointers.PInt r6 = new com.tencent.mm.pointers.PInt
            r6.<init>()
            java.lang.String r5 = r1.mo108768t()
            int r4 = r2.f227633j
            long r12 = r2.f227638r
            r2 = 0
            java.lang.String r19 = r1.getContent()
            r20 = r4
            r4 = r15
            r33 = r6
            r6 = r18
            r35 = r7
            r7 = r20
            r29 = r8
            r8 = r12
            r13 = r10
            r10 = r2
            r2 = r11
            r11 = r19
            r12 = r13
            r31 = r13
            r13 = r35
            r27 = r2
            r2 = 1
            r14 = r33
            long r4 = r4.yu0(r5, r6, r7, r8, r10, r11, r12, r13, r14)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r18)
            if (r6 == 0) goto L_0x0297
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r6 != 0) goto L_0x0297
            java.lang.String r6 = ".msg.img.$tpthumbwidth"
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)
            r8 = r35
            r8.value = r6
            java.lang.String r6 = ".msg.img.$tpthumbheight"
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)
            r9 = r33
            r9.value = r6
            goto L_0x029c
        L_0x0297:
            r9 = r33
            r8 = r35
            r7 = 0
        L_0x029c:
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x02d5
            r6 = r31
            java.lang.String r6 = r6.value
            r1.mo108739S2(r6)
            int r6 = r8.value
            r1.mo108752f3(r6)
            int r6 = r9.value
            r1.mo108751e3(r6)
            r8 = r29
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x02d5
            com.tencent.mm.modelimage.m r6 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.tencent.mm.modelimage.k r6 = r6.mo127194nP(r10)
            r6.mo127149t(r2)
            int r9 = (int) r8
            r6.mo127151v(r9)
            com.tencent.mm.modelimage.m r8 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.Dx0(r4, r6)
        L_0x02d5:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r18)
            java.lang.String r5 = "downimgthumb"
            java.lang.String r6 = ".tmp"
            java.lang.String r8 = "getThumbByCdn msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s"
            java.lang.String r9 = "th_"
            java.lang.String r10 = "SERVERID://"
            r13 = 3
            r14 = 4
            if (r4 == 0) goto L_0x03c9
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x03c9
            java.lang.String r4 = ".msg.img.$tpthumbaeskey"
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r12 = ".msg.img.tpthumblength"
            java.lang.Object r12 = r0.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r7)
            java.lang.String r11 = ".msg.img.$tpauthkey"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r36 = r8
            long r7 = r1.mo108774y2()
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            byte[] r7 = r7.getBytes()
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)
            r8 = r28
            java.lang.String r7 = r15.mo127174TY(r7, r9, r8, r2)
            long r9 = r1.mo108774y2()
            java.lang.Object[] r11 = new java.lang.Object[r14]
            java.lang.Long r15 = java.lang.Long.valueOf(r9)
            r16 = 0
            r11[r16] = r15
            r15 = r34
            r11[r2] = r15
            r2 = 2
            r11[r2] = r3
            r11[r13] = r7
            r2 = r36
            r13 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r11)
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r6)
            java.lang.String r11 = r2.toString()
            gi.g r13 = new gi.g
            r13.<init>()
            java.lang.String r2 = "task_ImgMsgExtension_1"
            r13.f287660d = r2
            long r14 = r1.getCreateTime()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r6 = r34
            java.lang.String r2 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r5, r14, r6, r2)
            r13.field_mediaId = r2
            r13.field_fullpath = r11
            r2 = 19
            r13.field_fileType = r2
            r13.field_aesKey = r4
            r13.field_authKey = r0
            r13.f287672s = r3
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            r13.f287673t = r0
            di3.d r0 = di3.C86312j.m106911c(r25)
            z51.i r0 = (z51.C102975i) r0
            boolean r0 = r0.ln0()
            if (r0 == 0) goto L_0x03a2
            r0 = 2
            goto L_0x03a3
        L_0x03a2:
            r0 = 1
        L_0x03a3:
            r13.f287648E = r0
            com.tencent.mm.modelimage.p r14 = new com.tencent.mm.modelimage.p
            r0 = r14
            r15 = r1
            r1 = r32
            r2 = r15
            r8 = r3
            r3 = r34
            r4 = r9
            r6 = r7
            r7 = r8
            r8 = r12
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r11)
            r13.f287662f = r14
            r0 = 4
            r15.mo100991d(r0)
            com.tencent.mm.modelcdntran.CdnTransportService r0 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
            r1 = -1
            r0.mo126951e(r13, r1)
            r12 = r15
            goto L_0x04c8
        L_0x03c9:
            r3 = r34
            r12 = r1
            r2 = r8
            r1 = r27
            r8 = r28
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r18)
            if (r4 == 0) goto L_0x04c8
            java.lang.String r4 = ".msg.img.$cdnthumbaeskey"
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = ".msg.img.$cdnthumburl"
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r11 = ".msg.img.$cdnthumblength"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            r11 = 0
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            long r10 = r12.mo108774y2()
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r10 = 1
            java.lang.String r9 = r15.mo127174TY(r0, r9, r8, r10)
            r11 = r14
            long r13 = r12.mo108774y2()
            r15 = 4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Long r15 = java.lang.Long.valueOf(r13)
            r17 = 0
            r0[r17] = r15
            r0[r10] = r3
            r10 = 2
            r0[r10] = r7
            r10 = 3
            r0[r10] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r0 = "task_ImgMsgExtension_2"
            r2.f287660d = r0
            r0 = r11
            long r10 = r12.getCreateTime()
            r18 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r5, r10, r3, r0)
            r2.field_mediaId = r0
            r2.field_fullpath = r6
            r0 = 3
            r2.field_fileType = r0
            r8 = r18
            r2.field_totalLen = r8
            r2.field_aesKey = r4
            r2.field_fileId = r7
            r2.field_priority = r0
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r34)
            r2.field_chattype = r0
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            r2.f287673t = r0
            di3.d r0 = di3.C86312j.m106911c(r25)
            z51.i r0 = (z51.C102975i) r0
            boolean r0 = r0.ln0()
            if (r0 == 0) goto L_0x0490
            r0 = 2
            goto L_0x0491
        L_0x0490:
            r0 = 1
        L_0x0491:
            r2.f287648E = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r4 = r2.field_chattype
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r0[r5] = r4
            r4 = 1
            r0[r4] = r3
            java.lang.String r4 = "get thumb by cdn [image] chatType[%d] fromUser[%s] "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            com.tencent.mm.modelimage.q r11 = new com.tencent.mm.modelimage.q
            r0 = r11
            r1 = r32
            r10 = r2
            r2 = r12
            r3 = r34
            r4 = r13
            r13 = r6
            r6 = r9
            r14 = r10
            r9 = r15
            r15 = r11
            r11 = r13
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r11)
            r14.f287662f = r15
            r0 = 4
            r12.mo100991d(r0)
            com.tencent.mm.modelcdntran.CdnTransportService r0 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
            r1 = -1
            r0.mo126951e(r14, r1)
        L_0x04c8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C68127r.mo71474d(ob0.m$a, java.lang.String, java.lang.String, java.lang.String):com.tencent.mm.storage.f4");
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
        C92839m Bx0 = C92837k0.Bx0();
        C72963f4 f4Var = cVar.f94250a;
        C92836k uP = Bx0.mo127198uP(f4Var);
        if (uP == null || uP.f267374a == 0) {
            Log.m105920e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
            return;
        }
        String TY = Bx0.mo127174TY(uP.f267378e, "", "", true);
        String TY2 = Bx0.mo127174TY(uP.f267379f, "", "", true);
        String TY3 = Bx0.mo127174TY(uP.f267383j, "", "", true);
        String TY4 = Bx0.mo127174TY(uP.f267380g, "", "", true);
        String str = Bx0.mo127174TY(uP.f267380g, "", "", true) + "hd";
        C86013q1.m106447h(TY);
        C86013q1.m106447h(TY2);
        C86013q1.m106447h(TY3);
        C86013q1.m106447h(TY4);
        C86013q1.m106447h(str);
        Bx0.f267423o.delete(C92839m.C92844e.m117106b(f4Var.mo108768t()), "id=?", new String[]{"" + uP.f267374a});
        Log.m105925i("MicroMsg.ImgInfoStorage", "msgId:%s svrId:%s bigImgPath:%s midImgPath:%s hevcPath:%s thumbPath:%s hdThumbPath:%s", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), TY, TY2, TY3, TY4, str);
        if (uP.mo127145p()) {
            C92836k TO = Bx0.mo127173TO(uP.f267390q);
            String TY5 = Bx0.mo127174TY(TO.f267378e, "", "", true);
            String TY6 = Bx0.mo127174TY(TO.f267383j, "", "", true);
            C86013q1.m106447h(TY5);
            C86013q1.m106447h(TY6);
            C86013q1.m106447h(Bx0.mo127174TY(TO.f267379f, "", "", true));
            C86013q1.m106447h(Bx0.mo127174TY(TO.f267380g, "", "", true));
            C86013q1.m106447h(Bx0.mo127174TY(TO.f267380g, "", "", true) + "hd");
            Bx0.f267423o.delete(C92839m.C92844e.m117106b(f4Var.mo108768t()), "id=?", new String[]{"" + TO.f267374a});
            Log.m105925i("MicroMsg.ImgInfoStorage", "deleteHdImg msgId:%s svrId:%s hdBigImgPath:%s hdHevcPath:%s", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()), TY5, TY6);
        }
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }

    /* renamed from: q */
    public int mo93633q(int i, C98121d dVar, C72963f4 f4Var, String str, long j, String str2, String str3, int i2, long j2, String str4) {
        C98121d dVar2 = dVar;
        C72963f4 f4Var2 = f4Var;
        String str5 = str2;
        String str6 = str4;
        Class cls = C75700k0.class;
        if ((f4Var2.f230723F & 4) == 4) {
            Log.m105925i("MicroMsg.ImgMsgExtension", "download revoke msg thumb deleteFile:%s", Boolean.valueOf(C86013q1.m106447h(str2)));
            return 0;
        } else if (i != 0) {
            Log.m105921e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", Integer.valueOf(i), Long.valueOf(j), str, str3, str5);
            f4Var2.mo100991d(5);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var2);
            C92837k0.Bx0().doNotify();
            return 0;
        } else if (dVar2 == null) {
            return 0;
        } else {
            int i3 = dVar2.field_retCode;
            if (i3 != 0) {
                Log.m105921e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", Integer.valueOf(i3), Long.valueOf(j), str, str3, str5);
                f4Var2.mo100991d(5);
                if (!Util.isNullOrNil(f4Var.mo108768t())) {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var2);
                }
            } else {
                if (ImgUtil.isWXGF(str4)) {
                    String str7 = str5 + "_hevc";
                    C86013q1.m106463x(str6, str7);
                    if (!C86013q1.m106450k(str2)) {
                        C86013q1.m106444e(str2);
                    }
                    ((C102975i) C86312j.m106911c(C102975i.class)).mo141694GF(str7, str5);
                } else {
                    C86013q1.m106463x(str6, str5);
                }
                f4Var2.mo100991d(6);
                PInt pInt = new PInt();
                PInt pInt2 = new PInt();
                BitmapUtil.getRent(str5, pInt, pInt2);
                f4Var2.mo108752f3(pInt.value);
                f4Var2.mo108751e3(pInt2.value);
                Log.m105925i("MicroMsg.ImgMsgExtension", "getThumbByCdn succ. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumb[%d,%d] thumbUrl:%s thumbPath:%s", Integer.valueOf(dVar2.field_retCode), Long.valueOf(j), str, Integer.valueOf(pInt.value), Integer.valueOf(pInt2.value), str3, str5);
                if (!Util.isNullOrNil(f4Var.mo108768t())) {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var2);
                }
                C115669n nVar = C115669n.INSTANCE;
                C115669n nVar2 = nVar;
                nVar2.idkeyStat(198, 1, (long) i2, false);
                nVar2.idkeyStat(198, 2, 1, false);
                nVar.idkeyStat(198, C72996z1.m85820U5(str) ? 4 : 3, 1, false);
            }
            C92837k0.Bx0().doNotify();
            return 0;
        }
    }
}
