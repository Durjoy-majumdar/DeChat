package rg0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import p214om.C11502f;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: rg0.g */
public class C13002g {
    /* renamed from: a */
    public static String m12461a(Context context) {
        return context == null ? ChannelUtil.isNokiaAol ? MMApplicationContext.getContext().getString(C0966R.string.i_r) : MMApplicationContext.getContext().getString(C0966R.string.i_q) : ChannelUtil.isNokiaAol ? context.getString(C0966R.string.i_r) : context.getString(C0966R.string.i_q);
    }

    /* renamed from: b */
    public static void m12462b(boolean z, boolean z2) {
        if (C86709a0.m107522a()) {
            int p = C75592q0.m90786p();
            C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(z ? p | 16384 : p & -16385));
            if (z2) {
                C64266br1 br12 = new C64266br1();
                br12.f182324d = 28;
                br12.f182325e = z ? 1 : 2;
                ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
                ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
            }
        }
    }
}
