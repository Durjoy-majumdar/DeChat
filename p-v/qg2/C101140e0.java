package qg2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import di3.C86301e;
import ei3.C86522b;
import og2.C77006j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: qg2.e0 */
public class C101140e0 extends C86301e implements C77006j {
    /* renamed from: GL */
    public boolean mo107328GL(String str, long j, String str2, boolean z) {
        return C101147j0.m132618K(C101147j0.m132630k(str, str2), j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (r3.f267374a <= 0) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Mb0(android.content.Context r22, com.tencent.p014mm.storage.C72963f4 r23, te3.C77949j3 r24) {
        /*
            r21 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            int r3 = qg2.C101152m.f296070a
            r4 = 1
            if (r0 != 0) goto L_0x000f
        L_0x000b:
            r17 = 0
            goto L_0x05b9
        L_0x000f:
            boolean r5 = eb0.C75569c4.m90690w(r23)
            r6 = 43
            r7 = 3
            if (r5 == 0) goto L_0x005f
            int r5 = r23.getType()
            r8 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r8
            if (r5 == r4) goto L_0x0055
            if (r5 == r7) goto L_0x0047
            if (r5 == r6) goto L_0x0039
            r8 = 49
            if (r5 == r8) goto L_0x002b
            goto L_0x005f
        L_0x002b:
            r5 = 2131821715(0x7f110493, float:1.927618E38)
            java.lang.String r5 = r1.getString(r5)
            r0.mo108732L2(r5)
            r0.setType(r4)
            goto L_0x005f
        L_0x0039:
            r5 = 2131821728(0x7f1104a0, float:1.9276207E38)
            java.lang.String r5 = r1.getString(r5)
            r0.mo108732L2(r5)
            r0.setType(r4)
            goto L_0x005f
        L_0x0047:
            r5 = 2131821636(0x7f110444, float:1.927602E38)
            java.lang.String r5 = r1.getString(r5)
            r0.mo108732L2(r5)
            r0.setType(r4)
            goto L_0x005f
        L_0x0055:
            r5 = 2131821702(0x7f110486, float:1.9276155E38)
            java.lang.String r5 = r1.getString(r5)
            r0.mo108732L2(r5)
        L_0x005f:
            boolean r5 = eb0.C75569c4.m90686s(r23)
            if (r5 == 0) goto L_0x007b
            r2.f227630g = r4
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            r3 = 2131821588(0x7f110414, float:1.9275923E38)
            java.lang.String r1 = r1.getString(r3)
            r0.f141175d = r1
            r0.f141176e = r4
            r2.f227631h = r0
            goto L_0x055b
        L_0x007b:
            boolean r5 = r23.mo100993e4()
            if (r5 == 0) goto L_0x0086
            qg2.C101152m.m132651b(r23, r24)
            goto L_0x055b
        L_0x0086:
            boolean r5 = r23.mo100995g4()
            if (r5 == 0) goto L_0x00a2
            r2.f227630g = r4
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            r3 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r1 = r1.getString(r3)
            r0.f141175d = r1
            r0.f141176e = r4
            r2.f227631h = r0
            goto L_0x055b
        L_0x00a2:
            boolean r5 = r23.mo100982U3()
            if (r5 == 0) goto L_0x00ad
            qg2.C101152m.m132651b(r23, r24)
            goto L_0x055b
        L_0x00ad:
            boolean r5 = r23.mo100979R3()
            java.lang.String r8 = "md5"
            java.lang.String r9 = "length"
            java.lang.String r10 = "cdnthumblength"
            java.lang.String r11 = "cdnthumburl"
            java.lang.String r12 = "cdnthumbaeskey"
            java.lang.String r13 = "aeskey"
            java.lang.String r14 = "msg"
            java.lang.String r15 = ""
            java.lang.String r6 = "MicroMsg.GetFavRecordDataSourceForRecordMsg"
            if (r5 == 0) goto L_0x0410
            java.lang.Class<gt.k> r1 = p158gt.C98201k.class
            long r16 = r23.getMsgId()
            r4 = 0
            int r19 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r19 <= 0) goto L_0x00f3
            di3.d r16 = di3.C86312j.m106911c(r1)
            gt.k r16 = (p158gt.C98201k) r16
            gt.m r16 = r16.mo137277xi()
            java.lang.String r3 = r23.mo108768t()
            r20 = r8
            long r7 = r23.getMsgId()
            int r8 = (int) r7
            long r7 = (long) r8
            r4 = r16
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r3 = r4.mo127200vP(r3, r7)
            goto L_0x00f6
        L_0x00f3:
            r20 = r8
            r3 = 0
        L_0x00f6:
            if (r3 == 0) goto L_0x0101
            long r4 = r3.f267374a
            r7 = 0
            int r16 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r16 > 0) goto L_0x0123
            goto L_0x0103
        L_0x0101:
            r7 = 0
        L_0x0103:
            long r4 = r23.mo108774y2()
            int r16 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r16 <= 0) goto L_0x0123
            di3.d r3 = di3.C86312j.m106911c(r1)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.String r4 = r23.mo108768t()
            long r7 = r23.mo108774y2()
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            com.tencent.mm.modelimage.k r3 = r3.mo127168NQ(r4, r7)
        L_0x0123:
            if (r3 != 0) goto L_0x012c
            java.lang.String r0 = "getImgDataPath: try get imgInfo fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            goto L_0x000b
        L_0x012c:
            boolean r4 = r3.mo127145p()
            if (r4 == 0) goto L_0x0148
            int r4 = r3.f267377d
            if (r4 != 0) goto L_0x0148
            di3.d r4 = di3.C86312j.m106911c(r1)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            int r3 = r3.f267390q
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r3 = r4.mo127173TO(r3)
        L_0x0148:
            java.lang.String r4 = "img"
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            org.xmlpull.v1.XmlPullParserFactory r7 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x03de }
            org.xmlpull.v1.XmlSerializer r7 = r7.newSerializer()     // Catch:{ Exception -> 0x03de }
            r7.setOutput(r5)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r23.mo108768t()     // Catch:{ Exception -> 0x03de }
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r0 = ":\n"
            if (r8 == 0) goto L_0x0180
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            java.lang.String r16 = r23.getContent()     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = eb0.C75604z3.m90847s(r16)     // Catch:{ Exception -> 0x03de }
            r8.append(r2)     // Catch:{ Exception -> 0x03de }
            r8.append(r0)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r5.write(r2)     // Catch:{ Exception -> 0x03de }
        L_0x0180:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r23.getContent()     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = eb0.C75604z3.m90847s(r8)     // Catch:{ Exception -> 0x03de }
            r2.append(r8)     // Catch:{ Exception -> 0x03de }
            r2.append(r0)     // Catch:{ Exception -> 0x03de }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r5.write(r0)     // Catch:{ Exception -> 0x03de }
            r2 = 0
            r7.startTag(r2, r14)     // Catch:{ Exception -> 0x03de }
            r7.startTag(r2, r4)     // Catch:{ Exception -> 0x03de }
            java.lang.String r0 = r3.f267393t     // Catch:{ Exception -> 0x03de }
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r14, r2)     // Catch:{ Exception -> 0x03de }
            if (r0 == 0) goto L_0x03c5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            r2.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = ".msg.img.$aeskey"
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x03de }
            r2.append(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r8 = 0
            r7.attribute(r8, r13, r2)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "encryver"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r13 = ".msg.img.$encryver"
            java.lang.Object r13 = r0.get(r13)     // Catch:{ Exception -> 0x03de }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x03de }
            r8.append(r13)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r13 = 0
            r7.attribute(r13, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            r2.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = ".msg.img.$cdnthumbaeskey"
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x03de }
            r2.append(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r8 = 0
            r7.attribute(r8, r12, r2)     // Catch:{ Exception -> 0x03de }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            r2.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = ".msg.img.$cdnthumburl"
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x03de }
            r2.append(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r8 = 0
            r7.attribute(r8, r11, r2)     // Catch:{ Exception -> 0x03de }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            r2.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = ".msg.img.$cdnthumblength"
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x03de }
            r11 = 10240(0x2800, double:5.059E-320)
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r11)     // Catch:{ Exception -> 0x03de }
            r2.append(r11)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r8 = 0
            r7.attribute(r8, r10, r2)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "cdnthumbheight"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = ".msg.img.$cdnthumbheight"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03de }
            r11 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)     // Catch:{ Exception -> 0x03de }
            r8.append(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r10 = 0
            r7.attribute(r10, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "cdnthumbwidth"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = ".msg.img.$cdnthumbwidth"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03de }
            r11 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)     // Catch:{ Exception -> 0x03de }
            r8.append(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r10 = 0
            r7.attribute(r10, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "cdnmidheight"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = ".msg.img.$cdnmidheight"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03de }
            r11 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)     // Catch:{ Exception -> 0x03de }
            r8.append(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r10 = 0
            r7.attribute(r10, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "cdnmidwidth"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = ".msg.img.$cdnmidwidth"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03de }
            r11 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)     // Catch:{ Exception -> 0x03de }
            r8.append(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r10 = 0
            r7.attribute(r10, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "cdnhdheight"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = ".msg.img.$cdnhdheight"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03de }
            r11 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)     // Catch:{ Exception -> 0x03de }
            r8.append(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r10 = 0
            r7.attribute(r10, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "cdnhdwidth"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = ".msg.img.$cdnhdwidth"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03de }
            r11 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)     // Catch:{ Exception -> 0x03de }
            r8.append(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r10 = 0
            r7.attribute(r10, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = "cdnmidimgurl"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r8.<init>()     // Catch:{ Exception -> 0x03de }
            r8.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = ".msg.img.$cdnmidimgurl"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x03de }
            r8.append(r10)     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03de }
            r10 = 0
            r7.attribute(r10, r2, r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = ".msg.img.$length"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x03de }
            r10 = 0
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r10)     // Catch:{ Exception -> 0x03de }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            r2.append(r15)     // Catch:{ Exception -> 0x03de }
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0352
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x03de }
            gt.k r1 = (p158gt.C98201k) r1     // Catch:{ Exception -> 0x03de }
            gt.m r1 = r1.mo137277xi()     // Catch:{ Exception -> 0x03de }
            java.lang.String r8 = r3.f267378e     // Catch:{ Exception -> 0x03de }
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1     // Catch:{ Exception -> 0x03de }
            r10 = 1
            java.lang.String r1 = r1.mo127174TY(r8, r15, r15, r10)     // Catch:{ Exception -> 0x03de }
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)     // Catch:{ Exception -> 0x03de }
        L_0x0352:
            r2.append(r12)     // Catch:{ Exception -> 0x03de }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r2 = 0
            r7.attribute(r2, r9, r1)     // Catch:{ Exception -> 0x03de }
            int r1 = r23.mo108769t2()     // Catch:{ Exception -> 0x03de }
            r2 = 1
            if (r1 != r2) goto L_0x0368
            int r1 = r3.f267381h     // Catch:{ Exception -> 0x03de }
            if (r1 != r2) goto L_0x03a8
        L_0x0368:
            java.lang.String r1 = "cdnbigimgurl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            r2.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r3 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x03de }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x03de }
            r2.append(r3)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r3 = 0
            r7.attribute(r3, r1, r2)     // Catch:{ Exception -> 0x03de }
            java.lang.String r1 = "hdlength"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r2.<init>()     // Catch:{ Exception -> 0x03de }
            r2.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r3 = ".msg.img.$hdlength"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x03de }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x03de }
            r8 = 0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r8)     // Catch:{ Exception -> 0x03de }
            r2.append(r8)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03de }
            r3 = 0
            r7.attribute(r3, r1, r2)     // Catch:{ Exception -> 0x03de }
        L_0x03a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03de }
            r1.<init>()     // Catch:{ Exception -> 0x03de }
            r1.append(r15)     // Catch:{ Exception -> 0x03de }
            java.lang.String r2 = ".msg.img.$md5"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x03de }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x03de }
            r1.append(r0)     // Catch:{ Exception -> 0x03de }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03de }
            r2 = r20
            r1 = 0
            r7.attribute(r1, r2, r0)     // Catch:{ Exception -> 0x03de }
        L_0x03c5:
            r1 = 0
            r7.endTag(r1, r4)     // Catch:{ Exception -> 0x03de }
            r7.endTag(r1, r14)     // Catch:{ Exception -> 0x03de }
            r7.endDocument()     // Catch:{ Exception -> 0x03de }
            r5.flush()     // Catch:{ Exception -> 0x03de }
            r5.close()     // Catch:{ Exception -> 0x03de }
            java.lang.StringBuffer r0 = r5.getBuffer()
            java.lang.String r7 = r0.toString()
            goto L_0x03f9
        L_0x03de:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "packetImg xml error: "
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r7 = 0
        L_0x03f9:
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r15)
            r0.f141175d = r1
            r1 = 1
            r0.f141176e = r1
            r3 = r24
            r3.f227631h = r0
            r1 = 2
            r3.f227633j = r1
            goto L_0x055b
        L_0x0410:
            r3 = r2
            r2 = r8
            boolean r0 = r23.mo100994f4()
            if (r0 != 0) goto L_0x055e
            boolean r0 = r23.mo100989b4()
            if (r0 == 0) goto L_0x0420
            goto L_0x055e
        L_0x0420:
            boolean r0 = r23.mo100983V3()
            if (r0 == 0) goto L_0x042b
            qg2.C101152m.m132651b(r23, r24)
            goto L_0x055b
        L_0x042b:
            int r0 = r23.getType()
            r2 = 318767153(0x13000031, float:1.6155966E-27)
            if (r0 != r2) goto L_0x043a
            r2 = 3
            qg2.C101152m.m132652c(r1, r3, r2)
            goto L_0x055b
        L_0x043a:
            boolean r0 = r23.mo100967F3()
            if (r0 == 0) goto L_0x0445
            qg2.C101152m.m132651b(r23, r24)
            goto L_0x055b
        L_0x0445:
            boolean r0 = r23.mo100973L3()
            if (r0 != 0) goto L_0x0557
            boolean r0 = r23.mo101022y3()
            if (r0 == 0) goto L_0x0453
            goto L_0x0557
        L_0x0453:
            int r0 = r23.getType()
            r2 = 419430449(0x19000031, float:6.6174836E-24)
            if (r0 != r2) goto L_0x0462
            r2 = 2
            qg2.C101152m.m132652c(r1, r3, r2)
            goto L_0x055b
        L_0x0462:
            int r0 = r23.getType()
            r2 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r0 != r2) goto L_0x04b3
            java.lang.String r0 = r23.getContent()     // Catch:{ all -> 0x04a4 }
            r2 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r2)     // Catch:{ all -> 0x04a4 }
            if (r0 == 0) goto L_0x049e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a4 }
            r2.<init>()     // Catch:{ all -> 0x04a4 }
            java.lang.String r4 = "["
            r2.append(r4)     // Catch:{ all -> 0x04a4 }
            java.lang.String r0 = r0.f195596l1     // Catch:{ all -> 0x04a4 }
            r2.append(r0)     // Catch:{ all -> 0x04a4 }
            java.lang.String r0 = "]"
            r2.append(r0)     // Catch:{ all -> 0x04a4 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x04a4 }
            r2 = 1
            r3.f227630g = r2     // Catch:{ all -> 0x04a4 }
            te3.rv3 r4 = new te3.rv3     // Catch:{ all -> 0x04a4 }
            r4.<init>()     // Catch:{ all -> 0x04a4 }
            r4.f141175d = r0     // Catch:{ all -> 0x04a4 }
            r4.f141176e = r2     // Catch:{ all -> 0x04a4 }
            r3.f227631h = r4     // Catch:{ all -> 0x04a4 }
            goto L_0x055b
        L_0x049e:
            r2 = 3
            qg2.C101152m.m132652c(r1, r3, r2)     // Catch:{ all -> 0x04a4 }
            goto L_0x055b
        L_0x04a4:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "fill msg err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r2)
            r2 = 3
            qg2.C101152m.m132652c(r1, r3, r2)
            goto L_0x055b
        L_0x04b3:
            boolean r0 = r23.mo100975N3()
            if (r0 == 0) goto L_0x0539
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            java.lang.String r2 = r23.getContent()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4$b r0 = r0.Rv0(r2)
            int r2 = r0.f212691q
            java.util.Set<java.lang.String> r4 = eb0.C45628s0.f123410p
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85810M4(r2)
            if (r2 == 0) goto L_0x04de
            qg2.C101152m.m132651b(r23, r24)
            goto L_0x055b
        L_0x04de:
            java.lang.String r2 = r0.f212675a
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            r4 = 2131821547(0x7f1103eb, float:1.927584E38)
            if (r2 == 0) goto L_0x0526
            java.lang.Class<he0.j> r2 = he0.C76158j.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            he0.j r2 = (he0.C76158j) r2
            java.lang.String r0 = r0.f212699y
            he0.j$a r5 = he0.C76158j.C8510a.TYPE_WORDING
            java.lang.String r6 = "openim_card_type_name"
            java.lang.String r0 = r2.Rn0(r0, r6, r5)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x050c
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getString(r4)
            r2 = 1
            goto L_0x0518
        L_0x050c:
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r4 = 0
            r1[r4] = r0
            java.lang.String r0 = "[%s]"
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x0518:
            r3.f227630g = r2
            te3.rv3 r1 = new te3.rv3
            r1.<init>()
            r1.f141175d = r0
            r1.f141176e = r2
            r3.f227631h = r1
            goto L_0x055b
        L_0x0526:
            r2 = 1
            java.lang.String r0 = r1.getString(r4)
            r3.f227630g = r2
            te3.rv3 r1 = new te3.rv3
            r1.<init>()
            r1.f141175d = r0
            r1.f141176e = r2
            r3.f227631h = r1
            goto L_0x055b
        L_0x0539:
            r2 = 1
            boolean r0 = r23.mo101020w3()
            if (r0 == 0) goto L_0x0552
            boolean r0 = r23.mo101022y3()
            if (r0 == 0) goto L_0x054a
            qg2.C101152m.m132652c(r1, r3, r2)
            goto L_0x055b
        L_0x054a:
            r0 = r23
            boolean r3 = qg2.C101152m.m132650a(r1, r0, r2, r3)
            goto L_0x075f
        L_0x0552:
            r4 = 3
            qg2.C101152m.m132652c(r1, r3, r4)
            goto L_0x055b
        L_0x0557:
            r2 = 1
            qg2.C101152m.m132652c(r1, r3, r2)
        L_0x055b:
            r1 = 1
            goto L_0x075e
        L_0x055e:
            r0 = r23
            java.lang.Class<rz.u> r1 = p682rz.C101491u.class
            di3.d r4 = di3.C86312j.m106911c(r1)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r5 = r23.mo108765s2()
            hd0.n0 r4 = r4.mo140806Zd(r5)
            if (r4 != 0) goto L_0x057a
            java.lang.String r0 = "video info null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x000b
        L_0x057a:
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r8 = r4.f288559f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r17 = 0
            r7[r17] = r8
            java.lang.String r8 = "video length is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            int r7 = r4.f288559f
            long r7 = (long) r7
            java.lang.Class<pb1.j1> r18 = pb1.C100718j1.class
            di3.d r18 = di3.C86312j.m106911c(r18)
            r0 = r18
            pb1.j1 r0 = (pb1.C100718j1) r0
            long r19 = r0.mo128216vR(r5)
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x05a3
            goto L_0x05b9
        L_0x05a3:
            boolean r0 = r23.mo100989b4()
            if (r0 == 0) goto L_0x05bc
            di3.d r0 = di3.C86312j.m106911c(r1)
            rz.u r0 = (p682rz.C101491u) r0
            java.lang.String r1 = r4.mo137700d()
            boolean r0 = r0.mo140809kU(r1)
            if (r0 == 0) goto L_0x05bc
        L_0x05b9:
            r3 = 0
            goto L_0x075f
        L_0x05bc:
            java.lang.String r0 = "videomsg"
            int r1 = r23.getType()
            r5 = 62
            if (r1 != r5) goto L_0x05c8
            goto L_0x05ca
        L_0x05c8:
            r5 = 43
        L_0x05ca:
            java.lang.String r1 = r23.getContent()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x05d7
            r3 = 0
            goto L_0x074b
        L_0x05d7:
            java.lang.String r1 = r23.mo108768t()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            if (r1 == 0) goto L_0x05e6
            java.lang.String r1 = r4.mo137701e()
            goto L_0x05ea
        L_0x05e6:
            java.lang.String r1 = r23.mo101010p2()
        L_0x05ea:
            java.io.StringWriter r7 = new java.io.StringWriter
            r7.<init>()
            org.xmlpull.v1.XmlPullParserFactory r8 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x072b }
            org.xmlpull.v1.XmlSerializer r8 = r8.newSerializer()     // Catch:{ Exception -> 0x072b }
            r8.setOutput(r7)     // Catch:{ Exception -> 0x072b }
            r3 = 0
            r8.startTag(r3, r14)     // Catch:{ Exception -> 0x0727 }
            r8.startTag(r3, r0)     // Catch:{ Exception -> 0x0727 }
            java.lang.String r3 = r4.mo137705i()     // Catch:{ Exception -> 0x072b }
            r16 = r6
            r6 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r14, r6)     // Catch:{ Exception -> 0x0721 }
            if (r3 == 0) goto L_0x06a2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r6.<init>()     // Catch:{ Exception -> 0x069e }
            r6.append(r15)     // Catch:{ Exception -> 0x069e }
            r22 = r7
            java.lang.String r7 = ".msg.videomsg.$aeskey"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x069e }
            r6.append(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x069e }
            r7 = 0
            r8.attribute(r7, r13, r6)     // Catch:{ Exception -> 0x0724 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r6.<init>()     // Catch:{ Exception -> 0x069e }
            r6.append(r15)     // Catch:{ Exception -> 0x069e }
            java.lang.String r7 = ".msg.videomsg.$cdnthumbaeskey"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x069e }
            r6.append(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x069e }
            r7 = 0
            r8.attribute(r7, r12, r6)     // Catch:{ Exception -> 0x0724 }
            java.lang.String r6 = "cdnvideourl"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r7.<init>()     // Catch:{ Exception -> 0x069e }
            r7.append(r15)     // Catch:{ Exception -> 0x069e }
            java.lang.String r12 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r12 = r3.get(r12)     // Catch:{ Exception -> 0x069e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x069e }
            r7.append(r12)     // Catch:{ Exception -> 0x069e }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x069e }
            r12 = 0
            r8.attribute(r12, r6, r7)     // Catch:{ Exception -> 0x069a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r6.<init>()     // Catch:{ Exception -> 0x069e }
            r6.append(r15)     // Catch:{ Exception -> 0x069e }
            java.lang.String r7 = ".msg.videomsg.$cdnthumburl"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x069e }
            r6.append(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x069e }
            r7 = 0
            r8.attribute(r7, r11, r6)     // Catch:{ Exception -> 0x0724 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r6.<init>()     // Catch:{ Exception -> 0x069e }
            r6.append(r15)     // Catch:{ Exception -> 0x069e }
            java.lang.String r7 = ".msg.videomsg.$cdnthumblength"
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x069e }
            r6.append(r3)     // Catch:{ Exception -> 0x069e }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x069e }
            r6 = 0
            r8.attribute(r6, r10, r3)     // Catch:{ Exception -> 0x0721 }
            goto L_0x06a4
        L_0x069a:
            r0 = move-exception
            r3 = r12
            goto L_0x0730
        L_0x069e:
            r0 = move-exception
        L_0x069f:
            r3 = 0
            goto L_0x0730
        L_0x06a2:
            r22 = r7
        L_0x06a4:
            java.lang.String r3 = "playlength"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r6.<init>()     // Catch:{ Exception -> 0x069e }
            r6.append(r15)     // Catch:{ Exception -> 0x069e }
            int r7 = r4.f288566m     // Catch:{ Exception -> 0x069e }
            r6.append(r7)     // Catch:{ Exception -> 0x069e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x069e }
            r7 = 0
            r8.attribute(r7, r3, r6)     // Catch:{ Exception -> 0x0724 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r3.<init>()     // Catch:{ Exception -> 0x069e }
            r3.append(r15)     // Catch:{ Exception -> 0x069e }
            int r6 = r4.f288559f     // Catch:{ Exception -> 0x069e }
            r3.append(r6)     // Catch:{ Exception -> 0x069e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x069e }
            r6 = 0
            r8.attribute(r6, r9, r3)     // Catch:{ Exception -> 0x0721 }
            java.lang.String r3 = "type"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r6.<init>()     // Catch:{ Exception -> 0x069e }
            r6.append(r15)     // Catch:{ Exception -> 0x069e }
            r6.append(r5)     // Catch:{ Exception -> 0x069e }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x069e }
            r6 = 0
            r8.attribute(r6, r3, r5)     // Catch:{ Exception -> 0x0721 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0721 }
            if (r3 != 0) goto L_0x06f2
            java.lang.String r3 = "fromusername"
            r8.attribute(r6, r3, r1)     // Catch:{ Exception -> 0x0721 }
        L_0x06f2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069e }
            r1.<init>()     // Catch:{ Exception -> 0x069e }
            r1.append(r15)     // Catch:{ Exception -> 0x069e }
            java.lang.String r3 = r4.f288579z     // Catch:{ Exception -> 0x069e }
            r1.append(r3)     // Catch:{ Exception -> 0x069e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x069e }
            r3 = 0
            r8.attribute(r3, r2, r1)     // Catch:{ Exception -> 0x071f }
            r8.endTag(r3, r0)     // Catch:{ Exception -> 0x071f }
            r8.endTag(r3, r14)     // Catch:{ Exception -> 0x071f }
            r8.endDocument()     // Catch:{ Exception -> 0x071f }
            r22.flush()     // Catch:{ Exception -> 0x071f }
            r22.close()     // Catch:{ Exception -> 0x071f }
            java.lang.StringBuffer r0 = r22.getBuffer()
            java.lang.String r7 = r0.toString()
            goto L_0x074c
        L_0x071f:
            r0 = move-exception
            goto L_0x0730
        L_0x0721:
            r0 = move-exception
            r3 = r6
            goto L_0x0730
        L_0x0724:
            r0 = move-exception
            r3 = r7
            goto L_0x0730
        L_0x0727:
            r0 = move-exception
            r16 = r6
            goto L_0x0730
        L_0x072b:
            r0 = move-exception
            r16 = r6
            goto L_0x069f
        L_0x0730:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "packetVoice xml error: "
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x074b:
            r7 = r3
        L_0x074c:
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r15)
            r0.f141175d = r1
            r1 = 1
            r0.f141176e = r1
            r2 = r24
            r2.f227631h = r0
        L_0x075e:
            r3 = 1
        L_0x075f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101140e0.Mb0(android.content.Context, com.tencent.mm.storage.f4, te3.j3):boolean");
    }

    /* renamed from: Uc */
    public void mo107330Uc(long j) {
        C72709y1.zx0().mo100169b(j);
    }
}
