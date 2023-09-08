package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import er1.C58739j4;
import er1.C7878t0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import pe3.C89349b;
import qq3.C63318b;
import te3.C64499kq0;
import vf1.C65727t2;
import vf1.C65730u2;
import vo3.C90852c;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveHistoryUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI */
public final class FinderLiveHistoryUI extends MMFinderUI {

    /* renamed from: v */
    public static final /* synthetic */ int f158992v = 0;

    /* renamed from: o */
    public final int f158993o;

    /* renamed from: p */
    public final int f158994p;

    /* renamed from: q */
    public C89349b f158995q;

    /* renamed from: r */
    public final List<C64499kq0> f158996r = new ArrayList();

    /* renamed from: s */
    public FinderRefreshLayout f158997s;

    /* renamed from: t */
    public RecyclerView f158998t;

    /* renamed from: u */
    public C55825a f158999u;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$a */
    public final class C55825a extends RecyclerView.C16613e<C55826a> {

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$a$a */
        public final class C55826a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final TextView f159001A;

            /* renamed from: B */
            public final TextView f159002B;

            /* renamed from: z */
            public final TextView f159003z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55826a(C55825a aVar, View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                View findViewById = view.findViewById(C0966R.C0970id.f359453nd2);
                C87412m.m108593f(findViewById, "itemView.findViewById(R.id.txv_title)");
                this.f159003z = (TextView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.m8g);
                C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.txv_desc)");
                this.f159001A = (TextView) findViewById2;
                View findViewById3 = view.findViewById(C0966R.C0970id.f359454nd3);
                C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.txv_visitor_count)");
                this.f159002B = (TextView) findViewById3;
            }
        }

        public C55825a() {
        }

        public int getItemCount() {
            return ((ArrayList) FinderLiveHistoryUI.this.f158996r).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C55826a aVar = (C55826a) zVar;
            C87412m.m108594g(aVar, "holder");
            C64499kq0 kq02 = (C64499kq0) ((ArrayList) FinderLiveHistoryUI.this.f158996r).get(i);
            aVar.f159003z.setText(C58739j4.m68254u(C58739j4.f168176a, ((long) kq02.f183976f) * 1000, (Boolean) null, false, 6, (Object) null));
            aVar.f159001A.setText(kq02.f183977g);
            aVar.f159002B.setText(FinderLiveHistoryUI.this.getContext().getResources().getString(C0966R.string.dvm, new Object[]{C7878t0.m8033b(kq02.f183978h)}));
            aVar.f44854d.setOnClickListener(new C55844n(FinderLiveHistoryUI.this, kq02));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(FinderLiveHistoryUI.this.getContext()).inflate(C0966R.C0971layout.cy_, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(context)\n          …story_ui_list_item, null)");
            return new C55826a(this, inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$b */
    public static final class C55827b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveHistoryUI f159004d;

        public C55827b(FinderLiveHistoryUI finderLiveHistoryUI) {
            this.f159004d = finderLiveHistoryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f159004d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$c */
    public static final class C55828c implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveHistoryUI f159005a;

        public C55828c(FinderLiveHistoryUI finderLiveHistoryUI) {
            this.f159005a = finderLiveHistoryUI;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            FinderLiveHistoryUI finderLiveHistoryUI = this.f159005a;
            int i = FinderLiveHistoryUI.f158992v;
            finderLiveHistoryUI.getClass();
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C65730u2(finderLiveHistoryUI, (C15601d<? super C65730u2>) null), 3, (Object) null);
        }

        public void onLoadMore() {
            FinderLiveHistoryUI finderLiveHistoryUI = this.f159005a;
            int i = FinderLiveHistoryUI.f158992v;
            finderLiveHistoryUI.getClass();
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C65727t2(finderLiveHistoryUI, (C15601d<? super C65727t2>) null), 3, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$d */
    public static final class C55829d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveHistoryUI f159006d;

        public C55829d(FinderLiveHistoryUI finderLiveHistoryUI) {
            this.f159006d = finderLiveHistoryUI;
        }

        public final void run() {
            FinderRefreshLayout finderRefreshLayout = this.f159006d.f158997s;
            if (finderRefreshLayout != null) {
                finderRefreshLayout.mo26573d();
            }
        }
    }

    public FinderLiveHistoryUI() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        this.f158993o = currentTimeMillis;
        this.f158994p = currentTimeMillis - 2592000;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cy9;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.mo7);
        setBackBtn(new C55827b(this));
        this.f158999u = new C55825a();
        this.f158997s = (FinderRefreshLayout) findViewById(C0966R.C0970id.ije);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.iio);
        this.f158998t = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f158998t;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f158999u);
        }
        FinderRefreshLayout finderRefreshLayout = this.f158997s;
        if (finderRefreshLayout != null) {
            finderRefreshLayout.setOnSimpleAction(new C55828c(this));
        }
        FinderRefreshLayout finderRefreshLayout2 = this.f158997s;
        if (finderRefreshLayout2 != null) {
            finderRefreshLayout2.post(new C55829d(this));
        }
    }
}
