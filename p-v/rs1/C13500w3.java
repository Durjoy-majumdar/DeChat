package rs1;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import p282z2.C16095a;

/* renamed from: rs1.w3 */
public final class C13500w3 extends RecyclerView.C0130p {

    /* renamed from: d */
    public float f38263d = 100.0f;

    /* renamed from: e */
    public boolean f38264e;

    /* renamed from: f */
    public final /* synthetic */ C13484v3 f38265f;

    public C13500w3(C13484v3 v3Var) {
        this.f38265f = v3Var;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        View view;
        List data;
        RecyclerView recyclerView2 = recyclerView;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView2, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i2 == 0) {
            C13484v3 v3Var = this.f38265f;
            int i3 = -1;
            if (v3Var.f38207e == null && !v3Var.f38209g && v3Var.f38212j != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
                    C13484v3 v3Var2 = this.f38265f;
                    Iterator it = data.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C9493c cVar = (C9493c) it.next();
                        BaseFinderFeed baseFinderFeed = v3Var2.f38212j;
                        if (baseFinderFeed != null && cVar.getItemId() == baseFinderFeed.getItemId()) {
                            i3 = i4;
                            break;
                        }
                        i4++;
                    }
                }
                if (i3 >= 0) {
                    C13484v3 v3Var3 = this.f38265f;
                    RecyclerView.C16631z I0 = recyclerView2.mo17023I0(i3);
                    v3Var3.f38207e = (I0 == null || (view = I0.f44854d) == null) ? null : view.findViewById(C0966R.C0970id.esl);
                    View view2 = this.f38265f.f38207e;
                    if (view2 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (v3Var.f38211i) {
                BaseFinderFeed baseFinderFeed2 = v3Var.f38212j;
                if (baseFinderFeed2 != null && baseFinderFeed2.mo3480N() == 1) {
                    View view4 = this.f38265f.f38207e;
                    if (view4 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f38265f.getClass();
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).mo17004z() == 1) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, Boolean.TRUE);
                    }
                }
                BaseFinderFeed baseFinderFeed3 = this.f38265f.f38212j;
                if (baseFinderFeed3 != null) {
                    baseFinderFeed3.mo3506k0(-1);
                }
            }
            this.f38264e = false;
        } else {
            C13484v3 v3Var4 = this.f38265f;
            if (v3Var4.f38207e != null && i2 == 1) {
                v3Var4.f38211i = true;
                this.f38264e = true;
            }
        }
        if (i2 == 1) {
            this.f38265f.f38213n.removeCallbacksAndMessages((Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (this.f38264e && (view = this.f38265f.f38207e) != null) {
            float f = this.f38263d - (((float) i2) / 5.0f);
            this.f38263d = f;
            float a = C16095a.m14979a(f, 0.0f, 100.0f);
            this.f38263d = a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(a / 100.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
