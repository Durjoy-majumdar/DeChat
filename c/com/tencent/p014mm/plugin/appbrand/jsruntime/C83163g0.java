package com.tencent.p014mm.plugin.appbrand.jsruntime;

import android.os.Environment;
import android.system.ErrnoException;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81409a0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C86491q2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.g0 */
public final class C83163g0 extends C86491q2 {
    /* renamed from: a */
    public String mo56580a() {
        return "MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer";
    }

    /* renamed from: b */
    public boolean mo56581b(int i) {
        return !PluginAppBrand.getProcessSharedPrefs().getBoolean("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer_transfer_finished", false);
    }

    /* renamed from: c */
    public void mo56582c(int i) {
        IPCString iPCString;
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        C86013q1.m106445f(absolutePath + "tencent/MicroMsg/wxajscache");
        String str = null;
        boolean z = false;
        try {
            iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C29552h0.C1916a.class);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.V8CodeCachePathRetriever", "retrieve ipc ex = %s", e);
            iPCString = null;
        }
        if (iPCString != null) {
            str = iPCString.f10315d;
        }
        if (str != null) {
            String b = C29552h0.m38799b();
            if (C86013q1.m106450k(str) && !C86013q1.m106450k(b)) {
                try {
                    z = C81409a0.m99866a(str, b);
                } catch (ErrnoException e2) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer", e2, "FileMove error", new Object[0]);
                }
                if (!z) {
                    C86013q1.m106461v(b);
                    C86013q1.m106441b(str, b);
                }
            }
            C86013q1.m106445f(str);
        }
        PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer_transfer_finished", true).commit();
    }
}
