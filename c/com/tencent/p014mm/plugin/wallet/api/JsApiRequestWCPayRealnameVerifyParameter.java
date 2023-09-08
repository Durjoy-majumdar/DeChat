package com.tencent.p014mm.plugin.wallet.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/api/JsApiRequestWCPayRealnameVerifyParameter;", "Landroid/os/Parcelable;", "wallet-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter */
public final class JsApiRequestWCPayRealnameVerifyParameter implements Parcelable {
    public static final Parcelable.Creator<JsApiRequestWCPayRealnameVerifyParameter> CREATOR = new C5724a();

    /* renamed from: d */
    public final String f21747d;

    /* renamed from: e */
    public final String f21748e;

    /* renamed from: com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter$a */
    public static final class C5724a implements Parcelable.Creator<JsApiRequestWCPayRealnameVerifyParameter> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new JsApiRequestWCPayRealnameVerifyParameter(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new JsApiRequestWCPayRealnameVerifyParameter[i];
        }
    }

    public JsApiRequestWCPayRealnameVerifyParameter(String str, String str2) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(str2, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        this.f21747d = str;
        this.f21748e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsApiRequestWCPayRealnameVerifyParameter)) {
            return false;
        }
        JsApiRequestWCPayRealnameVerifyParameter jsApiRequestWCPayRealnameVerifyParameter = (JsApiRequestWCPayRealnameVerifyParameter) obj;
        return C87412m.m108589b(this.f21747d, jsApiRequestWCPayRealnameVerifyParameter.f21747d) && C87412m.m108589b(this.f21748e, jsApiRequestWCPayRealnameVerifyParameter.f21748e);
    }

    public int hashCode() {
        return (this.f21747d.hashCode() * 31) + this.f21748e.hashCode();
    }

    public String toString() {
        return "JsApiRequestWCPayRealnameVerifyParameter(scene=" + this.f21747d + ", token=" + this.f21748e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f21747d);
        parcel.writeString(this.f21748e);
    }
}
