package la2;

import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import di3.C86312j;
import eb0.C31467g2;
import java.util.List;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C12155j;
import ua2.C101991b;

/* renamed from: la2.h */
public class C99359h extends IStaticListener<MusicActionEvent> {
    public boolean callback(IEvent iEvent) {
        C12155j a;
        MusicActionEvent musicActionEvent = (MusicActionEvent) iEvent;
        if (((C31467g2) C86312j.m106911c(C31467g2.class)).Uv0()) {
            if (!(C99364n.f291354g != null)) {
                Log.m105920e("MicroMsg.Music.MusicActionListener", "don't anything, must init MusicPlayerManager first with MusicLogic before!");
            } else {
                int i = musicActionEvent.f264920d.f264922a;
                if (i == 13) {
                    C99357e eVar = (C99357e) C101991b.m134284b(C99357e.class);
                    if (eVar != null) {
                        eVar.mo138807z(musicActionEvent.f264920d.f264929h);
                    }
                } else if (i != 16) {
                    switch (i) {
                        case -3:
                            musicActionEvent.f264921e.f264931b = C99364n.m129616h().mo138822a().mo32206f();
                            break;
                        case -2:
                            musicActionEvent.f264921e.f264930a = C99364n.m129616h().mo138832k();
                            break;
                        case -1:
                            C99364n.m129616h().mo138835p();
                            break;
                        case 0:
                            C99364n.m129616h().mo138834o(musicActionEvent.f264920d.f264923b);
                            break;
                        case 1:
                            C99364n.m129616h().mo138822a().mo32204b();
                            break;
                        case 2:
                            C99364n.m129616h().mo138822a().resume();
                            break;
                        case 3:
                            C99364n.m129616h().f291355e.mo138778Q(musicActionEvent.f264920d.f264923b);
                            break;
                        case 4:
                            C99364n h = C99364n.m129616h();
                            MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
                            List list = aVar.f264924c;
                            int i2 = aVar.f264925d;
                            h.getClass();
                            Log.m105924i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusicList");
                            C101106m k = h.mo138832k();
                            C101106m F = h.f291355e.mo138772F(list, i2);
                            if (k != null && F != null && Util.isEqual(k.f295960e, F.f295960e) && (a = C101093a.m132479a()) != null && AssetExtension.SCENE_PLAY.equals(a.f35264e)) {
                                h.mo138837r(F);
                                break;
                            } else {
                                h.mo138830i(F);
                                break;
                            }
                        case 5:
                            C99364n h2 = C99364n.m129616h();
                            MusicActionEvent.C92531a aVar2 = musicActionEvent.f264920d;
                            h2.f291355e.mo138773J(aVar2.f264924c, aVar2.f264926e);
                            break;
                        case 6:
                            C99364n h3 = C99364n.m129616h();
                            C101106m mVar = musicActionEvent.f264920d.f264923b;
                            h3.getClass();
                            if (mVar != null) {
                                Log.m105924i("MicroMsg.Music.MusicPlayerManager", "startMusicInList");
                                h3.mo138830i(h3.f291355e.mo138768A(mVar));
                                break;
                            } else {
                                Log.m105924i("MicroMsg.Music.MusicPlayerManager", "musicWrapper is null");
                                break;
                            }
                        case 7:
                            musicActionEvent.f264921e.f264931b = C99364n.m129616h().mo138822a().mo32203a(musicActionEvent.f264920d.f264927f);
                            break;
                        case 8:
                            musicActionEvent.f264921e.f264933d = C99364n.m129616h().mo138822a().mo32193d();
                            break;
                        case 9:
                            musicActionEvent.f264921e.f264931b = C99364n.m129616h().mo138822a().mo32211k();
                            break;
                        case 10:
                            musicActionEvent.f264921e.f264931b = C99364n.m129616h().mo138822a().mo32194e();
                            break;
                        case 11:
                            C99364n.m129616h().mo138836q(600000);
                            break;
                    }
                } else {
                    C99364n.m129616h().mo138837r(musicActionEvent.f264920d.f264923b);
                }
            }
        }
        return false;
    }
}
