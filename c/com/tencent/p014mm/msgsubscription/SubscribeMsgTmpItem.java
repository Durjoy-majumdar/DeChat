package com.tencent.p014mm.msgsubscription;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.io.InvalidClassException;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13604l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgTmpItem;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgTmpItem */
public final class SubscribeMsgTmpItem implements Parcelable {
    public static final Parcelable.Creator<SubscribeMsgTmpItem> CREATOR = new C17807a();

    /* renamed from: d */
    public final String f49019d;

    /* renamed from: e */
    public final String f49020e;

    /* renamed from: f */
    public final String f49021f;

    /* renamed from: g */
    public final int f49022g;

    /* renamed from: h */
    public int f49023h;

    /* renamed from: i */
    public final ArrayList<C13604l<String, String>> f49024i;

    /* renamed from: j */
    public int f49025j;

    /* renamed from: n */
    public boolean f49026n;

    /* renamed from: o */
    public long f49027o;

    /* renamed from: p */
    public boolean f49028p;

    /* renamed from: q */
    public final String f49029q;

    /* renamed from: r */
    public final boolean f49030r;

    /* renamed from: s */
    public final int f49031s;

    /* renamed from: t */
    public final boolean f49032t;

    /* renamed from: u */
    public boolean f49033u;

    /* renamed from: v */
    public final String f49034v;

    /* renamed from: w */
    public final boolean f49035w;

    /* renamed from: x */
    public boolean f49036x;

    /* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgTmpItem$a */
    public static final class C17807a implements Parcelable.Creator<SubscribeMsgTmpItem> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new SubscribeMsgTmpItem(parcel);
        }

        public Object[] newArray(int i) {
            return new SubscribeMsgTmpItem[i];
        }
    }

    public SubscribeMsgTmpItem(String str, String str2, int i, int i2, ArrayList<C13604l<String, String>> arrayList, int i3, boolean z, String str3, String str4, boolean z2, int i4, boolean z3, boolean z4, String str5, boolean z5, boolean z6) {
        this.f49020e = str;
        this.f49021f = str2;
        this.f49022g = i;
        this.f49023h = i2;
        this.f49024i = arrayList;
        this.f49025j = i3;
        this.f49026n = z;
        this.f49027o = 0;
        this.f49019d = str3;
        this.f49028p = false;
        this.f49029q = str4;
        this.f49031s = i4;
        this.f49030r = z2;
        this.f49032t = z3;
        this.f49033u = z4;
        this.f49034v = str5;
        this.f49035w = z5;
        this.f49036x = z6;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SubscribeMsgTmpItem(title='" + this.f49020e + "', templateId='" + this.f49021f + "', templateType=" + this.f49022g + ", chooseStatus=" + this.f49023h + ", settingStatus=" + this.f49025j + ", settingStatus=" + this.f49025j + ", CREATOR=" + CREATOR + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f49020e);
        }
        if (parcel != null) {
            parcel.writeString(this.f49021f);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49022g);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49023h);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49024i.size());
        }
        for (C13604l lVar : this.f49024i) {
            if (parcel != null) {
                parcel.writeSerializable(lVar);
            }
        }
        if (parcel != null) {
            parcel.writeInt(this.f49025j);
        }
        if (parcel != null) {
            parcel.writeByte(this.f49026n ? (byte) 1 : 0);
        }
        if (parcel != null) {
            parcel.writeLong(this.f49027o);
        }
        if (parcel != null) {
            parcel.writeString(this.f49019d);
        }
        if (parcel != null) {
            parcel.writeByte(this.f49028p ? (byte) 1 : 0);
        }
        if (parcel != null) {
            parcel.writeString(this.f49029q);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49031s);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49030r ? 1 : 0);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49032t ? 1 : 0);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49033u ? 1 : 0);
        }
        if (parcel != null) {
            parcel.writeString(this.f49034v);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49035w ? 1 : 0);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49036x ? 1 : 0);
        }
    }

    public SubscribeMsgTmpItem(String str, int i, int i2, boolean z) {
        C87412m.m108594g(str, "templateId");
        this.f49020e = "";
        this.f49021f = str;
        this.f49022g = i;
        this.f49023h = -1;
        this.f49025j = i2;
        this.f49024i = new ArrayList<>();
        this.f49026n = z;
        this.f49027o = 0;
        this.f49019d = "";
        this.f49028p = false;
        this.f49029q = "";
        this.f49031s = -1;
        this.f49030r = false;
        this.f49032t = false;
        this.f49033u = false;
        this.f49034v = "";
        this.f49035w = false;
        this.f49036x = false;
    }

    public SubscribeMsgTmpItem(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        String readString = parcel.readString();
        String str = "";
        this.f49020e = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f49021f = readString2 == null ? str : readString2;
        this.f49022g = parcel.readInt();
        this.f49023h = parcel.readInt();
        int readInt = parcel.readInt();
        this.f49024i = new ArrayList<>(readInt);
        while (readInt != 0) {
            try {
                ArrayList<C13604l<String, String>> arrayList = this.f49024i;
                Serializable readSerializable = parcel.readSerializable();
                C87412m.m108592e(readSerializable, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.String>");
                arrayList.add((C13604l) readSerializable);
                readInt--;
            } catch (InvalidClassException unused) {
            }
        }
        this.f49025j = parcel.readInt();
        boolean z = false;
        this.f49026n = parcel.readByte() != 0;
        this.f49027o = parcel.readLong();
        String readString3 = parcel.readString();
        this.f49019d = readString3 == null ? str : readString3;
        this.f49028p = parcel.readByte() != 0;
        String readString4 = parcel.readString();
        this.f49029q = readString4 == null ? str : readString4;
        this.f49031s = parcel.readInt();
        this.f49030r = parcel.readInt() == 1;
        this.f49032t = parcel.readInt() == 1;
        this.f49033u = parcel.readInt() == 1;
        String readString5 = parcel.readString();
        this.f49034v = readString5 != null ? readString5 : str;
        this.f49035w = parcel.readInt() == 1;
        this.f49036x = parcel.readInt() == 1 ? true : z;
    }
}
