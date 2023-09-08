package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import java.util.ArrayList;
import java.util.List;
import yf0.C79104i;

/* renamed from: com.tencent.mm.plugin.aa.ui.b0 */
public class C40393b0 extends C74526m1 {

    /* renamed from: n */
    public List<String> f108536n;

    /* renamed from: o */
    public List<String> f108537o;

    /* renamed from: p */
    public String f108538p;

    /* renamed from: q */
    public boolean f108539q;

    public C40393b0(C74493g1 g1Var, String str, List<String> list, List<String> list2, boolean z) {
        super(g1Var, (List<String>) null, true, true);
        this.f108538p = str;
        this.f108536n = list;
        this.f108537o = list2;
        this.f108539q = z;
        mo7853r();
    }

    public int getCount() {
        return this.f108536n.size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        String str = this.f108536n.get(i);
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        C68354z zVar = new C68354z(i);
        zVar.f222620q = this.f108538p;
        zVar.mo106181j(z1Var);
        zVar.f222608e = true;
        zVar.f222617n = Boolean.valueOf(this.f108539q).booleanValue();
        zVar.f222618o = Boolean.valueOf(C79104i.m95670o(this.f108538p, str)).booleanValue();
        return zVar;
    }

    /* renamed from: r */
    public void mo7853r() {
        Log.m105924i("MicroMsg.AASelectInitAdapter", "resetData");
        if (C45628s0.m50748M(this.f108538p)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<String> list = this.f108536n;
            if (list != null && list.size() > 0) {
                for (String next : this.f108536n) {
                    if (C72996z1.m85843n5(next)) {
                        arrayList.add(next);
                    } else {
                        arrayList2.add(next);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f108536n.clear();
                    this.f108536n.addAll(arrayList2);
                    this.f108536n.addAll(arrayList);
                }
            }
        }
    }
}
