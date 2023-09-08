package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ht1.C60200t1;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiDeleteFinderDataItem */
public class JsApiDeleteFinderDataItem extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "deleteFinderDataItem";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.Finder.JsApiDeleteFinderDataItem", "JsApiDeleteFinderDataItem");
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail:data is null or nil"));
            return;
        }
        String optString = jSONObject.optString("dataItemId", "");
        String optString2 = jSONObject.optString("dataItemNonceId", "");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail:dataItemId is null or nil"));
        } else {
            new DeleteFinderTask(i2Var, i, optString, optString2).mo114395c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiDeleteFinderDataItem$DeleteFinderTask */
    public static class DeleteFinderTask extends MainProcessTask implements C11385n {
        public static final Parcelable.Creator<DeleteFinderTask> CREATOR = new C55499a();

        /* renamed from: f */
        public C81925i2 f158083f;

        /* renamed from: g */
        public int f158084g;

        /* renamed from: h */
        public String f158085h;

        /* renamed from: i */
        public String f158086i;

        /* renamed from: j */
        public String f158087j;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiDeleteFinderDataItem$DeleteFinderTask$a */
        public class C55499a implements Parcelable.Creator<DeleteFinderTask> {
            public Object createFromParcel(Parcel parcel) {
                return new DeleteFinderTask(parcel);
            }

            public Object[] newArray(int i) {
                return new DeleteFinderTask[i];
            }
        }

        public DeleteFinderTask(C81925i2 i2Var, int i, String str, String str2) {
            this.f158083f = i2Var;
            this.f158084g = i;
            this.f158085h = str;
            this.f158086i = str2;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f158085h = parcel.readString();
            this.f158086i = parcel.readString();
            this.f158087j = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            Log.m105925i("MicroMsg.Finder.JsApiDeleteFinderDataItem", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", this.f158083f.getAppId(), this.f158087j, Integer.valueOf(this.f158084g), Boolean.valueOf(this.f158083f.isRunning()));
            this.f158083f.mo109647a(this.f158084g, this.f158087j);
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            C117747y K9 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76774K9(C75592q0.m90778h(), Long.valueOf(this.f158085h).longValue(), this.f158086i);
            C86709a0.m107524d().mo123455a(3627, this);
            C86709a0.m107524d().mo123460f(K9);
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(3627, this);
            JSONObject jSONObject = new JSONObject();
            if (i == 0 && i2 == 0) {
                this.f158087j = C1690a.m1745a("", 0, jSONObject);
            } else {
                this.f158087j = C1690a.m1745a(str, i2, jSONObject);
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f158085h);
            parcel.writeString(this.f158086i);
            parcel.writeString(this.f158087j);
        }

        public DeleteFinderTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
