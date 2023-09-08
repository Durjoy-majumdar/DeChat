package com.tencent.p014mm.pluginsdk.model.app;

/* renamed from: com.tencent.mm.pluginsdk.model.app.s0 */
public class C44581s0 {

    /* renamed from: a */
    public String f120883a;

    /* renamed from: b */
    public int f120884b;

    public C44581s0(String str, int i) {
        this.f120883a = str;
        this.f120884b = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C44581s0)) {
            return false;
        }
        C44581s0 s0Var = (C44581s0) obj;
        return s0Var.f120883a.equals(this.f120883a) && s0Var.f120884b == this.f120884b;
    }

    public String toString() {
        return this.f120883a + this.f120884b;
    }
}
