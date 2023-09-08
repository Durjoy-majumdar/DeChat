package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.cz */
public interface C113613cz extends C113598cj.C113599a {
    @NetRequest(constQuery = "ctrlpf=vector&ctrlmb=and", method = NetMethod.GET, queryKeys = {"apikey", "ver", "ctrlver", "uk", "frontier", "scenetype", "mpt"})
    NetResponse checkAuth(String str, String str2, int i, String str3, int i2, int i3, int i4);
}
