package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ProfileRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest */
public final class ProfileRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C82883a CREATOR = new C82883a((C8480h) null);

    /* renamed from: d */
    public String f242333d;

    /* renamed from: e */
    public int f242334e = 122;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest$a */
    public static final class C82883a implements Parcelable.Creator<ProfileRequest> {
        public C82883a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new ProfileRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new ProfileRequest[i];
        }
    }

    public ProfileRequest() {
    }

    public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
        return C82907q.class;
    }

    public void readParcel(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f242333d = parcel.readString();
        this.f242334e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeString(this.f242333d);
        parcel.writeInt(this.f242334e);
    }

    public ProfileRequest(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        readParcel(parcel);
    }
}
