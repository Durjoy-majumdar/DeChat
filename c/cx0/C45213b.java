package cx0;

import ax0.C39637a;
import bx0.C39846d;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import xw0.C38860a;

/* renamed from: cx0.b */
public class C45213b implements C11385n, C45218e {

    /* renamed from: d */
    public C39846d f122532d;

    /* renamed from: e */
    public C39637a f122533e;

    public C45213b(C39846d dVar) {
        this.f122532d = dVar;
        C86709a0.m107524d().mo123455a(1869, this);
    }

    /* renamed from: a */
    public void mo70691a(String str, String str2) {
        if (this.f122533e != null) {
            C86709a0.m107524d().mo123458d(this.f122533e);
        }
        this.f122533e = new C39637a(str, str2);
        C86709a0.m107524d().mo123460f(this.f122533e);
        C38860a.m41966a(2);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.equals(this.f122533e)) {
            C45215d o0 = this.f122532d.mo62492o0();
            C39637a aVar = this.f122533e;
            o0.mo70692a(aVar.f106401g, i2, str, aVar.f106402h.f133962d);
            if (i2 == 0 && i2 == 0) {
                C38860a.m41966a(3);
            } else {
                C38860a.m41966a(4);
            }
        }
    }
}
