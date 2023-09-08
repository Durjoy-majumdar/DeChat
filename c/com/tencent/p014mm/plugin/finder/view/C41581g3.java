package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76875f0;
import nj3.C76901s0;
import ok1.C62042e;
import te3.C49765hx0;
import tf0.C13883o1;

/* renamed from: com.tencent.mm.plugin.finder.view.g3 */
public final class C41581g3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11184p0 f111923d;

    /* renamed from: e */
    public final /* synthetic */ View f111924e;

    /* renamed from: f */
    public final /* synthetic */ C49765hx0 f111925f;

    /* renamed from: g */
    public final /* synthetic */ boolean f111926g;

    public C41581g3(C11184p0 p0Var, View view, C49765hx0 hx02, boolean z) {
        this.f111923d = p0Var;
        this.f111924e = view;
        this.f111925f = hx02;
        this.f111926g = z;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showFinderWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C62042e.f176370a.mo87027N0()) {
            this.f111923d.onMMMenuItemSelected(new C76875f0(this.f111924e.getContext(), 163, 0), 0);
        } else {
            Intent intent = new Intent();
            FinderContact finderContact = this.f111925f.f134919d;
            if (finderContact == null || (str = finderContact.username) == null) {
                str = "";
            }
            intent.putExtra("finder_username", str);
            Context context = this.f111924e.getContext();
            C87412m.m108593f(context, "view.context");
            ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13272V1(context, intent);
            C41573e3 e3Var = C41573e3.f111902a;
            C76901s0 s0Var = C41573e3.f111904c;
            if (s0Var != null) {
                s0Var.dismiss();
            }
        }
        if (this.f111926g) {
            C41573e3.f111902a.mo64660c(9, (C41573e3.C41574a) null);
        } else {
            C41573e3.f111902a.mo64660c(3, (C41573e3.C41574a) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showFinderWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
