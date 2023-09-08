package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.bizui.widget.BizRecTagTextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C8219i;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import p243tn.C14050a;
import qx0.C22136a;
import s90.C77630j;
import sx3.C64197v;
import te3.C22491bj2;
import te3.C22508lo3;
import te3.C22533wo3;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i3 */
public final class C18291i3 extends C18366u2 {

    /* renamed from: d */
    public final C18508z2 f50572d;

    /* renamed from: e */
    public final Context f50573e;

    /* renamed from: f */
    public View f50574f;

    /* renamed from: g */
    public View f50575g;

    /* renamed from: h */
    public TextView f50576h;

    /* renamed from: i */
    public View f50577i;

    /* renamed from: j */
    public TextView f50578j;

    /* renamed from: k */
    public WeImageView f50579k;

    /* renamed from: l */
    public LinearLayout f50580l;

    /* renamed from: m */
    public View f50581m;

    /* renamed from: n */
    public ImageView f50582n;

    /* renamed from: o */
    public View f50583o;

    /* renamed from: p */
    public LinearLayout f50584p;

    /* renamed from: q */
    public BizRecTagTextView f50585q;

    /* renamed from: r */
    public LinkedList<C18292a> f50586r = new LinkedList<>();

    /* renamed from: s */
    public int f50587s = 2002;

    /* renamed from: t */
    public final C18333q<C18292a> f50588t = new C18333q<>(new C18293b(this));

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i3$a */
    public final class C18292a extends C18339q3 {

        /* renamed from: D */
        public final C18508z2 f50589D;

        /* renamed from: E */
        public final Context f50590E;

        /* renamed from: F */
        public final View f50591F;

        /* renamed from: G */
        public LinearLayout f50592G;

        /* renamed from: H */
        public final C77630j f50593H = new C77630j();

        /* renamed from: I */
        public final /* synthetic */ C18291i3 f50594I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18292a(C18291i3 i3Var, C18508z2 z2Var, Context context) {
            super(z2Var, context);
            C87412m.m108594g(z2Var, "adapter");
            C87412m.m108594g(context, "context");
            this.f50594I = i3Var;
            this.f50589D = z2Var;
            this.f50590E = context;
            View inflate = View.inflate(context, C0966R.C0971layout.f6628k5, (ViewGroup) null);
            this.f50591F = inflate;
            this.f50770n = inflate.findViewById(C0966R.C0970id.krm);
            this.f50771o = (ViewGroup) inflate.findViewById(C0966R.C0970id.bs4);
            this.f50772p = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.kp7);
            this.f50592G = (LinearLayout) inflate.findViewById(C0966R.C0970id.b6x);
            this.f50774r = inflate.findViewById(C0966R.C0970id.buq);
            this.f50775s = (ImageView) inflate.findViewById(C0966R.C0970id.bv8);
            this.f50778v = (ImageView) inflate.findViewById(C0966R.C0970id.f358928hx1);
            this.f50781y = inflate.findViewById(C0966R.C0970id.hw8);
            this.f50782z = inflate.findViewById(C0966R.C0970id.hw7);
        }

        /* renamed from: d */
        public void mo22879d(C77630j jVar, C19623o0 o0Var, int i, boolean z) {
            C87412m.m108594g(jVar, "item");
            if (jVar.f226333o == 8) {
                View view = this.f50781y;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z) {
                    this.f50782z.setBackgroundResource(C0966R.C0969drawable.f4608ho);
                } else {
                    this.f50782z.setBackgroundResource(C0966R.C0969drawable.ags);
                }
            } else {
                View view3 = this.f50781y;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i3$b */
    public static final class C18293b extends C87413o implements C32224a<C18292a> {

        /* renamed from: d */
        public final /* synthetic */ C18291i3 f50595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18293b(C18291i3 i3Var) {
            super(0);
            this.f50595d = i3Var;
        }

        public Object invoke() {
            C18291i3 i3Var = this.f50595d;
            return new C18292a(i3Var, i3Var.f50572d, i3Var.f50573e);
        }
    }

    public C18291i3(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50572d = z2Var;
        this.f50573e = context;
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        int i2;
        String str;
        int i3;
        Integer num;
        int i4;
        int i5;
        C18292a aVar;
        Integer num2;
        C19623o0 o0Var2 = o0Var;
        int i6 = i;
        View view3 = view2;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view3, "parent");
        if (this.f50574f == null) {
            View inflate = ((ViewStub) view3.findViewById(C0966R.C0970id.l94)).inflate();
            this.f50575g = inflate.findViewById(C0966R.C0970id.bes);
            this.f50582n = (ImageView) inflate.findViewById(C0966R.C0970id.krb);
            this.f50585q = (BizRecTagTextView) inflate.findViewById(C0966R.C0970id.f359015if1);
            this.f50584p = (LinearLayout) inflate.findViewById(C0966R.C0970id.if5);
            this.f50583o = inflate.findViewById(C0966R.C0970id.krm);
            this.f50579k = (WeImageView) inflate.findViewById(C0966R.C0970id.ber);
            this.f50576h = (TextView) inflate.findViewById(C0966R.C0970id.fey);
            this.f50578j = (TextView) inflate.findViewById(C0966R.C0970id.if4);
            this.f50581m = inflate.findViewById(C0966R.C0970id.gzr);
            this.f50580l = (LinearLayout) inflate.findViewById(C0966R.C0970id.abt);
            this.f50577i = inflate.findViewById(C0966R.C0970id.f359016if2);
            this.f50574f = inflate;
        }
        C22508lo3 lo32 = o0Var2.f55539x1;
        C87412m.m108593f(lo32, "info.recFeed");
        LinkedList<String> linkedList = lo32.f64176i;
        int i7 = 1;
        int i8 = 0;
        int i9 = 8;
        if (linkedList == null || linkedList.isEmpty()) {
            View view4 = this.f50575g;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initHead", "(Lcom/tencent/mm/protocal/protobuf/RecommendCardMsg;Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initHead", "(Lcom/tencent/mm/protocal/protobuf/RecommendCardMsg;Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view6 = this.f50575g;
            if (view6 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initHead", "(Lcom/tencent/mm/protocal/protobuf/RecommendCardMsg;Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initHead", "(Lcom/tencent/mm/protocal/protobuf/RecommendCardMsg;Lcom/tencent/mm/storage/BizTimeLineInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        View view8 = this.f50575g;
        if (view8 != null) {
            view8.setOnClickListener(new C18301j3(this, o0Var2, i6));
        }
        if (C76577a.m92165p(this.f50573e) >= 1.125f) {
            C46746a.f125826a.mo71979m(this.f50579k, C76577a.m92151b(this.f50573e, 31), C76577a.m92151b(this.f50573e, 21));
        }
        LinearLayout linearLayout = this.f50580l;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        for (C18292a b : this.f50586r) {
            this.f50588t.mo22905b(b);
        }
        this.f50586r.clear();
        C22508lo3 lo33 = o0Var2.f55539x1;
        C87412m.m108593f(lo33, "info.recFeed");
        ViewGroup.LayoutParams layoutParams = null;
        if (C19613h1.m21040m(lo33)) {
            View view9 = this.f50581m;
            if (view9 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view11 = this.f50583o;
            if (view11 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            LinearLayout linearLayout2 = this.f50580l;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            ImageView imageView = this.f50582n;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            int i15 = C18508z2.f51413M;
            ImageView imageView2 = this.f50582n;
            if (imageView2 != null) {
                layoutParams = imageView2.getLayoutParams();
            }
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.height = i15;
            }
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams2);
            }
            C22491bj2 bj22 = o0Var2.f55539x1.f64172e.get(0).f64690e;
            C77630j jVar = new C77630j();
            jVar.f226333o = bj22.f63733j;
            jVar.f226330i = bj22.f63730g;
            jVar.f226326e = bj22.f63729f;
            String str2 = bj22.f63732i;
            if (str2 != null && !C112551y.m153811k(str2)) {
                i7 = 0;
            }
            String str3 = i7 != 0 ? bj22.f63730g : bj22.f63732i;
            this.f50572d.f51445p.mo23101b(o0Var.mo25768r2());
            C18479j jVar2 = this.f50572d.f51445p;
            jVar2.getClass();
            this.f50572d.f51445p.mo23109k(o0Var2.field_orderFlag, 0, jVar, str3, this.f50582n, C46746a.f125826a.mo71973f(jVar2.f51309a) - (C18508z2.f51418S * 2), i15, false, new C18324o3(), false, o0Var2.f55523h1);
        } else {
            View view13 = this.f50581m;
            if (view13 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar6.mo10233c(0);
                View view14 = view13;
                C117292a.m165358d(view14, aVar6.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view15 = this.f50583o;
            if (view15 != null) {
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar7.mo10233c(0);
                View view16 = view15;
                C117292a.m165358d(view16, aVar7.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "initContent", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            LinearLayout linearLayout3 = this.f50580l;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            ImageView imageView3 = this.f50582n;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            LinearLayout linearLayout4 = this.f50584p;
            int i16 = 0;
            if (linearLayout4 != null) {
                linearLayout4.removeAllViews();
                LinkedList<String> linkedList2 = o0Var2.f55539x1.f64182r;
                if (!(linkedList2 == null || linkedList2.isEmpty()) && this.f50578j != null) {
                    LinkedList<String> linkedList3 = o0Var2.f55539x1.f64182r;
                    C87412m.m108593f(linkedList3, "info.recFeed.FriendSeenHeadImgUrl");
                    for (String str4 : linkedList3) {
                        ImageView imageView4 = new ImageView(this.f50573e);
                        TextView textView = this.f50578j;
                        C87412m.m108591d(textView);
                        int textSize = (int) (textView.getTextSize() * 1.2f);
                        C20828a b2 = C20828a.m22825b();
                        C20937c.C20939b bVar = new C20937c.C20939b();
                        bVar.f59359o = C0966R.C0969drawable.bfa;
                        bVar.f59364t = true;
                        bVar.f59365u = (float) C18508z2.f51422W;
                        bVar.f59346b = true;
                        bVar.f59350f = C14050a.m13405b(str4);
                        bVar.f59354j = textSize;
                        bVar.f59355k = textSize;
                        b2.mo32519h(str4, imageView4, bVar.mo32666a());
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(textSize, textSize);
                        layoutParams3.rightMargin = C18508z2.f51422W;
                        imageView4.setLayoutParams(layoutParams3);
                        LinearLayout linearLayout5 = this.f50584p;
                        if (linearLayout5 != null) {
                            linearLayout5.addView(imageView4);
                        }
                    }
                }
            }
            LinkedList<C22533wo3> linkedList4 = o0Var2.f55539x1.f64172e;
            C87412m.m108593f(linkedList4, "info.recFeed.RecommendItem");
            int i17 = 0;
            for (T next : linkedList4) {
                int i18 = i17 + 1;
                if (i17 >= 0) {
                    C22533wo3 wo32 = (C22533wo3) next;
                    C18292a a = this.f50588t.mo22904a();
                    LinearLayout linearLayout6 = this.f50580l;
                    if (linearLayout6 != null) {
                        linearLayout6.addView(a.f50591F);
                    }
                    this.f50586r.add(a);
                    C87412m.m108593f(wo32, "item");
                    a.getClass();
                    Class cls = C45696d.class;
                    C22491bj2 bj23 = wo32.f64690e;
                    String str5 = bj23.f63727d;
                    String str6 = bj23.f63729f;
                    int i19 = bj23.f63733j;
                    a.f50772p.mo104279b(str5);
                    LinearLayout linearLayout7 = a.f50592G;
                    Integer valueOf = Integer.valueOf(i9);
                    if (linearLayout7 != null) {
                        linearLayout7.setVisibility(i9);
                    }
                    C8219i iVar = C8219i.f27144a;
                    C18244f3 f3Var = r1;
                    View view17 = a.f50591F;
                    Integer num3 = valueOf;
                    int i25 = i19;
                    String str7 = str6;
                    C18244f3 f3Var2 = new C18244f3(a, o0Var, wo32, i, i17);
                    view17.setOnClickListener(f3Var2);
                    if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(i7) || Util.isNullOrNil(str7)) {
                        str = str7;
                        i2 = i25;
                    } else {
                        str = str7;
                        i2 = i25;
                        ((C45696d) C86709a0.m107533q(cls)).Tn0(str, i2, 90, new Object[i8]);
                    }
                    C77630j jVar3 = a.f50593H;
                    jVar3.f226333o = i2;
                    String str8 = bj23.f63731h;
                    jVar3.f226330i = str8 == null || C112551y.m153811k(str8) ? bj23.f63730g : bj23.f63731h;
                    C77630j jVar4 = a.f50593H;
                    jVar4.f226326e = str;
                    if (jVar4.f226333o == 5) {
                        a.f50778v.setVisibility(i8);
                        a.f50778v.setImageResource(C0966R.C0969drawable.f4600hf);
                        C40726l lVar = C40726l.f109414a;
                        C77630j jVar5 = a.f50593H;
                        lVar.mo63636e(jVar5.f226326e, jVar5.f226333o);
                        i3 = 8;
                    } else {
                        i3 = 8;
                        a.f50778v.setVisibility(8);
                    }
                    if (a.f50593H.f226333o == i3) {
                        View view18 = a.f50781y;
                        C9556a aVar8 = new C9556a();
                        ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                        aVar8.mo10233c(i16);
                        View view19 = view18;
                        C117292a.m165358d(view19, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view18.setVisibility(((Integer) aVar8.mo10231a(i8)).intValue());
                        C117292a.m165359e(view19, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        num = num3;
                    } else {
                        View view20 = a.f50781y;
                        C9556a aVar9 = new C9556a();
                        ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                        num = num3;
                        aVar9.mo10233c(num);
                        View view21 = view20;
                        C117292a.m165358d(view21, aVar9.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view20.setVisibility(((Integer) aVar9.mo10231a(i8)).intValue());
                        C117292a.m165359e(view21, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    a.f50589D.f51445p.mo23101b(o0Var.mo25768r2());
                    if (!Util.isNullOrNil(a.f50593H.f226330i)) {
                        View view22 = a.f50774r;
                        C9556a aVar10 = new C9556a();
                        aVar10.mo10233c(i16);
                        View view23 = view22;
                        C117292a.m165358d(view23, aVar10.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view22.setVisibility(((Integer) aVar10.mo10231a(i8)).intValue());
                        C117292a.m165359e(view23, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C18479j jVar6 = a.f50589D.f51445p;
                        long j = o0Var2.field_orderFlag;
                        C77630j jVar7 = a.f50593H;
                        String str9 = jVar7.f226330i;
                        ImageView imageView5 = a.f50775s;
                        int i26 = C18508z2.f51416Q;
                        C18248g3 g3Var = new C18248g3(a, o0Var2, i6);
                        aVar = a;
                        long j2 = j;
                        num2 = i16;
                        jVar6.mo23107i(j2, i, jVar7, str9, imageView5, i26, i26, false, g3Var, o0Var2.f55523h1 + 1, 2.0f);
                        i5 = i6;
                        i4 = 0;
                    } else {
                        aVar = a;
                        num2 = i16;
                        i5 = i6;
                        i4 = 0;
                        if (aVar.f50593H.f226333o == 5) {
                            View view24 = aVar.f50774r;
                            C9556a aVar11 = new C9556a();
                            aVar11.mo10233c(num2);
                            View view25 = view24;
                            C117292a.m165358d(view25, aVar11.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view24.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                            C117292a.m165359e(view25, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C18479j jVar8 = aVar.f50589D.f51445p;
                            ImageView imageView6 = aVar.f50775s;
                            int i27 = C18508z2.f51416Q;
                            jVar8.mo23108j("2131231667", imageView6, i27, i27, o0Var2.f55523h1 + 1);
                        } else {
                            View view26 = aVar.f50774r;
                            C9556a aVar12 = new C9556a();
                            aVar12.mo10233c(num);
                            View view27 = view26;
                            C117292a.m165358d(view27, aVar12.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view26.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                            C117292a.m165359e(view27, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "initUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    View view28 = aVar.f50770n;
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(num2);
                    View view29 = view28;
                    C117292a.m165358d(view29, aVar13.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "setLinePaddingMargin", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view28.setVisibility(((Integer) aVar13.mo10231a(i4)).intValue());
                    C117292a.m165359e(view29, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot", "setLinePaddingMargin", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C2109h3 h3Var = C2109h3.f12075d;
                    if (i17 == 0) {
                        View view30 = aVar.f50770n;
                        C87412m.m108593f(view30, "topLine");
                        h3Var.invoke(view30, Integer.valueOf(C18508z2.f51423X * 2));
                    } else {
                        View view31 = aVar.f50770n;
                        C87412m.m108593f(view31, "topLine");
                        h3Var.invoke(view31, Integer.valueOf(C18508z2.f51420U));
                    }
                    i16 = num2;
                    i6 = i5;
                    i17 = i18;
                    i9 = 8;
                    i8 = 0;
                    i7 = 1;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        int i28 = i6;
        C22508lo3 lo34 = o0Var2.f55539x1;
        C22136a aVar14 = C22136a.f62618a;
        aVar14.mo35249a(this.f50576h, lo34.f64177j, lo34.f64181q);
        TextView textView2 = this.f50578j;
        if (textView2 != null) {
            textView2.setText(lo34.f64179o);
        }
        C8219i.f27144a.mo9271b(this.f50576h);
        aVar14.mo35251c(lo34.f64180p, this.f50585q);
        C18318n3 n3Var = new C18318n3(lo34, this, o0Var2, i28);
        TextView textView3 = this.f50576h;
        if (textView3 != null) {
            textView3.setOnClickListener(new C2110k3(n3Var));
        }
        View view32 = this.f50577i;
        if (view32 != null) {
            view32.setOnClickListener(new C2112l3(n3Var));
        }
        View view33 = this.f50581m;
        if (view33 != null) {
            view33.setOnClickListener(new C2114m3(n3Var));
        }
    }

    /* renamed from: b */
    public int mo22837b() {
        return this.f50587s;
    }

    /* renamed from: d */
    public void mo22838d() {
        View view = this.f50574f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public void mo22839g() {
        View view = this.f50574f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
