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

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight */
public class JsApiAddDownloadTaskStraight extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 440;
    public static final String NAME = "addDownloadTaskStraight";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        new AddDownloadTaskStraightTask(this, i2Var, i, jSONObject).mo114395c();
        C1605d.m1646t(i2Var);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask */
    public static class AddDownloadTaskStraightTask extends MainProcessTask {
        public static final Parcelable.Creator<AddDownloadTaskStraightTask> CREATOR = new C1591a();

        /* renamed from: f */
        public C82870p f11113f;

        /* renamed from: g */
        public C81925i2 f11114g;

        /* renamed from: h */
        public int f11115h;

        /* renamed from: i */
        public String f11116i;

        /* renamed from: j */
        public String f11117j;

        /* renamed from: n */
        public String f11118n;

        /* renamed from: o */
        public String f11119o;

        /* renamed from: p */
        public long f11120p;

        /* renamed from: q */
        public String f11121q;

        /* renamed from: r */
        public String f11122r;

        /* renamed from: s */
        public String f11123s;

        /* renamed from: t */
        public String f11124t;

        /* renamed from: u */
        public boolean f11125u;

        /* renamed from: v */
        public String f11126v;

        /* renamed from: w */
        public long f11127w;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask$a */
        public class C1591a implements Parcelable.Creator<AddDownloadTaskStraightTask> {
            public Object createFromParcel(Parcel parcel) {
                return new AddDownloadTaskStraightTask(parcel);
            }

            public Object[] newArray(int i) {
                return new AddDownloadTaskStraightTask[i];
            }
        }

        public AddDownloadTaskStraightTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11113f = pVar;
            this.f11114g = i2Var;
            this.f11115h = i;
            this.f11116i = jSONObject.optString("taskName");
            this.f11117j = jSONObject.optString("taskUrl");
            this.f11118n = jSONObject.optString("fileMd5");
            this.f11119o = jSONObject.optString("alternativeUrl");
            this.f11120p = (long) jSONObject.optInt("taskSize", 0);
            this.f11121q = jSONObject.optString("extInfo");
            this.f11122r = jSONObject.optString("fileType");
            this.f11123s = i2Var.getAppId();
            this.f11124t = jSONObject.optString("packageName");
            this.f11125u = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11116i = parcel.readString();
            this.f11117j = parcel.readString();
            this.f11118n = parcel.readString();
            this.f11119o = parcel.readString();
            this.f11120p = parcel.readLong();
            this.f11121q = parcel.readString();
            this.f11122r = parcel.readString();
            this.f11123s = parcel.readString();
            this.f11124t = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f11125u = z;
            this.f11126v = parcel.readString();
            this.f11127w = parcel.readLong();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f11125u) {
                if (Util.isNullOrNil(this.f11126v)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f11126v});
                }
                this.f11114g.mo109647a(this.f11115h, this.f11113f.mo115109j(str));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("downloadId", Long.valueOf(this.f11127w));
                this.f11114g.mo109647a(this.f11115h, this.f11113f.mo115112m("ok", hashMap));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                this.f11126v = "fail_sdcard_not_ready";
            } else {
                long j = this.f11120p;
                if (j > 0 && !C88955f.m111059c(j)) {
                    this.f11126v = "fail_sdcard_has_not_enough_space";
                } else if (Util.isNullOrNil(this.f11117j)) {
                    this.f11126v = "fail_invalid_url";
                } else {
                    Log.m105925i("MicroMsg.JsApiAddDownloadTaskStraight", "runInMainProcess taskUrl:%s md5:%s", this.f11117j, this.f11118n);
                    C40939n nVar = new C40939n((C40939n.C2206a) null);
                    nVar.f110176a = this.f11117j;
                    nVar.f110177b = this.f11119o;
                    nVar.f110178c = this.f11120p;
                    nVar.f110179d = this.f11116i;
                    nVar.f110180e = this.f11118n;
                    nVar.f110182g = this.f11123s;
                    nVar.f110183h = this.f11124t;
                    nVar.f110184i = true;
                    nVar.f110181f = Util.getInt(this.f11122r, 1);
                    nVar.f110187l = TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;
                    nVar.f110192q = this.f11121q;
                    long b = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar);
                    Log.m105924i("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight, downloadId = " + b);
                    if (b <= 0) {
                        Log.m105920e("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight fail, downloadId = " + b);
                        this.f11126v = "";
                    } else {
                        this.f11125u = false;
                        this.f11127w = b;
                    }
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11116i);
            parcel.writeString(this.f11117j);
            parcel.writeString(this.f11118n);
            parcel.writeString(this.f11119o);
            parcel.writeLong(this.f11120p);
            parcel.writeString(this.f11121q);
            parcel.writeString(this.f11122r);
            parcel.writeString(this.f11123s);
            parcel.writeString(this.f11124t);
            parcel.writeInt(this.f11125u ? 1 : 0);
            parcel.writeString(this.f11126v);
            parcel.writeLong(this.f11127w);
        }

        public AddDownloadTaskStraightTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
