package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.d2 */
public final class C18234d2 extends C18206a {

    /* renamed from: c */
    public final C18508z2 f50408c;

    /* renamed from: d */
    public final View f50409d;

    /* renamed from: e */
    public final C18296j0 f50410e;

    /* renamed from: f */
    public final C18380x0 f50411f;

    /* renamed from: g */
    public final C18286h2 f50412g;

    /* renamed from: h */
    public final C18326p0 f50413h;

    /* renamed from: i */
    public final C18365u0 f50414i;

    /* renamed from: j */
    public final C18335q1 f50415j;

    /* renamed from: k */
    public final C18321o2 f50416k;

    /* renamed from: l */
    public final C18386y1 f50417l;

    /* renamed from: m */
    public final C18253h1 f50418m;

    /* renamed from: n */
    public final LinearLayout f50419n;

    /* renamed from: o */
    public final LinearLayout f50420o;

    /* renamed from: p */
    public final LinearLayout f50421p;

    public C18234d2(Context context, C18508z2 z2Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
        this.f50408c = z2Var;
        View inflate = View.inflate(context, C0966R.C0971layout.f6619jw, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…_line_rec_card_new, null)");
        this.f50409d = inflate;
        this.f50410e = new C18296j0(z2Var, context);
        this.f50411f = new C18380x0(z2Var, context);
        this.f50412g = new C18286h2(context, z2Var);
        this.f50413h = new C18326p0(z2Var, context);
        this.f50414i = new C18365u0(z2Var);
        this.f50415j = new C18335q1(z2Var, context);
        this.f50416k = new C18321o2(z2Var, context);
        this.f50417l = new C18386y1(z2Var, context);
        this.f50418m = new C18253h1(inflate, z2Var, context);
        this.f50419n = (LinearLayout) inflate.findViewById(C0966R.C0970id.ae6);
        this.f50420o = (LinearLayout) inflate.findViewById(C0966R.C0970id.adt);
        this.f50421p = (LinearLayout) inflate.findViewById(C0966R.C0970id.abf);
    }

    /* renamed from: a */
    public final void mo22846a() {
        this.f50419n.setVisibility(8);
        this.f50420o.setVisibility(8);
        this.f50410e.mo22881k();
        this.f50411f.mo22938k();
        this.f50412g.mo22876d();
        this.f50413h.mo22900i();
        this.f50414i.mo22929h();
        this.f50415j.mo22907i();
        this.f50416k.mo22898h();
        this.f50417l.mo22951s();
        this.f50421p.setVisibility(0);
    }
}
