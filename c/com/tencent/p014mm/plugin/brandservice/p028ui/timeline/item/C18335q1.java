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
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import s90.C77630j;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.re4;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q1 */
public final class C18335q1 extends C18366u2 {

    /* renamed from: d */
    public final C18508z2 f50743d;

    /* renamed from: e */
    public final Context f50744e;

    /* renamed from: f */
    public View f50745f;

    /* renamed from: g */
    public View f50746g;

    /* renamed from: h */
    public WeImageView f50747h;

    /* renamed from: i */
    public LinearLayout f50748i;

    /* renamed from: j */
    public LinkedList<C18336a> f50749j = new LinkedList<>();

    /* renamed from: k */
    public final C18333q<C18336a> f50750k = new C18333q<>(new C18338c(this));

    /* renamed from: l */
    public C18313m f50751l;

    /* renamed from: m */
    public C18246g f50752m;

    /* renamed from: n */
    public View f50753n;

    /* renamed from: o */
    public TextView f50754o;

    /* renamed from: p */
    public TextView f50755p;

    /* renamed from: q */
    public int f50756q;

    /* renamed from: r */
    public boolean f50757r;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q1$a */
    public final class C18336a extends C18339q3 {

        /* renamed from: D */
        public final C18508z2 f50758D;

        /* renamed from: E */
        public final Context f50759E;

        /* renamed from: F */
        public final View f50760F;

        /* renamed from: G */
        public final C77630j f50761G = new C77630j();

        /* renamed from: H */
        public final /* synthetic */ C18335q1 f50762H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18336a(C18335q1 q1Var, C18508z2 z2Var, Context context) {
            super(z2Var, context);
            C87412m.m108594g(z2Var, "adapter");
            C87412m.m108594g(context, "context");
            this.f50762H = q1Var;
            this.f50758D = z2Var;
            this.f50759E = context;
            View inflate = View.inflate(context, C0966R.C0971layout.f6614jr, (ViewGroup) null);
            this.f50760F = inflate;
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

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q1$b */
    public static final class C18337b extends C87413o implements C32226l<C22495eh, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C18335q1 f50763d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f50764e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18337b(C18335q1 q1Var, C19623o0 o0Var) {
            super(1);
            this.f50763d = q1Var;
            this.f50764e = o0Var;
        }

        public Object invoke(Object obj) {
            C22495eh ehVar = (C22495eh) obj;
            C87412m.m108594g(ehVar, "bizInfo");
            if (ehVar.f63800n.get(0).f63760q == 5) {
                C18335q1 q1Var = this.f50763d;
                C18313m mVar = q1Var.f50751l;
                View view = q1Var.f50745f;
                C87412m.m108591d(view);
                mVar.mo22894g(view, this.f50764e, ehVar);
                this.f50763d.f50752m.mo22885a();
                C18335q1 q1Var2 = this.f50763d;
                q1Var2.f50757r = true;
                C19623o0 o0Var = this.f50764e;
                C87412m.m108594g(o0Var, "info");
                C16825a.f45444a.mo17868f(o0Var, q1Var2);
                C18335q1 q1Var3 = this.f50763d;
                q1Var3.f50751l.f50639m = new C18348r1(q1Var3, this.f50764e);
            } else {
                C18335q1 q1Var4 = this.f50763d;
                C18246g gVar = q1Var4.f50752m;
                View view2 = q1Var4.f50745f;
                C87412m.m108591d(view2);
                gVar.mo22853g(view2, this.f50764e, ehVar);
                this.f50763d.f50751l.mo22885a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q1$c */
    public static final class C18338c extends C87413o implements C32224a<C18336a> {

        /* renamed from: d */
        public final /* synthetic */ C18335q1 f50765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18338c(C18335q1 q1Var) {
            super(0);
            this.f50765d = q1Var;
        }

        public Object invoke() {
            C18335q1 q1Var = this.f50765d;
            return new C18336a(q1Var, q1Var.f50743d, q1Var.f50744e);
        }
    }

    public C18335q1(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50743d = z2Var;
        this.f50744e = context;
        this.f50751l = new C18313m(context, z2Var);
        this.f50752m = new C18246g(context, z2Var);
        this.f50756q = -1;
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        C18335q1 q1Var;
        boolean z;
        C19623o0 o0Var2;
        C19623o0 o0Var3 = o0Var;
        View view3 = view;
        View view4 = view2;
        C87412m.m108594g(o0Var3, "info");
        C87412m.m108594g(view3, "convertView");
        C87412m.m108594g(view4, "parent");
        if (this.f50745f == null) {
            View inflate = ((ViewStub) view4.findViewById(C0966R.C0970id.l99)).inflate();
            this.f50746g = inflate.findViewById(C0966R.C0970id.bes);
            this.f50747h = (WeImageView) inflate.findViewById(C0966R.C0970id.ber);
            this.f50748i = (LinearLayout) inflate.findViewById(C0966R.C0970id.abd);
            this.f50753n = inflate.findViewById(C0966R.C0970id.aed);
            this.f50754o = (TextView) inflate.findViewById(C0966R.C0970id.hfq);
            this.f50755p = (TextView) inflate.findViewById(C0966R.C0970id.fey);
            this.f50745f = inflate;
        }
        this.f50756q = -1;
        LinkedList<C22495eh> linkedList = o0Var.mo25774x2().f64523o.f63905g;
        C87412m.m108593f(linkedList, "info.tlRecCardWrapper.extraInfo.BizInfo");
        int i2 = 0;
        int i3 = 0;
        for (T next : C110818d0.m150947s0(linkedList, 2)) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                if (((C22495eh) next).f63793d == 0) {
                    i2++;
                    int i5 = this.f50756q;
                    if (i5 != -1) {
                        i3 = i5;
                    }
                    this.f50756q = i3;
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (i2 <= 0 || this.f50756q == -1) {
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view5 = view;
        C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view6 = this.f50745f;
        if (view6 != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f50757r = false;
        C18337b bVar = new C18337b(this, o0Var3);
        if (i2 == 1) {
            o0Var2 = o0Var3;
            z = false;
            q1Var = this;
            C22495eh ehVar = o0Var.mo25774x2().f64523o.f63905g.get(q1Var.f50756q);
            C87412m.m108593f(ehVar, "info.tlRecCardWrapper.ex…aInfo.BizInfo[firstIndex]");
            bVar.invoke(ehVar);
            for (C18336a aVar3 : q1Var.f50749j) {
                LinearLayout linearLayout = q1Var.f50748i;
                if (linearLayout != null) {
                    linearLayout.removeView(aVar3.f50760F);
                }
                q1Var.f50750k.mo22905b(aVar3);
            }
            q1Var.f50749j.clear();
        } else if (i2 != 2) {
            q1Var = this;
            o0Var2 = o0Var3;
            z = false;
        } else {
            C22495eh ehVar2 = o0Var.mo25774x2().f64523o.f63905g.get(0);
            C87412m.m108593f(ehVar2, "info.tlRecCardWrapper.extraInfo.BizInfo[0]");
            bVar.invoke(ehVar2);
            C22495eh ehVar3 = o0Var.mo25774x2().f64523o.f63905g.get(1);
            C87412m.m108593f(ehVar3, "info.tlRecCardWrapper.extraInfo.BizInfo[1]");
            C22495eh ehVar4 = ehVar3;
            for (C18336a aVar4 : this.f50749j) {
                LinearLayout linearLayout2 = this.f50748i;
                if (linearLayout2 != null) {
                    linearLayout2.removeView(aVar4.f50760F);
                }
                this.f50750k.mo22905b(aVar4);
            }
            this.f50749j.clear();
            C18336a a = this.f50750k.mo22904a();
            LinearLayout linearLayout3 = this.f50748i;
            if (linearLayout3 != null) {
                linearLayout3.addView(a.f50760F);
            }
            this.f50749j.add(a);
            C22493dh dhVar = ehVar4.f63800n.get(0);
            C87412m.m108593f(dhVar, "bizInfo.AppMsg[0]");
            C22493dh dhVar2 = dhVar;
            a.getClass();
            Class cls = C45696d.class;
            String str = dhVar2.f63751e;
            String str2 = dhVar2.f63755i;
            int i6 = dhVar2.f63760q;
            String str3 = dhVar2.f63757n;
            String str4 = dhVar2.f63758o;
            a.f50772p.mo104279b(str);
            C8219i iVar = C8219i.f27144a;
            a.f50760F.setBackgroundResource(C0966R.C0969drawable.f4588h4);
            C18310l1 l1Var = r1;
            View view8 = a.f50760F;
            String str5 = str4;
            C18310l1 l1Var2 = new C18310l1(a, o0Var, ehVar4, dhVar2, 1);
            view8.setOnClickListener(l1Var);
            if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(1) && !Util.isNullOrNil(str2)) {
                ((C45696d) C86709a0.m107533q(cls)).Tn0(str2, i6, 90, new Object[0]);
            }
            C77630j jVar = a.f50761G;
            jVar.f226333o = i6;
            jVar.f226330i = str3;
            jVar.f226312D = str5;
            jVar.f226326e = str2;
            View view9 = a.f50779w;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.f50780x.setText(!Util.isNullOrNil(dhVar2.f63744C) ? String.valueOf(dhVar2.f63744C) : "");
            a.f50778v.setVisibility(8);
            a.f50778v.setImageResource(C0966R.C0969drawable.f4600hf);
            View view11 = a.f50776t;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C77630j jVar2 = a.f50761G;
            if (jVar2.f226333o == 7) {
                a.f50775s.setVisibility(8);
                a.f50778v.setVisibility(8);
                View view13 = a.f50776t;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;ILcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;ILcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Drawable drawable = a.f50777u.getDrawable();
                if (drawable instanceof AnimationDrawable) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                    if (animationDrawable.isRunning()) {
                        animationDrawable.stop();
                    }
                }
                StringBuilder sb = new StringBuilder();
                o0Var2 = o0Var;
                z = false;
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
                    a.f50777u.setOnClickListener(new C18330p1(a, o0Var2, dhVar2));
                }
            } else {
                o0Var2 = o0Var;
                z = false;
                if (!Util.isNullOrNil(jVar2.f226330i)) {
                    a.f50775s.setVisibility(0);
                    C18479j jVar3 = a.f50825d.f51445p;
                    long j2 = o0Var2.field_msgId;
                    C77630j jVar4 = a.f50761G;
                    String j3 = C92721n.m116882j(jVar4);
                    ImageView imageView2 = a.f50775s;
                    int i7 = C18508z2.f51416Q;
                    jVar3.mo23107i(j2, 1, jVar4, j3, imageView2, i7, i7, false, new C18314m1(a, o0Var2, 1), o0Var2.f55523h1 + 1, 2.0f);
                    if (a.f50761G.f226333o == 5) {
                        a.f50778v.setVisibility(0);
                    }
                } else {
                    int i8 = a.f50761G.f226333o;
                    if (i8 == 5 || i8 == 6) {
                        a.f50778v.setVisibility(0);
                        a.f50775s.setVisibility(0);
                        C18479j jVar5 = a.f50825d.f51445p;
                        ImageView imageView3 = a.f50775s;
                        int i9 = C18508z2.f51416Q;
                        jVar5.mo23108j("2131231667", imageView3, i9, i9, o0Var2.f55523h1 + 1);
                    } else {
                        View view15 = a.f50774r;
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(8);
                        View view16 = view15;
                        C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view16, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            C2115n1 n1Var = C2115n1.f12081d;
            C55584o1 o1Var = C55584o1.f158254d;
            ViewGroup viewGroup = a.f50771o;
            C87412m.m108593f(viewGroup, "content");
            o1Var.mo237D(viewGroup, Integer.valueOf(z ? 1 : 0), Integer.valueOf(C18508z2.f51419T), Integer.valueOf(z), Integer.valueOf(C18508z2.f51417R));
            View view17 = a.f50770n;
            C87412m.m108593f(view17, "topLine");
            n1Var.invoke(view17, Integer.valueOf(C18508z2.f51420U));
            q1Var = this;
        }
        TextView textView = q1Var.f50754o;
        if (textView != null) {
            textView.setText(o0Var2.f55530o1.f64523o.f63902d);
        }
        C8219i iVar2 = C8219i.f27144a;
        iVar2.mo9271b(q1Var.f50754o);
        View view18 = q1Var.f50753n;
        if (view18 != null) {
            view18.setOnLongClickListener(new C18359t1(q1Var, o0Var2));
        }
        if (Util.isNullOrNil((List) o0Var.mo25774x2().f64523o.f63910o) || o0Var.mo25774x2().f64523o.f63911p != 1) {
            View view19 = q1Var.f50746g;
            if (view19 != null) {
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar9.mo10233c(8);
                View view20 = view19;
                C117292a.m165358d(view20, aVar9.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view19.setVisibility(((Integer) aVar9.mo10231a(z)).intValue());
                C117292a.m165359e(view20, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view21 = q1Var.f50746g;
            if (view21 != null) {
                C9556a aVar10 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar10.mo10233c(Integer.valueOf(z));
                View view22 = view21;
                C117292a.m165358d(view22, aVar10.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view21.setVisibility(((Integer) aVar10.mo10231a(z)).intValue());
                C117292a.m165359e(view22, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "refreshClose", "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view23 = q1Var.f50746g;
            if (view23 != null) {
                view23.setOnClickListener(new C18352s1(o0Var2, q1Var, i));
            }
        }
        re4 x2 = o0Var.mo25774x2();
        C87412m.m108593f(x2, "info.tlRecCardWrapper");
        C22499hb0 hb02 = x2.f64523o;
        if (Util.isNullOrNil(hb02.f63913r)) {
            TextView textView2 = q1Var.f50755p;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            View view24 = q1Var.f50753n;
            if (view24 != null) {
                view24.setOnClickListener((View.OnClickListener) null);
                return;
            }
            return;
        }
        TextView textView3 = q1Var.f50755p;
        if (textView3 != null) {
            textView3.setVisibility(z ? 1 : 0);
        }
        TextView textView4 = q1Var.f50755p;
        if (textView4 != null) {
            textView4.setText(hb02.f63913r);
        }
        iVar2.mo9271b(q1Var.f50755p);
        if (Util.isNullOrNil(hb02.f63912q)) {
            View view25 = q1Var.f50753n;
            if (view25 != null) {
                view25.setClickable(z);
                return;
            }
            return;
        }
        TextView textView5 = q1Var.f50755p;
        if (textView5 != null) {
            textView5.post(new C105110u1(q1Var, x2));
        }
        C18376w1 w1Var = new C18376w1(hb02, q1Var, x2, o0Var2);
        View view26 = q1Var.f50753n;
        if (view26 != null) {
            view26.setOnClickListener(new C2119v1(w1Var));
        }
    }

    /* renamed from: c */
    public Object mo22832c(C15601d<? super View> dVar) {
        return this.f50751l.f50670p;
    }

    /* renamed from: e */
    public boolean mo22833e() {
        return this.f50757r;
    }

    /* renamed from: f */
    public void mo22834f(int i) {
    }

    /* renamed from: h */
    public void mo22906h(C19623o0 o0Var, String str) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(str, "extra");
        C16825a.f45444a.mo17864b(o0Var, str);
    }

    /* renamed from: i */
    public final void mo22907i() {
        View view = this.f50745f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
