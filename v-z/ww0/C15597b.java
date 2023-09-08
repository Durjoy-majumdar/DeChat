package ww0;

import android.content.Context;
import bx0.C39845c;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashMap;
import java.util.UUID;
import te3.C52267zi;
import xw0.C15906d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ww0.b */
public class C15597b extends C86301e implements C15906d {
    public void p50(Context context, int i, String str, long j) {
        String i2 = C43471q.m46983g(2).mo71073i();
        Log.m105925i("MicroMsg.Box.BoxUILogic", "startBoxHomeUI type=%d query=%s messageSvrID=%d", Integer.valueOf(i), str, Long.valueOf(j));
        C52267zi ziVar = new C52267zi();
        ziVar.f145967e = UUID.randomUUID().toString();
        ziVar.f145966d = str;
        ziVar.f145969g = i;
        HashMap hashMap = new HashMap();
        hashMap.put(SearchIntents.EXTRA_QUERY, str);
        hashMap.put("type", String.valueOf(i));
        hashMap.put("messageSvrID", String.valueOf(j));
        hashMap.put(IXWebPreferences.XWEB_LANGUAGE, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        hashMap.put("platform", Platform.ANDROID);
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46977a(2)));
        hashMap.put(DownloadInfo.NETTYPE, C43471q.m46979c());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", BuildInfo.CLIENT_VERSION);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("file://");
        stringBuffer.append(i2);
        stringBuffer.append("?");
        stringBuffer.append(C43471q.m46987k(hashMap));
        ziVar.f145968f = stringBuffer.toString();
        C39845c cVar = new C39845c(context, ziVar);
        cVar.show();
        cVar.getWindow().setLayout(-1, -1);
    }
}
