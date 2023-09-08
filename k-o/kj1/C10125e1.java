package kj1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53953u0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import androidx.lifecycle.C39622i0;
import b50.C54421g;
import c50.C54655b;
import cj1.C54733a1;
import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import cl1.C55002v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.view.C4182t7;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C6606x;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.IXWebBroadcastListener;
import d50.C58113g;
import d50.C58114h;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import e00.C7578x;
import er1.C45684k;
import er1.C58704c5;
import er1.C58730g5;
import er1.C58739j4;
import fe1.C58969q;
import fh1.C59011e0;
import fh1.C8083t2;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gh1.C59447j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C9028j4;
import il1.C9065m6;
import il1.C9093q1;
import il1.C9118u;
import it1.C9247b;
import it1.C9252f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import lj1.C10536d;
import lj1.C10538e;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import nk1.C11207i;
import nk1.C61791o;
import o40.C61926c;
import ok1.C62042e;
import p50.C62197e;
import pk1.C11944b;
import pk1.C11947c;
import pk1.C11949f;
import pk1.C11950g;
import pk1.C11951h;
import pk1.C11960k;
import pk1.C11971l;
import pk1.C11972n;
import pk1.C27641m;
import qg1.C47826f;
import qj1.C62660c;
import qo3.C77407n;
import rx3.C13598b0;
import sk1.C63947a;
import sx3.C64186f0;
import te3.C48762au0;
import te3.C49083d21;
import te3.C49214e11;
import te3.C50415mk1;
import te3.C64273c21;
import te3.C64890zp2;
import up1.C37521f;
import wc3.C15133e0;
import wx3.C15601d;
import wx3.C66212f;
import xk1.C15715a2;
import xp1.C15869b;
import yj1.C16029e;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: kj1.e1 */
public final class C10125e1 {

    /* renamed from: A */
    public final int f30954A = 35;

    /* renamed from: B */
    public final int f30955B = 36;

    /* renamed from: C */
    public final int f30956C = 37;

    /* renamed from: D */
    public final int f30957D = 38;

    /* renamed from: E */
    public final int f30958E = 40;

    /* renamed from: F */
    public final int f30959F = 46;

    /* renamed from: G */
    public final int f30960G = 48;

    /* renamed from: H */
    public final int f30961H = 50;

    /* renamed from: I */
    public final int f30962I = 51;

    /* renamed from: J */
    public final int f30963J = 52;

    /* renamed from: K */
    public final int f30964K = 53;

    /* renamed from: L */
    public final int f30965L = 54;

    /* renamed from: M */
    public final int f30966M = 55;

    /* renamed from: N */
    public final int f30967N = 56;

    /* renamed from: O */
    public final int f30968O = 1000;

    /* renamed from: P */
    public final int f30969P = 1001;

    /* renamed from: Q */
    public final int f30970Q = 1002;

    /* renamed from: R */
    public final int f30971R = 1003;

    /* renamed from: S */
    public final int f30972S = 1004;

    /* renamed from: T */
    public final int f30973T = 1005;

    /* renamed from: U */
    public final int f30974U = 1006;

    /* renamed from: V */
    public final int f30975V = 1007;

    /* renamed from: W */
    public final int f30976W = 1008;

    /* renamed from: X */
    public final int f30977X = 1009;

    /* renamed from: Y */
    public final int f30978Y = 1010;

    /* renamed from: Z */
    public final int f30979Z = 1011;

    /* renamed from: a */
    public final String f30980a = "Finder.MoreActionHelper";

    /* renamed from: a0 */
    public final int f30981a0 = 1012;

    /* renamed from: b */
    public C45795b f30982b;

    /* renamed from: b0 */
    public final int f30983b0 = 1013;

    /* renamed from: c */
    public int f30984c;

    /* renamed from: d */
    public MMActivity f30985d;

    /* renamed from: e */
    public C58124b f30986e;

    /* renamed from: f */
    public boolean f30987f;

    /* renamed from: g */
    public C10127b f30988g;

    /* renamed from: h */
    public C10132d f30989h;

    /* renamed from: i */
    public C10536d f30990i;

    /* renamed from: j */
    public final int f30991j = 1;

    /* renamed from: k */
    public final int f30992k = 2;

    /* renamed from: l */
    public final int f30993l = 4;

    /* renamed from: m */
    public final int f30994m = 5;

    /* renamed from: n */
    public final int f30995n = 6;

    /* renamed from: o */
    public final int f30996o = 8;

    /* renamed from: p */
    public final int f30997p = 11;

    /* renamed from: q */
    public final int f30998q = 13;

    /* renamed from: r */
    public final int f30999r = 14;

    /* renamed from: s */
    public final int f31000s = 15;

    /* renamed from: t */
    public final int f31001t = 20;

    /* renamed from: u */
    public final int f31002u = 21;

    /* renamed from: v */
    public final int f31003v = 23;

    /* renamed from: w */
    public final int f31004w = 24;

    /* renamed from: x */
    public final int f31005x = 30;

    /* renamed from: y */
    public final int f31006y = 32;

    /* renamed from: z */
    public final int f31007z = 34;

    /* renamed from: kj1.e1$a */
    public interface C10126a {
        /* renamed from: a */
        void mo10541a(C32224a<C13598b0> aVar);

        /* renamed from: b */
        C53973z1 mo10542b(C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar);

        /* renamed from: c */
        <T extends LiveRoomController> T mo10543c(Class<T> cls);

        /* renamed from: d */
        <T> C53953u0<T> mo10544d(C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar);

        /* renamed from: e */
        void mo10545e();

        /* renamed from: f */
        View mo10546f();

        /* renamed from: g */
        C0000n0 mo10547g();

        <T extends C62660c> T getPlugin(Class<T> cls);

        /* renamed from: h */
        C56032b mo10549h();
    }

    /* renamed from: kj1.e1$b */
    public final class C10127b {

        /* renamed from: a */
        public final C10126a f31008a;

        /* renamed from: b */
        public boolean f31009b = true;

        /* renamed from: c */
        public boolean f31010c = true;

        /* renamed from: d */
        public boolean f31011d = true;

        /* renamed from: e */
        public C77407n f31012e;

        /* renamed from: f */
        public C10222s0 f31013f;

        /* renamed from: g */
        public C10222s0 f31014g;

        /* renamed from: h */
        public C10222s0 f31015h;

        /* renamed from: i */
        public C4191v0 f31016i;

        /* renamed from: j */
        public C16029e f31017j;

        /* renamed from: k */
        public C9093q1 f31018k;

        /* renamed from: l */
        public C15133e0 f31019l;

        /* renamed from: m */
        public C9065m6 f31020m;

        /* renamed from: n */
        public C53953u0<? extends C49214e11> f31021n;

        /* renamed from: o */
        public C6606x f31022o;

        /* renamed from: p */
        public final List<C10538e> f31023p = new ArrayList();

        /* renamed from: q */
        public final List<C10538e> f31024q = new ArrayList();

        /* renamed from: r */
        public final List<C10538e> f31025r = new ArrayList();

        /* renamed from: s */
        public C11184p0 f31026s;

        /* renamed from: t */
        public final C11184p0 f31027t;

        /* renamed from: u */
        public final C47269o0 f31028u;

        /* renamed from: v */
        public final /* synthetic */ C10125e1 f31029v;

        /* renamed from: kj1.e1$b$a */
        public static final class C10128a implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C10125e1 f31030d;

            /* renamed from: e */
            public final /* synthetic */ C10127b f31031e;

            public C10128a(C10125e1 e1Var, C10127b bVar) {
                this.f31030d = e1Var;
                this.f31031e = bVar;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                T t;
                T t2;
                T t3;
                C54421g gVar;
                C10126a aVar;
                C59011e0 e0Var;
                String str;
                String str2;
                C10126a aVar2;
                boolean z;
                boolean z2;
                boolean z3;
                Class cls = C54991o.class;
                Class cls2 = C55002v.class;
                Class cls3 = C54963d0.class;
                MMActivity mMActivity = this.f31030d.f30985d;
                Iterator<T> it = this.f31031e.f31023p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C10538e) t).mo10524q() == menuItem.getItemId()) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
                C10538e eVar = (C10538e) t;
                if (eVar != null) {
                    eVar.mo10810s();
                }
                Iterator<T> it4 = this.f31031e.f31024q.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it4.next();
                    if (((C10538e) t2).mo10524q() == menuItem.getItemId()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                C10538e eVar2 = (C10538e) t2;
                if (eVar2 != null) {
                    eVar2.mo10810s();
                }
                Iterator<T> it5 = this.f31031e.f31025r.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it5.next();
                    if (((C10538e) t3).mo10524q() == menuItem.getItemId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C10538e eVar3 = (C10538e) t3;
                if (eVar3 != null) {
                    eVar3.mo10810s();
                }
                Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
                int i2 = this.f31030d.f30995n;
                if (valueOf != null && valueOf.intValue() == i2) {
                    C10125e1 e1Var = this.f31030d;
                    C87412m.m108594g(e1Var, "<this>");
                    Log.m105924i(e1Var.f30980a, "expose isLandscape:" + e1Var.f30987f);
                    if (e1Var.f30987f) {
                        C10127b bVar = e1Var.f30988g;
                        if (!(bVar == null || (aVar2 = bVar.f31008a) == null)) {
                            aVar2.mo10541a(new C10168i2(e1Var));
                        }
                    } else {
                        C10175j2.m10095a(e1Var);
                    }
                    if (e1Var.f30984c == 0) {
                        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                        wVar.getClass();
                        C54116w.Ex0(wVar, C54067f0.C54076o0.ComplaintEntry, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                        wVar.f151900D++;
                    }
                } else {
                    int i3 = this.f31030d.f30968O;
                    String str3 = "";
                    if (valueOf != null && valueOf.intValue() == i3) {
                        C10125e1 e1Var2 = this.f31030d;
                        C87412m.m108594g(e1Var2, "<this>");
                        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        if (C62042e.f176370a.mo87027N0()) {
                            str2 = C58704c5.f168046c;
                        } else {
                            str2 = C58730g5.f168160c.get("RV_VISITOR_" + ((C55001u) e1Var2.mo10534b(C55001u.class)).f154420q.f182392d);
                            if (str2 == null) {
                                str2 = str3;
                            }
                        }
                        C15869b.f42722a.mo14523a(mMActivity, str2, str3);
                    } else {
                        int i4 = this.f31030d.f30969P;
                        if (valueOf != null && valueOf.intValue() == i4) {
                            C10125e1 e1Var3 = this.f31030d;
                            C87412m.m108594g(e1Var3, "<this>");
                            if (C58739j4.f168176a.mo83692U()) {
                                C55002v vVar = (C55002v) e1Var3.mo10534b(cls2);
                                C55002v vVar2 = (C55002v) e1Var3.mo10534b(cls2);
                                C55002v.f154429h = !C55002v.f154429h;
                            }
                        } else {
                            int i5 = this.f31030d.f30971R;
                            if (valueOf != null && valueOf.intValue() == i5) {
                                C11951h hVar = new C11951h(mMActivity, this.f31030d.f30982b);
                                C77407n nVar = new C77407n((Context) hVar.f34885a, 1, false);
                                nVar.f225771i = C11949f.f34883d;
                                nVar.f225782p = new C11950g(hVar);
                                nVar.mo107573q();
                            } else {
                                int i6 = this.f31030d.f30972S;
                                if (valueOf != null && valueOf.intValue() == i6) {
                                    C10125e1 e1Var4 = this.f31030d;
                                    FinderObject finderObject = ((C54991o) e1Var4.mo10534b(cls)).f154341n;
                                    C87412m.m108594g(e1Var4, "<this>");
                                    if (finderObject == null || (str = finderObject.debugMessage) == null || TextUtils.isEmpty(str)) {
                                        str = "empty msg.";
                                    }
                                    C15869b.m14792b(C15869b.f42722a, e1Var4.f30985d, str, (String) null, 4, (Object) null);
                                } else {
                                    int i7 = this.f31030d.f30970Q;
                                    if (valueOf != null && valueOf.intValue() == i7) {
                                        C11971l lVar = new C11971l(mMActivity, this.f31030d.f30982b);
                                        C77407n nVar2 = new C77407n((Context) lVar.f34916a, 1, false);
                                        nVar2.f225771i = new C11960k(lVar);
                                        nVar2.mo107573q();
                                    } else {
                                        int i8 = this.f31030d.f30978Y;
                                        if (valueOf != null && valueOf.intValue() == i8) {
                                            C11972n nVar3 = new C11972n(mMActivity, this.f31030d.f30982b);
                                            C77407n nVar4 = new C77407n((Context) nVar3.f34919a, 1, false);
                                            nVar4.f225771i = new C27641m(nVar3);
                                            nVar4.mo107573q();
                                            C10127b.m10015a(this.f31031e);
                                        } else {
                                            int i9 = this.f31030d.f30981a0;
                                            if (valueOf != null && valueOf.intValue() == i9) {
                                                C10125e1 e1Var5 = this.f31030d;
                                                C87412m.m108594g(e1Var5, "<this>");
                                                C10127b bVar2 = e1Var5.f30988g;
                                                if (!(bVar2 == null || (aVar = bVar2.f31008a) == null || (e0Var = (C59011e0) aVar.mo10543c(C59011e0.class)) == null)) {
                                                    C48762au0 au02 = new C48762au0();
                                                    au02.f130772d = "2";
                                                    e0Var.mo84234m3(au02);
                                                }
                                                C10127b.m10015a(this.f31031e);
                                            } else {
                                                int i15 = this.f31030d.f30983b0;
                                                if (valueOf != null && valueOf.intValue() == i15) {
                                                    C11947c cVar = new C11947c(mMActivity, this.f31030d.f30982b);
                                                    C77407n nVar5 = new C77407n((Context) cVar.f34881a, 1, false);
                                                    nVar5.f225771i = new C11944b(cVar);
                                                    nVar5.mo107573q();
                                                    C10127b.m10015a(this.f31031e);
                                                } else {
                                                    int i16 = this.f31030d.f30954A;
                                                    if (valueOf != null && valueOf.intValue() == i16) {
                                                        C10125e1 e1Var6 = this.f31030d;
                                                        C87412m.m108594g(e1Var6, "<this>");
                                                        MMActivity mMActivity2 = e1Var6.f30985d;
                                                        C10127b bVar3 = e1Var6.f30988g;
                                                        if (bVar3 != null) {
                                                            C7335d c = C86312j.m106911c(C7578x.class);
                                                            C87412m.m108593f(c, "getService(IHalfScreenService::class.java)");
                                                            AppCompatActivity context = mMActivity2.getContext();
                                                            C87412m.m108593f(context, "activity.context");
                                                            C6606x a = C7578x.C7579a.m7714a((C7578x) c, context, "https://game.weixin.qq.com/cgi-bin/h5/static/findercenter/tester.html", (MMWebView) null, (C44361u) null, 12, (Object) null);
                                                            C87412m.m108594g(a, "<set-?>");
                                                            bVar3.f31022o = a;
                                                        }
                                                        C10127b bVar4 = e1Var6.f30988g;
                                                        if (bVar4 != null) {
                                                            bVar4.mo10553g().show();
                                                        }
                                                        C10127b bVar5 = e1Var6.f30988g;
                                                        if (bVar5 != null) {
                                                            bVar5.mo10553g().mo7528g(new C10202o0(e1Var6));
                                                        }
                                                        C10127b bVar6 = e1Var6.f30988g;
                                                        if (bVar6 != null) {
                                                            bVar6.mo10553g().setOnDismissListener(new C10206p0(e1Var6));
                                                        }
                                                    } else {
                                                        int i17 = this.f31030d.f30973T;
                                                        if (valueOf != null && valueOf.intValue() == i17) {
                                                            C10125e1 e1Var7 = this.f31030d;
                                                            C87412m.m108594g(e1Var7, "<this>");
                                                            ((C54963d0) e1Var7.mo10534b(cls3)).f154051E = new C54733a1((String) null, 0, 0, 1, 2, (List) null, 39, (C8480h) null);
                                                            e1Var7.mo10539g(C58124b.C58125b.FINDER_LIVE_BATTLE_START, (Bundle) null);
                                                            C61926c.m72666K(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, new C10198n0(e1Var7));
                                                        } else {
                                                            int i18 = this.f31030d.f30974U;
                                                            if (valueOf != null && valueOf.intValue() == i18) {
                                                                C10125e1 e1Var8 = this.f31030d;
                                                                C87412m.m108594g(e1Var8, "<this>");
                                                                ((C54963d0) e1Var8.mo10534b(cls3)).f154051E = new C54733a1((String) null, 0, 0, 2, 2, (List) null, 39, (C8480h) null);
                                                                e1Var8.mo10539g(C58124b.C58125b.FINDER_LIVE_BATTLE_START, (Bundle) null);
                                                                C61926c.m72666K(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, new C10193m0(e1Var8));
                                                            } else {
                                                                int i19 = this.f31030d.f30975V;
                                                                if (valueOf != null && valueOf.intValue() == i19) {
                                                                    C10125e1 e1Var9 = this.f31030d;
                                                                    C87412m.m108594g(e1Var9, "<this>");
                                                                    ((C54963d0) e1Var9.mo10534b(cls3)).f154051E = new C54733a1((String) null, 0, 0, 3, 2, (List) null, 39, (C8480h) null);
                                                                    e1Var9.mo10539g(C58124b.C58125b.FINDER_LIVE_BATTLE_START, (Bundle) null);
                                                                    C61926c.m72666K(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, new C10185l0(e1Var9));
                                                                } else {
                                                                    int i25 = this.f31030d.f30976W;
                                                                    if (valueOf != null && valueOf.intValue() == i25) {
                                                                        C10125e1 e1Var10 = this.f31030d;
                                                                        C87412m.m108594g(e1Var10, "<this>");
                                                                        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                                                        C62042e eVar4 = C62042e.f176370a;
                                                                        if (eVar4.mo87030O0()) {
                                                                            if (C54655b.f153178f1 == null) {
                                                                                C54655b.f153178f1 = new C54655b();
                                                                            }
                                                                            C54655b bVar7 = C54655b.f153178f1;
                                                                            C87412m.m108591d(bVar7);
                                                                            str3 = String.valueOf(bVar7.hashCode());
                                                                        } else {
                                                                            C62197e e0 = FinderLiveService.f159376d.mo77631e0();
                                                                            if (!(e0 == null || (gVar = e0.f176822Y0) == null)) {
                                                                                str3 = gVar.mo75227a();
                                                                            }
                                                                        }
                                                                        String str4 = "onLine: " + ((C55002v) e1Var10.mo10534b(cls2)).f154431g + "\n " + ((C55002v) e1Var10.mo10534b(cls2)).mo76045c3(eVar4.mo87030O0(), str3);
                                                                        C15869b bVar8 = C15869b.f42722a;
                                                                        AppCompatActivity context2 = mMActivity.getContext();
                                                                        C87412m.m108593f(context2, "activity.context");
                                                                        bVar8.mo14523a(context2, str4, str3);
                                                                    } else {
                                                                        int i26 = this.f31030d.f30977X;
                                                                        if (valueOf != null && valueOf.intValue() == i26) {
                                                                            C10125e1 e1Var11 = this.f31030d;
                                                                            C87412m.m108594g(e1Var11, "<this>");
                                                                            C49083d21 d212 = ((C54991o) e1Var11.mo10534b(cls)).f154250R3;
                                                                            String str5 = d212 != null ? d212.f132074d : null;
                                                                            if (str5 == null || str5.length() == 0) {
                                                                                Log.m105924i(e1Var11.f30980a, "clickInnerData but innerUrl is null");
                                                                            } else {
                                                                                Intent intent = new Intent();
                                                                                intent.putExtra("rawUrl", str5);
                                                                                intent.putExtra("convertActivityFromTranslucent", true);
                                                                                C88144b.m109791i(e1Var11.f30985d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C10127b.m10015a(this.f31031e);
            }
        }

        /* renamed from: kj1.e1$b$b */
        public static final class C10129b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C10125e1 f31032d;

            /* renamed from: e */
            public final /* synthetic */ C10127b f31033e;

            public C10129b(C10125e1 e1Var, C10127b bVar) {
                this.f31032d = e1Var;
                this.f31033e = bVar;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C15133e0 e0Var;
                C10125e1 e1Var = this.f31032d;
                C87412m.m108594g(e1Var, "<this>");
                FinderObject finderObject = ((C54991o) e1Var.mo10534b(C54991o.class)).f154341n;
                if (finderObject != null) {
                    C10127b bVar = e1Var.f30988g;
                    if (!(bVar == null || (e0Var = bVar.f31019l) == null)) {
                        C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                        e0Var.xc0((C76875f0) menuItem, new C10212q2(e1Var, finderObject, menuItem));
                    }
                    C7335d c = C86312j.m106911c(C54108o.class);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.RECENTLY_FORWARD, (Map) null, (String) null, 6, (Object) null);
                }
                C10127b.m10015a(this.f31033e);
            }
        }

        /* renamed from: kj1.e1$b$c */
        public static final class C10130c implements C47269o0 {

            /* renamed from: a */
            public final /* synthetic */ C10125e1 f31034a;

            public C10130c(C10125e1 e1Var) {
                this.f31034a = e1Var;
            }

            /* renamed from: a */
            public final void mo2584a(MenuItem menuItem, int i) {
                C10127b bVar;
                C15133e0 e0Var;
                C10125e1 e1Var = this.f31034a;
                C87412m.m108594g(e1Var, "<this>");
                C10127b bVar2 = e1Var.f30988g;
                C77407n nVar = bVar2 != null ? bVar2.f31012e : null;
                FinderObject finderObject = ((C54991o) e1Var.mo10534b(C54991o.class)).f154341n;
                if (nVar != null && finderObject != null && (bVar = e1Var.f30988g) != null && (e0Var = bVar.f31019l) != null) {
                    C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                    e0Var.mo14089YM(nVar, (C76875f0) menuItem);
                }
            }
        }

        public C10127b(C10125e1 e1Var, C10126a aVar) {
            C87412m.m108594g(aVar, "livingDep");
            this.f31029v = e1Var;
            this.f31008a = aVar;
            boolean z = true;
            C62042e eVar = C62042e.f176370a;
            this.f31010c = eVar.mo87095m();
            eVar.getClass();
            C37521f.f99374d.getClass();
            z = C37521f.f99283S4.mo60266n().intValue() != 1 ? false : z;
            Log.m105924i("FinderLiveUtil", "canPlayDesktopSwitchShow " + z);
            this.f31011d = z;
            String str = e1Var.f30980a;
            Log.m105924i(str, "enableVisitorRoleEntrance:" + this.f31010c);
            this.f31026s = new C10128a(e1Var, this);
            this.f31027t = new C10129b(e1Var, this);
            this.f31028u = new C10130c(e1Var);
        }

        /* renamed from: a */
        public static final void m10015a(C10127b bVar) {
            C77407n nVar = bVar.f31012e;
            if (nVar != null) {
                nVar.mo107572p();
            }
            C10222s0 s0Var = bVar.f31013f;
            if (s0Var != null) {
                s0Var.mo10568b();
            }
            C10222s0 s0Var2 = bVar.f31014g;
            if (s0Var2 != null) {
                s0Var2.mo10568b();
            }
            C10222s0 s0Var3 = bVar.f31015h;
            if (s0Var3 != null) {
                s0Var3.mo10568b();
            }
        }

        /* renamed from: b */
        public static final void m10016b(C10127b bVar, C76874e0 e0Var, Activity activity) {
            C58113g gVar;
            C64890zp2 zp22;
            String str = bVar.f31029v.f30980a;
            StringBuilder sb = new StringBuilder();
            sb.append("prepareAnchorMenuItems: business(LiveCommonSlice::class.java).liveFinderObject.id:");
            FinderObject finderObject = ((C54991o) bVar.f31029v.mo10534b(C54991o.class)).f154341n;
            String str2 = null;
            sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
            sb.append(" hlsUrl:");
            C58114h hVar = ((C55001u) bVar.f31029v.mo10534b(C55001u.class)).f154421r;
            if (!(hVar == null || (gVar = hVar.f166251b) == null || (zp22 = gVar.f166244n) == null)) {
                str2 = zp22.f186828z;
            }
            sb.append(str2);
            Log.m105924i(str, sb.toString());
            Iterator it = ((ArrayList) bVar.f31024q).iterator();
            while (it.hasNext()) {
                ((C10538e) it.next()).mo10809p(e0Var);
            }
            C10210q0.m10127a(bVar.f31029v, e0Var);
        }

        /* renamed from: c */
        public static final void m10017c(C10127b bVar, C76874e0 e0Var) {
            C58113g gVar;
            C64890zp2 zp22;
            String str = bVar.f31029v.f30980a;
            StringBuilder sb = new StringBuilder();
            sb.append("prepareAnchorZeroMenuItems: business(LiveCommonSlice::class.java).liveFinderObject.id:");
            FinderObject finderObject = ((C54991o) bVar.f31029v.mo10534b(C54991o.class)).f154341n;
            String str2 = null;
            sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
            sb.append(" hlsUrl:");
            C58114h hVar = ((C55001u) bVar.f31029v.mo10534b(C55001u.class)).f154421r;
            if (!(hVar == null || (gVar = hVar.f166251b) == null || (zp22 = gVar.f166244n) == null)) {
                str2 = zp22.f186828z;
            }
            sb.append(str2);
            Log.m105924i(str, sb.toString());
            Iterator it = ((ArrayList) bVar.f31023p).iterator();
            while (it.hasNext()) {
                ((C10538e) it.next()).mo10809p(e0Var);
            }
        }

        /* renamed from: d */
        public final void mo10550d(C10538e eVar) {
            ((ArrayList) this.f31024q).add(eVar);
            C10536d dVar = this.f31029v.f30990i;
            if (dVar != null) {
                dVar.mo10799a(eVar);
            }
        }

        /* renamed from: e */
        public final void mo10551e(C10538e eVar) {
            ((ArrayList) this.f31025r).add(eVar);
            C10536d dVar = this.f31029v.f30990i;
            if (dVar != null) {
                dVar.mo10799a(eVar);
            }
        }

        /* renamed from: f */
        public final void mo10552f(C10538e eVar) {
            ((ArrayList) this.f31023p).add(eVar);
            C10536d dVar = this.f31029v.f30990i;
            if (dVar != null) {
                dVar.mo10799a(eVar);
            }
        }

        /* renamed from: g */
        public final C6606x mo10553g() {
            C6606x xVar = this.f31022o;
            if (xVar != null) {
                return xVar;
            }
            C87412m.m108603p("magicLiveCardDebugHalfWebViewDialog");
            throw null;
        }
    }

    /* renamed from: kj1.e1$c */
    public interface C10131c {
    }

    /* renamed from: kj1.e1$d */
    public final class C10132d {

        /* renamed from: a */
        public int f31035a;

        /* renamed from: b */
        public final C0000n0 f31036b;

        /* renamed from: c */
        public C9118u f31037c;

        /* renamed from: d */
        public C9028j4 f31038d;

        /* renamed from: e */
        public C10222s0 f31039e;

        /* renamed from: f */
        public final List<C10538e> f31040f = new ArrayList();

        /* renamed from: g */
        public final List<C10538e> f31041g = new ArrayList();

        /* renamed from: h */
        public final C11184p0 f31042h = new C10133a(this);

        /* renamed from: i */
        public final C11184p0 f31043i = new C10134b(this);

        /* renamed from: j */
        public final /* synthetic */ C10125e1 f31044j;

        /* renamed from: kj1.e1$d$a */
        public static final class C10133a implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C10132d f31045d;

            public C10133a(C10132d dVar) {
                this.f31045d = dVar;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                T t;
                boolean z;
                Iterator<T> it = this.f31045d.f31040f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C10538e) t).mo10524q() == menuItem.getItemId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C10538e eVar = (C10538e) t;
                if (eVar != null) {
                    eVar.mo10810s();
                }
                C10222s0 s0Var = this.f31045d.f31039e;
                if (s0Var != null) {
                    s0Var.mo10568b();
                }
            }
        }

        /* renamed from: kj1.e1$d$b */
        public static final class C10134b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C10132d f31046d;

            public C10134b(C10132d dVar) {
                this.f31046d = dVar;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                T t;
                boolean z;
                Iterator<T> it = this.f31046d.f31041g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C10538e) t).mo10524q() == menuItem.getItemId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C10538e eVar = (C10538e) t;
                if (eVar != null) {
                    eVar.mo10810s();
                }
                C10222s0 s0Var = this.f31046d.f31039e;
                if (s0Var != null) {
                    s0Var.mo10568b();
                }
            }
        }

        public C10132d(C10125e1 e1Var, C10131c cVar, int i, C0000n0 n0Var) {
            C87412m.m108594g(cVar, "postDep");
            C87412m.m108594g(n0Var, "mainScope");
            this.f31044j = e1Var;
            this.f31035a = i;
            this.f31036b = n0Var;
        }

        /* renamed from: a */
        public final void mo10554a(C10538e eVar) {
            ((ArrayList) this.f31041g).add(eVar);
            C10536d dVar = this.f31044j.f30990i;
            if (dVar != null) {
                dVar.mo10799a(eVar);
            }
        }

        /* renamed from: b */
        public final C58969q mo10555b() {
            return ((C54991o) this.f31044j.f30982b.mo71262a(C54991o.class)).f154259T2;
        }
    }

    /* renamed from: kj1.e1$e */
    public static final class C10135e implements C10126a {

        /* renamed from: a */
        public final /* synthetic */ C8083t2 f31047a;

        public C10135e(C8083t2 t2Var) {
            this.f31047a = t2Var;
        }

        /* renamed from: a */
        public void mo10541a(C32224a<C13598b0> aVar) {
            C87412m.m108594g(aVar, "callback");
            this.f31047a.mo9312j3(aVar);
        }

        /* renamed from: b */
        public C53973z1 mo10542b(C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
            C87412m.m108594g(fVar, "context");
            C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
            C87412m.m108594g(pVar, "block");
            return C11207i.m11069e(this.f31047a, fVar, p0Var, pVar);
        }

        /* renamed from: c */
        public <T extends LiveRoomController> T mo10543c(Class<T> cls) {
            C87412m.m108594g(cls, "ctrl");
            return this.f31047a.controller(cls);
        }

        /* renamed from: d */
        public <T> C53953u0<T> mo10544d(C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar) {
            C87412m.m108594g(fVar, "context");
            C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
            C87412m.m108594g(pVar, "block");
            C8083t2 t2Var = this.f31047a;
            C87412m.m108594g(t2Var, "<this>");
            C3206b2 b2Var = t2Var.f27261e;
            C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
            if (bVar != null) {
                return C53895h.m60463a(bVar.getViewScope(), fVar, p0Var, pVar);
            }
            return null;
        }

        /* renamed from: e */
        public void mo10545e() {
            C59447j.f169870a.mo84554f(this.f31047a.getStore());
        }

        /* renamed from: f */
        public View mo10546f() {
            return this.f31047a.f26904n;
        }

        /* renamed from: g */
        public C0000n0 mo10547g() {
            C3206b2 b2Var = this.f31047a.f27261e;
            C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
            if (bVar != null) {
                return bVar.getViewScope();
            }
            return null;
        }

        public <T extends C62660c> T getPlugin(Class<T> cls) {
            C87412m.m108594g(cls, "modelClass");
            return this.f31047a.mo9307d3(cls);
        }

        /* renamed from: h */
        public C56032b mo10549h() {
            C3206b2 b2Var = this.f31047a.f27261e;
            if (b2Var instanceof C56032b) {
                return (C56032b) b2Var;
            }
            return null;
        }
    }

    /* renamed from: kj1.e1$f */
    public static final class C10136f implements C47826f.C47827a {

        /* renamed from: a */
        public final /* synthetic */ C10125e1 f31048a;

        /* renamed from: b */
        public final /* synthetic */ int f31049b;

        /* renamed from: c */
        public final /* synthetic */ C32227p<Boolean, C50415mk1, C13598b0> f31050c;

        /* renamed from: d */
        public final /* synthetic */ boolean f31051d;

        /* renamed from: e */
        public final /* synthetic */ int f31052e;

        public C10136f(C10125e1 e1Var, int i, C32227p<? super Boolean, ? super C50415mk1, C13598b0> pVar, boolean z, int i2) {
            this.f31048a = e1Var;
            this.f31049b = i;
            this.f31050c = pVar;
            this.f31051d = z;
            this.f31052e = i2;
        }

        /* renamed from: a */
        public void mo9151a(int i, long j, C50415mk1 mk12) {
            Class cls = C54991o.class;
            ((C54991o) this.f31048a.mo10534b(cls)).f154354q = i;
            ((C54991o) this.f31048a.mo10534b(cls)).mo75982R4((long) i);
            C61791o oVar = C61791o.f175673a;
            oVar.mo86722d("commonAnchorFlagClick succ, flag:" + this.f31049b, ((C54991o) this.f31048a.mo10534b(cls)).f154354q);
            C32227p<Boolean, C50415mk1, C13598b0> pVar = this.f31050c;
            if (pVar != null) {
                pVar.invoke(Boolean.TRUE, mk12);
            }
        }

        /* renamed from: b */
        public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
            Class cls = C54991o.class;
            if (this.f31051d) {
                ((C54991o) this.f31048a.mo10534b(cls)).f154354q = this.f31052e & (~this.f31049b);
            } else {
                ((C54991o) this.f31048a.mo10534b(cls)).f154354q = this.f31052e | this.f31049b;
            }
            C61791o oVar = C61791o.f175673a;
            oVar.mo86722d("commonAnchorFlagClick failed, flag:" + this.f31049b, ((C54991o) this.f31048a.mo10534b(cls)).f154354q);
            C32227p<Boolean, C50415mk1, C13598b0> pVar = this.f31050c;
            if (pVar != null) {
                pVar.invoke(Boolean.FALSE, mk12);
            }
        }

        /* renamed from: c */
        public void mo9153c(int i, long j) {
        }

        /* renamed from: d */
        public void mo9154d(int i, int i2, String str, int i3) {
        }
    }

    /* renamed from: kj1.e1$g */
    public static final class C10137g implements C10131c {
        public C10137g(C15715a2 a2Var) {
        }
    }

    public C10125e1(C8083t2 t2Var, MMActivity mMActivity) {
        C87412m.m108594g(t2Var, "controller");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f30982b = t2Var.getStore().getLiveRoomData();
        this.f30985d = mMActivity;
        C3206b2 b2Var = t2Var.f27261e;
        C87412m.m108592e(b2Var, "null cannot be cast to non-null type com.tencent.mm.live.plugin.ILiveStatus");
        C58124b bVar = (C58124b) b2Var;
        this.f30986e = bVar;
        this.f30984c = bVar.getLiveRole();
        this.f30987f = t2Var.mo9310g3();
        this.f30988g = new C10127b(this, new C10135e(t2Var));
    }

    /* renamed from: a */
    public final SpannableString mo10533a(String str, String str2) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "subTitle");
        if ((str2.length() == 0) || !C112550d0.m153801u(str, str2, false)) {
            String str3 = this.f30980a;
            Log.m105924i(str3, "assembleMenuItemTitleSpan title:" + str + ",subTitle:" + str2);
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        int E = C112550d0.m153769E(str, str2, 0, false, 6, (Object) null);
        try {
            spannableString.setSpan(new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1)), E, str2.length() + E, 33);
        } catch (Exception e) {
            C58739j4 j4Var = C58739j4.f168176a;
            j4Var.mo83712h0(e, this.f30980a + "-assembleMenuItemTitleSpan");
        }
        return spannableString;
    }

    /* renamed from: b */
    public final <T extends C39622i0> T mo10534b(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return this.f30982b.mo71262a(cls);
    }

    /* renamed from: c */
    public final void mo10535c(List<String> list) {
        Collection collection;
        if (C45684k.f123488a.mo71181b(this.f30982b)) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                collection = new ArrayList();
                for (T next : list) {
                    if (C112551y.m153808h((String) next, "@chatroom", false, 2, (Object) null)) {
                        collection.add(next);
                    }
                }
            } else {
                collection = C64186f0.f181907d;
            }
            arrayList.addAll(collection);
            if (!arrayList.isEmpty()) {
                C58124b.C58125b bVar = C58124b.C58125b.FINDER_LIVE_TRANSMIT_TO_CHAT_GROUP_RESPONSE;
                Bundle bundle = new Bundle();
                bundle.putInt("requestCode", 16);
                bundle.putBoolean("is_share_success", true);
                bundle.putStringArrayList("current_group_select", arrayList);
                C13598b0 b0Var = C13598b0.f38549a;
                mo10539g(bVar, bundle);
            }
        }
    }

    /* renamed from: d */
    public final LoadingSwitchBtn mo10536d(View view, int i, boolean z) {
        C87412m.m108594g(view, "rootView");
        LoadingSwitchBtn loadingSwitchBtn = (LoadingSwitchBtn) view.findViewById(i);
        loadingSwitchBtn.setCheck(z);
        String string = this.f30985d.getResources().getString(C0966R.string.ett);
        C87412m.m108593f(string, "context.resources.getStr….R.string.finder_waiting)");
        Context context = loadingSwitchBtn.getContext();
        C87412m.m108593f(context, "context");
        LoadingSwitchBtn.C4001a aVar = null;
        C4182t7 t7Var = C4182t7.f18439d;
        if (t7Var != null) {
            aVar = new LoadingSwitchBtn.C4001a(t7Var);
        }
        C9247b bVar = new C9247b();
        bVar.f28992c = 500;
        new WeakReference(context);
        C9252f fVar = new C9252f();
        fVar.f28996c = string;
        fVar.f28997d = aVar;
        fVar.f28999a = new WeakReference<>(context);
        bVar.f28991b = fVar;
        loadingSwitchBtn.f18032L = bVar;
        loadingSwitchBtn.setEnabled(false);
        return loadingSwitchBtn;
    }

    /* renamed from: e */
    public final void mo10537e(int i, boolean z, boolean z2, C32227p<? super Boolean, ? super C50415mk1, C13598b0> pVar) {
        int i2 = i;
        boolean z3 = z;
        C32227p<? super Boolean, ? super C50415mk1, C13598b0> pVar2 = pVar;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        int i3 = ((C54991o) mo10534b(cls2)).f154354q;
        String str = this.f30980a;
        Log.m105924i(str, "commonAnchorFlagClick anchorStatusFlag: " + i3 + " enable:" + z3);
        if (z3) {
            ((C54991o) mo10534b(cls2)).f154354q = i3 | i2;
        } else {
            ((C54991o) mo10534b(cls2)).f154354q = (~i2) & i3;
        }
        if (z2) {
            C10136f fVar = new C10136f(this, i, pVar, z, i3);
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                long j = (long) i2;
                C54795n5.C54796a.m61727e(n5Var, ((C55001u) mo10534b(cls)).f154420q.f182392d, ((C55001u) mo10534b(cls)).f154416j, ((C54991o) mo10534b(cls2)).f154354q, j, 0, fVar, 16, (Object) null);
            }
        } else if (pVar2 != null) {
            pVar2.invoke(Boolean.TRUE, null);
        }
    }

    /* renamed from: f */
    public final void mo10538f() {
        ((C54991o) mo10534b(C54991o.class)).f154350p0 = false;
    }

    /* renamed from: g */
    public final void mo10539g(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        this.f30986e.statusChange(bVar, bundle);
    }

    /* renamed from: h */
    public final void mo10540h(FinderObject finderObject, C64273c21 c212) {
        C87412m.m108594g(finderObject, "sourceObject");
        C87412m.m108594g(c212, "destLiveInfo");
        C64273c21 c213 = finderObject.liveInfo;
        boolean z = false;
        if (c213 != null && c213.f182392d == c212.f182392d) {
            z = true;
        }
        if (z) {
            String str = this.f30980a;
            StringBuilder sb = new StringBuilder();
            sb.append("source object:");
            C63947a aVar = C63947a.f181274a;
            sb.append(aVar.mo88736v(finderObject.liveInfo));
            sb.append(",dest live info's purchase info:");
            sb.append(aVar.mo88725k(c212.f182363I));
            Log.m105924i(str, sb.toString());
            finderObject.liveInfo = c212;
        }
    }

    public C10125e1(C15715a2 a2Var, MMActivity mMActivity, int i, C0000n0 n0Var, C58124b bVar, C45795b bVar2) {
        C87412m.m108594g(a2Var, "moreActionUIC");
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(n0Var, "mainScope");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(bVar2, "buContext");
        this.f30985d = mMActivity;
        this.f30982b = bVar2;
        this.f30986e = bVar;
        this.f30984c = bVar.getLiveRole();
        this.f30987f = false;
        this.f30989h = new C10132d(this, new C10137g(a2Var), i, n0Var);
    }
}
