package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C10009v2;
import kf1.C9854m5;
import kf1.C9994u2;
import kotlin.Metadata;
import p629ny.C76979h;
import rs1.C13442s8;
import rx3.C13598b0;
import tf1.C13913l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFriendFoldedTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFriendFoldedFeedLoader;", "Lkf1/v2;", "Lkf1/u2;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendFoldedTimelineUI */
public final class FinderFriendFoldedTimelineUI extends FinderLoaderFeedUI<FinderFriendFoldedFeedLoader, C10009v2, C9994u2> {

    /* renamed from: s */
    public C9994u2 f14328s;

    /* renamed from: t */
    public C10009v2 f14329t;

    /* renamed from: u */
    public FinderFriendFoldedFeedLoader f14330u;

    /* renamed from: v */
    public final int f14331v = 2;

    /* renamed from: w */
    public String f14332w;

    /* renamed from: x */
    public String f14333x;

    /* renamed from: y */
    public long f14334y;

    /* renamed from: z */
    public String f14335z = "";

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendFoldedTimelineUI$a */
    public static final class C2907a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderFriendFoldedTimelineUI f14336a;

        /* renamed from: b */
        public final /* synthetic */ FinderFriendFoldedFeedLoader f14337b;

        public C2907a(FinderFriendFoldedTimelineUI finderFriendFoldedTimelineUI, FinderFriendFoldedFeedLoader finderFriendFoldedFeedLoader) {
            this.f14336a = finderFriendFoldedTimelineUI;
            this.f14337b = finderFriendFoldedFeedLoader;
        }

        public void call(int i) {
            C10009v2 v2Var = this.f14336a.f14329t;
            if (v2Var != null) {
                RecyclerView.LayoutManager layoutManager = v2Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14337b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendFoldedTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendFoldedTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            C87412m.m108603p("mViewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendFoldedTimelineUI$b */
    public static final class C2908b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendFoldedTimelineUI f14338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2908b(FinderFriendFoldedTimelineUI finderFriendFoldedTimelineUI) {
            super(1);
            this.f14338d = finderFriendFoldedTimelineUI;
        }

        public Object invoke(Object obj) {
            View findViewById;
            View findViewById2;
            TextView textView;
            TextView textView2;
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            C10009v2 v2Var = this.f14338d.f14329t;
            if (v2Var != null) {
                View loadMoreFooter = v2Var.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C10009v2 v2Var2 = this.f14338d.f14329t;
                if (v2Var2 != null) {
                    View loadMoreFooter2 = v2Var2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(this.f14338d.getResources().getColor(C0966R.color.FG_2));
                    }
                    C10009v2 v2Var3 = this.f14338d.f14329t;
                    if (v2Var3 != null) {
                        View loadMoreFooter3 = v2Var3.mo10308D().getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        C10009v2 v2Var4 = this.f14338d.f14329t;
                        if (v2Var4 != null) {
                            View loadMoreFooter4 = v2Var4.mo10308D().getLoadMoreFooter();
                            View findViewById3 = loadMoreFooter4 != null ? loadMoreFooter4.findViewById(C0966R.C0970id.g2s) : null;
                            if (findViewById3 != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                C117292a.m165358d(findViewById3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendFoldedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendFoldedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            C10009v2 v2Var5 = this.f14338d.f14329t;
                            if (v2Var5 != null) {
                                View loadMoreFooter5 = v2Var5.mo10308D().getLoadMoreFooter();
                                View findViewById4 = loadMoreFooter5 != null ? loadMoreFooter5.findViewById(C0966R.C0970id.aym) : null;
                                if (findViewById4 != null) {
                                    findViewById4.setBackground(this.f14338d.getDrawable(C0966R.C0969drawable.f5111x6));
                                }
                                C10009v2 v2Var6 = this.f14338d.f14329t;
                                if (v2Var6 != null) {
                                    View loadMoreFooter6 = v2Var6.mo10308D().getLoadMoreFooter();
                                    if (!(loadMoreFooter6 == null || (findViewById2 = loadMoreFooter6.findViewById(C0966R.C0970id.fms)) == null)) {
                                        findViewById2.setBackgroundColor(this.f14338d.getContext().getResources().getColor(C0966R.color.f3579yb));
                                    }
                                    C10009v2 v2Var7 = this.f14338d.f14329t;
                                    if (v2Var7 != null) {
                                        View loadMoreFooter7 = v2Var7.mo10308D().getLoadMoreFooter();
                                        if (!(loadMoreFooter7 == null || (findViewById = loadMoreFooter7.findViewById(C0966R.C0970id.itl)) == null)) {
                                            findViewById.setBackgroundColor(this.f14338d.getContext().getResources().getColor(C0966R.color.f3579yb));
                                        }
                                        return C13598b0.f38549a;
                                    }
                                    C87412m.m108603p("mViewCallback");
                                    throw null;
                                }
                                C87412m.m108603p("mViewCallback");
                                throw null;
                            }
                            C87412m.m108603p("mViewCallback");
                            throw null;
                        }
                        C87412m.m108603p("mViewCallback");
                        throw null;
                    }
                    C87412m.m108603p("mViewCallback");
                    throw null;
                }
                C87412m.m108603p("mViewCallback");
                throw null;
            }
            C87412m.m108603p("mViewCallback");
            throw null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 14;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderFriendFoldedFeedLoader finderFriendFoldedFeedLoader = this.f14330u;
        if (finderFriendFoldedFeedLoader != null) {
            return finderFriendFoldedFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9994u2 u2Var = this.f14328s;
        if (u2Var != null) {
            return u2Var;
        }
        C87412m.m108603p("mPresenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C10009v2 v2Var = this.f14329t;
        if (v2Var != null) {
            return v2Var;
        }
        C87412m.m108603p("mViewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        Class cls = C76979h.class;
        String stringExtra = getIntent().getStringExtra("USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f14332w = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("NICKNAME");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f14333x = stringExtra2;
        this.f14334y = getIntent().getLongExtra("FEED_ID", 0);
        String stringExtra3 = getIntent().getStringExtra("FEED_NONCE_ID");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f14335z = stringExtra3;
        int intExtra = getIntent().getIntExtra("FOLED_TYPE", 1);
        if (intExtra == 1) {
            Object[] objArr = new Object[1];
            C76979h hVar = (C76979h) C86312j.m106911c(cls);
            AppCompatActivity context = getContext();
            String str = this.f14333x;
            if (str != null) {
                objArr[0] = hVar.mo107057T1(context, str);
                setMMTitle(getString(C0966R.string.d_f, objArr));
            } else {
                C87412m.m108603p("nickname");
                throw null;
            }
        } else if (intExtra == 2) {
            Object[] objArr2 = new Object[1];
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls);
            AppCompatActivity context2 = getContext();
            String str2 = this.f14333x;
            if (str2 != null) {
                objArr2[0] = hVar2.mo107057T1(context2, str2);
                setMMTitle(getString(C0966R.string.d9u, objArr2));
            } else {
                C87412m.m108603p("nickname");
                throw null;
            }
        } else {
            setMMTitle("");
        }
        long j = this.f14334y;
        String str3 = this.f14332w;
        if (str3 != null) {
            C9994u2 u2Var = new C9994u2(this, j, str3, this.f14331v);
            this.f14328s = u2Var;
            this.f14329t = new C10009v2(this, u2Var, this.f14331v, 14);
            String str4 = this.f14332w;
            if (str4 != null) {
                FinderFriendFoldedFeedLoader finderFriendFoldedFeedLoader = new FinderFriendFoldedFeedLoader(str4, this.f14334y, this.f14335z, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
                finderFriendFoldedFeedLoader.initFromCache(getIntent());
                finderFriendFoldedFeedLoader.setInitDone(new C2907a(this, finderFriendFoldedFeedLoader));
                finderFriendFoldedFeedLoader.f13610g = new C2908b(this);
                this.f14330u = finderFriendFoldedFeedLoader;
                return;
            }
            C87412m.m108603p("username");
            throw null;
        }
        C87412m.m108603p("username");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.abq;
    }
}
