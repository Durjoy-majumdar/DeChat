package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import lt3.C21460a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask */
class JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask> CREATOR = new C82217a();

    /* renamed from: f */
    public int f241090f = -1;

    /* renamed from: g */
    public int f241091g = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask$a */
    public class C82217a implements Parcelable.Creator<JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask> {
        public Object createFromParcel(Parcel parcel) {
            return new JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask(parcel);
        }

        public Object[] newArray(int i) {
            return new JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask[i];
        }
    }

    public JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask(Parcel parcel) {
        mo1551g(parcel);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f241091g = parcel.readInt();
        this.f241090f = parcel.readInt();
    }

    /* renamed from: i */
    public void mo1552i() {
        boolean z = false;
        Log.m105919d("MicroMsg.GetIsEnrolledTask", "hy: callback. enrollResult: %d", Integer.valueOf(this.f241091g));
        HashMap hashMap = new HashMap(2);
        if (this.f241091g == 1) {
            z = true;
        }
        hashMap.put("isEnrolled", Boolean.valueOf(z));
        int i = this.f241091g;
        if (i == 0) {
            throw null;
        } else if (i == -1) {
            throw null;
        } else if (i == 1) {
            throw null;
        } else {
            throw null;
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        int i = this.f241090f == 1 ? C21460a.m24281o((Context) null) ? 1 : 0 : -1;
        this.f241091g = i;
        Log.m105925i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", Integer.valueOf(i));
        mo114394b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f241091g);
        parcel.writeInt(this.f241090f);
    }
}
