package eb0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.List;
import qe0.C47806g;

/* renamed from: eb0.l0 */
public class C75589l0 {
    /* renamed from: a */
    public static boolean m90735a(String str) {
        ArrayList<String> stringsToList;
        if (Util.isNullOrNil(str) || (stringsToList = Util.stringsToList(str.split(","))) == null) {
            return false;
        }
        for (String L5 : stringsToList) {
            if (!C72996z1.m85809L5(L5)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m90736b(C72996z1 z1Var) {
        boolean z = false;
        if (z1Var != null && C72996z1.m85843n5(z1Var.getUsername()) && !Util.isNullOrNil(z1Var.mo73980x2()) && "3552365301".equals(z1Var.mo73980x2())) {
            z = true;
        }
        if (!z) {
            return z1Var.mo62898f();
        }
        String a = C47806g.m53116a(z1Var);
        if (a == null) {
            return z1Var.mo62898f();
        }
        return z1Var.mo62898f() + a;
    }

    /* renamed from: c */
    public static void m90737c(String str, List<String> list, String str2, boolean z, String str3) {
        m90738d(str, list, str2, z, str3, 2);
    }

    /* renamed from: d */
    public static void m90738d(String str, List<String> list, String str2, boolean z, String str3, int i) {
        Class cls = C75700k0.class;
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108749c3(str);
        f4Var.setType(10000);
        f4Var.mo108733M2(System.currentTimeMillis());
        f4Var.mo100991d(4);
        f4Var.mo108740T2(i);
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null) {
            String s = C75592q0.m90789s();
            String string = MMApplicationContext.getContext().getString(C0966R.string.b68);
            for (String next : list) {
                if (!next.equals(s)) {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(next);
                    if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                        if (z) {
                            stringBuffer.append("<a href=\"" + str3 + next + "\">" + next + "</a>" + string);
                        } else {
                            stringBuffer.append(next + string);
                        }
                    } else if (z) {
                        stringBuffer.append("<a href=\"" + str3 + next + "\">" + m90736b(z1Var) + "</a>" + string);
                    } else {
                        stringBuffer.append(m90736b(z1Var) + string);
                    }
                }
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(string));
            }
        }
        f4Var.mo108732L2(str2.replace("%s", stringBuffer));
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01bb  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Boolean> m90739e(java.util.List<java.lang.String> r21) {
        /*
            r0 = 0
            if (r21 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r21.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r21.iterator()
        L_0x0011:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x020f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            r6 = 0
            if (r5 != 0) goto L_0x002b
            r16 = r2
            r2 = r0
            goto L_0x0203
        L_0x002b:
            k40.a r5 = f40.C86709a0.m107533q(r4)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.v3 r5 = r5.mo96094Ku()
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            com.tencent.mm.storage.h2 r5 = r5.mo69771j(r3)
            java.lang.String r7 = "MicroMsg.ChatroomLogic"
            r8 = 0
            r10 = 1
            if (r5 == 0) goto L_0x0092
            long r11 = r5.mo108833z2()
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x006c
            k40.a r11 = f40.C86709a0.m107533q(r4)
            f62.k0 r11 = (f62.C75700k0) r11
            g62.l r11 = r11.mo96095LE()
            long r12 = r5.mo108833z2()
            com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11
            com.tencent.mm.storage.f4 r11 = r11.v10(r3, r12)
            long r11 = r11.getMsgId()
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x006c
            long r11 = r5.mo108833z2()
            r13 = 1
            goto L_0x006e
        L_0x006c:
            r11 = r8
            r13 = 0
        L_0x006e:
            long r14 = r5.mo108827t2()
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 == 0) goto L_0x0094
            r5.mo108798S2(r8)
            r5.mo108804Z2(r8)
            k40.a r14 = f40.C86709a0.m107533q(r4)
            f62.k0 r14 = (f62.C75700k0) r14
            com.tencent.mm.storage.v3 r14 = r14.mo96094Ku()
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14
            r14.mo69773k0(r5, r3)
            java.lang.String r5 = "summerbadcr deleteConv chatroomId update conv"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            goto L_0x0094
        L_0x0092:
            r11 = r8
            r13 = 0
        L_0x0094:
            r5 = 2
            if (r13 != 0) goto L_0x01be
            k40.a r14 = f40.C86709a0.m107533q(r4)
            f62.k0 r14 = (f62.C75700k0) r14
            g62.l r14 = r14.mo96095LE()
            com.tencent.mm.storage.g4 r14 = (com.tencent.p014mm.storage.C72972g4) r14
            r14.getClass()
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r15 == 0) goto L_0x00ad
            goto L_0x00fc
        L_0x00ad:
            java.lang.Object[] r15 = new java.lang.Object[r5]
            r15[r6] = r3
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            r15[r10] = r16
            java.lang.String r0 = "MicroMsg.MsgInfoStorage"
            java.lang.String r5 = "summerbadcr getLastFaultMsg talker[%s], onlyCache[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r15)
            sg.g<java.lang.String, java.lang.Long> r5 = r14.f212774o
            q90.d r5 = (q90.C101062d) r5
            java.lang.Object r5 = r5.get(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0102
            long r17 = r5.longValue()
            int r15 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x0102
            java.lang.Object[] r15 = new java.lang.Object[r10]
            long r17 = r5.longValue()
            java.lang.Long r17 = java.lang.Long.valueOf(r17)
            r15[r6] = r17
            java.lang.String r8 = "summerbadcr getLastFaultMsg hit cache msgid[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r15)
            long r8 = r5.longValue()
            com.tencent.mm.storage.f4 r0 = r14.b00(r8)
            int r5 = r0.mo108762o2()
            r5 = r5 & r10
            if (r5 == 0) goto L_0x00f5
            r16 = r2
            goto L_0x00ff
        L_0x00f5:
            sg.g<java.lang.String, java.lang.Long> r0 = r14.f212774o
            q90.d r0 = (q90.C101062d) r0
            r0.remove(r3)
        L_0x00fc:
            r16 = r2
            r0 = 0
        L_0x00ff:
            r2 = 0
            goto L_0x01ad
        L_0x0102:
            java.lang.String r5 = "summerbadcr getLastFaultMsg not hit cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.storage.f4 r5 = new com.tencent.mm.storage.f4
            r5.<init>()
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = "SELECT * FROM "
            r15.append(r10)
            java.lang.String r10 = r14.hy0(r3)
            r15.append(r10)
            java.lang.String r10 = " WHERE"
            r15.append(r10)
            java.lang.String r10 = r14.iy0(r3)
            r15.append(r10)
            java.lang.String r10 = "AND "
            r15.append(r10)
            java.lang.String r10 = "flag"
            r15.append(r10)
            java.lang.String r10 = " %2 = 1  ORDER BY "
            r15.append(r10)
            java.lang.String r10 = "msgSeq"
            r15.append(r10)
            java.lang.String r10 = " DESC LIMIT 1 "
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            zh3.f r15 = r14.f212775p
            r16 = r2
            r2 = 0
            r6 = 2
            android.database.Cursor r10 = r15.rawQuery(r10, r2, r6)
            java.lang.Object[] r15 = new java.lang.Object[r6]
            long r19 = java.lang.System.currentTimeMillis()
            long r19 = r19 - r8
            java.lang.Long r6 = java.lang.Long.valueOf(r19)
            r8 = 0
            r15[r8] = r6
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            long r8 = r6.getId()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r8 = 1
            r15[r8] = r6
            java.lang.String r6 = "summerbadcr getLastFaultMsg take %dms, tid[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r6, r15)
            if (r10 != 0) goto L_0x0191
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "summerbadcr getLastFaultMsg failed "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            goto L_0x01ac
        L_0x0191:
            boolean r0 = r10.moveToFirst()
            if (r0 == 0) goto L_0x019a
            r5.convertFrom(r10)
        L_0x019a:
            r10.close()
            sg.g<java.lang.String, java.lang.Long> r0 = r14.f212774o
            long r8 = r5.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            q90.d r0 = (q90.C101062d) r0
            r0.mo139557c(r3, r6)
        L_0x01ac:
            r0 = r5
        L_0x01ad:
            if (r0 == 0) goto L_0x01bb
            long r5 = r0.getMsgId()
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01c1
            r13 = 1
            goto L_0x01c1
        L_0x01bb:
            r8 = 0
            goto L_0x01c1
        L_0x01be:
            r16 = r2
            r2 = r0
        L_0x01c1:
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01d5
            k40.a r0 = f40.C86709a0.m107533q(r4)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            long r11 = r0.Kx0(r3)
        L_0x01d5:
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01e8
            k40.a r0 = f40.C86709a0.m107533q(r4)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.f r0 = r0.mo96093DX()
            com.tencent.mm.storage.n2 r0 = (com.tencent.p014mm.storage.C72986n2) r0
            r0.mo101183bD(r3, r11)
        L_0x01e8:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4 = 0
            r0[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            r4 = 1
            r0[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r4 = 2
            r0[r4] = r3
            java.lang.String r3 = "summerbadcr deleteConv chatroomId[%s], needClear[%b], lastMsgSeq[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r0)
            r6 = r13
        L_0x0203:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.add(r0)
            r0 = r2
            r2 = r16
            goto L_0x0011
        L_0x020f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75589l0.m90739e(java.util.List):java.util.List");
    }
}
