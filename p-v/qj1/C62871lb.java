package qj1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;

/* renamed from: qj1.lb */
public final class C62871lb<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62843kb f178405d;

    public C62871lb(C62843kb kbVar) {
        this.f178405d = kbVar;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        if (bool.booleanValue()) {
            C62707db dbVar = (C62707db) this.f178405d.mo87687E0(C62707db.class);
            if (dbVar != null) {
                dbVar.mo87721c1();
            }
            this.f178405d.mo87803a1().mo3431p();
        }
    }
}
