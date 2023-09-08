package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t3 */
public class C18361t3 extends C18353s3 {

    /* renamed from: m */
    public LinearLayout f50847m;

    /* renamed from: n */
    public LinearLayout f50848n;

    /* renamed from: o */
    public TextView f50849o;

    /* renamed from: p */
    public LinearLayout f50850p;

    /* renamed from: q */
    public LinearLayout f50851q;

    /* renamed from: r */
    public List<C18339q3> f50852r = new ArrayList();

    /* renamed from: s */
    public C18245f4 f50853s = new C18245f4();

    /* renamed from: t */
    public C18294i4 f50854t = new C18294i4();

    /* renamed from: u */
    public C18236d4 f50855u;

    /* renamed from: v */
    public C18302j4 f50856v;

    /* renamed from: w */
    public C18404z3 f50857w;

    /* renamed from: x */
    public C18249g4 f50858x;

    /* renamed from: y */
    public View.OnClickListener f50859y;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t3$a */
    public class C18362a implements View.OnClickListener {
        public C18362a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19623o0 o0Var = (C19623o0) view.getTag();
            o0Var.field_isExpand = true;
            o0Var.field_status = 4;
            o0Var.field_isRead = 1;
            o0Var.field_hasShow = 1;
            C48009v0.Jx0().X90(o0Var);
            C18508z2 z2Var = C18361t3.this.f50825d;
            z2Var.getClass();
            Log.m105924i("MicroMsg.BizTimeLineAdapter", "onExpand msgId=" + Long.valueOf(o0Var.field_msgId) + " talker=" + o0Var.field_talker);
            z2Var.mo23138E(z2Var.f51439g);
            z2Var.f51443n.mo22984k(o0Var, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C18361t3() {
        new C18210a4();
        new C18217b4();
        this.f50855u = new C18236d4();
        this.f50856v = new C18302j4();
        this.f50857w = new C18404z3();
        this.f50858x = new C18249g4();
        this.f50859y = new C18362a();
    }

    /* renamed from: d */
    public final void mo22924d(View view, int i, int i2, int i3, int i4) {
        int i5 = C18508z2.f51422W;
        view.setPadding(i, i2 - i5, i3, i4 - i5);
    }

    /* renamed from: e */
    public final void mo22925e(View view, C18349r3 r3Var, boolean z) {
        C18349r3 r3Var2 = r3Var;
        if (z) {
            if (r3Var2.f50826e == null) {
                r3Var2.mo22825g(view, this.f50825d);
            }
            View view2 = r3Var2.f50826e;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view4 = r3Var2.f50826e;
        if (view4 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: f */
    public final void mo22926f(C18361t3 t3Var, int i, int i2) {
        boolean z = false;
        boolean z2 = i == 5;
        mo22925e(t3Var.f50847m, t3Var.f50854t, z2);
        boolean z3 = i == 8;
        mo22925e(t3Var.f50847m, t3Var.f50855u, z3);
        if (z3) {
            z2 = true;
        }
        boolean z4 = i == 7;
        mo22925e(t3Var.f50847m, t3Var.f50856v, z4);
        if (z4) {
            z2 = true;
        }
        boolean z5 = i == 6;
        mo22925e(t3Var.f50847m, t3Var.f50857w, z5);
        if (z5) {
            z2 = true;
        }
        boolean z6 = i == 10;
        mo22925e(t3Var.f50847m, t3Var.f50858x, z6);
        if (z6) {
            z2 = true;
        }
        LinearLayout linearLayout = t3Var.f50847m;
        C18245f4 f4Var = t3Var.f50853s;
        if (!z2 && i2 > 0 && i != -1) {
            z = true;
        }
        mo22925e(linearLayout, f4Var, z);
    }
}
