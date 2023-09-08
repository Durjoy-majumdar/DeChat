package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.KindaNotify;
import com.tencent.p014mm.autogen.events.KindaNotifyEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

public class KindaNotifyImpl implements KindaNotify {
    public static final String TAG = "MicroMsg.KindaNotifyImpl";

    public void notify(String str, HashMap<String, String> hashMap) {
        Log.m105925i(TAG, "key:%s, value:%s", str, hashMap.toString());
        KindaNotifyEvent kindaNotifyEvent = new KindaNotifyEvent();
        KindaNotifyEvent.C28768a aVar = kindaNotifyEvent.f78850d;
        aVar.f78851a = str;
        aVar.f78852b = hashMap;
        kindaNotifyEvent.publish();
    }
}
