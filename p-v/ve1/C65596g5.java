package ve1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C55011a;
import cm1.C55016h1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.MentionEllipsizeTextView;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
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
import p629ny.C76979h;
import p749xh.C66276va;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C64284cg;
import up1.C27696y;

/* renamed from: ve1.g5 */
public final class C65596g5 extends C65600h5<C55016h1> {

    /* renamed from: g */
    public final String f188757g = "Finder.FinderMsgCommentConvert";

    public C65596g5(int i) {
        super(C0966R.C0971layout.am6, i);
    }

    /* renamed from: j */
    public void mo89664j(C60905o oVar, C55011a aVar, int i) {
        int i2;
        String str;
        ImageView imageView;
        String str2;
        FinderContact finderContact;
        C60905o oVar2 = oVar;
        C55016h1 h1Var = (C55016h1) aVar;
        Class cls = C76979h.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(h1Var, "item");
        C62345f fVar = new C62345f(h1Var.f154465d.field_headUrl, (C27696y) null, 2, (C8480h) null);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.hg4);
        View D = oVar2.mo85812D(C0966R.C0970id.a0t);
        ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.d77);
        String str3 = this.f188757g;
        Log.m105924i(str3, "username " + Util.nullAs(h1Var.f154465d.field_username, "") + " nickname " + Util.nullAs(h1Var.f154465d.field_nickname, "") + " url " + Util.nullAs(h1Var.f154465d.field_headUrl, "") + " flag " + h1Var.f154465d.field_extFlag + " content " + Util.secPrint(h1Var.f154465d.field_content) + " id " + h1Var.f154465d.field_id + " time " + h1Var.f154465d.field_createTime);
        int i3 = h1Var.f154465d.field_extFlag;
        if ((i3 & 2) == 0 && (i3 & 1) == 0) {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11865K1();
            View D2 = oVar2.mo85812D(C0966R.C0970id.a27);
            C87412m.m108593f(D2, "holder.getView(R.id.avatar_iv)");
            K1.mo85957c(fVar, (ImageView) D2, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        } else {
            C39818r rVar2 = C39818r.f106831a;
            C60979d<C100810g0> i25 = ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
            View D3 = oVar2.mo85812D(C0966R.C0970id.a27);
            C87412m.m108593f(D3, "holder.getView(R.id.avatar_iv)");
            i25.mo85957c(fVar, (ImageView) D3, ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
        }
        ((MentionEllipsizeTextView) oVar2.mo85812D(C0966R.C0970id.h1d)).setMention(h1Var.f154465d);
        if (!Util.isNullOrNil(h1Var.f154465d.field_refContent)) {
            View D4 = oVar2.mo85812D(C0966R.C0970id.ij9);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = D4;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!Util.isNullOrNil(h1Var.f154465d.field_replayNickname)) {
                Context context = oVar2.f173499A;
                C66276va vaVar = h1Var.f154465d;
                ((TextView) oVar2.mo85812D(C0966R.C0970id.h2b)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, context.getString(C0966R.string.edr, new Object[]{vaVar.field_replayNickname, vaVar.field_refContent})));
            } else {
                ((TextView) oVar2.mo85812D(C0966R.C0970id.h2b)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(oVar2.f173499A, h1Var.f154465d.field_refContent));
            }
        } else {
            View D5 = oVar2.mo85812D(C0966R.C0970id.ij9);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = D5;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h1Var.f154467f = false;
        if (!h1Var.f154465d.mo90403l2()) {
            h1Var.f154467f = true;
            C58784w3 w3Var = C58784w3.f168295a;
            C87412m.m108593f(imageView2, LocaleUtil.ITALIAN);
            FinderContact finderContact2 = h1Var.f154465d.field_contact;
            i2 = 1;
            FinderAuthInfo finderAuthInfo = finderContact2 != null ? finderContact2.authInfo : null;
            str = "";
            C58784w3.m68429F1(w3Var, imageView2, finderAuthInfo, 0, (C64284cg) null, 12, (Object) null);
        } else {
            str = "";
            i2 = 1;
        }
        if ((h1Var.f154465d.field_extFlag & i2) == i2) {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            imageView = imageView2;
            View view3 = D;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            imageView = imageView2;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view4 = D;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (C76577a.m92147C(oVar2.f173499A)) {
            int f = C76577a.m92155f(oVar2.f173499A, C0966R.dimen.f3720ca);
            if (imageView.getVisibility() == 0) {
                f -= C76577a.m92155f(oVar2.f173499A, C0966R.dimen.f3736cp);
            }
            if (D.getVisibility() == 0) {
                f -= C76577a.m92155f(oVar2.f173499A, C0966R.dimen.f3749d0);
            }
            textView.setMaxWidth(f);
        }
        textView.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(oVar2.f173499A, C58784w3.f168295a.mo83928f0(h1Var)));
        C66276va vaVar2 = h1Var.f154465d;
        View D6 = oVar2.mo85812D(C0966R.C0970id.kk9);
        C87412m.m108593f(D6, "holder.getView(R.id.thumb_view)");
        View D7 = oVar2.mo85812D(C0966R.C0970id.ki6);
        C87412m.m108593f(D7, "holder.getView(R.id.text_content_view)");
        mo89673k(vaVar2, (ImageView) D6, (TextView) D7);
        C66276va vaVar3 = h1Var.f154465d;
        if (((int) vaVar3.field_objectType) != 2 || !Util.isNullOrNil(vaVar3.field_refContent)) {
            View D8 = oVar2.mo85812D(C0966R.C0970id.h1e);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view5 = D8;
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View D9 = oVar2.mo85812D(C0966R.C0970id.h1e);
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view6 = D9;
            C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.h1e)).setText(oVar2.f173499A.getString(C0966R.string.edh));
        }
        View D10 = oVar2.mo85812D(C0966R.C0970id.h1s);
        if (D10 != null) {
            D10.setTag(C0966R.C0970id.d58, textView.getText());
            C66276va vaVar4 = h1Var.f154465d;
            if (vaVar4 == null || (finderContact = vaVar4.field_authorContact) == null || (str2 = finderContact.nickname) == null) {
                str2 = str;
            }
            D10.setTag(C0966R.C0970id.d3k, str2);
            C66276va vaVar5 = h1Var.f154465d;
            String str4 = vaVar5 != null ? vaVar5.field_content : null;
            if (str4 == null) {
                str4 = str;
            }
            D10.setTag(C0966R.C0970id.d54, str4);
            C66276va vaVar6 = h1Var.f154465d;
            String str5 = vaVar6 != null ? vaVar6.field_refContent : null;
            if (str5 == null) {
                str5 = str;
            }
            D10.setTag(C0966R.C0970id.d56, str5);
            C66276va vaVar7 = h1Var.f154465d;
            String str6 = vaVar7 != null ? vaVar7.field_replayNickname : null;
            D10.setTag(C0966R.C0970id.d5d, str6 == null ? str : str6);
        }
    }
}
