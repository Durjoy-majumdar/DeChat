package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.a */
public abstract class C82073a implements C82081g, Runnable {
    /* renamed from: b */
    public void mo114502b() {
        String name = getClass().getName();
        if (name.contains("$")) {
            name.substring(name.lastIndexOf("$") + 1);
            System.currentTimeMillis();
            System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public void mo114528c() {
        System.currentTimeMillis();
        synchronized (C82075b.f240686c) {
            MMHandler mMHandler = C82075b.f240684a;
            if (mMHandler != null) {
                mMHandler.post(this);
            } else {
                Log.m105928w("MicroMsg.Audio.AudioApiTaskExecutor", "mHandler is null, recreate");
                C82075b.m100789a();
                C82075b.f240684a.post(this);
            }
        }
    }

    public void run() {
        System.currentTimeMillis();
        mo114501a();
    }
}
