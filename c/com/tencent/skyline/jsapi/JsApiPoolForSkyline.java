package com.tencent.skyline.jsapi;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0003*\u00020\u0002J\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0007R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/skyline/jsapi/JsApiPoolForSkyline;", "", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "EXECUTOR", "Lrx3/b0;", "initPagePool", "init", "", "", "Lcom/tencent/skyline/jsapi/BaseJsApiForSkyline;", "getJsApiMap", "", "sPageJsApiMap", "Ljava/util/Map;", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class JsApiPoolForSkyline {
    public static final JsApiPoolForSkyline INSTANCE = new JsApiPoolForSkyline();
    private static final Map<String, BaseJsApiForSkyline<?>> sPageJsApiMap = new LinkedHashMap();

    private JsApiPoolForSkyline() {
    }

    private final <EXECUTOR extends SkylineJsApiExecutor> void initPagePool() {
        SkylineJsApiSetBackgroundColor skylineJsApiSetBackgroundColor = new SkylineJsApiSetBackgroundColor();
        sPageJsApiMap.put(skylineJsApiSetBackgroundColor.getName(), skylineJsApiSetBackgroundColor);
    }

    public final Map<String, BaseJsApiForSkyline<?>> getJsApiMap() {
        return sPageJsApiMap;
    }

    public final <EXECUTOR extends SkylineJsApiExecutor> void init() {
        initPagePool();
    }
}
