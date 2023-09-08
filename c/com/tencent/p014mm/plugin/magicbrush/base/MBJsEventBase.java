package com.tencent.p014mm.plugin.magicbrush.base;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/base/MBJsEventBase;", "Landroid/os/Parcelable;", "mb-commons_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.base.MBJsEventBase */
public class MBJsEventBase implements Parcelable {
    public static final Parcelable.Creator<MBJsEventBase> CREATOR = new C30178a();

    /* renamed from: d */
    public final String f81581d;

    /* renamed from: e */
    public String f81582e;

    /* renamed from: com.tencent.mm.plugin.magicbrush.base.MBJsEventBase$a */
    public static final class C30178a implements Parcelable.Creator<MBJsEventBase> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MBJsEventBase(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new MBJsEventBase[i];
        }
    }

    public MBJsEventBase(String str, String str2) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "data");
        this.f81581d = str;
        this.f81582e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f81581d);
        parcel.writeString(this.f81582e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MBJsEventBase(String str, String str2, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
