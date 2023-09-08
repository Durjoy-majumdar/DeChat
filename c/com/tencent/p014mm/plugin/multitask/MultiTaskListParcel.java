package com.tencent.p014mm.plugin.multitask;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/MultiTaskListParcel;", "Landroid/os/Parcelable;", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.MultiTaskListParcel */
final class MultiTaskListParcel implements Parcelable {
    public static final Parcelable.Creator<MultiTaskListParcel> CREATOR = new C105915a();

    /* renamed from: d */
    public List<? extends MultiTaskInfo> f315101d;

    /* renamed from: com.tencent.mm.plugin.multitask.MultiTaskListParcel$a */
    public static final class C105915a implements Parcelable.Creator<MultiTaskListParcel> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
            return new MultiTaskListParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new MultiTaskListParcel[i];
        }
    }

    public MultiTaskListParcel(List<? extends MultiTaskInfo> list) {
        this.f315101d = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeTypedList(this.f315101d);
    }

    public MultiTaskListParcel(Parcel parcel) {
        C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
        this.f315101d = parcel.createTypedArrayList(MultiTaskInfo.CREATOR);
    }
}
