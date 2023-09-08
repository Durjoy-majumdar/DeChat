package com.tencent.p014mm.app;

import com.tencent.tinker.loader.app.TinkerApplication;

/* renamed from: com.tencent.mm.app.Application */
public class Application extends TinkerApplication {
    private static final String TINKER_LOADER_ENTRY_CLASSNAME = "com.tencent.tinker.loader.TinkerLoader";
    private static final String WECHAT_APPLICATION_LIKE_CLASSNAME = "com.tencent.mm.app.MMApplicationLike";

    public Application() {
        super(7, WECHAT_APPLICATION_LIKE_CLASSNAME, TINKER_LOADER_ENTRY_CLASSNAME, false, true, true);
    }
}
