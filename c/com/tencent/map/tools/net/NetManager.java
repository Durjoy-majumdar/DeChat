package com.tencent.map.tools.net;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.adapter.URLNetImpl;
import com.tencent.map.tools.net.http.HttpCanceler;
import com.tencent.mapsdk.internal.C113928le;
import com.tencent.mapsdk.internal.C113944lq;
import java.util.HashMap;
import java.util.HashSet;

public class NetManager {
    private static NetManager sInstance;
    private NetAdapter mAdapter;
    private boolean mGlobalForceHttps = true;
    private HashSet<Class<? extends C113944lq>> mGlobalNetFlowProcessorClzList = new HashSet<>();
    private HashMap<String, String> mGlobalNetFlowRuleList = new HashMap<>();
    private String mGlobalSecretKey;
    private boolean mInited = false;

    /* renamed from: com.tencent.map.tools.net.NetManager$1 */
    public static /* synthetic */ class C1134871 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f339559a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.map.tools.net.AdapterType[] r0 = com.tencent.map.tools.net.AdapterType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f339559a = r0
                com.tencent.map.tools.net.AdapterType r1 = com.tencent.map.tools.net.AdapterType.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f339559a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.map.tools.net.AdapterType r1 = com.tencent.map.tools.net.AdapterType.URL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f339559a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.map.tools.net.AdapterType r1 = com.tencent.map.tools.net.AdapterType.Halley     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.net.NetManager.C1134871.<clinit>():void");
        }
    }

    private NetManager() {
    }

    public static NetAdapter createAdapter(Context context, NetConfig netConfig) {
        if (netConfig == null) {
            netConfig = NetConfig.create().setForceHttps(true).setAdapterType(AdapterType.URL);
        }
        int[] iArr = C1134871.f339559a;
        netConfig.getAdapterType().ordinal();
        C113928le leVar = new C113928le();
        leVar.initNet(context, netConfig);
        return leVar;
    }

    public static synchronized NetManager getInstance() {
        NetManager netManager;
        synchronized (NetManager.class) {
            if (sInstance == null) {
                sInstance = new NetManager();
            }
            netManager = sInstance;
        }
        return netManager;
    }

    public static void init(Context context, NetConfig netConfig) {
        getInstance().setAdapter(createAdapter(context, netConfig));
    }

    public void appendNetFlowRules(HashMap<String, String> hashMap) {
        NetAdapter netAdapter = this.mAdapter;
        if (netAdapter != null) {
            netAdapter.getNetFlowRuleList().putAll(hashMap);
        }
    }

    public boolean available() {
        return this.mAdapter != null && this.mInited;
    }

    public NetRequest.NetRequestBuilder builder() {
        return builder("");
    }

    public NetResponse doGet(String str, String str2, int i, int i2, HashMap<String, String> hashMap, HttpCanceler httpCanceler) {
        return builder().url(str).retryNum(i).header(hashMap).userAgent(str2).timeOut(i2).canceler(httpCanceler).doGet();
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i, int i2, HashMap<String, String> hashMap, HttpCanceler httpCanceler) {
        return builder().url(str).userAgent(str2).postData(bArr).retryNum(i).header(hashMap).timeOut(i2).canceler(httpCanceler).doPost();
    }

    public NetResponse doRequest(NetRequest netRequest) {
        return builder(netRequest).doRequest();
    }

    public NetResponse doStream(NetRequest netRequest) {
        return builder(netRequest).doStream();
    }

    public void setAdapter(Context context, NetAdapter netAdapter) {
        if (netAdapter instanceof URLNetImpl) {
            ((URLNetImpl) netAdapter).setProxyAdapter(createAdapter(context, NetConfig.create()));
        }
        setAdapter(netAdapter);
    }

    public NetRequest.NetRequestBuilder builder(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.mGlobalSecretKey;
        }
        NetRequest.NetRequestBuilder netRequestBuilder = new NetRequest.NetRequestBuilder(this.mAdapter, str);
        netRequestBuilder.forceHttps(this.mGlobalForceHttps);
        return netRequestBuilder;
    }

    private void init() {
        NetAdapter netAdapter;
        if (!this.mInited && (netAdapter = this.mAdapter) != null) {
            this.mInited = true;
            this.mGlobalForceHttps = netAdapter.isForceHttps();
            this.mGlobalSecretKey = this.mAdapter.getSecretKey();
            this.mGlobalNetFlowRuleList.putAll(this.mAdapter.getNetFlowRuleList());
            this.mGlobalNetFlowProcessorClzList.addAll(this.mAdapter.getNetFlowProcessor());
        }
    }

    private NetRequest.NetRequestBuilder builder(NetRequest netRequest) {
        return new NetRequest.NetRequestBuilder(this.mAdapter, this.mGlobalSecretKey, netRequest);
    }

    public void setAdapter(NetAdapter netAdapter) {
        NetAdapter netAdapter2;
        if (netAdapter != null && (netAdapter2 = this.mAdapter) != netAdapter) {
            this.mInited = false;
            if (netAdapter2 != null) {
                netAdapter.getNetFlowRuleList().putAll(this.mAdapter.getNetFlowRuleList());
            }
            this.mAdapter = netAdapter;
            init();
        }
    }
}
