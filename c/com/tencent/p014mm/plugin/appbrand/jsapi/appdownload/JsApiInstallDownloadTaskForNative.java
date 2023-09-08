package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import org.json.JSONObject;
import p237sp.C13749o;
import p237sp.C48456t;
import p749xh.C53352w2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative */
public class JsApiInstallDownloadTaskForNative extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 658;
    public static final String NAME = "installDownloadTaskForNative";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        new InstallDownloadTask(this, fVar, i, jSONObject).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative$InstallDownloadTask */
    public static class InstallDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<InstallDownloadTask> CREATOR = new C40446a();

        /* renamed from: f */
        public C82870p f108711f;

        /* renamed from: g */
        public C82381f f108712g;

        /* renamed from: h */
        public int f108713h;

        /* renamed from: i */
        public long f108714i;

        /* renamed from: j */
        public String f108715j;

        /* renamed from: n */
        public boolean f108716n;

        /* renamed from: o */
        public String f108717o;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative$InstallDownloadTask$a */
        public class C40446a implements Parcelable.Creator<InstallDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new InstallDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new InstallDownloadTask[i];
            }
        }

        public InstallDownloadTask(C82870p pVar, C82381f fVar, int i, JSONObject jSONObject) {
            this.f108711f = pVar;
            this.f108712g = fVar;
            this.f108713h = i;
            this.f108714i = jSONObject.optLong("downloadId");
            this.f108715j = jSONObject.optString("appId");
            this.f108716n = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f108714i = parcel.readLong();
            this.f108715j = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f108716n = z;
            this.f108717o = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f108716n) {
                if (Util.isNullOrNil(this.f108717o)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f108717o});
                }
                this.f108712g.mo109647a(this.f108713h, this.f108711f.mo115109j(str));
                return;
            }
            this.f108712g.mo109647a(this.f108713h, this.f108711f.mo115109j("ok"));
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C13749o.class;
            Class cls2 = C48456t.class;
            Log.m105925i("MicroMsg.JsApiInstallDownloadTaskForNative", "doInstallDownloadTask, downloadId = %d", Long.valueOf(this.f108714i));
            if (!Util.isNullOrNil(this.f108715j)) {
                C53352w2 IX = ((C48456t) C86312j.m106911c(cls2)).mo72822IX(this.f108715j);
                if (IX != null && IX.field_status == 3 && C86013q1.m106450k(IX.field_filePath)) {
                    ((C13749o) C86312j.m106911c(cls)).gt0(IX.field_downloadId, false, new C40451m(this));
                }
            } else {
                C53352w2 nh = ((C48456t) C86312j.m106911c(cls2)).mo72824nh(this.f108714i);
                if (nh != null && nh.field_status == 3 && C86013q1.m106450k(nh.field_filePath)) {
                    ((C13749o) C86312j.m106911c(cls)).gt0(nh.field_downloadId, false, new C40452n(this));
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f108714i);
            parcel.writeString(this.f108715j);
            parcel.writeInt(this.f108716n ? 1 : 0);
            parcel.writeString(this.f108717o);
        }

        public InstallDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
