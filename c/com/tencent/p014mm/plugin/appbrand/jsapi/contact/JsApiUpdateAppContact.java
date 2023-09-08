package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.C81677l;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact */
public final class JsApiUpdateAppContact extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1213;
    public static final String NAME = "updateAppContact";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/contact/JsApiUpdateAppContact$UpdateWxaAttrsTaskParam;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam */
    public static final class UpdateWxaAttrsTaskParam implements Parcelable {
        public static final Parcelable.Creator<UpdateWxaAttrsTaskParam> CREATOR = new C82322a();

        /* renamed from: d */
        public final String f241256d;

        /* renamed from: e */
        public final String f241257e;

        /* renamed from: f */
        public final boolean f241258f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam$a */
        public static final class C82322a implements Parcelable.Creator<UpdateWxaAttrsTaskParam> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new UpdateWxaAttrsTaskParam(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            public Object[] newArray(int i) {
                return new UpdateWxaAttrsTaskParam[i];
            }
        }

        public UpdateWxaAttrsTaskParam(String str, String str2, boolean z) {
            this.f241256d = str;
            this.f241257e = str2;
            this.f241258f = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateWxaAttrsTaskParam)) {
                return false;
            }
            UpdateWxaAttrsTaskParam updateWxaAttrsTaskParam = (UpdateWxaAttrsTaskParam) obj;
            return C87412m.m108589b(this.f241256d, updateWxaAttrsTaskParam.f241256d) && C87412m.m108589b(this.f241257e, updateWxaAttrsTaskParam.f241257e) && this.f241258f == updateWxaAttrsTaskParam.f241258f;
        }

        public int hashCode() {
            String str = this.f241256d;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f241257e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f241258f;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            return "UpdateWxaAttrsTaskParam(appId=" + this.f241256d + ", username=" + this.f241257e + ", isByAppId=" + this.f241258f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f241256d);
            parcel.writeString(this.f241257e);
            parcel.writeInt(this.f241258f ? 1 : 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/contact/JsApiUpdateAppContact$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/appbrand/jsapi/contact/JsApiUpdateAppContact$UpdateWxaAttrsTaskParam;", "Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$a */
    public static final class C82323a implements C80883e<UpdateWxaAttrsTaskParam, WxaProfileAttributes> {
        public void invoke(Object obj, C1256g gVar) {
            UpdateWxaAttrsTaskParam updateWxaAttrsTaskParam = (UpdateWxaAttrsTaskParam) obj;
            C87412m.m108594g(updateWxaAttrsTaskParam, "params");
            if (updateWxaAttrsTaskParam.f241258f) {
                String str = updateWxaAttrsTaskParam.f241256d;
                C81662k.m100191j(str, true, (C81662k.C81676l) null, new C81677l(str, (C81662k.C81673i) null), (PBool) null);
            } else {
                C81662k.m100190i(updateWxaAttrsTaskParam.f241257e, true, (C81662k.C81676l) null, (C81662k.C81673i) null);
            }
            boolean z = updateWxaAttrsTaskParam.f241258f;
            WxaProfileAttributes b = C81661j.m100177b(z ? updateWxaAttrsTaskParam.f241256d : updateWxaAttrsTaskParam.f241257e, z);
            if (gVar != null) {
                gVar.mo894a(b);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && jSONObject != null) {
            String optString = jSONObject.optString("username");
            String optString2 = jSONObject.optString("appId");
            if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2)) {
                XIPCInvoker.m98748a(MMApplicationContext.getMainProcessName(), new UpdateWxaAttrsTaskParam(optString2, optString, Util.isNullOrNil(optString)), C82323a.class, new C82350s(i2Var, i, this));
            }
        }
    }
}
