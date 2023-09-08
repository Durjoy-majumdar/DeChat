package com.tencent.p014mm.plugin.card.p031ui.p034v4;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54209k0;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardNewBaseUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import kotlin.Metadata;
import qo3.C89779i0;
import uz0.C14393d0;
import uz0.C22669a0;
import uz0.C22670b0;
import uz0.C22671c0;
import uz0.C22673e0;
import uz0.C22675f0;
import uz0.C22676g;
import uz0.C22679g0;
import uz0.C22680h;
import uz0.C22689m0;
import uz0.C22703w;
import uz0.C22708z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v4/HistoryCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "a", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI */
public final class HistoryCardListUI extends CardNewBaseUI {

    /* renamed from: r */
    public static final /* synthetic */ int f52269r = 0;

    /* renamed from: i */
    public LoadMoreRecyclerView f52270i;

    /* renamed from: j */
    public ViewGroup f52271j;

    /* renamed from: n */
    public C22680h f52272n;

    /* renamed from: o */
    public C22676g f52273o;

    /* renamed from: p */
    public int f52274p = 1;

    /* renamed from: q */
    public C89779i0 f52275q;

    /* renamed from: com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI$a */
    public static final class C2177a extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI$a$a */
        public static final class C2178a extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2178a f12151d = new C2178a();

            public C2178a() {
                super(1);
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                C87412m.m108594g(view, "view");
                ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.bcb);
                StringBuilder sb = new StringBuilder();
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bcd)).getText());
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bc8)).getText());
                C87412m.m108593f(viewGroup, "labelLayout");
                MapExpandKt.visitChild(viewGroup, new C2182c(sb));
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.toString()");
                return sb4;
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI$a$b */
        public static final class C2179b extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2179b f12152d = new C2179b();

            public C2179b() {
                super(1);
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                C87412m.m108594g(view, "view");
                ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.bcb);
                StringBuilder sb = new StringBuilder();
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bcd)).getText());
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bc8)).getText());
                C87412m.m108593f(viewGroup, "labelLayout");
                MapExpandKt.visitChild(viewGroup, new C2183d(sb));
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.toString()");
                return sb4;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2177a(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0971layout.f6702m8).view(C0966R.C0970id.bc_).desc((C32226l<? super View, String>) C2178a.f12151d);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            root(C0966R.C0971layout.f6719mo).view(C0966R.C0970id.bcc).desc((C32226l<? super View, String>) C2179b.f12152d).type(viewType);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI$b */
    public static final class C18691b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ HistoryCardListUI f52276d;

        public C18691b(HistoryCardListUI historyCardListUI) {
            this.f52276d = historyCardListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52276d.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public void mo23418H7(int i, boolean z) {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7104ye;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bxk);
        C87412m.m108593f(findViewById, "findViewById(R.id.ctlu_rv)");
        this.f52270i = (LoadMoreRecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.bbh);
        C87412m.m108593f(findViewById2, "findViewById(R.id.chpe_root_layout)");
        this.f52271j = (ViewGroup) findViewById2;
        TextView textView = (TextView) findViewById(C0966R.C0970id.bbi);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.bbg);
        weImageView.setImageResource(C0966R.raw.icon_history_card_empty);
        weImageView.setIconColor(getResources().getColor(C0966R.color.FG_2));
        LoadMoreRecyclerView loadMoreRecyclerView = this.f52270i;
        if (loadMoreRecyclerView != null) {
            boolean z = true;
            loadMoreRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            C22676g gVar = new C22676g(true);
            this.f52273o = gVar;
            gVar.setHasStableIds(true);
            LoadMoreRecyclerView loadMoreRecyclerView2 = this.f52270i;
            if (loadMoreRecyclerView2 != null) {
                C22676g gVar2 = this.f52273o;
                if (gVar2 != null) {
                    loadMoreRecyclerView2.setAdapter(gVar2);
                    C0132m mVar = new C0132m(getContext(), 1);
                    mVar.mo128j(getResources().getDrawable(C0966R.C0969drawable.f4705kj));
                    LoadMoreRecyclerView loadMoreRecyclerView3 = this.f52270i;
                    if (loadMoreRecyclerView3 != null) {
                        loadMoreRecyclerView3.mo17085h0(mVar);
                        LoadMoreRecyclerView loadMoreRecyclerView4 = this.f52270i;
                        if (loadMoreRecyclerView4 != null) {
                            loadMoreRecyclerView4.setLoadingView((int) C0966R.C0971layout.f6728mx);
                            LoadMoreRecyclerView loadMoreRecyclerView5 = this.f52270i;
                            if (loadMoreRecyclerView5 != null) {
                                ViewGroup viewGroup = this.f52271j;
                                if (viewGroup != null) {
                                    loadMoreRecyclerView5.setEmptyView(viewGroup);
                                    textView.setText(C0966R.string.ayg);
                                    String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                                    this.f52274p = getIntent().getIntExtra("card_type", 2);
                                    if (!(stringExtra == null || stringExtra.length() == 0)) {
                                        z = false;
                                    }
                                    if (!z) {
                                        setMMTitle(stringExtra);
                                    } else {
                                        setMMTitle((int) C0966R.string.k2h);
                                    }
                                    setActionbarColor(getResources().getColor(C0966R.color.f2927a));
                                    hideActionbarLine();
                                    setBackBtn(new C18691b(this));
                                    return;
                                }
                                C87412m.m108603p("mEmptyView");
                                throw null;
                            }
                            C87412m.m108603p("mHistoryCardListRv");
                            throw null;
                        }
                        C87412m.m108603p("mHistoryCardListRv");
                        throw null;
                    }
                    C87412m.m108603p("mHistoryCardListRv");
                    throw null;
                }
                C87412m.m108603p("mHistoryCardListAdapter");
                throw null;
            }
            C87412m.m108603p("mHistoryCardListRv");
            throw null;
        }
        C87412m.m108603p("mHistoryCardListRv");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        C22680h hVar;
        super.onCreate(bundle);
        initView();
        LoadMoreRecyclerView loadMoreRecyclerView = this.f52270i;
        if (loadMoreRecyclerView != null) {
            loadMoreRecyclerView.setOnLoadingStateChangedListener(new C22673e0(this));
            LoadMoreRecyclerView loadMoreRecyclerView2 = this.f52270i;
            if (loadMoreRecyclerView2 != null) {
                loadMoreRecyclerView2.setOnItemClickListener(new C22675f0(this));
                LoadMoreRecyclerView loadMoreRecyclerView3 = this.f52270i;
                if (loadMoreRecyclerView3 != null) {
                    loadMoreRecyclerView3.setOnItemLongClickListener(new C22679g0(this));
                    Class cls = C22703w.class;
                    int i = this.f52274p;
                    if (i == 2) {
                        C39622i0 a = C39629l0.m42233a(this, (C54209k0.C54210b) null).mo75002a(cls);
                        C87412m.m108593f(a, "{\n                ViewMo…class.java)\n            }");
                        hVar = (C22680h) a;
                    } else if (i != 3) {
                        C39622i0 a2 = C39629l0.m42233a(this, (C54209k0.C54210b) null).mo75002a(cls);
                        C87412m.m108593f(a2, "{\n                ViewMo…class.java)\n            }");
                        hVar = (C22680h) a2;
                    } else {
                        C39622i0 a3 = C39629l0.m42233a(this, (C54209k0.C54210b) null).mo75002a(C22689m0.class);
                        C87412m.m108593f(a3, "{\n                ViewMo…class.java)\n            }");
                        hVar = (C22680h) a3;
                    }
                    this.f52272n = hVar;
                    hVar.f65225d.observe(this, new C22708z(this));
                    C22680h hVar2 = this.f52272n;
                    if (hVar2 != null) {
                        hVar2.f65226e.observe(this, new C22669a0(this));
                        C22680h hVar3 = this.f52272n;
                        if (hVar3 != null) {
                            hVar3.f65227f.observe(this, new C22670b0(this));
                            C22680h hVar4 = this.f52272n;
                            if (hVar4 != null) {
                                hVar4.f65228g.observe(this, new C22671c0(this));
                                C22680h hVar5 = this.f52272n;
                                if (hVar5 != null) {
                                    hVar5.f65229h.observe(this, new C14393d0(this));
                                    C22680h hVar6 = this.f52272n;
                                    if (hVar6 != null) {
                                        hVar6.mo35791d3();
                                        C22680h hVar7 = this.f52272n;
                                        if (hVar7 != null) {
                                            hVar7.mo35790c3(this);
                                        } else {
                                            C87412m.m108603p("mViewModel");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mViewModel");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mViewModel");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mViewModel");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mViewModel");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mHistoryCardListRv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mHistoryCardListRv");
                throw null;
            }
        } else {
            C87412m.m108603p("mHistoryCardListRv");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C22680h hVar = this.f52272n;
        if (hVar != null) {
            hVar.mo35794g3();
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C2177a.class);
    }
}
