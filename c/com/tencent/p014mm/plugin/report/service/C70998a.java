package com.tencent.p014mm.plugin.report.service;

import android.view.View;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.report.service.a */
public final class C70998a extends RecyclerView.C0130p implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final AbsListView.OnScrollListener f205466d;

    /* renamed from: e */
    public C70999a f205467e;

    /* renamed from: f */
    public long f205468f;

    /* renamed from: g */
    public final C71000b f205469g;

    /* renamed from: com.tencent.mm.plugin.report.service.a$a */
    public enum C70999a {
        STOPPED,
        COLLECTING,
        STOPPING
    }

    public C70998a(String str, AbsListView.OnScrollListener onScrollListener, int i, C8480h hVar) {
        onScrollListener = (i & 2) != 0 ? null : onScrollListener;
        C87412m.m108594g(str, "tag");
        this.f205466d = onScrollListener;
        this.f205467e = C70999a.STOPPED;
        this.f205468f = -1;
        this.f205469g = new C71000b(this);
    }

    /* renamed from: a */
    public final void mo97644a(View view, int i) {
        C70999a aVar = C70999a.COLLECTING;
        if (i != 0 && this.f205467e == C70999a.STOPPED) {
            this.f205467e = aVar;
            this.f205468f = System.currentTimeMillis();
        } else if (i == 0 && this.f205467e == aVar) {
            this.f205467e = C70999a.STOPPING;
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        AbsListView.OnScrollListener onScrollListener = this.f205466d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        AbsListView.OnScrollListener onScrollListener = this.f205466d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
        mo97644a(absListView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        mo97644a(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/report/service/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }
}
