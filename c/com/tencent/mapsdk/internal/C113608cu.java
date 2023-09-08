package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.cu */
public interface C113608cu extends C113598cj.C113599a {
    @NetRequest(method = NetMethod.URL, path = "indoormapx")
    String getIndoorMapUrl();
}
