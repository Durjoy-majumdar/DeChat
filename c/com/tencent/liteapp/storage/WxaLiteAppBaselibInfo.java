package com.tencent.liteapp.storage;

import android.os.Parcel;
import android.os.Parcelable;

public class WxaLiteAppBaselibInfo implements Parcelable {
    public static final Parcelable.Creator<WxaLiteAppBaselibInfo> CREATOR = new C113399a();

    /* renamed from: d */
    public String f339281d;

    /* renamed from: e */
    public String f339282e;

    /* renamed from: f */
    public String f339283f;

    /* renamed from: g */
    public String f339284g;

    /* renamed from: h */
    public String f339285h;

    /* renamed from: i */
    public String f339286i;

    /* renamed from: j */
    public String f339287j;

    /* renamed from: n */
    public long f339288n;

    /* renamed from: o */
    public long f339289o;

    /* renamed from: com.tencent.liteapp.storage.WxaLiteAppBaselibInfo$a */
    public class C113399a implements Parcelable.Creator<WxaLiteAppBaselibInfo> {
        public Object createFromParcel(Parcel parcel) {
            WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = new WxaLiteAppBaselibInfo();
            wxaLiteAppBaselibInfo.f339281d = parcel.readString();
            wxaLiteAppBaselibInfo.f339282e = parcel.readString();
            wxaLiteAppBaselibInfo.f339283f = parcel.readString();
            wxaLiteAppBaselibInfo.f339284g = parcel.readString();
            wxaLiteAppBaselibInfo.f339285h = parcel.readString();
            wxaLiteAppBaselibInfo.f339286i = parcel.readString();
            wxaLiteAppBaselibInfo.f339287j = parcel.readString();
            wxaLiteAppBaselibInfo.f339288n = parcel.readLong();
            wxaLiteAppBaselibInfo.f339289o = parcel.readLong();
            return wxaLiteAppBaselibInfo;
        }

        public Object[] newArray(int i) {
            return new WxaLiteAppBaselibInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WxaLiteAppBaseLibInfo{majorVersion='" + this.f339281d + '\'' + ", url='" + this.f339282e + '\'' + ", md5='" + this.f339283f + '\'' + ", signatureKey='" + this.f339284g + '\'' + ", path='" + this.f339285h + '\'' + ", type='" + this.f339286i + '\'' + ", patchId='" + this.f339287j + '\'' + ", updateTime=" + this.f339288n + ", lastUseTime=" + this.f339289o + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f339281d);
        parcel.writeString(this.f339282e);
        parcel.writeString(this.f339283f);
        parcel.writeString(this.f339284g);
        parcel.writeString(this.f339285h);
        parcel.writeString(this.f339286i);
        parcel.writeString(this.f339287j);
        parcel.writeLong(this.f339288n);
        parcel.writeLong(this.f339289o);
    }
}
