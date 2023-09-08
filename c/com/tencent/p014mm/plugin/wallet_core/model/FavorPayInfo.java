package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.FavorPayInfo */
public class FavorPayInfo implements Parcelable {
    public static final Parcelable.Creator<FavorPayInfo> CREATOR = new C72178a();

    /* renamed from: d */
    public String f209524d;

    /* renamed from: e */
    public int f209525e;

    /* renamed from: f */
    public String f209526f;

    /* renamed from: g */
    public String f209527g;

    /* renamed from: h */
    public String f209528h;

    /* renamed from: i */
    public List<String> f209529i = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.FavorPayInfo$a */
    public class C72178a implements Parcelable.Creator<FavorPayInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new FavorPayInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new FavorPayInfo[i];
        }
    }

    public FavorPayInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(String.format("FavorPayInfo %s isNeedBankPay %s needBankType %s defaultFavorCompId %s changeBankcardTips %s", new Object[]{this.f209524d, Integer.valueOf(this.f209525e), this.f209526f, this.f209527g, this.f209528h}));
        if (this.f209529i != null) {
            stringBuffer.append("bind_serial_list :");
            for (String str : this.f209529i) {
                stringBuffer.append(str + ",");
            }
        }
        return stringBuffer.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209524d);
        parcel.writeInt(this.f209525e);
        parcel.writeString(this.f209526f);
        parcel.writeString(this.f209527g);
        parcel.writeString(this.f209528h);
        parcel.writeStringList(this.f209529i);
    }

    public FavorPayInfo(Parcel parcel) {
        this.f209524d = parcel.readString();
        this.f209525e = parcel.readInt();
        this.f209526f = parcel.readString();
        this.f209527g = parcel.readString();
        this.f209528h = parcel.readString();
        this.f209529i = parcel.createStringArrayList();
    }
}
