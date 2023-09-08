package com.tencent.p014mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.data.SnsTagList */
public class SnsTagList implements Parcelable {
    public static final Parcelable.Creator<SnsTagList> CREATOR = new C30401a();

    /* renamed from: d */
    public int f82000d = 0;

    /* renamed from: e */
    public List<Long> f82001e = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.sns.data.SnsTagList$a */
    public class C30401a implements Parcelable.Creator<SnsTagList> {
        public Object createFromParcel(Parcel parcel) {
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
            SnsTagList snsTagList = new SnsTagList();
            int readInt = parcel.readInt();
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.data.SnsTagList");
            snsTagList.f82000d = readInt;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.data.SnsTagList");
            int i = 0;
            while (true) {
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsTagList");
                int i2 = snsTagList.f82000d;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsTagList");
                if (i < i2) {
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsTagList");
                    List<Long> list = snsTagList.f82001e;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsTagList");
                    ((LinkedList) list).add(Long.valueOf(parcel.readLong()));
                    i++;
                } else {
                    SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
                    SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
                    return snsTagList;
                }
            }
        }

        public Object[] newArray(int i) {
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
            SnsTagList[] snsTagListArr = new SnsTagList[i];
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsTagList$1");
            return snsTagListArr;
        }
    }

    public int describeContents() {
        SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsTagList");
        SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsTagList");
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsTagList");
        int size = ((LinkedList) this.f82001e).size();
        this.f82000d = size;
        parcel.writeInt(size);
        for (Long longValue : this.f82001e) {
            parcel.writeLong(longValue.longValue());
        }
        SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsTagList");
    }
}
