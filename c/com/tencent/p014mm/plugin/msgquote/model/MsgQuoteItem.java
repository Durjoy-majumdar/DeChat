package com.tencent.p014mm.plugin.msgquote.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.msgquote.model.MsgQuoteItem */
public class MsgQuoteItem implements Parcelable {
    public static final Parcelable.Creator<MsgQuoteItem> CREATOR = new C69855a();

    /* renamed from: d */
    public int f201543d;

    /* renamed from: e */
    public long f201544e;

    /* renamed from: f */
    public String f201545f;

    /* renamed from: g */
    public String f201546g;

    /* renamed from: h */
    public String f201547h;

    /* renamed from: i */
    public String f201548i;

    /* renamed from: j */
    public String f201549j;

    /* renamed from: n */
    public String f201550n;

    /* renamed from: o */
    public int f201551o;

    /* renamed from: com.tencent.mm.plugin.msgquote.model.MsgQuoteItem$a */
    public class C69855a implements Parcelable.Creator<MsgQuoteItem> {
        public Object createFromParcel(Parcel parcel) {
            return new MsgQuoteItem(parcel);
        }

        public Object[] newArray(int i) {
            return new MsgQuoteItem[i];
        }
    }

    public MsgQuoteItem() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MsgQuoteItem{type=" + this.f201543d + ", svrid=" + this.f201544e + ", fromusr='" + this.f201545f + '\'' + ", chatuser='" + this.f201546g + '\'' + ", displayname='" + this.f201547h + '\'' + ", msgsource='" + this.f201548i + '\'' + ", content='" + this.f201549j + '\'' + ", msgSource='" + this.f201550n + '\'' + ", referfromscene='" + this.f201551o + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f201543d);
        parcel.writeLong(this.f201544e);
        parcel.writeString(this.f201545f);
        parcel.writeString(this.f201546g);
        parcel.writeString(this.f201547h);
        parcel.writeString(this.f201548i);
        parcel.writeString(this.f201549j);
        parcel.writeString(this.f201550n);
        parcel.writeInt(this.f201551o);
    }

    public MsgQuoteItem(Parcel parcel) {
        this.f201543d = parcel.readInt();
        this.f201544e = parcel.readLong();
        this.f201545f = parcel.readString();
        this.f201546g = parcel.readString();
        this.f201547h = parcel.readString();
        this.f201548i = parcel.readString();
        this.f201549j = parcel.readString();
        this.f201550n = parcel.readString();
        this.f201551o = parcel.readInt();
    }
}
