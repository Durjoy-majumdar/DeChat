package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/ReserveChannelsLiveResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveResult */
final class ReserveChannelsLiveResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C82290a CREATOR = new C82290a((C8480h) null);

    /* renamed from: d */
    public final boolean f241213d;

    /* renamed from: e */
    public final int f241214e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveResult$a */
    public static final class C82290a implements Parcelable.Creator<ReserveChannelsLiveResult> {
        public C82290a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new ReserveChannelsLiveResult(parcel);
        }

        public Object[] newArray(int i) {
            return new ReserveChannelsLiveResult[i];
        }
    }

    public ReserveChannelsLiveResult(boolean z, int i) {
        this.f241213d = z;
        this.f241214e = i;
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeByte(this.f241213d ? (byte) 1 : 0);
        parcel.writeInt(this.f241214e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReserveChannelsLiveResult(Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readInt());
        C87412m.m108594g(parcel, "parcel");
    }
}
