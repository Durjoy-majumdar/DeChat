package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HeightInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.config.HeightInfo */
public class HeightInfo implements Parcelable {
    public static final C55457a CREATOR = new C55457a((C8480h) null);

    /* renamed from: d */
    public final int f158025d;

    /* renamed from: e */
    public final int f158026e;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.HeightInfo$a */
    public static final class C55457a implements Parcelable.Creator<HeightInfo> {
        public C55457a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new HeightInfo(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new HeightInfo[i];
        }
    }

    public HeightInfo(int i, int i2) {
        this.f158025d = i;
        this.f158026e = i2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "HeightInfo(currentHeight=" + this.f158025d + ", initialHeight=" + this.f158026e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f158025d);
        parcel.writeInt(this.f158026e);
    }
}
