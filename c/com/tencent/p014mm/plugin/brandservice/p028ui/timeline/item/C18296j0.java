package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C20739g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import s90.C77630j;
import sx3.C64197v;
import te3.me4;
import te3.ne4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.j0 */
public final class C18296j0 extends BizTLRecCardItem {

    /* renamed from: p */
    public View f50603p;

    /* renamed from: q */
    public LinearLayout f50604q;

    /* renamed from: r */
    public LinkedList<C18297a> f50605r = new LinkedList<>();

    /* renamed from: s */
    public final C18333q<C18297a> f50606s;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.j0$a */
    public final class C18297a extends C18339q3 {

        /* renamed from: D */
        public final Context f50607D;

        /* renamed from: E */
        public final View f50608E;

        /* renamed from: F */
        public final C77630j f50609F = new C77630j();

        /* renamed from: G */
        public final /* synthetic */ C18296j0 f50610G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18297a(C18296j0 j0Var, C18508z2 z2Var, Context context) {
            super(z2Var, context);
            C87412m.m108594g(z2Var, "adapter");
            C87412m.m108594g(context, "context");
            this.f50610G = j0Var;
            this.f50607D = context;
            View inflate = View.inflate(context, C0966R.C0971layout.f6613jq, (ViewGroup) null);
            this.f50608E = inflate;
            this.f50770n = inflate.findViewById(C0966R.C0970id.krm);
            this.f50771o = (ViewGroup) inflate.findViewById(C0966R.C0970id.bs4);
            View findViewById = inflate.findViewById(C0966R.C0970id.kp7);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMNeat7extView");
            this.f50772p = (MMNeat7extView) findViewById;
            this.f50773q = (TextView) inflate.findViewById(C0966R.C0970id.k_z);
            this.f50774r = inflate.findViewById(C0966R.C0970id.buq);
            this.f50775s = (ImageView) inflate.findViewById(C0966R.C0970id.bv8);
            this.f50776t = inflate.findViewById(C0966R.C0970id.ack);
            this.f50777u = (ImageView) inflate.findViewById(C0966R.C0970id.aet);
            this.f50778v = (ImageView) inflate.findViewById(C0966R.C0970id.f358928hx1);
            this.f50779w = inflate.findViewById(C0966R.C0970id.k0q);
            View findViewById2 = inflate.findViewById(C0966R.C0970id.efu);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f50780x = (TextView) findViewById2;
            this.f50781y = inflate.findViewById(C0966R.C0970id.hw8);
            this.f50782z = inflate.findViewById(C0966R.C0970id.hw7);
            this.f50766A = (TextView) inflate.findViewById(C0966R.C0970id.hwd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.j0$b */
    public static final class C18298b extends C87413o implements C32224a<C18297a> {

        /* renamed from: d */
        public final /* synthetic */ C18296j0 f50611d;

        /* renamed from: e */
        public final /* synthetic */ C18508z2 f50612e;

        /* renamed from: f */
        public final /* synthetic */ Context f50613f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18298b(C18296j0 j0Var, C18508z2 z2Var, Context context) {
            super(0);
            this.f50611d = j0Var;
            this.f50612e = z2Var;
            this.f50613f = context;
        }

        public Object invoke() {
            return new C18297a(this.f50611d, this.f50612e, this.f50613f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18296j0(C18508z2 z2Var, Context context) {
        super(context, z2Var);
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50606s = new C18333q<>(new C18298b(this, z2Var, context));
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        C19623o0 o0Var2 = o0Var;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view2, "parent");
        super.mo22815a(o0Var, i, view, view2);
        me4 w2 = o0Var.mo25773w2();
        if ((w2 != null ? w2.f64240e : null) != null) {
            View view3 = this.f50603p;
            if (view3 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            for (C18297a aVar2 : this.f50605r) {
                LinearLayout linearLayout = this.f50604q;
                if (linearLayout != null) {
                    linearLayout.removeView(aVar2.f50608E);
                }
                this.f50606s.mo22905b(aVar2);
            }
            this.f50605r.clear();
            LinkedList<ne4> linkedList = w2.f64242g;
            if (linkedList != null) {
                int i2 = 0;
                for (T next : linkedList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ne4 ne4 = (ne4) next;
                        if (ne4 == null || (ne4.f64281d & 1) != 0) {
                            C115669n.INSTANCE.idkeyStat(1149, 6, 1, false);
                        } else {
                            C18297a a = this.f50606s.mo22904a();
                            LinearLayout linearLayout2 = this.f50604q;
                            if (linearLayout2 != null) {
                                linearLayout2.addView(a.f50608E);
                            }
                            this.f50605r.add(a);
                            a.getClass();
                            Class cls = C45696d.class;
                            String str = ne4.f64282e;
                            String str2 = ne4.f64284g;
                            int i4 = ne4.f64288n;
                            String str3 = ne4.f64285h;
                            String str4 = ne4.f64286i;
                            a.f50772p.mo104279b(str);
                            a.f50608E.setBackgroundResource(i2 == 0 ? C0966R.C0969drawable.f4595ha : C0966R.C0969drawable.f4588h4);
                            a.f50608E.setOnClickListener(new C18238e0(a.f50610G, o0Var2, ne4, i2));
                            if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(1) && !Util.isNullOrNil(str2)) {
                                ((C45696d) C86709a0.m107533q(cls)).Tn0(str2, i4, 90, new Object[0]);
                            }
                            C77630j jVar = a.f50609F;
                            jVar.f226333o = i4;
                            jVar.f226330i = str3;
                            jVar.f226312D = str4;
                            jVar.f226326e = str2;
                            a.mo22920b(a.f50779w, a.f50780x, o0Var2, jVar);
                            a.f50778v.setVisibility(8);
                            View view4 = a.f50776t;
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar3.mo10233c(8);
                            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCard;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCard;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            a.f50610G.f50310e.f51445p.mo23101b(o0Var.mo25768r2());
                            C77630j jVar2 = a.f50609F;
                            if (jVar2.f226333o == 7) {
                                a.f50775s.setVisibility(8);
                                a.f50778v.setVisibility(8);
                                View view5 = a.f50776t;
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(0);
                                View view6 = view5;
                                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                Drawable drawable = a.f50777u.getDrawable();
                                if (drawable instanceof AnimationDrawable) {
                                    AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                                    if (animationDrawable.isRunning()) {
                                        animationDrawable.stop();
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(o0Var2.field_msgId);
                                sb.append('_');
                                sb.append(i2);
                                if (C87412m.m108589b(sb.toString(), C20739g.m22692d())) {
                                    a.f50777u.setImageResource(C0966R.C0969drawable.f4603hh);
                                    if (a.f50777u.getDrawable() instanceof AnimationDrawable) {
                                        Drawable drawable2 = a.f50777u.getDrawable();
                                        C87412m.m108592e(drawable2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                                        ((AnimationDrawable) drawable2).start();
                                    }
                                } else {
                                    a.f50777u.setImageResource(C0966R.C0969drawable.f4601hg);
                                }
                                String str5 = ne4.f64295u;
                                if (Util.isNullOrNil(str5)) {
                                    Log.m105924i("MicroMsg.BizTimeLineItem", "BizTLRecCardBizcontent playUrl null");
                                } else {
                                    ImageView imageView = a.f50777u;
                                    long j = o0Var2.field_msgId;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(o0Var2.field_msgId);
                                    sb4.append('_');
                                    sb4.append(i2);
                                    ((C20642c) C86312j.m106911c(C20642c.class)).mo32317iv(imageView, j, sb4.toString(), ne4.f64282e, str5, "", str5, ne4.f64285h);
                                    a.f50777u.setOnClickListener(new C18289i0(a));
                                }
                            } else if (!Util.isNullOrNil(jVar2.f226330i)) {
                                a.f50775s.setVisibility(0);
                                String str6 = Util.isNullOrNil(a.f50609F.f226312D) ? a.f50609F.f226330i : a.f50609F.f226312D;
                                C18479j jVar3 = a.f50825d.f51445p;
                                long j2 = o0Var2.field_orderFlag;
                                C77630j jVar4 = a.f50609F;
                                ImageView imageView2 = a.f50775s;
                                int i5 = C18508z2.f51416Q;
                                jVar3.mo23107i(j2, i2, jVar4, str6, imageView2, i5, i5, false, new C18242f0(a, o0Var2, i2), o0Var2.f55523h1 + 1, 2.0f);
                            } else {
                                int i6 = a.f50609F.f226333o;
                                if (i6 == 5 || i6 == 6) {
                                    a.f50775s.setVisibility(0);
                                    C18479j jVar5 = a.f50825d.f51445p;
                                    ImageView imageView3 = a.f50775s;
                                    int i7 = C18508z2.f51416Q;
                                    jVar5.mo23108j("2131231667", imageView3, i7, i7, o0Var2.f55523h1 + 1);
                                } else {
                                    View view7 = a.f50774r;
                                    C9556a aVar5 = new C9556a();
                                    aVar5.mo10233c(8);
                                    View view8 = view7;
                                    C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCard;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view8, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/TLRecCard;Lcom/tencent/mm/protocal/protobuf/TLRecCardAppMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                            C2108g0 g0Var = C2108g0.f12074d;
                            C55581h0 h0Var = C55581h0.f158251d;
                            if (i2 == 0) {
                                ViewGroup viewGroup = a.f50771o;
                                C87412m.m108593f(viewGroup, "content");
                                h0Var.mo237D(viewGroup, 0, Integer.valueOf(C18508z2.f51417R), 0, Integer.valueOf(C18508z2.f51419T));
                                View view9 = a.f50770n;
                                C87412m.m108593f(view9, "topLine");
                                g0Var.invoke(view9, Integer.valueOf(C76577a.m92150a(a.f50607D, 16.0f)));
                            } else if (i2 == 1) {
                                ViewGroup viewGroup2 = a.f50771o;
                                C87412m.m108593f(viewGroup2, "content");
                                h0Var.mo237D(viewGroup2, 0, Integer.valueOf(C18508z2.f51419T), 0, Integer.valueOf(C18508z2.f51417R));
                                View view10 = a.f50770n;
                                C87412m.m108593f(view10, "topLine");
                                g0Var.invoke(view10, Integer.valueOf(C18508z2.f51420U));
                            }
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            C20739g.m22690b(o0Var);
        }
    }

    /* renamed from: h */
    public void mo22816h(View view) {
        C87412m.m108594g(view, "parent");
        if (this.f50603p == null) {
            View inflate = ((ViewStub) view.findViewById(C0966R.C0970id.l8u)).inflate();
            C87412m.m108593f(inflate, "this");
            mo22817i(inflate);
            this.f50604q = (LinearLayout) inflate.findViewById(C0966R.C0970id.abd);
            this.f50603p = inflate;
        }
    }

    /* renamed from: k */
    public final void mo22881k() {
        View view = this.f50603p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontent", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
