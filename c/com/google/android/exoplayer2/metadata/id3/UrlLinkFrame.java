package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import p333e8.C20551y;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C16955a();

    /* renamed from: e */
    public final String f45825e;

    /* renamed from: f */
    public final String f45826f;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$a */
    public static class C16955a implements Parcelable.Creator<UrlLinkFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f45825e = str2;
        this.f45826f = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f45820d.equals(urlLinkFrame.f45820d) && C20551y.m22311a(this.f45825e, urlLinkFrame.f45825e) && C20551y.m22311a(this.f45826f, urlLinkFrame.f45826f);
    }

    public int hashCode() {
        int hashCode = (C1883v2.CTRL_INDEX + this.f45820d.hashCode()) * 31;
        String str = this.f45825e;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45826f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45820d);
        parcel.writeString(this.f45825e);
        parcel.writeString(this.f45826f);
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.f45825e = parcel.readString();
        this.f45826f = parcel.readString();
    }
}
