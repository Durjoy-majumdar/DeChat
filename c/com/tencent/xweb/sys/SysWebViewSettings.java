package com.tencent.xweb.sys;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.util.XWebLog;
import java.util.Map;

public class SysWebViewSettings extends WebSettings {
    private static final String TAG = "SysWebViewSettings";
    private final android.webkit.WebSettings mWebSettings;
    private String strUsrAgent = "";

    public SysWebViewSettings(WebView webView) {
        this.mWebSettings = webView.getSettings();
        getUserAgentString();
    }

    public void disableCustomizedLongPressTimeout() {
    }

    public void enableCustomizedLongPressTimeout(int i) {
    }

    public boolean getAllowContentAccess() {
        return this.mWebSettings.getAllowContentAccess();
    }

    public boolean getAllowFileAccess() {
        return this.mWebSettings.getAllowFileAccess();
    }

    public boolean getAllowFileAccessFromFileURLs() {
        return this.mWebSettings.getAllowFileAccessFromFileURLs();
    }

    public boolean getAllowUniversalAccessFromFileURLs() {
        return this.mWebSettings.getAllowUniversalAccessFromFileURLs();
    }

    public Map<String, String> getAppBrandInfo() {
        return null;
    }

    public boolean getBackgroundAudioPause() {
        return false;
    }

    public boolean getBlockNetworkImage() {
        return this.mWebSettings.getBlockNetworkImage();
    }

    public boolean getBlockNetworkLoads() {
        return this.mWebSettings.getBlockNetworkLoads();
    }

    public boolean getBuiltInZoomControls() {
        return this.mWebSettings.getBuiltInZoomControls();
    }

    public int getCacheMode() {
        return this.mWebSettings.getCacheMode();
    }

    public String getCursiveFontFamily() {
        return this.mWebSettings.getCursiveFontFamily();
    }

    public boolean getDatabaseEnabled() {
        return this.mWebSettings.getDatabaseEnabled();
    }

    public String getDatabasePath() {
        return this.mWebSettings.getDatabasePath();
    }

    public int getDefaultFixedFontSize() {
        return this.mWebSettings.getDefaultFixedFontSize();
    }

    public int getDefaultFontSize() {
        return this.mWebSettings.getDefaultFontSize();
    }

    public String getDefaultTextEncodingName() {
        return this.mWebSettings.getDefaultTextEncodingName();
    }

    public int getDisabledActionModeMenuItems() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mWebSettings.getDisabledActionModeMenuItems();
        }
        return 0;
    }

    public boolean getDomStorageEnabled() {
        return this.mWebSettings.getDomStorageEnabled();
    }

    public String getFantasyFontFamily() {
        return this.mWebSettings.getFantasyFontFamily();
    }

    public String getFixedFontFamily() {
        return this.mWebSettings.getFixedFontFamily();
    }

    public int getForceDarkBehavior() {
        return 0;
    }

    public int getForceDarkMode() {
        return 0;
    }

    public boolean getJavaScriptCanOpenWindowsAutomatically() {
        return this.mWebSettings.getJavaScriptCanOpenWindowsAutomatically();
    }

    public boolean getJavaScriptEnabled() {
        return this.mWebSettings.getJavaScriptEnabled();
    }

    public boolean getJavascriptCanAccessClipboard() {
        return true;
    }

    public WebSettings.LayoutAlgorithm getLayoutAlgorithm() {
        return this.mWebSettings.getLayoutAlgorithm();
    }

    public boolean getLoadWithOverviewMode() {
        return this.mWebSettings.getLoadWithOverviewMode();
    }

    public boolean getLoadsImagesAutomatically() {
        return this.mWebSettings.getLoadsImagesAutomatically();
    }

    public boolean getMediaPlaybackRequiresUserGesture() {
        return this.mWebSettings.getMediaPlaybackRequiresUserGesture();
    }

    public int getMinimumFontSize() {
        return this.mWebSettings.getMinimumFontSize();
    }

    public int getMinimumLogicalFontSize() {
        return this.mWebSettings.getMinimumLogicalFontSize();
    }

    public int getMixedContentMode() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.mWebSettings.getMixedContentMode();
        }
        return 0;
    }

    public boolean getOffscreenPreRaster() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.mWebSettings.getOffscreenPreRaster();
        }
        return false;
    }

    public boolean getSafeBrowsingEnabled() {
        return false;
    }

    public String getSansSerifFontFamily() {
        return this.mWebSettings.getSansSerifFontFamily();
    }

    public boolean getSaveFormData() {
        return this.mWebSettings.getSaveFormData();
    }

    public boolean getSavePassword() {
        return this.mWebSettings.getSavePassword();
    }

    public String getSerifFontFamily() {
        return this.mWebSettings.getSerifFontFamily();
    }

    public String getStandardFontFamily() {
        return this.mWebSettings.getStandardFontFamily();
    }

    public int getTextZoom() {
        return this.mWebSettings.getTextZoom();
    }

    public boolean getUseWideViewPort() {
        return this.mWebSettings.getUseWideViewPort();
    }

    public String getUserAgentString() {
        String str = this.strUsrAgent;
        if (str == null || str.isEmpty()) {
            try {
                this.strUsrAgent = this.mWebSettings.getUserAgentString();
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getUserAgentString error", th);
            }
        }
        return this.strUsrAgent;
    }

    public int getUsingForAppBrand() {
        return 0;
    }

    public void setAllowContentAccess(boolean z) {
        this.mWebSettings.setAllowContentAccess(z);
    }

    public void setAllowFileAccess(boolean z) {
        this.mWebSettings.setAllowFileAccess(z);
    }

    public void setAllowFileAccessFromFileURLs(boolean z) {
        this.mWebSettings.setAllowFileAccessFromFileURLs(z);
    }

    public void setAllowUniversalAccessFromFileURLs(boolean z) {
        this.mWebSettings.setAllowUniversalAccessFromFileURLs(z);
    }

    public void setAppBrandInfo(Map<String, String> map) {
    }

    public void setAppCacheEnabled(boolean z) {
    }

    public void setAppCacheMaxSize(long j) {
    }

    public void setAppCachePath(String str) {
    }

    public void setAudioPlaybackRequiresUserGesture(boolean z) {
    }

    public void setBackgroundAudioPause(boolean z) {
    }

    public void setBlockNetworkImage(boolean z) {
        this.mWebSettings.setBlockNetworkImage(z);
    }

    public void setBlockNetworkLoads(boolean z) {
        this.mWebSettings.setBlockNetworkLoads(z);
    }

    public void setBuiltInZoomControls(boolean z) {
        this.mWebSettings.setBuiltInZoomControls(z);
    }

    public void setCacheMode(int i) {
        this.mWebSettings.setCacheMode(i);
    }

    public void setCursiveFontFamily(String str) {
        this.mWebSettings.setCursiveFontFamily(str);
    }

    public void setDatabaseEnabled(boolean z) {
        this.mWebSettings.setDatabaseEnabled(z);
    }

    public void setDatabasePath(String str) {
        this.mWebSettings.setDatabasePath(str);
    }

    public void setDefaultFixedFontSize(int i) {
        this.mWebSettings.setDefaultFixedFontSize(i);
    }

    public void setDefaultFontSize(int i) {
        this.mWebSettings.setDefaultFontSize(i);
    }

    public void setDefaultTextEncodingName(String str) {
        this.mWebSettings.setDefaultTextEncodingName(str);
    }

    public void setDisabledActionModeMenuItems(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mWebSettings.setDisabledActionModeMenuItems(i);
        }
    }

    public void setDisplayZoomControls(boolean z) {
        this.mWebSettings.setDisplayZoomControls(z);
    }

    public void setDomStorageEnabled(boolean z) {
        this.mWebSettings.setDomStorageEnabled(z);
    }

    public void setFantasyFontFamily(String str) {
        this.mWebSettings.setFantasyFontFamily(str);
    }

    public void setFixedFontFamily(String str) {
        this.mWebSettings.setFixedFontFamily(str);
    }

    public void setForceDarkBehavior(int i) {
    }

    public void setForceDarkMode(int i) {
    }

    public void setGeolocationEnabled(boolean z) {
        this.mWebSettings.setGeolocationEnabled(z);
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        this.mWebSettings.setJavaScriptCanOpenWindowsAutomatically(z);
    }

    public void setJavaScriptEnabled(boolean z) {
        this.mWebSettings.setJavaScriptEnabled(z);
    }

    public void setJavascriptCanAccessClipboard(boolean z) {
        XWebLog.m21913w(TAG, "setJavascriptCanAccessClipboard not supported");
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        this.mWebSettings.setLayoutAlgorithm(layoutAlgorithm);
    }

    public void setLoadWithOverviewMode(boolean z) {
        this.mWebSettings.setLoadWithOverviewMode(z);
    }

    public void setLoadsImagesAutomatically(boolean z) {
        this.mWebSettings.setLoadsImagesAutomatically(z);
    }

    public void setMediaPlaybackRequiresUserGesture(boolean z) {
        this.mWebSettings.setMediaPlaybackRequiresUserGesture(z);
    }

    public void setMinimumFontSize(int i) {
        this.mWebSettings.setMinimumFontSize(i);
    }

    public void setMinimumLogicalFontSize(int i) {
        this.mWebSettings.setMinimumLogicalFontSize(i);
    }

    public void setMixedContentMode(int i) {
        this.mWebSettings.setMixedContentMode(i);
    }

    public void setNeedInitialFocus(boolean z) {
        this.mWebSettings.setNeedInitialFocus(z);
    }

    public void setOffscreenPreRaster(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mWebSettings.setOffscreenPreRaster(z);
        }
    }

    public void setRenderPriority(WebSettings.RenderPriority renderPriority) {
        this.mWebSettings.setRenderPriority(renderPriority);
    }

    public void setSafeBrowsingEnabled(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mWebSettings.setSafeBrowsingEnabled(z);
        }
    }

    public void setSansSerifFontFamily(String str) {
        this.mWebSettings.setSansSerifFontFamily(str);
    }

    public void setSaveFormData(boolean z) {
        this.mWebSettings.setSaveFormData(z);
    }

    public void setSavePassword(boolean z) {
        this.mWebSettings.setSavePassword(z);
    }

    public void setSerifFontFamily(String str) {
        this.mWebSettings.setSerifFontFamily(str);
    }

    public void setStandardFontFamily(String str) {
        this.mWebSettings.setStandardFontFamily(str);
    }

    public void setSupportMultipleWindows(boolean z) {
        this.mWebSettings.setSupportMultipleWindows(z);
    }

    public void setSupportZoom(boolean z) {
        this.mWebSettings.setSupportZoom(z);
    }

    public void setTextZoom(int i) {
        this.mWebSettings.setTextZoom(i);
    }

    public void setUseWideViewPort(boolean z) {
        this.mWebSettings.setUseWideViewPort(z);
    }

    public void setUserAgentString(String str) {
        this.strUsrAgent = str;
        this.mWebSettings.setUserAgentString(str);
    }

    public void setUsingForAppBrand(int i) {
    }

    public void setVideoHideDownloadUi(boolean z) {
    }

    public void setVideoPlaybackRequiresUserGesture(boolean z) {
    }

    public boolean supportMultipleWindows() {
        return this.mWebSettings.supportMultipleWindows();
    }

    public boolean supportZoom() {
        return this.mWebSettings.supportZoom();
    }
}
