package com.tencent.xweb.pinus;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.xweb.IXWebPreferences;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebInitializer;
import com.tencent.xweb.XWebPreferences;
import com.tencent.xweb.XWebProfileManager;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.report.KVReportForMultiProcess;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import java.io.FilenameFilter;
import org.xwalk.core.XWalkEnvironment;

public class PSInitializerWrapper extends XWebInitializer {
    private static final String TAG = "PSInitializerWrapper";

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static final PSInitializerWrapper sInstance = new PSInitializerWrapper();

        private SingletonHolder() {
        }
    }

    private static void cleanLastCrashDumpFiles() {
        File[] listFiles;
        try {
            if (XWebBrowserProcessHelper.getCrashDumpFileCallback() != null) {
                String crashDumpFolderPath = XWebBrowserProcessHelper.getCrashDumpFileCallback().getCrashDumpFolderPath();
                if (TextUtils.isEmpty(crashDumpFolderPath)) {
                    XWebLog.m21911i(TAG, "cleanLastCrashDumpFiles, crash folder path is null");
                    return;
                }
                XWebLog.m21911i(TAG, "cleanLastCrashDumpFiles, crashDumpFolderPath:" + crashDumpFolderPath);
                File file = new File(crashDumpFolderPath);
                final String processName = XWalkEnvironment.getProcessName();
                if (file.exists() && (listFiles = file.listFiles(new FilenameFilter() {
                    public boolean accept(File file, String str) {
                        return (str.startsWith("java_") || str.startsWith("NativeCrash_")) && str.contains(processName.replace(XVFSFile.PATH_SEPARATOR_CHAR, '_')) && (str.contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX) || str.contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_GPU) || str.contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_RENDER_UNSANDBOX));
                    }
                })) != null) {
                    for (File file2 : listFiles) {
                        if (file2.length() == 0) {
                            XWebLog.m21911i(TAG, "cleanLastCrashDumpFiles, file:" + file2.getName());
                            file2.delete();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "cleanLastCrashDumpFiles error", th);
        }
    }

    public static PSInitializerWrapper getInstance() {
        return SingletonHolder.sInstance;
    }

    private void initViewDelegate() {
        Class<String> cls = String.class;
        XWebLog.m21911i(TAG, "initViewDelegate");
        Class<?> bridgeClass = PSCoreWrapper.getInstance().getBridgeClass("PSViewDelegate");
        cleanLastCrashDumpFiles();
        int multiProcessType = XWalkEnvironment.getMultiProcessType();
        ReflectMethod reflectMethod = new ReflectMethod(bridgeClass, "preInit", (Class<?>[]) new Class[]{Bundle.class});
        if (!reflectMethod.isNull()) {
            Bundle bundle = new Bundle();
            bundle.putString(IXWebPreferences.XWEB_LANGUAGE, XWalkEnvironment.getLocaleString());
            bundle.putBoolean(IXWebPreferences.XWEB_RENDERER_SANDBOX, XWalkEnvironment.getEnableSandbox());
            bundle.putBoolean("checkCertificate", XWalkEnvironment.getEnableCheckCertificate());
            bundle.putBundle("extendBundle", XWalkEnvironment.getExtendBundle());
            reflectMethod.invoke(bundle);
        }
        new ReflectMethod(bridgeClass, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, (Class<?>[]) new Class[]{Context.class, Context.class, Integer.TYPE, cls, cls, cls, cls}).invoke(null, this.webViewContextWrapper, Integer.valueOf(multiProcessType), String.valueOf(XWalkEnvironment.getAvailableVersion()), String.valueOf(XWalkEnvironment.SDK_VERSION), XWalkEnvironment.getPrivilegedServicesName(), XWalkEnvironment.getSandboxedServicesName());
        if (XWalkEnvironment.getPackageName().equalsIgnoreCase(XWalkEnvironment.getProcessName())) {
            KVReportForMultiProcess.report();
        }
    }

    public boolean doInitWebViewCore(int i) {
        XWebLog.addInitializeLog(TAG, "doInitWebViewCore, version:" + i);
        boolean initChannels = PinusStandAloneChannel.getInstance().initChannels(false, false);
        XWebLog.addInitializeLog(TAG, "doInitWebViewCore, result:" + initChannels);
        return initChannels;
    }

    public void postInitWebViewCore(int i) {
        XWebLog.addInitializeLog(TAG, "postInitWebViewCore, version:" + i);
        this.webViewCoreWrapper = new PSCoreWrapper();
        this.webViewContextWrapper = new PSContextWrapper(XWalkEnvironment.getApplicationContext(), i);
        XWebPreferences.setWebPreferences(new PinusPreferences());
        initViewDelegate();
        setLocalStorageSuffix();
        XWebProfileManager.initProfile();
        WebView.onXWebCoreInited();
    }

    private PSInitializerWrapper() {
    }
}
