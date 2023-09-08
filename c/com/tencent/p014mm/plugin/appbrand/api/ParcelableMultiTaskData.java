package com.tencent.p014mm.plugin.appbrand.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C51173ry;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/api/ParcelableMultiTaskData;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "protocol-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData */
public final class ParcelableMultiTaskData implements Parcelable {
    public static final C81133a CREATOR = new C81133a((C8480h) null);

    /* renamed from: d */
    public C51173ry f238428d;

    /* renamed from: com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData$a */
    public static final class C81133a implements Parcelable.Creator<ParcelableMultiTaskData> {
        public C81133a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            ParcelableMultiTaskData parcelableMultiTaskData = new ParcelableMultiTaskData();
            Object c = C80893c.m98762c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CommonMultiTaskData");
            parcelableMultiTaskData.f238428d = (C51173ry) c;
            return parcelableMultiTaskData;
        }

        public Object[] newArray(int i) {
            return new ParcelableMultiTaskData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        C80893c.m98763d(this.f238428d, parcel);
    }
}
