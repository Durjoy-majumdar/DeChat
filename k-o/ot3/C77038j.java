package ot3;

import lt3.C21460a;
import pt3.C22005b;

/* renamed from: ot3.j */
public class C77038j {

    /* renamed from: b */
    public static C77038j f225047b;

    /* renamed from: a */
    public C77037c f225048a = null;

    public C77038j() {
        try {
            this.f225048a = (C77037c) Class.forName("com.tencent.soter.core.model.SoterExParameterProvider").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            C21881e.m25083b("SoterExParameters", "soter: init ext param failed.", new Object[0]);
            if (C21460a.m24273g() == 1) {
                this.f225048a = new C77039k();
                C22005b bVar = C21460a.f60758c;
                if (bVar != null) {
                    bVar.mo35116t();
                }
            }
        }
    }
}
