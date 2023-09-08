package ta3;

import android.app.Activity;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import na3.C117621j;
import na3.C34760f;
import p749xh.C118879r5;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ta3.a */
public class C118414a extends C86301e implements C34760f {
    /* renamed from: Is */
    public String mo11753Is(String str) {
        return null;
    }

    public void dh0(Activity activity, String str) {
        C118879r5 Ub0 = ((C117621j) C86312j.m106911c(C117621j.class)).Ub0(str);
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9526a = Ub0.field_WeAppUser;
        aVar.f9527b = Ub0.field_WeAppPath;
        aVar.f9529d = 1051;
        aVar.f9528c = Ub0.field_WeAppDebugMode;
        aVar.f9530e = String.format("%s:%s:%s:%s", new Object[]{(String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), Ub0.field_expId, Ub0.field_LabsAppId, Long.valueOf(System.currentTimeMillis() / 1000)});
        startAppBrandUIFromOuterEvent.publish();
    }

    public String nl0(String str) {
        return null;
    }
}
