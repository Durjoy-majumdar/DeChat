package vo1;

import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57952m;
import nc3.C34767b;

/* renamed from: vo1.g */
public final class C65794g {

    /* renamed from: a */
    public C34767b.C34768c f189236a;

    /* renamed from: a */
    public final void mo89839a(String str) {
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        Log.m105924i("FinderLiveReplayAudioManager", str + " AudioFocus gain!");
        C57952m mVar = C65770a0.f189184r.mo89819a().f189201o;
        if (mVar != null && (finderLiveThumbPlayerProxy = mVar.f165852a) != null) {
            finderLiveThumbPlayerProxy.setMute(false);
        }
    }

    /* renamed from: b */
    public final void mo89840b(String str) {
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        Log.m105924i("FinderLiveReplayAudioManager", str + " AudioFocus lossTransient!");
        C57952m mVar = C65770a0.f189184r.mo89819a().f189201o;
        if (mVar != null && (finderLiveThumbPlayerProxy = mVar.f165852a) != null) {
            finderLiveThumbPlayerProxy.setMute(true);
        }
    }
}
