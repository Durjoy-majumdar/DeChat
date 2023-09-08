package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.C73835q1;
import com.tencent.p014mm.p136ui.chatting.ChatFooterCustom;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import p270xi.C91212b;
import zj3.C79362h1;
import zj3.C79368l;
import zj3.C79379r;
import zj3.C79383u;
import zj3.C79384u0;
import zj3.C79387w;

@C91212b(exportInterface = C79383u.class)
/* renamed from: com.tencent.mm.ui.chatting.component.v1 */
public class C73631v1 extends C73412a implements C79383u {

    /* renamed from: e */
    public boolean f216198e = false;

    /* renamed from: f */
    public long[] f216199f = null;

    /* renamed from: g */
    public C73835q1 f216200g = null;

    /* renamed from: O4 */
    public void mo26162O4() {
        if (this.f216198e && this.f216200g == null) {
            this.f216200g = new C73835q1(this.f215752d, this.f216199f);
        }
    }

    /* renamed from: Z1 */
    public boolean mo102647Z1() {
        return this.f216198e;
    }

    /* renamed from: e */
    public void mo70065e() {
        this.f216198e = this.f215752d.f193286j.getBooleanExtra("expose_edit_mode", false).booleanValue();
        this.f216199f = this.f215752d.f193286j.getArguments().getLongArray("expose_selected_ids");
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C73835q1 q1Var = this.f216200g;
        if (q1Var != null) {
            Class cls = C79387w.class;
            C79368l lVar = (C79368l) q1Var.f216667b.f193278b.mo102812a(C79368l.class);
            ((C79384u0) q1Var.f216667b.f193278b.mo102812a(C79384u0.class)).mo102503H2();
            lVar.mo108187V4();
            lVar.mo108192d2();
            long[] jArr = q1Var.f216666a;
            if (jArr != null) {
                for (long N0 : jArr) {
                    lVar.mo108183N0(N0);
                }
            }
            ChatFooter k1 = ((C79387w) q1Var.f216667b.f193278b.mo102812a(cls)).mo102193k1();
            if (k1 != null) {
                k1.setVisibility(8);
            }
            ChatFooterCustom E1 = ((C79387w) q1Var.f216667b.f193278b.mo102812a(cls)).mo102179E1();
            if (E1 != null) {
                E1.setVisibility(8);
            }
            ((C79379r) q1Var.f216667b.f193278b.mo102812a(C79379r.class)).mo102493X3();
            q1Var.f216667b.mo91578s();
            ((C79362h1) q1Var.f216667b.f193278b.mo102812a(C79362h1.class)).mo102319B0();
            q1Var.f216667b.mo91553N(2, true);
        }
    }
}
