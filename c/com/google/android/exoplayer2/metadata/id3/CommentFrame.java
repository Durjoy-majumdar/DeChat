package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import p333e8.C20551y;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C16951a();

    /* renamed from: e */
    public final String f45813e;

    /* renamed from: f */
    public final String f45814f;

    /* renamed from: g */
    public final String f45815g;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$a */
    public static class C16951a implements Parcelable.Creator<CommentFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f45813e = str;
        this.f45814f = str2;
        this.f45815g = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return C20551y.m22311a(this.f45814f, commentFrame.f45814f) && C20551y.m22311a(this.f45813e, commentFrame.f45813e) && C20551y.m22311a(this.f45815g, commentFrame.f45815g);
    }

    public int hashCode() {
        String str = this.f45813e;
        int i = 0;
        int hashCode = (C1883v2.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45814f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45815g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45820d);
        parcel.writeString(this.f45813e);
        parcel.writeString(this.f45815g);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f45813e = parcel.readString();
        this.f45814f = parcel.readString();
        this.f45815g = parcel.readString();
    }
}
