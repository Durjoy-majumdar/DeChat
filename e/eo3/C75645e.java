package eo3;

import com.tencent.p014mm.storage.C72996z1;
import d62.C45286l;
import eb0.C97625j3;

/* renamed from: eo3.e */
public class C75645e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f222232d;

    /* renamed from: e */
    public final /* synthetic */ C75635b f222233e;

    public C75645e(C75635b bVar, String str) {
        this.f222233e = bVar;
        this.f222232d = str;
    }

    public void run() {
        if (this.f222233e.f222208s.mo62936v3()) {
            C72996z1 z1Var = this.f222233e.f222208s;
            z1Var.setType(z1Var.getType() & -33);
            if (this.f222233e.f222212w) {
                C97625j3.m125815e().mo123460f(new C45286l(this.f222232d, 3));
                this.f222233e.f222203B = true;
                return;
            }
            return;
        }
        this.f222233e.f222208s.mo62877T3();
    }
}
