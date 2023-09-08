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

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask */
public class JsApiInstallDownloadTask extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 442;
    public static final String NAME = "installDownloadTask";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        new InstallDownloadTask(this, fVar, i, jSONObject).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask$InstallDownloadTask */
    public static class InstallDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<InstallDownloadTask> CREATOR = new C40445a();

        /* renamed from: f */
        public C82870p f108704f;

        /* renamed from: g */
        public C82381f f108705g;

        /* renamed from: h */
        public int f108706h;

        /* renamed from: i */
        public long f108707i;

        /* renamed from: j */
        public String f108708j;

        /* renamed from: n */
        public boolean f108709n;

        /* renamed from: o */
        public String f108710o;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask$InstallDownloadTask$a */
        public class C40445a implements Parcelable.Creator<InstallDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new InstallDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new InstallDownloadTask[i];
            }
        }

        public InstallDownloadTask(C82870p pVar, C82381f fVar, int i, JSONObject jSONObject) {
            this.f108704f = pVar;
            this.f108705g = fVar;
            this.f108706h = i;
            this.f108707i = jSONObject.optLong("downloadId");
            this.f108708j = jSONObject.optString("appId");
            this.f108709n = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f108707i = parcel.readLong();
            this.f108708j = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f108709n = z;
            this.f108710o = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f108709n) {
                if (Util.isNullOrNil(this.f108710o)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f108710o});
                }
                this.f108705g.mo109647a(this.f108706h, this.f108704f.mo115109j(str));
            } else {
                this.f108705g.mo109647a(this.f108706h, this.f108704f.mo115109j("ok"));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C13749o.class;
            Class cls2 = C48456t.class;
            Log.m105925i("MicroMsg.JsApiInstallDownloadTask", "doInstallDownloadTask, downloadId = %d", Long.valueOf(this.f108707i));
            if (!Util.isNullOrNil(this.f108708j)) {
                C53352w2 IX = ((C48456t) C86312j.m106911c(cls2)).mo72822IX(this.f108708j);
                if (IX != null && IX.field_status == 3 && C86013q1.m106450k(IX.field_filePath)) {
                    ((C13749o) C86312j.m106911c(cls)).gt0(IX.field_downloadId, false, new C40449k(this));
                }
            } else {
                C53352w2 nh = ((C48456t) C86312j.m106911c(cls2)).mo72824nh(this.f108707i);
                if (nh != null && nh.field_status == 3 && C86013q1.m106450k(nh.field_filePath)) {
                    ((C13749o) C86312j.m106911c(cls)).gt0(nh.field_downloadId, false, new C40450l(this));
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f108707i);
            parcel.writeString(this.f108708j);
            parcel.writeInt(this.f108709n ? 1 : 0);
            parcel.writeString(this.f108710o);
        }

        public InstallDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
