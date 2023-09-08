package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenChannelsLiveCollectionResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveCollectionResult */
final class OpenChannelsLiveCollectionResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C55477a CREATOR = new C55477a((C8480h) null);

    /* renamed from: d */
    public final int f158065d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveCollectionResult$a */
    public static final class C55477a implements Parcelable.Creator<OpenChannelsLiveCollectionResult> {
        public C55477a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OpenChannelsLiveCollectionResult(parcel);
        }

        public Object[] newArray(int i) {
            return new OpenChannelsLiveCollectionResult[i];
        }
    }

    public OpenChannelsLiveCollectionResult(int i) {
        this.f158065d = i;
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f158065d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OpenChannelsLiveCollectionResult(Parcel parcel) {
        this(parcel.readInt());
        C87412m.m108594g(parcel, "parcel");
    }
}
