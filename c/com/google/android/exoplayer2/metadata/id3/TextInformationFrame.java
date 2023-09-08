package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import p333e8.C20551y;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C16954a();

    /* renamed from: e */
    public final String f45823e;

    /* renamed from: f */
    public final String f45824f;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$a */
    public static class C16954a implements Parcelable.Creator<TextInformationFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f45823e = str2;
        this.f45824f = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return this.f45820d.equals(textInformationFrame.f45820d) && C20551y.m22311a(this.f45823e, textInformationFrame.f45823e) && C20551y.m22311a(this.f45824f, textInformationFrame.f45824f);
    }

    public int hashCode() {
        int hashCode = (C1883v2.CTRL_INDEX + this.f45820d.hashCode()) * 31;
        String str = this.f45823e;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45824f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45820d);
        parcel.writeString(this.f45823e);
        parcel.writeString(this.f45824f);
    }

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.f45823e = parcel.readString();
        this.f45824f = parcel.readString();
    }
}
