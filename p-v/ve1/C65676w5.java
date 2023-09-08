package ve1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C55011a;
import cm1.C55023m1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
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
import kg3.C76577a;
import p629ny.C76979h;
import p749xh.C66276va;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C49839if1;
import te3.C64312dc1;
import up1.C27696y;
import wp1.C15587j;

/* renamed from: ve1.w5 */
public final class C65676w5 extends C65600h5<C55023m1> {

    /* renamed from: g */
    public final int f188972g;

    /* renamed from: h */
    public final String f188973h = "Finder.FinderMsgFriendObjectLikeLikeConvert";

    public C65676w5(int i) {
        super(C0966R.C0971layout.ama, i);
        this.f188972g = i;
    }

    /* renamed from: j */
    public void mo89664j(C60905o oVar, C55011a aVar, int i) {
        C58784w3 w3Var;
        Integer num;
        C65676w5 w5Var;
        Integer num2;
        TextView textView;
        C60905o oVar2 = oVar;
        C55023m1 m1Var = (C55023m1) aVar;
        C11978e0.C11979a aVar2 = C11978e0.C11979a.WX_AVATAR;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(m1Var, "item");
        C58784w3 w3Var2 = C58784w3.f168295a;
        String f0 = w3Var2.mo83928f0(m1Var);
        View D = oVar2.mo85812D(C0966R.C0970id.h_7);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.hg4);
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.nts);
        boolean l2 = m1Var.f154465d.mo90403l2();
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.d77);
        View view = D;
        if (l2) {
            String str = this.f188973h;
            w3Var = w3Var2;
            StringBuilder sb = new StringBuilder();
            sb.append("overlap ");
            sb.append(m1Var.f154465d.mo90404m2());
            sb.append(" content ");
            sb.append(Util.secPrint(m1Var.f154465d.field_content));
            sb.append(" id ");
            TextView textView4 = textView2;
            sb.append(m1Var.f154465d.field_id);
            sb.append(" time ");
            sb.append(m1Var.f154465d.field_createTime);
            Log.m105924i(str, sb.toString());
            View D2 = oVar2.mo85812D(C0966R.C0970id.a27);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = D2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D3 = oVar2.mo85812D(C0966R.C0970id.hq7);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = D3;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView5 = (TextView) oVar2.mo85812D(C0966R.C0970id.k_k);
            textView5.setText("");
            textView5.setVisibility(0);
            C64312dc1 dc12 = m1Var.f154465d.field_aggregatedContacts;
            if (dc12 != null) {
                if (dc12.f182696d.size() > 0) {
                    C39818r rVar = C39818r.f106831a;
                    C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                    C62345f fVar = new C62345f(dc12.f182696d.get(0).headUrl, (C27696y) null, 2, (C8480h) null);
                    View D4 = oVar2.mo85812D(C0966R.C0970id.hq5);
                    C87412m.m108593f(D4, "holder.getView(R.id.overlap_avatar2_iv)");
                    K1.mo85957c(fVar, (ImageView) D4, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar2));
                }
                if (dc12.f182696d.size() > 1) {
                    C39818r rVar2 = C39818r.f106831a;
                    C60979d<C100810g0> K12 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                    C62345f fVar2 = new C62345f(dc12.f182696d.get(1).headUrl, (C27696y) null, 2, (C8480h) null);
                    View D5 = oVar2.mo85812D(C0966R.C0970id.hq4);
                    C87412m.m108593f(D5, "holder.getView(R.id.overlap_avatar1_iv)");
                    K12.mo85957c(fVar2, (ImageView) D5, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar2));
                }
            }
            num = 8;
            textView = textView4;
            textView.post(new C65673u5(oVar, textView4, f0, textView5, m1Var));
            w5Var = this;
            num2 = null;
        } else {
            num2 = 0;
            w3Var = w3Var2;
            textView = textView2;
            num = 8;
            Log.m105924i(this.f188973h, "username " + Util.nullAs(m1Var.f154465d.field_username, "") + " nickname " + Util.nullAs(m1Var.f154465d.field_nickname, "") + " url " + Util.nullAs(m1Var.f154465d.field_headUrl, "") + " flag " + m1Var.f154465d.field_extFlag + " content " + Util.secPrint(m1Var.f154465d.field_content) + " id " + m1Var.f154465d.field_id + " time " + m1Var.f154465d.field_createTime);
            View D6 = oVar2.mo85812D(C0966R.C0970id.a27);
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c((Object) null);
            View view4 = D6;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D7 = oVar2.mo85812D(C0966R.C0970id.hq7);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view5 = D7;
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.k_k)).setVisibility(8);
            C62345f fVar3 = new C62345f(m1Var.f154465d.field_headUrl, (C27696y) null, 2, (C8480h) null);
            int i2 = m1Var.f154465d.field_extFlag;
            if ((i2 & 2) == 0 && (i2 & 1) == 0) {
                C39818r rVar3 = C39818r.f106831a;
                C60979d<C100810g0> K13 = ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                View D8 = oVar2.mo85812D(C0966R.C0970id.a27);
                C87412m.m108593f(D8, "holder.getView(R.id.avatar_iv)");
                K13.mo85957c(fVar3, (ImageView) D8, ((C11990s0) rVar3.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar2));
            } else {
                C39818r rVar4 = C39818r.f106831a;
                C60979d<C100810g0> i25 = ((C11990s0) rVar4.mo62446e(cls2).mo62447c(cls)).mo11872i2();
                View D9 = oVar2.mo85812D(C0966R.C0970id.a27);
                C87412m.m108593f(D9, "holder.getView(R.id.avatar_iv)");
                i25.mo85957c(fVar3, (ImageView) D9, ((C11990s0) rVar4.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            }
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar2.f173499A, f0));
            w5Var = this;
        }
        if (w5Var.f188972g == 1) {
            View D10 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(num2);
            View view6 = D10;
            C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D11 = oVar2.mo85812D(C0966R.C0970id.h1d);
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(num);
            View view7 = D11;
            C117292a.m165358d(view7, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D12 = oVar2.mo85812D(C0966R.C0970id.fnx);
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(num);
            View view8 = D12;
            C117292a.m165358d(view8, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D12.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C49839if1 c = C15587j.f42215a.mo14351c((int) m1Var.f154465d.field_objectType);
            if (c != null) {
                String str2 = c.f135271q;
                if (!(str2 == null || str2.length() == 0)) {
                    C39818r rVar5 = C39818r.f106831a;
                    C60979d<C100810g0> f2 = ((C11990s0) rVar5.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                    C11984n0 n0Var = new C11984n0(c.f135271q, C27696y.RAW_IMAGE);
                    View D13 = oVar2.mo85812D(C0966R.C0970id.fnw);
                    C87412m.m108593f(D13, "holder.getView<ImageView>(R.id.like_iv)");
                    f2.mo85957c(n0Var, (ImageView) D13, ((C11990s0) rVar5.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
                    ((ImageView) oVar2.mo85812D(C0966R.C0970id.fnw)).setColorFilter(C76577a.m92153d(oVar2.f173499A, C0966R.color.FG_1), PorterDuff.Mode.SRC_ATOP);
                }
            }
            Integer b0 = w3Var.mo83917b0(1, false);
            int intValue = b0 != null ? b0.intValue() : C0966R.raw.icon_outlined_awesome;
            View D14 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C87412m.m108592e(D14, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            Context context = oVar2.f173499A;
            ((WeImageView) D14).setImageDrawable(C74933u4.m89768e(context, intValue, context.getResources().getColor(C0966R.color.FG_1)));
            View D15 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C87412m.m108592e(D15, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((WeImageView) D15).setIconColor(C76577a.m92153d(oVar2.f173499A, C0966R.color.FG_1));
        } else {
            View D16 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(num);
            View view9 = D16;
            C117292a.m165358d(view9, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D16.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D17 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C87412m.m108592e(D17, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((WeImageView) D17).setIconColor(MMApplicationContext.getResources().getColor(C0966R.color.FG_1));
            View D18 = oVar2.mo85812D(C0966R.C0970id.h1d);
            C9556a aVar11 = new C9556a();
            aVar11.mo10233c(num2);
            View view10 = D18;
            C117292a.m165358d(view10, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D18.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.h1d)).setText(oVar2.f173499A.getString(C0966R.string.fza));
            View D19 = oVar2.mo85812D(C0966R.C0970id.fnx);
            C9556a aVar12 = new C9556a();
            aVar12.mo10233c(num2);
            View view11 = D19;
            C117292a.m165358d(view11, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D19.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (m1Var.f154465d.field_followFlag == 1) {
            View D20 = oVar2.mo85812D(C0966R.C0970id.nts);
            C9556a aVar13 = new C9556a();
            aVar13.mo10233c(num2);
            View view12 = D20;
            C117292a.m165358d(view12, aVar13.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D20.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C66276va vaVar = m1Var.f154465d;
        View D21 = oVar2.mo85812D(C0966R.C0970id.kk9);
        C87412m.m108593f(D21, "holder.getView(R.id.thumb_view)");
        View D22 = oVar2.mo85812D(C0966R.C0970id.ki6);
        C87412m.m108593f(D22, "holder.getView(R.id.text_content_view)");
        w5Var.mo89673k(vaVar, (ImageView) D21, (TextView) D22);
        view.post(new C65675v5(view, imageView, oVar, textView3, textView));
    }
}
