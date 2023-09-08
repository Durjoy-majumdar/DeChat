package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C88267e;
import org.json.JSONObject;
import p237sp.C13754y;
import p237sp.C48456t;
import p749xh.C53352w2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTaskForNative */
public class JsApiPauseDownloadTaskForNative extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 659;
    public static final String NAME = "pauseDownloadTaskForNative";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        new PauseDownloadTask(this, (C88267e) fVar, i, jSONObject).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTaskForNative$PauseDownloadTask */
    public static class PauseDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<PauseDownloadTask> CREATOR = new C1599a();

        /* renamed from: f */
        public C82870p f11174f;

        /* renamed from: g */
        public C81925i2 f11175g;

        /* renamed from: h */
        public int f11176h;

        /* renamed from: i */
        public long f11177i;

        /* renamed from: j */
        public boolean f11178j;

        /* renamed from: n */
        public String f11179n;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTaskForNative$PauseDownloadTask$a */
        public class C1599a implements Parcelable.Creator<PauseDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new PauseDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new PauseDownloadTask[i];
            }
        }

        public PauseDownloadTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11174f = pVar;
            this.f11175g = i2Var;
            this.f11176h = i;
            this.f11177i = jSONObject.optLong("downloadId");
            this.f11178j = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11177i = parcel.readLong();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f11178j = z;
            this.f11179n = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f11178j) {
                if (Util.isNullOrNil(this.f11179n)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f11179n});
                }
                this.f11175g.mo109647a(this.f11176h, this.f11174f.mo115109j(str));
                return;
            }
            this.f11175g.mo109647a(this.f11176h, this.f11174f.mo115109j("ok"));
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C48456t.class;
            Log.m105925i("MicroMsg.JsApiPauseDownloadTaskForNative", "doPauseDownloadTask, downloadId = %d", Long.valueOf(this.f11177i));
            if (this.f11177i <= 0) {
                this.f11179n = "downloadId invalid";
            } else {
                C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(this.f11177i);
                if (nh == null) {
                    this.f11179n = "downloadId invalid";
                } else {
                    if (nh.field_downloadInWifi) {
                        nh.field_downloadInWifi = false;
                        ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
                    }
                    this.f11178j = !((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63965m(this.f11177i);
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11177i);
            parcel.writeInt(this.f11178j ? 1 : 0);
            parcel.writeString(this.f11179n);
        }

        public PauseDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
