package com.tencent.scanlib.model;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class DetectCode implements Parcelable {
    public static final Parcelable.Creator<DetectCode> CREATOR = new C75246a();

    /* renamed from: d */
    public int f221376d;

    /* renamed from: e */
    public List<Point> f221377e;

    /* renamed from: f */
    public float f221378f;

    /* renamed from: com.tencent.scanlib.model.DetectCode$a */
    public static class C75246a implements Parcelable.Creator<DetectCode> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, Point.CREATOR);
            return new DetectCode(parcel.readInt(), arrayList, parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new DetectCode[i];
        }
    }

    public DetectCode(int i, List<Point> list, float f) {
        this.f221376d = i;
        this.f221377e = list;
        this.f221378f = f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f221376d);
        parcel.writeTypedList(this.f221377e);
        parcel.writeFloat(this.f221378f);
    }
}
