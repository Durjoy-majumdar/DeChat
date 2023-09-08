package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.widget.ImageView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97621e;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import nb0.C88912b;
import nb0.C88913c;
import so2.C101665a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBgmVoiceComponent$initComp$2", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/AudioPlayerEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2 */
public final class AdLandingPageBgmVoiceComponent$initComp$2 extends IListener<AudioPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ C95066b0 f275832d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f275833e;

    /* renamed from: f */
    public final /* synthetic */ Context f275834f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingPageBgmVoiceComponent$initComp$2(C0125s sVar, C95066b0 b0Var, ImageView imageView, Context context) {
        super(sVar);
        this.f275832d = b0Var;
        this.f275833e = imageView;
        this.f275834f = context;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
        AudioPlayerEvent audioPlayerEvent = (AudioPlayerEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
        C87412m.m108594g(audioPlayerEvent, "event");
        try {
            AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
            if (aVar != null) {
                String str = aVar.f48076c;
                if (str != null) {
                    if (!C87412m.m108589b(str, C95066b0.m120874G(this.f275832d))) {
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                    } else {
                        String I = this.f275832d.mo131576I();
                        Log.m105924i(I, "mAudioPlayerEventListener  event = [" + audioPlayerEvent.f48073d.f48074a + ']');
                        int i = audioPlayerEvent.f48073d.f48074a;
                        if (i == 4) {
                            C95066b0 b0Var = this.f275832d;
                            SnsMethodCalculate.markStartTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            b0Var.f275946y = false;
                            SnsMethodCalculate.markEndTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            C95066b0 b0Var2 = this.f275832d;
                            SnsMethodCalculate.markStartTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            b0Var2.f275945x = false;
                            SnsMethodCalculate.markEndTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            C95066b0 b0Var3 = this.f275832d;
                            SnsMethodCalculate.markStartTimeMs("access$setShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            b0Var3.f275947z = true;
                            SnsMethodCalculate.markEndTimeMs("access$setShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            this.f275833e.setImageDrawable(C76577a.m92158i(this.f275834f, C0966R.raw.icon_volume_off));
                            String I2 = this.f275832d.mo131576I();
                            Log.m105920e(I2, "snsvoice onError() called with: code = [" + audioPlayerEvent.f48073d.f48079f + "], msg = [" + audioPlayerEvent.f48073d.f48080g + ']');
                        } else if (i == 5) {
                            Log.m105924i(this.f275832d.mo131576I(), "completed");
                            C95066b0 b0Var4 = this.f275832d;
                            SnsMethodCalculate.markStartTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            int i2 = b0Var4.f275935D;
                            SnsMethodCalculate.markEndTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            SnsMethodCalculate.markStartTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            b0Var4.f275935D = i2 + 1;
                            SnsMethodCalculate.markEndTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            try {
                                C95066b0 b0Var5 = this.f275832d;
                                b0Var5.getClass();
                                SnsMethodCalculate.markStartTimeMs("getAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                C101665a aVar2 = b0Var5.f275941t;
                                SnsMethodCalculate.markEndTimeMs("getAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                String str2 = aVar2 != null ? aVar2.f297593z : null;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                C88912b bVar = new C88912b();
                                bVar.f256416a = C95066b0.m120874G(this.f275832d);
                                bVar.f256417b = str2;
                                bVar.f256423h = false;
                                bVar.f256422g = true;
                                C88913c.m111010h(bVar);
                            } catch (Exception e) {
                                Log.m105921e(this.f275832d.mo131576I(), "snsvoice initToolBarVoiceBtn() called", e);
                            }
                        } else if (i == 7) {
                            String I3 = this.f275832d.mo131576I();
                            Log.m105924i(I3, "snsvoice onPrepared() called with: id = [" + audioPlayerEvent.f48073d.f48076c + ']');
                            String I4 = this.f275832d.mo131576I();
                            Log.m105918d(I4, "snsvoice dur = " + audioPlayerEvent.f48073d.f48075b);
                            C95066b0 b0Var6 = this.f275832d;
                            SnsMethodCalculate.markStartTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            boolean z = b0Var6.f275946y;
                            SnsMethodCalculate.markEndTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                            if (z) {
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                            } else {
                                C95066b0 b0Var7 = this.f275832d;
                                SnsMethodCalculate.markStartTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                b0Var7.f275937F = (int) audioPlayerEvent.f48073d.f48075b;
                                SnsMethodCalculate.markEndTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                C95066b0 b0Var8 = this.f275832d;
                                SnsMethodCalculate.markStartTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                b0Var8.f275946y = true;
                                SnsMethodCalculate.markEndTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                C95066b0 b0Var9 = this.f275832d;
                                SnsMethodCalculate.markStartTimeMs("access$isFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                boolean z2 = b0Var9.f275945x;
                                SnsMethodCalculate.markEndTimeMs("access$isFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                if (!z2) {
                                    C97621e E = C95066b0.m120873E(this.f275832d);
                                    if (E != null) {
                                        E.mo136889a();
                                    }
                                    C88913c.m111007e(C95066b0.m120874G(this.f275832d));
                                } else {
                                    C97621e E2 = C95066b0.m120873E(this.f275832d);
                                    if (E2 != null) {
                                        C95066b0 b0Var10 = this.f275832d;
                                        SnsMethodCalculate.markStartTimeMs("access$getMAudioRespond$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        C97621e.C97622a aVar3 = b0Var10.f275938G;
                                        SnsMethodCalculate.markEndTimeMs("access$getMAudioRespond$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        E2.mo136891c(aVar3);
                                    }
                                    C95066b0 b0Var11 = this.f275832d;
                                    b0Var11.getClass();
                                    SnsMethodCalculate.markStartTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    b0Var11.f275943v.mo142084b();
                                    SnsMethodCalculate.markEndTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    C95066b0 b0Var12 = this.f275832d;
                                    SnsMethodCalculate.markStartTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    int i3 = b0Var12.f275934C;
                                    SnsMethodCalculate.markEndTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    SnsMethodCalculate.markStartTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    b0Var12.f275934C = i3 + 1;
                                    SnsMethodCalculate.markEndTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                }
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                    return false;
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
        } catch (Exception e2) {
            Log.m105921e(this.f275832d.mo131576I(), "snsvoice onPrepared() error", e2);
        } catch (Throwable th) {
            Log.m105921e(this.f275832d.mo131576I(), "voice event error", th);
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
        return false;
    }
}
