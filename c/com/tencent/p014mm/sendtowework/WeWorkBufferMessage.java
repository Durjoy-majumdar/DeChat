package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/WeWorkBufferMessage;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.WeWorkBufferMessage */
public final class WeWorkBufferMessage extends BaseDataToWeWork {
    public static final C96921a CREATOR = new C96921a((C8480h) null);

    /* renamed from: d */
    public byte[] f283925d;

    /* renamed from: com.tencent.mm.sendtowework.WeWorkBufferMessage$a */
    public static final class C96921a implements Parcelable.Creator<WeWorkBufferMessage> {
        public C96921a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new WeWorkBufferMessage(parcel.createByteArray());
        }

        public Object[] newArray(int i) {
            return new WeWorkBufferMessage[i];
        }
    }

    public WeWorkBufferMessage() {
        this((byte[]) null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeByteArray(this.f283925d);
    }

    public WeWorkBufferMessage(byte[] bArr) {
        this.f283925d = bArr;
    }
}
