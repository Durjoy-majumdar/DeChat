package com.tencent.p014mm.plugin.appbrand;

import bk0.C79709a;
import c02.C92331c;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import p444at.C79629c;
import p444at.C92087b;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$r */
public class AppBrandRuntimeWC$$r implements C79709a {

    /* renamed from: b */
    public HandOff f238335b;

    /* renamed from: c */
    public final /* synthetic */ AppBrandRuntimeWC f238336c;

    public AppBrandRuntimeWC$$r(AppBrandRuntimeWC appBrandRuntimeWC) {
        HandOff handOff;
        this.f238336c = appBrandRuntimeWC;
        C87412m.m108594g(appBrandRuntimeWC, "<this>");
        Class cls = C92087b.class;
        AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
        String nullAsNil = Util.nullAsNil(M1.f239364f);
        String nullAsNil2 = Util.nullAsNil(M1.f239363e);
        String nullAsNil3 = Util.nullAsNil(M1.f239362d);
        String nullAsNil4 = Util.nullAsNil(M1.f234839s);
        String nullAsNil5 = Util.nullAsNil(M1.f239367i);
        if (M1.mo111300k()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IHandOffFeatureService::class.java)");
            C87412m.m108593f(nullAsNil, "icon");
            C87412m.m108593f(nullAsNil2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108593f(nullAsNil3, "appId");
            C87412m.m108593f(nullAsNil5, "entryPage");
            C87412m.m108593f(nullAsNil4, "appUserName");
            handOff = ((C92087b) c).mo126073tL(nullAsNil, nullAsNil2, nullAsNil3, nullAsNil5, nullAsNil4, 1, "", "", HandOff.Companion.mo57158a(4, 1));
        } else {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IHandOffFeatureService::class.java)");
            C87412m.m108593f(nullAsNil, "icon");
            C87412m.m108593f(nullAsNil2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108593f(nullAsNil3, "appId");
            C87412m.m108593f(nullAsNil5, "entryPage");
            C87412m.m108593f(nullAsNil4, "appUserName");
            handOff = ((C92087b) c2).mo126072kR(nullAsNil, nullAsNil2, nullAsNil3, nullAsNil5, nullAsNil4, 1, "", "", HandOff.Companion.mo57158a(3, 1));
        }
        this.f238335b = handOff;
    }

    /* renamed from: a */
    public void mo109823a(String str) {
        if (this.f238336c.mo121251g1()) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWC", "is pre render mode, not handoff");
        } else if (this.f238336c.mo113210l1() != null && !this.f238336c.mo113210l1().f239373d1) {
            ((C79629c) this.f238335b).setPageOfAppEntry(str);
            ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f238335b);
        }
    }

    /* renamed from: b */
    public void mo109824b(String str, int i) {
        if (this.f238336c.mo113210l1() != null && !this.f238336c.mo113210l1().f239373d1) {
            this.f238335b.setHandOffType(i);
            ((C79629c) this.f238335b).setPageOfAppEntry(str);
            ((C92331c) C86312j.m106911c(C92331c.class)).k00(this.f238335b);
        }
    }

    /* renamed from: c */
    public void mo109825c() {
        if (this.f238336c.mo121251g1()) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWC", "is pre render mode, not delete handoff");
        } else if (this.f238336c.mo113210l1() != null && !this.f238336c.mo113210l1().f239373d1) {
            ((C92331c) C86312j.m106911c(C92331c.class)).mo58349Bn(this.f238335b.getKey());
        }
    }
}
