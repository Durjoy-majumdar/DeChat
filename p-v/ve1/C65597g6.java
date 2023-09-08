package ve1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C55011a;
import cm1.C55025o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
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
import kg3.C76577a;
import l60.C99344b;
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

/* renamed from: ve1.g6 */
public class C65597g6 extends C65600h5<C55025o1> {

    /* renamed from: g */
    public final int f188758g;

    /* renamed from: h */
    public final String f188759h = "Finder.FinderMsgLikeConvert";

    public C65597g6(int i) {
        super(C0966R.C0971layout.ame, i);
        this.f188758g = i;
    }

    /* renamed from: j */
    public void mo89664j(C60905o oVar, C55011a aVar, int i) {
        Class cls;
        String str;
        String str2;
        C65597g6 g6Var;
        Integer num;
        TextView textView;
        int i2;
        String str3;
        FinderContact finderContact;
        Integer num2;
        C60905o oVar2 = oVar;
        C55025o1 o1Var = (C55025o1) aVar;
        C11978e0.C11979a aVar2 = C11978e0.C11979a.WX_AVATAR;
        Class cls2 = C76979h.class;
        Class cls3 = C11990s0.class;
        Class<C60200t1> cls4 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(o1Var, "item");
        C58784w3 w3Var = C58784w3.f168295a;
        String f0 = w3Var.mo83928f0(o1Var);
        View D = oVar2.mo85812D(C0966R.C0970id.h_7);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.hg4);
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.d77);
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.nts);
        View view = D;
        C58784w3 w3Var2 = w3Var;
        if (o1Var.f154465d.mo90403l2()) {
            String str4 = this.f188759h;
            cls = cls2;
            StringBuilder sb = new StringBuilder();
            sb.append("overlap ");
            sb.append(o1Var.f154465d.mo90404m2());
            sb.append(" content ");
            sb.append(Util.secPrint(o1Var.f154465d.field_content));
            sb.append(" id ");
            TextView textView4 = textView2;
            sb.append(o1Var.f154465d.field_id);
            sb.append(" time ");
            sb.append(o1Var.f154465d.field_createTime);
            Log.m105924i(str4, sb.toString());
            View D2 = oVar2.mo85812D(C0966R.C0970id.a27);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = D2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D3 = oVar2.mo85812D(C0966R.C0970id.hq7);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = D3;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView5 = (TextView) oVar2.mo85812D(C0966R.C0970id.k_k);
            textView5.setText("");
            textView5.setVisibility(0);
            C64312dc1 dc12 = o1Var.f154465d.field_aggregatedContacts;
            if (dc12 != null) {
                if (dc12.f182696d.size() > 0) {
                    C39818r rVar = C39818r.f106831a;
                    C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls4).mo62447c(cls3)).mo11865K1();
                    num2 = 0;
                    C62345f fVar = new C62345f(dc12.f182696d.get(0).headUrl, (C27696y) null, 2, (C8480h) null);
                    View D4 = oVar2.mo85812D(C0966R.C0970id.hq5);
                    C87412m.m108593f(D4, "holder.getView(R.id.overlap_avatar2_iv)");
                    K1.mo85957c(fVar, (ImageView) D4, ((C11990s0) rVar.mo62446e(cls4).mo62447c(cls3)).mo11867O2(aVar2));
                } else {
                    num2 = 0;
                }
                if (dc12.f182696d.size() > 1) {
                    C39818r rVar2 = C39818r.f106831a;
                    C60979d<C100810g0> K12 = ((C11990s0) rVar2.mo62446e(cls4).mo62447c(cls3)).mo11865K1();
                    C62345f fVar2 = new C62345f(dc12.f182696d.get(1).headUrl, (C27696y) null, 2, (C8480h) null);
                    View D5 = oVar2.mo85812D(C0966R.C0970id.hq4);
                    C87412m.m108593f(D5, "holder.getView(R.id.overlap_avatar1_iv)");
                    K12.mo85957c(fVar2, (ImageView) D5, ((C11990s0) rVar2.mo62446e(cls4).mo62447c(cls3)).mo11867O2(aVar2));
                    num = num2;
                    C65588c6 c6Var = r0;
                    String str5 = f0;
                    TextView textView6 = textView4;
                    C65588c6 c6Var2 = new C65588c6(oVar, textView4, f0, this, o1Var, textView5);
                    textView6.post(c6Var);
                    g6Var = this;
                    textView = textView6;
                    str = "";
                    str2 = str5;
                    i2 = 2;
                }
            } else {
                num2 = 0;
            }
            num = num2;
            C65588c6 c6Var3 = c6Var2;
            String str52 = f0;
            TextView textView62 = textView4;
            C65588c6 c6Var22 = new C65588c6(oVar, textView4, f0, this, o1Var, textView5);
            textView62.post(c6Var3);
            g6Var = this;
            textView = textView62;
            str = "";
            str2 = str52;
            i2 = 2;
        } else {
            cls = cls2;
            String str6 = f0;
            g6Var = this;
            num = 0;
            String str7 = g6Var.f188759h;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("username ");
            sb4.append(Util.nullAs(o1Var.f154465d.field_username, ""));
            sb4.append(" nickname ");
            sb4.append(Util.nullAs(o1Var.f154465d.field_nickname, ""));
            sb4.append(" url ");
            sb4.append(Util.nullAs(o1Var.f154465d.field_headUrl, ""));
            sb4.append(" flag ");
            sb4.append(o1Var.f154465d.field_extFlag);
            sb4.append(" content ");
            sb4.append(Util.secPrint(o1Var.f154465d.field_content));
            sb4.append(" id ");
            TextView textView7 = textView2;
            str = "";
            sb4.append(o1Var.f154465d.field_id);
            sb4.append(" time ");
            sb4.append(o1Var.f154465d.field_createTime);
            Log.m105924i(str7, sb4.toString());
            View D6 = oVar2.mo85812D(C0966R.C0970id.a27);
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c((Object) null);
            View view4 = D6;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D7 = oVar2.mo85812D(C0966R.C0970id.hq7);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view5 = D7;
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D8 = oVar2.mo85812D(C0966R.C0970id.k_k);
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view6 = D8;
            C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i2 = 2;
            C62345f fVar3 = new C62345f(o1Var.f154465d.field_headUrl, (C27696y) null, 2, (C8480h) null);
            int i3 = o1Var.f154465d.field_extFlag;
            if ((i3 & 2) == 0 && (i3 & 1) == 0) {
                C39818r rVar3 = C39818r.f106831a;
                C60979d<C100810g0> K13 = ((C11990s0) rVar3.mo62446e(cls4).mo62447c(cls3)).mo11865K1();
                View D9 = oVar2.mo85812D(C0966R.C0970id.a27);
                C87412m.m108593f(D9, "holder.getView(R.id.avatar_iv)");
                K13.mo85957c(fVar3, (ImageView) D9, ((C11990s0) rVar3.mo62446e(cls4).mo62447c(cls3)).mo11867O2(aVar2));
            } else {
                C39818r rVar4 = C39818r.f106831a;
                C60979d<C100810g0> i25 = ((C11990s0) rVar4.mo62446e(cls4).mo62447c(cls3)).mo11872i2();
                View D10 = oVar2.mo85812D(C0966R.C0970id.a27);
                C87412m.m108593f(D10, "holder.getView(R.id.avatar_iv)");
                i25.mo85957c(fVar3, (ImageView) D10, ((C11990s0) rVar4.mo62446e(cls4).mo62447c(cls3)).mo11867O2(C11978e0.C11979a.AVATAR));
            }
            str2 = str6;
            textView = textView7;
            textView.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(oVar2.f173499A, str2));
        }
        if (o1Var.f154465d.mo90403l2() || (o1Var.f154465d.field_extFlag & 1) != 1) {
            View D11 = oVar2.mo85812D(C0966R.C0970id.a0t);
            if (D11 != null) {
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                View view7 = D11;
                C117292a.m165358d(view7, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View D12 = oVar2.mo85812D(C0966R.C0970id.a0t);
            if (D12 != null) {
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(num);
                View view8 = D12;
                C117292a.m165358d(view8, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D12.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        View D13 = oVar2.mo85812D(C0966R.C0970id.fnw);
        C9556a aVar10 = new C9556a();
        aVar10.mo10233c(num);
        View view9 = D13;
        C117292a.m165358d(view9, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D13.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z = !Util.isNullOrNil(o1Var.f154465d.field_refContent);
        if (g6Var.f188758g == 1 && ((int) o1Var.f154465d.field_objectType) == i2 && !z) {
            View D14 = oVar2.mo85812D(C0966R.C0970id.f358542fo0);
            C9556a aVar11 = new C9556a();
            aVar11.mo10233c(8);
            View view10 = D14;
            C117292a.m165358d(view10, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D14.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D15 = oVar2.mo85812D(C0966R.C0970id.f358545fo3);
            C9556a aVar12 = new C9556a();
            aVar12.mo10233c(num);
            View view11 = D15;
            C117292a.m165358d(view11, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D15.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.h2l)).setText(oVar2.f173499A.getString(C0966R.string.fzc));
        } else {
            View D16 = oVar2.mo85812D(C0966R.C0970id.f358542fo0);
            C9556a aVar13 = new C9556a();
            aVar13.mo10233c(num);
            View view12 = D16;
            C117292a.m165358d(view12, aVar13.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D16.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D17 = oVar2.mo85812D(C0966R.C0970id.f358545fo3);
            C9556a aVar14 = new C9556a();
            aVar14.mo10233c(8);
            View view13 = D17;
            C117292a.m165358d(view13, aVar14.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D17.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D18 = oVar2.mo85812D(C0966R.C0970id.h1d);
            C9556a aVar15 = new C9556a();
            aVar15.mo10233c(8);
            View view14 = D18;
            C117292a.m165358d(view14, aVar15.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D18.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView8 = textView;
        C49839if1 c = C15587j.f42215a.mo14351c((int) o1Var.f154465d.field_objectType);
        View D19 = oVar2.mo85812D(C0966R.C0970id.fnw);
        C87412m.m108592e(D19, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((WeImageView) D19).setLayerPaint((Paint) null);
        View D20 = oVar2.mo85812D(C0966R.C0970id.fnw);
        C87412m.m108592e(D20, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((WeImageView) D20).setIconColor(0);
        int i4 = C0966R.raw.icon_outlined_awesome;
        if (z) {
            View D21 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C87412m.m108592e(D21, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            Context context = oVar2.f173499A;
            ((WeImageView) D21).setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icon_outlined_awesome, context.getResources().getColor(C0966R.color.FG_1)));
            View D22 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C87412m.m108592e(D22, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((WeImageView) D22).setIconColor(C76577a.m92153d(oVar2.f173499A, C0966R.color.FG_1));
        } else {
            if (c != null) {
                String str8 = c.f135271q;
                if (!(str8 == null || str8.length() == 0)) {
                    WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.fnw);
                    String str9 = C85875k4.m106211z() ? c.f135270p : c.f135271q;
                    C39818r rVar5 = C39818r.f106831a;
                    C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar5.mo62446e(cls4).mo62447c(cls3)).mo11871f2().mo85956b(new C11984n0(str9, C27696y.RAW_IMAGE), ((C11990s0) rVar5.mo62446e(cls4).mo62447c(cls3)).mo11867O2(C11978e0.C11979a.TIMELINE));
                    C52813e6 e6Var = new C52813e6(weImageView, oVar2);
                    b.getClass();
                    b.f291320d = e6Var;
                    b.mo85951a();
                }
            }
            Integer b0 = w3Var2.mo83917b0(1, false);
            if (b0 != null) {
                i4 = b0.intValue();
            }
            View D23 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C87412m.m108592e(D23, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            Context context2 = oVar2.f173499A;
            ((WeImageView) D23).setImageDrawable(C74933u4.m89768e(context2, i4, context2.getResources().getColor(C0966R.color.FG_1)));
            View D24 = oVar2.mo85812D(C0966R.C0970id.fnw);
            C87412m.m108592e(D24, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((WeImageView) D24).setIconColor(C76577a.m92153d(oVar2.f173499A, C0966R.color.FG_1));
        }
        View D25 = oVar2.mo85812D(C0966R.C0970id.nts);
        C9556a aVar16 = new C9556a();
        aVar16.mo10233c(8);
        View view15 = D25;
        C117292a.m165358d(view15, aVar16.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D25.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
        C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (o1Var.f154465d.field_followFlag == 1) {
            View D26 = oVar2.mo85812D(C0966R.C0970id.nts);
            C9556a aVar17 = new C9556a();
            aVar17.mo10233c(num);
            View view16 = D26;
            C117292a.m165358d(view16, aVar17.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D26.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z) {
            View D27 = oVar2.mo85812D(C0966R.C0970id.ij9);
            C9556a aVar18 = new C9556a();
            aVar18.mo10233c(num);
            View view17 = D27;
            C117292a.m165358d(view17, aVar18.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D27.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
            C117292a.m165359e(view17, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!Util.isNullOrNil(o1Var.f154465d.field_replayNickname)) {
                Context context3 = oVar2.f173499A;
                C66276va vaVar = o1Var.f154465d;
                ((TextView) oVar2.mo85812D(C0966R.C0970id.h2b)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context3, context3.getString(C0966R.string.edr, new Object[]{vaVar.field_replayNickname, vaVar.field_refContent})));
            } else {
                ((TextView) oVar2.mo85812D(C0966R.C0970id.h2b)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(oVar2.f173499A, o1Var.f154465d.field_refContent));
            }
        } else {
            View D28 = oVar2.mo85812D(C0966R.C0970id.ij9);
            C9556a aVar19 = new C9556a();
            aVar19.mo10233c(8);
            View view18 = D28;
            C117292a.m165358d(view18, aVar19.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D28.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C66276va vaVar2 = o1Var.f154465d;
        View D29 = oVar2.mo85812D(C0966R.C0970id.kk9);
        C87412m.m108593f(D29, "holder.getView(R.id.thumb_view)");
        View D30 = oVar2.mo85812D(C0966R.C0970id.ki6);
        C87412m.m108593f(D30, "holder.getView(R.id.text_content_view)");
        g6Var.mo89673k(vaVar2, (ImageView) D29, (TextView) D30);
        view.post(new C65591f6(view, imageView, oVar, textView3, textView8, this));
        View D31 = oVar2.mo85812D(C0966R.C0970id.h1v);
        if (D31 != null) {
            D31.setTag(C0966R.C0970id.d58, str2);
            C66276va vaVar3 = o1Var.f154465d;
            if (vaVar3 == null || (finderContact = vaVar3.field_authorContact) == null || (str3 = finderContact.nickname) == null) {
                str3 = str;
            }
            D31.setTag(C0966R.C0970id.d3k, str3);
            C66276va vaVar4 = o1Var.f154465d;
            String str10 = vaVar4 != null ? vaVar4.field_refContent : null;
            if (str10 == null) {
                str10 = str;
            }
            D31.setTag(C0966R.C0970id.d56, str10);
            C66276va vaVar5 = o1Var.f154465d;
            String str11 = vaVar5 != null ? vaVar5.field_replayNickname : null;
            D31.setTag(C0966R.C0970id.d5d, str11 == null ? str : str11);
        }
    }
}
