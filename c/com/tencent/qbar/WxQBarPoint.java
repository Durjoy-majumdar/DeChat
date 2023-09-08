package com.tencent.qbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.qbar.QbarNative;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/qbar/WxQBarPoint;", "Lcom/tencent/qbar/QbarNative$QBarPoint;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "scan-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class WxQBarPoint extends QbarNative.QBarPoint implements Parcelable {
    public static final C106887a CREATOR = new C106887a((C8480h) null);

    /* renamed from: com.tencent.qbar.WxQBarPoint$a */
    public static final class C106887a implements Parcelable.Creator<WxQBarPoint> {
        public C106887a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            WxQBarPoint wxQBarPoint = new WxQBarPoint();
            wxQBarPoint.point_cnt = parcel.readInt();
            wxQBarPoint.f56815x0 = parcel.readFloat();
            wxQBarPoint.f56816x1 = parcel.readFloat();
            wxQBarPoint.f56817x2 = parcel.readFloat();
            wxQBarPoint.f56818x3 = parcel.readFloat();
            wxQBarPoint.f56819y0 = parcel.readFloat();
            wxQBarPoint.f56820y1 = parcel.readFloat();
            wxQBarPoint.f56821y2 = parcel.readFloat();
            wxQBarPoint.f56822y3 = parcel.readFloat();
            return wxQBarPoint;
        }

        public Object[] newArray(int i) {
            return new WxQBarPoint[i];
        }
    }

    public WxQBarPoint() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.point_cnt);
        parcel.writeFloat(this.f56815x0);
        parcel.writeFloat(this.f56816x1);
        parcel.writeFloat(this.f56817x2);
        parcel.writeFloat(this.f56818x3);
        parcel.writeFloat(this.f56819y0);
        parcel.writeFloat(this.f56820y1);
        parcel.writeFloat(this.f56821y2);
        parcel.writeFloat(this.f56822y3);
    }

    public WxQBarPoint(QbarNative.QBarPoint qBarPoint) {
        if (qBarPoint != null) {
            this.point_cnt = qBarPoint.point_cnt;
            this.f56815x0 = qBarPoint.f56815x0;
            this.f56816x1 = qBarPoint.f56816x1;
            this.f56817x2 = qBarPoint.f56817x2;
            this.f56818x3 = qBarPoint.f56818x3;
            this.f56819y0 = qBarPoint.f56819y0;
            this.f56820y1 = qBarPoint.f56820y1;
            this.f56821y2 = qBarPoint.f56821y2;
            this.f56822y3 = qBarPoint.f56822y3;
        }
    }
}
