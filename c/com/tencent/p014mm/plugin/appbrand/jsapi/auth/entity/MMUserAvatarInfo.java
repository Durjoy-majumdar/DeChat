package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import te3.mo4;
import te3.no4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMUserAvatarInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "MMUserAvatarItem", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo */
public final class MMUserAvatarInfo implements Parcelable {
    public static final C82134a CREATOR = new C82134a((C8480h) null);

    /* renamed from: d */
    public ArrayList<MMUserAvatarItem> f240911d = new ArrayList<>();

    /* renamed from: e */
    public boolean f240912e;

    /* renamed from: f */
    public int f240913f;

    /* renamed from: g */
    public int f240914g;

    /* renamed from: h */
    public String f240915h;

    /* renamed from: i */
    public String f240916i;

    /* renamed from: j */
    public String f240917j;

    /* renamed from: n */
    public String f240918n;

    /* renamed from: o */
    public String f240919o;

    /* renamed from: p */
    public String f240920p;

    /* renamed from: q */
    public String f240921q;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo$a */
    public static final class C82134a implements Parcelable.Creator<MMUserAvatarInfo> {
        public C82134a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MMUserAvatarInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new MMUserAvatarInfo[i];
        }
    }

    public MMUserAvatarInfo(Parcel parcel) {
        C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
        ArrayList<MMUserAvatarItem> readArrayList = parcel.readArrayList(MMUserAvatarItem.class.getClassLoader());
        this.f240911d = readArrayList == null ? new ArrayList<>() : readArrayList;
        this.f240912e = parcel.readByte() != 0;
        this.f240913f = parcel.readInt();
        this.f240914g = parcel.readInt();
        this.f240915h = parcel.readString();
        this.f240916i = parcel.readString();
        this.f240917j = parcel.readString();
        this.f240918n = parcel.readString();
        this.f240919o = parcel.readString();
        this.f240920p = parcel.readString();
        this.f240921q = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeList(this.f240911d);
        parcel.writeByte(this.f240912e ? (byte) 1 : 0);
        parcel.writeInt(this.f240913f);
        parcel.writeInt(this.f240914g);
        parcel.writeString(this.f240915h);
        parcel.writeString(this.f240916i);
        parcel.writeString(this.f240917j);
        parcel.writeString(this.f240918n);
        parcel.writeString(this.f240919o);
        parcel.writeString(this.f240920p);
        parcel.writeString(this.f240921q);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMUserAvatarInfo$MMUserAvatarItem;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo$MMUserAvatarItem */
    public static final class MMUserAvatarItem implements Parcelable {
        public static final C82133a CREATOR = new C82133a((C8480h) null);

        /* renamed from: d */
        public int f240922d;

        /* renamed from: e */
        public String f240923e = "";

        /* renamed from: f */
        public String f240924f = "";

        /* renamed from: g */
        public String f240925g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo$MMUserAvatarItem$a */
        public static final class C82133a implements Parcelable.Creator<MMUserAvatarItem> {
            public C82133a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new MMUserAvatarItem(parcel);
            }

            public Object[] newArray(int i) {
                return new MMUserAvatarItem[i];
            }
        }

        public MMUserAvatarItem(Parcel parcel) {
            C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
            this.f240922d = parcel.readInt();
            this.f240923e = String.valueOf(parcel.readString());
            this.f240924f = String.valueOf(parcel.readString());
            this.f240925g = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeInt(this.f240922d);
            parcel.writeString(this.f240923e);
            parcel.writeString(this.f240924f);
            parcel.writeString(this.f240925g);
        }

        public MMUserAvatarItem(no4 no4) {
            C87412m.m108594g(no4, "item");
            this.f240922d = no4.f259706d;
            String str = no4.f259707e;
            C87412m.m108593f(str, "item.nickname");
            this.f240923e = str;
            String str2 = no4.f259708f;
            C87412m.m108593f(str2, "item.avatarurl");
            this.f240924f = str2;
            this.f240925g = no4.f259709g;
        }
    }

    public MMUserAvatarInfo(mo4 mo4, String str, String str2, String str3) {
        C87412m.m108594g(mo4, "avatar_info");
        Iterator<no4> it = mo4.f259692d.iterator();
        while (it.hasNext()) {
            no4 next = it.next();
            ArrayList<MMUserAvatarItem> arrayList = this.f240911d;
            C87412m.m108591d(arrayList);
            C87412m.m108593f(next, "item");
            arrayList.add(new MMUserAvatarItem(next));
        }
        this.f240912e = mo4.f259693e;
        this.f240913f = mo4.f259694f;
        this.f240914g = mo4.f259695g;
        this.f240915h = mo4.f259696h;
        this.f240916i = mo4.f259697i;
        this.f240917j = mo4.f259698j;
        this.f240918n = mo4.f259699n;
        this.f240919o = str2 == null ? "" : str2;
        this.f240920p = str == null ? "" : str;
        this.f240921q = str3 == null ? "" : str3;
    }
}
