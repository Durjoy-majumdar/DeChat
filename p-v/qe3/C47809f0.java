package qe3;

import ob0.C117746w;
import qe3.C89631w;

/* renamed from: qe3.f0 */
public class C47809f0 extends C117746w {

    /* renamed from: a */
    public boolean f128367a;

    /* renamed from: b */
    public C47810g0 f128368b;

    /* renamed from: c */
    public C47811h0 f128369c = new C47811h0();

    public C47809f0(boolean z) {
        this.f128367a = z;
        this.f128368b = new C47810g0(z);
    }

    public int getOptions() {
        if (this.f128367a) {
            return 1;
        }
        return super.getOptions();
    }

    public C89631w.C89634d getReqObjImp() {
        return this.f128368b;
    }

    public C89631w.C89636e getRespObj() {
        return this.f128369c;
    }

    public int getType() {
        return this.f128367a ? 3944 : 836;
    }

    public String getUri() {
        return this.f128367a ? "/cgi-bin/micromsg-bin/fpfreshnl" : "/cgi-bin/micromsg-bin/fpfresh";
    }
}
