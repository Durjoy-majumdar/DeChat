package ju2;

import au2.C92093b;
import com.tencent.p014mm.plugin.sns.p106ui.C95741b5;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Locale;
import p156gj.C87203t;
import rx3.C13601g;
import rx3.C36568h;
import z04.C112550d0;

/* renamed from: ju2.a */
public final class C33694a {

    /* renamed from: a */
    public int f91147a;

    /* renamed from: b */
    public final C13601g f91148b;

    /* renamed from: ju2.a$a */
    public static final class C33695a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33695a f91149d = new C33695a();

        public C33695a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
            C92093b bVar = C92093b.f263643a;
            Class cls = C32735h.class;
            SnsMethodCalculate.markStartTimeMs("refreshAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
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
                    Log.m105925i("MicroMsg.Improve.SnsConfig", "model %s is hit, expt:%s", lowerCase, Y60);
                    z = false;
                }
            }
            if (z) {
                C95741b5 b5Var = new C95741b5();
                SnsMethodCalculate.markStartTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                int i = b5Var.f279254b;
                boolean z2 = i == 2 || i == 3;
                SnsMethodCalculate.markEndTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                if (z2) {
                    Log.m105924i("MicroMsg.Improve.SnsConfig", "2G/3G autoplay false");
                    z = false;
                } else {
                    SnsMethodCalculate.markStartTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    boolean z3 = b5Var.f279254b == 5;
                    SnsMethodCalculate.markEndTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    if (z3) {
                        Log.m105924i("MicroMsg.Improve.SnsConfig", "wifi autoplay true");
                        z = true;
                    } else {
                        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, Boolean.TRUE);
                        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                        z = ((Boolean) f).booleanValue();
                    }
                }
            } else {
                Log.m105924i("MicroMsg.Improve.SnsConfig", "autoPlay DynamicConfig false");
            }
            Log.m105925i("MicroMsg.Improve.SnsConfig", "autoPlay:%s", Boolean.valueOf(z));
            SnsMethodCalculate.markEndTimeMs("refreshAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            Boolean valueOf = Boolean.valueOf(z);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$autoPlay$2");
            return valueOf;
        }
    }

    public C33694a() {
        this(800);
    }

    public C33694a(int i) {
        this.f91147a = i;
        this.f91148b = C36568h.m40985a(C33695a.f91149d);
    }
}
