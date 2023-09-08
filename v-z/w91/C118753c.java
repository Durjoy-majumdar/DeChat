package w91;

import com.tencent.p014mm.plugin.expt.pageflow.MMPageFlowService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import h81.C8496k;

/* renamed from: w91.c */
public final class C118753c {
    /* renamed from: a */
    public static void m167447a(String str, int i, long j, C8496k.C8497a aVar) {
        C8496k.C8497a aVar2 = aVar;
        C8496k.C8497a aVar3 = C8496k.C8497a.MMActivity_Front2Back;
        C8496k.C8497a aVar4 = C8496k.C8497a.MMActivity_Back2Front;
        int i2 = aVar2 == aVar4 ? 7 : aVar2 == aVar3 ? 8 : -1;
        if (C116711b.m164589n() && !MMPageFlowService.f345925j) {
            if (aVar2 == aVar4) {
                C115669n.INSTANCE.idkeyStat(932, 91, 1, false);
            } else if (aVar2 == aVar3) {
                C115669n.INSTANCE.idkeyStat(932, 92, 1, false);
            }
            Log.m105925i("HABBYGE-MALI.HellFrontBackReport", "report 切换-前后台(3): %d, %s 未登录", Integer.valueOf(i2), str);
        }
        Log.m105925i("HABBYGE-MALI.HellFrontBackReport", "report 切换-前后台(3): %d, %s", Integer.valueOf(i2), str);
        MMPageFlowService.wx0().zx0(str, aVar, i, j);
    }
}
