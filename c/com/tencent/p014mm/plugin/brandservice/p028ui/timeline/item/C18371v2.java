package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import gy3.C87412m;
import j20.C117292a;
import jw0.C9533e;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.v2 */
public final class C18371v2 extends C18366u2 {

    /* renamed from: d */
    public final Context f50897d;

    /* renamed from: e */
    public final String f50898e = "MicroMsg.BizTLRecFeedCanvas";

    /* renamed from: f */
    public View f50899f;

    /* renamed from: g */
    public BizTLRecCardCanvasView f50900g;

    /* renamed from: h */
    public boolean f50901h;

    /* renamed from: i */
    public int f50902i = 2003;

    public C18371v2(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f50897d = context;
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        C19623o0 o0Var2 = o0Var;
        View view3 = view;
        View view4 = view2;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view3, "convertView");
        C87412m.m108594g(view4, "parent");
        String str = "__rec_feed_" + o0Var2.f55539x1.f64175h;
        C117407d.INSTANCE.mo182089r(1454, 71, 1);
        Log.m105924i(this.f50898e, "filling#" + str + " msgId=" + o0Var2.field_orderFlag);
        if (!C19627t.f55586a.mo25840n()) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f50901h || C9533e.f29713a.mo10213f(str, view3)) {
            this.f50901h = true;
            if (this.f50899f == null) {
                View inflate = ((ViewStub) view4.findViewById(C0966R.C0970id.f359500l92)).inflate();
                this.f50900g = (BizTLRecCardCanvasView) inflate.findViewById(C0966R.C0970id.iex);
                this.f50899f = inflate;
            }
            View view5 = this.f50899f;
            if (view5 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            BizTLRecCardCanvasView bizTLRecCardCanvasView = this.f50900g;
            if (bizTLRecCardCanvasView != null) {
                bizTLRecCardCanvasView.setBizTimeLineInfo(o0Var2);
            }
            BizTLRecCardCanvasView bizTLRecCardCanvasView2 = this.f50900g;
            if (bizTLRecCardCanvasView2 != null) {
                long j = o0Var2.field_orderFlag;
                String v2 = o0Var.mo25772v2();
                C87412m.m108593f(v2, "info.recFeedData");
                bizTLRecCardCanvasView2.mo118070b(j, str, "rec-feed", v2);
            }
            C117407d.INSTANCE.mo182089r(1454, 72, 1);
            C9533e.f29713a.mo10212e(str);
        } else {
            C117407d.INSTANCE.mo182089r(1454, 73, 1);
        }
    }

    /* renamed from: b */
    public int mo22837b() {
        return this.f50902i;
    }

    /* renamed from: d */
    public void mo22838d() {
        View view = this.f50899f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public void mo22839g() {
        View view = this.f50899f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedCanvas", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
