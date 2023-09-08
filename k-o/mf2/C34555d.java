package mf2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72996z1;

/* renamed from: mf2.d */
public final class C34555d {

    /* renamed from: a */
    public static final C34555d f92946a = new C34555d();

    /* renamed from: a */
    public final void mo59636a(C72996z1 z1Var, int i, int i2, long j, String str) {
        int i3 = (!(z1Var != null && z1Var.mo62927s3()) || ((int) z1Var.f108320R1) <= 0) ? 0 : 1;
        String username = z1Var != null ? z1Var.getUsername() : null;
        if (username == null) {
            username = "";
        }
        C115669n.INSTANCE.mo160131h(21647, username, 2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j), str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: b */
    public final void mo59637b(C72996z1 z1Var, int i, int i2, long j, String str) {
        int i3 = (!(z1Var != null && z1Var.mo62927s3()) || ((int) z1Var.f108320R1) <= 0) ? 0 : 1;
        String username = z1Var != null ? z1Var.getUsername() : null;
        if (username == null) {
            username = "";
        }
        C115669n.INSTANCE.mo160131h(21647, username, 1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j), str, Long.valueOf(System.currentTimeMillis()));
    }
}
