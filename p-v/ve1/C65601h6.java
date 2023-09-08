package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C55011a;
import cm1.C55026p1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import jq3.C60905o;
import k60.C60979d;
import p629ny.C76979h;
import p749xh.C66276va;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import up1.C27696y;

/* renamed from: ve1.h6 */
public final class C65601h6 extends C65600h5<C55026p1> {

    /* renamed from: g */
    public final String f188766g = "Finder.FinderMsgMentionedConvert";

    /* renamed from: h */
    public final String f188767h = "@";

    public C65601h6(int i) {
        super(C0966R.C0971layout.amf, i);
    }

    /* renamed from: j */
    public void mo89664j(C60905o oVar, C55011a aVar, int i) {
        C55026p1 p1Var = (C55026p1) aVar;
        Class cls = C76979h.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(p1Var, "item");
        String str = this.f188766g;
        Log.m105924i(str, "username " + Util.nullAs(p1Var.f154465d.field_username, "") + " nickname " + Util.nullAs(p1Var.f154465d.field_nickname, "") + " url " + Util.nullAs(p1Var.f154465d.field_headUrl, "") + " flag " + p1Var.f154465d.field_extFlag + " content " + Util.secPrint(p1Var.f154465d.field_content) + " id " + p1Var.f154465d.field_id + " time " + p1Var.f154465d.field_createTime);
        C62345f fVar = new C62345f(p1Var.f154465d.field_headUrl, (C27696y) null, 2, (C8480h) null);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.hg4);
        int i2 = p1Var.f154465d.field_extFlag;
        if ((i2 & 2) == 0 && (i2 & 1) == 0) {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11865K1();
            View D = oVar.mo85812D(C0966R.C0970id.a27);
            C87412m.m108593f(D, "holder.getView(R.id.avatar_iv)");
            K1.mo85957c(fVar, (ImageView) D, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        } else {
            C39818r rVar2 = C39818r.f106831a;
            C60979d<C100810g0> i25 = ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
            View D2 = oVar.mo85812D(C0966R.C0970id.a27);
            C87412m.m108593f(D2, "holder.getView(R.id.avatar_iv)");
            i25.mo85957c(fVar, (ImageView) D2, ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
        }
        textView.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(oVar.f173499A, C58784w3.f168295a.mo83928f0(p1Var)));
        ((TextView) oVar.mo85812D(C0966R.C0970id.h1d)).setText(this.f188767h + ((C76979h) C86312j.m106911c(cls)).mo107057T1(oVar.f173499A, p1Var.f154465d.field_content));
        C66276va vaVar = p1Var.f154465d;
        View D3 = oVar.mo85812D(C0966R.C0970id.kk9);
        C87412m.m108593f(D3, "holder.getView(R.id.thumb_view)");
        View D4 = oVar.mo85812D(C0966R.C0970id.ki6);
        C87412m.m108593f(D4, "holder.getView(R.id.text_content_view)");
        mo89673k(vaVar, (ImageView) D3, (TextView) D4);
    }
}
