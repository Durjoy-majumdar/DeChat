package com.tencent.p014mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import di3.C86312j;
import f40.C86709a0;
import p682rz.C36594q;

/* renamed from: com.tencent.mm.plugin.mmsight.SightParams */
public class SightParams implements Parcelable {
    public static final Parcelable.Creator<SightParams> CREATOR = new C85287a();

    /* renamed from: d */
    public int f248450d = 0;

    /* renamed from: e */
    public int f248451e = 2;

    /* renamed from: f */
    public VideoTransPara f248452f;

    /* renamed from: g */
    public String f248453g = "";

    /* renamed from: h */
    public String f248454h = "";

    /* renamed from: i */
    public String f248455i = "";

    /* renamed from: j */
    public String f248456j = "";

    /* renamed from: n */
    public boolean f248457n = true;

    /* renamed from: o */
    public int f248458o = -1;

    /* renamed from: p */
    public boolean f248459p = true;

    /* renamed from: q */
    public String f248460q = "";

    /* renamed from: r */
    public boolean f248461r = true;

    /* renamed from: s */
    public boolean f248462s = false;

    /* renamed from: t */
    public int f248463t;

    /* renamed from: com.tencent.mm.plugin.mmsight.SightParams$a */
    public class C85287a implements Parcelable.Creator<SightParams> {
        public Object createFromParcel(Parcel parcel) {
            return new SightParams(parcel);
        }

        public Object[] newArray(int i) {
            return new SightParams[i];
        }
    }

    public SightParams(int i, int i2) {
        Class cls = C36594q.class;
        if (i == 1) {
            this.f248452f = ((C36594q) C86312j.m106911c(cls)).mo60734Xa();
        } else if (i == 2 || i == 3 || i == 4) {
            this.f248452f = ((C36594q) C86312j.m106911c(cls)).mo60738cw();
        } else if (i == 7) {
            this.f248452f = ((C36594q) C86312j.m106911c(cls)).mo60731HF();
        } else {
            this.f248452f = ((C36594q) C86312j.m106911c(cls)).mo60738cw();
        }
        this.f248458o = i;
        this.f248450d = i2;
        C86709a0.m107528h();
        this.f248463t = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(344066, 0)).intValue();
    }

    /* renamed from: a */
    public SightParams mo118479a(String str, String str2, String str3, String str4) {
        this.f248455i = str;
        this.f248453g = str2;
        this.f248454h = str3;
        this.f248456j = str4;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f248450d);
        parcel.writeParcelable(this.f248452f, i);
        parcel.writeString(this.f248453g);
        parcel.writeString(this.f248454h);
        parcel.writeString(this.f248455i);
        parcel.writeString(this.f248456j);
        parcel.writeInt(this.f248463t);
        parcel.writeInt(this.f248451e);
        parcel.writeInt(this.f248457n ? 1 : 0);
        parcel.writeInt(this.f248458o);
        parcel.writeByte(this.f248459p ? (byte) 1 : 0);
        parcel.writeString(this.f248460q);
        parcel.writeByte(this.f248461r ? (byte) 1 : 0);
        parcel.writeByte(this.f248462s ? (byte) 1 : 0);
    }

    public SightParams(Parcel parcel) {
        boolean z = false;
        this.f248450d = parcel.readInt();
        this.f248452f = (VideoTransPara) parcel.readParcelable(VideoTransPara.class.getClassLoader());
        this.f248453g = parcel.readString();
        this.f248454h = parcel.readString();
        this.f248455i = parcel.readString();
        this.f248456j = parcel.readString();
        this.f248463t = parcel.readInt();
        this.f248451e = parcel.readInt();
        this.f248457n = parcel.readInt() > 0;
        this.f248458o = parcel.readInt();
        this.f248459p = parcel.readByte() != 0;
        this.f248460q = parcel.readString();
        this.f248461r = parcel.readByte() != 0;
        this.f248462s = parcel.readByte() != 0 ? true : z;
    }
}
