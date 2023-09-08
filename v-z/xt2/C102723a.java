package xt2;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import p206nj.C11171e;
import pu2.C100942r;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: xt2.a */
public final class C102723a extends UIComponent {

    /* renamed from: d */
    public static boolean f303339d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102723a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        f303339d = mo142515c3(appCompatActivity);
    }

    /* renamed from: c3 */
    public final boolean mo142515c3(Activity activity) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        boolean z2 = false;
        if (C85875k4.m106197n0()) {
            boolean z3 = true;
            z = C11171e.m11046c(30) && C85878m2.m106212a(MMApplicationContext.getContext());
            if (activity != null) {
                if ((!C85875k4.m106154K(activity.getTaskId()) && (!C85875k4.m106155L(activity.getContentResolver()) || Build.VERSION.SDK_INT < 24 || activity.isInMultiWindowMode())) || C85878m2.m106213b(activity.getTaskId())) {
                    z3 = z;
                }
                z = z3;
            }
        } else {
            z = false;
        }
        C100942r.C100947q qVar = C100942r.f295575C;
        SnsMethodCalculate.markStartTimeMs("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        int i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
        int a = qVar.mo140460a();
        SnsMethodCalculate.markStartTimeMs("getAvatar_Margin_HORIZATION", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getAvatar_Margin_HORIZATION$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C13601g<Integer> gVar = C100942r.f295590S;
        SnsMethodCalculate.markEndTimeMs("access$getAvatar_Margin_HORIZATION$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getAvatar_Margin_HORIZATION", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        int j = i - ((((a + intValue) + qVar.mo140469j()) + qVar.mo140463d()) + qVar.mo140464e());
        SnsMethodCalculate.markEndTimeMs("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        SnsMethodCalculate.markEndTimeMs("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        if (!z || j > qVar.mo140465f()) {
            z2 = z;
        }
        Log.m105924i("MicroMsg.TimelineFeedImproveConfigUIC", "enableLargeUI: " + z2 + ", RightPanelMaxAvaWidth=" + j + ", LargeRightPanelLayoutWidth=" + qVar.mo140465f());
        SnsMethodCalculate.markEndTimeMs("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        return z2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.TimelineFeedImproveConfigUIC", "onConfigurationChanged:");
        f303339d = mo142515c3(getActivity());
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        super.onCreate(bundle);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
    }
}
