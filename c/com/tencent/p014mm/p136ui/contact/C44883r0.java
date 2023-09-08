package com.tencent.p014mm.p136ui.contact;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.r0 */
public class C44883r0 extends C74526m1 {

    /* renamed from: n */
    public List<String> f121747n;

    /* renamed from: o */
    public Cursor f121748o;

    public C44883r0(MMBaseSelectContactUI mMBaseSelectContactUI, boolean z, List<String> list, List<String> list2) {
        super(mMBaseSelectContactUI, list2, true, z);
        ArrayList arrayList = new ArrayList();
        this.f121747n = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            this.f121747n.removeAll(list2);
        }
        Class cls = C75700k0.class;
        if (this.f121747n.isEmpty()) {
            C86709a0.m107528h();
            this.f121748o = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69714m4();
            return;
        }
        C86709a0.m107528h();
        this.f121748o = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69654F3(this.f121747n);
    }

    public int getCount() {
        return this.f121748o.getCount();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (i < 0 || !this.f121748o.moveToPosition(i)) {
            Log.m105921e("MicroMsg.CustomContactAdapter", "create Data Item Error position=%d", Integer.valueOf(i));
            return null;
        }
        C75939h hVar = new C75939h(i);
        C72996z1 z1Var = new C72996z1();
        z1Var.convertFrom(this.f121748o);
        hVar.mo106181j(z1Var);
        hVar.f222608e = this.f219057f;
        return hVar;
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.CustomContactAdapter", "finish!");
        Cursor cursor = this.f121748o;
        if (cursor != null) {
            cursor.close();
            this.f121748o = null;
        }
    }
}
