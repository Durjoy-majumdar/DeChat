package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.C2808m0;
import com.tencent.p014mm.plugin.finder.profile.FlowLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/FinderSurveyView;", "Landroid/widget/FrameLayout;", "", "Lcom/tencent/mm/plugin/finder/feed/model/m0;", "list", "Lrx3/b0;", "setSurveyList", "Ljq3/l$b;", "Ljq3/o;", "listener", "setItemClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderSurveyView */
public final class FinderSurveyView extends FrameLayout {

    /* renamed from: d */
    public WxRecyclerView f13236d;

    /* renamed from: e */
    public ArrayList<C2808m0> f13237e = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderSurveyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359787aq2, this, true);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.kac);
        this.f13236d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new FlowLayoutManager());
        }
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderSurveyView$buildItemCoverts$1(), this.f13237e, false);
        WxRecyclerView wxRecyclerView2 = this.f13236d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        }
    }

    public final void setItemClickListener(C60898l.C9502b<C60905o> bVar) {
        RecyclerView.C16613e adapter;
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        WxRecyclerView wxRecyclerView = this.f13236d;
        if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null && (adapter instanceof WxRecyclerAdapter)) {
            ((WxRecyclerAdapter) adapter).f173488o = bVar;
        }
    }

    public final void setSurveyList(Collection<C2808m0> collection) {
        RecyclerView.C16613e adapter;
        C87412m.m108594g(collection, "list");
        this.f13237e.clear();
        this.f13237e.addAll(collection);
        WxRecyclerView wxRecyclerView = this.f13236d;
        if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderSurveyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359787aq2, this, true);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.kac);
        this.f13236d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new FlowLayoutManager());
        }
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderSurveyView$buildItemCoverts$1(), this.f13237e, false);
        WxRecyclerView wxRecyclerView2 = this.f13236d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        }
    }
}
