package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import nj3.C47268j0;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.ui.chatting.i1 */
public class C6785i1 implements C47268j0 {

    /* renamed from: a */
    public final /* synthetic */ Context f24332a;

    public C6785i1(Context context) {
        this.f24332a = context;
    }

    /* renamed from: a */
    public void mo7130a(TextView textView, MenuItem menuItem) {
        if (textView != null) {
            C44668u3 v = C97625j3.m125812b().mo105907v();
            C72996z1 z1Var = v.get(menuItem.getTitle() + "");
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                textView.setText(menuItem.getTitle() + "");
                return;
            }
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f24332a, z1Var.mo62909j3()));
        }
    }
}
