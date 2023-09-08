package x73;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
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
import p662ql.C101204b;
import te3.C101810m82;
import te3.C101823o70;
import w73.C102357a;
import w73.C102359e;

/* renamed from: x73.i */
public final class C102576i implements C102577j {

    /* renamed from: d */
    public final C102570e f302043d;

    /* renamed from: e */
    public C101823o70 f302044e;

    /* renamed from: f */
    public final String f302045f = "MicroMsg.WebSearch.EmojiSearchMoreTab";

    /* renamed from: g */
    public View f302046g;

    /* renamed from: h */
    public FrameLayout f302047h;

    /* renamed from: i */
    public C102357a f302048i;

    /* renamed from: j */
    public C102359e f302049j;

    /* renamed from: n */
    public WebSearchWebView f302050n;

    /* renamed from: o */
    public boolean f302051o;

    public C102576i(C102570e eVar, C101823o70 o702, C101204b bVar, View view) {
        C87412m.m108594g(eVar, "dialog");
        C87412m.m108594g(o702, "homeContext");
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87412m.m108594g(view, "dialogView");
        this.f302043d = eVar;
        this.f302044e = o702;
        this.f302046g = view.findViewById(C0966R.C0970id.f358774h03);
        View findViewById = view.findViewById(C0966R.C0970id.h0b);
        C87412m.m108593f(findViewById, "dialogView.findViewById(…d.more_webview_container)");
        this.f302047h = (FrameLayout) findViewById;
        this.f302048i = new C102357a(this);
        this.f302049j = new C102359e(this);
        this.f302050n = new WebSearchWebView(mo24908k0());
        this.f302050n.mo67633c0(new C45899h(), new C45900i(6));
        boolean z = this.f302044e.f298988s != 1 ? false : true;
        this.f302051o = z;
        if (z) {
            Log.m105924i("MicroMsg.WebSearch.EmojiSearchMoreTab", "init: forceDarkMode");
            this.f302050n.setBackgroundColor(0);
            this.f302050n.getBackground().setAlpha(0);
            this.f302050n.getSettings().setForceDarkMode(2);
        }
        this.f302050n.addJavascriptInterface(this.f302048i, "emojiWebSearchJSApi");
        this.f302047h.addView(this.f302050n);
    }

    /* renamed from: G1 */
    public void mo142202G1(C101823o70 o702) {
        C87412m.m108594g(o702, "moreContext");
        boolean z = true;
        Log.m105925i(this.f302045f, "start to load url %s", this.f302044e.f298979g);
        this.f302050n.loadUrl(this.f302044e.f298979g);
        if (this.f302046g.getX() != 0.0f) {
            z = false;
        }
        if (z) {
            this.f302046g.setX((float) C76577a.m92145A(mo24908k0()));
        }
        this.f302046g.animate().translationX(0.0f).setStartDelay(200).setDuration(300).start();
        View view = this.f302046g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/EmojiSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/EmojiSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: c */
    public C102359e m135457c() {
        return this.f302049j;
    }

    /* renamed from: d3 */
    public void mo90298d3(String str, boolean z) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
    }

    /* renamed from: g */
    public C102357a m135462g() {
        return this.f302048i;
    }

    public BaseWebSearchWebView getWebView() {
        return this.f302050n;
    }

    public void hideVKB() {
    }

    /* renamed from: j0 */
    public void mo142203j0(String str) {
        C87412m.m108594g(str, "id");
        this.f302043d.mo142198F(str);
    }

    /* renamed from: k0 */
    public Context mo24908k0() {
        Context context = this.f302043d.getContext();
        C87412m.m108593f(context, "dialog.context");
        return context;
    }

    public void showVKB() {
    }

    /* renamed from: t4 */
    public void mo142204t4(C101810m82 m822, String str) {
        C87412m.m108594g(m822, "shareContent");
        this.f302043d.mo142197E(m822, str);
    }

    /* renamed from: v5 */
    public int mo24915v5() {
        return 0;
    }

    /* renamed from: x6 */
    public Object mo84508x6() {
        return this.f302044e;
    }

    /* renamed from: c */
    public C45897a m135455c() {
        return this.f302049j;
    }

    /* renamed from: g */
    public C59379b mo9284g() {
        return this.f302048i;
    }

    /* renamed from: c */
    public WebSearchImageData mo9283c() {
        return this.f302049j;
    }

    /* renamed from: g */
    public C59387j m135460g() {
        return this.f302048i;
    }

    /* renamed from: c */
    public C98092k m135456c() {
        return this.f302049j;
    }

    /* renamed from: g */
    public C98093l m135461g() {
        return this.f302048i;
    }
}
