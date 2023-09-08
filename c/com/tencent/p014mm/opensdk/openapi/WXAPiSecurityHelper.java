package com.tencent.p014mm.opensdk.openapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper */
class WXAPiSecurityHelper {
    private static final int MAX_STORE_KEY = 100;
    private static final int MAX_STORE_VALUE = 2048;
    private static final String SECURITY_KEY_TIMESTAMP_SECOND = "security_key_timestamp_second";
    private static final String STORE_VALUE_DATA = "security_key_resp";
    private static final String TAG = "MicroMsg.SDK.WXAPiSecurityHelper";
    private final Context context;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<String> overtimeSyncReqSet = new CopyOnWriteArraySet<>();

    /* renamed from: sp */
    private final SharedPreferences f49118sp;

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$IHttpCheckCallback */
    public interface IHttpCheckCallback {
        void onHttpCheckFinish(PromiseShareRule promiseShareRule);
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$ISecuritySyncCheck */
    public interface ISecuritySyncCheck {
        void onSyncCheckFinish(boolean z);
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$PassContext */
    public static class PassContext {
        public String appid;
        public String inputUrl;
        public PromiseShareRule localRule;
        public String reqSessionId;
        public String version;

        private PassContext() {
            this.reqSessionId = "";
            this.appid = "";
            this.inputUrl = "";
            this.version = "";
            this.localRule = new PromiseShareRule();
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$PromiseShareRule */
    public static class PromiseShareRule {
        public String appidInRule;
        public String buffer;
        public long nextRequestIntervalSecond;
        public String orgJsonData;
        public String reqAppid;
        public int state;
        public List<UrlRule> urlRuleList;
        public long userWaitTimeMs;

        private PromiseShareRule() {
            this.orgJsonData = "";
            this.reqAppid = "";
            this.appidInRule = "";
            this.urlRuleList = new ArrayList();
            this.buffer = "";
        }

        public long getLegalReqInterval() {
            long j = this.nextRequestIntervalSecond;
            if (j <= 0 || j >= 86400) {
                j = 3600;
            }
            Log.m99043d(WXAPiSecurityHelper.TAG, "getLegalReqInterval = " + j);
            return j;
        }

        public long getLegalUserWaitTime() {
            long j = this.userWaitTimeMs;
            if (j <= 100 || j >= 60000) {
                j = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
            }
            Log.m99043d(WXAPiSecurityHelper.TAG, "getLegalUserWaitTime = " + j);
            return j;
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$UrlRule */
    public static class UrlRule {
        public String host;
        public List<String> mustQueryKey;

        private UrlRule() {
            this.host = "";
            this.mustQueryKey = new ArrayList();
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$WXSecurityData */
    public static class WXSecurityData {
        public String appid;
        public long lastStoreTimeStampSecond;
        public String respDataJson;

        private WXSecurityData() {
            this.appid = "";
            this.respDataJson = "";
        }

        public boolean isBasicParamsAllowed() {
            long j = this.lastStoreTimeStampSecond;
            return ((j > 0 ? 1 : (j == 0 ? 0 : -1)) > 0 && (j > (System.currentTimeMillis() / 1000) ? 1 : (j == (System.currentTimeMillis() / 1000) ? 0 : -1)) < 0) && (C81058b.m99052b(this.appid) ^ true) && (C81058b.m99052b(this.respDataJson) ^ true);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$CheckRuleResult */
    public static class CheckRuleResult {
        public static final int NoPass = 2;
        public static final int Pass = 1;
        public static final int Unknown = 0;

        private CheckRuleResult() {
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$ExtraSecurityCheckRes */
    public static class ExtraSecurityCheckRes {
        public static final int Directly_NoPass = 1;
        public static final int Directly_Pass = 0;
        public static final int Need_Deep_Check = 2;
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$ISecurityCheck */
    public interface ISecurityCheck {
        void onCheckFinish(boolean z);
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper$RuleState */
    public static class RuleState {
        public static final int InRule = 1;
        public static final int None = 0;
        public static final int NotInRule = 2;

        private RuleState() {
        }
    }

    public WXAPiSecurityHelper(Context context2) {
        this.context = context2;
        this.f49118sp = context2.getSharedPreferences("__wx_opensdk_sp__", 0);
    }

    /* access modifiers changed from: private */
    public int checkRuleCanPass(String str, PromiseShareRule promiseShareRule) {
        String str2;
        Log.m99043d(TAG, "checkRuleCanPass, start check!");
        if (promiseShareRule.orgJsonData.length() > 2048) {
            Log.m99047w(TAG, "response json is too long!");
            return 0;
        }
        int i = promiseShareRule.state;
        if (i == 2) {
            str2 = "checkRuleCanPass, not in rule";
        } else if (i != 1 || !promiseShareRule.appidInRule.equals(promiseShareRule.reqAppid)) {
            Log.m99043d(TAG, "checkRuleCanPass, unknown");
            return 0;
        } else if (promiseShareRule.urlRuleList.size() == 0) {
            str2 = "checkRuleCanPass, urlRuleList empty!";
        } else {
            boolean checkUrlParametersLegal = checkUrlParametersLegal(str, promiseShareRule);
            Log.m99043d(TAG, "checkRuleCanPass, urlCheckResult = " + checkUrlParametersLegal);
            if (!checkUrlParametersLegal) {
                Log.m99043d(TAG, "checkRuleCanPass, no pass");
                return 2;
            }
            str2 = "checkRuleCanPass, pass";
        }
        Log.m99043d(TAG, str2);
        return 1;
    }

    private boolean checkUrlParametersLegal(String str, PromiseShareRule promiseShareRule) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (C81058b.m99052b(host)) {
            Log.m99045i(TAG, "checkUrlParameters, host empty!");
            return false;
        }
        for (int i = 0; i < promiseShareRule.urlRuleList.size(); i++) {
            UrlRule urlRule = promiseShareRule.urlRuleList.get(i);
            if (host.equals(urlRule.host)) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < urlRule.mustQueryKey.size()) {
                    try {
                        String str2 = urlRule.mustQueryKey.get(i2);
                        Log.m99043d(TAG, "checkRuleCanPass, key = " + str2);
                        if (!C81058b.m99052b(parse.getQueryParameter(str2))) {
                            i3++;
                        }
                        i2++;
                    } catch (Exception e) {
                        Log.m99044e(TAG, "checkRuleCanPass, parse fail, e = %s" + e.getMessage());
                    }
                }
                boolean z = i3 == urlRule.mustQueryKey.size();
                Log.m99043d(TAG, "checkRuleCanPass, rule.host = " + urlRule.host + ", queryOk = " + z);
                return z;
            }
        }
        return false;
    }

    private void doRequest(final PassContext passContext, final IHttpCheckCallback iHttpCheckCallback) {
        C81058b.f238080b.submit(new Runnable() {
            public void run() {
                WXAPiSecurityHelper wXAPiSecurityHelper = WXAPiSecurityHelper.this;
                PassContext passContext = passContext;
                iHttpCheckCallback.onHttpCheckFinish(WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, wXAPiSecurityHelper.postHttpRequest(passContext.appid, passContext.version, passContext.localRule.buffer).toString()));
            }
        });
    }

    private void doRequestAsync(PassContext passContext) {
        Log.m99043d(TAG, "doRequestAsync");
        doRequest(passContext, new IHttpCheckCallback() {
            public void onHttpCheckFinish(PromiseShareRule promiseShareRule) {
                WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    private void doRequestSync(final PassContext passContext, final ISecuritySyncCheck iSecuritySyncCheck) {
        Log.m99045i(TAG, "requestId = " + passContext.reqSessionId);
        final Timer timer = new Timer(passContext.reqSessionId);
        timer.schedule(new TimerTask() {
            public void run() {
                Log.m99045i(WXAPiSecurityHelper.TAG, "sync request overtime, requestId = " + passContext.reqSessionId);
                WXAPiSecurityHelper.this.overtimeSyncReqSet.add(passContext.reqSessionId);
                ISecuritySyncCheck iSecuritySyncCheck = iSecuritySyncCheck;
                if (iSecuritySyncCheck != null) {
                    iSecuritySyncCheck.onSyncCheckFinish(true);
                }
            }
        }, passContext.localRule.getLegalUserWaitTime());
        doRequest(passContext, new IHttpCheckCallback() {
            public void onHttpCheckFinish(PromiseShareRule promiseShareRule) {
                timer.cancel();
                if (WXAPiSecurityHelper.this.overtimeSyncReqSet.contains(passContext.reqSessionId)) {
                    WXAPiSecurityHelper.this.overtimeSyncReqSet.remove(passContext.reqSessionId);
                } else if (iSecuritySyncCheck != null) {
                    int access$500 = WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, promiseShareRule);
                    boolean z = true;
                    if (access$500 == 1) {
                        iSecuritySyncCheck.onSyncCheckFinish(true);
                    } else if (access$500 == 2) {
                        iSecuritySyncCheck.onSyncCheckFinish(false);
                    } else {
                        int access$5002 = WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, WXAPiSecurityHelper.this.getStoredData(passContext.appid).respDataJson));
                        ISecuritySyncCheck iSecuritySyncCheck = iSecuritySyncCheck;
                        if (access$5002 == 2) {
                            z = false;
                        }
                        iSecuritySyncCheck.onSyncCheckFinish(z);
                    }
                }
                WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    /* access modifiers changed from: private */
    public void extraSecurityCheckDoCallback(final ISecurityCheck iSecurityCheck, final boolean z) {
        if (iSecurityCheck != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    Log.m99043d(WXAPiSecurityHelper.TAG, "has got result, callback on Main Thread.");
                    iSecurityCheck.onCheckFinish(z);
                }
            });
        }
    }

    private String getStoreKey(String str) {
        return "security_key_appid_" + str;
    }

    private void storeCheckResp(String str, PromiseShareRule promiseShareRule) {
        String cookStoreJson = cookStoreJson(str, promiseShareRule);
        Log.m99043d(TAG, "cookStoreJson = " + cookStoreJson);
        if (C81058b.m99052b(cookStoreJson)) {
            Log.m99047w(TAG, "cookStoreJson get null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SECURITY_KEY_TIMESTAMP_SECOND, System.currentTimeMillis() / 1000);
            jSONObject.put(STORE_VALUE_DATA, cookStoreJson);
            commitSp(str, jSONObject.toString());
        } catch (Exception e) {
            Log.m99044e(TAG, "storeCheckResp fail, ex = " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void storeIfNecessary(PromiseShareRule promiseShareRule) {
        String str;
        Log.m99043d(TAG, "storeIfNecessary");
        if (C81058b.m99052b(promiseShareRule.reqAppid) || promiseShareRule.reqAppid.length() > 100) {
            str = "store fail! reqAppid illegal!";
        } else if (C81058b.m99052b(promiseShareRule.orgJsonData) || promiseShareRule.orgJsonData.length() > 2048) {
            str = "store fail! response json illegal!";
        } else {
            if (promiseShareRule.state == 1 && promiseShareRule.reqAppid.equals(promiseShareRule.appidInRule)) {
                Log.m99043d(TAG, "storeIfNecessary, in rule");
                storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
            }
            if (promiseShareRule.state == 2) {
                Log.m99043d(TAG, "storeIfNecessary, not rule");
                storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
                return;
            }
            return;
        }
        Log.m99045i(TAG, str);
    }

    public void commitSp(String str, String str2) {
        SharedPreferences.Editor edit = this.f49118sp.edit();
        edit.putString(getStoreKey(str), str2);
        edit.commit();
    }

    public PromiseShareRule convert2ShareRule(String str, String str2) {
        PromiseShareRule promiseShareRule = new PromiseShareRule();
        promiseShareRule.reqAppid = str;
        promiseShareRule.orgJsonData = str2;
        if (C81058b.m99052b(str2)) {
            Log.m99043d(TAG, "convert2ShareRule: jsonRespData is empty");
            return promiseShareRule;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            promiseShareRule.state = jSONObject.optInt("state", 0);
            promiseShareRule.appidInRule = jSONObject.optString("appid_rule", "");
            promiseShareRule.userWaitTimeMs = jSONObject.optLong("wait_time", 0);
            promiseShareRule.nextRequestIntervalSecond = jSONObject.optLong("interval", 0);
            promiseShareRule.buffer = jSONObject.optString("buffer", "");
            JSONArray optJSONArray = jSONObject.optJSONArray("rules");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    UrlRule urlRule = new UrlRule();
                    urlRule.host = jSONObject2.optString("host");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("querys");
                    if (optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            if (!C81058b.m99052b(optJSONArray2.optString(i2, ""))) {
                                urlRule.mustQueryKey.add(optJSONArray2.optString(i2, ""));
                            }
                        }
                    }
                    promiseShareRule.urlRuleList.add(urlRule);
                }
            }
        } catch (Exception e) {
            Log.m99044e(TAG, "coverJson2ShareRule fail, ex = " + e.getMessage());
        }
        return promiseShareRule;
    }

    public String cookStoreJson(String str, PromiseShareRule promiseShareRule) {
        String str2;
        if (promiseShareRule != null && !C81058b.m99052b(str)) {
            try {
                int i = promiseShareRule.state;
                if (i == 2) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", promiseShareRule.state);
                    jSONObject.put("interval", promiseShareRule.getLegalReqInterval());
                    jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
                    str2 = jSONObject.toString();
                } else if (i != 1) {
                    return "";
                } else {
                    str2 = covertShareRule2Json(promiseShareRule);
                }
                return str2;
            } catch (Exception e) {
                Log.m99044e(TAG, "storeCheckResp fail, ex = " + e.getMessage());
            }
        }
        return "";
    }

    public String covertShareRule2Json(PromiseShareRule promiseShareRule) {
        if (promiseShareRule == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", promiseShareRule.state);
            jSONObject.put("appid_rule", promiseShareRule.appidInRule);
            jSONObject.put("wait_time", promiseShareRule.userWaitTimeMs);
            jSONObject.put("interval", promiseShareRule.nextRequestIntervalSecond);
            jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
            JSONArray jSONArray = new JSONArray();
            for (UrlRule next : promiseShareRule.urlRuleList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("host", next.host);
                jSONObject2.put("querys", new JSONArray(next.mustQueryKey));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rules", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            Log.m99044e(TAG, "covertShareRule2Json fail, ex = " + e.getMessage());
            return "";
        }
    }

    public int doExtraSecurityCheck(String str, String str2, String str3, final ISecurityCheck iSecurityCheck) {
        Log.m99045i(TAG, "doExtraSecurityCheck: start!");
        if (C81058b.m99052b(str) || C81058b.m99052b(str3)) {
            Log.m99044e(TAG, "doExtraSecurityCheck: appid or inputurl is empty!");
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        PassContext passContext = new PassContext();
        passContext.reqSessionId = String.format("%s", new Object[]{currentTimeMillis + "" + new Random().nextInt(9999)});
        passContext.appid = str;
        passContext.inputUrl = str3;
        passContext.version = str2;
        WXSecurityData storedData = getStoredData(str);
        if (this.context.getPackageManager().checkPermission("android.permission.INTERNET", this.context.getPackageName()) != 0) {
            Log.m99047w(TAG, "doExtraSecurityCheck: No Internet permission!");
            return 0;
        } else if (!storedData.isBasicParamsAllowed()) {
            Log.m99043d(TAG, "doExtraSecurityCheck: local data illegal!");
            doRequestAsync(passContext);
            return 0;
        } else {
            PromiseShareRule convert2ShareRule = convert2ShareRule(passContext.appid, storedData.respDataJson);
            passContext.localRule = convert2ShareRule;
            boolean z = (storedData.lastStoreTimeStampSecond + convert2ShareRule.getLegalReqInterval()) * 1000 < System.currentTimeMillis();
            Log.m99043d(TAG, "doExtraSecurityCheck: needDoNextReq: " + z + ", last req time stamp:" + storedData.lastStoreTimeStampSecond);
            if (!z) {
                int checkRuleCanPass = checkRuleCanPass(passContext.inputUrl, passContext.localRule);
                Log.m99043d(TAG, "doExtraSecurityCheck: no needDoNextReq, read local rule: " + checkRuleCanPass);
                return checkRuleCanPass == 2 ? 1 : 0;
            }
            Log.m99043d(TAG, "doExtraSecurityCheck: needDoNextReq, state: " + passContext.localRule.state);
            if (passContext.localRule.state != 1) {
                doRequestAsync(passContext);
                return 0;
            }
            doRequestSync(passContext, new ISecuritySyncCheck() {
                public void onSyncCheckFinish(boolean z) {
                    WXAPiSecurityHelper.this.extraSecurityCheckDoCallback(iSecurityCheck, z);
                }
            });
            return 2;
        }
    }

    public String extractMayNeedDoSecurityCheckUrl(String str, BaseReq baseReq) {
        if (baseReq.getType() != 2) {
            return "";
        }
        SendMessageToWX.Req req = (SendMessageToWX.Req) baseReq;
        if (req.message.getType() != 5) {
            return "";
        }
        WXWebpageObject wXWebpageObject = (WXWebpageObject) req.message.mediaObject;
        if (C81058b.m99052b(wXWebpageObject.webpageUrl)) {
            Log.m99045i(TAG, "webpageUrl empty, don't need check.");
            return "";
        }
        Log.m99045i(TAG, "need check.");
        return wXWebpageObject.webpageUrl;
    }

    public String getLocalStoredJson(String str) {
        return getStoredData(str).respDataJson;
    }

    public WXSecurityData getStoredData(String str) {
        String str2;
        WXSecurityData wXSecurityData = new WXSecurityData();
        Log.m99043d(TAG, "getStoredData, appid = " + str);
        try {
            if (!this.f49118sp.contains(getStoreKey(str))) {
                str2 = "getStoredData, fail, not exist!";
            } else {
                JSONObject jSONObject = new JSONObject(this.f49118sp.getString(getStoreKey(str), ""));
                long optLong = jSONObject.optLong(SECURITY_KEY_TIMESTAMP_SECOND);
                String optString = jSONObject.optString(STORE_VALUE_DATA);
                wXSecurityData.appid = str;
                wXSecurityData.lastStoreTimeStampSecond = optLong;
                wXSecurityData.respDataJson = optString;
                str2 = "getStoredData, Ok, appid = " + str + "timeStampSecond: " + wXSecurityData.lastStoreTimeStampSecond;
            }
            Log.m99043d(TAG, str2);
        } catch (Exception e) {
            Log.m99044e(TAG, "getStoredData fail, ex = " + e.getMessage());
        }
        return wXSecurityData;
    }

    public StringBuffer postHttpRequest(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            String encode2 = URLEncoder.encode(str3, "UTF-8");
            String format = String.format("https://mp.weixin.qq.com/publicpoc/opensdkconf?action=GetShareConf&appid=%s&sdkVersion=%s&buffer=%s", new Object[]{encode, str2, encode2});
            Log.m99043d(TAG, "request http, url = " + format + ", appid = " + encode + ", version = " + str2 + ", buffer = " + encode2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(format).openConnection();
            httpURLConnection.setConnectTimeout(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            httpURLConnection.setReadTimeout(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            Log.m99045i(TAG, "http respCode = " + responseCode);
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                Log.m99043d(TAG, "http response = " + stringBuffer);
                bufferedReader.close();
            }
            httpURLConnection.disconnect();
        } catch (Exception e) {
            Log.m99044e(TAG, "http request fail, ex = " + e.getMessage());
        }
        return stringBuffer;
    }
}
