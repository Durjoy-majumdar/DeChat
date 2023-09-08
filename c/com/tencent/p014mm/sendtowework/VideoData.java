package com.tencent.p014mm.sendtowework;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sendtowework/VideoData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "a", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sendtowework.VideoData */
public final class VideoData extends BaseDataToWeWork {
    public static final C85772a CREATOR = new C85772a((C8480h) null);

    /* renamed from: d */
    public final String f249809d;

    /* renamed from: com.tencent.mm.sendtowework.VideoData$a */
    public static final class C85772a implements Parcelable.Creator<VideoData> {
        public C85772a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new VideoData(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new VideoData[i];
        }
    }

    public VideoData(String str) {
        this.f249809d = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f249809d);
    }
}
