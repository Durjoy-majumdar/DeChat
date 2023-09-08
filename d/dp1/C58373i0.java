package dp1;

import androidx.appcompat.app.AppCompatActivity;
import c30.C104289g;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMultiTaskEnterStruct;
import com.tencent.p014mm.plugin.finder.service.C56294r0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60204t3;
import java.util.ArrayList;
import java.util.Set;
import z04.C112551y;

/* renamed from: dp1.i0 */
public final class C58373i0 {

    /* renamed from: a */
    public static final C58373i0 f167182a = new C58373i0();

    /* renamed from: dp1.i0$a */
    public enum C58374a {
        ENTER_FINDER_TOTAL(1, "进入视频号总量"),
        ENTER_FINDER_TASK_TOTAL(2, "进入视频号task总量"),
        ENTER_FINDER_TASK_FROM_SYSTEM_UI(3, "从系统多任务进入视频号task"),
        ENTER_FINDER_TASK_FROM_WECHAT(4, "从微信内进入视频号task"),
        EXIT_FROM_FINDER_TASK(5, "从视频号task退后台"),
        ENTER_FINDER_TASK_FROM_SCREEN_OFF(6, "从息屏到亮屏进入视频号task"),
        ENTER_FINDER_TASK_LIVE(7, "进入视频号task的直播间"),
        ENTER_NORMAL_TASK_LIVE(8, "进入主task的直播间"),
        ENTER_FINDER_TASK_FROM_LAUNCHER(9, "点击桌面微信icon进入视频号task"),
        FINDER_TASK_ON_RESUME_TOTAL(101, "OnResume总量"),
        FINDER_TASK_ON_RESUME_UNKNOWN(102, "未知来源OnResume(大概率多任务)"),
        FINDER_TASK_ON_RESUME_FROM_ON_CREATE(103, "OnResume来源为onCreate"),
        FINDER_TASK_ON_RESUME_FROM_NEW_INTENT(104, "OnResume来源为onNewIntent"),
        FINDER_TASK_ON_RESUME_FROM_SCREEN_OFF(105, "OnResume来源为息屏再开"),
        FINDER_TASK_ON_RESUME_FROM_LAUNCHER(106, "OnResume来源为从桌面点开");
        

        /* renamed from: d */
        public final int f167199d;

        /* renamed from: e */
        public final String f167200e;

        /* access modifiers changed from: public */
        C58374a(int i, String str) {
            this.f167199d = i;
            this.f167200e = str;
        }
    }

    /* renamed from: a */
    public final void mo83139a(C58374a aVar) {
        String str;
        int i;
        C87412m.m108594g(aVar, "op");
        FinderMultiTaskEnterStruct finderMultiTaskEnterStruct = new FinderMultiTaskEnterStruct();
        finderMultiTaskEnterStruct.f155734d = (long) aVar.f167199d;
        finderMultiTaskEnterStruct.f155735e = finderMultiTaskEnterStruct.mo86045b("opDesc", aVar.f167200e, true);
        finderMultiTaskEnterStruct.mo86054n();
        StringBuilder sb = new StringBuilder();
        sb.append("report23850: type = ");
        sb.append(aVar.f167199d);
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            str = ", desc = " + aVar.f167200e;
        } else {
            str = "";
        }
        sb.append(str);
        Log.m105924i("FinderMultiTaskReporter", sb.toString());
        if (aVar == C58374a.FINDER_TASK_ON_RESUME_UNKNOWN) {
            long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_BACKGROUND_TIMESTAMP_LONG_SYNC, 0);
            if (G != 0) {
                long c = C31543z5.m39453c() - G;
                C7335d c2 = C86312j.m106911c(C60204t3.class);
                C56294r0 r0Var = c2 instanceof C56294r0 ? (C56294r0) c2 : null;
                if (r0Var != null) {
                    Set<AppCompatActivity> set = r0Var.f160893s;
                    C87412m.m108593f(set, "enterFinderActivity");
                    ArrayList arrayList = new ArrayList();
                    for (T next : set) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) next;
                        C87412m.m108593f(appCompatActivity, LocaleUtil.ITALIAN);
                        if (r0Var.iu0(appCompatActivity)) {
                            arrayList.add(next);
                        }
                    }
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                FinderGlobalLoadingRptStruct finderGlobalLoadingRptStruct = new FinderGlobalLoadingRptStruct();
                finderGlobalLoadingRptStruct.f155345d = 10;
                finderGlobalLoadingRptStruct.f155346e = 10;
                finderGlobalLoadingRptStruct.f155349h = finderGlobalLoadingRptStruct.mo86045b("majorData", String.valueOf(c), true);
                C104289g gVar = new C104289g();
                gVar.mo145954o("exitToReenterMultiTaskTime", c);
                gVar.mo145953n("enterFinderTaskUISize", i);
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "json.toString()");
                finderGlobalLoadingRptStruct.mo76254s(C112551y.m153814n(gVar2, ",", ";", false));
                finderGlobalLoadingRptStruct.mo86054n();
                Log.m105924i("FinderMultiTaskReporter", "report21680 reportEnterMultiTask:" + finderGlobalLoadingRptStruct.mo1006q());
            }
        }
        switch (aVar.ordinal()) {
            case 0:
                C115669n.INSTANCE.mo175912v(1767, 3);
                return;
            case 1:
                C115669n.INSTANCE.mo175912v(1767, 0);
                return;
            case 2:
                C115669n.INSTANCE.mo175912v(1767, 2);
                return;
            case 3:
                C115669n.INSTANCE.mo175912v(1767, 1);
                return;
            case 4:
                C115669n.INSTANCE.mo175912v(1767, 4);
                return;
            case 5:
                C115669n.INSTANCE.mo175912v(1767, 5);
                return;
            case 6:
                C115669n.INSTANCE.mo175912v(1767, 6);
                return;
            case 7:
                C115669n.INSTANCE.mo175912v(1767, 7);
                return;
            case 8:
                C115669n.INSTANCE.mo175912v(1767, 8);
                return;
            case 9:
                C115669n.INSTANCE.mo175912v(1767, 101);
                return;
            case 10:
                C115669n.INSTANCE.mo175912v(1767, 102);
                return;
            case 11:
                C115669n.INSTANCE.mo175912v(1767, 103);
                return;
            case 12:
                C115669n.INSTANCE.mo175912v(1767, 104);
                return;
            case 13:
                C115669n.INSTANCE.mo175912v(1767, 105);
                return;
            case 14:
                C115669n.INSTANCE.mo175912v(1767, 106);
                return;
            default:
                return;
        }
    }
}
