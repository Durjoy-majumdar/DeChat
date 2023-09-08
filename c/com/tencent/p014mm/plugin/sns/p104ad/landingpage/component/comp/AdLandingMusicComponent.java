package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import a14.C0000n0;
import a14.C53930o0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.PlayActionButton;
import com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.appcompat.AdAppCompatTextView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58017a1;
import d14.C58085t0;
import eb0.C97621e;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import nb0.C88913c;
import org.json.JSONObject;
import p1208q3.C118144a;
import ps2.C100894u;
import so2.C101687p;
import wo2.C102476k;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent */
public final class AdLandingMusicComponent extends C95295z {

    /* renamed from: T */
    public static final C57324a f273730T = new C57324a((C8480h) null);

    /* renamed from: A */
    public AdAppCompatTextView f273731A;

    /* renamed from: B */
    public boolean f273732B;

    /* renamed from: C */
    public String f273733C;

    /* renamed from: D */
    public final PlayActionButton f273734D;

    /* renamed from: E */
    public SeekBarView f273735E;

    /* renamed from: F */
    public C0000n0 f273736F;

    /* renamed from: G */
    public final C39623j f273737G;

    /* renamed from: H */
    public final C58085t0<Integer> f273738H;

    /* renamed from: I */
    public final List<IListener<?>> f273739I;

    /* renamed from: J */
    public final SnsAdNativeLandingPagesUI f273740J;

    /* renamed from: K */
    public final C97621e.C97622a f273741K;

    /* renamed from: L */
    public final C97621e f273742L;

    /* renamed from: M */
    public final C102476k f273743M;

    /* renamed from: N */
    public final BroadcastReceiver f273744N;

    /* renamed from: P */
    public int f273745P;

    /* renamed from: Q */
    public int f273746Q;

    /* renamed from: R */
    public int f273747R;

    /* renamed from: S */
    public int f273748S;

    /* renamed from: s */
    public final Context f273749s;

    /* renamed from: t */
    public final C101687p f273750t;

    /* renamed from: u */
    public final int f273751u;

    /* renamed from: v */
    public final View f273752v;

    /* renamed from: w */
    public final MMRoundCornerImageView f273753w;

    /* renamed from: x */
    public LinearLayout f273754x;

    /* renamed from: y */
    public AdAppCompatTextView f273755y;

    /* renamed from: z */
    public LinearLayout f273756z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$a */
    public static final class C57324a {
        public C57324a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo80862a(int i) {
            String str;
            SnsMethodCalculate.markStartTimeMs("makeTimeString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$Companion");
            if (i < 10) {
                StringBuilder sb = new StringBuilder();
                sb.append('0');
                sb.append(i);
                str = sb.toString();
            } else {
                str = i + "";
            }
            SnsMethodCalculate.markEndTimeMs("makeTimeString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$Companion");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$b */
    public static final class C94599b implements C97621e.C97622a {
        /* renamed from: I2 */
        public void mo23179I2() {
            SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
            SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        }

        /* renamed from: N3 */
        public void mo23180N3() {
            SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
            SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        }

        /* renamed from: R0 */
        public void mo23181R0() {
            SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
            SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        }

        /* renamed from: f2 */
        public void mo23185f2() {
            SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
            SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$audioRespond$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$c */
    public static final class C94600c extends C87413o implements C32226l<Integer, Float> {

        /* renamed from: d */
        public final /* synthetic */ AdLandingMusicComponent f273757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94600c(AdLandingMusicComponent adLandingMusicComponent) {
            super(1);
            this.f273757d = adLandingMusicComponent;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initCommon$1");
            int intValue = ((Number) obj).intValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initCommon$1");
            AdLandingMusicComponent adLandingMusicComponent = this.f273757d;
            SnsMethodCalculate.markStartTimeMs("access$convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            float K = adLandingMusicComponent.mo130164K(intValue);
            SnsMethodCalculate.markEndTimeMs("access$convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            Float valueOf = Float.valueOf(K);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initCommon$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initCommon$1");
            return valueOf;
        }
    }

    public AdLandingMusicComponent(Context context, C101687p pVar, ViewGroup viewGroup) {
        super(context, pVar, viewGroup);
        this.f273749s = context;
        this.f273750t = pVar;
        this.f273751u = pVar != null ? pVar.f297695z : 0;
        this.f273752v = new View(context);
        C87412m.m108593f(context, "context");
        this.f273753w = new MMRoundCornerImageView(context);
        this.f273733C = "";
        C87412m.m108593f(context, "context");
        this.f273734D = new PlayActionButton(context);
        this.f273735E = new SeekBarView(context);
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = null;
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        this.f273737G = sVar != null ? sVar.getLifecycle() : null;
        this.f273738H = C58017a1.m67173b(0, 1, C54624g.DROP_OLDEST, 1, (Object) null);
        this.f273739I = new ArrayList();
        this.f273740J = context instanceof SnsAdNativeLandingPagesUI ? (SnsAdNativeLandingPagesUI) context : snsAdNativeLandingPagesUI;
        this.f273741K = new C94599b();
        this.f273742L = new C97621e();
        this.f273743M = new C102476k();
        this.f273744N = new AdLandingMusicComponent$receiver$1(this);
    }

    /* renamed from: E */
    public static final /* synthetic */ C97621e m119662E(AdLandingMusicComponent adLandingMusicComponent) {
        SnsMethodCalculate.markStartTimeMs("access$getAudioHelperTool$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        C97621e eVar = adLandingMusicComponent.f273742L;
        SnsMethodCalculate.markEndTimeMs("access$getAudioHelperTool$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return eVar;
    }

    /* renamed from: G */
    public static final /* synthetic */ Context m119663G(AdLandingMusicComponent adLandingMusicComponent) {
        SnsMethodCalculate.markStartTimeMs("access$getContext$p$s1258133964", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        Context context = adLandingMusicComponent.f273749s;
        SnsMethodCalculate.markEndTimeMs("access$getContext$p$s1258133964", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return context;
    }

    /* renamed from: H */
    public static final /* synthetic */ String m119664H(AdLandingMusicComponent adLandingMusicComponent) {
        SnsMethodCalculate.markStartTimeMs("access$getPlayerId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        String str = adLandingMusicComponent.f273733C;
        SnsMethodCalculate.markEndTimeMs("access$getPlayerId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return str;
    }

    /* JADX WARNING: type inference failed for: r12v7, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r11v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m119665I(com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent r11, wx3.C15601d r12) {
        /*
            java.lang.String r0 = "access$prepareAndPlay"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r11.getClass()
            java.lang.String r2 = "prepareAndPlay"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            boolean r3 = r12 instanceof com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94650k0
            if (r3 == 0) goto L_0x0023
            r3 = r12
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k0 r3 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94650k0) r3
            int r4 = r3.f273882g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0023
            int r4 = r4 - r5
            r3.f273882g = r4
            goto L_0x0028
        L_0x0023:
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k0 r3 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k0
            r3.<init>(r11, r12)
        L_0x0028:
            java.lang.Object r12 = r3.f273880e
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f273882g
            r6 = 0
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0049
            if (r5 != r8) goto L_0x003e
            java.lang.Object r11 = r3.f273879d
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent r11 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00e3
        L_0x003e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            throw r11
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r12)
            r3.f273879d = r11
            r3.f273882g = r8
            a14.m r12 = new a14.m
            wx3.d r3 = xx3.C66447b.m78392b(r3)
            r12.<init>(r3, r8)
            r12.mo74609p()
            android.content.Context r3 = m119663G(r11)
            boolean r5 = r3 instanceof androidx.lifecycle.C0125s
            if (r5 == 0) goto L_0x0067
            androidx.lifecycle.s r3 = (androidx.lifecycle.C0125s) r3
            goto L_0x0068
        L_0x0067:
            r3 = r7
        L_0x0068:
            if (r3 != 0) goto L_0x006c
            goto L_0x00d9
        L_0x006c:
            java.lang.String r5 = m119664H(r11)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p0 r9 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p0
            r9.<init>(r11, r12, r3)
            java.lang.String r10 = "listenAudioEvent$default"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            r11.mo130172V(r3, r5, r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r3 = r11.mo130165M()
            r3.setShowLoading(r8)
            java.lang.String r3 = "getInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            so2.p r5 = r11.f273750t
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            if (r5 == 0) goto L_0x0097
            java.lang.String r3 = r5.f297684A
            goto L_0x0098
        L_0x0097:
            r3 = r7
        L_0x0098:
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = ""
        L_0x009c:
            nb0.b r5 = new nb0.b
            r5.<init>()
            java.lang.String r9 = m119664H(r11)
            r5.f256416a = r9
            r5.f256422g = r8
            r5.f256417b = r3
            r5.f256423h = r6
            nb0.C88913c.m111010h(r5)
            android.content.Context r3 = m119663G(r11)
            boolean r5 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
            if (r5 == 0) goto L_0x00bb
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r3 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r3
            goto L_0x00bc
        L_0x00bb:
            r3 = r7
        L_0x00bc:
            if (r3 != 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r3.f277556X1 = r8
        L_0x00c1:
            android.content.Context r3 = m119663G(r11)
            boolean r5 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
            if (r5 == 0) goto L_0x00cc
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r3 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r3
            goto L_0x00cd
        L_0x00cc:
            r3 = r7
        L_0x00cd:
            if (r3 != 0) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            java.lang.String r5 = m119664H(r11)
            r3.f277559Y1 = r5
        L_0x00d6:
            m119666J(r11)
        L_0x00d9:
            java.lang.Object r12 = r12.mo74608o()
            if (r12 != r4) goto L_0x00e3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x013a
        L_0x00e3:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x010f
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r12 = r11.f273735E
            r12.setRefreshing(r6)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r12 = r11.f273735E
            r3 = 0
            r12.setProgress(r3)
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r12 = r11.f273734D
            r12.setState(r6)
            android.content.Context r11 = r11.f273749s
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
            if (r12 == 0) goto L_0x0104
            r7 = r11
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r7 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r7
        L_0x0104:
            if (r7 != 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r7.f277556X1 = r6
        L_0x0109:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x013a
        L_0x010f:
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r12 = r11.f273735E
            r12.setRefreshing(r8)
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r12 = r11.f273734D
            r12.setState(r8)
            android.content.Context r12 = r11.f273749s
            boolean r3 = r12 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI
            if (r3 == 0) goto L_0x0123
            r4 = r12
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r4 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r4
            goto L_0x0124
        L_0x0123:
            r4 = r7
        L_0x0124:
            if (r4 != 0) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r4.f277556X1 = r8
        L_0x0129:
            if (r3 == 0) goto L_0x012e
            r7 = r12
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r7 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r7
        L_0x012e:
            if (r7 != 0) goto L_0x0131
            goto L_0x0135
        L_0x0131:
            java.lang.String r11 = r11.f273733C
            r7.f277559Y1 = r11
        L_0x0135:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x013a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.m119665I(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent, wx3.d):java.lang.Object");
    }

    /* renamed from: J */
    public static final void m119666J(AdLandingMusicComponent adLandingMusicComponent) {
        SnsMethodCalculate.markStartTimeMs("access$sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        adLandingMusicComponent.getClass();
        SnsMethodCalculate.markStartTimeMs("sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        C118144a a = C118144a.m166672a(adLandingMusicComponent.f273749s);
        C87412m.m108593f(a, "getInstance(context)");
        Intent intent = new Intent("com.tencent.mm.adlanding.close_exposure_voice");
        intent.putExtra("identity", adLandingMusicComponent.f273733C);
        a.mo182944c(intent);
        SnsMethodCalculate.markEndTimeMs("sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        SnsMethodCalculate.markEndTimeMs("access$sendPlayBroadcast", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.mo130145A();
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.mo67235C();
        C0000n0 n0Var = this.f273736F;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        for (IListener dead : this.f273739I) {
            dead.dead();
        }
        ((ArrayList) this.f273739I).clear();
        C118144a a = C118144a.m166672a(this.f273749s);
        C87412m.m108593f(a, "getInstance(context)");
        a.mo182945d(this.f273744N);
        C97621e eVar = this.f273742L;
        if (eVar != null) {
            eVar.mo136889a();
        }
        Log.m105926v("MicroMsg.Sns.AdLandingMusicComponent", "unregister receiver");
        try {
            C88913c.m111004b(this.f273733C);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* renamed from: K */
    public final float mo130164K(int i) {
        SnsMethodCalculate.markStartTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        C101687p pVar = this.f273750t;
        if (pVar == null) {
            SnsMethodCalculate.markEndTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return 0.0f;
        }
        float n = C100894u.m132234n((double) i, pVar.f297692I, pVar.f297693J, pVar.f297694K);
        SnsMethodCalculate.markEndTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return n;
    }

    /* renamed from: M */
    public final PlayActionButton mo130165M() {
        SnsMethodCalculate.markStartTimeMs("getActionBtn", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        PlayActionButton playActionButton = this.f273734D;
        SnsMethodCalculate.markEndTimeMs("getActionBtn", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return playActionButton;
    }

    /* renamed from: N */
    public final C102476k mo130166N() {
        SnsMethodCalculate.markStartTimeMs("getPlayedTimeReporter", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        C102476k kVar = this.f273743M;
        SnsMethodCalculate.markEndTimeMs("getPlayedTimeReporter", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return kVar;
    }

    /* renamed from: O */
    public final RoundCornerRelativeLayout mo130167O() {
        SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        View view = this.f276586n;
        RoundCornerRelativeLayout roundCornerRelativeLayout = null;
        RoundCornerRelativeLayout roundCornerRelativeLayout2 = view != null ? (RoundCornerRelativeLayout) view.findViewById(C0966R.C0970id.c_z) : null;
        if (roundCornerRelativeLayout2 instanceof RoundCornerRelativeLayout) {
            roundCornerRelativeLayout = roundCornerRelativeLayout2;
        }
        SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return roundCornerRelativeLayout;
    }

    /* renamed from: P */
    public final SeekBarView mo130168P() {
        SnsMethodCalculate.markStartTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        SeekBarView seekBarView = this.f273735E;
        SnsMethodCalculate.markEndTimeMs("getSeekBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return seekBarView;
    }

    /* renamed from: Q */
    public final C58085t0<Integer> mo130169Q() {
        SnsMethodCalculate.markStartTimeMs("getUserControlFlow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        C58085t0<Integer> t0Var = this.f273738H;
        SnsMethodCalculate.markEndTimeMs("getUserControlFlow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return t0Var;
    }

    /* renamed from: R */
    public final void mo130170R(int i) {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        AdAppCompatTextView adAppCompatTextView = this.f273755y;
        if (adAppCompatTextView == null) {
            SnsMethodCalculate.markEndTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        adAppCompatTextView.setTextColor(i);
        adAppCompatTextView.setGravity(16);
        C101687p pVar = this.f273750t;
        String str3 = "";
        if (pVar == null || (str = pVar.f297686C) == null) {
            str = str3;
        }
        adAppCompatTextView.setText(str);
        adAppCompatTextView.setMarqueeRepeatLimit(Integer.MAX_VALUE);
        adAppCompatTextView.setSelected(true);
        adAppCompatTextView.requestFocus();
        AdAppCompatTextView adAppCompatTextView2 = this.f273731A;
        if (adAppCompatTextView2 == null) {
            SnsMethodCalculate.markEndTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        adAppCompatTextView2.setGravity(16);
        adAppCompatTextView2.setMarqueeRepeatLimit(Integer.MAX_VALUE);
        adAppCompatTextView2.setTextColor(i);
        C101687p pVar2 = this.f273750t;
        if (!(pVar2 == null || (str2 = pVar2.f297687D) == null)) {
            str3 = str2;
        }
        adAppCompatTextView2.setText(str3);
        adAppCompatTextView2.setSelected(true);
        adAppCompatTextView2.setAlpha(0.5f);
        adAppCompatTextView2.requestFocus();
        PlayActionButton playActionButton = this.f273734D;
        C94600c cVar = new C94600c(this);
        playActionButton.getClass();
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        playActionButton.f274187f = i;
        playActionButton.setGravity(17);
        playActionButton.f274186e = new PlayActionButton.C94727a(playActionButton.getContext(), ((Number) cVar.invoke(2)).floatValue(), i);
        playActionButton.addView(playActionButton.f274185d, (int) ((Number) cVar.invoke(64)).floatValue(), (int) ((Number) cVar.invoke(64)).floatValue());
        playActionButton.addView(playActionButton.f274186e, (int) ((Number) cVar.invoke(88)).floatValue(), (int) ((Number) cVar.invoke(88)).floatValue());
        playActionButton.setShowLoading(false);
        ViewGroup.LayoutParams layoutParams = playActionButton.f274185d.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = null;
        RelativeLayout.LayoutParams layoutParams3 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.addRule(13);
        }
        PlayActionButton.C94727a aVar = playActionButton.f274186e;
        ViewGroup.LayoutParams layoutParams4 = aVar != null ? aVar.getLayoutParams() : null;
        if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = (RelativeLayout.LayoutParams) layoutParams4;
        }
        if (layoutParams2 != null) {
            layoutParams2.addRule(13);
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        this.f273735E.setProgress(0.0f);
        SnsMethodCalculate.markEndTimeMs("initCommon", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* renamed from: U */
    public final boolean mo130171U() {
        SnsMethodCalculate.markStartTimeMs("isPlayingInFront", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f273740J;
        boolean z = false;
        if (snsAdNativeLandingPagesUI != null ? snsAdNativeLandingPagesUI.f277556X1 : false) {
            if (C87412m.m108589b(snsAdNativeLandingPagesUI != null ? snsAdNativeLandingPagesUI.f277559Y1 : null, this.f273733C)) {
                z = true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isPlayingInFront", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return z;
    }

    /* renamed from: V */
    public final void mo130172V(C0125s sVar, String str, boolean z, C32226l<? super AudioPlayerEvent.C17674a, Boolean> lVar) {
        SnsMethodCalculate.markStartTimeMs("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        C87412m.m108594g(str, "playerId");
        C87412m.m108594g(lVar, "callback");
        if (sVar == null) {
            SnsMethodCalculate.markEndTimeMs("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return;
        }
        C8479f0 f0Var = new C8479f0();
        AdLandingMusicComponent$listenAudioEvent$1 adLandingMusicComponent$listenAudioEvent$1 = new AdLandingMusicComponent$listenAudioEvent$1(sVar, str, lVar, z, f0Var);
        f0Var.f27484d = adLandingMusicComponent$listenAudioEvent$1;
        adLandingMusicComponent$listenAudioEvent$1.alive();
        ((ArrayList) this.f273739I).add(f0Var.f27484d);
        SnsMethodCalculate.markEndTimeMs("listenAudioEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* renamed from: d */
    public void mo124363d() {
        SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        super.mo124363d();
        SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
    }

    /* JADX WARNING: type inference failed for: r16v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67238e() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "createView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            super.mo67238e()
            so2.p r0 = r1.f273750t
            if (r0 != 0) goto L_0x0014
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0014:
            android.content.Context r4 = r1.f273749s
            if (r4 != 0) goto L_0x001c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x001c:
            a14.n0 r4 = a14.C53930o0.m60555b()
            r1.f273736F = r4
            java.lang.String r4 = "initBlurBG"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            a14.n0 r5 = r1.f273736F
            r11 = 0
            if (r5 == 0) goto L_0x0038
            r6 = 0
            r7 = 0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d0 r8 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d0
            r8.<init>(r0, r1, r11)
            r9 = 3
            r10 = 0
            a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
        L_0x0038:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 0
            android.view.View r6 = r1.f273752v     // Catch:{ all -> 0x008f }
            java.lang.String r7 = r0.f297688E     // Catch:{ all -> 0x008f }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ all -> 0x008f }
            r6.setBackgroundColor(r7)     // Catch:{ all -> 0x008f }
            android.view.View r6 = r1.f273752v     // Catch:{ all -> 0x008f }
            float r0 = r0.f297689F     // Catch:{ all -> 0x008f }
            k20.a r7 = new k20.a     // Catch:{ all -> 0x008f }
            r7.<init>()     // Catch:{ all -> 0x008f }
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a     // Catch:{ all -> 0x008f }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x008f }
            r7.mo10233c(r0)     // Catch:{ all -> 0x008f }
            java.lang.Object[] r13 = r7.mo10232b()     // Catch:{ all -> 0x008f }
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent"
            java.lang.String r15 = "createView"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setAlpha"
            java.lang.String r19 = "(F)V"
            r12 = r6
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r7.mo10231a(r5)     // Catch:{ all -> 0x008f }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x008f }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x008f }
            r6.setAlpha(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent"
            java.lang.String r14 = "createView"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setAlpha"
            java.lang.String r18 = "(F)V"
            r12 = r6
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x008f }
            goto L_0x0094
        L_0x008f:
            android.view.View r0 = r1.f273752v
            r0.setBackgroundColor(r4)
        L_0x0094:
            java.lang.String r0 = "initTexts"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            android.content.Context r6 = r1.f273749s
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131497610(0x7f0c128a, float:1.8618818E38)
            if (r6 == 0) goto L_0x00a9
            android.view.View r6 = r6.inflate(r7, r11)
            goto L_0x00aa
        L_0x00a9:
            r6 = r11
        L_0x00aa:
            boolean r8 = r6 instanceof android.widget.LinearLayout
            if (r8 == 0) goto L_0x00b1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            goto L_0x00b2
        L_0x00b1:
            r6 = r11
        L_0x00b2:
            r1.f273754x = r6
            android.content.Context r6 = r1.f273749s
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            if (r6 == 0) goto L_0x00c1
            android.view.View r6 = r6.inflate(r7, r11)
            goto L_0x00c2
        L_0x00c1:
            r6 = r11
        L_0x00c2:
            boolean r7 = r6 instanceof android.widget.LinearLayout
            if (r7 == 0) goto L_0x00c9
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            goto L_0x00ca
        L_0x00c9:
            r6 = r11
        L_0x00ca:
            r1.f273756z = r6
            android.widget.LinearLayout r6 = r1.f273754x
            r7 = 2131313900(0x7f0944ec, float:1.824621E38)
            if (r6 == 0) goto L_0x00da
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r6 = (com.tencent.p014mm.plugin.sns.p104ad.widget.appcompat.AdAppCompatTextView) r6
            goto L_0x00db
        L_0x00da:
            r6 = r11
        L_0x00db:
            r1.f273755y = r6
            android.widget.LinearLayout r6 = r1.f273756z
            if (r6 == 0) goto L_0x00e8
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r6 = (com.tencent.p014mm.plugin.sns.p104ad.widget.appcompat.AdAppCompatTextView) r6
            goto L_0x00e9
        L_0x00e8:
            r6 = r11
        L_0x00e9:
            r1.f273731A = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            int r0 = r1.f273751u
            r8 = 34
            r9 = 40
            r10 = 32
            r12 = 16
            r13 = 654(0x28e, float:9.16E-43)
            r14 = 48
            r4 = 1
            if (r0 != 0) goto L_0x033c
            java.lang.String r0 = "initSmallViews"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            so2.p r15 = r1.f273750t
            if (r15 == 0) goto L_0x010e
            int r15 = r15.f297690G
            if (r15 != r4) goto L_0x010e
            r15 = 1
            goto L_0x010f
        L_0x010e:
            r15 = 0
        L_0x010f:
            if (r15 == 0) goto L_0x0114
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0115
        L_0x0114:
            r15 = -1
        L_0x0115:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r16 = r20.mo130167O()
            if (r16 == 0) goto L_0x0121
            android.view.ViewGroup$LayoutParams r16 = r16.getLayoutParams()
            r11 = r16
        L_0x0121:
            boolean r6 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0129
            r6 = r11
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x012a
        L_0x0129:
            r6 = 0
        L_0x012a:
            if (r6 != 0) goto L_0x012d
            goto L_0x0134
        L_0x012d:
            float r11 = r1.mo130164K(r14)
            int r11 = (int) r11
            r6.leftMargin = r11
        L_0x0134:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x013f
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x0140
        L_0x013f:
            r6 = 0
        L_0x0140:
            boolean r11 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L_0x0147
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            if (r6 != 0) goto L_0x014b
            goto L_0x0152
        L_0x014b:
            float r11 = r1.mo130164K(r14)
            int r11 = (int) r11
            r6.rightMargin = r11
        L_0x0152:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x015d
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x015e
        L_0x015d:
            r6 = 0
        L_0x015e:
            boolean r11 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L_0x0165
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0166
        L_0x0165:
            r6 = 0
        L_0x0166:
            if (r6 != 0) goto L_0x0169
            goto L_0x0170
        L_0x0169:
            float r11 = r1.mo130164K(r13)
            int r11 = (int) r11
            r6.width = r11
        L_0x0170:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x017b
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x017c
        L_0x017b:
            r6 = 0
        L_0x017c:
            boolean r11 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L_0x0183
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0184
        L_0x0183:
            r6 = 0
        L_0x0184:
            r11 = 240(0xf0, float:3.36E-43)
            if (r6 != 0) goto L_0x0189
            goto L_0x0190
        L_0x0189:
            float r7 = r1.mo130164K(r11)
            int r7 = (int) r7
            r6.height = r7
        L_0x0190:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x019d
            float r7 = r1.mo130164K(r12)
            r6.setRadius(r7)
        L_0x019d:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x01b2
            android.view.View r7 = r1.f273752v
            float r13 = r1.mo130164K(r13)
            int r13 = (int) r13
            float r4 = r1.mo130164K(r11)
            int r4 = (int) r4
            r6.addView(r7, r13, r4)
        L_0x01b2:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r4 = r20.mo130167O()
            if (r4 == 0) goto L_0x01c9
            com.tencent.mm.ui.widget.MMRoundCornerImageView r6 = r1.f273753w
            r7 = 176(0xb0, float:2.47E-43)
            float r13 = r1.mo130164K(r7)
            int r13 = (int) r13
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r4.addView(r6, r13, r7)
        L_0x01c9:
            com.tencent.mm.ui.widget.MMRoundCornerImageView r4 = r1.f273753w
            float r6 = r1.mo130164K(r12)
            int r6 = (int) r6
            r4.setRadius(r6)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r4 = r1.f273753w
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x01e0
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x01e1
        L_0x01e0:
            r4 = 0
        L_0x01e1:
            if (r4 != 0) goto L_0x01e4
            goto L_0x01eb
        L_0x01e4:
            float r6 = r1.mo130164K(r10)
            int r6 = (int) r6
            r4.leftMargin = r6
        L_0x01eb:
            if (r4 != 0) goto L_0x01ee
            goto L_0x01f5
        L_0x01ee:
            float r6 = r1.mo130164K(r10)
            int r6 = (int) r6
            r4.topMargin = r6
        L_0x01f5:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r4 = r20.mo130167O()
            r6 = 382(0x17e, float:5.35E-43)
            if (r4 == 0) goto L_0x020c
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r7 = r1.f273735E
            float r10 = r1.mo130164K(r6)
            int r10 = (int) r10
            float r12 = r1.mo130164K(r8)
            int r12 = (int) r12
            r4.addView(r7, r10, r12)
        L_0x020c:
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r4 = r1.f273735E
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r7 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x0219
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x021a
        L_0x0219:
            r4 = 0
        L_0x021a:
            if (r4 != 0) goto L_0x021d
            goto L_0x0224
        L_0x021d:
            float r7 = r1.mo130164K(r11)
            int r7 = (int) r7
            r4.leftMargin = r7
        L_0x0224:
            if (r4 != 0) goto L_0x0227
            goto L_0x0230
        L_0x0227:
            r7 = 174(0xae, float:2.44E-43)
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r4.topMargin = r7
        L_0x0230:
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r4 = r1.f273755y
            if (r4 != 0) goto L_0x0239
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x0239:
            android.widget.LinearLayout r7 = r1.f273754x
            if (r7 != 0) goto L_0x0242
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x0242:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r10 = r20.mo130167O()
            r12 = 278(0x116, float:3.9E-43)
            if (r10 == 0) goto L_0x0257
            float r13 = r1.mo130164K(r12)
            int r13 = (int) r13
            float r14 = r1.mo130164K(r14)
            int r14 = (int) r14
            r10.addView(r7, r13, r14)
        L_0x0257:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r10 = r7 instanceof android.widget.RelativeLayout.LayoutParams
            if (r10 == 0) goto L_0x0262
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            goto L_0x0263
        L_0x0262:
            r7 = 0
        L_0x0263:
            if (r7 != 0) goto L_0x0266
            goto L_0x026d
        L_0x0266:
            float r10 = r1.mo130164K(r11)
            int r10 = (int) r10
            r7.leftMargin = r10
        L_0x026d:
            if (r7 != 0) goto L_0x0270
            goto L_0x0277
        L_0x0270:
            float r9 = r1.mo130164K(r9)
            int r9 = (int) r9
            r7.topMargin = r9
        L_0x0277:
            float r7 = r1.mo130164K(r8)
            r4.setTextSize(r5, r7)
            float r7 = r1.mo130164K(r8)
            int r7 = (int) r7
            float r9 = r1.mo130164K(r8)
            int r9 = (int) r9
            r10 = 1
            int r9 = r9 + r10
            androidx.core.widget.C103733h.m138105b(r4, r7, r9, r10, r5)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r4 = r1.f273731A
            if (r4 != 0) goto L_0x0296
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x0296:
            android.widget.LinearLayout r7 = r1.f273756z
            if (r7 != 0) goto L_0x029f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x029f:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r9 = r20.mo130167O()
            if (r9 == 0) goto L_0x02b2
            float r10 = r1.mo130164K(r12)
            int r10 = (int) r10
            float r8 = r1.mo130164K(r8)
            int r8 = (int) r8
            r9.addView(r7, r10, r8)
        L_0x02b2:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r8 = r7 instanceof android.widget.RelativeLayout.LayoutParams
            if (r8 == 0) goto L_0x02bd
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            goto L_0x02be
        L_0x02bd:
            r7 = 0
        L_0x02be:
            if (r7 != 0) goto L_0x02c1
            goto L_0x02c8
        L_0x02c1:
            float r8 = r1.mo130164K(r11)
            int r8 = (int) r8
            r7.leftMargin = r8
        L_0x02c8:
            if (r7 != 0) goto L_0x02cb
            goto L_0x02d4
        L_0x02cb:
            r8 = 96
            float r8 = r1.mo130164K(r8)
            int r8 = (int) r8
            r7.topMargin = r8
        L_0x02d4:
            r7 = 24
            float r8 = r1.mo130164K(r7)
            r4.setTextSize(r5, r8)
            float r8 = r1.mo130164K(r7)
            int r8 = (int) r8
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            int r7 = r7 + 2
            r9 = 1
            androidx.core.widget.C103733h.m138105b(r4, r8, r7, r9, r5)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r4 = r20.mo130167O()
            if (r4 == 0) goto L_0x0304
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r7 = r1.f273734D
            r8 = 88
            float r9 = r1.mo130164K(r8)
            int r9 = (int) r9
            float r8 = r1.mo130164K(r8)
            int r8 = (int) r8
            r4.addView(r7, r9, r8)
        L_0x0304:
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r4 = r1.f273734D
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r7 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x0311
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x0312
        L_0x0311:
            r4 = 0
        L_0x0312:
            if (r4 != 0) goto L_0x0315
            goto L_0x031e
        L_0x0315:
            r7 = 534(0x216, float:7.48E-43)
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r4.leftMargin = r7
        L_0x031e:
            if (r4 != 0) goto L_0x0321
            goto L_0x032a
        L_0x0321:
            r7 = 42
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r4.topMargin = r7
        L_0x032a:
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r4 = r1.f273735E
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j0 r7 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j0
            r7.<init>(r1)
            r4.mo130420b(r7, r6, r15)
            r1.mo130170R(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x033c:
            java.lang.String r0 = "initBigViews"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            so2.p r4 = r1.f273750t
            if (r4 == 0) goto L_0x034c
            int r4 = r4.f297690G
            r6 = 1
            if (r4 != r6) goto L_0x034c
            r4 = 1
            goto L_0x034d
        L_0x034c:
            r4 = 0
        L_0x034d:
            if (r4 == 0) goto L_0x0352
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0353
        L_0x0352:
            r4 = -1
        L_0x0353:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x035e
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x035f
        L_0x035e:
            r6 = 0
        L_0x035f:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0366
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0367
        L_0x0366:
            r6 = 0
        L_0x0367:
            if (r6 != 0) goto L_0x036a
            goto L_0x0371
        L_0x036a:
            float r7 = r1.mo130164K(r14)
            int r7 = (int) r7
            r6.leftMargin = r7
        L_0x0371:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x037c
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x037d
        L_0x037c:
            r6 = 0
        L_0x037d:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0384
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0385
        L_0x0384:
            r6 = 0
        L_0x0385:
            if (r6 != 0) goto L_0x0388
            goto L_0x038f
        L_0x0388:
            float r7 = r1.mo130164K(r14)
            int r7 = (int) r7
            r6.rightMargin = r7
        L_0x038f:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x039a
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x039b
        L_0x039a:
            r6 = 0
        L_0x039b:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x03a2
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x03a3
        L_0x03a2:
            r6 = 0
        L_0x03a3:
            if (r6 != 0) goto L_0x03a6
            goto L_0x03ad
        L_0x03a6:
            float r7 = r1.mo130164K(r13)
            int r7 = (int) r7
            r6.width = r7
        L_0x03ad:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x03b8
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x03b9
        L_0x03b8:
            r6 = 0
        L_0x03b9:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x03c0
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x03c1
        L_0x03c0:
            r6 = 0
        L_0x03c1:
            r7 = 890(0x37a, float:1.247E-42)
            if (r6 != 0) goto L_0x03c6
            goto L_0x03cd
        L_0x03c6:
            float r11 = r1.mo130164K(r7)
            int r11 = (int) r11
            r6.height = r11
        L_0x03cd:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x03da
            float r11 = r1.mo130164K(r12)
            r6.setRadius(r11)
        L_0x03da:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x03ef
            android.view.View r11 = r1.f273752v
            float r13 = r1.mo130164K(r13)
            int r13 = (int) r13
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r6.addView(r11, r13, r7)
        L_0x03ef:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x0406
            com.tencent.mm.ui.widget.MMRoundCornerImageView r7 = r1.f273753w
            r11 = 590(0x24e, float:8.27E-43)
            float r13 = r1.mo130164K(r11)
            int r13 = (int) r13
            float r11 = r1.mo130164K(r11)
            int r11 = (int) r11
            r6.addView(r7, r13, r11)
        L_0x0406:
            com.tencent.mm.ui.widget.MMRoundCornerImageView r6 = r1.f273753w
            float r7 = r1.mo130164K(r12)
            int r7 = (int) r7
            r6.setRadius(r7)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r6 = r1.f273753w
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            boolean r7 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x041d
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            goto L_0x041e
        L_0x041d:
            r6 = 0
        L_0x041e:
            if (r6 != 0) goto L_0x0421
            goto L_0x0428
        L_0x0421:
            float r7 = r1.mo130164K(r10)
            int r7 = (int) r7
            r6.leftMargin = r7
        L_0x0428:
            if (r6 != 0) goto L_0x042b
            goto L_0x0432
        L_0x042b:
            float r7 = r1.mo130164K(r10)
            int r7 = (int) r7
            r6.topMargin = r7
        L_0x0432:
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r6 = r1.f273755y
            if (r6 != 0) goto L_0x043b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x043b:
            android.widget.LinearLayout r7 = r1.f273754x
            if (r7 != 0) goto L_0x0444
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x0444:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r10 = r20.mo130167O()
            r11 = 436(0x1b4, float:6.11E-43)
            if (r10 == 0) goto L_0x045b
            float r12 = r1.mo130164K(r11)
            int r12 = (int) r12
            r13 = 56
            float r13 = r1.mo130164K(r13)
            int r13 = (int) r13
            r10.addView(r7, r12, r13)
        L_0x045b:
            float r10 = r1.mo130164K(r9)
            r6.setTextSize(r5, r10)
            float r10 = r1.mo130164K(r9)
            int r10 = (int) r10
            float r9 = r1.mo130164K(r9)
            int r9 = (int) r9
            r12 = 1
            int r9 = r9 + r12
            androidx.core.widget.C103733h.m138105b(r6, r10, r9, r12, r5)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            boolean r7 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x047c
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            goto L_0x047d
        L_0x047c:
            r6 = 0
        L_0x047d:
            if (r6 != 0) goto L_0x0480
            goto L_0x0487
        L_0x0480:
            float r7 = r1.mo130164K(r14)
            int r7 = (int) r7
            r6.leftMargin = r7
        L_0x0487:
            if (r6 != 0) goto L_0x048a
            goto L_0x0493
        L_0x048a:
            r7 = 670(0x29e, float:9.39E-43)
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r6.topMargin = r7
        L_0x0493:
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r6 = r1.f273731A
            if (r6 != 0) goto L_0x049c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x049c:
            android.widget.LinearLayout r7 = r1.f273756z
            if (r7 != 0) goto L_0x04a5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x057a
        L_0x04a5:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r9 = r20.mo130167O()
            if (r9 == 0) goto L_0x04b8
            float r10 = r1.mo130164K(r11)
            int r10 = (int) r10
            float r11 = r1.mo130164K(r8)
            int r11 = (int) r11
            r9.addView(r7, r10, r11)
        L_0x04b8:
            r9 = 24
            float r10 = r1.mo130164K(r9)
            r6.setTextSize(r5, r10)
            float r10 = r1.mo130164K(r9)
            int r10 = (int) r10
            float r9 = r1.mo130164K(r9)
            int r9 = (int) r9
            r11 = 1
            int r9 = r9 + r11
            androidx.core.widget.C103733h.m138105b(r6, r10, r9, r11, r5)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            boolean r7 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x04db
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            goto L_0x04dc
        L_0x04db:
            r6 = 0
        L_0x04dc:
            if (r6 != 0) goto L_0x04df
            goto L_0x04e6
        L_0x04df:
            float r7 = r1.mo130164K(r14)
            int r7 = (int) r7
            r6.leftMargin = r7
        L_0x04e6:
            if (r6 != 0) goto L_0x04e9
            goto L_0x04f2
        L_0x04e9:
            r7 = 726(0x2d6, float:1.017E-42)
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r6.topMargin = r7
        L_0x04f2:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            if (r6 == 0) goto L_0x0509
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r7 = r1.f273734D
            r9 = 88
            float r10 = r1.mo130164K(r9)
            int r10 = (int) r10
            float r9 = r1.mo130164K(r9)
            int r9 = (int) r9
            r6.addView(r7, r10, r9)
        L_0x0509:
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r6 = r1.f273734D
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            boolean r7 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x0516
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            goto L_0x0517
        L_0x0516:
            r6 = 0
        L_0x0517:
            if (r6 != 0) goto L_0x051a
            goto L_0x0523
        L_0x051a:
            r7 = 514(0x202, float:7.2E-43)
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r6.leftMargin = r7
        L_0x0523:
            if (r6 != 0) goto L_0x0526
            goto L_0x052f
        L_0x0526:
            r7 = 672(0x2a0, float:9.42E-43)
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r6.topMargin = r7
        L_0x052f:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r6 = r20.mo130167O()
            r7 = 558(0x22e, float:7.82E-43)
            if (r6 == 0) goto L_0x0546
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r9 = r1.f273735E
            float r10 = r1.mo130164K(r7)
            int r10 = (int) r10
            float r8 = r1.mo130164K(r8)
            int r8 = (int) r8
            r6.addView(r9, r10, r8)
        L_0x0546:
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r6 = r1.f273735E
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c0 r8 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c0
            r8.<init>(r1)
            r6.mo130420b(r8, r7, r4)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r6 = r1.f273735E
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            boolean r7 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x055d
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            goto L_0x055e
        L_0x055d:
            r6 = 0
        L_0x055e:
            if (r6 != 0) goto L_0x0561
            goto L_0x0568
        L_0x0561:
            float r7 = r1.mo130164K(r14)
            int r7 = (int) r7
            r6.leftMargin = r7
        L_0x0568:
            if (r6 != 0) goto L_0x056b
            goto L_0x0574
        L_0x056b:
            r7 = 808(0x328, float:1.132E-42)
            float r7 = r1.mo130164K(r7)
            int r7 = (int) r7
            r6.topMargin = r7
        L_0x0574:
            r1.mo130170R(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
        L_0x057a:
            java.lang.String r4 = "initPlayer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            androidx.lifecycle.j r0 = r1.f273737G
            java.lang.String r6 = "initLifecycleObserver"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            if (r0 == 0) goto L_0x0590
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1 r7 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1
            r7.<init>(r0, r1)
            r0.addObserver(r7)
        L_0x0590:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            java.lang.String r0 = "sns_ad_music_comp"
            java.lang.String r6 = ea2.C31443g.m39405a()     // Catch:{ IOException -> 0x05a6 }
            java.lang.String r0 = nb0.C88913c.m111003a(r0, r6)     // Catch:{ IOException -> 0x05a6 }
            java.lang.String r6 = "createAudioPlayer(\"sns_a…rator.genAudioPlayerId())"
            gy3.C87412m.m108593f(r0, r6)     // Catch:{ IOException -> 0x05a6 }
            r1.f273733C = r0     // Catch:{ IOException -> 0x05a6 }
            goto L_0x05b4
        L_0x05a6:
            r0 = move-exception
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r0
            java.lang.String r0 = "MicroMsg.Sns.AdLandingMusicComponent"
            java.lang.String r7 = "music comp initPlayer called"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r6)
        L_0x05b4:
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r0 = r1.f273734D
            r0.setState(r5)
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r0 = r1.f273734D
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g0 r6 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g0
            r6.<init>(r1)
            r0.setOnClickListener(r6)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView r0 = r1.f273735E
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h0 r6 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C5425h0.f21120d
            so2.p r7 = r1.f273750t
            if (r7 == 0) goto L_0x05ce
            float r7 = r7.f297691H
            goto L_0x05cf
        L_0x05ce:
            r7 = 0
        L_0x05cf:
            r8 = 1000(0x3e8, float:1.401E-42)
            float r8 = (float) r8
            float r7 = r7 * r8
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i0 r8 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C57332i0.f164237d
            r0.mo130421c(r6, r7, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            java.lang.String r0 = "initReceiver"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            android.content.Context r4 = r1.f273749s
            q3.a r4 = p1208q3.C118144a.m166672a(r4)
            java.lang.String r6 = "getInstance(context)"
            gy3.C87412m.m108593f(r4, r6)
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.tencent.mm.adlanding.close_exposure_voice"
            r6.<init>(r7)
            android.content.BroadcastReceiver r7 = r1.f273744N
            r4.mo182943b(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = "initAudioListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            android.content.Context r4 = r1.f273749s
            boolean r6 = r4 instanceof androidx.lifecycle.C0125s
            if (r6 == 0) goto L_0x0609
            androidx.lifecycle.s r4 = (androidx.lifecycle.C0125s) r4
            goto L_0x060a
        L_0x0609:
            r4 = 0
        L_0x060a:
            if (r4 != 0) goto L_0x0610
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x061d
        L_0x0610:
            java.lang.String r6 = r1.f273733C
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 r7 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0
            r7.<init>(r1)
            r1.mo130172V(r4, r6, r5, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
        L_0x061d:
            java.lang.String r0 = "initControlFlow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            a14.n0 r4 = r1.f273736F
            if (r4 == 0) goto L_0x0633
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0 r7 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0
            r8 = 0
            r7.<init>(r1, r8)
            r8 = 3
            r9 = 0
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
        L_0x0633:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = "initBufferingMonitor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            a14.n0 r4 = r1.f273736F
            if (r4 == 0) goto L_0x064c
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e0 r7 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e0
            r8 = 0
            r7.<init>(r1, r8)
            r8 = 3
            r9 = 0
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
        L_0x064c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent.mo67238e():void");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return C0966R.C0971layout.crf;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            return false;
        }
        if (jSONObject != null) {
            try {
                C102476k kVar = this.f273743M;
                kVar.getClass();
                SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                kVar.mo142083a();
                long j = kVar.f301755a;
                SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                jSONObject.put("playedTime", j);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingMusicComponent", "setComponentKVReportData, exp=" + e);
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                return false;
            }
        }
        if (jSONObject != null) {
            jSONObject.put("musicDuration", this.f273748S);
        }
        if (jSONObject != null) {
            jSONObject.put("playCompletedCount", this.f273746Q);
        }
        if (jSONObject != null) {
            jSONObject.put("playCount", this.f273745P);
        }
        if (this.f273746Q > 0) {
            this.f273747R = this.f273748S;
        }
        if (jSONObject != null) {
            jSONObject.put("maxPlayTime", this.f273747R);
        }
        Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", "kv13387:" + jSONObject);
        SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        return true;
    }
}
