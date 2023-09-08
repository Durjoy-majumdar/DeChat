package sf0;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;
import p286zl.C79395i;

/* renamed from: sf0.b */
public class C77687b implements C79395i {

    /* renamed from: a */
    public C77697k f226468a;

    /* renamed from: b */
    public C77699l f226469b;

    /* renamed from: c */
    public C77700m f226470c;

    /* renamed from: d */
    public C77693i f226471d;

    /* renamed from: e */
    public C77696j f226472e;

    /* renamed from: f */
    public C77692h f226473f;

    /* renamed from: a */
    public void mo107840a() {
        mo107841b(this.f226468a);
        mo107841b(this.f226469b);
        mo107841b(this.f226470c);
        mo107841b(this.f226471d);
        mo107841b(this.f226472e);
        mo107841b(this.f226473f);
    }

    /* renamed from: b */
    public final void mo107841b(C77688c cVar) {
        if (cVar != null) {
            Iterator it = ((HashSet) cVar.f226474d).iterator();
            while (it.hasNext()) {
                C86709a0.m107524d().mo123470p(((Integer) it.next()).intValue(), cVar);
            }
            cVar.f226475e = null;
        }
    }

    /* renamed from: c */
    public boolean mo107842c(Activity activity, C77701p0 p0Var) {
        int i = p0Var.f226480a;
        if (i == 0 || p0Var.f226481b == 0) {
            return false;
        }
        switch (i) {
            case 1:
                if (this.f226468a == null) {
                    this.f226468a = new C77697k(activity);
                }
                this.f226468a.mo107848f(p0Var);
                return true;
            case 2:
                if (this.f226469b == null) {
                    this.f226469b = new C77699l(activity);
                }
                this.f226469b.mo107848f(p0Var);
                return true;
            case 3:
                if (this.f226470c == null) {
                    this.f226470c = new C77700m(activity);
                }
                this.f226470c.mo107848f(p0Var);
                return true;
            case 4:
                if (this.f226471d == null) {
                    this.f226471d = new C77693i(activity);
                }
                this.f226471d.mo107848f(p0Var);
                return true;
            case 5:
                if (this.f226472e == null) {
                    this.f226472e = new C77696j(activity);
                }
                this.f226472e.mo107848f(p0Var);
                return true;
            case 6:
                if (this.f226473f == null) {
                    this.f226473f = new C77692h(activity);
                }
                this.f226473f.mo107848f(p0Var);
                return true;
            default:
                Log.m105920e("MicroMsg.BaseErrorHelper", "Unkown error type");
                return false;
        }
    }
}
