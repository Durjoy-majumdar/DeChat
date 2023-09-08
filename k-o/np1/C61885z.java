package np1;

import android.os.Bundle;
import android.webkit.ValueCallback;
import c30.C104289g;
import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d60.C58124b;
import fm0.C86944h1;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import ok1.C62042e;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: np1.z */
public final class C61885z implements ValueCallback<String> {

    /* renamed from: a */
    public final String f175983a = "Finder.LiveMiniProgramReceiver";

    /* renamed from: b */
    public WeakReference<C56032b> f175984b;

    /* renamed from: c */
    public String f175985c;

    public C61885z(C56032b bVar, String str) {
        C87412m.m108594g(bVar, "pluginLayout");
        C87412m.m108594g(str, "appId");
        this.f175984b = new WeakReference<>(bVar);
        this.f175985c = str;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Class cls = C54979h1.class;
        String str2 = this.f175983a;
        Log.m105924i(str2, "onReceiveValue value" + str);
        if (!Util.isNullOrNil(str)) {
            WeakReference<C56032b> weakReference = this.f175984b;
            C56032b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar == null) {
                Log.m105924i(this.f175983a, "pluginLayout is null!");
                return;
            }
            C104289g gVar = new C104289g(str);
            int optInt = gVar.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            String optString = gVar.optString("appId");
            String optString2 = gVar.optString("path");
            gVar.optString("shopWindowId");
            String optString3 = gVar.optString("sceneNote");
            int optInt2 = gVar.optInt("shareMode");
            long optLong = gVar.optLong("productId");
            int optInt3 = gVar.optInt("usePushAnimation");
            boolean z = gVar.optInt(C86944h1.NAME, 1) == 1;
            String str3 = "";
            String optString4 = gVar.optString("mode", str3);
            String str4 = ((C54979h1) bVar.getBuContext().mo71262a(cls)).f154124Q.get(optString);
            if (str4 == null) {
                str4 = str3;
            }
            String str5 = ((C54979h1) bVar.getBuContext().mo71262a(cls)).f154125R.get(optString);
            if (str5 != null) {
                str3 = str5;
            }
            HalfScreenConfig.CustomSubjectInfo customSubjectInfo = new HalfScreenConfig.CustomSubjectInfo(str3, str4);
            String str6 = this.f175983a;
            Log.m105924i(str6, "showNavigationBar:" + z);
            if (optInt == 0) {
                C56032b bVar2 = C87412m.m108589b(optString, this.f175985c) & (C62042e.f176370a.mo87027N0() || ((C54991o) bVar.getBuContext().mo71262a(C54991o.class)).f154190D) ? bVar : null;
                if (bVar2 != null) {
                    C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_SHOPPING_REFRESH;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
                    C13598b0 b0Var = C13598b0.f38549a;
                    bVar2.statusChange(bVar3, bundle);
                }
            } else if (optInt == 1) {
                C119179t tVar = C119157j.f356862d;
                C61884y yVar = new C61884y(bVar, optInt2, optLong, optString, optString2, optString3, optInt3, optString4, z, customSubjectInfo, this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(yVar, 250, false);
            }
        }
    }
}
