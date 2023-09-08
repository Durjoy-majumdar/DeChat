package em3;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.p136ui.magicemoji.core.MEHolderView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import dm3.C86351b;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;
import js0.C88020k;
import lc3.C10485b;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: em3.c */
public final class C86578c {
    /* renamed from: a */
    public final HashMap<String, Object> mo121025a(C86351b bVar, JSONObject jSONObject) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(jSONObject, "data");
        MEHolderView mEHolderView = bVar.f251056b;
        int i = 1;
        int width = mEHolderView.getWidth() > 0 ? mEHolderView.getWidth() : 1;
        if (mEHolderView.getHeight() > 0) {
            i = mEHolderView.getHeight();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("brand", Build.BRAND);
        hashMap.put("model", C87203t.m108275k());
        hashMap.put("abi", Build.CPU_ABI);
        hashMap.put("system", Build.VERSION.RELEASE);
        hashMap.put("windowWidth", Integer.valueOf(C88020k.m109555f(width)));
        hashMap.put("windowHeight", Integer.valueOf(C88020k.m109555f(i)));
        hashMap.put("pixelRatio", Float.valueOf(C88020k.m109556g()));
        hashMap.put("screenWidth", Integer.valueOf(C88020k.m109555f(width)));
        hashMap.put("screenHeight", Integer.valueOf(C88020k.m109555f(i)));
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, ChannelUtil.formatVersion((Context) null, BuildInfo.CLIENT_VERSION_INT));
        hashMap.put("benchmarkLevel", Integer.valueOf(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ClientBenchmarkLevel", -1)));
        hashMap.put("deviceOrientation", 2 == MMApplicationContext.getContext().getResources().getConfiguration().orientation ? "landscape" : "portrait");
        hashMap.put("fontSizeSetting", 0);
        return hashMap;
    }
}
