package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C8477a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kw0.C46746a;
import s90.C77630j;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C22493dh;
import te3.C22495eh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.g */
public final class C18246g extends C18303k {

    /* renamed from: n */
    public ImageView f50458n;

    /* renamed from: o */
    public View f50459o;

    /* renamed from: p */
    public final C77630j f50460p = new C77630j();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18246g(Context context, C18508z2 z2Var) {
        super(context, z2Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
    }

    /* renamed from: g */
    public void mo22853g(View view, C19623o0 o0Var, C22495eh ehVar) {
        View view2 = view;
        C19623o0 o0Var2 = o0Var;
        C22495eh ehVar2 = ehVar;
        C87412m.m108594g(view2, "parent");
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(ehVar2, "bizInfo");
        if (this.f50629c == null) {
            if (this.f50629c == null) {
                this.f50629c = ((ViewStub) view2.findViewById(C0966R.C0970id.l9i)).inflate();
            }
            this.f50458n = (ImageView) view2.findViewById(C0966R.C0970id.bv8);
            this.f50459o = view2.findViewById(C0966R.C0970id.bv9);
            ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.bv_);
            mo22886b();
            this.f50630d = view2.findViewById(C0966R.C0970id.kqz);
            View view3 = this.f50629c;
            MMNeat7extView mMNeat7extView = view3 != null ? (MMNeat7extView) view3.findViewById(C0966R.C0970id.kpm) : null;
            C87412m.m108592e(mMNeat7extView, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMNeat7extView");
            this.f50631e = mMNeat7extView;
            View view4 = this.f50629c;
            ImageView imageView2 = view4 != null ? (ImageView) view4.findViewById(C0966R.C0970id.i1x) : null;
            C87412m.m108592e(imageView2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f50632f = imageView2;
            View view5 = this.f50629c;
            this.f50633g = view5 != null ? (LinearLayout) view5.findViewById(C0966R.C0970id.aeq) : null;
            View view6 = this.f50629c;
            this.f50634h = view6 != null ? (LinearLayout) view6.findViewById(C0966R.C0970id.jmm) : null;
            View view7 = this.f50629c;
            this.f50635i = view7 != null ? (MMNeat7extView) view7.findViewById(C0966R.C0970id.jmk) : null;
            View view8 = this.f50629c;
            this.f50636j = view8 != null ? (MMNeat7extView) view8.findViewById(C0966R.C0970id.jmf) : null;
        }
        View view9 = this.f50629c;
        if (view9 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            boolean z = false;
            aVar.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowArticle", "filling", "(Landroid/view/View;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowArticle", "filling", "(Landroid/view/View;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C22493dh dhVar = ehVar2.f63800n.get(0);
            C87412m.m108593f(dhVar, "appMsg");
            mo22890f(o0Var2, ehVar2, dhVar);
            View view11 = this.f50459o;
            C87412m.m108591d(view11);
            ViewGroup.LayoutParams layoutParams = view11.getLayoutParams();
            layoutParams.height = C18508z2.f51412L;
            view11.setLayoutParams(layoutParams);
            ImageView imageView3 = this.f50458n;
            C87412m.m108591d(imageView3);
            ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
            layoutParams2.height = C18508z2.f51412L;
            imageView3.setLayoutParams(layoutParams2);
            C8477a0 a0Var = new C8477a0();
            int i = o0Var.mo25774x2().f64521j;
            if (i == 101) {
                if (ehVar2.f63800n.size() <= 1) {
                    z = true;
                }
                a0Var.f27482d = z;
            } else if (i == 102) {
                LinkedList<C22495eh> linkedList = o0Var.mo25774x2().f64523o.f63905g;
                C87412m.m108593f(linkedList, "info.tlRecCardWrapper.extraInfo.BizInfo");
                int i2 = 0;
                int i3 = 0;
                for (T next : C110818d0.m150947s0(linkedList, 2)) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        if (((C22495eh) next).f63793d == 0) {
                            i2++;
                        }
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                if (i2 < 2) {
                    z = true;
                }
                a0Var.f27482d = z;
            }
            C77630j jVar = this.f50460p;
            jVar.f226333o = dhVar.f63760q;
            String str = dhVar.f63757n;
            jVar.f226330i = str;
            jVar.f226312D = str;
            jVar.f226326e = dhVar.f63755i;
            this.f50628b.f51445p.mo23109k(o0Var2.field_msgId, 0, this.f50460p, dhVar.f63757n, this.f50458n, C46746a.f125826a.mo71973f(this.f50627a) - C18508z2.f51418S, C18508z2.f51412L, false, new C18241f(this, a0Var, o0Var2, dhVar), false, o0Var2.f55523h1);
            mo22888d(o0Var2, ehVar2, dhVar);
        }
    }
}
