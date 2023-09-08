package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/BuyWCCoinRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinRequest */
final class BuyWCCoinRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C55517a CREATOR = new C55517a((C8480h) null);

    /* renamed from: d */
    public int f158111d;

    /* renamed from: e */
    public int f158112e;

    /* renamed from: f */
    public String f158113f = "";

    /* renamed from: g */
    public String f158114g = "";

    /* renamed from: h */
    public String f158115h = "";

    /* renamed from: i */
    public String f158116i = "";

    /* renamed from: j */
    public String f158117j = "";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinRequest$a */
    public static final class C55517a implements Parcelable.Creator<BuyWCCoinRequest> {
        public C55517a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new BuyWCCoinRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new BuyWCCoinRequest[i];
        }
    }

    public BuyWCCoinRequest() {
    }

    public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
        return C55523a.class;
    }

    public void readParcel(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f158111d = parcel.readInt();
        this.f158112e = parcel.readInt();
        String readString = parcel.readString();
        String str = "";
        if (readString == null) {
            readString = str;
        }
        this.f158113f = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = str;
        }
        this.f158114g = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = str;
        }
        this.f158115h = readString3;
        String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = str;
        }
        this.f158116i = readString4;
        String readString5 = parcel.readString();
        if (readString5 != null) {
            str = readString5;
        }
        this.f158117j = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f158111d);
        parcel.writeInt(this.f158112e);
        parcel.writeString(this.f158113f);
        parcel.writeString(this.f158114g);
        parcel.writeString(this.f158115h);
        parcel.writeString(this.f158116i);
        parcel.writeString(this.f158117j);
    }

    public BuyWCCoinRequest(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        readParcel(parcel);
    }
}
