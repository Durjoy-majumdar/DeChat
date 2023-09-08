package rl1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0724d1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import qo3.C101218e0;

/* renamed from: rl1.b0 */
public final class C13018b0 extends C60896i<C0724d1> {
    /* renamed from: j */
    public static final void m12466j(C13018b0 b0Var, C60905o oVar, String str) {
        b0Var.getClass();
        if (!(str == null || str.length() == 0)) {
            C101218e0 e0Var = new C101218e0(oVar.f173499A, 2, 2);
            e0Var.mo140677w(oVar.f173499A.getResources().getString(C0966R.string.f8028zq));
            e0Var.f296375F = new C13016a0(e0Var);
            e0Var.mo140676v(1);
            e0Var.mo140671q(oVar.f173499A.getResources().getString(C0966R.string.a2d));
            C85875k4.m106189j0(e0Var.f296372C.getPaint(), 0.8f);
            TextView textView = new TextView(oVar.f173499A);
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9, (Resources.Theme) null));
            textView.setText(str);
            e0Var.mo140663j(textView);
            e0Var.mo140655A();
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359735ai2;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C0724d1 d1Var = (C0724d1) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(d1Var, "item");
        ((TextView) oVar2.mo85812D(C0966R.C0970id.g7g)).setText(d1Var.f1737d.f145644h);
        ((TextView) oVar2.mo85812D(C0966R.C0970id.g7x)).setText(oVar2.f173499A.getString(C0966R.string.mnl, new Object[]{Integer.valueOf(d1Var.f1737d.f145646j), C62042e.f176370a.mo87103o0(d1Var.f1737d.f145645i)}));
        ((TextView) oVar2.mo85812D(C0966R.C0970id.g7y)).setText(C72715f.m85111d("yyyy-MM-dd HH:mm", (long) d1Var.f1737d.f145642f));
        View D = oVar2.mo85812D(C0966R.C0970id.g7u);
        int i3 = d1Var.f1738e ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerListHeader;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerListHeader;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String str = d1Var.f1740g;
        if (str == null || str.length() == 0) {
            ((TextView) oVar2.mo85812D(C0966R.C0970id.n6q)).setVisibility(8);
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n6r)).setVisibility(8);
            return;
        }
        ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.LOTTERY_DETAIL_CLAIM_INFO_EXPOSE, "");
        ((TextView) oVar2.mo85812D(C0966R.C0970id.n6q)).setOnClickListener(new C13084y(d1Var, this, oVar2));
        ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n6r)).setOnClickListener(new C13085z(this, oVar2, d1Var));
        ((TextView) oVar2.mo85812D(C0966R.C0970id.n6q)).setVisibility(0);
        ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n6r)).setVisibility(0);
        if (d1Var.f1741h == 1) {
            ((TextView) oVar2.mo85812D(C0966R.C0970id.n6q)).setText(oVar2.f173499A.getResources().getString(C0966R.string.mnn));
            ((TextView) oVar2.mo85812D(C0966R.C0970id.n6q)).setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5, (Resources.Theme) null));
            return;
        }
        ((TextView) oVar2.mo85812D(C0966R.C0970id.n6q)).setText(oVar2.f173499A.getResources().getString(C0966R.string.mnm));
        ((TextView) oVar2.mo85812D(C0966R.C0970id.n6q)).setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.a1d, (Resources.Theme) null));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
