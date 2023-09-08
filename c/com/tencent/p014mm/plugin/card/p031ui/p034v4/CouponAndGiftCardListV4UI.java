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
import uz0.C14397m;
import uz0.C22676g;
import uz0.C22681i;
import uz0.C22683j;
import uz0.C22684k;
import uz0.C22685l;
import uz0.C22693n;
import uz0.C22694o;
import uz0.C22695p;
import uz0.C22699v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "a", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI */
public final class CouponAndGiftCardListV4UI extends CardNewBaseUI {

    /* renamed from: s */
    public static final /* synthetic */ int f52260s = 0;

    /* renamed from: i */
    public final String f52261i = "MicroMsg.CouponAndGiftCardListV4UI";

    /* renamed from: j */
    public LoadMoreRecyclerView f52262j;

    /* renamed from: n */
    public ViewGroup f52263n;

    /* renamed from: o */
    public C22699v f52264o;

    /* renamed from: p */
    public C22676g f52265p;

    /* renamed from: q */
    public boolean f52266q;

    /* renamed from: r */
    public C89779i0 f52267r;

    /* renamed from: com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI$a */
    public static final class C2174a extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI$a$a */
        public static final class C2175a extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2175a f12149d = new C2175a();

            public C2175a() {
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
                MapExpandKt.visitChild(viewGroup, new C2180a(sb));
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.toString()");
                return sb4;
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI$a$b */
        public static final class C2176b extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2176b f12150d = new C2176b();

            public C2176b() {
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
                MapExpandKt.visitChild(viewGroup, new C2181b(sb));
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.toString()");
                return sb4;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2174a(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0971layout.f6702m8).view(C0966R.C0970id.bc_).desc((C32226l<? super View, String>) C2175a.f12149d);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            root(C0966R.C0971layout.f6719mo).view(C0966R.C0970id.bcc).desc((C32226l<? super View, String>) C2176b.f12150d).type(viewType);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI$b */
    public static final class C18690b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CouponAndGiftCardListV4UI f52268d;

        public C18690b(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
            this.f52268d = couponAndGiftCardListV4UI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52268d.finish();
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
        this.f52262j = (LoadMoreRecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.bbh);
        C87412m.m108593f(findViewById2, "findViewById(R.id.chpe_root_layout)");
        this.f52263n = (ViewGroup) findViewById2;
        LoadMoreRecyclerView loadMoreRecyclerView = this.f52262j;
        if (loadMoreRecyclerView != null) {
            boolean z = true;
            loadMoreRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            C22676g gVar = new C22676g(false);
            this.f52265p = gVar;
            gVar.setHasStableIds(true);
            LoadMoreRecyclerView loadMoreRecyclerView2 = this.f52262j;
            if (loadMoreRecyclerView2 != null) {
                C22676g gVar2 = this.f52265p;
                if (gVar2 != null) {
                    loadMoreRecyclerView2.setAdapter(gVar2);
                    C0132m mVar = new C0132m(getContext(), 1);
                    mVar.mo128j(getResources().getDrawable(C0966R.C0969drawable.f4705kj));
                    LoadMoreRecyclerView loadMoreRecyclerView3 = this.f52262j;
                    if (loadMoreRecyclerView3 != null) {
                        loadMoreRecyclerView3.mo17085h0(mVar);
                        LoadMoreRecyclerView loadMoreRecyclerView4 = this.f52262j;
                        if (loadMoreRecyclerView4 != null) {
                            loadMoreRecyclerView4.setLoadingView((int) C0966R.C0971layout.f6728mx);
                            LoadMoreRecyclerView loadMoreRecyclerView5 = this.f52262j;
                            if (loadMoreRecyclerView5 != null) {
                                ViewGroup viewGroup = this.f52263n;
                                if (viewGroup != null) {
                                    loadMoreRecyclerView5.setEmptyView(viewGroup);
                                    String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                                    if (!(stringExtra == null || stringExtra.length() == 0)) {
                                        z = false;
                                    }
                                    if (!z) {
                                        setMMTitle(stringExtra);
                                    } else {
                                        setMMTitle((int) C0966R.string.awo);
                                    }
                                    setActionbarColor(getResources().getColor(C0966R.color.f2927a));
                                    hideActionbarLine();
                                    setBackBtn(new C18690b(this));
                                    return;
                                }
                                C87412m.m108603p("mEmptyView");
                                throw null;
                            }
                            C87412m.m108603p("mCouponCardListRv");
                            throw null;
                        }
                        C87412m.m108603p("mCouponCardListRv");
                        throw null;
                    }
                    C87412m.m108603p("mCouponCardListRv");
                    throw null;
                }
                C87412m.m108603p("mCardsCardListAdapter");
                throw null;
            }
            C87412m.m108603p("mCouponCardListRv");
            throw null;
        }
        C87412m.m108603p("mCouponCardListRv");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        LoadMoreRecyclerView loadMoreRecyclerView = this.f52262j;
        if (loadMoreRecyclerView != null) {
            loadMoreRecyclerView.setOnLoadingStateChangedListener(new C22693n(this));
            LoadMoreRecyclerView loadMoreRecyclerView2 = this.f52262j;
            if (loadMoreRecyclerView2 != null) {
                loadMoreRecyclerView2.setOnItemClickListener(new C22694o(this));
                LoadMoreRecyclerView loadMoreRecyclerView3 = this.f52262j;
                if (loadMoreRecyclerView3 != null) {
                    loadMoreRecyclerView3.setOnItemLongClickListener(new C22695p(this));
                    C39622i0 a = C39629l0.m42233a(this, (C54209k0.C54210b) null).mo75002a(C22699v.class);
                    C87412m.m108593f(a, "of(this).get(CouponAndGi…istViewModel::class.java)");
                    C22699v vVar = (C22699v) a;
                    this.f52264o = vVar;
                    vVar.f65225d.observe(this, new C22681i(this));
                    C22699v vVar2 = this.f52264o;
                    if (vVar2 != null) {
                        vVar2.f65226e.observe(this, new C22683j(this));
                        C22699v vVar3 = this.f52264o;
                        if (vVar3 != null) {
                            vVar3.f65227f.observe(this, new C22684k(this));
                            C22699v vVar4 = this.f52264o;
                            if (vVar4 != null) {
                                vVar4.f65228g.observe(this, new C22685l(this));
                                C22699v vVar5 = this.f52264o;
                                if (vVar5 != null) {
                                    vVar5.f65229h.observe(this, new C14397m(this));
                                    C22699v vVar6 = this.f52264o;
                                    if (vVar6 != null) {
                                        vVar6.mo35791d3();
                                        C22699v vVar7 = this.f52264o;
                                        if (vVar7 != null) {
                                            vVar7.mo35790c3(this);
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
                    C87412m.m108603p("mCouponCardListRv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mCouponCardListRv");
                throw null;
            }
        } else {
            C87412m.m108603p("mCouponCardListRv");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C22699v vVar = this.f52264o;
        if (vVar != null) {
            vVar.mo35794g3();
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    public void onResume() {
        if (this.f52266q) {
            C22699v vVar = this.f52264o;
            if (vVar != null) {
                vVar.mo35790c3(this);
                this.f52266q = false;
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        }
        super.onResume();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C2174a.class);
    }
}
