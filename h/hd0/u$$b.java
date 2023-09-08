package hd0;

import com.tencent.p014mm.modelimage.C92834j;
import java.io.ByteArrayOutputStream;
import p1081gi.C98121d;
import p1081gi.C98124g;

public class u$$b implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C98433u f288695d;

    /* renamed from: hd0.u$$b$a */
    public class C98434a implements C92834j {

        /* renamed from: a */
        public final /* synthetic */ C98121d f288696a;

        public C98434a(C98121d dVar) {
            this.f288696a = dVar;
        }

        /* renamed from: a */
        public void mo127120a(int i, int i2) {
            if (!(i == 4 && i2 == 102)) {
                C98433u uVar = u$$b.this.f288695d;
                C98121d dVar = uVar.f288688t;
                if (dVar != null) {
                    uVar.mo137764k1(dVar);
                } else {
                    uVar.mo137764k1(this.f288696a);
                }
            }
            u$$b.this.f288695d.f288681j.mo127120a(i, i2);
        }
    }

    public u$$b(C98433u uVar) {
        this.f288695d = uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:235:0x0938  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x093d  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1773g0(java.lang.String r36, int r37, p1081gi.C98120c r38, p1081gi.C98121d r39, boolean r40) {
        /*
            r35 = this;
            r1 = r35
            r0 = r37
            r2 = r38
            r3 = r39
            java.lang.Class<qo.l> r4 = p663qo.C101213l.class
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            hd0.u r7 = r1.f288695d
            java.lang.String r7 = r7.mo137765l1()
            r15 = 0
            r6[r15] = r7
            r7 = 1
            r6[r7] = r36
            java.lang.Integer r8 = java.lang.Integer.valueOf(r37)
            r9 = 2
            r6[r9] = r8
            r14 = 3
            r6[r14] = r2
            r8 = 4
            r6[r8] = r3
            java.lang.String r10 = "MicroMsg.NetSceneUploadVideoOrigin"
            java.lang.String r11 = "%s cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r6)
            r6 = -21005(0xffffffffffffadf3, float:NaN)
            if (r0 != r6) goto L_0x003b
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r15] = r36
            java.lang.String r2 = "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r0)
            return r15
        L_0x003b:
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x008a
            hd0.u r2 = r1.f288695d
            java.lang.String r2 = r2.f288677f
            hd0.C98429r0.m127799E(r2)
            hd0.u r2 = r1.f288695d
            hd0.n0 r3 = r2.f288687s
            if (r3 != 0) goto L_0x004e
            r5 = 6
            goto L_0x004f
        L_0x004e:
            r5 = 7
        L_0x004f:
            ig3.n r3 = ig3.C98692n.f289404a
            r4 = 0
            java.lang.String r6 = r2.f288677f
            r8 = 0
            r10 = 0
            r16 = 0
            r18 = 0
            java.lang.String r2 = r2.f288686r
            if (r2 == 0) goto L_0x0063
            r20 = 1
            goto L_0x0065
        L_0x0063:
            r20 = 0
        L_0x0065:
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r10 = r16
            r21 = r12
            r12 = r18
            r14 = r20
            r15 = r37
            r2.mo138104e(r3, r4, r5, r6, r8, r10, r12, r14, r15)
            hd0.u r2 = r1.f288695d
            ob0.n r3 = r2.f288675d
            r12 = r21
            r15 = 3
            r3.onSceneEnd(r15, r0, r12, r2)
            hd0.u r2 = r1.f288695d
            com.tencent.mm.modelimage.j r2 = r2.f288681j
            r2.mo127120a(r15, r0)
            r14 = 0
            return r14
        L_0x008a:
            r14 = 0
            r15 = 3
            hd0.u r13 = r1.f288695d
            java.lang.String r6 = r13.f288677f
            hd0.n0 r6 = hd0.C98429r0.m127818i(r6)
            r13.f288683o = r6
            hd0.u r6 = r1.f288695d
            hd0.n0 r13 = r6.f288683o
            if (r13 == 0) goto L_0x0952
            int r11 = r13.f288562i
            r5 = 105(0x69, float:1.47E-43)
            if (r11 != r5) goto L_0x00a4
            goto L_0x0952
        L_0x00a4:
            if (r2 == 0) goto L_0x012c
            hd0.n0 r0 = r6.f288687s
            r3 = 1032(0x408, float:1.446E-42)
            if (r0 == 0) goto L_0x00ec
            int r4 = r0.f288557d
            long r4 = (long) r4
            long r11 = r2.field_finishedLength
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d7
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.String r3 = r6.mo137765l1()
            r0[r14] = r3
            hd0.u r3 = r1.f288695d
            hd0.n0 r3 = r3.f288687s
            int r3 = r3.f288557d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r7] = r3
            long r2 = r2.field_finishedLength
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r9] = r2
            java.lang.String r2 = "%s cdntra originFileInfo cdnEndProc error oldpos:%d newpos:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
            return r14
        L_0x00d7:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.f288564k = r4
            hd0.u r0 = r1.f288695d
            hd0.n0 r0 = r0.f288687s
            long r4 = r2.field_finishedLength
            int r2 = (int) r4
            r0.f288557d = r2
            r0.f288548P = r3
            hd0.C98429r0.m127808N(r0)
            goto L_0x012b
        L_0x00ec:
            int r0 = r13.f288557d
            long r4 = (long) r0
            long r11 = r2.field_finishedLength
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0117
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.String r3 = r6.mo137765l1()
            r0[r14] = r3
            hd0.u r3 = r1.f288695d
            hd0.n0 r3 = r3.f288683o
            int r3 = r3.f288557d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r7] = r3
            long r2 = r2.field_finishedLength
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r9] = r2
            java.lang.String r2 = "%s cdntra cdnEndProc error oldpos:%d newpos:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
            return r14
        L_0x0117:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r13.f288564k = r4
            hd0.u r0 = r1.f288695d
            hd0.n0 r0 = r0.f288683o
            long r4 = r2.field_finishedLength
            int r2 = (int) r4
            r0.f288557d = r2
            r0.f288548P = r3
            hd0.C98429r0.m127808N(r0)
        L_0x012b:
            return r14
        L_0x012c:
            if (r3 == 0) goto L_0x0950
            int r2 = r3.field_retCode
            if (r2 == 0) goto L_0x0193
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r4 = r6.mo137765l1()
            r2[r14] = r4
            int r4 = r3.field_retCode
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r7] = r4
            java.lang.String r4 = r3.field_arg
            r2[r9] = r4
            java.lang.String r4 = r3.field_transInfo
            r2[r15] = r4
            java.lang.String r4 = "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r4, r2)
            hd0.u r2 = r1.f288695d
            java.lang.String r2 = r2.f288677f
            hd0.C98429r0.m127799E(r2)
            hd0.u r2 = r1.f288695d
            hd0.n0 r4 = r2.f288687s
            if (r4 != 0) goto L_0x015f
            r20 = 6
            goto L_0x0161
        L_0x015f:
            r20 = 7
        L_0x0161:
            ig3.n r17 = ig3.C98692n.f289404a
            r18 = 0
            java.lang.String r4 = r2.f288677f
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            java.lang.String r2 = r2.f288686r
            if (r2 == 0) goto L_0x0176
            r29 = 1
            goto L_0x0178
        L_0x0176:
            r29 = 0
        L_0x0178:
            int r2 = r3.field_retCode
            r19 = r4
            r30 = r2
            r17.mo138104e(r18, r19, r20, r21, r23, r25, r27, r29, r30)
            hd0.u r2 = r1.f288695d
            ob0.n r4 = r2.f288675d
            int r3 = r3.field_retCode
            r4.onSceneEnd(r15, r3, r12, r2)
            hd0.u r2 = r1.f288695d
            com.tencent.mm.modelimage.j r2 = r2.f288681j
            r2.mo127120a(r15, r0)
            goto L_0x0950
        L_0x0193:
            boolean r2 = r3.field_isVideoReduced
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.String r6 = r6.mo137765l1()
            r5[r14] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r5[r7] = r6
            hd0.u r6 = r1.f288695d
            java.lang.String r6 = r6.f288677f
            r5[r9] = r6
            java.lang.String r6 = "%s it video was reduced by cdn %b %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r5)
            if (r2 != 0) goto L_0x0264
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 106(0x6a, double:5.24E-322)
            r21 = 205(0xcd, double:1.013E-321)
            r23 = 1
            r25 = 0
            r18 = r5
            r18.idkeyStat(r19, r21, r23, r25)
            hd0.u r6 = r1.f288695d
            int r11 = r6.f288684p
            if (r11 <= 0) goto L_0x020d
            int r11 = r3.field_thumbimgLength
            if (r11 <= 0) goto L_0x020d
            java.lang.Object[] r11 = new java.lang.Object[r15]
            java.lang.String r6 = r6.mo137765l1()
            r11[r14] = r6
            hd0.u r6 = r1.f288695d
            int r6 = r6.f288684p
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11[r7] = r6
            int r6 = r3.field_thumbimgLength
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11[r9] = r6
            java.lang.String r6 = "%s send video thumb too big thumb length [%d, %d] "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r11)
            hd0.u r6 = r1.f288695d
            int r6 = r6.f288684p
            int r6 = r6 * 2
            int r11 = r3.field_thumbimgLength
            if (r6 <= r11) goto L_0x0200
            r19 = 106(0x6a, double:5.24E-322)
            r21 = 206(0xce, double:1.02E-321)
            r23 = 1
            r25 = 0
            r18 = r5
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x020d
        L_0x0200:
            r19 = 106(0x6a, double:5.24E-322)
            r21 = 207(0xcf, double:1.023E-321)
            r23 = 1
            r25 = 0
            r18 = r5
            r18.idkeyStat(r19, r21, r23, r25)
        L_0x020d:
            hd0.o0 r6 = hd0.C98398h0.Bx0()
            hd0.u r11 = r1.f288695d
            java.lang.String r11 = r11.f288677f
            java.lang.String r6 = r6.mo137728q(r11)
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            int r6 = (int) r8
            java.lang.Object[] r8 = new java.lang.Object[r15]
            hd0.u r9 = r1.f288695d
            java.lang.String r9 = r9.mo137765l1()
            r8[r14] = r9
            hd0.u r9 = r1.f288695d
            hd0.n0 r9 = r9.f288683o
            int r9 = r9.f288559f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r7] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r13 = 2
            r8[r13] = r9
            java.lang.String r9 = "%s send video too big thumb length [%d, %d] "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r8)
            hd0.u r8 = r1.f288695d
            hd0.n0 r8 = r8.f288683o
            int r8 = r8.f288559f
            if (r8 == r6) goto L_0x0256
            r19 = 106(0x6a, double:5.24E-322)
            r21 = 208(0xd0, double:1.03E-321)
            r23 = 1
            r25 = 0
            r18 = r5
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x0271
        L_0x0256:
            r19 = 106(0x6a, double:5.24E-322)
            r21 = 209(0xd1, double:1.033E-321)
            r23 = 1
            r25 = 0
            r18 = r5
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x0271
        L_0x0264:
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 106(0x6a, double:5.24E-322)
            r30 = 200(0xc8, double:9.9E-322)
            r32 = 1
            r34 = 0
            r27.idkeyStat(r28, r30, r32, r34)
        L_0x0271:
            hd0.u r5 = r1.f288695d
            java.lang.String r6 = r5.f288677f
            hd0.n0 r6 = hd0.C98429r0.m127818i(r6)
            r5.f288683o = r6
            hd0.u r5 = r1.f288695d
            hd0.n0 r5 = r5.f288683o
            if (r5 != 0) goto L_0x02c5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "info is null, maybe user delete video msg,  file name is "
            r2.append(r3)
            hd0.u r3 = r1.f288695d
            java.lang.String r3 = r3.f288677f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r2)
            ig3.n r2 = ig3.C98692n.f289404a
            r3 = 0
            hd0.u r4 = r1.f288695d
            java.lang.String r4 = r4.f288677f
            r5 = 5
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r14 = r16
            r15 = r37
            r2.mo138104e(r3, r4, r5, r6, r8, r10, r12, r14, r15)
            hd0.u r2 = r1.f288695d
            ob0.n r3 = r2.f288675d
            java.lang.String r4 = "info is null, maybe user delete video msg"
            r15 = 3
            r3.onSceneEnd(r15, r0, r4, r2)
            hd0.u r2 = r1.f288695d
            com.tencent.mm.modelimage.j r2 = r2.f288681j
            r2.mo127120a(r15, r0)
            r14 = 0
            return r14
        L_0x02c5:
            java.lang.String r0 = r5.mo137705i()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r5 = "</msg>"
            java.lang.String r6 = "\"/>"
            java.lang.String r8 = "\" "
            if (r0 == 0) goto L_0x03c3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "<msg><videomsg aeskey=\""
            r0.append(r9)
            java.lang.String r9 = r3.field_aesKey
            r0.append(r9)
            java.lang.String r9 = "\" cdnthumbaeskey=\""
            r0.append(r9)
            java.lang.String r9 = r3.field_aesKey
            r0.append(r9)
            java.lang.String r9 = "\" cdnvideourl=\""
            r0.append(r9)
            java.lang.String r9 = r3.field_fileId
            r0.append(r9)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "cdnthumburl=\""
            r9.append(r0)
            java.lang.String r0 = r3.field_fileId
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "length=\""
            r9.append(r0)
            long r14 = r3.field_fileLength
            r9.append(r14)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "md5=\""
            r9.append(r0)
            java.lang.String r0 = r3.field_filemd5
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "thumbfullmd5=\""
            r9.append(r0)
            java.lang.String r0 = r3.field_thumbfilemd5
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "cdnthumblength=\""
            r9.append(r0)
            int r0 = r3.field_thumbimgLength
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            hd0.u r0 = r1.f288695d
            hd0.n0 r0 = r0.f288683o
            java.lang.String r0 = r0.f288543K
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r12)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r5)
            java.lang.String r0 = r9.toString()
            r9 = 2
            java.lang.Object[] r13 = new java.lang.Object[r9]
            hd0.u r9 = r1.f288695d
            java.lang.String r9 = r9.mo137765l1()
            r14 = 0
            r13[r14] = r9
            r13[r7] = r0
            java.lang.String r9 = "%s cdn callback new build cdnInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r13)
            hd0.u r9 = r1.f288695d
            hd0.n0 r9 = r9.f288683o
            r9.f288575v = r0
            hd0.C98429r0.m127808N(r9)
        L_0x03c3:
            hd0.u r0 = r1.f288695d
            hd0.n0 r9 = r0.f288687s
            if (r9 == 0) goto L_0x0484
            hd0.n0 r0 = r0.f288683o
            java.lang.String r0 = r0.mo137705i()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x0484
            hd0.x0$a r9 = hd0.C98442x0.f288734i
            hd0.x0 r9 = r9.mo137781b(r0)
            java.lang.String r13 = "/>"
            int r13 = r0.indexOf(r13)
            r14 = -1
            if (r13 == r14) goto L_0x0484
            if (r9 == 0) goto L_0x03ee
            java.lang.String r9 = r9.f288740d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0484
        L_0x03ee:
            r9 = 0
            java.lang.String r0 = r0.substring(r9, r13)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = " cdnrawvideourl=\""
            r9.append(r0)
            java.lang.String r0 = r3.field_fileId
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "cdnrawvideoaeskey=\""
            r9.append(r0)
            java.lang.String r0 = r3.field_aesKey
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "rawmd5=\""
            r9.append(r0)
            java.lang.String r0 = r3.field_filemd5
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r0 = "rawlength=\""
            r8.append(r0)
            long r13 = r3.field_fileLength
            r8.append(r13)
            r8.append(r6)
            java.lang.String r0 = r8.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            hd0.u r5 = r1.f288695d
            java.lang.String r5 = r5.mo137765l1()
            r8 = 0
            r6[r8] = r5
            r6[r7] = r0
            java.lang.String r5 = "%s cdn origin file callback  reBuild cdnInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r6)
            hd0.u r5 = r1.f288695d
            hd0.n0 r5 = r5.f288683o
            r5.f288575v = r0
            hd0.C98429r0.m127808N(r5)
        L_0x0484:
            hd0.u r0 = r1.f288695d
            hd0.n0 r0 = r0.f288683o
            java.lang.String r0 = r0.mo137705i()
            java.lang.String r5 = "msg"
            r6 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r5, r6)
            if (r0 == 0) goto L_0x0507
            hd0.o0 r8 = hd0.C98398h0.Bx0()
            hd0.o0 r9 = hd0.C98398h0.Bx0()
            hd0.u r13 = r1.f288695d
            java.lang.String r13 = r13.f288677f
            java.lang.String r9 = r9.mo137728q(r13)
            java.lang.String r13 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r13 = r0.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = ".msg.videomsg.$aeskey"
            java.lang.Object r14 = r0.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            boolean r8 = r8.mo137732v(r9, r13, r14)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 12696(0x3198, float:1.7791E-41)
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            if (r8 == 0) goto L_0x04c5
            r8 = 1
            goto L_0x04c6
        L_0x04c5:
            r8 = 2
        L_0x04c6:
            int r8 = r8 + 900
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14 = 0
            r15[r14] = r8
            hd0.u r8 = r1.f288695d
            hd0.n0 r8 = r8.f288683o
            int r8 = r8.f288559f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15[r7] = r8
            r9.mo160131h(r13, r15)
            hd0.u r8 = r1.f288695d
            hd0.n0 r8 = r8.f288687s
            if (r8 == 0) goto L_0x0507
            hd0.o0 r8 = hd0.C98398h0.Bx0()
            hd0.o0 r9 = hd0.C98398h0.Bx0()
            hd0.u r13 = r1.f288695d
            java.lang.String r13 = r13.f288686r
            java.lang.String r9 = r9.mo137728q(r13)
            java.lang.String r13 = ".msg.videomsg.$cdnrawvideourl"
            java.lang.Object r13 = r0.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = ".msg.videomsg.$cdnrawvideoaeskey"
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            r8.mo137732v(r9, r13, r0)
        L_0x0507:
            hd0.u r0 = r1.f288695d
            java.lang.String r0 = r0.f288686r
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x07ed
            hd0.u r0 = r1.f288695d
            hd0.n0 r8 = r0.f288683o
            java.lang.String r8 = r8.f288546N
            r0.f288686r = r8
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r0 != 0) goto L_0x07ed
            hd0.u r0 = r1.f288695d
            java.lang.String r8 = r0.f288686r
            hd0.n0 r8 = hd0.C98429r0.m127818i(r8)
            r0.f288687s = r8
            hd0.u r8 = r1.f288695d
            hd0.n0 r0 = r8.f288687s
            if (r0 == 0) goto L_0x07ed
            r8.f288688t = r3
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            hd0.n0 r2 = r8.f288683o
            long r13 = r2.f288563j
            java.lang.String r2 = r2.mo137707k()
            hd0.n0 r3 = r8.f288683o
            java.lang.String r3 = r3.f288546N
            java.lang.String r9 = "upvideo"
            java.lang.String r2 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r9, r13, r2, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0566
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = r8.mo137765l1()
            r3 = 0
            r0[r3] = r2
            hd0.n0 r2 = r8.f288683o
            java.lang.String r2 = r2.mo137700d()
            r0[r7] = r2
            java.lang.String r2 = "%s cdntra genClientId failed not use cdn file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
        L_0x0563:
            r3 = 0
            goto L_0x07ec
        L_0x0566:
            hd0.o0 r3 = hd0.C98398h0.Bx0()
            java.lang.String r9 = r8.f288686r
            java.lang.String r3 = r3.mo137728q(r9)
            r8.f288682n = r2
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r9 = "task_NetSceneUploadVideo_1"
            r2.f287660d = r9
            gi.g$a r9 = r8.f288689u
            r2.f287662f = r9
            java.lang.String r9 = r8.f288682n
            r2.field_mediaId = r9
            r2.field_fullpath = r3
            r9 = 4
            r2.field_fileType = r9
            hd0.n0 r9 = r8.f288683o
            java.lang.String r9 = r9.mo137707k()
            r2.field_talker = r9
            java.lang.String r9 = "HDVideo:1"
            r2.f287653J = r9
            hd0.n0 r9 = r8.f288683o
            java.lang.String r9 = r9.mo137707k()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85812O4(r9)
            if (r9 != 0) goto L_0x05a7
            boolean r9 = r8.f288685q
            if (r9 == 0) goto L_0x05a7
            r15 = 1
            goto L_0x05a8
        L_0x05a7:
            r15 = 0
        L_0x05a8:
            r2.field_enable_hitcheck = r15
            hd0.n0 r9 = r8.f288683o
            java.lang.String r9 = r9.mo137707k()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85812O4(r9)
            if (r9 == 0) goto L_0x05ba
            r9 = 0
            r2.field_sendmsg_viacdn = r9
            goto L_0x05cf
        L_0x05ba:
            boolean r9 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39150b(r3)
            if (r9 == 0) goto L_0x05cf
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 106(0x6a, double:5.24E-322)
            r30 = 30
            r32 = 1
            r34 = 0
            r27.idkeyStat(r28, r30, r32, r34)
            r2.field_use_multithread = r7
        L_0x05cf:
            r2.field_largesvideo = r7
            java.lang.String r9 = r2.field_thumbpath
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r9 = (int) r13
            r8.f288684p = r9
            r13 = 5242880(0x500000, float:7.34684E-39)
            if (r9 < r13) goto L_0x05fc
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r3 = r8.mo137765l1()
            r4 = 0
            r0[r4] = r3
            java.lang.String r2 = r2.field_thumbpath
            r0[r7] = r2
            int r2 = r8.f288684p
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
            goto L_0x0563
        L_0x05fc:
            hd0.n0 r9 = r8.f288683o
            java.lang.String r9 = r9.mo137705i()
            java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r9, r5, r6)
            r9 = 100
            java.lang.String r13 = ","
            java.lang.String r14 = "UseVideoHash"
            java.lang.String r15 = "Check use videohash :%s"
            java.lang.String r6 = "%s cdntra parse video recv xml failed"
            if (r5 == 0) goto L_0x06d6
            java.lang.String r11 = ".msg.videomsg.cdnrawvideourl"
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r2.field_fileId = r11
            java.lang.String r11 = ".msg.videomsg.cdnrawvideoaeskey"
            java.lang.Object r5 = r5.get(r11)
            java.lang.String r5 = (java.lang.String) r5
            r2.field_aesKey = r5
            java.lang.String r5 = r2.field_fileId
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0636
            java.lang.String r5 = r2.field_aesKey
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0772
        L_0x0636:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r11 = r8.mo137765l1()
            r17 = 0
            r5[r17] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r5)
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x06c7 }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x06c7 }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x06c7 }
            java.lang.String r0 = r0.mo107405c(r14)     // Catch:{ Exception -> 0x06c7 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x06c7 }
            java.lang.String[] r0 = r0.split(r13)     // Catch:{ Exception -> 0x06c7 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x06c7 }
            f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x06c7 }
            int r5 = r5.mo121110g()     // Catch:{ Exception -> 0x06c7 }
            int r5 = p823sg.C101615j.m133462b(r5, r9)     // Catch:{ Exception -> 0x06c7 }
            if (r0 == 0) goto L_0x0678
            int r6 = r0.length     // Catch:{ Exception -> 0x06c7 }
            if (r6 < r7) goto L_0x0678
            r6 = 0
            r9 = r0[r6]     // Catch:{ Exception -> 0x06c7 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r6)     // Catch:{ Exception -> 0x06c7 }
            if (r9 < r5) goto L_0x0678
            r6 = 1
            goto L_0x0679
        L_0x0678:
            r6 = 0
        L_0x0679:
            if (r0 == 0) goto L_0x068a
            int r9 = r0.length     // Catch:{ Exception -> 0x06c7 }
            r11 = 2
            if (r9 < r11) goto L_0x068a
            r9 = r0[r7]     // Catch:{ Exception -> 0x06c7 }
            r11 = 0
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r11)     // Catch:{ Exception -> 0x06c7 }
            if (r9 < r5) goto L_0x068a
            r5 = 1
            goto L_0x068b
        L_0x068a:
            r5 = 0
        L_0x068b:
            if (r0 == 0) goto L_0x0698
            int r9 = r0.length     // Catch:{ Exception -> 0x06c7 }
            r11 = 3
            if (r9 < r11) goto L_0x0698
            r9 = 2
            r11 = r0[r9]     // Catch:{ Exception -> 0x06c7 }
            r9 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r9)     // Catch:{ Exception -> 0x06c7 }
        L_0x0698:
            boolean r9 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x06c7 }
            if (r9 == 0) goto L_0x06a0
            r5 = 1
            r6 = 1
        L_0x06a0:
            if (r6 == 0) goto L_0x06b3
            hd0.o0 r6 = hd0.C98398h0.Bx0()     // Catch:{ Exception -> 0x06c7 }
            r9 = 2
            r0 = r0[r9]     // Catch:{ Exception -> 0x06c7 }
            r9 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r9)     // Catch:{ Exception -> 0x06c7 }
            java.lang.String[] r6 = r6.mo137721g(r3, r0)     // Catch:{ Exception -> 0x06c7 }
            goto L_0x06b4
        L_0x06b3:
            r6 = 0
        L_0x06b4:
            if (r5 == 0) goto L_0x0772
            if (r6 == 0) goto L_0x0772
            int r0 = r6.length     // Catch:{ Exception -> 0x06c7 }
            r3 = 2
            if (r0 != r3) goto L_0x0772
            r3 = 0
            r0 = r6[r3]     // Catch:{ Exception -> 0x06c7 }
            r2.field_fileId = r0     // Catch:{ Exception -> 0x06c7 }
            r0 = r6[r7]     // Catch:{ Exception -> 0x06c7 }
            r2.field_aesKey = r0     // Catch:{ Exception -> 0x06c7 }
            goto L_0x0772
        L_0x06c7:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5 = 0
            r3[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r15, r3)
            goto L_0x0772
        L_0x06d6:
            r5 = 0
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r17 = r8.mo137765l1()
            r11[r5] = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r11)
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x0765 }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x0765 }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x0765 }
            java.lang.String r0 = r0.mo107405c(r14)     // Catch:{ Exception -> 0x0765 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0765 }
            java.lang.String[] r0 = r0.split(r13)     // Catch:{ Exception -> 0x0765 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0765 }
            f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x0765 }
            int r5 = r5.mo121110g()     // Catch:{ Exception -> 0x0765 }
            int r5 = p823sg.C101615j.m133462b(r5, r9)     // Catch:{ Exception -> 0x0765 }
            if (r0 == 0) goto L_0x0717
            int r6 = r0.length     // Catch:{ Exception -> 0x0765 }
            if (r6 < r7) goto L_0x0717
            r6 = 0
            r9 = r0[r6]     // Catch:{ Exception -> 0x0765 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r6)     // Catch:{ Exception -> 0x0765 }
            if (r9 < r5) goto L_0x0717
            r6 = 1
            goto L_0x0718
        L_0x0717:
            r6 = 0
        L_0x0718:
            if (r0 == 0) goto L_0x0729
            int r9 = r0.length     // Catch:{ Exception -> 0x0765 }
            r11 = 2
            if (r9 < r11) goto L_0x0729
            r9 = r0[r7]     // Catch:{ Exception -> 0x0765 }
            r11 = 0
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r11)     // Catch:{ Exception -> 0x0765 }
            if (r9 < r5) goto L_0x0729
            r5 = 1
            goto L_0x072a
        L_0x0729:
            r5 = 0
        L_0x072a:
            if (r0 == 0) goto L_0x0737
            int r9 = r0.length     // Catch:{ Exception -> 0x0765 }
            r11 = 3
            if (r9 < r11) goto L_0x0737
            r9 = 2
            r11 = r0[r9]     // Catch:{ Exception -> 0x0765 }
            r9 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r9)     // Catch:{ Exception -> 0x0765 }
        L_0x0737:
            boolean r9 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x0765 }
            if (r9 == 0) goto L_0x073f
            r5 = 1
            r6 = 1
        L_0x073f:
            if (r6 == 0) goto L_0x0752
            hd0.o0 r6 = hd0.C98398h0.Bx0()     // Catch:{ Exception -> 0x0765 }
            r9 = 2
            r0 = r0[r9]     // Catch:{ Exception -> 0x0765 }
            r9 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r9)     // Catch:{ Exception -> 0x0765 }
            java.lang.String[] r6 = r6.mo137721g(r3, r0)     // Catch:{ Exception -> 0x0765 }
            goto L_0x0753
        L_0x0752:
            r6 = 0
        L_0x0753:
            if (r5 == 0) goto L_0x0772
            if (r6 == 0) goto L_0x0772
            int r0 = r6.length     // Catch:{ Exception -> 0x0765 }
            r3 = 2
            if (r0 != r3) goto L_0x0772
            r3 = 0
            r0 = r6[r3]     // Catch:{ Exception -> 0x0765 }
            r2.field_fileId = r0     // Catch:{ Exception -> 0x0765 }
            r0 = r6[r7]     // Catch:{ Exception -> 0x0765 }
            r2.field_aesKey = r0     // Catch:{ Exception -> 0x0765 }
            goto L_0x0772
        L_0x0765:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5 = 0
            r3[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r15, r3)
        L_0x0772:
            java.lang.String r0 = r2.field_aesKey
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0782
            java.lang.String r0 = r2.field_aesKey
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0794
        L_0x0782:
            r2.field_aesKey = r12
            r2.field_fileId = r12
            java.lang.Class<qo.h> r0 = p663qo.C101211h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.h r0 = (p663qo.C101211h) r0
            java.lang.String r0 = r0.mo140293rN()
            r2.field_aesKey = r0
        L_0x0794:
            r3 = 6
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r8.mo137765l1()
            r5 = 0
            r0[r5] = r3
            java.lang.String r3 = r2.field_mediaId
            r0[r7] = r3
            java.lang.String r3 = r2.field_fileId
            r5 = 2
            r0[r5] = r3
            java.lang.String r3 = r2.field_aesKey
            r5 = 3
            r0[r5] = r3
            boolean r3 = r8.f288685q
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 4
            r0[r5] = r3
            int r3 = r2.field_largesvideo
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 5
            r0[r5] = r3
            java.lang.String r3 = "%s summersafecdn check hit cache VideoHash origin video :%s %s %s %b %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r0)
            di3.d r0 = di3.C86312j.m106911c(r4)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.if0(r2)
            if (r0 != 0) goto L_0x0563
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 111(0x6f, double:5.5E-322)
            r16 = 226(0xe2, double:1.117E-321)
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r2 = r8.mo137765l1()
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "%s cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r0)
            r8.f288682n = r12
        L_0x07ec:
            return r3
        L_0x07ed:
            hd0.u r14 = r1.f288695d
            hd0.n0 r0 = r14.f288683o
            int r4 = r0.f288576w
            r5 = 4
            if (r4 != r5) goto L_0x0882
            r14.f288680i = r3
            gi.d r2 = r14.f288688t
            if (r2 == 0) goto L_0x07fd
            goto L_0x07ff
        L_0x07fd:
            r2 = r3
            r3 = 0
        L_0x07ff:
            ic3.d r15 = new ic3.d
            r15.<init>()
            java.lang.String r4 = r0.mo137705i()
            r15.mo141099d(r4)
            java.lang.String r4 = r15.f76250f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0848
            boolean r4 = r2.mo137409b()
            if (r4 != 0) goto L_0x0848
            java.lang.String r4 = r2.field_aesKey
            r15.f76250f = r4
            r15.f76252h = r4
            java.lang.String r4 = r2.field_fileId
            r15.f76251g = r4
            r15.f76253i = r4
            java.lang.String r4 = r15.mo141118z()
            r0.f288575v = r4
            r4 = 2097152(0x200000, float:2.938736E-39)
            r0.f288548P = r4
            hd0.C98429r0.m127808N(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "do check before md5 check, aeskey = "
            r4.append(r5)
            java.lang.String r5 = r2.field_aesKey
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
        L_0x0848:
            boolean r4 = r2.mo137409b()
            if (r4 == 0) goto L_0x087d
            java.lang.String r4 = r2.field_aesKey
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x087d
            java.lang.String r4 = "onlyDoUpload, upload by cdn hit md5, do md5 check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            java.lang.Class<dp.b> r4 = p494dp.C97505b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r5 = r4
            dp.b r5 = (p494dp.C97505b) r5
            java.lang.String r6 = r2.field_fileId
            java.lang.String r7 = r2.field_filemd5
            java.lang.String r8 = r2.field_mp4identifymd5
            int r9 = r2.field_filecrc
            hd0.u$$a r10 = new hd0.u$$a
            r13 = r10
            r16 = r0
            r17 = r2
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            r5.mo136779zN(r6, r7, r8, r9, r10)
            goto L_0x0880
        L_0x087d:
            r14.mo137763j1(r0, r2, r3)
        L_0x0880:
            r2 = 0
            return r2
        L_0x0882:
            com.tencent.mm.modelimage.q0 r0 = com.tencent.p014mm.modelimage.C92855q0.m117113f()
            hd0.u r4 = r1.f288695d
            java.lang.String r5 = r4.f288677f
            r0.f267460C = r5
            java.lang.String r5 = r4.f288679h
            r0.f267465H = r5
            if (r2 == 0) goto L_0x0893
            goto L_0x08b5
        L_0x0893:
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            hd0.n0 r5 = r4.f288683o
            java.lang.String r5 = r5.mo137700d()
            java.lang.String r2 = r2.mo137728q(r5)
            boolean r5 = uf0.C102016c.m134339a(r2)
            if (r5 != 0) goto L_0x08b8
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r4 = r4.mo137765l1()
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "%s check preload length but it not mp4."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r4, r2)
        L_0x08b5:
            r15 = 0
            goto L_0x0930
        L_0x08b8:
            uf0.b r5 = new uf0.b
            r5.<init>()
            long r8 = r5.mo141510a(r2)
            long r12 = r5.f300397a
            r14 = 131072(0x20000, double:6.47582E-319)
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x08f4
            r14 = 0
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x08f4
            hd0.n0 r2 = r4.f288683o
            int r2 = r2.f288566m
            r6 = 5
            if (r2 <= r6) goto L_0x08f4
            r36 = r8
            long r7 = r5.f300398b
            int r6 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x08f6
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x08f6
            int r6 = (int) r12
            r14 = 5
            long r7 = r7 * r14
            long r14 = (long) r2
            long r7 = r7 / r14
            int r2 = (int) r7
            int r6 = r6 + r2
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r6 > r2) goto L_0x08f1
            int r6 = r6 + r2
        L_0x08f1:
            r15 = r6
            r2 = 6
            goto L_0x08f8
        L_0x08f4:
            r36 = r8
        L_0x08f6:
            r2 = 6
            r15 = 0
        L_0x08f8:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = r4.mo137765l1()
            r7 = 0
            r2[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r7 = 1
            r2[r7] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r36)
            r7 = 2
            r2[r7] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r16 = 3
            r2[r16] = r6
            hd0.n0 r4 = r4.f288683o
            int r4 = r4.f288566m
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 4
            r2[r6] = r4
            long r4 = r5.f300398b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 5
            r2[r5] = r4
            java.lang.String r4 = "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r2)
        L_0x0930:
            r0.f267461D = r15
            hd0.u r2 = r1.f288695d
            gi.d r2 = r2.f288688t
            if (r2 == 0) goto L_0x093d
            r0.f267462E = r2
            r0.f267464G = r3
            goto L_0x093f
        L_0x093d:
            r0.f267462E = r3
        L_0x093f:
            hd0.u$$b$a r2 = new hd0.u$$b$a
            r2.<init>(r3)
            r0.f267463F = r2
            r2 = 4
            r0.f295194h = r2
            pc0.a0$b r0 = r0.mo140195a()
            r0.mo123694a()
        L_0x0950:
            r15 = 0
            return r15
        L_0x0952:
            r14 = -1
            r15 = 0
            r16 = 3
            if (r13 != 0) goto L_0x0959
            goto L_0x095c
        L_0x0959:
            int r5 = r13.f288562i
            r14 = r5
        L_0x095c:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r6.mo137765l1()
            r2[r15] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "%s info is null or has paused, status:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            di3.d r2 = di3.C86312j.m106911c(r4)
            qo.l r2 = (p663qo.C101213l) r2
            hd0.u r3 = r1.f288695d
            java.lang.String r3 = r3.f288682n
            r2.gn0(r3)
            hd0.u r2 = r1.f288695d
            hd0.n0 r3 = r2.f288683o
            if (r3 == 0) goto L_0x099b
            ig3.n r3 = ig3.C98692n.f289404a
            java.lang.String r2 = r2.f288677f
            if (r2 != 0) goto L_0x098b
            goto L_0x0997
        L_0x098b:
            zt3.t r3 = zt3.C119157j.f356862d
            ig3.l r4 = new ig3.l
            r4.<init>(r2)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183884o(r4)
        L_0x0997:
            r0 = r14
            r17 = 0
            goto L_0x09bf
        L_0x099b:
            ig3.n r3 = ig3.C98692n.f289404a
            r4 = 0
            java.lang.String r5 = r2.f288677f
            r6 = 5
            r7 = 0
            r9 = 0
            r11 = 0
            r17 = 0
            r19 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r8 = r9
            r10 = r11
            r12 = r17
            r15 = r14
            r17 = 0
            r14 = r19
            r0 = r15
            r15 = r37
            r2.mo138104e(r3, r4, r5, r6, r8, r10, r12, r14, r15)
        L_0x09bf:
            hd0.u r2 = r1.f288695d
            ob0.n r2 = r2.f288675d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "info is null or has paused, status"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            hd0.u r3 = r1.f288695d
            r4 = r37
            r5 = 3
            r2.onSceneEnd(r5, r4, r0, r3)
            hd0.u r0 = r1.f288695d
            com.tencent.mm.modelimage.j r0 = r0.f288681j
            r0.mo127120a(r5, r4)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.u$$b.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
