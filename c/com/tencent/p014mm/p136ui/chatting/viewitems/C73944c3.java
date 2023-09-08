package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.util.Pair;
import android.view.MenuItem;
import di3.C86312j;
import nj3.C11184p0;
import vd2.C78384d;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.c3 */
public class C73944c3 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Pair f217028d;

    public C73944c3(C73921a3 a3Var, Pair pair) {
        this.f217028d = pair;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 291) {
            ((C78384d) C86312j.m106911c(C78384d.class)).wr0(this.f217028d, 1);
        }
    }
}
