package com.tencent.p014mm.game.report;

import com.tencent.p014mm.autogen.events.GetCurrentChannelEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GameChatRoomReportStruct;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.json.JSONUtils;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.game.report.d */
public final class C40308d {

    /* renamed from: a */
    public static final C40309a f108375a = new C40309a((C8480h) null);

    /* renamed from: b */
    public static String f108376b = "";

    /* renamed from: c */
    public static String f108377c = "";

    /* renamed from: d */
    public static String f108378d = "";

    /* renamed from: e */
    public static String f108379e;

    /* renamed from: com.tencent.mm.game.report.d$a */
    public static final class C40309a {
        public C40309a(C8480h hVar) {
        }

        /* renamed from: i */
        public static /* synthetic */ void m43461i(C40309a aVar, long j, long j2, long j3, long j4, long j5, long j6, String str, long j7, String str2, String str3, int i, int i2, Object obj) {
            aVar.mo62996f(j, j2, j3, j4, j5, j6, str, j7, str2, str3, (i2 & 1024) != 0 ? -1 : i);
        }

        /* renamed from: j */
        public static /* synthetic */ void m43462j(C40309a aVar, long j, long j2, long j3, long j4, long j5, String str, long j6, int i, String str2, int i2, Object obj) {
            aVar.mo62998h(j, j2, j3, j4, j5, str, j6, i, (i2 & 256) != 0 ? "{}" : str2);
        }

        /* renamed from: a */
        public final GameChatRoomReportStruct mo62991a(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            GameChatRoomReportStruct gameChatRoomReportStruct = new GameChatRoomReportStruct();
            gameChatRoomReportStruct.f107903d = j;
            gameChatRoomReportStruct.f107904e = j2;
            gameChatRoomReportStruct.f107905f = j3;
            gameChatRoomReportStruct.f107906g = j4;
            gameChatRoomReportStruct.f107907h = j5;
            gameChatRoomReportStruct.f107908i = j6;
            gameChatRoomReportStruct.f107909j = j7;
            gameChatRoomReportStruct.f107918s = Util.getLong(C40308d.f108378d, 0);
            gameChatRoomReportStruct.f107920u = gameChatRoomReportStruct.mo86045b("session_id", C41864d.m45385b().getString("session_id"), true);
            gameChatRoomReportStruct.f107921v = C41864d.m45385b().getLong("client_timestamp");
            return gameChatRoomReportStruct;
        }

        /* renamed from: b */
        public final void mo62992b(long j, long j2, long j3, long j4) {
            m43461i(this, 1305, j, j2, 0, j3, j4, C40308d.f108377c, 0, "", "", 0, 1024, (Object) null);
        }

        /* renamed from: c */
        public final void mo62993c(long j, long j2, long j3, long j4, String str) {
            String str2 = str;
            C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            m43461i(this, 1324, j, j2, 0, j3, j4, C40308d.f108377c, 0, "", jSONObject2, 0, 1024, (Object) null);
        }

        /* renamed from: d */
        public final void mo62994d(long j, long j2, long j3) {
            GameChatRoomReportStruct a = mo62991a(13, j, 0, 1, 0, j2, j3);
            a.mo62727s(C40308d.f108376b);
            a.mo62728t(C40308d.f108377c);
            a.mo86054n();
        }

        /* renamed from: e */
        public final void mo62995e(long j, long j2, long j3, long j4, String str) {
            GameChatRoomReportStruct a = mo62991a(13, 1308, j, j2, 0, j3, j4);
            a.mo62728t(C40308d.f108377c);
            a.mo62727s(C40308d.f108376b);
            a.f107915p = a.mo86045b("Username", str, true);
            a.f107917r = a.mo86045b("ExternInfo", a.f107917r, true);
            a.mo86054n();
        }

        /* renamed from: f */
        public final void mo62996f(long j, long j2, long j3, long j4, long j5, long j6, String str, long j7, String str2, String str3, int i) {
            String str4 = str3;
            GameChatRoomReportStruct a = mo62991a(13, j, j2, j3, j4, j5, j6);
            a.mo62728t(str);
            a.mo62727s(C40308d.f108376b);
            a.f107912m = j7;
            a.f107915p = a.mo86045b("Username", str2, true);
            String str5 = C40308d.f108379e;
            if (!(str5 == null || str5.length() == 0)) {
                if (str4 == null || str3.length() == 0) {
                    str4 = C40308d.f108379e;
                } else {
                    try {
                        str4 = JSONUtils.INSTANCE.merge(new JSONObject[]{new JSONObject(str4), new JSONObject(C40308d.f108379e)}, true).toString();
                    } catch (JSONException unused) {
                    }
                }
            }
            a.f107917r = a.mo86045b("ExternInfo", str4 != null ? URLEncoder.encode(str4) : null, true);
            a.f107919t = i;
            a.mo86054n();
        }

        /* renamed from: g */
        public final void mo62997g(long j, long j2, long j3, long j4, long j5, String str, long j6, int i) {
            m43462j(this, j, j2, j3, j4, j5, str, j6, i, (String) null, 256, (Object) null);
        }

        /* renamed from: h */
        public final void mo62998h(long j, long j2, long j3, long j4, long j5, String str, long j6, int i, String str2) {
            JSONObject jSONObject;
            String str3 = str2;
            C87412m.m108594g(str3, "reportJsonStr");
            GetCurrentChannelEvent getCurrentChannelEvent = new GetCurrentChannelEvent();
            getCurrentChannelEvent.publish();
            try {
                jSONObject = new JSONObject(str3);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("belongingtab", i);
            mo62996f(1304, j, j2, j6, j3, j4, C40308d.f108377c, j5, str, jSONObject.toString(), getCurrentChannelEvent.f107591d.f107592a);
        }

        /* renamed from: k */
        public final void mo62999k(long j, long j2, long j3, long j4, long j5, long j6, String str, String str2, String str3) {
            GameChatRoomReportStruct a = mo62991a(10, j, j2, j3, j4, j5, j6);
            a.mo62728t(str);
            a.mo62727s(str2);
            a.f107917r = a.mo86045b("ExternInfo", str3 != null ? URLEncoder.encode(str3) : null, true);
            a.mo86054n();
        }

        /* renamed from: l */
        public final void mo63000l(long j, long j2, long j3, long j4, String str) {
            m43461i(this, 1302, j, j2, 0, j3, j4, C40308d.f108377c, 0, str, "", 0, 1024, (Object) null);
        }

        /* renamed from: m */
        public final void mo63001m(long j, long j2, long j3, long j4, long j5, long j6, String str, String str2, String str3) {
            GameChatRoomReportStruct a = mo62991a(11, j, j2, j3, j4, j5, j6);
            a.mo62728t(str);
            a.mo62727s(str2);
            a.f107917r = a.mo86045b("ExternInfo", str3 != null ? URLEncoder.encode(str3) : null, true);
            a.mo86054n();
        }

        /* renamed from: n */
        public final void mo63002n(long j, long j2, long j3, long j4, long j5, long j6, String str, String str2, String str3) {
            GameChatRoomReportStruct a = mo62991a(11, j, j2, j3, j4, j5, j6);
            a.mo62728t(str);
            a.mo62727s(str2);
            a.f107917r = a.mo86045b("ExternInfo", str3 != null ? URLEncoder.encode(str3) : null, true);
            a.mo86054n();
        }

        /* renamed from: o */
        public final void mo63003o(long j, long j2, long j3, long j4, long j5) {
            mo63004p(j, j2, j3, j4, j5, "{}");
        }

        /* renamed from: p */
        public final void mo63004p(long j, long j2, long j3, long j4, long j5, String str) {
            GetCurrentChannelEvent getCurrentChannelEvent = new GetCurrentChannelEvent();
            getCurrentChannelEvent.publish();
            mo62996f(1311, j, j2, j3, j4, j5, C40308d.f108377c, 0, "", str, getCurrentChannelEvent.f107591d.f107592a);
        }

        /* renamed from: q */
        public final void mo63005q(long j, long j2, long j3, long j4, int i) {
            String str = C40308d.f108377c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("belongingtab", i);
            m43461i(this, 1318, j, j2, 0, j3, j4, str, 0, "", jSONObject.toString(), 0, 1024, (Object) null);
        }

        /* renamed from: r */
        public final void mo63006r(long j, long j2, long j3, long j4, long j5) {
            mo62996f(1323, j, j2, j3, j4, j5, C40308d.f108377c, 0, "", "", 0);
        }
    }

    /* renamed from: a */
    public static final void m43460a(long j, long j2, long j3) {
        GameChatRoomReportStruct a = f108375a.mo62991a(13, 1320, 9, 1, j, j2, j3);
        a.mo62728t(f108377c);
        a.mo62727s(f108376b);
        a.mo86054n();
    }
}
