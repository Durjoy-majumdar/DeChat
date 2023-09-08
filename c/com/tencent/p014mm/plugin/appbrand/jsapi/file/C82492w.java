package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.io.InputStream;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import p1044ub.C90636f;
import s24.C90125c;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.w */
public final class C82492w extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "loadJsFiles";

    /* renamed from: g */
    public static final C82493a f241553g = new C82493a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.w$a */
    public static final class C82493a {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.w$a$a */
        public static final class C82494a implements C84754j1.C84756b {

            /* renamed from: a */
            public final /* synthetic */ boolean[] f241554a;

            /* renamed from: b */
            public final /* synthetic */ int f241555b;

            /* renamed from: c */
            public final /* synthetic */ ValueCallback<String> f241556c;

            public C82494a(boolean[] zArr, int i, ValueCallback<String> valueCallback) {
                this.f241554a = zArr;
                this.f241555b = i;
                this.f241556c = valueCallback;
            }

            /* renamed from: b */
            public void mo114825b(String str) {
                this.f241554a[this.f241555b] = false;
                ValueCallback<String> valueCallback = this.f241556c;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(str);
                }
            }

            public void onSuccess(String str) {
                this.f241554a[this.f241555b] = true;
                ValueCallback<String> valueCallback = this.f241556c;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(str);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.w$a$b */
        public static final class C82495b<T> implements ValueCallback {

            /* renamed from: a */
            public final /* synthetic */ C82496b f241557a;

            /* renamed from: b */
            public final /* synthetic */ String f241558b;

            /* renamed from: c */
            public final /* synthetic */ C90636f.C90637a[] f241559c;

            /* renamed from: d */
            public final /* synthetic */ boolean[] f241560d;

            /* renamed from: e */
            public final /* synthetic */ Object[] f241561e;

            /* renamed from: f */
            public final /* synthetic */ long f241562f;

            public C82495b(C82496b bVar, String str, C90636f.C90637a[] aVarArr, boolean[] zArr, Object[] objArr, long j) {
                this.f241557a = bVar;
                this.f241558b = str;
                this.f241559c = aVarArr;
                this.f241560d = zArr;
                this.f241561e = objArr;
                this.f241562f = j;
            }

            public void onReceiveValue(Object obj) {
                String str = (String) obj;
                long nowMilliSecond = Util.nowMilliSecond();
                C82496b bVar = this.f241557a;
                if (bVar != null) {
                    bVar.mo114828N(this.f241558b, this.f241559c, this.f241560d, this.f241561e, this.f241562f, nowMilliSecond);
                }
            }
        }

        public C82493a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo114824a(AppBrandRuntime appBrandRuntime, JSONArray jSONArray, C83165i iVar, C81298o0 o0Var, String str, C82496b bVar) {
            Object[] objArr;
            int i;
            int i2;
            boolean[] zArr;
            boolean[] zArr2;
            String str2;
            int i3;
            URL url;
            AppBrandRuntime appBrandRuntime2 = appBrandRuntime;
            JSONArray jSONArray2 = jSONArray;
            C83165i iVar2 = iVar;
            C81298o0 o0Var2 = o0Var;
            C87412m.m108594g(appBrandRuntime2, "runtime");
            if (jSONArray2 == null || jSONArray.length() <= 0) {
                if (bVar != null) {
                    bVar.mo114828N(str, new C90636f.C90637a[0], new boolean[0], new Object[0], Util.nowMilliSecond(), Util.nowMilliSecond());
                }
            } else if (iVar2 != null && o0Var2 != null) {
                String str3 = appBrandRuntime2.f238147j;
                long nowMilliSecond = Util.nowMilliSecond();
                C90636f.C90637a[] aVarArr = new C90636f.C90637a[jSONArray.length()];
                int length = jSONArray.length();
                boolean[] zArr3 = new boolean[length];
                for (int i4 = 0; i4 < length; i4++) {
                    zArr3[i4] = false;
                }
                Object[] objArr2 = new Object[jSONArray.length()];
                int length2 = jSONArray.length();
                int i5 = 0;
                while (i5 < length2) {
                    C82495b bVar2 = null;
                    String optString = jSONArray2.optString(i5, (String) null);
                    if (optString == null) {
                        i2 = i5;
                        i = length2;
                        zArr = zArr3;
                        objArr = objArr2;
                    } else {
                        if (i5 == jSONArray.length() - 1) {
                            str2 = optString;
                            url = null;
                            i3 = i5;
                            i = length2;
                            zArr2 = zArr3;
                            objArr = objArr2;
                            bVar2 = new C82495b(bVar, str, aVarArr, zArr3, objArr2, nowMilliSecond);
                        } else {
                            str2 = optString;
                            url = null;
                            i3 = i5;
                            i = length2;
                            zArr2 = zArr3;
                            objArr = objArr2;
                        }
                        C81298o0.C81299a openReadPartialInfo = o0Var2.openReadPartialInfo(str2);
                        if (openReadPartialInfo == null) {
                            Log.m105920e("Luggage.WXA.JsApiLoadJsFiles", "loadJsFiles appId[" + str3 + "] path[" + str2 + "] EMPTY");
                            if (bVar2 != null) {
                                bVar2.onReceiveValue("404");
                            }
                            aVarArr[i3] = url;
                            zArr = zArr2;
                            zArr[i3] = false;
                            objArr[i3] = url;
                            i2 = i3;
                            C83165i iVar3 = iVar;
                        } else {
                            zArr = zArr2;
                            C90636f.C90637a aVar = new C90636f.C90637a();
                            aVar.f238716a = openReadPartialInfo.f238716a;
                            aVar.f238717b = openReadPartialInfo.f238717b;
                            aVar.f238718c = openReadPartialInfo.f238718c;
                            aVar.f238719d = openReadPartialInfo.f238719d;
                            aVar.f238720e = openReadPartialInfo.f238720e;
                            aVar.f238721f = openReadPartialInfo.f238721f;
                            aVar.f238722g = openReadPartialInfo.f238722g;
                            aVar.f238723h = openReadPartialInfo.f238723h;
                            aVar.f260400k = (long) openReadPartialInfo.f238723h;
                            aVar.f260398i = str2;
                            aVarArr[i3] = aVar;
                            InputStream g = o0Var2.mo113504g(str2);
                            C87412m.m108591d(g);
                            String d = C90125c.m112777d(g, C119027c.f356488a);
                            if (d == null) {
                                d = "";
                            }
                            aVar.f260399j = d;
                            aVar.f260400k = (long) d.length();
                            i2 = i3;
                            C84754j1.m104418b(iVar, url, d, new C82494a(zArr, i3, bVar2));
                        }
                    }
                    i5 = i2 + 1;
                    jSONArray2 = jSONArray;
                    zArr3 = zArr;
                    length2 = i;
                    objArr2 = objArr;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.w$b */
    public interface C82496b {
        /* renamed from: N */
        void mo114828N(String str, C90636f.C90637a[] aVarArr, boolean[] zArr, Object[] objArr, long j, long j2);
    }

    /* renamed from: w */
    public static final void m101253w(AppBrandRuntime appBrandRuntime, JSONArray jSONArray, C83165i iVar, C81298o0 o0Var, String str, C82496b bVar) {
        f241553g.mo114824a(appBrandRuntime, jSONArray, iVar, o0Var, str, bVar);
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        if (d1Var != null && jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("paths");
            String optString = jSONObject.optString("key");
            C82493a aVar = f241553g;
            AppBrandRuntime runtime = d1Var.getRuntime();
            C87412m.m108593f(runtime, "env.runtime");
            aVar.mo114824a(runtime, optJSONArray, d1Var.getJsRuntime(), d1Var.mo114270e0(), optString, new C82499x(d1Var, optJSONArray, i, this));
        }
    }
}
