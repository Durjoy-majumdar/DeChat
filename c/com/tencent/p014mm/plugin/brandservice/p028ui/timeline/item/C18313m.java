package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.text.TextUtils;
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
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C8477a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import s90.C77630j;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C22493dh;
import te3.C22495eh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.m */
public final class C18313m extends C18303k {

    /* renamed from: n */
    public ImageView f50668n;

    /* renamed from: o */
    public TextView f50669o;

    /* renamed from: p */
    public View f50670p;

    /* renamed from: q */
    public View f50671q;

    /* renamed from: r */
    public View f50672r;

    /* renamed from: s */
    public final C77630j f50673s = new C77630j();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18313m(Context context, C18508z2 z2Var) {
        super(context, z2Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
    }

    /* renamed from: g */
    public void mo22894g(View view, C19623o0 o0Var, C22495eh ehVar) {
        float f;
        int i;
        View view2 = view;
        C19623o0 o0Var2 = o0Var;
        C22495eh ehVar2 = ehVar;
        C87412m.m108594g(view2, "parent");
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(ehVar2, "bizInfo");
        ViewGroup.LayoutParams layoutParams = null;
        if (this.f50629c == null) {
            if (this.f50629c == null) {
                this.f50629c = ((ViewStub) view2.findViewById(C0966R.C0970id.l9p)).inflate();
            }
            View view3 = this.f50629c;
            ImageView imageView = view3 != null ? (ImageView) view3.findViewById(C0966R.C0970id.buo) : null;
            C87412m.m108592e(imageView, "null cannot be cast to non-null type android.widget.ImageView");
            this.f50668n = imageView;
            View view4 = this.f50629c;
            C87412m.m108592e(view4 != null ? (ImageView) view4.findViewById(C0966R.C0970id.l5y) : null, "null cannot be cast to non-null type android.widget.ImageView");
            View view5 = this.f50629c;
            TextView textView = view5 != null ? (TextView) view5.findViewById(C0966R.C0970id.hx8) : null;
            C87412m.m108592e(textView, "null cannot be cast to non-null type android.widget.TextView");
            this.f50669o = textView;
            View view6 = this.f50629c;
            this.f50672r = view6 != null ? view6.findViewById(C0966R.C0970id.hx9) : null;
            View view7 = this.f50629c;
            this.f50670p = view7 != null ? view7.findViewById(C0966R.C0970id.b9b) : null;
            View view8 = this.f50629c;
            this.f50671q = view8 != null ? view8.findViewById(C0966R.C0970id.l5z) : null;
            mo22886b();
            this.f50630d = view2.findViewById(C0966R.C0970id.b5w);
            View view9 = this.f50629c;
            MMNeat7extView mMNeat7extView = view9 != null ? (MMNeat7extView) view9.findViewById(C0966R.C0970id.kpm) : null;
            C87412m.m108592e(mMNeat7extView, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMNeat7extView");
            this.f50631e = mMNeat7extView;
            View view10 = this.f50629c;
            ImageView imageView2 = view10 != null ? (ImageView) view10.findViewById(C0966R.C0970id.i1x) : null;
            C87412m.m108592e(imageView2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f50632f = imageView2;
            View view11 = this.f50629c;
            this.f50633g = view11 != null ? (LinearLayout) view11.findViewById(C0966R.C0970id.aeq) : null;
            View view12 = this.f50629c;
            this.f50634h = view12 != null ? (LinearLayout) view12.findViewById(C0966R.C0970id.jmn) : null;
            View view13 = this.f50629c;
            this.f50635i = view13 != null ? (MMNeat7extView) view13.findViewById(C0966R.C0970id.jmk) : null;
            View view14 = this.f50629c;
            this.f50636j = view14 != null ? (MMNeat7extView) view14.findViewById(C0966R.C0970id.jmf) : null;
        }
        View view15 = this.f50629c;
        if (view15 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            boolean z = false;
            aVar.mo10233c(0);
            View view16 = view15;
            C117292a.m165358d(view16, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowVideo", "filling", "(Landroid/view/View;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowVideo", "filling", "(Landroid/view/View;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/BizRecArtCardBizInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C22493dh dhVar = ehVar2.f63800n.get(0);
            C87412m.m108593f(dhVar, "appMsg");
            mo22890f(o0Var2, ehVar2, dhVar);
            MMNeat7extView mMNeat7extView2 = this.f50631e;
            if (mMNeat7extView2 != null && mMNeat7extView2.getVisibility() == 0) {
                int f2 = C46746a.f125826a.mo71973f(this.f50627a) - C76577a.m92151b(this.f50627a, 48);
                MMNeat7extView mMNeat7extView3 = this.f50631e;
                if (mMNeat7extView3 != null) {
                    mMNeat7extView3.measure(f2, 0);
                }
                View view17 = this.f50670p;
                C87412m.m108591d(view17);
                int i2 = view17.getLayoutParams().height;
                MMNeat7extView mMNeat7extView4 = this.f50631e;
                C87412m.m108591d(mMNeat7extView4);
                i = (i2 - mMNeat7extView4.getMeasuredHeight()) - C18508z2.f51423X;
                f = 0.56f;
            } else {
                View view18 = this.f50670p;
                C87412m.m108591d(view18);
                i = view18.getLayoutParams().height;
                f = 0.5f;
            }
            View view19 = this.f50671q;
            if (view19 != null) {
                ViewGroup.LayoutParams layoutParams2 = view19.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams2).topMargin = (int) ((((float) i) * f) - ((float) (C76577a.m92151b(this.f50627a, 48) / 2)));
            }
            String d = C92721n.m116876d(dhVar.f63767x);
            if (!TextUtils.isEmpty(d)) {
                View view20 = this.f50672r;
                if (view20 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view21 = view20;
                    C117292a.m165358d(view21, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowVideo", "refreshVideoIcon", "(Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view20.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view21, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowVideo", "refreshVideoIcon", "(Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView2 = this.f50669o;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = this.f50669o;
                if (textView3 != null) {
                    textView3.setText(d);
                }
                TextView textView4 = this.f50669o;
                if (textView4 != null) {
                    textView4.setTextColor(this.f50627a.getResources().getColor(C0966R.color.a18));
                }
            } else {
                TextView textView5 = this.f50669o;
                if (textView5 != null) {
                    textView5.setText("");
                }
                View view22 = this.f50672r;
                if (view22 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view23 = view22;
                    C117292a.m165358d(view23, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowVideo", "refreshVideoIcon", "(Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view22.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view23, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowVideo", "refreshVideoIcon", "(Lcom/tencent/mm/protocal/protobuf/BizRecArtCardAppMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView6 = this.f50669o;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
            }
            TextView textView7 = this.f50669o;
            if (textView7 != null) {
                textView7.setShadowLayer(10.0f, 0.0f, 1.0f, this.f50627a.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
            }
            C8477a0 a0Var = new C8477a0();
            int i3 = o0Var.mo25774x2().f64521j;
            if (i3 == 101) {
                if (ehVar2.f63800n.size() <= 1) {
                    z = true;
                }
                a0Var.f27482d = z;
            } else if (i3 == 102) {
                LinkedList<C22495eh> linkedList = o0Var.mo25774x2().f64523o.f63905g;
                C87412m.m108593f(linkedList, "info.tlRecCardWrapper.extraInfo.BizInfo");
                int i4 = 0;
                int i5 = 0;
                for (T next : C110818d0.m150947s0(linkedList, 2)) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        if (((C22495eh) next).f63793d == 0) {
                            i4++;
                        }
                        i5 = i6;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                if (i4 < 2) {
                    z = true;
                }
                a0Var.f27482d = z;
            }
            C77630j jVar = this.f50673s;
            jVar.f226333o = dhVar.f63760q;
            String str = dhVar.f63757n;
            jVar.f226330i = str;
            jVar.f226312D = str;
            jVar.f226326e = dhVar.f63755i;
            View view24 = this.f50670p;
            if (view24 != null) {
                layoutParams = view24.getLayoutParams();
            }
            if (layoutParams != null) {
                layoutParams.height = C18508z2.f51414N;
            }
            View view25 = this.f50670p;
            if (view25 != null) {
                view25.setLayoutParams(layoutParams);
            }
            this.f50628b.f51445p.mo23109k(o0Var2.field_msgId, 0, this.f50673s, dhVar.f63757n, this.f50668n, C46746a.f125826a.mo71973f(this.f50627a) - C18508z2.f51418S, C18508z2.f51414N, false, new C18308l(this, a0Var, o0Var2, dhVar), false, o0Var2.f55523h1);
            mo22888d(o0Var2, ehVar2, dhVar);
            C40726l lVar = C40726l.f109414a;
            C77630j jVar2 = this.f50673s;
            lVar.mo63636e(jVar2.f226326e, jVar2.f226333o);
        }
    }
}
