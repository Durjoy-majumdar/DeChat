package f40;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86016v1;

/* renamed from: f40.k */
public class C31886k implements C86016v1 {

    /* renamed from: a */
    public final /* synthetic */ String f84956a;

    public C31886k(C86744o oVar, String str) {
        this.f84956a = str;
    }

    public boolean accept(C86009m1 m1Var, String str) {
        return str.startsWith(this.f84956a) && !str.equals(this.f84956a);
    }
}
