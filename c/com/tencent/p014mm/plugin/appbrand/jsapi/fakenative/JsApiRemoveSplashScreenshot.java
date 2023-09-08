package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gs0.C87324b;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C88267e;
import org.json.JSONObject;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot */
public final class JsApiRemoveSplashScreenshot extends C82268c<C88267e> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "removeSplashScreenshot";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/fakenative/JsApiRemoveSplashScreenshot$RemoveParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams */
    public static final class RemoveParams implements Parcelable {
        public static final Parcelable.Creator<RemoveParams> CREATOR = new C29510a();

        /* renamed from: d */
        public final String f80388d;

        /* renamed from: e */
        public final int f80389e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams$a */
        public static final class C29510a implements Parcelable.Creator<RemoveParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new RemoveParams(parcel.readString(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new RemoveParams[i];
            }
        }

        public RemoveParams(String str, int i) {
            C87412m.m108594g(str, "appId");
            this.f80388d = str;
            this.f80389e = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveParams)) {
                return false;
            }
            RemoveParams removeParams = (RemoveParams) obj;
            return C87412m.m108589b(this.f80388d, removeParams.f80388d) && this.f80389e == removeParams.f80389e;
        }

        public int hashCode() {
            return (this.f80388d.hashCode() * 31) + this.f80389e;
        }

        public String toString() {
            return "RemoveParams(appId=" + this.f80388d + ", versionType=" + this.f80389e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f80388d);
            parcel.writeInt(this.f80389e);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (eVar != null) {
            if (!(C87324b.f253068f.mo58669a() && eVar.getRuntime().mo113210l1().f239373d1)) {
                eVar.mo109647a(i, mo115109j("fail:not supported"));
                return;
            }
            String appId = eVar.getAppId();
            C87412m.m108593f(appId, "env.appId");
            C15618a.m14627c(new RemoveParams(appId, eVar.getRuntime().f238149o.f239365g), C29511j.f80390d, (C1256g) null, 4, (Object) null);
            eVar.mo109647a(i, mo115109j("ok"));
        }
    }
}
