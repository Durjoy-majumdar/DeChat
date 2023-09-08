package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import java.util.concurrent.atomic.AtomicInteger;
import mp3.C88824h;
import mp3.C88825i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.b */
public class C82075b {

    /* renamed from: a */
    public static MMHandler f240684a;

    /* renamed from: b */
    public static volatile HandlerThread f240685b;

    /* renamed from: c */
    public static Object f240686c = new Object();

    /* renamed from: d */
    public static AtomicInteger f240687d = new AtomicInteger(0);

    /* renamed from: a */
    public static void m100789a() {
        if (f240685b == null) {
            int i = C58834h.f168432b;
            f240685b = C97749e.m126093a("app_brand_audio_player", 5);
            f240685b.start();
            C88824h.m110908b("app_brand_audio_player", new C88825i(f240685b.getLooper(), "app_brand_audio_player"));
        }
        f240684a = new MMHandler(f240685b.getLooper());
    }
}
