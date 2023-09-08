package com.tencent.p014mm.plugin.webview.p128ui.tools.game;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.GameCommOperationEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.b */
public class C44030b {

    /* renamed from: a */
    public long f119293a = 0;

    /* renamed from: b */
    public long f119294b = 0;

    /* renamed from: c */
    public long f119295c = 0;

    /* renamed from: d */
    public long f119296d = 0;

    /* renamed from: e */
    public Bundle f119297e;

    /* renamed from: f */
    public C44031a f119298f = new C44031a();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.b$a */
    public class C44031a {
        public C44031a() {
        }

        /* renamed from: a */
        public void mo68638a() {
            Matcher matcher;
            String str;
            C44030b bVar = C44030b.this;
            if (bVar.f119295c != 0) {
                bVar.f119293a = System.currentTimeMillis() - bVar.f119295c;
                if (bVar.f119296d != 0) {
                    bVar.f119294b += System.currentTimeMillis() - bVar.f119296d;
                }
                Log.m105925i("MicroMsg.GamePageTimeReport", "visit page(%s), stayTime:%sms, foregroundTime:%sms", Integer.valueOf(bVar.hashCode()), Long.valueOf(bVar.f119293a), Long.valueOf(bVar.f119294b));
                Bundle bundle = bVar.f119297e;
                if (bundle == null) {
                    Log.m105924i("MicroMsg.GamePageTimeReport", "report game page time fail. ReportData is null");
                    return;
                }
                String string = bundle.getString("game_page_report_format_data");
                String string2 = bVar.f119297e.getString("game_page_report_tabs_format_data");
                if (!Util.isNullOrNil(string)) {
                    String replace = string.replace("__ALLSTAYTIME__", String.valueOf(bVar.f119293a / 1000)).replace("__FOREGROUNDTIME__", String.valueOf(bVar.f119294b / 1000));
                    bVar.f119297e.putString("game_page_report_format_data", replace);
                    Log.m105925i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportFormatData:%s", Integer.valueOf(bVar.hashCode()), replace);
                } else if (!Util.isNullOrNil(string2)) {
                    Matcher matcher2 = Pattern.compile("\\(.*?\\)").matcher(string2);
                    while (matcher2.find()) {
                        try {
                            String nullAsNil = Util.nullAsNil(matcher2.group());
                            String replace2 = nullAsNil.replace("(", "").replace(")", "").replace(" ", "");
                            if (replace2.contains("__ALLSTAYTIME__")) {
                                matcher = matcher2;
                                String replace3 = replace2.replace("__ALLSTAYTIME__", String.valueOf(bVar.f119293a / 1000));
                                String[] split = replace3.split("\\+");
                                if (split.length == 2) {
                                    replace3 = String.valueOf(Util.safeParseLong(split[0]) + Util.safeParseLong(split[1]));
                                }
                                str = string2.replace(nullAsNil, replace3);
                            } else {
                                matcher = matcher2;
                                if (nullAsNil.contains("__FOREGROUNDTIME__")) {
                                    String replace4 = replace2.replace("__FOREGROUNDTIME__", String.valueOf(bVar.f119294b / 1000));
                                    String[] split2 = replace4.split("\\+");
                                    if (split2.length == 2) {
                                        replace4 = String.valueOf(Util.safeParseLong(split2[0]) + Util.safeParseLong(split2[1]));
                                    }
                                    str = string2.replace(nullAsNil, replace4);
                                } else {
                                    matcher2 = matcher;
                                }
                            }
                            string2 = str;
                            matcher2 = matcher;
                        } catch (NumberFormatException e) {
                            Log.m105925i("MicroMsg.GamePageTimeReport", "matchTimeMark, err:%s", e.getMessage());
                            string2 = null;
                        }
                    }
                    if (!Util.isNullOrNil(string2)) {
                        bVar.f119297e.putString("game_page_report_tabs_format_data", string2);
                        Log.m105925i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportTabsFormatdata:%s", Integer.valueOf(bVar.hashCode()), string2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                if (MMApplicationContext.isMMProcess()) {
                    C44030b.m48316a(bVar.f119297e);
                } else {
                    bVar.mo65810b(bVar.f119297e);
                }
                bVar.f119297e = null;
            }
        }

        /* renamed from: b */
        public void mo68639b() {
            C44030b.this.f119295c = System.currentTimeMillis();
            C44030b.this.f119296d = System.currentTimeMillis();
        }

        /* renamed from: c */
        public void mo68640c() {
            C44030b bVar = C44030b.this;
            if (bVar.f119296d != 0) {
                bVar.f119294b += System.currentTimeMillis() - C44030b.this.f119296d;
            }
        }

        /* renamed from: d */
        public void mo68641d(Bundle bundle) {
            C44030b.this.f119297e = bundle;
            Log.m105924i("MicroMsg.GamePageTimeReport", "setGamePageReportData");
            if (bundle != null && bundle.getBoolean("game_page_report_time_begin")) {
                C44030b bVar = C44030b.this;
                bVar.f119294b = 0;
                bVar.f119295c = System.currentTimeMillis();
                C44030b.this.f119296d = System.currentTimeMillis();
            }
        }

        /* renamed from: e */
        public void mo68642e() {
            C44030b bVar = C44030b.this;
            if (bVar.f119296d != 0) {
                bVar.f119296d = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: a */
    public static void m48316a(Bundle bundle) {
        Set<String> keySet;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String next : keySet) {
                    jSONObject.put(next, bundle.get(next));
                }
                GameCommOperationEvent gameCommOperationEvent = new GameCommOperationEvent();
                GameCommOperationEvent.C1072a aVar = gameCommOperationEvent.f9268d;
                aVar.f9270a = 4;
                aVar.f9271b = jSONObject.toString();
                gameCommOperationEvent.publish();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo65810b(Bundle bundle) {
        throw null;
    }
}
