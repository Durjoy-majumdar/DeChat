package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderFeedDetailUI;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.ContactUninterestEventListener;
import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C7335d;
import di3.C86312j;
import dp1.C7430d1;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C58556f;
import en3.C97675c;
import en3.C97680h;
import er1.C58784w3;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60172g4;
import ht1.C8777j5;
import ht1.C8819z2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kf1.C9636b8;
import kf1.C9672c8;
import kf1.C9688d8;
import kf1.C9699e8;
import kf1.C9718f8;
import kf1.C9745g8;
import kf1.C9799i8;
import kf1.C9844l8;
import kotlin.Metadata;
import l31.C61212e;
import lp3.C88643g;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p185kq.C10383h;
import p217oq.C11716d;
import p217oq.C11717f;
import p629ny.C76979h;
import q31.C118148a;
import rs1.C13194da;
import rs1.C13442s8;
import rs1.C13466ta;
import rs1.C13539y3;
import rs1.C13554z;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63547e;
import rs1.C63575n3;
import rs1.C63648v;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import sx3.C64197v;
import sx3.C90364q0;
import ts1.C14078c;
import u24.C90599h;
import u91.C22623c;
import up1.C37521f;
import ve1.C65604i;
import vf1.C14800n4;
import ye1.C15976o;
import z91.C23462b;
import zc1.C66785b;
import zn1.C16336r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Lob0/n;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI */
public final class FinderProfileTimeLineUI extends MMFinderFeedDetailUI implements C11385n {

    /* renamed from: A */
    public static final /* synthetic */ int f14726A = 0;

    /* renamed from: o */
    public final String f14727o = "Finder.FinderProfileTimeLineUI";

    /* renamed from: p */
    public FinderProfileTimelineContract$ProfileTimelinePresenter f14728p;

    /* renamed from: q */
    public RefreshLoadMoreLayout f14729q;

    /* renamed from: r */
    public FinderLikeDrawer f14730r;

    /* renamed from: s */
    public FinderLikeDrawer f14731s;

    /* renamed from: t */
    public FinderFavDrawer f14732t;

    /* renamed from: u */
    public C9745g8 f14733u;

    /* renamed from: v */
    public String f14734v;

    /* renamed from: w */
    public boolean f14735w;

    /* renamed from: x */
    public long f14736x;

    /* renamed from: y */
    public final C13601g f14737y = C36568h.m40985a(new C3035f(this));

    /* renamed from: z */
    public final C3033d f14738z = new C3033d();

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI$a */
    public static final class C3030a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTimeLineUI f14739d;

        public C3030a(FinderProfileTimeLineUI finderProfileTimeLineUI) {
            this.f14739d = finderProfileTimeLineUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderProfileTimeLineUI finderProfileTimeLineUI = this.f14739d;
            int i = FinderProfileTimeLineUI.f14726A;
            finderProfileTimeLineUI.mo3092O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI$b */
    public static final class C3031b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTimeLineUI f14740d;

        public C3031b(FinderProfileTimeLineUI finderProfileTimeLineUI) {
            this.f14740d = finderProfileTimeLineUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14740d.mo3092O7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI$c */
    public static final class C3032c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTimeLineUI f14741d;

        public C3032c(FinderProfileTimeLineUI finderProfileTimeLineUI) {
            this.f14741d = finderProfileTimeLineUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$initView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f14741d).mo75002a(C63575n3.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…allNormalUIC::class.java)");
            C63575n3.m74909c3((C63575n3) a, false, false, false, 7, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$initView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI$d */
    public static final class C3033d extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "1", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI$e */
    public static final class C3034e implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileTimeLineUI f14742a;

        public C3034e(FinderProfileTimeLineUI finderProfileTimeLineUI) {
            this.f14742a = finderProfileTimeLineUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14742a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str3 = "";
            if (Wb == null) {
                Wb = str3;
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str3;
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 != null) {
                str3 = S0;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str3);
            lVarArr[3] = new C13604l("extra_info", valueOf);
            Intent intent2 = this.f14742a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI$f */
    public static final class C3035f extends C87413o implements C32224a<C15976o> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTimeLineUI f14743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3035f(FinderProfileTimeLineUI finderProfileTimeLineUI) {
            super(0);
            this.f14743d = finderProfileTimeLineUI;
        }

        public Object invoke() {
            return C15976o.m14888a(this.f14743d.findViewById(C0966R.C0970id.egf));
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        String stringExtra = getIntent().getStringExtra("finder_username");
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        if (C87412m.m108589b(stringExtra, C66785b.f191882e.mo90662O5()) && booleanExtra) {
            z = true;
        }
        return z ? 8 : 1;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: N7 */
    public final C15976o mo3091N7() {
        return (C15976o) ((C36570n) this.f14737y).getValue();
    }

    /* renamed from: O7 */
    public final void mo3092O7() {
        Log.m105924i(this.f14727o, "goBack");
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        if (!((C48085q4) rVar.mo62444c(context).mo75002a(C48085q4.class)).onBackPressed()) {
            C16336r rVar2 = (C16336r) rVar.mo62444c(this).mo62449e(C16336r.class);
            if (!(rVar2 != null && rVar2.onBackPressed())) {
                FinderProfileDrawerUIC finderProfileDrawerUIC = (FinderProfileDrawerUIC) rVar.mo62444c(this).mo62449e(FinderProfileDrawerUIC.class);
                if (!(finderProfileDrawerUIC != null && finderProfileDrawerUIC.onBackPressed())) {
                    FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f14728p;
                    if (finderProfileTimelineContract$ProfileTimelinePresenter != null) {
                        C56597e1 r5 = finderProfileTimelineContract$ProfileTimelinePresenter.mo2579r5();
                        if (r5 != null && r5.mo79924b()) {
                            r5.mo79923a();
                            return;
                        }
                        FinderLikeDrawer finderLikeDrawer = this.f14730r;
                        if (finderLikeDrawer == null) {
                            C87412m.m108603p("likeDrawer");
                            throw null;
                        } else if (finderLikeDrawer.mo82541i()) {
                            FinderLikeDrawer finderLikeDrawer2 = this.f14730r;
                            if (finderLikeDrawer2 != null) {
                                finderLikeDrawer2.mo4615l();
                            } else {
                                C87412m.m108603p("likeDrawer");
                                throw null;
                            }
                        } else {
                            FinderLikeDrawer finderLikeDrawer3 = this.f14731s;
                            if (finderLikeDrawer3 == null) {
                                C87412m.m108603p("friendLikeDrawer");
                                throw null;
                            } else if (finderLikeDrawer3.mo82541i()) {
                                FinderLikeDrawer finderLikeDrawer4 = this.f14731s;
                                if (finderLikeDrawer4 != null) {
                                    finderLikeDrawer4.mo4615l();
                                } else {
                                    C87412m.m108603p("friendLikeDrawer");
                                    throw null;
                                }
                            } else {
                                FinderFavDrawer finderFavDrawer = this.f14732t;
                                if (finderFavDrawer == null) {
                                    C87412m.m108603p("friendFavDrawer");
                                    throw null;
                                } else if (finderFavDrawer.mo82541i()) {
                                    FinderFavDrawer finderFavDrawer2 = this.f14732t;
                                    if (finderFavDrawer2 == null) {
                                        C87412m.m108603p("friendFavDrawer");
                                        throw null;
                                    } else if (finderFavDrawer2.mo82541i()) {
                                        finderFavDrawer2.mo82540h(true);
                                    }
                                } else {
                                    C39622i0 a = rVar.mo62444c(this).mo75002a(C63575n3.class);
                                    C87412m.m108593f(a, "UICProvider.of(this).get…allNormalUIC::class.java)");
                                    if (!((C63575n3) a).mo88421d3(false)) {
                                        finish();
                                    }
                                }
                            }
                        }
                    } else {
                        C87412m.m108603p("presenter");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: P7 */
    public final void mo3093P7() {
        if (C85875k4.m106208w()) {
            mo3091N7().f42964h.setVisibility(0);
            mo3091N7().f42963g.setVisibility(0);
            mo3091N7().f42962f.setVisibility(4);
            if (!C85875k4.m106199o0()) {
                return;
            }
            if (C85861e4.m106115b(this)) {
                mo3091N7().f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
            } else {
                mo3091N7().f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
            }
        } else {
            mo3091N7().f42964h.setVisibility(8);
            mo3091N7().f42963g.setVisibility(8);
            mo3091N7().f42962f.setVisibility(8);
        }
    }

    public void finish() {
        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f14728p;
        if (finderProfileTimelineContract$ProfileTimelinePresenter != null) {
            if (finderProfileTimelineContract$ProfileTimelinePresenter != null) {
                DataBuffer dataListJustForAdapter = finderProfileTimelineContract$ProfileTimelinePresenter.mo2583x().getDataListJustForAdapter();
                C58784w3 w3Var = C58784w3.f168295a;
                FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter2 = this.f14728p;
                if (finderProfileTimelineContract$ProfileTimelinePresenter2 != null) {
                    C58784w3.m68427B1(w3Var, 0, dataListJustForAdapter, finderProfileTimelineContract$ProfileTimelinePresenter2.mo2583x().getLastBuffer(), getIntent(), (C2780c) null, 16, (Object) null);
                    setResult(-1, getIntent());
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aoe;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13539y3.class, C63513a1.class, C13466ta.class, C13194da.class, C56711j.class, C63648v.class, C63547e.class, C14078c.class, C13554z.class, C63575n3.class, C48085q4.class, C63545b1.class, C16336r.class);
    }

    public void initView() {
        C58553c a;
        C58553c a2;
        C58553c a3;
        Class cls = C13442s8.class;
        C58961d.C58963b bVar = C58961d.f168673a;
        String str = this.f14734v;
        C87412m.m108591d(str);
        C58969q b = bVar.mo84155b(str);
        String str2 = "";
        setMMTitle(b != null ? b.getNickname() : str2);
        View findViewById = findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "findViewById(R.id.rl_layout)");
        this.f14729q = (RefreshLoadMoreLayout) findViewById;
        setBackBtn(new C3030a(this));
        String str3 = this.f14734v;
        C87412m.m108591d(str3);
        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = new FinderProfileTimelineContract$ProfileTimelinePresenter(this, str3, this.f14735w, this.f14736x);
        this.f14728p = finderProfileTimelineContract$ProfileTimelinePresenter;
        C9745g8 g8Var = new C9745g8(this, finderProfileTimelineContract$ProfileTimelinePresenter);
        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter2 = this.f14728p;
        if (finderProfileTimelineContract$ProfileTimelinePresenter2 != null) {
            finderProfileTimelineContract$ProfileTimelinePresenter2.f13143n = g8Var;
            int i = finderProfileTimelineContract$ProfileTimelinePresenter2.f13138f ? 8 : 1;
            FinderProfileFeedLoader x = finderProfileTimelineContract$ProfileTimelinePresenter2.mo2583x();
            if (!(x instanceof FinderProfileFeedLoader)) {
                x = null;
            }
            if (x != null) {
                x.setFetchEndCallback(new C9672c8(finderProfileTimelineContract$ProfileTimelinePresenter2));
            }
            finderProfileTimelineContract$ProfileTimelinePresenter2.f13154y.alive();
            finderProfileTimelineContract$ProfileTimelinePresenter2.f13155z.alive();
            ContactUninterestEventListener contactUninterestEventListener = new ContactUninterestEventListener(finderProfileTimelineContract$ProfileTimelinePresenter2.mo2583x());
            finderProfileTimelineContract$ProfileTimelinePresenter2.f13151v = contactUninterestEventListener;
            contactUninterestEventListener.alive();
            FinderVideoCore finderVideoCore = finderProfileTimelineContract$ProfileTimelinePresenter2.f13153x;
            C9745g8 g8Var2 = finderProfileTimelineContract$ProfileTimelinePresenter2.f13143n;
            C87412m.m108591d(g8Var2);
            FinderVideoCore.m65069F1(finderVideoCore, g8Var2.f30197d, new C9636b8(finderProfileTimelineContract$ProfileTimelinePresenter2), false, 4, (Object) null);
            if (MediaPreloadCore.f160304p) {
                C63547e eVar = (C63547e) C39818r.f106831a.mo62444c(finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d).mo75002a(C63547e.class);
                DataBuffer dataListJustForAdapter = finderProfileTimelineContract$ProfileTimelinePresenter2.mo2583x().getDataListJustForAdapter();
                FinderVideoCore finderVideoCore2 = finderProfileTimelineContract$ProfileTimelinePresenter2.f13153x;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d);
                eVar.mo88403c3(dataListJustForAdapter, 0, finderVideoCore2, f != null ? C60172g4.C60173a.m70189a(f, 0, 1, (Object) null) : null, -1);
            }
            finderProfileTimelineContract$ProfileTimelinePresenter2.f13145p.mo77389H1(finderProfileTimelineContract$ProfileTimelinePresenter2.f13148s, i, new C9688d8(finderProfileTimelineContract$ProfileTimelinePresenter2));
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f2 = aVar.mo12873f(finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d);
            if (!(f2 == null || (a3 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
                a3.mo83450a(finderProfileTimelineContract$ProfileTimelinePresenter2.f13145p);
            }
            C39818r rVar = C39818r.f106831a;
            finderProfileTimelineContract$ProfileTimelinePresenter2.f13152w = new C7430d1(((C13442s8) rVar.mo62444c(finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d).mo75002a(cls)).mo12861q3()).f25618b;
            C13442s8 f3 = aVar.mo12873f(finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d);
            if (!(f3 == null || (a2 = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
                C58555d dVar = finderProfileTimelineContract$ProfileTimelinePresenter2.f13152w;
                if (dVar != null) {
                    a2.mo83450a(dVar);
                } else {
                    C87412m.m108603p("observerForExposeReport");
                    throw null;
                }
            }
            C8819z2 z2Var = finderProfileTimelineContract$ProfileTimelinePresenter2.f13146q;
            C9699e8 e8Var = new C9699e8(finderProfileTimelineContract$ProfileTimelinePresenter2);
            C9745g8 g8Var3 = finderProfileTimelineContract$ProfileTimelinePresenter2.f13143n;
            z2Var.mo9646T0(e8Var, g8Var3 != null ? g8Var3.getRecyclerView() : null);
            C13442s8 f4 = aVar.mo12873f(finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d);
            if (!(f4 == null || (a = C60172g4.C60173a.m70189a(f4, 0, 1, (Object) null)) == null)) {
                a.mo83450a(finderProfileTimelineContract$ProfileTimelinePresenter2.f13146q.mo9650n());
            }
            ((FinderFeedMegaVideoBtnAnimUIC) rVar.mo62444c(finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d).mo75002a(FinderFeedMegaVideoBtnAnimUIC.class)).mo80031d3(g8Var.getRecyclerView());
            RefreshLoadMoreLayout refreshLoadMoreLayout = g8Var.f30200g;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setActionCallback(new C9799i8(g8Var));
                Pattern pattern = C61926c.f176038a;
                C61926c.m72701z(C88643g.m110546d(), new C9844l8(g8Var));
                C37521f.f99374d.getClass();
                if (C37521f.f99277R7.mo60266n().intValue() == -1) {
                    RecyclerView recyclerView = g8Var.f30201h;
                    if (recyclerView != null) {
                        C13598b0 b0Var = C13598b0.f38549a;
                        C97675c.m125887e(recyclerView, C64197v.m75537f(new int[]{4, 6}, new int[]{2, 3}), (C97680h) null, (MMHandler) null, 6, (Object) null);
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                }
                C39622i0 a4 = rVar.mo62444c(g8Var.f30197d).mo75002a(cls);
                C87412m.m108593f(a4, "UICProvider.of(context).…rReporterUIC::class.java)");
                C58556f j3 = ((C13442s8) a4).mo12854j3(-1);
                if (j3 != null) {
                    RecyclerView recyclerView2 = g8Var.f30201h;
                    if (recyclerView2 != null) {
                        j3.mo83455c(recyclerView2);
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                }
                RecyclerView recyclerView3 = g8Var.f30201h;
                if (recyclerView3 != null) {
                    if ((recyclerView3 instanceof FinderRecyclerView) && (recyclerView3.getLayoutManager() instanceof LinearLayoutManager)) {
                        RecyclerView recyclerView4 = g8Var.f30201h;
                        if (recyclerView4 != null) {
                            RecyclerView.LayoutManager layoutManager = recyclerView4.getLayoutManager();
                            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            FinderRecyclerView.m63293z1((FinderRecyclerView) recyclerView4, (LinearLayoutManager) layoutManager, (String) null, 2, (Object) null);
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                    g8Var.f30199f.mo2583x().register(g8Var.f30203j);
                    this.f14733u = g8Var;
                    FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
                    this.f14730r = companion.mo4621a(this, getWindow(), 2);
                    AppCompatActivity context = getContext();
                    C87412m.m108593f(context, "context");
                    this.f14731s = companion.mo4621a(context, getWindow(), 1);
                    FinderFavDrawer.Companion companion2 = FinderFavDrawer.f162097C;
                    AppCompatActivity context2 = getContext();
                    C87412m.m108593f(context2, "context");
                    this.f14732t = companion2.mo79836a(context2, getWindow(), 0);
                    View findViewById2 = findViewById(C0966R.C0970id.egf);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view = findViewById2;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById(C0966R.C0970id.f357485a33).setOnClickListener(new C3031b(this));
                    TextView textView = (TextView) findViewById(C0966R.C0970id.ege);
                    C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                    AppCompatActivity context3 = getContext();
                    if (b != null) {
                        str2 = b.getNickname();
                    }
                    textView.setText(hVar.mo107057T1(context3, str2));
                    View decorView = getWindow().getDecorView();
                    C87412m.m108593f(decorView, "window.decorView");
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
                    getWindow().setStatusBarColor(0);
                    getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
                    C74779i.m89536a(this, false);
                    ActionBar supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.mo91112w(new ColorDrawable(0));
                        supportActionBar.mo91104o();
                    }
                    ((ViewGroup) findViewById(C0966R.C0970id.egf)).setPadding(0, C75044y4.m89994f(this), 0, 0);
                    mo3093P7();
                    mo3091N7().f42964h.setOnClickListener(new C14800n4(this));
                    getController().mo177049H0(true);
                    setNavigationbarColor(-16777216);
                    ((ViewGroup) findViewById(C0966R.C0970id.iv5)).setBackgroundColor(getResources().getColor(C0966R.color.f3493v5));
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f14729q;
                    if (refreshLoadMoreLayout2 != null) {
                        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7u, (ViewGroup) null);
                        C87412m.m108593f(inflate, "getInflater(context).inf…d_more_footer_dark, null)");
                        refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
                        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.a2z);
                        if (weImageView != null) {
                            weImageView.setIconColor(getResources().getColor(C0966R.color.f3583yg));
                        }
                        View findViewById3 = findViewById(C0966R.C0970id.m1o);
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(0);
                        View view2 = findViewById3;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setOnClickListener(new C3032c(this));
                        C63575n3 n3Var = (C63575n3) rVar.mo62444c(this).mo75002a(C63575n3.class);
                        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter3 = this.f14728p;
                        if (finderProfileTimelineContract$ProfileTimelinePresenter3 != null) {
                            n3Var.f180282h = finderProfileTimelineContract$ProfileTimelinePresenter3.mo2583x();
                            n3Var.mo88425i3(getIntent().getExtras());
                            return;
                        }
                        C87412m.m108603p("presenter");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public boolean isHideStatusBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        mo3092O7();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo3093P7();
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        C11345b bVar = C11345b.FinderProfileTimelineUI;
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar);
        this.f14734v = getIntent().getStringExtra("finder_username");
        boolean z = false;
        this.f14735w = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        this.f14736x = getIntent().getLongExtra("KEY_FROM_TOPIC_ID", 0);
        String str = this.f14727o;
        Log.m105924i(str, "username " + this.f14734v + ", selfFlag " + this.f14735w + ", topicId " + this.f14736x);
        if (Util.isNullOrNil(this.f14734v)) {
            finish();
            return;
        }
        String str2 = this.f14734v;
        if (str2 != null) {
            z = str2.equals(C66785b.f191882e.mo90662O5());
        }
        if (z) {
            boolean z2 = this.f14735w;
        }
        initView();
        C9745g8 g8Var = this.f14733u;
        if (g8Var != null) {
            g8Var.getRecyclerView().mo17043c(this.f14738z);
        }
        if (getIntent().hasExtra("key_extra_info")) {
            long longExtra = getIntent().getLongExtra("KEY_FINDER_FEEDID", 0);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            if (f != null) {
                f.mo12848O3(longExtra, this.f14734v);
            }
        }
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderProfileTimeLineUI");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3034e(this));
    }

    public void onDestroy() {
        C9745g8 g8Var = this.f14733u;
        if (g8Var != null) {
            g8Var.getRecyclerView().mo17098m1(this.f14738z);
        }
        super.onDestroy();
        C9745g8 g8Var2 = this.f14733u;
        if (g8Var2 != null) {
            g8Var2.f30199f.mo2583x().unregister(g8Var2.f30203j);
            g8Var2.f30199f.onDetach();
            g8Var2.getRecyclerView().setAdapter((RecyclerView.C16613e) null);
        }
    }

    public void onPause() {
        Class cls = C10383h.class;
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9745g8 g8Var = this.f14733u;
        C8777j5.C8778a.m8602c(j5Var, g8Var != null ? g8Var.getRecyclerView() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "1", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        long currentTimeMillis = System.currentTimeMillis();
        int i = C11717f.f34295B0;
        long j = currentTimeMillis - C11717f.C11718a.f34296a;
        long j2 = C11717f.C11718a.f34296a;
        long currentTimeMillis2 = System.currentTimeMillis();
        String TX = ((C10383h) C86312j.m106911c(cls)).mo10699TX();
        String e = ((C23462b) ((C10383h) C86312j.m106911c(cls)).mo10693DZ()).mo36921e();
        String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
        String str = C11716d.f34294a;
        C87412m.m108593f(E, "getFinderContextId()");
        ((C11717f) C86312j.m106911c(C11717f.class)).f50(new C22623c(Wb, "FinderProfileTimeLineUI", j, j2, currentTimeMillis2, TX, e, 0, false, str, (String) null, E, 1280, (C8480h) null));
        C9745g8 g8Var2 = this.f14733u;
        if (g8Var2 != null) {
            g8Var2.f30199f.f13149t.dead();
        }
    }

    public void onResume() {
        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter;
        C9745g8 g8Var;
        super.onResume();
        String str = this.f14734v;
        if (str == null) {
            str = "";
        }
        C65604i.f188773b = str;
        C9745g8 g8Var2 = this.f14733u;
        if (!(g8Var2 == null || (g8Var = finderProfileTimelineContract$ProfileTimelinePresenter.f13143n) == null)) {
            g8Var.getRecyclerView().post(new C9718f8((finderProfileTimelineContract$ProfileTimelinePresenter = g8Var2.f30199f)));
        }
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9745g8 g8Var3 = this.f14733u;
        C8777j5.C8778a.m8602c(j5Var, g8Var3 != null ? g8Var3.getRecyclerView() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "1", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
        int i = C11717f.f34295B0;
        C11717f.C11718a.f34296a = System.currentTimeMillis();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f14727o;
        Log.m105924i(str2, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
    }
}
