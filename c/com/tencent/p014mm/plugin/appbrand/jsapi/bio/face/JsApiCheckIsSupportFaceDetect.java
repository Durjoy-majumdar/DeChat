package com.tencent.p014mm.plugin.appbrand.jsapi.bio.face;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.GetIsSupportFaceEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect */
public class JsApiCheckIsSupportFaceDetect extends C82268c {
    public static final int CTRL_INDEX = 214;
    public static final String NAME = "checkIsSupportFacialRecognition";

    /* renamed from: g */
    public GetIsSupportFaceTask f11258g = null;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiCheckIsSupportFaceDetect", "hy: subapp start do check is support face detect");
        this.f11258g = new GetIsSupportFaceTask(fVar, i, this);
        this.f11258g.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask */
    public static class GetIsSupportFaceTask extends MainProcessTask {
        public static final Parcelable.Creator<GetIsSupportFaceTask> CREATOR = new C1637a();

        /* renamed from: f */
        public C82381f f11259f;

        /* renamed from: g */
        public int f11260g;

        /* renamed from: h */
        public JsApiCheckIsSupportFaceDetect f11261h;

        /* renamed from: i */
        public boolean f11262i;

        /* renamed from: j */
        public int f11263j;

        /* renamed from: n */
        public String f11264n;

        /* renamed from: o */
        public int f11265o;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask$a */
        public class C1637a implements Parcelable.Creator<GetIsSupportFaceTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetIsSupportFaceTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetIsSupportFaceTask[i];
            }
        }

        public GetIsSupportFaceTask(C82381f fVar, int i, JsApiCheckIsSupportFaceDetect jsApiCheckIsSupportFaceDetect) {
            this.f11262i = false;
            this.f11263j = -1;
            this.f11264n = "not returned";
            this.f11265o = -1;
            this.f11259f = fVar;
            this.f11260g = i;
            this.f11261h = jsApiCheckIsSupportFaceDetect;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11262i = parcel.readByte() != 0;
            this.f11263j = parcel.readInt();
            this.f11264n = parcel.readString();
            this.f11265o = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            Log.m105919d("MicroMsg.GetIsSupportFaceTask", "hy: callback. isSupport: %b, errCode: %d, errMsg: %s, libVersion: %d", Boolean.valueOf(this.f11262i), Integer.valueOf(this.f11263j), this.f11264n, Integer.valueOf(this.f11265o));
            HashMap hashMap = new HashMap(3);
            hashMap.put("errCode", Integer.valueOf(this.f11263j));
            hashMap.put("libVersionCode", Integer.valueOf(this.f11265o));
            if (this.f11263j == 0) {
                this.f11259f.mo109647a(this.f11260g, this.f11261h.mo115112m("ok", hashMap));
            } else {
                C82381f fVar = this.f11259f;
                int i = this.f11260g;
                JsApiCheckIsSupportFaceDetect jsApiCheckIsSupportFaceDetect = this.f11261h;
                fVar.mo109647a(i, jsApiCheckIsSupportFaceDetect.mo115112m("fail " + this.f11264n, hashMap));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            GetIsSupportFaceEvent getIsSupportFaceEvent = new GetIsSupportFaceEvent();
            getIsSupportFaceEvent.publish();
            GetIsSupportFaceEvent.C1079a aVar = getIsSupportFaceEvent.f9294d;
            boolean z = aVar.f9295a;
            this.f11262i = z;
            this.f11263j = aVar.f9296b;
            this.f11264n = aVar.f9297c;
            this.f11265o = aVar.f9298d;
            Log.m105925i("MicroMsg.GetIsSupportFaceTask", "hy: is support: %b, errCode: %d, errMsg: %s, ilbVersion: %d", Boolean.valueOf(z), Integer.valueOf(this.f11263j), this.f11264n, Integer.valueOf(this.f11265o));
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f11262i ? (byte) 1 : 0);
            parcel.writeInt(this.f11263j);
            parcel.writeString(this.f11264n);
            parcel.writeInt(this.f11265o);
        }

        public GetIsSupportFaceTask(Parcel parcel) {
            this.f11259f = null;
            this.f11260g = -1;
            this.f11262i = false;
            this.f11263j = -1;
            this.f11264n = "not returned";
            this.f11265o = -1;
            mo1551g(parcel);
        }
    }
}
