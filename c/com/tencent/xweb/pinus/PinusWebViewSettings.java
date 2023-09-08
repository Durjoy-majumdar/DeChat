package com.tencent.xweb.pinus;

import android.webkit.WebSettings;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.pinus.sdk.WebSettingsInterface;
import com.tencent.xweb.pinus.sdk.WebView;
import java.util.Map;

public class PinusWebViewSettings extends WebSettings {
    private static final String TAG = "PinusWebViewSettings";
    private final WebSettingsInterface mWebSettings;

    public PinusWebViewSettings(WebView webView) {
        this.mWebSettings = webView.getSettings();
    }

    public void disableCustomizedLongPressTimeout() {
        this.mWebSettings.disableCustomizedLongPressTimeout();
    }

    public void enableCustomizedLongPressTimeout(int i) {
        this.mWebSettings.enableCustomizedLongPressTimeout(i);
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
        return this.mWebSettings.getAppBrandInfo();
    }

    public boolean getBackgroundAudioPause() {
        return this.mWebSettings.getBackgroundAudioPause();
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
        return this.mWebSettings.getDisabledActionModeMenuItems();
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
        return this.mWebSettings.getForceDarkBehavior();
    }

    public int getForceDarkMode() {
        return this.mWebSettings.getForceDarkMode();
    }

    public boolean getJavaScriptCanOpenWindowsAutomatically() {
        return this.mWebSettings.getJavaScriptCanOpenWindowsAutomatically();
    }

    public boolean getJavaScriptEnabled() {
        return this.mWebSettings.getJavaScriptEnabled();
    }

    public boolean getJavascriptCanAccessClipboard() {
        return this.mWebSettings.getJavascriptCanAccessClipboard();
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
        return this.mWebSettings.getMixedContentMode();
    }

    public boolean getOffscreenPreRaster() {
        return this.mWebSettings.getOffscreenPreRaster();
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
        return this.mWebSettings.getUserAgentString();
    }

    public int getUsingForAppBrand() {
        return this.mWebSettings.getUsingForAppBrand();
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
        this.mWebSettings.setAppBrandInfo(map);
    }

    public void setAppCacheEnabled(boolean z) {
        this.mWebSettings.setAppCacheEnabled(z);
    }

    public void setAppCacheMaxSize(long j) {
        this.mWebSettings.setAppCacheMaxSize(j);
    }

    public void setAppCachePath(String str) {
        this.mWebSettings.setAppCachePath(str);
    }

    public void setAudioPlaybackRequiresUserGesture(boolean z) {
        this.mWebSettings.setAudioPlaybackRequiresUserGesture(z);
    }

    public void setBackgroundAudioPause(boolean z) {
        this.mWebSettings.setBackgroundAudioPause(z);
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
        this.mWebSettings.setDisabledActionModeMenuItems(i);
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
        this.mWebSettings.setForceDarkBehavior(i);
    }

    public void setForceDarkMode(int i) {
        this.mWebSettings.setForceDarkMode(i);
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
        this.mWebSettings.setJavascriptCanAccessClipboard(z);
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
        this.mWebSettings.setOffscreenPreRaster(z);
    }

    public void setRenderPriority(WebSettings.RenderPriority renderPriority) {
    }

    public void setSafeBrowsingEnabled(boolean z) {
        this.mWebSettings.setSafeBrowsingEnabled(z);
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
        this.mWebSettings.setUserAgentString(str);
    }

    public void setUsingForAppBrand(int i) {
        this.mWebSettings.setUsingForAppBrand(i);
    }

    public void setVideoHideDownloadUi(boolean z) {
        this.mWebSettings.setVideoHideDownloadUi(z);
    }

    public void setVideoPlaybackRequiresUserGesture(boolean z) {
        this.mWebSettings.setVideoPlaybackRequiresUserGesture(z);
    }

    public boolean supportMultipleWindows() {
        return this.mWebSettings.supportMultipleWindows();
    }

    public boolean supportZoom() {
        return this.mWebSettings.supportZoom();
    }
}
