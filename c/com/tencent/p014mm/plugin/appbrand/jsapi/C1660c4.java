package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c4 */
public class C1660c4 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82554k f11324a;

    /* renamed from: b */
    public final /* synthetic */ int f11325b;

    /* renamed from: c */
    public final /* synthetic */ C82369d4 f11326c;

    public C1660c4(C82369d4 d4Var, C82554k kVar, int i) {
        this.f11326c = d4Var;
        this.f11324a = kVar;
        this.f11325b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        Object obj;
        String str;
        int i3 = i2;
        Intent intent2 = intent;
        if (i != (this.f11326c.hashCode() & 65535)) {
            return false;
        }
        if (i3 == -1 && intent2 != null) {
            String nullAs = Util.nullAs(intent2.getStringExtra("nationalCode"), "");
            String nullAs2 = Util.nullAs(intent2.getStringExtra("userName"), "");
            String nullAs3 = Util.nullAs(intent2.getStringExtra("telNumber"), "");
            String nullAs4 = Util.nullAs(intent2.getStringExtra("addressPostalCode"), "");
            String nullAs5 = Util.nullAs(intent2.getStringExtra("proviceFirstStageName"), "");
            String nullAs6 = Util.nullAs(intent2.getStringExtra("addressCitySecondStageName"), "");
            Object obj2 = "addressCitySecondStageName";
            String nullAs7 = Util.nullAs(intent2.getStringExtra("addressCountiesThirdStageName"), "");
            Object obj3 = "addressCountiesThirdStageName";
            String nullAs8 = Util.nullAs(intent2.getStringExtra("addressCountiesFourStageName"), "");
            Object obj4 = "proviceFirstStageName";
            String nullAs9 = Util.nullAs(intent2.getStringExtra("addressDetailInfo"), "");
            if (TextUtils.isEmpty(nullAs8) || nullAs9.startsWith(nullAs8)) {
                obj = "addressDetailInfo";
                str = nullAs9;
            } else {
                obj = "addressDetailInfo";
                str = String.format("%s%s", new Object[]{nullAs8, nullAs9});
            }
            StringBuilder sb = new StringBuilder();
            String str2 = str;
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
            Log.m105924i("MicroMsg.JsApiOpenAddress", sb.toString());
            if (!Util.isNullOrNil(nullAs2)) {
                HashMap hashMap = new HashMap();
                this.f11326c.getClass();
                hashMap.put("nationalCode", nullAs.length() < 6 ? nullAs : nullAs.substring(0, 6));
                hashMap.put("userName", nullAs2);
                hashMap.put("telNumber", nullAs3);
                hashMap.put("addressPostalCode", nullAs4);
                hashMap.put(obj4, nullAs5);
                hashMap.put(obj2, nullAs6);
                hashMap.put(obj3, nullAs7);
                hashMap.put("addressStreetFourthStageName", nullAs8);
                hashMap.put(obj, str2);
                hashMap.put("addressDetailInfoNew", nullAs9);
                hashMap.put("nationalCodeFull", nullAs);
                this.f11324a.mo109647a(this.f11325b, this.f11326c.mo115112m("ok", hashMap));
                return true;
            }
        }
        if (i2 == 0) {
            this.f11324a.mo109647a(this.f11325b, this.f11326c.mo115109j("cancel"));
            return true;
        }
        this.f11324a.mo109647a(this.f11325b, this.f11326c.mo115109j("fail"));
        return true;
    }
}
