package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.storage.GroupToolItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C76879j;
import p203mi.C47052w;
import p684si.C36674e;
import qo3.C89779i0;
import te3.C27676kv3;

/* renamed from: com.tencent.mm.chatroom.ui.o0 */
public class C26877o0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupToolsManagereUI f74759d;

    public C26877o0(GroupToolsManagereUI groupToolsManagereUI) {
        this.f74759d = groupToolsManagereUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105924i("MicroMsg.roomtools.GroupToolsManagereUI", "menu click");
        C36674e eVar = this.f74759d.f48713p;
        eVar.field_stickToollist = C36674e.m41039m2(eVar.f97469t);
        GroupToolsManagereUI groupToolsManagereUI = this.f74759d;
        groupToolsManagereUI.getClass();
        Log.m105924i("MicroMsg.roomtools.GroupToolsManagereUI", "doAlterWxApp()");
        LinkedList linkedList = new LinkedList();
        if (groupToolsManagereUI.f48713p.f97469t.size() > 0) {
            Iterator<GroupToolItem> it = groupToolsManagereUI.f48713p.f97469t.iterator();
            while (it.hasNext()) {
                C27676kv3 kv32 = new C27676kv3();
                kv32.f76618d = it.next().f79318d;
                kv32.f76619e = "";
                linkedList.add(kv32);
            }
        }
        C47052w wVar = new C47052w(groupToolsManagereUI.f48715r, linkedList);
        C86709a0.m107524d().mo123460f(wVar);
        C89779i0 i0Var = groupToolsManagereUI.f48708h;
        if (i0Var == null) {
            groupToolsManagereUI.f48708h = C76879j.m92723Q(groupToolsManagereUI, groupToolsManagereUI.getString(C0966R.string.a3h), groupToolsManagereUI.getString(C0966R.string.f360085a04), true, true, new C26878p0(groupToolsManagereUI, wVar));
            return true;
        } else if (i0Var.isShowing()) {
            return true;
        } else {
            groupToolsManagereUI.f48708h.show();
            return true;
        }
    }
}
