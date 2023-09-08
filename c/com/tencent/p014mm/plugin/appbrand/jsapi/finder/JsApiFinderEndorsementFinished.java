package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFinderEndorsementFinished */
public class JsApiFinderEndorsementFinished extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "endorsementFinished";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.Finder.JsApiFinderEndorsementFinished", NAME);
        if (jSONObject == null) {
            i2Var.mo109647a(i, "fail:data is null");
            return;
        }
        String optString = jSONObject.optString("finderUserName", "");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, "fail:finderUserName is null");
        } else {
            new FinderUserPageTask(optString).mo114395c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFinderEndorsementFinished$FinderUserPageTask */
    public static class FinderUserPageTask extends MainProcessTask {
        public static final Parcelable.Creator<FinderUserPageTask> CREATOR = new C82505a();

        /* renamed from: f */
        public String f241577f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFinderEndorsementFinished$FinderUserPageTask$a */
        public class C82505a implements Parcelable.Creator<FinderUserPageTask> {
            public Object createFromParcel(Parcel parcel) {
                return new FinderUserPageTask(parcel, (C82506a) null);
            }

            public Object[] newArray(int i) {
                return new FinderUserPageTask[i];
            }
        }

        public FinderUserPageTask(Parcel parcel, C82506a aVar) {
            this.f241577f = parcel.readString();
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f241577f = parcel.readString();
        }

        /* renamed from: j */
        public void mo1553j() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f241577f);
        }

        public FinderUserPageTask(String str) {
            this.f241577f = str;
        }
    }
}
