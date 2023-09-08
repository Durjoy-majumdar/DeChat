package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;
import p333e8.C20551y;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C113373a();

    /* renamed from: e */
    public final String f339176e;

    /* renamed from: f */
    public final boolean f339177f;

    /* renamed from: g */
    public final boolean f339178g;

    /* renamed from: h */
    public final String[] f339179h;

    /* renamed from: i */
    public final Id3Frame[] f339180i;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$a */
    public static class C113373a implements Parcelable.Creator<ChapterTocFrame> {
        public Object createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        public Object[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f339176e = str;
        this.f339177f = z;
        this.f339178g = z2;
        this.f339179h = strArr;
        this.f339180i = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f339177f == chapterTocFrame.f339177f && this.f339178g == chapterTocFrame.f339178g && C20551y.m22311a(this.f339176e, chapterTocFrame.f339176e) && Arrays.equals(this.f339179h, chapterTocFrame.f339179h) && Arrays.equals(this.f339180i, chapterTocFrame.f339180i);
    }

    public int hashCode() {
        int i = (((C1883v2.CTRL_INDEX + (this.f339177f ? 1 : 0)) * 31) + (this.f339178g ? 1 : 0)) * 31;
        String str = this.f339176e;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f339176e);
        parcel.writeByte(this.f339177f ? (byte) 1 : 0);
        parcel.writeByte(this.f339178g ? (byte) 1 : 0);
        parcel.writeStringArray(this.f339179h);
        parcel.writeInt(this.f339180i.length);
        int i2 = 0;
        while (true) {
            Id3Frame[] id3FrameArr = this.f339180i;
            if (i2 < id3FrameArr.length) {
                parcel.writeParcelable(id3FrameArr[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f339176e = parcel.readString();
        boolean z = true;
        this.f339177f = parcel.readByte() != 0;
        this.f339178g = parcel.readByte() == 0 ? false : z;
        this.f339179h = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f339180i = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f339180i[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
