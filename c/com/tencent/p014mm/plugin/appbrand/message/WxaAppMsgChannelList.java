package com.tencent.p014mm.plugin.appbrand.message;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList */
public class WxaAppMsgChannelList implements Parcelable {
    public static final Parcelable.Creator<WxaAppMsgChannelList> CREATOR = new C40496a();

    /* renamed from: d */
    public ArrayList<WxaAppMsgChannel> f108806d;

    /* renamed from: com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList$a */
    public class C40496a implements Parcelable.Creator<WxaAppMsgChannelList> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaAppMsgChannelList(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaAppMsgChannelList[i];
        }
    }

    public WxaAppMsgChannelList() {
        this.f108806d = new ArrayList<>();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeParcelableList(this.f108806d, i);
            return;
        }
        WxaAppMsgChannel[] wxaAppMsgChannelArr = new WxaAppMsgChannel[this.f108806d.size()];
        this.f108806d.toArray(wxaAppMsgChannelArr);
        parcel.writeParcelableArray(wxaAppMsgChannelArr, i);
    }

    public WxaAppMsgChannelList(Parcel parcel) {
        ArrayList<WxaAppMsgChannel> arrayList = new ArrayList<>();
        this.f108806d = arrayList;
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.readParcelableList(arrayList, WxaAppMsgChannel.class.getClassLoader());
            return;
        }
        Parcelable[] readParcelableArray = parcel.readParcelableArray(WxaAppMsgChannel.class.getClassLoader());
        if (readParcelableArray != null && readParcelableArray.length > 0) {
            for (WxaAppMsgChannel add : (WxaAppMsgChannel[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, WxaAppMsgChannel[].class)) {
                this.f108806d.add(add);
            }
        }
    }
}
