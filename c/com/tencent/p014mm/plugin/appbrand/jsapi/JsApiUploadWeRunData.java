package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C31543z5;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONObject;
import te3.mn4;
import te3.nn4;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData */
public class JsApiUploadWeRunData extends C82268c {
    public static final int CTRL_INDEX = 323;
    public static final String NAME = "uploadWeRunData";

    /* renamed from: g */
    public UploadMiniAppStepTask f108689g;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiUploadWeRunData", "JsApiUploadWeRunData!");
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiUploadWeRunData", "data is null");
            return;
        }
        mo63201w(this, fVar, i, jSONObject.optInt(TPReportKeys.Common.COMMON_STEP), false);
    }

    /* renamed from: w */
    public void mo63201w(C82870p pVar, C82381f fVar, int i, int i2, boolean z) {
        if (i2 <= 0) {
            fVar.mo109647a(i, pVar.mo115109j("fail:step invalid"));
            return;
        }
        this.f108689g = new UploadMiniAppStepTask(pVar, fVar, i, i2, z);
        this.f108689g.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask */
    public static class UploadMiniAppStepTask extends MainProcessTask {
        public static final Parcelable.Creator<UploadMiniAppStepTask> CREATOR = new C40443b();

        /* renamed from: f */
        public C82870p f108690f;

        /* renamed from: g */
        public C82381f f108691g;

        /* renamed from: h */
        public int f108692h;

        /* renamed from: i */
        public int f108693i;

        /* renamed from: j */
        public boolean f108694j;

        /* renamed from: n */
        public boolean f108695n;

        /* renamed from: o */
        public String f108696o;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask$a */
        public class C40442a implements l0$$e {
            public C40442a() {
            }

            /* renamed from: a */
            public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
                if (yVar.getType() != 1949) {
                    return 0;
                }
                if (i == 0 && i2 == 0) {
                    UploadMiniAppStepTask.this.f108695n = true;
                    Log.m105918d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask ok.");
                } else {
                    UploadMiniAppStepTask.this.f108695n = false;
                    Log.m105925i("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask fail: errType %d,errCode %d,errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                }
                UploadMiniAppStepTask.this.mo114394b();
                return 0;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask$b */
        public class C40443b implements Parcelable.Creator<UploadMiniAppStepTask> {
            public Object createFromParcel(Parcel parcel) {
                return new UploadMiniAppStepTask(parcel);
            }

            public Object[] newArray(int i) {
                return new UploadMiniAppStepTask[i];
            }
        }

        public UploadMiniAppStepTask(C82870p pVar, C82381f fVar, int i, int i2, boolean z) {
            Log.m105918d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask");
            this.f108690f = pVar;
            this.f108691g = fVar;
            this.f108692h = i;
            this.f108693i = i2;
            this.f108694j = z;
            this.f108696o = fVar.getAppId();
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f108693i = parcel.readInt();
            boolean z = true;
            this.f108694j = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f108695n = z;
            this.f108696o = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f108695n) {
                this.f108691g.mo109647a(this.f108692h, this.f108690f.mo115109j("ok"));
            } else {
                this.f108691g.mo109647a(this.f108692h, this.f108690f.mo115109j("fail"));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            long a = C31543z5.m39451a();
            Log.m105919d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask currentTime %d", Long.valueOf(a / 1000));
            if (a == 0) {
                a = System.currentTimeMillis();
            }
            C47350c.C47352b bVar = new C47350c.C47352b();
            mn4 mn4 = new mn4();
            bVar.f127066a = mn4;
            bVar.f127067b = new nn4();
            bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/uploadminiappstep";
            bVar.f127069d = 1949;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            mn4.f138116d = this.f108696o;
            mn4.f138117e = this.f108693i;
            mn4.f138118f = this.f108694j;
            mn4.f138119g = (int) (a / 1000);
            C89144l0.m111429e(bVar.mo72403a(), new C40442a(), true);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f108693i);
            parcel.writeByte(this.f108694j ? (byte) 1 : 0);
            parcel.writeByte(this.f108695n ? (byte) 1 : 0);
            parcel.writeString(this.f108696o);
        }

        public UploadMiniAppStepTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
