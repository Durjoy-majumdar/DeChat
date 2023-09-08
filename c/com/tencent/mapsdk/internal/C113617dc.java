package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.C113598cj;

/* renamed from: com.tencent.mapsdk.internal.dc */
public interface C113617dc extends C113598cj.C113599a {
    @NetRequest(constQuery = "styleid=7", method = NetMethod.URL, path = "scenic/", queryKeys = {"x", "y", "z", "version"}, useExtraQuery = false)
    String sketchTileUrl(int i, int i2, int i3, int i4);
}
