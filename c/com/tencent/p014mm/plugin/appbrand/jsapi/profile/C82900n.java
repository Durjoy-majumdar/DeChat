package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.n */
public class C82900n extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 1190;
    private static final String NAME = "shareSpecificWxapp";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.n$a */
    public static class C82901a implements C80883e<Bundle, Bundle> {
        private C82901a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            WxaProfileAttributes b = C81661j.m100177b(bundle.getString("username"), false);
            Bundle bundle2 = new Bundle();
            bundle2.putString("brandIconURL", b.f239579h);
            bundle2.putString("nickname", b.f239577f);
            bundle2.putString("appId", b.f239576e);
            bundle2.putInt("tradingGuaranteeFlag", b.f239583o);
            bundle2.putInt("showRelievedBuyFlag", b.f239584p);
            bundle2.putString("username", bundle.getString("username"));
            gVar.mo894a(bundle2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.n$b */
    public static class C82902b implements C80883e<Bundle, IPCVoid> {
        private C82902b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195570f = bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            bVar.f195582i = bundle.getInt("type");
            bVar.f195573f2 = bundle.getString("appbrandUsername");
            bVar.f195577g2 = bundle.getString("appbrandAppId");
            bVar.f195581h2 = bundle.getInt("appbrandType");
            bVar.f195494H1 = bundle.getString("publisherId");
            bVar.f195646y = bundle.getString("thumburl");
            bVar.f195586j = bundle.getString("url");
            bVar.f195634v = bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            bVar.f195638w = bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C80995a aVar = new C80995a();
            aVar.f237905n = bundle.getInt("appbrandTradingGuaranteeFlag");
            aVar.f237906o = bundle.getInt("showRelievedBuyFlag");
            bVar.mo93545f(aVar);
            C80996q a = C80996q.C1279a.m1369a();
            String string = bundle.getString("appbrandAppId");
            a.mo112827qE(bVar, string, bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE), bundle.getString("username"), (String) null, (byte[]) null);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String optString = jSONObject.optString("username");
        if (optString != null) {
            Bundle bundle = new Bundle();
            bundle.putString("username", optString);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C82901a.class, new C82897l(this, optString, i2Var, i));
        }
    }
}
