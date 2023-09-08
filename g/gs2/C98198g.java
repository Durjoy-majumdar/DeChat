package gs2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: gs2.g */
public final class C98198g {

    /* renamed from: a */
    public static final C98198g f287917a = new C98198g();

    /* renamed from: b */
    public static C98192a f287918b = null;

    /* renamed from: c */
    public static int f287919c = -1;

    /* renamed from: a */
    public final C98192a mo137499a(int i) {
        SnsMethodCalculate.markStartTimeMs("calculateResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        Context context = MMApplicationContext.getContext();
        String str = null;
        C74783i3.C6978a a = C74783i3.m89537a((Context) null);
        int i2 = a.f24705b;
        int i3 = (a.f24704a * 16) / 9;
        if (i == -1) {
            SnsMethodCalculate.markStartTimeMs("updateNavigationBarHeightValue", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            f287919c = C75044y4.m89991c(MMApplicationContext.getContext());
            SnsMethodCalculate.markEndTimeMs("updateNavigationBarHeightValue", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            int i4 = f287919c;
            SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            i = i4;
        }
        f287919c = i;
        int f = C75044y4.m89994f(MMApplicationContext.getContext());
        int c = C74942w4.m89786c(context, C0966R.dimen.f3679b9);
        C98192a cVar = i2 >= ((i + f) + c) + i3 ? new C98194c() : i2 > i3 + i ? new C98195d(true) : i2 > i3 ? new C98196e(true, true) : i2 == i3 ? new C98193b(true, true) : i2 < i3 ? new C98197f(true, true) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("calculateResolutionRadioConfig: config:");
        if (cVar != null) {
            str = cVar.getClass().getCanonicalName();
        }
        sb.append(str);
        sb.append(", shortSide:");
        sb.append(a.f24704a);
        sb.append(", longSide:");
        sb.append(a.f24705b);
        sb.append(", bottomHeight:");
        sb.append(i);
        sb.append(", statusBarHeight:");
        sb.append(f);
        sb.append(", actionbarHeight:");
        sb.append(c);
        Log.m105924i("MicroMsg.SnsResolutionRadioConfigManager", sb.toString());
        C87412m.m108591d(cVar);
        SnsMethodCalculate.markEndTimeMs("calculateResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        return cVar;
    }
}
