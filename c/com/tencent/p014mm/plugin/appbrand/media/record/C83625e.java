package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.media.record.C83626f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import p156gj.C107835h0;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.e */
public class C83625e implements Runnable {
    public void run() {
        String str;
        if (C83626f.f244218c) {
            Log.m105924i("MicroMsg.Record.AppBrandRecordClientService", "update device info done!");
            return;
        }
        Log.m105924i("MicroMsg.Record.AppBrandRecordClientService", "to do update device info!");
        C83626f.f244218c = true;
        IPCString iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, null, C83626f.C83627a.class);
        if (iPCString != null && (str = iPCString.f10315d) != null) {
            C107835h0.m146105b(str);
            Log.m105924i("MicroMsg.Record.AppBrandRecordClientService", "update device info success!");
        }
    }
}
