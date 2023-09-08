package kf1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0751m0;
import cm1.C0768q0;
import cm1.C55031t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.C2495x84d94b26;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C7433e1;
import er1.C58736i1;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7888v2;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fo1.C59264a;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C59667n2;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C46530q2;
import je1.C60811w;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60905o;
import jq3.C9500j;
import ms3.C11091a;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13605o;
import sf1.C13672b;
import te3.C49712hj1;
import te3.C50542nh0;
import te3.C50687oi1;
import te3.C51954xc1;
import te3.C64273c21;
import tf0.C64916p1;
import vp1.C65838f;
import wc3.C15133e0;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: kf1.c */
public abstract class C9640c implements C59264a<C9707f>, C10008v1, C9487b<C9486a>, C9843l7 {

    /* renamed from: d */
    public final MMActivity f29961d;

    /* renamed from: e */
    public final int f29962e;

    /* renamed from: f */
    public final String f29963f;

    /* renamed from: g */
    public C9707f f29964g;

    /* renamed from: h */
    public RecyclerView.C16623q f29965h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<C9486a> f29966i;

    /* renamed from: j */
    public int f29967j;

    /* renamed from: n */
    public final C15133e0 f29968n;

    /* renamed from: o */
    public final FinderVideoCore f29969o;

    /* renamed from: p */
    public Dialog f29970p;

    /* renamed from: q */
    public final C2495x84d94b26 f29971q;

    /* renamed from: kf1.c$a */
    public static final class C9641a extends C87413o implements C32226l<C13605o<? extends String, ? extends String, ? extends String>, C13598b0> {

        /* renamed from: d */
        public static final C9641a f29972d = new C9641a();

        public C9641a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C13605o) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.c$b */
    public static final class C9642b extends C87413o implements C32226l<C58784w3.C7912a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C76874e0 f29973d;

        /* renamed from: e */
        public final /* synthetic */ C9640c f29974e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f29975f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9642b(C76874e0 e0Var, C9640c cVar, C77407n nVar) {
            super(1);
            this.f29973d = e0Var;
            this.f29974e = cVar;
            this.f29975f = nVar;
        }

        public Object invoke(Object obj) {
            C58784w3.C7912a aVar = (C58784w3.C7912a) obj;
            C87412m.m108594g(aVar, "actionMenuInfo");
            if (!aVar.f26590l && this.f29973d.findItem(208) == null) {
                this.f29973d.mo107150j(208, aVar.f26586h, C0966R.raw.bottomsheet_icon_wework, 0, aVar.f26582d);
                C58784w3.f168295a.mo83895P1(this.f29974e.f29961d, this.f29975f);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.c$c */
    public static final class C9643c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f29976d;

        /* renamed from: e */
        public final /* synthetic */ C9640c f29977e;

        /* renamed from: f */
        public final /* synthetic */ MenuItem f29978f;

        /* renamed from: g */
        public final /* synthetic */ int f29979g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9643c(BaseFinderFeed baseFinderFeed, C9640c cVar, MenuItem menuItem, int i) {
            super(1);
            this.f29976d = baseFinderFeed;
            this.f29977e = cVar;
            this.f29978f = menuItem;
            this.f29979g = i;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            Class cls = C64916p1.class;
            C87412m.m108594g(str, "userName");
            if (this.f29976d.mo3513o().isLiveFeed()) {
                String str2 = str;
                ((C64916p1) C86312j.m106911c(cls)).mo76724vV(this.f29977e.f29961d, str2, (C76875f0) this.f29978f, this.f29976d.mo3513o(), new C9681d(this.f29976d));
            } else {
                String str3 = str;
                ((C64916p1) C86312j.m106911c(cls)).mo76652BO(this.f29977e.f29961d, str3, (C76875f0) this.f29978f, this.f29976d.mo3513o(), (C32226l<? super List<String>, C13598b0>) null);
            }
            C7433e1.f25622a.mo8575d(this.f29977e.f29961d, str, this.f29976d.getItemId(), this.f29979g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.c$d */
    public static final class C9644d extends C87413o implements C32226l<List<? extends String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f29980d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9644d(BaseFinderFeed baseFinderFeed) {
            super(1);
            this.f29980d = baseFinderFeed;
        }

        public Object invoke(Object obj) {
            List<String> list = (List) obj;
            if (this.f29980d.mo3513o().isLiveFeed()) {
                String str = "";
                JSONObject jSONObject = new JSONObject();
                if (list != null) {
                    for (String str2 : list) {
                        str = str + str2 + ';';
                    }
                }
                Long l = null;
                if (C112551y.m153808h(str, ";", false, 2, (Object) null)) {
                    str = str.substring(0, str.length() - 1);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                jSONObject.put("share_username", str);
                C11091a aVar = C11091a.f32868a;
                C64273c21 liveInfo = this.f29980d.mo3513o().getLiveInfo();
                if (liveInfo != null) {
                    l = Long.valueOf(liveInfo.f182392d);
                }
                C11091a.m10992b(aVar, String.valueOf(l), String.valueOf(this.f29980d.mo3513o().getFeedObject().f164794id), this.f29980d.mo3513o().getFeedObject().username, "1", "1", "0", jSONObject, (String) null, 128, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.c$e */
    public static final class C9645e implements C8794p5<C51954xc1> {

        /* renamed from: d */
        public final /* synthetic */ C9640c f29981d;

        public C9645e(C9640c cVar) {
            this.f29981d = cVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C51954xc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            if (nh02.f138603e == 0) {
                C76912y0.makeText((Context) this.f29981d.f29961d, (int) C0966R.string.d9x, 0).show();
                return;
            }
            C76912y0.makeText((Context) this.f29981d.f29961d, (int) C0966R.string.d9w, 0).show();
            String N = this.f29981d.mo2546N();
            Log.m105924i(N, "finder_feed_open_comment_no_ok " + nh02.f138603e);
        }
    }

    /* renamed from: kf1.c$f */
    public static final class C9646f implements C8794p5<C51954xc1> {

        /* renamed from: d */
        public final /* synthetic */ C9640c f29982d;

        public C9646f(C9640c cVar) {
            this.f29982d = cVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C51954xc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            if (nh02.f138603e == 0) {
                C76912y0.makeText((Context) this.f29982d.f29961d, (int) C0966R.string.d8t, 0).show();
                return;
            }
            C76912y0.makeText((Context) this.f29982d.f29961d, (int) C0966R.string.d8s, 0).show();
            String N = this.f29982d.mo2546N();
            Log.m105924i(N, "finder_feed_close_comment_ok " + nh02.f138603e);
        }
    }

    /* renamed from: kf1.c$g */
    public static final class C9647g extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f29983d;

        /* renamed from: e */
        public final /* synthetic */ C9640c f29984e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9647g(Object obj, C9640c cVar) {
            super(1);
            this.f29983d = obj;
            this.f29984e = cVar;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            Object obj2 = this.f29983d;
            if (obj2 != null) {
                ((C59667n2) obj2).mo4259i(this.f29984e.mo2546N());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.c$h */
    public static final class C9648h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f29985d;

        /* renamed from: e */
        public final /* synthetic */ C9640c f29986e;

        /* renamed from: kf1.c$h$a */
        public static final class C9649a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C9649a f29987d = new C9649a();

            public final void onCancel(DialogInterface dialogInterface) {
            }
        }

        /* renamed from: kf1.c$h$b */
        public static final class C9650b implements C11385n {

            /* renamed from: d */
            public final /* synthetic */ C46530q2 f29988d;

            /* renamed from: e */
            public final /* synthetic */ C9640c f29989e;

            /* renamed from: kf1.c$h$b$a */
            public static final class C9651a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C9640c f29990d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C9651a(C9640c cVar) {
                    super(0);
                    this.f29990d = cVar;
                }

                public Object invoke() {
                    ArrayList<C0740i2> n = this.f29990d.mo2492n();
                    boolean z = true;
                    if (n == null || !n.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        this.f29990d.f29961d.finish();
                    }
                    return C13598b0.f38549a;
                }
            }

            public C9650b(C46530q2 q2Var, C9640c cVar) {
                this.f29988d = q2Var;
                this.f29989e = cVar;
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                if ((yVar instanceof C46530q2) && ((C46530q2) yVar).f125356i == this.f29988d.f125356i) {
                    C89137b0 d = C86709a0.m107524d();
                    this.f29988d.getClass();
                    d.mo123470p(3627, this);
                }
                Dialog dialog = this.f29989e.f29970p;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (i == 0 && i2 == 0) {
                    C61926c.m72668M(new C9651a(this.f29989e));
                } else {
                    C76912y0.makeText((Context) this.f29989e.f29961d, (int) C0966R.string.ejw, 0).show();
                }
            }
        }

        public C9648h(BaseFinderFeed baseFinderFeed, C9640c cVar) {
            this.f29985d = baseFinderFeed;
            this.f29986e = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C13598b0 b0Var;
            C46530q2 q2Var = new C46530q2(C66785b.f191882e.mo90662O5(), this.f29985d.mo3513o().getFeedObject());
            Dialog dialog = this.f29986e.f29970p;
            if (dialog != null) {
                dialog.show();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C9640c cVar = this.f29986e;
                MMActivity mMActivity = cVar.f29961d;
                cVar.f29970p = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), cVar.f29961d.getString(C0966R.string.a4d), true, false, C9649a.f29987d);
            }
            C86709a0.m107524d().mo123455a(3627, new C9650b(q2Var, this.f29986e));
            C86709a0.m107524d().mo123460f(q2Var);
        }
    }

    /* renamed from: kf1.c$i */
    public static final class C9652i implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C9640c f29991d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f29992e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f29993f;

        /* renamed from: g */
        public final /* synthetic */ int f29994g;

        public C9652i(C9640c cVar, BaseFinderFeed baseFinderFeed, C77407n nVar, int i) {
            this.f29991d = cVar;
            this.f29992e = baseFinderFeed;
            this.f29993f = nVar;
            this.f29994g = i;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C9640c cVar = this.f29991d;
            BaseFinderFeed baseFinderFeed = this.f29992e;
            C87412m.m108593f(e0Var, "menu");
            cVar.mo4150q(baseFinderFeed, e0Var, this.f29993f, this.f29994g);
        }
    }

    /* renamed from: kf1.c$j */
    public static final class C9653j implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C9640c f29995d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f29996e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f29997f;

        public C9653j(C9640c cVar, BaseFinderFeed baseFinderFeed, C77407n nVar) {
            this.f29995d = cVar;
            this.f29996e = baseFinderFeed;
            this.f29997f = nVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C9640c cVar = this.f29995d;
            BaseFinderFeed baseFinderFeed = this.f29996e;
            C87412m.m108593f(e0Var, "menu");
            C77407n nVar = this.f29997f;
            cVar.getClass();
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar, "sheet");
            if (!baseFinderFeed.mo3513o().isNotShareConversation() && !C58784w3.f168295a.mo83855A0(baseFinderFeed.mo3513o().getFeedObject())) {
                C7888v2.f26513a.mo9004b(cVar.f29961d, cVar.f29968n, baseFinderFeed, e0Var, nVar);
            }
        }
    }

    /* renamed from: kf1.c$k */
    public static final class C9654k implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C9640c f29998d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f29999e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f30000f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f30001g;

        public C9654k(C9640c cVar, BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
            this.f29998d = cVar;
            this.f29999e = baseFinderFeed;
            this.f30000f = nVar;
            this.f30001g = oVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C9640c cVar = this.f29998d;
            BaseFinderFeed baseFinderFeed = this.f29999e;
            C87412m.m108593f(e0Var, "menu");
            cVar.mo2496t(baseFinderFeed, e0Var, this.f30000f, this.f30001g);
            C7433e1.f25622a.mo8573b(e0Var);
        }
    }

    /* renamed from: kf1.c$l */
    public static final class C9655l implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C9640c f30002d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f30003e;

        public C9655l(C9640c cVar, BaseFinderFeed baseFinderFeed) {
            this.f30002d = cVar;
            this.f30003e = baseFinderFeed;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C9640c cVar = this.f30002d;
            BaseFinderFeed baseFinderFeed = this.f30003e;
            C87412m.m108593f(e0Var, "menu");
            cVar.getClass();
            C87412m.m108594g(baseFinderFeed, "feed");
        }
    }

    /* renamed from: kf1.c$m */
    public static final class C9656m implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ C9640c f30004a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f30005b;

        /* renamed from: c */
        public final /* synthetic */ C77407n f30006c;

        /* renamed from: d */
        public final /* synthetic */ C60905o f30007d;

        public C9656m(C9640c cVar, BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
            this.f30004a = cVar;
            this.f30005b = baseFinderFeed;
            this.f30006c = nVar;
            this.f30007d = oVar;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            C7888v2.C7889a aVar = C7888v2.f26513a;
            C15133e0 e0Var = this.f30004a.f29968n;
            BaseFinderFeed baseFinderFeed = this.f30005b;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            C77407n nVar = this.f30006c;
            Context context = this.f30007d.f173499A;
            C87412m.m108593f(context, "holder.context");
            boolean j = aVar.mo9012j(e0Var, baseFinderFeed, (C76875f0) menuItem, nVar, context);
            String N = this.f30004a.mo2546N();
            Log.m105924i(N, "getMoreMenuItemLongSelectedListener :" + j);
        }
    }

    /* renamed from: kf1.c$n */
    public static final class C9657n implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f30008d;

        /* renamed from: e */
        public final /* synthetic */ C9640c f30009e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f30010f;

        /* renamed from: g */
        public final /* synthetic */ int f30011g;

        /* renamed from: h */
        public final /* synthetic */ C60905o f30012h;

        public C9657n(C32224a<C13598b0> aVar, C9640c cVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
            this.f30008d = aVar;
            this.f30009e = cVar;
            this.f30010f = baseFinderFeed;
            this.f30011g = i;
            this.f30012h = oVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C32224a<C13598b0> aVar = this.f30008d;
            if (aVar != null) {
                aVar.invoke();
            }
            C9640c cVar = this.f30009e;
            BaseFinderFeed baseFinderFeed = this.f30010f;
            C87412m.m108593f(menuItem, "menuItem");
            cVar.mo2647x(baseFinderFeed, menuItem, i, this.f30011g, this.f30012h);
        }
    }

    /* renamed from: kf1.c$o */
    public static final class C9658o implements C11183n0 {

        /* renamed from: a */
        public final /* synthetic */ C9640c f30013a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f30014b;

        public C9658o(C9640c cVar, BaseFinderFeed baseFinderFeed) {
            this.f30013a = cVar;
            this.f30014b = baseFinderFeed;
        }

        /* renamed from: a */
        public final void mo2585a(View view, int i, MenuItem menuItem) {
            C58736i1 i1Var = C58736i1.f168173a;
            MMActivity mMActivity = this.f30013a.f29961d;
            C87412m.m108593f(view, "menuView");
            C87412m.m108593f(menuItem, "menuItem");
            i1Var.mo83667m(mMActivity, view, i, menuItem, this.f30014b);
        }
    }

    /* renamed from: kf1.c$p */
    public static final class C9659p implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C9640c f30015d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f30016e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f30017f;

        public C9659p(C9640c cVar, BaseFinderFeed baseFinderFeed, C60905o oVar) {
            this.f30015d = cVar;
            this.f30016e = baseFinderFeed;
            this.f30017f = oVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C9640c cVar = this.f30015d;
            BaseFinderFeed baseFinderFeed = this.f30016e;
            C87412m.m108593f(menuItem, "menuItem");
            cVar.mo2647x(baseFinderFeed, menuItem, i, 3, this.f30017f);
        }
    }

    /* renamed from: kf1.c$q */
    public static final class C9660q extends C87413o implements C32226l<Integer, List<? extends Long>> {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f30018d;

        /* renamed from: e */
        public final /* synthetic */ C9640c f30019e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9660q(BaseFinderFeed baseFinderFeed, C9640c cVar) {
            super(1);
            this.f30018d = baseFinderFeed;
            this.f30019e = cVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            LinkedList linkedList = new LinkedList();
            linkedList.add(Long.valueOf(this.f30018d.mo3513o().getCreateTime()));
            String N = this.f30019e.mo2546N();
            Log.m105924i(N, "[UNINTEREST]  subType=" + intValue);
            FeedDeleteEvent feedDeleteEvent = new FeedDeleteEvent();
            feedDeleteEvent.f9154d.f9155a = this.f30018d.mo3513o().getId();
            feedDeleteEvent.publish();
            return linkedList;
        }
    }

    /* renamed from: kf1.c$r */
    public static final class C9661r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9640c f30020d;

        public C9661r(C9640c cVar) {
            this.f30020d = cVar;
        }

        public final void run() {
            this.f30020d.f29968n.hw0();
        }
    }

    public C9640c(MMActivity mMActivity, int i, int i2, C8480h hVar) {
        if ((i2 & 2) != 0) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
            i = f != null ? f.f38096i : 0;
        }
        C87412m.m108594g(mMActivity, "context");
        this.f29961d = mMActivity;
        this.f29962e = i;
        this.f29963f = "Finder.FinderLoaderFeedUIContract.Presenter";
        this.f29966i = new CopyOnWriteArraySet<>();
        this.f29968n = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
        RecyclerView.C16623q qVar = new RecyclerView.C16623q();
        this.f29965h = qVar;
        qVar.mo17336e(1, 10);
        this.f29965h.mo17336e(2, 10);
        this.f29969o = new FinderVideoCore(0, 1, (C8480h) null);
        this.f29971q = new C2495x84d94b26(this);
    }

    /* renamed from: A1 */
    public C11182m0 mo2569A1(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C9653j(this, baseFinderFeed, nVar);
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: B5 */
    public C11182m0 mo2570B5(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C9655l(this, baseFinderFeed);
    }

    /* renamed from: D1 */
    public RecyclerView.C16623q mo2571D1() {
        return this.f29965h;
    }

    /* renamed from: G */
    public abstract C0740i2 mo2486G(int i);

    /* renamed from: J0 */
    public void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i) {
        int i2;
        C87412m.m108594g(baseFinderFeed, "feed");
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3();
        C0751m0 m0Var = C0751m0.f1769a;
        MMActivity mMActivity = this.f29961d;
        int i3 = C60811w.f173196u;
        C0751m0.m691b(m0Var, mMActivity, q3, baseFinderFeed, z ? 1 : 2, false, i, 16, (Object) null);
        C58961d.C58963b bVar = C58961d.f168673a;
        C58969q l = baseFinderFeed.mo3507l();
        String username = l != null ? l.getUsername() : "";
        if (z) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            i2 = C58969q.f168707c2;
        } else {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C58969q.f168705a2;
            i2 = 0;
        }
        bVar.mo84161i(username, i2);
    }

    /* renamed from: L0 */
    public final boolean mo10275L0(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C58969q l = baseFinderFeed.mo3507l();
        return C112551y.m153810j(l != null ? l.field_username : null, C66785b.f191882e.mo90662O5(), false, 2, (Object) null);
    }

    /* renamed from: M0 */
    public boolean mo4148M0(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        return false;
    }

    /* renamed from: N */
    public String mo2546N() {
        return this.f29963f;
    }

    /* renamed from: N0 */
    public void mo2487N0(C9707f fVar) {
        C87412m.m108594g(fVar, "callback");
        this.f29964g = fVar;
        mo2493n0();
        this.f29971q.alive();
        FinderVideoCore finderVideoCore = this.f29969o;
        C9707f fVar2 = this.f29964g;
        C87412m.m108591d(fVar2);
        FinderVideoCore.m65069F1(finderVideoCore, fVar2.f30122d, new C9692e(this), false, 4, (Object) null);
    }

    /* renamed from: S0 */
    public boolean mo10276S0() {
        C56597e1 v;
        C9707f fVar = this.f29964g;
        if (fVar == null || (v = fVar.mo10313v()) == null || !v.mo79924b()) {
            C9707f fVar2 = this.f29964g;
            if (fVar2 != null) {
                FinderLikeDrawer y = fVar2.mo10314y();
                if (y.mo82541i()) {
                    y.mo4615l();
                    return true;
                }
            }
            C9707f fVar3 = this.f29964g;
            if (fVar3 == null) {
                return false;
            }
            FinderLikeDrawer finderLikeDrawer = fVar3.f30126h;
            if (finderLikeDrawer == null) {
                C87412m.m108603p("friendLikeDrawer");
                throw null;
            } else if (!finderLikeDrawer.mo82541i()) {
                return false;
            } else {
                finderLikeDrawer.mo4615l();
                return true;
            }
        } else {
            v.mo79923a();
            return true;
        }
    }

    /* renamed from: T0 */
    public void mo10277T0() {
        this.f29968n.dead();
    }

    /* renamed from: U */
    public abstract C9500j mo2488U();

    /* renamed from: W0 */
    public void mo10278W0() {
        RecyclerView recyclerView;
        C9707f fVar = this.f29964g;
        if (fVar != null && (recyclerView = fVar.getRecyclerView()) != null) {
            recyclerView.post(new C9661r(this));
        }
    }

    /* renamed from: X2 */
    public C11184p0 mo2573X2(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C9659p(this, baseFinderFeed, oVar);
    }

    /* renamed from: Y4 */
    public C11184p0 mo2574Y4(BaseFinderFeed baseFinderFeed, int i, C60905o oVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C9657n(aVar, this, baseFinderFeed, i, oVar);
    }

    /* renamed from: d7 */
    public C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        return new C9654k(this, baseFinderFeed, nVar, oVar);
    }

    /* renamed from: f0 */
    public abstract DataBuffer<C0740i2> mo2491f0();

    /* renamed from: f5 */
    public C47269o0 mo2575f5(C77407n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C9656m(this, baseFinderFeed, nVar, oVar);
    }

    public MMActivity getActivity() {
        return this.f29961d;
    }

    /* renamed from: j0 */
    public void mo4149j0(BaseFinderFeed baseFinderFeed, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        int e = mo2490e(baseFinderFeed);
        if (e >= 0) {
            C13672b.f38719a.mo13059a(this.f29961d, baseFinderFeed.mo3513o().getId(), baseFinderFeed.mo3513o().getObjectNonceId(), Boolean.valueOf(baseFinderFeed.mo3513o().isLiveFeed()), new C9660q(baseFinderFeed, this));
            C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
            boolean z = true;
            if (oi12 == null || oi12.f139196d != 1) {
                z = false;
            }
            String string = z ? this.f29961d.getResources().getString(C0966R.string.f8158pz) : this.f29961d.getResources().getString(C0966R.string.emj);
            C87412m.m108593f(string, "if(FinderAccountAccess.a…dation)\n                }");
            C76912y0.m92769h(this.f29961d, string, C0966R.raw.icons_filled_done);
            return;
        }
        String N = mo2546N();
        Log.m105924i(N, "[UNINTEREST] pos error " + e);
    }

    public void keep(C9486a aVar) {
        this.f29966i.add(aVar);
    }

    /* renamed from: n0 */
    public abstract void mo2493n0();

    /* renamed from: n6 */
    public void mo2577n6(FinderItem finderItem, boolean z, C60905o oVar, int i) {
        C87412m.m108594g(finderItem, "feed");
        C55031t.f154490a.mo76085a(this.f29961d, finderItem, z, 2, i);
    }

    /* renamed from: o */
    public abstract void mo2494o();

    public void onDetach() {
        C65838f.f189333a.mo89882c();
        for (C9486a dead : this.f29966i) {
            dead.dead();
        }
        this.f29966i.clear();
        this.f29971q.dead();
        this.f29964g = null;
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: p1 */
    public FinderVideoCore mo2578p1() {
        return this.f29969o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d1, code lost:
        r1 = r1.video_tmpl_info;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a4  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4150q(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r25, nj3.C76874e0 r26, qo3.C77407n r27, int r28) {
        /*
            r24 = this;
            r0 = r24
            r9 = r25
            r10 = r26
            r1 = r27
            java.lang.Class<dp1.y0> r11 = dp1.C58417y0.class
            java.lang.String r2 = "feed"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.String r2 = "menu"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "sheet"
            gy3.C87412m.m108594g(r1, r2)
            er1.w3 r12 = er1.C58784w3.f168295a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            kf1.c$a r5 = kf1.C9640c.C9641a.f29972d
            kf1.c$b r6 = new kf1.c$b
            r6.<init>(r10, r0, r1)
            r4 = 0
            r7 = 4
            r8 = 0
            r1 = r12
            r3 = r25
            er1.w3$a r7 = er1.C58784w3.m68431K(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r6 = r7.f26579a
            boolean r8 = r7.f26580b
            java.lang.String r3 = r7.f26583e
            java.lang.String r13 = r7.f26584f
            boolean r1 = r7.f26587i
            r14 = 2131099756(0x7f06006c, float:1.7811874E38)
            if (r1 != 0) goto L_0x0052
            r2 = 102(0x66, float:1.43E-43)
            r4 = 2131755655(0x7f100287, float:1.9142195E38)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            android.content.res.Resources r1 = r1.getResources()
            int r5 = r1.getColor(r14)
            r1 = r26
            r1.mo107150j(r2, r3, r4, r5, r6)
        L_0x0052:
            boolean r1 = r7.f26588j
            if (r1 != 0) goto L_0x0063
            r2 = 103(0x67, float:1.44E-43)
            r4 = 2131755285(0x7f100115, float:1.9141445E38)
            r5 = 0
            r1 = r26
            r3 = r13
            r6 = r8
            r1.mo107150j(r2, r3, r4, r5, r6)
        L_0x0063:
            boolean r1 = r7.f26590l
            if (r1 != 0) goto L_0x0076
            r2 = 208(0xd0, float:2.91E-43)
            java.lang.String r3 = r7.f26586h
            r4 = 2131755296(0x7f100120, float:1.9141467E38)
            r5 = 0
            boolean r6 = r7.f26582d
            r1 = r26
            r1.mo107150j(r2, r3, r4, r5, r6)
        L_0x0076:
            up1.f r8 = up1.C37521f.f99374d
            r8.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99190H7
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r13 = 1
            if (r1 != r13) goto L_0x00c5
            boolean r1 = r7.f26589k
            if (r1 != 0) goto L_0x00c5
            r2 = 104(0x68, float:1.46E-43)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r3 = 2131825615(0x7f1113cf, float:1.9284091E38)
            java.lang.String r3 = r1.getString(r3)
            r4 = 2131755278(0x7f10010e, float:1.914143E38)
            r5 = 0
            boolean r6 = r7.f26591m
            r1 = r26
            r1.mo107150j(r2, r3, r4, r5, r6)
            di3.d r1 = di3.C86312j.m106911c(r11)
            java.lang.String r2 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r15 = r1
            dp1.y0 r15 = (dp1.C58417y0) r15
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r17 = 0
            long r18 = r25.getItemId()
            boolean r2 = r7.f26591m
            r21 = 2
            r22 = 0
            r16 = r1
            r20 = r2
            dp1.C58417y0.Qy0(r15, r16, r17, r18, r20, r21, r22)
        L_0x00c5:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x00d8
            te3.ap1 r1 = r1.video_tmpl_info
            if (r1 == 0) goto L_0x00d8
            java.lang.String r1 = r1.f182115d
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r15 = 0
            if (r1 == 0) goto L_0x00e5
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r1 = 0
            goto L_0x00e6
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            r6 = 2131826812(0x7f11187c, float:1.9286519E38)
            r5 = 9999(0x270f, float:1.4012E-41)
            r4 = 99999(0x1869f, float:1.40128E-40)
            if (r1 != 0) goto L_0x022f
            java.lang.Class<da0.e> r1 = da0.C58247e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            da0.e r1 = (da0.C58247e) r1
            da0.b r1 = r1.yf0()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x0113
            te3.ap1 r2 = r2.video_tmpl_info
            if (r2 == 0) goto L_0x0113
            te3.yq4 r2 = r2.f182120i
            if (r2 == 0) goto L_0x0113
            int r2 = r2.f145473f
            goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x012b
            te3.ap1 r3 = r3.video_tmpl_info
            if (r3 == 0) goto L_0x012b
            te3.yq4 r3 = r3.f182120i
            if (r3 == 0) goto L_0x012b
            int r3 = r3.f145474g
            goto L_0x012c
        L_0x012b:
            r3 = 0
        L_0x012c:
            com.tencent.mm.plugin.finder.storage.FinderItem r16 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r16.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x013f
            te3.ap1 r7 = r7.video_tmpl_info
            if (r7 == 0) goto L_0x013f
            int r7 = r7.f182116e
            goto L_0x0140
        L_0x013f:
            r7 = -1
        L_0x0140:
            boolean r1 = r1.mo8428c(r2, r3, r7)
            if (r1 == 0) goto L_0x022f
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x0159
            te3.ap1 r1 = r1.video_tmpl_info
            if (r1 == 0) goto L_0x0159
            int r1 = r1.f182118g
            goto L_0x015a
        L_0x0159:
            r1 = 0
        L_0x015a:
            r2 = 2
            if (r1 <= 0) goto L_0x01a0
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x0175
            te3.ap1 r7 = r7.video_tmpl_info
            if (r7 == 0) goto L_0x0175
            int r7 = r7.f182116e
            if (r7 != r2) goto L_0x0175
            r2 = 1
            goto L_0x0176
        L_0x0175:
            r2 = 0
        L_0x0176:
            if (r2 == 0) goto L_0x017c
            r2 = 2131829893(0x7f112485, float:1.9292768E38)
            goto L_0x017f
        L_0x017c:
            r2 = 2131829901(0x7f11248d, float:1.9292784E38)
        L_0x017f:
            java.lang.Object[] r7 = new java.lang.Object[r13]
            if (r1 <= r4) goto L_0x018e
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0199
        L_0x018e:
            if (r1 <= r5) goto L_0x0195
            java.lang.String r1 = er1.C58784w3.m68432N1(r1)
            goto L_0x0199
        L_0x0195:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x0199:
            r7[r15] = r1
            java.lang.String r1 = r3.getString(r2, r7)
            goto L_0x01c6
        L_0x01a0:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x01b8
            te3.ap1 r3 = r3.video_tmpl_info
            if (r3 == 0) goto L_0x01b8
            int r3 = r3.f182116e
            if (r3 != r2) goto L_0x01b8
            r2 = 1
            goto L_0x01b9
        L_0x01b8:
            r2 = 0
        L_0x01b9:
            if (r2 == 0) goto L_0x01bf
            r2 = 2131829892(0x7f112484, float:1.9292766E38)
            goto L_0x01c2
        L_0x01bf:
            r2 = 2131829900(0x7f11248c, float:1.9292782E38)
        L_0x01c2:
            java.lang.String r1 = r1.getString(r2)
        L_0x01c6:
            r3 = r1
            java.lang.String r1 = "if (count > 0) context.g…share_use_same_template))"
            gy3.C87412m.m108593f(r3, r1)
            r2 = 118(0x76, float:1.65E-43)
            r7 = 2131233401(0x7f080a79, float:1.8082938E38)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            android.content.res.Resources r1 = r1.getResources()
            int r14 = r1.getColor(r14)
            r16 = 0
            r1 = r26
            r4 = r7
            r7 = 9999(0x270f, float:1.4012E-41)
            r5 = r14
            r14 = 2131826812(0x7f11187c, float:1.9286519E38)
            r6 = r16
            r1.mo107150j(r2, r3, r4, r5, r6)
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            bl3.r$a r1 = r1.mo62444c(r2)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r1 = r1.mo12861q3()
            dp1.f2 r2 = dp1.C7435f2.f25626a
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
            if (r4 == 0) goto L_0x0219
            te3.ap1 r4 = r4.video_tmpl_info
            if (r4 == 0) goto L_0x0219
            java.lang.String r4 = r4.f182115d
            goto L_0x021a
        L_0x0219:
            r4 = 0
        L_0x021a:
            if (r4 != 0) goto L_0x0220
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
        L_0x0220:
            java.lang.String r5 = "templateId"
            r3.put(r5, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            java.lang.String r4 = "shoot_same_video"
            r2.mo8580d(r1, r4, r15, r3)
            goto L_0x0234
        L_0x022f:
            r7 = 9999(0x270f, float:1.4012E-41)
            r14 = 2131826812(0x7f11187c, float:1.9286519E38)
        L_0x0234:
            er1.i1 r6 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r6.mo83664j(r1, r10, r9)
            r8.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99337Y4
            up1.f$h1 r1 = (up1.C37521f.C37530h1) r1
            r1.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            int r1 = r1.intValue()
            if (r1 != r13) goto L_0x029c
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r1 = r12.mo83939j(r1)
            if (r1 == 0) goto L_0x029c
            di3.d r1 = di3.C86312j.m106911c(r11)
            dp1.y0 r1 = (dp1.C58417y0) r1
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            long r3 = r25.getItemId()
            r1.Vy0(r2, r3)
            r2 = 113(0x71, float:1.58E-43)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r3 = 2131829896(0x7f112488, float:1.9292774E38)
            java.lang.String r3 = r1.getString(r3)
            r4 = 2131757017(0x7f1007d9, float:1.9144958E38)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2131099737(0x7f060059, float:1.7811836E38)
            int r5 = r1.getColor(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r8 = r12.mo83854A(r1)
            r1 = r26
            r23 = r6
            r6 = r8
            r1.mo107150j(r2, r3, r4, r5, r6)
            goto L_0x029e
        L_0x029c:
            r23 = r6
        L_0x029e:
            boolean r1 = r12.mo83933h(r9)
            if (r1 == 0) goto L_0x0309
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r25.mo3513o()
            if (r1 == 0) goto L_0x02b1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
            if (r1 == 0) goto L_0x02b1
            int r1 = r1.ringtone_count
            goto L_0x02b2
        L_0x02b1:
            r1 = 0
        L_0x02b2:
            if (r1 == 0) goto L_0x02e3
            int r2 = r12.mo83977x0()
            if (r1 < r2) goto L_0x02e3
            r2 = 99999(0x1869f, float:1.40128E-40)
            if (r1 <= r2) goto L_0x02ca
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            java.lang.String r1 = r1.getString(r14)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x02d5
        L_0x02ca:
            if (r1 <= r7) goto L_0x02d1
            java.lang.String r1 = er1.C58784w3.m68432N1(r1)
            goto L_0x02d5
        L_0x02d1:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x02d5:
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r3 = 2131826564(0x7f111784, float:1.9286016E38)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r15] = r1
            java.lang.String r1 = r2.getString(r3, r4)
            goto L_0x02ec
        L_0x02e3:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r2 = 2131829889(0x7f112481, float:1.929276E38)
            java.lang.String r1 = r1.getString(r2)
        L_0x02ec:
            r3 = r1
            java.lang.String r1 = "if(count != 0 && count >…_title)\n                }"
            gy3.C87412m.m108593f(r3, r1)
            r2 = 114(0x72, float:1.6E-43)
            r4 = 2131756151(0x7f100477, float:1.9143201E38)
            r5 = 0
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r25.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r6 = r12.mo83982z(r1)
            r1 = r26
            r1.mo107150j(r2, r3, r4, r5, r6)
        L_0x0309:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r2 = r23
            r2.mo83662h(r1, r9, r10)
            di3.d r1 = di3.C86312j.m106911c(r11)
            dp1.y0 r1 = (dp1.C58417y0) r1
            long r2 = r25.getItemId()
            int r4 = r0.f29962e
            r1.mo83275AJ(r2, r4)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x033e
            r2 = 0
            df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r15, r13, r2)
            if (r1 == 0) goto L_0x033e
            long r2 = r25.getItemId()
            df1.a$a r4 = new df1.a$a
            r5 = 16
            r4.<init>(r5, r2)
            r1.mo8766a(r4)
        L_0x033e:
            dp1.e1 r1 = dp1.C7433e1.f25622a
            r1.mo8572a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9640c.mo4150q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, nj3.e0, qo3.n, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo10313v();
     */
    /* renamed from: r5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.finder.view.C56597e1 mo2579r5() {
        /*
            r1 = this;
            kf1.f r0 = r1.f29964g
            if (r0 == 0) goto L_0x000a
            com.tencent.mm.plugin.finder.view.e1 r0 = r0.mo10313v()
            if (r0 != 0) goto L_0x000f
        L_0x000a:
            com.tencent.mm.plugin.finder.view.e1 r0 = new com.tencent.mm.plugin.finder.view.e1
            r0.<init>()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9640c.mo2579r5():com.tencent.mm.plugin.finder.view.e1");
    }

    public abstract void requestRefresh();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002a, code lost:
        r1 = r1.getFeedObject();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2496t(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r14, nj3.C76874e0 r15, qo3.C77407n r16, jq3.C60905o r17) {
        /*
            r13 = this;
            r0 = r13
            r7 = r14
            r8 = r15
            java.lang.String r1 = "feed"
            gy3.C87412m.m108594g(r14, r1)
            java.lang.String r1 = "menu"
            gy3.C87412m.m108594g(r15, r1)
            java.lang.String r1 = "sheet"
            r5 = r16
            gy3.C87412m.m108594g(r5, r1)
            java.lang.String r1 = "holder"
            r2 = r17
            gy3.C87412m.m108594g(r2, r1)
            er1.i1 r9 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83660f(r1, r15, r14)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
            r10 = 0
            if (r1 == 0) goto L_0x0037
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L_0x0037
            er1.w3 r2 = er1.C58784w3.f168295a
            boolean r1 = r2.mo83857B(r1)
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r14.mo3513o()
            boolean r2 = r2.isLongVideo()
            if (r2 == 0) goto L_0x006b
            if (r1 != 0) goto L_0x006b
            kf1.f r1 = r0.f29964g
            if (r1 == 0) goto L_0x0055
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            if (r1 == 0) goto L_0x0055
            rs1.da$a r2 = rs1.C13194da.f37515v
            java.lang.String r1 = r2.mo12692a(r1)
            goto L_0x0063
        L_0x0055:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r2 = 2131832860(0x7f11301c, float:1.9298786E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "context.getString(R.stri…ga_video_play_speed_text)"
            gy3.C87412m.m108593f(r1, r2)
        L_0x0063:
            r2 = 116(0x74, float:1.63E-43)
            r3 = 2131756416(0x7f100580, float:1.9143739E38)
            r15.mo107144g(r2, r1, r3)
        L_0x006b:
            er1.w3 r11 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.mo3513o()
            boolean r1 = r11.mo83980y0(r1)
            r12 = 1
            if (r1 == 0) goto L_0x00aa
            r1 = 109(0x6d, float:1.53E-43)
            java.lang.String r2 = r11.mo83909X(r14)
            r3 = 2131756232(0x7f1004c8, float:1.9143366E38)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r14.mo3513o()
            boolean r4 = r4.isPostFinish()
            if (r4 == 0) goto L_0x00a6
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r14.mo3513o()
            boolean r4 = r4.isPostFailed()
            if (r4 != 0) goto L_0x00a6
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r14.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            boolean r4 = r11.mo83979y(r4)
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r4 = 0
            goto L_0x00a7
        L_0x00a6:
            r4 = 1
        L_0x00a7:
            r15.mo107151k(r1, r2, r3, r4)
        L_0x00aa:
            er1.p2 r1 = er1.C7853p2.f26439a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r6 = 200(0xc8, float:2.8E-43)
            r3 = r14
            r4 = r15
            r5 = r16
            r1.mo8958a(r2, r3, r4, r5, r6)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83665k(r1, r14, r15)
            boolean r1 = r13.mo10275L0(r14)
            if (r1 == 0) goto L_0x00c7
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83661g(r1, r15, r14)
        L_0x00c7:
            boolean r1 = r13.mo4148M0(r14)
            if (r1 == 0) goto L_0x00ea
            r1 = 99
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r3 = 2131833047(0x7f1130d7, float:1.9299165E38)
            java.lang.String r2 = r2.getString(r3)
            er1.j4 r3 = er1.C58739j4.f168176a
            boolean r3 = r3.mo83686O(r14)
            if (r3 == 0) goto L_0x00e4
            r3 = 2131755688(0x7f1002a8, float:1.9142262E38)
            goto L_0x00e7
        L_0x00e4:
            r3 = 2131755623(0x7f100267, float:1.914213E38)
        L_0x00e7:
            r15.mo107144g(r1, r2, r3)
        L_0x00ea:
            kf1.f r1 = r0.f29964g
            if (r1 == 0) goto L_0x00f3
            boolean r1 = r1.f30130o
            if (r1 != r12) goto L_0x00f3
            r10 = 1
        L_0x00f3:
            if (r10 == 0) goto L_0x00fa
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83655a(r1, r15, r14)
        L_0x00fa:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83663i(r1, r14, r15)
            boolean r1 = r11.mo83897Q0(r14)
            if (r1 != 0) goto L_0x0116
            r1 = 101(0x65, float:1.42E-43)
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r3 = 2131833035(0x7f1130cb, float:1.929914E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2131756438(0x7f100596, float:1.9143784E38)
            r15.mo107144g(r1, r2, r3)
        L_0x0116:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83659e(r1, r14, r15)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83658d(r1, r14, r15)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r9.mo83657c(r1, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9640c.mo2496t(com.tencent.mm.plugin.finder.model.BaseFinderFeed, nj3.e0, qo3.n, jq3.o):void");
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return false;
    }

    /* renamed from: u4 */
    public C11183n0 mo2580u4(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C9658o(this, baseFinderFeed);
    }

    /* renamed from: v3 */
    public void mo2581v3(BaseFinderFeed baseFinderFeed, boolean z, boolean z2, int i, boolean z3) {
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C87412m.m108594g(baseFinderFeed, "feed");
        C0768q0.f1810a.mo710a(((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), i, baseFinderFeed.mo3513o(), z, z2, 2, baseFinderFeed.mo3468B(), z3, C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l()));
    }

    /* renamed from: w1 */
    public C11182m0 mo2582w1(BaseFinderFeed baseFinderFeed, C77407n nVar, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C9652i(this, baseFinderFeed, nVar, i);
    }

    /* JADX WARNING: type inference failed for: r8v46, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r8v47, types: [java.lang.String] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2647x(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r29, android.view.MenuItem r30, int r31, int r32, jq3.C60905o r33) {
        /*
            r28 = this;
            r0 = r28
            r14 = r29
            r1 = r30
            r2 = r31
            r15 = r32
            r10 = r33
            java.lang.Class<dp1.y0> r3 = dp1.C58417y0.class
            java.lang.String r4 = "feed"
            gy3.C87412m.m108594g(r14, r4)
            java.lang.String r4 = "menuItem"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r10, r4)
            java.lang.String r4 = r28.mo2546N()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getMoreMenuItemSelectedListener feed "
            r5.append(r6)
            r5.append(r14)
            r6 = 32
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " menuItem:"
            r5.append(r6)
            int r6 = r30.getItemId()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            int r4 = r30.getItemId()
            r5 = 99
            java.lang.String r13 = "feedid"
            java.lang.String r12 = "from_action"
            java.lang.String r11 = "context"
            r9 = 2
            r8 = 0
            r7 = 1
            if (r4 == r5) goto L_0x0701
            r2 = 116(0x74, float:1.63E-43)
            if (r4 == r2) goto L_0x0668
            r2 = 301(0x12d, float:4.22E-43)
            if (r4 == r2) goto L_0x0644
            r2 = 302(0x12e, float:4.23E-43)
            if (r4 == r2) goto L_0x0644
            switch(r4) {
                case 101: goto L_0x05c2;
                case 102: goto L_0x056d;
                case 103: goto L_0x04d2;
                case 104: goto L_0x04ac;
                default: goto L_0x0069;
            }
        L_0x0069:
            r2 = 0
            switch(r4) {
                case 106: goto L_0x049b;
                case 107: goto L_0x0489;
                case 108: goto L_0x0475;
                case 109: goto L_0x03c6;
                default: goto L_0x006d;
            }
        L_0x006d:
            switch(r4) {
                case 112: goto L_0x0380;
                case 113: goto L_0x02ec;
                case 114: goto L_0x0237;
                default: goto L_0x0070;
            }
        L_0x0070:
            switch(r4) {
                case 118: goto L_0x01ae;
                case 119: goto L_0x01a3;
                case 120: goto L_0x0181;
                default: goto L_0x0073;
            }
        L_0x0073:
            switch(r4) {
                case 200: goto L_0x0168;
                case 201: goto L_0x015d;
                case 202: goto L_0x0152;
                default: goto L_0x0076;
            }
        L_0x0076:
            switch(r4) {
                case 207: goto L_0x0147;
                case 208: goto L_0x0138;
                case 209: goto L_0x010c;
                case 210: goto L_0x0101;
                default: goto L_0x0079;
            }
        L_0x0079:
            switch(r4) {
                case 305: goto L_0x00ed;
                case 306: goto L_0x00d9;
                case 307: goto L_0x008d;
                default: goto L_0x007c;
            }
        L_0x007c:
            wc3.e0 r2 = r0.f29968n
            r3 = r1
            nj3.f0 r3 = (nj3.C76875f0) r3
            kf1.c$c r4 = new kf1.c$c
            r4.<init>(r14, r0, r1, r15)
            r2.xc0(r3, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x008d:
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            bl3.r$a r1 = r1.mo62444c(r3)
            java.lang.Class<rs1.v> r3 = rs1.C63648v.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(context).…ddHistoryUIC::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            rs1.v r1 = (rs1.C63648v) r1
            r1.mo88474e3(r10, r2)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            long r2 = r29.getItemId()
            gy3.C87412m.m108594g(r1, r11)
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r5.mo12873f(r1)
            if (r1 == 0) goto L_0x00bc
            te3.hj1 r8 = r1.mo12861q3()
        L_0x00bc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r15 != r7) goto L_0x00c4
            r9 = 1
        L_0x00c4:
            r1.put(r12, r9)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.put(r13, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "button_minimize"
            r4.mo8577a(r8, r2, r7, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x00d9:
            er1.i1 r1 = er1.C58736i1.f168173a
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r28.mo2491f0()
            r2 = r33
            r4 = r29
            r5 = r32
            r1.mo83666l(r2, r3, r4, r5, r6)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x00ed:
            er1.i1 r1 = er1.C58736i1.f168173a
            r3 = 1
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r28.mo2491f0()
            r2 = r33
            r4 = r29
            r5 = r32
            r1.mo83666l(r2, r3, r4, r5, r6)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0101:
            er1.i1 r1 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r1.mo83672r(r2, r14, r10)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x010c:
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            gy3.C87412m.m108594g(r3, r11)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            te3.kf1 r1 = r1.object_extend
            if (r1 == 0) goto L_0x0134
            te3.ui0 r1 = r1.f136756r
            if (r1 == 0) goto L_0x0134
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f142864d
            if (r1 == 0) goto L_0x0134
            pf1.q r4 = new pf1.q
            r4.<init>(r1)
            pf1.d0 r2 = pf1.C62262d0.f176978a
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            pf1.C62262d0.m73168c(r2, r3, r4, r5, r6, r7, r8)
        L_0x0134:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0138:
            er1.v2$a r1 = er1.C7888v2.f26513a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r29.mo3513o()
            r1.mo9024z(r2, r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0147:
            er1.i1 r1 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r1.mo83670p(r2, r14, r15)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0152:
            pf1.d0 r1 = pf1.C62262d0.f176978a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r1.mo87324p(r2, r14, r15)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x015d:
            er1.i1 r1 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r1.mo83671q(r2, r14)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0168:
            er1.p2 r1 = er1.C7853p2.f26439a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            wp1.j r3 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r29.mo3513o()
            java.lang.String r4 = r4.getFromAppId()
            te3.wf3 r3 = r3.mo14352d(r4)
            r1.mo8961d(r14, r2, r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0181:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            java.lang.String r3 = "activity"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.Class<hy.o0> r3 = p166hy.C98567o0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            hy.o0 r3 = (p166hy.C98567o0) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            byte[] r4 = r4.toByteArray()
            r3.Wk0(r1, r9, r4, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x01a3:
            er1.i1 r1 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r1.mo83668n(r2, r14)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x01ae:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x01bd
            te3.ap1 r1 = r1.video_tmpl_info
            goto L_0x01be
        L_0x01bd:
            r1 = r8
        L_0x01be:
            if (r1 != 0) goto L_0x01cd
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            r3 = 2131826793(0x7f111869, float:1.928648E38)
            java.lang.String r3 = r1.getString(r3)
            nj3.C76912y0.m92767f(r1, r3)
            goto L_0x01f4
        L_0x01cd:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            int r4 = r1.f182116e
            if (r4 == r7) goto L_0x01dd
            if (r4 == r9) goto L_0x01da
            r4 = -1
            goto L_0x01df
        L_0x01da:
            r4 = 16
            goto L_0x01df
        L_0x01dd:
            r4 = 13
        L_0x01df:
            java.lang.Class<da0.e> r5 = da0.C58247e.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            da0.e r5 = (da0.C58247e) r5
            com.tencent.mm.ui.MMActivity r6 = r0.f29961d
            r9 = 5
            java.lang.String r10 = "key_maas_entrance"
            r3.putExtra(r10, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r5.qi0(r6, r1, r3, r4)
        L_0x01f4:
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            bl3.r$a r1 = r1.mo62444c(r3)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r1 = r1.mo12861q3()
            dp1.f2 r3 = dp1.C7435f2.f25626a
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x0221
            te3.ap1 r5 = r5.video_tmpl_info
            if (r5 == 0) goto L_0x0221
            java.lang.String r8 = r5.f182115d
        L_0x0221:
            if (r8 != 0) goto L_0x0227
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x0227:
            java.lang.String r2 = "templateId"
            r4.put(r2, r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "shoot_same_video"
            r3.mo8580d(r1, r2, r7, r4)
            goto L_0x0758
        L_0x0237:
            r1 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r1 = r10.mo85812D(r1)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
            if (r1 != 0) goto L_0x0249
            r1 = 2131304472(0x7f092018, float:1.8227088E38)
            android.view.View r1 = r10.mo85812D(r1)
        L_0x0249:
            if (r1 == 0) goto L_0x0254
            r3 = r1
            gr1.n2 r3 = (gr1.C59667n2) r3
            r4 = 3
            gr1.C59667n2.C8415a.m8377a(r3, r8, r2, r4, r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0254:
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            android.content.Intent r2 = r2.getIntent()
            if (r2 == 0) goto L_0x0264
            java.lang.String r3 = "KEY_RINGTONE_REPORT_JSON"
            java.lang.String r2 = r2.getStringExtra(r3)
            if (r2 != 0) goto L_0x0266
        L_0x0264:
            java.lang.String r2 = ""
        L_0x0266:
            r16 = r2
            bl3.r r2 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            bl3.r$a r2 = r2.mo62444c(r3)
            java.lang.Class<rs1.t2> r3 = rs1.C13452t2.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.t2 r2 = (rs1.C13452t2) r2
            int r6 = r2.f37345h
            er1.n2 r2 = er1.C7842n2.f26407a
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            r4 = 2
            r17 = 0
            r18 = 0
            kf1.c$g r7 = new kf1.c$g
            r7.<init>(r1, r0)
            r20 = 24
            r21 = 0
            r1 = r2
            r2 = r3
            r3 = r29
            r22 = r6
            r6 = r17
            r17 = r7
            r7 = r18
            r8 = r16
            r16 = 2
            r9 = r22
            r10 = r33
            r25 = r11
            r11 = r17
            r26 = r12
            r12 = r20
            r14 = r13
            r13 = r21
            er1.C7842n2.m7986b(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            java.lang.String r2 = "button_set_bell"
            long r3 = r29.getItemId()
            r9 = r25
            gy3.C87412m.m108594g(r1, r9)
            dp1.f2 r5 = dp1.C7435f2.f25626a
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r6.mo12873f(r1)
            if (r1 == 0) goto L_0x02cb
            te3.hj1 r8 = r1.mo12861q3()
            goto L_0x02cc
        L_0x02cb:
            r8 = 0
        L_0x02cc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r11 = 1
            r12 = r26
            if (r15 != r11) goto L_0x02d8
            r9 = 1
            goto L_0x02d9
        L_0x02d8:
            r9 = 2
        L_0x02d9:
            r1.put(r12, r9)
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r1.put(r14, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r5.mo8577a(r8, r2, r11, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x02ec:
            r9 = r11
            r14 = r13
            r11 = 1
            r16 = 2
            er1.v2$a r1 = er1.C7888v2.f26513a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r3 = r29
            er1.C7888v2.C7889a.m8058y(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            long r2 = r29.getItemId()
            gy3.C87412m.m108594g(r1, r9)
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r5.mo12873f(r1)
            if (r1 == 0) goto L_0x0317
            te3.hj1 r8 = r1.mo12861q3()
            goto L_0x0318
        L_0x0317:
            r8 = 0
        L_0x0318:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r15 != r11) goto L_0x0321
            r9 = 1
            goto L_0x0322
        L_0x0321:
            r9 = 2
        L_0x0322:
            r1.put(r12, r9)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.put(r14, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "textstatus_in_menu"
            r4.mo8577a(r8, r2, r11, r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            boolean r1 = r1.isLiveFeed()
            if (r1 == 0) goto L_0x037c
            ms3.a r2 = ms3.C11091a.f32868a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x0351
            long r3 = r1.f182392d
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            goto L_0x0352
        L_0x0351:
            r8 = 0
        L_0x0352:
            java.lang.String r3 = java.lang.String.valueOf(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            long r4 = r1.f164794id
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r5 = r1.username
            r9 = 0
            r10 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r12 = 0
            java.lang.String r6 = "1"
            java.lang.String r7 = "3"
            java.lang.String r8 = "0"
            ms3.C11091a.m10992b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x037c:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0380:
            r11 = 1
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "KEY_FROM_SCENE"
            r1.putExtra(r3, r11)
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            java.lang.String r4 = "KEY_USERNAME"
            r1.putExtra(r4, r3)
            java.lang.String r3 = "KEY_FINDER_SELF_FLAG"
            r1.putExtra(r3, r11)
            java.lang.String r3 = "KEY_IS_FULLSCREEN"
            r1.putExtra(r3, r11)
            java.lang.String r3 = "KEY_ENABLE_SWITCH_PREVIEW_MODE"
            r1.putExtra(r3, r2)
            er1.w3 r2 = er1.C58784w3.f168295a
            r3 = 0
            java.util.List r4 = sx3.C26236u.m33719b(r29)
            r5 = 0
            r7 = 0
            r8 = 16
            r9 = 0
            r6 = r1
            er1.C58784w3.m68427B1(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            er1.b r2 = (er1.C58684b) r2
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            r2.py0(r3, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x03c6:
            r9 = r11
            r14 = r13
            r11 = 1
            r16 = 2
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            boolean r1 = r1.isPostFinish()
            if (r1 == 0) goto L_0x043d
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r4 = r0.f29961d
            rs1.s8 r1 = r1.mo12873f(r4)
            if (r1 == 0) goto L_0x03e2
            int r1 = r1.f38096i
            goto L_0x03e3
        L_0x03e2:
            r1 = 0
        L_0x03e3:
            r4 = 52
            if (r1 != r4) goto L_0x03f8
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI
            if (r2 == 0) goto L_0x0426
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI r1 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI) r1
            r1.onBackPressed()
            goto L_0x0426
        L_0x03f8:
            vp1.e r1 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r29.mo3513o()
            vp1.e$b r5 = vp1.C65834e.C65836b.f189322b
            vp1.e$b r5 = vp1.C65834e.C65836b.f189323c
            r1.mo89878l(r4, r5)
            er1.q3 r1 = er1.C58771q3.f168268a
            com.tencent.mm.ui.MMActivity r4 = r0.f29961d
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x0418
            te3.ve1 r8 = r5.feedBgmInfo
            goto L_0x0419
        L_0x0418:
            r8 = 0
        L_0x0419:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r29.mo3513o()
            long r5 = r5.field_id
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.mo83812c(r4, r8, r5, r2)
        L_0x0426:
            di3.d r1 = di3.C86312j.m106911c(r3)
            dp1.y0 r1 = (dp1.C58417y0) r1
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.field_finderObject
            int r3 = r3.follow_feed_count
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.wy0(r2, r11, r11, r3)
        L_0x043d:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            long r2 = r29.getItemId()
            gy3.C87412m.m108594g(r1, r9)
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r5.mo12873f(r1)
            if (r1 == 0) goto L_0x0455
            te3.hj1 r8 = r1.mo12861q3()
            goto L_0x0456
        L_0x0455:
            r8 = 0
        L_0x0456:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r15 != r11) goto L_0x045f
            r9 = 1
            goto L_0x0460
        L_0x045f:
            r9 = 2
        L_0x0460:
            r1.put(r12, r9)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.put(r14, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "button_original_sound"
            r4.mo8577a(r8, r2, r11, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0475:
            r1 = 2131829600(0x7f112360, float:1.9292174E38)
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            kf1.c$h r4 = new kf1.c$h
            r13 = r29
            r4.<init>(r13, r0)
            r14 = 0
            nj3.C76879j.m92743n(r3, r1, r2, r4, r14)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0489:
            r13 = r14
            r11 = 1
            wp1.a r1 = wp1.C66164a.f190162a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            kf1.c$e r3 = new kf1.c$e
            r3.<init>(r0)
            r1.mo90220a(r2, r13, r11, r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x049b:
            r13 = r14
            wp1.a r1 = wp1.C66164a.f190162a
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            kf1.c$f r4 = new kf1.c$f
            r4.<init>(r0)
            r1.mo90220a(r3, r13, r2, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x04ac:
            r13 = r14
            er1.l0 r1 = er1.C58745l0.f168212a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r1.mo83743a(r13, r2)
            di3.d r1 = di3.C86312j.m106911c(r3)
            java.lang.String r2 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r3 = r1
            dp1.y0 r3 = (dp1.C58417y0) r3
            com.tencent.mm.ui.MMActivity r4 = r0.f29961d
            r5 = 1
            long r6 = r29.getItemId()
            r8 = 0
            r9 = 8
            r10 = 0
            dp1.C58417y0.Qy0(r3, r4, r5, r6, r8, r9, r10)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x04d2:
            r9 = r11
            r10 = r13
            r13 = r14
            r11 = 1
            r16 = 2
            r14 = r8
            er1.v2$a r1 = er1.C7888v2.f26513a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 28
            r8 = 0
            r3 = r29
            er1.C7888v2.C7889a.m8057w(r1, r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            boolean r1 = r1.isLiveFeed()
            if (r1 == 0) goto L_0x0535
            ms3.a r17 = ms3.C11091a.f32868a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x0505
            long r1 = r1.f182392d
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            goto L_0x0506
        L_0x0505:
            r8 = r14
        L_0x0506:
            java.lang.String r18 = java.lang.String.valueOf(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            long r1 = r1.f164794id
            java.lang.String r19 = java.lang.String.valueOf(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r1 = r1.username
            r24 = 0
            r25 = 0
            r26 = 192(0xc0, float:2.69E-43)
            r27 = 0
            java.lang.String r21 = "1"
            java.lang.String r22 = "2"
            java.lang.String r23 = "0"
            r20 = r1
            ms3.C11091a.m10992b(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0535:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            long r2 = r29.getItemId()
            gy3.C87412m.m108594g(r1, r9)
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r5.mo12873f(r1)
            if (r1 == 0) goto L_0x054d
            te3.hj1 r8 = r1.mo12861q3()
            goto L_0x054e
        L_0x054d:
            r8 = r14
        L_0x054e:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r15 != r11) goto L_0x0557
            r9 = 1
            goto L_0x0558
        L_0x0557:
            r9 = 2
        L_0x0558:
            r1.put(r12, r9)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.put(r10, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "button_forward_friendcircle"
            r4.mo8577a(r8, r2, r11, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x056d:
            r9 = r11
            r10 = r13
            r13 = r14
            r11 = 1
            r16 = 2
            r14 = r8
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            er1.v2$a r2 = er1.C7888v2.f26513a
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r29.mo3513o()
            r6 = 3
            kf1.c$d r7 = new kf1.c$d
            r7.<init>(r13)
            r2.mo9020s(r3, r4, r5, r6, r7)
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            long r2 = r29.getItemId()
            gy3.C87412m.m108594g(r1, r9)
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r5.mo12873f(r1)
            if (r1 == 0) goto L_0x05a2
            te3.hj1 r8 = r1.mo12861q3()
            goto L_0x05a3
        L_0x05a2:
            r8 = r14
        L_0x05a3:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r15 != r11) goto L_0x05ac
            r9 = 1
            goto L_0x05ad
        L_0x05ac:
            r9 = 2
        L_0x05ad:
            r1.put(r12, r9)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.put(r10, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "button_forward_friend"
            r4.mo8577a(r8, r2, r11, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x05c2:
            r9 = r11
            r10 = r13
            r13 = r14
            r11 = 1
            r16 = 2
            r14 = r8
            er1.j4 r1 = er1.C58739j4.f168176a
            boolean r1 = r1.mo83686O(r13)
            if (r1 == 0) goto L_0x05fd
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r29.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x060c
            long r1 = r1.f182392d
            sf1.a r17 = sf1.C13671a.f38718a
            com.tencent.mm.ui.MMActivity r3 = r0.f29961d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r29.mo3513o()
            java.lang.String r21 = r4.getUserName()
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 56
            r26 = 0
            r18 = r3
            r19 = r1
            sf1.C13671a.m12976c(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x060c
        L_0x05fd:
            sf1.a r1 = sf1.C13671a.f38718a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            r4 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            r3 = r29
            sf1.C13671a.m12975b(r1, r2, r3, r4, r6, r7, r8)
        L_0x060c:
            com.tencent.mm.ui.MMActivity r1 = r0.f29961d
            long r2 = r29.getItemId()
            gy3.C87412m.m108594g(r1, r9)
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r5.mo12873f(r1)
            if (r1 == 0) goto L_0x0624
            te3.hj1 r8 = r1.mo12861q3()
            goto L_0x0625
        L_0x0624:
            r8 = r14
        L_0x0625:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r15 != r11) goto L_0x062e
            r9 = 1
            goto L_0x062f
        L_0x062e:
            r9 = 2
        L_0x062f:
            r1.put(r12, r9)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.put(r10, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = "button_complaint"
            r4.mo8577a(r8, r2, r11, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0644:
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            bl3.r$a r1 = r1.mo62444c(r2)
            java.lang.Class<rs1.a1> r2 = rs1.C63513a1.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(getActivi…derBulletUIC::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            rs1.a1 r1 = (rs1.C63513a1) r1
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            r2 = r33
            rs1.C63513a1.m74853e3(r1, r2, r3, r4, r5, r6, r7)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0668:
            r9 = r11
            r1 = r13
            r13 = r14
            r11 = 1
            r16 = 2
            r14 = r8
            kf1.f r2 = r0.f29964g
            if (r2 == 0) goto L_0x06ca
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 2131302830(0x7f0919ae, float:1.8223757E38)
            android.view.View r3 = r10.mo85812D(r3)
            if (r3 == 0) goto L_0x0684
            r2.add(r3)
        L_0x0684:
            r3 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r3 = r10.mo85812D(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
            if (r3 == 0) goto L_0x0694
            gr1.o2 r8 = r3.getVideoView()
            goto L_0x0695
        L_0x0694:
            r8 = r14
        L_0x0695:
            boolean r3 = r8 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r3 == 0) goto L_0x069e
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r8 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r8
            r19 = r8
            goto L_0x06a0
        L_0x069e:
            r19 = r14
        L_0x06a0:
            if (r19 == 0) goto L_0x06ca
            bl3.r r3 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r4 = r0.f29961d
            bl3.r$a r3 = r3.mo62444c(r4)
            java.lang.Class<rs1.da> r4 = rs1.C13194da.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(getActivi…edControlUIC::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            r17 = r3
            rs1.da r17 = (rs1.C13194da) r17
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 28
            r24 = 0
            r18 = r2
            rs1.C13194da.m12605k3(r17, r18, r19, r20, r21, r22, r23, r24)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x06ca:
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            long r3 = r29.getItemId()
            gy3.C87412m.m108594g(r2, r9)
            dp1.f2 r5 = dp1.C7435f2.f25626a
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r6.mo12873f(r2)
            if (r2 == 0) goto L_0x06e2
            te3.hj1 r8 = r2.mo12861q3()
            goto L_0x06e3
        L_0x06e2:
            r8 = r14
        L_0x06e3:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            if (r15 != r11) goto L_0x06ec
            r9 = 1
            goto L_0x06ed
        L_0x06ec:
            r9 = 2
        L_0x06ed:
            r2.put(r12, r9)
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r2.put(r1, r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            java.lang.String r1 = "button_speedplay"
            r5.mo8577a(r8, r1, r11, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0758
        L_0x0701:
            r9 = r11
            r1 = r13
            r13 = r14
            r11 = 1
            r16 = 2
            r14 = r8
            int r3 = r28.mo2490e(r29)
            if (r3 <= 0) goto L_0x071f
            java.lang.Class<l31.e> r3 = l31.C61212e.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            l31.e r3 = (l31.C61212e) r3
            android.view.View r4 = r10.f44854d
            r5 = 24617(0x6029, float:3.4496E-41)
            java.lang.String r6 = "feed_uninterest_clk"
            r3.mo86153W7(r6, r4, r14, r5)
        L_0x071f:
            r0.mo4149j0(r13, r2)
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            long r3 = r29.getItemId()
            gy3.C87412m.m108594g(r2, r9)
            dp1.f2 r5 = dp1.C7435f2.f25626a
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r6.mo12873f(r2)
            if (r2 == 0) goto L_0x073a
            te3.hj1 r8 = r2.mo12861q3()
            goto L_0x073b
        L_0x073a:
            r8 = r14
        L_0x073b:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            if (r15 != r11) goto L_0x0744
            r9 = 1
            goto L_0x0745
        L_0x0744:
            r9 = 2
        L_0x0745:
            r2.put(r12, r9)
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r2.put(r1, r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            java.lang.String r1 = "button_uninterested"
            r5.mo8577a(r8, r1, r11, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0758:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9640c.mo2647x(com.tencent.mm.plugin.finder.model.BaseFinderFeed, android.view.MenuItem, int, int, jq3.o):void");
    }
}
