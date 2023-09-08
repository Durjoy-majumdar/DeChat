package com.tencent.map.tools.net.adapter;

import android.content.Context;
import com.tencent.map.tools.net.NetAdapter;
import com.tencent.map.tools.net.NetConfig;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.http.HttpProxyRule;
import com.tencent.mapsdk.internal.C113928le;
import com.tencent.mapsdk.internal.C113944lq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class URLNetImpl implements NetAdapter {
    private NetAdapter mProxy = new C113928le();

    public boolean cancel() {
        return this.mProxy.cancel();
    }

    public NetResponse doGet(NetRequest netRequest) {
        return this.mProxy.doGet(netRequest);
    }

    public NetResponse doPost(NetRequest netRequest) {
        return this.mProxy.doPost(netRequest);
    }

    public NetResponse doRequest(NetRequest netRequest) {
        return this.mProxy.doRequest(netRequest);
    }

    public HashSet<Class<? extends C113944lq>> getNetFlowProcessor() {
        return this.mProxy.getNetFlowProcessor();
    }

    public HashMap<String, String> getNetFlowRuleList() {
        return this.mProxy.getNetFlowRuleList();
    }

    public List<HttpProxyRule> getProxyRuleList() {
        return this.mProxy.getProxyRuleList();
    }

    public String getSecretKey() {
        return this.mProxy.getSecretKey();
    }

    public void initNet(Context context, NetConfig netConfig) {
        this.mProxy.initNet(context, netConfig);
    }

    public boolean isForceHttps() {
        return this.mProxy.isForceHttps();
    }

    public boolean isLogEnable() {
        return this.mProxy.isLogEnable();
    }

    public NetResponse openStream(NetRequest netRequest) {
        return this.mProxy.openStream(netRequest);
    }

    public void setProxyAdapter(NetAdapter netAdapter) {
        this.mProxy = netAdapter;
    }
}
