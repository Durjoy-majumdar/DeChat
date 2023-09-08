package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97621e;
import nb0.C88912b;
import nb0.C88913c;
import nb0.C88914d;
import org.json.JSONObject;
import so2.C101665a;
import wo2.C102476k;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b0 */
public final class C95066b0 extends C95295z {

    /* renamed from: A */
    public C97621e f275932A;

    /* renamed from: B */
    public IListener<AudioPlayerEvent> f275933B;

    /* renamed from: C */
    public int f275934C;

    /* renamed from: D */
    public int f275935D;

    /* renamed from: E */
    public int f275936E;

    /* renamed from: F */
    public int f275937F;

    /* renamed from: G */
    public final C97621e.C97622a f275938G = new C95067a();

    /* renamed from: H */
    public final String f275939H = "AdLandingPageBgmVoiceComponent";

    /* renamed from: s */
    public final Context f275940s;

    /* renamed from: t */
    public final C101665a f275941t;

    /* renamed from: u */
    public final boolean f275942u;

    /* renamed from: v */
    public final C102476k f275943v = new C102476k();

    /* renamed from: w */
    public String f275944w = "";

    /* renamed from: x */
    public boolean f275945x;

    /* renamed from: y */
    public boolean f275946y;

    /* renamed from: z */
    public boolean f275947z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b0$a */
    public static final class C95067a implements C97621e.C97622a {
        /* renamed from: I2 */
        public void mo23179I2() {
            SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
            SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
        }

        /* renamed from: N3 */
        public void mo23180N3() {
            SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
            SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
        }

        /* renamed from: R0 */
        public void mo23181R0() {
            SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
            SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
        }

        /* renamed from: f2 */
        public void mo23185f2() {
            SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
            SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$mAudioRespond$1");
        }
    }

    public C95066b0(Context context, C101665a aVar, ViewGroup viewGroup, boolean z) {
        super(context, aVar, viewGroup);
        this.f275940s = context;
        this.f275941t = aVar;
        this.f275942u = z;
    }

    /* renamed from: E */
    public static final /* synthetic */ C97621e m120873E(C95066b0 b0Var) {
        SnsMethodCalculate.markStartTimeMs("access$getMAudioHelperTool$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        C97621e eVar = b0Var.f275932A;
        SnsMethodCalculate.markEndTimeMs("access$getMAudioHelperTool$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return eVar;
    }

    /* renamed from: G */
    public static final /* synthetic */ String m120874G(C95066b0 b0Var) {
        SnsMethodCalculate.markStartTimeMs("access$getMBgmVoiceAudioPlayerId$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        String str = b0Var.f275944w;
        SnsMethodCalculate.markEndTimeMs("access$getMBgmVoiceAudioPlayerId$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return str;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        super.mo124360B();
        Log.m105924i(this.f275939H, "viewWillAppear() called");
        if (this.f275945x && !TextUtils.isEmpty(this.f275944w) && this.f275946y) {
            C88913c.m111008f(this.f275944w, (C88912b) null);
            SnsMethodCalculate.markStartTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            this.f275943v.mo142084b();
            SnsMethodCalculate.markEndTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            this.f275934C++;
            C97621e eVar = this.f275932A;
            if (eVar != null) {
                eVar.mo136891c(this.f275938G);
            }
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        super.mo67235C();
        Log.m105924i(this.f275939H, "viewWillDestroy() called");
        IListener<AudioPlayerEvent> iListener = this.f275933B;
        if (iListener != null) {
            iListener.dead();
        }
        if (!TextUtils.isEmpty(this.f275944w)) {
            C88914d d = C88913c.m111006d(this.f275944w);
            this.f275936E = d != null ? d.f256443b : 0;
            C88913c.m111004b(this.f275944w);
        }
        C97621e eVar = this.f275932A;
        if (eVar != null) {
            eVar.mo136889a();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        super.mo124361D();
        Log.m105924i(this.f275939H, "viewWillDisappear() called");
        if (this.f275945x && !TextUtils.isEmpty(this.f275944w)) {
            C88913c.m111007e(this.f275944w);
            SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            this.f275943v.mo142083a();
            SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            C97621e eVar = this.f275932A;
            if (eVar != null) {
                eVar.mo136889a();
            }
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
    }

    /* renamed from: H */
    public final boolean mo131575H() {
        SnsMethodCalculate.markStartTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        C101665a aVar = this.f275941t;
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f297592A) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            SnsMethodCalculate.markEndTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            return false;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            SnsMethodCalculate.markEndTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            return true;
        } else {
            boolean z = this.f275942u;
            SnsMethodCalculate.markEndTimeMs("getShouldAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            return z;
        }
    }

    /* renamed from: I */
    public final String mo131576I() {
        SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        String str = this.f275939H;
        SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return str;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            return false;
        }
        if (jSONObject != null) {
            try {
                SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                C102476k kVar = this.f275943v;
                kVar.getClass();
                SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                kVar.mo142083a();
                long j = kVar.f301755a;
                SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
                SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                jSONObject.put("playedTime", j);
            } catch (Exception e) {
                String str = this.f275939H;
                Log.m105920e(str, "setComponentKVReportData, exp=" + e);
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                return false;
            }
        }
        if (jSONObject != null) {
            jSONObject.put("musicDuration", this.f275937F);
        }
        if (jSONObject != null) {
            jSONObject.put("playCompletedCount", this.f275935D);
        }
        if (jSONObject != null) {
            jSONObject.put("playCount", this.f275934C);
        }
        int i = this.f275936E;
        C88914d d = C88913c.m111006d(this.f275944w);
        this.f275936E = Math.max(i, d != null ? d.f256443b : 0);
        if (this.f275935D > 0) {
            this.f275936E = this.f275937F;
        }
        if (jSONObject != null) {
            jSONObject.put("maxPlayTime", this.f275936E);
        }
        String str2 = this.f275939H;
        Log.m105924i(str2, "kv13387:" + jSONObject);
        SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        return true;
    }
}
