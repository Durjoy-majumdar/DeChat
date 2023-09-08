package ne0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import he0.C76158j;
import ie0.C46220j;

/* renamed from: ne0.b */
public final class C47227b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f126792d;

    /* renamed from: e */
    public final /* synthetic */ C46220j f126793e;

    /* renamed from: f */
    public final /* synthetic */ long f126794f;

    public C47227b(String str, C46220j jVar, long j) {
        this.f126792d = str;
        this.f126793e = jVar;
        this.f126794f = j;
    }

    public final void run() {
        String str = this.f126792d;
        if (str == null) {
            str = "";
        }
        int i = str.length() == 0 ? 0 : C72996z1.m85843n5(str) ? 3 : C72996z1.m85846q5(str) ? 6 : C45628s0.m50735A(str) ? 4 : C72996z1.m85847r5(str) ? 5 : C72996z1.m85820U5(str) ? 2 : 1;
        C46220j jVar = this.f126793e;
        String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(jVar.field_openImAppId, jVar.field_openImDescWordingId);
        C115669n nVar = C115669n.INSTANCE;
        C46220j jVar2 = this.f126793e;
        nVar.mo160131h(23393, jVar2.field_username, jVar2.field_nickname, jVar2.field_openImAppId, wo, 13, 0, Integer.valueOf(i), this.f126792d, this.f126793e.field_finderUsername, Long.valueOf(this.f126794f));
    }
}
