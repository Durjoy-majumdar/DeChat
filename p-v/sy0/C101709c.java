package sy0;

import com.tencent.p014mm.modelimage.C92808c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import te3.C50844pl;

/* renamed from: sy0.c */
public class C101709c extends C48502a {

    /* renamed from: h */
    public final int f297766h;

    /* renamed from: i */
    public final String f297767i;

    /* renamed from: j */
    public final String f297768j;

    /* renamed from: n */
    public final String f297769n;

    /* renamed from: o */
    public final C92808c f297770o;

    static {
        boolean z = BuildInfo.DEBUG;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C101709c(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.tencent.p014mm.modelimage.C92808c r12) {
        /*
            r7 = this;
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            java.lang.String r1 = "session_id"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "from_username"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "to_username"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.String r1 = "params"
            gy3.C87412m.m108594g(r12, r1)
            te3.kl r1 = new te3.kl
            r1.<init>()
            te3.jl r2 = new te3.jl
            r2.<init>()
            r1.f136870o = r2
            r1.f136868j = r9
            r1.f136863e = r10
            r1.f136864f = r11
            r2 = 3
            r1.f136862d = r2
            te3.on4 r2 = r12.f267242C
            java.lang.String r2 = r2.f299063o
            r1.f136866h = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r2.append(r3)
            r2.append(r9)
            te3.on4 r3 = r12.f267242C
            te3.rv3 r3 = r3.f299055d
            r2.append(r3)
            r3 = 95
            r2.append(r3)
            long r3 = eb0.C31543z5.m39453c()
            r5 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r5
            long r3 = r3 / r5
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.f136865g = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r7.<init>(r8, r1)
            r7.f297766h = r8
            r7.f297767i = r9
            r7.f297768j = r10
            r7.f297769n = r11
            r7.f297770o = r12
            te3.kl r8 = r7.f129712d
            te3.jl r8 = r8.f136870o
            gi.d r9 = r12.f267243D
            java.lang.String r10 = "Byp.CgiBypSendImage"
            if (r9 == 0) goto L_0x01e1
            boolean r11 = r9.mo137409b()
            java.lang.String r1 = ""
            if (r11 == 0) goto L_0x00a0
            r8.f298521d = r1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "hit SafeCDNWithMD5. "
            r11.append(r2)
            te3.kl r2 = r7.f129712d
            java.lang.String r2 = r2.f136865g
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            goto L_0x00af
        L_0x00a0:
            java.lang.String r11 = r9.field_aesKey
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x00ab
            java.lang.String r11 = r12.f267245F
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r11 = r9.field_aesKey
        L_0x00ad:
            r8.f298521d = r11
        L_0x00af:
            r11 = 1
            r8.f298522e = r11
            java.lang.String r2 = r9.field_fileId
            r8.f298523f = r2
            java.lang.String r2 = r9.field_filemd5
            r8.f298529o = r2
            com.tencent.mm.modelimage.k r2 = r12.f267244E
            java.lang.String r2 = r2.f267379f
            r3 = 0
            if (r2 == 0) goto L_0x00ca
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r2 = 0
            goto L_0x00cb
        L_0x00ca:
            r2 = 1
        L_0x00cb:
            if (r2 != 0) goto L_0x010c
            com.tencent.mm.modelimage.k r2 = r12.f267244E
            java.lang.String r2 = r2.f267378e
            if (r2 == 0) goto L_0x00dc
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r2 = 0
            goto L_0x00dd
        L_0x00dc:
            r2 = 1
        L_0x00dd:
            if (r2 != 0) goto L_0x010c
            long r4 = r9.field_fileLength
            int r2 = (int) r4
            r8.f298524g = r2
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            com.tencent.mm.modelimage.k r4 = r12.f267244E
            java.lang.String r4 = r4.f267378e
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r2 = r2.mo127174TY(r4, r1, r1, r11)
            android.graphics.BitmapFactory$Options r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r2)
            if (r2 == 0) goto L_0x0101
            int r4 = r2.outWidth
            goto L_0x0102
        L_0x0101:
            r4 = 0
        L_0x0102:
            r8.f298533s = r4
            if (r2 == 0) goto L_0x0109
            int r2 = r2.outHeight
            goto L_0x010a
        L_0x0109:
            r2 = 0
        L_0x010a:
            r8.f298532r = r2
        L_0x010c:
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            com.tencent.mm.modelimage.k r4 = r12.f267244E
            java.lang.String r4 = r4.f267380g
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r2 = r2.mo127174TY(r4, r1, r1, r11)
            android.graphics.BitmapFactory$Options r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r2)
            int r4 = r9.field_thumbimgLength
            r8.f298526i = r4
            if (r2 == 0) goto L_0x012d
            int r4 = r2.outWidth
            goto L_0x012e
        L_0x012d:
            r4 = 0
        L_0x012e:
            r8.f298528n = r4
            if (r2 == 0) goto L_0x0135
            int r2 = r2.outHeight
            goto L_0x0136
        L_0x0135:
            r2 = 0
        L_0x0136:
            r8.f298527j = r2
            com.tencent.mm.modelimage.k r2 = r12.f267244E
            java.lang.String r2 = r2.f267379f
            if (r2 == 0) goto L_0x0147
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            r2 = 0
            goto L_0x0148
        L_0x0147:
            r2 = 1
        L_0x0148:
            if (r2 == 0) goto L_0x018a
            com.tencent.mm.modelimage.k r2 = r12.f267244E
            java.lang.String r2 = r2.f267378e
            if (r2 == 0) goto L_0x0159
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            r2 = 0
            goto L_0x015a
        L_0x0159:
            r2 = 1
        L_0x015a:
            if (r2 != 0) goto L_0x018a
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            com.tencent.mm.modelimage.k r12 = r12.f267244E
            java.lang.String r12 = r12.f267378e
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r11 = r0.mo127174TY(r12, r1, r1, r11)
            android.graphics.BitmapFactory$Options r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r11)
            long r0 = r9.field_fileLength
            int r9 = (int) r0
            r8.f298525h = r9
            if (r11 == 0) goto L_0x017e
            int r9 = r11.outWidth
            goto L_0x017f
        L_0x017e:
            r9 = 0
        L_0x017f:
            r8.f298530p = r9
            if (r11 == 0) goto L_0x0186
            int r9 = r11.outHeight
            goto L_0x0187
        L_0x0186:
            r9 = 0
        L_0x0187:
            r8.f298531q = r9
            goto L_0x01db
        L_0x018a:
            com.tencent.mm.modelimage.k r2 = r12.f267244E
            java.lang.String r2 = r2.f267379f
            if (r2 == 0) goto L_0x0199
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            r2 = 0
            goto L_0x019a
        L_0x0199:
            r2 = 1
        L_0x019a:
            if (r2 != 0) goto L_0x01db
            com.tencent.mm.modelimage.k r2 = r12.f267244E
            java.lang.String r2 = r2.f267378e
            if (r2 == 0) goto L_0x01ab
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r2 = 0
            goto L_0x01ac
        L_0x01ab:
            r2 = 1
        L_0x01ac:
            if (r2 != 0) goto L_0x01db
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            com.tencent.mm.modelimage.k r12 = r12.f267244E
            java.lang.String r12 = r12.f267379f
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r11 = r0.mo127174TY(r12, r1, r1, r11)
            android.graphics.BitmapFactory$Options r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r11)
            long r0 = r9.field_fileLength
            int r9 = (int) r0
            r8.f298525h = r9
            if (r11 == 0) goto L_0x01d0
            int r9 = r11.outWidth
            goto L_0x01d1
        L_0x01d0:
            r9 = 0
        L_0x01d1:
            r8.f298530p = r9
            if (r11 == 0) goto L_0x01d8
            int r9 = r11.outHeight
            goto L_0x01d9
        L_0x01d8:
            r9 = 0
        L_0x01d9:
            r8.f298531q = r9
        L_0x01db:
            r8.f298534t = r3
            r8.f298535u = r3
            r8.f298536v = r3
        L_0x01e1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            te3.kl r11 = r7.f129712d
            java.lang.String r11 = r11.f136865g
            r9.append(r11)
            java.lang.String r11 = ", "
            r9.append(r11)
            java.lang.String r11 = "bypImage"
            gy3.C87412m.m108593f(r8, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "aeskey="
            r11.append(r12)
            java.lang.String r12 = r8.f298521d
            r11.append(r12)
            java.lang.String r12 = ", crypt_ver="
            r11.append(r12)
            int r12 = r8.f298522e
            r11.append(r12)
            java.lang.String r12 = ", url="
            r11.append(r12)
            java.lang.String r12 = r8.f298523f
            r11.append(r12)
            java.lang.String r12 = ", hd_size="
            r11.append(r12)
            int r12 = r8.f298524g
            r11.append(r12)
            java.lang.String r12 = ", mid_size="
            r11.append(r12)
            int r12 = r8.f298525h
            r11.append(r12)
            java.lang.String r12 = ", thumb_size="
            r11.append(r12)
            int r12 = r8.f298526i
            r11.append(r12)
            java.lang.String r12 = ", thumb_height="
            r11.append(r12)
            int r12 = r8.f298527j
            r11.append(r12)
            java.lang.String r12 = ", thumb_width="
            r11.append(r12)
            int r12 = r8.f298528n
            r11.append(r12)
            java.lang.String r12 = ", md5="
            r11.append(r12)
            java.lang.String r12 = r8.f298529o
            r11.append(r12)
            java.lang.String r12 = ", mid_height="
            r11.append(r12)
            int r12 = r8.f298530p
            r11.append(r12)
            java.lang.String r12 = ", mid_width="
            r11.append(r12)
            int r12 = r8.f298531q
            r11.append(r12)
            java.lang.String r12 = ", hd_height="
            r11.append(r12)
            int r12 = r8.f298532r
            r11.append(r12)
            java.lang.String r12 = ", hd_width="
            r11.append(r12)
            int r12 = r8.f298533s
            r11.append(r12)
            java.lang.String r12 = ", hevc_hd_size="
            r11.append(r12)
            int r12 = r8.f298534t
            r11.append(r12)
            java.lang.String r12 = ", hevc_mid_size="
            r11.append(r12)
            int r12 = r8.f298535u
            r11.append(r12)
            java.lang.String r12 = ", hevc_thumb_size="
            r11.append(r12)
            int r8 = r8.f298536v
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sy0.C101709c.<init>(int, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.modelimage.c):void");
    }

    /* renamed from: k1 */
    public void mo73136k1(int i, int i2, String str, C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
        Log.m105920e("Byp.CgiBypSendImage", "[onSendFailed] bizType=" + this.f297766h + " sessionId=" + this.f297767i + " toUsername=" + this.f297769n + " fromUsername=" + this.f297768j + " errCode:" + i2 + " errMsg:" + str);
        this.f297770o.f267247H.mo103302a(plVar.f139817d, C31543z5.m39455e(), i, i2, "");
    }

    /* renamed from: l1 */
    public void mo73137l1(C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
        Log.m105924i("Byp.CgiBypSendImage", "[onSendSuccessfully] bizType=" + this.f297766h + " msgSvrId=" + plVar.f139817d + "  sessionId=" + this.f297767i + " toUsername=" + this.f297769n + " fromUsername=" + this.f297768j);
        this.f297770o.f267247H.mo103302a(plVar.f139817d, C31543z5.m39455e(), 0, 0, "");
    }
}
