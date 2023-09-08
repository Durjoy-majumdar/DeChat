package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/UrlJumpToProfileRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest */
public final class UrlJumpToProfileRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final Parcelable.Creator<UrlJumpToProfileRequest> CREATOR = new C82886a();

    /* renamed from: d */
    public final String f242339d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest$a */
    public static final class C82886a implements Parcelable.Creator<UrlJumpToProfileRequest> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new UrlJumpToProfileRequest(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new UrlJumpToProfileRequest[i];
        }
    }

    public UrlJumpToProfileRequest(String str) {
        C87412m.m108594g(str, "dataUrl");
        this.f242339d = str;
    }

    public Class<C68620s> getTaskClass() {
        return C68620s.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f242339d);
    }
}
