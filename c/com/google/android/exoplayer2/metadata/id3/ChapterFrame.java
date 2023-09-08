package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;
import p333e8.C20551y;

public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C113372a();

    /* renamed from: e */
    public final String f339170e;

    /* renamed from: f */
    public final int f339171f;

    /* renamed from: g */
    public final int f339172g;

    /* renamed from: h */
    public final long f339173h;

    /* renamed from: i */
    public final long f339174i;

    /* renamed from: j */
    public final Id3Frame[] f339175j;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame$a */
    public static class C113372a implements Parcelable.Creator<ChapterFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f339170e = str;
        this.f339171f = i;
        this.f339172g = i2;
        this.f339173h = j;
        this.f339174i = j2;
        this.f339175j = id3FrameArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f339171f == chapterFrame.f339171f && this.f339172g == chapterFrame.f339172g && this.f339173h == chapterFrame.f339173h && this.f339174i == chapterFrame.f339174i && C20551y.m22311a(this.f339170e, chapterFrame.f339170e) && Arrays.equals(this.f339175j, chapterFrame.f339175j);
    }

    public int hashCode() {
        int i = (((((((C1883v2.CTRL_INDEX + this.f339171f) * 31) + this.f339172g) * 31) + ((int) this.f339173h)) * 31) + ((int) this.f339174i)) * 31;
        String str = this.f339170e;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f339170e);
        parcel.writeInt(this.f339171f);
        parcel.writeInt(this.f339172g);
        parcel.writeLong(this.f339173h);
        parcel.writeLong(this.f339174i);
        parcel.writeInt(this.f339175j.length);
        for (Id3Frame writeParcelable : this.f339175j) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f339170e = parcel.readString();
        this.f339171f = parcel.readInt();
        this.f339172g = parcel.readInt();
        this.f339173h = parcel.readLong();
        this.f339174i = parcel.readLong();
        int readInt = parcel.readInt();
        this.f339175j = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f339175j[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
