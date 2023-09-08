package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import wd3.C22906q;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g4 */
public class C19767g4 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C19783t3 f56225a;

    /* renamed from: b */
    public final /* synthetic */ int f56226b;

    /* renamed from: c */
    public final /* synthetic */ C19762b4 f56227c;

    public C19767g4(C19762b4 b4Var, C19783t3 t3Var, int i) {
        this.f56227c = b4Var;
        this.f56225a = t3Var;
        this.f56226b = i;
    }

    public void onFinish() {
        this.f56225a.f56264f.f56259c.setVisibility(0);
        this.f56225a.f56264f.f56311d.setTextColor(this.f56227c.f56192v.mo91565f().getResources().getColor(C0966R.color.al_));
        this.f56225a.f56264f.f56312e.setTextColor(this.f56227c.f56192v.mo91565f().getResources().getColor(C0966R.color.al_));
        this.f56225a.f56264f.f56259c.setBackgroundResource(this.f56226b > 1 ? C0966R.C0969drawable.f4608ho : C0966R.C0969drawable.f4609hp);
    }

    public void onStart() {
    }
}
