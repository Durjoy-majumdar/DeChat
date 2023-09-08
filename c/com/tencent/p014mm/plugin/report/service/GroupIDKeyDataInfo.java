package com.tencent.p014mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mars.smc.IDKey;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo */
class GroupIDKeyDataInfo implements Parcelable {
    public static final Parcelable.Creator<GroupIDKeyDataInfo> CREATOR = new C115660a();

    /* renamed from: d */
    public ArrayList<IDKey> f346927d;

    /* renamed from: e */
    public boolean f346928e;

    /* renamed from: com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo$a */
    public class C115660a implements Parcelable.Creator<GroupIDKeyDataInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new GroupIDKeyDataInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new GroupIDKeyDataInfo[i];
        }
    }

    public GroupIDKeyDataInfo(ArrayList<IDKey> arrayList, boolean z) {
        new ArrayList();
        this.f346927d = arrayList;
        this.f346928e = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f346927d);
        parcel.writeInt(this.f346928e ? 1 : 0);
    }

    public GroupIDKeyDataInfo(Parcel parcel) {
        ArrayList<IDKey> arrayList = new ArrayList<>();
        this.f346927d = arrayList;
        parcel.readTypedList(arrayList, IDKey.CREATOR);
        this.f346928e = parcel.readInt() != 1 ? false : true;
    }
}
