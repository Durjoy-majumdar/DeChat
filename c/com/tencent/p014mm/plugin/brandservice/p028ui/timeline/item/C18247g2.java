package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import te3.C64444ie0;
import te3.me4;
import te3.qe4;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.g2 */
public class C18247g2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50461d;

    /* renamed from: e */
    public final /* synthetic */ int f50462e;

    /* renamed from: f */
    public final /* synthetic */ C18286h2 f50463f;

    public C18247g2(C18286h2 h2Var, C19623o0 o0Var, int i) {
        this.f50463f = h2Var;
        this.f50461d = o0Var;
        this.f50462e = i;
    }

    public void onClick(View view) {
        qe4 qe4;
        C64444ie0 ie02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18286h2 h2Var = this.f50463f;
        View view2 = h2Var.f50558r;
        C19623o0 o0Var = this.f50461d;
        int i = this.f50462e;
        h2Var.getClass();
        re4 x2 = o0Var.mo25774x2();
        if (x2 == null) {
            Log.m105928w("MicroMsg.BizTimeLineItem", "onUnLikeClick wrapper is null");
        } else {
            h2Var.f50825d.f51443n.mo22985l(o0Var.mo25773w2().f64240e.f64334d, 0, 0, 16, 0, x2.f64519h, true, 0);
            boolean z = false;
            me4 me4 = x2.f64515d;
            if (me4 == null || (qe4 = me4.f64245j) == null || (ie02 = qe4.f185009e) == null || Util.isNullOrNil((List) ie02.f183682d)) {
                z = true;
            }
            if (!Util.isNullOrNil((List) x2.f64520i) || !z) {
                C18211b bVar = new C18211b(view2.getContext(), o0Var, h2Var.f50825d, i);
                bVar.mo26452d(view2);
                bVar.show();
            } else {
                Log.m105928w("MicroMsg.BizTimeLineItem", "onUnLikeClick negativeFeedbackReason is null");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
