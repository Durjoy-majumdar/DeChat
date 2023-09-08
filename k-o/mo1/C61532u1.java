package mo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import cm1.C0728e2;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileShopLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileLayoutConfig;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileLayoutConfig$getItemConvertFactory$1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import eb0.C75592q0;
import er1.C58719f2;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import je1.C46534r2;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64513l40;
import vp1.C14937o;
import ye1.C15984y;
import zp3.C16380c;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: mo1.u1 */
public final class C61532u1 extends C11062x {

    /* renamed from: o */
    public final String f174905o = "Finder.FinderProfileShopUIC";

    /* renamed from: p */
    public final C13601g f174906p = C36568h.m40985a(new C61536d(this));

    /* renamed from: q */
    public final C13601g f174907q = C36568h.m40985a(new C61535c(this));

    /* renamed from: r */
    public final C13601g f174908r = C36568h.m40985a(new C61544l(this));

    /* renamed from: s */
    public final C13601g f174909s = C36568h.m40985a(new C61543k(this));

    /* renamed from: t */
    public final C13601g f174910t = C36568h.m40985a(new C61542j(this));

    /* renamed from: u */
    public final C13601g f174911u = C36568h.m40985a(new C61534b(this));

    /* renamed from: v */
    public final C13601g f174912v = C36568h.m40985a(new C61537e(this));

    /* renamed from: w */
    public final C13601g f174913w = C36568h.m40985a(new C61533a(this));

    /* renamed from: x */
    public final Set<Long> f174914x = new LinkedHashSet();

    /* renamed from: mo1.u1$a */
    public static final class C61533a extends C87413o implements C32224a<C16380c> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61533a(C61532u1 u1Var) {
            super(0);
            this.f174915d = u1Var;
        }

        public Object invoke() {
            RefreshLoadMoreLayout e3 = this.f174915d.mo86483e3();
            C87412m.m108593f(e3, "rlLayout");
            return new C16380c(e3);
        }
    }

    /* renamed from: mo1.u1$b */
    public static final class C61534b extends C87413o implements C32224a<FinderProfileShopLoader> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61534b(C61532u1 u1Var) {
            super(0);
            this.f174916d = u1Var;
        }

        public Object invoke() {
            long fromFeedId = this.f174916d.getFromFeedId();
            int intValue = ((Number) ((C36570n) this.f174916d.f174907q).getValue()).intValue();
            String username = this.f174916d.getUsername();
            C87412m.m108591d(username);
            String stringExtra = this.f174916d.getIntent().getStringExtra("key_ec_source");
            if (stringExtra == null) {
                stringExtra = "";
            }
            return new FinderProfileShopLoader(fromFeedId, intValue, username, stringExtra, this.f174916d.getContextObj());
        }
    }

    /* renamed from: mo1.u1$c */
    public static final class C61535c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61535c(C61532u1 u1Var) {
            super(0);
            this.f174917d = u1Var;
        }

        public Object invoke() {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f174917d.getActivity());
            return Integer.valueOf(f != null ? f.f38095h : 0);
        }
    }

    /* renamed from: mo1.u1$d */
    public static final class C61536d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61536d(C61532u1 u1Var) {
            super(0);
            this.f174918d = u1Var;
        }

        public Object invoke() {
            return Long.valueOf(this.f174918d.getActivity().getIntent().getLongExtra("finder_from_feed_id", 0));
        }
    }

    /* renamed from: mo1.u1$e */
    public static final class C61537e extends C87413o implements C32224a<FinderProfileLayoutConfig> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174919d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61537e(C61532u1 u1Var) {
            super(0);
            this.f174919d = u1Var;
        }

        public Object invoke() {
            return new FinderProfileLayoutConfig(this.f174919d.getActivity(), this.f174919d.isSelfFlag(), 1, false, 8, (C8480h) null);
        }
    }

    /* renamed from: mo1.u1$f */
    public static final class C61538f extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C61532u1 f174920a;

        public C61538f(C61532u1 u1Var) {
            this.f174920a = u1Var;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            BaseFeedLoader.requestLoadMore$default(this.f174920a.mo86481c3(), false, 1, (Object) null);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            this.f174920a.mo86481c3().requestRefresh();
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RecyclerView recyclerView = this.f174920a.mo86483e3().getRecyclerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileShopUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileShopUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: mo1.u1$g */
    public static final class C61539g implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174921d;

        public C61539g(C61532u1 u1Var) {
            this.f174921d = u1Var;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            T t;
            FinderItem o;
            String objectNonceId;
            FinderItem o2;
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            C0740i2 i2Var = (C0740i2) oVar.f173503E;
            if (i2Var instanceof C0728e2) {
                this.f174921d.getClass();
                C14937o.C14938a aVar = C14937o.f40972a;
                int i2 = C87412m.m108589b(this.f174921d.getUsername(), C75592q0.m90782l()) ? 1 : 3;
                String username = this.f174921d.getUsername();
                String str = "";
                if (username == null) {
                    username = str;
                }
                Iterator<T> it = aVar.mo13987h(i2, username).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C0740i2) t) instanceof C0797z) {
                        break;
                    }
                }
                C0797z zVar2 = t instanceof C0797z ? (C0797z) t : null;
                long j = (zVar2 == null || (o2 = zVar2.mo3513o()) == null) ? 0 : o2.field_id;
                String str2 = (zVar2 == null || (o = zVar2.mo3513o()) == null || (objectNonceId = o.getObjectNonceId()) == null) ? str : objectNonceId;
                C0728e2 e2Var = (C0728e2) i2Var;
                C64513l40 l402 = e2Var.f1742d.f183185p;
                String str3 = l402 != null ? l402.f184031d : null;
                String str4 = l402 != null ? l402.f184032e : null;
                C61532u1 u1Var = this.f174921d;
                if (str3 != null && str4 != null) {
                    C58719f2 f2Var = C58719f2.f168110a;
                    String username2 = u1Var.getUsername();
                    String str5 = username2 == null ? str : username2;
                    C64370fp1 fp12 = e2Var.f1742d;
                    C64287ci1 e = f2Var.mo83632e(str5, j, str2, fp12, "", fp12.f183185p);
                    String h = f2Var.mo83635h(e);
                    f2Var.mo83636i(e, "commodity_item", C58719f2.m68198d(f2Var, e, (String) null, (String) null, (Integer) null, 14, (Object) null));
                    Activity context = u1Var.getContext();
                    C61546w1 w1Var = r1;
                    C58719f2 f2Var2 = f2Var;
                    String str6 = str3;
                    String str7 = h;
                    C61532u1 u1Var2 = u1Var;
                    C61546w1 w1Var2 = new C61546w1(u1Var, i2Var, str6, str7, e, oVar, str4);
                    f2Var2.mo83638k(context, e, w1Var, true);
                    C7435f2 f2Var3 = C7435f2.f25626a;
                    C49712hj1 contextObj = u1Var2.getContextObj();
                    C104289g gVar = new C104289g();
                    gVar.put("finderusername", u1Var2.getUsername());
                    C0728e2 e2Var2 = e2Var;
                    gVar.put("productid", C61926c.m72691p(e2Var2.f1742d.f183176d));
                    gVar.mo145953n("from_commentscene", ((Number) ((C36570n) u1Var2.f174907q).getValue()).intValue());
                    gVar.put("from_feedid", C61926c.m72691p(u1Var2.getFromFeedId()));
                    String str8 = e2Var2.f1742d.f183193x;
                    if (str8 != null) {
                        str = str8;
                    }
                    gVar.put("request_id", str);
                    C13598b0 b0Var = C13598b0.f38549a;
                    f2Var3.mo8580d(contextObj, "poster_prod", true, gVar);
                    if (u1Var2.getFromFeedId() != 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("feedActionType", 74);
                        hashMap.put("strValue", C61926c.m72691p(e2Var2.f1742d.f183176d));
                        u1Var2.mo86484f3(C58739j4.f168176a.mo83702c(hashMap));
                    }
                }
            }
        }
    }

    /* renamed from: mo1.u1$h */
    public static final class C61540h extends C23555k.C23558c {

        /* renamed from: a */
        public final HashSet<Long> f174922a = new HashSet<>();

        /* renamed from: b */
        public final /* synthetic */ C61532u1 f174923b;

        public C61540h(C61532u1 u1Var) {
            this.f174923b = u1Var;
        }

        /* renamed from: d */
        public boolean mo777d() {
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: cm1.e2} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo778e(android.view.View r8, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.C16631z> r9) {
            /*
                r7 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r8 = "exposedHolders"
                gy3.C87412m.m108594g(r9, r8)
                mo1.u1 r8 = r7.f174923b
                java.util.Iterator r9 = r9.iterator()
            L_0x0010:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x00f8
                java.lang.Object r0 = r9.next()
                androidx.recyclerview.widget.RecyclerView$z r0 = (androidx.recyclerview.widget.RecyclerView.C16631z) r0
                boolean r1 = r0 instanceof jq3.C60905o
                r2 = 0
                if (r1 == 0) goto L_0x0024
                jq3.o r0 = (jq3.C60905o) r0
                goto L_0x0025
            L_0x0024:
                r0 = r2
            L_0x0025:
                if (r0 == 0) goto L_0x0010
                java.lang.Object r0 = r0.f173503E
                boolean r1 = r0 instanceof cm1.C0728e2
                if (r1 == 0) goto L_0x0030
                r2 = r0
                cm1.e2 r2 = (cm1.C0728e2) r2
            L_0x0030:
                if (r2 == 0) goto L_0x0010
                long r0 = r8.getFromFeedId()
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0081
                java.util.Set<java.lang.Long> r0 = r8.f174914x
                te3.fp1 r1 = r2.f1742d
                long r3 = r1.f183176d
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x004d
                goto L_0x0081
            L_0x004d:
                java.util.Set<java.lang.Long> r0 = r8.f174914x
                te3.fp1 r1 = r2.f1742d
                long r3 = r1.f183176d
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r0.add(r1)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1 = 73
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "feedActionType"
                r0.put(r3, r1)
                te3.fp1 r1 = r2.f1742d
                long r3 = r1.f183176d
                java.lang.String r1 = o40.C61926c.m72691p(r3)
                java.lang.String r3 = "strValue"
                r0.put(r3, r1)
                er1.j4 r1 = er1.C58739j4.f168176a
                java.lang.String r0 = r1.mo83702c(r0)
                r8.mo86484f3(r0)
            L_0x0081:
                java.util.HashSet<java.lang.Long> r0 = r7.f174922a
                te3.fp1 r1 = r2.f1742d
                long r3 = r1.f183176d
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0093
                goto L_0x0010
            L_0x0093:
                java.util.HashSet<java.lang.Long> r0 = r7.f174922a
                te3.fp1 r1 = r2.f1742d
                long r3 = r1.f183176d
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r0.add(r1)
                dp1.f2 r0 = dp1.C7435f2.f25626a
                te3.hj1 r1 = r8.getContextObj()
                r3 = 0
                c30.g r4 = new c30.g
                r4.<init>()
                java.lang.String r5 = r8.getUsername()
                java.lang.String r6 = "finderusername"
                r4.put(r6, r5)
                te3.fp1 r5 = r2.f1742d
                long r5 = r5.f183176d
                java.lang.String r5 = o40.C61926c.m72691p(r5)
                java.lang.String r6 = "productid"
                r4.put(r6, r5)
                rx3.g r5 = r8.f174907q
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                java.lang.String r6 = "from_commentscene"
                r4.mo145953n(r6, r5)
                long r5 = r8.getFromFeedId()
                java.lang.String r5 = o40.C61926c.m72691p(r5)
                java.lang.String r6 = "from_feedid"
                r4.put(r6, r5)
                te3.fp1 r2 = r2.f1742d
                java.lang.String r2 = r2.f183193x
                if (r2 != 0) goto L_0x00ea
                java.lang.String r2 = ""
            L_0x00ea:
                java.lang.String r5 = "request_id"
                r4.put(r5, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "poster_prod"
                r0.mo8580d(r1, r2, r3, r4)
                goto L_0x0010
            L_0x00f8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mo1.C61532u1.C61540h.mo778e(android.view.View, java.util.List):void");
        }
    }

    /* renamed from: mo1.u1$i */
    public static final class C61541i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61541i(C61532u1 u1Var) {
            super(0);
            this.f174924d = u1Var;
        }

        public Object invoke() {
            String str = this.f174924d.f174905o;
            Log.m105924i(str, "[fetchEndCallback] totalSize=" + this.f174924d.mo86481c3().getSize());
            View loadMoreFooter = this.f174924d.mo86483e3().getLoadMoreFooter();
            if (loadMoreFooter != null) {
                C61532u1 u1Var = this.f174924d;
                TextView textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                if (textView != null) {
                    textView.setText(C0966R.string.eat);
                }
                TextView textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                if (textView2 != null) {
                    textView2.setTextColor(u1Var.getActivity().getResources().getColor(C0966R.color.FG_2));
                }
                TextView textView3 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileShopUIC$onCreate$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileShopUIC$onCreate$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f174924d.mo86483e3().setHasBottomMore(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mo1.u1$j */
    public static final class C61542j extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61542j(C61532u1 u1Var) {
            super(0);
            this.f174925d = u1Var;
        }

        public Object invoke() {
            return this.f174925d.mo86483e3().getRecyclerView();
        }
    }

    /* renamed from: mo1.u1$k */
    public static final class C61543k extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61543k(C61532u1 u1Var) {
            super(0);
            this.f174926d = u1Var;
        }

        public Object invoke() {
            return ((C15984y) ((C36570n) this.f174926d.f174908r).getValue()).f43022c;
        }
    }

    /* renamed from: mo1.u1$l */
    public static final class C61544l extends C87413o implements C32224a<C15984y> {

        /* renamed from: d */
        public final /* synthetic */ C61532u1 f174927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61544l(C61532u1 u1Var) {
            super(0);
            this.f174927d = u1Var;
        }

        public Object invoke() {
            return C15984y.m14892a(this.f174927d.findViewById(C0966R.C0970id.gks));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61532u1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final FinderProfileShopLoader mo86481c3() {
        return (FinderProfileShopLoader) ((C36570n) this.f174911u).getValue();
    }

    /* renamed from: d3 */
    public final RecyclerView mo86482d3() {
        return (RecyclerView) ((C36570n) this.f174910t).getValue();
    }

    /* renamed from: e3 */
    public final RefreshLoadMoreLayout mo86483e3() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f174909s).getValue();
    }

    /* renamed from: f3 */
    public final void mo86484f3(String str) {
        C48978cb0 cb02 = new C48978cb0();
        cb02.f131607d = getFromFeedId();
        String Cu = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(getFromFeedId(), getContextObj().f134677n);
        cb02.f131609f = Cu;
        cb02.f131610g = str;
        String str2 = this.f174905o;
        Log.m105924i(str2, "reportExtStats json=" + str + ", sessionBuffer=" + Cu);
        C86709a0.m107524d().mo123460f(new C46534r2(getContextObj(), 18054, cb02, Cu));
    }

    public final long getFromFeedId() {
        return ((Number) ((C36570n) this.f174906p).getValue()).longValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.anw;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C15984y) ((C36570n) this.f174908r).getValue()).f43021b.setVisibility(8);
        mo86481c3().register((C16380c) ((C36570n) this.f174913w).getValue());
        mo86483e3().setEnableRefresh(false);
        mo86483e3().setSuperNestedScroll(true);
        mo86483e3().setActionCallback(new C61538f(this));
        RefreshLoadMoreLayout e3 = mo86483e3();
        View inflate = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(activity).in…t.load_more_footer, null)");
        e3.setLoadMoreFooter(inflate);
        mo86482d3().setLayoutManager(((FinderProfileLayoutConfig) ((C36570n) this.f174912v).getValue()).mo3666d(getActivity()));
        mo86482d3().mo17085h0(((FinderProfileLayoutConfig) ((C36570n) this.f174912v).getValue()).mo3665c());
        RecyclerView d3 = mo86482d3();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        d3.setRecycledViewPool(((FinderProfileLayoutConfig) ((C36570n) this.f174912v).getValue()).mo3667e((MMActivity) activity));
        RecyclerView d35 = mo86482d3();
        FinderProfileLayoutConfig finderProfileLayoutConfig = (FinderProfileLayoutConfig) ((C36570n) this.f174912v).getValue();
        finderProfileLayoutConfig.getClass();
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderProfileLayoutConfig$getItemConvertFactory$1(finderProfileLayoutConfig, (C32226l<? super Integer, ? extends C60896i<?>>) null), mo86481c3().getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f173488o = new C61539g(this);
        d35.setAdapter(wxRecyclerAdapter);
        C23564m.m28137g(mo86482d3(), new C61540h(this));
        mo86481c3().f158735h = new C61541i(this);
    }

    public void onDestroy() {
        super.onDestroy();
        mo86481c3().unregister((C16380c) ((C36570n) this.f174913w).getValue());
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        this.f174914x.clear();
        if (getFromFeedId() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("feedActionType", 72);
            mo86484f3(C58739j4.f168176a.mo83702c(hashMap));
        }
    }
}
