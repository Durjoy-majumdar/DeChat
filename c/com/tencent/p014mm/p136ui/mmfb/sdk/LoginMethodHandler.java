package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler */
abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: d */
    public Map<String, String> f348415d;

    /* renamed from: e */
    public LoginClient f348416e;

    public LoginMethodHandler(LoginClient loginClient) {
        this.f348416e = loginClient;
    }

    /* renamed from: a */
    public static void m163381a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        m163381a(parcel, this.f348415d);
    }

    public LoginMethodHandler(Parcel parcel) {
        HashMap hashMap;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap();
            for (int i = 0; i < readInt; i++) {
                hashMap2.put(parcel.readString(), parcel.readString());
            }
            hashMap = hashMap2;
        }
        this.f348415d = hashMap;
    }
}
