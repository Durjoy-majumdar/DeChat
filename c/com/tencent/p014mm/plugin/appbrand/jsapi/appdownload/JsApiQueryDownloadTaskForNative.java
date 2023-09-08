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
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13754y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTaskForNative */
public class JsApiQueryDownloadTaskForNative extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 661;
    public static final String NAME = "queryDownloadTaskForNative";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105918d("MicroMsg.JsApiQueryDownloadTaskForNative", "invoke");
        new QueryDownloadTask(this, i2Var, i, jSONObject).mo114395c();
        C1606e.m1647t(i2Var);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTaskForNative$QueryDownloadTask */
    public static class QueryDownloadTask extends MainProcessTask {
        public static final Parcelable.Creator<QueryDownloadTask> CREATOR = new C1601a();

        /* renamed from: f */
        public C82870p f11191f;

        /* renamed from: g */
        public C81925i2 f11192g;

        /* renamed from: h */
        public int f11193h;

        /* renamed from: i */
        public long f11194i;

        /* renamed from: j */
        public JSONArray f11195j;

        /* renamed from: n */
        public JSONArray f11196n;

        /* renamed from: o */
        public JSONArray f11197o;

        /* renamed from: p */
        public boolean f11198p;

        /* renamed from: q */
        public String f11199q;

        /* renamed from: r */
        public String f11200r;

        /* renamed from: s */
        public long f11201s;

        /* renamed from: t */
        public float f11202t;

        /* renamed from: u */
        public boolean f11203u;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTaskForNative$QueryDownloadTask$a */
        public class C1601a implements Parcelable.Creator<QueryDownloadTask> {
            public Object createFromParcel(Parcel parcel) {
                return new QueryDownloadTask(parcel);
            }

            public Object[] newArray(int i) {
                return new QueryDownloadTask[i];
            }
        }

        public QueryDownloadTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f11191f = pVar;
            this.f11192g = i2Var;
            this.f11193h = i;
            this.f11194i = jSONObject.optLong("downloadId");
            this.f11195j = jSONObject.optJSONArray("downloadIdArray");
            this.f11196n = jSONObject.optJSONArray("appIdArray");
            this.f11198p = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11194i = parcel.readLong();
            boolean z = false;
            this.f11198p = parcel.readInt() == 1;
            this.f11199q = parcel.readString();
            this.f11200r = parcel.readString();
            this.f11201s = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (readString != null) {
                try {
                    this.f11195j = new JSONArray(readString);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiQueryDownloadTaskForNative", e, "", new Object[0]);
                }
            }
            if (readString2 != null) {
                this.f11196n = new JSONArray(readString2);
            }
            if (readString3 != null) {
                this.f11197o = new JSONArray(readString3);
            }
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f11203u = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(this.f11192g == null);
            Log.m105919d("MicroMsg.JsApiQueryDownloadTaskForNative", "callback, service is null: %b", objArr);
            if (this.f11198p) {
                this.f11192g.mo109647a(this.f11193h, this.f11191f.mo115109j(Util.isNullOrNil(this.f11199q) ? "fail" : String.format("fail:%s", new Object[]{this.f11199q})));
                return;
            }
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = this.f11197o;
            if (jSONArray != null) {
                hashMap.put("result", jSONArray);
            } else {
                hashMap.put("downloadId", Long.valueOf(this.f11194i));
                hashMap.put("state", this.f11200r);
                hashMap.put("progress", Long.valueOf(this.f11201s));
                hashMap.put("progress_float", Float.valueOf(this.f11202t));
                hashMap.put("reserve_for_wifi", Boolean.valueOf(this.f11203u));
            }
            this.f11192g.mo109647a(this.f11193h, this.f11191f.mo115112m("ok", hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C13754y.class;
            Log.m105925i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, downloadId = %d", Long.valueOf(this.f11194i));
            JSONArray jSONArray = this.f11195j;
            if (jSONArray == null || jSONArray.length() <= 0) {
                JSONArray jSONArray2 = this.f11196n;
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    this.f11197o = new JSONArray();
                    for (int i = 0; i < this.f11196n.length(); i++) {
                        String optString = this.f11196n.optString(i);
                        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(optString);
                        JSONArray jSONArray3 = this.f11197o;
                        JSONObject q = mo1648q(o);
                        try {
                            q.put("appId", optString);
                        } catch (JSONException e) {
                            Log.m105920e("MicroMsg.JsApiQueryDownloadTaskForNative", e.getMessage());
                        }
                        jSONArray3.put(q);
                    }
                    this.f11198p = false;
                } else if (this.f11194i <= 0) {
                    this.f11199q = "downloadId invalid";
                } else {
                    FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63966n(this.f11194i);
                    int i2 = n.f12196f;
                    if (i2 != -1) {
                        if (i2 == 1) {
                            this.f11200r = "downloading";
                        } else if (i2 == 2) {
                            this.f11200r = "download_pause";
                        } else if (i2 != 3) {
                            if (i2 != 4) {
                                this.f11200r = "default";
                            } else {
                                this.f11200r = "download_fail";
                            }
                        } else if (C86013q1.m106450k(n.f12197g)) {
                            this.f11200r = "download_succ";
                        } else {
                            this.f11200r = "default";
                        }
                        Log.m105925i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, state = %s", this.f11200r);
                        long j = n.f12201n;
                        if (j != 0) {
                            float f = (float) n.f12200j;
                            float f2 = (float) j;
                            this.f11201s = (long) ((f / f2) * 100.0f);
                            this.f11202t = (f * 100.0f) / f2;
                        }
                        this.f11203u = n.f12205r;
                        this.f11198p = false;
                    } else {
                        this.f11199q = "fail_apilevel_too_low";
                    }
                }
            } else {
                this.f11197o = new JSONArray();
                for (int i3 = 0; i3 < this.f11195j.length(); i3++) {
                    long optLong = this.f11195j.optLong(i3);
                    FileDownloadTaskInfo n2 = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63966n(optLong);
                    JSONArray jSONArray4 = this.f11197o;
                    JSONObject q2 = mo1648q(n2);
                    try {
                        q2.put("downloadId", optLong);
                    } catch (JSONException e2) {
                        Log.m105920e("MicroMsg.JsApiQueryDownloadTaskForNative", e2.getMessage());
                    }
                    jSONArray4.put(q2);
                }
                this.f11198p = false;
            }
            mo114394b();
        }

        /* renamed from: q */
        public final JSONObject mo1648q(FileDownloadTaskInfo fileDownloadTaskInfo) {
            JSONObject jSONObject = new JSONObject();
            int i = fileDownloadTaskInfo.f12196f;
            if (i != -1) {
                String str = "default";
                int i2 = 1;
                if (i == 1) {
                    str = "downloading";
                } else if (i == 2) {
                    str = "download_pause";
                } else if (i != 3) {
                    if (i == 4) {
                        str = "download_fail";
                    }
                } else if (C86013q1.m106450k(fileDownloadTaskInfo.f12197g)) {
                    str = "download_succ";
                }
                Log.m105925i("MicroMsg.JsApiQueryDownloadTaskForNative", "doQueryDownloadTask, state = %s", str);
                float f = 0.0f;
                long j = fileDownloadTaskInfo.f12201n;
                long j2 = 0;
                if (j != 0) {
                    long j3 = fileDownloadTaskInfo.f12200j;
                    f = (((float) j3) * 100.0f) / ((float) j);
                    j2 = (100 * j3) / j;
                }
                try {
                    jSONObject.put("appId", fileDownloadTaskInfo.f12199i);
                    jSONObject.put("downloadId", fileDownloadTaskInfo.f12194d);
                    jSONObject.put("state", str);
                    jSONObject.put("progress", j2);
                    jSONObject.put("progress_float", (double) f);
                    if (!fileDownloadTaskInfo.f12205r) {
                        i2 = 0;
                    }
                    jSONObject.put("reserve_for_wifi", i2);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.JsApiQueryDownloadTaskForNative", e.getMessage());
                }
                return jSONObject;
            }
            this.f11199q = "fail_apilevel_too_low";
            return jSONObject;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11194i);
            parcel.writeInt(this.f11198p ? 1 : 0);
            parcel.writeString(this.f11199q);
            parcel.writeString(this.f11200r);
            parcel.writeLong(this.f11201s);
            JSONArray jSONArray = this.f11195j;
            String str = null;
            parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
            JSONArray jSONArray2 = this.f11196n;
            parcel.writeString(jSONArray2 != null ? jSONArray2.toString() : null);
            JSONArray jSONArray3 = this.f11197o;
            if (jSONArray3 != null) {
                str = jSONArray3.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f11203u ? 1 : 0);
        }

        public QueryDownloadTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
