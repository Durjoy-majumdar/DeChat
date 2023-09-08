package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.content.Context;
import android.widget.Toast;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import jj2.C33585b;
import p175j0.C60690y0;
import rx3.C13598b0;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.b */
public final class C94452b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerBackupDemoUI f273100d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C60690y0<Long>> f273101e;

    /* renamed from: f */
    public final /* synthetic */ MMComposeView f273102f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94452b(RepairerBackupDemoUI repairerBackupDemoUI, C8479f0<C60690y0<Long>> f0Var, MMComposeView mMComposeView) {
        super(0);
        this.f273100d = repairerBackupDemoUI;
        this.f273101e = f0Var;
        this.f273102f = mMComposeView;
    }

    public Object invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 5001; i++) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108745Y2(20000);
            f4Var.setMsgId((long) (1999000 + i));
            f4Var.mo108732L2("test..test");
            f4Var.setType(10000);
            f4Var.mo108749c3("weixin");
            C33585b bVar = this.f273100d.f315717g;
            bVar.getClass();
            bVar.f90912b.add(f4Var);
        }
        C33585b bVar2 = this.f273100d.f315717g;
        bVar2.getClass();
        Class cls = C75700k0.class;
        C91753f fVar = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).f212775p;
        long a = fVar.mo125613a();
        for (C72963f4 oy02 : bVar2.f90912b) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).oy0(oy02, false, false);
        }
        bVar2.f90912b.clear();
        fVar.endTransaction(a);
        ((C60690y0) this.f273101e.f27484d).setValue(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        Context context = this.f273102f.getContext();
        Toast.makeText(context, "DB插入1000条耗时(ms):" + this.f273101e.f27484d, 0).show();
        return C13598b0.f38549a;
    }
}
