package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import xv2.C102775d;
import xv2.C102776e;

/* renamed from: com.tencent.mm.plugin.sns.model.c1 */
public class C94847c1 {

    /* renamed from: a */
    public static int f274791a = 30;

    /* renamed from: b */
    public static boolean f274792b = false;

    /* renamed from: c */
    public static boolean f274793c = false;

    /* renamed from: d */
    public static int f274794d = 50;

    /* renamed from: e */
    public static boolean f274795e = true;

    /* renamed from: f */
    public static volatile boolean f274796f;

    /* renamed from: a */
    public static boolean m120213a() {
        SnsMethodCalculate.markStartTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_WITH_TA_INT, 0);
        if (j == 1) {
            SnsMethodCalculate.markEndTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return false;
        } else if (j == 2) {
            SnsMethodCalculate.markEndTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m120214b() {
        SnsMethodCalculate.markStartTimeMs("enableTogetherRedDot", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_together_reddot_enabled, false) && MultiProcessMMKV.getDefault().getInt("sns_with_together_at_contact_red", 0) == 0) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("enableTogetherRedDot", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return z;
    }

    /* renamed from: c */
    public static boolean m120215c() {
        SnsMethodCalculate.markStartTimeMs("enableTogetherRedDotAgain", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_together_reddot_enabled, false) && MultiProcessMMKV.getDefault().getInt("sns_with_together_at_contact_red_second_version", 0) == 0) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("enableTogetherRedDotAgain", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return z;
    }

    /* renamed from: d */
    public static boolean m120216d() {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoScaleConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_sns_video_scale, false);
        SnsMethodCalculate.markEndTimeMs("getSnsVideoScaleConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return wf;
    }

    /* renamed from: e */
    public static boolean m120217e() {
        SnsMethodCalculate.markStartTimeMs("isToShowSnsSendError", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_show_video_send_error, true);
        SnsMethodCalculate.markEndTimeMs("isToShowSnsSendError", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return wf;
    }

    /* renamed from: f */
    public static int m120218f() {
        SnsMethodCalculate.markStartTimeMs("linkCollapseCount", "com.tencent.mm.plugin.sns.model.SnsConfig");
        m120219g();
        int i = f274791a;
        SnsMethodCalculate.markEndTimeMs("linkCollapseCount", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return i;
    }

    /* renamed from: g */
    public static void m120219g() {
        Class cls = C102775d.class;
        Class cls2 = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        if (f274796f) {
            SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        } else if (!C86709a0.m107522a() || !C86709a0.m107528h().f251724a.f251792d) {
            Log.m105924i("MicroMsg.SnsConfig", "Account not ready or startup not done");
            SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        } else {
            f274791a = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_sns_link_collapse_enable, 30);
            f274792b = ((C102775d) C86312j.m106911c(cls)).mo134167UO().mo142533c(C102776e.C102777a.TimeLine_Comment);
            f274793c = ((C102775d) C86312j.m106911c(cls)).mo134167UO().mo142533c(C102776e.C102777a.TimeLine_Like);
            f274794d = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_sns_ws_fold_range_size, 50);
            f274795e = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_sns_sync_settext, 1) > 0;
            f274796f = true;
            SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        }
    }

    /* renamed from: h */
    public static void m120220h() {
        Class cls = C102775d.class;
        Class cls2 = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("updateConfigWhenIntoTimeline", "com.tencent.mm.plugin.sns.model.SnsConfig");
        f274791a = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_sns_link_collapse_enable, 30);
        f274792b = ((C102775d) C86312j.m106911c(cls)).mo134167UO().mo142533c(C102776e.C102777a.TimeLine_Comment);
        f274793c = ((C102775d) C86312j.m106911c(cls)).mo134167UO().mo142533c(C102776e.C102777a.TimeLine_Like);
        boolean z = true;
        if (((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_sns_sync_settext, 1) <= 0) {
            z = false;
        }
        f274795e = z;
        SnsMethodCalculate.markEndTimeMs("updateConfigWhenIntoTimeline", "com.tencent.mm.plugin.sns.model.SnsConfig");
    }

    /* renamed from: i */
    public static int m120221i() {
        SnsMethodCalculate.markStartTimeMs("wsFoldGroupSize", "com.tencent.mm.plugin.sns.model.SnsConfig");
        m120219g();
        int i = f274794d;
        SnsMethodCalculate.markEndTimeMs("wsFoldGroupSize", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return i;
    }
}
