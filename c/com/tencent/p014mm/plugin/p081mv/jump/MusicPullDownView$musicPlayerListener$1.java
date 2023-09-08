package com.tencent.p014mm.plugin.p081mv.jump;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import qc0.C101093a;
import qc0.C101106m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/jump/MusicPullDownView$musicPlayerListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.jump.MusicPullDownView$musicPlayerListener$1 */
public final class MusicPullDownView$musicPlayerListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ MusicPullDownView f163004d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicPullDownView$musicPlayerListener$1(MusicPullDownView musicPullDownView, C40008f fVar) {
        super(fVar);
        this.f163004d = musicPullDownView;
    }

    public boolean callback(IEvent iEvent) {
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        MusicPullDownView musicPullDownView = this.f163004d;
        int i = musicPlayerEvent.f9336d.f9337a;
        if (i == 0) {
            if (musicPullDownView.mo80345j()) {
                Log.m105924i(musicPullDownView.mo80346k(), "onPostOpen, checkMutePlay");
                C101106m b = C101093a.m132480b();
                if (b != null) {
                    Log.m105924i(musicPullDownView.mo80346k(), "can get MusicWrapper");
                    b.f295951L = 0.0f;
                    C101093a.m132491m(b);
                }
            }
            if (musicPullDownView.f162998r != 0) {
                Log.m105924i(musicPullDownView.mo80346k(), "ON_START lastStatus " + musicPullDownView.f162998r);
                C101093a.m132487i(musicPullDownView.f162998r);
                musicPullDownView.f162998r = 0;
            }
            if (musicPullDownView.f162997q != 0) {
                Log.m105924i(musicPullDownView.mo80346k(), "ON_START last " + musicPullDownView.f162997q);
                C101093a.m132487i(musicPullDownView.f162997q);
                musicPullDownView.f162997q = 0;
            }
        } else if (i == 7 && musicPullDownView.f163001u) {
            musicPullDownView.f163002v++;
        }
        musicPullDownView.getClass();
        return false;
    }
}
