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
import by0.C16825a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C20739g;
import fy0.C8219i;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import rx3.C13598b0;
import s90.C77630j;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.me4;
import te3.re4;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.p0 */
public final class C18326p0 extends C18366u2 {

    /* renamed from: d */
    public final C18508z2 f50711d;

    /* renamed from: e */
    public final Context f50712e;

    /* renamed from: f */
    public View f50713f;

    /* renamed from: g */
    public View f50714g;

    /* renamed from: h */
    public ImageView f50715h;

    /* renamed from: i */
    public TextView f50716i;

    /* renamed from: j */
    public View f50717j;

    /* renamed from: k */
    public WeImageView f50718k;

    /* renamed from: l */
    public LinearLayout f50719l;

    /* renamed from: m */
    public LinkedList<C18327a> f50720m = new LinkedList<>();

    /* renamed from: n */
    public final C18333q<C18327a> f50721n = new C18333q<>(new C18329c(this));

    /* renamed from: o */
    public C18313m f50722o;

    /* renamed from: p */
    public C18246g f50723p;

    /* renamed from: q */
    public boolean f50724q;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.p0$a */
    public final class C18327a extends C18339q3 {

        /* renamed from: D */
        public final C18508z2 f50725D;

        /* renamed from: E */
        public final Context f50726E;

        /* renamed from: F */
        public final View f50727F;

        /* renamed from: G */
        public final C77630j f50728G = new C77630j();

        /* renamed from: H */
        public final /* synthetic */ C18326p0 f50729H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18327a(C18326p0 p0Var, C18508z2 z2Var, Context context) {
            super(z2Var, context);
            C87412m.m108594g(z2Var, "adapter");
            C87412m.m108594g(context, "context");
            this.f50729H = p0Var;
            this.f50725D = z2Var;
            this.f50726E = context;
            View inflate = View.inflate(context, C0966R.C0971layout.f6614jr, (ViewGroup) null);
            this.f50727F = inflate;
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

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.p0$b */
    public static final class C18328b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C18326p0 f50730d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f50731e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18328b(C18326p0 p0Var, C19623o0 o0Var) {
            super(0);
            this.f50730d = p0Var;
            this.f50731e = o0Var;
        }

        public Object invoke() {
            this.f50730d.mo22899h(this.f50731e, "");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.p0$c */
    public static final class C18329c extends C87413o implements C32224a<C18327a> {

        /* renamed from: d */
        public final /* synthetic */ C18326p0 f50732d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18329c(C18326p0 p0Var) {
            super(0);
            this.f50732d = p0Var;
        }

        public Object invoke() {
            C18326p0 p0Var = this.f50732d;
            return new C18327a(p0Var, p0Var.f50711d, p0Var.f50712e);
        }
    }

    public C18326p0(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50711d = z2Var;
        this.f50712e = context;
        this.f50722o = new C18313m(context, z2Var);
        this.f50723p = new C18246g(context, z2Var);
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        boolean z;
        C22499hb0 hb02;
        C19623o0 o0Var2 = o0Var;
        View view3 = view;
        View view4 = view2;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view3, "convertView");
        C87412m.m108594g(view4, "parent");
        if (this.f50713f == null) {
            View inflate = ((ViewStub) view4.findViewById(C0966R.C0970id.l8v)).inflate();
            this.f50714g = inflate.findViewById(C0966R.C0970id.a_m);
            this.f50715h = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            this.f50716i = (TextView) inflate.findViewById(C0966R.C0970id.hfq);
            this.f50717j = inflate.findViewById(C0966R.C0970id.bes);
            this.f50718k = (WeImageView) inflate.findViewById(C0966R.C0970id.ber);
            this.f50719l = (LinearLayout) inflate.findViewById(C0966R.C0970id.abd);
            this.f50713f = inflate;
        }
        re4 x2 = o0Var.mo25774x2();
        C87412m.m108593f(x2, "info.tlRecCardWrapper");
        C18334q0 q0Var = C18334q0.f50742d;
        me4 me4 = x2.f64515d;
        if (me4 != null && me4.f64240e != null && (hb02 = x2.f64523o) != null && !Util.isNullOrNil((List) hb02.f63905g)) {
            LinkedList<C22495eh> linkedList = x2.f64523o.f63905g;
            C87412m.m108593f(linkedList, "wrapper.extraInfo.BizInfo");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                C22495eh ehVar = (C22495eh) it.next();
                C87412m.m108593f(ehVar, "info");
                if (!((Boolean) q0Var.invoke(ehVar)).booleanValue()) {
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view5 = view;
            C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = this.f50713f;
            if (view6 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C22495eh ehVar2 = o0Var.mo25774x2().f64523o.f63905g.get(0);
            C87412m.m108593f(ehVar2, "bizInfo");
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(this.f50715h, ehVar2.f63794e);
            TextView textView = this.f50716i;
            if (textView != null) {
                textView.setText(ehVar2.f63795f);
            }
            C8219i.f27144a.mo9271b(this.f50716i);
            View view8 = this.f50714g;
            if (view8 != null) {
                view8.setOnClickListener(new C18351s0(o0Var2, this));
            }
            View view9 = this.f50714g;
            if (view9 != null) {
                view9.setOnLongClickListener(new C18358t0(this, o0Var2, ehVar2));
            }
            if (Util.isNullOrNil((List) ehVar2.f63801o) || ehVar2.f63802p != 1) {
                View view10 = this.f50717j;
                if (view10 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                View view12 = this.f50717j;
                if (view12 != null) {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view13 = view12;
                    C117292a.m165358d(view13, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view14 = this.f50717j;
                if (view14 != null) {
                    view14.setOnClickListener(new C18347r0(o0Var2, ehVar2, this, i));
                }
            }
            this.f50724q = false;
            if (ehVar2.f63800n.get(0).f63760q == 5) {
                this.f50724q = true;
                C18313m mVar = this.f50722o;
                View view15 = this.f50713f;
                C87412m.m108591d(view15);
                mVar.mo22894g(view15, o0Var2, ehVar2);
                this.f50723p.mo22885a();
                C16825a.f45444a.mo17868f(o0Var2, this);
                this.f50722o.f50639m = new C18328b(this, o0Var2);
            } else {
                C18246g gVar = this.f50723p;
                View view16 = this.f50713f;
                C87412m.m108591d(view16);
                gVar.mo22853g(view16, o0Var2, ehVar2);
                this.f50722o.mo22885a();
            }
            for (C18327a aVar5 : this.f50720m) {
                LinearLayout linearLayout = this.f50719l;
                if (linearLayout != null) {
                    linearLayout.removeView(aVar5.f50727F);
                }
                this.f50721n.mo22905b(aVar5);
            }
            this.f50720m.clear();
            if (ehVar2.f63800n.size() > 1) {
                C18327a a = this.f50721n.mo22904a();
                LinearLayout linearLayout2 = this.f50719l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(a.f50727F);
                }
                this.f50720m.add(a);
                C22493dh dhVar = ehVar2.f63800n.get(1);
                C87412m.m108593f(dhVar, "bizInfo.AppMsg[1]");
                C22493dh dhVar2 = dhVar;
                a.getClass();
                Class cls = C45696d.class;
                String str = dhVar2.f63751e;
                String str2 = dhVar2.f63755i;
                int i2 = dhVar2.f63760q;
                String str3 = dhVar2.f63757n;
                String str4 = dhVar2.f63758o;
                a.f50772p.mo104279b(str);
                C8219i iVar = C8219i.f27144a;
                a.f50727F.setBackgroundResource(C0966R.C0969drawable.f4588h4);
                C18305k0 k0Var = r1;
                View view17 = a.f50727F;
                String str5 = str4;
                C18305k0 k0Var2 = new C18305k0(a, o0Var, ehVar2, dhVar2, 1);
                view17.setOnClickListener(k0Var2);
                if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(1) && !Util.isNullOrNil(str2)) {
                    ((C45696d) C86709a0.m107533q(cls)).Tn0(str2, i2, 90, new Object[0]);
                }
                C77630j jVar = a.f50728G;
                jVar.f226333o = i2;
                jVar.f226330i = str3;
                jVar.f226312D = str5;
                jVar.f226326e = str2;
                View view18 = a.f50779w;
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar6.mo10233c(0);
                View view19 = view18;
                C117292a.m165358d(view19, aVar6.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view19, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a.f50780x.setText(!Util.isNullOrNil(dhVar2.f63744C) ? String.valueOf(dhVar2.f63744C) : "");
                a.f50778v.setVisibility(8);
                a.f50778v.setImageResource(C0966R.C0969drawable.f4600hf);
                View view20 = a.f50776t;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view21 = view20;
                C117292a.m165358d(view21, aVar7.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view21, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C77630j jVar2 = a.f50728G;
                if (jVar2.f226333o == 7) {
                    a.f50775s.setVisibility(8);
                    a.f50778v.setVisibility(8);
                    View view22 = a.f50776t;
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(0);
                    View view23 = view22;
                    C117292a.m165358d(view23, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;ILcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view22.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view23, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;ILcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                    sb.append(1);
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
                    String str6 = dhVar2.f63745D;
                    if (Util.isNullOrNil(str6)) {
                        Log.m105924i("MicroMsg.BizTimeLineItem", "BizTLRecCardBizcontent playUrl null");
                    } else {
                        ImageView imageView = a.f50777u;
                        long j = o0Var2.field_msgId;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(o0Var2.field_msgId);
                        sb4.append('_');
                        sb4.append(1);
                        ((C20642c) C86312j.m106911c(C20642c.class)).mo32317iv(imageView, j, sb4.toString(), dhVar2.f63751e, str6, "", str6, dhVar2.f63757n);
                        a.f50777u.setOnClickListener(new C18320o0(a, o0Var2, dhVar2));
                    }
                } else if (!Util.isNullOrNil(jVar2.f226330i)) {
                    a.f50775s.setVisibility(0);
                    C18479j jVar3 = a.f50825d.f51445p;
                    long j2 = o0Var2.field_msgId;
                    C77630j jVar4 = a.f50728G;
                    String j3 = C92721n.m116882j(jVar4);
                    ImageView imageView2 = a.f50775s;
                    int i3 = C18508z2.f51416Q;
                    jVar3.mo23107i(j2, 1, jVar4, j3, imageView2, i3, i3, false, new C18309l0(a, o0Var2, 1), o0Var2.f55523h1 + 1, 2.0f);
                    if (a.f50728G.f226333o == 5) {
                        a.f50778v.setVisibility(0);
                    }
                } else {
                    int i4 = a.f50728G.f226333o;
                    if (i4 == 5 || i4 == 6) {
                        a.f50778v.setVisibility(0);
                        a.f50775s.setVisibility(0);
                        C18479j jVar5 = a.f50825d.f51445p;
                        ImageView imageView3 = a.f50775s;
                        int i5 = C18508z2.f51416Q;
                        jVar5.mo23108j("2131231667", imageView3, i5, i5, o0Var2.f55523h1 + 1);
                    } else {
                        View view24 = a.f50774r;
                        C9556a aVar9 = new C9556a();
                        aVar9.mo10233c(8);
                        View view25 = view24;
                        C117292a.m165358d(view25, aVar9.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view24.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view25, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                C2113m0 m0Var = C2113m0.f12079d;
                C55583n0 n0Var = C55583n0.f158253d;
                ViewGroup viewGroup = a.f50771o;
                C87412m.m108593f(viewGroup, "content");
                n0Var.mo237D(viewGroup, (Object) null, Integer.valueOf(C18508z2.f51419T), (Object) null, Integer.valueOf(C18508z2.f51417R));
                View view26 = a.f50770n;
                C87412m.m108593f(view26, "topLine");
                m0Var.invoke(view26, Integer.valueOf(C18508z2.f51420U));
                C77630j jVar6 = a.f50728G;
                int i6 = jVar6.f226333o;
                if (i6 == 5) {
                    C40726l.f109414a.mo63636e(jVar6.f226326e, i6);
                }
            }
            C20739g.m22690b(o0Var);
        }
    }

    /* renamed from: c */
    public Object mo22832c(C15601d<? super View> dVar) {
        return this.f50722o.f50670p;
    }

    /* renamed from: e */
    public boolean mo22833e() {
        return this.f50724q;
    }

    /* renamed from: f */
    public void mo22834f(int i) {
    }

    /* renamed from: h */
    public void mo22899h(C19623o0 o0Var, String str) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(str, "extra");
        C16825a.f45444a.mo17864b(o0Var, str);
    }

    /* renamed from: i */
    public final void mo22900i() {
        View view = this.f50713f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
