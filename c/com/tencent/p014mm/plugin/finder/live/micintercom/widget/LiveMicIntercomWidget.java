package com.tencent.p014mm.plugin.finder.live.micintercom.widget;

import al1.C39611s;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.micintercom.MicIntercomConvertFactory;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import il1.C46255f;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import ok1.C62042e;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import ui1.C52580d;
import wi1.C53177i;

/* renamed from: com.tencent.mm.plugin.finder.live.micintercom.widget.LiveMicIntercomWidget */
public final class LiveMicIntercomWidget extends C46255f<ArrayList<C39611s>> {

    /* renamed from: f */
    public final RecyclerView f111612f;

    /* renamed from: g */
    public final ArrayList<C52580d> f111613g;

    /* renamed from: h */
    public C39611s f111614h;

    /* renamed from: i */
    public final C13601g f111615i;

    /* renamed from: j */
    public final C13601g f111616j;

    /* renamed from: com.tencent.mm.plugin.finder.live.micintercom.widget.LiveMicIntercomWidget$a */
    public static final class C41448a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ View f111617d;

        public C41448a(View view) {
            this.f111617d = view;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.left = 0;
            rect.right = this.f111617d.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
            rect.top = 0;
            rect.bottom = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.micintercom.widget.LiveMicIntercomWidget$b */
    public static final class C41449b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ LiveMicIntercomWidget f111618d;

        public C41449b(LiveMicIntercomWidget liveMicIntercomWidget) {
            this.f111618d = liveMicIntercomWidget;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            if (C62042e.f176370a.mo87027N0()) {
                C52580d dVar = this.f111618d.f111613g.get(i);
                LiveMicIntercomWidget liveMicIntercomWidget = this.f111618d;
                liveMicIntercomWidget.f111614h = dVar.f146861d;
                ((C77407n) ((C36570n) liveMicIntercomWidget.f111616j).getValue()).mo107573q();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.micintercom.widget.LiveMicIntercomWidget$c */
    public static final class C41450c extends C87413o implements C32224a<C77407n> {

        /* renamed from: d */
        public final /* synthetic */ View f111619d;

        /* renamed from: e */
        public final /* synthetic */ LiveMicIntercomWidget f111620e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C53177i, C13598b0> f111621f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41450c(View view, LiveMicIntercomWidget liveMicIntercomWidget, C32226l<? super C53177i, C13598b0> lVar) {
            super(0);
            this.f111619d = view;
            this.f111620e = liveMicIntercomWidget;
            this.f111621f = lVar;
        }

        public Object invoke() {
            C77407n nVar = new C77407n(this.f111619d.getContext(), 1, true);
            LiveMicIntercomWidget liveMicIntercomWidget = this.f111620e;
            View view = this.f111619d;
            C32226l<C53177i, C13598b0> lVar = this.f111621f;
            nVar.mo107570o(true);
            nVar.f225771i = new C41452a(nVar, liveMicIntercomWidget, view);
            nVar.f225776l1 = true;
            nVar.f225782p = new C41453b(liveMicIntercomWidget, lVar);
            return nVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.micintercom.widget.LiveMicIntercomWidget$d */
    public static final class C41451d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f111622d;

        /* renamed from: e */
        public final /* synthetic */ LiveMicIntercomWidget f111623e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41451d(View view, LiveMicIntercomWidget liveMicIntercomWidget) {
            super(0);
            this.f111622d = view;
            this.f111623e = liveMicIntercomWidget;
        }

        public Object invoke() {
            TextView textView = new TextView(this.f111622d.getContext());
            LiveMicIntercomWidget liveMicIntercomWidget = this.f111623e;
            View view = this.f111622d;
            C39611s sVar = liveMicIntercomWidget.f111614h;
            textView.setText(sVar != null ? sVar.f106360d : null);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(view.getContext().getResources().getColor(C0966R.color.f3583yg));
            textView.setGravity(17);
            textView.setPadding(0, textView.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, textView.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveMicIntercomWidget(View view, C0125s sVar, C45795b bVar, C32226l<? super C53177i, C13598b0> lVar) {
        super(sVar);
        C87412m.m108594g(view, "root");
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(bVar, "liveBuContext");
        C87412m.m108594g(lVar, "event");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0966R.C0970id.kbt);
        this.f111612f = recyclerView;
        ArrayList<C52580d> arrayList = new ArrayList<>();
        this.f111613g = arrayList;
        this.f111615i = C36568h.m40985a(new C41451d(view, this));
        this.f111616j = C36568h.m40985a(new C41450c(view, this, lVar));
        LiveMicIntercomWidget$1$1 liveMicIntercomWidget$1$1 = new LiveMicIntercomWidget$1$1(recyclerView.getRootView().getContext());
        liveMicIntercomWidget$1$1.mo16974W(0);
        recyclerView.setLayoutManager(liveMicIntercomWidget$1$1);
        recyclerView.mo17085h0(new C41448a(view));
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new MicIntercomConvertFactory(), arrayList, false);
        wxRecyclerAdapter.f173488o = new C41449b(this);
        recyclerView.setAdapter(wxRecyclerAdapter);
    }

    public void onChanged(Object obj) {
        ArrayList<C39611s> arrayList = (ArrayList) obj;
        this.f111613g.clear();
        if (arrayList != null) {
            ArrayList<C52580d> arrayList2 = this.f111613g;
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C39611s dVar : arrayList) {
                arrayList3.add(new C52580d(dVar));
            }
            arrayList2.addAll(arrayList3);
        }
        RecyclerView.C16613e adapter = this.f111612f.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
