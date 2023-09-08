package ej1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import cj1.C0575n3;
import cj1.C0581o5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.commentitem.CommentItemRedPacket;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import fj1.C45795b;
import go3.C76003c;
import gy3.C87412m;
import l31.C61212e;
import ok1.C62042e;
import qk1.C12806i0;
import rx3.C36570n;
import te3.C52013xs0;
import z04.C112550d0;
import zc1.C66785b;

/* renamed from: ej1.i0 */
public final class C7686i0 extends CommentItemRedPacket {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7686i0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        boolean z;
        String str;
        SpannableString spannableString;
        String str2;
        Context context2 = context;
        C12806i0.C12807a aVar2 = aVar;
        C0581o5 o5Var2 = o5Var;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(aVar2, "holder");
        C87412m.m108594g(o5Var2, "msg");
        Class cls = C61212e.class;
        boolean z2 = false;
        boolean z3 = Util.isEqual(o5Var.mo571e(), C75592q0.m90789s()) || Util.isEqual(o5Var.mo571e(), C66785b.f191882e.mo90662O5());
        Drawable drawable = context.getResources().getDrawable(C0966R.C0969drawable.c2j);
        drawable.setBounds(0, 0, ((Number) ((C36570n) this.f43050c).getValue()).intValue(), ((Number) ((C36570n) this.f43051d).getValue()).intValue());
        C76003c cVar = new C76003c(drawable, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
        spannableStringBuilder.setSpan(cVar, 0, 1, 33);
        if (z3) {
            str = context.getResources().getString(C0966R.string.f360616dv1);
            C87412m.m108593f(str, "context.resources.getStr…der_live_lucky_money_you)");
            z = false;
        } else {
            str = C87412m.m108589b(((C54991o) this.f15089i.mo71262a(C54991o.class)).f154345o, o5Var.mo571e()) ? context2.getString(C0966R.string.dun) : C62042e.m72808l0(C62042e.f176370a, o5Var.mo571e(), o5Var.mo573g(), false, 4, (Object) null);
            C87412m.m108593f(str, "if(liveContext.business(…NickName())\n            }");
            z = true;
        }
        String string = context.getResources().getString(C0966R.string.dum);
        C87412m.m108593f(string, "context.resources.getStr….finder_live_lucky_money)");
        if (C87412m.m108589b(str, context.getResources().getString(C0966R.string.f360616dv1))) {
            spannableString = new SpannableString(context.getResources().getString(C0966R.string.f360615dv0, new Object[]{string}));
        } else {
            spannableString = new SpannableString(context.getResources().getString(C0966R.string.duz, new Object[]{str, string}));
            z2 = z;
        }
        aVar2.f36658A.setTag(C0966R.C0970id.d44, spannableString);
        aVar2.f36658A.setTag(C0966R.C0970id.d47, string);
        ((C61212e) C86312j.m106911c(cls)).o30(aVar2.f36658A, "finder_live_comment_red_packet");
        if (o5Var2 instanceof C0575n3) {
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(aVar2.f36658A, 8, 25561);
            ((C61212e) C86312j.m106911c(cls)).E60(aVar2.f36658A, new C7682g0(o5Var2));
        }
        if (z2) {
            str2 = string;
            int E = C112550d0.m153769E(spannableString, str, 0, false, 6, (Object) null);
            if (E >= 0 && str.length() + E <= spannableString.length()) {
                spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.f3553xj)), E, str.length() + E, 33);
            }
        } else {
            str2 = string;
        }
        int E2 = C112550d0.m153769E(spannableString, str2, 0, false, 6, (Object) null);
        if (E2 >= 0 && str2.length() + E2 <= spannableString.length()) {
            spannableString.setSpan(new C7684h0(o5Var2, this, context2), E2, str2.length() + E2, 33);
        }
        spannableStringBuilder.append(spannableString);
        aVar2.f36658A.mo104279b(spannableStringBuilder);
        aVar2.f36658A.setTextSize((float) this.f43055h);
        aVar2.f36659B.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.f5166yy));
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0575n3(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20019;
    }
}
