package mv0;

import android.content.Intent;
import com.tencent.p014mm.service.C116024c;
import gv0.C20842c;
import ke3.C88144b;
import org.xwalk.core.XWalkEnvironment;
import yu0.C102908a;
import yu0.C102910f;

/* renamed from: mv0.a */
public class C99980a extends C102910f {

    /* renamed from: n */
    public static C99980a f292928n;

    /* renamed from: k */
    public C99990k f292929k;

    /* renamed from: l */
    public C99981d f292930l;

    /* renamed from: m */
    public C88850b f292931m;

    /* renamed from: h */
    public static C99980a m130643h() {
        if (f292928n == null) {
            C99980a aVar = new C99980a();
            f292928n = aVar;
            C102908a.m136012a(aVar);
        }
        return f292928n;
    }

    /* renamed from: b */
    public void mo17656b() {
        f292928n = null;
    }

    /* renamed from: c */
    public void mo17657c(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            m130643h().mo139320i().mo123242h();
            C20842c.m22881n1();
            C116024c.m163165e(new Intent().setClassName(objArr[0], "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService"), XWalkEnvironment.MODULE_MM, true, C88144b.m109786e(XWalkEnvironment.MODULE_MM));
        }
    }

    /* renamed from: f */
    public void mo17658f() {
    }

    /* renamed from: g */
    public void mo17659g() {
    }

    /* renamed from: i */
    public C88850b mo139320i() {
        if (this.f292931m == null) {
            this.f292931m = new C88850b();
        }
        return this.f292931m;
    }

    /* renamed from: j */
    public C99981d mo139321j() {
        if (this.f292930l == null) {
            this.f292930l = new C99981d();
        }
        return this.f292930l;
    }

    /* renamed from: k */
    public C99990k mo139322k() {
        if (this.f292929k == null) {
            this.f292929k = new C99990k();
        }
        return this.f292929k;
    }
}
