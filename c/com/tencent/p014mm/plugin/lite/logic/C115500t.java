package com.tencent.p014mm.plugin.lite.logic;

import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import f62.C31922b1;
import java.util.Map;
import ob0.C35136m;
import p244tt.C14088e;
import q22.C12037c;
import tw0.C90587j;

/* renamed from: com.tencent.mm.plugin.lite.logic.t */
public class C115500t implements C31922b1 {

    /* renamed from: com.tencent.mm.plugin.lite.logic.t$a */
    public class C4807a implements C115477b {

        /* renamed from: a */
        public final /* synthetic */ String[] f19841a;

        /* renamed from: b */
        public final /* synthetic */ int f19842b;

        /* renamed from: c */
        public final /* synthetic */ double f19843c;

        public C4807a(C115500t tVar, String[] strArr, int i, double d) {
            this.f19841a = strArr;
            this.f19842b = i;
            this.f19843c = d;
        }

        /* renamed from: a */
        public void mo5700a(String str, int i) {
        }

        /* renamed from: b */
        public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("appId", wxaLiteAppInfo.f339290d);
            String str = this.f19841a[0];
            if (str != null) {
                bundle.putString("path", str);
            }
            String str2 = this.f19841a[1];
            if (str2 != null) {
                bundle.putString(SearchIntents.EXTRA_QUERY, str2);
            }
            if (1 == this.f19842b) {
                bundle.putBoolean("isHalfScreen", true);
                double d = this.f19843c;
                if (d != 0.0d) {
                    bundle.putDouble("heightPercent", d);
                }
            }
            if (2 != this.f19842b) {
                ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, true, false, (C14088e.C14090b) null);
            }
        }
    }

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Map<String, String> map2 = map;
        if (!C86709a0.m107522a()) {
            return null;
        }
        Log.m105925i("MicroMsg.LiteAppNewXmlConsumer", "liteapp consumeNewXml subtype: %s values: %s", str, map.toString());
        if (map2.containsKey(".sysmsg.mmlite.pkg_cdn_url") && map2.containsKey(".sysmsg.mmlite.app_id") && map2.containsKey(".sysmsg.mmlite.pkg_ecsda_pubkey") && map2.containsKey(".sysmsg.mmlite.pkg_md5")) {
            C90587j jVar = new C90587j();
            jVar.f260269a = map2.get(".sysmsg.mmlite.app_id");
            jVar.f260272d = map2.get(".sysmsg.mmlite.pkg_cdn_url");
            jVar.f260273e = map2.get(".sysmsg.mmlite.pkg_md5");
            jVar.f260275g = map2.get(".sysmsg.mmlite.pkg_ecsda_pubkey");
            String[] strArr = new String[2];
            if (map2.containsKey(".sysmsg.mmlite.entry") && !map2.get(".sysmsg.mmlite.entry").isEmpty()) {
                Log.m105924i("MicroMsg.LiteAppNewXmlConsumer", "liteapp consumeNewXml entry:" + map2.get(".sysmsg.mmlite.entry"));
                strArr = C12037c.m11741c(map2.get(".sysmsg.mmlite.entry"), false);
            }
            String[] strArr2 = strArr;
            int parseInt = (!map2.containsKey(".sysmsg.mmlite.is_half_screen") || map2.get(".sysmsg.mmlite.is_half_screen").isEmpty()) ? 0 : Integer.parseInt(map2.get(".sysmsg.mmlite.is_half_screen"));
            C115485l.INSTANCE.mo175462a(jVar, "debug", (C115492q.C115496d) null, new C4807a(this, strArr2, parseInt, (1 != parseInt || !map2.containsKey(".sysmsg.mmlite.height_percent") || map2.get(".sysmsg.mmlite.height_percent").isEmpty()) ? 0.0d : (double) (((float) Integer.parseInt(map2.get(".sysmsg.mmlite.height_percent"))) / 100.0f)));
        }
        return null;
    }
}
