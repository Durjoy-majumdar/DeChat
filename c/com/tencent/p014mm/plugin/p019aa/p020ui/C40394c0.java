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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.aa.ui.c0 */
public class C40394c0 extends C74551q1 {

    /* renamed from: n */
    public String[] f108540n;

    /* renamed from: o */
    public Cursor f108541o;

    /* renamed from: p */
    public String f108542p;

    public C40394c0(MMBaseSelectContactUI mMBaseSelectContactUI, ArrayList<String> arrayList) {
        super(mMBaseSelectContactUI, (List<String>) null, true, 0);
        if (arrayList != null) {
            this.f108540n = Util.listToStrings(arrayList);
        }
    }

    public int getCount() {
        Cursor cursor = this.f108541o;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (!this.f108541o.moveToPosition(i)) {
            return null;
        }
        C72996z1 z1Var = new C72996z1();
        z1Var.convertFrom(this.f108541o);
        C75939h hVar = new C75939h(i);
        hVar.mo106181j(z1Var);
        hVar.f222608e = true;
        return hVar;
    }

    /* renamed from: i */
    public void mo7851i() {
        super.mo7851i();
        Cursor cursor = this.f108541o;
        if (cursor != null) {
            cursor.close();
            this.f108541o = null;
        }
    }

    /* renamed from: r */
    public void mo63130r(String str, int[] iArr, boolean z) {
        Log.m105925i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", str);
        mo103564g();
        this.f108542p = str;
        Cursor cursor = this.f108541o;
        if (cursor != null) {
            cursor.close();
            this.f108541o = null;
        }
        if (!Util.isNullOrNil(this.f108542p) && this.f108540n != null) {
            C86709a0.m107528h();
            this.f108541o = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69712l4(this.f108540n, "@all.chatroom", this.f108542p, new LinkedList(), (List<String>) null);
        }
        notifyDataSetChanged();
        mo70171b(str, true);
    }
}
