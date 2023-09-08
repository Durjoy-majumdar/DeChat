package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C50505n71;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lcm1/i2;", "it", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$Presenter$onAttach$3 */
public final class FinderLiveChargeIncomeContract$Presenter$onAttach$3 extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveChargeIncomeContract.Presenter f16060d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveChargeIncomeContract$Presenter$onAttach$3(FinderLiveChargeIncomeContract.Presenter presenter) {
        super(1);
        this.f16060d = presenter;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
        if (iResponse instanceof FinderLiveWecoinHotLoader.C2725b) {
            StringBuilder sb = new StringBuilder();
            sb.append("wecoinHotList.size:");
            FinderLiveWecoinHotLoader.C2725b bVar = (FinderLiveWecoinHotLoader.C2725b) iResponse;
            sb.append(bVar.f13760a.size());
            sb.append(", totalWecoinHot:");
            sb.append(bVar.f13761b);
            Log.m105924i("FinderLiveChargeIncomeContract.Presenter", sb.toString());
            LinkedList<C50505n71> linkedList = bVar.f13760a;
            if (linkedList == null || linkedList.isEmpty()) {
                FinderLiveChargeIncomeContract.ViewCallback viewCallback = this.f16060d.f16049f;
                if (viewCallback != null) {
                    RecyclerView recyclerView = viewCallback.f16053f;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        View view = viewCallback.f16059o;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showEmptyView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("loadingView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("chargeCustomerRecyclerView");
                        throw null;
                    }
                }
            } else {
                FinderLiveChargeIncomeContract.ViewCallback viewCallback2 = this.f16060d.f16049f;
                if (viewCallback2 != null) {
                    TextView textView = viewCallback2.f16057j;
                    if (textView != null) {
                        textView.setText(String.valueOf(bVar.f13760a.size()));
                        TextView textView2 = viewCallback2.f16058n;
                        if (textView2 != null) {
                            textView2.setText(bVar.f13761b > 0 ? viewCallback2.f16051d.getResources().getString(C0966R.string.dit, new Object[]{C62042e.f176370a.mo87005G(bVar.f13761b)}) : viewCallback2.f16051d.getResources().getString(C0966R.string.dis));
                            RecyclerView recyclerView2 = viewCallback2.f16053f;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(0);
                                View view3 = viewCallback2.f16059o;
                                if (view3 != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(8);
                                    View view4 = view3;
                                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showContentView", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader$LiveWecoinHotResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } else {
                                    C87412m.m108603p("loadingView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("chargeCustomerRecyclerView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("hotAmount");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("userAmount");
                        throw null;
                    }
                }
                WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f16060d.f16048e;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
