package com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderSyncGotTabTipsEvent;
import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import h81.C32735h;
import hh0.C20942f;
import java.util.HashSet;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.edge.FinderGotTabTipsEdgeTrigger */
public class FinderGotTabTipsEdgeTrigger extends AbsEdgeTrigger {

    /* renamed from: i */
    public HashSet<String> f49227i = new HashSet<>();

    /* renamed from: j */
    public C17861e f49228j = new C17861e();

    /* renamed from: k */
    public IListener<KvReportEvent> f49229k;

    /* renamed from: l */
    public IListener<FinderSyncGotTabTipsEvent> f49230l;

    public FinderGotTabTipsEdgeTrigger() {
        super("MicroMsg.FinderGotTabTipsEdgeTrigger", C32735h.C32737c.clicfg_finder_tabtips_edge_64_json, C32735h.C32737c.clicfg_finder_tabtips_edge_32_json, C32735h.C32737c.clicfg_finder_tabtips_edge_release_json);
        C40008f fVar = C40008f.f107254d;
        this.f49229k = new IListener<KvReportEvent>(this, fVar) {
            {
                this.__eventId = -624982229;
            }

            public boolean callback(IEvent iEvent) {
                KvReportEvent kvReportEvent = (KvReportEvent) iEvent;
                if (kvReportEvent.f78853d.f78854a != 9999) {
                    return false;
                }
                Log.m105924i("MicroMsg.FinderGotTabTipsEdgeTrigger", "debug here, finder sync");
                C20942f.yx0().Gx0(Util.getInt(kvReportEvent.f78853d.f78855b, 10000));
                return false;
            }
        };
        this.f49230l = new IListener<FinderSyncGotTabTipsEvent>(fVar) {
            {
                this.__eventId = 1501379208;
            }

            public boolean callback(IEvent iEvent) {
                FinderSyncGotTabTipsEvent.C40101a aVar;
                FinderSyncGotTabTipsEvent finderSyncGotTabTipsEvent = (FinderSyncGotTabTipsEvent) iEvent;
                if (!(finderSyncGotTabTipsEvent == null || (aVar = finderSyncGotTabTipsEvent.f107535d) == null)) {
                    C81060c cVar = FinderGotTabTipsEdgeTrigger.this.f238086f;
                    Log.m105925i("MicroMsg.FinderGotTabTipsEdgeTrigger", "rece finder sync got tab tips event scene [%d] edge[%s %s]", Integer.valueOf(aVar.f107538b), cVar.f238091b, cVar.f238090a);
                    finderSyncGotTabTipsEvent.f107536e.f107539a = false;
                    if (FinderGotTabTipsEdgeTrigger.this.mo112992c()) {
                        finderSyncGotTabTipsEvent.f107536e.f107539a = true;
                        ((C119157j) C119157j.f356862d).mo183876g(new C81061d(this, finderSyncGotTabTipsEvent), "Ai_thread");
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public void mo22060a() {
        this.f238088h.alive();
        this.f49230l.alive();
        this.f49229k.alive();
    }

    /* renamed from: b */
    public void mo22061b() {
        this.f238088h.dead();
        this.f49230l.dead();
        this.f49229k.dead();
    }

    /* renamed from: d */
    public boolean mo22070d(Object obj) {
        FinderSyncGotTabTipsEvent finderSyncGotTabTipsEvent = obj instanceof FinderSyncGotTabTipsEvent ? (FinderSyncGotTabTipsEvent) obj : null;
        return finderSyncGotTabTipsEvent != null && !this.f49227i.contains(Integer.valueOf(finderSyncGotTabTipsEvent.f107535d.f107538b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x00bd A[EDGE_INSN: B:159:0x00bd->B:52:0x00bd ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a1 A[Catch:{ Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9 A[Catch:{ Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b6 A[LOOP:1: B:21:0x0061->B:50:0x00b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo22071e(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.String r3 = "FinderLiveEntrance"
            java.lang.String r4 = "FinderEntrance"
            java.lang.String r5 = "MicroMsg.FinderGotTabTipsEdgeTrigger"
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r8 = r0 instanceof com.tencent.p014mm.autogen.events.FinderSyncGotTabTipsEvent
            if (r8 == 0) goto L_0x0018
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent r0 = (com.tencent.p014mm.autogen.events.FinderSyncGotTabTipsEvent) r0
            r8 = r0
            goto L_0x0019
        L_0x0018:
            r8 = 0
        L_0x0019:
            java.lang.String r10 = ""
            if (r8 != 0) goto L_0x001e
            return r10
        L_0x001e:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            te3.dn1 r0 = new te3.dn1     // Catch:{ Exception -> 0x00c7 }
            r0.<init>()     // Catch:{ Exception -> 0x00c7 }
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$a r15 = r8.f107535d     // Catch:{ Exception -> 0x00c7 }
            te3.mh0 r15 = r15.f107537a     // Catch:{ Exception -> 0x00c7 }
            pe3.b r15 = r15.f138029e     // Catch:{ Exception -> 0x00c7 }
            byte[] r15 = r15.mo123703f()     // Catch:{ Exception -> 0x00c7 }
            r0.parseFrom(r15)     // Catch:{ Exception -> 0x00c7 }
            java.util.LinkedList<te3.fn1> r15 = r0.f132433d     // Catch:{ Exception -> 0x00c7 }
            if (r15 == 0) goto L_0x00c5
            boolean r15 = r15.isEmpty()     // Catch:{ Exception -> 0x00c7 }
            if (r15 != 0) goto L_0x00c5
            r15 = 0
        L_0x0045:
            java.util.LinkedList<te3.fn1> r9 = r0.f132433d     // Catch:{ Exception -> 0x00c7 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x00c7 }
            if (r15 >= r9) goto L_0x00c2
            java.util.LinkedList<te3.fn1> r9 = r0.f132433d     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object r9 = r9.get(r15)     // Catch:{ Exception -> 0x00c7 }
            te3.fn1 r9 = (te3.C49448fn1) r9     // Catch:{ Exception -> 0x00c7 }
            te3.xi1 r9 = r9.f133597d     // Catch:{ Exception -> 0x00c7 }
            if (r9 == 0) goto L_0x00bb
            java.util.LinkedList<te3.nn1> r13 = r9.f144672g     // Catch:{ Exception -> 0x00c7 }
            if (r13 == 0) goto L_0x00bb
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x00c7 }
        L_0x0061:
            boolean r16 = r13.hasNext()     // Catch:{ Exception -> 0x00c7 }
            if (r16 == 0) goto L_0x00bb
            java.lang.Object r16 = r13.next()     // Catch:{ Exception -> 0x00c7 }
            r14 = r16
            te3.nn1 r14 = (te3.C64586nn1) r14     // Catch:{ Exception -> 0x00c7 }
            if (r14 == 0) goto L_0x00ae
            r16 = r0
            java.lang.String r0 = r14.f184507i     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x00c7 }
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = r14.f184507i     // Catch:{ Exception -> 0x00c7 }
            int r14 = r0.hashCode()     // Catch:{ Exception -> 0x00c7 }
            r17 = r13
            r13 = -58348260(0xfffffffffc85ad1c, float:-5.5526925E36)
            if (r14 == r13) goto L_0x0096
            r13 = 691368744(0x29357328, float:4.0289956E-14)
            if (r14 == r13) goto L_0x008e
            goto L_0x009e
        L_0x008e:
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x009e
            r0 = 1
            goto L_0x009f
        L_0x0096:
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x009e
            r0 = 0
            goto L_0x009f
        L_0x009e:
            r0 = -1
        L_0x009f:
            if (r0 == 0) goto L_0x00a9
            r13 = 1
            if (r0 == r13) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            r12.add(r9)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00ac
        L_0x00a9:
            r11.add(r9)     // Catch:{ Exception -> 0x00c7 }
        L_0x00ac:
            r0 = 1
            goto L_0x00b3
        L_0x00ae:
            r16 = r0
        L_0x00b0:
            r17 = r13
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            if (r0 == 0) goto L_0x00b6
            goto L_0x00bd
        L_0x00b6:
            r0 = r16
            r13 = r17
            goto L_0x0061
        L_0x00bb:
            r16 = r0
        L_0x00bd:
            int r15 = r15 + 1
            r0 = r16
            goto L_0x0045
        L_0x00c2:
            r0 = 1
            r9 = 0
            goto L_0x00d1
        L_0x00c5:
            r9 = 0
            goto L_0x00d0
        L_0x00c7:
            r0 = move-exception
            r9 = 0
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r14 = "collect edge args error."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r14, r13)
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            if (r0 == 0) goto L_0x01f6
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00e0
            java.lang.Object r0 = r11.get(r9)
            te3.xi1 r0 = (te3.C51978xi1) r0
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x00ee
            java.lang.Object r11 = r12.get(r9)
            te3.xi1 r11 = (te3.C51978xi1) r11
            goto L_0x00ef
        L_0x00ee:
            r11 = 0
        L_0x00ef:
            com.tencent.mm.plugin.ai.data.business.trigger.edge.e r9 = r1.f49228j
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$a r8 = r8.f107535d
            int r8 = r8.f107538b
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r12 = r9.f49235a
            long r13 = (long) r8
            r12.f48445d = r13
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r12.f48446e = r13
            java.lang.String r8 = "gotFinderPushScene"
            java.lang.String r12 = "gotFinderTipsId"
            if (r0 == 0) goto L_0x016f
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r13 = r9.f49235a
            java.lang.String r14 = r0.f144673h
            r15 = 1
            java.lang.String r12 = r13.mo86045b(r12, r14, r15)
            r13.f48447f = r12
            int r12 = r0.f144670e
            long r14 = (long) r12
            r13.f48448g = r14
            ih0.b r12 = ih0.C21092b.m23349i()
            r12.getClass()
            java.util.LinkedList<te3.nn1> r0 = r0.f144672g
            if (r0 == 0) goto L_0x0140
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L_0x0140
            java.util.Iterator r0 = r0.iterator()
        L_0x012b:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0140
            java.lang.Object r12 = r0.next()
            te3.nn1 r12 = (te3.C64586nn1) r12
            java.lang.String r13 = r12.f184507i
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r4)
            if (r13 == 0) goto L_0x012b
            goto L_0x0141
        L_0x0140:
            r12 = 0
        L_0x0141:
            if (r12 == 0) goto L_0x0186
            com.tencent.mm.pointers.PInt r0 = new com.tencent.mm.pointers.PInt
            r0.<init>()
            com.tencent.mm.pointers.PString r4 = new com.tencent.mm.pointers.PString
            r4.<init>()
            ih0.b r13 = ih0.C21092b.m23349i()
            boolean r13 = r13.mo32855h(r12, r0, r4)
            if (r13 == 0) goto L_0x0167
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r13 = r9.f49235a
            int r0 = r0.value
            long r14 = (long) r0
            r13.f48449h = r14
            java.lang.String r0 = r4.value
            r4 = 1
            java.lang.String r0 = r13.mo86045b(r8, r0, r4)
            r13.f48450i = r0
        L_0x0167:
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r0 = r9.f49235a
            int r4 = r12.f184514s
            long r12 = (long) r4
            r0.f48451j = r12
            goto L_0x0186
        L_0x016f:
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r0 = r9.f49235a
            r4 = 1
            java.lang.String r12 = r0.mo86045b(r12, r10, r4)
            r0.f48447f = r12
            r12 = 0
            r0.f48448g = r12
            r0.f48449h = r12
            java.lang.String r8 = r0.mo86045b(r8, r10, r4)
            r0.f48450i = r8
            r0.f48451j = r12
        L_0x0186:
            java.lang.String r0 = "gotLiveTipsId"
            if (r11 == 0) goto L_0x01e5
            ih0.b r4 = ih0.C21092b.m23349i()
            r4.getClass()
            java.util.LinkedList<te3.nn1> r4 = r11.f144672g
            if (r4 == 0) goto L_0x01b4
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto L_0x01b4
            java.util.Iterator r4 = r4.iterator()
        L_0x019f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01b4
            java.lang.Object r8 = r4.next()
            te3.nn1 r8 = (te3.C64586nn1) r8
            java.lang.String r12 = r8.f184507i
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r12, (java.lang.String) r3)
            if (r12 == 0) goto L_0x019f
            goto L_0x01b5
        L_0x01b4:
            r8 = 0
        L_0x01b5:
            if (r8 == 0) goto L_0x01d4
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>()
            ih0.b r4 = ih0.C21092b.m23349i()
            boolean r4 = r4.mo32852e(r8, r3)
            if (r4 == 0) goto L_0x01cd
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r4 = r9.f49235a
            int r3 = r3.value
            long r12 = (long) r3
            r4.f48454m = r12
        L_0x01cd:
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r3 = r9.f49235a
            int r4 = r8.f184514s
            long r12 = (long) r4
            r3.f48455n = r12
        L_0x01d4:
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r3 = r9.f49235a
            java.lang.String r4 = r11.f144673h
            r8 = 1
            java.lang.String r0 = r3.mo86045b(r0, r4, r8)
            r3.f48452k = r0
            int r0 = r11.f144670e
            long r11 = (long) r0
            r3.f48453l = r11
            goto L_0x01f6
        L_0x01e5:
            r8 = 1
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r3 = r9.f49235a
            java.lang.String r0 = r3.mo86045b(r0, r10, r8)
            r3.f48452k = r0
            r8 = 0
            r3.f48453l = r8
            r3.f48454m = r8
            r3.f48455n = r8
        L_0x01f6:
            com.tencent.mm.plugin.ai.data.business.trigger.edge.e r0 = r1.f49228j
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r3 = r0.f49235a
            java.lang.String r4 = "currFinderTipsId"
            r8 = 1
            java.lang.String r9 = r3.mo86045b(r4, r10, r8)
            r3.f48456o = r9
            r11 = 0
            r3.f48457p = r11
            r3.f48458q = r11
            java.lang.String r9 = "currFinderPushScene"
            java.lang.String r13 = r3.mo86045b(r9, r10, r8)
            r3.f48459r = r13
            r3.f48460s = r11
            r3.f48461t = r11
            java.lang.String r8 = "currFinderReceTimeMs"
            r3.mo86046c(r8, r11)
            r3.f48463v = r11
            r3.f48462u = r11
            ih0.b r3 = ih0.C21092b.m23349i()
            xh.w3 r3 = r3.mo32853f()
            if (r3 == 0) goto L_0x0283
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r11 = r0.f49235a
            java.lang.String r12 = r3.field_tipsId
            r13 = 1
            java.lang.String r4 = r11.mo86045b(r4, r12, r13)
            r11.f48456o = r4
            int r4 = r3.field_ctrType
            long r12 = (long) r4
            r11.f48457p = r12
            long r12 = r3.field_time
            r11.f48461t = r12
            r11.mo86046c(r8, r12)
            ih0.b r4 = ih0.C21092b.m23349i()
            te3.nn1 r3 = r4.mo32854g(r3)
            if (r3 == 0) goto L_0x0283
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r4 = r0.f49235a
            int r8 = r3.f184514s
            long r11 = (long) r8
            r4.f48460s = r11
            com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
            r4.<init>()
            com.tencent.mm.pointers.PString r8 = new com.tencent.mm.pointers.PString
            r8.<init>()
            ih0.b r11 = ih0.C21092b.m23349i()
            boolean r11 = r11.mo32855h(r3, r4, r8)
            if (r11 == 0) goto L_0x0274
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r11 = r0.f49235a
            int r4 = r4.value
            long r12 = (long) r4
            r11.f48458q = r12
            java.lang.String r4 = r8.value
            r8 = 1
            java.lang.String r4 = r11.mo86045b(r9, r4, r8)
            r11.f48459r = r4
        L_0x0274:
            te3.yw r3 = r3.f184512q
            if (r3 == 0) goto L_0x0283
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r4 = r0.f49235a
            int r8 = r3.f186604d
            long r8 = (long) r8
            r4.f48462u = r8
            long r8 = r3.f186606f
            r4.f48463v = r8
        L_0x0283:
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r3 = r0.f49235a
            java.lang.String r4 = "currLiveTipsId"
            r8 = 1
            java.lang.String r9 = r3.mo86045b(r4, r10, r8)
            r3.f48426A = r9
            r12 = 0
            r3.f48427B = r12
            r3.f48429D = r12
            r3.f48430E = r12
            java.lang.String r8 = "currLiveReceTimeMs"
            r3.mo86046c(r8, r12)
            r3.f48432G = r12
            r3.f48431F = r12
            ih0.b r3 = ih0.C21092b.m23349i()
            xh.w3 r3 = r3.mo32850c()
            if (r3 == 0) goto L_0x02f6
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r9 = r0.f49235a
            java.lang.String r11 = r3.field_tipsId
            r14 = 1
            java.lang.String r4 = r9.mo86045b(r4, r11, r14)
            r9.f48426A = r4
            int r4 = r3.field_ctrType
            long r14 = (long) r4
            r9.f48427B = r14
            long r14 = r3.field_time
            r9.f48430E = r14
            r9.mo86046c(r8, r14)
            ih0.b r4 = ih0.C21092b.m23349i()
            te3.nn1 r3 = r4.mo32851d(r3)
            if (r3 == 0) goto L_0x02f6
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r4 = r0.f49235a
            int r8 = r3.f184514s
            long r8 = (long) r8
            r4.f48429D = r8
            com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
            r4.<init>()
            ih0.b r8 = ih0.C21092b.m23349i()
            boolean r8 = r8.mo32852e(r3, r4)
            if (r8 == 0) goto L_0x02e7
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r8 = r0.f49235a
            int r4 = r4.value
            long r14 = (long) r4
            r8.f48428C = r14
        L_0x02e7:
            te3.yw r3 = r3.f184512q
            if (r3 == 0) goto L_0x02f6
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r0 = r0.f49235a
            int r4 = r3.f186604d
            long r8 = (long) r4
            r0.f48431F = r8
            long r3 = r3.f186606f
            r0.f48432G = r3
        L_0x02f6:
            com.tencent.mm.plugin.ai.data.business.trigger.edge.e r0 = r1.f49228j
            r0.getClass()
            int r3 = ih0.C108461a.m146963b()
            r4 = 3
            if (r3 < r4) goto L_0x0304
            r3 = 1
            goto L_0x0305
        L_0x0304:
            r3 = 0
        L_0x0305:
            com.tencent.mm.pointers.PFloat r4 = new com.tencent.mm.pointers.PFloat
            r4.<init>()
            ih0.C108461a.m146962a(r4)
            com.tencent.mm.pointers.PString r8 = new com.tencent.mm.pointers.PString
            r8.<init>()
            com.tencent.mm.pointers.PLong r9 = new com.tencent.mm.pointers.PLong
            r9.<init>()
            java.lang.Class<ih0.g> r11 = ih0.C21093g.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ih0.g r11 = (ih0.C21093g) r11
            ih0.o r11 = r11.f59648e
            if (r11 == 0) goto L_0x032d
            java.lang.String r14 = r11.f59651a
            r8.value = r14
            long r14 = r11.f59652b
            r9.value = r14
            r11 = 1
            goto L_0x032e
        L_0x032d:
            r11 = 0
        L_0x032e:
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r0 = r0.f49235a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r15 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getIOSOldNetType(r15)
            r14.append(r15)
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            java.lang.String r14 = "netType"
            r15 = 1
            java.lang.String r10 = r0.mo86045b(r14, r10, r15)
            r0.f48435J = r10
            ih0.j r10 = ih0.C117197j.wx0()
            boolean r10 = r10.f351082e
            r0.f48436K = r10
            if (r11 == 0) goto L_0x035d
            java.lang.String r8 = r8.value
            goto L_0x035f
        L_0x035d:
            java.lang.String r8 = "-1"
        L_0x035f:
            java.lang.String r10 = "currSessionId"
            java.lang.String r8 = r0.mo86045b(r10, r8, r15)
            r0.f48439N = r8
            if (r11 == 0) goto L_0x036c
            long r8 = r9.value
            goto L_0x036d
        L_0x036c:
            r8 = r12
        L_0x036d:
            r0.f48440O = r8
            r8 = 1
            if (r3 == 0) goto L_0x0375
            r10 = r8
            goto L_0x0376
        L_0x0375:
            r10 = r12
        L_0x0376:
            r0.f48441P = r10
            float r3 = r4.value
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            long r3 = (long) r3
            r0.f48442Q = r3
            com.tencent.mm.plugin.ai.data.business.trigger.edge.e r0 = r1.f49228j
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r3 = r0.f49235a
            ih0.e r4 = ih0.C33329e.xx0()
            java.lang.String r4 = r4.wx0()
            java.lang.String r10 = "findFriendsEntryRedDot"
            r11 = 1
            java.lang.String r4 = r3.mo86045b(r10, r4, r11)
            r3.f48437L = r4
            ih0.e r4 = ih0.C33329e.xx0()
            java.util.HashMap<java.lang.Integer, com.tencent.mm.autogen.events.WeChatTabRedDotEvent$a> r4 = r4.f90355f
            r10 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r11)
            com.tencent.mm.autogen.events.WeChatTabRedDotEvent$a r4 = (com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent.C28853a) r4
            if (r4 == 0) goto L_0x03b5
            boolean r11 = r4.f79064b
            if (r11 != 0) goto L_0x03b5
            int r4 = r4.f79065c
            if (r4 <= 0) goto L_0x03b3
            goto L_0x03b5
        L_0x03b3:
            r4 = 0
            goto L_0x03b6
        L_0x03b5:
            r4 = 1
        L_0x03b6:
            if (r4 == 0) goto L_0x03ba
            r13 = r8
            goto L_0x03bb
        L_0x03ba:
            r13 = r12
        L_0x03bb:
            r3.f48438M = r13
            lh0.g r3 = lh0.C34262g.vx0()
            r3.requireAccountInitialized()
            lh0.f r3 = r3.f92371i
            java.lang.String r4 = "calendar_statistics_discover"
            com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct r3 = r3.mo33602c(r4)
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r0 = r0.f49235a
            long r8 = r3.f48235e
            r0.f48443R = r8
            java.lang.String r4 = "calendarDiscoverFirstExposeTimeMs"
            r0.mo86046c(r4, r8)
            long r3 = r3.f48237g
            r0.f48444S = r3
            com.tencent.mm.plugin.ai.data.business.trigger.edge.e r0 = r1.f49228j
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r0 = r0.f49235a
            ih0.b r3 = ih0.C21092b.m23349i()
            long r3 = r3.mo32857k()
            r0.f48464w = r3
            ih0.b r3 = ih0.C21092b.m23349i()
            r3.getClass()
            di3.d r3 = di3.C86312j.m106911c(r2)
            ht1.t1 r3 = (ht1.C60200t1) r3
            long r3 = r3.mo76889vp()
            r0.f48465x = r3
            ih0.b r3 = ih0.C21092b.m23349i()
            long r3 = r3.mo32856j()
            r0.f48433H = r3
            ih0.b r3 = ih0.C21092b.m23349i()
            r3.getClass()
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            long r2 = r2.mo76855hR()
            r0.f48434I = r2
            ih0.b r2 = ih0.C21092b.m23349i()
            int r2 = r2.mo32848a()
            long r2 = (long) r2
            r0.f48467z = r2
            ih0.b r2 = ih0.C21092b.m23349i()
            int r2 = r2.mo32849b()
            long r2 = (long) r2
            r0.f48466y = r2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.tencent.mm.plugin.ai.data.business.trigger.edge.e r2 = r1.f49228j
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r2 = r2.f49235a
            java.lang.String r2 = r2.mo1006q()
            r3 = 0
            r0[r3] = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "collect edge args [%s] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r0)
            com.tencent.mm.plugin.ai.data.business.trigger.edge.e r0 = r1.f49228j
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct r0 = r0.f49235a
            java.lang.String r0 = r0.mo1005p()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge.FinderGotTabTipsEdgeTrigger.mo22071e(java.lang.Object):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0157 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110 A[Catch:{ Exception -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0158 A[Catch:{ Exception -> 0x018e }, LOOP:1: B:33:0x0086->B:89:0x0158, LOOP_END] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo22072f(java.lang.String r20, java.lang.Object r21) {
        /*
            r19 = this;
            r0 = r21
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r3 = r0 instanceof com.tencent.p014mm.autogen.events.FinderSyncGotTabTipsEvent
            r4 = 0
            if (r3 == 0) goto L_0x000e
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent r0 = (com.tencent.p014mm.autogen.events.FinderSyncGotTabTipsEvent) r0
            goto L_0x000f
        L_0x000e:
            r0 = r4
        L_0x000f:
            r5 = -1
            if (r0 != 0) goto L_0x0014
            return r5
        L_0x0014:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r3 != 0) goto L_0x0021
            com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsOutArgsStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsOutArgsStruct
            r3 = r20
            r4.<init>(r3)
        L_0x0021:
            if (r4 != 0) goto L_0x0024
            return r5
        L_0x0024:
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r4.mo1006q()
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "MicroMsg.FinderGotTabTipsEdgeTrigger"
            java.lang.String r8 = "handle edge result [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r5)
            long r8 = r4.f343671d
            int r5 = (int) r8
            te3.dn1 r8 = new te3.dn1
            r8.<init>()
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$a r9 = r0.f107535d     // Catch:{ Exception -> 0x0193 }
            te3.mh0 r9 = r9.f107537a     // Catch:{ Exception -> 0x0193 }
            pe3.b r9 = r9.f138029e     // Catch:{ Exception -> 0x0193 }
            byte[] r9 = r9.mo123703f()     // Catch:{ Exception -> 0x0193 }
            r8.parseFrom(r9)     // Catch:{ Exception -> 0x0193 }
            java.util.LinkedList<te3.fn1> r9 = r8.f132433d     // Catch:{ Exception -> 0x0193 }
            if (r9 == 0) goto L_0x0190
            boolean r9 = r9.isEmpty()     // Catch:{ Exception -> 0x0193 }
            if (r9 != 0) goto L_0x0190
            java.util.LinkedList<te3.fn1> r9 = r8.f132433d     // Catch:{ Exception -> 0x0193 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0193 }
        L_0x005a:
            boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x0193 }
            if (r10 == 0) goto L_0x0170
            java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x0193 }
            te3.fn1 r10 = (te3.C49448fn1) r10     // Catch:{ Exception -> 0x0193 }
            te3.xi1 r15 = r10.f133597d     // Catch:{ Exception -> 0x0193 }
            java.lang.String r11 = "handleEdgeResult ctrl info [%s]"
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0193 }
            if (r15 == 0) goto L_0x0074
            java.lang.String r13 = r15.f144673h     // Catch:{ Exception -> 0x0071 }
            goto L_0x0076
        L_0x0071:
            goto L_0x0190
        L_0x0074:
            java.lang.String r13 = ""
        L_0x0076:
            r12[r7] = r13     // Catch:{ Exception -> 0x0193 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r12)     // Catch:{ Exception -> 0x0193 }
            if (r15 == 0) goto L_0x0162
            java.util.LinkedList<te3.nn1> r11 = r15.f144672g     // Catch:{ Exception -> 0x0193 }
            if (r11 == 0) goto L_0x0162
            java.util.Iterator r17 = r11.iterator()     // Catch:{ Exception -> 0x0193 }
            r11 = 0
        L_0x0086:
            boolean r12 = r17.hasNext()     // Catch:{ Exception -> 0x0193 }
            if (r12 == 0) goto L_0x015f
            java.lang.Object r12 = r17.next()     // Catch:{ Exception -> 0x0193 }
            te3.nn1 r12 = (te3.C64586nn1) r12     // Catch:{ Exception -> 0x0193 }
            if (r12 == 0) goto L_0x0152
            java.lang.String r13 = r12.f184507i     // Catch:{ Exception -> 0x0193 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ Exception -> 0x0193 }
            if (r13 != 0) goto L_0x0152
            java.lang.String r13 = r12.f184507i     // Catch:{ Exception -> 0x0193 }
            int r14 = r13.hashCode()     // Catch:{ Exception -> 0x0193 }
            r7 = -58348260(0xfffffffffc85ad1c, float:-5.5526925E36)
            if (r14 == r7) goto L_0x00b7
            r7 = 691368744(0x29357328, float:4.0289956E-14)
            if (r14 == r7) goto L_0x00ad
            goto L_0x00c1
        L_0x00ad:
            java.lang.String r7 = "FinderLiveEntrance"
            boolean r7 = r13.equals(r7)     // Catch:{ Exception -> 0x0071 }
            if (r7 == 0) goto L_0x00c1
            r7 = 1
            goto L_0x00c2
        L_0x00b7:
            java.lang.String r7 = "FinderEntrance"
            boolean r7 = r13.equals(r7)     // Catch:{ Exception -> 0x0193 }
            if (r7 == 0) goto L_0x00c1
            r7 = 0
            goto L_0x00c2
        L_0x00c1:
            r7 = -1
        L_0x00c2:
            if (r7 == 0) goto L_0x0110
            if (r7 == r3) goto L_0x00c8
            goto L_0x0152
        L_0x00c8:
            r7 = r5 & 64
            if (r7 <= 0) goto L_0x00da
            java.lang.String r7 = "drop finder live entrance tips [%s]"
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0071 }
            java.lang.String r13 = r15.f144673h     // Catch:{ Exception -> 0x0071 }
            r14 = 0
            r11[r14] = r13     // Catch:{ Exception -> 0x0071 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r11)     // Catch:{ Exception -> 0x0071 }
            r7 = 1
            goto L_0x00db
        L_0x00da:
            r7 = r11
        L_0x00db:
            r11 = r5 & 256(0x100, float:3.59E-43)
            if (r11 <= 0) goto L_0x0108
            hh0.f r11 = hh0.C20942f.yx0()     // Catch:{ Exception -> 0x0193 }
            java.lang.String r13 = r12.f184507i     // Catch:{ Exception -> 0x0193 }
            java.lang.String r14 = r12.f184505g     // Catch:{ Exception -> 0x0193 }
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$a r12 = r0.f107535d     // Catch:{ Exception -> 0x0193 }
            int r12 = r12.f107538b     // Catch:{ Exception -> 0x0193 }
            r21 = r4
            long r3 = (long) r12
            r12 = r13
            r13 = r10
            r18 = r7
            r7 = r15
            r15 = r3
            boolean r3 = r11.Bx0(r12, r13, r14, r15)     // Catch:{ Exception -> 0x018e }
            if (r3 == 0) goto L_0x010d
            java.lang.String r3 = "push finder live entrance tips to cache [%s]"
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x018e }
            java.lang.String r4 = r7.f144673h     // Catch:{ Exception -> 0x018e }
            r12 = 0
            r11[r12] = r4     // Catch:{ Exception -> 0x018e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r11)     // Catch:{ Exception -> 0x018e }
            goto L_0x014e
        L_0x0108:
            r21 = r4
            r18 = r7
            r7 = r15
        L_0x010d:
            r11 = r18
            goto L_0x0155
        L_0x0110:
            r21 = r4
            r7 = r15
            r3 = r5 & 32
            if (r3 <= 0) goto L_0x0126
            java.lang.String r3 = "drop finder entrance tips [%s]"
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x018e }
            java.lang.String r4 = r7.f144673h     // Catch:{ Exception -> 0x018e }
            r13 = 0
            r11[r13] = r4     // Catch:{ Exception -> 0x018e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r11)     // Catch:{ Exception -> 0x018e }
            r3 = 1
            goto L_0x0127
        L_0x0126:
            r3 = r11
        L_0x0127:
            r4 = r5 & 128(0x80, float:1.794E-43)
            if (r4 <= 0) goto L_0x0150
            hh0.f r11 = hh0.C20942f.yx0()     // Catch:{ Exception -> 0x018e }
            java.lang.String r4 = r12.f184507i     // Catch:{ Exception -> 0x018e }
            java.lang.String r14 = r12.f184505g     // Catch:{ Exception -> 0x018e }
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$a r12 = r0.f107535d     // Catch:{ Exception -> 0x018e }
            int r12 = r12.f107538b     // Catch:{ Exception -> 0x018e }
            long r12 = (long) r12     // Catch:{ Exception -> 0x018e }
            r15 = r12
            r12 = r4
            r13 = r10
            boolean r4 = r11.Bx0(r12, r13, r14, r15)     // Catch:{ Exception -> 0x018e }
            if (r4 == 0) goto L_0x0150
            java.lang.String r3 = "push finder entrance tips to cache [%s]"
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x018e }
            java.lang.String r4 = r7.f144673h     // Catch:{ Exception -> 0x018e }
            r12 = 0
            r11[r12] = r4     // Catch:{ Exception -> 0x018e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r11)     // Catch:{ Exception -> 0x018e }
        L_0x014e:
            r11 = 1
            goto L_0x0155
        L_0x0150:
            r11 = r3
            goto L_0x0155
        L_0x0152:
            r21 = r4
            r7 = r15
        L_0x0155:
            if (r11 == 0) goto L_0x0158
            goto L_0x0165
        L_0x0158:
            r4 = r21
            r15 = r7
            r3 = 1
            r7 = 0
            goto L_0x0086
        L_0x015f:
            r21 = r4
            goto L_0x0165
        L_0x0162:
            r21 = r4
            r11 = 0
        L_0x0165:
            if (r11 == 0) goto L_0x016a
            r9.remove()     // Catch:{ Exception -> 0x018e }
        L_0x016a:
            r4 = r21
            r3 = 1
            r7 = 0
            goto L_0x005a
        L_0x0170:
            r21 = r4
            java.util.LinkedList<te3.fn1> r3 = r8.f132433d     // Catch:{ Exception -> 0x018e }
            if (r3 == 0) goto L_0x0188
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x018e }
            if (r3 != 0) goto L_0x0188
            hh0.f r3 = hh0.C20942f.yx0()     // Catch:{ Exception -> 0x018e }
            com.tencent.mm.autogen.events.FinderSyncGotTabTipsEvent$a r0 = r0.f107535d     // Catch:{ Exception -> 0x018e }
            int r0 = r0.f107538b     // Catch:{ Exception -> 0x018e }
            r3.zx0(r8, r0)     // Catch:{ Exception -> 0x018e }
            goto L_0x0196
        L_0x0188:
            java.lang.String r0 = "handleEdgeResult svrRespTabTips is empty, dont notify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x018e }
            goto L_0x0196
        L_0x018e:
            goto L_0x0196
        L_0x0190:
            r21 = r4
            goto L_0x0196
        L_0x0193:
            r21 = r4
            goto L_0x018e
        L_0x0196:
            r4 = r21
            long r7 = r4.f343672e
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ba
            java.lang.String r0 = r4.f343673f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01ba
            kj2.d r0 = kj2.C117407d.INSTANCE
            long r7 = r4.f343672e
            int r3 = (int) r7
            java.lang.String r4 = r4.f343673f
            java.lang.String r7 = "#"
            java.lang.String r8 = ","
            java.lang.String r4 = r4.replaceAll(r7, r8)
            r0.kvStat(r3, r4)
        L_0x01ba:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r0[r4] = r3
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "handle Edge Result resultCode[%d] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            long r0 = (long) r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge.FinderGotTabTipsEdgeTrigger.mo22072f(java.lang.String, java.lang.Object):long");
    }

    /* renamed from: g */
    public String mo22073g(JSONObject jSONObject) {
        String[] split;
        String optString = jSONObject != null ? jSONObject.optString("nothitscene", "") : null;
        HashSet<String> hashSet = new HashSet<>();
        if (!Util.isNullOrNil(optString) && (split = optString.split(",")) != null && split.length > 0) {
            for (String add : split) {
                hashSet.add(add);
            }
        }
        this.f49227i = hashSet;
        return String.format("not Hit Expt Scene {%s} ", new Object[]{hashSet});
    }
}
