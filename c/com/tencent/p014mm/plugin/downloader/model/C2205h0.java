package com.tencent.p014mm.plugin.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import p237sp.C90271s;

/* renamed from: com.tencent.mm.plugin.downloader.model.h0 */
public class C2205h0 {
    /* renamed from: a */
    public static int m2038a(String str) {
        if ("fail".equals(str)) {
            return 809;
        }
        if ("cancel".equals(str)) {
            return 810;
        }
        if ("fail_network_not_wifi".equals(str) || "network_not_wifi".equals(str)) {
            return 104;
        }
        if ("network_not_connected".equals(str)) {
            return 803;
        }
        if ("sdcard_not_ready".equals(str)) {
            return 804;
        }
        if ("has_not_enough_space".equals(str)) {
            return 710;
        }
        return "invalid_downloadid".equals(str) ? 808 : 0;
    }

    /* renamed from: b */
    public static void m2039b(FileDownloadTaskInfo fileDownloadTaskInfo, C90271s.C13750a aVar) {
        String str;
        JSONObject jSONObject = new JSONObject();
        int i = fileDownloadTaskInfo.f12196f;
        if (i == -1) {
            str = "api_not_support";
        } else if (i == 1) {
            str = "downloading";
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    str = "download_fail";
                } else if (i == 5) {
                    str = "download_removed";
                }
            } else if (C86013q1.m106450k(fileDownloadTaskInfo.f12197g)) {
                str = "download_succ";
            }
            str = "default";
        } else {
            str = "download_pause";
        }
        try {
            jSONObject.put("downloadId", fileDownloadTaskInfo.f12194d);
            jSONObject.put("state", str);
            if (fileDownloadTaskInfo.f12205r) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            long j = fileDownloadTaskInfo.f12201n;
            if (j != 0) {
                long j2 = fileDownloadTaskInfo.f12200j;
                jSONObject.put("progress", (100 * j2) / j);
                jSONObject.put("progress_float", (double) ((((float) j2) * 100.0f) / ((float) j)));
            }
            aVar.mo13119d(jSONObject);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m2040c(JSONObject jSONObject, LinkedList<String> linkedList) {
        if (!Util.isNullOrNil((List) linkedList)) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("download_id", -1);
                    jSONObject2.put("state", "default");
                    jSONObject.put(next, jSONObject2);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", e.getMessage());
                }
            }
        }
    }
}
