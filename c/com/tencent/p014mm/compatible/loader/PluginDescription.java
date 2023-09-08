package com.tencent.p014mm.compatible.loader;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: com.tencent.mm.compatible.loader.PluginDescription */
public class PluginDescription implements Parcelable, Serializable {
    public static final Parcelable.Creator<PluginDescription> CREATOR = new C1231a();

    /* renamed from: d */
    public final String f10274d;

    /* renamed from: e */
    public final String f10275e;

    /* renamed from: f */
    public final String f10276f;

    /* renamed from: g */
    public final String f10277g;

    /* renamed from: h */
    public final int f10278h;

    /* renamed from: i */
    public final int f10279i;

    /* renamed from: com.tencent.mm.compatible.loader.PluginDescription$a */
    public class C1231a implements Parcelable.Creator<PluginDescription> {
        public Object createFromParcel(Parcel parcel) {
            return new PluginDescription(parcel);
        }

        public Object[] newArray(int i) {
            return new PluginDescription[i];
        }
    }

    public PluginDescription(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f10274d = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.f10275e = readString2;
        String readString3 = parcel.readString();
        readString3.getClass();
        this.f10276f = readString3;
        String readString4 = parcel.readString();
        readString4.getClass();
        this.f10277g = readString4;
        this.f10278h = parcel.readInt();
        this.f10279i = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("PluginDescription = [name=%s, url=%s, md5=%s, version=%s, size=%d, downloadType=%d]", new Object[]{this.f10274d, this.f10275e, this.f10276f, this.f10277g, Integer.valueOf(this.f10278h), Integer.valueOf(this.f10279i)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10274d);
        parcel.writeString(this.f10275e);
        parcel.writeString(this.f10276f);
        parcel.writeString(this.f10277g);
        parcel.writeInt(this.f10278h);
        parcel.writeInt(this.f10279i);
    }
}
