package com.tencent.luggage.sdk.processes;

import gy3.C87412m;

/* renamed from: com.tencent.luggage.sdk.processes.l */
public class C80264l {

    /* renamed from: a */
    public final String f234965a;

    /* renamed from: b */
    public int f234966b;

    /* renamed from: c */
    public C80265m f234967c;

    /* renamed from: d */
    public boolean f234968d;

    /* renamed from: e */
    public boolean f234969e;

    /* renamed from: f */
    public final long f234970f;

    /* renamed from: g */
    public String f234971g;

    public C80264l(String str, int i, C80265m mVar, boolean z) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(mVar, "status");
        this.f234965a = str;
        this.f234966b = i;
        this.f234967c = mVar;
        this.f234968d = z;
        this.f234969e = mVar == C80265m.PRE_RENDERED || mVar == C80265m.RUNNING;
        this.f234970f = System.currentTimeMillis();
        this.f234971g = "";
    }

    public String toString() {
        return "LuggageMiniProgramRecord(appId='" + this.f234965a + "', debugType=" + this.f234966b + ", status=" + this.f234967c + ", isPersistent=" + this.f234968d + ", preRendered=" + this.f234969e + ", startingTimestamp=" + this.f234970f + ')';
    }
}
