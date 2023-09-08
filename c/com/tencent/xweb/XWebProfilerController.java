package com.tencent.xweb;

import android.os.Bundle;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.NumberUtil;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class XWebProfilerController implements IProfilerController {
    private static final String TAG = "XWebProfilerController";
    private boolean mHasProfileInit;
    private final ConcurrentMap<String, IProfileResultCallback> mResultCallbackMap;

    public static final class Holder {
        /* access modifiers changed from: private */
        public static final XWebProfilerController INSTANCE = new XWebProfilerController();

        private Holder() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r0 = (java.lang.String) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dispatchResultNG(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Object[]
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r0 = 0
            r0 = r5[r0]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0028
            int r1 = r5.length
            r2 = 2
            if (r1 >= r2) goto L_0x0013
            goto L_0x0028
        L_0x0013:
            java.lang.String r0 = (java.lang.String) r0
            java.util.concurrent.ConcurrentMap<java.lang.String, com.tencent.xweb.IProfileResultCallback> r1 = r4.mResultCallbackMap
            java.lang.Object r1 = r1.get(r0)
            com.tencent.xweb.IProfileResultCallback r1 = (com.tencent.xweb.IProfileResultCallback) r1
            if (r1 == 0) goto L_0x0028
            r2 = 1
            int r3 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r5, r2, r3)
            r1.onReceiveProfileResult(r0, r5)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.XWebProfilerController.dispatchResultNG(java.lang.Object):void");
    }

    public static XWebProfilerController getInstance() {
        return Holder.INSTANCE;
    }

    private boolean setNeedResultForwardToSdk(boolean z, String str) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider == null) {
            return false;
        }
        Object invokeRuntimeChannel = webViewProvider.invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_XPROFILE_NEED_FORWARD_TO_SDK, new Object[]{Boolean.valueOf(z), str});
        return (invokeRuntimeChannel instanceof Boolean) && ((Boolean) invokeRuntimeChannel).booleanValue();
    }

    public void forceEnableFrameCostProfile(boolean z) {
        if (z) {
            WXWebReporter.onFpsProfileForceEnabledFromClient();
            setProfileConfig(ConstValue.CATEGORY_FRAME_COST, 10000, 0, true);
            return;
        }
        WXWebReporter.onFpsProfileForceDisabledFromClient();
        setProfileConfig(ConstValue.CATEGORY_FRAME_COST_DISABLE, 10000, 0, true);
    }

    public void forceFlushCategory(String str) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null) {
            webViewProvider.invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_XPROFILE_FORCE_FLUSH, new Object[]{str});
        }
    }

    public void initProfile() {
        int i;
        if (!this.mHasProfileInit) {
            String enabledTraceCategory = CommandCfg.getInstance().getEnabledTraceCategory(WebView.getModuleName());
            int traceRatioInTenThousand = CommandCfg.getInstance().getTraceRatioInTenThousand(WebView.getModuleName());
            String cmd = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_ENABLE_WINDOW_PERFORMANCE_SAMPLE_RATIO, WebView.getModuleName());
            NumberUtil.ParseResult safeParseInt = NumberUtil.safeParseInt(cmd);
            if (safeParseInt.parseSuc) {
                i = safeParseInt.intValue();
            } else {
                XWebLog.m21913w(TAG, "initProfile error, enableWindowPerformanceSampleRatioStr:" + cmd);
                i = 0;
            }
            XWebProfilerController instance = getInstance();
            XWebLog.m21911i(TAG, "setProfileConfig with enabledTraceCategory: " + enabledTraceCategory + " traceSampleRatio: " + traceRatioInTenThousand + " enableWindowPerformanceSampleRatio: " + i);
            instance.setProfileConfig(enabledTraceCategory, traceRatioInTenThousand, i, false);
            this.mHasProfileInit = true;
        }
    }

    public void onProfileStop(Object obj) {
        dispatchResultNG(obj);
    }

    public void setAllKindsFpsProfileEnable(boolean z) {
        if (z) {
            WXWebReporter.onAllKindsFpsProfileEnabledFromClient();
        } else {
            WXWebReporter.onAllKindsFpsProfileDisabledFromClient();
        }
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null) {
            webViewProvider.invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_XPROFILE_ENABLE_ALL_KINDS_FPS, new Object[]{Boolean.valueOf(z)});
        }
    }

    public void setProfileConfig(String str, int i, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("enabledTraceCategory", str);
        bundle.putInt("traceSampleRatio", i);
        bundle.putInt(CommandDef.COMMAND_ENABLE_WINDOW_PERFORMANCE_SAMPLE_RATIO, i2);
        bundle.putBoolean("forceUpdateEnabledCategory", z);
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null && webViewProvider.getWebViewCoreWrapper() != null) {
            IWebViewCoreWrapper webViewCoreWrapper = webViewProvider.getWebViewCoreWrapper();
            if (webViewCoreWrapper.hasFeature(4)) {
                XWebLog.m21911i(TAG, "setProfileConfig, INTERNAL_XPROFILE_NG");
                webViewCoreWrapper.invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_XPROFILE_SET, new Object[]{bundle});
            } else if (webViewCoreWrapper.hasFeature(0)) {
                try {
                    Class<?> cls = webViewCoreWrapper.getClass("com.tencent.xweb.xprofile.XProfileManager");
                    if (cls != null) {
                        new ReflectMethod(cls, "setProfileConfig", (Class<?>[]) new Class[]{Bundle.class}).invoke(bundle);
                    }
                } catch (Throwable th) {
                    XWebLog.m21910e(TAG, "setProfileConfig, error", th);
                }
            }
        }
    }

    public boolean setProfileResultCallback(String str, IProfileResultCallback iProfileResultCallback) {
        if (iProfileResultCallback == null) {
            if (!this.mResultCallbackMap.containsKey(str)) {
                return false;
            }
            this.mResultCallbackMap.remove(str);
            setNeedResultForwardToSdk(false, str);
            return true;
        } else if (!this.mResultCallbackMap.containsKey(str) && !setNeedResultForwardToSdk(true, str)) {
            return false;
        } else {
            this.mResultCallbackMap.put(str, iProfileResultCallback);
            return true;
        }
    }

    private XWebProfilerController() {
        this.mResultCallbackMap = new ConcurrentHashMap();
    }
}
