package ea1;

import ba1.C113152d;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.report.HellCommonReportStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import e91.C116711b;
import f91.C116850b;
import j81.C117302a;
import j81.C87906e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;
import op3.C117877b;
import op3.C117882j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t81.C118407g;
import t81.C118412l;
import te3.C118427eg2;
import te3.C118430fa3;
import te3.C118434gg2;
import te3.C22505ka3;
import u24.C90599h;

/* renamed from: ea1.d */
public final class C116715d {
    /* renamed from: a */
    public static JSONArray m164604a(List<C118427eg2> list, JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = jSONObject;
        long j2 = j;
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        long j3 = 0;
        while (i < list.size()) {
            try {
                C118427eg2 eg22 = list.get(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("pageName", eg22.f353969d);
                jSONObject3.put("tbe", eg22.f353970e);
                long max = Math.max(eg22.f353971f, 0);
                jSONObject3.put(LocaleUtil.INDONESIAN_NEWNAME, max);
                j3 += max;
                if (i == 0) {
                    jSONObject2.put("tbe", eg22.f353970e);
                }
                long j4 = j;
                C116718g.m164615b(jSONObject3, eg22, false, j4);
                C116718g.m164616c(jSONObject3, eg22, j4);
                jSONArray.put(jSONObject3);
                i++;
            } catch (JSONException e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionPageDetailReport", e, "createPagePathJsonArray json crash", new Object[0]);
            }
        }
        jSONObject2.put(LocaleUtil.INDONESIAN_NEWNAME, Math.max(j3, 0));
        return jSONArray;
    }

    /* renamed from: b */
    public static String m164605b(C118434gg2 gg22, String str) {
        Iterator<C22505ka3> it = gg22.f354028f.iterator();
        while (it.hasNext()) {
            C22505ka3 next = it.next();
            if (next != null && next.f64087d.equals(str)) {
                return C115411b.m162226i(next.f64102v);
            }
        }
        Iterator<C118430fa3> it4 = gg22.f354030h.iterator();
        while (it4.hasNext()) {
            C118430fa3 next2 = it4.next();
            if (next2 != null) {
                if (!next2.f353990d.equals(str)) {
                    if ((next2.f353996j + "_" + next2.f353993g).equals(str)) {
                    }
                }
                return C115411b.m162226i(next2.f354000q);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m164606c(List<C117877b<String, String>> list) {
        String str;
        boolean z;
        int i = C116711b.m164584i();
        if (i == 0) {
            str = "-1";
        } else {
            str = C116850b.m164833c("mmkv_key_hellSenPageFlRptChe_" + i);
            if (str == null || str.isEmpty()) {
                str = null;
            }
        }
        String a = C113152d.m154820a(str);
        if (a != null && !a.isEmpty()) {
            try {
                String[] split = a.split("\\|");
                if (split.length > 0) {
                    if (split.length == 1) {
                        String[] split2 = split[0].split("-");
                        if (split2.length == 2) {
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.add(C117882j.m166284c(split2[0], split2[1]));
                        }
                    } else {
                        for (String str2 : split) {
                            if (str2 != null) {
                                String[] split3 = str2.split("-");
                                if (split3.length == 2) {
                                    if (list == null) {
                                        list = new ArrayList<>();
                                    }
                                    list.add(C117882j.m166284c(split3[0], split3[1]));
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionPageDetailReport", e, "restoreSessionMap crash: %s", e.getMessage());
            }
        }
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = false;
            for (C117877b next : list) {
                String str3 = (String) next.mo182596a(1);
                if (str3 != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(str3).optJSONArray("content");
                        if (optJSONArray.length() > 0) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                if (optJSONObject != null && optJSONObject.optLong("pagePathId", 0) == 1179880) {
                                    C117407d.INSTANCE.mo160131h(19354, 9);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        Log.printErrStackTrace("HABBYGE-MALI.HellSessionPageDetailReport", e2, "realReportFlow, crash: %s", e2.getMessage());
                    }
                }
                String str4 = (String) next.mo182596a(0);
                if (str3 != null) {
                    int length = str3.length();
                    if (length >= 1900) {
                        int i3 = length / WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID;
                        int i4 = length % WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID;
                        for (int i5 = 0; i5 < i3; i5++) {
                            int i6 = i5 * WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID;
                            Log.m105925i("HABBYGE-MALI.HellSessionPageDetailReport", "reportSessionPageDetail-item-%d: %s, %s", Integer.valueOf(i5), str4, str3.substring(i6, i6 + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID));
                        }
                        if (i4 > 0) {
                            Log.m105925i("HABBYGE-MALI.HellSessionPageDetailReport", "reportSessionPageDetail-item-left: %s, %s", str4, str3.substring(i3 * WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID));
                        }
                    } else {
                        Log.m105925i("HABBYGE-MALI.HellSessionPageDetailReport", "reportSessionPageDetail-item: %s, %s", str4, str3);
                    }
                }
                HellCommonReportStruct.m117909s(Util.getInt((String) next.mo182596a(0), -1), str3, 5120);
                for (C117877b next2 : list) {
                    C118412l lVar = C117302a.xx0().f351171d;
                    String str5 = (String) next2.mo182596a(1);
                    int parseInt = Integer.parseInt((String) next2.mo182596a(0));
                    lVar.getClass();
                    if (C87906e.m109416j()) {
                        if (parseInt <= 0 || C90599h.m113511d(str5)) {
                            Log.m105920e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageSingle data or sessionPageID isEmpty!");
                        } else {
                            C87906e.m109407a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageSingle reportID : " + parseInt + ", data : " + str5);
                            lVar.f353895b.post(new C118407g(lVar, parseInt, System.currentTimeMillis(), str5));
                        }
                    }
                }
                z = true;
            }
        }
        if (z) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            int i7 = C116711b.m164584i();
            if (i7 != 0) {
                if (valueOf == null) {
                    valueOf = "";
                }
                try {
                    C116850b.m164835e("mmkv_key_hellSenPageFlRptChe_" + i7, valueOf);
                } catch (Exception e3) {
                    Log.printErrStackTrace("HABBYGE-MALI.HellSessionPageDao", e3, "HellSessionReportCache.writeBackOfFlow", new Object[0]);
                }
            }
        }
    }
}
