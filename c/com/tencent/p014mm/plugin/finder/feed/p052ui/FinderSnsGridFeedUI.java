package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import dp1.C58380k1;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kf1.C9732g;
import kf1.C9753h;
import kf1.C9801i9;
import kf1.C9813j9;
import kotlin.Metadata;
import rs1.C13442s8;
import rx3.C13598b0;
import tf1.C13908i;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lkf1/j9;", "Lkf1/i9;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI */
public final class FinderSnsGridFeedUI extends FinderBaseGridFeedUI<C9813j9, C9801i9> {

    /* renamed from: o */
    public C9801i9 f14825o;

    /* renamed from: p */
    public C9813j9 f14826p;

    /* renamed from: q */
    public boolean f14827q;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI$a */
    public static final class C3054a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsGridFeedUI f14828d;

        public C3054a(FinderSnsGridFeedUI finderSnsGridFeedUI) {
            this.f14828d = finderSnsGridFeedUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14828d.mo3110R7(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI$b */
    public static final class C3055b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedLoader f14829d;

        /* renamed from: e */
        public final /* synthetic */ FinderSnsGridFeedUI f14830e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3055b(FinderProfileFeedLoader finderProfileFeedLoader, FinderSnsGridFeedUI finderSnsGridFeedUI) {
            super(1);
            this.f14829d = finderProfileFeedLoader;
            this.f14830e = finderSnsGridFeedUI;
        }

        public Object invoke(Object obj) {
            View findViewById;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (!((FinderProfileFeedLoader.ProfileResponse) iResponse).getHasMore() && this.f14829d.getDataListJustForAdapter().size() != 0) {
                C9813j9 j9Var = this.f14830e.f14826p;
                if (j9Var != null) {
                    View loadMoreFooter = j9Var.f30220j.getLoadMoreFooter();
                    if (loadMoreFooter != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C9813j9 j9Var2 = this.f14830e.f14826p;
                    if (j9Var2 != null) {
                        View loadMoreFooter2 = j9Var2.f30220j.getLoadMoreFooter();
                        TextView textView = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        C9813j9 j9Var3 = this.f14830e.f14826p;
                        if (j9Var3 != null) {
                            View loadMoreFooter3 = j9Var3.f30220j.getLoadMoreFooter();
                            if (!(loadMoreFooter3 == null || (findViewById = loadMoreFooter3.findViewById(C0966R.C0970id.g2s)) == null)) {
                                FinderSnsGridFeedUI finderSnsGridFeedUI = this.f14830e;
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(0);
                                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                int argb = Color.argb(13, 255, 255, 255);
                                findViewById.findViewById(C0966R.C0970id.aym).setBackground(finderSnsGridFeedUI.getDrawable(C0966R.C0969drawable.f5111x6));
                                findViewById.findViewById(C0966R.C0970id.fms).setBackgroundColor(argb);
                                findViewById.findViewById(C0966R.C0970id.itl).setBackgroundColor(argb);
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI$c */
    public static final class C3056c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSnsGridFeedUI f14831d;

        public C3056c(FinderSnsGridFeedUI finderSnsGridFeedUI) {
            this.f14831d = finderSnsGridFeedUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f14831d.mo3110R7(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: N7 */
    public C9732g mo2960N7() {
        C9801i9 i9Var = this.f14825o;
        if (i9Var != null) {
            return i9Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: O7 */
    public C9753h mo2961O7() {
        C9813j9 j9Var = this.f14826p;
        if (j9Var != null) {
            return j9Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: Q7 */
    public void mo2963Q7() {
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2947a4));
        hideTitleView();
        findViewById(C0966R.C0970id.f5382dn).setOnClickListener(new C3054a(this));
        C13908i iVar = C13908i.FEED_PROFILE;
        C66785b bVar = C66785b.f191882e;
        FinderProfileFeedLoader finderProfileFeedLoader = new FinderProfileFeedLoader(iVar, bVar.mo90662O5(), ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), false, false, 24, (C8480h) null);
        finderProfileFeedLoader.setNeedToFilterLiveData(true);
        finderProfileFeedLoader.setFetchEndCallback(new C3055b(finderProfileFeedLoader, this));
        this.f14825o = new C9801i9(this, 0, 0, finderProfileFeedLoader);
        C9813j9 j9Var = new C9813j9(this, 0, 0, false);
        this.f14826p = j9Var;
        C9801i9 i9Var = this.f14825o;
        if (i9Var != null) {
            j9Var.f30222o = i9Var;
            if (Util.isNullOrNil(bVar.mo90662O5())) {
                C9813j9 j9Var2 = this.f14826p;
                if (j9Var2 != null) {
                    View m0 = j9Var2.mo9299m0();
                    if (m0 != null) {
                        View findViewById = m0.findViewById(C0966R.C0970id.ciz);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ((TextView) m0.findViewById(C0966R.C0970id.cjb)).setText(m0.getContext().getString(C0966R.string.epy));
                        ((TextView) m0.findViewById(C0966R.C0970id.cjc)).setText(m0.getContext().getString(C0966R.string.epz));
                        m0.findViewById(C0966R.C0970id.cim).setOnClickListener(new C3056c(this));
                        View findViewById2 = findViewById(C0966R.C0970id.f5385dq);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        View view2 = findViewById2;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public final void mo3110R7(boolean z) {
        Class cls = C13442s8.class;
        boolean isNullOrNil = Util.isNullOrNil(C66785b.f191882e.mo90662O5());
        int i = isNullOrNil ? C0966R.string.epz : C0966R.string.f360782eq1;
        String str = "";
        if (z) {
            int i2 = isNullOrNil ? 5 : 7;
            C58380k1 k1Var = C58380k1.f167276a;
            String str2 = ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(cls)).f38099o;
            if (str2 != null) {
                str = str2;
            }
            String string = getContext().getString(i);
            C87412m.m108593f(string, "context.getString(strId)");
            C58380k1.m67708a(k1Var, str, i2, string, isNullOrNil, false, 0, 32, (Object) null);
        } else {
            C9813j9 j9Var = this.f14826p;
            if (j9Var != null) {
                View m0 = j9Var.mo9299m0();
                boolean z2 = false;
                if (m0 != null && m0.getVisibility() == 0) {
                    z2 = true;
                }
                if (z2) {
                    int i3 = isNullOrNil ? 6 : 8;
                    C58380k1 k1Var2 = C58380k1.f167276a;
                    String str3 = ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(cls)).f38099o;
                    if (str3 != null) {
                        str = str3;
                    }
                    String string2 = getContext().getString(i);
                    C87412m.m108593f(string2, "context.getString(strId)");
                    C58380k1.m67708a(k1Var2, str, i3, string2, isNullOrNil, false, 0, 32, (Object) null);
                } else {
                    C58380k1 k1Var3 = C58380k1.f167276a;
                    String str4 = ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(cls)).f38099o;
                    C58380k1.m67708a(k1Var3, str4 == null ? str : str4, 4, (String) null, false, false, 0, 60, (Object) null);
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.apy;
    }

    public void onBackPressed() {
        mo3110R7(false);
    }

    public void onResume() {
        super.onResume();
        if (this.f14827q) {
            finish();
        }
    }
}
