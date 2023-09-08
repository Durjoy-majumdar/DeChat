package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t3 */
public class C19783t3 extends C74023i.C74026c {

    /* renamed from: b */
    public LinearLayout f56260b;

    /* renamed from: c */
    public C19787x3 f56261c = new C19787x3();

    /* renamed from: d */
    public List<C19781r3> f56262d = new ArrayList();

    /* renamed from: e */
    public TextView f56263e;

    /* renamed from: f */
    public C19789z3 f56264f = new C19789z3();

    /* renamed from: g */
    public C19786w3 f56265g = new C19786w3();

    /* renamed from: h */
    public C19761a4 f56266h = new C19761a4();

    /* renamed from: i */
    public C19785v3 f56267i = new C19785v3();

    /* renamed from: j */
    public C19788y3 f56268j = new C19788y3();

    /* renamed from: k */
    public C19784u3 f56269k = new C19784u3();

    /* renamed from: a */
    public C74023i.C74026c mo26265a(View view) {
        LinearLayout linearLayout = this.f56260b;
        C19781r3 r3Var = new C19781r3();
        r3Var.f56245a = view;
        r3Var.f56246b = view.findViewById(C0966R.C0970id.krm);
        r3Var.f56247c = view.findViewById(C0966R.C0970id.bs4);
        r3Var.f56248d = (MMNeat7extView) view.findViewById(C0966R.C0970id.knx);
        r3Var.f56249e = (TextView) view.findViewById(C0966R.C0970id.k_z);
        r3Var.f56250f = view.findViewById(C0966R.C0970id.buq);
        r3Var.f56251g = (ImageView) view.findViewById(C0966R.C0970id.buo);
        r3Var.f56252h = (ImageView) view.findViewById(C0966R.C0970id.f358928hx1);
        r3Var.f56253i = (ImageView) view.findViewById(C0966R.C0970id.b74);
        r3Var.f56254j = view.findViewById(C0966R.C0970id.ack);
        r3Var.f56256l = (ImageView) view.findViewById(C0966R.C0970id.hw9);
        r3Var.f56255k = (TextView) view.findViewById(C0966R.C0970id.hwd);
        linearLayout.addView(view, linearLayout.getChildCount());
        ((ArrayList) this.f56262d).add(r3Var);
        return this;
    }

    public View getMainContainerView() {
        return this.f56260b;
    }
}
