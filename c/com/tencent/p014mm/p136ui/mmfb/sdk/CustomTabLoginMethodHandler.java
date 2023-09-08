package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler */
public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C116089a();

    /* renamed from: f */
    public String f348389f;

    /* renamed from: g */
    public String f348390g;

    /* renamed from: h */
    public String f348391h;

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler$a */
    public class C116089a implements Parcelable.Creator {
        public Object createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        public Object[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f348391h = "";
        this.f348390g = new BigInteger(100, new Random()).toString(32);
        this.f348391h = "fb290293790992170://authorize";
    }

    /* renamed from: b */
    public static Map<String, String> m163380b(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f348390g);
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f348391h = "";
        this.f348390g = parcel.readString();
    }
}
