package w73;

import c00.C0405n;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;

/* renamed from: w73.d */
public final class C15050d {

    /* renamed from: a */
    public static final C15050d f41189a = new C15050d();

    /* renamed from: a */
    public final String mo14070a(Map<String, String> map) {
        C87412m.m108594g(map, "params");
        String i = C43471q.m46983g(10).mo71073i();
        mo14071b(map);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("file://");
        stringBuffer.append(i);
        stringBuffer.append("?");
        stringBuffer.append(C43471q.m46987k(map));
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "urlBuffer.toString()");
        return stringBuffer2;
    }

    /* renamed from: b */
    public final void mo14071b(Map<String, String> map) {
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        C87412m.m108593f(currentLanguage, "getCurrentLanguage(MMApp…tionContext.getContext())");
        map.put(IXWebPreferences.XWEB_LANGUAGE, currentLanguage);
        map.put("platform", Platform.ANDROID);
        map.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46977a(10)));
        map.put(DownloadInfo.NETTYPE, C43471q.m46979c());
        String str = BuildInfo.CLIENT_VERSION;
        C87412m.m108593f(str, "CLIENT_VERSION");
        map.put("wechatVersion", str);
        map.put("fontRatio", String.valueOf(((C0405n) C86312j.m106911c(C0405n.class)).pg0()));
    }
}
