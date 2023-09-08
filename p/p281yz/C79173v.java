package p281yz;

import a63.C67008a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import b63.C67192l0;
import b63.C67198p0;
import b63.C67205s0;
import b63.C67212y;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69271w1;
import com.tencent.p014mm.plugin.luckymoney.model.C69272x1;
import com.tencent.p014mm.plugin.remittance.model.C42837c;
import com.tencent.p014mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86301e;
import di3.C86312j;
import e63.C31431a;
import e63.C31432e;
import e63.C31433f;
import e63.C31434g;
import e63.C31435k;
import e63.C45550j;
import e63.C75557c;
import e63.C75559d;
import e63.C75562i;
import e63.C75563l;
import eb0.C75592q0;
import eb0.C86484b;
import ei3.C86522b;
import f32.C75674c;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76332j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import n63.C76831b;
import nr3.C35015b;
import nr3.C35016g;
import o63.C47331b;
import ob0.C117747y;
import ob0.C89132b;
import p216op.C47389f;
import p216op.C47391h;
import p287zz.C79441d;
import p287zz.C79442f;
import p53.C47430c;
import te3.C50994qp3;
import ub3.C78144b;
import w32.C78512f;

@C86522b(dependencies = {C79171t.class})
/* renamed from: yz.v */
public class C79173v extends C86301e implements C79442f {

    /* renamed from: d */
    public volatile C67212y f232472d = new C67212y();

    /* renamed from: e */
    public C35016g<C67205s0> f232473e = new C35016g<>(new C79176e(this));

    /* renamed from: f */
    public C35016g<C67198p0> f232474f = new C35016g<>(new C79177f(this));

    /* renamed from: g */
    public C35016g<C75563l> f232475g = new C35016g<>(new C79178g(this));

    /* renamed from: h */
    public C35016g<C75559d> f232476h = new C35016g<>(new C79179h(this));

    /* renamed from: i */
    public C35016g<C75557c> f232477i = new C35016g<>(new C79180i(this));

    /* renamed from: j */
    public C35016g<C31431a> f232478j = new C35016g<>(new C39280j(this));

    /* renamed from: n */
    public C35016g<C31434g> f232479n = new C35016g<>(new C39281k(this));

    /* renamed from: o */
    public C35016g<C31432e> f232480o = new C35016g<>(new C39282l(this));

    /* renamed from: p */
    public C35016g<C31433f> f232481p = new C35016g<>(new C39283m(this));

    /* renamed from: q */
    public C35016g<C31435k> f232482q = new C35016g<>(new C39279a(this));

    /* renamed from: r */
    public C35016g<C45550j> f232483r = new C35016g<>(new C53660b(this));

    /* renamed from: s */
    public C35016g<C75562i> f232484s = new C35016g<>(new C79174c(this));

    /* renamed from: t */
    public C67008a f232485t = new C67008a();

    /* renamed from: u */
    public String f232486u = "";

    /* renamed from: yz.v$a */
    public class C39279a implements C35015b<C31435k> {
        public C39279a(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C31435k(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$j */
    public class C39280j implements C35015b<C31431a> {
        public C39280j(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C31431a(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$k */
    public class C39281k implements C35015b<C31434g> {
        public C39281k(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C31434g(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$l */
    public class C39282l implements C35015b<C31432e> {
        public C39282l(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C31432e(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$m */
    public class C39283m implements C35015b<C31433f> {
        public C39283m(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C31433f(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$b */
    public class C53660b implements C35015b<C45550j> {
        public C53660b(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C45550j(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$c */
    public class C79174c implements C35015b<C75562i> {
        public C79174c(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C75562i(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$d */
    public class C79175d implements C78144b.C78145a {

        /* renamed from: a */
        public final /* synthetic */ C79442f.C79443a f232487a;

        public C79175d(C79173v vVar, C79442f.C79443a aVar) {
            this.f232487a = aVar;
        }
    }

    /* renamed from: yz.v$e */
    public class C79176e implements C35015b<C67205s0> {
        public C79176e(C79173v vVar) {
        }

        public Object get() {
            return new C67205s0();
        }
    }

    /* renamed from: yz.v$f */
    public class C79177f implements C35015b<C67198p0> {
        public C79177f(C79173v vVar) {
        }

        public Object get() {
            return new C67198p0();
        }
    }

    /* renamed from: yz.v$g */
    public class C79178g implements C35015b<C75563l> {
        public C79178g(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C75563l(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$h */
    public class C79179h implements C35015b<C75559d> {
        public C79179h(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C75559d(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: yz.v$i */
    public class C79180i implements C35015b<C75557c> {
        public C79180i(C79173v vVar) {
        }

        public Object get() {
            C86709a0.m107528h();
            return new C75557c(C86709a0.m107535s().f251811i);
        }
    }

    public C45550j Ax0() {
        if (C86709a0.m107522a()) {
            return this.f232483r.mo59825a();
        }
        throw new C86484b();
    }

    /* renamed from: BN */
    public void mo109149BN() {
        C86709a0.m107529k().f251779b.mo123460f(new C47430c());
    }

    public C67192l0 Bx0() {
        if (C86709a0.m107522a()) {
            C79171t tVar = (C79171t) C86312j.m106911c(C79171t.class);
            tVar.requireAccountInitialized();
            return tVar.f232471d;
        }
        throw new C86484b();
    }

    /* renamed from: Cv */
    public C89132b mo109151Cv(String str, String str2, String str3) {
        return new C42837c(str, str2, str3);
    }

    public C67198p0 Cx0() {
        if (C86709a0.m107522a()) {
            return this.f232474f.mo59825a();
        }
        throw new C86484b();
    }

    /* renamed from: DP */
    public void mo109153DP(int i, String str) {
        C86709a0.m107524d().mo123460f(new C69272x1("v1.0", i, str));
    }

    public C75563l Dx0() {
        if (C86709a0.m107522a()) {
            return this.f232475g.mo59825a();
        }
        throw new C86484b();
    }

    public Object Ev0(C72994y1.C72995a aVar) {
        return ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(aVar, (Object) null);
    }

    public C67205s0 Ex0() {
        requireAccountInitialized();
        return this.f232473e.mo59825a();
    }

    public C31432e Fx0() {
        if (C86709a0.m107522a()) {
            return this.f232480o.mo59825a();
        }
        throw new C86484b();
    }

    public Object G40(String str, Object obj) {
        C76332j jVar;
        synchronized (C76332j.class) {
            jVar = C76332j.C76334b.f223590a;
        }
        return jVar.f223589a.containsKey(str) ? jVar.f223589a.get(str) : obj;
    }

    /* renamed from: GK */
    public void mo109159GK(C72994y1.C72995a aVar, Object obj) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(aVar, obj);
    }

    public C31434g Gx0() {
        if (C86709a0.m107522a()) {
            return this.f232479n.mo59825a();
        }
        throw new C86484b();
    }

    public C31435k Hx0() {
        if (C86709a0.m107522a()) {
            return this.f232482q.mo59825a();
        }
        throw new C86484b();
    }

    public boolean Ix0() {
        boolean x = C75592q0.m90794x();
        Log.m105925i("MicroMsg.WalletCoreService", "isSupportMobileRemit() isCN:%s mobileRemitSwitch:%s", Boolean.valueOf(x), 1);
        return x;
    }

    public C79441d J70() {
        return new C76831b();
    }

    /* renamed from: Y9 */
    public void mo109164Y9(Context context, HashMap<String, String> hashMap, C79442f.C79443a aVar) {
        ((C78144b) C86312j.m106911c(C78144b.class)).ia0(context, hashMap, new C79175d(this, aVar));
    }

    /* renamed from: Z4 */
    public void mo109165Z4() {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107982Z4();
    }

    /* renamed from: fE */
    public void mo109166fE(int i, int i2, String str) {
        C86709a0.m107524d().mo123460f(new C69271w1(i, "v1.0", i2, str));
    }

    /* renamed from: hy */
    public void mo109167hy(int i) {
        C86709a0.m107529k().f251779b.mo123460f(new C47331b(i));
    }

    public void ji0(String str) {
        C86709a0.m107524d().mo123460f(new C78512f(str));
    }

    public TextAppearanceSpan n20(Context context, String str, int i, int i2, ColorStateList colorStateList, ColorStateList colorStateList2) {
        WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new WcPayTextApppearanceSpan(str, i, i2, colorStateList, colorStateList2);
        wcPayTextApppearanceSpan.f210885d = C75228t.m90274w(context, 4);
        return wcPayTextApppearanceSpan;
    }

    public void onAccountInitialized(Context context) {
        Log.m105924i("MicroMsg.WalletCoreService", "onAccountPostReset subcore walletCore");
        Ex0().mo91344z();
    }

    public void onAccountReleased(Context context) {
        Ex0().mo91312B();
        C67198p0 Cx0 = Cx0();
        Cx0.f192927b = null;
        Cx0.f192926a.clear();
        Cx0.f192926a = new ArrayList<>();
    }

    public void onCreate(Context context) {
    }

    /* renamed from: rQ */
    public void mo109170rQ(boolean z) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119990a(z);
    }

    public String sb0(Long l) {
        C50994qp3 qp32;
        if (l == null) {
            Map<String, C69158a0> map = C75674c.f222272a;
            qp32 = null;
        } else {
            qp32 = (C50994qp3) ((HashMap) C75674c.f222274c).get(l);
        }
        if (qp32 == null) {
            return null;
        }
        return qp32.f140447f;
    }

    public void vx0(Context context, Intent intent) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC;
        if (intent == null) {
            intent = new Intent();
        }
        if (C75592q0.m90753A()) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
            intent.setFlags(536870912);
            Log.m105924i("MicroMsg.WalletCoreService", "entryWalletIndexPage wallet type is h5,jump to ibg");
            C88144b.m109791i(context, "wallet_core", ".ui.ibg.WalletIbgAdapterUI", intent, (Bundle) null);
        } else if (C75592q0.m90754B()) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
            intent.setFlags(536870912);
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_walletv2_oversea_open_config, false);
            Log.m105925i("MicroMsg.WalletCoreService", "walletMall oversea switch is ：%s", Boolean.valueOf(wf));
            if (wf) {
                C88144b.m109791i(context, "mall", ".ui.MallIndexOSUIv2", intent, (Bundle) null);
            } else {
                C88144b.m109791i(context, "mall", ".ui.MallIndexOSUI", intent, (Bundle) null);
            }
        } else {
            Log.m105924i("MicroMsg.WalletCoreService", "entryWalletIndexPage wallet type is native");
            intent.setFlags(536870912);
            Log.m105925i("MicroMsg.WalletCoreService", " walletMallV2 switch is ：%s", Boolean.TRUE);
            C88144b.m109791i(context, "mall", ".ui.MallIndexUIv2", intent, (Bundle) null);
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121147n()) {
                C47391h TD = ((C47389f) C86312j.m106911c(C47389f.class)).mo72332TD(11);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f((C117747y) TD);
            }
        }
    }

    /* renamed from: w1 */
    public void mo109174w1(String str) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107986w1(str);
    }

    public C75557c wx0() {
        if (C86709a0.m107522a()) {
            return this.f232477i.mo59825a();
        }
        throw new C86484b();
    }

    public C75559d xx0() {
        if (C86709a0.m107522a()) {
            return this.f232476h.mo59825a();
        }
        throw new C86484b();
    }

    public C31431a yx0() {
        if (C86709a0.m107522a()) {
            return this.f232478j.mo59825a();
        }
        throw new C86484b();
    }

    /* renamed from: zx0 */
    public C75562i mo109172tc() {
        if (C86709a0.m107522a()) {
            return this.f232484s.mo59825a();
        }
        throw new C86484b();
    }
}
