package tm0;

import android.content.Context;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p225rc.C89923l;

/* renamed from: tm0.k0 */
public final class C90544k0 implements C14037r0<C81879g> {
    /* renamed from: a */
    public Map mo13450a(String str, C82381f fVar) {
        C81634a F;
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(str, "type");
        C87412m.m108594g(gVar, "component");
        HashMap hashMap = new HashMap();
        C90551r.m113381z(hashMap, gVar);
        String currentLanguage = LocaleUtil.getCurrentLanguage(gVar.getContext());
        C87412m.m108593f(currentLanguage, "getCurrentLanguage(component.context)");
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, currentLanguage);
        String formatVersion = ChannelUtil.formatVersion((Context) null, BuildInfo.CLIENT_VERSION_INT);
        C87412m.m108593f(formatVersion, "formatVersion(null, BuildInfo.CLIENT_VERSION_INT)");
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, formatVersion);
        AppBrandRuntime runtime = gVar.getRuntime();
        boolean z = true;
        if (runtime == null || (F = runtime.mo113008F()) == null || !F.mo113987f()) {
            z = false;
        }
        if (z) {
            hashMap.put("theme", C89923l.f258408a.mo117499e(gVar.getAppId()) ? "dark" : "light");
        }
        return hashMap;
    }
}
