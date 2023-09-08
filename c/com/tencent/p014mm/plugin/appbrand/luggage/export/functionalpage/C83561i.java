package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.model.C84140d;
import com.tencent.p014mm.plugin.appbrand.report.model.C84141e;
import com.tencent.p014mm.plugin.appbrand.report.model.C84147j;
import com.tencent.p014mm.plugin.appbrand.report.model.C84153l;
import com.tencent.p014mm.plugin.appbrand.report.model.C84172s;
import com.tencent.p014mm.plugin.appbrand.report.model.C84173t;
import p1044ub.C90630c;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.i */
public class C83561i extends AppBrandPageContainerWC {

    /* renamed from: Q0 */
    public C84147j f244112Q0;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.i$a */
    public class C83562a implements C84147j {

        /* renamed from: b */
        public final C84153l f244113b;

        public C83562a(C83561i iVar) {
            this.f244113b = new C84140d(C84141e.m103711g(iVar.getRuntime().mo113210l1().f234846y), iVar.getRuntime().mo113030T());
        }

        /* renamed from: a */
        public void mo115884a(C90630c cVar) {
            mo115891h(cVar);
        }

        /* renamed from: b */
        public void mo115885b(C90630c cVar) {
            ((C84140d) this.f244113b).mo115885b(cVar);
        }

        /* renamed from: c */
        public void mo115886c(Intent intent) {
        }

        /* renamed from: d */
        public void mo115887d() {
        }

        /* renamed from: e */
        public C84173t mo115888e() {
            return C84173t.f245810l;
        }

        /* renamed from: f */
        public void mo115889f(long j, C83817h4 h4Var) {
        }

        /* renamed from: g */
        public C84172s mo115890g() {
            return C84172s.f245783A;
        }

        /* renamed from: h */
        public void mo115891h(C90630c cVar) {
            ((C84140d) this.f244113b).mo115891h(cVar);
        }

        /* renamed from: j */
        public void mo115892j() {
        }

        /* renamed from: k */
        public void mo115893k(long j) {
        }

        /* renamed from: l */
        public C84153l mo115894l() {
            return this.f244113b;
        }

        /* renamed from: m */
        public void mo115895m(C90630c cVar, C90630c cVar2, C83817h4 h4Var) {
            ((C84140d) this.f244113b).mo115895m(cVar, cVar2, h4Var);
        }

        /* renamed from: n */
        public Intent mo115896n() {
            return null;
        }
    }

    public C83561i(C83588k kVar) {
        super(kVar.f238141d, kVar);
    }

    /* renamed from: d */
    public C83780d1 mo115880d(C83849m0 m0Var, String str) {
        return new C83563j();
    }

    /* renamed from: f0 */
    public boolean mo115881f0(C83820i0 i0Var) {
        return false;
    }

    public C84147j getReporter() {
        C84147j jVar = this.f244112Q0;
        if (jVar != null) {
            return jVar;
        }
        C83562a aVar = new C83562a(this);
        this.f244112Q0 = aVar;
        return aVar;
    }

    /* renamed from: n0 */
    public C83928t1 mo115882n0(C83849m0 m0Var, String str) {
        return new C83563j();
    }

    /* renamed from: w */
    public final void mo115883w(String str) {
        super.mo115883w(str);
    }
}
