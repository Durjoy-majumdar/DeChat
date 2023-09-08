package w73;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import g83.C59386f;
import g83.C98093l;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;
import te3.C101806l82;
import te3.C101823o70;
import u73.C101986v;
import x73.C102577j;
import z73.C53759a;

/* renamed from: w73.a */
public final class C102357a extends C98093l<C101823o70> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102357a(C102577j jVar) {
        super(jVar);
        C87412m.m108594g(jVar, "uiComponent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b A[Catch:{ Exception -> 0x0073 }] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String emoticonImg(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "md5"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "emoticonImg: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WebSearch.BaseWebSearchJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.lang.String r1 = "emoticonImg:failed"
            if (r6 != 0) goto L_0x001e
            return r1
        L_0x001e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0073 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0073 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0073 }
            r6.<init>()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r2 = r2.optString(r0)     // Catch:{ Exception -> 0x0073 }
            r3 = 0
            if (r2 == 0) goto L_0x0038
            int r4 = r2.length()     // Catch:{ Exception -> 0x0073 }
            if (r4 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r4 = 0
            goto L_0x0039
        L_0x0038:
            r4 = 1
        L_0x0039:
            if (r4 != 0) goto L_0x0073
            java.lang.Class<bq.g1> r4 = p008bq.C92280g1.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x0073 }
            bq.g1 r4 = (p008bq.C92280g1) r4     // Catch:{ Exception -> 0x0073 }
            gy3.C87412m.m108593f(r2, r0)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r0 = r4.mo55792QQ(r2)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r3)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r2 = "retCode"
            org.json.JSONObject r6 = r6.put(r2, r3)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r2 = "url"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0073 }
            r3.<init>()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r4 = "weixin://fts/emoji?path="
            r3.append(r4)     // Catch:{ Exception -> 0x0073 }
            r3.append(r0)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0073 }
            org.json.JSONObject r6 = r6.put(r2, r0)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0073 }
            return r6
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w73.C102357a.emoticonImg(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5 A[Catch:{ Exception -> 0x00bc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6 A[Catch:{ Exception -> 0x00bc }] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String emoticonRecentSend(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "emoticonRecentSend: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WebSearch.BaseWebSearchJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = "emoticonRecentSend:failed"
            if (r8 != 0) goto L_0x001b
            return r0
        L_0x001b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bc }
            r1.<init>(r8)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r8 = "operation"
            r2 = 0
            int r8 = r1.optInt(r8, r2)     // Catch:{ Exception -> 0x00bc }
            java.lang.Class<bq.g1> r3 = p008bq.C92280g1.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x00bc }
            bq.g1 r3 = (p008bq.C92280g1) r3     // Catch:{ Exception -> 0x00bc }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bc }
            r4.<init>()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r5 = "md5"
            r6 = 1
            if (r8 == r6) goto L_0x0093
            r4 = 2
            if (r8 == r4) goto L_0x0062
            r4 = 3
            if (r8 == r4) goto L_0x0049
            r1 = 4
            if (r8 == r1) goto L_0x0045
            goto L_0x005f
        L_0x0045:
            r3.removeAll()     // Catch:{ Exception -> 0x00bc }
            goto L_0x005f
        L_0x0049:
            java.lang.String r8 = r1.optString(r5)     // Catch:{ Exception -> 0x00bc }
            if (r8 == 0) goto L_0x0055
            int r1 = r8.length()     // Catch:{ Exception -> 0x00bc }
            if (r1 != 0) goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            return r0
        L_0x0059:
            gy3.C87412m.m108593f(r8, r5)     // Catch:{ Exception -> 0x00bc }
            r3.remove(r8)     // Catch:{ Exception -> 0x00bc }
        L_0x005f:
            java.lang.String r8 = "emoticonRecentSend:ok"
            return r8
        L_0x0062:
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x00bc }
            r8.<init>()     // Catch:{ Exception -> 0x00bc }
            java.util.List r1 = r3.getAll()     // Catch:{ Exception -> 0x00bc }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00bc }
        L_0x006f:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00bc }
            if (r2 == 0) goto L_0x007f
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00bc }
            r8.put(r2)     // Catch:{ Exception -> 0x00bc }
            goto L_0x006f
        L_0x007f:
            org.json.JSONObject r1 = r7.mo74341e()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r2 = "md5InOrder"
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00bc }
            org.json.JSONObject r8 = r1.put(r2, r8)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00bc }
            return r8
        L_0x0093:
            java.lang.String r8 = r1.optString(r5)     // Catch:{ Exception -> 0x00bc }
            if (r8 == 0) goto L_0x00a2
            int r1 = r8.length()     // Catch:{ Exception -> 0x00bc }
            if (r1 != 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r1 = 0
            goto L_0x00a3
        L_0x00a2:
            r1 = 1
        L_0x00a3:
            if (r1 == 0) goto L_0x00a6
            return r0
        L_0x00a6:
            java.lang.String r1 = "isInList"
            gy3.C87412m.m108593f(r8, r5)     // Catch:{ Exception -> 0x00bc }
            boolean r8 = r3.contains(r8)     // Catch:{ Exception -> 0x00bc }
            if (r8 == 0) goto L_0x00b3
            r2 = 1
        L_0x00b3:
            org.json.JSONObject r8 = r4.put(r1, r2)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00bc }
            return r8
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w73.C102357a.emoticonRecentSend(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public final String enterEmojiStore(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("talker");
            Intent intent = new Intent();
            int optInt = jSONObject.optInt("searchScene", 24);
            intent.putExtra("preceding_scence", 13);
            intent.putExtra("download_entrance_scene", 17);
            intent.putExtra("check_clickflag", false);
            intent.putExtra("report_entrance_scence", optInt);
            if (!Util.isNullOrNil(optString)) {
                intent.putExtra("to_talker_name", optString);
            }
            Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "searchScene = %s, requestObj = %s.", Integer.valueOf(optInt), jSONObject);
            C53759a aVar = this.f150904a;
            C102577j jVar = aVar instanceof C102577j ? (C102577j) aVar : null;
            C88144b.m109791i(jVar != null ? jVar.mo24908k0() : null, "emoji", ".ui.v2.EmojiStoreV2UI", intent, (Bundle) null);
            String jSONObject2 = mo74341e().toString();
            C87412m.m108593f(jSONObject2, "returnSuccess().toString()");
            return jSONObject2;
        } catch (Exception unused) {
            String jSONObject3 = mo74340d().toString();
            C87412m.m108593f(jSONObject3, "returnFail().toString()");
            return jSONObject3;
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [z73.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String openSearchWebView(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "sessionId"
            java.lang.String r3 = "searchId"
            java.lang.String r4 = "subType"
            java.lang.String r5 = "query"
            java.lang.String r6 = ""
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "openSearchWebView "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.WebSearch.BaseWebSearchJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00dc }
            r7.<init>(r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = r7.optString(r5)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r8 = "scene"
            r9 = 0
            int r8 = r7.optInt(r8, r9)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r10 = "type"
            int r10 = r7.optInt(r10, r9)     // Catch:{ Exception -> 0x00dc }
            int r11 = r7.optInt(r4, r9)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r12 = r7.optString(r3, r6)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r13 = r7.optString(r2, r6)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r14 = "actionType"
            int r14 = r7.optInt(r14, r9)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r15 = "extParams"
            java.lang.String r15 = r7.optString(r15, r6)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r9 = "nativeConfig"
            org.json.JSONObject r7 = r7.optJSONObject(r9)     // Catch:{ Exception -> 0x00dc }
            if (r7 == 0) goto L_0x0068
            java.lang.String r9 = "title"
            r7.optString(r9)     // Catch:{ Exception -> 0x00dc }
        L_0x0068:
            r7 = 3
            if (r14 != r7) goto L_0x00d3
            r7 = 0
            java.util.Map r7 = u73.C101987v0.m134268b(r8, r7, r10, r15)     // Catch:{ Exception -> 0x00dc }
            r9 = r7
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x00dc }
            r9.put(r5, r1)     // Catch:{ Exception -> 0x00dc }
            r9.put(r3, r12)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00dc }
            r9.put(r4, r3)     // Catch:{ Exception -> 0x00dc }
            r9.put(r2, r13)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = "subSessionId"
            java.lang.String r3 = u73.C101987v0.m134271e(r8)     // Catch:{ Exception -> 0x00dc }
            r9.put(r2, r3)     // Catch:{ Exception -> 0x00dc }
            te3.o70 r2 = new te3.o70     // Catch:{ Exception -> 0x00dc }
            r2.<init>()     // Catch:{ Exception -> 0x00dc }
            z73.a r3 = r0.f150904a     // Catch:{ Exception -> 0x00dc }
            boolean r4 = r3 instanceof x73.C102577j     // Catch:{ Exception -> 0x00dc }
            r5 = 0
            if (r4 == 0) goto L_0x009c
            x73.j r3 = (x73.C102577j) r3     // Catch:{ Exception -> 0x00dc }
            goto L_0x009d
        L_0x009c:
            r3 = r5
        L_0x009d:
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r3.mo84508x6()     // Catch:{ Exception -> 0x00dc }
            te3.o70 r3 = (te3.C101823o70) r3     // Catch:{ Exception -> 0x00dc }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = r3.f298984o     // Catch:{ Exception -> 0x00dc }
            if (r3 != 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r6 = r3
        L_0x00ad:
            r2.f298984o = r6     // Catch:{ Exception -> 0x00dc }
            w73.d r3 = w73.C15050d.f41189a     // Catch:{ Exception -> 0x00dc }
            java.lang.String r3 = r3.mo14070a(r7)     // Catch:{ Exception -> 0x00dc }
            r2.f298979g = r3     // Catch:{ Exception -> 0x00dc }
            r2.f298981i = r1     // Catch:{ Exception -> 0x00dc }
            r2.f298978f = r8     // Catch:{ Exception -> 0x00dc }
            r2.f298976d = r12     // Catch:{ Exception -> 0x00dc }
            r2.f298977e = r13     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = u73.C101987v0.m134271e(r8)     // Catch:{ Exception -> 0x00dc }
            r2.f298980h = r1     // Catch:{ Exception -> 0x00dc }
            z73.a r1 = r0.f150904a     // Catch:{ Exception -> 0x00dc }
            boolean r3 = r1 instanceof x73.C102577j     // Catch:{ Exception -> 0x00dc }
            if (r3 == 0) goto L_0x00ce
            r5 = r1
            x73.j r5 = (x73.C102577j) r5     // Catch:{ Exception -> 0x00dc }
        L_0x00ce:
            if (r5 == 0) goto L_0x00d3
            r5.mo142202G1(r2)     // Catch:{ Exception -> 0x00dc }
        L_0x00d3:
            org.json.JSONObject r1 = r16.mo74341e()     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00dc }
            return r1
        L_0x00dc:
            org.json.JSONObject r1 = r16.mo74340d()
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w73.C102357a.openSearchWebView(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public final String setSearchTagResult(String str) {
        C102359e c;
        Log.m105924i("MicroMsg.WebSearch.BaseWebSearchJSApi", "setSearchTagResult " + str);
        if (str == null) {
            return mo74340d().toString();
        }
        C53759a aVar = this.f150904a;
        C102577j jVar = aVar instanceof C102577j ? (C102577j) aVar : null;
        if (!(jVar == null || (c = jVar.mo9283c()) == null)) {
            try {
                C101986v vVar = c.f301456i;
                if (vVar != null) {
                    C86709a0.m107524d().mo123458d(vVar);
                    c.f301456i = null;
                }
                JSONObject jSONObject = new JSONObject(str);
                C101806l82 l822 = new C101806l82();
                l822.f298714d = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
                l822.f298715e = jSONObject.optString("sessionId", "");
                l822.f298716f = jSONObject.optString("requestId", "");
                l822.f298717g = jSONObject.optString("searchId", "");
                l822.f298719i = jSONObject.optString(SearchIntents.EXTRA_QUERY, "");
                l822.f298720j = jSONObject.optString("content", "");
                l822.f298718h = jSONObject.optInt("h5Version", 0);
                C101986v vVar2 = new C101986v(l822, c.mo71326a());
                C86709a0.m107524d().mo123460f(vVar2);
                c.f301456i = vVar2;
                C59386f<T> fVar = c.f123861d;
                C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.emojisearch.ui.IEmojiSearchUIComponent");
                String str2 = l822.f298716f;
                C87412m.m108593f(str2, "request.RequestId");
                ((C102577j) fVar).mo142203j0(str2);
            } catch (Exception unused) {
            }
        }
        return mo74341e().toString();
    }
}
