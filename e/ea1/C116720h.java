package ea1;

import android.os.Process;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.autogen.mmdata.rpt.SessionUBAStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kj2.C61103a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C118427eg2;
import te3.C118430fa3;
import te3.C22505ka3;

/* renamed from: ea1.h */
public final class C116720h {
    /* renamed from: a */
    public static JSONArray m164625a(Map<String, List<C118427eg2>> map, C22505ka3 ka32) {
        C22505ka3 ka33 = ka32;
        JSONArray jSONArray = new JSONArray();
        List<C118427eg2> list = map.get(ka33.f64087d);
        if (list == null || list.isEmpty()) {
            Log.m105920e("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForSession: NULL");
            return jSONArray;
        }
        JSONObject jSONObject = null;
        long j = 0;
        try {
            int i = 0;
            for (C118427eg2 eg22 : list) {
                if (eg22 != null) {
                    jSONObject = new JSONObject();
                    jSONObject.put("pageName", eg22.f353969d);
                    jSONObject.put("tbe", eg22.f353970e);
                    jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, eg22.f353971f);
                    j += eg22.f353971f;
                    i++;
                    C116718g.m164615b(jSONObject, eg22, true, -1);
                    jSONArray.put(jSONObject);
                }
            }
            long j2 = ka33.f64093j;
            long j3 = ka33.f64092i;
            long j4 = j2 - j3;
            if (j4 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                ka33.f64093j = j3 + j;
            } else if (i == 1) {
                jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, j4);
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBAReport", e, "pagePathJsonArrayForSession json crash", new Object[0]);
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONArray m164626b(Map<String, List<C118427eg2>> map, C118430fa3 fa32) {
        C118430fa3 fa33 = fa32;
        JSONArray jSONArray = new JSONArray();
        String str = fa33.f353996j;
        if (str != null && !str.isEmpty()) {
            String str2 = fa33.f353996j + "_" + fa33.f353993g;
            Log.m105925i("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage, unknonwSessionId: %s", str2);
            List<C118427eg2> list = map.get(str2);
            if (list == null || list.isEmpty()) {
                Log.m105920e("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage, unknowPageFlow NULL");
            } else {
                JSONObject jSONObject = null;
                long j = 0;
                try {
                    int i = 0;
                    for (C118427eg2 eg22 : list) {
                        if (eg22 != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("pageName", eg22.f353969d);
                            jSONObject.put("tbe", eg22.f353970e);
                            jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, eg22.f353971f);
                            j += eg22.f353971f;
                            i++;
                            jSONArray.put(jSONObject);
                        }
                    }
                    long j2 = fa33.f353994h;
                    long j3 = fa33.f353993g;
                    long j4 = j2 - j3;
                    if (j4 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                        fa33.f353994h = j3 + j;
                    } else if (i == 1) {
                        jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, j4);
                    }
                    Log.m105925i("HABBYGE-MALI.HellSessionUBAReport", "pagePathJsonArrayForUnknowPage: %s", jSONArray.toString());
                } catch (JSONException e) {
                    Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBAReport", e, "pagePathJsonArrayForUnknowPage json crash", new Object[0]);
                }
                return jSONArray;
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static boolean m164627c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        Log.m105925i("HABBYGE-MALI.HellSessionUBAReport", "HellSessionUBAReport, reportSessionUBA: %s", str);
        List<String> f = C61103a.m71623f(str.replace(',', '#'), 5120);
        if (f == null) {
            return false;
        }
        SessionUBAStruct sessionUBAStruct = new SessionUBAStruct();
        sessionUBAStruct.f343827d = Process.myPid();
        sessionUBAStruct.f343828e = sessionUBAStruct.mo86045b("PName", C86709a0.m107531m().mo58407a().f124988a, true);
        sessionUBAStruct.f343829f = (long) C61103a.m71624h();
        ArrayList arrayList = (ArrayList) f;
        sessionUBAStruct.f343831h = (long) arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            sessionUBAStruct.f343830g = (long) i;
            sessionUBAStruct.f343832i = sessionUBAStruct.mo86045b("DataContent", (String) arrayList.get(i), true);
            sessionUBAStruct.mo86054n();
        }
        return true;
    }
}
