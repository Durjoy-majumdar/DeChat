package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.cw */
public interface C113610cw extends C113598cj.C113599a {
    @NetRequest(method = NetMethod.GET, path = "map/poi/detail", queryKeys = {"id", "key"})
    NetResponse poiDetail(String str, String str2);
}
