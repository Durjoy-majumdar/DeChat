package com.tencent.xweb.pinus;

import android.content.Context;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.xweb.RuntimeToSdkChannel;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebClassLoaderWrapper;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.pinus.sdk.JNIUtils;
import com.tencent.xweb.pinus.sdk.PSLogChannelListener;
import com.tencent.xweb.pinus.sdk.PSNotifyChannelListener;
import com.tencent.xweb.report.KVReportForStandAloneChannel;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import org.xwalk.core.XWalkEnvironment;

public class PinusStandAloneChannel {
    private static final int LOADED_ARCH_NOT_MATCH = -1;
    private static final int LOADED_BY_RUNTIME = 1;
    private static final int LOADED_BY_SDK = 0;
    public static final String TAG = "PinusStandAloneChannel";
    private Boolean isSupportLoadXWebLibraryInRuntime;
    private ClassLoader mClassLoader;
    private long mFirstGetClassLoaderCostTime;
    private boolean mHasInited;
    private boolean mInitedResult;

    public static class SingletonHolder {
        public static final PinusStandAloneChannel sInstance = new PinusStandAloneChannel();

        private SingletonHolder() {
        }
    }

    private boolean checkCoreApk() {
        if (!new File(XWebFileUtil.getDownloadApkPath(XWalkEnvironment.getAvailableVersion())).exists()) {
            XWebLog.m21909e(TAG, "checkCoreApk, apk not exists");
            return false;
        }
        XWebLog.m21911i(TAG, "pinus core apk matched");
        return true;
    }

    public static PinusStandAloneChannel getInstance() {
        return SingletonHolder.sInstance;
    }

    private boolean initCoreBridge() {
        XWebLog.m21911i(TAG, "initCoreBridge start");
        try {
            new ReflectMethod(getBridgeClass("PSCoreBridge"), APMidasPluginInfo.LAUNCH_INTERFACE_INIT, (Class<?>[]) new Class[]{Context.class, Object.class}).invoke(null, this);
            return true;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "initCoreBridge error", th);
            return false;
        }
    }

    private boolean initLogChannel() {
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        if (availableVersion < 153) {
            XWebLog.m21913w(TAG, "initLogChannel, version(" + availableVersion + ") below SDK_SUPPORT_INVOKE_NOTIFY_MIN_APKVERSION");
            return false;
        }
        XWebLog.m21911i(TAG, "initLogChannel start");
        C201772 r0 = new PSLogChannelListener() {
            private String resetLogFileByInfo(String str) {
                return (str == null || !str.contains("XWeb.Core.")) ? str : str.replaceFirst("XWeb.Core.", "");
            }

            private String resetLogTagByFile(String str) {
                return (str == null || !str.contains("/")) ? str : "XWeb.Core";
            }

            public void onLogMessage(int i, String str, int i2, String str2) {
                XWebLog.m21911i(resetLogTagByFile(str), resetLogFileByInfo(str2));
            }
        };
        try {
            new ReflectMethod(getBridgeClass("PSViewDelegate"), "setLogCallBack", (Class<?>[]) new Class[]{Object.class}).invoke(r0);
            return true;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "setLogCallBack error", th);
            return false;
        }
    }

    private boolean initNotifyChannel() {
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        if (availableVersion < 153) {
            XWebLog.m21913w(TAG, "initNotifyChannel, version(" + availableVersion + ") below SDK_SUPPORT_INVOKE_NOTIFY_MIN_APKVERSION");
            return false;
        }
        XWebLog.m21911i(TAG, "initNotifyChannel start");
        C201761 r0 = new PSNotifyChannelListener() {
            public void onNotifyCallBackChannel(int i, Object[] objArr) {
                if (i == 50001) {
                    try {
                        WXWebReporter.idkeyReport(Long.parseLong(objArr[0]), Long.parseLong(objArr[1]), (long) Integer.parseInt(objArr[2]));
                    } catch (RuntimeException e) {
                        XWebLog.m21910e(PinusStandAloneChannel.TAG, "NotifyChannel error", e);
                    }
                } else if (i == 50002) {
                    WXWebReporter.setKVLog(Integer.parseInt(objArr[0]), objArr[1]);
                } else {
                    XWebLog.m21911i(PinusStandAloneChannel.TAG, "NotifyChannel called funid = " + i + " do not match");
                }
            }
        };
        try {
            new ReflectMethod(getBridgeClass("PSViewDelegate"), "setNotifyCallBackChannel", (Class<?>[]) new Class[]{Object.class}).invoke(r0);
            return true;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "setNotifyCallBackChannel error", th);
            return false;
        }
    }

    private boolean initRuntimeToSdkChannel() {
        XWebLog.m21911i(TAG, "initRuntimeToSdkChannel start");
        invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_SET_RUNTIME_TO_SDK_CHANNEL, RuntimeToSdkChannel.createRuntimeToSdkChannelObject());
        return true;
    }

    private boolean isSupportStandAloneMode() {
        try {
            Object invoke = new ReflectMethod(getBridgeClass("PSCoreBridge"), "isSupportStandAloneMode", (Class<?>[]) new Class[0]).invoke(new Object[0]);
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "isSupportStandAloneMode error", th);
            return false;
        }
    }

    private boolean loadNativeLibrary() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!loadNativeLibraryDefault()) {
            loadNativeLibraryBySDK();
        }
        XWebLog.m21911i(TAG, "###### loadNativeLibrary, costTime:" + (System.currentTimeMillis() - currentTimeMillis));
        return true;
    }

    private boolean loadNativeLibraryBySDK() {
        try {
            loadNativeLibraryInternal();
            if (((Boolean) new ReflectMethod(getBridgeClass("PSViewDelegate"), "checkCoreArchitecture", (Class<?>[]) new Class[0]).invoke(new Object[0])).booleanValue()) {
                return true;
            }
            WXWebReporter.idkeyReport(191, 1);
            XWebLog.m21909e(TAG, "Mismatch of CPU architecture current device abi is " + AbiUtil.getDeviceAbi() + ", runtime abi is " + AbiUtil.getRuntimeAbi() + ", core detail is " + XWalkEnvironment.getAvailableVersionDetail());
            return false;
        } catch (RuntimeException e) {
            XWebLog.m21910e(TAG, "checkCoreArchitecture, error", e);
            XWebLog.m21909e(TAG, "current device abi is " + AbiUtil.getDeviceAbi() + ", runtime abi is " + AbiUtil.getRuntimeAbi() + ", core detail is " + XWalkEnvironment.getAvailableVersionDetail());
            return false;
        }
    }

    private boolean loadNativeLibraryDefault() {
        try {
            ReflectMethod reflectMethod = new ReflectMethod(getBridgeClass("PSViewDelegate"), "loadXWebLibrary", (Class<?>[]) new Class[]{Context.class, String.class});
            if (reflectMethod.isNull()) {
                return false;
            }
            int intValue = ((Integer) reflectMethod.invoke(XWalkEnvironment.getApplicationContext(), XWebFileUtil.getExtractedCoreDir(XWalkEnvironment.getAvailableVersion()))).intValue();
            XWebLog.m21911i(TAG, "loadXWebLibrary ret:" + intValue);
            if (intValue == 0) {
                return false;
            }
            if (intValue == -1) {
                WXWebReporter.idkeyReport(191, 1);
                WXWebReporter.idkeyReport(1749, 56, 1);
                XWebLog.m21909e(TAG, "Mismatch of CPU architecture current device abi is " + AbiUtil.getDeviceAbi() + ", runtime abi is " + AbiUtil.getRuntimeAbi() + ", core detail is " + XWalkEnvironment.getAvailableVersionDetail());
            }
            return true;
        } catch (RuntimeException e) {
            XWebLog.m21910e(TAG, "checkCoreArchitecture, error", e);
            XWebLog.m21909e(TAG, "current device abi is " + AbiUtil.getDeviceAbi() + ", runtime abi is " + AbiUtil.getRuntimeAbi() + ", core detail is " + XWalkEnvironment.getAvailableVersionDetail());
            return true;
        }
    }

    private void loadNativeLibraryInternal() {
        try {
            String extractedCoreDir = XWebFileUtil.getExtractedCoreDir(XWalkEnvironment.getAvailableVersion());
            StringBuilder sb = new StringBuilder();
            sb.append("loadNativeLibrary, path:");
            sb.append(extractedCoreDir);
            String str = File.separator;
            sb.append(str);
            sb.append(XWalkEnvironment.PINUS_SO_NAME);
            XWebLog.m21911i(TAG, sb.toString());
            System.load(extractedCoreDir + str + XWalkEnvironment.PINUS_SO_NAME);
        } catch (Error e) {
            XWebLog.m21909e(TAG, "loadNativeLibraryInternal, error:" + e);
            throw new RuntimeException(e);
        }
    }

    private boolean setStandAloneMode(boolean z) {
        try {
            new ReflectMethod(getBridgeClass("PSCoreBridge"), "setStandAloneMode", (Class<?>[]) new Class[]{Boolean.TYPE}).invoke(Boolean.valueOf(z));
            return true;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "setStandAloneMode error", th);
            return false;
        }
    }

    private boolean supportLoadXWebLibraryInRuntimeInner(ClassLoader classLoader) {
        try {
            ReflectMethod reflectMethod = new ReflectMethod(classLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate"), "supportLoadXWebLibrary", (Class<?>[]) new Class[0]);
            if (reflectMethod.isNull()) {
                XWebLog.m21911i(TAG, "supportLoadXWebLibraryInRuntime, no such method");
                return false;
            }
            Object invoke = reflectMethod.invoke(new Object[0]);
            if (invoke instanceof Boolean) {
                XWebLog.m21911i(TAG, "supportLoadXWebLibraryInRuntime, result:" + invoke);
                return ((Boolean) invoke).booleanValue();
            }
            XWebLog.m21911i(TAG, "supportLoadXWebLibraryInRuntime, result:false");
            return false;
        } catch (Exception e) {
            XWebLog.m21910e(TAG, "supportLoadXWebLibraryInRuntime, error", e);
            return false;
        }
    }

    public Class<?> getBridgeClass(String str) {
        try {
            ClassLoader classLoader = getClassLoader();
            if (classLoader != null) {
                return classLoader.loadClass("com.tencent.xweb.pinus." + str);
            }
            XWebLog.m21913w(TAG, "getBridgeClass, classloader is null");
            return null;
        } catch (Throwable th) {
            XWebLog.m21913w(TAG, "getBridgeClass failed, class:" + str + ", error:" + th);
            return null;
        }
    }

    public synchronized ClassLoader getClassLoader() {
        ClassLoader classLoader = this.mClassLoader;
        if (classLoader != null) {
            return classLoader;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.mClassLoader = XWebClassLoaderWrapper.getXWebClassLoader();
            this.mFirstGetClassLoaderCostTime = System.currentTimeMillis() - currentTimeMillis;
            XWebLog.addInitializeLog(TAG, "getClassLoader, classLoader:" + this.mClassLoader + ", costTime:" + this.mFirstGetClassLoaderCostTime);
            return this.mClassLoader;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getClassLoader error", th);
            return null;
        }
    }

    public boolean hasFeature(int i) {
        Object invokeRuntimeChannel = invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_HAS_FEATURE, new Object[]{Integer.valueOf(i)});
        if (invokeRuntimeChannel instanceof Boolean) {
            return ((Boolean) invokeRuntimeChannel).booleanValue();
        }
        return false;
    }

    public synchronized boolean initChannels(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (this) {
            if (this.mHasInited) {
                XWebLog.m21913w(TAG, "initChannels, already inited, result:" + this.mInitedResult);
                boolean z5 = this.mInitedResult;
                return z5;
            }
            this.mInitedResult = false;
            KVReportForStandAloneChannel kVReportForStandAloneChannel = new KVReportForStandAloneChannel();
            kVReportForStandAloneChannel.startInitChannels();
            kVReportForStandAloneChannel.setWebViewKind(WebView.WebViewKind.WV_KIND_PINUS.ordinal());
            int availableVersion = XWalkEnvironment.getAvailableVersion();
            kVReportForStandAloneChannel.setApkVersion(availableVersion);
            kVReportForStandAloneChannel.setStandAloneMode(z3);
            XWebLog.addInitializeLog(TAG, "initChannels, isStandAloneMode:" + z3 + ", apkVersion:" + availableVersion);
            if (z3) {
                WXWebReporter.idkeyReport(1749, 59, 1);
            } else {
                WXWebReporter.idkeyReport(1749, 61, 1);
            }
            if (availableVersion == -1) {
                kVReportForStandAloneChannel.finishInitChannels(2);
                WXWebReporter.idkeyReport(1749, 49, 1);
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ClassLoader classLoader = getClassLoader();
            if (classLoader == null) {
                kVReportForStandAloneChannel.finishInitChannels(3);
                XWebLog.addInitializeLog(TAG, "initChannels, create class loader failed");
                WXWebReporter.idkeyReport(1749, 50, 1);
                return false;
            }
            kVReportForStandAloneChannel.setGetClassLoaderCostTime(System.currentTimeMillis() - currentTimeMillis);
            kVReportForStandAloneChannel.setFirstGetClassLoaderCostTime(this.mFirstGetClassLoaderCostTime);
            if (!supportLoadXWebLibraryInRuntime(classLoader)) {
                JNIUtils.setClassLoader(classLoader);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            boolean initCoreBridge = initCoreBridge();
            XWebLog.addInitializeLog(TAG, "initChannels, initCoreBridgeResult:" + initCoreBridge);
            if (!initCoreBridge) {
                kVReportForStandAloneChannel.finishInitChannels(4);
                WXWebReporter.idkeyReport(1749, 51, 1);
                return false;
            }
            kVReportForStandAloneChannel.setInitCoreBridgeCostTime(System.currentTimeMillis() - currentTimeMillis2);
            long currentTimeMillis3 = System.currentTimeMillis();
            if (z3) {
                boolean isSupportStandAloneMode = isSupportStandAloneMode();
                XWebLog.addInitializeLog(TAG, "initChannels, isSupportStandAloneMode:" + isSupportStandAloneMode);
                if (isSupportStandAloneMode) {
                    boolean standAloneMode = setStandAloneMode(true);
                    XWebLog.addInitializeLog(TAG, "initChannels, setStandAloneModeResult:" + standAloneMode);
                    if (!standAloneMode) {
                        kVReportForStandAloneChannel.finishInitChannels(5);
                        WXWebReporter.idkeyReport(1749, 57, 1);
                        return false;
                    }
                } else {
                    WXWebReporter.idkeyReport(1749, 58, 1);
                    XWebLog.addInitializeLog(TAG, "initChannels, enable fullscreen video try runtime:" + z4);
                    return z4;
                }
            } else {
                boolean standAloneMode2 = setStandAloneMode(false);
                XWebLog.addInitializeLog(TAG, "initChannels, setStandAloneModeResult:" + standAloneMode2);
                boolean loadNativeLibrary = loadNativeLibrary();
                XWebLog.addInitializeLog(TAG, "initChannels, loadLibraryResult:" + loadNativeLibrary);
                if (loadNativeLibrary) {
                    if (checkCoreApk()) {
                        kVReportForStandAloneChannel.setLoadLibraryCostTime(System.currentTimeMillis() - currentTimeMillis3);
                    }
                }
                kVReportForStandAloneChannel.finishInitChannels(5);
                WXWebReporter.idkeyReport(1749, 55, 1);
                return false;
            }
            long currentTimeMillis4 = System.currentTimeMillis();
            boolean initNotifyChannel = initNotifyChannel();
            XWebLog.addInitializeLog(TAG, "initChannels, initNotifyChannelResult:" + initNotifyChannel);
            if (!initNotifyChannel) {
                WXWebReporter.idkeyReport(1749, 52, 1);
            }
            kVReportForStandAloneChannel.setNotifyChannelCostTime(System.currentTimeMillis() - currentTimeMillis4);
            long currentTimeMillis5 = System.currentTimeMillis();
            boolean initRuntimeToSdkChannel = initRuntimeToSdkChannel();
            XWebLog.addInitializeLog(TAG, "initChannels, initRuntimeToSdkChannelResult:" + initRuntimeToSdkChannel);
            if (!initNotifyChannel) {
                WXWebReporter.idkeyReport(1749, 53, 1);
            }
            kVReportForStandAloneChannel.setRuntimeToSdkChannelCostTime(System.currentTimeMillis() - currentTimeMillis5);
            long currentTimeMillis6 = System.currentTimeMillis();
            boolean initLogChannel = initLogChannel();
            XWebLog.addInitializeLog(TAG, "initChannels, initLogChannelResult:" + initLogChannel);
            if (!initNotifyChannel) {
                WXWebReporter.idkeyReport(1749, 54, 1);
            }
            kVReportForStandAloneChannel.setLogChannelCostTime(System.currentTimeMillis() - currentTimeMillis6);
            this.mHasInited = true;
            this.mInitedResult = true;
            if (z3) {
                WXWebReporter.idkeyReport(1749, 60, 1);
            } else {
                WXWebReporter.idkeyReport(1749, 62, 1);
            }
            kVReportForStandAloneChannel.finishInitChannels(1);
            XWebLog.m21911i(TAG, "###### initChannels, costTime:" + kVReportForStandAloneChannel.getInitChannelsCostTime());
            boolean z6 = this.mInitedResult;
            return z6;
        }
    }

    public boolean invokeNativeChannel(int i, Object[] objArr) {
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        if (availableVersion < 153) {
            XWebLog.m21913w(TAG, "invokeNativeChannel, version(" + availableVersion + ") below SDK_SUPPORT_INVOKE_NOTIFY_MIN_APKVERSION");
            return false;
        }
        try {
            XWebLog.m21911i(TAG, "invokeNativeChannel, funid:" + i);
            new ReflectMethod(getBridgeClass("PSViewDelegate"), "invokeNativeChannel", (Class<?>[]) new Class[]{Integer.TYPE, Object[].class}).invoke(Integer.valueOf(i), objArr);
            return true;
        } catch (RuntimeException e) {
            XWebLog.m21909e(TAG, "invokeNativeChannel RuntimeException:" + e);
            WXWebReporter.invokeRuntimeChannelRuntimeException();
            return false;
        } catch (ClassCircularityError e2) {
            XWebLog.m21909e(TAG, "invokeNativeChannel ClassCircularityError:" + e2);
            WXWebReporter.invokeRuntimeChannelClassCircularityError();
            return false;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "invokeNativeChannel error", th);
            WXWebReporter.invokeRuntimeChannelException();
            return false;
        }
    }

    public Object invokeRuntimeChannel(int i, Object[] objArr) {
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        if (availableVersion < 255) {
            XWebLog.m21913w(TAG, "invokeRuntimeChannel, version(" + availableVersion + ") below SDK_SUPPORT_INVOKE_RUNTIME_MIN_APKVERSION");
            return null;
        }
        try {
            return new ReflectMethod(getBridgeClass("PSViewDelegate"), "invokeRuntimeChannel", (Class<?>[]) new Class[]{Integer.TYPE, Object[].class}).invoke(Integer.valueOf(i), objArr);
        } catch (RuntimeException e) {
            XWebLog.m21909e(TAG, "invokeRuntimeChannel RuntimeException:" + e);
            WXWebReporter.invokeRuntimeChannelRuntimeException();
            return null;
        } catch (ClassCircularityError e2) {
            XWebLog.m21909e(TAG, "invokeRuntimeChannel ClassCircularityError:" + e2);
            WXWebReporter.invokeRuntimeChannelClassCircularityError();
            return null;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "invokeRuntimeChannel error", th);
            WXWebReporter.invokeRuntimeChannelException();
            return null;
        }
    }

    public boolean supportLoadXWebLibraryInRuntime(ClassLoader classLoader) {
        if (this.isSupportLoadXWebLibraryInRuntime == null) {
            this.isSupportLoadXWebLibraryInRuntime = Boolean.valueOf(supportLoadXWebLibraryInRuntimeInner(classLoader));
        }
        return this.isSupportLoadXWebLibraryInRuntime.booleanValue();
    }

    private PinusStandAloneChannel() {
        this.mHasInited = false;
        this.mInitedResult = false;
        this.mFirstGetClassLoaderCostTime = -1;
        this.isSupportLoadXWebLibraryInRuntime = null;
    }
}
