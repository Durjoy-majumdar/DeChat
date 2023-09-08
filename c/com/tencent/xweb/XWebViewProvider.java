package com.tencent.xweb;

import android.content.Context;
import android.os.Bundle;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.internal.IWebViewDatabase;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.updater.XWalkRuntimeUpdater;
import com.tencent.xweb.updater.XWebCorePredownScheduler;
import com.tencent.xweb.updater.XWebCoreScheduler;
import com.tencent.xweb.updater.XWebRuntimeInstaller;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.ConfigCmdProc;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.ConfigParser;
import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebDebugPage;
import com.tencent.xweb.util.XWebCommandHandler;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdater;
import java.util.Locale;

public class XWebViewProvider implements IWebViewProvider {
    public static final String TAG = "XWebViewProvider";
    private boolean mIsDebugMode = false;
    private boolean mIsDebugModeReplace = false;

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static final XWebViewProvider sInstance = new XWebViewProvider();

        private SingletonHolder() {
        }
    }

    public static XWebViewProvider getInstance() {
        return SingletonHolder.sInstance;
    }

    private Object handleRunXWebCommand(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Bundle bundle = objArr[0];
        if (!(bundle instanceof Bundle)) {
            return null;
        }
        XWebCommandHandler.runCommand(bundle);
        return null;
    }

    public void clearAllWebViewCache(Context context, boolean z) {
    }

    public void clearClientCertPreferences(Runnable runnable) {
    }

    public IWebView createWebView(WebView webView) {
        return null;
    }

    public Object execute(String str, Object[] objArr) {
        if (ConstValue.STR_CMD_TRY_LOAD_LOCAL_ASSET_RUNTIME.equals(str)) {
            return handleTryLoadLocalAssetRuntime(objArr);
        }
        if (ConstValue.STR_CMD_GET_EMBED_CORE_VERSION.equals(str)) {
            return handleGetEmbedCoreVersion();
        }
        if (ConstValue.STR_CMD_SET_DEBUG_MODE_REPLACE.equals(str)) {
            return handleSetDebugModeReplace();
        }
        if (ConstValue.STR_CMD_SET_DEBUG_MODE_NO_REPLACE.equals(str)) {
            return handleSetDebugModeNoReplace();
        }
        if (ConstValue.STR_CMD_SET_DEBUG_MODE_REPLACE_NOW.equals(str)) {
            return handleSetDebugModeReplaceNow(objArr);
        }
        if (ConstValue.STR_CMD_EXXCUTE_CMD_FROM_CONFIG.equals(str)) {
            return handleExecuteCmdFromConfig(objArr);
        }
        if (ConstValue.STR_CMD_GET_DEBUG_VIEW.equals(str)) {
            return handleGetDebugView(objArr);
        }
        if (ConstValue.STR_CMD_GET_UPDATER.equals(str)) {
            return handleGetRuntimeUpdater();
        }
        if (ConstValue.STR_CMD_GET_PLUGIN_UPDATER.equals(str)) {
            return handleGetPluginUpdater();
        }
        if (ConstValue.STR_CMD_CLEAR_SCHEDULER.equals(str)) {
            return handleClearScheduler();
        }
        if (ConstValue.STR_CMD_SET_RECHECK_COMMAND.equals(str)) {
            return handleSetRecheckCommand();
        }
        if (ConstValue.STR_CMD_BASE_CONTEXT_CHANGED.equals(str)) {
            return handleBaseContextChanged(objArr);
        }
        if (ConstValue.STR_CMD_FEATURE_SUPPORT.equals(str)) {
            return handleHasFeature(objArr);
        }
        if (ConstValue.STR_CMD_NATIVE_TRANS_INIT.equals(str)) {
            return handleNativeTrans(objArr);
        }
        if (ConstValue.STR_CMD_UPDATE_RESOURCE_LOCALE.equals(str)) {
            return handleUpdateResourceLocale(objArr);
        }
        if (ConstValue.STR_CMD_PRE_INIT_RENDER_PROCESS.equals(str)) {
            return handlePreinitRenderProcess();
        }
        if (ConstValue.STR_CMD_PRE_INIT_GPU_PROCESS.equals(str)) {
            return handlePreinitGpuProcess();
        }
        if (ConstValue.STR_CMD_FORCE_KILL_RENDER_PROCESS.equals(str)) {
            return handleForceKillRenderProcess();
        }
        if (ConstValue.STR_CMD_FORCE_KILL_GPU_PROCESS.equals(str)) {
            return handleForceKillGpuProcess();
        }
        if (ConstValue.STR_CMD_GET_RENDER_SANDBOX_PROCESS_MEMORY.equals(str)) {
            return handleGetRenderSandboxProcessMemory();
        }
        if (ConstValue.STR_CMD_ENABLE_CHECK_CERTIFICATE.equals(str)) {
            return handleEnableCheckCertificate(objArr);
        }
        if (ConstValue.STR_CMD_SET_FORCE_CHECK_UPDATE.equals(str)) {
            return handleSetForceCheckUpdate();
        }
        if (ConstValue.STR_CMD_RUN_XWEB_COMMAND.equals(str)) {
            return handleRunXWebCommand(objArr);
        }
        return null;
    }

    public String findAddress(String str) {
        return null;
    }

    public ICookieManager getCookieManager() {
        return null;
    }

    public IProfilerController getProfilerController() {
        return XWebProfilerController.getInstance();
    }

    public IWebViewContextWrapper getWebViewContextWrapper() {
        return null;
    }

    public IWebViewCoreWrapper getWebViewCoreWrapper() {
        return null;
    }

    public IWebViewDatabase getWebViewDatabase(Context context) {
        return null;
    }

    public IWebStorage getWebviewStorage() {
        return null;
    }

    public Object handleBaseContextChanged(Object[] objArr) {
        return null;
    }

    public Object handleClearScheduler() {
        XWebCorePredownScheduler.getXWebCorePredownScheduler().abandonCurrentScheduler();
        XWebCoreScheduler.getXWebCoreScheduler().abandonCurrentScheduler();
        return null;
    }

    public Object handleEnableCheckCertificate(Object[] objArr) {
        return invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_ENABLE_CHECK_CERTIFICATE, objArr);
    }

    public CommandCfg.CmdHandleRet handleExecuteCmdFromConfig(Object[] objArr) {
        return ConfigCmdProc.processCommand(objArr[0]);
    }

    public Object handleForceKillGpuProcess() {
        return invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_FORCE_KILL_GPU_PROCESS, (Object[]) null);
    }

    public Object handleForceKillRenderProcess() {
        return invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_FORCE_KILL_RENDER_PROCESS, (Object[]) null);
    }

    public Object handleGetDebugView(Object[] objArr) {
        return new WebDebugPage(objArr[0]);
    }

    public Object handleGetEmbedCoreVersion() {
        AbiUtil.is64bitApp();
        return 0;
    }

    public XWalkPluginUpdater handleGetPluginUpdater() {
        return new XWalkPluginUpdater();
    }

    public Object handleGetRenderSandboxProcessMemory() {
        return invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_GET_RENDER_SANDBOX_PROCESS_MEMORY, (Object[]) null);
    }

    public XWalkRuntimeUpdater handleGetRuntimeUpdater() {
        return new XWalkRuntimeUpdater();
    }

    public Object handleHasFeature(Object[] objArr) {
        if (getWebViewCoreWrapper() == null || !(objArr[0] instanceof Integer)) {
            return null;
        }
        return Boolean.valueOf(getWebViewCoreWrapper().hasFeature(objArr[0].intValue()));
    }

    public Object handleNativeTrans(Object[] objArr) {
        if (getWebViewCoreWrapper() == null) {
            return null;
        }
        Long l = objArr[0];
        if (!(l instanceof Long)) {
            return null;
        }
        getWebViewCoreWrapper().invokeNativeChannel(30003, new String[]{String.valueOf(l.longValue())});
        return null;
    }

    public Object handlePreinitGpuProcess() {
        return invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_PRE_INIT_GPU_PROCESS, (Object[]) null);
    }

    public Object handlePreinitRenderProcess() {
        return invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_PRE_INIT_RENDER_PROCESS, (Object[]) null);
    }

    public Object handleSetDebugModeNoReplace() {
        this.mIsDebugMode = true;
        this.mIsDebugModeReplace = false;
        return null;
    }

    public Object handleSetDebugModeReplace() {
        this.mIsDebugMode = true;
        this.mIsDebugModeReplace = true;
        return null;
    }

    public Object handleSetDebugModeReplaceNow(Object[] objArr) {
        if (!XWebEmbedSetting.getForbidDownloadCode()) {
            new XWebRuntimeInstaller().tryLoadLocalAssetRuntime(objArr[0], true);
        }
        XWebCommandHandler.killAllProcess(objArr[0]);
        return null;
    }

    public Object handleSetForceCheckUpdate() {
        XWebLog.m21911i(TAG, "handleSetForceCheckUpdate");
        Scheduler.sForceCheckUpdate = true;
        XWebCoreScheduler.getXWebCoreScheduler().resetLastFetchConfigTime();
        return null;
    }

    public Object handleSetRecheckCommand() {
        try {
            ConfigDef.Config parse = ConfigParser.parse(XWebFileUtil.getUpdateConfigFullPath());
            if (parse == null) {
                XWebLog.m21911i(TAG, "recheck cmds ConfigParser failed");
                return null;
            }
            CommandCfg.getInstance().applyCommand(parse.commands, parse.strConfigVer, true);
            WXWebReporter.idkeyReport(68, 1);
            return null;
        } catch (Throwable th) {
            XWebLog.m21911i(TAG, "recheck cmds failed, error:" + th);
        }
    }

    public Object handleTryLoadLocalAssetRuntime(Object[] objArr) {
        XWebLog.m21911i(TAG, "handleTryLoadLocalAssetRuntime, mIsDebugMode:" + this.mIsDebugMode + ", mIsDebugModeReplace:" + this.mIsDebugModeReplace);
        if (!this.mIsDebugMode || !(objArr[0] instanceof Context)) {
            return null;
        }
        if (!XWebEmbedSetting.getForbidDownloadCode()) {
            new XWebRuntimeInstaller().tryLoadLocalAssetRuntime(objArr[0], this.mIsDebugModeReplace);
            return null;
        }
        XWebLog.m21911i(TAG, "tryLoadLocalAssetRuntime, turn off dynamic code");
        return null;
    }

    public Object handleUpdateResourceLocale(Object[] objArr) {
        if (getWebViewContextWrapper() == null || !(objArr[0] instanceof Locale)) {
            return null;
        }
        getWebViewContextWrapper().updateResourceLocale(objArr[0]);
        return null;
    }

    public boolean hasInitedWebViewCore() {
        return false;
    }

    public boolean initWebviewCore(Context context, WebView.PreInitCallback preInitCallback) {
        return false;
    }

    public Object invokeRuntimeChannel(int i, Object[] objArr) {
        if (getWebViewCoreWrapper() != null) {
            return getWebViewCoreWrapper().invokeRuntimeChannel(i, objArr);
        }
        return null;
    }

    public boolean isSupportTranslateWebSite() {
        Object invokeRuntimeChannel = invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_SUPPORT_TRANLATE_WEB, (Object[]) null);
        if (invokeRuntimeChannel instanceof Boolean) {
            return ((Boolean) invokeRuntimeChannel).booleanValue();
        }
        return false;
    }
}
