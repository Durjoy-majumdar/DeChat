package np1;

import android.content.Context;
import android.webkit.ValueCallback;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fm0.C86944h1;
import gy3.C87412m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: np1.b0 */
public final class C61853b0 implements ValueCallback<String> {

    /* renamed from: a */
    public final Context f175874a;

    /* renamed from: b */
    public final String f175875b;

    /* renamed from: c */
    public final String f175876c;

    /* renamed from: d */
    public final String f175877d;

    /* renamed from: e */
    public final String f175878e = "Finder.MiniProgramReceiverV2";

    public C61853b0(Context context, String str, String str2, String str3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "iconUrl");
        C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f175874a = context;
        this.f175875b = str;
        this.f175876c = str2;
        this.f175877d = str3;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        String str2 = this.f175878e;
        Log.m105924i(str2, "onReceiveValue value" + str + ", outter appId:" + this.f175875b + '!');
        if (!Util.isNullOrNil(str)) {
            C104289g gVar = new C104289g(str);
            int optInt = gVar.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            String optString = gVar.optString("appId");
            String optString2 = gVar.optString("path");
            gVar.optString("shopWindowId");
            String optString3 = gVar.optString("sceneNote");
            gVar.optInt("shareMode");
            gVar.optLong("productId");
            int optInt2 = gVar.optInt("usePushAnimation");
            boolean z = gVar.optInt(C86944h1.NAME, 1) == 1;
            HalfScreenConfig.CustomSubjectInfo customSubjectInfo = new HalfScreenConfig.CustomSubjectInfo(this.f175877d, this.f175876c);
            String str3 = this.f175878e;
            Log.m105924i(str3, "showNavigationBar:" + z + ",scene:" + optInt + '!');
            if (optInt == 1) {
                C119179t tVar = C119157j.f356862d;
                C61851a0 a0Var = new C61851a0(this, optString, optString2, optString3, optInt2, z, customSubjectInfo);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(a0Var, 250, false);
            }
        }
    }
}
