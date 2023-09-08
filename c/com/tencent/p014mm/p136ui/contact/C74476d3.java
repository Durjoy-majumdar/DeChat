package com.tencent.p014mm.p136ui.contact;

import android.view.MenuItem;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.ui.contact.d3 */
public class C74476d3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenIMSelectContactUI f219000d;

    public C74476d3(OpenIMSelectContactUI openIMSelectContactUI) {
        this.f219000d = openIMSelectContactUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        OpenIMSelectContactUI openIMSelectContactUI = this.f219000d;
        boolean d = C74560s1.m89275d(openIMSelectContactUI.f218720J, 8192);
        openIMSelectContactUI.getClass();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<String> it = openIMSelectContactUI.f218717G.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (d || !C45628s0.m50743H(next)) {
                hashSet.add(next);
            } else {
                List<String> mX = ((C53193b) C86312j.m106911c(C53193b.class)).mo73728mX(next);
                if (mX != null) {
                    for (String add : mX) {
                        hashSet.add(add);
                    }
                }
            }
        }
        arrayList.addAll(hashSet);
        arrayList.remove(C75592q0.m90789s());
        ArrayList arrayList2 = new ArrayList(this.f219000d.f218718H);
        arrayList2.removeAll(arrayList);
        this.f219000d.mo103417g8(arrayList, arrayList2);
        return true;
    }
}
