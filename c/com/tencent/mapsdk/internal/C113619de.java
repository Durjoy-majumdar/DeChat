package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.de */
public interface C113619de extends C113598cj.C113599a {
    @NetRequest(constQuery = "p_ver=1", method = NetMethod.GET, path = "map/traffic/event", queryKeys = {"param"})
    NetResponse mapTrafficEvent(String str);
}
