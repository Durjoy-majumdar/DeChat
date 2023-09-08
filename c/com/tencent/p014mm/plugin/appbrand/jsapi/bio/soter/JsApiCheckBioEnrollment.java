package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.GetIsEnrolledEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment */
public class JsApiCheckBioEnrollment extends C82268c {
    public static final int CTRL_INDEX = 344;
    public static final String NAME = "checkIsSoterEnrolledInDevice";

    /* renamed from: g */
    public GetIsEnrolledTask f11276g = null;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiCheckBioEnrollment", "hy: subapp start do check is enrolled");
        this.f11276g = new GetIsEnrolledTask(fVar, i, C1648a.m1700a(jSONObject.optString("checkAuthMode")), this);
        this.f11276g.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment$GetIsEnrolledTask */
    public static class GetIsEnrolledTask extends MainProcessTask {
        public static final Parcelable.Creator<GetIsEnrolledTask> CREATOR = new C1646a();

        /* renamed from: f */
        public C82381f f11277f;

        /* renamed from: g */
        public int f11278g;

        /* renamed from: h */
        public JsApiCheckBioEnrollment f11279h;

        /* renamed from: i */
        public int f11280i;

        /* renamed from: j */
        public int f11281j;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment$GetIsEnrolledTask$a */
        public class C1646a implements Parcelable.Creator<GetIsEnrolledTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetIsEnrolledTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetIsEnrolledTask[i];
            }
        }

        public GetIsEnrolledTask(C82381f fVar, int i, int i2, JsApiCheckBioEnrollment jsApiCheckBioEnrollment) {
            this.f11281j = -1;
            this.f11277f = fVar;
            this.f11278g = i;
            this.f11279h = jsApiCheckBioEnrollment;
            this.f11280i = i2;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11281j = parcel.readInt();
            this.f11280i = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            boolean z = false;
            Log.m105919d("MicroMsg.GetIsEnrolledTask", "hy: callback. enrollResult: %d", Integer.valueOf(this.f11281j));
            HashMap hashMap = new HashMap(2);
            if (this.f11281j == 1) {
                z = true;
            }
            hashMap.put("isEnrolled", Boolean.valueOf(z));
            int i = this.f11281j;
            if (i == 0) {
                this.f11277f.mo109647a(this.f11278g, this.f11279h.mo115112m("ok", hashMap));
            } else if (i == -1) {
                this.f11277f.mo109647a(this.f11278g, this.f11279h.mo115112m("fail not support", hashMap));
            } else if (i == 1) {
                this.f11277f.mo109647a(this.f11278g, this.f11279h.mo115112m("ok", hashMap));
            } else {
                this.f11277f.mo109647a(this.f11278g, this.f11279h.mo115112m("fail unknown error", hashMap));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            GetIsEnrolledEvent getIsEnrolledEvent = new GetIsEnrolledEvent();
            getIsEnrolledEvent.f48096d.f48098a = this.f11280i;
            getIsEnrolledEvent.publish();
            int i = getIsEnrolledEvent.f48097e.f48099a;
            this.f11281j = i;
            Log.m105925i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", Integer.valueOf(i));
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11281j);
            parcel.writeInt(this.f11280i);
        }

        public GetIsEnrolledTask(Parcel parcel) {
            this.f11277f = null;
            this.f11278g = -1;
            this.f11280i = -1;
            this.f11281j = -1;
            mo1551g(parcel);
        }
    }
}
