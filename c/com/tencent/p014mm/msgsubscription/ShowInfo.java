package com.tencent.p014mm.msgsubscription;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/ShowInfo;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.ShowInfo */
public final class ShowInfo implements Parcelable {
    public static final Parcelable.Creator<ShowInfo> CREATOR = new C17802a();

    /* renamed from: d */
    public int f48989d;

    /* renamed from: e */
    public String f48990e;

    /* renamed from: f */
    public String f48991f;

    /* renamed from: com.tencent.mm.msgsubscription.ShowInfo$a */
    public static final class C17802a implements Parcelable.Creator<ShowInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new ShowInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ShowInfo[i];
        }
    }

    public ShowInfo(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f48989d = parcel.readInt();
        String readString = parcel.readString();
        String str = "";
        this.f48990e = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f48991f = readString2 != null ? readString2 : str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f48989d);
        parcel.writeString(this.f48990e);
        parcel.writeString(this.f48991f);
    }

    public ShowInfo(int i, String str, String str2) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "content");
        this.f48989d = i;
        this.f48990e = str;
        this.f48991f = str2;
    }
}
