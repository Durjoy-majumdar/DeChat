package com.tencent.p014mm.plugin.voiceprint.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.voiceprint.model.VertifyInfo */
public class VertifyInfo implements Parcelable {
    public static final Parcelable.Creator<VertifyInfo> CREATOR = new C24282a();

    /* renamed from: d */
    public int f69714d;

    /* renamed from: e */
    public int f69715e;

    /* renamed from: f */
    public String f69716f = "";

    /* renamed from: g */
    public String f69717g = "";

    /* renamed from: h */
    public int f69718h = 0;

    /* renamed from: i */
    public int f69719i = 0;

    /* renamed from: j */
    public String f69720j = "";

    /* renamed from: n */
    public boolean f69721n = false;

    /* renamed from: o */
    public boolean f69722o = false;

    /* renamed from: com.tencent.mm.plugin.voiceprint.model.VertifyInfo$a */
    public class C24282a implements Parcelable.Creator<VertifyInfo> {
        public Object createFromParcel(Parcel parcel) {
            VertifyInfo vertifyInfo = new VertifyInfo();
            vertifyInfo.f69714d = parcel.readInt();
            vertifyInfo.f69715e = parcel.readInt();
            vertifyInfo.f69718h = parcel.readInt();
            vertifyInfo.f69719i = parcel.readInt();
            vertifyInfo.f69716f = parcel.readString();
            vertifyInfo.f69717g = parcel.readString();
            vertifyInfo.f69720j = parcel.readString();
            boolean z = false;
            vertifyInfo.f69721n = parcel.readInt() > 0;
            if (parcel.readInt() > 0) {
                z = true;
            }
            vertifyInfo.f69722o = z;
            vertifyInfo.f69719i = vertifyInfo.f69714d;
            return vertifyInfo;
        }

        public Object[] newArray(int i) {
            return new VertifyInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f69714d);
        parcel.writeInt(this.f69715e);
        parcel.writeInt(this.f69718h);
        parcel.writeInt(this.f69719i);
        parcel.writeString(Util.nullAs(this.f69716f, ""));
        parcel.writeString(Util.nullAs(this.f69717g, ""));
        parcel.writeString(Util.nullAs(this.f69720j, ""));
        parcel.writeInt(this.f69721n ? 1 : 0);
        parcel.writeInt(this.f69722o ? 1 : 0);
    }
}
