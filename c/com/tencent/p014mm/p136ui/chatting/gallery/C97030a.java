package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.a */
public abstract class C97030a {

    /* renamed from: d */
    public C97056h f284638d;

    public C97030a(C97056h hVar) {
        this.f284638d = hVar;
    }

    /* renamed from: g */
    public boolean mo135842g(C97087m1 m1Var, C72963f4 f4Var, int i) {
        return false;
    }

    /* renamed from: h */
    public C97087m1 mo135877h(int i) {
        View e;
        C97056h hVar = this.f284638d;
        if (hVar == null || (e = hVar.mo139420e(i)) == null) {
            return null;
        }
        return (C97087m1) e.getTag();
    }

    /* renamed from: i */
    public void mo135878i(int i) {
        View e;
        C97056h hVar = this.f284638d;
        if (hVar != null && (e = hVar.mo139420e(i)) != null && e.getTag() != null) {
            mo135842g((C97087m1) e.getTag(), this.f284638d.mo135937y(i), i);
        }
    }

    /* renamed from: j */
    public void mo135843j() {
    }
}
