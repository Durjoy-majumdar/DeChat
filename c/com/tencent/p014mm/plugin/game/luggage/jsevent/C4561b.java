package com.tencent.p014mm.plugin.game.luggage.jsevent;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C36768q;
import p237sp.C48456t;
import p749xh.C53352w2;
import z83.C16123a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsevent.b */
public class C4561b implements C36768q.C36771c {
    /* renamed from: f */
    public void mo5418f(int i, long j) {
        long j2 = j;
        Class<C4562d> cls = C4562d.class;
        Class<C16123a> cls2 = C16123a.class;
        Class cls3 = C40327m.class;
        Class cls4 = C48456t.class;
        switch (i) {
            case 1:
                String str = "name";
                Class<C4562d> cls5 = cls;
                Class<C16123a> cls6 = cls2;
                String str2 = "dispatchEventFromMMProcess";
                String str3 = "process alive";
                String str4 = "MicroMsg.LiteAppIpcEventDispatch";
                C53352w2 nh = ((C48456t) C86312j.m106911c(cls4)).mo72824nh(j2);
                if (nh != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appid", nh.field_appId);
                    String str5 = str3;
                    Class<C4562d> cls7 = cls5;
                    jSONObject.put("download_id", nh.field_downloadId);
                    jSONObject.put("state", "download_start");
                    Bundle bundle = new Bundle();
                    bundle.putString(str, "wxdownload:state_change");
                    bundle.putString("data", jSONObject.toString());
                    ((C40327m) C86312j.m106911c(cls3)).Ku0(bundle, cls6, (C1256g) null);
                    Log.m105924i(str4, str2);
                    if (MMApplicationContext.isProcessExist(MMApplicationContext.getMainProcessName())) {
                        Log.m105924i(str4, str5);
                        C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle, cls7, (C1256g) null);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str6 = "name";
                Class<C4562d> cls8 = cls;
                Class<C16123a> cls9 = cls2;
                String str7 = "dispatchEventFromMMProcess";
                String str8 = "process alive";
                String str9 = "MicroMsg.LiteAppIpcEventDispatch";
                C53352w2 nh4 = ((C48456t) C86312j.m106911c(cls4)).mo72824nh(j2);
                if (nh4 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("appid", nh4.field_appId);
                    String str10 = str8;
                    Class<C4562d> cls10 = cls8;
                    jSONObject2.put("download_id", nh4.field_downloadId);
                    if (!nh4.field_fromDownloadApp || !nh4.field_downloadInWifi || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                        jSONObject2.put("state", "download_pause");
                    } else {
                        jSONObject2.put("state", "download_wait_for_wifi");
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(str6, "wxdownload:state_change");
                    bundle2.putString("data", jSONObject2.toString());
                    ((C40327m) C86312j.m106911c(cls3)).Ku0(bundle2, cls9, (C1256g) null);
                    Log.m105924i(str9, str7);
                    if (MMApplicationContext.isProcessExist(MMApplicationContext.getMainProcessName())) {
                        Log.m105924i(str9, str10);
                        C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle2, cls10, (C1256g) null);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                String str11 = "name";
                Class<C4562d> cls11 = cls;
                Class<C16123a> cls12 = cls2;
                String str12 = "dispatchEventFromMMProcess";
                String str13 = "process alive";
                String str14 = "MicroMsg.LiteAppIpcEventDispatch";
                C53352w2 nh5 = ((C48456t) C86312j.m106911c(cls4)).mo72824nh(j2);
                if (nh5 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("appid", nh5.field_appId);
                    String str15 = str13;
                    Class<C4562d> cls13 = cls11;
                    jSONObject3.put("download_id", nh5.field_downloadId);
                    jSONObject3.put("state", "download_succ");
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(str11, "wxdownload:state_change");
                    bundle3.putString("data", jSONObject3.toString());
                    ((C40327m) C86312j.m106911c(cls3)).Ku0(bundle3, cls12, (C1256g) null);
                    Log.m105924i(str14, str12);
                    if (MMApplicationContext.isProcessExist(MMApplicationContext.getMainProcessName())) {
                        Log.m105924i(str14, str15);
                        C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle3, cls13, (C1256g) null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                String str16 = "name";
                Class<C4562d> cls14 = cls;
                Class<C16123a> cls15 = cls2;
                String str17 = "dispatchEventFromMMProcess";
                String str18 = "process alive";
                String str19 = "MicroMsg.LiteAppIpcEventDispatch";
                C53352w2 nh6 = ((C48456t) C86312j.m106911c(cls4)).mo72824nh(j2);
                if (nh6 != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("appid", nh6.field_appId);
                    String str20 = str18;
                    Class<C4562d> cls16 = cls14;
                    jSONObject4.put("download_id", nh6.field_downloadId);
                    jSONObject4.put("state", "download_removed");
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(str16, "wxdownload:state_change");
                    bundle4.putString("data", jSONObject4.toString());
                    ((C40327m) C86312j.m106911c(cls3)).Ku0(bundle4, cls15, (C1256g) null);
                    Log.m105924i(str19, str17);
                    if (MMApplicationContext.isProcessExist(MMApplicationContext.getMainProcessName())) {
                        Log.m105924i(str19, str20);
                        C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle4, cls16, (C1256g) null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String str21 = "name";
                Class<C4562d> cls17 = cls;
                Class<C16123a> cls18 = cls2;
                String str22 = "dispatchEventFromMMProcess";
                String str23 = "process alive";
                String str24 = "MicroMsg.LiteAppIpcEventDispatch";
                C53352w2 nh7 = ((C48456t) C86312j.m106911c(cls4)).mo72824nh(j2);
                if (nh7 != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("appid", nh7.field_appId);
                    String str25 = str23;
                    Class<C4562d> cls19 = cls17;
                    jSONObject5.put("download_id", nh7.field_downloadId);
                    jSONObject5.put("state", "download_fail");
                    Bundle bundle5 = new Bundle();
                    bundle5.putString(str21, "wxdownload:state_change");
                    bundle5.putString("data", jSONObject5.toString());
                    ((C40327m) C86312j.m106911c(cls3)).Ku0(bundle5, cls18, (C1256g) null);
                    Log.m105924i(str24, str22);
                    if (MMApplicationContext.isProcessExist(MMApplicationContext.getMainProcessName())) {
                        Log.m105924i(str24, str25);
                        C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle5, cls19, (C1256g) null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                String str26 = "name";
                C53352w2 nh8 = ((C48456t) C86312j.m106911c(cls4)).mo72824nh(j2);
                if (nh8 != null) {
                    long j3 = nh8.field_totalSize;
                    if (j3 != 0) {
                        String str27 = "process alive";
                        long j4 = nh8.field_downloadedSize;
                        String str28 = "dispatchEventFromMMProcess";
                        String str29 = "MicroMsg.LiteAppIpcEventDispatch";
                        Class<C4562d> cls20 = cls;
                        Class<C16123a> cls21 = cls2;
                        int i2 = (int) ((((double) j4) / ((double) j3)) * 100.0d);
                        float f = (((float) j4) / ((float) j3)) * 100.0f;
                        Log.m105919d("MicroMsg.JsDownloadEventDispatch", "onDownloadTaskProgressChanged, progressFloat: %f", Float.valueOf(f));
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("appid", nh8.field_appId);
                        jSONObject6.put("download_id", nh8.field_downloadId);
                        jSONObject6.put("progress", i2);
                        jSONObject6.put("progress_float", (double) f);
                        Bundle bundle6 = new Bundle();
                        bundle6.putString(str26, "wxdownload:progress_change");
                        bundle6.putString("data", jSONObject6.toString());
                        ((C40327m) C86312j.m106911c(cls3)).Ku0(bundle6, cls21, (C1256g) null);
                        String str30 = str29;
                        Log.m105924i(str30, str28);
                        if (MMApplicationContext.isProcessExist(MMApplicationContext.getMainProcessName())) {
                            Log.m105924i(str30, str27);
                            C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle6, cls20, (C1256g) null);
                            return;
                        }
                        return;
                    }
                }
                Log.m105928w("MicroMsg.JsDownloadEventDispatch", "loadDownloadProgress failed");
                return;
            case 7:
                C53352w2 nh9 = ((C48456t) C86312j.m106911c(cls4)).mo72824nh(j2);
                if (nh9 != null) {
                    JSONObject jSONObject7 = new JSONObject();
                    try {
                        jSONObject7.put("appid", nh9.field_appId);
                        jSONObject7.put("download_id", nh9.field_downloadId);
                        jSONObject7.put("state", "download_resumed");
                        Bundle bundle7 = new Bundle();
                        bundle7.putString("name", "wxdownload:state_change");
                        bundle7.putString("data", jSONObject7.toString());
                        ((C40327m) C86312j.m106911c(cls3)).Ku0(bundle7, cls2, (C1256g) null);
                        Log.m105924i("MicroMsg.LiteAppIpcEventDispatch", "dispatchEventFromMMProcess");
                        if (MMApplicationContext.isProcessExist(MMApplicationContext.getMainProcessName())) {
                            Log.m105924i("MicroMsg.LiteAppIpcEventDispatch", "process alive");
                            C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle7, cls, (C1256g) null);
                            return;
                        }
                        return;
                    } catch (JSONException unused) {
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
