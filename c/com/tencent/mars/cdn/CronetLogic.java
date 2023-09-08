package com.tencent.mars.cdn;

import android.os.Environment;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class CronetLogic {
    private static List<CronetTaskNetworkStateCallback> cronetTaskNetworkStateCallbackList = new ArrayList();
    private static boolean useHttpdns;

    public static class ChunkedData {
        public byte[] data = null;
    }

    public static class QuicTaskParams {
        public QuicForceHost[] quicForceHosts;
        public QuicHostMap[] quicHostMaps;
    }

    public static class ResponseHeader {
        public HeaderMap[] headers = null;
    }

    public static class CertVerifyResult {
        public byte[][] certificateChain = null;
        public boolean isIssuedByKnownRoot = false;
        public int status = 0;
    }

    public static class CronetDownloadProgress {
        public long currentWriteByte = 0;
        public long totalByte = 0;
    }

    public static class CronetHttpsCreateResult {
        public int createRet = 0;
        public String taskId = "";
    }

    public static class CronetRequestParams {
        public byte[] bodyData = null;
        public boolean cachePerformance = false;
        public DefaultHttpTaskParams defaultHttpTaskParams = null;
        public boolean followRedirect = false;
        public boolean forbidSocketReuse = false;
        public boolean forceBindMobileNetwork = false;
        public String header = "";
        public HeaderMap[] headers = null;
        public HostIPHint hostIPHint = null;
        public int maxRedirectCount = 2;
        public String method = "";
        public boolean miniPrograms = false;
        public boolean needGenerateId = true;
        public boolean needWirteCache = false;
        public boolean preferMobileBecauseWifiIsWeak = false;
        public String savePath = "";
        public String taskId = "";
        public int taskType = 0;
        public UploadParams uploadParams = null;
        public String url = "";
        public boolean useHttp2 = false;
        public boolean useMemoryCache = false;
        public boolean useNewdns = false;
        public boolean useQuic = false;

        public static class CronetTaskType {
            public static final int CUSTOM_FILE_DOWNLOAD = 9;
            public static final int DEFAULT_HTTP_REQUEST = 8;
            public static final int HTTP2_DOWNLOAD = 4;
            public static final int HTTP2_REQUEST = 3;
            public static final int HTTP_CHUNK_REQUEST = 10;
            public static final int HTTP_DOWNLOAD = 2;
            public static final int HTTP_REQUEST = 1;
            public static final int HTTP_UPLOAD = 7;
            public static final int QUIC_DOWNLOAD = 6;
            public static final int QUIC_REQUEST = 5;
        }

        public void makeRequestHeader(Map<String, String> map) {
            if (map == null || !map.isEmpty()) {
                int size = map.size();
                int i = 0;
                this.headers = new HeaderMap[size];
                for (Map.Entry next : map.entrySet()) {
                    HeaderMap headerMap = new HeaderMap();
                    headerMap.key = (String) next.getKey();
                    headerMap.value = (String) next.getValue();
                    this.headers[i] = headerMap;
                    i++;
                    if (i > size) {
                        return;
                    }
                }
            }
        }
    }

    public interface CronetTaskCallback {
        void onCronetReceiveChunkedData(ChunkedData chunkedData, long j);

        int onCronetReceiveHeader(ResponseHeader responseHeader, int i, String str);

        void onCronetReceiveUploadProgress(long j, long j2);

        void onCronetTaskCompleted(String str, CronetTaskResult cronetTaskResult, String str2);

        void onDownloadProgressChanged(String str, CronetDownloadProgress cronetDownloadProgress);
    }

    public interface CronetTaskNetworkStateCallback {
        void onNetWeakChange(boolean z);
    }

    public static class CronetTaskResult {
        public int cronetErrorCode = 0;
        public byte[] data = null;
        public int errorCode = 0;
        public String errorMsg = "";
        public HeaderMap[] headers = null;
        public String newLocation = "";
        public String originTaskId = "";
        public int quicErrorCode = 0;
        public String rawHeader = "";
        public int statusCode = 0;
        public String statusText = "";
        public long totalReceiveByte = 0;
        public long totalSendByte = 0;
        public long totalWriteByte = 0;
        public boolean useHttp2 = false;
        public boolean useNewdns = false;
        public boolean useQuic = false;
        public WebPageProfile webPageProfile;

        public String getDataString() {
            try {
                return new String(this.data, "UTF-8");
            } catch (Exception unused) {
                return "";
            }
        }

        public Map<String, String> getHeaderMap() {
            String str;
            IdentityHashMap identityHashMap = new IdentityHashMap();
            HeaderMap[] headerMapArr = this.headers;
            if (headerMapArr != null) {
                for (HeaderMap headerMap : headerMapArr) {
                    if (!(headerMap == null || (str = headerMap.key) == null || headerMap.value == null)) {
                        identityHashMap.put(new String(str), headerMap.value);
                    }
                }
            }
            return identityHashMap;
        }

        public Map<String, List<String>> getHeaderMapList() {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : getHeaderMap().entrySet()) {
                String str = (String) next.getKey();
                if (str != null && !str.isEmpty()) {
                    String str2 = (String) next.getValue();
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(str2);
                    hashMap.put(str, list);
                }
            }
            return hashMap;
        }
    }

    public static class DefaultHttpTaskParams {
        public int reportId = 0;
    }

    public static class HeaderMap {
        public String key = "";
        public String value = "";
    }

    public static class HostIPHint {
        public HostIpMap[] hostMap;
    }

    public static class HostIpMap {
        public String host;

        /* renamed from: ip */
        public String f235229ip;
        public int port;
    }

    public static class QuicForceHost {
        public String host;
        public int port;
    }

    public static class QuicHostMap {
        public String host;

        /* renamed from: ip */
        public String f235230ip;
        public int port;
    }

    public static class UploadParams {
        public byte[] endData;
        public String filePath;
        public byte[] formData;
        public int reportId = 0;
        public long uploadOffset = 0;
        public long uploadRange = 0;
        public boolean vfsPath = false;
    }

    public static class WebPageProfile {
        public long SSLconnectionEnd;
        public long SSLconnectionStart;
        public long connectEnd;
        public long connectStart;
        public long domainLookUpEnd;
        public long domainLookUpStart;
        public int downstreamThroughputKbpsEstimate;
        public long fetchStart;
        public int httpRttEstimate;
        public int networkTypeEstimate;
        public String peerIP = "";
        public int port;
        public String protocol = "";
        public long receivedBytedCount;
        public long redirectEnd;
        public long redirectStart;
        public long requestEnd;
        public long requestStart;
        public long responseEnd;
        public long responseStart;
        public int rtt;
        public long sendBytesCount;
        public boolean socketReused;
        public int statusCode;
        public int throughputKbps;
        public int transportRttEstimate;

        public String toString() {
            return "WebPageProfile{redirectStart=" + this.redirectStart + ", redirectEnd=" + this.redirectEnd + ", fetchStart=" + this.fetchStart + ", domainLookUpStart=" + this.domainLookUpStart + ", domainLookUpEnd=" + this.domainLookUpEnd + ", connectStart=" + this.connectStart + ", connectEnd=" + this.connectEnd + ", SSLconnectionStart=" + this.SSLconnectionStart + ", SSLconnectionEnd=" + this.SSLconnectionEnd + ", requestStart=" + this.requestStart + ", requestEnd=" + this.requestEnd + ", responseStart=" + this.responseStart + ", responseEnd=" + this.responseEnd + ", protocol='" + this.protocol + '\'' + ", rtt=" + this.rtt + ", statusCode=" + this.statusCode + ", networkTypeEstimate=" + this.networkTypeEstimate + ", httpRttEstimate=" + this.httpRttEstimate + ", transportRttEstimate=" + this.transportRttEstimate + ", downstreamThroughputKbpsEstimate=" + this.downstreamThroughputKbpsEstimate + ", throughputKbps=" + this.throughputKbps + ", peerIP='" + this.peerIP + '\'' + ", port=" + this.port + ", socketReused=" + this.socketReused + ", sendBytesCount=" + this.sendBytesCount + ", receivedBytedCount=" + this.receivedBytedCount + '}';
        }
    }

    public static void addCronetTaskNetworkStateCallback(CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
        cronetTaskNetworkStateCallbackList.add(cronetTaskNetworkStateCallback);
    }

    public static native void cancelCronetTask(String str);

    public static CertVerifyResult convertToCronetResult(AndroidCertVerifyResult androidCertVerifyResult) {
        CertVerifyResult certVerifyResult = new CertVerifyResult();
        certVerifyResult.status = androidCertVerifyResult.getStatus();
        certVerifyResult.isIssuedByKnownRoot = androidCertVerifyResult.isIssuedByKnownRoot();
        certVerifyResult.certificateChain = androidCertVerifyResult.getCertificateChainEncoded();
        return certVerifyResult;
    }

    public static int cronetBindMobileSocket(int i) {
        Log.m105924i("cronet", "cronetBindMobileSocket " + i);
        return CronetMultiNetLinkWaysUtil.Companion.instance().bindSocketToMobile(i, MMApplicationContext.getContext());
    }

    public static void cronetDebugTest(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105918d("cronet", "test command is empty");
            return;
        }
        Log.m105918d("cronet", "cronet test command " + str);
        CronetRequestParams cronetRequestParams = new CronetRequestParams();
        int i = 0;
        if (str.contains("chunk")) {
            cronetRequestParams.taskType = 10;
            cronetRequestParams.taskId = "zzy_test";
            cronetRequestParams.url = "https://www.httpwatch.com/httpgallery/chunked/chunkedimage.aspx";
            HashMap hashMap = new HashMap();
            hashMap.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
            cronetRequestParams.makeRequestHeader(hashMap);
            startCronetHttpTask(cronetRequestParams, new CronetTaskCallback(false) {
                private boolean logData;

                {
                    this.logData = r1;
                }

                public void onCronetReceiveChunkedData(ChunkedData chunkedData, long j) {
                    Log.m105918d("cronet", "receive chunk length: " + j + " data " + chunkedData.data.length);
                }

                public int onCronetReceiveHeader(ResponseHeader responseHeader, int i, String str) {
                    Log.m105918d("cronet", "onCronetReceiveHeader " + responseHeader.headers.length + " status code " + i + " protocol " + str);
                    return 0;
                }

                public void onCronetReceiveUploadProgress(long j, long j2) {
                    Log.m105918d("cronet", "receive upload progress " + j + " total " + j2);
                }

                public void onCronetTaskCompleted(String str, CronetTaskResult cronetTaskResult, String str2) {
                    if (cronetTaskResult.errorCode != 0) {
                        Log.m105924i("cronet", "onCronetTaskCompleted " + str + " error " + cronetTaskResult.errorCode + " , " + cronetTaskResult.errorMsg);
                        return;
                    }
                    Log.m105918d("cronet", "onCronetTaskCompleted " + str + " data: " + cronetTaskResult.getDataString());
                    if (this.logData) {
                        Log.m105918d("cronet", "onCronetTaskCompleted data: " + new String(cronetTaskResult.data) + " write byte " + cronetTaskResult.totalWriteByte + " receive " + cronetTaskResult.totalReceiveByte);
                        StringBuilder sb = new StringBuilder();
                        sb.append("onCronetTaskCompleted send byte ");
                        sb.append(cronetTaskResult.totalSendByte);
                        Log.m105918d("cronet", sb.toString());
                    }
                }

                public void onDownloadProgressChanged(String str, CronetDownloadProgress cronetDownloadProgress) {
                    Log.m105918d("cronet", "onDownloadProgressChanged " + cronetDownloadProgress.currentWriteByte);
                }
            });
        } else if (str.contains("upload")) {
            cronetRequestParams.taskType = 7;
            cronetRequestParams.taskId = "zzy_upload_test";
            cronetRequestParams.url = "http://www.csm-testcenter.org/test";
            cronetRequestParams.method = "POST";
            UploadParams uploadParams = new UploadParams();
            uploadParams.filePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/upload_text";
            long length = new File(uploadParams.filePath).length();
            uploadParams.uploadOffset = 0;
            uploadParams.uploadRange = length;
            uploadParams.formData = "----WebKitFormBoundaryn35wXoQ8S5FsBTGs".getBytes(StandardCharsets.UTF_8);
            uploadParams.endData = "----WebKitFormBoundaryn35wXoQ8S5FsBTGs".getBytes(StandardCharsets.UTF_8);
            uploadParams.vfsPath = true;
            uploadParams.reportId = 1800;
            cronetRequestParams.uploadParams = uploadParams;
            HashMap hashMap2 = new HashMap();
            byte[] bArr = uploadParams.formData;
            long length2 = length + ((long) (bArr == null ? 0 : bArr.length));
            byte[] bArr2 = uploadParams.endData;
            if (bArr2 != null) {
                i = bArr2.length;
            }
            hashMap2.put("Content-Length", Long.toString(length2 + ((long) i)));
            hashMap2.put("Origin", "http://www.csm-testcenter.org");
            hashMap2.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
            hashMap2.put("Accept-Encoding", "gzip, deflate");
            hashMap2.put("Referer", "http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload");
            hashMap2.put("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryn35wXoQ8S5FsBTGs");
            hashMap2.put("Host", "www.csm-testcenter.org");
            hashMap2.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36");
            cronetRequestParams.makeRequestHeader(hashMap2);
            startCronetUploadTask(cronetRequestParams, new CronetTaskCallback(true) {
                private boolean logData;

                {
                    this.logData = r1;
                }

                public void onCronetReceiveChunkedData(ChunkedData chunkedData, long j) {
                    Log.m105918d("cronet", "receive chunk length: " + j + " data " + chunkedData.data.length);
                }

                public int onCronetReceiveHeader(ResponseHeader responseHeader, int i, String str) {
                    Log.m105918d("cronet", "onCronetReceiveHeader " + responseHeader.headers.length + " status code " + i + " protocol " + str);
                    return 0;
                }

                public void onCronetReceiveUploadProgress(long j, long j2) {
                    Log.m105918d("cronet", "receive upload progress " + j + " total " + j2);
                }

                public void onCronetTaskCompleted(String str, CronetTaskResult cronetTaskResult, String str2) {
                    if (cronetTaskResult.errorCode != 0) {
                        Log.m105924i("cronet", "onCronetTaskCompleted " + str + " error " + cronetTaskResult.errorCode + " , " + cronetTaskResult.errorMsg);
                        return;
                    }
                    Log.m105918d("cronet", "onCronetTaskCompleted " + str + " data: " + cronetTaskResult.getDataString());
                    if (this.logData) {
                        Log.m105918d("cronet", "onCronetTaskCompleted data: " + new String(cronetTaskResult.data) + " write byte " + cronetTaskResult.totalWriteByte + " receive " + cronetTaskResult.totalReceiveByte);
                        StringBuilder sb = new StringBuilder();
                        sb.append("onCronetTaskCompleted send byte ");
                        sb.append(cronetTaskResult.totalSendByte);
                        Log.m105918d("cronet", sb.toString());
                    }
                }

                public void onDownloadProgressChanged(String str, CronetDownloadProgress cronetDownloadProgress) {
                    Log.m105918d("cronet", "onDownloadProgressChanged " + cronetDownloadProgress.currentWriteByte);
                }
            });
        } else if (str.contains(TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP)) {
            cronetRequestParams.taskType = 1;
            cronetRequestParams.taskId = "zzy_test";
            cronetRequestParams.url = "https://www.cip.cc/";
            HashMap hashMap3 = new HashMap();
            hashMap3.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
            cronetRequestParams.makeRequestHeader(hashMap3);
            cancelCronetTask(startCronetHttpTask(cronetRequestParams, new CronetTaskCallback(true) {
                private boolean logData;

                {
                    this.logData = r1;
                }

                public void onCronetReceiveChunkedData(ChunkedData chunkedData, long j) {
                    Log.m105918d("cronet", "receive chunk length: " + j + " data " + chunkedData.data.length);
                }

                public int onCronetReceiveHeader(ResponseHeader responseHeader, int i, String str) {
                    Log.m105918d("cronet", "onCronetReceiveHeader " + responseHeader.headers.length + " status code " + i + " protocol " + str);
                    return 0;
                }

                public void onCronetReceiveUploadProgress(long j, long j2) {
                    Log.m105918d("cronet", "receive upload progress " + j + " total " + j2);
                }

                public void onCronetTaskCompleted(String str, CronetTaskResult cronetTaskResult, String str2) {
                    if (cronetTaskResult.errorCode != 0) {
                        Log.m105924i("cronet", "onCronetTaskCompleted " + str + " error " + cronetTaskResult.errorCode + " , " + cronetTaskResult.errorMsg);
                        return;
                    }
                    Log.m105918d("cronet", "onCronetTaskCompleted " + str + " data: " + cronetTaskResult.getDataString());
                    if (this.logData) {
                        Log.m105918d("cronet", "onCronetTaskCompleted data: " + new String(cronetTaskResult.data) + " write byte " + cronetTaskResult.totalWriteByte + " receive " + cronetTaskResult.totalReceiveByte);
                        StringBuilder sb = new StringBuilder();
                        sb.append("onCronetTaskCompleted send byte ");
                        sb.append(cronetTaskResult.totalSendByte);
                        Log.m105918d("cronet", sb.toString());
                    }
                }

                public void onDownloadProgressChanged(String str, CronetDownloadProgress cronetDownloadProgress) {
                    Log.m105918d("cronet", "onDownloadProgressChanged " + cronetDownloadProgress.currentWriteByte);
                }
            }).taskId);
        } else {
            str.contains("active");
        }
    }

    public static String cronetResolveHostByCellular(String str) {
        Log.m105924i("cronet", "cronetResolveHostByCellular");
        return CronetMultiNetLinkWaysUtil.Companion.instance().resolveHostByCellular(str, MMApplicationContext.getContext());
    }

    public static Map<String, List<String>> getHeaderList(ResponseHeader responseHeader) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : getHeaderMap(responseHeader).entrySet()) {
            String str = (String) next.getKey();
            if (str != null && !str.isEmpty()) {
                String str2 = (String) next.getValue();
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(str2);
                hashMap.put(str, list);
            }
        }
        return hashMap;
    }

    public static Map<String, String> getHeaderMap(ResponseHeader responseHeader) {
        HeaderMap[] headerMapArr;
        String str;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        if (!(responseHeader == null || (headerMapArr = responseHeader.headers) == null)) {
            for (HeaderMap headerMap : headerMapArr) {
                if (!(headerMap == null || (str = headerMap.key) == null || headerMap.value == null)) {
                    identityHashMap.put(new String(str), headerMap.value);
                }
            }
        }
        return identityHashMap;
    }

    public static String getSystemProperty(String str) {
        String property = System.getProperty(str);
        Log.m105918d("cronet", "property " + str + " res " + property);
        return property;
    }

    public static boolean getUseHttpdns() {
        return useHttpdns;
    }

    public static native WebPageProfile getWebPagePerformanceWithURL(String str);

    public static void notifyCronetWeaknet(boolean z) {
        Log.m105924i("cronet", "receive weaknet notify " + (z ? 1 : 0));
        List<CronetTaskNetworkStateCallback> list = cronetTaskNetworkStateCallbackList;
        if (list != null && list.size() > 0) {
            for (CronetTaskNetworkStateCallback onNetWeakChange : cronetTaskNetworkStateCallbackList) {
                onNetWeakChange.onNetWeakChange(z);
            }
        }
    }

    public static void removeCronetTaskNetworkStateCallback(CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
        cronetTaskNetworkStateCallbackList.remove(cronetTaskNetworkStateCallback);
    }

    public static native void removeUserCert();

    public static native void setGoodNetNotifyInterval(int i);

    public static void setUseHttpdns(boolean z) {
        Log.m105924i("cronet", "use httpdns " + z);
        useHttpdns = z;
    }

    public static native void setUserCertVerify(boolean z);

    public static native CronetHttpsCreateResult startCronetDefaultHttpTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static native CronetHttpsCreateResult startCronetDownloadTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static native CronetHttpsCreateResult startCronetHttpTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static native CronetHttpsCreateResult startCronetTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    public static native CronetHttpsCreateResult startCronetUploadTask(CronetRequestParams cronetRequestParams, CronetTaskCallback cronetTaskCallback);

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("cronet", r12.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        return convertToCronetResult(new com.tencent.mars.cdn.AndroidCertVerifyResult(-5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("cronet", r12.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        return convertToCronetResult(new com.tencent.mars.cdn.AndroidCertVerifyResult(-1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("cronet", r12.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0112, code lost:
        return convertToCronetResult(new com.tencent.mars.cdn.AndroidCertVerifyResult(-1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0113, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0114, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("cronet", r12.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0124, code lost:
        return convertToCronetResult(new com.tencent.mars.cdn.AndroidCertVerifyResult(-1));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd A[ExcHandler: IOException (r12v13 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0101 A[ExcHandler: NoSuchAlgorithmException (r12v5 'e' java.security.NoSuchAlgorithmException A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113 A[ExcHandler: KeyStoreException (r12v1 'e' java.security.KeyStoreException A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.mars.cdn.CronetLogic.CertVerifyResult verifyCertWithUserCA(byte[][] r12) {
        /*
            java.lang.String r0 = "cronet"
            r1 = -1
            java.lang.String r2 = "verifyCertWithUserCA"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.lang.String r2 = "AndroidCAStore"
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r3 = 0
            r2.load(r3, r3)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r3.<init>()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.util.Enumeration r4 = r2.aliases()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
        L_0x001c:
            boolean r5 = r4.hasMoreElements()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            if (r5 == 0) goto L_0x0037
            java.lang.Object r5 = r4.nextElement()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            if (r5 == 0) goto L_0x001c
            java.lang.String r6 = "user:"
            boolean r6 = r5.startsWith(r6)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            if (r6 == 0) goto L_0x001c
            r3.add(r5)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            goto L_0x001c
        L_0x0037:
            java.lang.String r4 = "alias list size %d"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            int r7 = r3.size()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r8 = 0
            r6[r8] = r7     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r6)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            int r4 = r3.size()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            if (r4 <= 0) goto L_0x00ce
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r4.<init>()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            int r6 = r12.length     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r7 = 0
        L_0x0057:
            if (r7 >= r6) goto L_0x0078
            r9 = r12[r7]     // Catch:{ CertificateException -> 0x0065, KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, IOException -> 0x00dd }
            java.security.cert.X509Certificate r9 = com.tencent.mars.cdn.X509Util.createCertificateFromBytes(r9)     // Catch:{ CertificateException -> 0x0065, KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, IOException -> 0x00dd }
            r4.add(r9)     // Catch:{ CertificateException -> 0x0065, KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, IOException -> 0x00dd }
            int r7 = r7 + 1
            goto L_0x0057
        L_0x0065:
            r12 = move-exception
            java.lang.String r12 = r12.getLocalizedMessage()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r2 = -5
            r12.<init>(r2)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            return r12
        L_0x0078:
            java.util.Iterator r12 = r3.iterator()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r3 = 0
        L_0x007d:
            boolean r6 = r12.hasNext()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r6 = r12.next()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.security.cert.Certificate r6 = r2.getCertificate(r6)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
        L_0x0093:
            boolean r9 = r7.hasNext()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            if (r9 == 0) goto L_0x00b6
            java.lang.Object r9 = r7.next()     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            java.security.PublicKey r10 = r6.getPublicKey()     // Catch:{ Exception -> 0x00ad }
            r9.verify(r10)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = "do user verify success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)     // Catch:{ Exception -> 0x00ad }
            r3 = 1
            goto L_0x00b6
        L_0x00ad:
            r9 = move-exception
            java.lang.String r10 = "Exception: check user verify certificate"
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r10, r11)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            goto L_0x0093
        L_0x00b6:
            if (r3 == 0) goto L_0x007d
        L_0x00b8:
            if (r3 == 0) goto L_0x00c4
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r12.<init>(r8)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            return r12
        L_0x00c4:
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            r12.<init>(r1)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            return r12
        L_0x00ce:
            java.lang.String r12 = "checkServerTrusted self check aliasList null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)     // Catch:{ KeyStoreException -> 0x0113, NoSuchAlgorithmException -> 0x0101, CertificateException -> 0x00ef, IOException -> 0x00dd }
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r12.<init>(r1)
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)
            return r12
        L_0x00dd:
            r12 = move-exception
            java.lang.String r12 = r12.getLocalizedMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r12.<init>(r1)
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)
            return r12
        L_0x00ef:
            r12 = move-exception
            java.lang.String r12 = r12.getLocalizedMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r12.<init>(r1)
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)
            return r12
        L_0x0101:
            r12 = move-exception
            java.lang.String r12 = r12.getLocalizedMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r12.<init>(r1)
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)
            return r12
        L_0x0113:
            r12 = move-exception
            java.lang.String r12 = r12.getLocalizedMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            com.tencent.mars.cdn.AndroidCertVerifyResult r12 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r12.<init>(r1)
            com.tencent.mars.cdn.CronetLogic$CertVerifyResult r12 = convertToCronetResult(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.cdn.CronetLogic.verifyCertWithUserCA(byte[][]):com.tencent.mars.cdn.CronetLogic$CertVerifyResult");
    }
}
