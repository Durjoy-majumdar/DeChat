package com.tencent.p014mm.p136ui.chatting.gallery.query;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/ui/chatting/gallery/query/ScanTransImage$scanTranslationResultEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.gallery.query.ScanTransImage$scanTranslationResultEventListener$1 */
public final class ScanTransImage$scanTranslationResultEventListener$1 extends IListener<ScanTranslationResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ ScanTransImage f284961d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanTransImage$scanTranslationResultEventListener$1(ScanTransImage scanTransImage, C40008f fVar) {
        super(fVar);
        this.f284961d = scanTransImage;
    }

    public boolean callback(IEvent iEvent) {
        ScanTranslationResultEvent scanTranslationResultEvent = (ScanTranslationResultEvent) iEvent;
        C87412m.m108594g(scanTranslationResultEvent, "event");
        Log.m105925i("MicroMsg.ScanTransImageUtil", "scanTranslationResult %d, %s", Integer.valueOf(scanTranslationResultEvent.f265089d.f265090a), Boolean.valueOf(scanTranslationResultEvent.f265089d.f265092c));
        MMHandlerThread.postToMainThread(new C97119a(this.f284961d, scanTranslationResultEvent));
        return true;
    }
}
