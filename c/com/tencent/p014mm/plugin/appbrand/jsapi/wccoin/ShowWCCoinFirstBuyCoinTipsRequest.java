package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/ShowWCCoinFirstBuyCoinTipsRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest */
final class ShowWCCoinFirstBuyCoinTipsRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C55521a CREATOR = new C55521a((C8480h) null);

    /* renamed from: d */
    public int f158121d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest$a */
    public static final class C55521a implements Parcelable.Creator<ShowWCCoinFirstBuyCoinTipsRequest> {
        public C55521a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new ShowWCCoinFirstBuyCoinTipsRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new ShowWCCoinFirstBuyCoinTipsRequest[i];
        }
    }

    public ShowWCCoinFirstBuyCoinTipsRequest() {
    }

    public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
        return C55532p.class;
    }

    public void readParcel(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f158121d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f158121d);
    }

    public ShowWCCoinFirstBuyCoinTipsRequest(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        readParcel(parcel);
    }
}
