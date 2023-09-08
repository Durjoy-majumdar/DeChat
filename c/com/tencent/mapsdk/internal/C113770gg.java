package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.shell.events.NetFlowEvent;
import java.util.HashMap;

/* renamed from: com.tencent.mapsdk.internal.gg */
public class C113770gg extends C113944lq {
    public C113770gg() {
    }

    /* renamed from: a */
    private void m156993a() {
        C114361u.m160481a();
        new NetFlowEvent(this.f340821a);
    }

    public void onResponse(NetResponse netResponse) {
        super.onResponse(netResponse);
        C114361u.m160481a();
        new NetFlowEvent(this.f340821a);
    }

    private C113770gg(HashMap<String, String> hashMap) {
        super(hashMap);
    }
}
