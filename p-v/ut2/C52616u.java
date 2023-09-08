package ut2;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ut2.u */
public final class C52616u extends C102084a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52616u(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveWindowOrientationUIC");
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.Improve.WindowOrientationUIC", "onConfigurationChanged: orientation=" + configuration.orientation);
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveWindowOrientationUIC");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveWindowOrientationUIC");
        super.onCreate(bundle);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveWindowOrientationUIC");
    }
}
