package com.tencent.p014mm.plugin.finder.profile.filter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0757o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.flow.FlowLayoutManager;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPlayListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import dp1.C7446m0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import k20.C9556a;
import ko1.C10368a;
import kotlin.Metadata;
import o40.C61926c;
import p902gm.C75979a;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90363p0;
import te3.C51108rh0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lcm1/o;", "adapter", "Lrx3/b0;", "setOnItemClickListener", "Landroidx/recyclerview/widget/RecyclerView$l;", "getItemDecoration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView */
public final class FinderCollectionFilterView extends FrameLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f16121h = 0;

    /* renamed from: d */
    public C10368a f16122d;

    /* renamed from: e */
    public WxRecyclerView f16123e;

    /* renamed from: f */
    public FlowLayoutManager f16124f;

    /* renamed from: g */
    public TextView f16125g;

    /* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView$a */
    public static final class C3424a extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            rect.left = dimension;
            rect.right = dimension;
            rect.bottom = dimension;
            rect.top = dimension;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView$b */
    public static final class C3425b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCollectionFilterView f16126d;

        public C3425b(FinderCollectionFilterView finderCollectionFilterView) {
            this.f16126d = finderCollectionFilterView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderCollectionFilterView finderCollectionFilterView = this.f16126d;
            int i = FinderCollectionFilterView.f16121h;
            finderCollectionFilterView.getClass();
            Log.m105924i("Finder.FinderCollectionFilterView", "handleMoreClick");
            Intent intent = new Intent();
            C10368a aVar = finderCollectionFilterView.f16122d;
            byte[] bArr = null;
            if (aVar != null) {
                intent.putExtra("finder_username", aVar.f31567c);
                C10368a aVar2 = finderCollectionFilterView.f16122d;
                if (aVar2 != null) {
                    C89349b bVar = aVar2.f31566b.f141511f;
                    if (bVar != null) {
                        bArr = bVar.mo123703f();
                    }
                    intent.putExtra("KEY_LAST_BUFFER", bArr);
                    Context context = finderCollectionFilterView.getContext();
                    C87412m.m108593f(context, "context");
                    ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                    intent.setClass(context, FinderPlayListUI.class);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderPlayListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderPlayListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("presenter");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView$c */
    public static final class C3426c implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<C0757o> f16127d;

        /* renamed from: e */
        public final /* synthetic */ FinderCollectionFilterView f16128e;

        public C3426c(WxRecyclerAdapter<C0757o> wxRecyclerAdapter, FinderCollectionFilterView finderCollectionFilterView) {
            this.f16127d = wxRecyclerAdapter;
            this.f16128e = finderCollectionFilterView;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            Log.m105924i("Finder.FinderCollectionFilterView", "click item pos:" + (i - this.f16127d.mo85796c6()));
            Intent intent = new Intent();
            intent.putExtra("key_topic_type", 16);
            C51108rh0 rh02 = ((C0757o) oVar.f173503E).f1784d;
            String str = rh02.f140918e;
            if (str == null) {
                str = "";
            }
            long j = rh02.f140917d;
            intent.putExtra("key_topic_title", str);
            intent.putExtra("KEY_TOPIC_ID", j);
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f16128e.getContext();
            C87412m.m108593f(context, "context");
            C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            Context context2 = this.f16128e.getContext();
            C87412m.m108593f(context2, "context");
            ((C58684b) C86312j.m106911c(C58684b.class)).ty0(context2, intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCollectionFilterView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    private final void setOnItemClickListener(WxRecyclerAdapter<C0757o> wxRecyclerAdapter) {
        wxRecyclerAdapter.f173488o = new C3426c(wxRecyclerAdapter, this);
    }

    /* renamed from: a */
    public final void mo3773a(C10368a aVar) {
        Intent intent;
        C87412m.m108594g(aVar, "contract");
        this.f16122d = aVar;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d2k, this, true);
        View findViewById = findViewById(C0966R.C0970id.d2y);
        C87412m.m108593f(findViewById, "findViewById(R.id.filter_recycler_view)");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById;
        this.f16123e = wxRecyclerView;
        wxRecyclerView.mo17085h0(getItemDecoration());
        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
        this.f16124f = flowLayoutManager;
        flowLayoutManager.f52467o = 2;
        WxRecyclerView wxRecyclerView2 = this.f16123e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(flowLayoutManager);
            WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderCollectionFilterView$buildItemCoverts$1(), aVar.f31568d, false);
            setOnItemClickListener(wxRecyclerAdapter);
            WxRecyclerView wxRecyclerView3 = this.f16123e;
            if (wxRecyclerView3 != null) {
                wxRecyclerView3.setAdapter(wxRecyclerAdapter);
                WxRecyclerView wxRecyclerView4 = this.f16123e;
                if (wxRecyclerView4 != null) {
                    wxRecyclerView4.setItemAnimator(new C75979a());
                    View findViewById2 = findViewById(C0966R.C0970id.d2r);
                    C87412m.m108593f(findViewById2, "findViewById<TextView>(R.id.filter_arrow_layout)");
                    TextView textView = (TextView) findViewById2;
                    this.f16125g = textView;
                    textView.setOnClickListener(new C3425b(this));
                    Context context = getContext();
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    long j = -1;
                    if (!(activity == null || (intent = activity.getIntent()) == null)) {
                        j = intent.getLongExtra("finder_read_feed_id", -1);
                    }
                    C7446m0 m0Var = C7446m0.f25635a;
                    TextView textView2 = this.f16125g;
                    if (textView2 != null) {
                        C7446m0.m7572b(m0Var, textView2, "more_collection", 0, 0, C90363p0.m113143b(new C13604l("feed_id", C61926c.m72691p(j))), 12, (Object) null);
                    } else {
                        C87412m.m108603p("moreArrow");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    public final RecyclerView.C0129l getItemDecoration() {
        return new C3424a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCollectionFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCollectionFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
