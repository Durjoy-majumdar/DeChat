package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.dd */
public interface C113618dd extends C113598cj.C113599a {
    @NetRequest(constQuery = "appid=sdk&logid=launch_stat&channel=1&output=json&uuid=unknown", method = NetMethod.GET, path = "pingd", queryKeys = {"sessionid", "hm", "suid", "duid", "os", "psv", "ver", "pf", "nt"}, userAgent = "QQ Map Mobile")
    NetResponse launchStat(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8);

    @NetRequest(method = NetMethod.GET, path = "pingd", queryKeys = {"local"}, userAgent = "QQ Map Mobile")
    NetResponse local(int i);

    @NetRequest(constQuery = "channel=1&output=json&uuid=unknown", head = @NetHead(keys = {"Content-Type"}, values = {"application/json"}), method = NetMethod.POST, path = "ditusdk/monitor", queryKeys = {"key", "key2", "pid", "pid2", "hm", "suid", "os", "psv", "ver", "pf", "nt"}, userAgent = "QQ Map Mobile")
    NetResponse report(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, byte[] bArr);
}
