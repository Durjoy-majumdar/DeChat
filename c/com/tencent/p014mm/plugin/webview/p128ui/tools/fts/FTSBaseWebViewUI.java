package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.search.WebSearchView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44125o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import di3.C86312j;
import gn3.C45938a;
import h81.C32735h;
import j20.C117292a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t83.C48590l;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI */
public class FTSBaseWebViewUI extends BaseSearchWebViewUI implements C45938a, FTSEditTextView.C45051l, FTSEditTextView.C45049j {

    /* renamed from: A3 */
    public LinkedList<String> f118930A3 = new LinkedList<>();

    /* renamed from: B3 */
    public boolean f118931B3 = true;

    /* renamed from: C3 */
    public int f118932C3 = 0;

    /* renamed from: D3 */
    public boolean f118933D3 = true;

    /* renamed from: E3 */
    public C43921p f118934E3 = new C43921p((C43912g) null);

    /* renamed from: q3 */
    public WebSearchView f118935q3;

    /* renamed from: r3 */
    public View f118936r3;

    /* renamed from: s3 */
    public View f118937s3;

    /* renamed from: t3 */
    public int f118938t3;

    /* renamed from: u3 */
    public boolean f118939u3;

    /* renamed from: v3 */
    public int f118940v3;

    /* renamed from: w3 */
    public boolean f118941w3;

    /* renamed from: x3 */
    public boolean f118942x3;

    /* renamed from: y3 */
    public boolean f118943y3;

    /* renamed from: z3 */
    public boolean f118944z3;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$a */
    public class C43906a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118945d;

        /* renamed from: e */
        public final /* synthetic */ String f118946e;

        /* renamed from: f */
        public final /* synthetic */ int f118947f;

        public C43906a(int i, String str, int i2) {
            this.f118945d = i;
            this.f118946e = str;
            this.f118947f = i2;
        }

        public void run() {
            C48590l lVar = FTSBaseWebViewUI.this.f118508Z;
            if (lVar != null) {
                lVar.mo73240i0(this.f118945d, this.f118946e, this.f118947f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$b */
    public class C43907b implements Runnable {
        public C43907b() {
        }

        public void run() {
            FTSBaseWebViewUI fTSBaseWebViewUI = FTSBaseWebViewUI.this;
            C48590l lVar = fTSBaseWebViewUI.f118508Z;
            if (lVar != null) {
                lVar.mo73232a0(fTSBaseWebViewUI.mo68491da(), FTSBaseWebViewUI.this.mo68489ba(), FTSBaseWebViewUI.this.mo68490ca(), 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$c */
    public class C43908c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118950d;

        public C43908c(String str) {
            this.f118950d = str;
        }

        public void run() {
            C48590l lVar = FTSBaseWebViewUI.this.f118508Z;
            if (lVar != null) {
                lVar.mo73233b0(this.f118950d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$d */
    public class C43909d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118952d;

        /* renamed from: e */
        public final /* synthetic */ int f118953e;

        public C43909d(String str, int i) {
            this.f118952d = str;
            this.f118953e = i;
        }

        public void run() {
            C48590l lVar = FTSBaseWebViewUI.this.f118508Z;
            if (lVar != null) {
                lVar.mo73223T(this.f118952d, this.f118953e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$e */
    public class C43910e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118955d;

        /* renamed from: e */
        public final /* synthetic */ long f118956e;

        /* renamed from: f */
        public final /* synthetic */ String f118957f;

        public C43910e(int i, long j, String str) {
            this.f118955d = i;
            this.f118956e = j;
            this.f118957f = str;
        }

        public void run() {
            C48590l lVar = FTSBaseWebViewUI.this.f118508Z;
            if (lVar != null) {
                lVar.mo73241j0(this.f118955d, this.f118956e, this.f118957f);
                Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", Integer.valueOf(this.f118955d), Long.valueOf(this.f118956e), this.f118957f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$f */
    public class C43911f implements Runnable {
        public C43911f() {
        }

        public void run() {
            FTSBaseWebViewUI fTSBaseWebViewUI = FTSBaseWebViewUI.this;
            C48590l lVar = fTSBaseWebViewUI.f118508Z;
            if (lVar != null) {
                lVar.mo73232a0(fTSBaseWebViewUI.mo68491da(), FTSBaseWebViewUI.this.mo68489ba(), FTSBaseWebViewUI.this.mo68490ca(), 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$g */
    public class C43912g implements View.OnTouchListener {
        public C43912g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            FTSBaseWebViewUI.this.hideVKB();
            FTSBaseWebViewUI.this.mo68477V9();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$h */
    public class C43913h implements View.OnClickListener {
        public C43913h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSBaseWebViewUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$i */
    public class C43914i implements View.OnLongClickListener {
        public C43914i(FTSBaseWebViewUI fTSBaseWebViewUI) {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$j */
    public class C43915j implements Runnable {
        public C43915j() {
        }

        public void run() {
            FTSBaseWebViewUI fTSBaseWebViewUI = FTSBaseWebViewUI.this;
            C48590l lVar = fTSBaseWebViewUI.f118508Z;
            if (lVar != null) {
                lVar.mo73232a0(fTSBaseWebViewUI.mo68491da(), FTSBaseWebViewUI.this.mo68489ba(), FTSBaseWebViewUI.this.mo68490ca(), 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$k */
    public class C43916k implements Runnable {
        public C43916k() {
        }

        public void run() {
            FTSBaseWebViewUI fTSBaseWebViewUI = FTSBaseWebViewUI.this;
            C48590l lVar = fTSBaseWebViewUI.f118508Z;
            if (lVar != null) {
                lVar.mo73232a0(fTSBaseWebViewUI.mo68491da(), FTSBaseWebViewUI.this.mo68489ba(), FTSBaseWebViewUI.this.mo68490ca(), 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$l */
    public class C43917l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f118964d;

        public C43917l(Map map) {
            this.f118964d = map;
        }

        public void run() {
            C48590l lVar = FTSBaseWebViewUI.this.f118508Z;
            if (lVar != null) {
                lVar.mo73235d0(this.f118964d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$m */
    public class C43918m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f118966d;

        /* renamed from: e */
        public final /* synthetic */ String f118967e;

        /* renamed from: f */
        public final /* synthetic */ boolean f118968f;

        /* renamed from: g */
        public final /* synthetic */ String f118969g;

        public C43918m(Bundle bundle, String str, boolean z, String str2) {
            this.f118966d = bundle;
            this.f118967e = str;
            this.f118968f = z;
            this.f118969g = str2;
        }

        public void run() {
            if (FTSBaseWebViewUI.this.f118508Z != null) {
                Bundle bundle = this.f118966d;
                if (bundle == null || bundle.getInt("isRefresh") != 1 || this.f118966d.getString("widgetId") == null) {
                    FTSBaseWebViewUI.this.f118508Z.mo73228Y(this.f118967e, this.f118968f, this.f118969g);
                } else {
                    FTSBaseWebViewUI.this.f118508Z.mo73234c0(this.f118966d.getString("widgetId"), this.f118967e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$n */
    public class C43919n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118971d;

        /* renamed from: e */
        public final /* synthetic */ String f118972e;

        public C43919n(int i, String str) {
            this.f118971d = i;
            this.f118972e = str;
        }

        public void run() {
            C48590l lVar = FTSBaseWebViewUI.this.f118508Z;
            if (lVar != null) {
                lVar.mo73229Z(this.f118971d, this.f118972e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$o */
    public class C43920o implements FTSSearchView.C6996f {

        /* renamed from: d */
        public String f118974d;

        /* renamed from: e */
        public int f118975e;

        /* renamed from: f */
        public String f118976f;

        public C43920o(FTSBaseWebViewUI fTSBaseWebViewUI) {
        }

        /* renamed from: SE */
        public String mo8025SE() {
            return this.f118974d;
        }

        public int compareTo(Object obj) {
            if (obj == null || !(obj instanceof C43920o)) {
                return -1;
            }
            return this.f118974d.compareTo(((C43920o) obj).f118974d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$p */
    public class C43921p extends C43505b0 {

        /* renamed from: c */
        public C43922a f118977c = new C43922a((C43912g) null);

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI$p$a */
        public class C43922a extends C43519u {
            public C43922a(C43912g gVar) {
            }

            /* renamed from: c */
            public void mo64753c(WebView webView, String str) {
                Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onPageFinished %s", str);
                FTSBaseWebViewUI.this.showOptionMenu(false);
                FTSBaseWebViewUI fTSBaseWebViewUI = FTSBaseWebViewUI.this;
                if (fTSBaseWebViewUI.f118935q3 != null && !fTSBaseWebViewUI.f118873R2) {
                    fTSBaseWebViewUI.getClass();
                    FTSBaseWebViewUI.this.f118935q3.getFtsEditText().mo70335c();
                    FTSBaseWebViewUI.this.hideVKB();
                }
            }

            /* renamed from: d */
            public void mo62156d(WebView webView, String str) {
                Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onPageStarted %s", str);
                FTSBaseWebViewUI.this.showOptionMenu(false);
                FTSBaseWebViewUI fTSBaseWebViewUI = FTSBaseWebViewUI.this;
                WebSearchView webSearchView = fTSBaseWebViewUI.f118935q3;
                if (webSearchView != null && !fTSBaseWebViewUI.f118873R2) {
                    webSearchView.getFtsEditText().mo70335c();
                    FTSBaseWebViewUI.this.hideVKB();
                }
                C22613h1.m26481g(FTSBaseWebViewUI.this.f118940v3, 1);
                C22613h1.m26482h(FTSBaseWebViewUI.this.f118940v3, 1, 0, 0, "");
            }

            /* renamed from: e */
            public void mo64754e(WebView webView, int i, String str, String str2) {
                if (str2 != null && str2.equals(FTSBaseWebViewUI.this.mo6901n0())) {
                    C22613h1.m26481g(FTSBaseWebViewUI.this.f118940v3, 16);
                }
            }
        }

        public C43921p(C43912g gVar) {
        }

        /* renamed from: b */
        public C43519u mo67776b() {
            return this.f118977c;
        }

        /* renamed from: f */
        public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
            InputStream inputStream;
            if (webResourceRequest == null || webResourceRequest.getUrl() == null || !webResourceRequest.getUrl().toString().startsWith("weixin://fts")) {
                return null;
            }
            String uri = webResourceRequest.getUrl().toString();
            Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "url=%s | thread=%d", uri, Long.valueOf(Thread.currentThread().getId()));
            try {
                inputStream = C86013q1.m106423E(Uri.parse(uri).getQueryParameter("path"));
            } catch (Exception unused) {
                inputStream = null;
            }
            if (inputStream != null) {
                return new WebResourceResponse("image/*", "utf8", inputStream);
            }
            return null;
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            this.f118501W1.post(new C43916k());
        }
    }

    /* renamed from: E8 */
    public boolean mo68232E8() {
        return true;
    }

    /* renamed from: K3 */
    public void mo68431K3() {
        this.f118935q3.getFtsEditText().mo70335c();
        hideVKB();
    }

    /* renamed from: L2 */
    public boolean mo3920L2(View view) {
        mo68493fa();
        return false;
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        C43522y M7 = super.mo63701M7();
        M7.mo67679J(this.f118934E3);
        return M7;
    }

    /* renamed from: N8 */
    public void mo68246N8() {
        if (!Util.isNullOrNil(this.f118884c3)) {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, this.f118884c3);
        } else {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, mo68489ba());
        }
        this.f118894m3.put("exittype", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        mo68492ea();
    }

    /* renamed from: Q8 */
    public boolean mo68254Q8() {
        return false;
    }

    /* renamed from: S9 */
    public void mo68432S9(int i, String str, Map<String, Object> map) {
        this.f118930A3.remove(str);
        this.f118930A3.add(str);
        LinkedList<String> linkedList = this.f118930A3;
        if (linkedList != null) {
            Log.m105919d("MicroMsg.WebSearch.FTSBaseWebViewUI", "searchHistory size:%s, isMoreBtn:%s", Integer.valueOf(linkedList.size()), Boolean.valueOf(this.f118943y3));
            if (this.f118930A3.size() > 1 || this.f118943y3 || this.f118944z3) {
                this.f118935q3.setCancelBtnVisible(0);
            } else {
                this.f118935q3.setCancelBtnVisible(8);
            }
        }
    }

    /* renamed from: T7 */
    public boolean mo68257T7() {
        return false;
    }

    /* renamed from: W7 */
    public int mo68263W7() {
        return C0966R.raw.actionbar_icon_dark_back;
    }

    /* renamed from: aa */
    public String mo63386aa() {
        return null;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onEditTextChange %s %s %s", str, str2, mVar);
        if (mVar == FTSEditTextView.C45052m.UserInput || mVar == FTSEditTextView.C45052m.ClearText) {
            this.f118501W1.post(new C43915j());
        }
    }

    /* renamed from: ba */
    public String mo68489ba() {
        return this.f118935q3.getFtsEditText().getInEditTextQuery();
    }

    /* renamed from: ca */
    public JSONArray mo68490ca() {
        List<FTSSearchView.C6996f> tagList = this.f118935q3.getFtsEditText().getTagList();
        JSONArray jSONArray = new JSONArray();
        Iterator<FTSSearchView.C6996f> it = tagList.iterator();
        while (it.hasNext()) {
            C43920o oVar = (C43920o) it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tagName", oVar.f118974d);
                jSONObject.put("tagType", oVar.f118975e);
                jSONObject.put("userName", oVar.f118976f);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: da */
    public String mo68491da() {
        return this.f118935q3.getFtsEditText().getTotalQuery();
    }

    /* renamed from: ea */
    public final boolean mo68492ea() {
        if (this.f118930A3.size() > 1) {
            this.f118930A3.removeLast();
            this.f118935q3.getFtsEditText().mo70356l(this.f118930A3.getLast(), (List<FTSSearchView.C6996f>) null);
            this.f118935q3.getFtsEditText().mo70335c();
            this.f118935q3.setCancelBtnVisible(0);
            hideVKB();
            this.f118501W1.post(new C43965g(this, 1));
            return false;
        } else if (!this.f119063N2 || this.f118935q3.getFtsEditText().getTotalQuery().isEmpty()) {
            hideVKB();
            finish();
            return true;
        } else {
            if (!this.f118930A3.isEmpty()) {
                this.f118930A3.removeLast();
            }
            this.f118935q3.getFtsEditText().mo70336d();
            this.f118935q3.getFtsEditText().mo70335c();
            return false;
        }
    }

    /* renamed from: fa */
    public final void mo68493fa() {
        WebSearchView webSearchView = this.f118935q3;
        if (!(webSearchView == null || webSearchView.getFtsEditText() == null)) {
            this.f118935q3.getFtsEditText().mo70335c();
            this.f118935q3.getFtsEditText().mo70363s();
        }
        hideVKB();
        this.f118501W1.post(new C43965g(this, 0));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return this.f118939u3 ? C0966R.C0971layout.f7199y9 : C0966R.C0971layout.f359799au2;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
        if (!this.f118935q3.getFtsEditText().mo70354j()) {
            this.f118935q3.getFtsEditText().mo70355k();
            showVKB();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 800) {
            this.f118935q3.setCancelBtnVisible(0);
        }
    }

    public void onBackPressed() {
        if (mo68492ea()) {
            if (!Util.isNullOrNil(this.f118884c3)) {
                this.f118894m3.put(SearchIntents.EXTRA_QUERY, this.f118884c3);
            } else {
                this.f118894m3.put(SearchIntents.EXTRA_QUERY, mo68489ba());
            }
            this.f118894m3.put("exittype", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
            super.onBackPressed();
        }
    }

    public void onClickBackBtn(View view) {
        if (!Util.isNullOrNil(this.f118884c3)) {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, this.f118884c3);
        } else {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, mo68489ba());
        }
        this.f118894m3.put("exittype", "3");
        mo68492ea();
    }

    public void onClickCancelBtn(View view) {
        this.f118935q3.getFtsEditText().mo70356l("", (List<FTSSearchView.C6996f>) null);
        this.f118501W1.post(new C43911f());
        this.f118935q3.getFtsEditText().mo70335c();
        hideVKB();
    }

    public void onClickClearTextBtn(View view) {
        WebSearchView webSearchView = this.f118935q3;
        if (webSearchView != null) {
            if (!webSearchView.getFtsEditText().mo70354j()) {
                this.f118935q3.getFtsEditText().mo70355k();
            }
            this.f118935q3.getFtsEditText().setHint(mo63386aa());
            this.f118935q3.setCancelBtnVisible(8);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("ftsForceShowDarkMode", false);
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_page_support_force_night_mode, 1) == 1;
        this.f118939u3 = booleanExtra && z;
        Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "isOpenForceNightMode = %s， showDarkMode = %s", Boolean.valueOf(z), Boolean.valueOf(booleanExtra));
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        int i = FTSEditTextView.f122147H;
        this.f118931B3 = C117731d.m166007c().mo182443e("clicfg_websearch_input_back_btn", 0, true, true) == 0;
        this.f118932C3 = FTSEditTextView.getSearchInputType();
        this.f118933D3 = C117731d.m166007c().mo182443e("clicfg_websearch_input_cancel_btn", 1, true, true) == 1;
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.f118931B3);
        objArr[1] = Boolean.valueOf(this.f118932C3 == 0);
        objArr[2] = Boolean.valueOf(this.f118933D3);
        Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "initData, isSearchInputBackLast = %s, isSearchInputTypeOld = %s, isSearchInputShowCancel = %s.", objArr);
        this.f118936r3 = findViewById(C0966R.C0970id.m9r);
        String trim = Util.nullAs(getIntent().getStringExtra("ftsQuery"), "").trim();
        this.f118940v3 = getIntent().getIntExtra("ftsbizscene", 0);
        this.f118938t3 = getIntent().getIntExtra("ftsType", 0);
        this.f118941w3 = getIntent().getBooleanExtra("ftscaneditable", true);
        this.f118942x3 = getIntent().getBooleanExtra("key_hide_cancel_btn", false);
        getIntent().getBooleanExtra("key_from_whole_search", true);
        this.f118943y3 = getIntent().getBooleanExtra("ftsismorebutton", false);
        this.f118944z3 = getIntent().getBooleanExtra("ftsisshowcancel", false);
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            mMWebView.setOnTouchListener(new C43912g());
        }
        this.f118935q3 = (WebSearchView) findViewById(C0966R.C0970id.lm7);
        View findViewById = findViewById(C0966R.C0970id.kof);
        this.f118937s3 = findViewById;
        if (this.f118941w3) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f118935q3.setSearchViewListener(this);
            this.f118935q3.getFtsEditText().setHint(mo63386aa());
            this.f118935q3.getFtsEditText().setFtsEditTextListener(this);
            this.f118935q3.getFtsEditText().setActionSearchDoneListener(this);
            if (this.f118942x3) {
                this.f118935q3.getCancelBtn().setVisibility(8);
            }
            if (!Util.isNullOrNil(trim)) {
                this.f118935q3.getFtsEditText().mo70356l(trim, (List<FTSSearchView.C6996f>) null);
                this.f118930A3.remove(trim);
                this.f118930A3.add(trim);
            }
            if (this.f118873R2) {
                this.f118935q3.getFtsEditText().mo70355k();
                this.f118935q3.getFtsEditText().mo70361q();
            }
            if (getIntent().getBooleanExtra("key_change_search_icon", false)) {
                this.f118935q3.getFtsEditText().getIconView().setImageDrawable(mo68476U9(this.f118938t3));
                this.f118935q3.getFtsEditText().getIconView().setIconColor(getResources().getColor(C0966R.color.FG_2));
            }
            if (this.f118943y3 || this.f118944z3) {
                this.f118935q3.setCancelBtnVisible(0);
            }
        } else {
            this.f118935q3.setVisibility(8);
            if (this.f118940v3 == 130) {
                View view2 = this.f118937s3;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f118572w.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.f118572w.setLayoutParams(marginLayoutParams);
            } else {
                String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                if (!Util.isNullOrNil(stringExtra)) {
                    ((TextView) findViewById(C0966R.C0970id.a38)).setText(stringExtra);
                }
                findViewById(C0966R.C0970id.f357484a32).setOnClickListener(new C43913h());
            }
        }
        if (this.f118939u3) {
            View view4 = this.f118936r3;
            if (view4 != null) {
                view4.setBackgroundColor(view4.getContext().getResources().getColor(C0966R.color.f2947a4));
            }
            WebSearchView webSearchView = this.f118935q3;
            View view5 = webSearchView.f122191g;
            if (view5 != null) {
                view5.setBackgroundColor(webSearchView.getContext().getResources().getColor(C0966R.color.f2947a4));
            }
            if (this.f118935q3.getFtsEditText() != null) {
                this.f118935q3.getFtsEditText().setTextColor(this.f118935q3.getContext().getResources().getColor(C0966R.color.f3022ch));
                this.f118935q3.getFtsEditText().setHintColor(this.f118935q3.getContext().getResources().getColor(C0966R.color.f3231k4));
                this.f118935q3.getFtsEditText().getTagPanel().setBackgroundResource(C0966R.C0969drawable.cni);
            }
            if (this.f118935q3.getCancelBtn() != null) {
                this.f118935q3.getCancelBtn().setTextColor(this.f118935q3.getContext().getResources().getColor(C0966R.color.anh));
            }
        }
        showOptionMenu(false);
        C44125o1 o1Var = this.f118531h2;
        if (o1Var != null) {
            o1Var.mo68760e(true);
        }
        MMWebView mMWebView2 = this.f118523f;
        if (mMWebView2 != null) {
            mMWebView2.setOnLongClickListener(new C43914i(this));
        }
    }

    public void onDestroy() {
        try {
            if (this.f118511a1 != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("webview_id", hashCode());
                this.f118511a1.mo68149vj(1, bundle);
            }
        } catch (RemoteException unused) {
        }
        hideVKB();
        this.f118513b1.mo67693R0(this.f118934E3);
        this.f118513b1.mo67723h(this.f118934E3.f118977c);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: u8 */
    public void mo63388u8(int i, Bundle bundle) {
        if (i == 144) {
            return;
        }
        if (i != 147) {
            if (i != 154) {
                if (i != 100001) {
                    switch (i) {
                        case 60:
                        case 61:
                        case 62:
                            return;
                        default:
                            switch (i) {
                                case 119:
                                    String string = bundle.getString("fts_key_req_id");
                                    mo68549J9(new C43918m(bundle.getBundle("fts_key_data"), bundle.getString("fts_key_json_data"), bundle.getBoolean("fts_key_new_query", true), string));
                                    return;
                                case 120:
                                    this.f118501W1.post(new C43919n(bundle.getInt("fts_key_ret", 0), bundle.getString("fts_key_data")));
                                    return;
                                case 121:
                                    mo68549J9(new C43906a(bundle.getInt("fts_key_teach_request_type", 0), bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0)));
                                    return;
                                case 122:
                                    String string2 = bundle.getString("fts_key_new_query");
                                    String string3 = bundle.getString("fts_key_custom_query");
                                    boolean z = bundle.getBoolean("fts_key_need_keyboard", false);
                                    String string4 = bundle.getString("fts_key_tag_list");
                                    boolean z2 = bundle.getBoolean("fts_key_cache", false);
                                    Log.m105925i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b", string2, Boolean.valueOf(z));
                                    ArrayList arrayList = new ArrayList();
                                    try {
                                        if (!Util.isNullOrNil(string4)) {
                                            JSONArray jSONArray = new JSONArray(string4);
                                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                                C43920o oVar = new C43920o(this);
                                                oVar.f118974d = jSONObject.getString("tagName");
                                                oVar.f118975e = jSONObject.getInt("tagType");
                                                oVar.f118976f = jSONObject.getString("userName");
                                                arrayList.add(oVar);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                    if (this.f118935q3 != null) {
                                        if (arrayList.size() > 0) {
                                            this.f118935q3.getFtsEditText().mo70356l(string3, arrayList);
                                            if (z2) {
                                                mo68432S9(0, string3, (Map<String, Object>) null);
                                            }
                                        } else {
                                            this.f118935q3.getFtsEditText().mo70356l(string2, arrayList);
                                            if (z2) {
                                                mo68432S9(0, string2, (Map<String, Object>) null);
                                            }
                                        }
                                    }
                                    if (z) {
                                        this.f118501W1.post(new C43907b());
                                        return;
                                    }
                                    WebSearchView webSearchView = this.f118935q3;
                                    if (webSearchView != null) {
                                        webSearchView.getFtsEditText().mo70335c();
                                        mo68478X9();
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i) {
                                        case 124:
                                            this.f118501W1.post(new C43908c(bundle.getString("fts_key_json_data")));
                                            return;
                                        case 125:
                                            this.f118501W1.post(new C43909d(bundle.getString("fts_key_sns_id"), bundle.getInt("fts_key_status", 0)));
                                            return;
                                        case 126:
                                            bundle.getString("fts_key_json_data");
                                            bundle.getBoolean("fts_key_new_query", true);
                                            HashMap hashMap = new HashMap();
                                            for (String next : bundle.keySet()) {
                                                hashMap.put(next, bundle.get(next));
                                            }
                                            this.f118501W1.post(new C43917l(hashMap));
                                            return;
                                    }
                            }
                    }
                } else {
                    return;
                }
            } else if (bundle.getString("fts_key_data", "").equals("configNavBar")) {
                String string5 = bundle.getString("recommendSearchQuery", "");
                if (!Util.isNullOrNil(string5)) {
                    this.f118935q3.getFtsEditText().setRecommendSearchHint(string5);
                } else {
                    this.f118935q3.getFtsEditText().setRecommendSearchHint("");
                }
            }
            super.mo63388u8(i, bundle);
            return;
        }
        this.f118501W1.post(new C43910e(bundle.getInt("ret"), bundle.getLong("reqId"), bundle.getString("json", "")));
    }

    /* renamed from: y */
    public boolean mo3009y() {
        Log.m105924i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onSearchKeyDown");
        mo68493fa();
        return false;
    }
}
