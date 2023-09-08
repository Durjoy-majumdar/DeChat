package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.db */
public interface C113616db extends C113598cj.C113599a {
    @NetRequest(constQuery = "styleid=0", method = NetMethod.URL, path = "satellite", queryKeys = {"z", "x", "y", "version"}, useExtraQuery = false)
    String satelliteUrl(String str, String str2, String str3, String str4);

    @NetRequest(constQuery = "styleid=0", method = NetMethod.URL, path = "satellite", queryKeys = {"z", "x", "y", "version"})
    String satelliteUrl2(String str, String str2, String str3, String str4);
}
