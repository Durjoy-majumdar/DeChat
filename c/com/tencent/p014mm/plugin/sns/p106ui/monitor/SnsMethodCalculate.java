package com.tencent.p014mm.plugin.sns.p106ui.monitor;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.autogen.mmdata.rpt.MethodAnalyseReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsJankUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import cu2.C97376a;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import su2.C101702a;
import sx3.C110818d0;
import sx3.C77813z;
import ux3.C65486b;
import xu2.C102743c;
import z04.C112550d0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J(\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\u0005H\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0015j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r`\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/monitor/SnsMethodCalculate;", "", "", "methodName", "className", "Lrx3/b0;", "markStartTimeMs", "markEndTimeMs", "Landroid/content/Context;", "context", "session", "", "frameIndex", "", "costMs", "printFrameMethodStack", "frameClear", "TAG", "Ljava/lang/String;", "LIMIT", "I", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "methodStartTimeMap", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lxu2/c;", "Lkotlin/collections/ArrayList;", "methodCostList", "Ljava/util/ArrayList;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate */
public final class SnsMethodCalculate {
    public static final SnsMethodCalculate INSTANCE = new SnsMethodCalculate();
    private static final int LIMIT = 200;
    private static final String TAG = "MicroMsg.SnsMethodCalculate";
    private static final ArrayList<C102743c> methodCostList = new ArrayList<>();
    private static final HashMap<String, Long> methodStartTimeMap = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$a */
    public static final class C96075a<T> implements Comparator {
        public final int compare(T t, T t2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$printFrameMethodStack$$inlined$sortByDescending$1");
            int a = C65486b.m77169a(Long.valueOf(((C102743c) t2).mo142525a()), Long.valueOf(((C102743c) t).mo142525a()));
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$printFrameMethodStack$$inlined$sortByDescending$1");
            return a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$b */
    public static final class C96076b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C102743c> f280554d;

        /* renamed from: e */
        public final /* synthetic */ int f280555e;

        /* renamed from: f */
        public final /* synthetic */ String f280556f;

        public C96076b(ArrayList<C102743c> arrayList, int i, String str) {
            this.f280554d = arrayList;
            this.f280555e = i;
            this.f280556f = str;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$printFrameMethodStack$2");
            Iterator<C102743c> it = this.f280554d.iterator();
            while (it.hasNext()) {
                C102743c next = it.next();
                if (next != null && next.mo142525a() > 2) {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    for (int size = next.mo142526b().size() - 1; -1 < size; size += -1) {
                        String str = next.mo142526b().get(size);
                        C87412m.m108593f(str, "struct.trace[index]");
                        sb.append('|' + ((String) C110818d0.m150914L(C112550d0.m153785U(str, new String[]{"#"}, false, 0, 6, (Object) null))) + "|->");
                    }
                    MethodAnalyseReportStruct methodAnalyseReportStruct = new MethodAnalyseReportStruct();
                    StringBuilder sb4 = new StringBuilder();
                    SnsMethodCalculate.markStartTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    String str2 = next.f303375b;
                    SnsMethodCalculate.markEndTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    sb4.append(str2);
                    sb4.append('#');
                    SnsMethodCalculate.markStartTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    String str3 = next.f303374a;
                    SnsMethodCalculate.markEndTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    sb4.append(str3);
                    methodAnalyseReportStruct.f265695d = methodAnalyseReportStruct.mo86045b("MethodName", sb4.toString(), true);
                    methodAnalyseReportStruct.f265698g = this.f280555e;
                    methodAnalyseReportStruct.f265697f = methodAnalyseReportStruct.mo86045b("SessionId", this.f280556f, true);
                    methodAnalyseReportStruct.f265696e = (int) next.mo142525a();
                    methodAnalyseReportStruct.f265699h = methodAnalyseReportStruct.mo86045b("MethodTrace", sb.toString(), true);
                    SnsMethodCalculate.markStartTimeMs("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
                    int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_ASM_INT_SYNC, 0);
                    if (j != 1) {
                        if (j != 2) {
                            z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_asm_enable, false);
                            SnsMethodCalculate.markEndTimeMs("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
                            methodAnalyseReportStruct.f265700i = z ? 1 : 0;
                            methodAnalyseReportStruct.mo86054n();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(sb);
                            SnsMethodCalculate.markStartTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                            String str4 = next.f303374a;
                            SnsMethodCalculate.markEndTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                            sb5.append(str4);
                            sb5.append('#');
                            SnsMethodCalculate.markStartTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                            String str5 = next.f303375b;
                            SnsMethodCalculate.markEndTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                            sb5.append(str5);
                            sb5.append(" cost:");
                            sb5.append(next.mo142525a());
                            Log.m105924i(SnsMethodCalculate.TAG, sb5.toString());
                        } else {
                            z = false;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
                    methodAnalyseReportStruct.f265700i = z ? 1 : 0;
                    methodAnalyseReportStruct.mo86054n();
                    StringBuilder sb52 = new StringBuilder();
                    sb52.append(sb);
                    SnsMethodCalculate.markStartTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    String str42 = next.f303374a;
                    SnsMethodCalculate.markEndTimeMs("getMethodName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    sb52.append(str42);
                    sb52.append('#');
                    SnsMethodCalculate.markStartTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    String str52 = next.f303375b;
                    SnsMethodCalculate.markEndTimeMs("getClazzName", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodStruct");
                    sb52.append(str52);
                    sb52.append(" cost:");
                    sb52.append(next.mo142525a());
                    Log.m105924i(SnsMethodCalculate.TAG, sb52.toString());
                }
            }
            this.f280554d.clear();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$printFrameMethodStack$2");
        }
    }

    private SnsMethodCalculate() {
    }

    public static final void frameClear() {
        methodCostList.clear();
        methodStartTimeMap.clear();
    }

    public static final void markEndTimeMs(String str, String str2) {
        C87412m.m108594g(str, "methodName");
        C87412m.m108594g(str2, "className");
        if (C101702a.f297758a && C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            HashMap<String, Long> hashMap = methodStartTimeMap;
            Long remove = hashMap.remove(str + '#' + str2);
            if (remove != null) {
                long longValue = remove.longValue();
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = hashMap.keySet();
                C87412m.m108593f(keySet, "methodStartTimeMap.keys");
                if (!keySet.isEmpty()) {
                    arrayList.addAll(keySet);
                }
                ArrayList<C102743c> arrayList2 = methodCostList;
                if (arrayList2.size() <= 200) {
                    arrayList2.add(new C102743c(str, str2, System.currentTimeMillis() - longValue, arrayList));
                }
            }
        }
    }

    public static final void markStartTimeMs(String str, String str2) {
        C87412m.m108594g(str, "methodName");
        C87412m.m108594g(str2, "className");
        HashMap<String, Long> hashMap = methodStartTimeMap;
        if (hashMap.size() <= 200 && C101702a.f297758a && C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            hashMap.put(str + '#' + str2, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static final void printFrameMethodStack(Context context, String str, int i, long j) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "session");
        if (C101702a.f297758a) {
            Log.m105924i(TAG, "------------print frame:" + i + " cost:" + j + " start ----------");
            ArrayList arrayList = new ArrayList(methodCostList);
            if (BuildInfo.DEBUG) {
                int i2 = ImproveSnsJankUI.f279577r;
                markStartTimeMs("getShowJankInfo", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$Companion");
                markStartTimeMs("access$getShowJankInfo$cp", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
                boolean z = ImproveSnsJankUI.f279578s;
                markEndTimeMs("access$getShowJankInfo$cp", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
                markEndTimeMs("getShowJankInfo", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$Companion");
                if (z) {
                    if (arrayList.size() > 1) {
                        C77813z.m93909o(arrayList, new C96075a());
                    }
                    if (((C102743c) C110818d0.m150914L(arrayList)).mo142525a() > 5) {
                        new C97376a(arrayList, context, i, j).show();
                    }
                }
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C96076b(arrayList, i, str));
        }
    }
}
