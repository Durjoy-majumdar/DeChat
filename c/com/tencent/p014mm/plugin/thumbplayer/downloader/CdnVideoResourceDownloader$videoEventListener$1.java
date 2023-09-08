package com.tencent.p014mm.plugin.thumbplayer.downloader;

import a14.C53916l;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f03.C97787h;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import l03.C99276a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/thumbplayer/downloader/CdnVideoResourceDownloader$videoEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/OnlineVideoEvent;", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$videoEventListener$1 */
public final class CdnVideoResourceDownloader$videoEventListener$1 extends IListener<OnlineVideoEvent> {

    /* renamed from: d */
    public final /* synthetic */ CdnVideoResourceDownloader f282466d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CdnVideoResourceDownloader$videoEventListener$1(CdnVideoResourceDownloader cdnVideoResourceDownloader, C40008f fVar) {
        super(fVar);
        this.f282466d = cdnVideoResourceDownloader;
    }

    public boolean callback(IEvent iEvent) {
        OnlineVideoEvent onlineVideoEvent = (OnlineVideoEvent) iEvent;
        C87412m.m108594g(onlineVideoEvent, "event");
        String str = this.f282466d.f282437b;
        Log.m105924i(str, "onEvent: opcode=" + onlineVideoEvent.f264965d.f264966a + ", mediaId=" + onlineVideoEvent.f264965d.f264968c + ", length=" + onlineVideoEvent.f264965d.f264970e);
        String str2 = onlineVideoEvent.f264965d.f264968c;
        if (str2 != null && C87412m.m108589b(str2, this.f282466d.getMediaId())) {
            OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
            int i = aVar.f264967b;
            if (i == 0 || i == -21006) {
                switch (aVar.f264966a) {
                    case 1:
                        CdnLogic.VideoInfo videoInfo = new CdnLogic.VideoInfo();
                        OnlineVideoEvent.C92538a aVar2 = onlineVideoEvent.f264965d;
                        videoInfo.svrFlag = aVar2.f264973h;
                        videoInfo.oriVideoFormat = aVar2.f264975j;
                        videoInfo.videoFormat = aVar2.f264974i;
                        videoInfo.videoPath = aVar2.f264977l;
                        videoInfo.requestFlag = aVar2.f264976k;
                        this.f282466d.mo134542o((long) aVar2.f264969d, (long) aVar2.f264970e, videoInfo);
                        break;
                    case 2:
                        CdnVideoResourceDownloader cdnVideoResourceDownloader = this.f282466d;
                        long j = (long) aVar.f264969d;
                        long j2 = (long) aVar.f264970e;
                        cdnVideoResourceDownloader.getClass();
                        try {
                            cdnVideoResourceDownloader.f282448m = ((long) cdnVideoResourceDownloader.f282444i.mo89448c((int) j, (int) j2)) * 1000;
                        } catch (Exception e) {
                            String str3 = cdnVideoResourceDownloader.f282437b;
                            Log.m105928w(str3, "Unable to parse video time: " + e.getMessage());
                        }
                        String str4 = cdnVideoResourceDownloader.f282437b;
                        Log.m105924i(str4, "onDataAvailable: offset=" + j + ", length=" + j2 + ", videoTime=" + cdnVideoResourceDownloader.f282448m + ", mediaId=" + cdnVideoResourceDownloader.getMediaId());
                        cdnVideoResourceDownloader.f282451p.set(false);
                        C97787h.C97791d dVar = cdnVideoResourceDownloader.f282445j;
                        if (dVar != null) {
                            dVar.mo135907d(cdnVideoResourceDownloader.f282436a.mo126309g(), j, j2);
                            break;
                        }
                        break;
                    case 3:
                        this.f282466d.f282453r = Long.valueOf((long) (aVar.f264969d + aVar.f264970e));
                        String str5 = this.f282466d.f282437b;
                        Log.m105924i(str5, "cdn download to end, cdn length = " + this.f282466d.f282453r);
                        Log.m105926v(this.f282466d.f282437b, "OnlineVideoEvent.DOWNLOAD_TO_END");
                        this.f282466d.f282451p.set(false);
                        break;
                    case 4:
                        long l = C86013q1.m106451l(this.f282466d.mo134538j());
                        if (l <= 0) {
                            l = (long) onlineVideoEvent.f264965d.f264970e;
                        }
                        String str6 = this.f282466d.f282437b;
                        Log.m105924i(str6, "download finish, xml length = " + this.f282466d.f282436a.getLength() + ", actual size = " + l);
                        CdnVideoResourceDownloader.m123813l(this.f282466d, onlineVideoEvent.f264965d.f264967b, l);
                        break;
                    case 5:
                        this.f282466d.mo134543p((long) aVar.f264969d, (long) aVar.f264970e);
                        break;
                    case 6:
                        CdnVideoResourceDownloader cdnVideoResourceDownloader2 = this.f282466d;
                        String str7 = cdnVideoResourceDownloader2.f282437b;
                        Log.m105924i(str7, "onDuplicateFileFound, mediaId=" + cdnVideoResourceDownloader2.getMediaId());
                        C53916l<? super CdnLogic.VideoInfo> lVar = cdnVideoResourceDownloader2.f282438c;
                        if (lVar != null) {
                            lVar.resumeWith(Result.m168114constructorimpl((Object) null));
                        }
                        cdnVideoResourceDownloader2.f282438c = null;
                        C53916l<? super Boolean> lVar2 = cdnVideoResourceDownloader2.f282439d;
                        if (lVar2 != null) {
                            Result.Companion companion = Result.Companion;
                            lVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                        }
                        cdnVideoResourceDownloader2.f282439d = null;
                        cdnVideoResourceDownloader2.f282436a.mo126303a();
                        Iterator<C99276a> it = cdnVideoResourceDownloader2.f282452q.iterator();
                        while (it.hasNext()) {
                            it.next().mo135884g();
                        }
                        C97787h.C97791d dVar2 = cdnVideoResourceDownloader2.f282445j;
                        if (dVar2 != null) {
                            dVar2.mo135908e(cdnVideoResourceDownloader2.f282436a.mo126309g(), 0);
                            break;
                        }
                        break;
                    case 7:
                        Iterator<C99276a> it4 = this.f282466d.f282452q.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo135883c(onlineVideoEvent.f264965d.f264971f);
                        }
                        CdnVideoResourceDownloader cdnVideoResourceDownloader3 = this.f282466d;
                        C97787h.C97791d dVar3 = cdnVideoResourceDownloader3.f282445j;
                        if (dVar3 != null) {
                            dVar3.mo135906c(cdnVideoResourceDownloader3.f282436a.mo126309g());
                            break;
                        }
                        break;
                    default:
                        String str8 = this.f282466d.f282437b;
                        Log.m105928w(str8, "unknown event opcode " + onlineVideoEvent.f264965d.f264966a + ", mediaId=" + this.f282466d.getMediaId());
                        break;
                }
            } else {
                String str9 = this.f282466d.f282437b;
                Log.m105928w(str9, "stream download online video error. retCode: " + onlineVideoEvent.f264965d.f264967b + ", mediaId=" + this.f282466d.getMediaId());
                CdnVideoResourceDownloader cdnVideoResourceDownloader4 = this.f282466d;
                OnlineVideoEvent.C92538a aVar3 = onlineVideoEvent.f264965d;
                CdnVideoResourceDownloader.m123813l(cdnVideoResourceDownloader4, aVar3.f264967b, (long) aVar3.f264970e);
            }
        }
        return false;
    }
}
