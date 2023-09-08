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
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import org.json.JSONObject;
import p206nj.C88955f;
import p237sp.C13747c0;
import p237sp.C13754y;
import p680ru.C77570i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative */
public class JsApiAddDownloadTaskForNative extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 655;
    public static final String NAME = "addDownloadTaskForNative";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        new AddDownloadTask(this, i2Var, i, jSONObject).mo114395c();
        C1606e.m1647t(i2Var);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative$AddDownloadTask */
    public static class AddDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<AddDownloadTask> CREATOR = new C1590a();

        /* renamed from: A */
        public String f11093A;

        /* renamed from: B */
        public long f11094B;

        /* renamed from: f */
        public C82870p f11095f;

        /* renamed from: g */
        public C81925i2 f11096g;

        /* renamed from: h */
        public int f11097h;

        /* renamed from: i */
        public JSONObject f11098i;

        /* renamed from: j */
        public String f11099j;

        /* renamed from: n */
        public String f11100n;

        /* renamed from: o */
        public String f11101o;

        /* renamed from: p */
        public long f11102p;

        /* renamed from: q */
        public String f11103q;

        /* renamed from: r */
        public String f11104r;

        /* renamed from: s */
        public String f11105s;

        /* renamed from: t */
        public String f11106t;

        /* renamed from: u */
        public boolean f11107u;

        /* renamed from: v */
        public int f11108v;

        /* renamed from: w */
        public int f11109w;

        /* renamed from: x */
        public boolean f11110x;

        /* renamed from: y */
        public String f11111y;

        /* renamed from: z */
        public boolean f11112z;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative$AddDownloadTask$a */
        public class C1590a implements Parcelable.Creator<AddDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new AddDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new AddDownloadTask[i];
            }
        }

        public AddDownloadTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11095f = pVar;
            this.f11096g = i2Var;
            this.f11097h = i;
            this.f11098i = jSONObject;
            this.f11099j = jSONObject.optString("taskName");
            this.f11100n = jSONObject.optString("taskUrl");
            this.f11101o = jSONObject.optString("fileMd5");
            this.f11102p = (long) jSONObject.optInt("taskSize", 0);
            this.f11103q = jSONObject.optString("extInfo");
            this.f11104r = jSONObject.optString("fileType");
            this.f11105s = jSONObject.optString("appId");
            this.f11106t = jSONObject.optString("packageName");
            this.f11107u = jSONObject.optBoolean("downloadInWifi", false);
            this.f11108v = jSONObject.optInt("downloaderType", 0);
            this.f11110x = jSONObject.optBoolean("useDownloaderWidget", false);
            this.f11109w = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
            this.f11111y = jSONObject.optString("alterUrl");
            this.f11112z = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11099j = parcel.readString();
            this.f11100n = parcel.readString();
            this.f11101o = parcel.readString();
            this.f11102p = parcel.readLong();
            this.f11103q = parcel.readString();
            this.f11104r = parcel.readString();
            this.f11105s = parcel.readString();
            this.f11106t = parcel.readString();
            boolean z = false;
            this.f11107u = parcel.readInt() == 1;
            this.f11108v = parcel.readInt();
            this.f11112z = parcel.readInt() == 1;
            this.f11093A = parcel.readString();
            this.f11094B = parcel.readLong();
            this.f11109w = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f11110x = z;
            try {
                this.f11098i = new JSONObject(parcel.readString());
            } catch (Exception e) {
                Log.m105918d("MicroMsg.JsApiAddDownloadTaskForNative", e.getMessage());
            }
            this.f11111y = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            mo114397h();
            if (this.f11112z) {
                if (Util.isNullOrNil(this.f11093A)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f11093A});
                }
                this.f11096g.mo109647a(this.f11097h, this.f11095f.mo115109j(str));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("downloadId", Long.valueOf(this.f11094B));
            this.f11096g.mo109647a(this.f11097h, this.f11095f.mo115112m("ok", hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C13754y.class;
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                this.f11093A = "fail_sdcard_not_ready";
            } else {
                long j = this.f11102p;
                if (j > 0 && !C88955f.m111059c(j)) {
                    this.f11093A = "fail_sdcard_has_not_enough_space";
                } else if (Util.isNullOrNil(this.f11100n)) {
                    this.f11093A = "fail_invalid_url";
                } else if (this.f11110x) {
                    ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13114ky(MMApplicationContext.getContext(), C40979a.m44407a(this.f11098i), new C1607g(this));
                    ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "JsApiAddDownloadTaskForNative", hashCode());
                } else {
                    Log.m105925i("MicroMsg.JsApiAddDownloadTaskForNative", "runInMainProcess taskUrl:%s md5:%s", this.f11100n, this.f11101o);
                    C40939n nVar = new C40939n((C40939n.C2206a) null);
                    nVar.f110176a = this.f11100n;
                    nVar.f110178c = this.f11102p;
                    nVar.f110179d = this.f11099j;
                    nVar.f110180e = this.f11101o;
                    nVar.f110182g = this.f11105s;
                    nVar.f110183h = this.f11106t;
                    nVar.f110184i = true;
                    nVar.f110181f = Util.getInt(this.f11104r, 1);
                    nVar.f110187l = this.f11109w;
                    nVar.f110192q = this.f11103q;
                    nVar.f110190o = true;
                    nVar.f110177b = this.f11111y;
                    long c = this.f11108v == 1 ? ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63957c(nVar) : ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63956b(nVar);
                    Log.m105924i("MicroMsg.JsApiAddDownloadTaskForNative", "doAddDownloadTaskStraight, downloadId = " + c);
                    if (c <= 0) {
                        Log.m105920e("MicroMsg.JsApiAddDownloadTaskForNative", "doAddDownloadTaskStraight fail, downloadId = " + c);
                        this.f11093A = "";
                    } else {
                        this.f11112z = false;
                        this.f11094B = c;
                    }
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11099j);
            parcel.writeString(this.f11100n);
            parcel.writeString(this.f11101o);
            parcel.writeLong(this.f11102p);
            parcel.writeString(this.f11103q);
            parcel.writeString(this.f11104r);
            parcel.writeString(this.f11105s);
            parcel.writeString(this.f11106t);
            parcel.writeInt(this.f11107u ? 1 : 0);
            parcel.writeInt(this.f11108v);
            parcel.writeInt(this.f11112z ? 1 : 0);
            parcel.writeString(this.f11093A);
            parcel.writeLong(this.f11094B);
            parcel.writeInt(this.f11109w);
            parcel.writeInt(this.f11110x ? 1 : 0);
            JSONObject jSONObject = this.f11098i;
            parcel.writeString(jSONObject != null ? jSONObject.toString() : "");
            parcel.writeString(this.f11111y);
        }

        public AddDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
