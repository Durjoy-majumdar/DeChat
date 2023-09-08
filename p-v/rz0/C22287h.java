package rz0;

import android.text.TextUtils;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import java.util.ArrayList;
import oz0.C47407b;
import pz0.C47725q;

/* renamed from: rz0.h */
public class C22287h extends C22280a {
    public C22287h(MMActivity mMActivity) {
        super(mMActivity);
    }

    /* renamed from: a */
    public boolean mo35427a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo35428b() {
        return false;
    }

    /* renamed from: d */
    public boolean mo35430d() {
        return false;
    }

    /* renamed from: f */
    public boolean mo35432f() {
        return false;
    }

    /* renamed from: k */
    public boolean mo35437k() {
        return this.f63174d;
    }

    /* renamed from: l */
    public boolean mo35438l() {
        ArrayList<C47725q> h = C47407b.m52745h(this.f63173c.mo23270R0());
        CardDetailUIContoller.C18575g gVar = this.f63172b;
        if ((!gVar.f51828g || gVar.f51822a == 4) && !TextUtils.isEmpty(this.f63173c.mo23280e())) {
            return true;
        }
        return (this.f63172b.f51828g && h.size() > 0) || (!TextUtils.isEmpty(this.f63173c.mo23280e()) && mo35443q());
    }

    /* renamed from: n */
    public boolean mo35440n() {
        return !this.f63174d && this.f63173c.mo23264L0().f64122S == 1;
    }

    /* renamed from: o */
    public boolean mo35441o() {
        if (!super.mo35441o() && !mo35440n()) {
            return this.f63173c.mo23272T0() && this.f63174d;
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo35442p() {
        return false;
    }

    /* renamed from: q */
    public boolean mo35443q() {
        return this.f63172b.f51822a == 3;
    }

    /* renamed from: r */
    public boolean mo35444r() {
        return this.f63174d && super.mo35444r();
    }

    /* renamed from: x */
    public void mo35450x() {
        super.mo35450x();
    }
}
