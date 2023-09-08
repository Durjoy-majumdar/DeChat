package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import jj2.C33585b;
import jj2.C98944a;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.d */
public final class C94454d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerBackupDemoUI f273106d;

    /* renamed from: e */
    public final /* synthetic */ C98944a f273107e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<Long> f273108f;

    /* renamed from: g */
    public final /* synthetic */ C60690y0<Integer> f273109g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94454d(RepairerBackupDemoUI repairerBackupDemoUI, C98944a aVar, C60690y0<Long> y0Var, C60690y0<Integer> y0Var2) {
        super(0);
        this.f273106d = repairerBackupDemoUI;
        this.f273107e = aVar;
        this.f273108f = y0Var;
        this.f273109g = y0Var2;
    }

    public Object invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        RepairerBackupDemoUI repairerBackupDemoUI = this.f273106d;
        C33585b bVar = repairerBackupDemoUI.f315717g;
        C98944a aVar = this.f273107e;
        ArrayList a = C33585b.m40131a(bVar, aVar.f290040a, aVar.f290041b, aVar.f290042c, repairerBackupDemoUI.f315715e, false, 16, (Object) null);
        this.f273108f.setValue(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        this.f273109g.setValue(Integer.valueOf(a.size()));
        Log.m105925i(this.f273106d.f315714d, "msgListSize:%d", Integer.valueOf(a.size()));
        return C13598b0.f38549a;
    }
}
