package rt2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C75592q0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: rt2.a */
public final class C63677a extends MMBaseAccessibilityConfig {

    /* renamed from: rt2.a$a */
    public static final class C63678a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C63677a f180524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63678a(C63677a aVar) {
            super(1);
            this.f180524d = aVar;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility$initConfig$4$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility$initConfig$4$1");
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String m = C75592q0.m90783m();
            String string = this.f180524d.getActivity().getString(C0966R.string.f361369jb2, new Object[]{m});
            C87412m.m108593f(string, "activity.getString(com.t…vatar_desc, selfNickName)");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility$initConfig$4$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility$initConfig$4$1");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63677a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility");
        ViewSetter view = view(C0966R.C0970id.f5746nh, C0966R.C0970id.f5746nh);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        view.desc((int) C0966R.string.jbc);
        view.expand(0, 12, 20, 12);
        ViewSetter view2 = view(C0966R.C0970id.f5712mj, C0966R.C0970id.f5712mj);
        view2.type(viewType);
        view2.desc((int) C0966R.string.jbl);
        view(C0966R.C0970id.f5715mn, C0966R.C0970id.f5715mn).desc((int) C0966R.string.jfm);
        view(C0966R.C0970id.oex, C0966R.C0970id.a27).desc((C32226l<? super View, String>) new C63678a(this));
        ViewSetter view3 = view(C0966R.C0970id.f358454of3, C0966R.C0970id.oiz);
        view3.desc((int) C0966R.string.jin);
        view3.type(viewType);
        ViewSetter view4 = view(C0966R.C0970id.f358454of3, C0966R.C0970id.f359396kp1);
        view4.desc((int) C0966R.string.f7574k3);
        view4.type(viewType);
        view(C0966R.C0970id.nq7, C0966R.C0970id.nwr).desc((int) C0966R.string.f7997yr);
        view(C0966R.C0970id.nq7, C0966R.C0970id.nwq).desc((int) C0966R.string.f7997yr);
        SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.improve.accessibility.ImproveSnsAccessibility");
    }
}
