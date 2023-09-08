package com.tencent.p014mm.plugin.finder.feed.model;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;
import tf1.C13891a;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.b */
public final class C2778b extends C13891a {

    /* renamed from: d */
    public final long f13955d;

    /* renamed from: e */
    public String f13956e = "";

    /* renamed from: f */
    public int f13957f;

    /* renamed from: g */
    public long f13958g;

    /* renamed from: h */
    public int f13959h;

    /* renamed from: i */
    public String f13960i = "";

    /* renamed from: j */
    public String f13961j = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2778b(long j, C104289g gVar) {
        super(j);
        C87412m.m108594g(gVar, "data");
        this.f13955d = j;
        this.f13956e = gVar.optString("url");
        this.f13957f = gVar.optInt("ad_type");
        String optString = gVar.optString("uxinfo");
        C87412m.m108593f(optString, "data.optString(Constants…r.AdInfoKeys.KEY_UX_INFO)");
        this.f13960i = optString;
        this.f13958g = gVar.optLong("canvas_id");
        this.f13959h = gVar.optInt("canvas_type");
        String optString2 = gVar.optString("button_title");
        C87412m.m108593f(optString2, "data.optString(Constants…nfoKeys.KEY_BUTTON_TITLE)");
        this.f13961j = optString2;
        Log.m105924i("AdSnsCache", "data:" + gVar + " url :" + this.f13956e + " type :" + this.f13957f + " canvasId:" + this.f13958g + " canvasType:" + this.f13959h + " buttonTitle:" + this.f13961j + " uxInfo:" + this.f13960i);
    }

    public String toString() {
        return "AdSnsCache id:" + C61926c.m72691p(this.f13955d) + " type:" + this.f13957f + " canvasId:" + this.f13958g + " url:" + this.f13956e;
    }
}
