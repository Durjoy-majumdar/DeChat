package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13754y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask */
public class JsApiQueryDownloadTask extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 441;
    public static final String NAME = "queryDownloadTask";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105918d("MicroMsg.JsApiQueryDownloadTask", "invoke");
        new QueryDownloadTask(this, i2Var, i, jSONObject).mo114395c();
        C1605d.m1646t(i2Var);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask$QueryDownloadTask */
    public static class QueryDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<QueryDownloadTask> CREATOR = new C1600a();

        /* renamed from: f */
        public C82870p f11180f;

        /* renamed from: g */
        public C81925i2 f11181g;

        /* renamed from: h */
        public int f11182h;

        /* renamed from: i */
        public long f11183i;

        /* renamed from: j */
        public JSONArray f11184j;

        /* renamed from: n */
        public JSONArray f11185n;

        /* renamed from: o */
        public JSONArray f11186o;

        /* renamed from: p */
        public boolean f11187p;

        /* renamed from: q */
        public String f11188q;

        /* renamed from: r */
        public String f11189r;

        /* renamed from: s */
        public long f11190s;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask$QueryDownloadTask$a */
        public class C1600a implements Parcelable.Creator<QueryDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new QueryDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new QueryDownloadTask[i];
            }
        }

        public QueryDownloadTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11180f = pVar;
            this.f11181g = i2Var;
            this.f11182h = i;
            this.f11183i = jSONObject.optLong("downloadId");
            this.f11184j = jSONObject.optJSONArray("downloadIdArray");
            this.f11185n = jSONObject.optJSONArray("appIdArray");
            this.f11187p = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11183i = parcel.readLong();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f11187p = z;
            this.f11188q = parcel.readString();
            this.f11189r = parcel.readString();
            this.f11190s = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (readString != null) {
                try {
                    this.f11184j = new JSONArray(readString);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiQueryDownloadTask", e, "", new Object[0]);
                    return;
                }
            }
            if (readString2 != null) {
                this.f11185n = new JSONArray(readString2);
            }
            if (readString3 != null) {
                this.f11186o = new JSONArray(readString3);
            }
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(this.f11181g == null);
            Log.m105919d("MicroMsg.JsApiQueryDownloadTask", "callback, service is null: %b", objArr);
            if (this.f11187p) {
                this.f11181g.mo109647a(this.f11182h, this.f11180f.mo115109j(Util.isNullOrNil(this.f11188q) ? "fail" : String.format("fail:%s", new Object[]{this.f11188q})));
                return;
            }
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = this.f11186o;
            if (jSONArray != null) {
                hashMap.put("result", jSONArray);
            } else {
                hashMap.put("downloadId", Long.valueOf(this.f11183i));
                hashMap.put("state", this.f11189r);
                hashMap.put("progress", Long.valueOf(this.f11190s));
            }
            this.f11181g.mo109647a(this.f11182h, this.f11180f.mo115112m("ok", hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            int i;
            int i2;
            Class cls = C13754y.class;
            Log.m105925i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, downloadId = %d", Long.valueOf(this.f11183i));
            JSONArray jSONArray = this.f11184j;
            if (jSONArray == null || jSONArray.length() <= 0) {
                JSONArray jSONArray2 = this.f11185n;
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    this.f11186o = new JSONArray();
                    for (int i3 = 0; i3 < this.f11185n.length(); i3++) {
                        String optString = this.f11185n.optString(i3);
                        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(optString);
                        JSONArray jSONArray3 = this.f11186o;
                        JSONObject q = mo1645q(o);
                        try {
                            q.put("appId", optString);
                        } catch (JSONException e) {
                            Log.m105920e("MicroMsg.JsApiQueryDownloadTask", e.getMessage());
                        }
                        jSONArray3.put(q);
                    }
                    this.f11187p = false;
                } else if (this.f11183i <= 0) {
                    this.f11188q = "downloadId invalid";
                } else {
                    FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63966n(this.f11183i);
                    if (!(!n.f12204q || (i2 = n.f12196f) == 1 || i2 == 3)) {
                        this.f11189r = "download_wait_wifi";
                    }
                    int i4 = n.f12196f;
                    if (i4 != -1) {
                        if (i4 == 1) {
                            this.f11189r = "downloading";
                        } else if (i4 == 2) {
                            this.f11189r = "download_pause";
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                this.f11189r = "default";
                            } else {
                                this.f11189r = "download_fail";
                            }
                        } else if (C86013q1.m106450k(n.f12197g)) {
                            this.f11189r = "download_succ";
                        } else {
                            this.f11189r = "default";
                        }
                        Log.m105925i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", this.f11189r);
                        String str = this.f11189r;
                        if (str == "downloading" || str == "download_pause") {
                            long j = n.f12201n;
                            if (j != 0) {
                                this.f11190s = (long) ((((float) n.f12200j) / ((float) j)) * 100.0f);
                            }
                        }
                        if (n.f12204q && !NetStatusUtil.isWifi(MMApplicationContext.getContext()) && (i = n.f12196f) != 3 && i != 1) {
                            this.f11189r = "download_wait_wifi";
                        }
                        this.f11187p = false;
                    } else {
                        this.f11188q = "fail_apilevel_too_low";
                    }
                }
            } else {
                this.f11186o = new JSONArray();
                for (int i5 = 0; i5 < this.f11184j.length(); i5++) {
                    long optLong = this.f11184j.optLong(i5);
                    FileDownloadTaskInfo n2 = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63966n(optLong);
                    JSONArray jSONArray4 = this.f11186o;
                    JSONObject q2 = mo1645q(n2);
                    try {
                        q2.put("downloadId", optLong);
                    } catch (JSONException e2) {
                        Log.m105920e("MicroMsg.JsApiQueryDownloadTask", e2.getMessage());
                    }
                    jSONArray4.put(q2);
                }
                this.f11187p = false;
            }
            mo114394b();
        }

        /* renamed from: q */
        public final JSONObject mo1645q(FileDownloadTaskInfo fileDownloadTaskInfo) {
            int i;
            JSONObject jSONObject = new JSONObject();
            int i2 = fileDownloadTaskInfo.f12196f;
            if (i2 != -1) {
                String str = "default";
                if (i2 == 1) {
                    str = "downloading";
                } else if (i2 == 2) {
                    str = "download_pause";
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        str = "download_fail";
                    }
                } else if (C86013q1.m106450k(fileDownloadTaskInfo.f12197g)) {
                    str = "download_succ";
                }
                Log.m105925i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", str);
                if (fileDownloadTaskInfo.f12204q && !NetStatusUtil.isWifi(MMApplicationContext.getContext()) && (i = fileDownloadTaskInfo.f12196f) != 3 && i != 1) {
                    str = "download_wait_wifi";
                }
                long j = 0;
                if (str == "downloading" || str == "download_pause") {
                    long j2 = fileDownloadTaskInfo.f12201n;
                    if (j2 != 0) {
                        j = (long) ((((float) fileDownloadTaskInfo.f12200j) / ((float) j2)) * 100.0f);
                    }
                }
                try {
                    jSONObject.put("appId", fileDownloadTaskInfo.f12199i);
                    jSONObject.put("downloadId", fileDownloadTaskInfo.f12194d);
                    jSONObject.put("state", str);
                    jSONObject.put("progress", j);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.JsApiQueryDownloadTask", e.getMessage());
                }
                return jSONObject;
            }
            this.f11188q = "fail_apilevel_too_low";
            return jSONObject;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11183i);
            parcel.writeInt(this.f11187p ? 1 : 0);
            parcel.writeString(this.f11188q);
            parcel.writeString(this.f11189r);
            parcel.writeLong(this.f11190s);
            JSONArray jSONArray = this.f11184j;
            String str = null;
            parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
            JSONArray jSONArray2 = this.f11185n;
            parcel.writeString(jSONArray2 != null ? jSONArray2.toString() : null);
            JSONArray jSONArray3 = this.f11186o;
            if (jSONArray3 != null) {
                str = jSONArray3.toString();
            }
            parcel.writeString(str);
        }

        public QueryDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
