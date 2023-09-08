package qe3;

import ob0.C117746w;
import qe3.C89631w;

/* renamed from: qe3.i0 */
public class C47812i0 extends C117746w {

    /* renamed from: a */
    public boolean f128373a;

    /* renamed from: b */
    public C47813j0 f128374b;

    /* renamed from: c */
    public C47814k0 f128375c = new C47814k0();

    public C47812i0(boolean z) {
        this.f128373a = z;
        this.f128374b = new C47813j0(z);
    }

    public int getOptions() {
        if (this.f128373a) {
            return 1;
        }
        return super.getOptions();
    }

    public C89631w.C89634d getReqObjImp() {
        return this.f128374b;
    }

    public C89631w.C89636e getRespObj() {
        return this.f128375c;
    }

    public int getType() {
        return this.f128373a ? 3789 : 3644;
    }

    public String getUri() {
        return this.f128373a ? "/cgi-bin/micromsg-bin/fpinitnl" : "/cgi-bin/micromsg-bin/fpinit";
    }
}
