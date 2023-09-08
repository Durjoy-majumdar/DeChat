package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnExposureStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import h81.C59774i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ms2.C99967m;
import ms2.C99968n;
import ob0.C11385n;
import ob0.C117747y;
import p166hy.C98567o0;
import te3.C49969jb;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.y1 */
public class C94974y1 {

    /* renamed from: J */
    public static C94977c f275336J;

    /* renamed from: A */
    public String f275337A = "";

    /* renamed from: B */
    public long f275338B = 0;

    /* renamed from: C */
    public C99968n f275339C = null;

    /* renamed from: D */
    public C99968n f275340D = null;

    /* renamed from: E */
    public int f275341E = 0;

    /* renamed from: F */
    public long f275342F = 0;

    /* renamed from: G */
    public C94969x1 f275343G = new C94969x1();

    /* renamed from: H */
    public LinkedList<String> f275344H = new LinkedList<>();

    /* renamed from: I */
    public final C11385n f275345I = new C94975a();

    /* renamed from: a */
    public String f275346a = "";

    /* renamed from: b */
    public boolean f275347b = false;

    /* renamed from: c */
    public long f275348c = 3600;

    /* renamed from: d */
    public long f275349d = 86400;

    /* renamed from: e */
    public int f275350e = 5;

    /* renamed from: f */
    public int f275351f = 5;

    /* renamed from: g */
    public int f275352g = 50;

    /* renamed from: h */
    public int f275353h = 30;

    /* renamed from: i */
    public int f275354i = 5;

    /* renamed from: j */
    public long f275355j = 0;

    /* renamed from: k */
    public int f275356k = 0;

    /* renamed from: l */
    public Map<Long, Integer> f275357l = new HashMap();

    /* renamed from: m */
    public long f275358m = 0;

    /* renamed from: n */
    public List<Long> f275359n = new ArrayList();

    /* renamed from: o */
    public boolean f275360o = false;

    /* renamed from: p */
    public long f275361p = 0;

    /* renamed from: q */
    public int f275362q = 2;

    /* renamed from: r */
    public boolean f275363r = false;

    /* renamed from: s */
    public boolean f275364s = false;

    /* renamed from: t */
    public boolean f275365t = false;

    /* renamed from: u */
    public C99967m f275366u = new C99967m();

    /* renamed from: v */
    public C99968n f275367v = null;

    /* renamed from: w */
    public C99968n f275368w = null;

    /* renamed from: x */
    public long f275369x = 0;

    /* renamed from: y */
    public long f275370y = 0;

    /* renamed from: z */
    public long f275371z = 0;

    /* renamed from: com.tencent.mm.plugin.sns.model.y1$a */
    public class C94975a implements C11385n {
        public C94975a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
            if (yVar.getType() == 5987) {
                C86709a0.m107529k().f251779b.mo123470p(5987, this);
                if (((C98567o0) C86312j.m106911c(C98567o0.class)).mo137597wZ()) {
                    Log.m105924i("MicroMsg.SnsUnreadTipManager", "onBatchObjectDetailSceneEnd: use improveUI, skip");
                    SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
                    return;
                }
                SnsMethodCalculate.markStartTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
                C49969jb jbVar = ((C43034b0) yVar).f116490f;
                SnsMethodCalculate.markEndTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
                StringBuilder sb = new StringBuilder();
                C94974y1 y1Var = C94974y1.this;
                LinkedList<String> linkedList = new LinkedList<>();
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                y1Var.f275344H = linkedList;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                if (jbVar != null && !Util.isNullOrNil((List) jbVar.f135975d)) {
                    LinkedList<Long> linkedList2 = new LinkedList<>();
                    Iterator<SnsObject> it = jbVar.f135975d.iterator();
                    while (it.hasNext()) {
                        SnsObject next = it.next();
                        sb.append(next.Username);
                        sb.append(",");
                        if (!C94974y1.m120647a(C94974y1.this).contains(next.Username)) {
                            sb.append("**,");
                            C94974y1.m120647a(C94974y1.this).add(next.Username);
                            linkedList2.add(Long.valueOf(next.f283891Id));
                            if (C94974y1.m120647a(C94974y1.this).size() >= 3) {
                                break;
                            }
                        }
                    }
                    C94974y1 y1Var2 = C94974y1.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    C99968n nVar = y1Var2.f275340D;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    if (nVar != null) {
                        C94974y1 y1Var3 = C94974y1.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        C99968n nVar2 = y1Var3.f275340D;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        nVar2.f292924o = linkedList2;
                        C94974y1 y1Var4 = C94974y1.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        C99968n nVar3 = y1Var4.f275340D;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        nVar3.f292923n = C94974y1.m120647a(C94974y1.this);
                    }
                }
                if (!Util.isNullOrNil((List) C94974y1.m120647a(C94974y1.this))) {
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    C94977c cVar = C94974y1.f275336J;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    if (cVar != null) {
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        C94977c cVar2 = C94974y1.f275336J;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        cVar2.mo131312a(C94974y1.m120647a(C94974y1.this));
                    }
                }
                Log.m105925i("MicroMsg.SnsUnreadTipManager", "onBatchObjectDetailSceneEnd getAvatar, avatar:%s, size:%s", sb.toString(), Integer.valueOf(C94974y1.m120647a(C94974y1.this).size()));
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.y1$b */
    public class C94976b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C99968n f275373d;

        /* renamed from: e */
        public final /* synthetic */ List f275374e;

        /* renamed from: f */
        public final /* synthetic */ C99968n f275375f;

        /* renamed from: g */
        public final /* synthetic */ long f275376g;

        /* renamed from: h */
        public final /* synthetic */ String f275377h;

        /* renamed from: i */
        public final /* synthetic */ int f275378i;

        /* renamed from: j */
        public final /* synthetic */ long f275379j;

        public C94976b(C99968n nVar, List list, C99968n nVar2, long j, String str, int i, long j2) {
            this.f275373d = nVar;
            this.f275374e = list;
            this.f275375f = nVar2;
            this.f275376g = j;
            this.f275377h = str;
            this.f275378i = i;
            this.f275379j = j2;
        }

        public void run() {
            String str;
            String str2;
            int i;
            LinkedList linkedList;
            int i2;
            long j;
            String str3 = "run";
            String str4 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$6";
            SnsMethodCalculate.markStartTimeMs(str3, str4);
            if (this.f275373d != null) {
                TimelineMissReadJumpBtnExposureStruct F = SnsReportHelper.f275506m0.mo131345F();
                LinkedList linkedList2 = new LinkedList(this.f275373d.f292919g);
                linkedList2.removeAll(this.f275373d.f292916d);
                LinkedList linkedList3 = new LinkedList();
                LinkedList linkedList4 = new LinkedList();
                int i3 = 0;
                for (int i4 = 0; i4 < this.f275373d.f292919g.size(); i4++) {
                    C94974y1.m120648b(C94974y1.this);
                    if (i4 < i3 * 50) {
                        List list = (List) linkedList3.peekLast();
                        if (list != null) {
                            list.add(this.f275373d.f292919g.get(i4));
                        }
                    } else {
                        i3++;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f275373d.f292919g.get(i4));
                        linkedList3.add(arrayList);
                    }
                }
                int i5 = 0;
                for (int i6 = 0; i6 < linkedList2.size(); i6++) {
                    C94974y1.m120648b(C94974y1.this);
                    if (i6 < i5 * 50) {
                        List list2 = (List) linkedList4.peekLast();
                        if (list2 != null) {
                            list2.add((Long) linkedList2.get(i6));
                        }
                    } else {
                        i5++;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add((Long) linkedList2.get(i6));
                        linkedList4.add(arrayList2);
                    }
                }
                int max = Math.max(linkedList4.size(), linkedList3.size());
                long currentTimeMillis = System.currentTimeMillis();
                int i7 = 0;
                while (i7 < max) {
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    if (i7 < linkedList3.size()) {
                        List<Long> list3 = (List) linkedList3.get(i7);
                        i = list3.size();
                        for (Long longValue : list3) {
                            stringBuffer.append(C102236a0.m134763p0(longValue.longValue()));
                            stringBuffer.append("|");
                        }
                    } else {
                        i = 0;
                    }
                    if (i7 < linkedList4.size()) {
                        List<Long> list4 = (List) linkedList4.get(i7);
                        i2 = list4.size();
                        for (Long longValue2 : list4) {
                            stringBuffer2.append(C102236a0.m134763p0(longValue2.longValue()));
                            stringBuffer2.append("|");
                            linkedList3 = linkedList3;
                        }
                        linkedList = linkedList3;
                    } else {
                        linkedList = linkedList3;
                        i2 = 0;
                    }
                    Iterator it = this.f275374e.iterator();
                    LinkedList linkedList5 = linkedList4;
                    int i8 = 0;
                    int i9 = 0;
                    while (it.hasNext()) {
                        Iterator it4 = it;
                        C99968n nVar = (C99968n) it.next();
                        String str5 = str3;
                        C94974y1 y1Var = C94974y1.this;
                        String str6 = str4;
                        int i15 = max;
                        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        boolean i16 = y1Var.mo131308i(nVar);
                        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        if (!i16) {
                            i9++;
                        } else if (!Util.isNullOrNil((List) nVar.f292916d)) {
                            i8++;
                        }
                        str3 = str5;
                        it = it4;
                        str4 = str6;
                        max = i15;
                    }
                    String str7 = str3;
                    String str8 = str4;
                    int i17 = max;
                    C99968n nVar2 = this.f275375f;
                    if (nVar2 != null) {
                        if (!Util.isNullOrNil((List) nVar2.f292919g)) {
                            int size = this.f275375f.f292919g.size();
                            C99968n nVar3 = this.f275375f;
                            j = currentTimeMillis;
                            F.f266427t = (long) (size - nVar3.f292921i);
                            F.f266426s = (long) nVar3.f292919g.size();
                        } else {
                            j = currentTimeMillis;
                        }
                        if (!Util.isNullOrNil((List) this.f275375f.f292916d)) {
                            F.f266429v = this.f275375f.f292919g.peek().longValue();
                            StringBuffer stringBuffer3 = new StringBuffer();
                            Iterator<Long> it5 = this.f275375f.f292916d.iterator();
                            while (it5.hasNext()) {
                                stringBuffer3.append(C102236a0.m134763p0(it5.next().longValue()));
                                stringBuffer3.append("|");
                            }
                            F.f266428u = F.mo86045b("JumpBreakLayerFeeds", stringBuffer3.toString(), true);
                        }
                        if (!Util.isNullOrNil((List) this.f275375f.f292923n) && !Util.isNullOrNil((List) this.f275375f.f292924o)) {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            Iterator<String> it6 = this.f275375f.f292923n.iterator();
                            while (it6.hasNext()) {
                                stringBuffer4.append(it6.next());
                                stringBuffer4.append("#");
                            }
                            F.f266430w = F.mo86045b("AvatarList", stringBuffer4.toString(), true);
                            StringBuffer stringBuffer5 = new StringBuffer();
                            Iterator<Long> it7 = this.f275375f.f292924o.iterator();
                            while (it7.hasNext()) {
                                stringBuffer5.append(C102236a0.m134763p0(it7.next().longValue()));
                                stringBuffer5.append("#");
                            }
                            F.f266431x = F.mo86045b("IdList", stringBuffer5.toString(), true);
                        }
                    } else {
                        j = currentTimeMillis;
                    }
                    F.f266425r = this.f275376g;
                    F.f266411d = F.mo86045b("SessionId", this.f275377h, true);
                    F.f266412e = F.mo86045b("NewFeeds", stringBuffer.toString(), true);
                    F.f266413f = (long) i;
                    F.f266414g = F.mo86045b("ExposureNewFeeds", stringBuffer2.toString(), true);
                    F.f266415h = (long) i2;
                    F.f266416i = (long) i8;
                    F.f266417j = (long) i9;
                    F.f266418k = (long) this.f275378i;
                    F.f266423p = this.f275379j;
                    long j2 = j;
                    F.f266420m = j2;
                    F.f266421n = (long) i7;
                    max = i17;
                    F.f266422o = (long) max;
                    F.mo86054n();
                    i7++;
                    currentTimeMillis = j2;
                    linkedList4 = linkedList5;
                    str3 = str7;
                    linkedList3 = linkedList;
                    str4 = str8;
                }
                String str9 = str3;
                String str10 = str4;
                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                snsReportHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("resetTimelineMissReadExposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                snsReportHelper.f275520N = new TimelineMissReadJumpBtnExposureStruct();
                SnsMethodCalculate.markEndTimeMs("resetTimelineMissReadExposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                str = str9;
                str2 = str10;
            } else {
                String str11 = str4;
                str = str3;
                str2 = str11;
            }
            SnsMethodCalculate.markEndTimeMs(str, str2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.y1$c */
    public interface C94977c {
        /* renamed from: a */
        void mo131312a(LinkedList<String> linkedList);
    }

    /* renamed from: a */
    public static /* synthetic */ LinkedList m120647a(C94974y1 y1Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        LinkedList<String> linkedList = y1Var.f275344H;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return linkedList;
    }

    /* renamed from: b */
    public static /* synthetic */ int m120648b(C94974y1 y1Var) {
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        y1Var.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return 50;
    }

    /* renamed from: c */
    public void mo131302c(long j) {
        SnsMethodCalculate.markStartTimeMs("checkExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (this.f275347b && !Util.isNullOrNil((List) this.f275366u.f292913d) && !this.f275364s) {
            if (Util.isNullOrNil((List) this.f275359n)) {
                Log.m105924i("MicroMsg.SnsUnreadTipManager", "curExposeIdList isNullOrNil, return");
                SnsMethodCalculate.markEndTimeMs("checkExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                return;
            }
            long longValue = ((Long) ((ArrayList) this.f275359n).get(0)).longValue();
            if (Log.getLogLevel() <= 1) {
                Iterator it = ((ArrayList) this.f275359n).iterator();
                while (it.hasNext()) {
                    Log.m105919d("MicroMsg.SnsUnreadTipManager", "exposeId:%s", C102236a0.m134765q0(((Long) it.next()).longValue()));
                }
            }
            long j2 = this.f275369x;
            if (j2 != 0 && j == j2) {
                this.f275341E++;
                if (this.f275342F == 0 && j == j2) {
                    this.f275342F = (long) C31543z5.m39455e();
                }
            }
            Iterator<C99968n> it4 = this.f275366u.f292913d.iterator();
            while (it4.hasNext()) {
                C99968n next = it4.next();
                if (next == this.f275367v) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Long> it5 = next.f292916d.iterator();
                    while (it5.hasNext()) {
                        Long next2 = it5.next();
                        if (next2.longValue() >= longValue) {
                            arrayList.add(next2);
                        }
                    }
                    next.f292916d.removeAll(arrayList);
                    if (Util.isNullOrNil((List) next.f292916d)) {
                        this.f275367v = null;
                    }
                } else {
                    next.f292916d.removeAll(this.f275359n);
                }
            }
            long j3 = this.f275358m;
            if (j3 != 0 && longValue <= j3) {
                Log.m105925i("MicroMsg.SnsUnreadTipManager", "alreadyReachFirstFaultItem:%s, %s <= %s", Boolean.valueOf(this.f275363r), Long.valueOf(longValue), Long.valueOf(this.f275358m));
                this.f275363r = true;
                this.f275369x = 0;
                this.f275366u.f292914e = 0;
            }
            Log.m105925i("MicroMsg.SnsUnreadTipManager", "firstExposeId:%s, unreadCount:%s", C102236a0.m134765q0(longValue), Integer.valueOf(this.f275366u.f292913d.size()));
            SnsMethodCalculate.markStartTimeMs("dumpTargetInfo", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                C99968n nVar = this.f275367v;
                if (nVar != null) {
                    Log.m105925i("MicroMsg.SnsUnreadTipManager", "target:[%s, %s]", Long.valueOf(nVar.f292917e), Integer.valueOf(this.f275367v.f292916d.size()));
                } else {
                    Log.m105924i("MicroMsg.SnsUnreadTipManager", "target:null");
                }
                if (!Util.isNullOrNil((List) this.f275366u.f292913d)) {
                    Iterator<C99968n> it6 = this.f275366u.f292913d.iterator();
                    while (it6.hasNext()) {
                        C99968n next3 = it6.next();
                        StringBuilder sb = new StringBuilder();
                        Iterator<Long> it7 = next3.f292916d.iterator();
                        while (it7.hasNext()) {
                            sb.append(it7.next());
                            sb.append(",");
                        }
                        Log.m105925i("MicroMsg.SnsUnreadTipManager", "item:%s, idList:%s", Long.valueOf(next3.f292917e), sb.toString());
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("dumpTargetInfo", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        }
        SnsMethodCalculate.markEndTimeMs("checkExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
    }

    /* renamed from: d */
    public boolean mo131303d(long j) {
        C99968n nVar;
        SnsMethodCalculate.markStartTimeMs("checkUnreadBtnExpose", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        boolean z = false;
        if (this.f275347b && j != 0 && !this.f275363r && this.f275356k > this.f275351f && (nVar = this.f275367v) != null && nVar.f292918f == 1 && nVar.f292920h >= this.f275352g && this.f275360o) {
            SnsMethodCalculate.markStartTimeMs("exceedExposeInterval", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            boolean z2 = this.f275355j == 0 || ((long) C31543z5.m39455e()) - this.f275366u.f292915f > this.f275355j;
            SnsMethodCalculate.markEndTimeMs("exceedExposeInterval", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            if (z2 && j == this.f275369x) {
                z = true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkUnreadBtnExpose", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return z;
    }

    /* renamed from: e */
    public void mo131304e() {
        SnsMethodCalculate.markStartTimeMs("doReportExpose", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (!this.f275347b) {
            SnsMethodCalculate.markEndTimeMs("doReportExpose", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            return;
        }
        long j = this.f275338B;
        C99968n nVar = this.f275339C;
        C99968n nVar2 = this.f275340D;
        LinkedList linkedList = new LinkedList(this.f275366u.f292913d);
        int i = this.f275341E;
        long j2 = this.f275342F;
        String str = this.f275337A;
        this.f275341E = 0;
        this.f275342F = 0;
        C94866e1.my0().post(new C94976b(nVar, linkedList, nVar2, j2, str, i, j));
        SnsMethodCalculate.markEndTimeMs("doReportExpose", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b1  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo131305f() {
        /*
            r26 = this;
            r0 = r26
            java.lang.String r1 = "findTargetItem"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            ms2.m r3 = r0.f275366u
            long r4 = r3.f292914e
            r6 = 0
            r7 = 2
            r8 = 0
            java.lang.String r10 = "MicroMsg.SnsUnreadTipManager"
            r11 = 0
            r12 = 1
            int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x01b9
            java.util.LinkedList<ms2.n> r3 = r3.f292913d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 == 0) goto L_0x0023
            goto L_0x01b9
        L_0x0023:
            r0.f275367v = r6
            ms2.m r3 = r0.f275366u
            java.util.LinkedList<ms2.n> r3 = r3.f292913d
            int r3 = r3.size()
            int r3 = r3 - r12
        L_0x002e:
            r4 = 3
            if (r3 < 0) goto L_0x009e
            ms2.m r5 = r0.f275366u
            java.util.LinkedList<ms2.n> r5 = r5.f292913d
            java.lang.Object r5 = r5.get(r3)
            ms2.n r5 = (ms2.C99968n) r5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            boolean r13 = r0.mo131308i(r5)
            r13 = r13 ^ r12
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r6[r11] = r13
            java.util.LinkedList<java.lang.Long> r13 = r5.f292916d
            java.lang.Object r13 = r13.peek()
            r6[r12] = r13
            ms2.m r13 = r0.f275366u
            long r13 = r13.f292914e
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r6[r7] = r13
            java.lang.String r13 = "findTargetItem isValid:%s, item.idList.peek():%s, unreadSnsIdList.lastSnsId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r13, r6)
            boolean r6 = r0.mo131308i(r5)
            if (r6 != 0) goto L_0x0099
            java.util.LinkedList<java.lang.Long> r6 = r5.f292916d
            java.lang.Object r6 = r6.peek()
            java.lang.Long r6 = (java.lang.Long) r6
            long r13 = r6.longValue()
            ms2.m r6 = r0.f275366u
            long r8 = r6.f292914e
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0099
            r0.f275367v = r5
            java.lang.Object[] r3 = new java.lang.Object[r7]
            long r5 = r5.f292917e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r11] = r5
            ms2.n r5 = r0.f275367v
            java.util.LinkedList<java.lang.Long> r5 = r5.f292916d
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r12] = r5
            java.lang.String r5 = "findTargetItem result:[%s,%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r3)
            goto L_0x009e
        L_0x0099:
            int r3 = r3 + -1
            r8 = 0
            goto L_0x002e
        L_0x009e:
            ms2.n r3 = r0.f275367v
            if (r3 == 0) goto L_0x01a4
            ms2.m r5 = r0.f275366u
            long r5 = r5.f292914e
            r0.f275369x = r5
            java.util.LinkedList<java.lang.Long> r3 = r3.f292916d
            java.lang.Object r3 = r3.peek()
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r0.f275358m = r5
            java.lang.String r3 = "calculateFeedsGapCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            long r5 = r0.f275369x
            r8 = 0
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x010b
            ms2.n r5 = r0.f275367v
            if (r5 == 0) goto L_0x010b
            java.util.LinkedList<java.lang.Long> r5 = r5.f292916d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r5 != 0) goto L_0x010b
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r8 = r0.f275370y
            java.lang.String r6 = vr2.C102236a0.m134763p0(r8)
            ms2.n r8 = r0.f275367v
            java.util.LinkedList<java.lang.Long> r8 = r8.f292916d
            java.lang.Object r8 = r8.peek()
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            java.lang.String r8 = vr2.C102236a0.m134763p0(r8)
            int r5 = r5.mo139809TY(r6, r8)
            r0.f275356k = r5
            java.lang.Object[] r5 = new java.lang.Object[r7]
            long r8 = r0.f275369x
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r5[r11] = r6
            ms2.n r6 = r0.f275367v
            java.util.LinkedList<java.lang.Long> r6 = r6.f292916d
            java.lang.Object r6 = r6.peek()
            r5[r12] = r6
            java.lang.String r6 = "calculateFeedsGapCount up:%s down:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r5)
            goto L_0x010d
        L_0x010b:
            r0.f275356k = r11
        L_0x010d:
            java.lang.Object[] r5 = new java.lang.Object[r12]
            int r6 = r0.f275356k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r11] = r6
            java.lang.String r6 = "calculateFeedsGapCount:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            ms2.n r3 = r0.f275367v
            int r5 = r3.f292918f
            if (r5 != 0) goto L_0x01a4
            com.tencent.mm.plugin.sns.model.x1 r5 = r0.f275343G
            r5.getClass()
            java.lang.String r6 = "startPreload"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.model.SnsUnreadPreloader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            if (r3 == 0) goto L_0x01a1
            java.util.LinkedList<java.lang.Long> r9 = r3.f292916d
            java.util.List<java.lang.Long> r13 = r5.f275313d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.clear()
            java.util.List<java.lang.Long> r13 = r5.f275313d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.addAll(r9)
            r5.f275314e = r3
            java.util.List<java.lang.Long> r9 = r5.f275313d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
            if (r9 != 0) goto L_0x01a1
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            long r13 = r3.f292917e
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r9[r11] = r13
            java.util.LinkedList<java.lang.Long> r13 = r3.f292916d
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r12] = r13
            int r13 = r3.f292922j
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r7] = r13
            r9[r4] = r3
            java.lang.String r4 = "MicroMsg.SnsUnreadPreloader"
            java.lang.String r13 = "start preload unread fault:[%s, %s], preloadCount:%s, unreadItem:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r9)
            int r4 = r3.f292922j
            int r4 = r4 + r12
            r3.f292922j = r4
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            com.tencent.mm.plugin.sns.model.o0 r4 = new com.tencent.mm.plugin.sns.model.o0
            java.util.List<java.lang.Long> r5 = r5.f275313d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r11)
            java.lang.Long r5 = (java.lang.Long) r5
            long r13 = r5.longValue()
            r15 = 1
            long r14 = r13 + r15
            r16 = 0
            r18 = 2
            r13 = r4
            r13.<init>(r14, r16, r18)
            r3.mo123460f(r4)
        L_0x01a1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
        L_0x01a4:
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1295(0x50f, double:6.4E-321)
            r22 = 0
            ms2.m r3 = r0.f275366u
            java.util.LinkedList<ms2.n> r3 = r3.f292913d
            int r3 = r3.size()
            long r3 = (long) r3
            r24 = r3
            r19.mo175913w(r20, r22, r24)
            goto L_0x01d5
        L_0x01b9:
            r0.f275367v = r6
            r3 = 0
            r0.f275369x = r3
            ms2.m r5 = r0.f275366u
            r5.f292914e = r3
            r0.f275358m = r3
            java.lang.String r3 = "findTargetItem unreadSnsItems is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 1295(0x50f, double:6.4E-321)
            r16 = 0
            r18 = 0
            r13.mo175913w(r14, r16, r18)
        L_0x01d5:
            ms2.n r3 = r0.f275368w
            ms2.n r4 = r0.f275367v
            java.lang.String r5 = "isSnsUnreadTipFaultItemEqual"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            if (r3 != r4) goto L_0x01e7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
        L_0x01e4:
            r3 = 1
            goto L_0x025e
        L_0x01e7:
            if (r3 == 0) goto L_0x01eb
            if (r4 == 0) goto L_0x01ef
        L_0x01eb:
            if (r3 != 0) goto L_0x01f5
            if (r4 == 0) goto L_0x01f5
        L_0x01ef:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
        L_0x01f2:
            r3 = 0
            goto L_0x025e
        L_0x01f5:
            long r8 = r3.f292917e
            long r13 = r4.f292917e
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x025a
            int r6 = r3.f292918f
            int r8 = r4.f292918f
            if (r6 != r8) goto L_0x025a
            int r6 = r3.f292921i
            int r8 = r4.f292921i
            if (r6 != r8) goto L_0x025a
            int r6 = r3.f292920h
            int r8 = r4.f292920h
            if (r6 != r8) goto L_0x025a
            int r6 = r3.f292922j
            int r8 = r4.f292922j
            if (r6 == r8) goto L_0x0216
            goto L_0x025a
        L_0x0216:
            java.util.LinkedList<java.lang.Long> r6 = r3.f292919g
            if (r6 != 0) goto L_0x0222
            java.util.LinkedList<java.lang.Long> r8 = r4.f292919g
            if (r8 != 0) goto L_0x0222
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x01e4
        L_0x0222:
            if (r6 == 0) goto L_0x0256
            java.util.LinkedList<java.lang.Long> r8 = r4.f292919g
            if (r8 == 0) goto L_0x0256
            int r6 = r6.size()
            java.util.LinkedList<java.lang.Long> r8 = r4.f292919g
            int r8 = r8.size()
            if (r6 != r8) goto L_0x0256
            r6 = 0
        L_0x0235:
            java.util.LinkedList<java.lang.Long> r8 = r3.f292919g
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x0252
            java.util.LinkedList<java.lang.Long> r8 = r3.f292919g
            java.lang.Object r8 = r8.get(r6)
            java.util.LinkedList<java.lang.Long> r9 = r4.f292919g
            java.lang.Object r9 = r9.get(r6)
            if (r8 == r9) goto L_0x024f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x01f2
        L_0x024f:
            int r6 = r6 + 1
            goto L_0x0235
        L_0x0252:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x01e4
        L_0x0256:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x01f2
        L_0x025a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x01f2
        L_0x025e:
            ms2.n r4 = r0.f275367v
            if (r4 == 0) goto L_0x02af
            java.util.LinkedList<java.lang.Long> r4 = r4.f292916d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 != 0) goto L_0x02af
            java.util.LinkedList<java.lang.String> r4 = r0.f275344H
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 != 0) goto L_0x0274
            if (r3 != 0) goto L_0x02af
        L_0x0274:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            ms2.n r5 = r0.f275367v
            java.util.LinkedList<java.lang.Long> r5 = r5.f292916d
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r11] = r5
            java.lang.String r5 = "findTargetItem getAvatar, targetsize:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r4)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r0.f275344H = r4
            f40.g r4 = f40.C86709a0.m107529k()
            ob0.b0 r4 = r4.f251779b
            r5 = 5987(0x1763, float:8.39E-42)
            ob0.n r6 = r0.f275345I
            r4.mo123455a(r5, r6)
            f40.g r4 = f40.C86709a0.m107529k()
            ob0.b0 r4 = r4.f251779b
            com.tencent.mm.plugin.sns.model.b0 r5 = new com.tencent.mm.plugin.sns.model.b0
            ms2.n r6 = r0.f275367v
            java.util.LinkedList<java.lang.Long> r6 = r6.f292916d
            r5.<init>(r6)
            r4.mo123460f(r5)
        L_0x02af:
            if (r3 != 0) goto L_0x02b7
            ms2.n r3 = r0.f275367v
            r0.f275368w = r3
            r0.f275340D = r3
        L_0x02b7:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            long r4 = r0.f275358m
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r11] = r4
            long r4 = r0.f275369x
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r12] = r4
            java.lang.String r4 = "findTargetItem firstUnreadId:%s, indicatorSnsId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94974y1.mo131305f():void");
    }

    /* renamed from: g */
    public long mo131306g() {
        SnsMethodCalculate.markStartTimeMs("getLastUnreadTipFaultItemReadCache", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (!mo131309j(this.f275367v)) {
            SnsMethodCalculate.markEndTimeMs("getLastUnreadTipFaultItemReadCache", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            return -1;
        }
        long longValue = this.f275367v.f292916d.peek().longValue();
        SnsMethodCalculate.markEndTimeMs("getLastUnreadTipFaultItemReadCache", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return longValue;
    }

    /* renamed from: h */
    public LinkedList<String> mo131307h() {
        SnsMethodCalculate.markStartTimeMs("getTargetUserNames", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (this.f275367v == null) {
            Log.m105920e("MicroMsg.SnsUnreadTipManager", "getTargetUserNames targetItem is null");
            this.f275344H = new LinkedList<>();
        }
        LinkedList<String> linkedList = this.f275344H;
        SnsMethodCalculate.markEndTimeMs("getTargetUserNames", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return linkedList;
    }

    /* renamed from: i */
    public final boolean mo131308i(C99968n nVar) {
        SnsMethodCalculate.markStartTimeMs("isInvalidFault", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        boolean z = false;
        if (Util.isNullOrNil((List) nVar.f292916d) || nVar.f292916d.size() < this.f275350e || Util.secondsToNow(nVar.f292917e) > this.f275349d || Util.secondsToNow(nVar.f292917e) < this.f275348c || nVar.f292918f == 2) {
            SnsMethodCalculate.markEndTimeMs("isInvalidFault", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < nVar.f292916d.size(); i2++) {
            SnsInfo SE = C94866e1.Yx0().mo139806SE(nVar.f292916d.get(i2).longValue());
            if (SE == null || (SE.field_sourceType & 2) != 0) {
                i++;
            }
        }
        if (i < this.f275350e) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isInvalidFault", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return z;
    }

    /* renamed from: j */
    public final boolean mo131309j(C99968n nVar) {
        SnsMethodCalculate.markStartTimeMs("targetItemEnable", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        boolean z = nVar != null && !Util.isNullOrNil((List) nVar.f292916d);
        SnsMethodCalculate.markEndTimeMs("targetItemEnable", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return z;
    }

    /* renamed from: k */
    public void mo131310k() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("updateExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (this.f275347b) {
            SnsMethodCalculate.markStartTimeMs("getNewExposeFeedId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            ArrayList arrayList = new ArrayList();
            Map<String, Boolean> eP = ((C59774i) C86312j.m106911c(C59774i.class)).mo84752eP();
            if (eP == null || eP.size() == 0) {
                Log.m105918d("MicroMsg.SnsUnreadTipManager", "getLegalFeedId is NullOrNil");
                SnsMethodCalculate.markEndTimeMs("getNewExposeFeedId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            } else {
                for (Map.Entry entry : new HashMap(eP).entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        arrayList.add(Long.valueOf(C102236a0.m134706B0((String) entry.getKey())));
                    }
                }
                Collections.sort(arrayList);
                if (Util.isNullOrNil((List) arrayList)) {
                    Log.m105918d("MicroMsg.SnsUnreadTipManager", "exposeFeedList is NullOrNil");
                    SnsMethodCalculate.markEndTimeMs("getNewExposeFeedId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                } else {
                    SnsMethodCalculate.markEndTimeMs("getNewExposeFeedId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                }
            }
            synchronized (this.f275359n) {
                try {
                    ((ArrayList) this.f275359n).clear();
                    if (!Util.isNullOrNil((List) arrayList)) {
                        ((ArrayList) this.f275359n).addAll(arrayList);
                        long j = this.f275369x;
                        if (j != 0 && this.f275371z == 0) {
                            if (((ArrayList) this.f275359n).contains(Long.valueOf(j))) {
                                this.f275371z = (long) C31543z5.m39455e();
                            }
                        }
                    } else {
                        Log.m105924i("MicroMsg.SnsUnreadTipManager", "checkExposeFeeds newExposeSnsId isNullOrNil, return");
                    }
                } finally {
                    str = "updateExposeFeeds";
                    str2 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
        }
    }
}
