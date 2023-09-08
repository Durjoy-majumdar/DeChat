package rl1;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C60200t1;
import java.util.LinkedList;
import k60.C60979d;
import nj3.C76912y0;
import ob0.C89132b;
import ok1.C62042e;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49225e31;
import te3.C49347ex2;
import te3.C50617o01;
import te3.C51633v21;
import te3.C51773w21;
import te3.C52204z21;
import te3.C64240aq3;
import te3.C64379fx2;
import te3.C64480jx2;
import te3.C64641px2;
import up1.C27696y;

/* renamed from: rl1.g */
public final class C63483g<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C63463e f180083a;

    public C63483g(C63463e eVar) {
        this.f180083a = eVar;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [up1.y, gy3.h] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    public Object call(Object obj) {
        String str;
        String str2;
        String str3;
        ? r102;
        int i;
        String str4;
        long j;
        String str5;
        C64379fx2 fx22;
        C64379fx2 fx23;
        C64379fx2 fx24;
        C49347ex2 ex22;
        C64240aq3 aq32;
        C64240aq3 aq33;
        String str6;
        C64240aq3 aq34;
        C64480jx2 jx22;
        C64480jx2 jx23;
        C64480jx2 jx24;
        C13598b0 b0Var;
        String str7;
        String str8;
        String str9;
        String str10;
        long j2;
        String str11;
        String str12;
        LinkedList<C51773w21> linkedList;
        C51773w21 w212;
        C51633v21 v212;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C11978e0.C11979a aVar = C11978e0.C11979a.AVATAR;
        Class<C60200t1> cls = C60200t1.class;
        Class cls2 = C11990s0.class;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            if (!(((C50617o01) t) != null)) {
                t = null;
            }
            C50617o01 o012 = (C50617o01) t;
            if (o012 != null) {
                C63463e eVar = this.f180083a;
                eVar.f180032H = o012;
                eVar.mo88335d3().setOnClickListener(eVar);
                int i2 = o012.f138881p;
                if (i2 != 1) {
                    String str13 = "";
                    if (i2 != 2) {
                        C52204z21 z212 = o012.f138872d;
                        if (z212 == null || (v212 = z212.f145653t) == null) {
                            b0Var = null;
                        } else {
                            eVar.mo88337f3(v212);
                            String str14 = v212.f143260h;
                            if (str14 == null || str14.length() == 0) {
                                eVar.mo88336e3().setVisibility(8);
                            } else {
                                eVar.mo88336e3().setVisibility(0);
                                eVar.mo88336e3().setText(v212.f143260h);
                            }
                            b0Var = C13598b0.f38549a;
                        }
                        if (b0Var == null) {
                            eVar.mo88335d3().setVisibility(8);
                        }
                        C49225e31 e312 = o012.f138875g;
                        if (e312 == null || (linkedList = e312.f132658d) == null || (w212 = (C51773w21) C110818d0.m150916N(linkedList)) == null) {
                            str7 = "<get-lotteryCountTv>(...)";
                            str10 = "yyyy-MM-dd HH:mm";
                            str9 = "<get-lotteryDateTv>(...)";
                            str8 = "<get-lotteryWayTv>(...)";
                        } else {
                            C39818r rVar = C39818r.f106831a;
                            C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11872i2();
                            str10 = "yyyy-MM-dd HH:mm";
                            str9 = "<get-lotteryDateTv>(...)";
                            str7 = "<get-lotteryCountTv>(...)";
                            str8 = "<get-lotteryWayTv>(...)";
                            C62345f fVar = new C62345f(w212.f143826f, (C27696y) null, 2, (C8480h) null);
                            Object value = ((C36570n) eVar.f180035d).getValue();
                            C87412m.m108593f(value, "<get-avatarIv>(...)");
                            i25.mo85957c(fVar, (ImageView) value, ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                            Object value2 = ((C36570n) eVar.f180036e).getValue();
                            C87412m.m108593f(value2, "<get-userNameTv>(...)");
                            TextView textView = (TextView) value2;
                            String str15 = w212.f143825e;
                            textView.setText(str15 == null || str15.length() == 0 ? w212.f143824d : w212.f143825e);
                        }
                        Object value3 = ((C36570n) eVar.f180039h).getValue();
                        C87412m.m108593f(value3, "<get-rewardNameTv>(...)");
                        TextView textView2 = (TextView) value3;
                        C52204z21 z213 = o012.f138872d;
                        textView2.setText((z213 == null || (str12 = z213.f145644h) == null) ? str13 : str12);
                        Object value4 = ((C36570n) eVar.f180044p).getValue();
                        C87412m.m108593f(value4, "<get-anchorNameTv>(...)");
                        ((TextView) value4).setText(eVar.f180026B);
                        Object value5 = ((C36570n) eVar.f180045q).getValue();
                        C87412m.m108593f(value5, str7);
                        TextView textView3 = (TextView) value5;
                        C52204z21 z214 = o012.f138872d;
                        textView3.setText(z214 != null ? Integer.valueOf(z214.f145646j).toString() : null);
                        C62042e eVar2 = C62042e.f176370a;
                        C52204z21 z215 = o012.f138872d;
                        String o0 = eVar2.mo87103o0(z215 != null ? z215.f145645i : null);
                        Object value6 = ((C36570n) eVar.f180046r).getValue();
                        C87412m.m108593f(value6, str8);
                        ((TextView) value6).setText(o0);
                        Object value7 = ((C36570n) eVar.f180047s).getValue();
                        C87412m.m108593f(value7, str9);
                        TextView textView4 = (TextView) value7;
                        C52204z21 z216 = o012.f138872d;
                        if (z216 != null) {
                            j2 = (long) z216.f145642f;
                            str11 = str10;
                        } else {
                            str11 = str10;
                            j2 = 0;
                        }
                        textView4.setText(C72715f.m85111d(str11, j2));
                    } else {
                        String str16 = "<get-lotteryDateTv>(...)";
                        String str17 = "<get-lotteryWayTv>(...)";
                        C64641px2 px22 = o012.f138883r;
                        C39818r rVar2 = C39818r.f106831a;
                        C60979d<C100810g0> i26 = ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11872i2();
                        String str18 = "yyyy-MM-dd HH:mm";
                        if (px22 == null || (jx24 = px22.f184912d) == null) {
                            str = str17;
                            str2 = str16;
                            i = 2;
                            r102 = 0;
                            str3 = null;
                        } else {
                            str3 = jx24.f183858e;
                            str = str17;
                            str2 = str16;
                            i = 2;
                            r102 = 0;
                        }
                        C62345f fVar2 = new C62345f(str3, r102, i, r102);
                        Object value8 = ((C36570n) eVar.f180035d).getValue();
                        C87412m.m108593f(value8, "<get-avatarIv>(...)");
                        i26.mo85957c(fVar2, (ImageView) value8, ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                        Object value9 = ((C36570n) eVar.f180036e).getValue();
                        C87412m.m108593f(value9, "<get-userNameTv>(...)");
                        ((TextView) value9).setText((px22 == null || (jx23 = px22.f184912d) == null) ? r102 : jx23.f183857d);
                        Object value10 = ((C36570n) eVar.f180037f).getValue();
                        C87412m.m108593f(value10, "<get-fillWording>(...)");
                        ((TextView) value10).setText((px22 == null || (jx22 = px22.f184912d) == null) ? r102 : jx22.f183859f);
                        Object value11 = ((C36570n) eVar.f180039h).getValue();
                        C87412m.m108593f(value11, "<get-rewardNameTv>(...)");
                        ((TextView) value11).setText((px22 == null || (aq34 = px22.f184913e) == null) ? r102 : aq34.f182138g);
                        eVar.mo88336e3().setVisibility(8);
                        eVar.mo88339i3((px22 == null || (aq33 = px22.f184913e) == null || (str6 = aq33.f182139h) == null) ? str13 : str6, (px22 == null || (aq32 = px22.f184913e) == null || !aq32.f182135d) ? false : true);
                        Object value12 = ((C36570n) eVar.f180044p).getValue();
                        C87412m.m108593f(value12, "<get-anchorNameTv>(...)");
                        TextView textView5 = (TextView) value12;
                        if (px22 == null || (ex22 = px22.f184914f) == null || (str4 = ex22.f133161d) == null) {
                            str4 = eVar.f180026B;
                        }
                        textView5.setText(str4);
                        Object value13 = ((C36570n) eVar.f180045q).getValue();
                        C87412m.m108593f(value13, "<get-lotteryCountTv>(...)");
                        ((TextView) value13).setText((px22 == null || (fx24 = px22.f184915g) == null) ? r102 : Integer.valueOf(fx24.f183252e).toString());
                        Object value14 = ((C36570n) eVar.f180046r).getValue();
                        C87412m.m108593f(value14, str);
                        ((TextView) value14).setText((px22 == null || (fx23 = px22.f184915g) == null) ? r102 : fx23.f183253f);
                        Object value15 = ((C36570n) eVar.f180047s).getValue();
                        C87412m.m108593f(value15, str2);
                        TextView textView6 = (TextView) value15;
                        if (px22 == null || (fx22 = px22.f184915g) == null) {
                            str5 = str18;
                            j = 0;
                        } else {
                            j = (long) fx22.f183251d;
                            str5 = str18;
                        }
                        textView6.setText(C72715f.m85111d(str5, j));
                    }
                } else {
                    C63463e.m74808c3(eVar, o012.f138882q);
                }
                return C13598b0.f38549a;
            }
            return null;
        }
        C76912y0.makeText((Context) this.f180083a.getActivity(), (CharSequence) this.f180083a.getActivity().getString(C0966R.string.f8098a3), 0).show();
        return C13598b0.f38549a;
    }
}
