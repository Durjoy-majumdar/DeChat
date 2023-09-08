package hh0;

import android.os.Message;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FinderSyncRedDotEvent;
import com.tencent.p014mm.autogen.events.NotifyTabTipsToShowEvent;
import com.tencent.p014mm.autogen.events.TabRedDotChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AiFinderRedDotSyncStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.AiFinderSyncRedDotStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSyncCacheTabTipsStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import ht1.C60200t1;
import java.util.HashSet;
import java.util.LinkedList;
import kh0.C88149b;
import oa1.C117731d;
import org.json.JSONObject;
import te3.C49170dn1;
import te3.C49448fn1;
import te3.C51978xi1;
import te3.C64586nn1;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: hh0.f */
public class C20942f extends C86301e {

    /* renamed from: d */
    public long f59372d = 0;

    /* renamed from: e */
    public long f59373e = 300000;

    /* renamed from: f */
    public int f59374f = 0;

    /* renamed from: g */
    public int f59375g = 0;

    /* renamed from: h */
    public HashSet<Integer> f59376h = new HashSet<>();

    /* renamed from: i */
    public HashSet<Integer> f59377i = new HashSet<>();

    /* renamed from: j */
    public LinkedList<C20944i> f59378j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<C20944i> f59379n = new LinkedList<>();

    /* renamed from: o */
    public AiFinderRedDotSyncStruct f59380o = new AiFinderRedDotSyncStruct();

    /* renamed from: p */
    public MMHandler f59381p = new MMHandler((MMHandler.Callback) new C20943a());

    /* renamed from: q */
    public C88149b f59382q = null;

    /* renamed from: hh0.f$a */
    public class C20943a implements MMHandler.Callback {
        public C20943a() {
        }

        public boolean handleMessage(Message message) {
            if (message != null && message.what == 2457) {
                C20942f fVar = C20942f.this;
                int i = message.arg1;
                if (fVar.f59372d > 0) {
                    long nowMilliSecond = Util.nowMilliSecond();
                    AiFinderSyncRedDotStruct aiFinderSyncRedDotStruct = new AiFinderSyncRedDotStruct();
                    long j = fVar.f59372d;
                    aiFinderSyncRedDotStruct.f48141e = j;
                    aiFinderSyncRedDotStruct.mo86046c("StartTimeMs", j);
                    aiFinderSyncRedDotStruct.f48142f = nowMilliSecond;
                    aiFinderSyncRedDotStruct.mo86046c("GetTimeMs", nowMilliSecond);
                    aiFinderSyncRedDotStruct.f48143g = nowMilliSecond - fVar.f59372d;
                    aiFinderSyncRedDotStruct.f48145i = -1;
                    aiFinderSyncRedDotStruct.f48146j = i;
                    aiFinderSyncRedDotStruct.mo86054n();
                    C115669n.INSTANCE.mo175913w(1559, 49, 1);
                    fVar.f59372d = 0;
                    Log.m105925i("MicroMsg.AiFinderLogic", "can not get Finder red dot [%s]", aiFinderSyncRedDotStruct.mo1006q());
                }
            }
            return false;
        }
    }

    public static C20942f yx0() {
        return (C20942f) C86312j.m106911c(C20942f.class);
    }

    public final boolean Ax0(LinkedList<C20944i> linkedList, String str) {
        long currentTicks = Util.currentTicks();
        if (linkedList.isEmpty()) {
            return false;
        }
        int size = linkedList.size() - 1;
        C64586nn1 R5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77246R5(str);
        if (R5 != null) {
            int i = size;
            while (true) {
                if (i < 0) {
                    break;
                }
                C20944i iVar = linkedList.get(i);
                String str2 = iVar.f59385b;
                if (!Util.isEqual(R5.f184505g, str2)) {
                    Log.m105925i("MicroMsg.AiFinderLogic", "pop cache to show url curr[%s] cache[%s, %s]", R5.f184505g, iVar.f59384a.f133597d.f144673h, str2);
                    size = i;
                    break;
                }
                i--;
            }
        }
        C20944i remove = linkedList.remove(size);
        if (remove == null) {
            return false;
        }
        C49170dn1 dn12 = new C49170dn1();
        dn12.f132433d.add(remove.f59384a);
        zx0(dn12, (int) remove.f59386c);
        Cx0(remove.f59384a, (int) remove.f59386c, 2);
        Log.m105925i("MicroMsg.AiFinderLogic", "pop cache to show cost[%d] path[%s] size[%d] findIndex[%d]", Long.valueOf(Util.ticksToNow(currentTicks)), str, Integer.valueOf(linkedList.size()), Integer.valueOf(size));
        return true;
    }

    public synchronized boolean Bx0(String str, C49448fn1 fn12, String str2, long j) {
        long currentTicks = Util.currentTicks();
        LinkedList<C20944i> linkedList = null;
        if ("FinderEntrance".equals(str)) {
            linkedList = this.f59378j;
        } else if ("FinderLiveEntrance".equals(str)) {
            linkedList = this.f59379n;
        }
        if (linkedList == null) {
            Log.m105928w("MicroMsg.AiFinderLogic", "push tab tips to cache error");
            return false;
        }
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
        }
        try {
            C49448fn1 fn13 = new C49448fn1();
            fn13.parseFrom(fn12.toByteArray());
            linkedList.add(new C20944i(fn13, str2, j));
            Cx0(fn13, (int) j, 1);
            Log.m105925i("MicroMsg.AiFinderLogic", "push tips to cache cost[%d] path[%s] size[%d]", Long.valueOf(Util.ticksToNow(currentTicks)), str, Integer.valueOf(linkedList.size()));
        } catch (Exception unused) {
        }
        return true;
    }

    public void Cx0(C49448fn1 fn12, int i, int i2) {
        C51978xi1 xi12;
        if (fn12 != null && (xi12 = fn12.f133597d) != null) {
            try {
                FinderSyncCacheTabTipsStruct finderSyncCacheTabTipsStruct = new FinderSyncCacheTabTipsStruct();
                finderSyncCacheTabTipsStruct.f48477g = i2;
                finderSyncCacheTabTipsStruct.f48474d = finderSyncCacheTabTipsStruct.mo86045b("TipsId", xi12.f144673h, true);
                finderSyncCacheTabTipsStruct.f48475e = finderSyncCacheTabTipsStruct.mo86045b("CtrlType", xi12.f144670e + "", true);
                finderSyncCacheTabTipsStruct.f48476f = i;
                finderSyncCacheTabTipsStruct.mo86054n();
                Log.m105925i("MicroMsg.AiFinderLogic", "reportCacheTabTips [%s]", finderSyncCacheTabTipsStruct.mo1006q());
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized void Dx0() {
        Class cls = C32735h.class;
        synchronized (this) {
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_enable_cache_type, "");
            this.f59376h.clear();
            this.f59376h.addAll(Ex0(Y60));
            String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_disable_cache_scene, "");
            this.f59377i.clear();
            this.f59377i.addAll(Ex0(Y602));
            this.f59375g = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_cache_finder_sync_scene, 0);
            this.f59373e = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_finder_ai_sync_freq, 300000);
            this.f59374f = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_ai_sync_calendar_freq, 0);
            Log.m105925i("MicroMsg.AiFinderLogic", "reset control cacheFinderSync[%d] finderSyncFreqControl[%d] cacheCtrlType[%s] disableScene[%s]", Integer.valueOf(this.f59375g), Long.valueOf(this.f59373e), Y60, Y602);
        }
    }

    public final HashSet<Integer> Ex0(String str) {
        String[] split;
        HashSet<Integer> hashSet = new HashSet<>();
        if (!Util.isNullOrNil(str) && (split = str.split(",")) != null && split.length > 0) {
            for (String str2 : split) {
                int i = Util.getInt(str2, -1);
                if (i > 0) {
                    hashSet.add(Integer.valueOf(i));
                }
            }
        }
        return hashSet;
    }

    public boolean Fx0() {
        String f = C117731d.m166007c().mo182444f("reddot_expt_conf", "", false, false);
        if (Util.isNullOrNil(f)) {
            return false;
        }
        try {
            return new JSONObject(f).optInt("use_reddot_recommend", -1) == 0;
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Gx0(int r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r4 = r27.Fx0()
            r5 = 0
            if (r4 == 0) goto L_0x001b
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 1559(0x617, double:7.702E-321)
            r9 = 51
            r11 = 1
            r6.mo175913w(r7, r9, r11)
            return r5
        L_0x001b:
            r4 = 10000(0x2710, float:1.4013E-41)
            r6 = 20000(0x4e20, float:2.8026E-41)
            if (r1 < r4) goto L_0x0039
            if (r1 >= r6) goto L_0x0039
            ih0.b r7 = ih0.C21092b.m23349i()
            boolean r7 = r7.mo32860n()
            if (r7 != 0) goto L_0x0039
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1559(0x617, double:7.702E-321)
            r11 = 204(0xcc, double:1.01E-321)
            r13 = 1
            r8.mo175913w(r9, r11, r13)
            return r5
        L_0x0039:
            r7 = 2
            r8 = 0
            r10 = 30000(0x7530, float:4.2039E-41)
            r11 = 1
            if (r1 < r6) goto L_0x00b6
            if (r1 >= r10) goto L_0x00b6
            ih0.b r12 = ih0.C21092b.m23349i()
            r13 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            r12.getClass()
            long r15 = eb0.C75592q0.m90781k()
            long r12 = r13 & r15
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005b
            r12 = 1
            goto L_0x005c
        L_0x005b:
            r12 = 0
        L_0x005c:
            r12 = r12 ^ r11
            java.lang.Class<ky2.i> r13 = ky2.C10432i.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ky2.i r13 = (ky2.C10432i) r13
            boolean r13 = r13.mo10750e()
            java.lang.Class<ht1.t1> r14 = ht1.C60200t1.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ht1.t1 r14 = (ht1.C60200t1) r14
            ht1.z4 r14 = r14.mo76861l7()
            boolean r14 = r14.mo83760G5()
            r15 = 3
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            r15[r5] = r16
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r14)
            r15[r11] = r16
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r13)
            r15[r7] = r16
            java.lang.String r10 = "MicroMsg.AiFinderData"
            java.lang.String r6 = "[isShowNearEntrance] openNearbyLiveFriends:%s isEnable:%s, isTeenMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r15)
            if (r14 == 0) goto L_0x009d
            if (r12 == 0) goto L_0x009d
            if (r13 != 0) goto L_0x009d
            r6 = 1
            goto L_0x009e
        L_0x009d:
            r6 = 0
        L_0x009e:
            if (r6 != 0) goto L_0x00b6
            ih0.b r6 = ih0.C21092b.m23349i()
            boolean r6 = r6.mo32861o()
            if (r6 != 0) goto L_0x00b6
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 1559(0x617, double:7.702E-321)
            r20 = 214(0xd6, double:1.057E-321)
            r22 = 1
            r17.mo175913w(r18, r20, r22)
            return r5
        L_0x00b6:
            lh0.g r6 = lh0.C34262g.vx0()
            r6.requireAccountInitialized()
            lh0.f r6 = r6.f92371i
            java.lang.String r10 = "last_finder_sync_ms"
            long r8 = r6.mo33600a(r10, r8)
            r27.requireAccountInitialized()
            long r12 = r0.f59373e
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r8)
            java.lang.String r6 = "MicroMsg.AiFinderLogic"
            int r17 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r17 > 0) goto L_0x00f3
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1[r5] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r1[r11] = r2
            java.lang.String r2 = "finder syn freq control lastFinderSyncMs[%d] finderSyncFreqControl[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r2, r1)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1559(0x617, double:7.702E-321)
            r10 = 203(0xcb, double:1.003E-321)
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            return r5
        L_0x00f3:
            r27.requireAccountInitialized()
            int r12 = r0.f59374f
            java.lang.String r13 = "calendar_statistics_sync"
            if (r12 > 0) goto L_0x00ff
            r18 = r8
            goto L_0x0117
        L_0x00ff:
            lh0.g r14 = lh0.C34262g.vx0()
            r14.requireAccountInitialized()
            lh0.f r14 = r14.f92371i
            com.tencent.mm.autogen.mmdata.rpt.CalendarFinderSyncStatisticsStruct r14 = r14.mo33603d(r13)
            long r14 = r14.f48233h
            r18 = r8
            long r7 = (long) r12
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0117
            r7 = 1
            goto L_0x0118
        L_0x0117:
            r7 = 0
        L_0x0118:
            if (r7 == 0) goto L_0x0126
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 1559(0x617, double:7.702E-321)
            r23 = 203(0xcb, double:1.003E-321)
            r25 = 1
            r20.mo175913w(r21, r23, r25)
            return r5
        L_0x0126:
            if (r1 <= 0) goto L_0x01e0
            com.tencent.mm.autogen.events.FinderSyncEvent r2 = new com.tencent.mm.autogen.events.FinderSyncEvent
            r2.<init>()
            com.tencent.mm.autogen.events.FinderSyncEvent$a r3 = r2.f78804d
            r3.f78805a = r11
            r7 = 506365(0x7b9fd, float:7.09568E-40)
            r3.f78806b = r7
            r3.f78807c = r1
            r2.publish()
            com.tencent.mm.autogen.mmdata.rpt.AiFinderRedDotSyncStruct r2 = r0.f59380o
            r2.f194116f = r1
            r7 = r18
            r2.f194114d = r7
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r2.f194115e = r7
            r2.mo86054n()
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 1559(0x617, double:7.702E-321)
            r21 = 240(0xf0, double:1.186E-321)
            r23 = 1
            r18.mo175913w(r19, r21, r23)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f59372d = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            lh0.g r7 = lh0.C34262g.vx0()
            r7.requireAccountInitialized()
            lh0.f r7 = r7.f92371i
            r7.mo33604e(r10, r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            lh0.g r7 = lh0.C34262g.vx0()
            r7.requireAccountInitialized()
            lh0.f r7 = r7.f92371i
            com.tencent.mm.autogen.mmdata.rpt.CalendarFinderSyncStatisticsStruct r7 = r7.mo33603d(r13)
            r8 = 1
            if (r1 < r4) goto L_0x018c
            r4 = 20000(0x4e20, float:2.8026E-41)
            if (r1 >= r4) goto L_0x018e
            long r14 = r7.f48230e
            long r14 = r14 + r8
            r7.f48230e = r14
            goto L_0x019f
        L_0x018c:
            r4 = 20000(0x4e20, float:2.8026E-41)
        L_0x018e:
            if (r1 < r4) goto L_0x019a
            r4 = 30000(0x7530, float:4.2039E-41)
            if (r1 >= r4) goto L_0x019a
            long r14 = r7.f48231f
            long r14 = r14 + r8
            r7.f48231f = r14
            goto L_0x019f
        L_0x019a:
            long r14 = r7.f48232g
            long r14 = r14 + r8
            r7.f48232g = r14
        L_0x019f:
            long r14 = r7.f48233h
            long r14 = r14 + r8
            r7.f48233h = r14
            lh0.g r1 = lh0.C34262g.vx0()
            r1.requireAccountInitialized()
            lh0.f r1 = r1.f92371i
            r1.getClass()
            lh0.g r1 = lh0.C34262g.vx0()
            r1.requireAccountInitialized()
            lh0.f r1 = r1.f92371i
            java.lang.String r4 = r7.mo1005p()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo33601b()
            if (r1 != 0) goto L_0x01c4
            goto L_0x01c7
        L_0x01c4:
            r1.putString(r13, r4)
        L_0x01c7:
            r4 = 2
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r4 = r7.mo1006q()
            r1[r5] = r4
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r11] = r2
            java.lang.String r2 = "noteSyncCount info [%s] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            return r11
        L_0x01e0:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r4[r5] = r1
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4[r11] = r1
            java.lang.String r1 = "start to finder sync [%d] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hh0.C20942f.Gx0(int):boolean");
    }

    public final void Hx0(TabRedDotChangeEvent.C28839a aVar) {
        requireAccountInitialized();
        int i = this.f59375g;
        if (i > 0) {
            int i2 = 0;
            Log.m105925i("MicroMsg.AiFinderLogic", "tabRedDotChangeToNotifyFinderSync [%b %d] [%b %d]", Boolean.valueOf(aVar.f79026b), Integer.valueOf(aVar.f79027c), Boolean.valueOf(aVar.f79028d), Integer.valueOf(aVar.f79029e));
            boolean z = aVar.f79026b;
            if ((!z && aVar.f79028d) || ((!z && aVar.f79027c == 0 && aVar.f79029e > 0) || aVar.f79027c != aVar.f79029e)) {
                i2 = i;
            }
            if (i2 > 0 && this.f59378j.size() <= 3) {
                Gx0(i);
                C115669n.INSTANCE.mo175913w(1559, 192, 1);
            }
        }
    }

    public final void vx0(FinderSyncRedDotEvent finderSyncRedDotEvent) {
        this.f59381p.removeMessages(2457);
        long nowMilliSecond = Util.nowMilliSecond();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        if (!Util.isNullOrNil(finderSyncRedDotEvent.f48092d.f48095c)) {
            for (Object next : finderSyncRedDotEvent.f48092d.f48095c) {
                if (next instanceof FinderRedDotInfoStruct) {
                    FinderRedDotInfoStruct finderRedDotInfoStruct = (FinderRedDotInfoStruct) next;
                    stringBuffer.append(finderRedDotInfoStruct.f48468d);
                    stringBuffer.append(";");
                    stringBuffer2.append(finderRedDotInfoStruct.f48470f);
                    stringBuffer2.append(";");
                    stringBuffer3.append(finderRedDotInfoStruct.f48471g);
                    stringBuffer3.append(";");
                }
            }
        }
        AiFinderSyncRedDotStruct aiFinderSyncRedDotStruct = new AiFinderSyncRedDotStruct();
        long j = this.f59372d;
        aiFinderSyncRedDotStruct.f48141e = j;
        aiFinderSyncRedDotStruct.mo86046c("StartTimeMs", j);
        aiFinderSyncRedDotStruct.f48142f = nowMilliSecond;
        aiFinderSyncRedDotStruct.mo86046c("GetTimeMs", nowMilliSecond);
        aiFinderSyncRedDotStruct.f48143g = nowMilliSecond - this.f59372d;
        aiFinderSyncRedDotStruct.f48140d = aiFinderSyncRedDotStruct.mo86045b("TipsId", stringBuffer.toString(), true);
        aiFinderSyncRedDotStruct.f48145i = 1;
        aiFinderSyncRedDotStruct.f48144h = aiFinderSyncRedDotStruct.mo86045b("CtrlType", stringBuffer2.toString(), true);
        aiFinderSyncRedDotStruct.f48146j = finderSyncRedDotEvent.f48092d.f48093a;
        aiFinderSyncRedDotStruct.f48147k = aiFinderSyncRedDotStruct.mo86045b("Path", stringBuffer3.toString(), true);
        aiFinderSyncRedDotStruct.mo86054n();
        C115669n.INSTANCE.mo175913w(1559, 50, 1);
        this.f59372d = 0;
        Log.m105925i("MicroMsg.AiFinderLogic", "can  get Finder red dot [%s]", aiFinderSyncRedDotStruct.mo1006q());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r3.equals("NearbyEntrance") == false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void wx0(com.tencent.p014mm.autogen.events.FinderSyncRedDotEvent r12) {
        /*
            r11 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            if (r12 == 0) goto L_0x0147
            com.tencent.mm.autogen.events.FinderSyncRedDotEvent$a r2 = r12.f48092d
            if (r2 != 0) goto L_0x000c
            goto L_0x0147
        L_0x000c:
            int r3 = r2.f48094b
            r4 = 113(0x71, float:1.58E-43)
            if (r3 == r4) goto L_0x0013
            return
        L_0x0013:
            java.util.List r2 = r2.f48095c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
            if (r2 == 0) goto L_0x001c
            return
        L_0x001c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.mm.autogen.events.FinderSyncRedDotEvent$a r12 = r12.f48092d
            java.util.List r12 = r12.f48095c
            java.util.Iterator r12 = r12.iterator()
        L_0x0029:
            boolean r3 = r12.hasNext()
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0110
            java.lang.Object r3 = r12.next()
            boolean r7 = r3 instanceof com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotInfoStruct
            if (r7 == 0) goto L_0x0029
            lh0.b r7 = new lh0.b
            r7.<init>()
            com.tencent.mm.autogen.mmdata.rpt.FinderRedDotInfoStruct r3 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotInfoStruct) r3
            r8 = -1
            if (r3 == 0) goto L_0x0088
            java.lang.String r9 = r3.f48468d
            r7.field_tipsId = r9
            int r9 = r3.f48470f
            r7.field_ctrlType = r9
            int r9 = r3.f48472h
            r7.field_showType = r9
            java.lang.String r9 = r3.f48471g
            r7.field_path = r9
            int r9 = r3.f48469e
            r7.field_scene = r9
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.field_receTimeMs = r9
            java.lang.String r9 = r3.f48473i
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x006e
            java.lang.String r3 = r3.f48473i
            int r3 = r3.hashCode()
            long r9 = (long) r3
            goto L_0x0070
        L_0x006e:
            r9 = 0
        L_0x0070:
            r7.field_urlHash = r9
            java.text.SimpleDateFormat r3 = jh0.C33573a.m40125a()
            long r9 = r7.field_receTimeMs
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r3 = r3.format(r9)
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r8)
            r7.field_ds = r3
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            if (r3 == 0) goto L_0x0029
            r2.add(r7)
            java.lang.String r3 = r7.field_path
            r3.getClass()
            int r7 = r3.hashCode()
            switch(r7) {
                case -58348260: goto L_0x00b0;
                case 691368744: goto L_0x00a5;
                case 1122432629: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            r4 = -1
            goto L_0x00ba
        L_0x009c:
            java.lang.String r5 = "NearbyEntrance"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00ba
            goto L_0x009a
        L_0x00a5:
            java.lang.String r4 = "FinderLiveEntrance"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ae
            goto L_0x009a
        L_0x00ae:
            r4 = 1
            goto L_0x00ba
        L_0x00b0:
            java.lang.String r4 = "FinderEntrance"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00b9
            goto L_0x009a
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            switch(r4) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00da;
                case 2: goto L_0x00bf;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x0029
        L_0x00bf:
            ih0.b r3 = ih0.C21092b.m23349i()
            r3.getClass()
            lh0.g r3 = lh0.C34262g.vx0()
            r3.requireAccountInitialized()
            lh0.f r3 = r3.f92371i
            long r4 = eb0.C31543z5.m39453c()
            java.lang.String r6 = "rece_near_reddot_ms"
            r3.mo33604e(r6, r4)
            goto L_0x0029
        L_0x00da:
            ih0.b r3 = ih0.C21092b.m23349i()
            r3.getClass()
            lh0.g r3 = lh0.C34262g.vx0()
            r3.requireAccountInitialized()
            lh0.f r3 = r3.f92371i
            long r4 = eb0.C31543z5.m39453c()
            java.lang.String r6 = "rece_finder_live_reddot_ms"
            r3.mo33604e(r6, r4)
            goto L_0x0029
        L_0x00f5:
            ih0.b r3 = ih0.C21092b.m23349i()
            r3.getClass()
            lh0.g r3 = lh0.C34262g.vx0()
            r3.requireAccountInitialized()
            lh0.f r3 = r3.f92371i
            long r4 = eb0.C31543z5.m39453c()
            java.lang.String r6 = "rece_finder_reddot_ms"
            r3.mo33604e(r6, r4)
            goto L_0x0029
        L_0x0110:
            lh0.g r12 = lh0.C34262g.vx0()
            r12.requireAccountInitialized()
            lh0.e r12 = r12.f92370h
            r12.getClass()
            zt3.t r3 = zt3.C119157j.f356862d
            lh0.c r7 = new lh0.c
            r7.<init>(r12, r2)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r12 = "Ai_thread"
            r3.mo183876g(r7, r12)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12[r6] = r0
            int r0 = r2.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r5] = r0
            java.lang.String r0 = "MicroMsg.AiFinderLogic"
            java.lang.String r1 = "check receive finder Entrance RedDot cost[%d] size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r12)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hh0.C20942f.wx0(com.tencent.mm.autogen.events.FinderSyncRedDotEvent):void");
    }

    public void xx0(String str) {
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5(str);
        Log.m105925i("MicroMsg.AiFinderLogic", "disposeRedDotAtPath path[%s]", str);
    }

    public void zx0(C49170dn1 dn12, int i) {
        LinkedList<C49448fn1> linkedList;
        if (dn12 == null || (linkedList = dn12.f132433d) == null || linkedList.isEmpty()) {
            Log.m105928w("MicroMsg.AiFinderLogic", "notify finder red dot manager FinderTabTips is null");
            return;
        }
        NotifyTabTipsToShowEvent notifyTabTipsToShowEvent = new NotifyTabTipsToShowEvent();
        NotifyTabTipsToShowEvent.C55151a aVar = notifyTabTipsToShowEvent.f154849d;
        aVar.f154850a = dn12;
        aVar.f154851b = i;
        notifyTabTipsToShowEvent.publish();
    }
}
