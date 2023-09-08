package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.p014mm.plugin.appbrand.report.C68632h0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.o */
public final class C84166o {

    /* renamed from: a */
    public C84168b f245741a;

    /* renamed from: b */
    public int f245742b;

    /* renamed from: c */
    public String f245743c;

    /* renamed from: d */
    public long f245744d;

    /* renamed from: e */
    public C84167a f245745e;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.o$a */
    public enum C84167a {
        EMPTY_PAGE(2),
        LBS_NOT_ALLOW(3),
        NEARBY_MINI_PROGRAM(4);
        

        /* renamed from: d */
        public final int f245750d;

        /* access modifiers changed from: public */
        C84167a(int i) {
            this.f245750d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.o$b */
    public enum C84168b {
        TOP_ENTRANCE_IN_DESKTOP(4);
        

        /* renamed from: d */
        public final int f245753d;

        /* access modifiers changed from: public */
        C84168b(int i) {
            this.f245753d = i;
        }
    }

    /* renamed from: a */
    public void mo116840a() {
        if (this.f245741a != null && this.f245745e != null) {
            Log.m105924i("MicroMsg.AppBrand.kv_13917", "report " + toString());
            this.f245744d = Util.nowMilliSecond();
            C115669n.INSTANCE.mo160131h(13917, C68632h0.m80873a(Integer.valueOf(this.f245741a.f245753d), Integer.valueOf(this.f245742b), this.f245743c, Long.valueOf(this.f245744d), null, Integer.valueOf(this.f245745e.f245750d)));
        }
    }

    public String toString() {
        return "kv_13917{scene=" + this.f245741a.f245753d + ", appCount=" + this.f245742b + ", nearbyListId='" + this.f245743c + '\'' + ", clickTime=" + this.f245744d + ", sceneNote='" + null + '\'' + ", openType=" + this.f245745e.f245750d + '}';
    }
}
