package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.q */
public final class C84170q {

    /* renamed from: a */
    public volatile long f245768a;

    /* renamed from: b */
    public volatile boolean f245769b = false;

    /* renamed from: c */
    public String f245770c;

    /* renamed from: d */
    public String f245771d;

    /* renamed from: e */
    public int f245772e;

    /* renamed from: f */
    public int f245773f;

    /* renamed from: g */
    public int f245774g;

    /* renamed from: h */
    public String f245775h;

    /* renamed from: i */
    public int f245776i;

    /* renamed from: j */
    public long f245777j;

    /* renamed from: k */
    public long f245778k;

    /* renamed from: l */
    public String f245779l;

    /* renamed from: m */
    public long f245780m;

    /* renamed from: n */
    public String f245781n;

    /* renamed from: a */
    public void mo116844a() {
        try {
            Log.m105924i("MicroMsg.AppBrand.Report.kv_14576", "report|" + toString());
            C117407d.INSTANCE.mo160131h(14576, this.f245770c, this.f245771d, Integer.valueOf(this.f245772e), Integer.valueOf(this.f245773f), Integer.valueOf(this.f245774g), this.f245775h, Integer.valueOf(this.f245776i), 0, Long.valueOf(this.f245777j), Long.valueOf(this.f245778k), this.f245779l, Long.valueOf(this.f245780m), this.f245781n);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.Report.kv_14576", "report exp %s", e);
        }
    }

    public String toString() {
        return "kv_14576{, networkType='" + this.f245770c + '\'' + ", appId='" + this.f245771d + '\'' + ", appVersion=" + this.f245772e + ", appState=" + this.f245773f + ", scene=" + this.f245774g + ", sessionId='" + this.f245775h + '\'' + ", is_download_code=" + this.f245776i + ", is_load_x5=" + 0 + ", cost_time=" + this.f245777j + ", event_time=" + this.f245778k + ", load_time=" + this.f245768a + ", real_time=" + Util.currentTicks() + ", username=" + this.f245779l + ", appType=" + this.f245780m + ", instanceId=" + this.f245781n + '}';
    }
}
