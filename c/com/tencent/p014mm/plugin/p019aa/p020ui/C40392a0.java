package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.aa.ui.a0 */
public class C40392a0 extends C74526m1 {

    /* renamed from: n */
    public List<String> f108534n;

    /* renamed from: o */
    public ArrayList<String> f108535o;

    public C40392a0(C74493g1 g1Var, ArrayList<String> arrayList) {
        super(g1Var, (List<String>) null, true, true);
        this.f108535o = arrayList;
        mo7853r();
    }

    public int getCount() {
        return ((ArrayList) this.f108534n).size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        String str = (String) ((ArrayList) this.f108534n).get(i);
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null && Util.isNullOrNil(z1Var.getUsername())) {
            z1Var.setUsername(str);
        }
        C68354z zVar = new C68354z(i);
        zVar.mo106181j(z1Var);
        zVar.f222608e = true;
        return zVar;
    }

    /* renamed from: r */
    public void mo7853r() {
        Log.m105924i("MicroMsg.AASelectInitAdapter", "resetData");
        if (this.f108534n == null) {
            this.f108534n = new ArrayList();
        }
        this.f108534n.clear();
        Iterator<String> it = this.f108535o.iterator();
        while (it.hasNext()) {
            this.f108534n.add(it.next());
        }
    }
}
