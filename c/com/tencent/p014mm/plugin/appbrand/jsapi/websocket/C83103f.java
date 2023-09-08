package com.tencent.p014mm.plugin.appbrand.jsapi.websocket;

import java.nio.ByteBuffer;
import java.util.Timer;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.f */
public interface C83103f {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.f$a */
    public interface C83104a {
    }

    /* renamed from: a */
    void mo115351a(Timer timer);

    /* renamed from: b */
    void mo115352b(String str);

    /* renamed from: c */
    void mo115353c(ByteBuffer byteBuffer);

    void close();

    /* renamed from: d */
    void mo115355d(String str, int i);

    /* renamed from: f */
    Timer mo115356f();

    String getTaskId();

    boolean isOpen();
}
