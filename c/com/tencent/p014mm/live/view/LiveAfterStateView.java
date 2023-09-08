package com.tencent.p014mm.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import gy3.C87412m;
import i60.C8851b;
import i60.C8858i;
import java.util.ArrayList;
import kotlin.Metadata;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13604l;
import z50.C16105d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\fJ\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/live/view/LiveAfterStateView;", "Landroid/widget/RelativeLayout;", "Lob0/n;", "", "getLayoutId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.LiveAfterStateView */
public final class LiveAfterStateView extends RelativeLayout implements C11385n {

    /* renamed from: d */
    public RecyclerView f10360d;

    /* renamed from: e */
    public ProgressBar f10361e;

    /* renamed from: f */
    public TextView f10362f;

    /* renamed from: g */
    public final C8851b f10363g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveAfterStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C8851b bVar = new C8851b();
        this.f10363g = bVar;
        View.inflate(context, getLayoutId(), this);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.fqh);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C0966R.C0970id.fqn);
        this.f10360d = (RecyclerView) findViewById(C0966R.C0970id.fqf);
        TextView textView = (TextView) findViewById(C0966R.C0970id.fql);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.fqj);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.fqp);
        this.f10361e = (ProgressBar) findViewById(C0966R.C0970id.fqg);
        this.f10362f = (TextView) findViewById(C0966R.C0970id.fqk);
        RecyclerView recyclerView = this.f10360d;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f10360d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(bVar);
        }
    }

    public final int getLayoutId() {
        return C0966R.C0971layout.f359855b63;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C16105d)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            ProgressBar progressBar = this.f10361e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.f10362f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            RecyclerView recyclerView = this.f10360d;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            C13604l lVar = RoomLiveService.f157194e.get(RoomLiveService.f157192c);
            ArrayList<String> arrayList = lVar != null ? (ArrayList) lVar.f38555d : null;
            ArrayList arrayList2 = new ArrayList();
            if (arrayList != null) {
                for (String iVar : arrayList) {
                    arrayList2.add(new C8858i(iVar));
                }
            }
            C8851b bVar = this.f10363g;
            bVar.getClass();
            bVar.f28101d.clear();
            bVar.f28101d.addAll(arrayList2);
            this.f10363g.notifyDataSetChanged();
            return;
        }
        ProgressBar progressBar2 = this.f10361e;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        TextView textView2 = this.f10362f;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.f10360d;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LiveAfterStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
