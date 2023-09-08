package p1206p4;

import androidx.work.impl.WorkDatabase;
import p1188d4.C116562b;
import p1191e4.C116683a;
import p1223z3.C119038g;

/* renamed from: p4.i */
public class C117977i extends C119038g.C119040b {
    /* renamed from: a */
    public void mo182733a(C116562b bVar) {
        C116683a aVar = (C116683a) bVar;
        aVar.mo180682a();
        try {
            int i = WorkDatabase.f338356k;
            aVar.mo180684c("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f338355j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.mo180688g();
        } finally {
            aVar.mo180683b();
        }
    }
}
