package pv2;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;

/* renamed from: pv2.r */
public enum C12021r {
    INSTANCE;

    /* renamed from: a */
    public void mo11883a(String str, String str2, int i, int i2) {
        int i3;
        Log.m105919d("MicroMsg.SoterReportManager", "SoterReportManager functionName: %s, appId: %s, errType: %d, errCode: %d", str, str2, Integer.valueOf(i), Integer.valueOf(i2));
        str.getClass();
        if (str.equals("requireSoterBiometricAuthentication")) {
            i3 = 0;
        } else if (!str.equals("getSupportSoter")) {
            Log.m105920e("MicroMsg.SoterReportManager", "unknown soter jsapi function name");
            i3 = -1;
        } else {
            i3 = 1;
        }
        Log.m105925i("MicroMsg.SoterReportManager", "functionNameCode: %d", Integer.valueOf(i3));
        if (i3 != -1) {
            C117407d.INSTANCE.mo160131h(13711, Integer.valueOf(i3), str2, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
