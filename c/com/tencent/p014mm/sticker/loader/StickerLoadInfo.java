package com.tencent.p014mm.sticker.loader;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/sticker/loader/StickerLoadInfo;", "Landroid/os/Parcelable;", "plugin-sticker_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sticker.loader.StickerLoadInfo */
public final class StickerLoadInfo implements Parcelable {
    public static final Parcelable.Creator<StickerLoadInfo> CREATOR = new C96978a();

    /* renamed from: d */
    public final int f284100d;

    /* renamed from: e */
    public String f284101e;

    /* renamed from: f */
    public String f284102f;

    /* renamed from: g */
    public String f284103g;

    /* renamed from: h */
    public int f284104h;

    /* renamed from: i */
    public String f284105i;

    /* renamed from: j */
    public int f284106j;

    /* renamed from: com.tencent.mm.sticker.loader.StickerLoadInfo$a */
    public static final class C96978a implements Parcelable.Creator<StickerLoadInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            StickerLoadInfo stickerLoadInfo = new StickerLoadInfo(parcel.readInt());
            String readString = parcel.readString();
            String str = "";
            if (readString == null) {
                readString = str;
            }
            stickerLoadInfo.f284101e = readString;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                readString2 = str;
            }
            stickerLoadInfo.f284102f = readString2;
            String readString3 = parcel.readString();
            if (readString3 == null) {
                readString3 = str;
            }
            stickerLoadInfo.f284103g = readString3;
            stickerLoadInfo.f284104h = parcel.readInt();
            String readString4 = parcel.readString();
            if (readString4 != null) {
                str = readString4;
            }
            stickerLoadInfo.f284105i = str;
            stickerLoadInfo.f284106j = parcel.readInt();
            return stickerLoadInfo;
        }

        public Object[] newArray(int i) {
            return new StickerLoadInfo[i];
        }
    }

    public StickerLoadInfo() {
        this(0, 1, (C8480h) null);
    }

    public StickerLoadInfo(int i) {
        this.f284100d = i;
        this.f284101e = "";
        this.f284102f = "";
        this.f284103g = "";
        this.f284105i = "";
    }

    /* renamed from: a */
    public final String mo135558a() {
        if (this.f284100d == 0) {
            return this.f284101e;
        }
        String mD5String = MD5Util.getMD5String(this.f284105i);
        C87412m.m108593f(mD5String, "{\n            MD5Util.getMD5String(url)\n        }");
        return mD5String;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f284100d);
        parcel.writeString(this.f284101e);
        parcel.writeString(this.f284102f);
        parcel.writeString(this.f284103g);
        parcel.writeInt(this.f284104h);
        parcel.writeString(this.f284105i);
        parcel.writeInt(this.f284106j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerLoadInfo(int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
