package com.tencent.xweb;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.xweb.util.XWebLog;
import java.util.HashMap;
import java.util.Map;

public class XWebTranslateLogic {
    private static final String TAG = "XWebTranslateLogic";
    private final TranslateLogicCallback mCallback;
    private boolean mIsTipsShow = false;
    private boolean mIsTranslateMode = false;
    private final WebView mWebviewWraper;

    public interface TranslateLogicCallback {
        void onTranslateFinish();

        void onTranslateMiscCallBack(String str, Bundle bundle);

        void onTranslateStart();

        void replaceTranslatedString(Map<String, String> map);
    }

    public XWebTranslateLogic(WebView webView, TranslateLogicCallback translateLogicCallback) {
        this.mWebviewWraper = webView;
        this.mCallback = translateLogicCallback;
    }

    private void trySetTranslateTipsView(boolean z, String str) {
        if (this.mIsTranslateMode && !this.mIsTipsShow) {
            this.mIsTipsShow = true;
            XWebLog.m21911i(TAG, "getTranslateTipsView");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 144);
            layoutParams.gravity = 51;
            TextView textView = new TextView(this.mWebviewWraper.getContext());
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(Color.argb(127, 0, 0, 0));
            textView.setTextSize(0, 42.0f);
            if (z) {
                textView.setBackgroundColor(-328966);
            } else {
                textView.setBackgroundColor(-855310);
            }
            ((ViewGroup) this.mWebviewWraper.getParent()).addView(textView, layoutParams);
            ((FrameLayout.LayoutParams) this.mWebviewWraper.getLayoutParams()).topMargin = 144;
            this.mWebviewWraper.requestLayout();
        }
    }

    public void onGetSampleString(Map<String, String> map) {
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        XWebLog.m21908d(TAG, "translate: OnGetSampleString orgHashMap size = " + map.size() + " resultHashMap size = " + hashMap.size());
        bundle.putSerializable("sample_hashmap", hashMap);
        this.mCallback.onTranslateMiscCallBack("onGetSampleString", bundle);
    }

    public void onGetTranslateString(Map<String, String> map) {
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        XWebLog.m21908d(TAG, "translate: onGetTranslateString orgHashMap size = " + map.size() + " resultHashMap size = " + hashMap.size());
        if (hashMap.size() == 0 && this.mIsTranslateMode) {
            XWebLog.m21908d(TAG, "translate: onTranslateFinish");
            this.mCallback.onTranslateFinish();
        }
        bundle.putSerializable("translate_hashmap", hashMap);
        this.mCallback.onTranslateMiscCallBack("onGetTranslateString", bundle);
    }

    public void onPageLoadStarted() {
        if (this.mIsTranslateMode) {
            XWebLog.m21908d(TAG, "onTranslateStart setTranslateMode true ");
            this.mCallback.onTranslateStart();
        }
    }

    public void replaceTranslatedString(Bundle bundle) {
        XWebLog.m21911i(TAG, "translate: replaceTranslatedString mIsTranslateMode =" + this.mIsTranslateMode);
        if (this.mIsTranslateMode) {
            HashMap hashMap = (HashMap) bundle.getSerializable("translate_hashmap");
            Boolean valueOf = Boolean.valueOf(bundle.getBoolean("is_mp_url"));
            String string = bundle.getString("translate_tips");
            HashMap hashMap2 = new HashMap();
            for (String str : hashMap.keySet()) {
                String str2 = (String) hashMap.get(str);
                if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                    XWebLog.m21908d(TAG, "translate: string is err !!!  key = " + str + " value = " + str2);
                } else if (str2.trim().length() == 0 || str2.trim().equals("\n") || str2.trim().equals("\r")) {
                    XWebLog.m21908d(TAG, "translate: string is space  or change line  value = " + str2);
                } else {
                    hashMap2.put(str, str2);
                }
            }
            XWebLog.m21908d(TAG, "translate: replaceTranslatedString orgHashMap size = " + hashMap.size() + " resultHashMap size = " + hashMap2.size());
            this.mCallback.replaceTranslatedString(hashMap2);
            trySetTranslateTipsView(valueOf.booleanValue(), string);
            XWebLog.m21908d(TAG, "translate: onTranslateFinish");
            this.mCallback.onTranslateFinish();
        }
    }

    public void setIsInTranslateMode(boolean z) {
        this.mIsTranslateMode = z;
    }
}
