package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$listenAudioEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/AudioPlayerEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1 */
public final class AdLandingMusicComponent$listenAudioEvent$1 extends IListener<AudioPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ String f249061d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<AudioPlayerEvent.C17674a, Boolean> f249062e;

    /* renamed from: f */
    public final /* synthetic */ boolean f249063f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<IListener<AudioPlayerEvent>> f249064g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingMusicComponent$listenAudioEvent$1(C0125s sVar, String str, C32226l<? super AudioPlayerEvent.C17674a, Boolean> lVar, boolean z, C8479f0<IListener<AudioPlayerEvent>> f0Var) {
        super(sVar);
        this.f249061d = str;
        this.f249062e = lVar;
        this.f249063f = z;
        this.f249064g = f0Var;
    }

    public boolean callback(IEvent iEvent) {
        String str;
        IListener iListener;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
        AudioPlayerEvent audioPlayerEvent = (AudioPlayerEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
        C87412m.m108594g(audioPlayerEvent, "event");
        AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
        if (aVar == null || (str = aVar.f48076c) == null) {
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
        } else if (!C87412m.m108589b(str, this.f249061d)) {
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
        } else {
            Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", "music comp event called with: action = [" + audioPlayerEvent.f48073d.f48074a + ']');
            C32226l<AudioPlayerEvent.C17674a, Boolean> lVar = this.f249062e;
            AudioPlayerEvent.C17674a aVar2 = audioPlayerEvent.f48073d;
            C87412m.m108593f(aVar2, "event.data");
            boolean booleanValue = lVar.invoke(aVar2).booleanValue();
            if (this.f249063f && booleanValue && (iListener = (IListener) this.f249064g.f27484d) != null) {
                iListener.dead();
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$listenAudioEvent$1");
        return false;
    }
}
