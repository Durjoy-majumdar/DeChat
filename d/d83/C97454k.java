package d83;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import c83.C92382a;
import c83.C92383e;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import g83.C45897a;
import g83.C45899h;
import g83.C45900i;
import g83.C59379b;
import g83.C59387j;
import g83.C98092k;
import g83.C98093l;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C101810m82;
import te3.xe4;

/* renamed from: d83.k */
public final class C97454k implements C97446b {

    /* renamed from: d */
    public final C97448g f286056d;

    /* renamed from: e */
    public xe4 f286057e;

    /* renamed from: f */
    public final String f286058f = "MicroMsg.WebSearch.TagSearchMoreTab";

    /* renamed from: g */
    public View f286059g;

    /* renamed from: h */
    public FrameLayout f286060h;

    /* renamed from: i */
    public C92382a f286061i;

    /* renamed from: j */
    public C92383e f286062j;

    /* renamed from: n */
    public WebSearchWebView f286063n;

    public C97454k(C97448g gVar, xe4 xe4, C75343a aVar, View view) {
        C87412m.m108594g(gVar, "dialog");
        C87412m.m108594g(xe4, "homeContext");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87412m.m108594g(view, "dialogView");
        this.f286056d = gVar;
        this.f286057e = xe4;
        this.f286059g = view.findViewById(C0966R.C0970id.f358774h03);
        View findViewById = view.findViewById(C0966R.C0970id.h0b);
        C87412m.m108593f(findViewById, "dialogView.findViewById(…d.more_webview_container)");
        this.f286060h = (FrameLayout) findViewById;
        this.f286061i = new C92382a(this);
        this.f286062j = new C92383e(this);
        this.f286063n = new WebSearchWebView(mo24908k0());
        this.f286063n.mo67633c0(new C45899h(), new C45900i(6));
        this.f286063n.addJavascriptInterface(this.f286061i, "tagWebSearchJSApi");
        this.f286060h.addView(this.f286063n);
    }

    /* renamed from: K4 */
    public void mo136710K4(C101810m82 m822, Bitmap bitmap, String str) {
        C87412m.m108594g(m822, "shareContent");
        this.f286056d.mo136715E(m822, bitmap, str);
    }

    /* renamed from: X5 */
    public void mo136711X5(xe4 xe4) {
        C87412m.m108594g(xe4, "moreContext");
        boolean z = true;
        Log.m105925i(this.f286058f, "start to load url %s", this.f286057e.f228419g);
        this.f286063n.loadUrl(this.f286057e.f228419g);
        if (this.f286059g.getX() != 0.0f) {
            z = false;
        }
        if (z) {
            this.f286059g.setX((float) C76577a.m92145A(mo24908k0()));
        }
        this.f286059g.animate().translationX(0.0f).setStartDelay(200).setDuration(300).start();
        View view = this.f286059g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/TagSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/TagSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: c */
    public C92383e mo9283c() {
        return this.f286062j;
    }

    /* renamed from: d3 */
    public void mo90298d3(String str, boolean z) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
    }

    /* renamed from: g */
    public C92382a mo9284g() {
        return this.f286061i;
    }

    public BaseWebSearchWebView getWebView() {
        return this.f286063n;
    }

    public void hideVKB() {
    }

    /* renamed from: j0 */
    public void mo136712j0(String str) {
        C87412m.m108594g(str, "id");
        this.f286056d.mo136717G(str);
    }

    /* renamed from: k0 */
    public Context mo24908k0() {
        Context context = this.f286056d.getContext();
        C87412m.m108593f(context, "dialog.context");
        return context;
    }

    /* renamed from: q3 */
    public void mo136713q3(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "sessionId");
        C87412m.m108594g(str3, "searchId");
        C87412m.m108594g(str4, "requestId");
    }

    public void showVKB() {
    }

    /* renamed from: v5 */
    public int mo24915v5() {
        return 0;
    }

    /* renamed from: x6 */
    public Object mo84508x6() {
        return this.f286057e;
    }

    /* renamed from: c */
    public C45897a m125507c() {
        return this.f286062j;
    }

    /* renamed from: g */
    public C59379b m125511g() {
        return this.f286061i;
    }

    /* renamed from: c */
    public WebSearchImageData m125506c() {
        return this.f286062j;
    }

    /* renamed from: g */
    public C59387j m125512g() {
        return this.f286061i;
    }

    /* renamed from: c */
    public C98092k m125508c() {
        return this.f286062j;
    }

    /* renamed from: g */
    public C98093l m125513g() {
        return this.f286061i;
    }
}
