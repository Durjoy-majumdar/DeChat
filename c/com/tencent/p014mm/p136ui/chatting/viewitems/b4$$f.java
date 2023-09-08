package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import wd3.C22906q;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b4$$f */
public class b4$$f implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ int f56210a;

    /* renamed from: b */
    public final /* synthetic */ C19783t3 f56211b;

    /* renamed from: c */
    public final /* synthetic */ C19762b4 f56212c;

    public b4$$f(C19762b4 b4Var, int i, C19783t3 t3Var) {
        this.f56212c = b4Var;
        this.f56210a = i;
        this.f56211b = t3Var;
    }

    public void onFinish() {
        if (this.f56210a > 1) {
            this.f56211b.f56261c.f56303g.setTextColor(this.f56212c.f56192v.mo91565f().getResources().getColor(C0966R.color.al_));
            this.f56211b.f56261c.f56303g.setBackgroundResource(C0966R.C0969drawable.f4573ge);
        }
        this.f56211b.f56261c.f56307k.setVisibility(0);
    }

    public void onStart() {
    }
}
