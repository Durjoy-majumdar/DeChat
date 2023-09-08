package fp2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.sns.p104ad.magicbrush.MagicBrushSclSnsAdPkgManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1})
/* renamed from: fp2.d */
public final class C32150d extends C86301e {

    /* renamed from: fp2.d$a */
    public static final class C32151a extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C32151a f85470d = new C32151a();

        public C32151a() {
            super(1);
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService$onCreate$1");
            String str = (String) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService$onCreate$1");
            C87412m.m108594g(str, "instanceName");
            MagicBrushSclSnsAdPkgManager magicBrushSclSnsAdPkgManager = new MagicBrushSclSnsAdPkgManager(str);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService$onCreate$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService$onCreate$1");
            return magicBrushSclSnsAdPkgManager;
        }
    }

    public void onCreate(Context context) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService");
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE, C32151a.f85470d);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService");
    }
}
