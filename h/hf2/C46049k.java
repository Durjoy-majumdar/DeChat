package hf2;

import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoSettingUI;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44653b0;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import qo3.C89779i0;
import rb0.C47966e0;

/* renamed from: hf2.k */
public class C46049k implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ boolean f124170d;

    /* renamed from: e */
    public final /* synthetic */ String f124171e;

    /* renamed from: f */
    public final /* synthetic */ NewBizInfoSettingUI f124172f;

    public C46049k(NewBizInfoSettingUI newBizInfoSettingUI, boolean z, String str) {
        this.f124172f = newBizInfoSettingUI;
        this.f124170d = z;
        this.f124171e = str;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f124172f.f115459t;
    }

    /* renamed from: c */
    public void mo24604c() {
        C89779i0 i0Var = this.f124172f.f115458s;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f124172f.f115458s = null;
        }
        if (this.f124170d) {
            C44653b0 wp = ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72740wp();
            String str = this.f124171e;
            wp.getClass();
            C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
            C72976h2 h2Var = new C72976h2(str);
            h2Var.mo108807c3("officialaccounts");
            wp.mo69632a(h2Var, Ku);
        }
    }
}
