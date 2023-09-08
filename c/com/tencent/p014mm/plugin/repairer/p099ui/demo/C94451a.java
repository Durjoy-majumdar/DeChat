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
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.a */
public final class C94451a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerBackupDemoUI f273097d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C60690y0<Long>> f273098e;

    /* renamed from: f */
    public final /* synthetic */ MMComposeView f273099f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94451a(RepairerBackupDemoUI repairerBackupDemoUI, C8479f0<C60690y0<Long>> f0Var, MMComposeView mMComposeView) {
        super(0);
        this.f273097d = repairerBackupDemoUI;
        this.f273098e = f0Var;
        this.f273099f = mMComposeView;
    }

    public Object invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 5001; i++) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108745Y2(30000);
            f4Var.setMsgId((long) (2999000 + i));
            f4Var.mo108732L2("test..test");
            f4Var.setType(10000);
            f4Var.mo108749c3("weixin");
            this.f273097d.f315717g.getClass();
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).oy0(f4Var, false, false);
        }
        ((C60690y0) this.f273098e.f27484d).setValue(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        Context context = this.f273099f.getContext();
        Toast.makeText(context, "DB插入1000条耗时(ms):" + this.f273098e.f27484d, 0).show();
        return C13598b0.f38549a;
    }
}
