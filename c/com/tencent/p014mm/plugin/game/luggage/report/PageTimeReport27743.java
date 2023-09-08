package com.tencent.p014mm.plugin.game.luggage.report;

import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LiteAppCloseWindowEvent;
import com.tencent.p014mm.autogen.events.LiteAppShowStatusChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GameWebPageTimeReportStruct;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743 */
public final class PageTimeReport27743 {

    /* renamed from: a */
    public static final PageTimeReport27743 f113093a = new PageTimeReport27743();

    /* renamed from: b */
    public static IListener<LiteAppShowStatusChangeEvent> f113094b;

    /* renamed from: c */
    public static final IListener<LiteAppCloseWindowEvent> f113095c = new PageTimeReport27743$liteAppDestroyListener$1(C40008f.f107254d);

    /* renamed from: d */
    public static final HashMap<String, String> f113096d = new HashMap<>();

    /* renamed from: e */
    public static List<C41991a> f113097e = new LinkedList();

    /* renamed from: f */
    public static long f113098f;

    /* renamed from: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$a */
    public static final class C41991a {

        /* renamed from: a */
        public String f113099a;

        /* renamed from: b */
        public long f113100b;

        /* renamed from: c */
        public long f113101c;

        /* renamed from: d */
        public String f113102d;

        /* renamed from: e */
        public long f113103e;

        /* renamed from: f */
        public long f113104f;
    }

    /* renamed from: a */
    public final void mo65887a(int i, long j, long j2, String str, String str2) {
        Bundle b = C41864d.m45385b();
        String string = b.getString("session_id", "");
        long j3 = b.getLong("client_timestamp", 0);
        GameWebPageTimeReportStruct gameWebPageTimeReportStruct = new GameWebPageTimeReportStruct();
        gameWebPageTimeReportStruct.f107937d = i;
        gameWebPageTimeReportStruct.f107938e = j;
        gameWebPageTimeReportStruct.f107939f = gameWebPageTimeReportStruct.mo86045b("session_id", string, true);
        gameWebPageTimeReportStruct.f107940g = j2;
        gameWebPageTimeReportStruct.f107942i = j3;
        gameWebPageTimeReportStruct.f107943j = gameWebPageTimeReportStruct.mo86045b("URL", str, true);
        gameWebPageTimeReportStruct.f107944k = gameWebPageTimeReportStruct.mo86045b("extern_info", str2, true);
        gameWebPageTimeReportStruct.mo86054n();
        Log.m105925i("MicroMsg.GamePageTimeReport", "gamelog.report, null, report, scene:%d, stayTimeSec:%d, sessionId:%s, ssid:%s, client_timestamp:%d, url:%s, extInfo:%s", Long.valueOf(j), Integer.valueOf(i), string, Long.valueOf(j2), Long.valueOf(j3), str, str2);
    }
}
