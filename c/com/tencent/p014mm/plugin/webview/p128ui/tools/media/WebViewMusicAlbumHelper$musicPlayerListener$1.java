package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import qc0.C101093a;
import qc0.C101106m;
import te3.a35;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/webview/ui/tools/media/WebViewMusicAlbumHelper$musicPlayerListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.WebViewMusicAlbumHelper$musicPlayerListener$1 */
public final class WebViewMusicAlbumHelper$musicPlayerListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ C6360x f23273d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewMusicAlbumHelper$musicPlayerListener$1(C6360x xVar, C40008f fVar) {
        super(fVar);
        this.f23273d = xVar;
    }

    public boolean callback(IEvent iEvent) {
        int i;
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        C87412m.m108594g(musicPlayerEvent, "event");
        C6360x xVar = this.f23273d;
        synchronized (xVar) {
            C101106m mVar = musicPlayerEvent.f9336d.f9338b;
            if (mVar == null) {
                mVar = C101093a.m132480b();
            }
            if (mVar != null) {
                if (Util.isNullOrNil(xVar.f23285i)) {
                    String str = mVar.f295960e;
                    C87412m.m108593f(str, "musicWrapper.MusicId");
                    xVar.f23285i = str;
                    xVar.f23284h = String.valueOf(System.currentTimeMillis());
                }
                Log.m105918d("MicroMsg.MusicAlbumHelper", "doWebViewReport musicId = " + xVar.f23285i + ", playId=" + xVar.f23284h + ", playActionSource=" + xVar.f23283g + "，action=" + musicPlayerEvent.f9336d.f9337a);
                int i2 = musicPlayerEvent.f9336d.f9337a;
                if (i2 != 2) {
                    if (i2 == 3) {
                        xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 4);
                    } else if (i2 == 4) {
                        xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 9);
                    } else if (i2 == 7) {
                        xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 7);
                    } else if (i2 != 10) {
                        switch (i2) {
                            case 15:
                                xVar.f23283g = 2;
                                break;
                            case 16:
                            case 17:
                                xVar.f23283g = 3;
                                break;
                            case 18:
                                break;
                            default:
                                if (!Util.isEqual(xVar.f23285i, mVar.f295960e)) {
                                    String str2 = mVar.f295960e;
                                    C87412m.m108593f(str2, "musicWrapper.MusicId");
                                    xVar.f23285i = str2;
                                    xVar.f23284h = String.valueOf(System.currentTimeMillis());
                                    Log.m105918d("MicroMsg.MusicAlbumHelper", "doWebViewReport new music musicId = " + xVar.f23285i + ", playId=" + xVar.f23284h);
                                }
                                int i3 = musicPlayerEvent.f9336d.f9337a;
                                if (i3 == 0 || i3 == 1) {
                                    xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 3);
                                } else if (i3 == 8) {
                                    xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 6);
                                } else if (i3 == 9) {
                                    xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 1);
                                } else if (i3 == 11) {
                                    xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 2);
                                } else if (i3 == 12) {
                                    xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 5);
                                }
                                break;
                        }
                    } else {
                        xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 100);
                    }
                }
                xVar.mo7352b(xVar.mo7355e(xVar.f23285i), 8);
            }
        }
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        int i4 = aVar.f9337a;
        if (!(i4 == 0 || i4 == 1)) {
            if (i4 == 2 || i4 == 3 || i4 == 4) {
                if (this.f23273d.f23282f.stopped()) {
                    return false;
                }
                C6360x xVar2 = this.f23273d;
                xVar2.getClass();
                Log.m105918d("MicroMsg.MusicAlbumHelper", "stop timer");
                xVar2.f23282f.stopTimer();
                return false;
            } else if (i4 == 7) {
                a35 e = this.f23273d.mo7355e(aVar.f9339c);
                if (e == null) {
                    return false;
                }
                C6360x xVar3 = this.f23273d;
                if (e.f130281e <= -1 || (i = e.f130280d) <= 0) {
                    return false;
                }
                e.f130281e = i;
                xVar3.mo7359i(musicPlayerEvent.f9336d.f9339c, e);
                return false;
            } else if (!(i4 == 8 || i4 == 13 || i4 == 14)) {
                return false;
            }
        }
        C101106m b = C101093a.m132480b();
        if (b == null) {
            return false;
        }
        C6360x xVar4 = this.f23273d;
        if (Util.isNullOrNil(b.f295960e)) {
            return false;
        }
        a35 e2 = xVar4.mo7355e(b.f295960e);
        if ((e2 != null ? e2.f130281e : -1) <= -1) {
            return false;
        }
        xVar4.mo7357g();
        if (!xVar4.f23282f.stopped()) {
            return false;
        }
        Log.m105918d("MicroMsg.MusicAlbumHelper", "start timer");
        if (!xVar4.f23282f.stopped()) {
            Log.m105918d("MicroMsg.MusicAlbumHelper", "stop timer");
            xVar4.f23282f.stopTimer();
        }
        xVar4.f23282f.startTimer(3000);
        return false;
    }
}
