package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.fav.p057ui.FinderLocalFeedLoader;
import com.tencent.xweb.util.WXWebReporter;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kf1.C9854m5;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import p217oq.C11717f;
import q31.C118148a;
import rs1.C13317l7;
import rs1.C13442s8;
import rs1.C13466ta;
import rs1.C13554z;
import rs1.C63513a1;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import sx3.C90364q0;
import ts1.C14078c;
import u24.C90599h;
import u91.C22623c;
import vf1.C14719a4;
import vf1.C14729b4;
import vf1.C14836u5;
import vo3.C90852c;
import z91.C23462b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI25;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lvf1/b4;", "Lvf1/a4;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 */
public final class OccupyFinderUI25 extends FinderLoaderFeedUI<BaseFinderFeedLoader, C14729b4, C14719a4> {

    /* renamed from: A */
    public final C13601g f14928A = C36568h.m40985a(new C3092b(this));

    /* renamed from: B */
    public final int f14929B = 2;

    /* renamed from: C */
    public final C3093c f14930C = new C3093c();

    /* renamed from: s */
    public List<Long> f14931s = new ArrayList();

    /* renamed from: t */
    public long f14932t;

    /* renamed from: u */
    public int f14933u;

    /* renamed from: v */
    public boolean f14934v;

    /* renamed from: w */
    public C14719a4 f14935w;

    /* renamed from: x */
    public C14729b4 f14936x;

    /* renamed from: y */
    public BaseFinderFeedLoader f14937y;

    /* renamed from: z */
    public final C13601g f14938z = C36568h.m40985a(new C3094d(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25$a */
    public static final class C3091a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ OccupyFinderUI25 f14939a;

        public C3091a(OccupyFinderUI25 occupyFinderUI25) {
            this.f14939a = occupyFinderUI25;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14939a.getIntent();
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
            Intent intent2 = this.f14939a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25$b */
    public static final class C3092b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI25 f14940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3092b(OccupyFinderUI25 occupyFinderUI25) {
            super(0);
            this.f14940d = occupyFinderUI25;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f14940d.getIntent().getBooleanExtra("KEY_IS_GLOBAL_FAV", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25$c */
    public static final class C3093c extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI25$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI25$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI25$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "21", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI25$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25$d */
    public static final class C3094d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI25 f14941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3094d(OccupyFinderUI25 occupyFinderUI25) {
            super(0);
            this.f14941d = occupyFinderUI25;
        }

        public Object invoke() {
            return Integer.valueOf(this.f14941d.getIntent().getIntExtra("KEY_COMMENT_SCENE", 0));
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        if (((Boolean) ((C36570n) this.f14928A).getValue()).booleanValue()) {
            return WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
        }
        if (((Number) ((C36570n) this.f14938z).getValue()).intValue() != 0) {
            return ((Number) ((C36570n) this.f14938z).getValue()).intValue();
        }
        return 0;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return (((Boolean) ((C36570n) this.f14928A).getValue()).booleanValue() || ((Number) ((C36570n) this.f14938z).getValue()).intValue() != 0) ? 2 : 0;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        BaseFinderFeedLoader baseFinderFeedLoader = this.f14937y;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C14719a4 a4Var = this.f14935w;
        if (a4Var != null) {
            return a4Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C14729b4 b4Var = this.f14936x;
        if (b4Var != null) {
            return b4Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        int i;
        int i2;
        Class cls = C61212e.class;
        this.f14932t = getIntent().getLongExtra("KEY_CENTER_FEED_ID", 0);
        int i3 = 0;
        this.f14933u = getIntent().getIntExtra("KEY_CENTER_FEED_POS", 0);
        this.f14934v = getIntent().getBooleanExtra("KEY_HAS_MORE", false);
        long[] longArrayExtra = getIntent().getLongArrayExtra("KEY_FEED_ID_LIST");
        if (longArrayExtra == null) {
            longArrayExtra = new long[0];
        }
        ArrayList arrayList = new ArrayList(longArrayExtra.length);
        for (long valueOf : longArrayExtra) {
            arrayList.add(Long.valueOf(valueOf));
        }
        this.f14931s = arrayList;
        int i4 = this.f14933u;
        if (i4 > 10) {
            i = i4 - 4;
            i2 = i4 + 5;
        } else {
            i2 = 9;
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        int e = C64197v.m75536e(arrayList);
        if (i > e) {
            i = e;
        }
        if (i2 >= 0) {
            i3 = i2;
        }
        int e2 = C64197v.m75536e(arrayList);
        if (i3 > e2) {
            i3 = e2;
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i3);
        int intValue = valueOf2.intValue();
        int intValue2 = valueOf3.intValue();
        C14719a4 a4Var = new C14719a4(this, this.f14929B, this.f14931s, intValue, intValue2, this.f14932t, this.f14934v);
        this.f14935w = a4Var;
        this.f14936x = new C14729b4(this, a4Var, this.f14929B, mo2194I7());
        FinderLocalFeedLoader finderLocalFeedLoader = new FinderLocalFeedLoader(this.f14931s, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), intValue, intValue2, this.f14932t, this.f14934v, ((Boolean) ((C36570n) this.f14928A).getValue()).booleanValue());
        finderLocalFeedLoader.setInitDone(new C14836u5(this, finderLocalFeedLoader));
        this.f14937y = finderLocalFeedLoader;
        C14729b4 b4Var = this.f14936x;
        if (b4Var != null) {
            b4Var.getRecyclerView().mo17043c(this.f14930C);
            ((WeImageView) findViewById(C0966R.C0970id.a2z)).setIconColor(getResources().getColor(C0966R.color.f3583yg));
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderFavTimelineUI).mo86179qs(this, C76986a.Finder).mo86148No(this, 168, 24184);
            ((C61212e) C86312j.m106911c(cls)).E60(this, new C3091a(this));
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public void finish() {
        Intent intent = new Intent();
        C14719a4 a4Var = this.f14935w;
        if (a4Var != null) {
            intent.putExtra("DATA_SIZE", a4Var.f40679u.size());
            setResult(-1, intent);
            super.finish();
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.arq;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet<T> w0 = C110818d0.m150951w0(super.importUIComponents());
        w0.add(C13466ta.class);
        w0.add(C14078c.class);
        w0.add(C13554z.class);
        w0.add(C63513a1.class);
        w0.add(C13442s8.class);
        w0.add(C13317l7.class);
        return w0;
    }

    public void onDestroy() {
        C14729b4 b4Var = this.f14936x;
        if (b4Var != null) {
            b4Var.getRecyclerView().mo17098m1(this.f14930C);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void onPause() {
        Class cls = C59774i.class;
        Class cls2 = C11717f.class;
        Class cls3 = C10383h.class;
        super.onPause();
        String Wb = ((C59774i) C86312j.m106911c(cls)).mo84751Wb();
        long currentTimeMillis = System.currentTimeMillis();
        int i = C11717f.f34295B0;
        long j = currentTimeMillis - C11717f.C11718a.f34297b;
        long j2 = C11717f.C11718a.f34297b;
        long currentTimeMillis2 = System.currentTimeMillis();
        String TX = ((C10383h) C86312j.m106911c(cls3)).mo10699TX();
        String e = ((C23462b) ((C10383h) C86312j.m106911c(cls3)).mo10693DZ()).mo36921e();
        String E = ((C10383h) C86312j.m106911c(cls3)).mo10696E();
        String str = C11716d.f34294a;
        Class cls4 = cls3;
        C87412m.m108593f(E, "finderContextId");
        C22623c cVar = r5;
        C22623c cVar2 = new C22623c(Wb, "FinderGlobalFavLocalTimelineUI", j, j2, currentTimeMillis2, TX, e, 0, false, str, (String) null, E, 1280, (C8480h) null);
        ((C11717f) C86312j.m106911c(cls2)).f50(cVar);
        String Wb2 = ((C59774i) C86312j.m106911c(cls)).mo84751Wb();
        long currentTimeMillis3 = System.currentTimeMillis() - C11717f.C11718a.f34297b;
        long j3 = C11717f.C11718a.f34297b;
        long currentTimeMillis4 = System.currentTimeMillis();
        String TX2 = ((C10383h) C86312j.m106911c(cls4)).mo10699TX();
        String e2 = ((C23462b) ((C10383h) C86312j.m106911c(cls4)).mo10693DZ()).mo36921e();
        String E2 = ((C10383h) C86312j.m106911c(cls4)).mo10696E();
        String str2 = C11716d.f34294a;
        C87412m.m108593f(E2, "finderContextId");
        ((C11717f) C86312j.m106911c(cls2)).f50(new C22623c(Wb2, "FinderGlobalFavLocalTimelineUI", currentTimeMillis3, j3, currentTimeMillis4, TX2, e2, 1, false, str2, (String) null, E2, 1280, (C8480h) null));
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C14729b4 b4Var = this.f14936x;
        if (b4Var != null) {
            C8777j5.C8778a.m8602c(j5Var, b4Var.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "21", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        int i = C11717f.f34295B0;
        C11717f.C11718a.f34297b = System.currentTimeMillis();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C14729b4 b4Var = this.f14936x;
        if (b4Var != null) {
            C8777j5.C8778a.m8602c(j5Var, b4Var.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "21", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
