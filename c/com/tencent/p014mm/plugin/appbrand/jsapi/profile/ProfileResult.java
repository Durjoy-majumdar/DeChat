package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ProfileResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult */
public final class ProfileResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C82884a CREATOR = new C82884a((C8480h) null);

    /* renamed from: d */
    public int f242335d;

    /* renamed from: e */
    public int f242336e;

    /* renamed from: f */
    public String f242337f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult$a */
    public static final class C82884a implements Parcelable.Creator<ProfileResult> {
        public C82884a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new ProfileResult(parcel);
        }

        public Object[] newArray(int i) {
            return new ProfileResult[i];
        }
    }

    public ProfileResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f242335d = parcel.readInt();
        this.f242336e = parcel.readInt();
        this.f242337f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f242335d);
        parcel.writeInt(this.f242336e);
        parcel.writeString(this.f242337f);
    }

    public ProfileResult(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        readParcel(parcel);
    }
}
