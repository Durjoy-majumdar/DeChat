package com.tencent.mapsdk.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.map.tools.net.processor.ResponseProcessor;
import com.tencent.mapsdk.shell.events.NetFlowEventModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.lq */
public class C113944lq implements RequestProcessor, ResponseProcessor {

    /* renamed from: b */
    private static final String f340819b = "NetFlow";

    /* renamed from: c */
    private static final boolean f340820c = false;

    /* renamed from: a */
    public NetFlowEventModel f340821a;

    /* renamed from: d */
    private HashMap<String, String> f340822d;

    /* renamed from: e */
    private boolean f340823e;

    public C113944lq() {
        this.f340822d = new HashMap<>();
        this.f340823e = false;
    }

    /* renamed from: a */
    private boolean m157882a(String str) {
        Uri parse;
        String scheme;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (scheme = parse.getScheme()) == null || !scheme.startsWith("http")) {
            return false;
        }
        String str2 = parse.getHost() + parse.getPath();
        if (!this.f340822d.containsKey(str2)) {
            Iterator<String> it = this.f340822d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (str2.contains(next)) {
                    this.f340821a.bizType = this.f340822d.get(next);
                    this.f340823e = true;
                    break;
                }
            }
        } else {
            this.f340821a.bizType = this.f340822d.get(str2);
            this.f340823e = true;
        }
        return this.f340823e;
    }

    public void onRequest(NetRequest netRequest) {
        Uri parse;
        String scheme;
        NetFlowEventModel netFlowEventModel = new NetFlowEventModel();
        this.f340821a = netFlowEventModel;
        String str = netRequest.url;
        netFlowEventModel.url = str;
        netFlowEventModel.uploadFlow = (double) str.getBytes().length;
        byte[] bArr = netRequest.postData;
        if (bArr != null) {
            this.f340821a.uploadFlow += (double) bArr.length;
        }
        for (Map.Entry next : netRequest.mapHeaders.entrySet()) {
            this.f340821a.uploadFlow += (double) (((String) next.getKey()).getBytes().length + ((String) next.getValue()).getBytes().length);
        }
        NetFlowEventModel netFlowEventModel2 = this.f340821a;
        double d = netFlowEventModel2.uploadFlow / 1000.0d;
        netFlowEventModel2.uploadFlow = d;
        netFlowEventModel2.uploadFlow = ((double) Math.round(d * 1000.0d)) / 1000.0d;
        this.f340821a.uploadTime = System.currentTimeMillis();
        String str2 = netRequest.url;
        boolean z = false;
        if (!TextUtils.isEmpty(str2) && (parse = Uri.parse(str2)) != null && (scheme = parse.getScheme()) != null && scheme.startsWith("http")) {
            String str3 = parse.getHost() + parse.getPath();
            if (!this.f340822d.containsKey(str3)) {
                Iterator<String> it = this.f340822d.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next2 = it.next();
                    if (str3.contains(next2)) {
                        this.f340821a.bizType = this.f340822d.get(next2);
                        this.f340823e = true;
                        break;
                    }
                }
            } else {
                this.f340821a.bizType = this.f340822d.get(str3);
                this.f340823e = true;
            }
            z = this.f340823e;
        }
        if (!z) {
            this.f340821a.bizType = "";
        }
    }

    public void onResponse(NetResponse netResponse) {
        if (netResponse.available()) {
            NetFlowEventModel netFlowEventModel = this.f340821a;
            netFlowEventModel.errorCode = netResponse.statusCode;
            if (netResponse.errorCode != 0) {
                byte[] bArr = netResponse.errorData;
                if (bArr != null) {
                    netFlowEventModel.downloadFlow = (double) bArr.length;
                } else {
                    netFlowEventModel.downloadFlow = -1.0d;
                }
            } else {
                byte[] bArr2 = netResponse.data;
                if (bArr2 != null) {
                    netFlowEventModel.downloadFlow = (double) bArr2.length;
                } else {
                    netFlowEventModel.downloadFlow = -1.0d;
                }
            }
            double d = netFlowEventModel.downloadFlow / 1000.0d;
            netFlowEventModel.downloadFlow = d;
            netFlowEventModel.downloadFlow = ((double) Math.round(d * 1000.0d)) / 1000.0d;
        } else {
            this.f340821a.errorCode = -100;
        }
        this.f340821a.downloadTime = System.currentTimeMillis();
    }

    public C113944lq(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f340822d = hashMap2;
        this.f340823e = false;
        hashMap2.putAll(hashMap);
    }
}
