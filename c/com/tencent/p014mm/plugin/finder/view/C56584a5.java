package com.tencent.p014mm.plugin.finder.view;

import cm1.C0712b0;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import dp1.C58389m1;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C64441i93;
import te3.C64654qd;
import te3.db4;
import te3.op4;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.view.a5 */
public final class C56584a5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C0712b0> f162216d;

    /* renamed from: e */
    public final /* synthetic */ int f162217e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56584a5(ArrayList<C0712b0> arrayList, int i) {
        super(0);
        this.f162216d = arrayList;
        this.f162217e = i;
    }

    public Object invoke() {
        ArrayList<C0712b0> arrayList = this.f162216d;
        int i = this.f162217e;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C0712b0 b0Var : arrayList) {
            FinderObject finderObject = b0Var.f1709d;
            long j = finderObject.f164794id;
            String str = finderObject.sessionBuffer;
            db4 db4 = new db4();
            db4.f182678f = new op4();
            db4.f182677e = new C64654qd();
            db4.f182679g = new C64441i93();
            db4.f182676d = j;
            db4.f182686q = i;
            db4.f182684o = str;
            db4.f182681i = C66785b.f191882e.mo90662O5();
            db4.f182682j = C31543z5.m39453c();
            db4.f182689t = 2004;
            arrayList2.add(db4);
        }
        C49712hj1 hj12 = new C49712hj1();
        hj12.f134675i = this.f162217e;
        C58389m1.f167287a.mo83224a(arrayList2, hj12, 0);
        return C13598b0.f38549a;
    }
}
