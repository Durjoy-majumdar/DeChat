package vb3;

import com.tencent.p014mm.plugin.wallet_core.utils.C30545i;
import com.tencent.p014mm.plugin.wallet_core.utils.C30546j;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import di3.C86312j;
import g62.C75875l;
import ie3.C76328d;
import tb3.C77880b;

/* renamed from: vb3.e */
public class C37711e implements C75875l.C32329c {
    /* renamed from: w5 */
    public void mo55728w5(C75875l lVar, C75875l.C45886e eVar) {
        ((C77880b) C86312j.m106911c(C77880b.class)).getClass();
        if (!CrashReportFactory.isBackupMerge() && lVar != null && eVar != null && eVar.f123846c != null) {
            C30546j jVar = new C30546j();
            String str = eVar.f123845b;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1335458389:
                    if (str.equals("delete")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1183792455:
                    if (str.equals("insert")) {
                        c = 1;
                        break;
                    }
                    break;
                case -838846263:
                    if (str.equals("update")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    jVar.mo57475a(eVar.f123846c, C30545i.DELETE);
                    return;
                case 1:
                    jVar.mo57475a(eVar.f123846c, C30545i.ADD);
                    ((C76328d) C86312j.m106911c(C76328d.class)).mo106558Ih(eVar);
                    return;
                case 2:
                    jVar.mo57475a(eVar.f123846c, C30545i.MODIFY);
                    return;
                default:
                    return;
            }
        }
    }
}
