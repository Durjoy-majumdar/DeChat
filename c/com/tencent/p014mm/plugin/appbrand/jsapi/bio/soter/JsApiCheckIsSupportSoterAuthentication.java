package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.GetIsSupportSoterEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication */
public class JsApiCheckIsSupportSoterAuthentication extends C82268c {
    public static final int CTRL_INDEX = 276;
    public static final String NAME = "checkIsSupportSoterAuthentication";

    /* renamed from: g */
    public GetIsSupportSoterTask f11282g = null;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiCheckIsSupportSoterAuthentication", "hy: subapp start do check is support soter authentication");
        this.f11282g = new GetIsSupportSoterTask(fVar, i, this);
        this.f11282g.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask */
    public static class GetIsSupportSoterTask extends MainProcessTask {
        public static final Parcelable.Creator<GetIsSupportSoterTask> CREATOR = new C1647a();

        /* renamed from: f */
        public C82381f f11283f;

        /* renamed from: g */
        public int f11284g;

        /* renamed from: h */
        public JsApiCheckIsSupportSoterAuthentication f11285h;

        /* renamed from: i */
        public int f11286i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask$a */
        public class C1647a implements Parcelable.Creator<GetIsSupportSoterTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetIsSupportSoterTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetIsSupportSoterTask[i];
            }
        }

        public GetIsSupportSoterTask(C82381f fVar, int i, JsApiCheckIsSupportSoterAuthentication jsApiCheckIsSupportSoterAuthentication) {
            this.f11286i = 0;
            this.f11283f = fVar;
            this.f11284g = i;
            this.f11285h = jsApiCheckIsSupportSoterAuthentication;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11286i = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            Log.m105919d("MicroMsg.GetIsSupportSoterTask", "hy: callback. supportMode: %d", Integer.valueOf(this.f11286i));
            HashMap hashMap = new HashMap(2);
            hashMap.put("supportMode", C1648a.m1701b(this.f11286i));
            this.f11283f.mo109647a(this.f11284g, this.f11285h.mo115112m("ok", hashMap));
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            GetIsSupportSoterEvent getIsSupportSoterEvent = new GetIsSupportSoterEvent();
            getIsSupportSoterEvent.publish();
            int i = getIsSupportSoterEvent.f9299d.f9300a;
            this.f11286i = i;
            Log.m105925i("MicroMsg.GetIsSupportSoterTask", "hy: supportMode: %d", Integer.valueOf(i));
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11286i);
        }

        public GetIsSupportSoterTask(Parcel parcel) {
            this.f11283f = null;
            this.f11284g = -1;
            this.f11286i = 0;
            this.f11286i = parcel.readInt();
        }
    }
}
