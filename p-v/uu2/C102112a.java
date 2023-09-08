package uu2;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsMethodReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashMap;
import java.util.Map;
import p156gj.C87203t;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: uu2.a */
public final class C102112a {

    /* renamed from: a */
    public static final C102112a f300683a = new C102112a();

    /* renamed from: b */
    public static final HashMap<Integer, SnsMethodReportStruct> f300684b = new HashMap<>();

    /* renamed from: c */
    public static String f300685c = "";

    /* renamed from: d */
    public static int f300686d = -1;

    /* renamed from: uu2.a$a */
    public static final class C102113a implements Runnable {

        /* renamed from: d */
        public static final C102113a f300687d = new C102113a();

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport$1");
            Map<String, String> d = C87203t.m108268d();
            C102112a aVar = C102112a.f300683a;
            String str = (String) ((HashMap) d).get("hardware");
            String n = str != null ? C112551y.m153814n(str, ",", ";", false) : "";
            SnsMethodCalculate.markStartTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            C102112a.f300685c = n;
            SnsMethodCalculate.markEndTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            StringBuilder sb = new StringBuilder();
            sb.append("get cpu name:");
            C102112a aVar2 = C102112a.f300683a;
            SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            String str2 = C102112a.f300685c;
            SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            sb.append(str2);
            Log.m105924i("MicroMsg.SnsMethodReport", sb.toString());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport$1");
        }
    }

    static {
        ((C119157j) C119157j.f356862d).mo183875f(C102113a.f300687d);
    }

    /* renamed from: a */
    public final void mo141612a(int i, long j) {
        SnsMethodCalculate.markStartTimeMs("createViewCost", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        SnsMethodReportStruct snsMethodReportStruct = f300684b.get(Integer.valueOf(i));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f266076f = (int) j;
        }
        SnsMethodCalculate.markEndTimeMs("createViewCost", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }

    /* renamed from: b */
    public final void mo141613b(int i, long j) {
        SnsMethodCalculate.markStartTimeMs("getViewCost", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        SnsMethodReportStruct snsMethodReportStruct = f300684b.get(Integer.valueOf(i));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f266079i = (int) j;
        }
        SnsMethodCalculate.markEndTimeMs("getViewCost", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }

    /* renamed from: c */
    public final void mo141614c(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        HashMap<Integer, SnsMethodReportStruct> hashMap = f300684b;
        if (hashMap.get(Integer.valueOf(i)) != null) {
            Log.m105920e("MicroMsg.SnsMethodReport", "already initReport position:" + i + "? ");
            SnsMethodCalculate.markEndTimeMs("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            return;
        }
        hashMap.put(Integer.valueOf(i), new SnsMethodReportStruct());
        SnsMethodReportStruct snsMethodReportStruct = hashMap.get(Integer.valueOf(i));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f266078h = z ? 1 : 0;
        }
        SnsMethodCalculate.markEndTimeMs("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }

    /* renamed from: d */
    public final void mo141615d(int i) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        SnsMethodReportStruct remove = f300684b.remove(Integer.valueOf(i));
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_method_report, false)) {
            if (remove != null) {
                remove.f266074d = remove.mo86045b("CpuInfo", f300685c, true);
            }
            if (remove != null) {
                remove.f266080j = f300686d;
            }
            if (remove != null) {
                remove.f266073G0 = 2;
            }
            if (remove != null) {
                remove.mo86054n();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("position:");
            sb.append(i);
            sb.append(" cpu:");
            sb.append(f300685c);
            sb.append(" system fps:");
            sb.append(f300686d);
            sb.append(" name:");
            Integer num = null;
            sb.append(remove != null ? remove.f266075e : null);
            sb.append(" reuse:");
            sb.append(remove != null ? Integer.valueOf(remove.f266078h) : null);
            sb.append(" createview:");
            sb.append(remove != null ? Integer.valueOf(remove.f266076f) : null);
            sb.append(" fillcontent:");
            sb.append(remove != null ? Integer.valueOf(remove.f266077g) : null);
            sb.append(" total cost:");
            if (remove != null) {
                num = Integer.valueOf(remove.f266079i);
            }
            sb.append(num);
            Log.m105918d("MicroMsg.SnsMethodReport", sb.toString());
        }
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }

    /* renamed from: e */
    public final void mo141616e(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("setName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        C87412m.m108594g(str, "name");
        SnsMethodReportStruct snsMethodReportStruct = f300684b.get(Integer.valueOf(i));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f266075e = snsMethodReportStruct.mo86045b("FeedType", str, true);
        }
        SnsMethodCalculate.markEndTimeMs("setName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }

    /* renamed from: e */
    public final void mo141617e(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        SnsMethodReportStruct snsMethodReportStruct = f300684b.get(Integer.valueOf(i));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f266072F0 = z ? 1 : 2;
        }
        SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }
}
