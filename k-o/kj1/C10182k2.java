package kj1;

import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import d60.C58124b;
import gy3.C87412m;
import lj1.C10535c;
import lj1.C10536d;

/* renamed from: kj1.k2 */
public final class C10182k2 extends C10535c {

    /* renamed from: h */
    public final String f31146h = "audience.more.morefunction.gifteffect";

    /* renamed from: kj1.k2$a */
    public static final class C10183a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C10125e1 f31147a;

        /* renamed from: b */
        public final /* synthetic */ C10182k2 f31148b;

        /* renamed from: c */
        public final /* synthetic */ MMSwitchBtn f31149c;

        public C10183a(C10125e1 e1Var, C10182k2 k2Var, MMSwitchBtn mMSwitchBtn) {
            this.f31147a = e1Var;
            this.f31148b = k2Var;
            this.f31149c = mMSwitchBtn;
        }

        public final void onStatusChange(boolean z) {
            long j = ((C55001u) this.f31147a.mo10534b(C55001u.class)).f154420q.f182392d;
            if (z) {
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("FINDER_LIVE_MMKV");
                if (mmkv != null) {
                    mmkv.putLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", 0);
                }
            } else {
                MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("FINDER_LIVE_MMKV");
                if (mmkv2 != null) {
                    mmkv2.putLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", j);
                }
                this.f31147a.mo10539g(C58124b.C58125b.LIVE_EVENT_HIDE_FULL_SCREEN_GIFT, (Bundle) null);
            }
            C10182k2.m10100p(this.f31147a, this.f31149c, z);
            ((C54991o) this.f31147a.mo10534b(C54991o.class)).f154391y3 = !z;
            C10536d.m10457e(this.f31148b, false, 1, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10182k2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: p */
    public static final void m10100p(C10125e1 e1Var, MMSwitchBtn mMSwitchBtn, boolean z) {
        String string = e1Var.f30985d.getString(C0966R.string.n85);
        C87412m.m108593f(string, "context.getString(R.stri….finder_live_gift_effect)");
        if (z) {
            mMSwitchBtn.setContentDescription(e1Var.f30985d.getString(C0966R.string.nef, new Object[]{string}));
            return;
        }
        mMSwitchBtn.setContentDescription(e1Var.f30985d.getString(C0966R.string.nee, new Object[]{string}));
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31146h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) v0Var.f18463f.findViewById(C0966R.C0970id.f359331o43);
        mMSwitchBtn.setCheck(!((C54991o) e1Var.mo10534b(C54991o.class)).f154391y3);
        C10119d1.f30943a.mo10530a(4, 0, 2, 1);
        m10100p(e1Var, mMSwitchBtn, mMSwitchBtn.f220433y);
        mMSwitchBtn.setSwitchListener(new C10183a(e1Var, this, mMSwitchBtn));
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.olq);
    }
}
