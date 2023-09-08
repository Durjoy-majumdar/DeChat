package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13754y;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 */
public class C6243g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23012d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23013e;

    public C6243g2(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23013e = msgHandler;
        this.f23012d = h1Var;
    }

    public void run() {
        FileDownloadTaskInfo fileDownloadTaskInfo;
        String str;
        String str2;
        MsgHandler msgHandler;
        String str3;
        String str4;
        String str5;
        String str6;
        Class cls = C13754y.class;
        String str7 = "download_id";
        long j = Util.getLong((String) this.f23012d.f38983a.get(str7), -1);
        String str8 = (String) this.f23012d.f38983a.get("appid");
        String str9 = (String) this.f23012d.f38983a.get("appIdArray");
        Log.m105924i("MicroMsg.MsgHandler", "doQueryDownloadTask, downloadId = " + j + ",appId = " + str8 + ",appIds = " + str9);
        String str10 = "reserve_for_wifi";
        String str11 = "download_fail";
        String str12 = "query_download_task:fail";
        String str13 = "download_succ";
        if (!Util.isNullOrNil(str9)) {
            MsgHandler msgHandler2 = this.f23013e;
            C13851h1 h1Var = this.f23012d;
            msgHandler2.getClass();
            try {
                JSONArray jSONArray = new JSONArray(str9);
                if (jSONArray.length() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    int i = 0;
                    while (i < jSONArray.length()) {
                        String string = jSONArray.getString(i);
                        JSONArray jSONArray2 = jSONArray;
                        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(string);
                        String str14 = str11;
                        JSONObject jSONObject2 = new JSONObject();
                        int i2 = o.f12196f;
                        Class cls2 = cls;
                        if (i2 == -1) {
                            str4 = "api_not_support";
                        } else if (i2 == 1) {
                            str4 = "downloading";
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    str4 = str14;
                                }
                            } else if (C86013q1.m106450k(o.f12197g)) {
                                str4 = str13;
                            }
                            str4 = "default";
                        } else {
                            str4 = "download_pause";
                        }
                        MsgHandler msgHandler3 = msgHandler2;
                        try {
                            jSONObject2.put(str7, o.f12194d);
                            jSONObject2.put("state", str4);
                            if (o.f12205r) {
                                jSONObject2.put(str10, 1);
                            }
                            long j2 = o.f12201n;
                            if (j2 != 0) {
                                str6 = str7;
                                long j3 = o.f12200j;
                                str3 = str12;
                                str5 = str10;
                                try {
                                    jSONObject2.put("progress", (j3 * 100) / j2);
                                    jSONObject2.put("progress_float", (double) ((((float) j3) * 100.0f) / ((float) j2)));
                                } catch (JSONException e) {
                                    e = e;
                                    msgHandler = msgHandler3;
                                    str2 = str3;
                                    Log.m105920e("MicroMsg.MsgHandler", e.getMessage());
                                    msgHandler.mo7210k5(h1Var, str2, (Map<String, Object>) null);
                                }
                            } else {
                                str6 = str7;
                                str3 = str12;
                                str5 = str10;
                            }
                            jSONObject.put(string, jSONObject2);
                            i++;
                            str11 = str14;
                            jSONArray = jSONArray2;
                            cls = cls2;
                            msgHandler2 = msgHandler3;
                            str7 = str6;
                            str10 = str5;
                            str12 = str3;
                        } catch (JSONException e2) {
                            e = e2;
                            str2 = str12;
                            msgHandler = msgHandler3;
                            Log.m105920e("MicroMsg.MsgHandler", e.getMessage());
                            msgHandler.mo7210k5(h1Var, str2, (Map<String, Object>) null);
                        }
                    }
                    MsgHandler msgHandler4 = msgHandler2;
                    str3 = str12;
                    HashMap hashMap = new HashMap();
                    hashMap.put("result", jSONObject);
                    msgHandler = msgHandler4;
                    try {
                        msgHandler.mo7210k5(h1Var, "query_download_task:ok", hashMap);
                    } catch (JSONException e3) {
                        e = e3;
                    }
                } else {
                    msgHandler = msgHandler2;
                    str2 = str12;
                    try {
                        msgHandler.mo7210k5(h1Var, str2, (Map<String, Object>) null);
                    } catch (JSONException e4) {
                        e = e4;
                    }
                }
            } catch (JSONException e5) {
                e = e5;
                msgHandler = msgHandler2;
                str2 = str12;
                Log.m105920e("MicroMsg.MsgHandler", e.getMessage());
                msgHandler.mo7210k5(h1Var, str2, (Map<String, Object>) null);
            }
        } else {
            Class cls3 = cls;
            String str15 = str7;
            String str16 = str12;
            String str17 = str10;
            String str18 = str11;
            if (j > 0) {
                fileDownloadTaskInfo = ((C40935l) ((C13754y) C86312j.m106911c(cls3)).Ds0()).mo63966n(j);
            } else if (!Util.isNullOrNil(str8)) {
                fileDownloadTaskInfo = ((C40935l) ((C13754y) C86312j.m106911c(cls3)).Ds0()).mo63967o(str8);
            } else {
                Log.m105920e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, invalid downloadId = " + j + " or appid is null");
                this.f23013e.mo7210k5(this.f23012d, str16, (Map<String, Object>) null);
                return;
            }
            int i3 = fileDownloadTaskInfo.f12196f;
            if (i3 != -1) {
                if (i3 == 1) {
                    str = "downloading";
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            str = str18;
                        }
                    } else if (C86013q1.m106450k(fileDownloadTaskInfo.f12197g)) {
                        str = str13;
                    }
                    str = "default";
                } else {
                    str = "download_pause";
                }
                Log.m105924i("MicroMsg.MsgHandler", "doQueryDownloadTask, state = " + str);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("state", str);
                hashMap2.put(str15, Long.valueOf(fileDownloadTaskInfo.f12194d));
                if (fileDownloadTaskInfo.f12205r) {
                    hashMap2.put(str17, 1);
                }
                long j4 = fileDownloadTaskInfo.f12201n;
                if (j4 != 0) {
                    long j5 = fileDownloadTaskInfo.f12200j;
                    hashMap2.put("progress", Long.valueOf((100 * j5) / j4));
                    hashMap2.put("progress_float", Float.valueOf((((float) j5) * 100.0f) / ((float) j4)));
                }
                this.f23013e.mo7210k5(this.f23012d, "query_download_task:ok", hashMap2);
                return;
            }
            Log.m105920e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, api not support");
            this.f23013e.mo7210k5(this.f23012d, "query_download_task:fail_apilevel_too_low", (Map<String, Object>) null);
        }
    }
}
