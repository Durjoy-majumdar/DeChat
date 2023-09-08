package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1", mo125469f = "AdLandingMusicComponent.kt", mo125470l = {360}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e0 */
public final class C94628e0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f273824d;

    /* renamed from: e */
    public int f273825e;

    /* renamed from: f */
    public final /* synthetic */ AdLandingMusicComponent f273826f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94628e0(AdLandingMusicComponent adLandingMusicComponent, C15601d<? super C94628e0> dVar) {
        super(2, dVar);
        this.f273826f = adLandingMusicComponent;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        C94628e0 e0Var = new C94628e0(this.f273826f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        return e0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        Object invokeSuspend = ((C94628e0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        return invokeSuspend;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r11.f273825e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0024
            if (r3 != r5) goto L_0x0019
            int r3 = r11.f273824d
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
            goto L_0x0039
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r12
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r12)
            r3 = 0
            r12 = r11
        L_0x0029:
            r6 = 1000(0x3e8, double:4.94E-321)
            r12.f273824d = r3
            r12.f273825e = r5
            java.lang.Object r6 = a14.C53965x0.m60607b(r6, r12)
            if (r6 != r2) goto L_0x0039
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0039:
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r6 = r12.f273826f
            boolean r6 = r6.mo130171U()
            if (r6 == 0) goto L_0x0029
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r6 = r12.f273826f
            r6.getClass()
            java.lang.String r7 = "getLifecycle"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            androidx.lifecycle.j r6 = r6.f273737G
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            if (r6 == 0) goto L_0x0059
            androidx.lifecycle.j$c r6 = r6.getCurrentState()
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            androidx.lifecycle.j$c r7 = androidx.lifecycle.C39623j.C39626c.RESUMED
            if (r6 != r7) goto L_0x0029
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r6 = r12.f273826f
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119664H(r6)
            nb0.d r6 = nb0.C88913c.m111006d(r6)
            if (r6 != 0) goto L_0x006b
            goto L_0x0029
        L_0x006b:
            int r7 = r6.f256446e
            java.lang.String r8 = "MicroMsg.Sns.AdLandingMusicComponent"
            if (r7 <= 0) goto L_0x00a6
            int r9 = r6.f256442a
            if (r9 <= 0) goto L_0x00a6
            if (r7 < r9) goto L_0x00a6
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r12 = r12.f273826f
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r12 = r12.mo130165M()
            r12.setShowLoading(r4)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "all data buffered! "
            r12.append(r2)
            int r2 = r6.f256446e
            r12.append(r2)
            r2 = 32
            r12.append(r2)
            int r2 = r6.f256442a
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        L_0x00a6:
            int r7 = r6.f256443b
            if (r3 == r7) goto L_0x00b5
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r3 = r12.f273826f
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r3 = r3.mo130165M()
            r3.setShowLoading(r4)
            r3 = r7
            goto L_0x00be
        L_0x00b5:
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r12.f273826f
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r7 = r7.mo130165M()
            r7.setShowLoading(r5)
        L_0x00be:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "listenDaemon buf="
            r7.append(r9)
            int r9 = r6.f256446e
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            r7.append(r10)
            java.lang.String r9 = " cur="
            r7.append(r9)
            int r9 = r6.f256443b
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            r7.append(r10)
            java.lang.String r9 = " dur="
            r7.append(r9)
            int r9 = r6.f256442a
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            r7.append(r10)
            java.lang.String r9 = " paused = "
            r7.append(r9)
            boolean r6 = r6.f256444c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r6)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94628e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
