package com.tencent.p014mm.booter;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import zt3.C119146d;
import zt3.C119153f;

/* renamed from: com.tencent.mm.booter.j0 */
public class C114714j0 implements C119146d.C119151f {
    public C114714j0(C80824k0 k0Var) {
    }

    /* renamed from: a */
    public void mo174283a(String str, int i, C119153f fVar, long j, long j2, String str2, boolean z) {
        if (fVar == C119153f.CREATED) {
            StringBuilder sb = new StringBuilder();
            sb.append("====== ");
            sb.append(str);
            sb.append("@");
            sb.append(i);
            sb.append(" state=");
            sb.append(fVar);
            sb.append(" delay=");
            long j3 = 0;
            if (j >= 0) {
                j3 = j / TimeUtil.SECOND_TO_US;
            }
            sb.append(j3);
            sb.append(LocaleUtil.MALAY);
            Log.m105924i("MicroMsg.ThreadBootDelegate", sb.toString());
        } else if (fVar == C119153f.RUNNING) {
            Log.m105924i("MicroMsg.ThreadBootDelegate", ">>>>>> " + str + "@" + i + " state=" + fVar + " pool=" + str2);
        } else if (fVar == C119153f.COMPLETE) {
            Log.m105924i("MicroMsg.ThreadBootDelegate", "<<<<<< " + str + "@" + i + " state=" + fVar + " cost=" + j + "ms pool=" + str2);
        } else if (fVar == C119153f.CANCEL) {
            Log.m105924i("MicroMsg.ThreadBootDelegate", "|||||| " + str + "@" + i + " state=" + fVar);
        } else if (fVar == C119153f.THROW) {
            Log.m105924i("MicroMsg.ThreadBootDelegate", "****** " + str + "@" + i + " state=" + fVar);
        }
    }

    /* renamed from: b */
    public void mo174284b(String str, int i, Throwable th) {
        Log.m105920e("MicroMsg.ThreadBootDelegate", str + "@" + i + " " + th);
    }

    /* renamed from: c */
    public void mo174285c(String str, int i, int i2, long j, String str2) {
        Log.m105928w("MicroMsg.ThreadBootDelegate", "[wait] " + str + "@" + i + " runningCount=" + i2 + " waitFor=" + (j / 100000) + "ms pool=" + str2);
    }

    /* renamed from: d */
    public void mo174286d(String str, int i, String str2, boolean z) {
        if (!z) {
            Log.m105928w("MicroMsg.ThreadBootDelegate", "[rejected] " + str + " pool=" + str2);
        }
    }

    public void shutdown() {
        Log.m105928w("MicroMsg.ThreadBootDelegate", "shutdown");
    }
}
