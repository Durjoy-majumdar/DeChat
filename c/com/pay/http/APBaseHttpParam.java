package com.pay.http;

import com.pay.tool.APMidasTools;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.comm.APLog;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import java.util.HashMap;
import java.util.Map;

public class APBaseHttpParam {
    public static final int CONNECT_TIMEOUT = 15000;
    public static final int READ_TIMEOUT = 15000;
    public static final int TRY_TIMES = 2;
    public long begTime;
    public int connectTimeout;
    public String defaultDomain;
    public String domain;
    public long endTime;
    public String port;
    public int reTryTimes;
    public int readTimeout;
    public HashMap<String, String> reqParam;
    public String reqType;
    public int requestTimes;
    public String sendType;
    public String url;
    public String urlName;
    public String urlParams;

    public APBaseHttpParam() {
        this.reqType = HttpWrapperBase.PROTOCAL_HTTP;
        this.sendType = "GET";
        this.defaultDomain = "";
        this.domain = "";
        this.port = "";
        this.urlName = "";
        this.urlParams = "";
        this.connectTimeout = 15000;
        this.readTimeout = 15000;
        this.requestTimes = 0;
        this.reTryTimes = 2;
        this.begTime = 0;
        this.endTime = 0;
        this.reqParam = new HashMap<>();
        this.domain = APMidasTools.getSysServerDomain();
    }

    public void constructParams() {
        StringBuilder sb = new StringBuilder("");
        HashMap<String, String> hashMap = this.reqParam;
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                sb.append((String) next.getKey());
                sb.append("=");
                sb.append((String) next.getValue());
                sb.append("&");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                this.urlParams = sb.toString();
            }
        }
        APLog.m161214i("APBaseHttpReq", "urlParams=" + this.urlParams);
    }

    public void constructReTryUrl() {
        if (this.requestTimes < this.reTryTimes) {
            this.domain = this.defaultDomain;
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + this.urlName;
            this.requestTimes = this.requestTimes + 1;
        }
    }

    public void constructUrl() {
        constructParams();
        if (this.sendType.equals("GET")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.url);
            if (!this.url.endsWith("?")) {
                stringBuffer.append("?");
            }
            stringBuffer.append(this.urlParams.toString());
            this.url = stringBuffer.toString();
        }
    }

    public void setReportUrl(String str, String str2, String str3) {
        String str4 = APMidasPayAPI.env;
        if (str4.equals(APMidasPayAPI.ENV_DEV)) {
            this.domain = APPluginUrlConf.UNIPAY_DEV_DOMAIN;
            this.urlName = str;
        } else if (str4.equals(APMidasPayAPI.ENV_TEST)) {
            this.domain = APPluginUrlConf.UNIPAY_SANDBOX_DOMAIN;
            this.urlName = str2;
        } else if (str4.equals("release")) {
            this.domain = APPluginUrlConf.UNIPAY_RELEASE_REPORT_DOMAIN;
            this.urlName = str3;
        } else if (str4.equals(APMidasPayAPI.ENV_TESTING)) {
            this.domain = APPluginUrlConf.UNIPAY_RELEASE_REPORT_DOMAIN;
            this.urlName = str3;
        }
        this.reTryTimes = 1;
        this.defaultDomain = this.domain;
        if (str4.equals(APMidasPayAPI.ENV_DEV)) {
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + this.urlName;
        } else if (str4.equals(APMidasPayAPI.ENV_TEST)) {
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + this.urlName;
        } else if (str4.equals("release")) {
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + this.urlName;
        } else if (str4.equals(APMidasPayAPI.ENV_TESTING)) {
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + this.urlName;
        }
    }

    public void setReqWithHttp() {
        this.reqType = HttpWrapperBase.PROTOCAL_HTTP;
    }

    public void setReqWithHttps() {
        this.reqType = HttpWrapperBase.PROTOCAL_HTTPS;
    }

    public void setSendWithGet() {
        this.sendType = "GET";
    }

    public void setSendWithPost() {
        this.sendType = "POST";
    }

    public void setUrl(String str, String str2, String str3, String str4) {
        String str5 = APMidasPayAPI.env;
        if (str5.equals(APMidasPayAPI.ENV_DEV)) {
            this.urlName = str2;
            this.defaultDomain = APPluginUrlConf.UNIPAY_DEV_DOMAIN;
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + str2;
        } else if (str5.equals(APMidasPayAPI.ENV_TEST)) {
            this.urlName = str3;
            this.defaultDomain = APPluginUrlConf.UNIPAY_SANDBOX_DOMAIN;
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + str3;
        } else if (str5.equals(APMidasPayAPI.ENV_TESTING)) {
            this.urlName = str3;
            this.defaultDomain = APPluginUrlConf.UNIPAY_SANDBOX_DOMAIN;
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + str3;
        } else if (str5.equals("release")) {
            this.urlName = str4;
            this.defaultDomain = "api.unipay.qq.com";
            this.url = this.reqType + APToolNetwork.joinDomainPort(this.domain, this.port) + str4;
        }
    }

    public void setUrlNotMidas(String str, String str2, String str3, String str4) {
        String str5 = APMidasPayAPI.env;
        this.defaultDomain = "";
        if (str5.equals(APMidasPayAPI.ENV_TESTING)) {
            this.urlName = str2;
            this.url = str2;
        } else if (str5.equals(APMidasPayAPI.ENV_TEST)) {
            this.urlName = str3;
            this.url = str3;
        } else if (str5.equals("release")) {
            this.urlName = str4;
            this.url = str4;
        }
    }
}
