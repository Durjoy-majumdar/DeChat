package com.tencent.p014mm.plugin.multitalk.p078ui;

import a11.C39479c;
import android.database.Cursor;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import java.util.LinkedList;
import java.util.List;
import v82.C78362a0;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.f */
public class C42581f extends C74551q1 {

    /* renamed from: n */
    public String[] f115211n;

    /* renamed from: o */
    public Cursor f115212o;

    /* renamed from: p */
    public String f115213p;

    /* renamed from: q */
    public String f115214q;

    public C42581f(MMBaseSelectContactUI mMBaseSelectContactUI, String str) {
        super(mMBaseSelectContactUI, (List<String>) null, true, 0);
        this.f115213p = str;
        List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(this.f115213p);
        if (bD != null) {
            this.f115211n = Util.listToStrings(bD);
        }
    }

    public int getCount() {
        Cursor cursor = this.f115212o;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (!this.f115212o.moveToPosition(i)) {
            return null;
        }
        C72996z1 z1Var = new C72996z1();
        z1Var.convertFrom(this.f115212o);
        C78362a0 a0Var = new C78362a0(i);
        a0Var.mo106181j(z1Var);
        a0Var.f222608e = this.f219057f;
        a0Var.f222619p = this.f115214q;
        return a0Var;
    }

    /* renamed from: i */
    public void mo7851i() {
        super.mo7851i();
        Cursor cursor = this.f115212o;
        if (cursor != null) {
            cursor.close();
            this.f115212o = null;
        }
    }

    /* renamed from: r */
    public void mo63130r(String str, int[] iArr, boolean z) {
        Log.m105925i("MicroMsg.multitalk.MultiTalkSelectSearchAdapter", "doSearch: %s", str);
        mo103564g();
        this.f115214q = str;
        Cursor cursor = this.f115212o;
        if (cursor != null) {
            cursor.close();
            this.f115212o = null;
        }
        if (!Util.isNullOrNil(this.f115214q) && this.f115211n != null) {
            this.f115212o = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69712l4(this.f115211n, "@all.chatroom", this.f115214q, new LinkedList(), (List<String>) null);
        }
        notifyDataSetChanged();
        mo70171b(str, true);
    }
}
