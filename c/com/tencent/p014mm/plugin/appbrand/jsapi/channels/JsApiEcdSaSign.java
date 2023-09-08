package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86920e;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C90364q0;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign */
public final class JsApiEcdSaSign extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1095;
    public static final String NAME = "ecdsaSign";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest */
    public static final class SignRequest implements Parcelable {
        public static final Parcelable.Creator<SignRequest> CREATOR = new C82281a();

        /* renamed from: d */
        public final String f241198d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest$a */
        public static final class C82281a implements Parcelable.Creator<SignRequest> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new SignRequest(parcel.readString());
            }

            public Object[] newArray(int i) {
                return new SignRequest[i];
            }
        }

        public SignRequest(String str) {
            C87412m.m108594g(str, "params");
            this.f241198d = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignRequest) && C87412m.m108589b(this.f241198d, ((SignRequest) obj).f241198d);
        }

        public int hashCode() {
            return this.f241198d.hashCode();
        }

        public String toString() {
            return "SignRequest(params=" + this.f241198d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f241198d);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult */
    public static final class SignResult implements Parcelable {
        public static final Parcelable.Creator<SignResult> CREATOR = new C82282a();

        /* renamed from: d */
        public final String f241199d;

        /* renamed from: e */
        public final String f241200e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult$a */
        public static final class C82282a implements Parcelable.Creator<SignResult> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new SignResult(parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new SignResult[i];
            }
        }

        public SignResult(String str, String str2) {
            C87412m.m108594g(str, "signature");
            C87412m.m108594g(str2, "suffix");
            this.f241199d = str;
            this.f241200e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignResult)) {
                return false;
            }
            SignResult signResult = (SignResult) obj;
            return C87412m.m108589b(this.f241199d, signResult.f241199d) && C87412m.m108589b(this.f241200e, signResult.f241200e);
        }

        public int hashCode() {
            return (this.f241199d.hashCode() * 31) + this.f241200e.hashCode();
        }

        public String toString() {
            return "SignResult(signature=" + this.f241199d + ", suffix=" + this.f241200e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f241199d);
            parcel.writeString(this.f241200e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest;", "kotlin.jvm.PlatformType", "request", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignResult;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$a */
    public static final class C82283a<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C82283a<InputType, ResultType> f241201d = new C82283a<>();

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r7, com.tencent.p014mm.ipcinvoker.C1256g r8) {
            /*
                r6 = this;
                com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest r7 = (com.tencent.p014mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign.SignRequest) r7
                java.lang.String r0 = "MicroMsg.AppBrand.JsApiEcdSaSign"
                java.lang.String r1 = ""
                r2 = 0
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x007d }
                java.lang.String r7 = r7.f241198d     // Catch:{ Exception -> 0x007d }
                r3.<init>(r7)     // Catch:{ Exception -> 0x007d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
                r7.<init>()     // Catch:{ Exception -> 0x007d }
                java.lang.String r4 = "|AppId="
                r7.append(r4)     // Catch:{ Exception -> 0x007d }
                java.lang.String r4 = "appId"
                java.lang.String r4 = r3.optString(r4)     // Catch:{ Exception -> 0x007d }
                r7.append(r4)     // Catch:{ Exception -> 0x007d }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x007d }
                java.lang.String r4 = "signText"
                java.lang.String r3 = r3.optString(r4)     // Catch:{ Exception -> 0x007b }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
                r4.<init>()     // Catch:{ Exception -> 0x007b }
                java.lang.String r5 = "signText :"
                r4.append(r5)     // Catch:{ Exception -> 0x007b }
                r4.append(r3)     // Catch:{ Exception -> 0x007b }
                r4.append(r7)     // Catch:{ Exception -> 0x007b }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x007b }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x007b }
                com.tencent.mm.network.b r4 = com.tencent.p014mm.network.C114766b.f344135e     // Catch:{ Exception -> 0x007b }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
                r5.<init>()     // Catch:{ Exception -> 0x007b }
                r5.append(r3)     // Catch:{ Exception -> 0x007b }
                r5.append(r7)     // Catch:{ Exception -> 0x007b }
                java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x007b }
                java.lang.String r3 = r4.mo174418c(r3)     // Catch:{ Exception -> 0x007b }
                java.nio.charset.Charset r4 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x007b }
                byte[] r3 = r3.getBytes(r4)     // Catch:{ Exception -> 0x007b }
                java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
                gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x007b }
                java.lang.String r3 = android.util.Base64.encodeToString(r3, r2)     // Catch:{ Exception -> 0x007b }
                if (r8 == 0) goto L_0x0091
                com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult r4 = new com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult     // Catch:{ Exception -> 0x007b }
                java.lang.String r5 = "signature"
                gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x007b }
                r4.<init>(r3, r7)     // Catch:{ Exception -> 0x007b }
                r8.mo894a(r4)     // Catch:{ Exception -> 0x007b }
                goto L_0x0091
            L_0x007b:
                r3 = move-exception
                goto L_0x0080
            L_0x007d:
                r7 = move-exception
                r3 = r7
                r7 = r1
            L_0x0080:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r4 = "handleRequest fail"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r4, r2)
                if (r8 == 0) goto L_0x0091
                com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult r0 = new com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult
                r0.<init>(r1, r7)
                r8.mo894a(r0)
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign.C82283a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$b */
    public static final class C82284b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241202d;

        /* renamed from: e */
        public final /* synthetic */ int f241203e;

        /* renamed from: f */
        public final /* synthetic */ JsApiEcdSaSign f241204f;

        public C82284b(C82381f fVar, int i, JsApiEcdSaSign jsApiEcdSaSign) {
            this.f241202d = fVar;
            this.f241203e = i;
            this.f241204f = jsApiEcdSaSign;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            SignResult signResult = (SignResult) obj;
            this.f241202d.mo109647a(this.f241203e, this.f241204f.mo115110k((String) null, !Util.isNullOrNil(signResult.f241199d) ? C86920e.f252311a : C86920e.f252314d, C90364q0.m113146e(new C13604l("signature", signResult.f241199d), new C13604l("suffix", signResult.f241200e))));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiEcdSaSign", "invoke, env is null");
        } else if (fVar.getContext() == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiEcdSaSign", "invoke, context is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error invalid android context");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("fail:internal error invalid android context", jSONObject2));
        } else if (jSONObject == null || Util.isNullOrNil(jSONObject.optString("signText"))) {
            Log.m105928w("MicroMsg.AppBrand.JsApiEcdSaSign", "invoke, data is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            fVar.mo109647a(i, mo115115p("fail:invalid data", jSONObject3));
        } else {
            if (BuildInfo.DEBUG) {
                Log.m105918d("MicroMsg.AppBrand.JsApiEcdSaSign", "invoke, data: " + jSONObject);
            }
            try {
                jSONObject.put("appId", fVar.getAppId());
                String jSONObject4 = jSONObject.toString();
                C87412m.m108593f(jSONObject4, "data.toString()");
                C15618a.m14626b(new SignRequest(jSONObject4), C82283a.f241201d, new C82284b(fVar, i, this));
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.AppBrand.JsApiEcdSaSign", e3, "add appId to Json failed!", new Object[0]);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("errno", 101);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                }
                fVar.mo109647a(i, mo115115p("fail:invalid data", jSONObject5));
            }
        }
    }
}
