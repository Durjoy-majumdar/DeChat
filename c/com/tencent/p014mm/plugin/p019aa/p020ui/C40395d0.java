package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.database.Cursor;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import java.util.LinkedList;
import java.util.List;
import yf0.C79104i;

/* renamed from: com.tencent.mm.plugin.aa.ui.d0 */
public class C40395d0 extends C74551q1 {

    /* renamed from: n */
    public String[] f108543n;

    /* renamed from: o */
    public List<String> f108544o;

    /* renamed from: p */
    public List<String> f108545p;

    /* renamed from: q */
    public Cursor f108546q;

    /* renamed from: r */
    public String f108547r;

    /* renamed from: s */
    public String f108548s;

    /* renamed from: t */
    public boolean f108549t;

    public C40395d0(MMBaseSelectContactUI mMBaseSelectContactUI, String str, List<String> list, List<String> list2, boolean z) {
        super(mMBaseSelectContactUI, (List<String>) null, true, 0);
        this.f108547r = str;
        this.f108544o = list;
        this.f108545p = list2;
        this.f108549t = z;
        if (list != null) {
            this.f108543n = Util.listToStrings(list);
        }
    }

    public int getCount() {
        Cursor cursor = this.f108546q;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (!this.f108546q.moveToPosition(i)) {
            return null;
        }
        C72996z1 z1Var = new C72996z1();
        z1Var.convertFrom(this.f108546q);
        C75939h hVar = new C75939h(i);
        hVar.mo106181j(z1Var);
        hVar.f222608e = true;
        hVar.f222614k = true;
        if (C72996z1.m85843n5(z1Var.getUsername())) {
            hVar.f222613j = true;
        }
        hVar.f222617n = Boolean.valueOf(this.f108549t).booleanValue();
        hVar.f222618o = Boolean.valueOf(C79104i.m95670o(this.f108547r, z1Var.getUsername())).booleanValue();
        return hVar;
    }

    /* renamed from: i */
    public void mo7851i() {
        super.mo7851i();
        Cursor cursor = this.f108546q;
        if (cursor != null) {
            cursor.close();
            this.f108546q = null;
        }
    }

    /* renamed from: r */
    public void mo63130r(String str, int[] iArr, boolean z) {
        Log.m105925i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", str);
        mo103564g();
        this.f108548s = str;
        Cursor cursor = this.f108546q;
        if (cursor != null) {
            cursor.close();
            this.f108546q = null;
        }
        if (!Util.isNullOrNil(this.f108548s) && this.f108543n != null) {
            C86709a0.m107528h();
            this.f108546q = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69712l4(this.f108543n, "@all.chatroom", this.f108548s, new LinkedList(), (List<String>) null);
        }
        notifyDataSetChanged();
        mo70171b(str, true);
    }
}
