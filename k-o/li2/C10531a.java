package li2;

import android.content.Context;
import android.widget.Button;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ni2.C47260d;
import p206nj.C117627q;
import p256vw.C15016h;
import te3.C52267zi;

/* renamed from: li2.a */
public class C10531a {

    /* renamed from: a */
    public static Map<Integer, C15016h> f31800a = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m10449a(Context context, C15016h hVar) {
        int hashCode = context.hashCode();
        C52267zi ziVar = new C52267zi();
        ziVar.f145967e = UUID.randomUUID().toString();
        HashMap hashMap = new HashMap();
        if (hVar != null) {
            try {
                String str = hVar.f41146h;
                if (str != null) {
                    hashMap.put("heading", C117627q.m165909b(str, "utf-8"));
                }
            } catch (UnsupportedEncodingException unused) {
                Log.m105920e("SelectTextUILogic", "");
            }
            hashMap.put("businessType", String.valueOf(hVar.f41147i));
        }
        String i = C43471q.m46983g(11).mo71073i();
        hashMap.put(IXWebPreferences.XWEB_LANGUAGE, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        hashMap.put("platform", Platform.ANDROID);
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46977a(11)));
        hashMap.put(DownloadInfo.NETTYPE, C43471q.m46979c());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", BuildInfo.CLIENT_VERSION);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("file://");
        stringBuffer.append(i);
        stringBuffer.append("?");
        stringBuffer.append(C43471q.m46987k(hashMap));
        ziVar.f145968f = stringBuffer.toString();
        C47260d dVar = new C47260d(context, ziVar, hVar.f41149k);
        dVar.show();
        dVar.getWindow().setLayout(-1, -1);
        a$$a a__a = new a$$a(hVar, dVar, hashCode);
        Button button = dVar.f126877o;
        if (button != null) {
            button.setOnClickListener(a__a);
        }
        hVar.f41148j = dVar.f126877o;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f31800a = concurrentHashMap;
        concurrentHashMap.put(Integer.valueOf(hashCode), hVar);
    }
}
