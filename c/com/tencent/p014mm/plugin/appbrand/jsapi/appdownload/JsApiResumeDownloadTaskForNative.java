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
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C13754y;
import p237sp.C48456t;
import p680ru.C77570i;
import p749xh.C53352w2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative */
public class JsApiResumeDownloadTaskForNative extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 660;
    public static final String NAME = "resumeDownloadTaskForNative";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        new ResumeDownloadTask(this, i2Var, i, jSONObject).mo114395c();
        C1606e.m1647t(i2Var);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative$ResumeDownloadTask */
    public static class ResumeDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<ResumeDownloadTask> CREATOR = new C1602a();

        /* renamed from: f */
        public C82870p f11204f;

        /* renamed from: g */
        public C81925i2 f11205g;

        /* renamed from: h */
        public int f11206h;

        /* renamed from: i */
        public long f11207i;

        /* renamed from: j */
        public boolean f11208j;

        /* renamed from: n */
        public boolean f11209n;

        /* renamed from: o */
        public boolean f11210o;

        /* renamed from: p */
        public String f11211p;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative$ResumeDownloadTask$a */
        public class C1602a implements Parcelable.Creator<ResumeDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new ResumeDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new ResumeDownloadTask[i];
            }
        }

        public ResumeDownloadTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11204f = pVar;
            this.f11205g = i2Var;
            this.f11206h = i;
            this.f11207i = jSONObject.optLong("downloadId");
            this.f11209n = jSONObject.optBoolean("useDownloaderWidget", false);
            this.f11208j = jSONObject.optBoolean("downloadInWifi", false);
            this.f11210o = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11207i = parcel.readLong();
            boolean z = false;
            this.f11208j = parcel.readByte() == 1;
            this.f11210o = parcel.readInt() == 1;
            this.f11211p = parcel.readString();
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f11209n = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f11210o) {
                if (Util.isNullOrNil(this.f11211p)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f11211p});
                }
                this.f11205g.mo109647a(this.f11206h, this.f11204f.mo115109j(str));
                return;
            }
            this.f11205g.mo109647a(this.f11206h, this.f11204f.mo115109j("ok"));
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C48456t.class;
            Log.m105925i("MicroMsg.JsApiResumeDownloadTaskForNative", "doQueryDownloadTask, downloadId = %d", Long.valueOf(this.f11207i));
            if (this.f11207i <= 0) {
                this.f11211p = "downloadId invalid";
            } else if (this.f11209n) {
                ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13112em(MMApplicationContext.getContext(), this.f11207i, this.f11208j, false, new C1611q(this));
                ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "JsApiResumeDownloadApp_resumeDownloadTask", hashCode());
            } else {
                C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(this.f11207i);
                if (nh != null) {
                    nh.field_downloadInWifi = false;
                    nh.field_fromDownloadApp = false;
                    nh.field_showNotification = true;
                    ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
                }
                this.f11210o = !((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63972t(this.f11207i);
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11207i);
            parcel.writeByte(this.f11208j ? (byte) 1 : 0);
            parcel.writeInt(this.f11210o ? 1 : 0);
            parcel.writeString(this.f11211p);
            parcel.writeInt(this.f11209n ? 1 : 0);
        }

        public ResumeDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
