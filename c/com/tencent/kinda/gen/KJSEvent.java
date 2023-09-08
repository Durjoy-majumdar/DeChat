package com.tencent.kinda.gen;

import java.util.HashMap;

public interface KJSEvent {
    void kindaCloseWebViewImpl(boolean z, VoidCallback voidCallback);

    void kindaEndWithResult(String str, HashMap<String, String> hashMap);

    KindaJSEventType kindaGetType();
}
