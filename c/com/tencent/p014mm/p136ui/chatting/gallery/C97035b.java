package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import hd0.C98408n0;
import l03.C99276a;
import mk3.C99909e;
import p682rz.C101491u;

/* renamed from: com.tencent.mm.ui.chatting.gallery.b */
public final class C97035b implements C99276a {

    /* renamed from: a */
    public final C72963f4 f284643a;

    /* renamed from: b */
    public final String f284644b;

    /* renamed from: c */
    public final boolean f284645c;

    /* renamed from: d */
    public long f284646d;

    public C97035b(C72963f4 f4Var, String str, boolean z) {
        this.f284643a = f4Var;
        this.f284644b = str;
        this.f284645c = z;
    }

    /* renamed from: b */
    public void mo135882b() {
        C115669n.INSTANCE.idkeyStat(354, 1, 1, false);
    }

    /* renamed from: c */
    public void mo135883c(long j) {
        C98408n0 Zd;
        Class cls = C101491u.class;
        if (this.f284644b != null && (Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(this.f284644b)) != null) {
            if (this.f284645c) {
                C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
                if (Zd2 != null) {
                    this.f284646d = (long) Zd2.f288558e;
                    return;
                }
                return;
            }
            this.f284646d = (long) Zd.f288558e;
        }
    }

    /* renamed from: g */
    public void mo135884g() {
        C98408n0 Zd;
        Class cls = C101491u.class;
        if (this.f284644b != null && (Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(this.f284644b)) != null) {
            if (this.f284645c) {
                C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
                if (Zd2 != null) {
                    C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd2.f288558e) - this.f284646d);
                    return;
                }
                return;
            }
            C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd.f288558e) - this.f284646d);
        }
    }

    /* renamed from: h */
    public void mo135885h() {
        C115669n.INSTANCE.idkeyStat(354, 10, 1, false);
    }

    /* renamed from: i */
    public void mo135886i(int i) {
        C98408n0 Zd;
        Class cls = C101491u.class;
        C115669n.INSTANCE.idkeyStat(354, 9, 1, false);
        if (this.f284644b != null && (Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(this.f284644b)) != null) {
            if (this.f284645c) {
                C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
                if (Zd2 != null) {
                    C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd2.f288558e) - this.f284646d);
                    return;
                }
                return;
            }
            C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd.f288558e) - this.f284646d);
        }
    }

    /* renamed from: l */
    public void mo135887l() {
        C115669n.INSTANCE.idkeyStat(354, 134, 1, false);
    }

    /* renamed from: m */
    public void mo135888m(long j) {
    }

    /* renamed from: o */
    public void mo135889o(long j, long j2) {
        C115669n.INSTANCE.idkeyStat(354, 5, 1, false);
    }

    /* renamed from: p */
    public void mo135890p() {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(354, 24, 1, false);
        nVar.mo160131h(13836, 303, Long.valueOf(Util.nowSecond()), "");
    }

    /* renamed from: r */
    public void mo135891r() {
        C115669n.INSTANCE.idkeyStat(354, 6, 1, false);
    }

    /* renamed from: s */
    public void mo135892s() {
        C98408n0 Zd;
        Class cls = C101491u.class;
        C115669n.INSTANCE.idkeyStat(354, 26, 1, false);
        if (this.f284644b != null && (Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(this.f284644b)) != null) {
            if (this.f284645c) {
                C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
                if (Zd2 != null) {
                    C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd2.f288558e) - this.f284646d);
                    return;
                }
                return;
            }
            C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd.f288558e) - this.f284646d);
        }
    }

    /* renamed from: t */
    public void mo135893t() {
        C115669n.INSTANCE.idkeyStat(354, 7, 1, false);
    }

    /* renamed from: u */
    public void mo135894u() {
        C98408n0 Zd;
        Class cls = C101491u.class;
        C115669n.INSTANCE.idkeyStat(354, 2, 1, false);
        if (this.f284644b != null && (Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(this.f284644b)) != null) {
            if (this.f284645c) {
                C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
                if (Zd2 != null && Zd2.f288562i != 199) {
                    C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd2.f288558e) - this.f284646d);
                }
            } else if (Zd.f288562i != 199) {
                C99909e.f292754a.mo139263a(this.f284643a, Zd.mo137700d(), this.f284645c, ((long) Zd.f288558e) - this.f284646d);
            }
        }
    }

    /* renamed from: x */
    public void mo135895x() {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(354, 8, 1, false);
        nVar.mo160131h(13836, 302, Long.valueOf(Util.nowSecond()), "");
    }
}
