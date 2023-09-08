package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.tencent.map.tools.net.NetAdapter;
import com.tencent.map.tools.net.NetConfig;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.http.HttpProxyRule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ld */
public abstract class C113927ld implements NetAdapter {

    /* renamed from: b */
    private static final String f340772b = "NetImpl";

    /* renamed from: a */
    public Bundle f340773a;

    /* renamed from: c */
    private boolean f340774c = true;

    /* renamed from: d */
    private boolean f340775d;

    /* renamed from: e */
    private List<HttpProxyRule> f340776e;

    /* renamed from: f */
    private HashMap<String, String> f340777f = new HashMap<>();

    /* renamed from: g */
    private HashSet<Class<? extends C113944lq>> f340778g = new HashSet<>();

    /* renamed from: h */
    private String f340779h;

    /* renamed from: a */
    private void m157816a(boolean z) {
        this.f340774c = z;
    }

    /* renamed from: b */
    private void m157818b(boolean z) {
        this.f340775d = z;
    }

    /* renamed from: a */
    public abstract NetResponse mo172346a(NetRequest netRequest);

    /* renamed from: a */
    public abstract void mo172347a();

    /* renamed from: b */
    public abstract NetResponse mo172348b(NetRequest netRequest);

    public NetResponse doGet(NetRequest netRequest) {
        return mo172346a(netRequest);
    }

    public NetResponse doPost(NetRequest netRequest) {
        return mo172348b(netRequest);
    }

    public HashSet<Class<? extends C113944lq>> getNetFlowProcessor() {
        return this.f340778g;
    }

    public HashMap<String, String> getNetFlowRuleList() {
        return this.f340777f;
    }

    public List<HttpProxyRule> getProxyRuleList() {
        return this.f340776e;
    }

    public String getSecretKey() {
        return this.f340779h;
    }

    public void initNet(Context context, NetConfig netConfig) {
        try {
            this.f340774c = netConfig.isForceHttps();
            this.f340775d = netConfig.isLogEnable();
            this.f340776e = netConfig.getProxyRuleList();
            this.f340777f.putAll(netConfig.getNetFlowRuleList());
            this.f340779h = netConfig.getSecretKey();
            this.f340778g.add(netConfig.getProcessor());
            this.f340773a = netConfig.getArguments();
            mo172347a();
        } catch (Exception e) {
            C113889km.m157558e(f340772b, "initNet error:" + e.toString());
        }
    }

    public boolean isForceHttps() {
        return this.f340774c;
    }

    public boolean isLogEnable() {
        return this.f340775d;
    }

    /* renamed from: a */
    private void m157815a(List<HttpProxyRule> list) {
        this.f340776e = list;
    }

    /* renamed from: b */
    private void m157817b(String str) {
        this.f340779h = str;
    }

    /* renamed from: a */
    private void m157814a(HashMap<String, String> hashMap) {
        this.f340777f.putAll(hashMap);
    }

    /* renamed from: a */
    private void m157813a(Class<? extends C113944lq> cls) {
        this.f340778g.add(cls);
    }

    /* renamed from: a */
    public static String m157812a(String str) {
        if (str != null) {
            String[] split = str.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (str2.contains("charset")) {
                    String[] split2 = str2.split("=");
                    if (split2.length > 1) {
                        return split2[1].trim();
                    }
                } else {
                    i++;
                }
            }
        }
        return "GBK";
    }
}
