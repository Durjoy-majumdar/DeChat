package com.tencent.p014mm.plugin.sns.statistics;

import android.app.Activity;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsPublishProcessStruct;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dm2.C58325i;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i21.C60242i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import k21.C60959b;
import k21.C60960c;
import kj2.C61103a;
import ms2.C61577h;
import org.json.JSONObject;
import p606mm.C99933h;
import p749xh.C38549d8;
import pe3.C47465a;
import rx3.C13598b0;
import th2.C110992d;
import vr2.C102236a0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.sns.statistics.l */
public final class C57354l {

    /* renamed from: a */
    public static final C57355a f164333a = new C57355a((C8480h) null);

    /* renamed from: b */
    public static boolean f164334b;

    /* renamed from: c */
    public static HashMap<String, Integer> f164335c = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.sns.statistics.l$a */
    public static final class C57355a {

        /* renamed from: com.tencent.mm.plugin.sns.statistics.l$a$a */
        public static final class C57356a extends C87413o implements C32226l<C61577h, C13598b0> {

            /* renamed from: d */
            public static final C57356a f164336d = new C57356a();

            public C57356a() {
                super(1);
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
                C61577h hVar = (C61577h) obj;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
                C87412m.m108594g(hVar, "snsPostCgiReportObj");
                C60960c.C60961a aVar = C60960c.f173618a;
                aVar.mo85926j("SnsPublishProcess", "cgiReconnectCnt", Integer.valueOf(hVar.f175144e));
                if (!Util.isNullOrNil(hVar.f175145f)) {
                    String str = hVar.f175145f;
                    C87412m.m108593f(str, "snsPostCgiReportObj.cgiresult");
                    aVar.mo85926j("SnsPublishProcess", "cgiresult", str);
                }
                aVar.mo85926j("SnsPublishProcess", "returnDuration", Integer.valueOf((int) (C31543z5.m39453c() - hVar.f175146g)));
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
                return b0Var;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.statistics.l$a$b */
        public static final class C57357b<T extends C47465a> implements C58325i {

            /* renamed from: a */
            public final /* synthetic */ String f164337a;

            /* renamed from: b */
            public final /* synthetic */ C32226l<C61577h, C13598b0> f164338b;

            public C57357b(String str, C32226l<? super C61577h, C13598b0> lVar) {
                this.f164337a = str;
                this.f164338b = lVar;
            }

            /* renamed from: a */
            public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
                SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
                C61577h hVar = (C61577h) aVar;
                SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
                if (hVar == null) {
                    C61577h hVar2 = new C61577h();
                    hVar2.f175143d = this.f164337a;
                    this.f164338b.invoke(hVar2);
                } else {
                    this.f164338b.invoke(hVar);
                }
                SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
                SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
            }
        }

        public C57355a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo80964a(String str, int i) {
            SnsMethodCalculate.markStartTimeMs("addContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(str, "userName");
            mo80970g().put(str, Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("addContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: b */
        public final void mo80965b(int i) {
            SnsMethodCalculate.markStartTimeMs("addTraceFromUIAction", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            int i2 = i != 14 ? i != 17 ? -1 : 8 : 7;
            if (i2 != -1 && i2 == 8) {
                C60960c.C60961a aVar = C60960c.f173618a;
                Integer valueOf = Integer.valueOf(i2);
                C60242i iVar = C60242i.ACTIONTRACE;
                aVar.mo85927k("SnsPublishProcess", "actionTrace_", valueOf, iVar);
                aVar.mo85927k("SnsPublishProcess", "actionTrace_", 5, iVar);
            }
            SnsMethodCalculate.markEndTimeMs("addTraceFromUIAction", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: c */
        public final void mo80966c(String str) {
            SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            if (str != null) {
                mo80971h(str, C57356a.f164336d);
            }
            C60960c.C60961a aVar = C60960c.f173618a;
            if (aVar.mo85921e("SnsPublishProcess") == null) {
                String e = C24560g0.m30725a(SnsPublishProcessStruct.class).mo51262e();
                C87412m.m108591d(e);
                aVar.mo85925i("SnsPublishProcess", e);
                String l = C102236a0.m134754l();
                C87412m.m108593f(l, "sessionId");
                aVar.mo85926j("SnsPublishProcess", "sessionid_", l);
                C110992d.f332425a.mo162677k("moment_sessionid_", l);
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (Map.Entry<String, Integer> value : mo80970g().entrySet()) {
                int intValue = ((Number) value.getValue()).intValue();
                if (intValue == 1) {
                    i++;
                } else if (intValue == 2) {
                    i2++;
                } else if (intValue == 3) {
                    i3++;
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("singlechat", i);
            jSONObject.put("groupchat", i2);
            jSONObject.put("contact", i3);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "withFriendInfo.toString()");
            String o = C112551y.m153815o(jSONObject2, ',', ';', false, 4, (Object) null);
            C60960c.C60961a aVar2 = C60960c.f173618a;
            aVar2.mo85926j("SnsPublishProcess", "withFriendInfo", o);
            C60960c.C60961a.m71444b(aVar2, "SnsPublishProcess", false, false, 6, (Object) null);
            SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: d */
        public final void mo80967d(ArrayList<String> arrayList) {
            SnsMethodCalculate.markStartTimeMs("firstIntoEditPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(arrayList, "imageList");
            C60960c.C60961a aVar = C60960c.f173618a;
            SnsMethodCalculate.markStartTimeMs("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            int i = 0;
            if (!Util.isNullOrNil((List) arrayList)) {
                for (String j : arrayList) {
                    if (C57354l.f164333a.mo80973j(j)) {
                        i++;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            } else {
                SnsMethodCalculate.markEndTimeMs("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            }
            aVar.mo85926j("SnsPublishProcess", "firstEditPageShotMedia", Integer.valueOf(i));
            C60960c.f173618a.mo85926j("SnsPublishProcess", "firstEditPageMedia", Integer.valueOf(arrayList.size()));
            SnsMethodCalculate.markEndTimeMs("firstIntoEditPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: e */
        public final void mo80968e(boolean z) {
            SnsMethodCalculate.markStartTimeMs("firstIntoEditPageVideo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C60960c.C60961a aVar = C60960c.f173618a;
            aVar.mo85926j("SnsPublishProcess", "firstEditPageShotMedia", Integer.valueOf(z ? 1 : 0));
            aVar.mo85926j("SnsPublishProcess", "endSessionShotMedia", Integer.valueOf(z));
            SnsMethodCalculate.markEndTimeMs("firstIntoEditPageVideo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: f */
        public final void mo80969f(Activity activity) {
            SnsMethodCalculate.markStartTimeMs("fromPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C60960c.f173618a.mo85926j("SnsPublishProcess", "fromPage", Integer.valueOf(((activity instanceof SnsTimeLineUI) || (activity instanceof ImproveSnsTimelineUI)) ? 1 : activity instanceof SnsUserUI ? 2 : 0));
            SnsMethodCalculate.markEndTimeMs("fromPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: g */
        public final HashMap<String, Integer> mo80970g() {
            SnsMethodCalculate.markStartTimeMs("getContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getContactTypeList$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            HashMap<String, Integer> hashMap = C57354l.f164335c;
            SnsMethodCalculate.markEndTimeMs("access$getContactTypeList$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            SnsMethodCalculate.markEndTimeMs("getContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            return hashMap;
        }

        /* renamed from: h */
        public final void mo80971h(String str, C32226l<? super C61577h, C13598b0> lVar) {
            SnsMethodCalculate.markStartTimeMs("getSecData", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(str, "id");
            C87412m.m108594g(lVar, "callback");
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(16, str, C61577h.class, new C57357b(str, lVar));
            SnsMethodCalculate.markEndTimeMs("getSecData", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: i */
        public final void mo80972i() {
            Class<SnsPublishProcessStruct> cls = SnsPublishProcessStruct.class;
            SnsMethodCalculate.markStartTimeMs("intoHomePage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            SnsMethodCalculate.markStartTimeMs("setDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            SnsMethodCalculate.markStartTimeMs("access$setDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            boolean z = false;
            C57354l.f164334b = false;
            SnsMethodCalculate.markEndTimeMs("access$setDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            SnsMethodCalculate.markEndTimeMs("setDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C60960c.C60961a aVar = C60960c.f173618a;
            String e = C24560g0.m30725a(cls).mo51262e();
            C87412m.m108591d(e);
            aVar.mo85925i("SnsPublishProcess", e);
            String l = C102236a0.m134754l();
            C87412m.m108593f(l, "sessionId");
            aVar.mo85926j("SnsPublishProcess", "sessionid_", l);
            C110992d.f332425a.mo162677k("moment_sessionid_", l);
            aVar.mo85927k("SnsPublishProcess", "actionTrace_", 1, C60242i.ACTIONTRACE);
            if (BuildInfo.DEBUG) {
                SnsMethodCalculate.markStartTimeMs("testStaticKvStat", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
                String e2 = C24560g0.m30725a(cls).mo51262e();
                C87412m.m108591d(e2);
                aVar.mo85925i("SnsPublishProcessTest", e2);
                C60959b e3 = aVar.mo85921e("SnsPublishProcessTest");
                if (e3 != null) {
                    z = true;
                }
                Assert.assertTrue(z);
                aVar.mo85926j("SnsPublishProcessTest", "mediaSource_", "3");
                aVar.mo85935t("SnsPublishProcessTest", "mediaMD5_", C30425p.f82060d);
                aVar.mo85935t("SnsPublishProcessTest", "sessionid_", C43044q.f116517d);
                C60242i iVar = C60242i.APPEND;
                aVar.mo85927k("SnsPublishProcessTest", "privacyPageStaytime_", 1000, iVar);
                aVar.mo85927k("SnsPublishProcessTest", "editPageStaytime_", 1000, iVar);
                aVar.mo85927k("SnsPublishProcessTest", "editPageStaytime_", 1000, iVar);
                Assert.assertTrue(aVar.mo85923g("SnsPublishProcessTest") instanceof SnsPublishProcessStruct);
                C61103a g = aVar.mo85923g("SnsPublishProcessTest");
                C87412m.m108592e(g, "null cannot be cast to non-null type com.tencent.mm.autogen.mmdata.rpt.SnsPublishProcessStruct");
                C60960c.C60961a.m71444b(aVar, "SnsPublishProcessTest", false, false, 6, (Object) null);
                new MMHandler().postDelayed(new C57360r((SnsPublishProcessStruct) g, e3), 2100);
                SnsMethodCalculate.markEndTimeMs("testStaticKvStat", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            }
            aVar.mo85926j("SnsPublishProcess", "ifShowActionSheet", Integer.valueOf(SnsTimeLineUI.m122313w8() ^ true ? 1 : 0));
            SnsMethodCalculate.markEndTimeMs("intoHomePage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: j */
        public final boolean mo80973j(String str) {
            SnsMethodCalculate.markStartTimeMs("isCameraPic", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(str, "path");
            boolean u = C112550d0.m153801u(str, "photoEdited_", false);
            SnsMethodCalculate.markEndTimeMs("isCameraPic", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            return u;
        }

        /* renamed from: k */
        public final void mo80974k(String str) {
            SnsMethodCalculate.markStartTimeMs("removeContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(str, "userName");
            mo80970g().remove(str);
            SnsMethodCalculate.markEndTimeMs("removeContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: l */
        public final void mo80975l(JSONObject jSONObject) {
            SnsMethodCalculate.markStartTimeMs("setContactTypeListJSON", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(jSONObject, "list");
            mo80970g().clear();
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "list.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                C57354l.f164333a.mo80970g().put(next, Integer.valueOf(jSONObject.getInt(next)));
            }
            SnsMethodCalculate.markEndTimeMs("setContactTypeListJSON", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: m */
        public final void mo80976m(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            long j;
            SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            if (z7) {
                j = 9;
            } else {
                SnsMethodCalculate.markStartTimeMs("isDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
                SnsMethodCalculate.markStartTimeMs("access$isDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
                boolean z9 = C57354l.f164334b;
                SnsMethodCalculate.markEndTimeMs("access$isDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
                SnsMethodCalculate.markEndTimeMs("isDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
                if (z9) {
                    j = 4;
                } else {
                    if (!z6) {
                        if (z3) {
                            j = 6;
                        } else if (z) {
                            j = 1;
                        } else if (z2) {
                            j = 2;
                        } else if (i == 9 || i == 8) {
                            j = 3;
                        } else if (i != 14 || z4) {
                            j = (!z5 && z8) ? 13 : 5;
                        }
                    }
                    j = 7;
                }
            }
            C60960c.C60961a aVar = C60960c.f173618a;
            if (!C87412m.m108589b(aVar.mo85922f("SnsPublishProcess").f173614c.get("source_"), 10L)) {
                aVar.mo85926j("SnsPublishProcess", "source_", Long.valueOf(j));
            }
            if (!z3) {
                mo80970g().clear();
            }
            SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }

        /* renamed from: n */
        public final void mo80977n(C61577h hVar) {
            SnsMethodCalculate.markStartTimeMs("updateWithSave", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(hVar, "obj");
            SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReportKt");
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(16, hVar.f175143d, hVar, (C58325i) null);
            SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReportKt");
            SnsMethodCalculate.markEndTimeMs("updateWithSave", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }
    }
}
