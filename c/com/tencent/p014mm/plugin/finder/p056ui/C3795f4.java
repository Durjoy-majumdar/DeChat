package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kf1.C9662c2;
import rx3.C13598b0;
import zp3.C23564m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.finder.ui.f4 */
public final class C3795f4 extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17270d;

    /* renamed from: e */
    public final /* synthetic */ FinderFeedShareRelativeListLoader f17271e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3795f4(FinderShareFeedRelUI finderShareFeedRelUI, FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        super(1);
        this.f17270d = finderShareFeedRelUI;
        this.f17271e = finderFeedShareRelativeListLoader;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
        C9662c2 c2Var = this.f17270d.f17168u;
        if (c2Var != null) {
            RefreshLoadMoreLayout D = c2Var.mo10308D();
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f17270d.f17169v;
            if (finderFeedShareRelativeListLoader != null) {
                D.setEnableLoadMore(!finderFeedShareRelativeListLoader.f13573s);
                if (!iResponse.getHasMore()) {
                    if (iResponse.getPullType() == 19) {
                        C9662c2 c2Var2 = this.f17270d.f17168u;
                        if (c2Var2 != null) {
                            c2Var2.mo10308D().setEnableRefresh(false);
                            C9662c2 c2Var3 = this.f17270d.f17168u;
                            if (c2Var3 != null) {
                                c2Var3.mo10308D().setLimitTopRequest(-1);
                                C9662c2 c2Var4 = this.f17270d.f17168u;
                                if (c2Var4 != null) {
                                    c2Var4.mo10308D().setRefreshTargetY(-1);
                                    C9662c2 c2Var5 = this.f17270d.f17168u;
                                    if (c2Var5 != null) {
                                        c2Var5.mo10308D().setDamping(0.0f);
                                        C9662c2 c2Var6 = this.f17270d.f17168u;
                                        if (c2Var6 != null) {
                                            c2Var6.mo10308D().animate().cancel();
                                            C9662c2 c2Var7 = this.f17270d.f17168u;
                                            if (c2Var7 != null) {
                                                c2Var7.mo10308D().setTranslationY(0.0f);
                                                C9662c2 c2Var8 = this.f17270d.f17168u;
                                                if (c2Var8 != null) {
                                                    c2Var8.mo10308D().getRecyclerView().setTranslationY(0.0f);
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
                            } else {
                                C87412m.m108603p("viewCallback");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C9662c2 c2Var9 = this.f17270d.f17168u;
                        if (c2Var9 != null) {
                            View loadMoreFooter = c2Var9.mo10308D().getLoadMoreFooter();
                            View findViewById = loadMoreFooter != null ? loadMoreFooter.findViewById(C0966R.C0970id.ive) : null;
                            if (findViewById != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            C9662c2 c2Var10 = this.f17270d.f17168u;
                            if (c2Var10 != null) {
                                View loadMoreFooter2 = c2Var10.mo10308D().getLoadMoreFooter();
                                View findViewById2 = loadMoreFooter2 != null ? loadMoreFooter2.findViewById(C0966R.C0970id.g2q) : null;
                                if (findViewById2 != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                }
                if (iResponse.getPullType() == 2) {
                    FinderShareFeedRelUI finderShareFeedRelUI = this.f17270d;
                    ShareRelPresenter shareRelPresenter = finderShareFeedRelUI.f17167t;
                    if (shareRelPresenter == null) {
                        C87412m.m108603p("presenter");
                        throw null;
                    } else if (!shareRelPresenter.f30765G) {
                        shareRelPresenter.f30765G = true;
                        C9662c2 c2Var11 = finderShareFeedRelUI.f17168u;
                        if (c2Var11 != null) {
                            c2Var11.mo10308D().post(new C3775b4(this.f17270d));
                            Log.m105924i(this.f17271e.getTAG(), "preload for enter");
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                }
                C9662c2 c2Var12 = this.f17270d.f17168u;
                if (c2Var12 != null) {
                    RecyclerView.C16631z I0 = c2Var12.mo10308D().getRecyclerView().mo17023I0(0);
                    if (I0 != null && (I0 instanceof C60905o)) {
                        C60905o oVar = (C60905o) I0;
                        int c = ((C9493c) oVar.f173503E).mo75c();
                        FinderShareFeedRelUI finderShareFeedRelUI2 = this.f17270d;
                        if ((!finderShareFeedRelUI2.f17148T0 && c == 3001) || c == 2) {
                            finderShareFeedRelUI2.f17148T0 = true;
                            C119179t tVar = C119157j.f356862d;
                            C3779c4 c4Var = new C3779c4(finderShareFeedRelUI2);
                            C119157j jVar = (C119157j) tVar;
                            jVar.getClass();
                            finderShareFeedRelUI2.f17156X0 = jVar.mo183892w(c4Var, 10000, false);
                            View view2 = oVar.f44854d;
                            C87412m.m108593f(view2, "holder.itemView");
                            C23564m.m28138h(view2, new C3783d4(this.f17270d));
                        }
                    }
                    if ((iResponse instanceof FinderFeedShareRelativeListLoader.C2673c) && iResponse.getPullType() == 19) {
                        List incrementList = iResponse.getIncrementList();
                        if ((incrementList != null ? incrementList.size() : 0) >= 0) {
                            FinderShareFeedRelUI finderShareFeedRelUI3 = this.f17270d;
                            ShareRelPresenter shareRelPresenter2 = finderShareFeedRelUI3.f17167t;
                            if (shareRelPresenter2 == null) {
                                C87412m.m108603p("presenter");
                                throw null;
                            } else if (shareRelPresenter2.f30764F) {
                                C9662c2 c2Var13 = finderShareFeedRelUI3.f17168u;
                                if (c2Var13 != null) {
                                    RecyclerView recyclerView = c2Var13.getRecyclerView();
                                    if (recyclerView != null) {
                                        recyclerView.post(new C3788e4(this.f17270d));
                                    }
                                } else {
                                    C87412m.m108603p("viewCallback");
                                    throw null;
                                }
                            }
                        }
                        ShareRelPresenter shareRelPresenter3 = this.f17270d.f17167t;
                        if (shareRelPresenter3 != null) {
                            shareRelPresenter3.f30764F = false;
                        } else {
                            C87412m.m108603p("presenter");
                            throw null;
                        }
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("loader");
            throw null;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}
