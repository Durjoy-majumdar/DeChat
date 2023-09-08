package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import qk1.C12843w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveVisitorFansTaskView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansTaskView */
public final class FinderLiveVisitorFansTaskView extends FrameLayout {

    /* renamed from: d */
    public final View f17883d;

    /* renamed from: e */
    public final TextView f17884e;

    /* renamed from: f */
    public final TextView f17885f;

    /* renamed from: g */
    public C12843w0 f17886g = new C12843w0();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansTaskView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cv8, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…task_page_ui, this, true)");
        this.f17883d = inflate;
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cs5);
        this.f17884e = (TextView) inflate.findViewById(C0966R.C0970id.cs6);
        this.f17885f = (TextView) inflate.findViewById(C0966R.C0970id.mlv);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.csj);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f17886g);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansTaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cv8, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…task_page_ui, this, true)");
        this.f17883d = inflate;
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cs5);
        this.f17884e = (TextView) inflate.findViewById(C0966R.C0970id.cs6);
        this.f17885f = (TextView) inflate.findViewById(C0966R.C0970id.mlv);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.csj);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f17886g);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cv8, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…task_page_ui, this, true)");
        this.f17883d = inflate;
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cs5);
        this.f17884e = (TextView) inflate.findViewById(C0966R.C0970id.cs6);
        this.f17885f = (TextView) inflate.findViewById(C0966R.C0970id.mlv);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.csj);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f17886g);
    }
}
