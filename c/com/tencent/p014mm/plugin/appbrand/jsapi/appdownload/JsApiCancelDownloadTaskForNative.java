package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13754y;
import p237sp.C48456t;
import p749xh.C53352w2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTaskForNative */
public class JsApiCancelDownloadTaskForNative extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 657;
    public static final String NAME = "cancelDownloadTaskForNative";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTaskForNative$CancelDownloadTask */
    public static class CancelDownloadTask extends MainProcessTask {

        /* renamed from: f */
        public JSONArray f11132f;

        /* renamed from: g */
        public C82268c f11133g;

        /* renamed from: h */
        public C81925i2 f11134h;

        /* renamed from: i */
        public int f11135i;

        public CancelDownloadTask(JSONArray jSONArray, C82268c cVar, C81925i2 i2Var, int i) {
            this.f11132f = jSONArray;
            this.f11133g = cVar;
            this.f11134h = i2Var;
            this.f11135i = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            String readString = parcel.readString();
            if (readString != null) {
                try {
                    this.f11132f = new JSONArray(readString);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.JsApiCancelDownloadTaskForNative", "parseFromParcel: " + e.getMessage());
                }
            }
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            this.f11134h.mo109647a(this.f11135i, this.f11133g.mo115109j("ok"));
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C48456t.class;
            JSONArray jSONArray = this.f11132f;
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < this.f11132f.length(); i++) {
                    long optLong = this.f11132f.optLong(i);
                    C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(optLong);
                    if (nh == null || nh.field_status != 3) {
                        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(optLong);
                    } else {
                        Log.m105925i("MicroMsg.JsApiCancelDownloadTaskForNative", "canceldownloadtask, path: %s", nh.field_filePath);
                        C86013q1.m106447h(nh.field_filePath);
                        ((C48456t) C86312j.m106911c(cls)).tm0(nh.field_downloadUrl);
                    }
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            JSONArray jSONArray = this.f11132f;
            parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105918d("MicroMsg.JsApiCancelDownloadTaskForNative", "invoke");
        JSONArray optJSONArray = jSONObject.optJSONArray("downloadIdArray");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            Log.m105920e("MicroMsg.JsApiCancelDownloadTaskForNative", "doCancelDownloadTask fail, invalid downloadIdArray");
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        new CancelDownloadTask(optJSONArray, this, i2Var, i).mo114395c();
    }
}
