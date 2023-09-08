package com.tencent.p014mm.p136ui.contact;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.d4 */
public class C44877d4 extends C74526m1 {

    /* renamed from: n */
    public String f121741n;

    /* renamed from: o */
    public Cursor f121742o = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69687b4(this.f121741n, "", this.f219096j);

    public C44877d4(MMBaseSelectContactUI mMBaseSelectContactUI, String str) {
        super(mMBaseSelectContactUI, new ArrayList(), false, false);
        this.f121741n = str;
        C86709a0.m107528h();
    }

    public int getCount() {
        return this.f121742o.getCount();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (i < 0 || !this.f121742o.moveToPosition(i)) {
            Log.m105921e("MicroMsg.SpecialContactAdapter", "create Data Item Error position=%d", Integer.valueOf(i));
            return null;
        }
        C75939h hVar = new C75939h(i);
        C72996z1 z1Var = new C72996z1();
        z1Var.convertFrom(this.f121742o);
        hVar.mo106181j(z1Var);
        hVar.f222608e = this.f219057f;
        return hVar;
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.SpecialContactAdapter", "finish!");
        Cursor cursor = this.f121742o;
        if (cursor != null) {
            cursor.close();
            this.f121742o = null;
        }
    }

    /* renamed from: r */
    public void mo7853r() {
        C86709a0.m107528h();
        this.f121742o = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69687b4(this.f121741n, "", this.f219096j);
        mo103564g();
        notifyDataSetChanged();
    }
}
