package oa1;

import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import junit.framework.Assert;
import kf3.C61081c;
import p823sg.C101611g;
import p823sg.C101614i;

/* renamed from: oa1.d */
public class C117731d {

    /* renamed from: c */
    public static C117731d f352061c;

    /* renamed from: d */
    public static final C101611g<Integer, Long> f352062d = new C101614i(50);

    /* renamed from: a */
    public C101611g<Integer, C47346c> f352063a = new C101614i(50);

    /* renamed from: b */
    public String f352064b = null;

    /* renamed from: c */
    public static C117731d m166007c() {
        if (f352061c == null) {
            f352061c = new C117731d();
        }
        return f352061c;
    }

    /* renamed from: a */
    public int mo182440a(C61081c cVar) {
        if (BuildInfo.DEBUG && Util.isNullOrNil(cVar.mo54535i())) {
            Assert.fail("Repairer Need Set ExptKey " + cVar.mo54531a());
        }
        return mo182443e(cVar.mo54535i(), C79758p.f233760a.mo109883f(cVar), true, true);
    }

    /* renamed from: b */
    public String mo182441b(C61081c cVar) {
        if (BuildInfo.DEBUG && Util.isNullOrNil(cVar.mo54535i())) {
            Assert.fail("Repairer Need Set ExptKey " + cVar.mo54531a());
        }
        return mo182444f(cVar.mo54535i(), C79758p.f233760a.mo109885h(cVar), true, true);
    }

    /* renamed from: d */
    public MultiProcessMMKV mo182442d() {
        int h = mo182446h();
        if (h == 0) {
            return null;
        }
        String str = h + "_" + "WxExptmmkv";
        if (!Util.isEqual(this.f352064b, str)) {
            Log.m105925i("MicroMsg.ExptManager", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f352064b, str);
            this.f352064b = str;
        }
        return MultiProcessMMKV.getMMKV(this.f352064b);
    }

    /* renamed from: e */
    public int mo182443e(String str, int i, boolean z, boolean z2) {
        String f = mo182444f(str, "", z, z2);
        return Util.isNullOrNil(f) ? i : Util.getInt(f, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if (((r14 == 4 || r14 == 10 || (r14 != 2 && r14 != 130 && (r14 & 2) == 0)) ? false : true) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo182444f(java.lang.String r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            com.tencent.mm.pointers.PString r3 = new com.tencent.mm.pointers.PString
            r3.<init>()
            oa1.b r4 = oa1.C61983b.m72724e()
            int r4 = r4.mo86867b(r1, r2, r3)
            if (r4 <= 0) goto L_0x0018
            java.lang.String r1 = r3.value
            return r1
        L_0x0018:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r20.mo182442d()
            r6 = -1
            if (r5 != 0) goto L_0x0024
            goto L_0x0028
        L_0x0024:
            int r6 = r5.getInt(r1, r6)
        L_0x0028:
            r5 = 3
            java.lang.String r8 = "MicroMsg.ExptManager"
            java.lang.String r9 = ""
            r10 = 0
            r11 = 4
            r12 = 2
            r13 = 1
            if (r6 <= 0) goto L_0x014b
            if (r6 > 0) goto L_0x0036
            goto L_0x008c
        L_0x0036:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r14 = r20.mo182442d()
            if (r14 != 0) goto L_0x003d
            goto L_0x008c
        L_0x003d:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            r15.append(r9)
            java.lang.String r15 = r15.toString()
            java.lang.String r14 = r14.getString(r15, r9)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 == 0) goto L_0x0057
            goto L_0x008c
        L_0x0057:
            sg.g<java.lang.Integer, oa1.c> r15 = r0.f352063a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r15.get(r7)
            oa1.c r7 = (oa1.C47346c) r7
            if (r7 == 0) goto L_0x0077
            java.lang.String r15 = r7.field_exptContent
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r15)
            if (r15 == 0) goto L_0x006e
            goto L_0x008d
        L_0x006e:
            sg.g<java.lang.Integer, oa1.c> r7 = r0.f352063a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            r7.remove(r15)
        L_0x0077:
            oa1.c r7 = new oa1.c
            r7.<init>()
            boolean r14 = r7.mo72384l2(r14)
            if (r14 == 0) goto L_0x008c
            sg.g<java.lang.Integer, oa1.c> r14 = r0.f352063a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.put(r6, r7)
            goto L_0x008d
        L_0x008c:
            r7 = 0
        L_0x008d:
            if (r7 == 0) goto L_0x014b
            boolean r6 = r7.mo72388p2()
            if (r6 == 0) goto L_0x014b
            java.util.HashMap r6 = r7.mo72390r2()
            if (r6 == 0) goto L_0x014b
            boolean r14 = r6.isEmpty()
            if (r14 != 0) goto L_0x014b
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            if (r23 != 0) goto L_0x00c1
            int r14 = r7.field_exptType
            if (r14 == r11) goto L_0x00be
            r15 = 10
            if (r14 != r15) goto L_0x00b2
            goto L_0x00be
        L_0x00b2:
            if (r14 == r12) goto L_0x00bc
            r15 = 130(0x82, float:1.82E-43)
            if (r14 != r15) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            r14 = r14 & r12
            if (r14 == 0) goto L_0x00be
        L_0x00bc:
            r14 = 1
            goto L_0x00bf
        L_0x00be:
            r14 = 0
        L_0x00bf:
            if (r14 == 0) goto L_0x014c
        L_0x00c1:
            r14 = 8
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r15 = r7.field_exptId
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r10] = r15
            int r15 = r7.field_groupId
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r13] = r15
            int r15 = r7.field_exptSeq
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r12] = r15
            long r12 = r7.field_startTime
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r14[r5] = r12
            long r12 = r7.field_endTime
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r14[r11] = r12
            r12 = 5
            r14[r12] = r1
            r12 = 6
            r14[r12] = r6
            long r12 = r7.field_bucketSrc
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r12 = 7
            r14[r12] = r7
            java.lang.String r7 = "%d,%d,%d,%d,%d,%s,%s,%d"
            java.lang.String r7 = java.lang.String.format(r7, r14)
            int r12 = r7.hashCode()
            sg.g<java.lang.Integer, java.lang.Long> r13 = f352062d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Object r14 = r13.get(r14)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x0119
            long r16 = r14.longValue()
            goto L_0x011b
        L_0x0119:
            r16 = 0
        L_0x011b:
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r16)
            r18 = 300000(0x493e0, double:1.482197E-318)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L_0x0131
            r14 = 1
            java.lang.Object[] r12 = new java.lang.Object[r14]
            r12[r10] = r7
            java.lang.String r7 = "clock report [%s] less than 5 min, don't report"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r7, r12)
            goto L_0x014c
        L_0x0131:
            kj2.d r14 = kj2.C117407d.INSTANCE
            r15 = 15452(0x3c5c, float:2.1653E-41)
            boolean r7 = r14.mo160129f(r15, r7)
            if (r7 == 0) goto L_0x014c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r13.put(r7, r12)
            goto L_0x014c
        L_0x014b:
            r6 = r2
        L_0x014c:
            if (r6 != 0) goto L_0x014f
            r6 = r2
        L_0x014f:
            if (r24 == 0) goto L_0x0180
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r13 = r20.hashCode()
            r12.append(r13)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r7[r10] = r9
            r9 = 1
            r7[r9] = r6
            r9 = 2
            r7[r9] = r1
            r7[r5] = r2
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7[r11] = r1
            java.lang.String r1 = "%s get mulit expt result[%s] key[%s] def[%s] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r7)
        L_0x0180:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oa1.C117731d.mo182444f(java.lang.String, java.lang.String, boolean, boolean):java.lang.String");
    }

    /* renamed from: g */
    public boolean mo182445g(String str, boolean z, boolean z2) {
        String f = mo182444f(str, "", z2, true);
        return Util.isNullOrNil(f) ? z : Util.getInt(f, z ? 1 : 0) != 0;
    }

    /* renamed from: h */
    public int mo182446h() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WxExptConfig");
        int i = mmkv != null ? mmkv.getInt("expt_uin", 0) : 0;
        return i != 0 ? i : Integer.valueOf(MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0)).intValue();
    }
}
