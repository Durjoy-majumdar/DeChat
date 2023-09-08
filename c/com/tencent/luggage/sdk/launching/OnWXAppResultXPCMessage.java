package com.tencent.luggage.sdk.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCMessage;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class OnWXAppResultXPCMessage implements Parcelable {
    public static final Parcelable.Creator<OnWXAppResultXPCMessage> CREATOR = new C28641a();

    /* renamed from: d */
    public final int f78581d;

    /* renamed from: e */
    public final int f78582e;

    /* renamed from: f */
    public final Parcelable f78583f;

    /* renamed from: g */
    public final String f78584g;

    /* renamed from: h */
    public final String f78585h;

    /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage$a */
    public static final class C28641a implements Parcelable.Creator<OnWXAppResultXPCMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OnWXAppResultXPCMessage(parcel.readInt(), parcel.readInt(), parcel.readParcelable(OnWXAppResultXPCMessage.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new OnWXAppResultXPCMessage[i];
        }
    }

    public OnWXAppResultXPCMessage(int i, int i2, Parcelable parcelable, String str, String str2) {
        this.f78581d = i;
        this.f78582e = i2;
        this.f78583f = parcelable;
        this.f78584g = str;
        this.f78585h = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnWXAppResultXPCMessage)) {
            return false;
        }
        OnWXAppResultXPCMessage onWXAppResultXPCMessage = (OnWXAppResultXPCMessage) obj;
        return this.f78581d == onWXAppResultXPCMessage.f78581d && this.f78582e == onWXAppResultXPCMessage.f78582e && C87412m.m108589b(this.f78583f, onWXAppResultXPCMessage.f78583f) && C87412m.m108589b(this.f78584g, onWXAppResultXPCMessage.f78584g) && C87412m.m108589b(this.f78585h, onWXAppResultXPCMessage.f78585h);
    }

    public int hashCode() {
        int i = ((this.f78581d * 31) + this.f78582e) * 31;
        Parcelable parcelable = this.f78583f;
        int i2 = 0;
        int hashCode = (i + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        String str = this.f78584g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78585h;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "OnWXAppResultXPCMessage(instance=" + this.f78581d + ", action=" + this.f78582e + ", data=" + this.f78583f + ", stacktrace=" + this.f78584g + ", callProcess=" + this.f78585h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f78581d);
        parcel.writeInt(this.f78582e);
        parcel.writeParcelable(this.f78583f, i);
        parcel.writeString(this.f78584g);
        parcel.writeString(this.f78585h);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OnWXAppResultXPCMessage(int i, int i2, Parcelable parcelable, String str, String str2, int i3, C8480h hVar) {
        this(i, i2, parcelable, (i3 & 8) != 0 ? Log.getStackTraceString(new Throwable()) : str, (i3 & 16) != 0 ? MMApplicationContext.getProcessName() : str2);
    }
}
