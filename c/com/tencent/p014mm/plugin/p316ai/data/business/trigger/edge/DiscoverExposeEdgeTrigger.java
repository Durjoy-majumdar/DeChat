package com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.EdgeInputArgsStruct;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import ht1.C60200t1;
import ih0.C21092b;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.edge.DiscoverExposeEdgeTrigger */
public class DiscoverExposeEdgeTrigger extends AbsEdgeTrigger {

    /* renamed from: k */
    public static int[] f49223k;

    /* renamed from: i */
    public C17860b f49224i = new C17860b();

    /* renamed from: j */
    public IListener<EnterFindMoreFriendsUIEvent> f49225j = new IListener<EnterFindMoreFriendsUIEvent>(C40008f.f107254d) {
        {
            this.__eventId = 281608775;
        }

        public boolean callback(IEvent iEvent) {
            EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent = (EnterFindMoreFriendsUIEvent) iEvent;
            try {
                ((C119157j) C119157j.f356862d).mo183876g(new C17859a(this, enterFindMoreFriendsUIEvent), "Ai_thread");
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    };

    static {
        int[] iArr = new int[5];
        f49223k = iArr;
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 4;
        iArr[3] = 8;
        iArr[4] = 16;
    }

    public DiscoverExposeEdgeTrigger() {
        super("MicroMsg.DiscoverExposeEdgeTrigger", C32735h.C32737c.clicfg_finder_edge_64_json, C32735h.C32737c.clicfg_finder_edge_32_json, C32735h.C32737c.clicfg_finder_edge_patch_json);
    }

    /* renamed from: a */
    public void mo22060a() {
        this.f238088h.alive();
        this.f49225j.alive();
    }

    /* renamed from: b */
    public void mo22061b() {
        this.f238088h.dead();
        this.f49225j.dead();
    }

    /* renamed from: d */
    public boolean mo22070d(Object obj) {
        return true;
    }

    /* renamed from: e */
    public String mo22071e(Object obj) {
        Class cls = C60200t1.class;
        try {
            if (obj instanceof EnterFindMoreFriendsUIEvent) {
                this.f49224i.mo22076b((EnterFindMoreFriendsUIEvent) obj);
                EdgeInputArgsStruct edgeInputArgsStruct = this.f49224i.f49234a;
                edgeInputArgsStruct.f48326n = C21092b.m23349i().mo32860n();
                C21092b.m23349i().getClass();
                edgeInputArgsStruct.f48328o = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77253Y5();
                edgeInputArgsStruct.f48343z = C21092b.m23349i().mo32861o();
                C21092b.m23349i().getClass();
                edgeInputArgsStruct.f48277A = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77235K5();
                this.f49224i.mo22077c();
                this.f49224i.mo22078d();
                this.f49224i.mo22075a();
                Log.m105919d("MicroMsg.DiscoverExposeEdgeTrigger", "collectEdgeArgs input [%s]", this.f49224i.f49234a.mo1006q());
                return this.f49224i.f49234a.mo1005p();
            }
        } catch (Exception unused) {
        }
        Log.m105928w("MicroMsg.DiscoverExposeEdgeTrigger", "collectEdgeArgs trigger input class error");
        return "";
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: f */
    public long mo22072f(java.lang.String r17, java.lang.Object r18) {
        /*
            r16 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r2 != 0) goto L_0x0012
            com.tencent.mm.autogen.mmdata.rpt.EdgeOutputArgsStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.EdgeOutputArgsStruct
            r3 = r17
            r2.<init>(r3)
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 != 0) goto L_0x0018
            r0 = -1
            return r0
        L_0x0018:
            java.lang.String r3 = "MicroMsg.DiscoverExposeEdgeTrigger"
            java.lang.String r4 = "handle edge result [%s]"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r2.mo1006q()
            r8 = 0
            r6[r8] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r6)
            long r3 = r2.f343667d
            int r4 = (int) r3
            r3 = 0
        L_0x002d:
            int[] r6 = f49223k
            r7 = 5
            r9 = 2
            if (r3 >= r7) goto L_0x00f8
            r6 = r6[r3]
            if (r6 == r5) goto L_0x00e6
            if (r6 == r9) goto L_0x00d8
            r7 = 4
            if (r6 == r7) goto L_0x009b
            r7 = 8
            if (r6 == r7) goto L_0x0084
            r7 = 16
            if (r6 == r7) goto L_0x0046
            goto L_0x00f4
        L_0x0046:
            r6 = r4 & 16
            if (r6 <= 0) goto L_0x00f4
            hh0.f r6 = hh0.C20942f.yx0()
            monitor-enter(r6)
            java.util.LinkedList<hh0.i> r7 = r6.f59379n     // Catch:{ Exception -> 0x0068 }
            java.lang.String r9 = "FinderLiveEntrance"
            boolean r7 = r6.Ax0(r7, r9)     // Catch:{ Exception -> 0x0068 }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0068 }
            r10 = 1559(0x617, double:7.702E-321)
            if (r7 == 0) goto L_0x0060
            r12 = 217(0xd9, double:1.07E-321)
            goto L_0x0062
        L_0x0060:
            r12 = 218(0xda, double:1.077E-321)
        L_0x0062:
            r14 = 1
            r9.mo175913w(r10, r12, r14)     // Catch:{ Exception -> 0x0068 }
            goto L_0x007a
        L_0x0068:
            monitor-enter(r6)     // Catch:{ all -> 0x007d }
            java.util.LinkedList<hh0.i> r7 = r6.f59379n     // Catch:{ all -> 0x007f }
            r7.clear()     // Catch:{ all -> 0x007f }
            monitor-exit(r6)     // Catch:{ all -> 0x007d }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x007d }
            r10 = 1559(0x617, double:7.702E-321)
            r12 = 191(0xbf, double:9.44E-322)
            r14 = 1
            r9.mo175913w(r10, r12, r14)     // Catch:{ all -> 0x007d }
        L_0x007a:
            monitor-exit(r6)
            goto L_0x00f4
        L_0x007d:
            r0 = move-exception
            goto L_0x0082
        L_0x007f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007d }
            throw r0     // Catch:{ all -> 0x007d }
        L_0x0082:
            monitor-exit(r6)
            throw r0
        L_0x0084:
            r6 = r4 & 8
            if (r6 <= 0) goto L_0x00f4
            hh0.f r6 = hh0.C20942f.yx0()
            java.lang.String r7 = "NearbyEntrance"
            r6.xx0(r7)
            hh0.f r6 = hh0.C20942f.yx0()
            java.lang.String r7 = "FinderLiveEntrance"
            r6.xx0(r7)
            goto L_0x00f4
        L_0x009b:
            r6 = r4 & 4
            if (r6 <= 0) goto L_0x00f4
            hh0.f r6 = hh0.C20942f.yx0()
            monitor-enter(r6)
            java.util.LinkedList<hh0.i> r7 = r6.f59378j     // Catch:{ Exception -> 0x00bd }
            java.lang.String r9 = "FinderEntrance"
            boolean r7 = r6.Ax0(r7, r9)     // Catch:{ Exception -> 0x00bd }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00bd }
            r10 = 1559(0x617, double:7.702E-321)
            if (r7 == 0) goto L_0x00b5
            r12 = 207(0xcf, double:1.023E-321)
            goto L_0x00b7
        L_0x00b5:
            r12 = 208(0xd0, double:1.03E-321)
        L_0x00b7:
            r14 = 1
            r9.mo175913w(r10, r12, r14)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00cf
        L_0x00bd:
            monitor-enter(r6)     // Catch:{ all -> 0x00d1 }
            java.util.LinkedList<hh0.i> r7 = r6.f59378j     // Catch:{ all -> 0x00d3 }
            r7.clear()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r6)     // Catch:{ all -> 0x00d1 }
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00d1 }
            r10 = 1559(0x617, double:7.702E-321)
            r12 = 190(0xbe, double:9.4E-322)
            r14 = 1
            r9.mo175913w(r10, r12, r14)     // Catch:{ all -> 0x00d1 }
        L_0x00cf:
            monitor-exit(r6)
            goto L_0x00f4
        L_0x00d1:
            r0 = move-exception
            goto L_0x00d6
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d6:
            monitor-exit(r6)
            throw r0
        L_0x00d8:
            r6 = r4 & 2
            if (r6 <= 0) goto L_0x00f4
            hh0.f r6 = hh0.C20942f.yx0()
            java.lang.String r7 = "FinderEntrance"
            r6.xx0(r7)
            goto L_0x00f4
        L_0x00e6:
            r6 = r4 & 1
            if (r6 <= 0) goto L_0x00f4
            hh0.f r6 = hh0.C20942f.yx0()
            long r9 = r2.f343668e
            int r7 = (int) r9
            r6.Gx0(r7)
        L_0x00f4:
            int r3 = r3 + 1
            goto L_0x002d
        L_0x00f8:
            long r6 = r2.f343669f
            r10 = 0
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x011a
            java.lang.String r3 = r2.f343670g
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x011a
            kj2.d r3 = kj2.C117407d.INSTANCE
            long r6 = r2.f343669f
            int r7 = (int) r6
            java.lang.String r6 = r2.f343670g
            java.lang.String r10 = "#"
            java.lang.String r11 = ","
            java.lang.String r6 = r6.replaceAll(r10, r11)
            r3.kvStat(r7, r6)
        L_0x011a:
            java.lang.String r3 = "MicroMsg.DiscoverExposeEdgeTrigger"
            java.lang.String r6 = "handle Edge Result resultCode[%d] scene[%d] cost[%d]"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r7[r8] = r10
            long r10 = r2.f343668e
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r7[r5] = r2
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r7)
            long r0 = (long) r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge.DiscoverExposeEdgeTrigger.mo22072f(java.lang.String, java.lang.Object):long");
    }

    /* renamed from: g */
    public String mo22073g(JSONObject jSONObject) {
        return "";
    }
}
