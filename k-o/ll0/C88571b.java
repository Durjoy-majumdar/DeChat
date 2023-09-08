package ll0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84954e1;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: ll0.b */
public class C88571b extends SyncTask<int[]> {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f255816a;

    /* renamed from: b */
    public final /* synthetic */ C88572c f255817b;

    public C88571b(C88572c cVar, C83780d1 d1Var) {
        this.f255817b = cVar;
        this.f255816a = d1Var;
    }

    public Object run() {
        C88572c cVar = this.f255817b;
        C83780d1 d1Var = this.f255816a;
        cVar.getClass();
        C84954e1 b = C84947c0.m104714b(d1Var);
        if (b == null) {
            return null;
        }
        return new int[]{b.mo117825h().getSelectionStart(), b.mo117825h().getSelectionEnd()};
    }
}
