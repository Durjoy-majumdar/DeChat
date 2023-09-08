package jj2;

import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;

/* renamed from: jj2.b */
public final class C33585b {

    /* renamed from: a */
    public LinkedList<String> f90911a = new LinkedList<>();

    /* renamed from: b */
    public LinkedList<C72963f4> f90912b = new LinkedList<>();

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m40131a(jj2.C33585b r13, java.lang.String r14, long r15, long r17, int r19, boolean r20, int r21, java.lang.Object r22) {
        /*
            r0 = r21 & 16
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x0009
        L_0x0007:
            r0 = r20
        L_0x0009:
            r13.getClass()
            java.lang.String r2 = "convName"
            r11 = r14
            gy3.C87412m.m108594g(r14, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r12 = 0
        L_0x0018:
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r19
            r10 = r12
            android.database.Cursor r3 = r3.fq0(r4, r5, r7, r9, r10)
            java.lang.String r4 = "service(IMessengerStorag…, limit, offset\n        )"
            gy3.C87412m.m108593f(r3, r4)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
        L_0x003c:
            boolean r5 = r3.moveToNext()
            r6 = 1
            if (r5 == 0) goto L_0x0081
            com.tencent.mm.storage.f4 r5 = new com.tencent.mm.storage.f4
            r5.<init>()
            r5.convertFrom(r3)
            if (r0 == 0) goto L_0x0054
            int r7 = r5.getType()
            if (r7 == r6) goto L_0x0054
            goto L_0x003c
        L_0x0054:
            int r6 = r5.getType()
            r7 = 922746929(0x37000031, float:7.629439E-6)
            if (r6 != r7) goto L_0x0076
            java.lang.Class<vd2.d> r6 = vd2.C78384d.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            vd2.d r6 = (vd2.C78384d) r6
            long r7 = r5.getMsgId()
            java.util.List r6 = r6.mo108123RC(r7)
            if (r6 == 0) goto L_0x0076
            int r7 = r6.size()
            if (r7 <= 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007d
            r4.add(r5)
            goto L_0x003c
        L_0x007d:
            r4.addAll(r6)
            goto L_0x003c
        L_0x0081:
            r3.close()
            int r3 = r4.size()
            int r12 = r12 + r3
            r2.addAll(r4)
            int r3 = r4.size()
            if (r3 == 0) goto L_0x009a
            int r3 = r4.size()
            r4 = r19
            if (r3 >= r4) goto L_0x0018
        L_0x009a:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0[r1] = r3
            java.lang.String r1 = "DBTest"
            java.lang.String r3 = "offset:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jj2.C33585b.m40131a(jj2.b, java.lang.String, long, long, int, boolean, int, java.lang.Object):java.util.ArrayList");
    }
}
