package dv0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import pv0.C100968x;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C77926f9;

/* renamed from: dv0.j */
public class C75459j {
    /* renamed from: a */
    public static C77926f9 m90495a(C72963f4 f4Var, boolean z, String str, PLong pLong, LinkedList<C100968x> linkedList, boolean z2, boolean z3) {
        C72963f4 f4Var2 = f4Var;
        String str2 = str;
        PLong pLong2 = pLong;
        if (f4Var.mo108774y2() == 0) {
            Log.m105921e("MicroMsg.BackupMsgLogic", "packedMsg msgSvrId is 0, talker[%s], type[%d]", f4Var.mo108768t(), Integer.valueOf(f4Var.getType()));
            return null;
        }
        int i = 4;
        if ((f4Var.getType() == 10002 || f4Var.getType() == 268445458) && (f4Var2.f230723F & 4) == 4) {
            f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.bb8));
            f4Var.setType(10000);
        }
        if (f4Var.getType() == 268445456) {
            f4Var.mo108732L2(f4Var2.f230762x0);
            f4Var.setType(10000);
        }
        int c = C72695v.m85061c(f4Var.getType());
        if (!m90497c(c)) {
            Log.m105921e("MicroMsg.BackupMsgLogic", "packedMsg type is not allowed, talker[%s], type[%d]", f4Var.mo108768t(), Integer.valueOf(f4Var.getType()));
            return null;
        }
        C77926f9 f9Var = new C77926f9();
        f9Var.f227348v = f4Var.mo108774y2();
        if (f4Var.mo108769t2() == 1) {
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = str2;
            rv32.f141176e = true;
            f9Var.f227335f = rv32;
            C51163rv3 rv33 = new C51163rv3();
            rv33.f141175d = f4Var.mo108768t();
            rv33.f141176e = true;
            f9Var.f227336g = rv33;
            f9Var.f227338i = 2;
        } else {
            C51163rv3 rv34 = new C51163rv3();
            rv34.f141175d = f4Var.mo108768t();
            rv34.f141176e = true;
            f9Var.f227335f = rv34;
            C51163rv3 rv35 = new C51163rv3();
            rv35.f141175d = str2;
            rv35.f141176e = true;
            f9Var.f227336g = rv35;
            if (z2) {
                i = 3;
            }
            f9Var.f227338i = i;
        }
        f9Var.f227345s = new C51018qv3();
        f9Var.f227346t = 0;
        f9Var.f227347u = 0;
        f9Var.f227340n = "";
        f9Var.f227333d = c;
        f9Var.f227339j = (int) (f4Var.getCreateTime() / 1000);
        f9Var.f227350x = f4Var.getCreateTime();
        f9Var.f227349w = (int) f4Var.mo108772w2();
        f9Var.f227351y = f4Var.mo108762o2();
        C51163rv3 rv36 = new C51163rv3();
        rv36.mo73357f(Util.nullAs(f4Var.getContent(), ""));
        f9Var.f227337h = rv36;
        C75460n c2 = C97546e.m125691d().mo136817c(C72695v.m85061c(f4Var.getType()));
        if (c2 == null) {
            Log.m105919d("MicroMsg.BackupMsgLogic", "packedMsg unknow type[%d]", Integer.valueOf(f4Var.getType()));
            return null;
        }
        int b = c2.mo105807b(f9Var, z, f4Var, str, linkedList, z3);
        if (b < 0) {
            return null;
        }
        pLong2.value = pLong2.value + ((long) b) + 60;
        return f9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.storage.C72963f4 m90496b(te3.C77926f9 r19, java.util.HashMap<java.lang.String, java.lang.Integer> r20, java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> r21, android.util.Pair<com.tencent.p014mm.pointers.PLong, com.tencent.p014mm.pointers.PLong> r22, java.lang.String r23, com.tencent.p014mm.pointers.PString r24, com.tencent.p014mm.pointers.PBool r25) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            boolean r6 = r5.value
            r7 = 0
            if (r6 == 0) goto L_0x0012
            return r7
        L_0x0012:
            te3.rv3 r6 = r0.f227335f
            java.lang.String r6 = r6.f141175d
            te3.rv3 r8 = r0.f227336g
            java.lang.String r8 = r8.f141175d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r10 = 2
            java.lang.String r11 = "MicroMsg.BackupMsgLogic"
            r12 = 0
            r13 = 1
            if (r9 != 0) goto L_0x01b7
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x002d
            goto L_0x01b7
        L_0x002d:
            boolean r9 = r3.equals(r6)
            if (r9 != 0) goto L_0x0052
            hv0.e r9 = hv0.C98544e.m128035f()
            hv0.c r9 = r9.mo137901e()
            int r14 = r9.f288980o
            if (r14 == 0) goto L_0x004c
            g62.p r9 = r9.f288972g
            com.tencent.mm.storage.s4 r9 = (com.tencent.p014mm.storage.C44667s4) r9
            boolean r9 = r9.mo69822qq(r6)
            if (r9 == 0) goto L_0x004a
            goto L_0x0052
        L_0x004a:
            r9 = 0
            goto L_0x0053
        L_0x004c:
            eb0.b r0 = new eb0.b
            r0.<init>()
            throw r0
        L_0x0052:
            r9 = 1
        L_0x0053:
            if (r4 == 0) goto L_0x005d
            java.lang.String r14 = r4.value
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x009f
        L_0x005d:
            if (r4 != 0) goto L_0x0064
            com.tencent.mm.pointers.PString r4 = new com.tencent.mm.pointers.PString
            r4.<init>()
        L_0x0064:
            if (r9 == 0) goto L_0x0068
            r14 = r8
            goto L_0x0069
        L_0x0068:
            r14 = r6
        L_0x0069:
            r4.value = r14
            hv0.e r14 = hv0.C98544e.m128035f()
            hv0.c r14 = r14.mo137901e()
            int r15 = r14.f288980o
            if (r15 == 0) goto L_0x01b1
            com.tencent.mm.storage.u3 r14 = r14.f288967b
            java.lang.String r15 = r4.value
            com.tencent.mm.storage.z1 r14 = r14.get(r15)
            java.util.List r15 = yu0.C102913k.m136055t()
            java.lang.String r7 = r4.value
            boolean r7 = r15.contains(r7)
            if (r7 != 0) goto L_0x0196
            if (r14 == 0) goto L_0x009f
            java.lang.String r7 = r14.getUsername()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x009f
            boolean r7 = r14.mo62916m3()
            if (r7 == 0) goto L_0x009f
            goto L_0x0196
        L_0x009f:
            java.lang.String r4 = r4.value
            long r14 = r0.f227348v
            r16 = 0
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x00b0
            int r5 = r0.f227341o
            if (r5 == 0) goto L_0x00b0
            long r14 = (long) r5
            r0.f227348v = r14
        L_0x00b0:
            long r14 = r0.f227348v
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x018e
            hv0.e r5 = hv0.C98544e.m128035f()
            hv0.c r5 = r5.mo137901e()
            g62.l r5 = r5.mo137897e()
            long r14 = r0.f227348v
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.h30(r4, r14)
            long r14 = r5.getMsgId()
            r7 = 3
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x00e9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = r0.f227333d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r12] = r0
            r1[r13] = r6
            r1[r10] = r8
            java.lang.String r0 = "recoverMsg msg exist, type[%d], from[%s], to[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
            r0 = 0
            return r0
        L_0x00e9:
            java.lang.Object[] r14 = new java.lang.Object[r7]
            int r15 = r0.f227333d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r12] = r15
            r14[r13] = r6
            r14[r10] = r8
            java.lang.String r6 = "recoverMsg, type[%d], from[%s], to[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r14)
            long r14 = r0.f227348v
            r5.mo108745Y2(r14)
            int r6 = r0.f227349w
            long r14 = (long) r6
            r5.mo108744X2(r14)
            long r14 = r0.f227350x
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x010f
            goto L_0x0116
        L_0x010f:
            int r6 = r0.f227339j
            long r14 = (long) r6
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r16
        L_0x0116:
            java.lang.Object r6 = r2.first
            com.tencent.mm.pointers.PLong r6 = (com.tencent.p014mm.pointers.PLong) r6
            long r7 = r6.value
            int r10 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0129
            r6.value = r14
            java.lang.Object r2 = r2.second
            com.tencent.mm.pointers.PLong r2 = (com.tencent.p014mm.pointers.PLong) r2
            r2.value = r14
            goto L_0x0134
        L_0x0129:
            java.lang.Object r2 = r2.second
            com.tencent.mm.pointers.PLong r2 = (com.tencent.p014mm.pointers.PLong) r2
            long r6 = r2.value
            r14 = 1
            long r14 = r14 + r6
            r2.value = r14
        L_0x0134:
            r5.mo108733M2(r14)
            int r2 = r0.f227351y
            r5.mo108735O2(r2)
            int r2 = r0.f227333d
            r5.setType(r2)
            r5.mo108740T2(r9)
            r5.mo108749c3(r4)
            if (r9 == 0) goto L_0x014c
            int r2 = r0.f227338i
            goto L_0x014d
        L_0x014c:
            r2 = 4
        L_0x014d:
            r5.mo100991d(r2)
            java.lang.Object r2 = r1.get(r4)
            if (r2 != 0) goto L_0x015d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1.put(r4, r2)
        L_0x015d:
            if (r9 != 0) goto L_0x0176
            int r2 = r0.f227338i
            r6 = 3
            if (r2 != r6) goto L_0x0176
            java.lang.Object r2 = r1.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r2, (int) r12)
            int r2 = r2 + r13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r4, r2)
        L_0x0176:
            dv0.e r1 = dv0.C97546e.m125691d()
            int r2 = r0.f227333d
            dv0.n r1 = r1.mo136817c(r2)
            if (r1 != 0) goto L_0x018a
            java.lang.String r0 = "recoverMsg unknown type"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r0 = 0
            return r0
        L_0x018a:
            r1.mo105806a(r3, r0, r5)
            return r5
        L_0x018e:
            r0 = 0
            java.lang.String r1 = "recoverMsg drop the item server id < 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)
            return r0
        L_0x0196:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "recoverMsg hit the blockList: "
            r1.append(r2)
            java.lang.String r2 = r4.value
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)
            r5.value = r13
            return r0
        L_0x01b1:
            eb0.b r0 = new eb0.b
            r0.<init>()
            throw r0
        L_0x01b7:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "null"
            if (r6 != 0) goto L_0x01be
            r6 = r1
        L_0x01be:
            r0[r12] = r6
            if (r8 != 0) goto L_0x01c3
            r8 = r1
        L_0x01c3:
            r0[r13] = r8
            java.lang.String r1 = "recoverMsg userName null, fromUserName[%s], toUserName[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.C75459j.m90496b(te3.f9, java.util.HashMap, java.util.HashMap, android.util.Pair, java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PBool):com.tencent.mm.storage.f4");
    }

    /* renamed from: c */
    public static boolean m90497c(int i) {
        return i == 1 || i == 3 || i == 34 || i == 42 || i == 66 || i == 43 || i == 44 || i == 47 || i == 48 || i == 49 || i == 62 || i == 10000 || i == 838860849;
    }
}
