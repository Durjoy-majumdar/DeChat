package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p237sp.C13754y;
import p237sp.C48456t;
import p749xh.C53352w2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask */
public class JsApiResumeDownloadTask extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 444;
    public static final String NAME = "resumeDownloadTask";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        new ResumeDownloadTask(this, (C81925i2) fVar, i, jSONObject).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask$ResumeDownloadTask */
    public static class ResumeDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<ResumeDownloadTask> CREATOR = new C1571a();

        /* renamed from: f */
        public C82870p f11027f;

        /* renamed from: g */
        public C81925i2 f11028g;

        /* renamed from: h */
        public int f11029h;

        /* renamed from: i */
        public long f11030i;

        /* renamed from: j */
        public boolean f11031j;

        /* renamed from: n */
        public boolean f11032n;

        /* renamed from: o */
        public String f11033o;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask$ResumeDownloadTask$a */
        public class C1571a implements Parcelable.Creator<ResumeDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new ResumeDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new ResumeDownloadTask[i];
            }
        }

        public ResumeDownloadTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11027f = pVar;
            this.f11028g = i2Var;
            this.f11029h = i;
            this.f11030i = jSONObject.optLong("downloadId");
            this.f11031j = jSONObject.optBoolean("downloadInWifi", false);
            this.f11032n = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11030i = parcel.readLong();
            boolean z = false;
            this.f11031j = parcel.readByte() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f11032n = z;
            this.f11033o = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f11032n) {
                if (Util.isNullOrNil(this.f11033o)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f11033o});
                }
                this.f11028g.mo109647a(this.f11029h, this.f11027f.mo115109j(str));
                return;
            }
            this.f11028g.mo109647a(this.f11029h, this.f11027f.mo115109j("ok"));
        }

        /* renamed from: j */
        public void mo1553j() {
            boolean z;
            Class cls = C48456t.class;
            Log.m105925i("MicroMsg.JsApiResumeDownloadTask", "doQueryDownloadTask, downloadId = %d", Long.valueOf(this.f11030i));
            if (this.f11030i <= 0) {
                this.f11033o = "downloadId invalid";
            } else {
                C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(this.f11030i);
                if (!(nh == null || nh.field_downloadInWifi == (z = this.f11031j))) {
                    nh.field_downloadInWifi = z;
                    ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
                }
                this.f11032n = !((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63972t(this.f11030i);
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11030i);
            parcel.writeByte(this.f11031j ? (byte) 1 : 0);
            parcel.writeInt(this.f11032n ? 1 : 0);
            parcel.writeString(this.f11033o);
        }

        public ResumeDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
