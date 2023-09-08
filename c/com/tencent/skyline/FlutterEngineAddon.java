package com.tencent.skyline;

import com.tencent.skyline.jsapi.SkylineJsApiInvoker;
import gy3.C87412m;
import kotlin.Metadata;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.common.MethodChannel;

@Metadata(mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/skyline/FlutterEngineAddon;", "", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "invokeMethodChannel", "Lio/flutter/plugin/common/MethodChannel;", "jsApiInvoker", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "config", "Lcom/tencent/skyline/SkylineConfig;", "(Lio/flutter/embedding/engine/FlutterEngine;Lio/flutter/plugin/common/MethodChannel;Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;Lcom/tencent/skyline/SkylineConfig;)V", "getConfig", "()Lcom/tencent/skyline/SkylineConfig;", "getFlutterEngine", "()Lio/flutter/embedding/engine/FlutterEngine;", "getInvokeMethodChannel", "()Lio/flutter/plugin/common/MethodChannel;", "getJsApiInvoker", "()Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0}, mo182098xi = 48)
public final class FlutterEngineAddon {
    private final SkylineConfig config;
    private final FlutterEngine flutterEngine;
    private final MethodChannel invokeMethodChannel;
    private final SkylineJsApiInvoker<?> jsApiInvoker;

    public FlutterEngineAddon(FlutterEngine flutterEngine2, MethodChannel methodChannel, SkylineJsApiInvoker<?> skylineJsApiInvoker, SkylineConfig skylineConfig) {
        C87412m.m108594g(flutterEngine2, "flutterEngine");
        C87412m.m108594g(methodChannel, "invokeMethodChannel");
        C87412m.m108594g(skylineJsApiInvoker, "jsApiInvoker");
        C87412m.m108594g(skylineConfig, "config");
        this.flutterEngine = flutterEngine2;
        this.invokeMethodChannel = methodChannel;
        this.jsApiInvoker = skylineJsApiInvoker;
        this.config = skylineConfig;
    }

    public final SkylineConfig getConfig() {
        return this.config;
    }

    public final FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    public final MethodChannel getInvokeMethodChannel() {
        return this.invokeMethodChannel;
    }

    public final SkylineJsApiInvoker<?> getJsApiInvoker() {
        return this.jsApiInvoker;
    }
}
