package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C55011a;
import cm1.C55020j1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C64312dc1;
import up1.C27696y;

/* renamed from: ve1.r5 */
public final class C65663r5 extends C65600h5<C55020j1> {

    /* renamed from: g */
    public final String f188942g = "Finder.FinderMsgFollowConvert";

    public C65663r5(int i) {
        super(C0966R.C0971layout.am7, i);
    }

    /* renamed from: j */
    public void mo89664j(C60905o oVar, C55011a aVar, int i) {
        C60905o oVar2 = oVar;
        C55020j1 j1Var = (C55020j1) aVar;
        C11978e0.C11979a aVar2 = C11978e0.C11979a.WX_AVATAR;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(j1Var, "item");
        String f0 = C58784w3.f168295a.mo83928f0(j1Var);
        if (j1Var.f154465d.mo90403l2()) {
            String str = this.f188942g;
            Log.m105924i(str, "overlap " + j1Var.f154465d.mo90404m2() + " content " + Util.secPrint(j1Var.f154465d.field_content) + " id " + j1Var.f154465d.field_id + " time " + j1Var.f154465d.field_createTime);
            View D = oVar2.mo85812D(C0966R.C0970id.a27);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view = D;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D2 = oVar2.mo85812D(C0966R.C0970id.hq7);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view2 = D2;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.k_k);
            textView.setText("");
            textView.setVisibility(0);
            C64312dc1 dc12 = j1Var.f154465d.field_aggregatedContacts;
            if (dc12 != null) {
                if (dc12.f182696d.size() > 0) {
                    C39818r rVar = C39818r.f106831a;
                    C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                    C62345f fVar = new C62345f(dc12.f182696d.get(0).headUrl, (C27696y) null, 2, (C8480h) null);
                    View D3 = oVar2.mo85812D(C0966R.C0970id.hq5);
                    C87412m.m108593f(D3, "holder.getView(R.id.overlap_avatar2_iv)");
                    K1.mo85957c(fVar, (ImageView) D3, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar2));
                }
                if (dc12.f182696d.size() > 1) {
                    C39818r rVar2 = C39818r.f106831a;
                    C60979d<C100810g0> K12 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                    C62345f fVar2 = new C62345f(dc12.f182696d.get(1).headUrl, (C27696y) null, 2, (C8480h) null);
                    View D4 = oVar2.mo85812D(C0966R.C0970id.hq4);
                    C87412m.m108593f(D4, "holder.getView(R.id.overlap_avatar1_iv)");
                    K12.mo85957c(fVar2, (ImageView) D4, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar2));
                }
            }
            TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.hg4);
            textView2.post(new C65637q5(oVar, textView2, f0, textView, j1Var));
        } else {
            String str2 = this.f188942g;
            Log.m105924i(str2, "username " + Util.nullAs(j1Var.f154465d.field_username, "") + " nickname " + Util.nullAs(j1Var.f154465d.field_nickname, "") + " url " + Util.nullAs(j1Var.f154465d.field_headUrl, "") + " flag " + j1Var.f154465d.field_extFlag + " content " + Util.secPrint(j1Var.f154465d.field_content) + " id " + j1Var.f154465d.field_id + " time " + j1Var.f154465d.field_createTime);
            View D5 = oVar2.mo85812D(C0966R.C0970id.a27);
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c(0);
            View view3 = D5;
            C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D6 = oVar2.mo85812D(C0966R.C0970id.hq7);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view4 = D6;
            C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.k_k)).setVisibility(8);
            C62345f fVar3 = new C62345f(j1Var.f154465d.field_headUrl, (C27696y) null, 2, (C8480h) null);
            TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.hg4);
            int i2 = j1Var.f154465d.field_extFlag;
            if ((i2 & 2) == 0 && (i2 & 1) == 0) {
                C39818r rVar3 = C39818r.f106831a;
                C60979d<C100810g0> K13 = ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                View D7 = oVar2.mo85812D(C0966R.C0970id.a27);
                C87412m.m108593f(D7, "holder.getView(R.id.avatar_iv)");
                K13.mo85957c(fVar3, (ImageView) D7, ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar2));
            } else {
                C39818r rVar4 = C39818r.f106831a;
                C60979d<C100810g0> i25 = ((C11990s0) rVar4.mo62446e(cls2).mo62447c(cls)).mo11872i2();
                View D8 = oVar2.mo85812D(C0966R.C0970id.a27);
                C87412m.m108593f(D8, "holder.getView(R.id.avatar_iv)");
                i25.mo85957c(fVar3, (ImageView) D8, ((C11990s0) rVar4.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            }
            textView3.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar2.f173499A, f0));
        }
        ((TextView) oVar2.mo85812D(C0966R.C0970id.h1d)).setText(oVar2.f173499A.getString(C0966R.string.ed9));
    }
}
