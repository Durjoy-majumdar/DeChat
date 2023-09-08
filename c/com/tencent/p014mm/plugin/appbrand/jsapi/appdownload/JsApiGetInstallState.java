package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
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

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState */
public class JsApiGetInstallState extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 439;
    public static final String NAME = "getInstallState";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiGetInstallState", "invoke");
        new GetInstallStateTask(this, fVar, i, jSONObject).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState$GetInstallStateTask */
    public static class GetInstallStateTask extends MainProcessTask {
        public static final Parcelable.Creator<GetInstallStateTask> CREATOR = new C1592a();

        /* renamed from: f */
        public C82870p f11136f;

        /* renamed from: g */
        public C82381f f11137g;

        /* renamed from: h */
        public int f11138h;

        /* renamed from: i */
        public String f11139i;

        /* renamed from: j */
        public String f11140j;

        /* renamed from: n */
        public JSONArray f11141n;

        /* renamed from: o */
        public boolean f11142o;

        /* renamed from: p */
        public String f11143p;

        /* renamed from: q */
        public boolean f11144q;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState$GetInstallStateTask$a */
        public class C1592a implements Parcelable.Creator<GetInstallStateTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetInstallStateTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetInstallStateTask[i];
            }
        }

        public GetInstallStateTask(C82870p pVar, C82381f fVar, int i, JSONObject jSONObject) {
            this.f11136f = pVar;
            this.f11137g = fVar;
            this.f11138h = i;
            this.f11139i = jSONObject.optString("packageName");
            JSONArray optJSONArray = jSONObject.optJSONArray("packageNameArray");
            if (optJSONArray != null) {
                this.f11140j = optJSONArray.toString();
            }
            this.f11144q = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11139i = parcel.readString();
            this.f11140j = parcel.readString();
            boolean z = false;
            this.f11144q = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f11142o = z;
            this.f11143p = parcel.readString();
            String readString = parcel.readString();
            if (readString != null) {
                try {
                    this.f11141n = new JSONArray(readString);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.JsApiGetInstallState", "parseFromParcel: " + e.getMessage());
                }
            }
        }

        /* renamed from: i */
        public void mo1552i() {
            boolean z = true;
            Object[] objArr = new Object[1];
            if (this.f11137g != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105919d("MicroMsg.JsApiGetInstallState", "callback, service is null: %b", objArr);
            mo114397h();
            if (this.f11144q) {
                this.f11137g.mo109647a(this.f11138h, this.f11136f.mo115109j("fail"));
                return;
            }
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = this.f11141n;
            if (jSONArray != null) {
                hashMap.put("result", jSONArray);
            } else {
                hashMap.put("versionName", this.f11143p);
                hashMap.put("isInstalled", Boolean.valueOf(this.f11142o));
            }
            this.f11137g.mo109647a(this.f11138h, this.f11136f.mo115112m("ok", hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            String str = "null";
            if (!Util.isNullOrNil(this.f11140j)) {
                try {
                    JSONArray jSONArray = new JSONArray(this.f11140j);
                    this.f11141n = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i);
                        PackageInfo a = C9512b.m9207a(MMApplicationContext.getContext(), optString);
                        int i2 = a == null ? 0 : a.versionCode;
                        String str2 = a == null ? str : a.versionName;
                        Log.m105924i("MicroMsg.JsApiGetInstallState", "getInstallState, packageName = " + optString + ", packageInfo = " + a + ", version = " + i2 + ", versionName = " + str2);
                        boolean z = a != null;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("packageName", optString);
                            jSONObject.put("isInstalled", z);
                            if (z) {
                                jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, i2);
                                jSONObject.put("versionName", str2);
                            }
                            this.f11141n.put(jSONObject);
                        } catch (JSONException e) {
                            Log.m105924i("MicroMsg.JsApiGetInstallState", e.getMessage());
                        }
                    }
                    this.f11144q = false;
                } catch (JSONException e2) {
                    Log.m105920e("MicroMsg.JsApiGetInstallState", e2.getMessage());
                    this.f11144q = true;
                }
            } else {
                PackageInfo a2 = C9512b.m9207a(MMApplicationContext.getContext(), this.f11139i);
                int i3 = a2 == null ? 0 : a2.versionCode;
                if (a2 != null) {
                    str = a2.versionName;
                }
                Log.m105924i("MicroMsg.JsApiGetInstallState", "doGetInstallState, packageName = " + this.f11139i + ", packageInfo = " + a2 + ", version = " + i3 + ", versionName = " + str);
                if (a2 == null) {
                    this.f11142o = false;
                } else {
                    this.f11143p = str;
                    this.f11142o = true;
                }
                this.f11144q = false;
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11139i);
            parcel.writeString(this.f11140j);
            parcel.writeInt(this.f11144q ? 1 : 0);
            parcel.writeInt(this.f11142o ? 1 : 0);
            parcel.writeString(this.f11143p);
            JSONArray jSONArray = this.f11141n;
            parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
        }

        public GetInstallStateTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
