package iv2;

import com.tencent.p014mm.plugin.sns.p106ui.C95741b5;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import java.util.Locale;
import p156gj.C87203t;
import z04.C112550d0;

/* renamed from: iv2.b */
public final class C33418b {

    /* renamed from: a */
    public static final C33418b f90548a = new C33418b();

    /* renamed from: a */
    public final boolean mo59132a(C95741b5 b5Var) {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("checkAutoPlay", "com.tencent.mm.plugin.sns.util.SnsAutoPlayUtil");
        C87412m.m108594g(b5Var, "networkMgr");
        boolean z = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_video_autoplay, 0) == 1;
        String k = C87203t.m108275k();
        C87412m.m108593f(k, "getModel()");
        Locale locale = Locale.getDefault();
        C87412m.m108593f(locale, "getDefault()");
        String lowerCase = k.toLowerCase(locale);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_sns_video_autoplay_disable_device, "");
        if (!Util.isNullOrNil(Y60)) {
            C87412m.m108593f(Y60, "disableDeviceInfo");
            if (C112550d0.m153801u(Y60, lowerCase, false)) {
                Log.m105925i("MicroMsg.SnsAutoPlayUtil", "model %s is hit, expt:%s", lowerCase, Y60);
                z = false;
            }
        }
        if (z) {
            SnsMethodCalculate.markStartTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            int i = b5Var.f279254b;
            boolean z2 = i == 2 || i == 3;
            SnsMethodCalculate.markEndTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            if (z2) {
                Log.m105924i("MicroMsg.SnsAutoPlayUtil", "2G/3G autoplay false");
                z = false;
            } else {
                SnsMethodCalculate.markStartTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                boolean z3 = b5Var.f279254b == 5;
                SnsMethodCalculate.markEndTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                if (z3) {
                    Log.m105924i("MicroMsg.SnsAutoPlayUtil", "wifi autoplay true");
                    z = true;
                } else {
                    Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, Boolean.TRUE);
                    C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                    z = ((Boolean) f).booleanValue();
                }
            }
        } else {
            Log.m105924i("MicroMsg.SnsAutoPlayUtil", "autoPlay DynamicConfig false");
        }
        Log.m105925i("MicroMsg.SnsAutoPlayUtil", "autoPlay:%s", Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("checkAutoPlay", "com.tencent.mm.plugin.sns.util.SnsAutoPlayUtil");
        return z;
    }
}
