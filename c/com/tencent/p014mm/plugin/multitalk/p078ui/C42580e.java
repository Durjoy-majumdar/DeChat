package com.tencent.p014mm.plugin.multitalk.p078ui;

import a11.C39479c;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import java.util.ArrayList;
import java.util.List;
import v82.C78362a0;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.e */
public class C42580e extends C74526m1 {

    /* renamed from: n */
    public List<String> f115209n;

    /* renamed from: o */
    public String f115210o;

    public C42580e(C74493g1 g1Var, String str) {
        super(g1Var, (List<String>) null, true, true);
        this.f115210o = str;
        mo7853r();
    }

    public int getCount() {
        return this.f115209n.size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f115209n.get(i));
        C78362a0 a0Var = new C78362a0(i);
        a0Var.mo106181j(z1Var);
        a0Var.f222608e = this.f219057f;
        return a0Var;
    }

    /* renamed from: r */
    public void mo7853r() {
        Log.m105924i("MicroMsg.multitalk.MultiTalkSelectInitAdapter", "resetData");
        List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(this.f115210o);
        this.f115209n = bD;
        if (bD == null) {
            this.f115209n = new ArrayList();
        }
    }
}
