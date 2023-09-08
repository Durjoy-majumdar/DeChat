package qp0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d92.C107028a;
import k92.C108976d;
import te3.C90416i5;

/* renamed from: qp0.b */
public class C89784b extends C108976d {

    /* renamed from: u */
    public AppBrandRuntimeWC f258164u;

    public C89784b(C107028a aVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(aVar);
        this.f258164u = appBrandRuntimeWC;
        Log.m105925i("MicroMsg.AppBrandMultiTaskHelper", "create, runtime:%s", Integer.valueOf(appBrandRuntimeWC.hashCode()));
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return !this.f258164u.mo113210l1().f239373d1;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return false;
    }

    /* renamed from: D */
    public void mo35809D(int i, String str) {
        super.mo35809D(i, str);
    }

    /* renamed from: G */
    public void mo67895G(boolean z) {
        mo67897d();
        mo124068H(z, 1);
    }

    /* renamed from: U */
    public boolean mo67896U(int i, boolean z) {
        mo67897d();
        return super.mo67896U(i, z);
    }

    /* renamed from: V */
    public void mo74191V() {
    }

    /* renamed from: d */
    public void mo67897d() {
        try {
            AppBrandInitConfigWC M1 = this.f258164u.mo113210l1();
            if (M1 != null) {
                this.f326418a.mo80305m2().f183756i = M1.f239364f;
                this.f326418a.mo80305m2().f183751d = M1.f239363e;
                if (this.f258164u.f238149o.f239365g == 1) {
                    this.f326418a.mo80305m2().f183759o = MMApplicationContext.getContext().getString(C0966R.string.f7602l3);
                } else if (this.f258164u.f238149o.f239365g == 2) {
                    this.f326418a.mo80305m2().f183759o = MMApplicationContext.getContext().getString(C0966R.string.f7601l2);
                } else {
                    this.f326418a.mo80305m2().f183759o = null;
                }
                C90416i5 i5Var = new C90416i5();
                String str = M1.f239362d;
                i5Var.f259566d = str;
                String str2 = M1.f234839s;
                i5Var.f259567e = str2;
                int i = M1.f239365g;
                i5Var.f259568f = i;
                i5Var.f259569g = M1.f234841u;
                Log.m105925i("MicroMsg.AppBrandMultiTaskHelper", "fillMultiTaskInfo username:%s,appid:%s,versionType:%d", str2, str, Integer.valueOf(i));
                this.f326418a.field_data = i5Var.toByteArray();
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrandMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e.getMessage());
        }
    }

    /* renamed from: z */
    public boolean mo124070z() {
        return false;
    }
}
