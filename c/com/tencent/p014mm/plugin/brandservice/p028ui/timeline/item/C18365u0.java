package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import gy3.C87412m;
import j20.C117292a;
import jw0.C9533e;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import te3.C22503jo3;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.u0 */
public final class C18365u0 extends C18366u2 {

    /* renamed from: d */
    public final String f50862d = "MicroMsg.BizTLRecCardCanvas";

    /* renamed from: e */
    public View f50863e;

    /* renamed from: f */
    public BizTLRecCardCanvasView f50864f;

    /* renamed from: g */
    public boolean f50865g;

    public C18365u0(C18508z2 z2Var) {
        C87412m.m108594g(z2Var, "adapter");
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        C19623o0 o0Var2 = o0Var;
        View view3 = view;
        View view4 = view2;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view3, "convertView");
        C87412m.m108594g(view4, "parent");
        re4 x2 = o0Var.mo25774x2();
        if (x2 != null) {
            C19627t tVar = C19627t.f55586a;
            String str = x2.f64525q.f64075j;
            C87412m.m108593f(str, "wrapper.exptInfo.cardId");
            String A = tVar.mo25819A(str);
            C117407d.INSTANCE.mo182089r(1454, 71, 1);
            String str2 = this.f50862d;
            Log.m105924i(str2, "filling#" + A + " msgId=" + o0Var2.field_msgId);
            if (!tVar.mo25840n()) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (!this.f50865g && !C9533e.f29713a.mo10213f(A, view3)) {
                C117407d.INSTANCE.mo182089r(1454, 73, 1);
            } else if (!C19613h1.m21039l(x2.f64525q.f64082t, false)) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f50865g = true;
                if (this.f50863e == null) {
                    try {
                        View inflate = ((ViewStub) view4.findViewById(C0966R.C0970id.l8x)).inflate();
                        this.f50864f = (BizTLRecCardCanvasView) inflate.findViewById(C0966R.C0970id.ieu);
                        this.f50863e = inflate;
                    } catch (Throwable th) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "inflate", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "inflate", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        Log.printErrStackTrace(this.f50862d, th, "inflate", new Object[0]);
                    }
                }
                View view5 = this.f50863e;
                if (view5 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                BizTLRecCardCanvasView bizTLRecCardCanvasView = this.f50864f;
                if (bizTLRecCardCanvasView != null) {
                    bizTLRecCardCanvasView.setBizTimeLineInfo(o0Var2);
                }
                BizTLRecCardCanvasView bizTLRecCardCanvasView2 = this.f50864f;
                if (bizTLRecCardCanvasView2 != null) {
                    long j = o0Var2.field_msgId;
                    C22503jo3 jo32 = x2.f64525q;
                    String str3 = jo32.f64081s;
                    if (str3 == null) {
                        str3 = "re";
                    }
                    String str4 = jo32.f64076n;
                    C87412m.m108593f(str4, "wrapper.exptInfo.data");
                    bizTLRecCardCanvasView2.mo118070b(j, A, str3, str4);
                }
                C117407d.INSTANCE.mo182089r(1454, 72, 1);
                C9533e.f29713a.mo10212e(A);
            }
        }
    }

    /* renamed from: h */
    public final void mo22929h() {
        View view = this.f50863e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardCanvas", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
