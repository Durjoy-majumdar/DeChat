package com.tencent.xweb.sys;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebIconDatabase;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.IProfilerController;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.internal.IWebViewDatabase;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xwalk.core.XWalkEnvironment;

public class SysWebFactory implements IWebViewProvider {
    private static final String TAG = "SysWebFactory";

    public static class PreIniter {
        private static final String TAG = "SysWebFactory.PreIniter";
        /* access modifiers changed from: private */
        public static boolean mHasInited;
        private static Boolean sEnforceMainLooper;
        private static final AtomicBoolean sEnsureSystemWebViewGlobalLooperCalled = new AtomicBoolean(false);

        private PreIniter() {
        }

        /* access modifiers changed from: private */
        public static void ensureSystemWebViewGlobalLooper() {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("Calling WebView methods on another thread than the UI thread.");
            } else if (!sEnsureSystemWebViewGlobalLooperCalled.getAndSet(true)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                CookieManager.getInstance();
                CookieSyncManager.createInstance(XWalkEnvironment.getApplicationContext());
                new WebView(XWalkEnvironment.getApplicationContext()).destroy();
                XWebLog.m21911i(TAG, "ensureSystemWebViewGlobalLooper cost=" + (SystemClock.elapsedRealtime() - elapsedRealtime) + LocaleUtil.MALAY);
            }
        }

        public static boolean hasInited() {
            return mHasInited;
        }

        private static boolean isEnforceMainLooper() {
            if (sEnforceMainLooper == null) {
                sEnforceMainLooper = Boolean.valueOf(XWebSharedPreferenceUtil.getMMKVSharedPreferences(TAG).getBoolean("isEnforceMainLooper", false));
            }
            return sEnforceMainLooper.booleanValue();
        }

        public static boolean isPreInitExecutionCompleted() {
            if (!isEnforceMainLooper()) {
                return true;
            }
            return sEnsureSystemWebViewGlobalLooperCalled.get();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized void preInit(android.content.Context r2, final com.tencent.xweb.WebView.PreInitCallback r3) {
            /*
                java.lang.Class<com.tencent.xweb.sys.SysWebFactory$PreIniter> r2 = com.tencent.xweb.sys.SysWebFactory.PreIniter.class
                monitor-enter(r2)
                boolean r0 = mHasInited     // Catch:{ all -> 0x0048 }
                if (r0 == 0) goto L_0x0009
                monitor-exit(r2)
                return
            L_0x0009:
                boolean r0 = isEnforceMainLooper()     // Catch:{ all -> 0x0048 }
                if (r0 != 0) goto L_0x0019
                r0 = 1
                mHasInited = r0     // Catch:{ all -> 0x0048 }
                if (r3 == 0) goto L_0x0017
                r3.onCoreInitFinished()     // Catch:{ all -> 0x0048 }
            L_0x0017:
                monitor-exit(r2)
                return
            L_0x0019:
                java.util.concurrent.atomic.AtomicBoolean r0 = sEnsureSystemWebViewGlobalLooperCalled     // Catch:{ all -> 0x0048 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0048 }
                if (r0 == 0) goto L_0x0027
                if (r3 == 0) goto L_0x0046
                r3.onCoreInitFinished()     // Catch:{ all -> 0x0048 }
                goto L_0x0046
            L_0x0027:
                com.tencent.xweb.sys.SysWebFactory$PreIniter$1 r0 = new com.tencent.xweb.sys.SysWebFactory$PreIniter$1     // Catch:{ all -> 0x0048 }
                r0.<init>()     // Catch:{ all -> 0x0048 }
                android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0048 }
                android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0048 }
                if (r3 != r1) goto L_0x003a
                r0.run()     // Catch:{ all -> 0x0048 }
                goto L_0x0046
            L_0x003a:
                android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0048 }
                android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0048 }
                r3.<init>(r1)     // Catch:{ all -> 0x0048 }
                r3.post(r0)     // Catch:{ all -> 0x0048 }
            L_0x0046:
                monitor-exit(r2)
                return
            L_0x0048:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.sys.SysWebFactory.PreIniter.preInit(android.content.Context, com.tencent.xweb.WebView$PreInitCallback):void");
        }

        public static void setNeedEnforceMainLooper(boolean z) {
            XWebSharedPreferenceUtil.getMMKVSharedPreferences(TAG).edit().putBoolean("isEnforceMainLooper", z).apply();
        }
    }

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static final SysWebFactory sInstance = new SysWebFactory();

        private SingletonHolder() {
        }
    }

    public static SysWebFactory getInstance() {
        return SingletonHolder.sInstance;
    }

    private static <T> T runOnUiThreadBlocking(Callable<T> callable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        new Handler(Looper.getMainLooper()).post(futureTask);
        return futureTask.get();
    }

    public void clearAllWebViewCache(Context context, boolean z) {
        try {
            WebView webView = new WebView(context);
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.clearCache(true);
            if (z) {
                CookieSyncManager.createInstance(context);
                CookieManager.getInstance().removeAllCookie();
            }
            WebViewDatabase.getInstance(context).clearUsernamePassword();
            WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
            WebViewDatabase.getInstance(context).clearFormData();
            WebStorage.getInstance().deleteAllData();
            WebIconDatabase.getInstance().removeAllIcons();
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "clearAllWebViewCache error", th);
        }
    }

    public void clearClientCertPreferences(Runnable runnable) {
        SysWebView.clearClientCertPreferences(runnable);
    }

    public IWebView createWebView(com.tencent.xweb.WebView webView) {
        try {
            return new SysWebView(webView);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null && message.contains("Calling View methods on another thread than the UI thread.")) {
                XWebLog.m21909e(TAG, "createWebView error:" + th);
                PreIniter.setNeedEnforceMainLooper(true);
            }
            throw th;
        }
    }

    public Object execute(String str, Object[] objArr) {
        return null;
    }

    public String findAddress(String str) {
        return SysWebView.findAddress(str);
    }

    public ICookieManager getCookieManager() {
        if (PreIniter.isPreInitExecutionCompleted()) {
            return new SysCookieManagerWrapper();
        }
        try {
            return (ICookieManager) runOnUiThreadBlocking(new Callable<ICookieManager>() {
                public ICookieManager call() {
                    CookieManager.getInstance();
                    return new SysCookieManagerWrapper();
                }
            });
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getCookieManager error", th);
            return new SysCookieManagerWrapper();
        }
    }

    public IProfilerController getProfilerController() {
        return null;
    }

    public IWebViewContextWrapper getWebViewContextWrapper() {
        return null;
    }

    public IWebViewCoreWrapper getWebViewCoreWrapper() {
        return null;
    }

    public IWebViewDatabase getWebViewDatabase(Context context) {
        return new SysWebViewDatabase(context);
    }

    public IWebStorage getWebviewStorage() {
        return new SysWebStorage();
    }

    public boolean hasInitedWebViewCore() {
        return PreIniter.hasInited();
    }

    public boolean initWebviewCore(Context context, WebView.PreInitCallback preInitCallback) {
        XWebLog.m21911i(TAG, "initWebviewCore");
        PreIniter.preInit(context, preInitCallback);
        return true;
    }

    public Object invokeRuntimeChannel(int i, Object[] objArr) {
        return null;
    }

    public boolean isSupportTranslateWebSite() {
        return false;
    }

    private SysWebFactory() {
    }
}
