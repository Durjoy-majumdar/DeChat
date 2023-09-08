package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import ex0.C20642c;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C20739g;
import fy0.C8218c;
import fy0.C8219i;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Arrays;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import s90.C77630j;
import sx3.C64197v;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.re4;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.o2 */
public final class C18321o2 extends C18366u2 {

    /* renamed from: d */
    public final C18508z2 f50695d;

    /* renamed from: e */
    public final Context f50696e;

    /* renamed from: f */
    public View f50697f;

    /* renamed from: g */
    public LinearLayout f50698g;

    /* renamed from: h */
    public LinkedList<C18322a> f50699h = new LinkedList<>();

    /* renamed from: i */
    public final C18333q<C18322a> f50700i = new C18333q<>(new C18323b(this));

    /* renamed from: j */
    public TextView f50701j;

    /* renamed from: k */
    public RelativeLayout f50702k;

    /* renamed from: l */
    public RelativeLayout f50703l;

    /* renamed from: m */
    public TextView f50704m;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.o2$a */
    public final class C18322a extends C18339q3 {

        /* renamed from: D */
        public final C18508z2 f50705D;

        /* renamed from: E */
        public final Context f50706E;

        /* renamed from: F */
        public final View f50707F;

        /* renamed from: G */
        public final C77630j f50708G = new C77630j();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18322a(C18321o2 o2Var, C18508z2 z2Var, Context context) {
            super(z2Var, context);
            C87412m.m108594g(z2Var, "adapter");
            C87412m.m108594g(context, "context");
            this.f50705D = z2Var;
            this.f50706E = context;
            View inflate = View.inflate(context, C0966R.C0971layout.f6614jr, (ViewGroup) null);
            this.f50707F = inflate;
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

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.o2$b */
    public static final class C18323b extends C87413o implements C32224a<C18322a> {

        /* renamed from: d */
        public final /* synthetic */ C18321o2 f50709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18323b(C18321o2 o2Var) {
            super(0);
            this.f50709d = o2Var;
        }

        public Object invoke() {
            C18321o2 o2Var = this.f50709d;
            return new C18322a(o2Var, o2Var.f50695d, o2Var.f50696e);
        }
    }

    public C18321o2(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50695d = z2Var;
        this.f50696e = context;
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        int i2;
        String str;
        C18322a aVar;
        int i3;
        C18321o2 o2Var = this;
        C19623o0 o0Var2 = o0Var;
        View view3 = view;
        View view4 = view2;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view3, "convertView");
        C87412m.m108594g(view4, "parent");
        if (o2Var.f50697f == null) {
            View inflate = ((ViewStub) view4.findViewById(C0966R.C0970id.l9d)).inflate();
            o2Var.f50698g = (LinearLayout) inflate.findViewById(C0966R.C0970id.abd);
            o2Var.f50701j = (TextView) inflate.findViewById(C0966R.C0970id.fey);
            o2Var.f50702k = (RelativeLayout) inflate.findViewById(C0966R.C0970id.g6q);
            o2Var.f50703l = (RelativeLayout) inflate.findViewById(C0966R.C0970id.gyw);
            o2Var.f50704m = (TextView) inflate.findViewById(C0966R.C0970id.kki);
            o2Var.f50697f = inflate;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        int i4 = 0;
        aVar2.mo10233c(0);
        View view5 = view;
        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view6 = o2Var.f50697f;
        if (view6 != null) {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        RelativeLayout relativeLayout = o2Var.f50702k;
        if (relativeLayout != null) {
            relativeLayout.setOnLongClickListener(new C18331p2(o2Var, o0Var2));
        }
        TextView textView = o2Var.f50704m;
        if (textView != null) {
            textView.setText(C8218c.m8301a(o2Var.f50696e, o0Var2.field_createTime));
        }
        re4 x2 = o0Var.mo25774x2();
        C87412m.m108593f(x2, "info.tlRecCardWrapper");
        C22499hb0 hb02 = x2.f64523o;
        int i5 = 1;
        if (Util.isNullOrNil(hb02.f63913r)) {
            TextView textView2 = o2Var.f50701j;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = o2Var.f50701j;
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = o2Var.f50701j;
            if (textView4 != null) {
                textView4.setContentDescription("");
            }
        } else {
            TextView textView5 = o2Var.f50701j;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = o2Var.f50701j;
            if (textView6 != null) {
                textView6.setText(hb02.f63913r);
            }
            TextView textView7 = o2Var.f50701j;
            if (textView7 != null && !Util.isNullOrNil(textView7.getText())) {
                if (textView7.getText().length() >= 2) {
                    CharSequence text = textView7.getText();
                    C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
                    if (C112550d0.m153788X(text, "#", false, 2, (Object) null)) {
                        String string = textView7.getContext().getResources().getString(C0966R.string.aqn);
                        C87412m.m108593f(string, "context.resources.getStr…tring.biz_timeline_topic)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{textView7.getText().subSequence(1, textView7.getText().length())}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        textView7.setContentDescription(format);
                    }
                }
                textView7.setContentDescription(textView7.getText());
            }
            C8219i.f27144a.mo9271b(o2Var.f50701j);
            if (Util.isNullOrNil(hb02.f63912q)) {
                TextView textView8 = o2Var.f50701j;
                if (textView8 != null) {
                    textView8.setOnClickListener((View.OnClickListener) null);
                }
                RelativeLayout relativeLayout2 = o2Var.f50703l;
                if (relativeLayout2 != null) {
                    relativeLayout2.setOnClickListener((View.OnClickListener) null);
                }
            } else {
                C18360t2 t2Var = new C18360t2(hb02, o2Var, o0Var2, x2);
                RelativeLayout relativeLayout3 = o2Var.f50702k;
                if (relativeLayout3 != null) {
                    relativeLayout3.setOnClickListener(new C2116q2(t2Var));
                }
                RelativeLayout relativeLayout4 = o2Var.f50703l;
                if (relativeLayout4 != null) {
                    relativeLayout4.setOnClickListener(new C2117r2(t2Var));
                }
                TextView textView9 = o2Var.f50701j;
                if (textView9 != null) {
                    textView9.setOnClickListener(new C2118s2(t2Var));
                }
            }
        }
        for (C18322a aVar4 : o2Var.f50699h) {
            LinearLayout linearLayout = o2Var.f50698g;
            if (linearLayout != null) {
                linearLayout.removeView(aVar4.f50707F);
            }
            o2Var.f50700i.mo22905b(aVar4);
        }
        o2Var.f50699h.clear();
        LinkedList<C22495eh> linkedList = o0Var.mo25774x2().f64523o.f63905g;
        C87412m.m108593f(linkedList, "info.tlRecCardWrapper.extraInfo.BizInfo");
        int i6 = 0;
        for (T next : linkedList) {
            int i7 = i6 + 1;
            if (i6 >= 0) {
                C22495eh ehVar = (C22495eh) next;
                C18322a a = o2Var.f50700i.mo22904a();
                LinearLayout linearLayout2 = o2Var.f50698g;
                if (linearLayout2 != null) {
                    linearLayout2.addView(a.f50707F);
                }
                o2Var.f50699h.add(a);
                C87412m.m108593f(ehVar, "bizInfo");
                C22493dh dhVar = ehVar.f63800n.get(i4);
                C87412m.m108593f(dhVar, "bizInfo.AppMsg[0]");
                C22493dh dhVar2 = dhVar;
                a.getClass();
                Class cls = C45696d.class;
                String str2 = dhVar2.f63751e;
                String str3 = dhVar2.f63755i;
                int i8 = dhVar2.f63760q;
                String str4 = dhVar2.f63757n;
                String str5 = dhVar2.f63758o;
                a.f50772p.mo104279b(str2);
                C8219i iVar = C8219i.f27144a;
                a.f50707F.setBackgroundResource((i6 != 0 || i6 >= i5) ? C0966R.C0969drawable.f4588h4 : C0966R.C0969drawable.f4595ha);
                C18300j2 j2Var = r1;
                String str6 = str4;
                int i9 = i8;
                String str7 = str3;
                View view8 = a.f50707F;
                C18300j2 j2Var2 = new C18300j2(a, o0Var, ehVar, dhVar2, i6);
                view8.setOnClickListener(j2Var2);
                if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(1) || Util.isNullOrNil(str7)) {
                    str = str7;
                    i2 = i9;
                } else {
                    str = str7;
                    i2 = i9;
                    ((C45696d) C86709a0.m107533q(cls)).Tn0(str, i2, 90, new Object[0]);
                }
                C77630j jVar = a.f50708G;
                jVar.f226333o = i2;
                jVar.f226330i = str6;
                jVar.f226312D = str5;
                jVar.f226326e = str;
                View view9 = a.f50779w;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a.f50780x.setText(!Util.isNullOrNil(dhVar2.f63744C) ? String.valueOf(dhVar2.f63744C) : "");
                a.f50778v.setVisibility(8);
                a.f50778v.setImageResource(C0966R.C0969drawable.f4600hf);
                View view11 = a.f50776t;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C77630j jVar2 = a.f50708G;
                if (jVar2.f226333o == 7) {
                    a.f50775s.setVisibility(8);
                    a.f50778v.setVisibility(8);
                    View view13 = a.f50776t;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(0);
                    View view14 = view13;
                    C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;ILcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view14, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "setPlayIcon", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;ILcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                    sb.append(i6);
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
                    String str8 = dhVar2.f63745D;
                    if (Util.isNullOrNil(str8)) {
                        Log.m105924i("MicroMsg.BizTimeLineItem", "BizTLRecCardBizcontent playUrl null");
                    } else {
                        ImageView imageView = a.f50777u;
                        long j = o0Var2.field_msgId;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(o0Var2.field_msgId);
                        sb4.append('_');
                        sb4.append(i6);
                        ((C20642c) C86312j.m106911c(C20642c.class)).mo32317iv(imageView, j, sb4.toString(), dhVar2.f63751e, str8, "", str8, dhVar2.f63757n);
                        a.f50777u.setOnClickListener(new C18317n2(a, o0Var2, dhVar2));
                    }
                    i3 = i6;
                    aVar = a;
                } else if (!Util.isNullOrNil(jVar2.f226330i)) {
                    a.f50775s.setVisibility(0);
                    C18479j jVar3 = a.f50825d.f51445p;
                    long j2 = o0Var2.field_msgId;
                    C77630j jVar4 = a.f50708G;
                    String j3 = C92721n.m116882j(jVar4);
                    ImageView imageView2 = a.f50775s;
                    int i15 = C18508z2.f51416Q;
                    i3 = i6;
                    aVar = a;
                    jVar3.mo23107i(j2, i3, jVar4, j3, imageView2, i15, i15, false, new C18306k2(a, o0Var2, i6), o0Var2.f55523h1 + 1, 2.0f);
                    if (aVar.f50708G.f226333o == 5) {
                        aVar.f50778v.setVisibility(0);
                    }
                } else {
                    i3 = i6;
                    aVar = a;
                    int i16 = aVar.f50708G.f226333o;
                    if (i16 == 5 || i16 == 6) {
                        aVar.f50778v.setVisibility(0);
                        aVar.f50775s.setVisibility(0);
                        C18479j jVar5 = aVar.f50825d.f51445p;
                        ImageView imageView3 = aVar.f50775s;
                        int i17 = C18508z2.f51416Q;
                        jVar5.mo23108j("2131231667", imageView3, i17, i17, o0Var2.f55523h1 + 1);
                    } else {
                        View view15 = aVar.f50774r;
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(8);
                        View view16 = view15;
                        C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view16, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "refreshUI", "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                C2111l2 l2Var = C2111l2.f12077d;
                C55582m2 m2Var = C55582m2.f158252d;
                if (i3 == 0) {
                    if (i3 >= 1) {
                        ViewGroup viewGroup = aVar.f50771o;
                        C87412m.m108593f(viewGroup, "content");
                        m2Var.mo237D(viewGroup, 0, Integer.valueOf(C18508z2.f51423X), 0, Integer.valueOf(C18508z2.f51417R));
                    } else {
                        ViewGroup viewGroup2 = aVar.f50771o;
                        C87412m.m108593f(viewGroup2, "content");
                        m2Var.mo237D(viewGroup2, 0, Integer.valueOf(C18508z2.f51423X), 0, Integer.valueOf(C18508z2.f51419T));
                    }
                    View view17 = aVar.f50770n;
                    C9556a aVar9 = new C9556a();
                    aVar9.mo10233c(8);
                    C117292a.m165358d(view17, aVar9.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "setPaddingAndMargin", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                    C117292a.m165359e(view17, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot", "setPaddingAndMargin", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (i3 == 1) {
                    ViewGroup viewGroup3 = aVar.f50771o;
                    C87412m.m108593f(viewGroup3, "content");
                    m2Var.mo237D(viewGroup3, 0, Integer.valueOf(C18508z2.f51419T), 0, Integer.valueOf(C18508z2.f51419T));
                    View view18 = aVar.f50770n;
                    C87412m.m108593f(view18, "topLine");
                    l2Var.invoke(view18, Integer.valueOf(C18508z2.f51420U));
                }
                C77630j jVar6 = aVar.f50708G;
                int i18 = jVar6.f226333o;
                if (i18 == 5) {
                    C40726l.f109414a.mo63636e(jVar6.f226326e, i18);
                }
                o2Var = this;
                i6 = i7;
                i4 = 0;
                i5 = 1;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: h */
    public final void mo22898h() {
        View view = this.f50697f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
