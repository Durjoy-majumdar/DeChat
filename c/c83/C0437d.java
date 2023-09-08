package c83;

import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import gy3.C87412m;
import java.util.Map;

/* renamed from: c83.d */
public final class C0437d {

    /* renamed from: a */
    public static final C0437d f1061a = new C0437d();

    /* renamed from: a */
    public final String mo476a(Map<String, String> map) {
        C87412m.m108594g(map, "params");
        String i = C43471q.m46983g(6).mo71073i();
        mo477b(map);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("file://");
        stringBuffer.append(i);
        stringBuffer.append("?");
        stringBuffer.append(C43471q.m46987k(map));
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public final void mo477b(Map<String, String> map) {
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        C87412m.m108593f(currentLanguage, "getCurrentLanguage(MMApp…tionContext.getContext())");
        map.put(IXWebPreferences.XWEB_LANGUAGE, currentLanguage);
        map.put("platform", Platform.ANDROID);
        map.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46977a(6)));
        map.put(DownloadInfo.NETTYPE, C43471q.m46979c());
        String str = BuildInfo.CLIENT_VERSION;
        C87412m.m108593f(str, "CLIENT_VERSION");
        map.put("wechatVersion", str);
    }
}
