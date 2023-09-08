package p541gv;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import la2.C61261g;
import la2.C61263p;
import la2.C99355b;
import la2.C99361k;
import la2.C99364n;
import la2.C99365q;
import ma2.C99814o0;
import na2.C61637c;
import na2.C61638d;
import oa2.C100320a;
import oa2.C47347b;
import oa2.C47348c;
import oa2.C61984d;
import ob0.C117747y;
import ob0.C35142u;
import ra2.C101365a;
import sf0.C48374j0;
import te3.C101798ju;
import te3.C51499u62;
import te3.C64871z13;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: gv.n */
public class C59704n implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C61261g.C61262a aVar;
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        C99355b m = C99364n.m129618m();
        if (m instanceof C99365q) {
            C99365q qVar = (C99365q) m;
            qVar.getClass();
            if (yVar2 instanceof C100320a) {
                Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd errCode:%d", Integer.valueOf(i2));
                if (i3 == 4 && i4 == -24) {
                    C101798ju juVar = ((C100320a) yVar2).f293897f;
                    if (qVar.mo138809U() != null && juVar.f298562d.equals(qVar.mo138809U().field_musicId)) {
                        ((C99364n) qVar.mo138838C0()).mo138835p();
                    }
                    C99814o0.wx0().mo140856qq(juVar.f298562d, true);
                    Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd music is block %s", qVar.mo138809U().field_musicId);
                    MusicCheckErrorEvent musicCheckErrorEvent = new MusicCheckErrorEvent();
                    MusicCheckErrorEvent.C55147a aVar2 = musicCheckErrorEvent.f154842d;
                    aVar2.f154843a = i4;
                    aVar2.f154844b = str;
                    musicCheckErrorEvent.publish();
                } else if (i3 == 0 && i4 == 0) {
                    C99814o0.wx0().mo140856qq(((C100320a) yVar2).f293897f.f298562d, false);
                }
            } else if (yVar2 instanceof C47347b) {
                if (i3 == 0 && i4 == 0) {
                    C47347b bVar = (C47347b) yVar2;
                    C51499u62 u622 = bVar.f127047f;
                    String str2 = bVar.f127048g.field_musicId;
                    if (u622 != null && str2 != null) {
                        Iterator it = ((ArrayList) qVar.f291359e).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            if (str3.equals(str2)) {
                                String f = C48374j0.m53717f(u622.f142618e);
                                String f2 = C48374j0.m53717f(u622.f142619f);
                                String f3 = C48374j0.m53717f(u622.f142617d);
                                C119179t tVar = C119157j.f356862d;
                                C61263p pVar = r5;
                                C61263p pVar2 = new C61263p(qVar, str3, f, f2, f3, bVar);
                                ((C119157j) tVar).mo183875f(pVar);
                                Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "get response %s %s %s", f, f2, f3);
                                if (!Util.isNullOrNil(f2)) {
                                    MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
                                    MusicPlayerEvent.C1094a aVar3 = musicPlayerEvent.f9336d;
                                    aVar3.f9337a = 6;
                                    aVar3.f9339c = bVar.f127048g.field_musicId;
                                    musicPlayerEvent.asyncPublish(Looper.getMainLooper());
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            } else if (yVar2 instanceof C47348c) {
                Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "GetShakeMusicUrl onSceneEnd errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
                C47348c cVar = (C47348c) yVar2;
                Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "getShakeMusicUrlScene callback, playUrl:%s, tempPlayUrl:%s", cVar.f127054g, cVar.f127053f);
                if (i3 == 0 && i4 == 0) {
                    String str4 = cVar.f127054g;
                    String str5 = cVar.f127053f;
                    LruCache<String, String> lruCache = C61638d.f175282a;
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                        C61638d.f175282a.put(str4, str5);
                        C61638d.f175283b.put(str4, Long.valueOf(System.currentTimeMillis()));
                    }
                } else {
                    C115669n.INSTANCE.idkeyStat(558, 214, 1, true);
                }
                C101365a U = qVar.mo138809U();
                if (U != null && !TextUtils.isEmpty(U.f296937C1) && U.f296937C1.equalsIgnoreCase(cVar.f127054g)) {
                    Log.m105924i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is same, start to play shake music");
                    ((C99361k) qVar.mo138838C0()).mo138826e(U.mo140850m2());
                } else if (U != null) {
                    Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is diff, don't play, current playUrl is %s, netscene playUrl is %s", U.f296937C1, cVar.f127054g);
                }
            } else if (yVar2 instanceof C61984d) {
                Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "MusicLiveGetLink onSceneEnd errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
                C61984d dVar = (C61984d) yVar2;
                if (i3 == 0 && i4 == 0) {
                    C61637c.f175276a.mo86584a(dVar.mo86871j1());
                } else {
                    C115669n.INSTANCE.idkeyStat(558, 221, 1, true);
                }
                C101365a U2 = qVar.mo138809U();
                C61637c cVar2 = C61637c.f175276a;
                String str6 = U2.field_mid;
                String str7 = str6 == null ? null : C61637c.f175277b.get(str6);
                if (str7 == null) {
                    Log.m105920e("MicroMsg.Music.MusicWechatPrivateLogic", "why cacheUrl is null after get new url.");
                }
                String str8 = U2.f296937C1;
                String str9 = str7 != null ? str7 : str8;
                Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "change music url: old Url:%s, new url:%s", str8, str9);
                U2.f296937C1 = str9;
                if (dVar.mo86871j1() != null && dVar.mo86871j1().size() > 0) {
                    C64871z13 z132 = dVar.mo86871j1().get(0);
                    if (z132 != null) {
                        String str10 = z132.f186624j;
                        if (!(str10 == null || str10.length() <= 0 || (aVar = qVar.f291363i) == null)) {
                            aVar.mo86254a(z132.f186624j);
                        }
                    } else {
                        return;
                    }
                }
                ((C99361k) qVar.mo138838C0()).mo138826e(U2.mo140850m2());
                if (Util.isNullOrNil(str9) || !str9.equals(str8)) {
                    Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is diff, don't play, current playUrl is %s, netscene playUrl is %s", U2.f296937C1, str7);
                } else {
                    Log.m105925i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is same, url:%s", U2.f296937C1);
                }
            }
        }
    }
}
