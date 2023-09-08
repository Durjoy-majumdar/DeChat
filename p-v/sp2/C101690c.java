package sp2;

import a14.C53901i0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58056k1;
import d14.C58087u0;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p206nj.C117627q;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C90107a;
import te3.C48952c4;
import te3.C51163rv3;
import te3.h64;
import te3.p64;
import te3.u84;
import vr2.C37817q;
import wx3.C66206a;
import wx3.C66212f;
import z04.C112551y;

/* renamed from: sp2.c */
public final class C101690c {

    /* renamed from: a */
    public static final C101690c f297710a = new C101690c();

    /* renamed from: b */
    public static final Map<String, C58087u0<C13604l<Boolean, u84>>> f297711b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<String, C58087u0<C13604l<Boolean, p64>>> f297712c = new LinkedHashMap();

    /* renamed from: d */
    public static final Map<String, Boolean> f297713d = new LinkedHashMap();

    /* renamed from: e */
    public static final List<C32224a<C13598b0>> f297714e = new ArrayList();

    /* renamed from: f */
    public static final Map<String, ADInfo> f297715f = new LinkedHashMap();

    /* renamed from: g */
    public static final C53901i0 f297716g = new C64144a(C53901i0.C39480a.f106019d);

    /* renamed from: sp2.c$a */
    public static final class C64144a extends C66206a implements C53901i0 {
        public C64144a(C53901i0.C39480a aVar) {
            super(aVar);
        }

        public void handleException(C66212f fVar, Throwable th) {
            SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$special$$inlined$CoroutineExceptionHandler$1");
            Log.m105920e("AdPullRequestHelper", "error = " + C90107a.m112736b(th));
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$special$$inlined$CoroutineExceptionHandler$1");
                throw th;
            }
            C37817q.m41546b("async_pull_ad_error_info", "0", 0, 0, "" + C112551y.m153814n(C90107a.m112736b(th), ",", ";", false));
            SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$special$$inlined$CoroutineExceptionHandler$1");
        }
    }

    static {
        int i = C53901i0.f151153a0;
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m133571a() {
        SnsMethodCalculate.markStartTimeMs("access$getPullAdReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        Map<String, C58087u0<C13604l<Boolean, p64>>> map = f297712c;
        SnsMethodCalculate.markEndTimeMs("access$getPullAdReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return map;
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m133572b() {
        SnsMethodCalculate.markStartTimeMs("access$getTimelineReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        Map<String, C58087u0<C13604l<Boolean, u84>>> map = f297711b;
        SnsMethodCalculate.markEndTimeMs("access$getTimelineReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return map;
    }

    /* renamed from: c */
    public static final void m133573c(String str, C13604l<Boolean, ? extends p64> lVar) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("emitAdPullReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        C87412m.m108594g(lVar, "state");
        Log.m105924i("AdPullRequestHelper", "emitAdPullReqState() called with: uuid = " + str + ", state = " + ((Boolean) lVar.f38555d).booleanValue());
        if (str == null) {
            str = "";
        }
        Map<String, C58087u0<C13604l<Boolean, p64>>> map = f297712c;
        synchronized (map) {
            try {
                if (!map.containsKey(str)) {
                    map.put(str, C58056k1.m67214a(lVar));
                    C13598b0 b0Var = C13598b0.f38549a;
                } else {
                    C58087u0 u0Var = (C58087u0) ((LinkedHashMap) map).get(str);
                    if (u0Var != null) {
                        u0Var.mo82832d(lVar);
                    }
                }
            } finally {
                str2 = "emitAdPullReqState";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
    }

    /* renamed from: d */
    public static final void m133574d(String str, C13604l<Boolean, ? extends u84> lVar) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("emitTimelineReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        C87412m.m108594g(lVar, "state");
        Log.m105924i("AdPullRequestHelper", "emitTimelineRequestState() called with: uuid = " + str + ", state = " + ((Boolean) lVar.f38555d).booleanValue());
        if (str == null) {
            str = "";
        }
        Map<String, C58087u0<C13604l<Boolean, u84>>> map = f297711b;
        synchronized (map) {
            try {
                if (!map.containsKey(str)) {
                    map.put(str, C58056k1.m67214a(lVar));
                    C13598b0 b0Var = C13598b0.f38549a;
                } else {
                    C58087u0 u0Var = (C58087u0) ((LinkedHashMap) map).get(str);
                    if (u0Var != null) {
                        u0Var.mo82832d(lVar);
                    }
                }
            } finally {
                str2 = "emitTimelineReqState";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
    }

    /* renamed from: e */
    public final ADInfo mo141138e(C48952c4 c4Var) {
        String str;
        String str2;
        String str3;
        ADInfo aDInfo;
        SnsMethodCalculate.markStartTimeMs("getAdInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        C51163rv3 rv32 = c4Var.f131490e;
        if (rv32 == null || (str = rv32.f141175d) == null) {
            str = "";
        }
        Log.m105924i("AdPullRequestHelper", "adinfoStr len = " + str.length());
        Map<String, ADInfo> map = f297715f;
        synchronized (map) {
            try {
                aDInfo = (ADInfo) ((LinkedHashMap) map).get(str);
                if (aDInfo == null) {
                    aDInfo = new ADInfo(str);
                    map.put(str, aDInfo);
                }
            } finally {
                str2 = "getAdInfoObj";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
        return aDInfo;
    }

    /* renamed from: f */
    public final C48952c4 mo141139f(C13604l<Boolean, ? extends p64> lVar) {
        SnsMethodCalculate.markStartTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        p64 p64 = (p64) lVar.f38556e;
        LinkedList<C48952c4> linkedList = p64 != null ? p64.f139609d : null;
        if (linkedList == null || linkedList.size() < 1) {
            Log.m105924i("AdPullRequestHelper", "AdPullReq  has no adobj!");
            SnsMethodCalculate.markEndTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        C48952c4 c4Var = linkedList.get(0);
        if (c4Var == null) {
            Log.m105924i("AdPullRequestHelper", "adPull adobj is null!");
            SnsMethodCalculate.markEndTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        Log.m105924i("AdPullRequestHelper", "adPull has adobj~");
        SnsMethodCalculate.markEndTimeMs("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return c4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r5 = r5.f134464d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo141140g(te3.C48952c4 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "getSnsId"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            te3.h64 r5 = r5.f131489d
            if (r5 == 0) goto L_0x0012
            com.tencent.mm.protocal.protobuf.SnsObject r5 = r5.f134464d
            if (r5 == 0) goto L_0x0012
            long r2 = r5.f283891Id
            goto L_0x0014
        L_0x0012:
            r2 = 0
        L_0x0014:
            java.lang.String r5 = vr2.C102236a0.m134765q0(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdvertiseList getSnsId = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "AdPullRequestHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.String r2 = "longToString(this.SnsADO…etSnsId = $it\")\n        }"
            gy3.C87412m.m108593f(r5, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.C101690c.mo141140g(te3.c4):java.lang.String");
    }

    /* renamed from: h */
    public final C48952c4 mo141141h(C13604l<Boolean, ? extends u84> lVar) {
        h64 h64;
        SnsObject snsObject;
        SnsMethodCalculate.markStartTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        u84 u84 = (u84) lVar.f38556e;
        LinkedList<C48952c4> linkedList = u84 != null ? u84.f299598o : null;
        if (linkedList == null || linkedList.size() < 1) {
            Log.m105924i("AdPullRequestHelper", "tlResult has no adobj!");
            SnsMethodCalculate.markEndTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        C48952c4 c4Var = linkedList.get(0);
        StringBuilder sb = new StringBuilder();
        sb.append("tlResult orgAd Id is ");
        sb.append((c4Var == null || (h64 = c4Var.f131489d) == null || (snsObject = h64.f134464d) == null) ? null : Long.valueOf(snsObject.f283891Id));
        Log.m105924i("AdPullRequestHelper", sb.toString());
        if (c4Var == null) {
            Log.m105924i("AdPullRequestHelper", "tlResult adObj is null!");
            SnsMethodCalculate.markEndTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        Log.m105924i("AdPullRequestHelper", "tlResult has obj~");
        SnsMethodCalculate.markEndTimeMs("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return c4Var;
    }

    /* renamed from: i */
    public final boolean mo141142i(String str) {
        String str2;
        String str3;
        boolean b;
        SnsMethodCalculate.markStartTimeMs("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        if (str == null) {
            Log.m105920e("AdPullRequestHelper", "this is null!");
            SnsMethodCalculate.markEndTimeMs("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return false;
        }
        Map<String, Boolean> map = f297713d;
        synchronized (map) {
            try {
                b = C87412m.m108589b(((LinkedHashMap) map).get(str), Boolean.TRUE);
                Log.m105924i("AdPullRequestHelper", "isExposed " + str + " = " + b);
            } finally {
                str2 = "isExposed";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
        return b;
    }

    /* renamed from: j */
    public final void mo141143j(C32224a<C13598b0> aVar) {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("registerOnAdPullListener", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("registerOnAdPullListener", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return;
        }
        List<C32224a<C13598b0>> list = f297714e;
        synchronized (list) {
            try {
                ((ArrayList) list).add(aVar);
                Log.m105924i("AdPullRequestHelper", "registerOnAdPullListener called adPullFunctions.size = " + ((ArrayList) list).size() + ' ');
                C13598b0 b0Var = C13598b0.f38549a;
            } finally {
                str = "registerOnAdPullListener";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper";
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        }
    }

    /* renamed from: k */
    public final String mo141144k(String str) {
        SnsMethodCalculate.markStartTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        String b = C117627q.m165909b(str, "UTF-8");
        C87412m.m108593f(b, "encode(this, \"UTF-8\")");
        SnsMethodCalculate.markEndTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return b;
    }
}
