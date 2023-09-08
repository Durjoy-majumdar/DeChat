package com.tencent.xweb.pinus.sdk;

import android.webkit.WebSettings;
import java.util.Map;

public interface WebSettingsInterface {
    void disableCustomizedLongPressTimeout();

    void enableCustomizedLongPressTimeout(int i);

    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getAllowFileAccessFromFileURLs();

    boolean getAllowUniversalAccessFromFileURLs();

    Map<String, String> getAppBrandInfo();

    boolean getAudioPlaybackRequiresUserGesture();

    boolean getBackgroundAudioPause();

    boolean getBlockNetworkImage();

    boolean getBlockNetworkLoads();

    boolean getBuiltInZoomControls();

    int getCacheMode();

    String getCursiveFontFamily();

    boolean getDatabaseEnabled();

    String getDatabasePath();

    int getDefaultFixedFontSize();

    int getDefaultFontSize();

    String getDefaultTextEncodingName();

    int getDisabledActionModeMenuItems();

    boolean getDisplayZoomControls();

    boolean getDomStorageEnabled();

    String getFantasyFontFamily();

    String getFixedFontFamily();

    int getForceDark();

    int getForceDarkBehavior();

    int getForceDarkMode();

    boolean getJavaScriptCanOpenWindowsAutomatically();

    boolean getJavaScriptEnabled();

    boolean getJavascriptCanAccessClipboard();

    WebSettings.LayoutAlgorithm getLayoutAlgorithm();

    boolean getLoadWithOverviewMode();

    boolean getLoadsImagesAutomatically();

    boolean getMediaPlaybackRequiresUserGesture();

    int getMinimumFontSize();

    int getMinimumLogicalFontSize();

    int getMixedContentMode();

    boolean getOffscreenPreRaster();

    boolean getSafeBrowsingEnabled();

    String getSansSerifFontFamily();

    boolean getSaveFormData();

    boolean getSavePassword();

    String getSerifFontFamily();

    String getStandardFontFamily();

    int getTextZoom();

    boolean getUseWideViewPort();

    String getUserAgentString();

    int getUsingForAppBrand();

    boolean getVideoPlaybackRequiresUserGesture();

    void setAllowContentAccess(boolean z);

    void setAllowFileAccess(boolean z);

    void setAllowFileAccessFromFileURLs(boolean z);

    void setAllowUniversalAccessFromFileURLs(boolean z);

    void setAppBrandInfo(Map<String, String> map);

    void setAppCacheEnabled(boolean z);

    void setAppCacheMaxSize(long j);

    void setAppCachePath(String str);

    void setAudioPlaybackRequiresUserGesture(boolean z);

    void setBackgroundAudioPause(boolean z);

    void setBlockNetworkImage(boolean z);

    void setBlockNetworkLoads(boolean z);

    void setBuiltInZoomControls(boolean z);

    void setCacheMode(int i);

    void setCursiveFontFamily(String str);

    void setDatabaseEnabled(boolean z);

    void setDatabasePath(String str);

    void setDefaultFixedFontSize(int i);

    void setDefaultFontSize(int i);

    void setDefaultTextEncodingName(String str);

    void setDisabledActionModeMenuItems(int i);

    void setDisplayZoomControls(boolean z);

    void setDomStorageEnabled(boolean z);

    void setFantasyFontFamily(String str);

    void setFixedFontFamily(String str);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setForceDarkMode(int i);

    void setGeolocationEnabled(boolean z);

    void setJavaScriptCanOpenWindowsAutomatically(boolean z);

    void setJavaScriptEnabled(boolean z);

    void setJavascriptCanAccessClipboard(boolean z);

    void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm);

    void setLoadWithOverviewMode(boolean z);

    void setLoadsImagesAutomatically(boolean z);

    void setMediaPlaybackRequiresUserGesture(boolean z);

    void setMinimumFontSize(int i);

    void setMinimumLogicalFontSize(int i);

    void setMixedContentMode(int i);

    void setNeedInitialFocus(boolean z);

    void setOffscreenPreRaster(boolean z);

    void setSafeBrowsingEnabled(boolean z);

    void setSansSerifFontFamily(String str);

    void setSaveFormData(boolean z);

    void setSavePassword(boolean z);

    void setSerifFontFamily(String str);

    void setStandardFontFamily(String str);

    void setSupportMultipleWindows(boolean z);

    void setSupportZoom(boolean z);

    void setTextZoom(int i);

    void setUseWideViewPort(boolean z);

    void setUserAgentString(String str);

    void setUsingForAppBrand(int i);

    void setVideoHideDownloadUi(boolean z);

    void setVideoPlaybackRequiresUserGesture(boolean z);

    boolean supportMultipleWindows();

    boolean supportZoom();
}
