package com.tencent.p014mm.plugin.appbrand.pip;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/pip/PipStablePos;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.pip.PipStablePos */
final class PipStablePos implements Parcelable {
    public static final C29615a CREATOR = new C29615a((C8480h) null);

    /* renamed from: d */
    public final String f80545d;

    /* renamed from: e */
    public final Point f80546e;

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.PipStablePos$a */
    public static final class C29615a implements Parcelable.Creator<PipStablePos> {
        public C29615a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            try {
                String readString = parcel.readString();
                Point point = (Point) parcel.readParcelable(Point.class.getClassLoader());
                if (readString != null) {
                    if (point != null) {
                        return new PipStablePos(readString, point);
                    }
                }
                Log.m105928w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "createFromParcel fail, appId: " + readString + ", point: " + point);
                return C29616g0.f80547a;
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "createFromParcel fail since " + e);
                return C29616g0.f80547a;
            }
        }

        public Object[] newArray(int i) {
            return new PipStablePos[i];
        }
    }

    public PipStablePos(String str, Point point) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(point, "point");
        this.f80545d = str;
        this.f80546e = point;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipStablePos)) {
            return false;
        }
        PipStablePos pipStablePos = (PipStablePos) obj;
        return C87412m.m108589b(this.f80545d, pipStablePos.f80545d) && C87412m.m108589b(this.f80546e, pipStablePos.f80546e);
    }

    public int hashCode() {
        return (this.f80545d.hashCode() * 31) + this.f80546e.hashCode();
    }

    public String toString() {
        return "PipStablePos(appId=" + this.f80545d + ", point=" + this.f80546e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        try {
            parcel.writeString(this.f80545d);
            parcel.writeParcelable(this.f80546e, i);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "writeToParcel fail since " + e);
        }
    }
}
