package ea1;

import android.os.Process;
import com.tencent.p014mm.autogen.mmdata.rpt.SessionFlowMergeStatStruct;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import kj2.C61103a;
import org.json.JSONObject;
import te3.C118430fa3;
import te3.C22505ka3;

/* renamed from: ea1.c */
public final class C116714c {
    /* renamed from: a */
    public static JSONObject m164601a(C118430fa3 fa32) {
        long j = 0;
        if (fa32.f353993g <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, C115411b.m162225h(fa32.f353996j));
            long j2 = fa32.f353994h - fa32.f353993g;
            if (j2 > 0) {
                j = j2;
            }
            jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, j);
            jSONObject.put("count", 1);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m164602b(C22505ka3 ka32) {
        long j = 0;
        if (ka32.f64092i <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, C115411b.m162219b(ka32.f64087d));
            long j2 = ka32.f64093j - ka32.f64092i;
            if (j2 > 0) {
                j = j2;
            }
            jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, j);
            jSONObject.put("count", 1);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m164603c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        Log.m105925i("HABBYGE-MALI.HellSessionMergeReport", "reportSessionMerge: %s", str);
        List<String> f = C61103a.m71623f(str.replace(',', '#'), 5120);
        if (f == null) {
            return false;
        }
        SessionFlowMergeStatStruct sessionFlowMergeStatStruct = new SessionFlowMergeStatStruct();
        sessionFlowMergeStatStruct.f343815d = Process.myPid();
        sessionFlowMergeStatStruct.f343816e = sessionFlowMergeStatStruct.mo86045b("PName", C86709a0.m107531m().mo58407a().f124988a, true);
        sessionFlowMergeStatStruct.f343817f = (long) C61103a.m71624h();
        ArrayList arrayList = (ArrayList) f;
        sessionFlowMergeStatStruct.f343819h = (long) arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            sessionFlowMergeStatStruct.f343818g = (long) i;
            sessionFlowMergeStatStruct.f343820i = sessionFlowMergeStatStruct.mo86045b("DataContent", (String) arrayList.get(i), false);
            sessionFlowMergeStatStruct.mo86054n();
        }
        return true;
    }
}
