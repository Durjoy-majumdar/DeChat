package com.tencent.p014mm.game.report;

import com.tencent.p014mm.autogen.mmdata.rpt.GameLifeSessionStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.net.URLEncoder;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.game.report.c */
public final class C40306c {

    /* renamed from: a */
    public static final C40307a f108374a = new C40307a((C8480h) null);

    /* renamed from: com.tencent.mm.game.report.c$a */
    public static final class C40307a {
        public C40307a(C8480h hVar) {
        }

        /* renamed from: g */
        public static /* synthetic */ void m43452g(C40307a aVar, int i, long j, int i2, String str, long j2, String str2, long j3, String str3, long j4, long j5, String str4, int i3, Object obj) {
            aVar.mo62988e(i, j, i2, str, j2, str2, j3, str3, j4, j5, (i3 & 1024) != 0 ? null : str4);
        }

        /* renamed from: a */
        public final GameLifeSessionStruct mo62984a(long j, long j2, long j3, long j4, long j5) {
            GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
            gameLifeSessionStruct.f107922d = j;
            gameLifeSessionStruct.f107923e = j2;
            gameLifeSessionStruct.f107924f = j3;
            gameLifeSessionStruct.f107925g = j4;
            gameLifeSessionStruct.f107926h = j5;
            return gameLifeSessionStruct;
        }

        /* renamed from: b */
        public final void mo62985b(String str, long j, String str2, long j2, String str3, long j3, long j4) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            C87412m.m108594g(str4, "sessionId");
            C87412m.m108594g(str5, "fromUsername");
            C87412m.m108594g(str6, "toUsername");
            GameLifeSessionStruct a = mo62984a(3, 302, 3, j3, 301);
            a.f107934p = a.mo86045b("SessionId", str4, true);
            a.f107929k = j;
            a.f107930l = a.mo86045b("from_username", str5, true);
            a.f107931m = j2;
            a.f107932n = a.mo86045b("to_username", str6, true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ser_name", j4);
            a.mo62729s(URLEncoder.encode(jSONObject.toString()));
            a.mo86054n();
        }

        /* renamed from: c */
        public final void mo62986c(int i, long j, String str, long j2, String str2, long j3, String str3, String str4) {
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            C87412m.m108594g(str5, "sessionId");
            C87412m.m108594g(str6, "fromUsername");
            C87412m.m108594g(str7, "toUsername");
            GameLifeSessionStruct a = mo62984a(3, 301, (long) i, j, 301);
            a.f107934p = a.mo86045b("SessionId", str5, true);
            a.f107929k = j2;
            a.f107930l = a.mo86045b("from_username", str6, true);
            a.f107931m = j3;
            a.f107932n = a.mo86045b("to_username", str7, true);
            a.f107928j = a.mo86045b("ActionStatus", str4, true);
            a.mo86054n();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            if ((r18.length() > 0) == true) goto L_0x0013;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo62987d(java.lang.String r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0012
                int r3 = r18.length()
                if (r3 <= 0) goto L_0x000e
                r3 = 1
                goto L_0x000f
            L_0x000e:
                r3 = 0
            L_0x000f:
                if (r3 != r1) goto L_0x0012
                goto L_0x0013
            L_0x0012:
                r1 = 0
            L_0x0013:
                r3 = 0
                java.lang.String r5 = ""
                if (r1 == 0) goto L_0x003f
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
                r1.<init>(r0)     // Catch:{ all -> 0x0035 }
                java.lang.String r0 = "ssid"
                long r3 = r1.optLong(r0)     // Catch:{ all -> 0x0035 }
                java.lang.String r0 = "ExternInfo"
                java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x0035 }
                java.lang.String r0 = java.net.URLEncoder.encode(r0)     // Catch:{ all -> 0x0035 }
                java.lang.String r1 = "encode(reportInfoJson.optString(\"ExternInfo\"))"
                gy3.C87412m.m108593f(r0, r1)     // Catch:{ all -> 0x0035 }
                r5 = r0
                goto L_0x003f
            L_0x0035:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r2 = "Report.Kv20488"
                java.lang.String r6 = "reportWAGameJumpToConversation invalid json"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r6, r1)
            L_0x003f:
                r7 = 3
                r9 = 0
                r11 = 0
                r13 = 1
                r15 = 0
                r6 = r17
                com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct r0 = r6.mo62984a(r7, r9, r11, r13, r15)
                r0.f107936r = r3
                r0.mo62729s(r5)
                r0.mo86054n()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.game.report.C40306c.C40307a.mo62987d(java.lang.String):void");
        }

        /* renamed from: e */
        public final void mo62988e(int i, long j, int i2, String str, long j2, String str2, long j3, String str3, long j4, long j5, String str4) {
            int i3 = i;
            C87412m.m108594g(str, "sessionId");
            C87412m.m108594g(str2, "fromUsername");
            C87412m.m108594g(str3, "toUsername");
            mo62989f(i, j, i2, str, j2, str2, j3, str3, j4, j5, str4, (Integer) null);
        }

        /* renamed from: f */
        public final void mo62989f(int i, long j, int i2, String str, long j2, String str2, long j3, String str3, long j4, long j5, String str4, Integer num) {
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            C87412m.m108594g(str5, "sessionId");
            C87412m.m108594g(str6, "fromUsername");
            C87412m.m108594g(str7, "toUsername");
            GameLifeSessionStruct a = mo62984a(2, 202, (long) i, j, j5);
            a.f107933o = (long) i2;
            a.f107934p = a.mo86045b("SessionId", str5, true);
            a.f107929k = j2;
            a.f107930l = a.mo86045b("from_username", str6, true);
            a.f107931m = j3;
            a.f107932n = a.mo86045b("to_username", str7, true);
            a.f107928j = a.mo86045b("ActionStatus", str4, true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_type", j4);
            if (num != null) {
                jSONObject.put("unreadnum", num.intValue());
            }
            a.mo62729s(URLEncoder.encode(jSONObject.toString()));
            Log.m105918d("Report.Kv20488", "vir:" + a.mo1006q());
            a.mo86054n();
        }

        /* renamed from: h */
        public final void mo62990h(int i, int i2, String str, int i3, long j) {
            String str2 = str;
            C87412m.m108594g(str, "tabKey");
            GameLifeSessionStruct a = mo62984a(1, 101, (long) i, 1, j);
            a.f107933o = (long) i2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("red_dot", i3);
            jSONObject.put("tab_key", str);
            a.mo62729s(URLEncoder.encode(jSONObject.toString()));
            a.mo86054n();
        }
    }
}
