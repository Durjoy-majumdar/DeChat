package com.tencent.map.tools.net;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.map.tools.net.http.HttpCanceler;
import com.tencent.map.tools.net.http.HttpProxy;
import com.tencent.map.tools.net.http.HttpProxyRule;
import com.tencent.map.tools.net.processor.Processor;
import com.tencent.mapsdk.internal.C113800hd;
import com.tencent.mapsdk.internal.C113944lq;
import com.tencent.mapsdk.internal.C113946ls;
import com.tencent.mapsdk.internal.C113947lt;
import com.tencent.mapsdk.internal.C113948lu;
import com.tencent.mapsdk.internal.C113950lw;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NetRequest {
    public HttpCanceler canceler;
    /* access modifiers changed from: private */
    public File mCacheFile;
    /* access modifiers changed from: private */
    public boolean mForceHttps = true;
    /* access modifiers changed from: private */
    public boolean mIsLogEnable;
    /* access modifiers changed from: private */
    public NetAdapter mNetAdapter;
    /* access modifiers changed from: private */
    public HashSet<Class<? extends C113944lq>> mNetFlowProcessorClz;
    /* access modifiers changed from: private */
    public HashMap<String, String> mNetFlowRules;
    public NetMethod mNetMethod;
    /* access modifiers changed from: private */
    public List<HttpProxyRule> mProxyRules;
    public final long mRequestId = System.nanoTime();
    /* access modifiers changed from: private */
    public String mSecretKey;
    public final Map<String, String> mapHeaders = new HashMap();
    public byte[] postData;
    public final List<Processor> processors = new ArrayList();
    public HttpProxy proxy;
    public final Set<String> respHeaders = new HashSet();
    public int retryMethod;
    public int timeout;
    public String url;

    public static class NetRequestBuilder {
        private final NetRequest mNetRequest;

        public NetRequestBuilder(NetAdapter netAdapter, String str) {
            this(netAdapter, str, (NetRequest) null);
        }

        private NetResponse onRequestFinish(NetResponse netResponse) {
            if (netResponse != null) {
                File access$600 = this.mNetRequest.mCacheFile;
                if (access$600 != null) {
                    FileOutputStream fileOutputStream = null;
                    try {
                        if (access$600.isFile()) {
                            if (access$600.exists()) {
                                access$600.delete();
                            }
                            access$600.getParentFile().mkdirs();
                            access$600.createNewFile();
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(access$600);
                        try {
                            NetUtil.writeBytesWithoutClose(netResponse.data, fileOutputStream2);
                            NetUtil.safeClose(fileOutputStream2);
                        } catch (Exception e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            try {
                                NetUtil.safeClose(fileOutputStream);
                                netResponse.exception(e);
                                NetUtil.safeClose(fileOutputStream);
                                return netResponse;
                            } catch (Throwable th) {
                                th = th;
                                NetUtil.safeClose(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = fileOutputStream2;
                            NetUtil.safeClose(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        NetUtil.safeClose(fileOutputStream);
                        netResponse.exception(e);
                        NetUtil.safeClose(fileOutputStream);
                        return netResponse;
                    }
                }
                return netResponse;
            }
            NetResponse netResponse2 = new NetResponse(this.mNetRequest);
            netResponse2.errorCode = -100;
            netResponse2.errorData = "未知".getBytes();
            return netResponse2;
        }

        private void onRequestStart(String str, NetRequestBuilder netRequestBuilder) {
            netRequestBuilder.addProcessor(new C113948lu(this.mNetRequest.mIsLogEnable));
            netRequestBuilder.addProcessor(C113946ls.m157883a(this.mNetRequest.mForceHttps));
            netRequestBuilder.addProcessor(C113947lt.m157885a(this.mNetRequest.mProxyRules));
            netRequestBuilder.addProcessor(C113950lw.m157887a(this.mNetRequest.mSecretKey));
            if (this.mNetRequest.mProxyRules == null || this.mNetRequest.mProxyRules.size() <= 0) {
                Iterator it = this.mNetRequest.mNetFlowProcessorClz.iterator();
                while (it.hasNext()) {
                    Class cls = (Class) it.next();
                    try {
                        netRequestBuilder.addProcessor((C113944lq) C113800hd.m157128a(cls, this.mNetRequest.mNetFlowRules));
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public NetRequestBuilder addProcessor(Processor processor) {
            this.mNetRequest.addProcessor(processor);
            return this;
        }

        public NetRequestBuilder canceler(HttpCanceler httpCanceler) {
            this.mNetRequest.canceler = httpCanceler;
            return this;
        }

        public NetResponse doGet() {
            onRequestStart("doGet", this);
            return onRequestFinish(this.mNetRequest.doGet());
        }

        public NetResponse doPost() {
            onRequestStart("doPost", this);
            return onRequestFinish(this.mNetRequest.doPost());
        }

        public NetResponse doRequest() {
            onRequestStart("doRequest", this);
            return onRequestFinish(this.mNetRequest.doRequest());
        }

        public NetResponse doStream() {
            onRequestStart("doStream", this);
            return onRequestFinish(this.mNetRequest.doStream());
        }

        public NetResponse downloadTo(File file) {
            onRequestStart("downloadTo[" + file + "]", this);
            return file(file).doGet();
        }

        public NetRequestBuilder file(File file) {
            File unused = this.mNetRequest.mCacheFile = file;
            return this;
        }

        public NetRequestBuilder forceHttps(boolean z) {
            boolean unused = this.mNetRequest.mForceHttps = z;
            return this;
        }

        public NetRequest getNetRequest() {
            return this.mNetRequest;
        }

        public NetRequestBuilder gzip() {
            header("Accept-Encoding", "gzip");
            return this;
        }

        public NetRequestBuilder header(HashMap<String, String> hashMap) {
            this.mNetRequest.setMapHeaders(hashMap);
            return this;
        }

        public NetRequestBuilder nonce(String str) {
            this.mNetRequest.setNonce(str);
            return this;
        }

        public NetRequestBuilder postData(byte[] bArr) {
            this.mNetRequest.postData = bArr;
            return this;
        }

        public NetRequestBuilder proxy(HttpProxy httpProxy) {
            this.mNetRequest.proxy = httpProxy;
            return this;
        }

        public NetRequestBuilder retryNum(int i) {
            this.mNetRequest.retryMethod = i;
            return this;
        }

        public NetRequestBuilder startTag(String str) {
            this.mNetRequest.setStart(str);
            return this;
        }

        public NetRequestBuilder timeOut(int i) {
            this.mNetRequest.timeout = i;
            return this;
        }

        public NetRequestBuilder timestamp(String str) {
            this.mNetRequest.setTimeStamp(str);
            return this;
        }

        public String toString() {
            return "NetRequestBuilder{, mRequestId=" + this.mNetRequest.mRequestId + ", mNetRequest=" + this.mNetRequest + '}';
        }

        public NetRequestBuilder token(String str) {
            this.mNetRequest.setToken(str);
            return this;
        }

        public NetRequestBuilder url(String str) {
            this.mNetRequest.url = str;
            return this;
        }

        public NetRequestBuilder userAgent(String str) {
            this.mNetRequest.setUserAgent(str);
            return this;
        }

        public NetRequestBuilder(NetAdapter netAdapter, String str, NetRequest netRequest) {
            if (netRequest == null) {
                this.mNetRequest = new NetRequest().setTimeout(10000).setRetryMethod(1);
            } else {
                this.mNetRequest = netRequest;
            }
            NetAdapter unused = this.mNetRequest.mNetAdapter = netAdapter;
            String unused2 = this.mNetRequest.mSecretKey = str;
            List unused3 = this.mNetRequest.mProxyRules = netAdapter.getProxyRuleList();
            boolean unused4 = this.mNetRequest.mIsLogEnable = netAdapter.isLogEnable();
            HashSet unused5 = this.mNetRequest.mNetFlowProcessorClz = netAdapter.getNetFlowProcessor();
            HashMap unused6 = this.mNetRequest.mNetFlowRules = netAdapter.getNetFlowRuleList();
        }

        public NetRequestBuilder header(String str, String str2) {
            this.mNetRequest.setMapHeaders(str, str2);
            return this;
        }
    }

    public NetRequest() {
    }

    /* access modifiers changed from: private */
    public NetResponse doGet() {
        setNetMethod(NetMethod.GET);
        return this.mNetAdapter.doRequest(this);
    }

    /* access modifiers changed from: private */
    public NetResponse doPost() {
        setNetMethod(NetMethod.POST);
        return this.mNetAdapter.doRequest(this);
    }

    /* access modifiers changed from: private */
    public NetResponse doRequest() {
        return this.mNetAdapter.doRequest(this);
    }

    /* access modifiers changed from: private */
    public NetResponse doStream() {
        setNetMethod(NetMethod.GET);
        return this.mNetAdapter.openStream(this);
    }

    public NetRequest addProcessor(Processor processor) {
        this.processors.add(processor);
        return this;
    }

    public NetRequest setCanceler(HttpCanceler httpCanceler) {
        this.canceler = httpCanceler;
        return this;
    }

    public NetRequest setMapHeaders(Map<String, String> map) {
        if (map == null) {
            return this;
        }
        this.mapHeaders.putAll(map);
        return this;
    }

    public NetRequest setNetMethod(NetMethod netMethod) {
        this.mNetMethod = netMethod;
        return this;
    }

    public NetRequest setNonce(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mapHeaders.put("nonce", str);
        }
        return this;
    }

    public NetRequest setPostData(byte[] bArr) {
        this.postData = bArr;
        return this;
    }

    public NetRequest setRespHeaders(String... strArr) {
        this.respHeaders.addAll(Arrays.asList((Object[]) strArr.clone()));
        return this;
    }

    public NetRequest setRetryMethod(int i) {
        this.retryMethod = i;
        return this;
    }

    public NetRequest setStart(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map<String, String> map = this.mapHeaders;
            map.put("Range", "bytes=" + str + "-");
        }
        return this;
    }

    public NetRequest setTimeStamp(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mapHeaders.put(AppMeasurement.Param.TIMESTAMP, str);
        }
        return this;
    }

    public NetRequest setTimeout(int i) {
        this.timeout = i;
        return this;
    }

    public NetRequest setToken(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mapHeaders.put("Sign", str);
        }
        return this;
    }

    public NetRequest setUrl(String str) {
        this.url = str;
        return this;
    }

    public NetRequest setUserAgent(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mapHeaders.put("User-Agent", str);
        }
        return this;
    }

    public String toString() {
        return "NetRequest{mRequestId=" + this.mRequestId + ", mNetMethod=" + this.mNetMethod + ", url='" + this.url + '\'' + ", postData=" + Arrays.toString(this.postData) + ", retryMethod=" + this.retryMethod + ", mapHeaders=" + this.mapHeaders + ", respHeaders=" + this.respHeaders + ", processorSet=" + this.processors + ", canceler=" + this.canceler + ", timeout=" + this.timeout + ", proxy=" + this.proxy + '}';
    }

    public NetRequest setMapHeaders(String str, String str2) {
        this.mapHeaders.put(str, str2);
        return this;
    }

    public NetRequest(NetMethod netMethod, String str) {
        this.mNetMethod = netMethod;
        this.url = str;
    }
}
