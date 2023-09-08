package com.tencent.p014mm.plugin.websearch.p898ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsImageDownloadedEvent;", "ui-websearch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1 */
public final class WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1 extends IListener<SnsImageDownloadedEvent> {

    /* renamed from: d */
    public final /* synthetic */ WebSearchSnsImageLoadingUI f282887d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1(WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI, C40008f fVar) {
        super(fVar);
        this.f282887d = webSearchSnsImageLoadingUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r8) {
        /*
            r7 = this;
            com.tencent.mm.autogen.events.SnsImageDownloadedEvent r8 = (com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent) r8
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r0 = r7.f282887d
            com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r1 = r8.f9515d
            int r2 = r1.f9516a
            r3 = 0
            r4 = 5
            r5 = 1
            r6 = 0
            if (r2 != r4) goto L_0x0025
            java.lang.String r1 = r1.f9518c
            te3.kv2 r0 = r0.f282871o
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.f298689d
            goto L_0x001d
        L_0x001c:
            r0 = r3
        L_0x001d:
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            if (r0 == 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r8 = r3
        L_0x002a:
            if (r8 == 0) goto L_0x0058
            com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r0 = r7.f282887d
            java.lang.String r1 = r0.f282863d
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "[image-flow]"
            r2[r6] = r3
            com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r8 = r8.f9515d
            java.lang.String r8 = r8.f9518c
            r2[r5] = r8
            java.lang.String r8 = "[%s][media:%s]snsImageDownloadListener invoke "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r2)
            java.lang.String r8 = r0.f282872p
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 == 0) goto L_0x0050
            java.lang.String r8 = r0.f282872p
            r0.mo134710I7(r8)
            goto L_0x0058
        L_0x0050:
            com.tencent.mm.plugin.websearch.ui.a r8 = new com.tencent.mm.plugin.websearch.ui.a
            r8.<init>(r0)
            o40.C61926c.m72668M(r8)
        L_0x0058:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.p898ui.WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
