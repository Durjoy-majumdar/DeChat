package l51;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C7335d;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import m51.C99788a;
import n51.C34740a;
import o51.C61941a;
import p749xh.C102668t1;
import p753xp.C102704b;
import p867wp.C102479b;
import p867wp.C66163a;
import rx3.C13598b0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: l51.a */
public final class C99341a extends C98598e implements C102704b {
    /* renamed from: Bg */
    public C102479b mo138748Bg(String str, int i, String str2, byte[] bArr) {
        C98597b.C60245a aVar = C98597b.f289091e;
        C7335d c = C86312j.m106911c(C99341a.class);
        C87412m.m108593f(c, "getService(DupCheckFeatureService::class.java)");
        C99788a aVar2 = (C99788a) aVar.mo85231a((C98598e) c, C99788a.class);
        if (str == null) {
            str = "";
        }
        return aVar2.mo139146g3(str, 10000 + ((long) i), str2, bArr);
    }

    public boolean Fp0(String str, long j, String str2, int i) {
        C13598b0 b0Var;
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(str3, "md5");
        C87412m.m108594g(str4, "savePath");
        C98597b.C60245a aVar = C98597b.f289091e;
        C7335d c = C86312j.m106911c(C99341a.class);
        C87412m.m108593f(c, "getService(DupCheckFeatureService::class.java)");
        ((C99788a) aVar.mo85231a((C98598e) c, C99788a.class)).getClass();
        SingleTable singleTable = C102668t1.f302953n;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        SelectSql build = C102668t1.f302953n.select((List<? extends ISqlColumn>) linkedList).where(C102668t1.f302955p.equal(str3).and(C102668t1.f302956q.equal((Number) Long.valueOf(j)))).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) new LinkedList()).build();
        C61941a.C61942a aVar2 = C61941a.f176074i;
        C66163a aVar3 = (C66163a) build.singleQuery(aVar2.mo86856a().getDB(), C66163a.class);
        boolean z = false;
        if (aVar3 == null) {
            b0Var = null;
        } else if (!C86013q1.m106450k(aVar3.getPath()) || C86013q1.m106451l(aVar3.getPath()) <= 0) {
            Log.m105924i("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + aVar3.mo142449o2() + ", but origin file deleted!!!");
            int execute = C102668t1.m135646l2(aVar3, false).execute(aVar2.mo86856a().getDB());
            Log.m105924i("MicroMsg.DupCheck.DupCheckStoragePLC", "remove the empty line, res:" + execute);
            C34740a.f93398a.mo59719a(2, j, aVar3.mo142447m2());
            b0Var = C13598b0.f38549a;
        } else if (aVar3.getPath().equals(str4)) {
            Log.m105928w("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + aVar3.mo142449o2() + ", but same path!!!");
            C34740a.f93398a.mo59719a(5, j, aVar3.mo142447m2());
            return true;
        } else {
            if (C86013q1.m106443d(aVar3.getPath(), str4, true) >= 0) {
                z = true;
            }
            if (z) {
                C34740a.f93398a.mo59719a(3, j, aVar3.mo142447m2());
            } else {
                C34740a.f93398a.mo59719a(4, j, aVar3.mo142447m2());
            }
            Log.m105924i("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + aVar3.mo142449o2() + ", copy link to " + str4 + ", result: " + z);
            return z;
        }
        if (b0Var != null) {
            return false;
        }
        C34740a.f93398a.mo59719a(1, j, (long) i);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p867wp.C102479b Xw0(java.lang.String r19, int r20, java.lang.String r21, long r22, byte[] r24) {
        /*
            r18 = this;
            r0 = r22
            i40.b$a r2 = i40.C98597b.f289091e
            java.lang.Class<l51.a> r3 = l51.C99341a.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            java.lang.String r4 = "getService(DupCheckFeatureService::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            i40.e r3 = (i40.C98598e) r3
            java.lang.Class<m51.a> r4 = m51.C99788a.class
            i40.b r2 = r2.mo85231a(r3, r4)
            m51.a r2 = (m51.C99788a) r2
            java.lang.String r2 = ""
            if (r19 != 0) goto L_0x001f
            r3 = r2
            goto L_0x0021
        L_0x001f:
            r3 = r19
        L_0x0021:
            if (r21 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = r21
        L_0x0026:
            wp.b r4 = new wp.b
            r4.<init>()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            java.lang.String r6 = "MicroMsg.DupCheck.DupCheckStoragePLC"
            if (r5 == 0) goto L_0x0134
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x003b
            goto L_0x0134
        L_0x003b:
            r5 = r20
            long r8 = (long) r5
            r10 = 0
            long r8 = r8 + r10
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r12 = 95
            r5.append(r12)
            r5.append(r8)
            r5.append(r12)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.sdk.storage.sql.SelectSql r12 = p749xh.C102668t1.m135647p2(r5)
            o51.a$a r13 = o51.C61941a.f176074i
            o51.a r14 = r13.mo86856a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r14.getDB()
            java.lang.Class<wp.a> r15 = p867wp.C66163a.class
            com.tencent.mm.sdk.storage.IAutoDBItem r12 = r12.singleQuery(r14, r15)
            wp.a r12 = (p867wp.C66163a) r12
            r14 = 32
            if (r12 == 0) goto L_0x00cf
            java.lang.String r16 = r12.getPath()
            boolean r16 = com.tencent.p014mm.vfs.C86013q1.m106450k(r16)
            r7 = 1
            if (r16 == 0) goto L_0x008c
            java.lang.String r15 = r12.getPath()
            boolean r15 = gy3.C87412m.m108589b(r15, r3)
            if (r15 != 0) goto L_0x008c
            r15 = 1
            goto L_0x008d
        L_0x008c:
            r15 = 0
        L_0x008d:
            if (r15 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            if (r12 == 0) goto L_0x00cf
            java.lang.String r15 = r12.getPath()
            long r15 = com.tencent.p014mm.vfs.C86013q1.m106443d(r15, r3, r7)
            int r17 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r17 < 0) goto L_0x00a1
            r15 = 1
            goto L_0x00a2
        L_0x00a1:
            r15 = 0
        L_0x00a2:
            r4.f301761b = r7
            r4.f301762c = r15
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "already hit dup check "
            r7.append(r10)
            r7.append(r5)
            r7.append(r14)
            java.lang.String r10 = r12.getPath()
            r7.append(r10)
            java.lang.String r10 = " copyResult:"
            r7.append(r10)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            rx3.b0 r15 = rx3.C13598b0.f38549a
            goto L_0x00d0
        L_0x00cf:
            r15 = 0
        L_0x00d0:
            if (r15 != 0) goto L_0x00d5
            r7 = 0
            r4.f301761b = r7
        L_0x00d5:
            wp.a r7 = new wp.a
            r7.<init>()
            r7.mo142453s2(r5)
            r7.mo142455t2(r3)
            r7.mo142450q2(r8)
            r7.setMd5(r2)
            r7.mo142456u2(r0)
            long r0 = eb0.C31543z5.m39453c()
            r7.mo142457v2(r0)
            r0 = r24
            r7.mo142451r2(r0)
            o51.a r0 = r13.mo86856a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.getDB()
            r1 = 0
            long r7 = r7.replaceToDB(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkPath fake "
            r0.append(r1)
            r0.append(r5)
            r0.append(r14)
            r0.append(r3)
            java.lang.String r1 = " replaceRet:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0130
            r0 = 0
            r4.f301760a = r0
            r4.f301763d = r7
            goto L_0x0159
        L_0x0130:
            r0 = -1
            r4.f301760a = r0
            goto L_0x0159
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "path["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "] or md5["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "] is empty"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            r0 = -1
            r4.f301760a = r0
        L_0x0159:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l51.C99341a.Xw0(java.lang.String, int, java.lang.String, long, byte[]):wp.b");
    }

    /* renamed from: as */
    public C102479b mo138751as(String str, int i, String str2, byte[] bArr) {
        C98597b.C60245a aVar = C98597b.f289091e;
        C7335d c = C86312j.m106911c(C99341a.class);
        C87412m.m108593f(c, "getService(DupCheckFeatureService::class.java)");
        C99788a aVar2 = (C99788a) aVar.mo85231a((C98598e) c, C99788a.class);
        if (str == null) {
            str = "";
        }
        aVar2.getClass();
        return aVar2.mo139146g3(str, 0 + ((long) i), str2, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0266  */
    /* renamed from: mP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p867wp.C102479b mo138752mP(java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, int r36, java.lang.String r37) {
        /*
            r31 = this;
            i40.b$a r0 = i40.C98597b.f289091e
            java.lang.Class<l51.a> r1 = l51.C99341a.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(DupCheckFeatureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            i40.e r1 = (i40.C98598e) r1
            java.lang.Class<m51.a> r2 = m51.C99788a.class
            i40.b r0 = r0.mo85231a(r1, r2)
            m51.a r0 = (m51.C99788a) r0
            java.lang.String r1 = ""
            if (r32 != 0) goto L_0x001d
            r8 = r1
            goto L_0x001f
        L_0x001d:
            r8 = r32
        L_0x001f:
            if (r33 != 0) goto L_0x0023
            r9 = r1
            goto L_0x0025
        L_0x0023:
            r9 = r33
        L_0x0025:
            if (r34 != 0) goto L_0x0029
            r10 = r1
            goto L_0x002b
        L_0x0029:
            r10 = r34
        L_0x002b:
            wp.b r11 = new wp.b
            r11.<init>()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            java.lang.String r12 = "MicroMsg.DupCheck.DupCheckStoragePLC"
            r13 = -1
            if (r1 == 0) goto L_0x026a
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r1 == 0) goto L_0x026a
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r1 != 0) goto L_0x0047
            goto L_0x026a
        L_0x0047:
            r1 = 6
            r0.mo139147i3(r1)
            r1 = r35
            long r1 = (long) r1
            r14 = 0
            long r6 = r1 + r14
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            r2 = 1
            if (r37 == 0) goto L_0x0067
            boolean r3 = z04.C112551y.m153811k(r37)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0064
            r3 = r37
            goto L_0x0065
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 != 0) goto L_0x006b
        L_0x0067:
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106456q(r8)
        L_0x006b:
            r14 = 0
            if (r3 == 0) goto L_0x0077
            boolean r15 = z04.C112551y.m153811k(r3)
            if (r15 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r15 = 0
            goto L_0x0078
        L_0x0077:
            r15 = 1
        L_0x0078:
            if (r15 == 0) goto L_0x007e
            r11.f301760a = r13
            goto L_0x0296
        L_0x007e:
            java.lang.String r15 = "fileMd5"
            gy3.C87412m.m108593f(r3, r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r3)
            r1 = 95
            r15.append(r1)
            r15.append(r6)
            r15.append(r1)
            r15.append(r4)
            java.lang.String r15 = r15.toString()
            com.tencent.mm.sdk.storage.sql.SelectSql r1 = p749xh.C102668t1.m135647p2(r15)
            o51.a$a r16 = o51.C61941a.f176074i
            o51.a r17 = r16.mo86856a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r17.getDB()
            java.lang.Class<wp.a> r2 = p867wp.C66163a.class
            com.tencent.mm.sdk.storage.IAutoDBItem r1 = r1.singleQuery(r13, r2)
            wp.a r1 = (p867wp.C66163a) r1
            r11.f301761b = r14
            java.lang.String r13 = " thumbPath:"
            java.lang.String r2 = " remuxingPath:"
            if (r1 == 0) goto L_0x01dd
            byte[] r17 = r1.mo142448n2()
            if (r17 == 0) goto L_0x00c4
            r17 = 1
            goto L_0x00c6
        L_0x00c4:
            r17 = 0
        L_0x00c6:
            if (r17 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            if (r1 == 0) goto L_0x01dd
            te3.jr4 r14 = new te3.jr4
            r14.<init>()
            byte[] r1 = r1.mo142448n2()
            pe3.a r1 = r14.parseFrom(r1)
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.VideoDupCheckExtData"
            gy3.C87412m.m108592e(r1, r14)
            r14 = r1
            te3.jr4 r14 = (te3.jr4) r14
            java.lang.String r1 = r14.f136281e
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x01dd
            java.lang.String r1 = r14.f136282f
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x01dd
            r37 = r2
            r1 = 7
            r0.mo139147i3(r1)
            java.lang.String r1 = r14.f136282f
            if (r1 == 0) goto L_0x0154
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 == 0) goto L_0x0144
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            r2 = 1
            long r20 = com.tencent.p014mm.vfs.C86013q1.m106443d(r1, r9, r2)
            r22 = 0
            int r1 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r1 < 0) goto L_0x0115
            r17 = 1
            goto L_0x0117
        L_0x0115:
            r17 = 0
        L_0x0117:
            if (r17 == 0) goto L_0x0133
            r20 = 8
            r22 = 19
            r1 = r0
            r26 = r37
            r25 = r3
            r24 = r9
            r9 = 1
            r2 = r20
            r27 = r4
            r4 = r22
            r29 = r6
            r6 = r18
            r1.mo139148j3(r2, r4, r6)
            goto L_0x0151
        L_0x0133:
            r26 = r37
            r25 = r3
            r27 = r4
            r29 = r6
            r24 = r9
            r9 = 1
            r1 = 9
            r0.mo139147i3(r1)
            goto L_0x0151
        L_0x0144:
            r26 = r37
            r25 = r3
            r27 = r4
            r29 = r6
            r24 = r9
            r9 = 1
            r17 = 0
        L_0x0151:
            r6 = r17
            goto L_0x0160
        L_0x0154:
            r26 = r37
            r25 = r3
            r27 = r4
            r29 = r6
            r24 = r9
            r9 = 1
            r6 = 0
        L_0x0160:
            java.lang.String r1 = r14.f136281e
            if (r1 == 0) goto L_0x0199
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 == 0) goto L_0x0193
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106443d(r1, r10, r9)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x017b
            r17 = 1
            goto L_0x017d
        L_0x017b:
            r17 = 0
        L_0x017d:
            if (r17 == 0) goto L_0x018c
            r2 = 10
            r4 = 20
            r1 = r0
            r0 = r6
            r6 = r18
            r1.mo139148j3(r2, r4, r6)
            r1 = r0
            goto L_0x0196
        L_0x018c:
            r1 = r6
            r2 = 11
            r0.mo139147i3(r2)
            goto L_0x0196
        L_0x0193:
            r1 = r6
            r17 = 0
        L_0x0196:
            r0 = r17
            goto L_0x019b
        L_0x0199:
            r1 = r6
            r0 = 0
        L_0x019b:
            r11.f301761b = r9
            if (r0 == 0) goto L_0x01a3
            if (r1 == 0) goto L_0x01a3
            r2 = 1
            goto L_0x01a4
        L_0x01a3:
            r2 = 0
        L_0x01a4:
            r11.f301762c = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "already hit dup check "
            r2.append(r3)
            r2.append(r15)
            r2.append(r13)
            java.lang.String r3 = r14.f136281e
            r2.append(r3)
            r3 = r26
            r2.append(r3)
            java.lang.String r4 = r14.f136282f
            r2.append(r4)
            java.lang.String r4 = ", copyThumbResult:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = ", copyRemuxingResult:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x01e6
        L_0x01dd:
            r25 = r3
            r27 = r4
            r29 = r6
            r24 = r9
            r3 = r2
        L_0x01e6:
            wp.a r0 = new wp.a
            r0.<init>()
            r0.mo142453s2(r15)
            r0.mo142455t2(r8)
            r1 = r29
            r0.mo142450q2(r1)
            r1 = r25
            r0.setMd5(r1)
            r1 = r27
            r0.mo142456u2(r1)
            long r1 = eb0.C31543z5.m39453c()
            r0.mo142457v2(r1)
            te3.jr4 r1 = new te3.jr4
            r1.<init>()
            r2 = r24
            r1.f136282f = r2
            r1.f136281e = r10
            r4 = r36
            r1.f136280d = r4
            byte[] r1 = r1.toByteArray()
            r0.mo142451r2(r1)
            o51.a r1 = r16.mo86856a()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.getDB()
            r4 = 0
            long r0 = r0.replaceToDB(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkPath "
            r4.append(r5)
            r4.append(r15)
            java.lang.String r5 = " importPath:"
            r4.append(r5)
            r4.append(r8)
            r4.append(r3)
            r4.append(r2)
            r4.append(r13)
            r4.append(r10)
            java.lang.String r2 = " replaceRet:"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0266
            r2 = 0
            r11.f301760a = r2
            r11.f301763d = r0
            goto L_0x0296
        L_0x0266:
            r0 = -1
            r11.f301760a = r0
            goto L_0x0296
        L_0x026a:
            r2 = r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "path["
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "] is empty"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            r0 = -1
            r11.f301760a = r0
        L_0x0296:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l51.C99341a.mo138752mP(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String):wp.b");
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(C99788a.class);
    }
}
