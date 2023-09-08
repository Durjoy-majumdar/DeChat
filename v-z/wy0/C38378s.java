package wy0;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.storage.C72963f4;
import g62.C75875l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wy0.s */
public final class C38378s implements C75875l.C32329c {
    /* renamed from: w5 */
    public void mo55728w5(C75875l lVar, C75875l.C45886e eVar) {
        ArrayList<C72963f4> arrayList;
        C87412m.m108594g(eVar, "notify");
        if (!CrashReportFactory.isBackupMerge() && (arrayList = eVar.f123846c) != null && !arrayList.isEmpty()) {
            Iterator<C72963f4> it = eVar.f123846c.iterator();
            while (it.hasNext()) {
                C72963f4 next = it.next();
                if (!(next == null || next.getMsgId() == 0)) {
                    C102506a.f301832a.mo142123h(next.getMsgId());
                }
            }
        }
    }
}
