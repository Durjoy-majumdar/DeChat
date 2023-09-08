package eq1;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.p056ui.conv.FinderConvSearchFeedFragment;
import com.tencent.p014mm.plugin.finder.p056ui.conv.FinderConvSearchFeedStaggeredConfig;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import oq3.C21804c;
import up1.C14367u0;

/* renamed from: eq1.b */
public final class C58666b {

    /* renamed from: a */
    public final Activity f167947a;

    /* renamed from: b */
    public final FinderConvSearchFeedFragment f167948b;

    /* renamed from: c */
    public final C58665a f167949c;

    /* renamed from: d */
    public final View f167950d;

    /* renamed from: e */
    public final String f167951e;

    /* renamed from: f */
    public String f167952f = "";

    /* renamed from: g */
    public FinderRefreshLayout f167953g;

    /* renamed from: h */
    public WxRecyclerAdapter<?> f167954h;

    /* renamed from: i */
    public WxRecyclerView f167955i;

    /* renamed from: j */
    public FrameLayout f167956j;

    /* renamed from: k */
    public View f167957k;

    /* renamed from: l */
    public View f167958l;

    /* renamed from: m */
    public View f167959m;

    /* renamed from: n */
    public View f167960n;

    /* renamed from: o */
    public TextView f167961o;

    /* renamed from: p */
    public final C14367u0 f167962p = new FinderConvSearchFeedStaggeredConfig(new C58667a(this));

    /* renamed from: q */
    public C21804c f167963q;

    /* renamed from: eq1.b$a */
    public static final class C58667a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C58666b f167964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58667a(C58666b bVar) {
            super(0);
            this.f167964d = bVar;
        }

        public Object invoke() {
            return this.f167964d.f167952f;
        }
    }

    public C58666b(Activity activity, FinderConvSearchFeedFragment finderConvSearchFeedFragment, C58665a aVar, View view, String str) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(finderConvSearchFeedFragment, "fragment");
        C87412m.m108594g(aVar, "presenter");
        C87412m.m108594g(str, "conversation");
        this.f167947a = activity;
        this.f167948b = finderConvSearchFeedFragment;
        this.f167949c = aVar;
        this.f167950d = view;
        this.f167951e = str;
    }

    /* renamed from: a */
    public final <T extends View> T mo83537a(int i) {
        View view = this.f167950d;
        T findViewById = view != null ? view.findViewById(i) : null;
        if (findViewById != null) {
            return findViewById;
        }
        T findViewById2 = this.f167947a.findViewById(i);
        C87412m.m108593f(findViewById2, "context.findViewById(id)");
        return findViewById2;
    }

    /* renamed from: b */
    public final WxRecyclerView mo83538b() {
        WxRecyclerView wxRecyclerView = this.f167955i;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: c */
    public final FinderRefreshLayout mo83539c() {
        FinderRefreshLayout finderRefreshLayout = this.f167953g;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }
}
