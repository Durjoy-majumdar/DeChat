package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C20739g;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import s90.C77630j;
import sx3.C64197v;
import te3.me4;
import te3.ne4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.x0 */
public final class C18380x0 extends BizTLRecCardItem {

    /* renamed from: p */
    public View f50925p;

    /* renamed from: q */
    public C18381a[] f50926q;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.x0$a */
    public final class C18381a {

        /* renamed from: a */
        public final View f50927a;

        /* renamed from: b */
        public final ImageView f50928b;

        /* renamed from: c */
        public final TextView f50929c;

        /* renamed from: d */
        public final TextView f50930d;

        /* renamed from: e */
        public final TextView f50931e;

        /* renamed from: f */
        public final RelativeLayout f50932f;

        /* renamed from: g */
        public final C77630j f50933g = new C77630j();

        /* renamed from: h */
        public final /* synthetic */ C18380x0 f50934h;

        public C18381a(C18380x0 x0Var, View view) {
            C87412m.m108594g(view, "parent");
            this.f50934h = x0Var;
            this.f50927a = view;
            View findViewById = view.findViewById(C0966R.C0970id.abj);
            C87412m.m108593f(findViewById, "parent.findViewById(R.id…_card_finder_video_cover)");
            this.f50928b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.abm);
            C87412m.m108593f(findViewById2, "parent.findViewById(R.id…rd_finder_video_playtime)");
            this.f50929c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.abl);
            C87412m.m108593f(findViewById3, "parent.findViewById(R.id…rd_finder_video_duration)");
            this.f50930d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.abk);
            C87412m.m108593f(findViewById4, "parent.findViewById(R.id…c_card_finder_video_desc)");
            this.f50931e = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.abg);
            C87412m.m108593f(findViewById5, "parent.findViewById(R.id.biz_rec_card_finder_rl)");
            this.f50932f = (RelativeLayout) findViewById5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18380x0(C18508z2 z2Var, Context context) {
        super(context, z2Var);
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        Iterator<T> it;
        C18381a aVar;
        String str;
        C18380x0 x0Var = this;
        C19623o0 o0Var2 = o0Var;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view2, "parent");
        super.mo22815a(o0Var, i, view, view2);
        me4 w2 = o0Var.mo25773w2();
        if ((w2 != null ? w2.f64240e : null) != null) {
            View view3 = x0Var.f50925p;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardFinder", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardFinder", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            LinkedList<ne4> linkedList = w2.f64242g;
            if (linkedList != null) {
                Iterator<T> it4 = linkedList.iterator();
                int i2 = 0;
                while (it4.hasNext()) {
                    T next = it4.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ne4 ne4 = (ne4) next;
                        if (ne4 == null || (ne4.f64281d & 1) != 0) {
                            it = it4;
                            C115669n.INSTANCE.idkeyStat(1149, 6, 1, false);
                        } else {
                            C18381a[] aVarArr = x0Var.f50926q;
                            if (aVarArr == null || (aVar = aVarArr[i2]) == null) {
                                it = it4;
                            } else {
                                Class cls = C45696d.class;
                                String str2 = ne4.f64282e;
                                String str3 = ne4.f64284g;
                                int i4 = ne4.f64288n;
                                String str4 = ne4.f64285h;
                                int i5 = i2;
                                long j = ne4.f64294t;
                                String d = C92721n.m116876d(ne4.f64292r);
                                String str5 = "";
                                if (j <= 0) {
                                    str = str5;
                                } else if (j < 10000) {
                                    str = String.valueOf(j);
                                } else if (j < 100000) {
                                    str = String.format("%.1f万", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / ((float) 10000))}, 1));
                                    C87412m.m108593f(str, "format(format, *args)");
                                } else {
                                    str = "10万+";
                                }
                                TextView textView = aVar.f50929c;
                                if (C87412m.m108589b(str, str5)) {
                                    it = it4;
                                } else {
                                    it = it4;
                                    str5 = aVar.f50934h.f50309d.getString(C0966R.string.aqe, new Object[]{str});
                                }
                                textView.setText(str5);
                                aVar.f50929c.setShadowLayer(2.0f, 0.0f, 0.0f, aVar.f50934h.f50309d.getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
                                aVar.f50930d.setText(d);
                                aVar.f50930d.setShadowLayer(2.0f, 0.0f, 0.0f, aVar.f50934h.f50309d.getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
                                aVar.f50931e.setText(str2);
                                int i6 = i5;
                                aVar.f50927a.setOnClickListener(new C18370v0(aVar.f50934h, o0Var2, ne4, i6));
                                if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(1) && !Util.isNullOrNil(str3)) {
                                    ((C45696d) C86709a0.m107533q(cls)).Tn0(str3, i4, 90, new Object[0]);
                                }
                                float a = ((((float) C18508z2.f51412L) * 2.35f) - ((float) C76577a.m92150a(aVar.f50934h.f50309d, 40.0f))) / ((float) 2);
                                int i7 = (int) (((double) a) / 1.77d);
                                ViewGroup.LayoutParams layoutParams = aVar.f50927a.getLayoutParams();
                                ViewGroup.LayoutParams layoutParams2 = aVar.f50932f.getLayoutParams();
                                int i8 = (int) a;
                                layoutParams.width = i8;
                                layoutParams2.height = i7;
                                aVar.f50927a.setLayoutParams(layoutParams);
                                aVar.f50932f.setLayoutParams(layoutParams2);
                                aVar.f50928b.setVisibility(0);
                                C77630j jVar = aVar.f50933g;
                                jVar.f226330i = str4;
                                jVar.f226326e = str4;
                                jVar.f226333o = 5;
                                C18380x0 x0Var2 = aVar.f50934h;
                                x0Var2.f50310e.f51445p.mo23107i(o0Var2.field_msgId, i6, jVar, str4, aVar.f50928b, i8, i7, false, new C18375w0(), o0Var2.f55523h1 + i6, (float) C76577a.m92150a(x0Var2.f50309d, 4.0f));
                            }
                        }
                        x0Var = this;
                        i2 = i3;
                        it4 = it;
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
        if (this.f50925p == null) {
            View inflate = ((ViewStub) view.findViewById(C0966R.C0970id.l95)).inflate();
            C87412m.m108593f(inflate, "this");
            mo22817i(inflate);
            View findViewById = inflate.findViewById(C0966R.C0970id.abh);
            C87412m.m108593f(findViewById, "this.findViewById(R.id.biz_rec_card_finder_video1)");
            View findViewById2 = inflate.findViewById(C0966R.C0970id.abi);
            C87412m.m108593f(findViewById2, "this.findViewById(R.id.biz_rec_card_finder_video2)");
            this.f50926q = new C18381a[]{new C18381a(this, findViewById), new C18381a(this, findViewById2)};
            this.f50925p = inflate;
        }
    }

    /* renamed from: k */
    public final void mo22938k() {
        View view = this.f50925p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardFinder", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardFinder", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
