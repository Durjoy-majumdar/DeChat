package com.tencent.p014mm.plugin.appbrand.jsapi.websocket;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.WssConfig */
public class WssConfig {
    public int bz_type;
    public int handshake_timeout;
    public boolean per_message_deflate;
    public int pong_timeout;
    public boolean skip_domain_check;
    public boolean tcp_no_delay;

    public WssConfig(int i, int i2, boolean z, boolean z2, int i3, boolean z3) {
        this.pong_timeout = i;
        this.handshake_timeout = i2;
        this.tcp_no_delay = z;
        this.skip_domain_check = z2;
        this.bz_type = i3;
        this.per_message_deflate = z3;
    }
}
