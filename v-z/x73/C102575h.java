package x73;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import g83.C45897a;
import g83.C45899h;
import g83.C45900i;
import g83.C59379b;
import g83.C59387j;
import g83.C98092k;
import g83.C98093l;
import gy3.C87412m;
import java.util.List;
import o40.C61926c;
import p662ql.C101204b;
import te3.C101810m82;
import te3.C101823o70;
import w73.C102357a;
import w73.C102359e;
import z04.C112550d0;

/* renamed from: x73.h */
public final class C102575h implements C102577j, FTSEditTextView.C45051l {

    /* renamed from: d */
    public final C102570e f302033d;

    /* renamed from: e */
    public C101823o70 f302034e;

    /* renamed from: f */
    public final C101204b f302035f;

    /* renamed from: g */
    public final String f302036g = "MicroMsg.WebSearch.EmojiSearchMainTab";

    /* renamed from: h */
    public FrameLayout f302037h;

    /* renamed from: i */
    public FTSEditTextView f302038i;

    /* renamed from: j */
    public C102357a f302039j;

    /* renamed from: n */
    public C102359e f302040n;

    /* renamed from: o */
    public WebSearchWebView f302041o;

    /* renamed from: p */
    public boolean f302042p;

    public C102575h(C102570e eVar, C101823o70 o702, C101204b bVar, View view) {
        C87412m.m108594g(eVar, "dialog");
        C87412m.m108594g(o702, "homeContext");
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87412m.m108594g(view, "dialogView");
        this.f302033d = eVar;
        this.f302034e = o702;
        this.f302035f = bVar;
        View findViewById = view.findViewById(C0966R.C0970id.glc);
        C87412m.m108593f(findViewById, "dialogView.findViewById(…d.main_webview_container)");
        this.f302037h = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.eg6);
        C87412m.m108593f(findViewById2, "dialogView.findViewById(R.id.fts_edittext)");
        this.f302038i = (FTSEditTextView) findViewById2;
        this.f302039j = new C102357a(this);
        this.f302040n = new C102359e(this);
        this.f302041o = new WebSearchWebView(mo24908k0());
        this.f302038i.mo70338f();
        this.f302038i.setFtsEditTextListener(this);
        if (Util.isNullOrNil(this.f302034e.f298985p) && this.f302034e.f298987r == 1) {
            this.f302038i.mo70355k();
            this.f302038i.mo70361q();
        }
        FTSEditTextView fTSEditTextView = this.f302038i;
        fTSEditTextView.setHint(fTSEditTextView.getContext().getResources().getString(C0966R.string.a2p));
        this.f302041o.mo67633c0(new C45899h(), new C45900i(6));
        boolean z = this.f302034e.f298988s == 1;
        this.f302042p = z;
        if (z) {
            Log.m105924i("MicroMsg.WebSearch.EmojiSearchMainTab", "init: forceDarkMode");
            this.f302041o.setBackgroundColor(0);
            this.f302041o.getBackground().setAlpha(0);
            this.f302041o.getSettings().setForceDarkMode(2);
        }
        this.f302041o.addJavascriptInterface(this.f302039j, "emojiWebSearchJSApi");
        this.f302037h.addView(this.f302041o);
        Log.m105925i("MicroMsg.WebSearch.EmojiSearchMainTab", "start to load url %s", this.f302034e.f298979g);
        this.f302041o.loadUrl(this.f302034e.f298979g);
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            FTSEditTextView fTSEditTextView = this.f302038i;
            C102357a aVar = this.f302039j;
            String totalQuery = fTSEditTextView.getTotalQuery();
            C87412m.m108593f(totalQuery, "it.totalQuery");
            String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            C87412m.m108593f(inEditTextQuery, "it.inEditTextQuery");
            aVar.mo137387o(totalQuery, inEditTextQuery);
        }
    }

    /* renamed from: G1 */
    public void mo142202G1(C101823o70 o702) {
        C87412m.m108594g(o702, "moreContext");
        C102570e eVar = this.f302033d;
        eVar.getClass();
        C61926c.m72668M(new C102574g(eVar, o702));
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        if (mVar == FTSEditTextView.C45052m.UserInput || mVar == FTSEditTextView.C45052m.ClearText) {
            FTSEditTextView fTSEditTextView = this.f302038i;
            C102357a aVar = this.f302039j;
            String totalQuery = fTSEditTextView.getTotalQuery();
            C87412m.m108593f(totalQuery, "it.totalQuery");
            String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            C87412m.m108593f(inEditTextQuery, "it.inEditTextQuery");
            aVar.mo137387o(totalQuery, inEditTextQuery);
        }
    }

    /* renamed from: c */
    public C102359e m135440c() {
        return this.f302040n;
    }

    /* renamed from: d3 */
    public void mo90298d3(String str, boolean z) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        this.f302038i.mo70356l(str, (List<FTSSearchView.C6996f>) null);
        if (z) {
            this.f302038i.mo70355k();
            this.f302038i.mo70360p();
            FTSEditTextView fTSEditTextView = this.f302038i;
            C102357a aVar = this.f302039j;
            if (aVar != null) {
                String totalQuery = fTSEditTextView.getTotalQuery();
                C87412m.m108593f(totalQuery, "it.totalQuery");
                String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
                C87412m.m108593f(inEditTextQuery, "it.inEditTextQuery");
                aVar.mo137387o(totalQuery, inEditTextQuery);
                return;
            }
            return;
        }
        this.f302038i.mo70335c();
        this.f302038i.mo70339g();
    }

    /* renamed from: g */
    public C102357a m135445g() {
        return this.f302039j;
    }

    public BaseWebSearchWebView getWebView() {
        return this.f302041o;
    }

    public void hideVKB() {
        this.f302038i.mo70339g();
    }

    /* renamed from: j0 */
    public void mo142203j0(String str) {
        C87412m.m108594g(str, "id");
        this.f302033d.mo142198F(str);
    }

    /* renamed from: k0 */
    public Context mo24908k0() {
        Context context = this.f302033d.getContext();
        C87412m.m108593f(context, "dialog.context");
        return context;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickClearTextBtn(View view) {
        this.f302038i.mo70355k();
        this.f302038i.mo70360p();
    }

    public void showVKB() {
        this.f302038i.mo70355k();
        this.f302038i.mo70360p();
    }

    /* renamed from: t4 */
    public void mo142204t4(C101810m82 m822, String str) {
        C87412m.m108594g(m822, "shareContent");
        this.f302033d.mo142197E(m822, str);
    }

    /* renamed from: v5 */
    public int mo24915v5() {
        return 0;
    }

    /* renamed from: x6 */
    public Object mo84508x6() {
        return this.f302034e;
    }

    /* renamed from: y */
    public boolean mo3009y() {
        FTSEditTextView fTSEditTextView = this.f302038i;
        String totalQuery = fTSEditTextView.getTotalQuery();
        if (totalQuery != null) {
            String obj = C112550d0.m153799i0(totalQuery).toString();
            if (!(!(obj == null || obj.length() == 0))) {
                totalQuery = null;
            }
            if (totalQuery != null) {
                C102357a aVar = this.f302039j;
                String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
                C87412m.m108593f(inEditTextQuery, "view.inEditTextQuery");
                aVar.mo137392p(totalQuery, inEditTextQuery);
                fTSEditTextView.mo70339g();
            }
        }
        return false;
    }

    /* renamed from: c */
    public C45897a m135438c() {
        return this.f302040n;
    }

    /* renamed from: g */
    public C59379b mo9284g() {
        return this.f302039j;
    }

    /* renamed from: c */
    public WebSearchImageData mo9283c() {
        return this.f302040n;
    }

    /* renamed from: g */
    public C59387j m135443g() {
        return this.f302039j;
    }

    /* renamed from: c */
    public C98092k m135439c() {
        return this.f302040n;
    }

    /* renamed from: g */
    public C98093l m135444g() {
        return this.f302039j;
    }
}
