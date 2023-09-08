package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.o1 */
public class C73769o1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73835q1 f216535d;

    public C73769o1(C73835q1 q1Var) {
        this.f216535d = q1Var;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        Set<Long> p3 = ((C79368l) this.f216535d.f216667b.f193278b.mo102812a(C79368l.class)).mo108206p3();
        if (p3 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(p3);
            Collections.sort(arrayList);
            long[] jArr = new long[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                jArr[i] = ((Long) it.next()).longValue();
                i++;
            }
            intent.putExtra("k_outside_expose_proof_item_list", jArr);
            this.f216535d.f216667b.mo91565f().setResult(-1, intent);
        } else {
            this.f216535d.f216667b.mo91565f().setResult(0, intent);
        }
        intent.putExtra("k_is_group_chat", this.f216535d.f216667b.mo91583x());
        this.f216535d.f216667b.mo91563d();
        return false;
    }
}
