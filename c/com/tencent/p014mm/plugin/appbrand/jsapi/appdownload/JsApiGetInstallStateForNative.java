package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.HashMap;
import js0.C9512b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallStateForNative */
public class JsApiGetInstallStateForNative extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 656;
    public static final String NAME = "getInstallStateForNative";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiGetInstallStateForNative", "invoke");
        new GetInstallStateTask(this, (C81925i2) fVar, i, jSONObject).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallStateForNative$GetInstallStateTask */
    public static class GetInstallStateTask extends MainProcessTask {
        public static final Parcelable.Creator<GetInstallStateTask> CREATOR = new C1593a();

        /* renamed from: f */
        public C82870p f11145f;

        /* renamed from: g */
        public C81925i2 f11146g;

        /* renamed from: h */
        public int f11147h;

        /* renamed from: i */
        public String f11148i;

        /* renamed from: j */
        public String f11149j;

        /* renamed from: n */
        public JSONArray f11150n;

        /* renamed from: o */
        public boolean f11151o;

        /* renamed from: p */
        public String f11152p;

        /* renamed from: q */
        public boolean f11153q;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallStateForNative$GetInstallStateTask$a */
        public class C1593a implements Parcelable.Creator<GetInstallStateTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetInstallStateTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetInstallStateTask[i];
            }
        }

        public GetInstallStateTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11145f = pVar;
            this.f11146g = i2Var;
            this.f11147h = i;
            this.f11148i = jSONObject.optString("packageName");
            JSONArray optJSONArray = jSONObject.optJSONArray("packageNameArray");
            if (optJSONArray != null) {
                this.f11149j = optJSONArray.toString();
            }
            this.f11153q = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11148i = parcel.readString();
            this.f11149j = parcel.readString();
            boolean z = false;
            this.f11153q = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f11151o = z;
            this.f11152p = parcel.readString();
            String readString = parcel.readString();
            if (readString != null) {
                try {
                    this.f11150n = new JSONArray(readString);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.JsApiGetInstallStateForNative", "parseFromParcel: " + e.getMessage());
                }
            }
        }

        /* renamed from: i */
        public void mo1552i() {
            boolean z = true;
            Object[] objArr = new Object[1];
            if (this.f11146g != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105919d("MicroMsg.JsApiGetInstallStateForNative", "callback, service is null: %b", objArr);
            mo114397h();
            if (this.f11153q) {
                this.f11146g.mo109647a(this.f11147h, this.f11145f.mo115109j("fail"));
                return;
            }
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = this.f11150n;
            if (jSONArray != null) {
                hashMap.put("result", jSONArray);
            } else {
                hashMap.put("versionName", this.f11152p);
                hashMap.put("isInstalled", Boolean.valueOf(this.f11151o));
            }
            this.f11146g.mo109647a(this.f11147h, this.f11145f.mo115112m("ok", hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            String str = "null";
            if (!Util.isNullOrNil(this.f11149j)) {
                try {
                    JSONArray jSONArray = new JSONArray(this.f11149j);
                    this.f11150n = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i);
                        PackageInfo a = C9512b.m9207a(MMApplicationContext.getContext(), optString);
                        int i2 = a == null ? 0 : a.versionCode;
                        String str2 = a == null ? str : a.versionName;
                        Log.m105924i("MicroMsg.JsApiGetInstallStateForNative", "getInstallState, packageName = " + optString + ", packageInfo = " + a + ", version = " + i2 + ", versionName = " + str2);
                        boolean z = a != null;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("packageName", optString);
                            jSONObject.put("isInstalled", z);
                            if (z) {
                                jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, i2);
                                jSONObject.put("versionName", str2);
                            }
                            this.f11150n.put(jSONObject);
                        } catch (JSONException e) {
                            Log.m105924i("MicroMsg.JsApiGetInstallStateForNative", e.getMessage());
                        }
                    }
                    this.f11153q = false;
                } catch (JSONException e2) {
                    Log.m105920e("MicroMsg.JsApiGetInstallStateForNative", e2.getMessage());
                    this.f11153q = true;
                }
            } else {
                PackageInfo a2 = C9512b.m9207a(MMApplicationContext.getContext(), this.f11148i);
                int i3 = a2 == null ? 0 : a2.versionCode;
                if (a2 != null) {
                    str = a2.versionName;
                }
                Log.m105924i("MicroMsg.JsApiGetInstallStateForNative", "doGetInstallState, packageName = " + this.f11148i + ", packageInfo = " + a2 + ", version = " + i3 + ", versionName = " + str);
                if (a2 == null) {
                    this.f11151o = false;
                } else {
                    this.f11152p = str;
                    this.f11151o = true;
                }
                this.f11153q = false;
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11148i);
            parcel.writeString(this.f11149j);
            parcel.writeInt(this.f11153q ? 1 : 0);
            parcel.writeInt(this.f11151o ? 1 : 0);
            parcel.writeString(this.f11152p);
            JSONArray jSONArray = this.f11150n;
            parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
        }

        public GetInstallStateTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
