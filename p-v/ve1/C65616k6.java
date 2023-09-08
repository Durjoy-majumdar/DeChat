package ve1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import cm1.C55011a;
import cm1.C55028r1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import pf1.C11920q;
import te3.C64580ne1;

/* renamed from: ve1.k6 */
public final class C65616k6 extends C65600h5<C55028r1> {
    public C65616k6(int i) {
        super(C0966R.C0971layout.amh, i);
    }

    /* renamed from: j */
    public void mo89664j(C60905o oVar, C55011a aVar, int i) {
        FinderJumpInfo finderJumpInfo;
        C60905o oVar2 = oVar;
        C55028r1 r1Var = (C55028r1) aVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(r1Var, "item");
        C64580ne1 ne12 = r1Var.f154465d.field_notify;
        if (ne12 != null) {
            ((TextView) oVar2.mo85812D(C0966R.C0970id.h2p)).setText(ne12.f184466d);
            ((TextView) oVar2.mo85812D(C0966R.C0970id.h1d)).setText(ne12.f184467e);
            View D = oVar2.mo85812D(C0966R.C0970id.c3g);
            View D2 = oVar2.mo85812D(C0966R.C0970id.f358439f42);
            int i2 = ne12.f184468f;
            if ((i2 == 1 || i2 == 2) && !Util.isNullOrNil(ne12.f184469g)) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view = D2;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                C117292a.m165358d(D, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view2 = D2;
                C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Context context = oVar2.f173499A;
            C87412m.m108593f(context, "holder.context");
            long j = r1Var.f154465d.field_id;
            if (ne12.f184468f == 6 && (finderJumpInfo = ne12.f184473n) != null) {
                C11920q qVar = new C11920q(finderJumpInfo);
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c).Wy0(context, qVar, j, false);
            }
        }
    }
}
