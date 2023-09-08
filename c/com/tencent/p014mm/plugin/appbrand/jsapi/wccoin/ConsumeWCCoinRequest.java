package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/ConsumeWCCoinRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest */
final class ConsumeWCCoinRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C83060a CREATOR = new C83060a((C8480h) null);

    /* renamed from: d */
    public String f242802d = "";

    /* renamed from: e */
    public String f242803e = "";

    /* renamed from: f */
    public int f242804f;

    /* renamed from: g */
    public String f242805g = "";

    /* renamed from: h */
    public String f242806h = "";

    /* renamed from: i */
    public int f242807i;

    /* renamed from: j */
    public String f242808j = "";

    /* renamed from: n */
    public String f242809n = "";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest$a */
    public static final class C83060a implements Parcelable.Creator<ConsumeWCCoinRequest> {
        public C83060a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new ConsumeWCCoinRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new ConsumeWCCoinRequest[i];
        }
    }

    public ConsumeWCCoinRequest() {
    }

    public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
        return C83062b.class;
    }

    public void readParcel(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        String readString = parcel.readString();
        String str = "";
        if (readString == null) {
            readString = str;
        }
        this.f242802d = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = str;
        }
        this.f242803e = readString2;
        this.f242804f = parcel.readInt();
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = str;
        }
        this.f242805g = readString3;
        String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = str;
        }
        this.f242806h = readString4;
        this.f242807i = parcel.readInt();
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = str;
        }
        this.f242808j = readString5;
        String readString6 = parcel.readString();
        if (readString6 != null) {
            str = readString6;
        }
        this.f242809n = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeString(this.f242802d);
        parcel.writeString(this.f242803e);
        parcel.writeInt(this.f242804f);
        parcel.writeString(this.f242805g);
        parcel.writeString(this.f242806h);
        parcel.writeInt(this.f242807i);
        parcel.writeString(this.f242808j);
        parcel.writeString(this.f242809n);
    }

    public ConsumeWCCoinRequest(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        readParcel(parcel);
    }
}
