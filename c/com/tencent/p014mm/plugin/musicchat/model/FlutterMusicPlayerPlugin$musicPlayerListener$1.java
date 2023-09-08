package com.tencent.p014mm.plugin.musicchat.model;

import bb2.C92213d;
import bb2.C92214e;
import bb2.C92215f;
import bb2.C92216g;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.FlutterMusicPlayerApi;
import gy3.C87412m;
import kotlin.Metadata;
import qc0.C101106m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/musicchat/model/FlutterMusicPlayerPlugin$musicPlayerListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-music-chat_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$musicPlayerListener$1 */
public final class FlutterMusicPlayerPlugin$musicPlayerListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ FlutterMusicPlayerPlugin f272339d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlutterMusicPlayerPlugin$musicPlayerListener$1(FlutterMusicPlayerPlugin flutterMusicPlayerPlugin, C40008f fVar) {
        super(fVar);
        this.f272339d = flutterMusicPlayerPlugin;
    }

    public boolean callback(IEvent iEvent) {
        FlutterMusicPlayerApi.MusicCallbackApi musicCallbackApi;
        FlutterMusicPlayerApi.MusicCallbackApi musicCallbackApi2;
        FlutterMusicPlayerApi.MusicCallbackApi musicCallbackApi3;
        FlutterMusicPlayerApi.MusicCallbackApi musicCallbackApi4;
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        if (aVar == null) {
            return false;
        }
        FlutterMusicPlayerPlugin flutterMusicPlayerPlugin = this.f272339d;
        String str = flutterMusicPlayerPlugin.f272332d;
        Log.m105924i(str, "callback: player " + aVar.f9337a);
        int i = aVar.f9337a;
        FlutterMusicPlayerApi.FlutterMusicInfo flutterMusicInfo = null;
        if (i == 0) {
            C101106m mVar = aVar.f9338b;
            if (mVar != null) {
                flutterMusicInfo = flutterMusicPlayerPlugin.mo129595l(mVar);
            }
            if (flutterMusicInfo == null || (musicCallbackApi = flutterMusicPlayerPlugin.f272333e) == null) {
                return false;
            }
            musicCallbackApi.onStartPlay(flutterMusicInfo, C92215f.f263936a);
            return false;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C101106m mVar2 = aVar.f9338b;
                    if (mVar2 != null) {
                        flutterMusicInfo = flutterMusicPlayerPlugin.mo129595l(mVar2);
                    }
                    if (flutterMusicInfo == null || (musicCallbackApi4 = flutterMusicPlayerPlugin.f272333e) == null) {
                        return false;
                    }
                    musicCallbackApi4.onPausePlay(flutterMusicInfo, C92213d.f263934a);
                    return false;
                } else if (i != 7) {
                    return false;
                }
            }
            C101106m mVar3 = aVar.f9338b;
            if (mVar3 != null) {
                flutterMusicInfo = flutterMusicPlayerPlugin.mo129595l(mVar3);
            }
            if (flutterMusicInfo == null || (musicCallbackApi3 = flutterMusicPlayerPlugin.f272333e) == null) {
                return false;
            }
            musicCallbackApi3.onStopPlay(flutterMusicInfo, C92216g.f263937a);
            return false;
        } else {
            C101106m mVar4 = aVar.f9338b;
            if (mVar4 != null) {
                flutterMusicInfo = flutterMusicPlayerPlugin.mo129595l(mVar4);
            }
            if (flutterMusicInfo == null || (musicCallbackApi2 = flutterMusicPlayerPlugin.f272333e) == null) {
                return false;
            }
            musicCallbackApi2.onResumePlay(flutterMusicInfo, C92214e.f263935a);
            return false;
        }
    }
}
