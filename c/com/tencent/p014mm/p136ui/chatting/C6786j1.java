package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.C0966R;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.j1 */
public class C6786j1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f24333d;

    public C6786j1(List list) {
        this.f24333d = list;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107135b(1193046, C0966R.string.grp, C0966R.C0969drawable.f4734lc);
        for (String add : this.f24333d) {
            e0Var.add((CharSequence) add);
        }
    }
}
