package com.tencent.p014mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.data.SnsCmdList */
public class SnsCmdList implements Parcelable {
    public static final Parcelable.Creator<SnsCmdList> CREATOR = new C94820a();

    /* renamed from: d */
    public int f274670d = 0;

    /* renamed from: e */
    public int f274671e = 0;

    /* renamed from: f */
    public List<Integer> f274672f = new LinkedList();

    /* renamed from: g */
    public List<Integer> f274673g = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.sns.data.SnsCmdList$a */
    public class C94820a implements Parcelable.Creator<SnsCmdList> {
        public Object createFromParcel(Parcel parcel) {
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
            SnsCmdList snsCmdList = new SnsCmdList();
            int readInt = parcel.readInt();
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            snsCmdList.f274670d = readInt;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            List<Integer> list = snsCmdList.f274672f;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            ((LinkedList) list).clear();
            int i = 0;
            int i2 = 0;
            while (true) {
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                int i3 = snsCmdList.f274670d;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                if (i2 >= i3) {
                    break;
                }
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                List<Integer> list2 = snsCmdList.f274672f;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                ((LinkedList) list2).add(Integer.valueOf(parcel.readInt()));
                i2++;
            }
            int readInt2 = parcel.readInt();
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            snsCmdList.f274671e = readInt2;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            List<Integer> list3 = snsCmdList.f274673g;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            ((LinkedList) list3).clear();
            while (true) {
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                int i4 = snsCmdList.f274671e;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                if (i < i4) {
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                    List<Integer> list4 = snsCmdList.f274673g;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                    ((LinkedList) list4).add(Integer.valueOf(parcel.readInt()));
                    i++;
                } else {
                    SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
                    SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
                    return snsCmdList;
                }
            }
        }

        public Object[] newArray(int i) {
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
            SnsCmdList[] snsCmdListArr = new SnsCmdList[i];
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.data.SnsCmdList$1");
            return snsCmdListArr;
        }
    }

    /* renamed from: a */
    public void mo130689a(int i) {
        SnsMethodCalculate.markStartTimeMs("addRemoveItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        ((LinkedList) this.f274672f).add(Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("addRemoveItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
    }

    public int describeContents() {
        SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        int size = ((LinkedList) this.f274672f).size();
        this.f274670d = size;
        parcel.writeInt(size);
        for (int i2 = 0; i2 < this.f274670d; i2++) {
            parcel.writeInt(((Integer) ((LinkedList) this.f274672f).get(i2)).intValue());
        }
        int size2 = ((LinkedList) this.f274673g).size();
        this.f274671e = size2;
        parcel.writeInt(size2);
        for (int i3 = 0; i3 < this.f274671e; i3++) {
            parcel.writeInt(((Integer) ((LinkedList) this.f274673g).get(i3)).intValue());
        }
        SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList");
    }
}
