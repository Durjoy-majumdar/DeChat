package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.C82023c;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.d */
public class C1605d extends C82023c {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "onDownloadAppStateChange";

    public C1605d(C81925i2 i2Var) {
        super(i2Var);
    }

    /* renamed from: t */
    public static void m1646t(C81925i2 i2Var) {
        if (!C82023c.f240489j.containsKey(i2Var.getAppId())) {
            C82023c.f240489j.put(i2Var.getAppId(), new C1605d(i2Var));
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(i2Var.getAppId()), C82023c.C1603c.class, (C1256g) null);
        }
    }
}
