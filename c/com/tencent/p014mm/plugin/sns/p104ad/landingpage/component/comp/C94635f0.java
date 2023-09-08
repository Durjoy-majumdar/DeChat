package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C45253g;
import d14.C58085t0;
import d14.C58100z0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1", mo125469f = "AdLandingMusicComponent.kt", mo125470l = {314}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0 */
public final class C94635f0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f273840d;

    /* renamed from: e */
    public final /* synthetic */ AdLandingMusicComponent f273841e;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0$a */
    public static final class C94636a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ AdLandingMusicComponent f273842d;

        public C94636a(AdLandingMusicComponent adLandingMusicComponent) {
            this.f273842d = adLandingMusicComponent;
        }

        /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r7v38, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r7, wx3.C15601d r8) {
            /*
                r6 = this;
                java.lang.String r0 = "emit"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "userControlFlow called "
                r2.append(r3)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.Sns.AdLandingMusicComponent"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r2 = r6.f273842d
                java.lang.String r4 = "access$isPrepared$p"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                boolean r2 = r2.f273732B
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                if (r2 == 0) goto L_0x011d
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r8 = r6.f273842d
                com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r8 = r8.mo130165M()
                r2 = 0
                r8.setShowLoading(r2)
                r8 = 1
                r3 = 0
                if (r7 != r8) goto L_0x00cb
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                java.lang.String r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119664H(r7)
                nb0.C88913c.m111008f(r7, r3)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                wo2.k r7 = r7.mo130166N()
                r7.mo142084b()
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r7 = r7.mo130168P()
                r7.setRefreshing(r8)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r7 = r7.mo130165M()
                r7.setState(r8)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                android.content.Context r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119663G(r7)
                boolean r2 = r7 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
                if (r2 == 0) goto L_0x0076
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r7 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r7
                goto L_0x0077
            L_0x0076:
                r7 = r3
            L_0x0077:
                if (r7 != 0) goto L_0x007a
                goto L_0x007c
            L_0x007a:
                r7.f277556X1 = r8
            L_0x007c:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                android.content.Context r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119663G(r7)
                boolean r2 = r7 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
                if (r2 == 0) goto L_0x0089
                r3 = r7
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r3 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r3
            L_0x0089:
                if (r3 != 0) goto L_0x008c
                goto L_0x0094
            L_0x008c:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                java.lang.String r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119664H(r7)
                r3.f277559Y1 = r7
            L_0x0094:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119666J(r7)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                eb0.e r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119662E(r7)
                if (r7 == 0) goto L_0x00b3
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r2 = r6.f273842d
                r2.getClass()
                java.lang.String r3 = "getAudioRespond"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
                eb0.e$a r2 = r2.f273741K
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                r7.mo136891c(r2)
            L_0x00b3:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                java.lang.String r2 = "access$getPlayCount$p"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
                int r3 = r7.f273745P
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
                int r3 = r3 + r8
                java.lang.String r8 = "access$setPlayCount$p"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                r7.f273745P = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                goto L_0x011a
            L_0x00cb:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                java.lang.String r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119664H(r7)
                nb0.C88913c.m111007e(r7)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                wo2.k r7 = r7.mo130166N()
                r7.mo142083a()
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r7 = r7.mo130168P()
                r7.setRefreshing(r2)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r7 = r7.mo130165M()
                r7.setState(r2)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                android.content.Context r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119663G(r7)
                boolean r8 = r7 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
                if (r8 == 0) goto L_0x00fc
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r7 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r7
                goto L_0x00fd
            L_0x00fc:
                r7 = r3
            L_0x00fd:
                if (r7 == 0) goto L_0x0101
                java.lang.String r3 = r7.f277559Y1
            L_0x0101:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r8 = r6.f273842d
                java.lang.String r8 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119664H(r8)
                boolean r8 = gy3.C87412m.m108589b(r3, r8)
                if (r8 == 0) goto L_0x010f
                r7.f277556X1 = r2
            L_0x010f:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                eb0.e r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119662E(r7)
                if (r7 == 0) goto L_0x011a
                r7.mo136890b(r2)
            L_0x011a:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                goto L_0x013c
            L_0x011d:
                r2 = 2
                if (r7 != r2) goto L_0x012c
                java.lang.String r7 = "userControlFlow called ACTION_PAUSE but not prepared!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                goto L_0x013f
            L_0x012c:
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r7 = r6.f273842d
                java.lang.Object r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119665I(r7, r8)
                xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
                if (r7 != r8) goto L_0x013a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                goto L_0x013f
            L_0x013a:
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x013c:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            L_0x013f:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94635f0.C94636a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94635f0(AdLandingMusicComponent adLandingMusicComponent, C15601d<? super C94635f0> dVar) {
        super(2, dVar);
        this.f273841e = adLandingMusicComponent;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        C94635f0 f0Var = new C94635f0(this.f273841e, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        return f0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        ((C94635f0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        return aVar;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f273840d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<Integer> Q = this.f273841e.mo130169Q();
            C94636a aVar2 = new C94636a(this.f273841e);
            this.f273840d = 1;
            C58100z0 z0Var = (C58100z0) Q;
            z0Var.getClass();
            if (C58100z0.m67238l(z0Var, aVar2, this) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
                return aVar;
            }
        } else if (i != 1) {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
            throw illegalStateException;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        C13600d dVar = new C13600d();
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initControlFlow$1");
        throw dVar;
    }
}
