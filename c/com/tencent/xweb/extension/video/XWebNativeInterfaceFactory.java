package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.pinus.PSContextWrapper;
import com.tencent.xweb.pinus.PSCoreWrapper;
import com.tencent.xweb.pinus.PinusStandAloneChannel;
import com.tencent.xweb.report.KVReportForVideoFullscreen;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import org.xwalk.core.XWalkEnvironment;

public class XWebNativeInterfaceFactory {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "XWebNativeInterfaceFactory";
    private static final String VIDEO_NATIVE_RUNTIME_CLASS_NAME = "org.xwalk.core.internal.videofullscreen.XWebNativeInterfaceInternal";

    public static class VideoNativeInterfaceRuntime implements VideoNativeInterface {
        public static final String TAG = "VideoNativeInterfaceRuntime";
        private final ReflectMethod disableJsCallbackMethod;
        private final ReflectMethod evaluteJavascriptMethod;
        private final ReflectMethod hasEnteredFullscreenMethod;
        private final ReflectMethod initActivityObjectStringMethod;
        private final ReflectMethod initConfigsBundleMethod;
        private final Object mReflectionObject;
        private final ReflectMethod onHideCustomViewMethod;
        private final ReflectMethod onShowCustomViewMethod;
        private final ReflectMethod registerJavascriptInterfaceMethod;
        private final ReflectMethod setVideoJsCallbackMethod;
        private final ReflectMethod supportSetRequestedOrientationCallbackMethod;
        private final ReflectMethod videoChangeStatusMethod;
        private final ReflectMethod videoExitFullscreenMethod;
        private final ReflectMethod videoMuteMethod;
        private final ReflectMethod videoPauseMethod;
        private final ReflectMethod videoPlayMethod;
        private final ReflectMethod videoPlaybackRateMethod;
        private final ReflectMethod videoSeekMethod;

        public VideoNativeInterfaceRuntime(Object obj) {
            Class<Object> cls = Object.class;
            this.mReflectionObject = obj;
            this.initActivityObjectStringMethod = new ReflectMethod(obj, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, (Class<?>[]) new Class[]{Activity.class, View.class, View.class, Context.class, String.class});
            this.initConfigsBundleMethod = new ReflectMethod(obj, "initConfigs", (Class<?>[]) new Class[]{Bundle.class});
            Class cls2 = Boolean.TYPE;
            this.evaluteJavascriptMethod = new ReflectMethod(obj, "evaluteJavascript", (Class<?>[]) new Class[]{cls2, cls2});
            this.onShowCustomViewMethod = new ReflectMethod(obj, "onShowCustomView", (Class<?>[]) new Class[]{View.class, WebChromeClient.CustomViewCallback.class});
            this.onHideCustomViewMethod = new ReflectMethod(obj, "onHideCustomView", (Class<?>[]) new Class[0]);
            this.hasEnteredFullscreenMethod = new ReflectMethod(obj, "hasEnteredFullscreen", (Class<?>[]) new Class[0]);
            this.registerJavascriptInterfaceMethod = new ReflectMethod(obj, "registerJavascriptInterface", (Class<?>[]) new Class[]{cls});
            this.disableJsCallbackMethod = new ReflectMethod(obj, "disableJsCallback", (Class<?>[]) new Class[]{cls2});
            this.setVideoJsCallbackMethod = new ReflectMethod(obj, "setVideoJsCallback", (Class<?>[]) new Class[]{cls});
            this.videoChangeStatusMethod = new ReflectMethod(obj, "videoChangeStatus", (Class<?>[]) new Class[0]);
            this.videoPlayMethod = new ReflectMethod(obj, "videoPlay", (Class<?>[]) new Class[0]);
            this.videoPauseMethod = new ReflectMethod(obj, "videoPause", (Class<?>[]) new Class[0]);
            this.videoSeekMethod = new ReflectMethod(obj, "videoSeek", (Class<?>[]) new Class[]{Double.TYPE});
            this.videoMuteMethod = new ReflectMethod(obj, "videoMute", (Class<?>[]) new Class[]{cls2});
            this.videoPlaybackRateMethod = new ReflectMethod(obj, "videoPlaybackRate", (Class<?>[]) new Class[]{Double.TYPE});
            this.videoExitFullscreenMethod = new ReflectMethod(obj, "videoExitFullscreen", (Class<?>[]) new Class[0]);
            this.supportSetRequestedOrientationCallbackMethod = new ReflectMethod(obj, "supportSetRequestedOrientationCallback", (Class<?>[]) new Class[0]);
        }

        public void disableJsCallback(boolean z) {
            try {
                this.disableJsCallbackMethod.invoke(Boolean.valueOf(z));
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "disableJsCallback error:" + th);
            }
        }

        public void evaluteJavascript(boolean z, boolean z2) {
            try {
                this.evaluteJavascriptMethod.invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "evaluteJavascript error:" + th);
            }
        }

        public boolean hasEnteredFullscreen() {
            try {
                return ((Boolean) this.hasEnteredFullscreenMethod.invoke(new Object[0])).booleanValue();
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "hasEnteredFullscreen error:" + th);
                return false;
            }
        }

        public void init(Activity activity, View view, View view2, Context context, String str) {
            try {
                this.initActivityObjectStringMethod.invoke(activity, view, view2, context, str);
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "init error:" + th);
                throw new Exception(th);
            }
        }

        public void initConfigs(Bundle bundle) {
            try {
                this.initConfigsBundleMethod.invoke(bundle);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "initConfigs error", th);
            }
        }

        public void onHideCustomView() {
            try {
                this.onHideCustomViewMethod.invoke(new Object[0]);
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "onHideCustomView error:" + th);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            try {
                this.onShowCustomViewMethod.invoke(view, customViewCallback);
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "onShowCustomView error:" + th);
            }
        }

        public void registerJavascriptInterface(Object obj) {
            try {
                this.registerJavascriptInterfaceMethod.invoke(obj);
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "registerJavascriptInterface error:" + th);
            }
        }

        public boolean setVideoJsCallback(Object obj) {
            XWalkPlugin plugin = XWalkPluginManager.getPlugin(XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO);
            if (plugin == null || plugin.getAvailableVersion() < 10) {
                if (plugin != null) {
                    XWebLog.m21911i(TAG, "setVideoJsCallback return false, fullScreenVideoPlugin is not available, version:" + plugin.getAvailableVersion());
                } else {
                    XWebLog.m21911i(TAG, "setVideoJsCallback return false, fullScreenVideoPlugin is not available");
                }
                return false;
            }
            try {
                return ((Boolean) this.setVideoJsCallbackMethod.invoke(obj)).booleanValue();
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "setVideoJsCallback invoke error:" + th);
                return false;
            }
        }

        public boolean supportSetRequestedOrientationCallback() {
            try {
                return ((Boolean) this.supportSetRequestedOrientationCallbackMethod.invoke(new Object[0])).booleanValue();
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "supportSetRequestedOrientationCallback invoke error:" + th);
                return false;
            }
        }

        public void videoChangeStatus() {
            try {
                this.videoChangeStatusMethod.invoke(new Object[0]);
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "videoChangeStatus invoke error:" + th);
            }
        }

        public void videoExitFullscreen() {
            try {
                this.videoExitFullscreenMethod.invoke(new Object[0]);
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "videoExitFullscreenMethod invoke error:" + th);
            }
        }

        public void videoMute(boolean z) {
            try {
                this.videoMuteMethod.invoke(Boolean.valueOf(z));
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "videoMute invoke error:" + th);
            }
        }

        public void videoPause() {
            try {
                this.videoPauseMethod.invoke(new Object[0]);
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "videoPause invoke error:" + th);
            }
        }

        public void videoPlay() {
            try {
                this.videoPlayMethod.invoke(new Object[0]);
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "videoPlay invoke error:" + th);
            }
        }

        public void videoPlaybackRate(double d) {
            try {
                this.videoPlaybackRateMethod.invoke(Double.valueOf(d));
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "videoPlaybackRate invoke error:" + th);
            }
        }

        public void videoSeek(double d) {
            try {
                this.videoSeekMethod.invoke(Double.valueOf(d));
            } catch (Throwable th) {
                XWebLog.m21911i(TAG, "videoSeek invoke error:" + th);
            }
        }
    }

    public static VideoNativeInterface createXWebNativeInterface(WebView.WebViewKind webViewKind, Context context, WebView webView, View view, String str) {
        boolean fullscreenVideoEnableSysTryRuntime = webViewKind == WebView.WebViewKind.WV_KIND_SYS ? CommandCfg.getInstance().getFullscreenVideoEnableSysTryRuntime() : true;
        XWebLog.m21911i(TAG, "createXWebNativeInterface, webCoreType:" + webViewKind + ", tryRuntimeVideoNativeInterface:" + fullscreenVideoEnableSysTryRuntime);
        if (fullscreenVideoEnableSysTryRuntime) {
            VideoNativeInterfaceRuntime createXWebNativeInterfaceByPinus = PSCoreWrapper.getInstance() != null ? createXWebNativeInterfaceByPinus(context, webView, view, str) : createXWebNativeInterfaceByOthers(context, webView, view, str);
            if (createXWebNativeInterfaceByPinus != null) {
                XWebLog.m21911i(TAG, "createXWebNativeInterface, use [runtime] class XWebNativeInterfaceInternal");
                KVReportForVideoFullscreen.report(webViewKind, 2, 1, false, (String) null);
                return createXWebNativeInterfaceByPinus;
            }
        }
        XWebLog.m21911i(TAG, "createXWebNativeInterface, use [sdk] class XWebNativeInterface");
        XWebNativeInterface xWebNativeInterface = new XWebNativeInterface();
        xWebNativeInterface.init((Activity) null, webView, view, view.getContext(), str);
        xWebNativeInterface.initConfigs(getVideoConfigBundle());
        WXWebReporter.idkeyReport(1749, 15, 1);
        KVReportForVideoFullscreen.report(webViewKind, 1, 1, fullscreenVideoEnableSysTryRuntime, (String) null);
        return xWebNativeInterface;
    }

    private static VideoNativeInterfaceRuntime createXWebNativeInterfaceByOthers(Context context, WebView webView, View view, String str) {
        ClassLoader classLoader;
        if (XWalkEnvironment.getAvailableVersion() == 2852 || XWalkEnvironment.getAvailableVersion() == 2853) {
            XWebLog.m21911i(TAG, "createXWebNativeInterfaceByOthers, ignore because of runtime bug");
            return null;
        }
        boolean isPinusWebViewCoreFromAvailableVersion = XWalkEnvironment.isPinusWebViewCoreFromAvailableVersion();
        XWebLog.m21911i(TAG, "createXWebNativeInterfaceByOthers, get class by sys");
        if (!XWalkEnvironment.getInitConfig(ConstValue.INIT_CONFIG_KEY_ISGPVERSION, false)) {
            if (isPinusWebViewCoreFromAvailableVersion) {
                try {
                    classLoader = PinusStandAloneChannel.getInstance().getClassLoader();
                } catch (ClassNotFoundException e) {
                    XWebLog.m21910e(TAG, "createXWebNativeInterfaceByOthers, class not found, error", e);
                    return null;
                }
            } else {
                classLoader = null;
            }
            if (classLoader != null) {
                Class<?> loadClass = classLoader.loadClass(VIDEO_NATIVE_RUNTIME_CLASS_NAME);
                if (loadClass != null) {
                    try {
                        XWebLog.m21911i(TAG, "createXWebNativeInterfaceByOthers, try use [runtime] class XWebNativeInterfaceInternal");
                        if (PinusStandAloneChannel.getInstance().initChannels(true, CommandCfg.getInstance().getFullscreenVideoEnableInitChannelsTryRuntime())) {
                            boolean z = context instanceof PSContextWrapper;
                            PSContextWrapper pSContextWrapper = context;
                            if (!z) {
                                PSContextWrapper pSContextWrapper2 = new PSContextWrapper(webView.getContext(), XWalkEnvironment.getAvailableVersion());
                                pSContextWrapper2.setClassLoader(classLoader);
                                pSContextWrapper = pSContextWrapper2;
                            }
                            return getVideoNativeInterfaceRuntime(pSContextWrapper, webView, view, str, loadClass);
                        }
                        XWebLog.m21911i(TAG, "createXWebNativeInterfaceByOthers, init pinus standalone channel failed");
                        WXWebReporter.idkeyReport(1749, 19, 1);
                    } catch (Throwable th) {
                        XWebLog.m21909e(TAG, "createXWebNativeInterfaceByOthers, error:" + Log.getStackTraceString(th));
                    }
                } else {
                    XWebLog.m21911i(TAG, "createXWebNativeInterfaceByOthers, try use runtime class XWebNativeInterfaceInternal but bot found");
                }
                return null;
            }
            XWebLog.m21909e(TAG, "createXWebNativeInterfaceByOthers, classloader is null");
            return null;
        }
        XWebLog.m21909e(TAG, "createXWebNativeInterfaceByOthers, gpversion can not load dex");
        return null;
    }

    private static VideoNativeInterfaceRuntime createXWebNativeInterfaceByPinus(Context context, WebView webView, View view, String str) {
        try {
            Class<?> cls = PSCoreWrapper.getInstance().getClass(VIDEO_NATIVE_RUNTIME_CLASS_NAME);
            if (cls != null) {
                XWebLog.m21911i(TAG, "createXWebNativeInterfaceByPinus, try use [runtime] class XWebNativeInterfaceInternal");
                if (!(context instanceof PSContextWrapper)) {
                    context = new PSContextWrapper(webView.getContext(), XWalkEnvironment.getAvailableVersion());
                }
                Context context2 = context;
                VideoNativeInterfaceRuntime videoNativeInterfaceRuntime = new VideoNativeInterfaceRuntime(cls.newInstance());
                videoNativeInterfaceRuntime.init((Activity) null, webView, view, context2, str);
                videoNativeInterfaceRuntime.initConfigs(getVideoConfigBundle());
                WXWebReporter.idkeyReport(1749, 18, 1);
                return videoNativeInterfaceRuntime;
            }
            XWebLog.m21911i(TAG, "createXWebNativeInterfaceByPinus, try use runtime class XWebNativeInterfaceInternal but bot found");
            return null;
        } catch (Exception e) {
            XWebLog.m21910e(TAG, "createXWebNativeInterfaceByPinus, init interface error", e);
            WXWebReporter.idkeyReport(1749, 65, 1);
            return null;
        } catch (Throwable th) {
            XWebLog.m21909e(TAG, "createXWebNativeInterfaceByPinus, error:" + Log.getStackTraceString(th));
        }
    }

    public static Bundle getVideoConfigBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_MUTE, CommandCfg.getInstance().getFullscreenVideoEnableMute());
        bundle.putBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_SPEED, CommandCfg.getInstance().getFullscreenVideoEnableSpeed());
        return bundle;
    }

    private static VideoNativeInterfaceRuntime getVideoNativeInterfaceRuntime(Context context, WebView webView, View view, String str, Class<?> cls) {
        VideoNativeInterfaceRuntime videoNativeInterfaceRuntime = new VideoNativeInterfaceRuntime(cls.newInstance());
        try {
            videoNativeInterfaceRuntime.init((Activity) null, webView, view, context, str);
            videoNativeInterfaceRuntime.initConfigs(getVideoConfigBundle());
            WXWebReporter.idkeyReport(1749, 16, 1);
            return videoNativeInterfaceRuntime;
        } catch (Exception e) {
            XWebLog.m21910e(TAG, "createXWebNativeInterfaceByOthers, init interface error", e);
            WXWebReporter.idkeyReport(1749, 63, 1);
            return null;
        }
    }
}
