package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import org.json.JSONObject;
import p206nj.C88955f;
import p237sp.C13754y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask */
public class JsApiAddDownloadTask extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 474;
    public static final String NAME = "addDownloadTask";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        new AddDownloadTask(this, i2Var, i, jSONObject).mo114395c();
        C1605d.m1646t(i2Var);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask$AddDownloadTask */
    public static class AddDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<AddDownloadTask> CREATOR = new C1589a();

        /* renamed from: f */
        public C82870p f11076f;

        /* renamed from: g */
        public C81925i2 f11077g;

        /* renamed from: h */
        public int f11078h;

        /* renamed from: i */
        public String f11079i;

        /* renamed from: j */
        public String f11080j;

        /* renamed from: n */
        public String f11081n;

        /* renamed from: o */
        public long f11082o;

        /* renamed from: p */
        public String f11083p;

        /* renamed from: q */
        public String f11084q;

        /* renamed from: r */
        public String f11085r;

        /* renamed from: s */
        public String f11086s;

        /* renamed from: t */
        public boolean f11087t;

        /* renamed from: u */
        public boolean f11088u;

        /* renamed from: v */
        public int f11089v;

        /* renamed from: w */
        public boolean f11090w;

        /* renamed from: x */
        public String f11091x;

        /* renamed from: y */
        public long f11092y;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask$AddDownloadTask$a */
        public class C1589a implements Parcelable.Creator<AddDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new AddDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new AddDownloadTask[i];
            }
        }

        public AddDownloadTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11076f = pVar;
            this.f11077g = i2Var;
            this.f11078h = i;
            this.f11079i = jSONObject.optString("taskName");
            this.f11080j = jSONObject.optString("taskUrl");
            this.f11081n = jSONObject.optString("fileMd5");
            this.f11082o = (long) jSONObject.optInt("taskSize", 0);
            this.f11083p = jSONObject.optString("extInfo");
            this.f11084q = jSONObject.optString("fileType");
            this.f11085r = jSONObject.optString("appId");
            this.f11086s = jSONObject.optString("packageName");
            this.f11087t = jSONObject.optBoolean("downloadInWifi", false);
            this.f11088u = jSONObject.optBoolean("showNotification", false);
            this.f11089v = jSONObject.optInt("downloaderType", 0);
            this.f11090w = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11079i = parcel.readString();
            this.f11080j = parcel.readString();
            this.f11081n = parcel.readString();
            this.f11082o = parcel.readLong();
            this.f11083p = parcel.readString();
            this.f11084q = parcel.readString();
            this.f11085r = parcel.readString();
            this.f11086s = parcel.readString();
            boolean z = false;
            this.f11087t = parcel.readByte() == 1;
            this.f11088u = parcel.readByte() == 1;
            this.f11089v = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f11090w = z;
            this.f11091x = parcel.readString();
            this.f11092y = parcel.readLong();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            mo114397h();
            if (this.f11090w) {
                if (Util.isNullOrNil(this.f11091x)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f11091x});
                }
                this.f11077g.mo109647a(this.f11078h, this.f11076f.mo115109j(str));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("downloadId", Long.valueOf(this.f11092y));
            this.f11077g.mo109647a(this.f11078h, this.f11076f.mo115112m("ok", hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C13754y.class;
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                this.f11091x = "fail_sdcard_not_ready";
            } else {
                long j = this.f11082o;
                if (j > 0 && !C88955f.m111059c(j)) {
                    this.f11091x = "fail_sdcard_has_not_enough_space";
                } else if (Util.isNullOrNil(this.f11080j)) {
                    this.f11091x = "fail_invalid_url";
                } else {
                    Log.m105925i("MicroMsg.JsApiAddDownloadTask", "runInMainProcess taskUrl:%s md5:%s", this.f11080j, this.f11081n);
                    C40939n nVar = new C40939n((C40939n.C2206a) null);
                    nVar.f110176a = this.f11080j;
                    nVar.f110178c = this.f11082o;
                    nVar.f110179d = this.f11079i;
                    nVar.f110180e = this.f11081n;
                    nVar.f110182g = this.f11085r;
                    nVar.f110183h = this.f11086s;
                    nVar.f110184i = true;
                    nVar.f110181f = Util.getInt(this.f11084q, 1);
                    nVar.f110187l = TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;
                    nVar.f110192q = this.f11083p;
                    nVar.f110185j = this.f11088u;
                    nVar.f110189n = this.f11087t;
                    nVar.f110184i = false;
                    nVar.f110190o = true;
                    long c = this.f11089v == 1 ? ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63957c(nVar) : ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63956b(nVar);
                    Log.m105924i("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight, downloadId = " + c);
                    if (c <= 0) {
                        Log.m105920e("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight fail, downloadId = " + c);
                        this.f11091x = "";
                    } else {
                        this.f11090w = false;
                        this.f11092y = c;
                    }
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11079i);
            parcel.writeString(this.f11080j);
            parcel.writeString(this.f11081n);
            parcel.writeLong(this.f11082o);
            parcel.writeString(this.f11083p);
            parcel.writeString(this.f11084q);
            parcel.writeString(this.f11085r);
            parcel.writeString(this.f11086s);
            parcel.writeByte(this.f11087t ? (byte) 1 : 0);
            parcel.writeByte(this.f11088u ? (byte) 1 : 0);
            parcel.writeInt(this.f11089v);
            parcel.writeInt(this.f11090w ? 1 : 0);
            parcel.writeString(this.f11091x);
            parcel.writeLong(this.f11092y);
        }

        public AddDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
