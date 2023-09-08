package com.tencent.p014mm.plugin.wallet.wecoin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/model/WecoinEncashKVData;", "Landroid/os/Parcelable;", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData */
public final class WecoinEncashKVData implements Parcelable {
    public static final Parcelable.Creator<WecoinEncashKVData> CREATOR = new C5764a();

    /* renamed from: d */
    public int f21837d;

    /* renamed from: e */
    public String f21838e;

    /* renamed from: f */
    public String f21839f;

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData$a */
    public static final class C5764a implements Parcelable.Creator<WecoinEncashKVData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new WecoinEncashKVData(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new WecoinEncashKVData[i];
        }
    }

    public WecoinEncashKVData(int i, String str, String str2) {
        this.f21837d = i;
        this.f21838e = str;
        this.f21839f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f21837d);
        parcel.writeString(this.f21838e);
        parcel.writeString(this.f21839f);
    }
}
