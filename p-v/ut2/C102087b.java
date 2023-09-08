package ut2;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import ds2.C97540j;
import eu2.C97712i;
import fs2.C32163a;
import gy3.C87412m;
import p206nj.C11171e;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: ut2.b */
public final class C102087b extends C102084a {

    /* renamed from: d */
    public static boolean f300617d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102087b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        f300617d = mo141594c3(appCompatActivity);
    }

    /* renamed from: c3 */
    public final boolean mo141594c3(Activity activity) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
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
        C97712i.C97717p pVar = C97712i.f286637C;
        SnsMethodCalculate.markStartTimeMs("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        int i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
        int a = pVar.mo137025a();
        SnsMethodCalculate.markStartTimeMs("getAvatar_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getAvatar_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C13601g<Integer> gVar = C97712i.f286650Q;
        SnsMethodCalculate.markEndTimeMs("access$getAvatar_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getAvatar_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        int g = i - (((a + intValue) + pVar.mo137031g()) + (pVar.mo137027c() * 2));
        SnsMethodCalculate.markEndTimeMs("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        SnsMethodCalculate.markEndTimeMs("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        if (!z || g > pVar.mo137028d()) {
            z2 = z;
        }
        Log.m105924i("MicroMsg.Improve.ConfigUIC", "enableLargeUI: " + z2 + ", RightPanelMaxAvaWidth=" + g + ", LargeRightPanelLayoutWidth=" + pVar.mo137028d());
        SnsMethodCalculate.markEndTimeMs("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        return z2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.Improve.ConfigUIC", "onConfigurationChanged:");
        f300617d = mo141594c3(getActivity());
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        super.onCreate(bundle);
        C97540j.f286244a.mo136811c();
        C32163a.m39642c();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
    }
}
