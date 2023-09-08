package kf1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0787w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.feed.FinderFavListDrawerPresenter$getItemConvertFactory$1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75592q0;
import er1.C58784w3;
import er1.C7878t0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60898l;
import jq3.C60905o;
import l60.C99344b;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C48996cf1;
import te3.C50557nk0;
import u60.C14121l;
import u60.C65233m;
import up1.C27696y;
import ur1.C65467c;
import wp1.C15587j;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: kf1.h1 */
public final class C61028h1 implements C61072yb, C60898l.C9502b<C60905o>, C60898l.C9503c<C60905o>, C9487b<C9486a> {

    /* renamed from: d */
    public final Context f173798d;

    /* renamed from: e */
    public final int f173799e = ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3736cp));

    /* renamed from: f */
    public volatile C89349b f173800f;

    /* renamed from: g */
    public int f173801g;

    /* renamed from: h */
    public FinderItem f173802h;

    /* renamed from: i */
    public C65233m f173803i;

    /* renamed from: j */
    public final ArrayList<C0787w> f173804j = new ArrayList<>();

    /* renamed from: n */
    public C65467c f173805n;

    /* renamed from: o */
    public final CopyOnWriteArraySet<C9486a> f173806o;

    /* renamed from: p */
    public boolean f173807p;

    /* renamed from: q */
    public boolean f173808q;

    /* renamed from: r */
    public boolean f173809r;

    /* renamed from: s */
    public final C61029a f173810s;

    /* renamed from: kf1.h1$a */
    public static final class C61029a extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C61028h1 f173811a;

        public C61029a(C61028h1 h1Var) {
            this.f173811a = h1Var;
        }

        /* renamed from: b */
        public void mo2556b() {
            this.f173811a.mo85989l();
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            this.f173811a.mo85989l();
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
            this.f173811a.mo85989l();
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            this.f173811a.mo85989l();
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            this.f173811a.mo85989l();
        }
    }

    /* renamed from: kf1.h1$b */
    public static final class C61030b extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: kf1.h1$c */
    public static final class C61031c extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C61028h1 f173812a;

        /* renamed from: kf1.h1$c$a */
        public static final class C61032a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C61028h1 f173813d;

            public C61032a(C61028h1 h1Var) {
                this.f173813d = h1Var;
            }

            public final void run() {
                C61028h1 h1Var = this.f173813d;
                C65233m mVar = h1Var.f173803i;
                if (mVar != null) {
                    mVar.mo11856a(new C14121l(new C61037k1(h1Var), (String) null, 2, (C8480h) null));
                }
            }
        }

        public C61031c(C61028h1 h1Var) {
            this.f173812a = h1Var;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C61032a(this.f173812a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C65467c cVar2;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C61028h1 h1Var = this.f173812a;
            if (!h1Var.f173809r && (cVar2 = h1Var.f173805n) != null) {
                RefreshLoadMoreLayout.m66896C(cVar2.mo89582h(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }
    }

    public C61028h1(Context context) {
        C87412m.m108594g(context, "context");
        this.f173798d = context;
        C75592q0.m90789s();
        this.f173806o = new CopyOnWriteArraySet<>();
        this.f173809r = true;
        this.f173810s = new C61029a(this);
    }

    /* renamed from: i */
    public static void m71523i(C61028h1 h1Var, boolean z, C32226l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            lVar = null;
        }
        C65233m mVar = h1Var.f173803i;
        if (mVar != null) {
            mVar.mo11856a(new C14121l(new C61045o1(z, h1Var, lVar), (String) null, 2, (C8480h) null));
        }
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo85978a(Context context) {
        C87412m.m108594g(context, "context");
        return new C61030b();
    }

    /* renamed from: b */
    public RecyclerView.LayoutManager mo85979b(Context context) {
        C87412m.m108594g(context, "context");
        return new LinearLayoutManager(context, 1, false);
    }

    /* renamed from: c */
    public WxRecyclerAdapter<?> mo85980c(Context context) {
        C87412m.m108594g(context, "context");
        WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderFavListDrawerPresenter$getItemConvertFactory$1(), this.f173804j, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f173488o = this;
        wxRecyclerAdapter.f173487n = this;
        return wxRecyclerAdapter;
    }

    /* renamed from: d */
    public void mo85981d(Context context, FrameLayout frameLayout) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "headerLayout");
    }

    /* renamed from: e */
    public int mo85982e() {
        return this.f173801g;
    }

    /* renamed from: f */
    public void mo85983f(View view) {
        C87412m.m108594g(view, "view");
    }

    /* renamed from: g */
    public void mo85984g(C65467c cVar, FinderItem finderItem) {
        C65467c cVar2;
        C87412m.m108594g(cVar, "builder");
        C87412m.m108594g(finderItem, "feedObj");
        this.f173802h = finderItem;
        C65233m mVar = new C65233m("FinderLikeExecutor");
        this.f173803i = mVar;
        this.f173805n = cVar;
        mVar.mo89361d();
        mo85989l();
        this.f173804j.clear();
        try {
            RecyclerView.C16613e adapter = cVar.mo89582h().getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f173810s);
            }
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("Finder.FavListDrawerPresenter", e, "", new Object[0]);
        }
        cVar.mo89578a(false);
        C65467c cVar3 = this.f173805n;
        if (cVar3 != null) {
            cVar3.mo89579b().mo82529d(true);
        }
        cVar.mo89582h().getRecyclerView().setLayoutFrozen(false);
        cVar.mo89582h().setActionCallback(new C61031c(this));
        C65467c cVar4 = this.f173805n;
        if (cVar4 != null) {
            FrameLayout frameLayout = cVar4.f188393h;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                cVar4.mo89581d().setOnClickListener((View.OnClickListener) null);
            } else {
                C87412m.m108603p("loadingLayout");
                throw null;
            }
        }
        C65467c cVar5 = this.f173805n;
        if (cVar5 != null) {
            cVar5.mo89583i();
        }
        m71523i(this, false, (C32226l) null, 3, (Object) null);
        if (!this.f173809r && (cVar2 = this.f173805n) != null) {
            RefreshLoadMoreLayout.m66896C(cVar2.mo89582h(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
        }
        this.f173807p = true;
    }

    public int getScene() {
        FinderFavDrawer.Companion companion = FinderFavDrawer.f162097C;
        return 0;
    }

    /* renamed from: h */
    public final FinderItem mo85986h() {
        FinderItem finderItem = this.f173802h;
        if (finderItem != null) {
            return finderItem;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: j */
    public final void mo85987j(String str) {
        C58784w3 w3Var = C58784w3.f168295a;
        Context context = this.f173798d;
        int i = this.f173799e;
        CharSequence q1 = w3Var.mo83957q1(context, str, '#', C0966R.raw.icons_outlined_finger_like_bold, C0966R.color.FG_0, i, i);
        C65467c cVar = this.f173805n;
        TextView textView = null;
        if (cVar != null) {
            TextView textView2 = cVar.f188390e;
            if (textView2 != null) {
                textView = textView2;
            } else {
                C87412m.m108603p("headerTitleTv");
                throw null;
            }
        }
        if (textView != null) {
            textView.setText(q1);
        }
    }

    /* renamed from: k */
    public final void mo85988k(boolean z) {
        this.f173809r = z;
        Log.m105924i("Finder.DrawerPresenter", "set downContinue " + z);
    }

    public void keep(C9486a aVar) {
        this.f173806o.add(aVar);
    }

    /* renamed from: l */
    public final void mo85989l() {
        String str;
        if (this.f173801g <= 0) {
            C65467c cVar = this.f173805n;
            TextView textView = null;
            if (cVar != null) {
                TextView textView2 = cVar.f188390e;
                if (textView2 != null) {
                    textView = textView2;
                } else {
                    C87412m.m108603p("headerTitleTv");
                    throw null;
                }
            }
            if (textView != null) {
                textView.setText(MMApplicationContext.getContext().getString(C0966R.string.mlq));
                return;
            }
            return;
        }
        Context context = MMApplicationContext.getContext();
        C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOffBoldIcon");
        if (!C85875k4.m106211z() ? a == null || (str = a.f131694e) == null : a == null || (str = a.f131695f) == null) {
            str = "";
        }
        String string = context.getResources().getString(C0966R.string.mql, new Object[]{Integer.valueOf(Util.safeParseInt(C7878t0.m8035d((long) this.f173801g)))});
        C87412m.m108593f(string, "context.resources.getStr…osterNumber(totalCount)))");
        if (!Util.isNullOrNil(str)) {
            int color = context.getResources().getColor(C0966R.color.FG_0);
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            Log.m105924i("Finder.FavListDrawerPresenter", "loadHighLightIcon: iconUrl" + str + " highLightColor:" + color);
            C39818r rVar = C39818r.f106831a;
            C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.FAV_ICON));
            C61056q1 q1Var = new C61056q1(this, string, str);
            b.getClass();
            b.f291320d = q1Var;
            b.f291324h = new C61059r1(str, this, string);
            b.f291323g = new C61063s1(this, string);
            b.mo85951a();
            return;
        }
        mo85987j(string);
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        return false;
    }

    public void onDetach() {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        if (!this.f173807p) {
            Log.m105924i("Finder.FavListDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f173807p = false;
        C65233m mVar = this.f173803i;
        if (mVar != null) {
            mVar.mo89362e();
        }
        this.f173803i = null;
        for (C9486a dead : this.f173806o) {
            dead.dead();
        }
        this.f173806o.clear();
        this.f173804j.clear();
        this.f173800f = null;
        this.f173808q = false;
        Log.m105924i("Finder.DrawerPresenter", "set upContinue false");
        mo85988k(true);
        C65467c cVar = this.f173805n;
        RefreshLoadMoreLayout h = cVar != null ? cVar.mo89582h() : null;
        if (h != null) {
            h.setHasBottomMore(true);
        }
        C65467c cVar2 = this.f173805n;
        if (!(cVar2 == null || (recyclerView = cVar2.mo89582h().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
            adapter.notifyDataSetChanged();
        }
        C65467c cVar3 = this.f173805n;
        RecyclerView recyclerView2 = cVar3 != null ? cVar3.mo89582h().getRecyclerView() : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutFrozen(true);
        }
        C65467c cVar4 = this.f173805n;
        RefreshLoadMoreLayout h2 = cVar4 != null ? cVar4.mo89582h() : null;
        if (h2 != null) {
            h2.setActionCallback((RefreshLoadMoreLayout.C57879a) null);
        }
        this.f173805n = null;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C0787w wVar = (C0787w) oVar.f173503E;
        String str = null;
        C50557nk0 nk02 = wVar != null ? wVar.f1843d : null;
        StringBuilder sb = new StringBuilder();
        sb.append("click likeInfo:");
        if (nk02 != null) {
            str = nk02.f138638g;
        }
        sb.append(str);
        Log.m105924i("Finder.FavListDrawerPresenter", sb.toString());
        if (nk02 != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            String str2 = nk02.f138638g;
            String str3 = "";
            String str4 = str2 == null ? str3 : str2;
            long id = mo85986h().getId();
            String objectNonceId = mo85986h().getObjectNonceId();
            String str5 = nk02.f138637f;
            if (str5 != null) {
                str3 = str5;
            }
            w3Var.getClass();
            C87412m.m108594g(objectNonceId, "nonceId");
            Intent intent = new Intent();
            if (Util.isNullOrNil(str4) || !C87412m.m108589b(str4, C66785b.f191882e.mo90662O5())) {
                intent.putExtra("IsPoster", false);
            } else {
                intent.putExtra("IsPoster", true);
                intent.putExtra("feedUser", str4);
            }
            intent.putExtra("Avatar", nk02.f138636e);
            intent.putExtra("Nickname", nk02.f138635d);
            intent.putExtra("FeedId", id);
            intent.putExtra("feedUser", C66785b.f191882e.mo90662O5());
            intent.putExtra("FeedNonceId", objectNonceId);
            intent.putExtra("FavId", str3);
            intent.putExtra("IsPoster", true);
            intent.putExtra("V5UserName", nk02.f138638g);
            intent.putExtra("isFingerLike", true);
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58784w3.m68437l1(w3Var, context, str4, intent, 8, (C32226l) null, 16, (Object) null);
        }
    }
}
