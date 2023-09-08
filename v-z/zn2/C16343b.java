package zn2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: zn2.b */
public final class C16343b extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16343b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsTimeLineUIAccessibility");
        root(C0966R.C0971layout.c3m).view(C0966R.C0970id.f4p).disable();
        root(C0966R.C0971layout.c2t).view(C0966R.C0970id.jsl).desc((int) C0966R.string.f361362j92);
        ViewSetter view = view(C0966R.C0970id.f5746nh, C0966R.C0970id.f5746nh);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        view.desc((int) C0966R.string.jbc);
        view.expand(0, 12, 20, 12);
        ViewSetter view2 = view(C0966R.C0970id.f5712mj, C0966R.C0970id.f5712mj);
        view2.type(viewType);
        view2.desc((int) C0966R.string.jbl);
        view(C0966R.C0970id.f5715mn, C0966R.C0970id.f5715mn).desc((int) C0966R.string.jfm);
        view(C0966R.C0970id.nq7, C0966R.C0970id.nwr).desc((int) C0966R.string.f7997yr);
        view(C0966R.C0970id.nq7, C0966R.C0970id.nwq).desc((int) C0966R.string.f7997yr);
        SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsTimeLineUIAccessibility");
    }
}
