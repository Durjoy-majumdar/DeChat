package ds2;

import c03.C92332a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import f30.C86705b;
import g30.C87122a;
import g30.C87124c;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import os2.C100404f0;
import p30.C89312a;
import p749xh.C102661q8;
import pe3.C47465a;
import sx3.C110818d0;
import te3.C101789j00;
import te3.C101804kv2;
import zt3.C119157j;

/* renamed from: ds2.h */
public final class C97535h {

    /* renamed from: a */
    public static final C97535h f286229a = new C97535h();

    /* renamed from: b */
    public static C86396e f286230b;

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C97529a> f286231c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final ConcurrentHashMap<String, String> f286232d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final HashSet<String> f286233e = new HashSet<>();

    /* renamed from: f */
    public static int f286234f;

    /* renamed from: g */
    public static int f286235g;

    /* renamed from: h */
    public static int f286236h;

    /* renamed from: i */
    public static int f286237i;

    /* renamed from: j */
    public static boolean f286238j;

    /* renamed from: k */
    public static final C87122a f286239k = new C97536a();

    /* renamed from: ds2.h$a */
    public static final class C97536a implements C87122a {
        /* renamed from: a */
        public void mo121568a(C86705b bVar) {
            SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
            C87412m.m108594g(bVar, "item");
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", IXWebBroadcastListener.STAGE_START);
            Object extra = bVar.getExtra();
            SnsInfo snsInfo = extra instanceof SnsInfo ? (SnsInfo) extra : null;
            if (snsInfo != null) {
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "start >> snsId: " + snsInfo.getSnsId());
                C97535h hVar = C97535h.f286229a;
                SnsMethodCalculate.markStartTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ConcurrentHashMap<String, C97529a> concurrentHashMap = C97535h.f286231c;
                SnsMethodCalculate.markEndTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                C97529a put = concurrentHashMap.put(snsInfo.getSnsId(), new C97529a(C97530b.START, System.currentTimeMillis(), 0));
            }
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
        }

        /* renamed from: b */
        public void mo121569b(C86705b bVar, long j, boolean z) {
            String str;
            String str2;
            long j2 = j;
            boolean z2 = z;
            SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
            C87412m.m108594g(bVar, "item");
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", "finish >> " + z2 + ", " + j2);
            Object extra = bVar.getExtra();
            SnsInfo snsInfo = extra instanceof SnsInfo ? (SnsInfo) extra : null;
            if (snsInfo != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("finish >> ");
                sb.append(snsInfo.getSnsId());
                sb.append(", ");
                sb.append(snsInfo.getCreateTime());
                sb.append(", ");
                C97535h hVar = C97535h.f286229a;
                SnsMethodCalculate.markStartTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                int i = C97535h.f286236h;
                SnsMethodCalculate.markEndTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                sb.append(i);
                sb.append(", ");
                SnsMethodCalculate.markStartTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                int i2 = C97535h.f286237i;
                SnsMethodCalculate.markEndTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                sb.append(i2);
                sb.append(", ");
                SnsMethodCalculate.markStartTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                boolean z3 = C97535h.f286238j;
                SnsMethodCalculate.markEndTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                sb.append(z3);
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", sb.toString());
                SnsMethodCalculate.markStartTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                ConcurrentHashMap<String, C97529a> concurrentHashMap = C97535h.f286231c;
                SnsMethodCalculate.markEndTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                C97529a aVar = concurrentHashMap.get(snsInfo.getSnsId());
                if (aVar != null) {
                    C97530b bVar2 = z2 ? C97530b.FINISH_V2 : C97530b.FINISH_V4;
                    SnsMethodCalculate.markStartTimeMs("setPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                    aVar.f286211a = bVar2;
                    SnsMethodCalculate.markEndTimeMs("setPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                    SnsMethodCalculate.markStartTimeMs("setPredictCost", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                    aVar.f286213c = j2;
                    SnsMethodCalculate.markEndTimeMs("setPredictCost", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                    str2 = "finish";
                } else {
                    Log.m105928w("MicroMsg.SnsKaraOptionConfig", "when finish but no have sns info " + snsInfo.getSnsId());
                    SnsMethodCalculate.markStartTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    SnsMethodCalculate.markEndTimeMs("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    String snsId = snsInfo.getSnsId();
                    str2 = "finish";
                    C97529a aVar2 = r0;
                    C97529a aVar3 = new C97529a(z2 ? C97530b.FINISH_V2 : C97530b.FINISH_V4, 0, j);
                    C97529a put = concurrentHashMap.put(snsId, aVar2);
                }
                int createTime = snsInfo.getCreateTime();
                SnsMethodCalculate.markStartTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                int i3 = C97535h.f286236h;
                SnsMethodCalculate.markEndTimeMs("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                if (createTime == i3) {
                    SnsMethodCalculate.markStartTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    boolean z4 = C97535h.f286238j;
                    SnsMethodCalculate.markEndTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    if (z4) {
                        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "is reach max");
                        SnsMethodCalculate.markStartTimeMs("getAfterMaxToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                        ((C119157j) C119157j.f356862d).mo183876g(C97533f.f286227d, "THREAD_SNS_KARA_OPTION");
                        SnsMethodCalculate.markEndTimeMs("getAfterMaxToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    }
                }
                int createTime2 = snsInfo.getCreateTime();
                SnsMethodCalculate.markStartTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                int i4 = C97535h.f286237i;
                SnsMethodCalculate.markEndTimeMs("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                if (createTime2 == i4) {
                    SnsMethodCalculate.markStartTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    boolean z5 = C97535h.f286238j;
                    SnsMethodCalculate.markEndTimeMs("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    if (z5) {
                        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "is reach min");
                        SnsMethodCalculate.markStartTimeMs("getBeforeMinToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                        ((C119157j) C119157j.f356862d).mo183876g(C97534g.f286228d, "THREAD_SNS_KARA_OPTION");
                        SnsMethodCalculate.markEndTimeMs("getBeforeMinToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    }
                }
                str = str2;
            } else {
                str = "finish";
            }
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
        }
    }

    /* renamed from: ds2.h$b */
    public static final class C97537b implements Runnable {

        /* renamed from: d */
        public static final C97537b f286240d = new C97537b();

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$startKaraPredict$1");
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict >> " + C97535h.m125670a() + ", " + C97535h.m125671b());
            if (C97535h.m125670a() == 0 || C97535h.m125670a() == 0) {
                SnsMethodCalculate.markStartTimeMs("getSnsInfoLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
                List<SnsInfo> multiQuery = C102661q8.TABLE.selectAll().orderBy(C102661q8.CREATETIME.orderDesc()).limit(100, 0).build().multiQuery(C94866e1.Bx0(), SnsInfo.class);
                Log.m105924i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLimit >>  size: " + multiQuery.size() + ", limit: " + 100);
                for (SnsInfo snsInfo : multiQuery) {
                    Log.m105924i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLimit >> " + snsInfo.getCreateTime() + ", " + snsInfo.getSnsId() + ". " + snsInfo.localid);
                }
                SnsMethodCalculate.markEndTimeMs("getSnsInfoLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict getSnsInfoLimit >> " + multiQuery.size());
                if (!multiQuery.isEmpty()) {
                    C97535h hVar = C97535h.f286229a;
                    int createTime = ((SnsInfo) C110818d0.m150914L(multiQuery)).getCreateTime();
                    SnsMethodCalculate.markStartTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    C97535h.f286234f = createTime;
                    SnsMethodCalculate.markEndTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    int createTime2 = ((SnsInfo) C110818d0.m150923U(multiQuery)).getCreateTime();
                    SnsMethodCalculate.markStartTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    C97535h.f286235g = createTime2;
                    SnsMethodCalculate.markEndTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    C97535h.m125672c(C97535h.f286229a, (ArrayList) multiQuery, true, C97531c.FIRST);
                }
            } else {
                C100404f0 f0Var = C100404f0.f294118a;
                List<SnsInfo> a = f0Var.mo139845a(C97535h.m125670a());
                List<SnsInfo> b = f0Var.mo139846b(C97535h.m125671b(), 50);
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict getSnsInfoLargeThanCreateTime >> " + a.size());
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "startKaraPredict getSnsInfoSmallThanCreateTimeAndLimit >> " + b.size());
                if (!a.isEmpty()) {
                    int createTime3 = ((SnsInfo) C110818d0.m150914L(a)).getCreateTime();
                    SnsMethodCalculate.markStartTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    C97535h.f286234f = createTime3;
                    SnsMethodCalculate.markEndTimeMs("access$setMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    C97535h.m125672c(C97535h.f286229a, (ArrayList) a, true, C97531c.AFTER_MAX);
                }
                if (!b.isEmpty()) {
                    int createTime4 = ((SnsInfo) C110818d0.m150923U(b)).getCreateTime();
                    SnsMethodCalculate.markStartTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    C97535h.f286235g = createTime4;
                    SnsMethodCalculate.markEndTimeMs("access$setMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    C97535h.m125672c(C97535h.f286229a, (ArrayList) b, true, C97531c.BEFORE_MIN);
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$startKaraPredict$1");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ int m125670a() {
        SnsMethodCalculate.markStartTimeMs("access$getMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        int i = f286234f;
        SnsMethodCalculate.markEndTimeMs("access$getMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return i;
    }

    /* renamed from: b */
    public static final /* synthetic */ int m125671b() {
        SnsMethodCalculate.markStartTimeMs("access$getMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        int i = f286235g;
        SnsMethodCalculate.markEndTimeMs("access$getMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return i;
    }

    /* renamed from: c */
    public static final void m125672c(C97535h hVar, ArrayList arrayList, boolean z, C97531c cVar) {
        boolean z2 = z;
        SnsMethodCalculate.markStartTimeMs("access$setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        hVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + arrayList.size());
        if (arrayList.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = new ArrayList();
            SnsMethodCalculate.markStartTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            boolean z3 = false;
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_ws_small_win_video_enable, false);
            Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + wf);
            SnsMethodCalculate.markEndTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + arrayList2.size() + ", " + wf + ", " + z2);
            StringBuilder sb = new StringBuilder();
            sb.append("after check ");
            sb.append(arrayList2.size());
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", sb.toString());
            Iterator it = arrayList2.iterator();
            while (true) {
                boolean z4 = true;
                if (!it.hasNext()) {
                    break;
                }
                SnsInfo snsInfo = (SnsInfo) it.next();
                if (!z2 || !f286231c.containsKey(snsInfo.getSnsId())) {
                    z4 = false;
                }
                if (z4) {
                    Log.m105924i("MicroMsg.SnsKaraOptionConfig", "isPredicted >> " + snsInfo.getSnsId());
                } else {
                    C97535h hVar2 = f286229a;
                    C87412m.m108593f(snsInfo, LocaleUtil.ITALIAN);
                    if (hVar2.mo136804d(snsInfo, wf)) {
                        ConcurrentHashMap<String, C97529a> concurrentHashMap = f286231c;
                        String snsId = snsInfo.getSnsId();
                        C87412m.m108593f(snsId, "it.snsId");
                        concurrentHashMap.put(snsId, new C97529a(C97530b.SUBMIT, 0, 0));
                        arrayList3.add(snsInfo);
                    }
                }
            }
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> after deal targetList size : " + arrayList3.size());
            C86396e eVar = f286230b;
            if (eVar == null) {
                Log.m105920e("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> but callback is null");
                SnsMethodCalculate.markEndTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            } else {
                ArrayList<C86705b> a = ((C89312a) eVar).mo123660a(arrayList3);
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + Integer.valueOf(a.size()));
                if (!arrayList3.isEmpty()) {
                    int type = cVar.getType();
                    if (type == C97531c.FIRST.getType()) {
                        f286236h = ((SnsInfo) C110818d0.m150914L(arrayList3)).getCreateTime();
                        f286237i = ((SnsInfo) C110818d0.m150923U(arrayList3)).getCreateTime();
                    } else if (type == C97531c.AFTER_MAX.getType()) {
                        f286234f = ((SnsInfo) C110818d0.m150914L(arrayList3)).getCreateTime();
                    } else if (type == C97531c.BEFORE_MIN.getType()) {
                        f286235g = ((SnsInfo) C110818d0.m150923U(arrayList3)).getCreateTime();
                    }
                }
                if (a.isEmpty()) {
                    z3 = true;
                }
                if (!z3) {
                    C87124c.m108148a(a, f286239k);
                }
                SnsMethodCalculate.markEndTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }

    /* renamed from: d */
    public final boolean mo136804d(SnsInfo snsInfo, boolean z) {
        SnsMethodCalculate.markStartTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        C87412m.m108594g(snsInfo, "snsInfo");
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> " + snsInfo.getSnsId() + ", wsConfig: " + z);
        TimeLineObject timeLine = snsInfo.getTimeLine();
        C87412m.m108593f(timeLine, "snsInfo.timeLine");
        C101789j00 j002 = timeLine.ContentObj;
        C101804kv2 kv22 = null;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        if (!(linkedList == null || linkedList.isEmpty())) {
            kv22 = linkedList.get(0);
        }
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        } else if (snsInfo.isAd() || kv22.f298681N) {
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " is ad");
            SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        } else if (kv22.f298684R * ((float) 1000) <= ((float) C92332a.f264193g)) {
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " is toLow");
            SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        } else if (snsInfo.getUserName().equals(C94866e1.Mx0())) {
            Log.m105924i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " is self");
            SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        } else {
            C47465a parseFrom = new SnsObject().parseFrom(snsInfo.field_attrBuf);
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
            if (((SnsObject) parseFrom).WeiShangVideoSourceType == 1) {
                SnsMethodCalculate.markStartTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_ws_small_win_video_enable, false);
                Log.m105924i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + wf);
                SnsMethodCalculate.markEndTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
                if (wf) {
                    kv22.f298687U = "V4";
                    Log.m105924i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " mediaId:" + kv22.f298689d + " no to predict for weiShang");
                    SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    return false;
                }
            }
            ConcurrentHashMap<String, String> concurrentHashMap = f286232d;
            String str = kv22.f298689d;
            C87412m.m108593f(str, "media.Id");
            String snsId = snsInfo.getSnsId();
            C87412m.m108593f(snsId, "snsInfo.snsId");
            concurrentHashMap.put(str, snsId);
            SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return true;
        }
    }

    /* renamed from: e */
    public final C97529a mo136805e(String str) {
        C97530b bVar;
        SnsMethodCalculate.markStartTimeMs("getPredictTypeBySnsId", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        C87412m.m108594g(str, "snsId");
        C97529a aVar = f286231c.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("getPredictTypeBySnsId >> ");
        sb.append(str);
        sb.append(", ");
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("getPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            bVar = aVar.f286211a;
            SnsMethodCalculate.markEndTimeMs("getPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        } else {
            bVar = null;
        }
        sb.append(bVar);
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", sb.toString());
        SnsMethodCalculate.markEndTimeMs("getPredictTypeBySnsId", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return aVar;
    }

    /* renamed from: f */
    public final void mo136806f(SnsInfo snsInfo) {
        ArrayList<C86705b> arrayList;
        SnsMethodCalculate.markStartTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        C87412m.m108594g(snsInfo, "snsInfo");
        C31280k kVar = C31280k.f83760a;
        if (kVar.mo58046a()) {
            boolean z = true;
            if (kVar.mo58048c() == 1) {
                boolean d = kVar.mo58049d();
                boolean d2 = mo136804d(snsInfo, d);
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setPreSnsInfoToPredict >> " + d + ", " + snsInfo.getSnsId() + ", " + d2);
                if (d2) {
                    C86396e eVar = f286230b;
                    if (eVar == null) {
                        Log.m105920e("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> but callback is null");
                        SnsMethodCalculate.markEndTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                        return;
                    }
                    Integer num = null;
                    if (eVar != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(snsInfo);
                        arrayList = ((C89312a) eVar).mo123660a(arrayList2);
                    } else {
                        arrayList = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("setSnsInfoToPredict >> ");
                    if (arrayList != null) {
                        num = Integer.valueOf(arrayList.size());
                    }
                    sb.append(num);
                    Log.m105924i("MicroMsg.SnsKaraOptionConfig", sb.toString());
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        C87124c.m108148a(arrayList, f286239k);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                return;
            }
        }
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setPreSnsInfoToPredict >> is no to predict");
        SnsMethodCalculate.markEndTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }

    /* renamed from: g */
    public final void mo136807g() {
        SnsMethodCalculate.markStartTimeMs("startKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        f286238j = true;
        ((C119157j) C119157j.f356862d).mo183876g(C97537b.f286240d, "THREAD_SNS_KARA_OPTION");
        SnsMethodCalculate.markEndTimeMs("startKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }
}
