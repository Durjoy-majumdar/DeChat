package com.tencent.p014mm.msgsubscription;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestResult;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestResult */
public final class SubscribeMsgRequestResult implements Parcelable {
    public static final Parcelable.Creator<SubscribeMsgRequestResult> CREATOR = new C17806a();

    /* renamed from: d */
    public final boolean f49000d;

    /* renamed from: e */
    public final String f49001e;

    /* renamed from: f */
    public final String f49002f;

    /* renamed from: g */
    public final int f49003g;

    /* renamed from: h */
    public final ArrayList<SubscribeMsgTmpItem> f49004h;

    /* renamed from: i */
    public final boolean f49005i;

    /* renamed from: j */
    public final boolean f49006j;

    /* renamed from: n */
    public final WordingInfo f49007n;

    /* renamed from: o */
    public boolean f49008o;

    /* renamed from: p */
    public final boolean f49009p;

    /* renamed from: q */
    public final byte[] f49010q;

    /* renamed from: r */
    public final int f49011r;

    /* renamed from: s */
    public final ShowInfo f49012s;

    /* renamed from: t */
    public final String f49013t;

    /* renamed from: u */
    public final String f49014u;

    /* renamed from: v */
    public final int f49015v;

    /* renamed from: w */
    public final String f49016w;

    /* renamed from: x */
    public final boolean f49017x;

    /* renamed from: y */
    public final String f49018y;

    /* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestResult$a */
    public static final class C17806a implements Parcelable.Creator<SubscribeMsgRequestResult> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new SubscribeMsgRequestResult(parcel);
        }

        public Object[] newArray(int i) {
            return new SubscribeMsgRequestResult[i];
        }
    }

    public SubscribeMsgRequestResult(boolean z, String str, String str2, int i, ArrayList<SubscribeMsgTmpItem> arrayList, boolean z2, boolean z3, WordingInfo wordingInfo, boolean z4, boolean z5, byte[] bArr, int i2, ShowInfo showInfo, String str3, String str4, int i3, String str5, boolean z6, String str6) {
        byte[] bArr2 = bArr;
        String str7 = str5;
        String str8 = str6;
        C87412m.m108594g(str, "appIconUrl");
        C87412m.m108594g(str2, "appName");
        C87412m.m108594g(arrayList, "subscribeMsgItems");
        C87412m.m108594g(bArr2, "buffer");
        C87412m.m108594g(str7, "wxaErrorMessage");
        C87412m.m108594g(str8, "extData");
        this.f49000d = z;
        this.f49001e = str;
        this.f49002f = str2;
        this.f49003g = i;
        this.f49004h = arrayList;
        this.f49005i = z2;
        this.f49006j = z3;
        this.f49007n = wordingInfo;
        this.f49008o = z4;
        this.f49009p = z5;
        this.f49010q = bArr2;
        this.f49011r = i2;
        this.f49012s = showInfo;
        this.f49013t = str3;
        this.f49014u = str4;
        this.f49015v = i3;
        this.f49016w = str7;
        this.f49017x = z6;
        this.f49018y = str8;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubscribeMsgRequestResult(alwaysChosenStatus=");
        sb.append(this.f49000d);
        sb.append(", appIconUrl='");
        sb.append(this.f49001e);
        sb.append("', appName='");
        sb.append(this.f49002f);
        sb.append("', cacheMaxSize=");
        sb.append(this.f49003g);
        sb.append(", subscribeMsgItems=");
        sb.append(this.f49004h);
        sb.append(", notShowAlways=");
        sb.append(this.f49005i);
        sb.append(", notShowReject=");
        sb.append(this.f49006j);
        sb.append(", wordingInfo=");
        sb.append(this.f49007n);
        sb.append(", isOpened=");
        sb.append(this.f49008o);
        sb.append(", showEntry=");
        sb.append(this.f49009p);
        sb.append(", buffer=");
        String arrays = Arrays.toString(this.f49010q);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", showStyle=");
        sb.append(this.f49011r);
        sb.append(", showInfo=");
        sb.append(this.f49012s);
        sb.append(", mainDescription=");
        sb.append(this.f49013t);
        sb.append(", subDescription=");
        sb.append(this.f49014u);
        sb.append(", wxaErrorCode=");
        sb.append(this.f49015v);
        sb.append(", wxaErrorMessage='");
        sb.append(this.f49016w);
        sb.append("', wxaUserCancel=");
        sb.append(this.f49017x);
        sb.append(", extData='");
        sb.append(this.f49018y);
        sb.append("')");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeByte(this.f49000d ? (byte) 1 : 0);
        parcel.writeString(this.f49001e);
        parcel.writeString(this.f49002f);
        parcel.writeInt(this.f49003g);
        parcel.writeParcelable(this.f49007n, i);
        parcel.writeList(this.f49004h);
        parcel.writeByte(this.f49005i ? (byte) 1 : 0);
        parcel.writeByte(this.f49008o ? (byte) 1 : 0);
        parcel.writeByte(this.f49009p ? (byte) 1 : 0);
        parcel.writeInt(this.f49010q.length);
        parcel.writeByteArray(this.f49010q);
        parcel.writeInt(this.f49011r);
        parcel.writeParcelable(this.f49012s, i);
        String str = this.f49013t;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        parcel.writeString(str);
        String str3 = this.f49014u;
        if (str3 != null) {
            str2 = str3;
        }
        parcel.writeString(str2);
        parcel.writeInt(this.f49015v);
        parcel.writeString(this.f49016w);
        parcel.writeByte(this.f49017x ? (byte) 1 : 0);
        parcel.writeByte(this.f49006j ? (byte) 1 : 0);
        parcel.writeString(this.f49018y);
    }

    public SubscribeMsgRequestResult(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        boolean z = true;
        this.f49000d = parcel.readByte() != 0;
        String readString = parcel.readString();
        String str = "";
        this.f49001e = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f49002f = readString2 == null ? str : readString2;
        this.f49003g = parcel.readInt();
        this.f49007n = (WordingInfo) parcel.readParcelable(WordingInfo.class.getClassLoader());
        ArrayList<SubscribeMsgTmpItem> arrayList = new ArrayList<>();
        parcel.readList(arrayList, SubscribeMsgTmpItem.class.getClassLoader());
        this.f49004h = arrayList;
        this.f49005i = parcel.readByte() != 0;
        this.f49008o = parcel.readByte() != 0;
        this.f49009p = parcel.readByte() != 0;
        byte[] bArr = new byte[parcel.readInt()];
        this.f49010q = bArr;
        parcel.readByteArray(bArr);
        this.f49011r = parcel.readInt();
        this.f49012s = (ShowInfo) parcel.readParcelable(ShowInfo.class.getClassLoader());
        String readString3 = parcel.readString();
        this.f49013t = readString3 == null ? str : readString3;
        String readString4 = parcel.readString();
        this.f49014u = readString4 == null ? str : readString4;
        this.f49015v = parcel.readInt();
        String readString5 = parcel.readString();
        this.f49016w = readString5 == null ? str : readString5;
        this.f49017x = parcel.readByte() != 0;
        this.f49006j = parcel.readByte() == 0 ? false : z;
        String readString6 = parcel.readString();
        this.f49018y = readString6 != null ? readString6 : str;
    }
}
