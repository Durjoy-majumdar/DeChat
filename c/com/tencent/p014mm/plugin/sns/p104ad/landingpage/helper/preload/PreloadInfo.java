package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.preload;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/helper/preload/PreloadInfo;", "Landroid/os/Parcelable;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo */
public final class PreloadInfo implements Parcelable {
    public static final Parcelable.Creator<PreloadInfo> CREATOR = new C30399a();

    /* renamed from: d */
    public final String f81997d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$a */
    public static final class C30399a implements Parcelable.Creator<PreloadInfo> {
        public Object createFromParcel(Parcel parcel) {
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            C87412m.m108594g(parcel, "parcel");
            PreloadInfo preloadInfo = new PreloadInfo(parcel.readString());
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            return preloadInfo;
        }

        public Object[] newArray(int i) {
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            PreloadInfo[] preloadInfoArr = new PreloadInfo[i];
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo$Creator");
            return preloadInfoArr;
        }
    }

    public PreloadInfo(String str) {
        this.f81997d = str;
    }

    public int describeContents() {
        SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
        SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f81997d);
        SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
    }
}
