package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.contact.LabelContainerView;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;

/* renamed from: com.tencent.mm.ui.contact.j1 */
public class C74514j1 implements LabelContainerView.C74390a {

    /* renamed from: a */
    public final /* synthetic */ MMBaseSelectContactUI f219081a;

    public C74514j1(MMBaseSelectContactUI mMBaseSelectContactUI) {
        this.f219081a = mMBaseSelectContactUI;
    }

    /* renamed from: a */
    public void mo103375a() {
        MultiSelectContactView multiSelectContactView = this.f219081a.f218609h;
        if (multiSelectContactView != null) {
            multiSelectContactView.clearFocus();
        }
        C106742j1 j1Var = this.f219081a.f218610i;
        if (j1Var != null) {
            j1Var.mo153849a();
            this.f219081a.f218610i.mo153850b();
        }
        this.f219081a.f218620v.requestFocus();
        this.f219081a.f218620v.setVisibility(8);
    }

    /* renamed from: b */
    public void mo103376b() {
        this.f219081a.hideVKB();
    }
}
