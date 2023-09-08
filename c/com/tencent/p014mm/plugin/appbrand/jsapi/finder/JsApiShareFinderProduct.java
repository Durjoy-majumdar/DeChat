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

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct */
public class JsApiShareFinderProduct extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1173;
    public static final String NAME = "shareFinderProduct";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var == null) {
            Log.m105928w("MicroMsg.Finder.JsApiShareFinderProduct", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.Finder.JsApiShareFinderProduct", "invoke, data is null");
            i2Var.mo109647a(i, mo115109j("fail:data is null"));
        } else {
            new ShareFinderProduct(i2Var, jSONObject, i).mo114395c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProduct */
    public static class ShareFinderProduct extends MainProcessTask {
        public static final Parcelable.Creator<ShareFinderProduct> CREATOR = new C1689a();

        /* renamed from: f */
        public C81925i2 f11377f;

        /* renamed from: g */
        public int f11378g;

        /* renamed from: h */
        public String f11379h;

        /* renamed from: i */
        public JSONObject f11380i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProduct$a */
        public class C1689a implements Parcelable.Creator<ShareFinderProduct> {
            public Object createFromParcel(Parcel parcel) {
                return new ShareFinderProduct(parcel);
            }

            public Object[] newArray(int i) {
                return new ShareFinderProduct[i];
            }
        }

        public ShareFinderProduct(C81925i2 i2Var, JSONObject jSONObject, int i) {
            this.f11377f = i2Var;
            this.f11378g = i;
            this.f11380i = jSONObject;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            try {
                this.f11380i = new JSONObject(parcel.readString());
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Finder.JsApiShareFinderProduct", e, "parseFromParcel", new Object[0]);
                this.f11380i = null;
            }
            this.f11379h = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            Log.m105925i("MicroMsg.Finder.JsApiShareFinderProduct", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", this.f11377f.getAppId(), this.f11379h, Integer.valueOf(this.f11378g), Boolean.valueOf(this.f11377f.isRunning()));
            this.f11377f.mo109647a(this.f11378g, this.f11379h);
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            if (this.f11380i != null) {
                Log.m105924i("MicroMsg.Finder.JsApiShareFinderProduct", "JsApiShareFinderProduct json:" + this.f11380i);
                ((C60606n) C86312j.m106911c(C60606n.class)).mo85095va(this.f11380i.optString("productID"), this.f11380i.optString("esSource"), this.f11380i.optString("finderLiveToken"), this.f11380i.optString("finderUsername"));
                mo114394b();
                return;
            }
            Log.m105920e("MicroMsg.Finder.JsApiShareFinderProduct", "data is null");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11380i.toString());
            parcel.writeString(this.f11379h);
        }

        public ShareFinderProduct(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
