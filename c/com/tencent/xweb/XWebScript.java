package com.tencent.xweb;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.xweb.util.XWebLog;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.xwalk.core.XWalkEnvironment;

public class XWebScript {
    public static final int CACHE_OPTION_CODE_CACHE_IN_MEN = 512;
    private static final int CACHE_OPTION_DUMP_PERFORMANCE = 2048;
    public static final int CACHE_OPTION_FLAG_CACHE_UTF16 = 256;
    public static final int CACHE_OPTION_JS_SRC_IN_MEM = 1024;
    public static final int CODE_CACHE_COMPILE_MODE_FULL = 3;
    public static final int CODE_CACHE_COMPILE_MODE_NONE = 0;
    public static final int CODE_CACHE_COMPILE_MODE_NORMAL = 2;
    public static final int CODE_CACHE_COMPILE_MODE_SIMPLE = 1;
    public static final String JS_CODE_CACHE_COMPILE_MODE_FULL = "fullcache";
    public static final String JS_CODE_CACHE_COMPILE_MODE_NONE = "nocache";
    public static final String JS_CODE_CACHE_COMPILE_MODE_NORMAL = "normalcache";
    public static final String JS_CODE_CACHE_COMPILE_MODE_SIMPLE = "simplecache";
    private static final String JS_PARAM_KIND_BUFFER = "buffer";
    private static final String JS_PARAM_KIND_PATH = "path";
    private static final String JS_SRC_KIND_PATH = "path";
    private static final String JS_SRC_KIND_RAW_SRC = "string";
    private static final String TAG = "XWebScript";
    private String appendScript;
    private long bufferAddr;
    private int bufferSize;
    private String cacheKey;
    private int cacheOption = 0;
    private int ccCompileMode = 0;
    private String jsFallBack;
    private String jsParamPath;
    private String jsSrcKind;
    private String jsSrcValue;
    private WebView viewWv;

    public static class XWebScriptPerformance {
        private static final String KEY_COMPILE_COST = "compile_cost";
        private static final String KEY_RUN_COST = "run_cost";
        private static final String KEY_SCRIPT_RET = "script_ret";
        private static final String KEY_USE_CODE_CACHE = "use_code_cache";
        private static final String KEY_V8_STR_COST = "v8str_cost";
        private JSONObject jObject;
        private String jsonString = "";

        public XWebScriptPerformance(String str) {
            if (str != null) {
                try {
                    this.jObject = new JSONObject(str);
                } catch (JSONException unused) {
                }
            }
        }

        public boolean getBoolean(String str, boolean z) {
            JSONObject jSONObject = this.jObject;
            if (jSONObject == null) {
                return z;
            }
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return z;
            }
        }

        public long getCompileCost() {
            return getCost(KEY_COMPILE_COST, -1);
        }

        public long getCost(String str, long j) {
            JSONObject jSONObject = this.jObject;
            if (jSONObject == null) {
                return j;
            }
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
                return j;
            }
        }

        public long getRunCost() {
            return getCost(KEY_RUN_COST, -1);
        }

        public String getScriptRet() {
            JSONObject jSONObject = this.jObject;
            if (jSONObject == null) {
                return this.jsonString;
            }
            try {
                return jSONObject.getString(KEY_SCRIPT_RET);
            } catch (JSONException unused) {
                return this.jsonString;
            }
        }

        public boolean getUseCodeCache() {
            return getBoolean(KEY_USE_CODE_CACHE, false);
        }

        public long getV8StrCost() {
            return getCost(KEY_V8_STR_COST, -1);
        }

        public String toString() {
            JSONObject jSONObject = this.jObject;
            return jSONObject == null ? this.jsonString : jSONObject.toString();
        }
    }

    public XWebScript(int i, int i2, WebView webView) {
        setCacheMode(i);
        this.cacheOption = i2;
        this.viewWv = webView;
    }

    public boolean checkValid() {
        WebView webView = this.viewWv;
        if (webView != null && webView.supportFeature(2002)) {
            if (TextUtils.isEmpty(this.jsSrcValue)) {
                XWebLog.m21909e(TAG, "checkValid failed jsSrcValue invalid = " + this.jsSrcValue);
                return false;
            } else if (TextUtils.isEmpty(this.jsSrcKind)) {
                XWebLog.m21909e(TAG, "checkValid failed jsSrcKind invalid = " + this.jsSrcKind);
                return false;
            } else if (this.ccCompileMode >= 0) {
                long j = this.bufferAddr;
                if (j != 0 && this.bufferSize <= 0) {
                    XWebLog.m21909e(TAG, "checkValid failed bufferSize invalid = " + this.bufferSize);
                    return false;
                } else if (this.bufferSize != 0 && j == 0) {
                    XWebLog.m21909e(TAG, "checkValid failed bufferAddr invalid = " + this.bufferAddr);
                    return false;
                } else if (TextUtils.isEmpty(this.jsParamPath) || this.viewWv.supportFeature(2008)) {
                    return true;
                } else {
                    XWebLog.m21909e(TAG, "not support jsparam as file path, apk ver = " + XWalkEnvironment.getAvailableVersion());
                    return false;
                }
            } else {
                XWebLog.m21909e(TAG, "checkValid failed compile mode invalid = " + this.ccCompileMode);
            }
        }
        return false;
    }

    public void execute() {
        this.cacheOption &= -2049;
        this.viewWv.evaluateJavascript(toString(), (ValueCallback<String>) null);
    }

    public void setCacheKey(String str) {
        this.cacheKey = str;
    }

    public void setCacheMode(String str) {
        if (JS_CODE_CACHE_COMPILE_MODE_NONE.equals(str)) {
            setCacheMode(0);
        } else if (JS_CODE_CACHE_COMPILE_MODE_SIMPLE.equals(str)) {
            setCacheMode(1);
        } else if (JS_CODE_CACHE_COMPILE_MODE_NORMAL.equals(str)) {
            setCacheMode(2);
        } else if (JS_CODE_CACHE_COMPILE_MODE_FULL.equals(str)) {
            setCacheMode(3);
        }
    }

    public void setCacheOption(int i) {
        this.cacheOption = i;
    }

    public void setFallBackLogic(String str) {
        this.jsFallBack = str;
    }

    public void setJsParamAsBuffer(long j, int i) {
        this.bufferAddr = j;
        this.bufferSize = i;
    }

    public void setJsParamAsFilePath(String str) {
        this.jsParamPath = str;
    }

    public void setJsSrc(String str, String str2) {
        this.jsSrcValue = str;
        this.jsSrcKind = str2;
    }

    public void setJsSrcAsPath(String str) {
        setJsSrc(str, "path");
    }

    public void setJsSrcAsRawString(String str) {
        setJsSrc(str, JS_SRC_KIND_RAW_SRC);
    }

    public String toString() {
        if (!checkValid()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("//XWEB_SCRIPT:");
        try {
            JSONStringer value = new JSONStringer().object().key("compile_mode").value((long) this.ccCompileMode).key("cache_option").value((long) this.cacheOption).key("js_src_kind").value(this.jsSrcKind).key("js_src").value(this.jsSrcValue);
            if (!TextUtils.isEmpty(this.cacheKey)) {
                value = value.key("cache_key").value(this.cacheKey);
            }
            if (!TextUtils.isEmpty(this.appendScript)) {
                value = value.key("append_script").value(this.appendScript);
            }
            if (!TextUtils.isEmpty(this.jsParamPath)) {
                value = value.key("js_param_kind").value("path").key("js_param").value(this.jsParamPath);
            } else if (!(this.bufferAddr == 0 || this.bufferSize == 0)) {
                value = value.key("js_param_kind").value(JS_PARAM_KIND_BUFFER).key("js_param").value(Long.toHexString(this.bufferAddr)).key("js_param_length").value((long) this.bufferSize);
            }
            value.endObject();
            sb.append(value.toString());
            WebView webView = this.viewWv;
            if (webView != null && webView.supportFeature(2004)) {
                sb.append("XWEB_SCRIPT_END\n\r" + this.jsFallBack);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "xweb script create failed, error", th);
        }
        return sb.toString();
    }

    public void setJsSrcAsPath(String str, String str2) {
        setJsSrc(str, "path");
        this.appendScript = str2;
    }

    public void execute(ValueCallback<String> valueCallback) {
        this.cacheOption &= -2049;
        this.viewWv.evaluateJavascript(toString(), valueCallback);
    }

    public void execute(final ValueCallback<String> valueCallback, final ValueCallback<XWebScriptPerformance> valueCallback2) {
        if (!this.viewWv.supportFeature(2011)) {
            execute(valueCallback);
            XWebLog.m21911i(TAG, "current xweb version not support xweb script performance dump");
            return;
        }
        if (valueCallback2 != null) {
            this.cacheOption |= 2048;
        }
        this.viewWv.evaluateJavascript(toString(), new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                String str2;
                if (valueCallback2 != null) {
                    XWebScriptPerformance xWebScriptPerformance = new XWebScriptPerformance(str);
                    valueCallback2.onReceiveValue(xWebScriptPerformance);
                    str2 = xWebScriptPerformance.getScriptRet();
                } else {
                    str2 = str;
                }
                ValueCallback valueCallback = valueCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(str2);
                }
                XWebLog.m21911i(XWebScript.TAG, "andrewu excute js , ret = " + str);
            }
        });
    }

    public void setCacheMode(int i) {
        this.ccCompileMode = i;
    }
}
