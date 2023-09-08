package com.tencent.p014mm.plugin.websearch.webview;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86312j;
import g83.C45897a;
import g83.C59386f;
import g83.C8248d;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import p196ln.C76706g;

/* renamed from: com.tencent.mm.plugin.websearch.webview.WebSearchImageData */
public class WebSearchImageData<T> extends C45897a<T> implements MStorage.IOnStorageChange {

    /* renamed from: e */
    public final String f22017e = "MicroMsg.WebSearch.WebSearchImageData";

    /* renamed from: f */
    public final HashMap<String, HashSet<String>> f22018f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<String, HashSet<String>> f22019g = new HashMap<>();

    /* renamed from: h */
    public final WebSearchImageData$ftsEmojiDownloadedListener$1 f22020h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSearchImageData(C8248d<T> dVar) {
        super(dVar);
        C87412m.m108594g(dVar, "uiComponent");
        WebSearchImageData$ftsEmojiDownloadedListener$1 webSearchImageData$ftsEmojiDownloadedListener$1 = new WebSearchImageData$ftsEmojiDownloadedListener$1(this, C40008f.f107254d);
        this.f22020h = webSearchImageData$ftsEmojiDownloadedListener$1;
        webSearchImageData$ftsEmojiDownloadedListener$1.alive();
        ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg().add(this);
    }

    /* renamed from: b */
    public final C8248d<T> mo6889b() {
        C59386f<T> fVar = this.f123861d;
        if (fVar instanceof C8248d) {
            return (C8248d) fVar;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b6, code lost:
        if (r1.f22019g.put(r14, r5) == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014c, code lost:
        if (r1.f22019g.put(r14, r5) == null) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0173 A[Catch:{ Exception -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0185 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6890c(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            java.lang.String r3 = "id"
            java.lang.Class<ln.g> r4 = p196ln.C76706g.class
            java.lang.String r5 = "data"
            gy3.C87412m.m108594g(r0, r5)
            java.lang.String r5 = r1.f22017e
            java.lang.String r6 = "getSearchAvatarList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x01ad }
            r7.<init>(r0)     // Catch:{ Exception -> 0x01ad }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x01ad }
            r0.<init>()     // Catch:{ Exception -> 0x01ad }
            int r8 = r7.length()     // Catch:{ Exception -> 0x01ad }
            r10 = 0
            r11 = 0
        L_0x0026:
            if (r10 >= r8) goto L_0x018d
            org.json.JSONObject r12 = r7.getJSONObject(r10)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r13 = r12.optString(r3)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r14 = "userName"
            java.lang.String r14 = r12.optString(r14)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r15 = "type"
            int r15 = r12.optInt(r15)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r9 = "imageUrl"
            java.lang.String r9 = r12.optString(r9)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r5 = "bigImageUrl"
            java.lang.String r5 = r12.optString(r5)     // Catch:{ Exception -> 0x01ad }
            r12 = 1
            if (r15 == r12) goto L_0x016c
            r12 = 4
            if (r15 == r12) goto L_0x016c
            r12 = 32
            java.lang.String r6 = "weixin://fts/avatar?path="
            r16 = r7
            java.lang.String r7 = "avatar file exist %s"
            r17 = r8
            java.lang.String r8 = "avatar file not exist %s"
            if (r15 == r12) goto L_0x00d7
            r5 = 64
            if (r15 == r5) goto L_0x0170
            di3.d r5 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x01ad }
            ln.g r5 = (p196ln.C76706g) r5     // Catch:{ Exception -> 0x01ad }
            ln.k r5 = r5.mo106826RE()     // Catch:{ Exception -> 0x01ad }
            com.tencent.mm.modelavatar.AvatarStorage r5 = (com.tencent.p014mm.modelavatar.AvatarStorage) r5     // Catch:{ Exception -> 0x01ad }
            r9 = 0
            java.lang.String r5 = r5.mo93558g(r14, r9, r9)     // Catch:{ Exception -> 0x01ad }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)     // Catch:{ Exception -> 0x01ad }
            if (r9 == 0) goto L_0x0096
            java.lang.String r8 = r1.f22017e     // Catch:{ Exception -> 0x01ad }
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01ad }
            r11 = 0
            r9[r11] = r5     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r9)     // Catch:{ Exception -> 0x01ad }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ad }
            r7.<init>()     // Catch:{ Exception -> 0x01ad }
            r7.append(r6)     // Catch:{ Exception -> 0x01ad }
            r7.append(r5)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r11 = r7.toString()     // Catch:{ Exception -> 0x01ad }
            goto L_0x0171
        L_0x0096:
            java.lang.String r6 = r1.f22017e     // Catch:{ Exception -> 0x01ad }
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01ad }
            r9 = 0
            r7[r9] = r5     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)     // Catch:{ Exception -> 0x01ad }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r5 = r1.f22019g     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ Exception -> 0x01ad }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ Exception -> 0x01ad }
            if (r5 == 0) goto L_0x00b8
            r5.add(r13)     // Catch:{ Exception -> 0x01ad }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r6 = r1.f22019g     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r5 = r6.put(r14, r5)     // Catch:{ Exception -> 0x01ad }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ Exception -> 0x01ad }
            if (r5 != 0) goto L_0x00c8
        L_0x00b8:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ Exception -> 0x01ad }
            r5.<init>()     // Catch:{ Exception -> 0x01ad }
            r5.add(r13)     // Catch:{ Exception -> 0x01ad }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r6 = r1.f22019g     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r5 = r6.put(r14, r5)     // Catch:{ Exception -> 0x01ad }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ Exception -> 0x01ad }
        L_0x00c8:
            di3.d r5 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x01ad }
            ln.f r5 = (p196ln.C76705f) r5     // Catch:{ Exception -> 0x01ad }
            vd3.r$b r5 = r5.mo106829VT()     // Catch:{ Exception -> 0x01ad }
            r5.loadBitmap(r14)     // Catch:{ Exception -> 0x01ad }
            goto L_0x0171
        L_0x00d7:
            com.tencent.mm.modelavatar.n r12 = new com.tencent.mm.modelavatar.n     // Catch:{ Exception -> 0x01ad }
            r12.<init>()     // Catch:{ Exception -> 0x01ad }
            r12.f195728a = r14     // Catch:{ Exception -> 0x01ad }
            r12.f195732e = r5     // Catch:{ Exception -> 0x01ad }
            r12.f195731d = r9     // Catch:{ Exception -> 0x01ad }
            r5 = -1
            r12.f195736i = r5     // Catch:{ Exception -> 0x01ad }
            r5 = 3
            r12.f195729b = r5     // Catch:{ Exception -> 0x01ad }
            r5 = 1
            r12.f195733f = r5     // Catch:{ Exception -> 0x01ad }
            di3.d r5 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x01ad }
            ln.g r5 = (p196ln.C76706g) r5     // Catch:{ Exception -> 0x01ad }
            ln.n r5 = r5.mo106832eg()     // Catch:{ Exception -> 0x01ad }
            com.tencent.mm.modelavatar.o r5 = (com.tencent.p014mm.modelavatar.C68098o) r5     // Catch:{ Exception -> 0x01ad }
            r5.mo93608Yt(r12)     // Catch:{ Exception -> 0x01ad }
            di3.d r5 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x01ad }
            ln.g r5 = (p196ln.C76706g) r5     // Catch:{ Exception -> 0x01ad }
            ln.k r5 = r5.mo106826RE()     // Catch:{ Exception -> 0x01ad }
            com.tencent.mm.modelavatar.AvatarStorage r5 = (com.tencent.p014mm.modelavatar.AvatarStorage) r5     // Catch:{ Exception -> 0x01ad }
            r9 = 0
            java.lang.String r5 = r5.mo93558g(r14, r9, r9)     // Catch:{ Exception -> 0x01ad }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)     // Catch:{ Exception -> 0x01ad }
            if (r9 == 0) goto L_0x012c
            java.lang.String r8 = r1.f22017e     // Catch:{ Exception -> 0x01ad }
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01ad }
            r11 = 0
            r9[r11] = r5     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r9)     // Catch:{ Exception -> 0x01ad }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ad }
            r7.<init>()     // Catch:{ Exception -> 0x01ad }
            r7.append(r6)     // Catch:{ Exception -> 0x01ad }
            r7.append(r5)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r11 = r7.toString()     // Catch:{ Exception -> 0x01ad }
            goto L_0x0171
        L_0x012c:
            java.lang.String r6 = r1.f22017e     // Catch:{ Exception -> 0x01ad }
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01ad }
            r9 = 0
            r7[r9] = r5     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)     // Catch:{ Exception -> 0x01ad }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r5 = r1.f22019g     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ Exception -> 0x01ad }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ Exception -> 0x01ad }
            if (r5 == 0) goto L_0x014e
            r5.add(r13)     // Catch:{ Exception -> 0x01ad }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r6 = r1.f22019g     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r5 = r6.put(r14, r5)     // Catch:{ Exception -> 0x01ad }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ Exception -> 0x01ad }
            if (r5 != 0) goto L_0x015e
        L_0x014e:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ Exception -> 0x01ad }
            r5.<init>()     // Catch:{ Exception -> 0x01ad }
            r5.add(r13)     // Catch:{ Exception -> 0x01ad }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r6 = r1.f22019g     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r5 = r6.put(r14, r5)     // Catch:{ Exception -> 0x01ad }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ Exception -> 0x01ad }
        L_0x015e:
            di3.d r5 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x01ad }
            ln.f r5 = (p196ln.C76705f) r5     // Catch:{ Exception -> 0x01ad }
            vd3.r$b r5 = r5.mo106829VT()     // Catch:{ Exception -> 0x01ad }
            r5.loadBitmap(r14)     // Catch:{ Exception -> 0x01ad }
            goto L_0x0171
        L_0x016c:
            r16 = r7
            r17 = r8
        L_0x0170:
            r11 = r9
        L_0x0171:
            if (r11 == 0) goto L_0x0185
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ad }
            r5.<init>()     // Catch:{ Exception -> 0x01ad }
            r5.put(r3, r13)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r6 = "src"
            r5.put(r6, r11)     // Catch:{ Exception -> 0x01ad }
            r0.put(r5)     // Catch:{ Exception -> 0x01ad }
            r11 = 0
        L_0x0185:
            int r10 = r10 + 1
            r7 = r16
            r8 = r17
            goto L_0x0026
        L_0x018d:
            int r2 = r0.length()     // Catch:{ Exception -> 0x01ad }
            if (r2 <= 0) goto L_0x01c8
            g83.d r2 = r18.mo6889b()     // Catch:{ Exception -> 0x01ad }
            if (r2 == 0) goto L_0x01c8
            g83.j r2 = r2.mo9284g()     // Catch:{ Exception -> 0x01ad }
            if (r2 == 0) goto L_0x01c8
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01ad }
            java.lang.String r3 = "returnArray.toString()"
            gy3.C87412m.m108593f(r0, r3)     // Catch:{ Exception -> 0x01ad }
            r3 = 0
            r2.mo84511k(r3, r0)     // Catch:{ Exception -> 0x01ad }
            goto L_0x01c8
        L_0x01ad:
            r0 = move-exception
            g83.d r2 = r18.mo6889b()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x01c0
            g83.j r2 = r2.mo9284g()
            if (r2 == 0) goto L_0x01c0
            r4 = -1
            r2.mo84511k(r4, r3)
        L_0x01c0:
            java.lang.String r2 = r1.f22017e
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData.mo6890c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6891d(int r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r13, r0)
            r0 = 0
            r1 = 1
            if (r12 != r1) goto L_0x0164
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ Exception -> 0x01b3 }
            r12.<init>(r13)     // Catch:{ Exception -> 0x01b3 }
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ Exception -> 0x01b3 }
            r13.<init>()     // Catch:{ Exception -> 0x01b3 }
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0016:
            int r5 = r12.length()     // Catch:{ Exception -> 0x01b3 }
            if (r3 >= r5) goto L_0x0145
            org.json.JSONObject r5 = r12.getJSONObject(r3)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r6 = "emojiType"
            int r6 = r5.optInt(r6)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = "id"
            java.lang.String r7 = r5.optString(r7)     // Catch:{ Exception -> 0x01b3 }
            r8 = 2
            if (r6 == r8) goto L_0x0068
            r8 = 4
            if (r6 == r8) goto L_0x004d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x01b3 }
            r6.<init>()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r8 = "id"
            r6.put(r8, r7)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = "src"
            java.lang.String r8 = "imageUrl"
            java.lang.String r5 = r5.optString(r8)     // Catch:{ Exception -> 0x01b3 }
            r6.put(r7, r5)     // Catch:{ Exception -> 0x01b3 }
            r13.put(r6)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x013e
        L_0x004d:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x01b3 }
            r6.<init>()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r8 = "id"
            r6.put(r8, r7)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = "src"
            java.lang.String r8 = "raw"
            java.lang.String r5 = r5.optString(r8)     // Catch:{ Exception -> 0x01b3 }
            r6.put(r7, r5)     // Catch:{ Exception -> 0x01b3 }
            r13.put(r6)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x013e
        L_0x0068:
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent r6 = new com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent     // Catch:{ Exception -> 0x01b3 }
            r6.<init>()     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r8 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            r9 = 3
            r8.f9143a = r9     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r9 = "md5"
            java.lang.String r9 = r5.optString(r9)     // Catch:{ Exception -> 0x01b3 }
            r8.f9149g = r9     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r8 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r9 = "designerId"
            java.lang.String r9 = r5.optString(r9)     // Catch:{ Exception -> 0x01b3 }
            r8.f9144b = r9     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r8 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r9 = "aesKey"
            java.lang.String r9 = r5.optString(r9)     // Catch:{ Exception -> 0x01b3 }
            r8.f9147e = r9     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r8 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r9 = "encryptUrl"
            java.lang.String r9 = r5.optString(r9)     // Catch:{ Exception -> 0x01b3 }
            r8.f9148f = r9     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r8 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r9 = "productID"
            java.lang.String r9 = r5.optString(r9)     // Catch:{ Exception -> 0x01b3 }
            r8.f9150h = r9     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r8 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r9 = "express"
            java.lang.String r9 = r5.optString(r9)     // Catch:{ Exception -> 0x01b3 }
            r8.f9146d = r9     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r8 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r9 = "imageUrl"
            java.lang.String r5 = r5.optString(r9)     // Catch:{ Exception -> 0x01b3 }
            r8.f9145c = r5     // Catch:{ Exception -> 0x01b3 }
            r6.publish()     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$b r5 = r6.f9142e     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r5 = r5.f9151a     // Catch:{ Exception -> 0x01b3 }
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)     // Catch:{ Exception -> 0x01b3 }
            if (r5 == 0) goto L_0x00e9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3 }
            r4.<init>()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r5 = "weixin://fts/emoji?path="
            r4.append(r5)     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$b r5 = r6.f9142e     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r5 = r5.f9151a     // Catch:{ Exception -> 0x01b3 }
            r4.append(r5)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r5 = r11.f22017e     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r8 = "path=%s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$b r6 = r6.f9142e     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r6 = r6.f9151a     // Catch:{ Exception -> 0x01b3 }
            r9[r0] = r6     // Catch:{ Exception -> 0x01b3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r9)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x0128
        L_0x00e9:
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r5 = r11.f22018f     // Catch:{ Exception -> 0x01b3 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x01b3 }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r8 = r11.f22018f     // Catch:{ all -> 0x0142 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r9 = r6.f9141d     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = r9.f9149g     // Catch:{ all -> 0x0142 }
            boolean r8 = r8.containsKey(r9)     // Catch:{ all -> 0x0142 }
            if (r8 == 0) goto L_0x010c
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r8 = r11.f22018f     // Catch:{ all -> 0x0142 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r9 = r6.f9141d     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = r9.f9149g     // Catch:{ all -> 0x0142 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0142 }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x0142 }
            if (r8 != 0) goto L_0x0111
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x0142 }
            r8.<init>()     // Catch:{ all -> 0x0142 }
            goto L_0x0111
        L_0x010c:
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x0142 }
            r8.<init>()     // Catch:{ all -> 0x0142 }
        L_0x0111:
            r8.add(r7)     // Catch:{ all -> 0x0142 }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r9 = r11.f22018f     // Catch:{ all -> 0x0142 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r10 = r6.f9141d     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r10.f9149g     // Catch:{ all -> 0x0142 }
            java.lang.Object r8 = r9.put(r10, r8)     // Catch:{ all -> 0x0142 }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x0142 }
            monitor-exit(r5)     // Catch:{ Exception -> 0x01b3 }
            com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a r5 = r6.f9141d     // Catch:{ Exception -> 0x01b3 }
            r5.f9143a = r1     // Catch:{ Exception -> 0x01b3 }
            r6.publish()     // Catch:{ Exception -> 0x01b3 }
        L_0x0128:
            if (r4 == 0) goto L_0x013e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x01b3 }
            r5.<init>()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r6 = "id"
            r5.put(r6, r7)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r6 = "src"
            r5.put(r6, r4)     // Catch:{ Exception -> 0x01b3 }
            r13.put(r5)     // Catch:{ Exception -> 0x01b3 }
            r4 = r2
        L_0x013e:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0142:
            r12 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x01b3 }
            throw r12     // Catch:{ Exception -> 0x01b3 }
        L_0x0145:
            int r12 = r13.length()     // Catch:{ Exception -> 0x01b3 }
            if (r12 <= 0) goto L_0x01b3
            g83.d r12 = r11.mo6889b()     // Catch:{ Exception -> 0x01b3 }
            if (r12 == 0) goto L_0x01b3
            g83.j r12 = r12.mo9284g()     // Catch:{ Exception -> 0x01b3 }
            if (r12 == 0) goto L_0x01b3
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r1 = "returnArray.toString()"
            gy3.C87412m.m108593f(r13, r1)     // Catch:{ Exception -> 0x01b3 }
            r12.mo84511k(r0, r13)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01b3
        L_0x0164:
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{  }
            r12.<init>(r13)     // Catch:{  }
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{  }
            r13.<init>()     // Catch:{  }
            r1 = 0
        L_0x016f:
            int r2 = r12.length()     // Catch:{  }
            if (r1 >= r2) goto L_0x019b
            org.json.JSONObject r2 = r12.getJSONObject(r1)     // Catch:{  }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{  }
            r3.<init>()     // Catch:{  }
            java.lang.String r4 = "id"
            java.lang.String r4 = r2.getString(r4)     // Catch:{  }
            java.lang.String r5 = "imageUrl"
            java.lang.String r2 = r2.getString(r5)     // Catch:{  }
            java.lang.String r5 = "id"
            r3.put(r5, r4)     // Catch:{  }
            java.lang.String r4 = "src"
            r3.put(r4, r2)     // Catch:{  }
            r13.put(r3)     // Catch:{  }
            int r1 = r1 + 1
            goto L_0x016f
        L_0x019b:
            g83.d r12 = r11.mo6889b()     // Catch:{  }
            if (r12 == 0) goto L_0x01b3
            g83.j r12 = r12.mo9284g()     // Catch:{  }
            if (r12 == 0) goto L_0x01b3
            java.lang.String r13 = r13.toString()     // Catch:{  }
            java.lang.String r1 = "returnArray.toString()"
            gy3.C87412m.m108593f(r13, r1)     // Catch:{  }
            r12.mo84511k(r0, r13)     // Catch:{  }
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData.mo6891d(int, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|20|21|22|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotifyChange(java.lang.String r8, com.tencent.p014mm.sdk.storage.MStorageEventData r9) {
        /*
            r7 = this;
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r0 = r7.f22019g
            monitor-enter(r0)
            java.lang.String r1 = r7.f22017e     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "event %s，eventData %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b0 }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x00b0 }
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00b0 }
            r5 = 1
            r3[r5] = r8     // Catch:{ all -> 0x00b0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x00b0 }
            if (r9 == 0) goto L_0x0023
            java.lang.Object r8 = r9.obj     // Catch:{ all -> 0x00b0 }
            if (r8 == 0) goto L_0x0023
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b0 }
            if (r8 != 0) goto L_0x0025
        L_0x0023:
            java.lang.String r8 = ""
        L_0x0025:
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r9 = r7.f22019g     // Catch:{ all -> 0x00b0 }
            boolean r9 = r9.containsKey(r8)     // Catch:{ all -> 0x00b0 }
            if (r9 == 0) goto L_0x00ac
            java.lang.String r9 = r7.f22017e     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "notify avatar changed %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00b0 }
            r2[r4] = r8     // Catch:{ all -> 0x00b0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r2)     // Catch:{ all -> 0x00b0 }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ all -> 0x00b0 }
            r9.<init>()     // Catch:{ all -> 0x00b0 }
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r1 = r7.f22019g     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x00b0 }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x008f
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x004b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x008f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b0 }
            java.lang.Class<ln.g> r3 = p196ln.C76706g.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x00b0 }
            ln.g r3 = (p196ln.C76706g) r3     // Catch:{ all -> 0x00b0 }
            ln.k r3 = r3.mo106826RE()     // Catch:{ all -> 0x00b0 }
            com.tencent.mm.modelavatar.AvatarStorage r3 = (com.tencent.p014mm.modelavatar.AvatarStorage) r3     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r3.mo93558g(r8, r4, r4)     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r5.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = "weixin://fts/avatar?path="
            r5.append(r6)     // Catch:{ all -> 0x00b0 }
            r5.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b0 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00b0 }
            r5.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = "id"
            r5.put(r6, r2)     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "src"
            r5.put(r2, r3)     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            r9.put(r5)     // Catch:{ all -> 0x00b0 }
            goto L_0x004b
        L_0x008f:
            g83.d r1 = r7.mo6889b()     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x00a7
            g83.j r1 = r1.mo9284g()     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x00a7
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "returnArray.toString()"
            gy3.C87412m.m108593f(r9, r2)     // Catch:{ all -> 0x00b0 }
            r1.mo84511k(r4, r9)     // Catch:{ all -> 0x00b0 }
        L_0x00a7:
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r9 = r7.f22019g     // Catch:{ all -> 0x00b0 }
            r9.remove(r8)     // Catch:{ all -> 0x00b0 }
        L_0x00ac:
            rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00b0 }
            monitor-exit(r0)
            return
        L_0x00b0:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData.onNotifyChange(java.lang.String, com.tencent.mm.sdk.storage.MStorageEventData):void");
    }
}
