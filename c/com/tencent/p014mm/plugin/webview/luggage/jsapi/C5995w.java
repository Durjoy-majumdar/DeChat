package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.w */
public class C5995w extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.w$a */
    public class C5996a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22245d;

        public C5996a(C53096b.C53097a aVar) {
            this.f22245d = aVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            int i3 = i2;
            Intent intent2 = intent;
            if (i == (C5995w.this.hashCode() & 65535)) {
                ((MMActivity) ((C43658n) this.f22245d.f148189a).f148196d).mmSetOnActivityResultCallback((MMActivity.C6739d) null);
                if (i3 == -1 && intent2 != null) {
                    String nullAs = Util.nullAs(intent2.getStringExtra("nationalCode"), "");
                    String nullAs2 = Util.nullAs(intent2.getStringExtra("userName"), "");
                    String nullAs3 = Util.nullAs(intent2.getStringExtra("telNumber"), "");
                    String nullAs4 = Util.nullAs(intent2.getStringExtra("addressPostalCode"), "");
                    String nullAs5 = Util.nullAs(intent2.getStringExtra("proviceFirstStageName"), "");
                    String nullAs6 = Util.nullAs(intent2.getStringExtra("addressCitySecondStageName"), "");
                    Object obj = "addressCitySecondStageName";
                    String nullAs7 = Util.nullAs(intent2.getStringExtra("addressCountiesThirdStageName"), "");
                    Object obj2 = "addressCountiesThirdStageName";
                    String nullAs8 = Util.nullAs(intent2.getStringExtra("addressCountiesFourStageName"), "");
                    Object obj3 = "proviceFirstStageName";
                    String nullAs9 = Util.nullAs(intent2.getStringExtra("addressDetailInfo"), "");
                    Object obj4 = "addressDetailInfo";
                    String format = (TextUtils.isEmpty(nullAs8) || nullAs9.startsWith(nullAs8)) ? nullAs9 : String.format("%s%s", new Object[]{nullAs8, nullAs9});
                    StringBuilder sb = new StringBuilder();
                    String str = format;
                    sb.append("first =  ");
                    sb.append(nullAs5);
                    sb.append(" ; detail =");
                    sb.append(nullAs9);
                    sb.append("; second = ");
                    sb.append(nullAs6);
                    sb.append(" ; tel = ");
                    sb.append(nullAs3);
                    sb.append("; third = ");
                    sb.append(nullAs7);
                    Log.m105924i("MicroMsg.JsApiEditAddress", sb.toString());
                    if (!Util.isNullOrNil(nullAs2)) {
                        HashMap hashMap = new HashMap();
                        C5995w.this.getClass();
                        hashMap.put("nationalCode", nullAs.length() < 6 ? nullAs : nullAs.substring(0, 6));
                        hashMap.put("nationalCodeFull", nullAs);
                        hashMap.put("userName", nullAs2);
                        hashMap.put("telNumber", nullAs3);
                        hashMap.put("addressPostalCode", nullAs4);
                        hashMap.put(obj3, nullAs5);
                        hashMap.put(obj, nullAs6);
                        hashMap.put(obj2, nullAs7);
                        hashMap.put("addressStreetFourthStageName", nullAs8);
                        hashMap.put(obj4, str);
                        hashMap.put("addressDetailInfoNew", nullAs9);
                        this.f22245d.mo73779d(hashMap);
                        return;
                    }
                }
                if (i2 == 0) {
                    this.f22245d.mo73778c("cancel", (JSONObject) null);
                } else {
                    this.f22245d.mo73778c("fail", (JSONObject) null);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "editAddress";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Intent intent = new Intent();
        String v = ((C43658n) aVar.f148189a).mo67943v();
        intent.putExtra("req_url", v);
        String b = ((C43658n) aVar.f148189a).f117923M.mo67920b();
        if (Util.isNullOrNil(b) && !Util.isNullOrNil(v) && Uri.parse(v).getHost().equals(WeChatHosts.domainString(C0966R.string.flk))) {
            b = "wx62d9035fd4fd2059";
        }
        intent.putExtra("req_app_id", b);
        intent.putExtra("launch_from_webview", true);
        ((MMActivity) ((C43658n) aVar.f148189a).f148196d).mmSetOnActivityResultCallback(new C5996a(aVar));
        C88144b.m109796n(((C43658n) aVar.f148189a).f148196d, "address", ".ui.WalletSelectAddrUI", intent, hashCode() & 65535, false);
    }
}
