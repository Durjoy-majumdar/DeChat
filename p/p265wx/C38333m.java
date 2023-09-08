package p265wx;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import p274xx.C66446g;

@C86522b
/* renamed from: wx.m */
public final class C38333m extends C86301e implements C66446g {

    /* renamed from: e */
    public long f101183e;

    /* renamed from: KB */
    public boolean mo61606KB() {
        return mo61610jK() || e50();
    }

    /* renamed from: Td */
    public boolean mo61607Td() {
        return (C75592q0.m90779i() & 128) != 128;
    }

    public boolean e50() {
        return (C75592q0.m90779i() & 32) != 32;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61609f(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            long r1 = eb0.C75592q0.m90779i()
            r3 = 1
            long r1 = r1 & r3
            r5 = 0
            r6 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r13 = 32
            r3 = 8192(0x2000, double:4.0474E-320)
            r7 = 8
            r9 = 2
            java.lang.String r2 = "MicorMsg.SettingFindMoreReddotService"
            if (r1 == 0) goto L_0x0033
            bp3.p r1 = bp3.C79758p.f233760a
            tf3.e r15 = new tf3.e
            r15.<init>()
            java.lang.Object r1 = r1.mo109880c(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r1 = gy3.C87412m.m108589b(r1, r15)
            if (r1 == 0) goto L_0x012b
        L_0x0033:
            long r11 = eb0.C75592q0.m90779i()
            r0.f101183e = r11
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r11 = 68384(0x10b20, float:9.5826E-41)
            r12 = 0
            java.lang.Object r1 = r1.mo119684e(r11, r12)
            boolean r11 = r1 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x0050
            r12 = r1
            java.lang.Boolean r12 = (java.lang.Boolean) r12
        L_0x0050:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r12, (boolean) r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "syncSnsReddot: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            r0.vx0(r1, r9)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC
            boolean r1 = r1.mo119686g(r11, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "finderInitState = "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NEAR_BY_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC
            boolean r11 = r11.mo119686g(r12, r6)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "initNearByState = "
            r12.append(r15)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC
            boolean r12 = r12.mo119686g(r15, r6)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r9 = "isEnableShowFinderLiveEntranceRedDot = "
            r15.append(r9)
            r15.append(r12)
            java.lang.String r9 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            r0.vx0(r1, r7)
            r0.vx0(r11, r3)
            r0.vx0(r12, r13)
            java.lang.String r1 = "syncDefaultReddot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r9 = 128(0x80, double:6.32E-322)
            r0.vx0(r6, r9)
            r9 = 512(0x200, double:2.53E-321)
            r0.vx0(r6, r9)
            r9 = 2048(0x800, double:1.0118E-320)
            r0.vx0(r6, r9)
            long r9 = r0.f101183e
            r11 = 0
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x00fc
            java.lang.String r1 = "checkReddotSync but skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        L_0x00fc:
            r9 = 1
            r0.vx0(r5, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = "checkReddotSync sync = "
            r1.append(r9)
            long r9 = r0.f101183e
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r9 = 147458(0x24002, float:2.06633E-40)
            long r10 = r0.f101183e
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r1.mo119676J(r9, r10)
        L_0x012b:
            if (r18 != 0) goto L_0x013d
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$b r9 = h81.C32735h.C32738b.clicfg_data_report_app_event_monitor_type
            int r1 = r1.mo58779Qe(r9, r5)
            if (r1 != r6) goto L_0x0256
        L_0x013d:
            f40.e r1 = f40.C86709a0.m107523b()
            java.lang.String r1 = r1.mo121111i()
            java.lang.String r9 = "MMKV_HAS_SYNC_FINDMORE"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
            boolean r10 = r10.containsKey(r1)
            if (r10 == 0) goto L_0x016c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkSyncOplog "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " already SyncOplog"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0256
        L_0x016c:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            r11 = 9
            java.lang.Long[] r11 = new java.lang.Long[r11]
            r15 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r15)
            r11[r5] = r12
            r15 = 2
            java.lang.Long r5 = java.lang.Long.valueOf(r15)
            r11[r6] = r5
            r5 = 2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r11[r5] = r7
            r5 = 3
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r11[r5] = r7
            r5 = 4
            r7 = 128(0x80, double:6.32E-322)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r11[r5] = r7
            r5 = 5
            r7 = 512(0x200, double:2.53E-321)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r11[r5] = r7
            r5 = 6
            r7 = 2048(0x800, double:1.0118E-320)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r11[r5] = r7
            r5 = 7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r11[r5] = r3
            r3 = 8
            r4 = 32768(0x8000, double:1.61895E-319)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r11[r3] = r4
            java.util.List r3 = sx3.C64197v.m75537f(r11)
            java.util.Iterator r3 = r3.iterator()
        L_0x01c8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e9
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            long r11 = eb0.C75592q0.m90779i()
            long r4 = r4 & r11
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r10.put(r7, r4)
            goto L_0x01c8
        L_0x01e9:
            java.util.Set r3 = r10.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x01f1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x024f
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            long r7 = r5.longValue()
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            te3.yy2 r10 = new te3.yy2
            r10.<init>()
            r10.f145577d = r7
            r10.f145578e = r4
            java.lang.Class<f62.k0> r11 = f62.C75700k0.class
            k40.a r11 = f40.C86709a0.m107533q(r11)
            f62.k0 r11 = (f62.C75700k0) r11
            g62.m r11 = r11.mo96100XW()
            g62.n r12 = new g62.n
            r13 = 75
            r12.<init>(r13, r10)
            tc0.p r11 = (tc0.C77885p) r11
            r11.mo107993q(r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "SyncOplog switch "
            r10.append(r11)
            r10.append(r7)
            r7 = 32
            r10.append(r7)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x01f1
        L_0x024f:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
            r2.putInt(r1, r6)
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p265wx.C38333m.mo61609f(boolean):void");
    }

    /* renamed from: jK */
    public boolean mo61610jK() {
        return (C75592q0.m90779i() & 8192) != 8192;
    }

    /* renamed from: mW */
    public boolean mo61611mW() {
        return (C75592q0.m90779i() & 2048) != 2048;
    }

    /* renamed from: qm */
    public boolean mo61612qm() {
        return (C75592q0.m90779i() & 8) != 8;
    }

    /* renamed from: tF */
    public boolean mo61613tF() {
        return (C75592q0.m90779i() & 2) != 2;
    }

    public final void vx0(boolean z, long j) {
        long j2;
        Log.m105924i("MicorMsg.SettingFindMoreReddotService", "switch ext change : open = " + z + " item value = " + j);
        if (z) {
            j2 = (~j) & this.f101183e;
        } else {
            j2 = this.f101183e | j;
        }
        this.f101183e = j2;
        C86709a0.m107535s().mo121142i().mo119676J(147458, Long.valueOf(this.f101183e));
    }

    /* renamed from: xW */
    public void mo61615xW() {
        mo61609f(false);
    }

    /* renamed from: yL */
    public boolean mo61616yL() {
        return (C75592q0.m90779i() & 512) != 512;
    }
}
