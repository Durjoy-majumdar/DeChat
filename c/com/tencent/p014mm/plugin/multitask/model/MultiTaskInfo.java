package com.tencent.p014mm.plugin.multitask.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38612m6;
import te3.C64459j13;

/* renamed from: com.tencent.mm.plugin.multitask.model.MultiTaskInfo */
public class MultiTaskInfo extends C38612m6 implements Parcelable {
    public static final Parcelable.Creator<MultiTaskInfo> CREATOR = new C56886a();

    /* renamed from: x */
    public static IAutoDBItem.MAutoDBInfo f162955x = C38612m6.initAutoDBInfo(C38612m6.class);

    /* renamed from: com.tencent.mm.plugin.multitask.model.MultiTaskInfo$a */
    public class C56886a implements Parcelable.Creator<MultiTaskInfo> {
        public Object createFromParcel(Parcel parcel) {
            MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
            multiTaskInfo.field_id = parcel.readString();
            multiTaskInfo.field_type = parcel.readInt();
            multiTaskInfo.field_createTime = parcel.readLong();
            multiTaskInfo.field_updateTime = parcel.readLong();
            C64459j13 j132 = new C64459j13();
            j132.f183751d = parcel.readString();
            j132.f183752e = parcel.readString();
            j132.f183753f = parcel.readString();
            j132.f183754g = parcel.readInt();
            j132.f183755h = parcel.readString();
            j132.f183756i = parcel.readString();
            j132.f183757j = parcel.readInt();
            j132.f183758n = parcel.readInt() != 0;
            multiTaskInfo.field_showData = j132;
            try {
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                multiTaskInfo.field_data = bArr;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MultiTaskInfo", "read ext info error: %s", e.getMessage());
            }
            return multiTaskInfo;
        }

        public Object[] newArray(int i) {
            return new MultiTaskInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f162955x;
    }

    /* renamed from: m2 */
    public C64459j13 mo80305m2() {
        if (this.field_showData == null) {
            this.field_showData = new C64459j13();
        }
        return this.field_showData;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field_id);
        parcel.writeInt(this.field_type);
        parcel.writeLong(this.field_createTime);
        parcel.writeLong(this.field_updateTime);
        parcel.writeString(this.field_showData.f183751d);
        parcel.writeString(this.field_showData.f183752e);
        parcel.writeString(this.field_showData.f183753f);
        parcel.writeInt(this.field_showData.f183754g);
        parcel.writeString(this.field_showData.f183755h);
        parcel.writeString(this.field_showData.f183756i);
        parcel.writeInt(this.field_showData.f183757j);
        parcel.writeInt(this.field_showData.f183758n ? 1 : 0);
        parcel.writeInt(this.field_data.length);
        parcel.writeByteArray(this.field_data);
    }
}
