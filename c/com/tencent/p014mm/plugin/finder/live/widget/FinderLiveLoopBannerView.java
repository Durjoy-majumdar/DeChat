package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;
import il1.C60437i5;
import il1.C60441j5;
import java.util.LinkedList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u00103\u001a\u00020+\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107B!\b\u0016\u0012\u0006\u00103\u001a\u00020+\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b6\u0010:J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006;"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView;", "Data", "Landroidx/recyclerview/widget/RecyclerView$z;", "ViewHolder", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager$a;", "", "getLoopDuration", "Ljava/util/LinkedList;", "taskInfo", "Lrx3/b0;", "setBannerDataList", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "d", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "getPagerView", "()Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "setPagerView", "(Lcom/tencent/mm/view/RecyclerHorizontalViewPager;)V", "pagerView", "Landroid/view/View;", "e", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Landroidx/recyclerview/widget/RecyclerView$e;", "f", "Landroidx/recyclerview/widget/RecyclerView$e;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$e;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$e;)V", "adapter", "g", "Ljava/util/LinkedList;", "getDataList", "()Ljava/util/LinkedList;", "setDataList", "(Ljava/util/LinkedList;)V", "dataList", "Landroid/content/Context;", "h", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView */
public abstract class FinderLiveLoopBannerView<Data, ViewHolder extends RecyclerView.C16631z> extends FrameLayout implements RecyclerHorizontalViewPager.C57875a {

    /* renamed from: d */
    public RecyclerHorizontalViewPager f160079d;

    /* renamed from: e */
    public View f160080e;

    /* renamed from: f */
    public RecyclerView.C16613e<ViewHolder> f160081f;

    /* renamed from: g */
    public LinkedList<Data> f160082g = new LinkedList<>();

    /* renamed from: h */
    public Context f160083h;

    /* renamed from: i */
    public volatile int f160084i;

    /* renamed from: j */
    public volatile boolean f160085j = true;

    /* renamed from: n */
    public final MMHandler f160086n = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C60437i5(this));

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView$a */
    public static final class C56132a extends RecyclerView.C16613e<ViewHolder> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLoopBannerView<Data, ViewHolder> f160087d;

        public C56132a(FinderLiveLoopBannerView<Data, ViewHolder> finderLiveLoopBannerView) {
            this.f160087d = finderLiveLoopBannerView;
        }

        public int getItemCount() {
            LinkedList<Data> dataList = this.f160087d.getDataList();
            if (dataList != null) {
                return dataList.size();
            }
            return 0;
        }

        public void onBindViewHolder(ViewHolder viewholder, int i) {
            C87412m.m108594g(viewholder, "holder");
            this.f160087d.mo3451d(viewholder, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            return this.f160087d.mo3452e(viewGroup, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLoopBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo78243c(context);
    }

    /* renamed from: b */
    public static final void m64078b(FinderLiveLoopBannerView finderLiveLoopBannerView) {
        if (finderLiveLoopBannerView.getVisibility() == 0) {
            if (finderLiveLoopBannerView.f160082g.size() == 0) {
                finderLiveLoopBannerView.f160086n.removeMessages(1);
                finderLiveLoopBannerView.setVisibility(8);
            } else if (finderLiveLoopBannerView.f160082g.size() == 1) {
                finderLiveLoopBannerView.f160086n.removeMessages(1);
            } else {
                finderLiveLoopBannerView.f160086n.removeMessages(1);
                int i = finderLiveLoopBannerView.f160084i + 1;
                if (i >= finderLiveLoopBannerView.f160082g.size()) {
                    i = 0;
                }
                Log.m105924i("FinderLiveTaskBannerView", "[startLoop] targetPosition:" + i);
                finderLiveLoopBannerView.getPagerView().post(new C60441j5(finderLiveLoopBannerView, finderLiveLoopBannerView.f160086n.obtainMessage(1, i, 0)));
            }
        }
    }

    /* renamed from: a */
    public void mo23719a(int i, boolean z, boolean z2) {
    }

    /* renamed from: c */
    public final void mo78243c(Context context) {
        setMContext(context);
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.akd, this);
        C87412m.m108593f(inflate, "getInflater(context).inf…r_live_task_layout, this)");
        setRoot(inflate);
        View findViewById = getRoot().findViewById(C0966R.C0970id.e08);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_task_list_view)");
        setPagerView((RecyclerHorizontalViewPager) findViewById);
        getPagerView().setPageChangeListener(this);
        getPagerView().setFrozeTouch(true);
        getPagerView().setHasFixedSize(false);
        FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(context);
        finderLinearLayoutManager.f162360w = 80.0f;
        finderLinearLayoutManager.f44689u = 3;
        finderLinearLayoutManager.setItemPrefetchEnabled(true);
        finderLinearLayoutManager.mo16974W(0);
        getPagerView().setLayoutManager(finderLinearLayoutManager);
        setAdapter(new C56132a(this));
        getPagerView().setAdapter(getAdapter());
    }

    /* renamed from: d */
    public abstract void mo3451d(ViewHolder viewholder, int i);

    /* renamed from: e */
    public abstract ViewHolder mo3452e(ViewGroup viewGroup, int i);

    public final RecyclerView.C16613e<ViewHolder> getAdapter() {
        RecyclerView.C16613e<ViewHolder> eVar = this.f160081f;
        if (eVar != null) {
            return eVar;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public final LinkedList<Data> getDataList() {
        return this.f160082g;
    }

    public long getLoopDuration() {
        return FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
    }

    public final Context getMContext() {
        Context context = this.f160083h;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("mContext");
        throw null;
    }

    public final RecyclerHorizontalViewPager getPagerView() {
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f160079d;
        if (recyclerHorizontalViewPager != null) {
            return recyclerHorizontalViewPager;
        }
        C87412m.m108603p("pagerView");
        throw null;
    }

    public final View getRoot() {
        View view = this.f160080e;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("root");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f160086n.removeMessages(1);
    }

    public final void setAdapter(RecyclerView.C16613e<ViewHolder> eVar) {
        C87412m.m108594g(eVar, "<set-?>");
        this.f160081f = eVar;
    }

    public final void setBannerDataList(LinkedList<Data> linkedList) {
        C87412m.m108594g(linkedList, "taskInfo");
        this.f160082g.clear();
        this.f160082g.addAll(linkedList);
        if (this.f160082g.size() > 1) {
            LinkedList<Data> linkedList2 = this.f160082g;
            linkedList2.add(linkedList2.size(), this.f160082g.get(0));
        }
        getAdapter().notifyDataSetChanged();
    }

    public final void setDataList(LinkedList<Data> linkedList) {
        C87412m.m108594g(linkedList, "<set-?>");
        this.f160082g = linkedList;
    }

    public final void setMContext(Context context) {
        C87412m.m108594g(context, "<set-?>");
        this.f160083h = context;
    }

    public final void setPagerView(RecyclerHorizontalViewPager recyclerHorizontalViewPager) {
        C87412m.m108594g(recyclerHorizontalViewPager, "<set-?>");
        this.f160079d = recyclerHorizontalViewPager;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f160080e = view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLoopBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo78243c(context);
    }
}
