package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ReqJumpToProfileRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.ReqJumpToProfileRequest */
public final class ReqJumpToProfileRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final Parcelable.Creator<ReqJumpToProfileRequest> CREATOR = new C82885a();

    /* renamed from: d */
    public final String f242338d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.ReqJumpToProfileRequest$a */
    public static final class C82885a implements Parcelable.Creator<ReqJumpToProfileRequest> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new ReqJumpToProfileRequest(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ReqJumpToProfileRequest[i];
        }
    }

    public ReqJumpToProfileRequest(String str) {
        C87412m.m108594g(str, "reqJsonStr");
        this.f242338d = str;
    }

    public Class<C68619r> getTaskClass() {
        return C68619r.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f242338d);
    }
}
