package ej1;

import android.content.Context;
import cj1.C0542g2;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import fj1.C45795b;
import gy3.C87412m;
import ok1.C62042e;
import qk1.C12806i0;
import te3.C49611gu0;
import te3.C50767p11;
import te3.C52013xs0;

/* renamed from: ej1.q */
public final class C7709q extends C7690k0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7709q(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveBuContext");
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        C50767p11 p112;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        boolean z = o5Var instanceof C0542g2;
        String str = null;
        if (z) {
            Object q = o5Var.mo563q();
            C49611gu0 gu02 = q instanceof C49611gu0 ? (C49611gu0) q : null;
            if (!(gu02 == null || (p112 = gu02.f134273d) == null)) {
                str = p112.f139515o;
            }
        } else {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dyb);
        }
        String l0 = C62042e.m72808l0(C62042e.f176370a, o5Var.mo571e(), o5Var.mo573g(), false, 4, (Object) null);
        String string = context.getString(C0966R.string.dpo, new Object[]{str});
        C87412m.m108593f(string, "context.getString(R.stri…_fans_club_msg, giftName)");
        String str2 = l0 + string;
        C75375u uVar = new C75375u(context.getString(C0966R.string.dge, new Object[]{str2}));
        uVar.mo105705b(mo8809m(), 0, mo14624e().length() + 0, 33);
        mo8810n(context, aVar, uVar);
        Log.m105924i("CommentItemJoinFansClub", "onBindJoinFansClubMsg:" + z + ",sysMsg:" + str2 + ',');
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0542g2(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20050;
    }
}
