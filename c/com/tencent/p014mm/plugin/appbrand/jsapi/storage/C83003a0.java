package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lu3.C88656g;
import org.json.JSONObject;
import p1039tb.C90388a;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.a0 */
public class C83003a0 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 16;
    public static final String NAME = "setStorage";

    /* renamed from: g */
    public C83007d f242694g = new C83004a();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.a0$a */
    public class C83004a implements C83007d {
        public C83004a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.a0$b */
    public class C83005b implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C82554k f242696d;

        /* renamed from: e */
        public final /* synthetic */ int f242697e;

        /* renamed from: f */
        public final /* synthetic */ String f242698f;

        /* renamed from: g */
        public final /* synthetic */ String f242699g;

        /* renamed from: h */
        public final /* synthetic */ String f242700h;

        /* renamed from: i */
        public final /* synthetic */ String f242701i;

        /* renamed from: j */
        public final /* synthetic */ C83007d f242702j;

        /* renamed from: n */
        public final /* synthetic */ int f242703n;

        /* renamed from: o */
        public final /* synthetic */ long f242704o;

        public C83005b(C82554k kVar, int i, String str, String str2, String str3, String str4, C83007d dVar, int i2, long j) {
            this.f242696d = kVar;
            this.f242697e = i;
            this.f242698f = str;
            this.f242699g = str2;
            this.f242700h = str3;
            this.f242701i = str4;
            this.f242702j = dVar;
            this.f242703n = i2;
            this.f242704o = j;
        }

        public String getKey() {
            return "JsApiSetStorage";
        }

        public void run() {
            C90988l d0 = this.f242696d.getRuntime().mo113051d0();
            String d = C83011c0.m101819d(((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(this.f242696d.getAppId(), d0.f261073s, d0.f261075u).mo56595j0(this.f242697e, this.f242698f, this.f242699g, this.f242700h, this.f242701i));
            C83007d dVar = this.f242702j;
            if (dVar != null) {
                this.f242696d.mo109647a(this.f242703n, C83003a0.this.mo115109j(d));
            }
            C83003a0 a0Var = C83003a0.this;
            int b = C81420m0.m99896b(this.f242699g, this.f242700h);
            long j = this.f242704o;
            C82554k kVar = this.f242696d;
            a0Var.getClass();
            C81419l0.m99894a(2, 1, b, 1, System.currentTimeMillis() - j, kVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.a0$c */
    public class C83006c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83007d f242706d;

        /* renamed from: e */
        public final /* synthetic */ JsApiSetStorageTask f242707e;

        /* renamed from: f */
        public final /* synthetic */ C82554k f242708f;

        /* renamed from: g */
        public final /* synthetic */ int f242709g;

        /* renamed from: h */
        public final /* synthetic */ String f242710h;

        /* renamed from: i */
        public final /* synthetic */ String f242711i;

        /* renamed from: j */
        public final /* synthetic */ long f242712j;

        public C83006c(C83007d dVar, JsApiSetStorageTask jsApiSetStorageTask, C82554k kVar, int i, String str, String str2, long j) {
            this.f242706d = dVar;
            this.f242707e = jsApiSetStorageTask;
            this.f242708f = kVar;
            this.f242709g = i;
            this.f242710h = str;
            this.f242711i = str2;
            this.f242712j = j;
        }

        public void run() {
            C83007d dVar = this.f242706d;
            if (dVar != null) {
                this.f242708f.mo109647a(this.f242709g, C83003a0.this.mo115109j(this.f242707e.f242692t));
            }
            C83003a0 a0Var = C83003a0.this;
            int b = C81420m0.m99896b(this.f242710h, this.f242711i);
            long j = this.f242712j;
            C82554k kVar = this.f242708f;
            a0Var.getClass();
            C81419l0.m99894a(1, 1, b, 1, System.currentTimeMillis() - j, kVar);
            this.f242707e.mo114397h();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.a0$d */
    public interface C83007d {
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C82554k kVar = (C82554k) fVar;
        String optString = jSONObject2.optString("key");
        String optString2 = jSONObject2.optString("data");
        String optString3 = jSONObject2.optString("dataType");
        int i3 = 0;
        int optInt = jSONObject2.optInt("storageId", 0);
        if (Util.isNullOrNil(optString)) {
            kVar.mo109647a(i2, mo115109j("fail:key is empty"));
        } else if (C81420m0.m99897c(optInt)) {
            kVar.mo109647a(i2, mo115109j("fail:nonexistent storage space"));
        } else {
            String w = mo115265w(kVar);
            if (Util.isNullOrNil(w)) {
                kVar.mo109647a(i2, mo115109j("fail:appID is empty"));
                return;
            }
            C90988l d0 = kVar.getRuntime().mo113051d0();
            if (d0 == null) {
                Log.m105921e("MicroMsg.JsApiSetStorage", "invoke with appId[%s] callbackId[%d], NULL sysConfig", kVar.getAppId(), Integer.valueOf(i));
                kVar.mo109647a(i2, mo115109j("fail:internal error"));
                return;
            }
            int i4 = ((AppBrandSysConfigLU) d0).f234876S0.f239308i;
            int length = optString.length();
            if (optString2 != null) {
                i3 = optString2.length();
            }
            if (length + i3 > i4) {
                kVar.mo109647a(i2, mo115109j("fail:entry size limit reached"));
                return;
            }
            int i5 = d0.f261073s;
            if (C90988l.m114155a(i5)) {
                mo115267y(kVar, i, optInt, optString, optString2, optString3, w, this.f242694g);
            } else if (i5 == 3) {
                C82554k kVar2 = kVar;
                int i6 = i;
                int i7 = optInt;
                String str = optString;
                String str2 = optString2;
                String str3 = optString3;
                String str4 = w;
                mo115267y(kVar2, i6, i7, str, str2, str3, str4, this.f242694g);
                mo115266x(kVar2, i6, i7, str, str2, str3, str4, (C83007d) null);
            } else {
                mo115266x(kVar, i, optInt, optString, optString2, optString3, w, this.f242694g);
            }
        }
    }

    /* renamed from: w */
    public String mo115265w(C82554k kVar) {
        return kVar.getRuntime().f238147j;
    }

    /* renamed from: x */
    public final void mo115266x(C82554k kVar, int i, int i2, String str, String str2, String str3, String str4, C83007d dVar) {
        long currentTimeMillis = System.currentTimeMillis();
        JsApiSetStorageTask jsApiSetStorageTask = new JsApiSetStorageTask();
        jsApiSetStorageTask.f242681f = str4;
        jsApiSetStorageTask.f242682g = i2;
        String str5 = str;
        String str6 = str2;
        jsApiSetStorageTask.mo115260t(str5, str6, str3);
        jsApiSetStorageTask.f242683h = new C83006c(dVar, jsApiSetStorageTask, kVar, i, str5, str6, currentTimeMillis);
        jsApiSetStorageTask.mo114395c();
    }

    /* renamed from: y */
    public final void mo115267y(C82554k kVar, int i, int i2, String str, String str2, String str3, String str4, C83007d dVar) {
        kVar.getRuntime().mo113022O0(new C83005b(kVar, i2, str4, str, str2, str3, dVar, i, System.currentTimeMillis()));
    }
}
