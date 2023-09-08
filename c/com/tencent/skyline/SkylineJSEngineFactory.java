package com.tencent.skyline;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/skyline/SkylineJSEngineFactory;", "", "Lcom/tencent/skyline/ISkylineJSEngineCallback;", "callback", "Lrx3/b0;", "createJSEngine", "Lcom/tencent/skyline/ISkylineJSEngineFactory;", "sSkylineJSEngineFactory", "Lcom/tencent/skyline/ISkylineJSEngineFactory;", "getSSkylineJSEngineFactory", "()Lcom/tencent/skyline/ISkylineJSEngineFactory;", "setSSkylineJSEngineFactory", "(Lcom/tencent/skyline/ISkylineJSEngineFactory;)V", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineJSEngineFactory {
    public static final SkylineJSEngineFactory INSTANCE = new SkylineJSEngineFactory();
    private static ISkylineJSEngineFactory sSkylineJSEngineFactory = new SkylineJSEngineFactory$sSkylineJSEngineFactory$1();

    private SkylineJSEngineFactory() {
    }

    public final void createJSEngine(ISkylineJSEngineCallback iSkylineJSEngineCallback) {
        C87412m.m108594g(iSkylineJSEngineCallback, "callback");
        ISkylineJSEngineFactory iSkylineJSEngineFactory = sSkylineJSEngineFactory;
        if (iSkylineJSEngineFactory != null) {
            iSkylineJSEngineFactory.createJSEngine(iSkylineJSEngineCallback);
        }
    }

    public final ISkylineJSEngineFactory getSSkylineJSEngineFactory() {
        return sSkylineJSEngineFactory;
    }

    public final void setSSkylineJSEngineFactory(ISkylineJSEngineFactory iSkylineJSEngineFactory) {
        sSkylineJSEngineFactory = iSkylineJSEngineFactory;
    }
}
