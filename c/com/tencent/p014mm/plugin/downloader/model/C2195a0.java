package com.tencent.p014mm.plugin.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C36768q;
import p237sp.C48456t;
import p237sp.C90271s;
import p749xh.C53352w2;

/* renamed from: com.tencent.mm.plugin.downloader.model.a0 */
public class C2195a0 implements C36768q.C36769a {

    /* renamed from: a */
    public final /* synthetic */ C90271s.C13750a f12206a;

    public C2195a0(C2196b0 b0Var, C90271s.C13750a aVar) {
        this.f12206a = aVar;
    }

    /* renamed from: f */
    public void mo2084f(int i, long j) {
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        JSONObject jSONObject = new JSONObject();
        if (nh != null) {
            try {
                jSONObject.put("downloadId", nh.field_downloadId);
                jSONObject.put("appId", nh.field_appId);
                jSONObject.put("taskSize", nh.field_totalSize);
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.ListenerManager", "toJsonObject: " + e.getMessage());
            }
            if (i != 9) {
                switch (i) {
                    case 1:
                        try {
                            jSONObject.put("state", "download_started");
                            long j2 = nh.field_totalSize;
                            if (j2 != 0) {
                                jSONObject.put("progress", (long) ((((float) nh.field_downloadedSize) / ((float) j2)) * 100.0f));
                                jSONObject.put("progressFloat", (double) ((((float) nh.field_downloadedSize) * 100.0f) / ((float) nh.field_totalSize)));
                                break;
                            }
                        } catch (JSONException e2) {
                            Log.m105920e("MicroMsg.ListenerManager", "toJsonObject: " + e2.getMessage());
                            break;
                        }
                        break;
                    case 2:
                        try {
                            if (!nh.field_downloadInWifi || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                                jSONObject.put("state", "download_paused");
                            } else {
                                jSONObject.put("state", "download_wait_wifi");
                            }
                            long j3 = nh.field_totalSize;
                            if (j3 != 0) {
                                jSONObject.put("progress", (long) ((((float) nh.field_downloadedSize) / ((float) j3)) * 100.0f));
                                jSONObject.put("progressFloat", (double) ((((float) nh.field_downloadedSize) * 100.0f) / ((float) nh.field_totalSize)));
                                break;
                            }
                        } catch (JSONException unused) {
                            break;
                        }
                        break;
                    case 3:
                        try {
                            jSONObject.put("state", "download_succ");
                            jSONObject.put("progress", 100);
                            break;
                        } catch (JSONException e3) {
                            Log.m105920e("MicroMsg.ListenerManager", "toJsonObject: " + e3.getMessage());
                            break;
                        }
                    case 4:
                        try {
                            jSONObject.put("state", "download_removed");
                            break;
                        } catch (JSONException e4) {
                            Log.m105920e("MicroMsg.ListenerManager", "toJsonObject: " + e4.getMessage());
                            break;
                        }
                    case 5:
                        try {
                            if (nh.field_downloadInWifi && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                                jSONObject.put("state", "download_wait_wifi");
                                break;
                            } else {
                                jSONObject.put("state", "download_failed");
                                break;
                            }
                        } catch (JSONException e5) {
                            Log.m105920e("MicroMsg.ListenerManager", "toJsonObject: " + e5.getMessage());
                            break;
                        }
                        break;
                    case 6:
                        try {
                            jSONObject.put("state", "download_progress_changed");
                            long j4 = nh.field_totalSize;
                            if (j4 != 0) {
                                jSONObject.put("progress", (long) ((((float) nh.field_downloadedSize) / ((float) j4)) * 100.0f));
                                jSONObject.put("progressFloat", (double) ((((float) nh.field_downloadedSize) * 100.0f) / ((float) nh.field_totalSize)));
                            }
                        } catch (JSONException e6) {
                            Log.m105920e("MicroMsg.ListenerManager", "toJsonObject: " + e6.getMessage());
                        }
                        C90271s.C13750a aVar = this.f12206a;
                        long j5 = nh.field_downloadedSize;
                        long j6 = nh.field_totalSize;
                        aVar.mo13118c((((float) j5) * 100.0f) / ((float) j6), j5, j6);
                        break;
                }
            } else {
                try {
                    jSONObject.put("state", "download_task_installed");
                } catch (JSONException e7) {
                    Log.m105920e("MicroMsg.ListenerManager", "toJsonObject: " + e7.getMessage());
                }
            }
            this.f12206a.mo13117a(jSONObject);
        }
    }
}
