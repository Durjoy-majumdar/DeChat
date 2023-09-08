package com.tencent.p014mm.plugin.websearch.webview;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/websearch/webview/WebSearchImageData$ftsEmojiDownloadedListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FTSEmojiDownloadedEvent;", "ui-websearch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.websearch.webview.WebSearchImageData$ftsEmojiDownloadedListener$1 */
public final class WebSearchImageData$ftsEmojiDownloadedListener$1 extends IListener<FTSEmojiDownloadedEvent> {

    /* renamed from: d */
    public final /* synthetic */ WebSearchImageData<T> f22021d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSearchImageData$ftsEmojiDownloadedListener$1(WebSearchImageData<T> webSearchImageData, C40008f fVar) {
        super(fVar);
        this.f22021d = webSearchImageData;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|14|15|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0078 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
        /*
            r9 = this;
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent r10 = (com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent) r10
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r10, r0)
            com.tencent.mm.plugin.websearch.webview.WebSearchImageData<T> r0 = r9.f22021d
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r1 = r10.f9141d
            int r2 = r1.f9143a
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L_0x00a5
            java.lang.String r2 = r0.f22017e
            java.lang.String r3 = "emoji download callback %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = r1.f9149g
            r5[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r1 = r0.f22018f
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r2 = r10.f9141d
            java.lang.String r2 = r2.f9149g
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x00a5
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r1 = r0.f22018f
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r2 = r0.f22018f     // Catch:{ all -> 0x00a2 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r3 = r10.f9141d     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = r3.f9149g     // Catch:{ all -> 0x00a2 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00a2 }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x00a2 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x00a2 }
            r3.<init>()     // Catch:{ all -> 0x00a2 }
            gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x00a2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a2 }
        L_0x0046:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00a2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r6.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = "weixin://fts/emoji?path="
            r6.append(r7)     // Catch:{ all -> 0x00a2 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$b r7 = r10.f9142e     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = r7.f9151a     // Catch:{ all -> 0x00a2 }
            r6.append(r7)     // Catch:{ all -> 0x00a2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00a2 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00a2 }
            r7.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r8 = "id"
            r7.put(r8, r5)     // Catch:{ JSONException -> 0x0078 }
            java.lang.String r5 = "src"
            r7.put(r5, r6)     // Catch:{ JSONException -> 0x0078 }
        L_0x0078:
            r3.put(r7)     // Catch:{ all -> 0x00a2 }
            goto L_0x0046
        L_0x007c:
            g83.d r2 = r0.mo6889b()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x0094
            g83.j r2 = r2.mo9284g()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x0094
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = "returnArray.toString()"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ all -> 0x00a2 }
            r2.mo84511k(r4, r3)     // Catch:{ all -> 0x00a2 }
        L_0x0094:
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r0.f22018f     // Catch:{ all -> 0x00a2 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r10 = r10.f9141d     // Catch:{ all -> 0x00a2 }
            java.lang.String r10 = r10.f9149g     // Catch:{ all -> 0x00a2 }
            java.lang.Object r10 = r0.remove(r10)     // Catch:{ all -> 0x00a2 }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ all -> 0x00a2 }
            monitor-exit(r1)
            goto L_0x00a5
        L_0x00a2:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        L_0x00a5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData$ftsEmojiDownloadedListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
