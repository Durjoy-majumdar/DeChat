package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderUILogic$buildItemCoverts$1;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C22415w0;
import sx3.C90363p0;
import te3.C50638o60;
import tn1.C14051a;
import tn1.C52359j;
import tn1.C52360k;
import un1.C65411a;
import vf1.C52876v2;
import vf1.C52878w2;
import vf1.C52880x2;
import vf1.C52882y2;
import vn1.C52962a;
import wn1.C15563l;
import wn1.C15564m;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickClearTextBtn", "onClickBackBtn", "onClickCancelBtn", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveOrderSearchUI */
public final class FinderLiveOrderSearchUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: o */
    public RefreshLoadMoreLayout f111525o;

    /* renamed from: p */
    public WxRecyclerView f111526p;

    /* renamed from: q */
    public TextView f111527q;

    /* renamed from: r */
    public View f111528r;

    /* renamed from: s */
    public View f111529s;

    /* renamed from: t */
    public C52360k f111530t;

    /* renamed from: u */
    public boolean f111531u = true;

    /* renamed from: v */
    public FTSSearchView f111532v;

    /* renamed from: w */
    public String f111533w = "";

    /* renamed from: x */
    public C52962a f111534x;

    /* renamed from: y */
    public final C32230s<Integer, Integer, C50638o60, Integer, Integer, C13598b0> f111535y = new C41421a(this);

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveOrderSearchUI$a */
    public static final class C41421a extends C87413o implements C32230s<Integer, Integer, C50638o60, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveOrderSearchUI f111536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41421a(FinderLiveOrderSearchUI finderLiveOrderSearchUI) {
            super(5);
            this.f111536d = finderLiveOrderSearchUI;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C50638o60 o602 = (C50638o60) obj3;
            int intValue3 = ((Number) obj4).intValue();
            int intValue4 = ((Number) obj5).intValue();
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111536d.f111525o;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82440F(0);
                if (intValue == 0 && intValue2 == 0) {
                    FinderLiveOrderSearchUI finderLiveOrderSearchUI = this.f111536d;
                    boolean z = true;
                    if (o602 == null || !o602.f138977f) {
                        z = false;
                    }
                    finderLiveOrderSearchUI.f111531u = z;
                    if (intValue3 == 0) {
                        WxRecyclerView wxRecyclerView = finderLiveOrderSearchUI.f111526p;
                        if (wxRecyclerView != null) {
                            RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyDataSetChanged();
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else if (intValue3 < intValue4) {
                        WxRecyclerView wxRecyclerView2 = finderLiveOrderSearchUI.f111526p;
                        if (wxRecyclerView2 != null) {
                            RecyclerView.C16613e adapter2 = wxRecyclerView2.getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyItemRangeInserted(intValue3, intValue4 - intValue3);
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                }
                if (intValue != 0 || intValue2 != 0) {
                    View view = this.f111536d.f111528r;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (intValue3 == 0) {
                            View view3 = this.f111536d.f111528r;
                            if (view3 != null) {
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(8);
                                View view4 = view3;
                                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                TextView textView = this.f111536d.f111527q;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f111536d.f111525o;
                                    if (refreshLoadMoreLayout2 != null) {
                                        refreshLoadMoreLayout2.setVisibility(8);
                                        View view5 = this.f111536d.f111529s;
                                        if (view5 != null) {
                                            C9556a aVar3 = new C9556a();
                                            aVar3.mo10233c(0);
                                            View view6 = view5;
                                            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        } else {
                                            C87412m.m108603p("retryView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("rlLayout");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("noResultView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("loadingView");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("loadingView");
                        throw null;
                    }
                } else if (intValue4 == 0) {
                    View view7 = this.f111536d.f111528r;
                    if (view7 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        TextView textView2 = this.f111536d.f111527q;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f111536d.f111525o;
                            if (refreshLoadMoreLayout3 != null) {
                                refreshLoadMoreLayout3.setVisibility(8);
                                View view9 = this.f111536d.f111529s;
                                if (view9 != null) {
                                    C9556a aVar5 = new C9556a();
                                    aVar5.mo10233c(8);
                                    View view10 = view9;
                                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } else {
                                    C87412m.m108603p("retryView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("noResultView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("loadingView");
                        throw null;
                    }
                } else {
                    View view11 = this.f111536d.f111528r;
                    if (view11 != null) {
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar6.mo10233c(8);
                        View view12 = view11;
                        C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        TextView textView3 = this.f111536d.f111527q;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                            RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f111536d.f111525o;
                            if (refreshLoadMoreLayout4 != null) {
                                refreshLoadMoreLayout4.setVisibility(0);
                                View view13 = this.f111536d.f111529s;
                                if (view13 != null) {
                                    C9556a aVar7 = new C9556a();
                                    aVar7.mo10233c(8);
                                    View view14 = view13;
                                    C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                    C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerSearchOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } else {
                                    C87412m.m108603p("retryView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("noResultView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("loadingView");
                        throw null;
                    }
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: N7 */
    public final void mo64511N7(String str) {
        String str2 = str;
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C52360k kVar = this.f111530t;
        if (kVar != null) {
            C61926c.m72668M(new C52359j(kVar, str2));
            View view = this.f111528r;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f111527q;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111525o;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                        View view3 = this.f111529s;
                        if (view3 != null) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(8);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            WxRecyclerView wxRecyclerView = this.f111526p;
                            if (wxRecyclerView != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(0);
                                WxRecyclerView wxRecyclerView2 = wxRecyclerView;
                                C117292a.m165358d(wxRecyclerView2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                                wxRecyclerView.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                                ((C65411a) C39818r.f106831a.mo62444c(this).mo75002a(C65411a.class)).mo89492c3("go_to_search", C90363p0.m113143b(new C13604l("current_page", "order_list")));
                                return;
                            }
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                        C87412m.m108603p("retryView");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("noResultView");
                throw null;
            }
            C87412m.m108603p("loadingView");
            throw null;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View view = this.f111528r;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f111527q;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111525o;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                        View view2 = this.f111529s;
                        if (view2 != null) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(8);
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("retryView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        }
        C52962a aVar3 = this.f111534x;
        if (aVar3 == null) {
            return;
        }
        if (!Util.isNullOrNil(str3)) {
            aVar3.f147838a.setVisibility(8);
        } else {
            aVar3.f147838a.setVisibility(0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ait;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C65411a.class);
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSSearchView fTSSearchView = this.f111532v;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
        this.f111532v = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f111532v;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f111532v;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f111532v;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f111532v;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        ActionBar supportActionBar = getSupportActionBar();
                        C87412m.m108591d(supportActionBar);
                        FTSSearchView fTSSearchView6 = this.f111532v;
                        if (fTSSearchView6 != null) {
                            supportActionBar.mo91114y(fTSSearchView6);
                            this.f111533w = "";
                            FTSSearchView fTSSearchView7 = this.f111532v;
                            if (fTSSearchView7 != null) {
                                fTSSearchView7.getFtsEditText().mo70355k();
                                FTSSearchView fTSSearchView8 = this.f111532v;
                                if (fTSSearchView8 != null) {
                                    fTSSearchView8.getFtsEditText().mo70361q();
                                    this.f111534x = new C52962a(this, new C52880x2(this), new C52882y2());
                                    String stringExtra = getIntent().getStringExtra("FROM_APP_ID");
                                    String str = stringExtra == null ? "" : stringExtra;
                                    AppCompatActivity context = getContext();
                                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                                    this.f111530t = new C52360k((MMActivity) context, 0, 10, this.f111535y, str);
                                    this.f111531u = true;
                                    View findViewById = findViewById(C0966R.C0970id.ivb);
                                    C87412m.m108593f(findViewById, "findViewById(R.id.rl_layout)");
                                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
                                    this.f111525o = refreshLoadMoreLayout;
                                    RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
                                    C87412m.m108592e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
                                    this.f111526p = (WxRecyclerView) recyclerView;
                                    View findViewById2 = findViewById(C0966R.C0970id.hgr);
                                    C87412m.m108593f(findViewById2, "findViewById(R.id.no_result_tv)");
                                    this.f111527q = (TextView) findViewById2;
                                    View findViewById3 = findViewById(C0966R.C0970id.g3e);
                                    C87412m.m108593f(findViewById3, "findViewById(R.id.loading_layout)");
                                    this.f111528r = findViewById3;
                                    View findViewById4 = findViewById(C0966R.C0970id.is8);
                                    C87412m.m108593f(findViewById4, "findViewById(R.id.retry_layout)");
                                    this.f111529s = findViewById4;
                                    findViewById4.setOnClickListener(new C52876v2(this));
                                    AppCompatActivity context2 = getContext();
                                    C87412m.m108593f(context2, "context");
                                    WxRecyclerView wxRecyclerView = this.f111526p;
                                    if (wxRecyclerView != null) {
                                        C52360k kVar = this.f111530t;
                                        if (kVar != null) {
                                            ArrayList<C14051a> arrayList = kVar.f146344h;
                                            C87412m.m108594g(arrayList, "dataList");
                                            wxRecyclerView.setLayoutManager(new FinderLinearLayoutManager(context2));
                                            WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new OrderUILogic$buildItemCoverts$1(), arrayList, false);
                                            wxRecyclerView.setAdapter(wxRecyclerAdapter);
                                            wxRecyclerAdapter.f173488o = new C15563l(arrayList, context2);
                                            wxRecyclerView.mo17085h0(new C15564m(context2));
                                            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f111525o;
                                            if (refreshLoadMoreLayout2 != null) {
                                                refreshLoadMoreLayout2.setEnablePullDownHeader(false);
                                                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f111525o;
                                                if (refreshLoadMoreLayout3 != null) {
                                                    View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                                                    C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
                                                    refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
                                                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f111525o;
                                                    if (refreshLoadMoreLayout4 != null) {
                                                        refreshLoadMoreLayout4.setActionCallback(new C52878w2(this));
                                                        ((C65411a) C39818r.f106831a.mo62444c(this).mo75002a(C65411a.class)).mo89492c3("enter_search", C90363p0.m113143b(new C13604l("current_page", "order_list")));
                                                        return;
                                                    }
                                                    C87412m.m108603p("rlLayout");
                                                    throw null;
                                                }
                                                C87412m.m108603p("rlLayout");
                                                throw null;
                                            }
                                            C87412m.m108603p("rlLayout");
                                            throw null;
                                        }
                                        C87412m.m108603p("feedLoader");
                                        throw null;
                                    }
                                    C87412m.m108603p("recyclerView");
                                    throw null;
                                }
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                    C87412m.m108603p("searchView");
                    throw null;
                }
                C87412m.m108603p("searchView");
                throw null;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C52962a aVar = this.f111534x;
        if (aVar != null) {
            C52962a.C52968e.f147850c.remove(Integer.valueOf(aVar.hashCode()));
        }
    }

    /* renamed from: y */
    public boolean mo3009y() {
        String str;
        hideVKB();
        FTSSearchView fTSSearchView = this.f111532v;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                return true;
            }
            mo64511N7(str);
            C52962a aVar = this.f111534x;
            if (aVar != null) {
                C52962a.C52968e.f147848a.mo73719b(str);
                View view = aVar.f147840c;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return false;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
