package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/OpenFinderProfileProxy$FinderProfileRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderProfileProxy$FinderProfileRequest */
final class OpenFinderProfileProxy$FinderProfileRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C55505a CREATOR = new C55505a((C8480h) null);

    /* renamed from: d */
    public Intent f158098d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderProfileProxy$FinderProfileRequest$a */
    public static final class C55505a implements Parcelable.Creator<OpenFinderProfileProxy$FinderProfileRequest> {
        public C55505a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new OpenFinderProfileProxy$FinderProfileRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new OpenFinderProfileProxy$FinderProfileRequest[i];
        }
    }

    public OpenFinderProfileProxy$FinderProfileRequest() {
    }

    public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
        return OpenFinderProfileProxy$FinderProfileTask.class;
    }

    public boolean oneShotForeground() {
        return true;
    }

    public void readParcel(Parcel parcel) {
        this.f158098d = parcel != null ? (Intent) parcel.readParcelable(Intent.class.getClassLoader()) : null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeParcelable(this.f158098d, i);
        }
    }

    public OpenFinderProfileProxy$FinderProfileRequest(Intent intent) {
        C87412m.m108594g(intent, "intent");
        this.f158098d = intent;
    }

    public OpenFinderProfileProxy$FinderProfileRequest(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        readParcel(parcel);
    }
}
