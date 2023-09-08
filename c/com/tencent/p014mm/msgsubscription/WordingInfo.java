package com.tencent.p014mm.msgsubscription;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/WordingInfo;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.WordingInfo */
public final class WordingInfo implements Parcelable {
    public static final Parcelable.Creator<WordingInfo> CREATOR = new C17808a();

    /* renamed from: d */
    public final String f49037d;

    /* renamed from: e */
    public final String f49038e;

    /* renamed from: f */
    public final String f49039f;

    /* renamed from: g */
    public final String f49040g;

    /* renamed from: h */
    public final String f49041h;

    /* renamed from: i */
    public final String f49042i;

    /* renamed from: j */
    public final String f49043j;

    /* renamed from: n */
    public final String f49044n;

    /* renamed from: o */
    public final String f49045o;

    /* renamed from: p */
    public final String f49046p;

    /* renamed from: q */
    public final String f49047q;

    /* renamed from: com.tencent.mm.msgsubscription.WordingInfo$a */
    public static final class C17808a implements Parcelable.Creator<WordingInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new WordingInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new WordingInfo[i];
        }
    }

    public WordingInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        C87412m.m108594g(str, "PopupTitle");
        C87412m.m108594g(str2, "PopupAllow");
        C87412m.m108594g(str3, "PopupCancel");
        C87412m.m108594g(str4, "PopupBottom");
        C87412m.m108594g(str5, "ExampleTitle");
        C87412m.m108594g(str6, "AlwaysReject");
        C87412m.m108594g(str7, "PopupDesc");
        C87412m.m108594g(str8, "SendWording");
        C87412m.m108594g(str9, "MultiRemind");
        C87412m.m108594g(str10, "WxaMultiRemind");
        C87412m.m108594g(str11, "SendBelowMsg");
        this.f49037d = str;
        this.f49038e = str2;
        this.f49039f = str3;
        this.f49040g = str4;
        this.f49041h = str5;
        this.f49042i = str6;
        this.f49043j = str7;
        this.f49044n = str8;
        this.f49045o = str9;
        this.f49046p = str10;
        this.f49047q = str11;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WordingInfo(PopupTitle='" + this.f49037d + "', PopupAllow='" + this.f49038e + "', PopupCancel='" + this.f49039f + "', PopupBottom='" + this.f49040g + "', ExampleTitle='" + this.f49041h + "', AlwaysReject='" + this.f49042i + "', PopupDesc='" + this.f49043j + "', SendWording='" + this.f49044n + "', MultiRemind='" + this.f49045o + "', WxaMultiRemind='" + this.f49046p + "')";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f49037d);
        parcel.writeString(this.f49038e);
        parcel.writeString(this.f49039f);
        parcel.writeString(this.f49040g);
        parcel.writeString(this.f49041h);
        parcel.writeString(this.f49042i);
        parcel.writeString(this.f49043j);
        parcel.writeString(this.f49044n);
        parcel.writeString(this.f49045o);
        parcel.writeString(this.f49046p);
        parcel.writeString(this.f49047q);
    }

    public WordingInfo(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        String readString = parcel.readString();
        String str = "";
        this.f49037d = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f49038e = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.f49039f = readString3 == null ? str : readString3;
        String readString4 = parcel.readString();
        this.f49040g = readString4 == null ? str : readString4;
        String readString5 = parcel.readString();
        this.f49041h = readString5 == null ? str : readString5;
        String readString6 = parcel.readString();
        this.f49042i = readString6 == null ? str : readString6;
        String readString7 = parcel.readString();
        this.f49043j = readString7 == null ? str : readString7;
        String readString8 = parcel.readString();
        this.f49044n = readString8 == null ? str : readString8;
        String readString9 = parcel.readString();
        this.f49045o = readString9 == null ? str : readString9;
        String readString10 = parcel.readString();
        this.f49046p = readString10 == null ? str : readString10;
        String readString11 = parcel.readString();
        this.f49047q = readString11 != null ? readString11 : str;
    }
}
