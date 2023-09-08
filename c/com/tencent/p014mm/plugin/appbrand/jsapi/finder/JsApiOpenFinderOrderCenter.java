package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p565ir.C60606n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiOpenFinderOrderCenter */
public class JsApiOpenFinderOrderCenter extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1201;
    public static final String NAME = "openChannelsOrderCenter";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var == null) {
            Log.m105928w("MicroMsg.Finder.JsApiOpenFinderOrderCenter", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.Finder.JsApiOpenFinderOrderCenter", "invoke, data is null");
        } else {
            new OpenOrderCenter(i2Var, jSONObject, i).mo114395c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiOpenFinderOrderCenter$OpenOrderCenter */
    public static class OpenOrderCenter extends MainProcessTask {
        public static final Parcelable.Creator<OpenOrderCenter> CREATOR = new C1688a();

        /* renamed from: f */
        public C81925i2 f11373f;

        /* renamed from: g */
        public int f11374g;

        /* renamed from: h */
        public String f11375h;

        /* renamed from: i */
        public JSONObject f11376i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiOpenFinderOrderCenter$OpenOrderCenter$a */
        public class C1688a implements Parcelable.Creator<OpenOrderCenter> {
            public Object createFromParcel(Parcel parcel) {
                return new OpenOrderCenter(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenOrderCenter[i];
            }
        }

        public OpenOrderCenter(C81925i2 i2Var, JSONObject jSONObject, int i) {
            this.f11373f = i2Var;
            this.f11374g = i;
            this.f11376i = jSONObject;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            try {
                this.f11376i = new JSONObject(parcel.readString());
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Finder.JsApiOpenFinderOrderCenter", e, "parseFromParcel", new Object[0]);
                this.f11376i = null;
            }
            this.f11375h = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            Log.m105925i("MicroMsg.Finder.JsApiOpenFinderOrderCenter", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", this.f11373f.getAppId(), this.f11375h, Integer.valueOf(this.f11374g), Boolean.valueOf(this.f11373f.isRunning()));
            this.f11373f.mo109647a(this.f11374g, this.f11375h);
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            if (this.f11376i != null) {
                Log.m105924i("MicroMsg.Finder.JsApiOpenFinderOrderCenter", "json:" + this.f11376i);
                ((C60606n) C86312j.m106911c(C60606n.class)).mo85066jY(this.f11376i.optString("filteringShopAppId"), this.f11376i.optString("filteringShopName"));
                mo114394b();
                return;
            }
            Log.m105920e("MicroMsg.Finder.JsApiOpenFinderOrderCenter", "data is null");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11376i.toString());
            parcel.writeString(this.f11375h);
        }

        public OpenOrderCenter(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
