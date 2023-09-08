package p815hi;

import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.roomsdk.model.factory.C72941b;
import com.tencent.p014mm.roomsdk.model.factory.RoomOpLogCallbackFactory;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import java.util.List;
import mg3.C47024a;
import og3.C77007c;
import p203mi.C47040k;
import p203mi.C47042m;
import p203mi.C47043n;
import p203mi.C47046q;
import p203mi.C47047s;
import p203mi.C47050t;
import p203mi.C47051u;
import p530fx.C45818b;
import p530fx.C45819c;
import p530fx.C45820d;
import p530fx.C75818e;
import p818oi.C47380a;
import p818oi.C47381b;
import tc0.C48627f;
import tc0.C77885p;
import te3.C49351ey2;
import te3.C49487fy2;
import te3.C49916iy2;
import te3.C51163rv3;

/* renamed from: hi.a */
public class C46071a implements C77007c {
    /* renamed from: a */
    public C72940a mo71490a(String str, List<String> list, int i) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47043n(str, list, i);
        return (C72940a) wc02;
    }

    /* renamed from: b */
    public C72940a mo71491b(String str, boolean z) {
        if (z) {
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C48627f(str));
        }
        C75818e qd = ((C45819c) C86312j.m106911c(C45819c.class)).mo71193qd(true);
        qd.mo100870b(new C47381b((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), str));
        return (C72940a) qd;
    }

    /* renamed from: c */
    public C72940a mo71492c(String str, int i) {
        C45820d SH = ((C45819c) C86312j.m106911c(C45819c.class)).mo71190SH(true);
        ((RoomOpLogCallbackFactory) SH).f212606f = new C47380a(str, i);
        return (C72940a) SH;
    }

    /* renamed from: d */
    public void mo71493d(C72996z1 z1Var, boolean z) {
        if (z) {
            C45628s0.m50758W(z1Var);
        } else {
            C45628s0.m50761Z(z1Var, true);
        }
    }

    /* renamed from: e */
    public C72940a mo71494e(String str, List<String> list) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47042m(str, list, (String) null, (String) null);
        return (C72940a) wc02;
    }

    /* renamed from: f */
    public C72940a mo71495f(String str, String str2, String str3) {
        C45820d SH = ((C45819c) C86312j.m106911c(C45819c.class)).mo71190SH(true);
        C49351ey2 ey22 = new C49351ey2();
        ey22.f133171d = str;
        ey22.f133172e = str2;
        ey22.f133173f = Util.nullAsNil(str3);
        ((RoomOpLogCallbackFactory) SH).f212606f = new C32330n(48, ey22);
        return (C72940a) SH;
    }

    /* renamed from: g */
    public C72940a mo71496g(String str, List<String> list, String str2, String str3) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47042m(str, list, str2, str3);
        return (C72940a) wc02;
    }

    /* renamed from: h */
    public C72940a mo71497h(String str, List<String> list, int i, Object obj) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47050t(str, list, i, obj);
        return (C72940a) wc02;
    }

    /* renamed from: i */
    public C72940a mo71498i(String str, String str2) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47051u(str, str2);
        return (C72940a) wc02;
    }

    /* renamed from: j */
    public C72940a mo71499j(String str, String str2, boolean z) {
        int i = 1;
        C45820d SH = ((C45819c) C86312j.m106911c(C45819c.class)).mo71190SH(true);
        C49487fy2 fy22 = new C49487fy2();
        fy22.f133742d = str;
        fy22.f133743e = str2;
        fy22.f133744f = 1;
        if (!z) {
            i = 2;
        }
        fy22.f133745g = i;
        ((RoomOpLogCallbackFactory) SH).f212606f = new C32330n(49, fy22);
        return (C72940a) SH;
    }

    /* renamed from: k */
    public C47024a mo71500k(int i) {
        return ((C45819c) C86312j.m106911c(C45819c.class)).bl0(i);
    }

    /* renamed from: l */
    public C72940a mo71501l(String str, int i) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47047s(str, i);
        return (C72940a) wc02;
    }

    /* renamed from: m */
    public C72940a mo71502m(String str, String str2) {
        C45820d SH = ((C45819c) C86312j.m106911c(C45819c.class)).mo71190SH(true);
        C49916iy2 iy22 = new C49916iy2();
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = Util.nullAsNil(str);
        rv32.f141176e = true;
        iy22.f135754d = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = Util.nullAsNil(str2);
        rv33.f141176e = true;
        iy22.f135755e = rv33;
        ((RoomOpLogCallbackFactory) SH).f212606f = new C32330n(27, iy22);
        return (C72940a) SH;
    }

    /* renamed from: n */
    public C72940a mo71503n(String str, List<String> list, String str2, Object obj) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47040k(str, list, str2, obj);
        return (C72940a) wc02;
    }

    /* renamed from: o */
    public C72940a mo71504o(String str) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47046q(str);
        return (C72940a) wc02;
    }

    /* renamed from: p */
    public C72940a mo71505p(String str, List<String> list, int i, String str2, C72963f4 f4Var) {
        C45818b wc02 = ((C45819c) C86312j.m106911c(C45819c.class)).wc0(true);
        ((C72941b) wc02).f212617f = new C47050t(str, list, i, str2, f4Var);
        return (C72940a) wc02;
    }

    /* renamed from: q */
    public C72940a mo71506q(String str, String str2) {
        C45820d SH = ((C45819c) C86312j.m106911c(C45819c.class)).mo71190SH(true);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
            z1Var.mo62860K2(str2);
            ((RoomOpLogCallbackFactory) SH).f212606f = new C32330n(2, C45628s0.m50786m(z1Var));
        }
        return (C72940a) SH;
    }
}
