package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import te3.C64444ie0;
import te3.me4;
import te3.qe4;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.a1 */
public final class C18208a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTLRecCardItem f50332d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50333e;

    /* renamed from: f */
    public final /* synthetic */ int f50334f;

    public C18208a1(BizTLRecCardItem bizTLRecCardItem, C19623o0 o0Var, int i) {
        this.f50332d = bizTLRecCardItem;
        this.f50333e = o0Var;
        this.f50334f = i;
    }

    public final void onClick(View view) {
        qe4 qe4;
        C64444ie0 ie02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem$refreshHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BizTLRecCardItem bizTLRecCardItem = this.f50332d;
        View view2 = bizTLRecCardItem.f50315j;
        if (view2 != null) {
            C19623o0 o0Var = this.f50333e;
            int i = this.f50334f;
            bizTLRecCardItem.getClass();
            re4 x2 = o0Var.mo25774x2();
            if (x2 == null) {
                Log.m105928w("MicroMsg.BizTLRecCardItem", "[TRACE_BIZRECCARD] onUnLikeClick wrapper is null");
            } else {
                C18412m3 m3Var = bizTLRecCardItem.f50310e.f51443n;
                me4 w2 = o0Var.mo25773w2();
                C87412m.m108591d(w2);
                m3Var.mo22985l(w2.f64240e.f64334d, 0, 0, 16, 0, x2.f64519h, true, 0);
                boolean z = false;
                me4 me4 = x2.f64515d;
                if (me4 == null || (qe4 = me4.f64245j) == null || (ie02 = qe4.f185009e) == null || Util.isNullOrNil((List) ie02.f183682d)) {
                    z = true;
                }
                if (!Util.isNullOrNil((List) x2.f64520i) || !z) {
                    Context context = view2.getContext();
                    C87412m.m108593f(context, "view.context");
                    C18211b bVar = new C18211b(context, o0Var, bizTLRecCardItem.f50310e, i);
                    bVar.mo26452d(view2);
                    bVar.show();
                } else {
                    Log.m105928w("MicroMsg.BizTLRecCardItem", "[TRACE_BIZRECCARD] onUnLikeClick negativeFeedbackReason is null");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem$refreshHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("closeIv");
        throw null;
    }
}
