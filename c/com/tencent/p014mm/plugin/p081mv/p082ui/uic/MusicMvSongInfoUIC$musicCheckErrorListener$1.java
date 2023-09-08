package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C76879j;
import sb2.C13650z0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$musicCheckErrorListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicCheckErrorEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$musicCheckErrorListener$1 */
public final class MusicMvSongInfoUIC$musicCheckErrorListener$1 extends IListener<MusicCheckErrorEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f20047d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvSongInfoUIC f20048e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvSongInfoUIC$musicCheckErrorListener$1(AppCompatActivity appCompatActivity, MusicMvSongInfoUIC musicMvSongInfoUIC, C40008f fVar) {
        super(fVar);
        this.f20047d = appCompatActivity;
        this.f20048e = musicMvSongInfoUIC;
    }

    public boolean callback(IEvent iEvent) {
        MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
        C87412m.m108594g(musicCheckErrorEvent, "event");
        Log.m105924i("MicroMsg.Mv.MusicMvSongInfoUIC", "musicCheckErrorListener check error");
        AppCompatActivity appCompatActivity = this.f20047d;
        MusicMvSongInfoUIC musicMvSongInfoUIC = this.f20048e;
        MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
        if (aVar.f154843a == 0) {
            Log.m105920e("MicroMsg.Mv.MusicMvSongInfoUIC", "musicCheckErrorListener, must has error.");
            return false;
        }
        String string = !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : appCompatActivity.getString(C0966R.string.f361077h32);
        C87412m.m108593f(string, "errMsg");
        musicMvSongInfoUIC.f163373f = C76879j.m92754y(musicMvSongInfoUIC.getContext(), string, "", musicMvSongInfoUIC.getContext().getString(C0966R.string.f8028zq), new C13650z0(musicMvSongInfoUIC));
        return true;
    }
}
