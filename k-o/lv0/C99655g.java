package lv0;

import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.LinkedList;
import java.util.Map;
import jv0.C99055a;
import ov0.C100546d;
import ov0.C100556h;
import p823sg.C90193h;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C77926f9;
import te3.C77996sv3;

/* renamed from: lv0.g */
public class C99655g implements C99663m {
    /* renamed from: a */
    public int mo139033a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        C51163rv3 rv32;
        String str2;
        C92836k kVar;
        String str3;
        byte[] bArr;
        String str4;
        long j;
        int i;
        String str5;
        String str6;
        long j2;
        int i2;
        String str7;
        String str8;
        int i3;
        C77926f9 f9Var2 = f9Var;
        C72963f4 f4Var2 = f4Var;
        if (f9Var2 == null || (rv32 = f9Var2.f227337h) == null) {
            Log.m105920e("MicroMsg.BakOldItemImg", "recover bakitem or bakitem content is null");
            return 0;
        }
        String str9 = new String(Util.nullAs(rv32.f141175d, ""));
        Log.m105918d("MicroMsg.BakOldItemImg", "recover msg" + f9Var2.f227348v + " " + str9);
        Object[] objArr = new Object[4];
        C51018qv3 qv32 = f9Var2.f227345s;
        objArr[0] = Integer.valueOf(qv32 == null ? 0 : qv32.f140572d);
        objArr[1] = Integer.valueOf(f9Var2.f227347u);
        LinkedList<C77996sv3> linkedList = f9Var2.f227344r;
        objArr[2] = linkedList == null ? "" : linkedList.toString();
        LinkedList<C51163rv3> linkedList2 = f9Var2.f227343q;
        objArr[3] = linkedList2 == null ? "" : linkedList2.toString();
        Log.m105919d("MicroMsg.BakOldItemImg", "recover bakitem:, buf:%d, BufferType:%d, MediaType%s, ids:%s", objArr);
        f4Var2.mo108732L2(str9);
        C92839m g = C100546d.m131563g().mo139995h().mo140007g();
        if (f4Var.mo108769t2() == 1) {
            if (f4Var.getMsgId() != 0) {
                str2 = "MicroMsg.BakOldItemImg";
                kVar = g.mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
            } else {
                str2 = "MicroMsg.BakOldItemImg";
                kVar = null;
            }
            if (kVar == null || kVar.f267374a == 0) {
                kVar = g.mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
            }
        } else {
            str2 = "MicroMsg.BakOldItemImg";
            kVar = g.mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
        }
        Map<String, String> parseXml = XmlParser.parseXml(str9, "msg", (String) null);
        boolean z = parseXml != null && Util.getLong(parseXml.get(".msg.img.$hdlength"), 0) > 0;
        String nullAs = Util.nullAs(C99055a.m129005d(f9Var2, 3, (String) null), "");
        if (f9Var2.f227347u == 3 && f9Var2.f227345s != null) {
            C86013q1.m106440a(C99055a.m129003b() + "backupMeida/" + C99055a.m129004c(nullAs) + nullAs, f9Var2.f227345s.f140574f.f257327a);
        }
        String nullAs2 = Util.nullAs(C99055a.m129005d(f9Var2, 2, (String) null), "");
        if (f9Var2.f227347u == 2 && f9Var2.f227345s != null) {
            C86013q1.m106440a(C99055a.m129003b() + "backupMeida/" + C99055a.m129004c(nullAs2) + nullAs2, f9Var2.f227345s.f140574f.f257327a);
        }
        String str10 = str2;
        Log.m105919d(str10, "hdName %s, imgName:%s", nullAs, nullAs2);
        if (Util.isNullOrNil(nullAs2)) {
            Log.m105920e(str10, "imgName is null, imgName = hdName");
            nullAs2 = nullAs;
        }
        byte[] g2 = C99055a.m129008g(f9Var2, 1);
        if (g2 == null) {
            Log.m105924i(str10, "getThumbBuf is null and read from mediapath");
            String f = C99055a.m129007f(nullAs2);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            str3 = nullAs;
            sb.append(Util.nowMilliSecond());
            sb.append(" ");
            String f2 = C90193h.m112878f(sb.toString().getBytes());
            String str11 = C99055a.m129003b() + "backupMeida/" + C99055a.m129004c(f2);
            String str12 = str11 + f2;
            Uri n = C116299g2.m163858n(str11);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            int isLongPicture = LongBitmapHandler.isLongPicture(str12);
            if (isLongPicture <= 0) {
                if (!BitmapUtil.createThumbNail(f, 120, 120, Bitmap.CompressFormat.JPEG, 90, str12)) {
                    Log.m105920e(str10, "createThumbNail failed");
                    return -1;
                }
                i3 = -1;
                Log.m105918d(str10, "insert: thumbName = " + f2);
            } else if (!LongBitmapHandler.createLongPictureThumbNail(f, Bitmap.CompressFormat.JPEG, 90, str12, isLongPicture)) {
                Log.m105920e(str10, "createLongPictureThumbNail failed");
                return -1;
            } else {
                i3 = -1;
            }
            bArr = C86013q1.m106433O(str12, 0, i3);
        } else {
            str3 = nullAs;
            Log.m105925i(str10, "getThumbBuf len:%d", Integer.valueOf(g2.length));
            bArr = g2;
        }
        if (bArr == null) {
            Log.m105920e(str10, "img buf is null");
            return -1;
        }
        String str13 = str3;
        String TY = g.mo127174TY(str13, "", "", true);
        String TY2 = g.mo127174TY(nullAs2, "", "", true);
        if (kVar.f267374a == 0) {
            if (z) {
                str8 = TY2;
                String str14 = str10;
                j = 0;
                str4 = nullAs2;
                i = -1;
                String str15 = str13;
                str7 = TY;
                str5 = str9;
                long Jt0 = g.Jt0(f4Var.mo108768t(), bArr, 2, f9Var2.f227348v, true, str15, C99055a.m129006e(f9Var2, 3), str9, new PString(), new PInt(), new PInt());
                i2 = 3;
                if (!C99055a.m129009h(f9Var2, 3, str7)) {
                    str6 = str14;
                    Log.m105921e(str6, "writeItem MMBAK_HD_IMG failed:%s", str7);
                } else {
                    str6 = str14;
                }
                j2 = Jt0;
            } else {
                str8 = TY2;
                str6 = str10;
                str4 = nullAs2;
                str7 = TY;
                str5 = str9;
                j = 0;
                i2 = 3;
                i = -1;
                j2 = 0;
            }
            int e = C99055a.m129006e(f9Var2, 2);
            int e2 = e <= 0 ? C99055a.m129006e(f9Var2, i2) : e;
            PString pString = new PString();
            PInt pInt = new PInt();
            C92839m mVar = g;
            byte[] bArr2 = bArr;
            PInt pInt2 = new PInt();
            PString pString2 = pString;
            PInt pInt3 = pInt;
            long j3 = j2;
            String str16 = str6;
            long Jt02 = mVar.Jt0(f4Var.mo108768t(), bArr2, 2, f9Var2.f227348v, false, str4, e2, str5, pString2, pInt3, pInt2);
            if (!C99055a.m129009h(f9Var2, 2, str8)) {
                Log.m105921e(str16, "writeItem MMBAK_IMG failed:%s", str7);
            }
            if (Jt02 <= j) {
                return i;
            }
            f4Var2.mo108739S2(pString2.value);
            f4Var2.mo108752f3(pInt3.value);
            f4Var2.mo108751e3(pInt2.value);
            long j4 = j3;
            if (j4 > j) {
                C92836k nP = C100546d.m131563g().mo139995h().mo140007g().mo127194nP(Long.valueOf(Jt02));
                nP.mo127151v((int) j4);
                C100546d.m131563g().mo139995h().mo140007g().Dx0(Long.valueOf(Jt02), nP);
            }
        } else {
            String str17 = kVar.f267380g;
            if (str17 == null || !str17.startsWith("THUMBNAIL_DIRPATH://")) {
                f4Var2.mo108739S2("THUMBNAIL://" + kVar.f267374a);
            } else {
                f4Var2.mo108739S2(str17);
            }
        }
        C100556h.m131583c(f4Var);
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0285 A[Catch:{ Exception -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02af A[Catch:{ Exception -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x04f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x04f6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo139034b(te3.C77926f9 r26, boolean r27, com.tencent.p014mm.storage.C72963f4 r28, java.lang.String r29, java.util.LinkedList<pv0.C100968x> r30, java.util.HashMap<java.lang.Long, lv0.C99659k.C99660a> r31, boolean r32, long r33) {
        /*
            r25 = this;
            java.lang.String r0 = r28.getContent()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x0016
        L_0x000d:
            java.lang.String r0 = r28.getContent()
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
        L_0x0016:
            int r2 = r28.mo108769t2()
            r3 = 0
            r5 = 1
            if (r2 != r5) goto L_0x0056
            ov0.d r2 = ov0.C100546d.m131563g()
            ov0.g r2 = r2.mo139995h()
            com.tencent.mm.modelimage.m r2 = r2.mo140007g()
            java.lang.String r6 = r28.mo108768t()
            long r7 = r28.getMsgId()
            com.tencent.mm.modelimage.k r2 = r2.mo127200vP(r6, r7)
            long r6 = r2.f267374a
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x006e
            ov0.d r2 = ov0.C100546d.m131563g()
            ov0.g r2 = r2.mo139995h()
            com.tencent.mm.modelimage.m r2 = r2.mo140007g()
            java.lang.String r6 = r28.mo108768t()
            long r7 = r28.mo108774y2()
            com.tencent.mm.modelimage.k r2 = r2.mo127168NQ(r6, r7)
            goto L_0x006e
        L_0x0056:
            ov0.d r2 = ov0.C100546d.m131563g()
            ov0.g r2 = r2.mo139995h()
            com.tencent.mm.modelimage.m r2 = r2.mo140007g()
            java.lang.String r6 = r28.mo108768t()
            long r7 = r28.mo108774y2()
            com.tencent.mm.modelimage.k r2 = r2.mo127168NQ(r6, r7)
        L_0x006e:
            ov0.d r6 = ov0.C100546d.m131563g()
            ov0.g r6 = r6.mo139995h()
            com.tencent.mm.modelimage.m r6 = r6.mo140007g()
            java.lang.String r7 = r28.mo108765s2()
            java.lang.String r9 = r6.v10(r7, r5)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r6 == 0) goto L_0x050a
            lv0.l$a r6 = new lv0.l$a
            r12 = 1
            r16 = 0
            java.lang.String r14 = "_thumb"
            r8 = r6
            r10 = r26
            r11 = r30
            r13 = r27
            r15 = r32
            r8.<init>((java.lang.String) r9, (te3.C77926f9) r10, (java.util.LinkedList<pv0.C100968x>) r11, (int) r12, (boolean) r13, (java.lang.String) r14, (boolean) r15, (pv0.C100968x) r16)
            int r6 = lv0.C99661l.m130077a(r6)
            int r0 = r0 + r6
            int r6 = r28.mo108769t2()
            java.lang.String r7 = " "
            java.lang.String r8 = "bigImgPath "
            java.lang.String r9 = "MicroMsg.BakOldItemImg"
            java.lang.String r10 = ""
            if (r6 != r5) goto L_0x015d
            ov0.d r6 = ov0.C100546d.m131563g()
            ov0.g r6 = r6.mo139995h()
            com.tencent.mm.modelimage.m r6 = r6.mo140007g()
            java.lang.String r11 = r2.f267378e
            java.lang.String r13 = r6.mo127174TY(r11, r10, r10, r5)
            boolean r6 = r2.mo127145p()
            if (r6 == 0) goto L_0x0119
            ov0.d r6 = ov0.C100546d.m131563g()
            ov0.g r6 = r6.mo139995h()
            com.tencent.mm.modelimage.m r6 = r6.mo140007g()
            int r2 = r2.f267390q
            com.tencent.mm.modelimage.k r2 = r6.mo127173TO(r2)
            ov0.d r6 = ov0.C100546d.m131563g()
            ov0.g r6 = r6.mo139995h()
            com.tencent.mm.modelimage.m r6 = r6.mo140007g()
            java.lang.String r11 = r2.f267378e
            java.lang.String r6 = r6.mo127174TY(r11, r10, r10, r5)
            com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r11 == 0) goto L_0x010e
            lv0.l$a r11 = new lv0.l$a
            r18 = 3
            r22 = 0
            java.lang.String r20 = "_hd"
            r14 = r11
            r15 = r6
            r16 = r26
            r17 = r30
            r19 = r27
            r21 = r32
            r14.<init>((java.lang.String) r15, (te3.C77926f9) r16, (java.util.LinkedList<pv0.C100968x>) r17, (int) r18, (boolean) r19, (java.lang.String) r20, (boolean) r21, (pv0.C100968x) r22)
            int r11 = lv0.C99661l.m130077a(r11)
            int r0 = r0 + r11
            goto L_0x011a
        L_0x010e:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r1] = r6
            java.lang.String r12 = "packet img.hasHdImg but hdbigImgPath has no file, hdbigImgPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r12, r11)
            goto L_0x011a
        L_0x0119:
            r6 = r10
        L_0x011a:
            com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r11 != 0) goto L_0x0260
            boolean r6 = r13.equals(r6)
            if (r6 != 0) goto L_0x0260
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r13)
            r6.append(r7)
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r6)
            lv0.l$a r6 = new lv0.l$a
            r16 = 2
            r19 = 0
            r12 = r6
            r14 = r26
            r15 = r30
            r17 = r27
            r18 = r32
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            int r6 = lv0.C99661l.m130077a(r6)
            goto L_0x025f
        L_0x015d:
            boolean r6 = r2.mo127146q()
            if (r6 == 0) goto L_0x0260
            ov0.d r6 = ov0.C100546d.m131563g()
            ov0.g r6 = r6.mo139995h()
            com.tencent.mm.modelimage.m r6 = r6.mo140007g()
            java.lang.String r11 = r2.f267378e
            java.lang.String r13 = r6.mo127174TY(r11, r10, r10, r5)
            boolean r6 = r2.mo127145p()
            if (r6 == 0) goto L_0x0217
            boolean r6 = r2.mo127145p()
            if (r6 == 0) goto L_0x0194
            ov0.d r6 = ov0.C100546d.m131563g()
            ov0.g r6 = r6.mo139995h()
            com.tencent.mm.modelimage.m r6 = r6.mo140007g()
            int r11 = r2.f267390q
            com.tencent.mm.modelimage.k r6 = r6.mo127173TO(r11)
            goto L_0x0195
        L_0x0194:
            r6 = r2
        L_0x0195:
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r12 = r6.f267376c
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r1] = r12
            int r12 = r6.f267377d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r5] = r12
            java.lang.String r12 = r6.f267378e
            r14 = 2
            r11[r14] = r12
            r12 = 3
            int r15 = r6.f267381h
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r11[r12] = r15
            java.lang.String r12 = "packet hdinfo off:%d total:%d path:%s, compressType[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r11)
            int r11 = r6.f267381h
            if (r11 != r5) goto L_0x0217
            boolean r11 = r6.equals(r2)
            if (r11 != 0) goto L_0x0217
            int r11 = r6.f267376c
            int r12 = r6.f267377d
            if (r11 != r12) goto L_0x0217
            ov0.d r11 = ov0.C100546d.m131563g()
            ov0.g r11 = r11.mo139995h()
            com.tencent.mm.modelimage.m r11 = r11.mo140007g()
            java.lang.String r6 = r6.f267378e
            java.lang.String r6 = r11.mo127174TY(r6, r10, r10, r5)
            java.lang.Object[] r11 = new java.lang.Object[r14]
            r11[r1] = r6
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11[r5] = r12
            java.lang.String r12 = "packet hdPath:%s, fileLen[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r12, r11)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r11 == 0) goto L_0x0218
            lv0.l$a r11 = new lv0.l$a
            r19 = 3
            r23 = 0
            java.lang.String r21 = "_hd"
            r15 = r11
            r16 = r6
            r17 = r26
            r18 = r30
            r20 = r27
            r22 = r32
            r15.<init>((java.lang.String) r16, (te3.C77926f9) r17, (java.util.LinkedList<pv0.C100968x>) r18, (int) r19, (boolean) r20, (java.lang.String) r21, (boolean) r22, (pv0.C100968x) r23)
            int r11 = lv0.C99661l.m130077a(r11)
            int r0 = r0 + r11
            com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            goto L_0x0218
        L_0x0217:
            r6 = r10
        L_0x0218:
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r11 == 0) goto L_0x0260
            com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r11 != 0) goto L_0x0260
            boolean r6 = r13.equals(r6)
            if (r6 != 0) goto L_0x0260
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r13)
            r6.append(r7)
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r6)
            lv0.l$a r6 = new lv0.l$a
            r16 = 2
            r19 = 0
            r12 = r6
            r14 = r26
            r15 = r30
            r17 = r27
            r18 = r32
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            int r6 = lv0.C99661l.m130077a(r6)
        L_0x025f:
            int r0 = r0 + r6
        L_0x0260:
            r24 = r2
            r2 = r0
            r0 = r24
            java.lang.String r6 = "img"
            java.lang.String r7 = "msg"
            java.io.StringWriter r8 = new java.io.StringWriter
            r8.<init>()
            r11 = 0
            org.xmlpull.v1.XmlPullParserFactory r12 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x04d9 }
            org.xmlpull.v1.XmlSerializer r12 = r12.newSerializer()     // Catch:{ Exception -> 0x04d9 }
            r12.setOutput(r8)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r13 = r28.mo108768t()     // Catch:{ Exception -> 0x04d9 }
            boolean r13 = ov0.C100556h.m131584d(r13)     // Catch:{ Exception -> 0x04d9 }
            if (r13 == 0) goto L_0x02a1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r13.<init>()     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r14 = r28.getContent()     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r14 = eb0.C75604z3.m90847s(r14)     // Catch:{ Exception -> 0x04d9 }
            r13.append(r14)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r14 = ":\n"
            r13.append(r14)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x04d9 }
            r8.write(r13)     // Catch:{ Exception -> 0x04d9 }
        L_0x02a1:
            r12.startTag(r11, r7)     // Catch:{ Exception -> 0x04d9 }
            r12.startTag(r11, r6)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r13 = r0.f267393t     // Catch:{ Exception -> 0x04d9 }
            java.util.Map r13 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r7, r11)     // Catch:{ Exception -> 0x04d9 }
            if (r13 == 0) goto L_0x04c1
            java.lang.String r14 = "aeskey"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r15.<init>()     // Catch:{ Exception -> 0x04d9 }
            r15.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = ".msg.img.$aeskey"
            java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9 }
            r15.append(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = r15.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r14, r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = "encryver"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r14.<init>()     // Catch:{ Exception -> 0x04d9 }
            r14.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = ".msg.img.$encryver"
            java.lang.Object r15 = r13.get(r15)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x04d9 }
            r14.append(r15)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r5, r14)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = "cdnthumbaeskey"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r14.<init>()     // Catch:{ Exception -> 0x04d9 }
            r14.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = ".msg.img.$cdnthumbaeskey"
            java.lang.Object r15 = r13.get(r15)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x04d9 }
            r14.append(r15)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r5, r14)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = "cdnthumburl"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r14.<init>()     // Catch:{ Exception -> 0x04d9 }
            r14.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = ".msg.img.$cdnthumburl"
            java.lang.Object r15 = r13.get(r15)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x04d9 }
            r14.append(r15)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r5, r14)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = "cdnthumblength"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r14.<init>()     // Catch:{ Exception -> 0x04d9 }
            r14.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = ".msg.img.$cdnthumblength"
            java.lang.Object r15 = r13.get(r15)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x04d9 }
            r3 = 10240(0x2800, double:5.059E-320)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r15, r3)     // Catch:{ Exception -> 0x04d9 }
            r14.append(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r5, r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = "cdnthumbheight"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r4.<init>()     // Catch:{ Exception -> 0x04d9 }
            r4.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = ".msg.img.$cdnthumbheight"
            java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)     // Catch:{ Exception -> 0x04d9 }
            r4.append(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r3, r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = "cdnthumbwidth"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r4.<init>()     // Catch:{ Exception -> 0x04d9 }
            r4.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = ".msg.img.$cdnthumbwidth"
            java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)     // Catch:{ Exception -> 0x04d9 }
            r4.append(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r3, r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = "cdnmidheight"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r4.<init>()     // Catch:{ Exception -> 0x04d9 }
            r4.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = ".msg.img.$cdnmidheight"
            java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)     // Catch:{ Exception -> 0x04d9 }
            r4.append(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r3, r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = "cdnmidwidth"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r4.<init>()     // Catch:{ Exception -> 0x04d9 }
            r4.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = ".msg.img.$cdnmidwidth"
            java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)     // Catch:{ Exception -> 0x04d9 }
            r4.append(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r3, r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = "cdnhdheight"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r4.<init>()     // Catch:{ Exception -> 0x04d9 }
            r4.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = ".msg.img.$cdnhdheight"
            java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)     // Catch:{ Exception -> 0x04d9 }
            r4.append(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r3, r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = "cdnhdwidth"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r4.<init>()     // Catch:{ Exception -> 0x04d9 }
            r4.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = ".msg.img.$cdnhdwidth"
            java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9 }
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)     // Catch:{ Exception -> 0x04d9 }
            r4.append(r1)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r3, r1)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = "cdnmidimgurl"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r3.<init>()     // Catch:{ Exception -> 0x04d9 }
            r3.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = ".msg.img.$cdnmidimgurl"
            java.lang.Object r4 = r13.get(r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x04d9 }
            r3.append(r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r1, r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = ".msg.img.$length"
            java.lang.Object r1 = r13.get(r1)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04d9 }
            r3 = 0
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = "length"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r5.<init>()     // Catch:{ Exception -> 0x04d9 }
            r5.append(r10)     // Catch:{ Exception -> 0x04d9 }
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x0451
            ov0.d r3 = ov0.C100546d.m131563g()     // Catch:{ Exception -> 0x04d9 }
            ov0.g r3 = r3.mo139995h()     // Catch:{ Exception -> 0x04d9 }
            com.tencent.mm.modelimage.m r3 = r3.mo140007g()     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = r0.f267378e     // Catch:{ Exception -> 0x04d9 }
            r14 = 1
            java.lang.String r3 = r3.mo127174TY(r4, r10, r10, r14)     // Catch:{ Exception -> 0x04d9 }
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)     // Catch:{ Exception -> 0x04d9 }
        L_0x0451:
            r5.append(r14)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r1, r3)     // Catch:{ Exception -> 0x04d9 }
            int r1 = r28.mo108769t2()     // Catch:{ Exception -> 0x04d9 }
            r3 = 1
            if (r1 != r3) goto L_0x0466
            int r0 = r0.f267381h     // Catch:{ Exception -> 0x04d9 }
            if (r0 != r3) goto L_0x04a4
        L_0x0466:
            java.lang.String r0 = "cdnbigimgurl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r1.<init>()     // Catch:{ Exception -> 0x04d9 }
            r1.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x04d9 }
            r1.append(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r0, r1)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r0 = "hdlength"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r1.<init>()     // Catch:{ Exception -> 0x04d9 }
            r1.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = ".msg.img.$hdlength"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x04d9 }
            r4 = 0
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r4)     // Catch:{ Exception -> 0x04d9 }
            r1.append(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r0, r1)     // Catch:{ Exception -> 0x04d9 }
        L_0x04a4:
            java.lang.String r0 = "md5"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9 }
            r1.<init>()     // Catch:{ Exception -> 0x04d9 }
            r1.append(r10)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = ".msg.img.$md5"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x04d9 }
            r1.append(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04d9 }
            r12.attribute(r11, r0, r1)     // Catch:{ Exception -> 0x04d9 }
        L_0x04c1:
            r12.endTag(r11, r6)     // Catch:{ Exception -> 0x04d9 }
            r12.endTag(r11, r7)     // Catch:{ Exception -> 0x04d9 }
            r12.endDocument()     // Catch:{ Exception -> 0x04d9 }
            r8.flush()     // Catch:{ Exception -> 0x04d9 }
            r8.close()     // Catch:{ Exception -> 0x04d9 }
            java.lang.StringBuffer r0 = r8.getBuffer()
            java.lang.String r11 = r0.toString()
            goto L_0x04f3
        L_0x04d9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "packetImg xml error: "
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x04f3:
            if (r11 != 0) goto L_0x04f6
            return r2
        L_0x04f6:
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            r0.f141175d = r11
            r1 = 1
            r0.f141176e = r1
            r1 = r26
            r1.f227337h = r0
            int r0 = r11.length()
            int r2 = r2 + r0
            return r2
        L_0x050a:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lv0.C99655g.mo139034b(te3.f9, boolean, com.tencent.mm.storage.f4, java.lang.String, java.util.LinkedList, java.util.HashMap, boolean, long):int");
    }
}
