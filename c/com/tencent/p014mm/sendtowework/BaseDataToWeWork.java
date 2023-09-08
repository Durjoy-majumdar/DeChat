package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.BaseDataToWeWork */
public class BaseDataToWeWork implements Parcelable {
    public static final C85769a CREATOR = new C85769a((C8480h) null);

    /* renamed from: com.tencent.mm.sendtowework.BaseDataToWeWork$a */
    public static final class C85769a implements Parcelable.Creator<BaseDataToWeWork> {
        public C85769a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new BaseDataToWeWork();
        }

        public Object[] newArray(int i) {
            return new BaseDataToWeWork[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
    }
}
