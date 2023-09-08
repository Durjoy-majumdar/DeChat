package fp2;

import android.app.Activity;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ip2.C98778a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import z04.C112551y;

/* renamed from: fp2.f */
public final class C87070f {

    /* renamed from: a */
    public static final C87070f f252656a = new C87070f();

    /* renamed from: b */
    public static final Map<Integer, C87066b> f252657b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<Integer, WeakReference<FrameLayout>> f252658c = new LinkedHashMap();

    /* renamed from: d */
    public static final C13601g f252659d = C36568h.m40985a(C32155a.f85476d);

    /* renamed from: fp2.f$a */
    public static final class C32155a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C32155a f85476d = new C32155a();

        public C32155a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager$debuggable$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager$debuggable$2");
            Boolean valueOf = Boolean.valueOf(BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager$debuggable$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager$debuggable$2");
            return valueOf;
        }
    }

    /* renamed from: b */
    public static final List<JSONObject> m108089b(Activity activity, String str) {
        C98778a a;
        Collection values;
        SnsMethodCalculate.markStartTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        List<JSONObject> list = null;
        if (activity == null) {
            Log.m105928w("SnsAdMB", "getJsCompInfoInAdLandingMbComp: the activity is null");
            SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        if (str == null || C112551y.m153811k(str)) {
            Log.m105928w("SnsAdMB", "getJsCompInfoInAdLandingMbComp: the magic component id is empty");
            SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        C87066b bVar = (C87066b) ((LinkedHashMap) f252657b).get(Integer.valueOf(activity.hashCode()));
        if (bVar == null || (a = bVar.mo121532a()) == null) {
            Log.m105920e("SnsAdMB", "the ad landing page helper is null, can't obtain the js component inf ");
            SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        SnsMethodCalculate.markStartTimeMs("getJsComponentInformation", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        C87412m.m108594g(str, "mbCompId");
        Map map = (Map) ((LinkedHashMap) a.f289594c).get(str);
        if (map == null || (values = map.values()) == null) {
            Log.m105928w("LandingPageMagic", "there is no js component in magic brush component: [" + str + ']');
        } else {
            list = C110818d0.m150953y0(values);
        }
        SnsMethodCalculate.markEndTimeMs("getJsComponentInformation", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        SnsMethodCalculate.markEndTimeMs("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        return list;
    }

    /* renamed from: a */
    public final boolean mo121543a() {
        SnsMethodCalculate.markStartTimeMs("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        boolean booleanValue = ((Boolean) ((C36570n) f252659d).getValue()).booleanValue();
        SnsMethodCalculate.markEndTimeMs("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        return booleanValue;
    }
}
