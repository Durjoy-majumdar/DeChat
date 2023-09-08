package rz0;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import eb0.C75592q0;
import wz0.C22945n;

/* renamed from: rz0.a */
public class C22280a implements C22286g {

    /* renamed from: a */
    public MMActivity f63171a;

    /* renamed from: b */
    public CardDetailUIContoller.C18575g f63172b;

    /* renamed from: c */
    public C20483c f63173c;

    /* renamed from: d */
    public boolean f63174d = false;

    /* renamed from: e */
    public boolean f63175e = false;

    /* renamed from: f */
    public boolean f63176f = false;

    /* renamed from: g */
    public boolean f63177g = false;

    /* renamed from: h */
    public boolean f63178h = false;

    /* renamed from: i */
    public boolean f63179i = false;

    /* renamed from: j */
    public boolean f63180j = false;

    /* renamed from: k */
    public boolean f63181k = false;

    /* renamed from: l */
    public boolean f63182l = false;

    /* renamed from: m */
    public boolean f63183m = false;

    public C22280a(MMActivity mMActivity) {
        this.f63171a = mMActivity;
    }

    /* renamed from: a */
    public boolean mo35427a() {
        return ((TextUtils.isEmpty(this.f63173c.mo23263J0().f63950o) ^ true) && mo35449w() && mo35448v()) || this.f63174d;
    }

    /* renamed from: b */
    public boolean mo35428b() {
        return this.f63173c.mo23264L0().f64111I != null;
    }

    /* renamed from: c */
    public boolean mo35429c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo35430d() {
        return this.f63173c.mo23263J0().f63959x != null && !TextUtils.isEmpty(this.f63173c.mo23263J0().f63959x.f63884d);
    }

    /* renamed from: e */
    public boolean mo35431e() {
        if (this.f63173c.mo23263J0().f63952q == null || this.f63173c.mo23263J0().f63952q.size() < 1) {
            return false;
        }
        return (mo35449w() && mo35448v()) || this.f63174d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = r2.f63172b.f51822a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35432f() {
        /*
            r2 = this;
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r0 = r2.f63172b
            int r0 = r0.f51822a
            r1 = 6
            if (r0 != r1) goto L_0x0017
            dz0.c r0 = r2.f63173c
            boolean r0 = r0.mo23296v1()
            if (r0 == 0) goto L_0x002d
            dz0.c r0 = r2.f63173c
            boolean r0 = r0.mo23261F()
            if (r0 != 0) goto L_0x002d
        L_0x0017:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r0 = r2.f63172b
            int r0 = r0.f51822a
            r1 = 5
            if (r0 == r1) goto L_0x002d
            r1 = 23
            if (r0 != r1) goto L_0x002b
            dz0.c r0 = r2.f63173c
            boolean r0 = r0.mo23265N()
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = 0
            goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rz0.C22280a.mo35432f():boolean");
    }

    /* renamed from: g */
    public boolean mo35433g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo35434h() {
        return this instanceof C22281b;
    }

    /* renamed from: i */
    public boolean mo35435i() {
        return this.f63175e;
    }

    /* renamed from: j */
    public boolean mo35436j() {
        return !this.f63173c.mo23284h();
    }

    /* renamed from: k */
    public boolean mo35437k() {
        return true;
    }

    /* renamed from: l */
    public boolean mo35438l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo35439m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo35440n() {
        return false;
    }

    /* renamed from: o */
    public boolean mo35441o() {
        return !TextUtils.isEmpty(this.f63173c.mo23264L0().f64108F);
    }

    /* renamed from: p */
    public boolean mo35442p() {
        return !this.f63173c.mo23296v1();
    }

    /* renamed from: q */
    public boolean mo35443q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo35444r() {
        return this.f63173c.mo23264L0().f64115M != null && this.f63173c.mo23264L0().f64115M.f64223g != null && this.f63173c.mo23264L0().f64115M.f64223g.size() > 0 && !TextUtils.isEmpty(this.f63173c.mo23264L0().f64115M.f64223g.get(0));
    }

    /* renamed from: s */
    public String mo35445s() {
        return !TextUtils.isEmpty(this.f63173c.mo23264L0().f64124T) ? this.f63173c.mo23264L0().f64124T : this.f63173c.mo23263J0().f63953r == 0 ? this.f63171a.getString(C0966R.string.b05) : this.f63173c.mo23263J0().f63954s == 0 ? !TextUtils.isEmpty(this.f63173c.mo23264L0().f64158z) ? this.f63173c.mo23264L0().f64158z : this.f63171a.getString(C0966R.string.avt) : "";
    }

    /* renamed from: t */
    public boolean mo35446t() {
        return !this.f63173c.mo23295v0() && (C22945n.m27021u(this.f63172b.f51822a) || C22945n.m27023w(this.f63172b.f51822a) || this.f63172b.f51822a == 23);
    }

    /* renamed from: u */
    public boolean mo35447u() {
        return !this.f63173c.mo23261F() && this.f63172b.f51822a == 6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = r2.f63172b.f51822a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35448v() {
        /*
            r2 = this;
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r0 = r2.f63172b
            int r0 = r0.f51822a
            r1 = 3
            if (r0 == r1) goto L_0x0025
            r1 = 6
            if (r0 != r1) goto L_0x0014
            dz0.c r0 = r2.f63173c
            te3.hn r0 = r0.mo23263J0()
            int r0 = r0.f63949n
            if (r0 == 0) goto L_0x0025
        L_0x0014:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r0 = r2.f63172b
            int r0 = r0.f51822a
            r1 = 4
            if (r0 == r1) goto L_0x0025
            r1 = 5
            if (r0 == r1) goto L_0x0025
            r1 = 15
            if (r0 != r1) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rz0.C22280a.mo35448v():boolean");
    }

    /* renamed from: w */
    public boolean mo35449w() {
        return this.f63173c.mo23263J0().f63942d == 0 || this.f63173c.mo23263J0().f63942d == 1 || this.f63173c.mo23263J0().f63942d == 2;
    }

    /* renamed from: x */
    public void mo35450x() {
        Log.m105924i("MicroMsg.CardBaseShowLogic", "updateAcceptState()");
        if (!C22945n.m27021u(this.f63172b.f51822a) && !C22945n.m27023w(this.f63172b.f51822a)) {
            int i = this.f63172b.f51822a;
            if (i == 6) {
                if (this.f63173c.mo23261F()) {
                    this.f63175e = true;
                    this.f63176f = true;
                    this.f63179i = false;
                } else if (this.f63173c.mo23296v1()) {
                    this.f63182l = true;
                    this.f63179i = true;
                    this.f63177g = true;
                    this.f63178h = true;
                } else {
                    this.f63175e = false;
                    this.f63176f = false;
                    this.f63179i = false;
                    this.f63177g = true;
                }
            } else if (C22945n.m27022v(i)) {
                this.f63175e = false;
                this.f63176f = false;
                this.f63177g = true;
                if (this.f63173c.mo23296v1()) {
                    this.f63182l = true;
                    this.f63179i = true;
                    this.f63178h = true;
                } else {
                    this.f63183m = true;
                }
            } else if (this.f63172b.f51822a == 23) {
                if (this.f63173c.mo23295v0()) {
                    this.f63175e = true;
                    this.f63176f = true;
                    this.f63179i = false;
                    this.f63180j = true;
                } else {
                    this.f63175e = true;
                    this.f63176f = false;
                    this.f63179i = false;
                    this.f63180j = true;
                }
                if (!TextUtils.isEmpty(this.f63172b.f51825d) && !this.f63172b.f51825d.equals(C75592q0.m90789s()) && !this.f63173c.mo23265N()) {
                    Log.m105924i("MicroMsg.CardBaseShowLogic", " detail page");
                    this.f63175e = false;
                    this.f63176f = false;
                    this.f63177g = true;
                    if (this.f63173c.mo23296v1()) {
                        this.f63182l = true;
                        this.f63179i = true;
                        this.f63178h = true;
                    }
                }
            }
        } else if (this.f63173c.mo23295v0()) {
            this.f63175e = true;
            this.f63176f = true;
            this.f63181k = true;
            this.f63179i = true;
            this.f63180j = true;
        } else if (!this.f63173c.mo23295v0()) {
            this.f63175e = true;
            this.f63176f = false;
            if (this.f63173c.mo23269Q0()) {
                this.f63182l = true;
                this.f63179i = true;
                this.f63178h = true;
            } else {
                this.f63179i = false;
            }
            this.f63180j = true;
        } else {
            this.f63175e = false;
            this.f63176f = false;
            this.f63179i = false;
        }
        if (this.f63173c.mo23269Q0()) {
            this.f63175e = false;
            this.f63176f = false;
            Log.m105924i("MicroMsg.CardBaseShowLogic", "need direct jump!");
        } else {
            Log.m105924i("MicroMsg.CardBaseShowLogic", "not need direct jump!");
        }
        if (this.f63174d) {
            this.f63175e = false;
            this.f63176f = false;
            Log.m105924i("MicroMsg.CardBaseShowLogic", "updateAcceptView to gone!");
        } else if (!this.f63175e) {
            this.f63174d = true;
            Log.m105924i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is true");
        } else {
            this.f63174d = false;
            Log.m105924i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is false!");
        }
        Log.m105924i("MicroMsg.CardBaseShowLogic", "mIsAcceptedCard:" + this.f63174d);
    }
}
