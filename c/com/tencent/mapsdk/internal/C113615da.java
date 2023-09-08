package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.da */
public interface C113615da extends C113598cj.C113599a {
    @NetRequest(method = NetMethod.POST, path = "rttserverex/", userAgent = "sosomap navsns")
    NetResponse rttData(byte[] bArr);
}
