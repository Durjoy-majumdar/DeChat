package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONObject;
import p1070zf.C91680c;
import te3.C49713hj2;
import te3.C50416mk2;
import te3.C50558nk2;
import te3.w55;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession */
public class JsApiRefreshSession extends C82268c {
    private static final int CTRL_INDEX = 118;
    private static final String NAME = "refreshSession";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask */
    public static class RefreshSessionTask extends MainProcessTask {
        public static final Parcelable.Creator<RefreshSessionTask> CREATOR = new C40441b();

        /* renamed from: f */
        public C82870p f108678f;

        /* renamed from: g */
        public C82381f f108679g;

        /* renamed from: h */
        public int f108680h;

        /* renamed from: i */
        public String f108681i;

        /* renamed from: j */
        public int f108682j;

        /* renamed from: n */
        public int f108683n;

        /* renamed from: o */
        public int f108684o;

        /* renamed from: p */
        public int f108685p;

        /* renamed from: q */
        public int f108686q;

        /* renamed from: r */
        public String f108687r;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask$a */
        public class C40440a implements l0$$e {
            public C40440a() {
            }

            /* renamed from: a */
            public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
                C49713hj2 hj22;
                Log.m105919d("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 0 && i2 == 0) {
                    C50558nk2 nk22 = (C50558nk2) cVar.f127056b.f127083a;
                    if (nk22 == null || (hj22 = nk22.f138640d) == null) {
                        RefreshSessionTask.this.f108684o = 0;
                        Log.m105920e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest failed, response is null!");
                        RefreshSessionTask.this.mo114394b();
                    } else {
                        RefreshSessionTask refreshSessionTask = RefreshSessionTask.this;
                        int i3 = hj22.f134688d;
                        refreshSessionTask.f108683n = i3;
                        refreshSessionTask.f108687r = hj22.f134689e;
                        if (i3 == 0) {
                            refreshSessionTask.f108682j = nk22.f138641e;
                            refreshSessionTask.f108683n = i3;
                            refreshSessionTask.f108684o = 1;
                            refreshSessionTask.mo114394b();
                        } else {
                            refreshSessionTask.f108683n = i3;
                            refreshSessionTask.f108684o = 2;
                            Log.m105921e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest ERROR %s", str);
                            RefreshSessionTask.this.mo114394b();
                        }
                    }
                    return 0;
                }
                RefreshSessionTask refreshSessionTask2 = RefreshSessionTask.this;
                refreshSessionTask2.f108684o = 0;
                refreshSessionTask2.f108687r = "cgi fail";
                refreshSessionTask2.mo114394b();
                return 0;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask$b */
        public class C40441b implements Parcelable.Creator<RefreshSessionTask> {
            public Object createFromParcel(Parcel parcel) {
                return new RefreshSessionTask(parcel);
            }

            public Object[] newArray(int i) {
                return new RefreshSessionTask[i];
            }
        }

        public RefreshSessionTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f108682j = parcel.readInt();
            this.f108683n = parcel.readInt();
            this.f108684o = parcel.readInt();
            this.f108680h = parcel.readInt();
            this.f108681i = parcel.readString();
            this.f108685p = parcel.readInt();
            this.f108686q = parcel.readInt();
            this.f108687r = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            HashMap hashMap = new HashMap();
            int i = this.f108684o;
            if (i != 1) {
                String str = "fail";
                if (i != 2) {
                    if (!Util.isNullOrNil(this.f108687r)) {
                        str = String.format("fail:%s", new Object[]{this.f108687r});
                    }
                    hashMap.put("errCode", "-1");
                    this.f108679g.mo109647a(this.f108680h, this.f108678f.mo115112m(str, hashMap));
                } else {
                    if (!Util.isNullOrNil(this.f108687r)) {
                        str = String.format("fail:%s", new Object[]{this.f108687r});
                    }
                    hashMap.put("errCode", this.f108683n + "");
                    this.f108679g.mo109647a(this.f108680h, this.f108678f.mo115112m(str, hashMap));
                }
            } else {
                hashMap.put("expireIn", this.f108682j + "");
                hashMap.put("errCode", this.f108683n + "");
                this.f108679g.mo109647a(this.f108680h, this.f108678f.mo115112m("ok", hashMap));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C50416mk2();
            bVar.f127067b = new C50558nk2();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/js-refreshsession";
            bVar.f127069d = C91680c.CTRL_INDEX;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C50416mk2 mk22 = new C50416mk2();
            mk22.f138083d = this.f108681i;
            mk22.f138084e = this.f108685p;
            bVar.f127066a = mk22;
            if (this.f108686q > 0) {
                w55 w55 = new w55();
                mk22.f138085f = w55;
                w55.f143869e = this.f108686q;
            }
            Log.m105925i("MicroMsg.JsApiRefreshSession", "refreshSession appId %s, versionType, statScene %d", this.f108681i, Integer.valueOf(this.f108685p), Integer.valueOf(this.f108686q));
            C89144l0.m111429e(bVar.mo72403a(), new C40440a(), true);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f108682j);
            parcel.writeInt(this.f108683n);
            parcel.writeInt(this.f108684o);
            parcel.writeInt(this.f108680h);
            parcel.writeString(this.f108681i);
            parcel.writeInt(this.f108685p);
            parcel.writeInt(this.f108686q);
            parcel.writeString(this.f108687r);
        }

        public RefreshSessionTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        RefreshSessionTask refreshSessionTask = new RefreshSessionTask();
        C90988l lVar = (C90988l) fVar.mo109671p(C90988l.class);
        if (lVar != null) {
            refreshSessionTask.f108685p = lVar.f261072r.f238585d;
        }
        String appId = fVar.getAppId();
        refreshSessionTask.f108678f = this;
        refreshSessionTask.f108679g = fVar;
        refreshSessionTask.f108680h = i;
        refreshSessionTask.f108681i = appId;
        AppBrandStatObject d = C81682d.m100224d(appId);
        if (d != null) {
            refreshSessionTask.f108686q = d.f245533f;
        }
        refreshSessionTask.mo114395c();
    }
}
