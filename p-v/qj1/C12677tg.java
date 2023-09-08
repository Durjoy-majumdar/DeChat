package qj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import bl3.C39818r;
import cj1.C0639y1;
import cj1.C54795n5;
import cl1.C0696x;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ig1.C8916d;
import il1.C8940c3;
import il1.C8953d3;
import il1.C9012h4;
import il1.C9114t2;
import il1.C9184z2;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import ke3.C88144b;
import kotlin.ResultKt;
import ky2.C10432i;
import l60.C99342a;
import l60.C99344b;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C117747y;
import ok1.C62042e;
import p749xh.C38596k3;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import qg1.C12221g;
import qo3.C12925w;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49712hj1;
import te3.C50326ly0;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.tg */
public final class C12677tg extends C62660c {

    /* renamed from: p */
    public C0000n0 f36310p = C53930o0.m60555b();

    /* renamed from: q */
    public C9114t2 f36311q;

    /* renamed from: r */
    public C9184z2 f36312r;

    /* renamed from: s */
    public C9012h4 f36313s;

    /* renamed from: t */
    public C8953d3 f36314t;

    /* renamed from: qj1.tg$a */
    public enum C12678a {
        DEFAULT(0),
        GIFT_PANEL(1),
        TEAM_UP_FANS(2),
        LIVE_HEADER_BTN(3);
        

        /* renamed from: d */
        public final int f36320d;

        /* access modifiers changed from: public */
        C12678a(int i) {
            this.f36320d = i;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorFansClubPanelPlugin$checkFansClubState$1", mo125469f = "FinderLiveVisitorFansClubPanelPlugin.kt", mo125470l = {192}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.tg$b */
    public static final class C12679b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f36321d;

        /* renamed from: e */
        public final /* synthetic */ C12677tg f36322e;

        /* renamed from: f */
        public final /* synthetic */ C12678a f36323f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorFansClubPanelPlugin$checkFansClubState$1$result$1", mo125469f = "FinderLiveVisitorFansClubPanelPlugin.kt", mo125470l = {193}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.tg$b$a */
        public static final class C12680a extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends Boolean, ? extends Boolean>>, Object> {

            /* renamed from: d */
            public int f36324d;

            /* renamed from: e */
            public final /* synthetic */ C12677tg f36325e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12680a(C12677tg tgVar, C15601d<? super C12680a> dVar) {
                super(2, dVar);
                this.f36325e = tgVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12680a(this.f36325e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12680a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f36324d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C12677tg tgVar = this.f36325e;
                    this.f36324d = 1;
                    tgVar.getClass();
                    Class cls = C55001u.class;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    Log.m105924i("FinderLiveVisitorFansClubPanelPlugin", "haveJoinFansClub");
                    C89059e i2 = new C12221g(1, C89349b.m111674a(((C55001u) tgVar.mo87684A0().mo71262a(cls)).f154417n), ((C55001u) tgVar.mo87684A0().mo71262a(cls)).f154420q.f182392d, ((C55001u) tgVar.mo87684A0().mo71262a(cls)).f154416j, (C49712hj1) null).mo9225i();
                    i2.mo123420E(new C12721vg(hVar, tgVar));
                    if (tgVar.f166287d.getContext() != null && (tgVar.f166287d.getContext() instanceof MMActivity)) {
                        Context context = tgVar.f166287d.getContext();
                        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        i2.mo11397F((MMActivity) context);
                    }
                    obj = hVar.mo90314b();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12679b(C12677tg tgVar, C12678a aVar, C15601d<? super C12679b> dVar) {
            super(2, dVar);
            this.f36322e = tgVar;
            this.f36323f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12679b(this.f36322e, this.f36323f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12679b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C0696x.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f36321d;
            T t = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C12680a aVar2 = new C12680a(this.f36322e, (C15601d<? super C12680a>) null);
                this.f36321d = 1;
                obj = C53895h.m60469g(h0Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13604l lVar = (C13604l) obj;
            boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
            boolean booleanValue2 = ((Boolean) lVar.f38556e).booleanValue();
            Log.m105924i("FinderLiveVisitorFansClubPanelPlugin", "haveJoinFansClub success:" + booleanValue + ", needPurcase:" + booleanValue2);
            if (booleanValue) {
                C0696x xVar = (C0696x) this.f36322e.mo87696x0(cls);
                C38596k3 k3Var = ((C0696x) this.f36322e.mo87696x0(cls)).f1645h;
                if (k3Var == null) {
                    C0639y1 y1Var = C0639y1.f1510a;
                    Iterator<T> it = C0639y1.f1513d.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C61926c.m72696u(((C8916d) next).field_flag, 4)) {
                            t = next;
                            break;
                        }
                    }
                    k3Var = (C38596k3) t;
                }
                xVar.mo661e3(k3Var);
                C12677tg tgVar = this.f36322e;
                C12678a aVar3 = this.f36323f;
                boolean g0 = tgVar.mo82893g0();
                Log.m105924i("FinderLiveVisitorFansClubPanelPlugin", "showInvitePanel isLand:" + g0 + ",needPurcase:" + booleanValue2 + ",fromScene:" + aVar3);
                if (g0) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("JOIN_FANS_CLUB_NEED_PURCHASE", booleanValue2);
                    bundle.putInt("JOIN_FANS_CLUB_FROM_SCENE", aVar3.f36320d);
                    C13598b0 b0Var = C13598b0.f38549a;
                    tgVar.mo87694V0("PORTRAIT_ACTION_JOIN_FANS_CLUB", bundle);
                } else {
                    tgVar.mo12260c1();
                    C9114t2 t2Var = tgVar.f36311q;
                    if (t2Var != null) {
                        t2Var.mo9910d(tgVar.mo87684A0(), booleanValue2, aVar3);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.tg$c */
    public static final class C12681c extends C87413o implements C32226l<C12678a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12677tg f36326d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12681c(C12677tg tgVar) {
            super(1);
            this.f36326d = tgVar;
        }

        public Object invoke(Object obj) {
            C12678a aVar = (C12678a) obj;
            C87412m.m108594g(aVar, "fromScene");
            C12677tg.m12179a1(this.f36326d, aVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.tg$d */
    public static final class C12682d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12677tg f36327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12682d(C12677tg tgVar) {
            super(1);
            this.f36327d = tgVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C58124b.C7172a.m7372a(this.f36327d.f177936g, C58124b.C58125b.FINDER_LIVE_FANS_CLUB_JOIN_SUCCESSFUL, (Bundle) null, 2, (Object) null);
            } else {
                C58124b.C7172a.m7372a(this.f36327d.f177936g, C58124b.C58125b.FINDER_LIVE_FANS_CLUB_JOIN_FAILED, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.tg$e */
    public static final class C12683e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12677tg f36328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12683e(C12677tg tgVar) {
            super(0);
            this.f36328d = tgVar;
        }

        public Object invoke() {
            C12677tg.m12178Z0(this.f36328d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.tg$f */
    public static final class C12684f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12677tg f36329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12684f(C12677tg tgVar) {
            super(0);
            this.f36329d = tgVar;
        }

        public Object invoke() {
            C12677tg.m12178Z0(this.f36329d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.tg$g */
    public static final class C12685g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12677tg f36330d;

        /* renamed from: e */
        public final /* synthetic */ C9012h4 f36331e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12685g(C12677tg tgVar, C9012h4 h4Var) {
            super(0);
            this.f36330d = tgVar;
            this.f36331e = h4Var;
        }

        public Object invoke() {
            C12677tg tgVar = this.f36330d;
            if (tgVar.f36314t == null) {
                Context context = tgVar.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                C8953d3 d3Var = new C8953d3(context);
                d3Var.mo9935a(tgVar);
                tgVar.f36314t = d3Var;
            }
            C8953d3 d3Var2 = this.f36330d.f36314t;
            if (d3Var2 != null) {
                C12925w bottomSheet = this.f36331e.getBottomSheet();
                int i = C8953d3.f28273H;
                d3Var2.mo9759e(bottomSheet, false);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12677tg(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
    }

    /* renamed from: Z0 */
    public static final void m12178Z0(C12677tg tgVar) {
        String str;
        tgVar.getClass();
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Yx0((C54116w) c, C54067f0.C0069t0.HELP_CLICK, (Boolean) null, (C12678a) null, 6, (Object) null);
        Intent intent = new Intent();
        C50326ly0 ly02 = ((C0696x) tgVar.mo87696x0(C0696x.class)).f1644g;
        if (ly02 == null || (str = ly02.f137709g) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(tgVar.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: a1 */
    public static final void m12179a1(C12677tg tgVar, C12678a aVar) {
        C54795n5 D0;
        C38596k3 k3Var = ((C0696x) tgVar.mo87696x0(C0696x.class)).f1645h;
        C13598b0 b0Var = null;
        C8916d dVar = k3Var instanceof C8916d ? (C8916d) k3Var : null;
        if (dVar != null) {
            if (tgVar.f36312r == null) {
                Context context = tgVar.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                C9184z2 z2Var = new C9184z2(context);
                z2Var.setWecoinClickCallBack(new C12731wg(tgVar));
                z2Var.setJoinCallBack(new C12756xg(tgVar));
                z2Var.mo9935a(tgVar);
                tgVar.f36312r = z2Var;
            }
            C9184z2 z2Var2 = tgVar.f36312r;
            if (z2Var2 != null) {
                C87412m.m108594g(aVar, "fromScene");
                Log.m105924i("FinderLiveFansJoinWidget", "fromScene:" + aVar + ",payGift:" + dVar.field_name);
                z2Var2.f28908v = dVar;
                z2Var2.f28909w = aVar;
                z2Var2.f28903q.setText(String.valueOf((int) dVar.field_price));
                z2Var2.f28904r.setText(z2Var2.getContext().getString(C0966R.string.dlg, new Object[]{dVar.field_name}));
                C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(dVar.field_thumbnailFileUrl, C27696y.THUMB_IMAGE));
                ImageView imageView = z2Var2.f28905s;
                C87412m.m108593f(imageView, "giftImage");
                ((C99342a) a).mo85954d(imageView);
                z2Var2.f28906t.setText(dVar.field_name);
                long currentTimeMillis = System.currentTimeMillis();
                C62660c basePlugin = z2Var2.getBasePlugin();
                if (!(basePlugin == null || (D0 = basePlugin.mo14476D0()) == null)) {
                    D0.mo75729d(currentTimeMillis, new C8940c3(currentTimeMillis, z2Var2));
                }
                C12925w wVar = new C12925w(z2Var2.f28900n.getContext());
                C62042e.f176370a.mo87010H1(z2Var2.f28900n);
                wVar.mo12471k(z2Var2.f28900n);
                wVar.f36921B.setBackgroundResource(C0966R.C0969drawable.az7);
                wVar.mo5086o();
                z2Var2.f28899j = wVar;
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.Yx0((C54116w) c, C54067f0.C0069t0.JOIN_GIFT_EXP, (Boolean) null, aVar, 2, (Object) null);
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var == null) {
            C76912y0.makeText(tgVar.f166287d.getContext(), (CharSequence) tgVar.f166287d.getContext().getString(C0966R.string.dlf), 0).show();
        }
    }

    /* renamed from: P0 */
    public void mo12077P0(C117747y yVar, boolean z) {
        C12399ff ffVar;
        Class cls = C0696x.class;
        C50326ly0 ly02 = ((C0696x) mo87696x0(cls)).f1644g;
        if (ly02 != null && ly02.f137710h) {
            C50326ly0 ly03 = ((C0696x) mo87696x0(cls)).f1644g;
            if (ly03 != null && ly03.f137707e) {
                mo12260c1();
                C9114t2 t2Var = this.f36311q;
                if (t2Var != null) {
                    Log.m105924i("FinderLiveFansClubDescWidget", "followSuccess tryFollowing:" + t2Var.f28707B + ",isFollow:" + z);
                    if (z && t2Var.f28707B) {
                        t2Var.f28707B = false;
                        C62660c basePlugin = t2Var.getBasePlugin();
                        if (!(basePlugin == null || (ffVar = (C12399ff) basePlugin.mo87687E0(C12399ff.class)) == null)) {
                            C12399ff.m11972g1(ffVar, false, 1, (Object) null);
                        }
                        t2Var.mo9908b();
                    }
                }
            }
        }
    }

    /* renamed from: T0 */
    public void mo11982T0(Bundle bundle, Object obj) {
        C12678a aVar;
        C13598b0 b0Var = null;
        if (C87412m.m108589b(bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null, "PORTRAIT_ACTION_JOIN_FANS_CLUB") && !mo87688G0()) {
            Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle2 != null) {
                boolean z = false;
                boolean z2 = bundle2.getBoolean("JOIN_FANS_CLUB_NEED_PURCHASE", false);
                int i = bundle2.getInt("JOIN_FANS_CLUB_FROM_SCENE", 0);
                C12678a[] values = C12678a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.f36320d == i) {
                        break;
                    }
                    i2++;
                }
                if (aVar == null) {
                    z = true;
                }
                if (z) {
                    aVar = C12678a.DEFAULT;
                }
                Log.m105924i("FinderLiveVisitorFansClubPanelPlugin", "onPortraitAction needPurcase:" + z2 + ",fromScene:" + aVar);
                mo12260c1();
                C9114t2 t2Var = this.f36311q;
                if (t2Var != null) {
                    t2Var.mo9910d(mo87684A0(), z2, aVar);
                    b0Var = C13598b0.f38549a;
                }
            }
            if (b0Var == null) {
                Log.m105924i("FinderLiveVisitorFansClubPanelPlugin", "onPortraitAction extraData:" + obj);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo12259b1(C12678a aVar) {
        C87412m.m108594g(aVar, "fromScene");
        Log.m105924i("FinderLiveVisitorFansClubPanelPlugin", "checkFansClubState fromScene:" + aVar + ", isActivate:" + C53930o0.m60560g(this.f36310p));
        C53895h.m60466d(this.f36310p, (C66212f) null, (C53934p0) null, new C12679b(this, aVar, (C15601d<? super C12679b>) null), 3, (Object) null);
    }

    /* renamed from: c1 */
    public final void mo12260c1() {
        if (this.f36311q == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C9114t2 t2Var = new C9114t2(context);
            t2Var.setJoinClickListener(new C12681c(this));
            t2Var.setDirectJoinListener(new C12682d(this));
            t2Var.setHelpClickListener(new C12683e(this));
            t2Var.mo9935a(this);
            this.f36311q = t2Var;
        }
    }

    /* renamed from: d1 */
    public final void mo12261d1() {
        if (this.f36313s == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C9012h4 h4Var = new C9012h4(context);
            h4Var.setHelpIconClickListener(new C12684f(this));
            h4Var.setFansGroupClickListener(new C12685g(this, h4Var));
            h4Var.mo9935a(this);
            this.f36313s = h4Var;
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C9184z2 z2Var = this.f36312r;
        if (z2Var != null) {
            z2Var.mo9935a(this);
        }
        C9012h4 h4Var = this.f36313s;
        if (h4Var != null) {
            h4Var.mo9935a(this);
        }
        C8953d3 d3Var = this.f36314t;
        if (d3Var != null) {
            d3Var.mo9935a(this);
        }
        C9114t2 t2Var = this.f36311q;
        if (t2Var != null) {
            t2Var.mo9935a(this);
        }
        if (!C53930o0.m60560g(this.f36310p)) {
            this.f36310p = C53930o0.m60555b();
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            mo3211w0();
        } else if (ordinal == 199) {
            if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
                Log.m105924i("FinderLiveVisitorFansClubPanelPlugin", "青少年模式不展示粉丝");
                C62042e eVar = C62042e.f176370a;
                Context context = this.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                eVar.mo87041S1(context, "青少年模式不展示粉丝");
            } else if (((C0696x) mo87696x0(C0696x.class)).f1643f) {
                mo12261d1();
                C9012h4 h4Var = this.f36313s;
                if (h4Var != null) {
                    h4Var.mo9828d(false);
                }
            } else {
                mo12259b1(C12678a.DEFAULT);
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C9184z2 z2Var = this.f36312r;
        if (z2Var != null) {
            z2Var.f28738f = null;
            C12925w wVar = z2Var.f28899j;
            if (wVar != null) {
                wVar.mo5085n();
            }
            z2Var.f28899j = null;
        }
        C9012h4 h4Var = this.f36313s;
        if (h4Var != null) {
            h4Var.f28738f = null;
            h4Var.mo9827c();
            h4Var.f28475r.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
        }
        C8953d3 d3Var = this.f36314t;
        if (d3Var != null) {
            d3Var.mo9760f();
        }
        C9114t2 t2Var = this.f36311q;
        if (t2Var != null) {
            t2Var.f28738f = null;
            t2Var.mo9909c();
            t2Var.f28721w = null;
            t2Var.f28718t = null;
            t2Var.f28720v = null;
            t2Var.f28722x = false;
            t2Var.f28706A = false;
        }
        C53930o0.m60558e(this.f36310p, (CancellationException) null, 1, (Object) null);
    }
}
