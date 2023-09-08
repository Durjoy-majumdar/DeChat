package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import eb0.C75592q0;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.l2 */
public class C69245l2 extends C69196b2 {
    public C69245l2(String str, String str2, int i, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("username", str);
        hashMap.put("sendId", str2);
        hashMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i + "");
        hashMap.put("ver", str3);
        hashMap.put("sendUserName", C75592q0.m90789s());
        setRequestData(hashMap);
    }

    public int getType() {
        return 1668;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/sharewxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
