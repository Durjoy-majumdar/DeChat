package com.tencent.tencentmap.mapsdk.maps.interfaces;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Builder;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Options;

public interface Options<O extends Options, B extends Builder<O>> {
    B newBuilder();
}
