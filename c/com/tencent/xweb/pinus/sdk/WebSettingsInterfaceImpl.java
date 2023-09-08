package com.tencent.xweb.pinus.sdk;

import android.webkit.WebSettings;
import com.tencent.xweb.util.ReflectMethod;
import java.util.Map;

public class WebSettingsInterfaceImpl implements WebSettingsInterface {
    private static final String TAG = "WebSettingsInterfaceImpl";
    private ReflectMethod disableCustomizedLongPressTimeoutMethod;
    private ReflectMethod enableCustomizedLongPressTimeoutintMethod;
    private ReflectMethod getAllowContentAccessMethod;
    private ReflectMethod getAllowFileAccessFromFileURLsMethod;
    private ReflectMethod getAllowFileAccessMethod;
    private ReflectMethod getAllowUniversalAccessFromFileURLsMethod;
    private ReflectMethod getAppBrandInfoMethod;
    private ReflectMethod getAudioPlaybackRequiresUserGestureMethod;
    private ReflectMethod getBackgroundAudioPauseMethod;
    private ReflectMethod getBlockNetworkImageMethod;
    private ReflectMethod getBlockNetworkLoadsMethod;
    private ReflectMethod getBuiltInZoomControlsMethod;
    private ReflectMethod getCacheModeMethod;
    private ReflectMethod getCursiveFontFamilyMethod;
    private ReflectMethod getDatabaseEnabledMethod;
    private ReflectMethod getDatabasePathMethod;
    private ReflectMethod getDefaultFixedFontSizeMethod;
    private ReflectMethod getDefaultFontSizeMethod;
    private ReflectMethod getDefaultTextEncodingNameMethod;
    private ReflectMethod getDisabledActionModeMenuItemsMethod;
    private ReflectMethod getDisplayZoomControlsMethod;
    private ReflectMethod getDomStorageEnabledMethod;
    private ReflectMethod getFantasyFontFamilyMethod;
    private ReflectMethod getFixedFontFamilyMethod;
    private ReflectMethod getForceDarkBehaviorMethod;
    private ReflectMethod getForceDarkMethod;
    private ReflectMethod getForceDarkModeMethod;
    private ReflectMethod getJavaScriptCanOpenWindowsAutomaticallyMethod;
    private ReflectMethod getJavaScriptEnabledMethod;
    private ReflectMethod getJavascriptCanAccessClipboardMethod;
    private ReflectMethod getLayoutAlgorithmMethod;
    private ReflectMethod getLoadWithOverviewModeMethod;
    private ReflectMethod getLoadsImagesAutomaticallyMethod;
    private ReflectMethod getMediaPlaybackRequiresUserGestureMethod;
    private ReflectMethod getMinimumFontSizeMethod;
    private ReflectMethod getMinimumLogicalFontSizeMethod;
    private ReflectMethod getMixedContentModeMethod;
    private ReflectMethod getOffscreenPreRasterMethod;
    private ReflectMethod getSafeBrowsingEnabledMethod;
    private ReflectMethod getSansSerifFontFamilyMethod;
    private ReflectMethod getSaveFormDataMethod;
    private ReflectMethod getSavePasswordMethod;
    private ReflectMethod getSerifFontFamilyMethod;
    private ReflectMethod getStandardFontFamilyMethod;
    private ReflectMethod getTextZoomMethod;
    private ReflectMethod getUseWideViewPortMethod;
    private ReflectMethod getUserAgentStringMethod;
    private ReflectMethod getUsingForAppBrandMethod;
    private ReflectMethod getVideoPlaybackRequiresUserGestureMethod;
    private final Object inner;
    private ReflectMethod setAllowContentAccessbooleanMethod;
    private ReflectMethod setAllowFileAccessFromFileURLsbooleanMethod;
    private ReflectMethod setAllowFileAccessbooleanMethod;
    private ReflectMethod setAllowUniversalAccessFromFileURLsbooleanMethod;
    private ReflectMethod setAppBrandInfoMapStringStringMethod;
    private ReflectMethod setAppCacheEnabledbooleanMethod;
    private ReflectMethod setAppCacheMaxSizelongMethod;
    private ReflectMethod setAppCachePathStringMethod;
    private ReflectMethod setAudioPlaybackRequiresUserGesturebooleanMethod;
    private ReflectMethod setBackgroundAudioPausebooleanMethod;
    private ReflectMethod setBlockNetworkImagebooleanMethod;
    private ReflectMethod setBlockNetworkLoadsbooleanMethod;
    private ReflectMethod setBuiltInZoomControlsbooleanMethod;
    private ReflectMethod setCacheModeintMethod;
    private ReflectMethod setCursiveFontFamilyStringMethod;
    private ReflectMethod setDatabaseEnabledbooleanMethod;
    private ReflectMethod setDatabasePathStringMethod;
    private ReflectMethod setDefaultFixedFontSizeintMethod;
    private ReflectMethod setDefaultFontSizeintMethod;
    private ReflectMethod setDefaultTextEncodingNameStringMethod;
    private ReflectMethod setDisabledActionModeMenuItemsintMethod;
    private ReflectMethod setDisplayZoomControlsbooleanMethod;
    private ReflectMethod setDomStorageEnabledbooleanMethod;
    private ReflectMethod setFantasyFontFamilyStringMethod;
    private ReflectMethod setFixedFontFamilyStringMethod;
    private ReflectMethod setForceDarkBehaviorintMethod;
    private ReflectMethod setForceDarkModeintMethod;
    private ReflectMethod setForceDarkintMethod;
    private ReflectMethod setGeolocationEnabledbooleanMethod;
    private ReflectMethod setJavaScriptCanOpenWindowsAutomaticallybooleanMethod;
    private ReflectMethod setJavaScriptEnabledbooleanMethod;
    private ReflectMethod setJavascriptCanAccessClipboardbooleanMethod;
    private ReflectMethod setLayoutAlgorithmWebSettingsLayoutAlgorithmMethod;
    private ReflectMethod setLoadWithOverviewModebooleanMethod;
    private ReflectMethod setLoadsImagesAutomaticallybooleanMethod;
    private ReflectMethod setMediaPlaybackRequiresUserGesturebooleanMethod;
    private ReflectMethod setMinimumFontSizeintMethod;
    private ReflectMethod setMinimumLogicalFontSizeintMethod;
    private ReflectMethod setMixedContentModeintMethod;
    private ReflectMethod setNeedInitialFocusbooleanMethod;
    private ReflectMethod setOffscreenPreRasterbooleanMethod;
    private ReflectMethod setSafeBrowsingEnabledbooleanMethod;
    private ReflectMethod setSansSerifFontFamilyStringMethod;
    private ReflectMethod setSaveFormDatabooleanMethod;
    private ReflectMethod setSavePasswordbooleanMethod;
    private ReflectMethod setSerifFontFamilyStringMethod;
    private ReflectMethod setStandardFontFamilyStringMethod;
    private ReflectMethod setSupportMultipleWindowsbooleanMethod;
    private ReflectMethod setSupportZoombooleanMethod;
    private ReflectMethod setTextZoomintMethod;
    private ReflectMethod setUseWideViewPortbooleanMethod;
    private ReflectMethod setUserAgentStringStringMethod;
    private ReflectMethod setUsingForAppBrandintMethod;
    private ReflectMethod setVideoHideDownloadUibooleanMethod;
    private ReflectMethod setVideoPlaybackRequiresUserGesturebooleanMethod;
    private ReflectMethod supportMultipleWindowsMethod;
    private ReflectMethod supportZoomMethod;

    public WebSettingsInterfaceImpl(Object obj) {
        this.inner = obj;
    }

    private synchronized ReflectMethod getDisableCustomizedLongPressTimeoutMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.disableCustomizedLongPressTimeoutMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "disableCustomizedLongPressTimeout", (Class<?>[]) new Class[0]);
            this.disableCustomizedLongPressTimeoutMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getEnableCustomizedLongPressTimeoutintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.enableCustomizedLongPressTimeoutintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "enableCustomizedLongPressTimeout", (Class<?>[]) new Class[]{Integer.TYPE});
            this.enableCustomizedLongPressTimeoutintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetAllowContentAccessMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getAllowContentAccessMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getAllowContentAccess", (Class<?>[]) new Class[0]);
            this.getAllowContentAccessMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetAllowFileAccessFromFileURLsMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getAllowFileAccessFromFileURLsMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getAllowFileAccessFromFileURLs", (Class<?>[]) new Class[0]);
            this.getAllowFileAccessFromFileURLsMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetAllowFileAccessMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getAllowFileAccessMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getAllowFileAccess", (Class<?>[]) new Class[0]);
            this.getAllowFileAccessMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetAllowUniversalAccessFromFileURLsMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getAllowUniversalAccessFromFileURLsMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getAllowUniversalAccessFromFileURLs", (Class<?>[]) new Class[0]);
            this.getAllowUniversalAccessFromFileURLsMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetAppBrandInfoMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getAppBrandInfoMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getAppBrandInfo", (Class<?>[]) new Class[0]);
            this.getAppBrandInfoMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetAudioPlaybackRequiresUserGestureMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getAudioPlaybackRequiresUserGestureMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getAudioPlaybackRequiresUserGesture", (Class<?>[]) new Class[0]);
            this.getAudioPlaybackRequiresUserGestureMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetBackgroundAudioPauseMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getBackgroundAudioPauseMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getBackgroundAudioPause", (Class<?>[]) new Class[0]);
            this.getBackgroundAudioPauseMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetBlockNetworkImageMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getBlockNetworkImageMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getBlockNetworkImage", (Class<?>[]) new Class[0]);
            this.getBlockNetworkImageMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetBlockNetworkLoadsMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getBlockNetworkLoadsMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getBlockNetworkLoads", (Class<?>[]) new Class[0]);
            this.getBlockNetworkLoadsMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetBuiltInZoomControlsMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getBuiltInZoomControlsMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getBuiltInZoomControls", (Class<?>[]) new Class[0]);
            this.getBuiltInZoomControlsMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetCacheModeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getCacheModeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getCacheMode", (Class<?>[]) new Class[0]);
            this.getCacheModeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetCursiveFontFamilyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getCursiveFontFamilyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getCursiveFontFamily", (Class<?>[]) new Class[0]);
            this.getCursiveFontFamilyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDatabaseEnabledMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDatabaseEnabledMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDatabaseEnabled", (Class<?>[]) new Class[0]);
            this.getDatabaseEnabledMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDatabasePathMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDatabasePathMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDatabasePath", (Class<?>[]) new Class[0]);
            this.getDatabasePathMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDefaultFixedFontSizeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDefaultFixedFontSizeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDefaultFixedFontSize", (Class<?>[]) new Class[0]);
            this.getDefaultFixedFontSizeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDefaultFontSizeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDefaultFontSizeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDefaultFontSize", (Class<?>[]) new Class[0]);
            this.getDefaultFontSizeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDefaultTextEncodingNameMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDefaultTextEncodingNameMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDefaultTextEncodingName", (Class<?>[]) new Class[0]);
            this.getDefaultTextEncodingNameMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDisabledActionModeMenuItemsMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDisabledActionModeMenuItemsMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDisabledActionModeMenuItems", (Class<?>[]) new Class[0]);
            this.getDisabledActionModeMenuItemsMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDisplayZoomControlsMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDisplayZoomControlsMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDisplayZoomControls", (Class<?>[]) new Class[0]);
            this.getDisplayZoomControlsMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetDomStorageEnabledMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDomStorageEnabledMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDomStorageEnabled", (Class<?>[]) new Class[0]);
            this.getDomStorageEnabledMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetFantasyFontFamilyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getFantasyFontFamilyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getFantasyFontFamily", (Class<?>[]) new Class[0]);
            this.getFantasyFontFamilyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetFixedFontFamilyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getFixedFontFamilyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getFixedFontFamily", (Class<?>[]) new Class[0]);
            this.getFixedFontFamilyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetForceDarkBehaviorMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getForceDarkBehaviorMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getForceDarkBehavior", (Class<?>[]) new Class[0]);
            this.getForceDarkBehaviorMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetForceDarkMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getForceDarkMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getForceDark", (Class<?>[]) new Class[0]);
            this.getForceDarkMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetForceDarkModeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getForceDarkModeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getForceDarkMode", (Class<?>[]) new Class[0]);
            this.getForceDarkModeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetJavaScriptCanOpenWindowsAutomaticallyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getJavaScriptCanOpenWindowsAutomaticallyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getJavaScriptCanOpenWindowsAutomatically", (Class<?>[]) new Class[0]);
            this.getJavaScriptCanOpenWindowsAutomaticallyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetJavaScriptEnabledMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getJavaScriptEnabledMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getJavaScriptEnabled", (Class<?>[]) new Class[0]);
            this.getJavaScriptEnabledMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetJavascriptCanAccessClipboardMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getJavascriptCanAccessClipboardMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getJavascriptCanAccessClipboard", (Class<?>[]) new Class[0]);
            this.getJavascriptCanAccessClipboardMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetLayoutAlgorithmMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getLayoutAlgorithmMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getLayoutAlgorithm", (Class<?>[]) new Class[0]);
            this.getLayoutAlgorithmMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetLoadWithOverviewModeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getLoadWithOverviewModeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getLoadWithOverviewMode", (Class<?>[]) new Class[0]);
            this.getLoadWithOverviewModeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetLoadsImagesAutomaticallyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getLoadsImagesAutomaticallyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getLoadsImagesAutomatically", (Class<?>[]) new Class[0]);
            this.getLoadsImagesAutomaticallyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetMediaPlaybackRequiresUserGestureMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getMediaPlaybackRequiresUserGestureMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getMediaPlaybackRequiresUserGesture", (Class<?>[]) new Class[0]);
            this.getMediaPlaybackRequiresUserGestureMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetMinimumFontSizeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getMinimumFontSizeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getMinimumFontSize", (Class<?>[]) new Class[0]);
            this.getMinimumFontSizeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetMinimumLogicalFontSizeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getMinimumLogicalFontSizeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getMinimumLogicalFontSize", (Class<?>[]) new Class[0]);
            this.getMinimumLogicalFontSizeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetMixedContentModeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getMixedContentModeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getMixedContentMode", (Class<?>[]) new Class[0]);
            this.getMixedContentModeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetOffscreenPreRasterMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getOffscreenPreRasterMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getOffscreenPreRaster", (Class<?>[]) new Class[0]);
            this.getOffscreenPreRasterMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetSafeBrowsingEnabledMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getSafeBrowsingEnabledMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getSafeBrowsingEnabled", (Class<?>[]) new Class[0]);
            this.getSafeBrowsingEnabledMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetSansSerifFontFamilyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getSansSerifFontFamilyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getSansSerifFontFamily", (Class<?>[]) new Class[0]);
            this.getSansSerifFontFamilyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetSaveFormDataMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getSaveFormDataMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getSaveFormData", (Class<?>[]) new Class[0]);
            this.getSaveFormDataMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetSavePasswordMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getSavePasswordMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getSavePassword", (Class<?>[]) new Class[0]);
            this.getSavePasswordMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetSerifFontFamilyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getSerifFontFamilyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getSerifFontFamily", (Class<?>[]) new Class[0]);
            this.getSerifFontFamilyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetStandardFontFamilyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getStandardFontFamilyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getStandardFontFamily", (Class<?>[]) new Class[0]);
            this.getStandardFontFamilyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetTextZoomMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getTextZoomMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getTextZoom", (Class<?>[]) new Class[0]);
            this.getTextZoomMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetUseWideViewPortMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getUseWideViewPortMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getUseWideViewPort", (Class<?>[]) new Class[0]);
            this.getUseWideViewPortMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetUserAgentStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getUserAgentStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getUserAgentString", (Class<?>[]) new Class[0]);
            this.getUserAgentStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetUsingForAppBrandMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getUsingForAppBrandMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getUsingForAppBrand", (Class<?>[]) new Class[0]);
            this.getUsingForAppBrandMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetVideoPlaybackRequiresUserGestureMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getVideoPlaybackRequiresUserGestureMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getVideoPlaybackRequiresUserGesture", (Class<?>[]) new Class[0]);
            this.getVideoPlaybackRequiresUserGestureMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAllowContentAccessbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAllowContentAccessbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAllowContentAccess", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAllowContentAccessbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAllowFileAccessFromFileURLsbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAllowFileAccessFromFileURLsbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAllowFileAccessFromFileURLs", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAllowFileAccessFromFileURLsbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAllowFileAccessbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAllowFileAccessbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAllowFileAccess", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAllowFileAccessbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAllowUniversalAccessFromFileURLsbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAllowUniversalAccessFromFileURLsbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAllowUniversalAccessFromFileURLs", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAllowUniversalAccessFromFileURLsbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAppBrandInfoMapStringStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAppBrandInfoMapStringStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAppBrandInfo", (Class<?>[]) new Class[]{Map.class});
            this.setAppBrandInfoMapStringStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAppCacheEnabledbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAppCacheEnabledbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAppCacheEnabled", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAppCacheEnabledbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAppCacheMaxSizelongMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAppCacheMaxSizelongMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAppCacheMaxSize", (Class<?>[]) new Class[]{Long.TYPE});
            this.setAppCacheMaxSizelongMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAppCachePathStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAppCachePathStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAppCachePath", (Class<?>[]) new Class[]{String.class});
            this.setAppCachePathStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAudioPlaybackRequiresUserGesturebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAudioPlaybackRequiresUserGesturebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAudioPlaybackRequiresUserGesture", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAudioPlaybackRequiresUserGesturebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetBackgroundAudioPausebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setBackgroundAudioPausebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setBackgroundAudioPause", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setBackgroundAudioPausebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetBlockNetworkImagebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setBlockNetworkImagebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setBlockNetworkImage", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setBlockNetworkImagebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetBlockNetworkLoadsbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setBlockNetworkLoadsbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setBlockNetworkLoads", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setBlockNetworkLoadsbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetBuiltInZoomControlsbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setBuiltInZoomControlsbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setBuiltInZoomControls", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setBuiltInZoomControlsbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetCacheModeintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setCacheModeintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setCacheMode", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setCacheModeintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetCursiveFontFamilyStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setCursiveFontFamilyStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setCursiveFontFamily", (Class<?>[]) new Class[]{String.class});
            this.setCursiveFontFamilyStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDatabaseEnabledbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDatabaseEnabledbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDatabaseEnabled", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setDatabaseEnabledbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDatabasePathStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDatabasePathStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDatabasePath", (Class<?>[]) new Class[]{String.class});
            this.setDatabasePathStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDefaultFixedFontSizeintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDefaultFixedFontSizeintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDefaultFixedFontSize", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setDefaultFixedFontSizeintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDefaultFontSizeintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDefaultFontSizeintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDefaultFontSize", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setDefaultFontSizeintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDefaultTextEncodingNameStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDefaultTextEncodingNameStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDefaultTextEncodingName", (Class<?>[]) new Class[]{String.class});
            this.setDefaultTextEncodingNameStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDisabledActionModeMenuItemsintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDisabledActionModeMenuItemsintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDisabledActionModeMenuItems", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setDisabledActionModeMenuItemsintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDisplayZoomControlsbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDisplayZoomControlsbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDisplayZoomControls", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setDisplayZoomControlsbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDomStorageEnabledbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDomStorageEnabledbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDomStorageEnabled", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setDomStorageEnabledbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetFantasyFontFamilyStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setFantasyFontFamilyStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setFantasyFontFamily", (Class<?>[]) new Class[]{String.class});
            this.setFantasyFontFamilyStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetFixedFontFamilyStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setFixedFontFamilyStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setFixedFontFamily", (Class<?>[]) new Class[]{String.class});
            this.setFixedFontFamilyStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetForceDarkBehaviorintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setForceDarkBehaviorintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setForceDarkBehavior", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setForceDarkBehaviorintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetForceDarkModeintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setForceDarkModeintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setForceDarkMode", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setForceDarkModeintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetForceDarkintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setForceDarkintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setForceDark", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setForceDarkintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetGeolocationEnabledbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setGeolocationEnabledbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setGeolocationEnabled", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setGeolocationEnabledbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetJavaScriptCanOpenWindowsAutomaticallybooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setJavaScriptCanOpenWindowsAutomaticallybooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setJavaScriptCanOpenWindowsAutomatically", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setJavaScriptCanOpenWindowsAutomaticallybooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetJavaScriptEnabledbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setJavaScriptEnabledbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setJavaScriptEnabled", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setJavaScriptEnabledbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetJavascriptCanAccessClipboardbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setJavascriptCanAccessClipboardbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setJavascriptCanAccessClipboard", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setJavascriptCanAccessClipboardbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetLayoutAlgorithmWebSettingsLayoutAlgorithmMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setLayoutAlgorithmWebSettingsLayoutAlgorithmMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setLayoutAlgorithm", (Class<?>[]) new Class[]{WebSettings.LayoutAlgorithm.class});
            this.setLayoutAlgorithmWebSettingsLayoutAlgorithmMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetLoadWithOverviewModebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setLoadWithOverviewModebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setLoadWithOverviewMode", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setLoadWithOverviewModebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetLoadsImagesAutomaticallybooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setLoadsImagesAutomaticallybooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setLoadsImagesAutomatically", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setLoadsImagesAutomaticallybooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetMediaPlaybackRequiresUserGesturebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setMediaPlaybackRequiresUserGesturebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setMediaPlaybackRequiresUserGesture", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setMediaPlaybackRequiresUserGesturebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetMinimumFontSizeintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setMinimumFontSizeintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setMinimumFontSize", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setMinimumFontSizeintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetMinimumLogicalFontSizeintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setMinimumLogicalFontSizeintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setMinimumLogicalFontSize", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setMinimumLogicalFontSizeintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetMixedContentModeintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setMixedContentModeintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setMixedContentMode", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setMixedContentModeintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetNeedInitialFocusbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setNeedInitialFocusbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setNeedInitialFocus", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setNeedInitialFocusbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetOffscreenPreRasterbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setOffscreenPreRasterbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setOffscreenPreRaster", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setOffscreenPreRasterbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetSafeBrowsingEnabledbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setSafeBrowsingEnabledbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setSafeBrowsingEnabled", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setSafeBrowsingEnabledbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetSansSerifFontFamilyStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setSansSerifFontFamilyStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setSansSerifFontFamily", (Class<?>[]) new Class[]{String.class});
            this.setSansSerifFontFamilyStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetSaveFormDatabooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setSaveFormDatabooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setSaveFormData", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setSaveFormDatabooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetSavePasswordbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setSavePasswordbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setSavePassword", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setSavePasswordbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetSerifFontFamilyStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setSerifFontFamilyStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setSerifFontFamily", (Class<?>[]) new Class[]{String.class});
            this.setSerifFontFamilyStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetStandardFontFamilyStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setStandardFontFamilyStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setStandardFontFamily", (Class<?>[]) new Class[]{String.class});
            this.setStandardFontFamilyStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetSupportMultipleWindowsbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setSupportMultipleWindowsbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setSupportMultipleWindows", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setSupportMultipleWindowsbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetSupportZoombooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setSupportZoombooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setSupportZoom", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setSupportZoombooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetTextZoomintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setTextZoomintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setTextZoom", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setTextZoomintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetUseWideViewPortbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setUseWideViewPortbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setUseWideViewPort", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setUseWideViewPortbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetUserAgentStringStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setUserAgentStringStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setUserAgentString", (Class<?>[]) new Class[]{String.class});
            this.setUserAgentStringStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetUsingForAppBrandintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setUsingForAppBrandintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setUsingForAppBrand", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setUsingForAppBrandintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetVideoHideDownloadUibooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setVideoHideDownloadUibooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setVideoHideDownloadUi", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setVideoHideDownloadUibooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetVideoPlaybackRequiresUserGesturebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setVideoPlaybackRequiresUserGesturebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setVideoPlaybackRequiresUserGesture", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setVideoPlaybackRequiresUserGesturebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSupportMultipleWindowsMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.supportMultipleWindowsMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "supportMultipleWindows", (Class<?>[]) new Class[0]);
            this.supportMultipleWindowsMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSupportZoomMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.supportZoomMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "supportZoom", (Class<?>[]) new Class[0]);
            this.supportZoomMethod = reflectMethod;
        }
        return reflectMethod;
    }

    public static void handleRuntimeError(Exception exc) {
        exc.getClass();
    }

    public void disableCustomizedLongPressTimeout() {
        try {
            getDisableCustomizedLongPressTimeoutMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void enableCustomizedLongPressTimeout(int i) {
        try {
            getEnableCustomizedLongPressTimeoutintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean getAllowContentAccess() {
        try {
            return ((Boolean) getGetAllowContentAccessMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getAllowFileAccess() {
        try {
            return ((Boolean) getGetAllowFileAccessMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getAllowFileAccessFromFileURLs() {
        try {
            return ((Boolean) getGetAllowFileAccessFromFileURLsMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getAllowUniversalAccessFromFileURLs() {
        try {
            return ((Boolean) getGetAllowUniversalAccessFromFileURLsMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public Map<String, String> getAppBrandInfo() {
        try {
            return (Map) getGetAppBrandInfoMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public boolean getAudioPlaybackRequiresUserGesture() {
        try {
            return ((Boolean) getGetAudioPlaybackRequiresUserGestureMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getBackgroundAudioPause() {
        try {
            return ((Boolean) getGetBackgroundAudioPauseMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getBlockNetworkImage() {
        try {
            return ((Boolean) getGetBlockNetworkImageMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getBlockNetworkLoads() {
        try {
            return ((Boolean) getGetBlockNetworkLoadsMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getBuiltInZoomControls() {
        try {
            return ((Boolean) getGetBuiltInZoomControlsMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public int getCacheMode() {
        try {
            return ((Integer) getGetCacheModeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public String getCursiveFontFamily() {
        try {
            return (String) getGetCursiveFontFamilyMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public boolean getDatabaseEnabled() {
        try {
            return ((Boolean) getGetDatabaseEnabledMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public String getDatabasePath() {
        try {
            return (String) getGetDatabasePathMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getDefaultFixedFontSize() {
        try {
            return ((Integer) getGetDefaultFixedFontSizeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int getDefaultFontSize() {
        try {
            return ((Integer) getGetDefaultFontSizeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public String getDefaultTextEncodingName() {
        try {
            return (String) getGetDefaultTextEncodingNameMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getDisabledActionModeMenuItems() {
        try {
            return ((Integer) getGetDisabledActionModeMenuItemsMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public boolean getDisplayZoomControls() {
        try {
            return ((Boolean) getGetDisplayZoomControlsMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getDomStorageEnabled() {
        try {
            return ((Boolean) getGetDomStorageEnabledMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public String getFantasyFontFamily() {
        try {
            return (String) getGetFantasyFontFamilyMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public String getFixedFontFamily() {
        try {
            return (String) getGetFixedFontFamilyMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getForceDark() {
        try {
            return ((Integer) getGetForceDarkMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int getForceDarkBehavior() {
        try {
            return ((Integer) getGetForceDarkBehaviorMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int getForceDarkMode() {
        try {
            return ((Integer) getGetForceDarkModeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public boolean getJavaScriptCanOpenWindowsAutomatically() {
        try {
            return ((Boolean) getGetJavaScriptCanOpenWindowsAutomaticallyMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getJavaScriptEnabled() {
        try {
            return ((Boolean) getGetJavaScriptEnabledMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getJavascriptCanAccessClipboard() {
        try {
            return ((Boolean) getGetJavascriptCanAccessClipboardMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public WebSettings.LayoutAlgorithm getLayoutAlgorithm() {
        try {
            return (WebSettings.LayoutAlgorithm) getGetLayoutAlgorithmMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public boolean getLoadWithOverviewMode() {
        try {
            return ((Boolean) getGetLoadWithOverviewModeMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getLoadsImagesAutomatically() {
        try {
            return ((Boolean) getGetLoadsImagesAutomaticallyMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getMediaPlaybackRequiresUserGesture() {
        try {
            return ((Boolean) getGetMediaPlaybackRequiresUserGestureMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public int getMinimumFontSize() {
        try {
            return ((Integer) getGetMinimumFontSizeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int getMinimumLogicalFontSize() {
        try {
            return ((Integer) getGetMinimumLogicalFontSizeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int getMixedContentMode() {
        try {
            return ((Integer) getGetMixedContentModeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public boolean getOffscreenPreRaster() {
        try {
            return ((Boolean) getGetOffscreenPreRasterMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getSafeBrowsingEnabled() {
        try {
            return ((Boolean) getGetSafeBrowsingEnabledMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public String getSansSerifFontFamily() {
        try {
            return (String) getGetSansSerifFontFamilyMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public boolean getSaveFormData() {
        try {
            return ((Boolean) getGetSaveFormDataMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean getSavePassword() {
        try {
            return ((Boolean) getGetSavePasswordMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public String getSerifFontFamily() {
        try {
            return (String) getGetSerifFontFamilyMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public String getStandardFontFamily() {
        try {
            return (String) getGetStandardFontFamilyMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getTextZoom() {
        try {
            return ((Integer) getGetTextZoomMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public boolean getUseWideViewPort() {
        try {
            return ((Boolean) getGetUseWideViewPortMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public String getUserAgentString() {
        try {
            return (String) getGetUserAgentStringMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getUsingForAppBrand() {
        try {
            return ((Integer) getGetUsingForAppBrandMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public boolean getVideoPlaybackRequiresUserGesture() {
        try {
            return ((Boolean) getGetVideoPlaybackRequiresUserGestureMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void setAllowContentAccess(boolean z) {
        try {
            getSetAllowContentAccessbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            getSetAllowFileAccessbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAllowFileAccessFromFileURLs(boolean z) {
        try {
            getSetAllowFileAccessFromFileURLsbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAllowUniversalAccessFromFileURLs(boolean z) {
        try {
            getSetAllowUniversalAccessFromFileURLsbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAppBrandInfo(Map<String, String> map) {
        try {
            getSetAppBrandInfoMapStringStringMethod().invoke(map);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            getSetAppCacheEnabledbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAppCacheMaxSize(long j) {
        try {
            getSetAppCacheMaxSizelongMethod().invoke(Long.valueOf(j));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAppCachePath(String str) {
        try {
            getSetAppCachePathStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAudioPlaybackRequiresUserGesture(boolean z) {
        try {
            getSetAudioPlaybackRequiresUserGesturebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setBackgroundAudioPause(boolean z) {
        try {
            getSetBackgroundAudioPausebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setBlockNetworkImage(boolean z) {
        try {
            getSetBlockNetworkImagebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setBlockNetworkLoads(boolean z) {
        try {
            getSetBlockNetworkLoadsbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            getSetBuiltInZoomControlsbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setCacheMode(int i) {
        try {
            getSetCacheModeintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setCursiveFontFamily(String str) {
        try {
            getSetCursiveFontFamilyStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            getSetDatabaseEnabledbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDatabasePath(String str) {
        try {
            getSetDatabasePathStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDefaultFixedFontSize(int i) {
        try {
            getSetDefaultFixedFontSizeintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            getSetDefaultFontSizeintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            getSetDefaultTextEncodingNameStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDisabledActionModeMenuItems(int i) {
        try {
            getSetDisabledActionModeMenuItemsintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            getSetDisplayZoomControlsbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            getSetDomStorageEnabledbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setFantasyFontFamily(String str) {
        try {
            getSetFantasyFontFamilyStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setFixedFontFamily(String str) {
        try {
            getSetFixedFontFamilyStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setForceDark(int i) {
        try {
            getSetForceDarkintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setForceDarkBehavior(int i) {
        try {
            getSetForceDarkBehaviorintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setForceDarkMode(int i) {
        try {
            getSetForceDarkModeintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setGeolocationEnabled(boolean z) {
        try {
            getSetGeolocationEnabledbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            getSetJavaScriptCanOpenWindowsAutomaticallybooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            getSetJavaScriptEnabledbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setJavascriptCanAccessClipboard(boolean z) {
        try {
            getSetJavascriptCanAccessClipboardbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            getSetLayoutAlgorithmWebSettingsLayoutAlgorithmMethod().invoke(layoutAlgorithm);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            getSetLoadWithOverviewModebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setLoadsImagesAutomatically(boolean z) {
        try {
            getSetLoadsImagesAutomaticallybooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setMediaPlaybackRequiresUserGesture(boolean z) {
        try {
            getSetMediaPlaybackRequiresUserGesturebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setMinimumFontSize(int i) {
        try {
            getSetMinimumFontSizeintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setMinimumLogicalFontSize(int i) {
        try {
            getSetMinimumLogicalFontSizeintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setMixedContentMode(int i) {
        try {
            getSetMixedContentModeintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setNeedInitialFocus(boolean z) {
        try {
            getSetNeedInitialFocusbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setOffscreenPreRaster(boolean z) {
        try {
            getSetOffscreenPreRasterbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setSafeBrowsingEnabled(boolean z) {
        try {
            getSetSafeBrowsingEnabledbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setSansSerifFontFamily(String str) {
        try {
            getSetSansSerifFontFamilyStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setSaveFormData(boolean z) {
        try {
            getSetSaveFormDatabooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setSavePassword(boolean z) {
        try {
            getSetSavePasswordbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setSerifFontFamily(String str) {
        try {
            getSetSerifFontFamilyStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setStandardFontFamily(String str) {
        try {
            getSetStandardFontFamilyStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setSupportMultipleWindows(boolean z) {
        try {
            getSetSupportMultipleWindowsbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setSupportZoom(boolean z) {
        try {
            getSetSupportZoombooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setTextZoom(int i) {
        try {
            getSetTextZoomintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setUseWideViewPort(boolean z) {
        try {
            getSetUseWideViewPortbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setUserAgentString(String str) {
        try {
            getSetUserAgentStringStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setUsingForAppBrand(int i) {
        try {
            getSetUsingForAppBrandintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setVideoHideDownloadUi(boolean z) {
        try {
            getSetVideoHideDownloadUibooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setVideoPlaybackRequiresUserGesture(boolean z) {
        try {
            getSetVideoPlaybackRequiresUserGesturebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean supportMultipleWindows() {
        try {
            return ((Boolean) getSupportMultipleWindowsMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean supportZoom() {
        try {
            return ((Boolean) getSupportZoomMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }
}
