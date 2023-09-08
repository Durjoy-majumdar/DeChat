package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9732g;
import kf1.C9753h;
import kf1.C9852m3;
import kf1.C9866n3;
import kotlin.Metadata;
import rs1.C13442s8;
import rx3.C13598b0;
import up1.C37521f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lkf1/n3;", "Lkf1/m3;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamFeedUI */
public final class FinderLbsStreamFeedUI extends FinderBaseGridFeedUI<C9866n3, C9852m3> {

    /* renamed from: o */
    public C9852m3 f14466o;

    /* renamed from: p */
    public C9866n3 f14467p;

    /* renamed from: q */
    public BaseFinderFeedLoader f14468q;

    /* renamed from: r */
    public final int f14469r = 2;

    /* renamed from: s */
    public String f14470s = "";

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamFeedUI$a */
    public static final class C2949a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLbsStreamFeedUI f14471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2949a(FinderLbsStreamFeedUI finderLbsStreamFeedUI) {
            super(1);
            this.f14471d = finderLbsStreamFeedUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            FinderLbsStreamFeedUI finderLbsStreamFeedUI = this.f14471d;
            BaseFinderFeedLoader baseFinderFeedLoader = finderLbsStreamFeedUI.f14468q;
            View view = null;
            if (baseFinderFeedLoader != null) {
                if (((FinderLbsStreamFeedLoader) baseFinderFeedLoader).f13690f != 0) {
                    C9866n3 n3Var = finderLbsStreamFeedUI.f14467p;
                    if (n3Var != null) {
                        View view2 = n3Var.f30225r;
                        TextView textView3 = view2 != null ? (TextView) view2.findViewById(C0966R.C0970id.f357845c22) : null;
                        if (textView3 != null) {
                            Resources resources = this.f14471d.getContext().getResources();
                            Object[] objArr = new Object[1];
                            BaseFinderFeedLoader baseFinderFeedLoader2 = this.f14471d.f14468q;
                            if (baseFinderFeedLoader2 != null) {
                                objArr[0] = Integer.valueOf(((FinderLbsStreamFeedLoader) baseFinderFeedLoader2).f13690f);
                                textView3.setText(resources.getString(C0966R.string.d8j, objArr));
                            } else {
                                C87412m.m108603p("feedLoader");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
                if (!((FinderLbsStreamFeedLoader.C2706b) iResponse).getHasMore()) {
                    C9866n3 n3Var2 = this.f14471d.f14467p;
                    if (n3Var2 != null) {
                        View loadMoreFooter = n3Var2.f30220j.getLoadMoreFooter();
                        if (loadMoreFooter != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view3 = loadMoreFooter;
                            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C9866n3 n3Var3 = this.f14471d.f14467p;
                        if (n3Var3 != null) {
                            View loadMoreFooter2 = n3Var3.f30220j.getLoadMoreFooter();
                            if (!(loadMoreFooter2 == null || (textView2 = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                                textView2.setText(C0966R.string.eat);
                            }
                            C9866n3 n3Var4 = this.f14471d.f14467p;
                            if (n3Var4 != null) {
                                View loadMoreFooter3 = n3Var4.f30220j.getLoadMoreFooter();
                                if (!(loadMoreFooter3 == null || (textView = (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t)) == null)) {
                                    textView.setTextColor(this.f14471d.getResources().getColor(C0966R.color.FG_2));
                                }
                                C9866n3 n3Var5 = this.f14471d.f14467p;
                                if (n3Var5 != null) {
                                    View loadMoreFooter4 = n3Var5.f30220j.getLoadMoreFooter();
                                    TextView textView4 = loadMoreFooter4 != null ? (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t) : null;
                                    if (textView4 != null) {
                                        textView4.setVisibility(8);
                                    }
                                    C9866n3 n3Var6 = this.f14471d.f14467p;
                                    if (n3Var6 != null) {
                                        View loadMoreFooter5 = n3Var6.f30220j.getLoadMoreFooter();
                                        if (loadMoreFooter5 != null) {
                                            view = loadMoreFooter5.findViewById(C0966R.C0970id.g2s);
                                        }
                                        if (view != null) {
                                            C9556a aVar2 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                            aVar2.mo10233c(0);
                                            View view4 = view;
                                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            C87412m.m108603p("feedLoader");
            throw null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        C37521f.f99374d.getClass();
        return C37521f.f99446l2.mo60266n().intValue() != 0 ? 43 : 16;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: N7 */
    public C9732g mo2960N7() {
        C9852m3 m3Var = this.f14466o;
        if (m3Var != null) {
            return m3Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: O7 */
    public C9753h mo2961O7() {
        C9866n3 n3Var = this.f14467p;
        if (n3Var != null) {
            return n3Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: P7 */
    public void mo2962P7() {
    }

    /* renamed from: Q7 */
    public void mo2963Q7() {
        String stringExtra = getIntent().getStringExtra("KEY_UI_TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f14470s = stringExtra;
        setMMTitle(stringExtra);
        FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = new FinderLbsStreamFeedLoader(C66785b.f191882e.mo90662O5(), ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
        finderLbsStreamFeedLoader.initFromCache(getIntent());
        finderLbsStreamFeedLoader.f13689e = new C2949a(this);
        this.f14468q = finderLbsStreamFeedLoader;
        int i = this.f14469r;
        int I7 = mo2194I7();
        BaseFinderFeedLoader baseFinderFeedLoader = this.f14468q;
        if (baseFinderFeedLoader != null) {
            this.f14466o = new C9852m3(this, i, I7, baseFinderFeedLoader);
            C9866n3 n3Var = new C9866n3(this, this.f14469r, mo2194I7(), this.f14470s);
            this.f14467p = n3Var;
            C9852m3 m3Var = this.f14466o;
            if (m3Var != null) {
                n3Var.f30222o = m3Var;
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C87412m.m108603p("feedLoader");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.adf;
    }
}
