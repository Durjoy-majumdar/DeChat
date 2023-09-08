package f40;

import bp3.C79760s;
import h40.C87422a;
import hp3.C87581a;
import j40.C46396a;

/* renamed from: f40.c0 */
public class C86717c0 implements C87581a<Void, Object> {

    /* renamed from: a */
    public final /* synthetic */ C87422a f251741a;

    /* renamed from: b */
    public final /* synthetic */ C46396a f251742b;

    public C86717c0(C86732g0 g0Var, C87422a aVar, C46396a aVar2) {
        this.f251741a = aVar;
        this.f251742b = aVar2;
    }

    /* JADX INFO: finally extract failed */
    public Object call(Object obj) {
        try {
            C79760s.m96908a("boot.configurePlugins()");
            this.f251741a.mo121841c(this.f251742b);
            C79760s.m96909b();
            return null;
        } catch (Throwable th) {
            C79760s.m96909b();
            throw th;
        }
    }
}
