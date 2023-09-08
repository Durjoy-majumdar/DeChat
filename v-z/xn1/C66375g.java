package xn1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: xn1.g */
public final class C66375g {

    /* renamed from: a */
    public static final C66376a f191088a = new C66377b();

    /* renamed from: xn1.g$a */
    public interface C66376a {
        /* renamed from: a */
        void mo90471a(String str, JSONObject jSONObject);
    }

    /* renamed from: xn1.g$b */
    public static final class C66377b implements C66376a {
        /* renamed from: a */
        public void mo90471a(String str, JSONObject jSONObject) {
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C87412m.m108594g(jSONObject, "info");
            Log.m105924i("Finder.PerformanceDelegator", "[report] scene=" + str + " info=" + jSONObject);
            if (!BuildInfo.DEBUG) {
                C115669n.INSTANCE.mo160131h(26986, str, jSONObject, 6);
            }
        }
    }
}
