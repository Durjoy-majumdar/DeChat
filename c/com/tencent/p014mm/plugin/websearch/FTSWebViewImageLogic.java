package com.tencent.p014mm.plugin.websearch;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent;
import com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86312j;
import java.util.HashMap;
import java.util.HashSet;
import p196ln.C76706g;
import u73.C14131l;

/* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewImageLogic */
public class FTSWebViewImageLogic implements MStorage.IOnStorageChange, C14131l {

    /* renamed from: d */
    public volatile HashMap<String, HashSet<String>> f21965d = new HashMap<>();

    /* renamed from: e */
    public volatile HashMap<String, HashSet<String>> f21966e = new HashMap<>();

    /* renamed from: f */
    public volatile HashMap<String, HashSet<String>> f21967f = new HashMap<>();

    /* renamed from: g */
    public volatile HashMap<String, Integer> f21968g = new HashMap<>();

    /* renamed from: h */
    public volatile HashMap<String, Integer> f21969h = new HashMap<>();

    /* renamed from: i */
    public volatile HashMap<String, Integer> f21970i = new HashMap<>();

    /* renamed from: j */
    public IListener<FTSEmojiDownloadedEvent> f21971j;

    /* renamed from: n */
    public IListener f21972n;

    public FTSWebViewImageLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f21971j = new IListener<FTSEmojiDownloadedEvent>(fVar) {
            {
                this.__eventId = 1327212386;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|14|15|8) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0086 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
                /*
                    r9 = this;
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent r10 = (com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent) r10
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r0 = r10.f9141d
                    int r1 = r0.f9143a
                    r2 = 2
                    r3 = 0
                    if (r1 != r2) goto L_0x00b4
                    java.lang.String r1 = "MicroMsg.WebSearch.FTSWebViewImageLogic"
                    java.lang.String r2 = "Emoji Download callback %s"
                    r4 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    java.lang.String r0 = r0.f9149g
                    r4[r3] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r0 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r0.f21967f
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r1 = r10.f9141d
                    java.lang.String r1 = r1.f9149g
                    boolean r0 = r0.containsKey(r1)
                    if (r0 == 0) goto L_0x00b4
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r0 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r0.f21967f
                    monitor-enter(r0)
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r1 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00b1 }
                    java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r1.f21970i     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r2 = r10.f9141d     // Catch:{ all -> 0x00b1 }
                    java.lang.String r2 = r2.f9149g     // Catch:{ all -> 0x00b1 }
                    java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00b1 }
                    java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00b1 }
                    int r1 = r1.intValue()     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r2 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00b1 }
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r2 = r2.f21967f     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r4 = r10.f9141d     // Catch:{ all -> 0x00b1 }
                    java.lang.String r4 = r4.f9149g     // Catch:{ all -> 0x00b1 }
                    java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x00b1 }
                    java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x00b1 }
                    org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x00b1 }
                    r4.<init>()     // Catch:{ all -> 0x00b1 }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00b1 }
                L_0x0054:
                    boolean r5 = r2.hasNext()     // Catch:{ all -> 0x00b1 }
                    if (r5 == 0) goto L_0x008a
                    java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x00b1 }
                    java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00b1 }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
                    r6.<init>()     // Catch:{ all -> 0x00b1 }
                    java.lang.String r7 = "weixin://fts/emoji?path="
                    r6.append(r7)     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$b r7 = r10.f9142e     // Catch:{ all -> 0x00b1 }
                    java.lang.String r7 = r7.f9151a     // Catch:{ all -> 0x00b1 }
                    r6.append(r7)     // Catch:{ all -> 0x00b1 }
                    java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b1 }
                    org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00b1 }
                    r7.<init>()     // Catch:{ all -> 0x00b1 }
                    java.lang.String r8 = "id"
                    r7.put(r8, r5)     // Catch:{ JSONException -> 0x0086 }
                    java.lang.String r5 = "src"
                    r7.put(r5, r6)     // Catch:{ JSONException -> 0x0086 }
                L_0x0086:
                    r4.put(r7)     // Catch:{ all -> 0x00b1 }
                    goto L_0x0054
                L_0x008a:
                    java.lang.Class<e00.o0> r2 = e00.C7575o0.class
                    di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x00b1 }
                    e00.o0 r2 = (e00.C7575o0) r2     // Catch:{ all -> 0x00b1 }
                    java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b1 }
                    r2.s80(r1, r3, r4)     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r1 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00b1 }
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r1 = r1.f21967f     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r2 = r10.f9141d     // Catch:{ all -> 0x00b1 }
                    java.lang.String r2 = r2.f9149g     // Catch:{ all -> 0x00b1 }
                    r1.remove(r2)     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r1 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00b1 }
                    java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r1.f21970i     // Catch:{ all -> 0x00b1 }
                    com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r10 = r10.f9141d     // Catch:{ all -> 0x00b1 }
                    java.lang.String r10 = r10.f9149g     // Catch:{ all -> 0x00b1 }
                    r1.remove(r10)     // Catch:{ all -> 0x00b1 }
                    monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                    goto L_0x00b4
                L_0x00b1:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                    throw r10
                L_0x00b4:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.C58191.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f21972n = new IListener<SnsImageDownloadedEvent>(fVar) {
            {
                this.__eventId = -1231290816;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0092 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
                /*
                    r9 = this;
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent r10 = (com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent) r10
                    boolean r0 = r10 instanceof com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent
                    r1 = 0
                    if (r0 == 0) goto L_0x00c0
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r0 = r10.f9515d
                    int r2 = r0.f9516a
                    r3 = 2
                    if (r2 != r3) goto L_0x00c0
                    java.lang.String r2 = "MicroMsg.WebSearch.FTSWebViewImageLogic"
                    java.lang.String r4 = "[%s][media:%s]Download callback"
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    java.lang.String r5 = "[image-flow]"
                    r3[r1] = r5
                    r5 = 1
                    java.lang.String r0 = r0.f9518c
                    r3[r5] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r0 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r0.f21966e
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r2 = r10.f9515d
                    java.lang.String r2 = r2.f9518c
                    boolean r0 = r0.containsKey(r2)
                    if (r0 == 0) goto L_0x00c0
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r0 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r0.f21966e
                    monitor-enter(r0)
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r2 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00bd }
                    java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r2.f21969h     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r3 = r10.f9515d     // Catch:{ all -> 0x00bd }
                    java.lang.String r3 = r3.f9518c     // Catch:{ all -> 0x00bd }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00bd }
                    java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x00bd }
                    int r2 = r2.intValue()     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r3 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00bd }
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r3 = r3.f21966e     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r4 = r10.f9515d     // Catch:{ all -> 0x00bd }
                    java.lang.String r4 = r4.f9518c     // Catch:{ all -> 0x00bd }
                    java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00bd }
                    java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ all -> 0x00bd }
                    org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x00bd }
                    r4.<init>()     // Catch:{ all -> 0x00bd }
                    java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00bd }
                L_0x005c:
                    boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00bd }
                    if (r5 == 0) goto L_0x0096
                    java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00bd }
                    java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00bd }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
                    r6.<init>()     // Catch:{ all -> 0x00bd }
                    java.lang.String r7 = "weixin://fts/sns?path="
                    r6.append(r7)     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r7 = r10.f9515d     // Catch:{ all -> 0x00bd }
                    java.lang.String r7 = r7.f9519d     // Catch:{ all -> 0x00bd }
                    java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106448i(r7, r1)     // Catch:{ all -> 0x00bd }
                    r6.append(r7)     // Catch:{ all -> 0x00bd }
                    java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00bd }
                    org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00bd }
                    r7.<init>()     // Catch:{ all -> 0x00bd }
                    java.lang.String r8 = "id"
                    r7.put(r8, r5)     // Catch:{ JSONException -> 0x0092 }
                    java.lang.String r5 = "src"
                    r7.put(r5, r6)     // Catch:{ JSONException -> 0x0092 }
                L_0x0092:
                    r4.put(r7)     // Catch:{ all -> 0x00bd }
                    goto L_0x005c
                L_0x0096:
                    java.lang.Class<e00.o0> r3 = e00.C7575o0.class
                    di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x00bd }
                    e00.o0 r3 = (e00.C7575o0) r3     // Catch:{ all -> 0x00bd }
                    java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00bd }
                    r3.s80(r2, r1, r4)     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r2 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00bd }
                    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r2 = r2.f21966e     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r3 = r10.f9515d     // Catch:{ all -> 0x00bd }
                    java.lang.String r3 = r3.f9518c     // Catch:{ all -> 0x00bd }
                    r2.remove(r3)     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.plugin.websearch.FTSWebViewImageLogic r2 = com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.this     // Catch:{ all -> 0x00bd }
                    java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r2.f21969h     // Catch:{ all -> 0x00bd }
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a r10 = r10.f9515d     // Catch:{ all -> 0x00bd }
                    java.lang.String r10 = r10.f9518c     // Catch:{ all -> 0x00bd }
                    r2.remove(r10)     // Catch:{ all -> 0x00bd }
                    monitor-exit(r0)     // Catch:{ all -> 0x00bd }
                    goto L_0x00c0
                L_0x00bd:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00bd }
                    throw r10
                L_0x00c0:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.C58202.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f21972n.alive();
        this.f21971j.alive();
        ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg().add(this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|17|18|19|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotifyChange(java.lang.String r9, com.tencent.p014mm.sdk.storage.MStorageEventData r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x00c4
            java.lang.Object r0 = r10.obj
            if (r0 != 0) goto L_0x0008
            goto L_0x00c4
        L_0x0008:
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r8.f21965d
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.WebSearch.FTSWebViewImageLogic"
            java.lang.String r2 = "event %s，eventData %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c1 }
            r4 = 0
            r3[r4] = r9     // Catch:{ all -> 0x00c1 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00c1 }
            r5 = 1
            r3[r5] = r9     // Catch:{ all -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x00c1 }
            java.lang.Object r9 = r10.obj     // Catch:{ all -> 0x00c1 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00c1 }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r10 = r8.f21965d     // Catch:{ all -> 0x00c1 }
            boolean r10 = r10.containsKey(r9)     // Catch:{ all -> 0x00c1 }
            if (r10 == 0) goto L_0x00bf
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r8.f21968g     // Catch:{ all -> 0x00c1 }
            boolean r10 = r10.containsKey(r9)     // Catch:{ all -> 0x00c1 }
            if (r10 == 0) goto L_0x00bf
            java.lang.String r10 = "MicroMsg.WebSearch.FTSWebViewImageLogic"
            java.lang.String r1 = "notify avatar changed %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c1 }
            r2[r4] = r9     // Catch:{ all -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)     // Catch:{ all -> 0x00c1 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r8.f21968g     // Catch:{ all -> 0x00c1 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x00c1 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x00c1 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x00c1 }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r1 = r8.f21965d     // Catch:{ all -> 0x00c1 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x00c1 }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x00c1 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00c1 }
            r2.<init>(r1)     // Catch:{ all -> 0x00c1 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x00c1 }
            r1.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0062:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00c1 }
            java.lang.Class<ln.g> r5 = p196ln.C76706g.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x00c1 }
            ln.g r5 = (p196ln.C76706g) r5     // Catch:{ all -> 0x00c1 }
            ln.k r5 = r5.mo106826RE()     // Catch:{ all -> 0x00c1 }
            com.tencent.mm.modelavatar.AvatarStorage r5 = (com.tencent.p014mm.modelavatar.AvatarStorage) r5     // Catch:{ all -> 0x00c1 }
            java.lang.String r5 = r5.mo93558g(r9, r4, r4)     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r6.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = "weixin://fts/avatar?path="
            r6.append(r7)     // Catch:{ all -> 0x00c1 }
            r6.append(r5)     // Catch:{ all -> 0x00c1 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00c1 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x00c1 }
            r6.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = "id"
            r6.put(r7, r3)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r3 = "src"
            r6.put(r3, r5)     // Catch:{ JSONException -> 0x00a2 }
        L_0x00a2:
            r1.put(r6)     // Catch:{ all -> 0x00c1 }
            goto L_0x0062
        L_0x00a6:
            java.lang.Class<e00.o0> r2 = e00.C7575o0.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x00c1 }
            e00.o0 r2 = (e00.C7575o0) r2     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c1 }
            r2.s80(r10, r4, r1)     // Catch:{ all -> 0x00c1 }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r10 = r8.f21965d     // Catch:{ all -> 0x00c1 }
            r10.remove(r9)     // Catch:{ all -> 0x00c1 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r8.f21968g     // Catch:{ all -> 0x00c1 }
            r10.remove(r9)     // Catch:{ all -> 0x00c1 }
        L_0x00bf:
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            return
        L_0x00c1:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            throw r9
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.FTSWebViewImageLogic.onNotifyChange(java.lang.String, com.tencent.mm.sdk.storage.MStorageEventData):void");
    }
}
