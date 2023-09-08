package com.tencent.p014mm.plugin.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/model/WxaRegisterInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.model.WxaRegisterInfo */
public final class WxaRegisterInfo implements Parcelable {
    public static final C42601a CREATOR = new C42601a((C8480h) null);

    /* renamed from: d */
    public final String f115285d;

    /* renamed from: e */
    public final List<WxaAttributes.WxaEntryInfo> f115286e;

    /* renamed from: com.tencent.mm.plugin.profile.model.WxaRegisterInfo$a */
    public static final class C42601a implements Parcelable.Creator<WxaRegisterInfo> {
        public C42601a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, WxaAttributes.WxaEntryInfo.CREATOR);
            C13598b0 b0Var = C13598b0.f38549a;
            return new WxaRegisterInfo(readString, arrayList);
        }

        public Object[] newArray(int i) {
            return new WxaRegisterInfo[i];
        }
    }

    public WxaRegisterInfo(String str, List<WxaAttributes.WxaEntryInfo> list) {
        this.f115285d = str;
        this.f115286e = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f115285d);
        parcel.writeTypedList(this.f115286e);
    }
}
