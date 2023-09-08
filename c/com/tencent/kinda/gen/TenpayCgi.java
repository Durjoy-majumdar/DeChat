package com.tencent.kinda.gen;

import java.util.HashMap;

public interface TenpayCgi {
    void request(int i, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, TenpayCgiCallback tenpayCgiCallback);
}
