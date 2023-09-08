package com.tencent.p014mm.plugin.appbrand.jsapi.offlinevoice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import cm0.C28615c;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech */
public class IPCSetCurrentPaySpeech implements C1255d<IPCSetCurrentPaySpeechParam, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        String str;
        IPCSetCurrentPaySpeechParam iPCSetCurrentPaySpeechParam = (IPCSetCurrentPaySpeechParam) obj;
        Bundle bundle = new Bundle();
        if (Util.isNullOrNil(iPCSetCurrentPaySpeechParam.f80420d)) {
            Log.m105920e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "fail:dialectPackId is null");
            if (gVar != null) {
                bundle.putString("IPCResultInfo", "fail:dialectPackId is null");
                gVar.mo894a(bundle);
                return;
            }
            return;
        }
        boolean z = false;
        Log.m105925i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "data.dialectPackId: %s,data.md5Sum:%s ,data.tempFileAbsolutePath :%s ,data.isOnlyDownload:%s ，data.version: %s", iPCSetCurrentPaySpeechParam.f80420d, iPCSetCurrentPaySpeechParam.f80424h, iPCSetCurrentPaySpeechParam.f80422f, Boolean.valueOf(iPCSetCurrentPaySpeechParam.f80423g), iPCSetCurrentPaySpeechParam.f80425i);
        if (Util.isNullOrNil(iPCSetCurrentPaySpeechParam.f80422f)) {
            Log.m105924i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "tempFileAbsolutePath == null");
        } else if (Util.isNullOrNil(iPCSetCurrentPaySpeechParam.f80424h) || !iPCSetCurrentPaySpeechParam.f80424h.equalsIgnoreCase(C86013q1.m106456q(iPCSetCurrentPaySpeechParam.f80422f))) {
            Log.m105921e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "fail:md5Sum:%s", Boolean.valueOf(Util.isNullOrNil(iPCSetCurrentPaySpeechParam.f80424h)));
            if (gVar != null) {
                bundle.putString("IPCResultInfo", "fail:md5Sum is null or md5Sum is not euqal tempFileAbsolutePath MD5");
                gVar.mo894a(bundle);
                return;
            }
            return;
        } else {
            String str2 = C28615c.f78517c;
            C86013q1.m106461v(str2);
            String str3 = str2 + iPCSetCurrentPaySpeechParam.f80420d + ".pos";
            if (C86013q1.m106450k(str3)) {
                Log.m105924i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", " has this voice resource file before ，first delete exist file");
                C86013q1.m106447h(str3);
            }
            C86013q1.m106442c(iPCSetCurrentPaySpeechParam.f80422f, str3);
            C28615c.m38294b().mo56097e(iPCSetCurrentPaySpeechParam.f80420d, str3, iPCSetCurrentPaySpeechParam.f80424h, iPCSetCurrentPaySpeechParam.f80425i);
            Log.m105925i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "copyFile to %s %s", str3, iPCSetCurrentPaySpeechParam.f80424h);
        }
        boolean z2 = iPCSetCurrentPaySpeechParam.f80423g;
        if (z2) {
            Log.m105925i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "isOnlyDownload:%s", Boolean.valueOf(z2));
            str = "isOnlyDownload is true, dont reset source";
        } else if (!Util.isNullOrNil(iPCSetCurrentPaySpeechParam.f80421e)) {
            C28615c.m38294b();
            C28615c.m38296f(iPCSetCurrentPaySpeechParam.f80420d);
            str = "data.tempFilePath is not null，data.dialectPackId is " + iPCSetCurrentPaySpeechParam.f80420d + ", set source";
        } else if (Util.isEqual(iPCSetCurrentPaySpeechParam.f80420d, "0")) {
            C28615c.m38294b();
            String string = C28615c.m38293a().getString(iPCSetCurrentPaySpeechParam.f80420d, "");
            if (Util.isNullOrNil(string) || !C86013q1.m106450k(string)) {
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + iPCSetCurrentPaySpeechParam.f80420d + "，dont have this resource , set defaylt resource";
            } else {
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + iPCSetCurrentPaySpeechParam.f80420d + "，set resource";
            }
            C28615c.m38294b();
            C28615c.m38296f(iPCSetCurrentPaySpeechParam.f80420d);
        } else {
            C28615c.m38294b();
            String string2 = C28615c.m38293a().getString(iPCSetCurrentPaySpeechParam.f80420d, "");
            if (Util.isNullOrNil(string2) || !C86013q1.m106450k(string2)) {
                Log.m105921e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "resPath:%s %s", Util.nullAs(string2, "null"), Boolean.valueOf(C86013q1.m106450k(string2)));
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId =" + iPCSetCurrentPaySpeechParam.f80420d + "，dont have this resource";
                z = true;
            } else {
                C28615c.m38294b();
                C28615c.m38296f(iPCSetCurrentPaySpeechParam.f80420d);
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + iPCSetCurrentPaySpeechParam.f80420d + "，set resource";
            }
        }
        if (gVar == null) {
            return;
        }
        if (z) {
            bundle.putString("IPCResultInfo", "fail:" + str);
            gVar.mo894a(bundle);
            return;
        }
        bundle.putString("IPCResultInfo", "ok:" + str);
        gVar.mo894a(bundle);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech$IPCSetCurrentPaySpeechParam */
    public static final class IPCSetCurrentPaySpeechParam implements Parcelable {
        public static final Parcelable.Creator<IPCSetCurrentPaySpeechParam> CREATOR = new C29530a();

        /* renamed from: d */
        public String f80420d;

        /* renamed from: e */
        public String f80421e;

        /* renamed from: f */
        public String f80422f;

        /* renamed from: g */
        public boolean f80423g;

        /* renamed from: h */
        public String f80424h;

        /* renamed from: i */
        public String f80425i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech$IPCSetCurrentPaySpeechParam$a */
        public class C29530a implements Parcelable.Creator<IPCSetCurrentPaySpeechParam> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCSetCurrentPaySpeechParam(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCSetCurrentPaySpeechParam[i];
            }
        }

        public IPCSetCurrentPaySpeechParam(String str, String str2, String str3, boolean z, String str4, String str5) {
            this.f80420d = str;
            this.f80421e = str2;
            this.f80422f = str3;
            this.f80423g = z;
            this.f80424h = str4;
            this.f80425i = str5;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f80420d);
            parcel.writeString(this.f80421e);
            parcel.writeString(this.f80422f);
            parcel.writeByte(this.f80423g ? (byte) 1 : 0);
            parcel.writeString(this.f80424h);
            parcel.writeString(this.f80425i);
        }

        public IPCSetCurrentPaySpeechParam() {
        }

        public IPCSetCurrentPaySpeechParam(Parcel parcel) {
            this.f80420d = parcel.readString();
            this.f80421e = parcel.readString();
            this.f80422f = parcel.readString();
            this.f80423g = parcel.readByte() != 0;
            this.f80424h = parcel.readString();
            this.f80425i = parcel.readString();
        }
    }
}
