package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hb2.C59822f;
import kotlin.Metadata;
import m03.C61426c;
import nb2.C61646d;
import sb2.C63756e;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$musicPlayerListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$musicPlayerListener$1 */
public final class MusicMvSongInfoUIC$musicPlayerListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f163394d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvSongInfoUIC f163395e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvSongInfoUIC$musicPlayerListener$1(AppCompatActivity appCompatActivity, MusicMvSongInfoUIC musicMvSongInfoUIC, C40008f fVar) {
        super(fVar);
        this.f163394d = appCompatActivity;
        this.f163395e = musicMvSongInfoUIC;
    }

    public boolean callback(IEvent iEvent) {
        C59822f fVar;
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        Class cls = MusicMvMainUIC.class;
        C87412m.m108594g(musicPlayerEvent, "event");
        AppCompatActivity appCompatActivity = this.f163394d;
        MusicMvSongInfoUIC musicMvSongInfoUIC = this.f163395e;
        Log.m105924i("MicroMsg.Mv.MusicMvSongInfoUIC", "MusicPlayerEvent, action:" + musicPlayerEvent.f9336d.f9337a);
        C39818r rVar = C39818r.f106831a;
        if (!((C63756e) rVar.mo62444c(appCompatActivity).mo75002a(C63756e.class)).mo88572f3(musicPlayerEvent.f9336d.f9338b)) {
            return false;
        }
        int i = musicPlayerEvent.f9336d.f9337a;
        if (i == 0) {
            C61426c cVar = ((MusicMvMainUIC) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f163276p;
            if (cVar == null) {
                return false;
            }
            cVar.start();
            return false;
        } else if (i == 1) {
            C61426c cVar2 = ((MusicMvMainUIC) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f163276p;
            if (cVar2 != null) {
                cVar2.resume();
            }
            musicMvSongInfoUIC.mo80489e3();
            musicMvSongInfoUIC.mo80490f3();
            musicMvSongInfoUIC.mo80492i3();
            return false;
        } else if (i == 2 || i == 3 || i == 4) {
            C61426c cVar3 = ((MusicMvMainUIC) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f163276p;
            if (cVar3 != null) {
                cVar3.pause();
            }
            MusicMvMainUIC musicMvMainUIC = (MusicMvMainUIC) rVar.mo62444c(appCompatActivity).mo75002a(cls);
            C61646d dVar = (C61646d) C110818d0.m150917O(musicMvMainUIC.f163270g, musicMvMainUIC.f163275o);
            if (!(dVar == null || (fVar = dVar.f175298d) == null)) {
                fVar.f170776x++;
            }
            musicMvSongInfoUIC.mo80493j3();
            musicMvSongInfoUIC.mo80494k3();
            musicMvSongInfoUIC.mo80488d3();
            return false;
        } else if (i != 7) {
            return false;
        } else {
            MusicMvSongInfoUIC.m65757c3(musicMvSongInfoUIC, musicMvSongInfoUIC.f163375h);
            return false;
        }
    }
}
