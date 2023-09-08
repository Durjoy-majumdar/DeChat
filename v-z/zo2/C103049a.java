package zo2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view.AdLandingGeneralVideoWrapper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import i72.C98607d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p625nu.C61901d;

/* renamed from: zo2.a */
public class C103049a implements C61901d.C61902a {

    /* renamed from: d */
    public Map<String, WeakReference<View>> f304038d = new HashMap();

    /* renamed from: e */
    public String f304039e;

    /* renamed from: f */
    public C98607d f304040f;

    /* renamed from: g */
    public volatile int f304041g = 0;

    /* renamed from: zo2.a$b */
    public static class C103051b {

        /* renamed from: a */
        public static final C103049a f304042a = new C103049a((C103050a) null);
    }

    public C103049a(C103050a aVar) {
    }

    /* renamed from: a */
    public static C103049a m136281a() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        C103049a aVar = C103051b.f304042a;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager$ScreenSwitchManagerHolder");
        C103049a aVar2 = C103051b.f304042a;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager$ScreenSwitchManagerHolder");
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        return aVar2;
    }

    public void onOrientationChange(int i) {
        SnsMethodCalculate.markStartTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        if (i == 0) {
            this.f304041g = 0;
        } else if (i == 270) {
            this.f304041g = 90;
        } else if (i == 90) {
            this.f304041g = -90;
        } else if (i == 180) {
            this.f304041g = 180;
        } else {
            this.f304041g = -1;
        }
        if (Util.isNullOrNil(this.f304039e)) {
            Log.m105924i("ScreenSwitchManager", "componentId is null");
            SnsMethodCalculate.markEndTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
            return;
        }
        WeakReference weakReference = (WeakReference) ((HashMap) this.f304038d).get(this.f304039e);
        if (weakReference == null) {
            Log.m105924i("ScreenSwitchManager", "mViewRef is null");
            SnsMethodCalculate.markEndTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
            return;
        }
        View view = (View) weakReference.get();
        if (view instanceof AdLandingGeneralVideoWrapper) {
            ((AdLandingGeneralVideoWrapper) view).mo130308l(this.f304041g);
        }
        SnsMethodCalculate.markEndTimeMs("onOrientationChange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
    }
}
