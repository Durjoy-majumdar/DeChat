package su2;

import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;

/* renamed from: su2.a */
public final class C101702a {

    /* renamed from: a */
    public static boolean f297758a;

    /* renamed from: b */
    public static final C101702a f297759b = new C101702a();

    /* renamed from: a */
    public final boolean mo141157a() {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = false;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_FEED_NEW_INT_SYNC, 0);
        if (j == 1) {
            z = true;
        } else if (j != 2) {
            if ((C85875k4.m106157N() || C85875k4.m106210y()) && !((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32738b.clicfg_sns_feed_improve_large_window, true)) {
                SnsMethodCalculate.markEndTimeMs("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
                return false;
            }
            boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_feed_enable, true);
            SnsMethodCalculate.markEndTimeMs("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
            return wf;
        }
        SnsMethodCalculate.markEndTimeMs("enableImproveFeed", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        return z;
    }
}
