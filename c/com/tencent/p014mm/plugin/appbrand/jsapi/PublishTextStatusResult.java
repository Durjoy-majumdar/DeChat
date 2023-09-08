package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/PublishTextStatusResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult */
public final class PublishTextStatusResult extends AppBrandProxyUIProcessTask.ProcessResult {
    public static final C82014a CREATOR = new C82014a((C8480h) null);

    /* renamed from: d */
    public int f240481d;

    /* renamed from: e */
    public String f240482e = "";

    /* renamed from: f */
    public byte[] f240483f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult$a */
    public static final class C82014a implements Parcelable.Creator<PublishTextStatusResult> {
        public C82014a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new PublishTextStatusResult(parcel);
        }

        public Object[] newArray(int i) {
            return new PublishTextStatusResult[i];
        }
    }

    public PublishTextStatusResult() {
    }

    public int describeContents() {
        return 0;
    }

    public void readParcel(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f240481d = parcel.readInt();
        this.f240482e = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            this.f240483f = bArr;
            return;
        }
        this.f240483f = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f240481d);
        parcel.writeString(this.f240482e);
        byte[] bArr = this.f240483f;
        int length = bArr != null ? bArr.length : 0;
        parcel.writeInt(length);
        if (length != 0) {
            parcel.writeByteArray(this.f240483f);
        }
    }

    public PublishTextStatusResult(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        readParcel(parcel);
    }
}
