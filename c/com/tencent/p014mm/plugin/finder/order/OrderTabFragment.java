package com.tencent.p014mm.plugin.finder.order;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderUILogic$buildItemCoverts$1;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import te3.C50085k60;
import tn1.C14051a;
import tn1.C14054d;
import tn1.C14055e;
import tn1.C14056f;
import wn1.C15563l;
import wn1.C15564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/order/OrderTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.order.OrderTabFragment */
public final class OrderTabFragment extends MMFinderFragment {

    /* renamed from: y */
    public static final /* synthetic */ int f15828y = 0;

    /* renamed from: j */
    public final int f15829j;

    /* renamed from: n */
    public RefreshLoadMoreLayout f15830n;

    /* renamed from: o */
    public WxRecyclerView f15831o;

    /* renamed from: p */
    public TextView f15832p;

    /* renamed from: q */
    public View f15833q;

    /* renamed from: r */
    public View f15834r;

    /* renamed from: s */
    public C14056f f15835s;

    /* renamed from: t */
    public boolean f15836t = true;

    /* renamed from: u */
    public boolean f15837u;

    /* renamed from: v */
    public String f15838v;

    /* renamed from: w */
    public boolean f15839w;

    /* renamed from: x */
    public final C32230s<Integer, Integer, C50085k60, Integer, Integer, C13598b0> f15840x = new C3362a(this);

    /* renamed from: com.tencent.mm.plugin.finder.order.OrderTabFragment$a */
    public static final class C3362a extends C87413o implements C32230s<Integer, Integer, C50085k60, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ OrderTabFragment f15841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3362a(OrderTabFragment orderTabFragment) {
            super(5);
            this.f15841d = orderTabFragment;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C50085k60 k602 = (C50085k60) obj3;
            int intValue3 = ((Number) obj4).intValue();
            int intValue4 = ((Number) obj5).intValue();
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15841d.f15830n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82440F(0);
                if (intValue == 0 && intValue2 == 0) {
                    OrderTabFragment orderTabFragment = this.f15841d;
                    boolean z = true;
                    if (k602 == null || !k602.f136581f) {
                        z = false;
                    }
                    orderTabFragment.f15836t = z;
                    if (orderTabFragment.f15838v != null) {
                        WxRecyclerView wxRecyclerView = orderTabFragment.f15831o;
                        if (wxRecyclerView != null) {
                            RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyDataSetChanged();
                            }
                            FragmentActivity activity = this.f15841d.getActivity();
                            FinderLiveOrderUI finderLiveOrderUI = activity instanceof FinderLiveOrderUI ? (FinderLiveOrderUI) activity : null;
                            if (finderLiveOrderUI != null) {
                                finderLiveOrderUI.mo3025P7();
                            }
                            this.f15841d.f15838v = null;
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else if (intValue3 == 0) {
                        WxRecyclerView wxRecyclerView2 = orderTabFragment.f15831o;
                        if (wxRecyclerView2 != null) {
                            RecyclerView.C16613e adapter2 = wxRecyclerView2.getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyDataSetChanged();
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else if (intValue3 < intValue4) {
                        WxRecyclerView wxRecyclerView3 = orderTabFragment.f15831o;
                        if (wxRecyclerView3 != null) {
                            RecyclerView.C16613e adapter3 = wxRecyclerView3.getAdapter();
                            if (adapter3 != null) {
                                adapter3.notifyItemRangeInserted(intValue3, intValue4 - intValue3);
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                }
                if (intValue != 0 || intValue2 != 0) {
                    View view = this.f15841d.f15833q;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (intValue3 == 0) {
                            View view3 = this.f15841d.f15833q;
                            if (view3 != null) {
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(8);
                                View view4 = view3;
                                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                TextView textView = this.f15841d.f15832p;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15841d.f15830n;
                                    if (refreshLoadMoreLayout2 != null) {
                                        refreshLoadMoreLayout2.setVisibility(8);
                                        View view5 = this.f15841d.f15834r;
                                        if (view5 != null) {
                                            C9556a aVar3 = new C9556a();
                                            aVar3.mo10233c(0);
                                            View view6 = view5;
                                            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                    View view7 = this.f15841d.f15833q;
                    if (view7 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        TextView textView2 = this.f15841d.f15832p;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f15841d.f15830n;
                            if (refreshLoadMoreLayout3 != null) {
                                refreshLoadMoreLayout3.setVisibility(8);
                                View view9 = this.f15841d.f15834r;
                                if (view9 != null) {
                                    C9556a aVar5 = new C9556a();
                                    aVar5.mo10233c(8);
                                    View view10 = view9;
                                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                    View view11 = this.f15841d.f15833q;
                    if (view11 != null) {
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar6.mo10233c(8);
                        View view12 = view11;
                        C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        TextView textView3 = this.f15841d.f15832p;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                            RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f15841d.f15830n;
                            if (refreshLoadMoreLayout4 != null) {
                                refreshLoadMoreLayout4.setVisibility(0);
                                View view13 = this.f15841d.f15834r;
                                if (view13 != null) {
                                    C9556a aVar7 = new C9556a();
                                    aVar7.mo10233c(8);
                                    View view14 = view13;
                                    C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                    C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/order/OrderTabFragment$mergeDataAndRefresh$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/EcCustomerGetOrderListResp;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

    /* renamed from: com.tencent.mm.plugin.finder.order.OrderTabFragment$b */
    public static final class C3363b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ OrderTabFragment f15842d;

        public C3363b(OrderTabFragment orderTabFragment) {
            this.f15842d = orderTabFragment;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/order/OrderTabFragment$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            OrderTabFragment orderTabFragment = this.f15842d;
            int i = OrderTabFragment.f15828y;
            orderTabFragment.mo3685S();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/OrderTabFragment$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.order.OrderTabFragment$c */
    public static final class C3364c extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ OrderTabFragment f15843a;

        public C3364c(OrderTabFragment orderTabFragment) {
            this.f15843a = orderTabFragment;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            TextView textView;
            TextView textView2;
            Log.m105924i("MicroMsg.UIComponentFragment", "onLoadMoreBegin");
            OrderTabFragment orderTabFragment = this.f15843a;
            View view = null;
            if (orderTabFragment.f15836t) {
                C14056f fVar = orderTabFragment.f15835s;
                if (fVar != null) {
                    C61926c.m72668M(new C14054d(fVar));
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15843a.f15830n;
                    if (refreshLoadMoreLayout != null) {
                        View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                        if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView2.setText(C0966R.string.eas);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15843a.f15830n;
                        if (refreshLoadMoreLayout2 != null) {
                            View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                            TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                            }
                            RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f15843a.f15830n;
                            if (refreshLoadMoreLayout3 != null) {
                                View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                                if (loadMoreFooter3 != null) {
                                    view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
                                }
                                if (view != null) {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(8);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$onViewCreated$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/order/OrderTabFragment$onViewCreated$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    return;
                                }
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
            RefreshLoadMoreLayout refreshLoadMoreLayout4 = orderTabFragment.f15830n;
            if (refreshLoadMoreLayout4 != null) {
                View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f15843a.f15830n;
                if (refreshLoadMoreLayout5 != null) {
                    View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                    TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f15843a.f15830n;
                    if (refreshLoadMoreLayout6 != null) {
                        View loadMoreFooter6 = refreshLoadMoreLayout6.getLoadMoreFooter();
                        if (loadMoreFooter6 != null) {
                            view = loadMoreFooter6.findViewById(C0966R.C0970id.g2s);
                        }
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view3 = view;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment$onViewCreated$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/order/OrderTabFragment$onViewCreated$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
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
    }

    public OrderTabFragment(int i) {
        this.f15829j = i;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return null;
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
        this.f15839w = true;
        if (!this.f15837u) {
            mo3685S();
        }
    }

    /* renamed from: S */
    public final void mo3685S() {
        C14056f fVar = this.f15835s;
        if (fVar != null) {
            this.f15837u = true;
            C61926c.m72668M(new C14055e(fVar, ""));
            View view = this.f15833q;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/order/OrderTabFragment", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f15832p;
                if (textView != null) {
                    textView.setVisibility(8);
                    View view3 = this.f15834r;
                    if (view3 != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/order/OrderTabFragment", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/order/OrderTabFragment", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15830n;
                        if (refreshLoadMoreLayout != null) {
                            refreshLoadMoreLayout.setVisibility(8);
                        } else {
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("retryView");
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
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aiw;
    }

    public void onResume() {
        super.onResume();
        String str = this.f15838v;
        if (str != null) {
            C14056f fVar = this.f15835s;
            if (fVar != null) {
                C61926c.m72668M(new C14055e(fVar, str));
            } else {
                C87412m.m108603p("feedLoader");
                throw null;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C14056f fVar = new C14056f((MMActivity) context, this.f15829j, "", 10, this.f15840x);
        this.f15835s = fVar;
        FragmentActivity activity = getActivity();
        FinderLiveOrderUI finderLiveOrderUI = activity instanceof FinderLiveOrderUI ? (FinderLiveOrderUI) activity : null;
        if (finderLiveOrderUI == null || (str = finderLiveOrderUI.f14535u) == null) {
            str = "";
        }
        fVar.f39431i = str;
        this.f15836t = true;
        View findViewById = view.findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.rl_layout)");
        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
        this.f15830n = refreshLoadMoreLayout;
        RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        C87412m.m108592e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        this.f15831o = (WxRecyclerView) recyclerView;
        View findViewById2 = view.findViewById(C0966R.C0970id.hgr);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.no_result_tv)");
        this.f15832p = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.g3e);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.loading_layout)");
        this.f15833q = findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.is8);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.retry_layout)");
        this.f15834r = findViewById4;
        findViewById4.setOnClickListener(new C3363b(this));
        Context context2 = view.getContext();
        C87412m.m108593f(context2, "view.context");
        WxRecyclerView wxRecyclerView = this.f15831o;
        if (wxRecyclerView != null) {
            C14056f fVar2 = this.f15835s;
            if (fVar2 != null) {
                ArrayList<C14051a> arrayList = fVar2.f39430h;
                C87412m.m108594g(arrayList, "dataList");
                wxRecyclerView.setLayoutManager(new FinderLinearLayoutManager(context2));
                WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new OrderUILogic$buildItemCoverts$1(), arrayList, false);
                wxRecyclerView.setAdapter(wxRecyclerAdapter);
                wxRecyclerAdapter.f173488o = new C15563l(arrayList, context2);
                wxRecyclerView.mo17085h0(new C15564m(context2));
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15830n;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setEnablePullDownHeader(false);
                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f15830n;
                    if (refreshLoadMoreLayout3 != null) {
                        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                        C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
                        refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
                        RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f15830n;
                        if (refreshLoadMoreLayout4 != null) {
                            refreshLoadMoreLayout4.setActionCallback(new C3364c(this));
                            if (this.f15839w && !this.f15837u) {
                                mo3685S();
                                return;
                            }
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
}
