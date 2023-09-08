package f40;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30727c5;
import zh3.C91753f;

/* renamed from: f40.m */
public class C86742m implements C91753f.C39361c {

    /* renamed from: a */
    public final /* synthetic */ C86744o f251801a;

    public C86742m(C86744o oVar) {
        this.f251801a = oVar;
    }

    /* renamed from: a */
    public void mo121135a() {
        C30727c5 c5Var = this.f251801a.f251814l;
        if (c5Var != null) {
            c5Var.f82644d.execSQL("TablesVersion", "delete from TablesVersion");
        } else {
            Log.m105920e("MMKernel.CoreStorage", "tablesVersionStorage is null");
        }
    }
}
