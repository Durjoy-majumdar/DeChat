package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75569c4;
import hd0.C98408n0;
import p682rz.C101491u;
import zj3.C79359g1;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.k7 */
public class C74087k7 extends C74023i {

    /* renamed from: v */
    public C67391b f217425v;

    /* renamed from: w */
    public C74100l7 f217426w;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6964tj);
        C74123m7 m7Var = new C74123m7();
        m7Var.mo103182a(n4Var, false);
        n4Var.setTag(m7Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        ((C79359g1) bVar.f193278b.mo102812a(C79359g1.class)).mo102712u(menuItem, f4Var);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        if ((hd0.C98429r0.m127831v() && hd0.C98429r0.m127830u() && ((r8 = r12.f288562i) == 104 || r8 == 105)) != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f0, code lost:
        if (r2.f230728K != 1) goto L_0x0210;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027f  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo26235Z(nj3.C76874e0 r18, android.view.View r19, android.view.ContextMenu.ContextMenuInfo r20, com.tencent.p014mm.storage.C72963f4 r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r21
            eb0.c r3 = eb0.C97625j3.m125812b()
            boolean r3 = r3.mo105883I()
            r4 = 1
            if (r3 == 0) goto L_0x029f
            r3 = 0
            if (r1 != 0) goto L_0x0015
            return r3
        L_0x0015:
            java.lang.Object r5 = r19.getTag()
            com.tencent.mm.ui.chatting.viewitems.t8 r5 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r5
            int r5 = r5.mo103252b()
            java.lang.Class<rz.s> r6 = p682rz.C101488s.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            rz.s r6 = (p682rz.C101488s) r6
            rz.t r6 = r6.Kj0()
            java.lang.String r7 = r21.mo108765s2()
            hd0.o0 r6 = (hd0.C98410o0) r6
            hd0.n0 r12 = r6.mo137720f(r7)
            r8 = 130(0x82, float:1.82E-43)
            r9 = 0
            android.content.Context r6 = r19.getContext()
            r7 = 2131823553(0x7f110bc1, float:1.9279909E38)
            java.lang.String r10 = r6.getString(r7)
            r11 = 2131756190(0x7f10049e, float:1.914328E38)
            r6 = r18
            r7 = r5
            android.view.MenuItem r6 = r6.mo107136c(r7, r8, r9, r10, r11)
            int r7 = r19.getWidth()
            int r8 = r19.getHeight()
            r9 = 2
            int[] r9 = new int[r9]
            r1.getLocationInWindow(r9)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r11 = "img_gallery_width"
            android.content.Intent r7 = r10.putExtra(r11, r7)
            java.lang.String r11 = "img_gallery_height"
            android.content.Intent r7 = r7.putExtra(r11, r8)
            r8 = r9[r3]
            java.lang.String r11 = "img_gallery_left"
            android.content.Intent r7 = r7.putExtra(r11, r8)
            r8 = r9[r4]
            java.lang.String r9 = "img_gallery_top"
            r7.putExtra(r9, r8)
            nj3.f0 r6 = (nj3.C76875f0) r6
            r6.f224731z = r10
            r6 = 2131834845(0x7f1137dd, float:1.9302812E38)
            r13 = 105(0x69, float:1.47E-43)
            r14 = 104(0x68, float:1.46E-43)
            if (r12 == 0) goto L_0x00bd
            int r7 = r12.f288562i
            if (r14 == r7) goto L_0x00e9
            r8 = 103(0x67, float:1.44E-43)
            if (r8 == r7) goto L_0x00e9
            if (r13 == r7) goto L_0x00e9
            r8 = 106(0x6a, float:1.49E-43)
            if (r8 == r7) goto L_0x00e9
            boolean r7 = eb0.C75569c4.m90688u(r21)
            if (r7 != 0) goto L_0x00e9
            boolean r7 = eb0.C75569c4.m90687t(r21)
            if (r7 != 0) goto L_0x00e9
            boolean r7 = eb0.C75569c4.m90690w(r21)
            if (r7 != 0) goto L_0x00e9
            r8 = 107(0x6b, float:1.5E-43)
            r9 = 0
            android.content.Context r7 = r19.getContext()
            java.lang.String r10 = r7.getString(r6)
            r11 = 2131756158(0x7f10047e, float:1.9143216E38)
            r6 = r18
            r7 = r5
            r6.mo107136c(r7, r8, r9, r10, r11)
            goto L_0x00e9
        L_0x00bd:
            boolean r7 = r21.mo100983V3()
            if (r7 == 0) goto L_0x00e9
            boolean r7 = eb0.C75569c4.m90687t(r21)
            if (r7 != 0) goto L_0x00e9
            boolean r7 = eb0.C75569c4.m90688u(r21)
            if (r7 != 0) goto L_0x00e9
            boolean r7 = eb0.C75569c4.m90690w(r21)
            if (r7 != 0) goto L_0x00e9
            r8 = 107(0x6b, float:1.5E-43)
            r9 = 0
            android.content.Context r7 = r19.getContext()
            java.lang.String r10 = r7.getString(r6)
            r11 = 2131756158(0x7f10047e, float:1.9143216E38)
            r6 = r18
            r7 = r5
            r6.mo107136c(r7, r8, r9, r10, r11)
        L_0x00e9:
            oa1.d r6 = oa1.C117731d.m166007c()
            xf3.a r7 = new xf3.a
            r7.<init>()
            int r6 = r6.mo182440a(r7)
            if (r6 != r4) goto L_0x00fa
            r6 = 1
            goto L_0x00fb
        L_0x00fa:
            r6 = 0
        L_0x00fb:
            r15 = 2131823560(0x7f110bc8, float:1.9279923E38)
            if (r6 == 0) goto L_0x013e
            boolean r6 = r21.mo100967F3()
            if (r6 != 0) goto L_0x013e
            boolean r6 = r21.mo100994f4()
            if (r6 != 0) goto L_0x0112
            boolean r6 = r21.mo100989b4()
            if (r6 == 0) goto L_0x013e
        L_0x0112:
            ck3.b r6 = r0.f217425v
            boolean r6 = r0.mo103083Q(r2, r6)
            if (r6 == 0) goto L_0x013e
            boolean r6 = r21.mo101000j3()
            if (r6 == 0) goto L_0x013e
            java.lang.String r6 = r21.mo108768t()
            boolean r6 = r0.mo103081O(r6)
            if (r6 == 0) goto L_0x013e
            r8 = 123(0x7b, float:1.72E-43)
            r9 = 0
            android.content.Context r6 = r19.getContext()
            java.lang.String r10 = r6.getString(r15)
            r11 = 2131756134(0x7f100466, float:1.9143167E38)
            r6 = r18
            r7 = r5
            r6.mo107136c(r7, r8, r9, r10, r11)
        L_0x013e:
            r6 = 2131834033(0x7f1134b1, float:1.9301165E38)
            java.lang.String r7 = "favorite"
            if (r12 == 0) goto L_0x0235
            int r8 = r12.f288562i
            r11 = 199(0xc7, float:2.79E-43)
            if (r8 == r11) goto L_0x0164
            if (r8 == r11) goto L_0x0164
            boolean r8 = hd0.C98429r0.m127831v()
            if (r8 == 0) goto L_0x0161
            boolean r8 = hd0.C98429r0.m127830u()
            if (r8 == 0) goto L_0x0161
            int r8 = r12.f288562i
            if (r8 == r14) goto L_0x015f
            if (r8 != r13) goto L_0x0161
        L_0x015f:
            r8 = 1
            goto L_0x0162
        L_0x0161:
            r8 = 0
        L_0x0162:
            if (r8 == 0) goto L_0x0235
        L_0x0164:
            ke3.C88144b.m109788f(r7)
            boolean r7 = eb0.C75569c4.m90690w(r21)
            if (r7 != 0) goto L_0x0186
            r8 = 116(0x74, float:1.63E-43)
            r9 = 0
            android.content.Context r7 = r19.getContext()
            java.lang.String r10 = r7.getString(r6)
            r16 = 2131756032(0x7f100400, float:1.914296E38)
            r6 = r18
            r7 = r5
            r3 = 199(0xc7, float:2.79E-43)
            r11 = r16
            r6.mo107136c(r7, r8, r9, r10, r11)
            goto L_0x0188
        L_0x0186:
            r3 = 199(0xc7, float:2.79E-43)
        L_0x0188:
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r6 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
            r6.<init>()
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r7 = r6.f236178d
            long r8 = r21.getMsgId()
            r7.f236180a = r8
            r6.publish()
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r6 = r6.f236179e
            boolean r6 = r6.f236182a
            if (r6 == 0) goto L_0x01b5
            r8 = 129(0x81, float:1.81E-43)
            r9 = 0
            android.content.Context r6 = r19.getContext()
            r7 = 2131823554(0x7f110bc2, float:1.927991E38)
            java.lang.String r10 = r6.getString(r7)
            r11 = 2131756110(0x7f10044e, float:1.9143118E38)
            r6 = r18
            r7 = r5
            r6.mo107136c(r7, r8, r9, r10, r11)
        L_0x01b5:
            boolean r6 = r21.mo100967F3()
            if (r6 != 0) goto L_0x0210
            boolean r6 = r21.mo100994f4()
            if (r6 != 0) goto L_0x01c7
            boolean r6 = r21.mo100989b4()
            if (r6 == 0) goto L_0x0210
        L_0x01c7:
            ck3.b r6 = r0.f217425v
            boolean r6 = r0.mo103083Q(r2, r6)
            if (r6 == 0) goto L_0x0210
            int r6 = r12.f288562i
            if (r6 == r3) goto L_0x01f2
            boolean r6 = hd0.C98429r0.m127831v()
            if (r6 == 0) goto L_0x01e7
            boolean r6 = hd0.C98429r0.m127830u()
            if (r6 == 0) goto L_0x01e7
            int r6 = r12.f288562i
            if (r6 == r14) goto L_0x01e5
            if (r6 != r13) goto L_0x01e7
        L_0x01e5:
            r6 = 1
            goto L_0x01e8
        L_0x01e7:
            r6 = 0
        L_0x01e8:
            if (r6 != 0) goto L_0x01f2
            int r6 = r12.f288562i
            if (r6 == r3) goto L_0x01f2
            int r3 = r2.f230728K
            if (r3 != r4) goto L_0x0210
        L_0x01f2:
            java.lang.String r3 = r21.mo108768t()
            boolean r3 = r0.mo103081O(r3)
            if (r3 == 0) goto L_0x0210
            r8 = 123(0x7b, float:1.72E-43)
            r9 = 0
            android.content.Context r3 = r19.getContext()
            java.lang.String r10 = r3.getString(r15)
            r11 = 2131756134(0x7f100466, float:1.9143167E38)
            r6 = r18
            r7 = r5
            r6.mo107136c(r7, r8, r9, r10, r11)
        L_0x0210:
            boolean r3 = rb0.C47984k.m53333g()
            if (r3 == 0) goto L_0x0232
            ck3.b r3 = r0.f217425v
            boolean r3 = r3.mo91584y()
            if (r3 != 0) goto L_0x0232
            r3 = 114(0x72, float:1.6E-43)
            android.content.Context r6 = r19.getContext()
            r7 = 2131823541(0x7f110bb5, float:1.9279885E38)
            java.lang.String r6 = r6.getString(r7)
            r12 = r18
            r7 = 0
            r12.add((int) r5, (int) r3, (int) r7, (java.lang.CharSequence) r6)
            goto L_0x025a
        L_0x0232:
            r12 = r18
            goto L_0x025a
        L_0x0235:
            r12 = r18
            boolean r3 = r21.mo100983V3()
            if (r3 == 0) goto L_0x025a
            ke3.C88144b.m109788f(r7)
            boolean r3 = eb0.C75569c4.m90690w(r21)
            if (r3 != 0) goto L_0x025a
            r8 = 116(0x74, float:1.63E-43)
            r9 = 0
            android.content.Context r3 = r19.getContext()
            java.lang.String r10 = r3.getString(r6)
            r11 = 2131756032(0x7f100400, float:1.914296E38)
            r6 = r18
            r7 = r5
            r6.mo107136c(r7, r8, r9, r10, r11)
        L_0x025a:
            ck3.b r3 = r0.f217425v
            boolean r3 = r3.mo91584y()
            if (r3 != 0) goto L_0x0279
            r8 = 100
            r9 = 0
            android.content.Context r1 = r19.getContext()
            r3 = 2131823547(0x7f110bbb, float:1.9279897E38)
            java.lang.String r10 = r1.getString(r3)
            r11 = 2131756004(0x7f1003e4, float:1.9142903E38)
            r6 = r18
            r7 = r5
            r6.mo107136c(r7, r8, r9, r10, r11)
        L_0x0279:
            boolean r1 = eb0.C75569c4.m90663I(r21)
            if (r1 == 0) goto L_0x029f
            com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct
            r1.<init>()
            long r5 = r21.mo108774y2()
            r1.f194459d = r5
            int r3 = r21.getType()
            long r5 = (long) r3
            r1.f194460e = r5
            int r2 = eb0.C75569c4.m90678k(r21)
            long r2 = (long) r2
            r1.f194461f = r2
            r2 = 3
            r1.f194462g = r2
            r1.mo86054n()
        L_0x029f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74087k7.mo26235Z(nj3.e0, android.view.View, android.view.ContextMenu$ContextMenuInfo, com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        mo103157o0(f4Var).onClick(view);
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f217425v = bVar;
        C74123m7 m7Var = (C74123m7) cVar;
        C74123m7.m88220b(this, m7Var, f4Var, false, m7Var, bVar, C0966R.C0969drawable.by8, mo103157o0(f4Var), mo103098p(bVar));
        if (C74023i.m87878T()) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
            if (Zd != null && Zd.f288562i == 199) {
                if (mo103080N((C79368l) bVar.f193278b.mo102812a(C79368l.class), f4Var.getMsgId())) {
                    ImageView imageView = m7Var.f217568o;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        return;
                    }
                    return;
                }
            }
            ImageView imageView2 = m7Var.f217568o;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        if (z) {
            return i == 43 || i == 486539313;
        }
        return false;
    }

    /* renamed from: l0 */
    public boolean mo103033l0() {
        return true;
    }

    /* renamed from: o0 */
    public C74100l7 mo103157o0(C72963f4 f4Var) {
        if (this.f217426w == null) {
            this.f217426w = new C74100l7(this.f217425v, false);
        }
        this.f217426w.f217491f = 0;
        if (C75569c4.m90663I(f4Var)) {
            this.f217426w.f217491f = 2;
        }
        return this.f217426w;
    }
}
