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
import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchImageData;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31543z5;
import fy3.C32224a;
import g83.C45897a;
import g83.C45899h;
import g83.C45900i;
import g83.C59379b;
import g83.C59387j;
import g83.C98092k;
import g83.C98093l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;
import te3.C101810m82;
import te3.xe4;
import u73.C22613h1;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: d83.j */
public final class C97453j implements C97446b, FTSEditTextView.C45051l {

    /* renamed from: d */
    public final C97448g f286047d;

    /* renamed from: e */
    public xe4 f286048e;

    /* renamed from: f */
    public final C75343a f286049f;

    /* renamed from: g */
    public final String f286050g = "MicroMsg.WebSearch.TagSearchMainTab";

    /* renamed from: h */
    public FrameLayout f286051h;

    /* renamed from: i */
    public FTSEditTextView f286052i;

    /* renamed from: j */
    public C92382a f286053j;

    /* renamed from: n */
    public C92383e f286054n;

    /* renamed from: o */
    public WebSearchWebView f286055o;

    /* renamed from: d83.j$a */
    public static final class C75344a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97453j f221508d;

        /* renamed from: e */
        public final /* synthetic */ String f221509e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75344a(C97453j jVar, String str) {
            super(0);
            this.f221508d = jVar;
            this.f221509e = str;
        }

        public Object invoke() {
            this.f221508d.f286049f.mo91487a(C112551y.m153816p(this.f221509e, " ", "_", false, 4, (Object) null), this.f221508d.f286048e.f228425p);
            this.f221508d.f286047d.dismiss();
            return C13598b0.f38549a;
        }
    }

    public C97453j(C97448g gVar, xe4 xe4, C75343a aVar, View view) {
        C87412m.m108594g(gVar, "dialog");
        C87412m.m108594g(xe4, "homeContext");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87412m.m108594g(view, "dialogView");
        this.f286047d = gVar;
        this.f286048e = xe4;
        this.f286049f = aVar;
        View findViewById = view.findViewById(C0966R.C0970id.glc);
        C87412m.m108593f(findViewById, "dialogView.findViewById(…d.main_webview_container)");
        this.f286051h = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.eg6);
        C87412m.m108593f(findViewById2, "dialogView.findViewById(R.id.fts_edittext)");
        this.f286052i = (FTSEditTextView) findViewById2;
        this.f286053j = new C92382a(this);
        this.f286054n = new C92383e(this);
        this.f286055o = new WebSearchWebView(mo24908k0());
        this.f286052i.mo70338f();
        this.f286052i.setFtsEditTextListener(this);
        this.f286052i.mo70355k();
        this.f286052i.mo70361q();
        FTSEditTextView fTSEditTextView = this.f286052i;
        fTSEditTextView.setHint(fTSEditTextView.getContext().getResources().getString(C0966R.string.a2p));
        this.f286055o.mo67633c0(new C45899h(), new C45900i(6));
        this.f286055o.addJavascriptInterface(this.f286053j, "tagWebSearchJSApi");
        this.f286051h.addView(this.f286055o);
        Log.m105925i("MicroMsg.WebSearch.TagSearchMainTab", "start to load url %s", this.f286048e.f228419g);
        this.f286055o.loadUrl(this.f286048e.f228419g);
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            FTSEditTextView fTSEditTextView = this.f286052i;
            C92382a aVar = this.f286053j;
            String totalQuery = fTSEditTextView.getTotalQuery();
            C87412m.m108593f(totalQuery, "it.totalQuery");
            String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            C87412m.m108593f(inEditTextQuery, "it.inEditTextQuery");
            aVar.mo137387o(totalQuery, inEditTextQuery);
        }
    }

    /* renamed from: K4 */
    public void mo136710K4(C101810m82 m822, Bitmap bitmap, String str) {
        C87412m.m108594g(m822, "shareContent");
        this.f286047d.mo136715E(m822, bitmap, str);
    }

    /* renamed from: X5 */
    public void mo136711X5(xe4 xe4) {
        C87412m.m108594g(xe4, "moreContext");
        C97448g gVar = this.f286047d;
        gVar.getClass();
        C61926c.m72668M(new C97452i(gVar, xe4));
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        if (mVar == FTSEditTextView.C45052m.UserInput || mVar == FTSEditTextView.C45052m.ClearText) {
            FTSEditTextView fTSEditTextView = this.f286052i;
            C92382a aVar = this.f286053j;
            String totalQuery = fTSEditTextView.getTotalQuery();
            C87412m.m108593f(totalQuery, "it.totalQuery");
            String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            C87412m.m108593f(inEditTextQuery, "it.inEditTextQuery");
            aVar.mo137387o(totalQuery, inEditTextQuery);
        }
    }

    /* renamed from: c */
    public C92383e mo9283c() {
        return this.f286054n;
    }

    /* renamed from: d3 */
    public void mo90298d3(String str, boolean z) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        this.f286052i.mo70356l(str, (List<FTSSearchView.C6996f>) null);
        if (z) {
            this.f286052i.mo70355k();
            this.f286052i.mo70360p();
            FTSEditTextView fTSEditTextView = this.f286052i;
            C92382a aVar = this.f286053j;
            String totalQuery = fTSEditTextView.getTotalQuery();
            C87412m.m108593f(totalQuery, "it.totalQuery");
            String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            C87412m.m108593f(inEditTextQuery, "it.inEditTextQuery");
            aVar.mo137387o(totalQuery, inEditTextQuery);
            return;
        }
        this.f286052i.mo70335c();
        this.f286052i.mo70339g();
    }

    /* renamed from: g */
    public C92382a mo9284g() {
        return this.f286053j;
    }

    public BaseWebSearchWebView getWebView() {
        return this.f286055o;
    }

    public void hideVKB() {
        this.f286052i.mo70355k();
        this.f286052i.mo70339g();
    }

    /* renamed from: j0 */
    public void mo136712j0(String str) {
        C87412m.m108594g(str, "id");
        this.f286047d.mo136717G(str);
    }

    /* renamed from: k0 */
    public Context mo24908k0() {
        Context context = this.f286047d.getContext();
        C87412m.m108593f(context, "dialog.context");
        return context;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickClearTextBtn(View view) {
        this.f286052i.mo70355k();
        this.f286052i.mo70360p();
    }

    /* renamed from: q3 */
    public void mo136713q3(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "sessionId");
        C87412m.m108594g(str3, "searchId");
        C87412m.m108594g(str4, "requestId");
        C61926c.m72668M(new C75344a(this, str));
        WCTopicSearchShareActionReportStruct wCTopicSearchShareActionReportStruct = new WCTopicSearchShareActionReportStruct();
        wCTopicSearchShareActionReportStruct.f266535d = 4;
        wCTopicSearchShareActionReportStruct.f266536e = (long) C31543z5.m39455e();
        long j = 2;
        wCTopicSearchShareActionReportStruct.f266537f = 2;
        wCTopicSearchShareActionReportStruct.f266538g = wCTopicSearchShareActionReportStruct.mo86045b("ResultQuery", str, true);
        if (!C72996z1.m85820U5(this.f286048e.f228424o)) {
            j = 1;
        }
        wCTopicSearchShareActionReportStruct.f266539h = j;
        wCTopicSearchShareActionReportStruct.f266540i = wCTopicSearchShareActionReportStruct.mo86045b("ShareSceneId", this.f286048e.f228424o, true);
        wCTopicSearchShareActionReportStruct.f266541j = wCTopicSearchShareActionReportStruct.mo86045b("ShareSessionId", str2, true);
        wCTopicSearchShareActionReportStruct.f266542k = wCTopicSearchShareActionReportStruct.mo86045b("ShareSearchId", str3, true);
        wCTopicSearchShareActionReportStruct.f266543l = wCTopicSearchShareActionReportStruct.mo86045b("ShareRequestId", str4, true);
        wCTopicSearchShareActionReportStruct.f266544m = wCTopicSearchShareActionReportStruct.mo86045b("ShareDocId", "", true);
        wCTopicSearchShareActionReportStruct.mo86054n();
        C22613h1.m26490p(wCTopicSearchShareActionReportStruct);
    }

    public void showVKB() {
        this.f286052i.mo70360p();
    }

    /* renamed from: v5 */
    public int mo24915v5() {
        return 0;
    }

    /* renamed from: x6 */
    public Object mo84508x6() {
        return this.f286048e;
    }

    /* renamed from: y */
    public boolean mo3009y() {
        FTSEditTextView fTSEditTextView = this.f286052i;
        String totalQuery = fTSEditTextView.getTotalQuery();
        if (totalQuery != null) {
            String obj = C112550d0.m153799i0(totalQuery).toString();
            if (!(!(obj == null || obj.length() == 0))) {
                totalQuery = null;
            }
            if (totalQuery != null) {
                C92382a aVar = this.f286053j;
                String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
                C87412m.m108593f(inEditTextQuery, "view.inEditTextQuery");
                aVar.mo137392p(totalQuery, inEditTextQuery);
                fTSEditTextView.mo70339g();
            }
        }
        return false;
    }

    /* renamed from: c */
    public C45897a m125489c() {
        return this.f286054n;
    }

    /* renamed from: g */
    public C59379b m125493g() {
        return this.f286053j;
    }

    /* renamed from: c */
    public WebSearchImageData m125488c() {
        return this.f286054n;
    }

    /* renamed from: g */
    public C59387j m125494g() {
        return this.f286053j;
    }

    /* renamed from: c */
    public C98092k m125490c() {
        return this.f286054n;
    }

    /* renamed from: g */
    public C98093l m125495g() {
        return this.f286053j;
    }
}
