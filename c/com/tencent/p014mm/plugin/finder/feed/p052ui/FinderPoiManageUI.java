package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderPoiManageUIContract$PoiManageViewCallback$initView$1;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import er1.C58684b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Pattern;
import je1.C46542v2;
import kf1.C10001u6;
import kf1.C46697b7;
import kf1.C46704t6;
import kf1.C46707v6;
import kf1.C46709w6;
import kf1.C46714y6;
import kotlin.Metadata;
import l31.C61212e;
import lp3.C88643g;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uo3.C78253a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiManageUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI */
public final class FinderPoiManageUI extends MMFinderUI {

    /* renamed from: r */
    public static final /* synthetic */ int f111556r = 0;

    /* renamed from: o */
    public final C13601g f111557o = C36568h.m40985a(new C41427c(this));

    /* renamed from: p */
    public final C13601g f111558p = C36568h.m40985a(new C41429e(this));

    /* renamed from: q */
    public final C13601g f111559q = C36568h.m40985a(C41428d.f111563d);

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI$a */
    public static final class C41425a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiManageUI f111560d;

        public C41425a(FinderPoiManageUI finderPoiManageUI) {
            this.f111560d = finderPoiManageUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f111560d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI$b */
    public static final class C41426b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiManageUI f111561d;

        public C41426b(FinderPoiManageUI finderPoiManageUI) {
            this.f111561d = finderPoiManageUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderPoiManageUI finderPoiManageUI = this.f111561d;
            int i = FinderPoiManageUI.f111556r;
            finderPoiManageUI.getClass();
            ((C58684b) C86312j.m106911c(C58684b.class)).ny0(finderPoiManageUI, (Intent) null, 12222);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI$c */
    public static final class C41427c extends C87413o implements C32224a<C46704t6> {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiManageUI f111562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41427c(FinderPoiManageUI finderPoiManageUI) {
            super(0);
            this.f111562d = finderPoiManageUI;
        }

        public Object invoke() {
            return new C46704t6((String) ((C36570n) this.f111562d.f111559q).getValue(), ((C13442s8) C39818r.f106831a.mo62444c(this.f111562d).mo75002a(C13442s8.class)).mo12861q3());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI$d */
    public static final class C41428d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C41428d f111563d = new C41428d();

        public C41428d() {
            super(0);
        }

        public Object invoke() {
            return C66785b.f191882e.mo90662O5();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI$e */
    public static final class C41429e extends C87413o implements C32224a<C46697b7> {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiManageUI f111564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41429e(FinderPoiManageUI finderPoiManageUI) {
            super(0);
            this.f111564d = finderPoiManageUI;
        }

        public Object invoke() {
            FinderPoiManageUI finderPoiManageUI = this.f111564d;
            return new C46697b7(finderPoiManageUI, (C46704t6) ((C36570n) finderPoiManageUI.f111557o).getValue());
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 126;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.an4;
    }

    public final void handleIntent(Intent intent) {
        ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("extra_poi_list") : null;
        if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
            C46704t6 t6Var = (C46704t6) ((C36570n) this.f111557o).getValue();
            t6Var.getClass();
            C87412m.m108594g(stringArrayListExtra, "poiList");
            C86709a0.m107524d().mo123460f(new C46542v2(t6Var.f125728d, new LinkedList(stringArrayListExtra)));
        }
    }

    public void initView() {
        setBackBtn(new C41425a(this));
        setMMTitle(getResources().getString(C0966R.string.egv));
        hideActionbarLine();
        addTextOptionMenu(10001, getResources().getString(C0966R.string.egw), getResources().getColor(C0966R.color.BW_0_Alpha_0_9), (MenuItem.OnMenuItemClickListener) new C41426b(this));
        C46704t6 t6Var = (C46704t6) ((C36570n) this.f111557o).getValue();
        C46697b7 b7Var = (C46697b7) ((C36570n) this.f111558p).getValue();
        t6Var.getClass();
        C87412m.m108594g(b7Var, "callback");
        t6Var.f125730f = b7Var;
        C86709a0.m107524d().mo123455a(6850, t6Var);
        C86709a0.m107524d().mo123455a(6495, t6Var);
        C86709a0.m107524d().mo123455a(4078, t6Var);
        C46697b7 b7Var2 = (C46697b7) ((C36570n) this.f111558p).getValue();
        View findViewById = b7Var2.f125715d.findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "activity.findViewById(id)");
        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
        b7Var2.f125717f = refreshLoadMoreLayout;
        RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(b7Var2.f125715d));
        WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderPoiManageUIContract$PoiManageViewCallback$initView$1(), b7Var2.f125716e.f125732h, true);
        b7Var2.f125719h = wxRecyclerAdapter;
        recyclerView.setAdapter(wxRecyclerAdapter);
        WxRecyclerAdapter<?> wxRecyclerAdapter2 = b7Var2.f125719h;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f173488o = new C10001u6();
            wxRecyclerAdapter2.f173487n = new C46707v6(b7Var2);
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = b7Var2.f125717f;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.setActionCallback(new C46709w6(b7Var2));
                b7Var2.f125718g = new C78253a(b7Var2.f125715d);
                Pattern pattern = C61926c.f176038a;
                C61926c.m72701z(C88643g.m110546d(), new C46714y6(b7Var2));
                return;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 12222 && i2 == -1) {
            handleIntent(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        if (getIntent().hasExtra("extra_poi_list")) {
            handleIntent(getIntent());
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderPoiManageUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        ((C46704t6) ((C36570n) this.f111557o).getValue()).onDetach();
    }
}
