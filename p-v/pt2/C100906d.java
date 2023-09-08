package pt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: pt2.d */
public final class C100906d {

    /* renamed from: a */
    public static final C100907a f295509a = new C100907a((C8480h) null);

    /* renamed from: b */
    public static final C100906d f295510b = new C100906d();

    /* renamed from: c */
    public static String f295511c;

    /* renamed from: pt2.d$a */
    public static final class C100907a {
        public C100907a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C100906d mo140375a() {
            SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getInstance$cp", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
            C100907a aVar = C100906d.f295509a;
            SnsMethodCalculate.markEndTimeMs("access$getInstance$cp", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
            C100906d dVar = C100906d.f295510b;
            SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper$Companion");
            return dVar;
        }
    }

    static {
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        f295511c = s;
    }

    /* renamed from: a */
    public static final C100906d m132261a() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        f295509a.mo140375a();
        C100906d dVar = f295510b;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        return dVar;
    }

    /* renamed from: b */
    public final int mo140373b() {
        SnsMethodCalculate.markStartTimeMs("getUserShowTipsReminderCont", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_REMAINDER_SHOW_COUNT_INT, 3);
        SnsMethodCalculate.markEndTimeMs("getUserShowTipsReminderCont", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        return j;
    }

    /* renamed from: c */
    public final void mo140374c() {
        SnsMethodCalculate.markStartTimeMs("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        f295509a.mo140375a();
        if (f295510b.mo140373b() >= 3) {
            SnsMethodCalculate.markEndTimeMs("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
            return;
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_USED_AFTER_BOOLEAN, Boolean.TRUE);
        SnsMethodCalculate.markEndTimeMs("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
    }
}
