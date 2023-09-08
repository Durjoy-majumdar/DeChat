package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.TenpayCgi;
import com.tencent.kinda.gen.TenpayCgiCallback;
import f40.C86709a0;
import java.util.HashMap;

public class TenpayCgiImpl implements TenpayCgi {
    private static final String TAG = "WXP";

    public void request(int i, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, TenpayCgiCallback tenpayCgiCallback) {
        String.format("requestTenpay: cgiId:%d", new Object[]{Integer.valueOf(i)});
        NetSceneTenpay netSceneTenpay = new NetSceneTenpay(i, str, hashMap, hashMap2, tenpayCgiCallback);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(netSceneTenpay);
        String.format("MMCore.getNetSceneQueue().doScene %s", new Object[]{netSceneTenpay});
    }
}
