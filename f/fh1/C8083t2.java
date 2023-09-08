package fh1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d50.C58113g;
import d50.C58114h;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gg1.C32444a;
import gh1.C59440c;
import gh1.C59453p;
import gh1.C59461x;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import hh1.C59898g;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C8777j5;
import il1.C9065m6;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kj1.C10099a1;
import kj1.C10102b0;
import kj1.C10103b1;
import kj1.C10112c2;
import kj1.C10120d2;
import kj1.C10125e1;
import kj1.C10139f;
import kj1.C10144f1;
import kj1.C10151g0;
import kj1.C10154g1;
import kj1.C10155g2;
import kj1.C10156h;
import kj1.C10157h0;
import kj1.C10160h1;
import kj1.C10161h2;
import kj1.C10162i;
import kj1.C10167i1;
import kj1.C10174j1;
import kj1.C10181k1;
import kj1.C10186l1;
import kj1.C10187l2;
import kj1.C10194m1;
import kj1.C10199n1;
import kj1.C10200n2;
import kj1.C10203o1;
import kj1.C10207p1;
import kj1.C10211q1;
import kj1.C10213r;
import kj1.C10217r1;
import kj1.C10219s;
import kj1.C10222s0;
import kj1.C10229s1;
import kj1.C10231t;
import kj1.C10232t0;
import kj1.C10233t1;
import kj1.C10234t2;
import kj1.C10235u;
import kj1.C10237u0;
import kj1.C10239u1;
import kj1.C10240u2;
import kj1.C10242v;
import kj1.C10246v0;
import kj1.C10248v1;
import kj1.C10249v2;
import kj1.C10251w;
import kj1.C10252w0;
import kj1.C10257w1;
import kj1.C10258w2;
import kj1.C10265x2;
import kj1.C10272y0;
import kj1.C10275y2;
import lj1.C10533a;
import lj1.C10534b;
import lj1.C10540f;
import o40.C61926c;
import ok1.C62042e;
import p640ox.C77049b;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C52005xq0;
import te3.C64291co3;
import te3.C64890zp2;
import wc3.C15133e0;
import yj1.C16025d;
import yj1.C16029e;

/* renamed from: fh1.t2 */
public final class C8083t2 extends C8313a implements C59440c, C59898g {

    /* renamed from: j */
    public C59453p f26903j;

    /* renamed from: n */
    public View f26904n;

    /* renamed from: o */
    public View f26905o;

    /* renamed from: p */
    public WeImageView f26906p;

    /* renamed from: q */
    public C10125e1 f26907q;

    /* renamed from: fh1.t2$a */
    public static final class C8084a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8083t2 f26908d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8084a(C8083t2 t2Var) {
            super(0);
            this.f26908d = t2Var;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("checkAutoShow moreActionBtn:");
            View view = this.f26908d.f26904n;
            sb.append(view != null ? view.hashCode() : 0);
            Log.m105924i("Finder.MoreActionController", sb.toString());
            View view2 = this.f26908d.f26904n;
            if (view2 != null) {
                view2.performClick();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fh1.t2$b */
    public static final class C8085b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8083t2 f26909d;

        public C8085b(C8083t2 t2Var) {
            this.f26909d = t2Var;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            Intent intent;
            C54067f0.C0064m mVar = C54067f0.C0064m.MORE;
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/MoreActionController$enableBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = ((C55001u) this.f26909d.business(C55001u.class)).f154419p.f182313e + '_' + System.currentTimeMillis();
            ((C54108o) C86312j.m106911c(cls)).getClass();
            C87412m.m108594g(str, "shareId");
            C54067f0 f0Var = C54108o.f151869h;
            f0Var.getClass();
            f0Var.f151429K = str;
            if (C62042e.f176370a.mo87027N0()) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c, mVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            } else {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c2, mVar, (Map) null, (String) null, 6, (Object) null);
            }
            this.f26909d.mo9165F3();
            MMActivity c3 = this.f26909d.mo9306c3();
            if (!(c3 == null || (intent = c3.getIntent()) == null)) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            if (!(!((C54991o) this.f26909d.business(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f26909d.mo9307d3(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2013);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/MoreActionController$enableBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fh1.t2$c */
    public static final class C8086c implements C59461x {

        /* renamed from: a */
        public final /* synthetic */ C8083t2 f26910a;

        public C8086c(C8083t2 t2Var) {
            this.f26910a = t2Var;
        }

        /* renamed from: a */
        public List<C59453p> mo9171a() {
            C59453p pVar = this.f26910a.f26903j;
            return pVar != null ? C26236u.m33719b(pVar) : C64186f0.f181907d;
        }

        /* renamed from: b */
        public List<C59453p> mo9172b() {
            C59453p pVar = this.f26910a.f26903j;
            return pVar != null ? C26236u.m33719b(pVar) : C64186f0.f181907d;
        }

        /* renamed from: c */
        public void mo9173c(boolean z) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8083t2(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: F */
    public void mo9164F() {
        C10125e1 e1Var = this.f26907q;
        if (e1Var != null) {
            C10161h2.m10080a(e1Var, true);
        }
    }

    /* renamed from: F3 */
    public final void mo9165F3() {
        C10125e1.C10127b bVar;
        C58113g gVar;
        C64890zp2 zp22;
        C10125e1 e1Var = this.f26907q;
        if (e1Var != null && (bVar = e1Var.f30988g) != null) {
            Class cls = C54991o.class;
            MMActivity mMActivity = bVar.f31029v.f30985d;
            C62042e eVar = C62042e.f176370a;
            if (eVar.mo87030O0()) {
                if (bVar.f31013f == null) {
                    bVar.f31013f = new C10222s0(mMActivity, bVar.f31029v.f30987f);
                }
                C10222s0 s0Var = bVar.f31013f;
                if (s0Var != null) {
                    int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3401rl);
                    TextView textView = ((C4191v0) ((C36570n) s0Var.f31213c).getValue()).f18475u;
                    if (textView != null) {
                        textView.setTextColor(color);
                    }
                }
                C10222s0 s0Var2 = bVar.f31013f;
                if (s0Var2 != null) {
                    s0Var2.f31225o = new C10174j1(bVar);
                }
                if (s0Var2 != null) {
                    s0Var2.f31226p = new C10181k1(bVar, mMActivity);
                }
                if (s0Var2 != null) {
                    s0Var2.f31227q = new C10186l1(bVar);
                }
                if (s0Var2 != null) {
                    s0Var2.f31228r = new C10194m1(bVar.f31029v);
                }
                if (s0Var2 != null) {
                    s0Var2.f31220j.f31230e = bVar.f31026s;
                }
                if (s0Var2 != null) {
                    s0Var2.f31221k.f31230e = bVar.f31026s;
                }
                if (s0Var2 != null) {
                    s0Var2.f31222l.f31230e = bVar.f31026s;
                }
                if (s0Var2 != null) {
                    ((C4191v0) ((C36570n) s0Var2.f31213c).getValue()).f18472r = new C10144f1(bVar, bVar.f31029v);
                }
                C10252w0.m10204a(bVar.f31029v);
                C10222s0 s0Var3 = bVar.f31013f;
                if (s0Var3 != null) {
                    s0Var3.mo10569c();
                }
            } else if (eVar.mo87027N0()) {
                if (bVar.f31015h == null) {
                    bVar.f31015h = new C10222s0(mMActivity, bVar.f31029v.f30987f);
                }
                C10222s0 s0Var4 = bVar.f31015h;
                if (s0Var4 != null) {
                    int color2 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3401rl);
                    TextView textView2 = ((C4191v0) ((C36570n) s0Var4.f31213c).getValue()).f18475u;
                    if (textView2 != null) {
                        textView2.setTextColor(color2);
                    }
                }
                C10222s0 s0Var5 = bVar.f31015h;
                if (s0Var5 != null) {
                    s0Var5.f31225o = new C10211q1(bVar);
                }
                if (s0Var5 != null) {
                    s0Var5.f31226p = new C10217r1(bVar, mMActivity);
                }
                if (s0Var5 != null) {
                    s0Var5.f31227q = new C10229s1(bVar);
                }
                if (s0Var5 != null) {
                    s0Var5.f31220j.f31230e = bVar.f31026s;
                }
                if (s0Var5 != null) {
                    s0Var5.f31221k.f31230e = bVar.f31026s;
                }
                if (s0Var5 != null) {
                    s0Var5.f31222l.f31230e = bVar.f31026s;
                }
                if (s0Var5 != null) {
                    ((C4191v0) ((C36570n) s0Var5.f31213c).getValue()).f18472r = new C10160h1(bVar, bVar.f31029v);
                }
                C10252w0.m10204a(bVar.f31029v);
                C10222s0 s0Var6 = bVar.f31015h;
                if (s0Var6 != null) {
                    s0Var6.mo10569c();
                }
            } else if (((C54991o) bVar.f31029v.mo10534b(cls)).f154190D) {
                if (bVar.f31014g == null) {
                    bVar.f31014g = new C10222s0(mMActivity, bVar.f31029v.f30987f);
                }
                C10222s0 s0Var7 = bVar.f31014g;
                if (s0Var7 != null) {
                    int color3 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.Link_100);
                    TextView textView3 = ((C4191v0) ((C36570n) s0Var7.f31213c).getValue()).f18475u;
                    if (textView3 != null) {
                        textView3.setTextColor(color3);
                    }
                }
                String str = bVar.f31029v.f30980a;
                StringBuilder sb = new StringBuilder();
                sb.append("buildAssistantBottomSheet: business(LiveCommonSlice::class.java).liveFinderObject.id:");
                FinderObject finderObject = ((C54991o) bVar.f31029v.mo10534b(cls)).f154341n;
                sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
                sb.append(" hlsUrl:");
                C58114h hVar = ((C55001u) bVar.f31029v.mo10534b(C55001u.class)).f154421r;
                sb.append((hVar == null || (gVar = hVar.f166251b) == null || (zp22 = gVar.f166244n) == null) ? null : zp22.f186828z);
                Log.m105924i(str, sb.toString());
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                ((C54116w) c).Hx0(11, (String) null);
                C10222s0 s0Var8 = bVar.f31014g;
                if (s0Var8 != null) {
                    s0Var8.f31225o = new C10199n1(bVar);
                }
                if (s0Var8 != null) {
                    s0Var8.f31226p = new C10203o1(bVar);
                }
                if (s0Var8 != null) {
                    s0Var8.f31227q = new C10207p1(bVar);
                }
                if (s0Var8 != null) {
                    s0Var8.f31220j.f31230e = bVar.f31026s;
                }
                if (s0Var8 != null) {
                    s0Var8.f31221k.f31230e = bVar.f31026s;
                }
                if (s0Var8 != null) {
                    s0Var8.f31222l.f31230e = bVar.f31026s;
                }
                if (s0Var8 != null) {
                    ((C4191v0) ((C36570n) s0Var8.f31213c).getValue()).f18472r = new C10154g1(bVar, bVar.f31029v);
                }
                C10222s0 s0Var9 = bVar.f31014g;
                if (s0Var9 != null) {
                    s0Var9.mo10569c();
                }
            } else {
                if (bVar.f31012e == null) {
                    C77407n nVar = new C77407n((Context) mMActivity, 0, true);
                    bVar.f31012e = nVar;
                    nVar.f225779n1 = bVar.f31029v.f30987f;
                    nVar.f225775k1 = true;
                }
                if (bVar.f31019l == null) {
                    C15133e0 Ct0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
                    bVar.f31019l = Ct0;
                    if (Ct0 != null) {
                        Ct0.hw0();
                    }
                    C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(mMActivity, 14, C64291co3.class);
                    if (co32 != null) {
                        co32.f182544i = 8;
                    }
                }
                C77407n nVar2 = bVar.f31012e;
                if (nVar2 != null) {
                    nVar2.f225792t1 = false;
                }
                if (nVar2 != null) {
                    nVar2.f225771i = new C10233t1(bVar);
                }
                if (nVar2 != null) {
                    nVar2.f225773j = new C10239u1(bVar, mMActivity);
                }
                if (nVar2 != null) {
                    nVar2.f225778n = new C10248v1(bVar, bVar.f31029v);
                }
                if (nVar2 != null) {
                    nVar2.f225795v = new C10257w1(bVar.f31029v);
                }
                if (nVar2 != null) {
                    nVar2.f225782p = bVar.f31026s;
                }
                if (nVar2 != null) {
                    nVar2.f225787r = bVar.f31026s;
                }
                if (nVar2 != null) {
                    nVar2.f225789s = bVar.f31027t;
                }
                if (nVar2 != null) {
                    nVar2.f225791t = bVar.f31028u;
                }
                if (nVar2 != null) {
                    nVar2.f225761d = new C10167i1(bVar, bVar.f31029v, mMActivity);
                }
                if (nVar2 != null) {
                    nVar2.mo107573q();
                }
            }
        }
    }

    /* renamed from: Y2 */
    public void mo9166Y2(int i, Bundle bundle) {
        C10125e1 e1Var;
        if (i == 22) {
            C10125e1 e1Var2 = this.f26907q;
            if (e1Var2 != null) {
                C10161h2.m10080a(e1Var2, true);
            }
        } else if (i == 23 && (e1Var = this.f26907q) != null) {
            C10161h2.m10080a(e1Var, false);
        }
    }

    /* renamed from: e */
    public boolean mo9121e() {
        return false;
    }

    /* renamed from: m3 */
    public final void mo9167m3(Intent intent) {
        Intent intent2;
        Class cls = C54991o.class;
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) : null;
        Log.m105924i("Finder.MoreActionController", "checkAutoShow, doAction:" + valueOf + ", isLiveStarted:" + ((C54991o) business(cls)).mo75999e4());
        if (valueOf != null && valueOf.intValue() == 1 && ((C54991o) business(cls)).mo75999e4()) {
            MMActivity c3 = mo9306c3();
            if (!(c3 == null || (intent2 = c3.getIntent()) == null)) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            C61926c.m72666K(1000, new C8084a(this));
        }
    }

    /* renamed from: n3 */
    public final void mo9168n3() {
        C13598b0 b0Var;
        WeImageView weImageView;
        Class cls = C54991o.class;
        C62042e eVar = C62042e.f176370a;
        if ((eVar.mo87027N0() || ((C54991o) business(cls)).f154190D) && (weImageView = this.f26906p) != null) {
            weImageView.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_more, -1));
        }
        C59453p pVar = this.f26903j;
        if (pVar != null) {
            pVar.mo84560c(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("enableBtn moreActionBtn:");
        View view = this.f26904n;
        sb.append(view != null ? view.hashCode() : 0);
        Log.m105924i("Finder.MoreActionController", sb.toString());
        View view2 = this.f26904n;
        if (view2 != null) {
            view2.setOnClickListener(new C8085b(this));
        }
        MMActivity c3 = mo9306c3();
        if (c3 != null) {
            C10125e1 e1Var = new C10125e1(this, c3);
            this.f26907q = e1Var;
            if (eVar.mo87027N0()) {
                C10533a aVar = new C10533a(e1Var, this.f26905o);
                C10125e1.C10127b bVar = e1Var.f30988g;
                if (bVar != null) {
                    C10125e1 e1Var2 = bVar.f31029v;
                    e1Var2.f30990i = aVar;
                    bVar.mo10552f(new C10272y0(e1Var2, 0));
                    bVar.mo10552f(new C10099a1(bVar.f31029v, 0));
                    bVar.mo10552f(new C10232t0(bVar.f31029v, 0));
                    bVar.mo10552f(new C10246v0(bVar.f31029v, 0));
                    bVar.mo10550d(new C10103b1(bVar.f31029v, 0));
                    bVar.mo10550d(new C10237u0(bVar.f31029v, 0));
                    bVar.mo10550d(new C10231t(bVar.f31029v, 0));
                    bVar.mo10550d(new C10242v(bVar.f31029v, 0));
                    bVar.mo10550d(new C10162i(bVar.f31029v, 0));
                    bVar.mo10551e(new C10139f(bVar.f31029v, 0));
                    bVar.mo10551e(new C10102b0(bVar.f31029v, 0));
                    bVar.mo10551e(new C10251w(bVar.f31029v, 0));
                    bVar.mo10551e(new C10235u(bVar.f31029v, 0));
                    bVar.mo10551e(new C10213r(bVar.f31029v, 0));
                    bVar.mo10551e(new C10219s(bVar.f31029v, 0));
                    bVar.mo10551e(new C10156h(bVar.f31029v, 0));
                    aVar.mo10800b();
                    aVar.mo10806l();
                }
            } else if (((C54991o) business(cls)).f154190D) {
                C10534b bVar2 = new C10534b(e1Var, this.f26905o);
                C10125e1.C10127b bVar3 = e1Var.f30988g;
                if (bVar3 != null) {
                    C10125e1 e1Var3 = bVar3.f31029v;
                    e1Var3.f30990i = bVar2;
                    bVar3.mo10552f(new C10272y0(e1Var3, 3));
                    bVar3.mo10552f(new C10099a1(bVar3.f31029v, 3));
                    bVar3.mo10550d(new C10237u0(bVar3.f31029v, 3));
                    bVar3.mo10551e(new C10151g0(bVar3.f31029v, 3));
                    bVar3.mo10551e(new C10157h0(bVar3.f31029v, 3));
                    bVar2.mo10800b();
                    bVar2.mo10806l();
                }
            } else {
                C10540f fVar = new C10540f(e1Var, this.f26905o);
                C10125e1.C10127b bVar4 = e1Var.f30988g;
                if (bVar4 != null) {
                    C10125e1 e1Var4 = bVar4.f31029v;
                    e1Var4.f30990i = fVar;
                    bVar4.mo10550d(new C10272y0(e1Var4, 2));
                    bVar4.mo10550d(new C10099a1(bVar4.f31029v, 2));
                    bVar4.mo10550d(new C10232t0(bVar4.f31029v, 2));
                    bVar4.mo10550d(new C10249v2(bVar4.f31029v, 2));
                    bVar4.mo10550d(new C10112c2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10103b1(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10120d2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10258w2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10155g2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10265x2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10234t2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10240u2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10200n2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10187l2(bVar4.f31029v, 2));
                    bVar4.mo10551e(new C10275y2(bVar4.f31029v, 2));
                    fVar.mo10800b();
                    fVar.mo10806l();
                }
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f26907q = null;
            Log.m105920e("Finder.MoreActionController", "enbleBtn but activity is null");
        }
    }

    /* renamed from: o3 */
    public final C59453p mo9169o3() {
        return this.f26903j;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1009) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("KEY_IS_FROM_SETTING", false);
            }
            Log.m105924i("Finder.MoreActionController", "REQUEST_FINDER_LIVE_ROLE fromUserGuide:" + z);
            if (i2 != -1 || z) {
                Log.m105924i("Finder.MoreActionController", "REQUEST_FINDER_LIVE_ROLE resultCode:" + i2 + ",data:" + intent);
                return;
            }
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                n5Var.mo75703G(intent);
            }
        }
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    public void onLiveEnd() {
        super.onLiveEnd();
        C10125e1 e1Var = this.f26907q;
        C10125e1.C10127b bVar = e1Var != null ? e1Var.f30988g : null;
        if (bVar != null) {
            bVar.f31009b = false;
        }
        C59453p pVar = this.f26903j;
        if (pVar != null) {
            pVar.mo84560c(4);
        }
    }

    public void onLiveStart(C52005xq0 xq02) {
        super.onLiveStart(xq02);
        Intent intent = null;
        ((C54991o) business(C54991o.class)).f154250R3 = xq02 != null ? xq02.f144857l1 : null;
        mo9168n3();
        MMActivity c3 = mo9306c3();
        if (c3 != null) {
            intent = c3.getIntent();
        }
        mo9167m3(intent);
    }

    public void onNewIntent(Intent intent) {
        mo9167m3(intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C59440c.C8315a.m8366a(this, i, strArr, iArr);
    }

    public boolean onSwipeBack() {
        return false;
    }

    public void onViewMount(ViewGroup viewGroup) {
        Class cls = C54991o.class;
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.dtb);
        C87412m.m108593f(viewGroup2, "rootView");
        this.f26903j = new C59453p(viewGroup2, this);
        this.f27265i = new C8086c(this);
        this.f26904n = viewGroup2.findViewById(C0966R.C0970id.dta);
        this.f26906p = (WeImageView) viewGroup2.findViewById(C0966R.C0970id.dt_);
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.iis);
        this.f26905o = findViewById;
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/controller/MoreActionController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C62042e eVar = C62042e.f176370a;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dtb);
        C87412m.m108593f(findViewById2, "pluginLayout.findViewByI…live_more_action_ui_root)");
        eVar.mo87068c((ViewGroup) findViewById2, mo9310g3());
        if (eVar.mo87027N0() || ((C54991o) business(cls)).f154190D) {
            WeImageView weImageView = this.f26906p;
            if (weImageView != null) {
                weImageView.setImageDrawable(C74933u4.m89768e(viewGroup.getContext(), C0966R.raw.icons_filled_more, -1));
            }
        } else {
            C32444a aVar2 = C32444a.f86121a;
            if (C32444a.f86042C1.mo60266n().intValue() == 0) {
                WeImageView weImageView2 = this.f26906p;
                if (weImageView2 != null) {
                    weImageView2.setImageDrawable(C74933u4.m89768e(viewGroup.getContext(), C0966R.raw.finder_full_share_new, -1));
                }
            } else {
                WeImageView weImageView3 = this.f26906p;
                if (weImageView3 != null) {
                    weImageView3.setImageDrawable(C74933u4.m89768e(viewGroup.getContext(), C0966R.raw.icons_filled_more, -1));
                }
            }
        }
        C59453p pVar = this.f26903j;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
        if (((C54991o) business(cls)).mo75999e4()) {
            mo9168n3();
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C10125e1.C10127b bVar;
        C16025d dVar;
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        C10125e1 e1Var = this.f26907q;
        if (!(e1Var == null || (bVar = e1Var.f30988g) == null)) {
            C9065m6 m6Var = bVar.f31020m;
            if (m6Var != null) {
                m6Var.f28610e = false;
                m6Var.f28609d = null;
                m6Var.f28608c = null;
            }
            C15133e0 e0Var = bVar.f31019l;
            if (e0Var != null) {
                e0Var.dead();
            }
            C16029e eVar = bVar.f31017j;
            if (!(eVar == null || (dVar = (C16025d) ((C36570n) eVar.f43126i).getValue()) == null)) {
                dVar.mo9763a();
            }
            if (C58739j4.f168176a.mo83692U() && bVar.f31022o != null && bVar.mo10553g().isShowing()) {
                bVar.mo10553g().dismiss();
                Log.m105918d(bVar.f31029v.f30980a, "magicLiveCardDebugHalfWebViewDialog dismiss");
            }
        }
        this.f26907q = null;
        C59453p pVar = this.f26903j;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
        this.f26903j = null;
        this.f26904n = null;
        this.f26905o = null;
        this.f26906p = null;
    }

    public void resume() {
        MMActivity c3 = mo9306c3();
        mo9167m3(c3 != null ? c3.getIntent() : null);
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
    }
}
