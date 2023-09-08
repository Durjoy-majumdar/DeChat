package dp1;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import java.util.ArrayList;
import p143ds.C58434o;

/* renamed from: dp1.t1 */
public final class C107059t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<String> f320471d;

    public C107059t1(ArrayList<String> arrayList) {
        this.f320471d = arrayList;
    }

    public final void run() {
        long j = 0;
        for (String M1 : this.f320471d) {
            long j2 = (long) ((C58434o) C86312j.m106911c(C58434o.class)).mo82774M1(M1).f273443a;
            j += j2;
            C107060u1 u1Var = C107060u1.f320472a;
            if (j2 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                C107060u1.m144952a(u1Var, 234, 0, 2, (Object) null);
            } else if (j2 < 10000) {
                C107060u1.m144952a(u1Var, 235, 0, 2, (Object) null);
            } else if (j2 < 15000) {
                C107060u1.m144952a(u1Var, 236, 0, 2, (Object) null);
            } else if (j2 < 20000) {
                C107060u1.m144952a(u1Var, 237, 0, 2, (Object) null);
            } else if (j2 < 30000) {
                C107060u1.m144952a(u1Var, 238, 0, 2, (Object) null);
            } else if (j2 < 40000) {
                C107060u1.m144952a(u1Var, 239, 0, 2, (Object) null);
            } else if (j2 < 50000) {
                C107060u1.m144952a(u1Var, 240, 0, 2, (Object) null);
            } else if (j2 < 60000) {
                C107060u1.m144952a(u1Var, 241, 0, 2, (Object) null);
            }
        }
        C107060u1 u1Var2 = C107060u1.f320472a;
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(1371, 231, j, false);
        if (j < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            C107060u1.m144952a(u1Var2, 242, 0, 2, (Object) null);
        } else if (j < 10000) {
            C107060u1.m144952a(u1Var2, 243, 0, 2, (Object) null);
        } else if (j < 15000) {
            C107060u1.m144952a(u1Var2, 244, 0, 2, (Object) null);
        } else if (j < 20000) {
            C107060u1.m144952a(u1Var2, 245, 0, 2, (Object) null);
        } else if (j < 30000) {
            C107060u1.m144952a(u1Var2, 246, 0, 2, (Object) null);
        } else if (j < 40000) {
            C107060u1.m144952a(u1Var2, 247, 0, 2, (Object) null);
        } else if (j < 50000) {
            C107060u1.m144952a(u1Var2, 248, 0, 2, (Object) null);
        } else if (j < 60000) {
            C107060u1.m144952a(u1Var2, 249, 0, 2, (Object) null);
        }
        long size = (long) this.f320471d.size();
        nVar.idkeyStat(1371, 250, size, false);
        if (size <= 3) {
            C107060u1.m144952a(u1Var2, 251, 0, 2, (Object) null);
        } else if (size <= 6) {
            C107060u1.m144952a(u1Var2, 252, 0, 2, (Object) null);
        } else if (size <= 10) {
            C107060u1.m144952a(u1Var2, 253, 0, 2, (Object) null);
        } else if (size <= 15) {
            C107060u1.m144952a(u1Var2, 254, 0, 2, (Object) null);
        } else if (size <= 20) {
            C107060u1.m144952a(u1Var2, 255, 0, 2, (Object) null);
        }
    }
}
