package com.tencent.p014mm.legacy.app;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.app.C80608o0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.pinus.XWebBrowserProcessHelper;
import java.io.File;

/* renamed from: com.tencent.mm.legacy.app.e */
public class C80961e implements XWebBrowserProcessHelper.BrowserProcessCrashDumpFileCallback {
    public String getCrashDumpFolderPath() {
        Context context = MMApplicationContext.getContext();
        String str = C80608o0.f235817b;
        return new File(context.getFilesDir(), AppMeasurement.CRASH_ORIGIN).getAbsolutePath();
    }

    public String getJavaCrashDumpFilePath(String str) {
        return C80608o0.m98238a(MMApplicationContext.getContext(), MMApplicationContext.getProcessName(), str);
    }

    public String getNativeCrashDumpFilePath(String str) {
        return C80608o0.m98239b(MMApplicationContext.getContext(), MMApplicationContext.getProcessName(), str);
    }
}
