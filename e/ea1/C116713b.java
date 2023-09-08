package ea1;

import android.os.Process;
import com.tencent.p014mm.autogen.mmdata.rpt.SessionFlowSingleStatStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import kj2.C61103a;

/* renamed from: ea1.b */
public final class C116713b {
    /* renamed from: a */
    public static boolean m164600a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        Log.m105925i("HABBYGE-MALI.HellSessionDetailReport", "reportSessionDetail: %s", str);
        List<String> f = C61103a.m71623f(str.replace(',', '#'), 5120);
        if (f == null) {
            return false;
        }
        SessionFlowSingleStatStruct sessionFlowSingleStatStruct = new SessionFlowSingleStatStruct();
        sessionFlowSingleStatStruct.f343821d = Process.myPid();
        sessionFlowSingleStatStruct.f343822e = sessionFlowSingleStatStruct.mo86045b("PName", C86709a0.m107531m().mo58407a().f124988a, true);
        sessionFlowSingleStatStruct.f343823f = (long) C61103a.m71624h();
        ArrayList arrayList = (ArrayList) f;
        sessionFlowSingleStatStruct.f343825h = (long) arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            sessionFlowSingleStatStruct.f343824g = (long) i;
            sessionFlowSingleStatStruct.f343826i = sessionFlowSingleStatStruct.mo86045b("DataContent", (String) arrayList.get(i), false);
            sessionFlowSingleStatStruct.mo86054n();
        }
        return true;
    }
}
