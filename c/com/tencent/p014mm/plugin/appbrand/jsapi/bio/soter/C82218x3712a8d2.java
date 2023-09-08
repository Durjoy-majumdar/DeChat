package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import lt3.C21460a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask */
class C82218x3712a8d2 extends MainProcessTask {
    public static final Parcelable.Creator<C82218x3712a8d2> CREATOR = new C82219a();

    /* renamed from: f */
    public String f241092f = "";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask$a */
    public class C82219a implements Parcelable.Creator<C82218x3712a8d2> {
        public Object createFromParcel(Parcel parcel) {
            return new C82218x3712a8d2(parcel);
        }

        public Object[] newArray(int i) {
            return new C82218x3712a8d2[i];
        }
    }

    public C82218x3712a8d2(Parcel parcel) {
        this.f241092f = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f241092f = parcel.readString();
    }

    /* renamed from: i */
    public void mo1552i() {
        Log.m105919d("MicroMsg.GetIsSupportSoterTask", "hy: callback. verifyRemoteStr: %s", this.f241092f);
        HashMap hashMap = new HashMap(2);
        hashMap.put("verifyRemote", this.f241092f);
        hashMap.put("nativeSupport", Boolean.valueOf(C21460a.m24278l()));
        Log.m105924i("MicroMsg.GetIsSupportSoterTask", "hy: nativeSupport:" + C21460a.m24278l());
        throw null;
    }

    /* renamed from: j */
    public void mo1553j() {
        String b = C21460a.m24268b();
        this.f241092f = b;
        Log.m105925i("MicroMsg.GetIsSupportSoterTask", "hy: verifyRemoteStr: %s", b);
        mo114394b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f241092f);
    }
}
