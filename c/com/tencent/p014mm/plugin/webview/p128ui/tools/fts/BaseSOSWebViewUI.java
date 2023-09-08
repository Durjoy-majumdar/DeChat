package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FeatureActionReportStruct;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.websearch.widget.SOSEditTextView;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44125o1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.FTSBaseWebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import gy3.C87412m;
import j20.C117292a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t83.C13851h1;
import t83.C48576c0;
import t83.C48587i0;
import t83.C48590l;
import u73.C14136q0;
import u73.C22613h1;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI */
public class BaseSOSWebViewUI extends BaseSearchWebViewUI implements FTSEditTextView.C45051l {

    /* renamed from: A3 */
    public boolean f118800A3 = false;

    /* renamed from: B3 */
    public List<C43897z> f118801B3;

    /* renamed from: C3 */
    public int f118802C3 = 0;

    /* renamed from: D3 */
    public boolean f118803D3 = false;

    /* renamed from: E3 */
    public boolean f118804E3;

    /* renamed from: F3 */
    public boolean f118805F3 = false;

    /* renamed from: G3 */
    public boolean f118806G3;

    /* renamed from: H3 */
    public C43894y f118807H3 = new C43894y((C43883k) null);

    /* renamed from: q3 */
    public View f118808q3;

    /* renamed from: r3 */
    public View f118809r3;

    /* renamed from: s3 */
    public View f118810s3;

    /* renamed from: t3 */
    public View f118811t3;

    /* renamed from: u3 */
    public SOSEditTextView f118812u3;

    /* renamed from: v3 */
    public boolean f118813v3;

    /* renamed from: w3 */
    public boolean f118814w3;

    /* renamed from: x3 */
    public boolean f118815x3;

    /* renamed from: y3 */
    public boolean f118816y3;

    /* renamed from: z3 */
    public ImageView f118817z3;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$r */
    public class C6161r implements View.OnClickListener {
        public C6161r() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
            MMHandlerThread.postToMainThread(new C6165a(baseSOSWebViewUI, baseSOSWebViewUI.mo68551O9()));
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$v */
    public class C6162v implements View.OnTouchListener {
        public C6162v() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            BaseSOSWebViewUI.this.f118812u3.getEditText().clearFocus();
            BaseSOSWebViewUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$q */
    public class C24298q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f69758d;

        /* renamed from: e */
        public final /* synthetic */ String f69759e;

        /* renamed from: f */
        public final /* synthetic */ String f69760f;

        /* renamed from: g */
        public final /* synthetic */ int f69761g;

        /* renamed from: h */
        public final /* synthetic */ int f69762h;

        /* renamed from: i */
        public final /* synthetic */ int f69763i;

        /* renamed from: j */
        public final /* synthetic */ String f69764j;

        /* renamed from: n */
        public final /* synthetic */ long f69765n;

        /* renamed from: o */
        public final /* synthetic */ String f69766o;

        public C24298q(String str, String str2, String str3, int i, int i2, int i3, String str4, long j, String str5) {
            this.f69758d = str;
            this.f69759e = str2;
            this.f69760f = str3;
            this.f69761g = i;
            this.f69762h = i2;
            this.f69763i = i3;
            this.f69764j = str4;
            this.f69765n = j;
            this.f69766o = str5;
        }

        public void run() {
            FeatureActionReportStruct featureActionReportStruct = new FeatureActionReportStruct();
            featureActionReportStruct.f69469d = featureActionReportStruct.mo86045b("SessionId", this.f69758d, true);
            featureActionReportStruct.f69470e = featureActionReportStruct.mo86045b("SearchId", this.f69759e, true);
            featureActionReportStruct.f69471f = featureActionReportStruct.mo86045b("RequestId", this.f69760f, true);
            featureActionReportStruct.f69472g = (long) this.f69761g;
            featureActionReportStruct.f69473h = (long) this.f69762h;
            featureActionReportStruct.f69474i = (long) this.f69763i;
            featureActionReportStruct.f69475j = System.currentTimeMillis();
            featureActionReportStruct.f69476k = featureActionReportStruct.mo86045b("FeatureInfo", this.f69764j, true);
            featureActionReportStruct.f69479n = this.f69765n;
            featureActionReportStruct.f69480o = featureActionReportStruct.mo86045b("ParentSearchId", this.f69766o, true);
            featureActionReportStruct.mo86054n();
            C22613h1.m26490p(featureActionReportStruct);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$a */
    public class C43871a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C43897z f118818d;

        public C43871a(C43897z zVar) {
            this.f118818d = zVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d0, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.JsApiHandler", r0, "", new java.lang.Object[0]);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00c2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                t83.l r0 = r0.mo68521L9()
                if (r0 == 0) goto L_0x013b
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                r0.mo68445ma()
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$z r2 = r1.f118818d
                int r2 = r2.f118870d
                r0.f118883b3 = r2
                r0.mo68447oa()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r2 = "isBackButtonClick"
                java.lang.String r3 = "1"
                r0.put(r2, r3)
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                java.lang.String r3 = r3.mo68436da()
                java.lang.String r4 = "custom"
                r0.put(r4, r3)
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                t83.l r3 = r0.mo68521L9()
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                java.lang.String r5 = r0.mo68440ha()
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                java.lang.String r6 = r0.mo68436da()
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                org.json.JSONArray r7 = r0.mo68439ga()
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$z r0 = r1.f118818d
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f118871e
                boolean r8 = r3.f130003h
                java.lang.String r9 = "MicroMsg.JsApiHandler"
                if (r8 != 0) goto L_0x005a
                java.lang.String r0 = "onSearchInputConfirm fail, not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                goto L_0x011b
            L_0x005a:
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r10 = 0
                r8[r10] = r5
                r11 = 1
                r8[r11] = r6
                r12 = 2
                java.lang.String r13 = r7.toString()
                r8[r12] = r13
                java.lang.String r12 = "onSearchInputConfirm success, ready %s %s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r8)
                org.json.JSONObject r8 = new org.json.JSONObject
                r8.<init>()
                java.lang.String r12 = ""
                if (r0 == 0) goto L_0x00d9
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r13 = r0.iterator()
            L_0x0080:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x00d9
                java.lang.Object r0 = r13.next()
                r14 = r0
                java.util.Map$Entry r14 = (java.util.Map.Entry) r14
                java.lang.Object r0 = r14.getValue()
                if (r0 == 0) goto L_0x0080
                java.lang.Object r0 = r14.getKey()     // Catch:{ JSONException -> 0x00aa }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x00aa }
                org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00aa }
                java.lang.Object r16 = r14.getValue()     // Catch:{ JSONException -> 0x00aa }
                java.lang.String r11 = r16.toString()     // Catch:{ JSONException -> 0x00aa }
                r15.<init>(r11)     // Catch:{ JSONException -> 0x00aa }
                r8.put(r0, r15)     // Catch:{ JSONException -> 0x00aa }
                goto L_0x00d6
            L_0x00aa:
                r0 = move-exception
                java.lang.Object r11 = r14.getKey()     // Catch:{ JSONException -> 0x00c2 }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ JSONException -> 0x00c2 }
                org.json.JSONArray r15 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00c2 }
                java.lang.Object r16 = r14.getValue()     // Catch:{ JSONException -> 0x00c2 }
                java.lang.String r10 = r16.toString()     // Catch:{ JSONException -> 0x00c2 }
                r15.<init>(r10)     // Catch:{ JSONException -> 0x00c2 }
                r8.put(r11, r15)     // Catch:{ JSONException -> 0x00c2 }
                goto L_0x00d6
            L_0x00c2:
                java.lang.Object r10 = r14.getKey()     // Catch:{ JSONException -> 0x00d0 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x00d0 }
                java.lang.Object r11 = r14.getValue()     // Catch:{ JSONException -> 0x00d0 }
                r8.put(r10, r11)     // Catch:{ JSONException -> 0x00d0 }
                goto L_0x00d6
            L_0x00d0:
                r10 = 0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r12, r11)
            L_0x00d6:
                r10 = 0
                r11 = 1
                goto L_0x0080
            L_0x00d9:
                java.lang.String r0 = "query"
                r8.put(r0, r5)     // Catch:{ JSONException -> 0x0102 }
                r8.put(r4, r6)     // Catch:{ JSONException -> 0x0102 }
                java.lang.String r0 = "tagList"
                r8.put(r0, r7)     // Catch:{ JSONException -> 0x0102 }
                r4 = 1
                r8.put(r2, r4)     // Catch:{ JSONException -> 0x0102 }
                java.lang.String r0 = "sugId"
                r8.put(r0, r12)     // Catch:{ JSONException -> 0x0102 }
                java.lang.String r0 = "sugClickType"
                r2 = 0
                r8.put(r0, r2)     // Catch:{ JSONException -> 0x0102 }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ JSONException -> 0x0102 }
                if (r0 == 0) goto L_0x0109
                java.lang.String r0 = "fromRecommendSearchQuery"
                r2 = 1
                r8.put(r0, r2)     // Catch:{ JSONException -> 0x0102 }
                goto L_0x0109
            L_0x0102:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r12, r2)
            L_0x0109:
                boolean r0 = r3.f130011p
                java.lang.String r2 = r3.f130012q
                java.lang.String r4 = "onSearchInputConfirm"
                java.lang.String r0 = t83.C13851h1.C13852a.m13144d(r4, r8, r0, r2)
                t83.m0 r2 = new t83.m0
                r2.<init>(r3, r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            L_0x011b:
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                java.lang.String r0 = r0.mo68436da()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x013b
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                int r2 = r0.f118880Y2
                java.lang.String r3 = r0.f119059J2
                java.lang.String r4 = r0.f119060K2
                r5 = 1
                java.lang.String r6 = r0.mo68436da()
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.this
                int r7 = r0.f118882a3
                u73.C14136q0.m13476h(r2, r3, r4, r5, r6, r7)
            L_0x013b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSOSWebViewUI.C43871a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$b */
    public class C43872b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$b$a */
        public class C43873a implements Runnable {
            public C43873a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onClickCancelBtn js api run onSOSCancelButtonClick");
                C48590l L9 = BaseSOSWebViewUI.this.mo68521L9();
                int i = BaseSOSWebViewUI.this.f118880Y2;
                L9.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("isCancelButtonClick", 1);
                hashMap.put("isInputChange", 1);
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(i));
                L9.mo73236e0("onSearchInputChange", hashMap, (JSONObject) null);
                BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                baseSOSWebViewUI.f118805F3 = false;
                baseSOSWebViewUI.mo68446na();
            }
        }

        public C43872b() {
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68549J9(new C43873a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$c */
    public class C43874c implements Runnable {
        public C43874c() {
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73239h0(BaseSOSWebViewUI.this.mo68440ha(), BaseSOSWebViewUI.this.mo68436da(), BaseSOSWebViewUI.this.mo68439ga(), (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$d */
    public class C43875d implements Runnable {
        public C43875d() {
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73239h0(BaseSOSWebViewUI.this.mo68440ha(), BaseSOSWebViewUI.this.mo68436da(), BaseSOSWebViewUI.this.mo68439ga(), (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$e */
    public class C43876e implements Runnable {
        public C43876e() {
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                HashMap hashMap = new HashMap();
                if (BaseSOSWebViewUI.this.mo68437ea() != 0) {
                    hashMap.put("sugClickType", Integer.valueOf(BaseSOSWebViewUI.this.mo68437ea()));
                    hashMap.put("sugId", BaseSOSWebViewUI.this.mo68438fa());
                }
                C48590l L9 = BaseSOSWebViewUI.this.mo68521L9();
                String ha = BaseSOSWebViewUI.this.mo68440ha();
                String da = BaseSOSWebViewUI.this.mo68436da();
                JSONArray ga = BaseSOSWebViewUI.this.mo68439ga();
                L9.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(hashMap);
                hashMap2.put(SearchIntents.EXTRA_QUERY, ha);
                hashMap2.put("custom", da);
                hashMap2.put("tagList", ga);
                L9.mo73236e0("onSearchInputConfirm", hashMap2, (JSONObject) null);
                if (!TextUtils.isEmpty(BaseSOSWebViewUI.this.mo68436da())) {
                    BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                    C14136q0.m13476h(baseSOSWebViewUI.f118881Z2, baseSOSWebViewUI.f119059J2, baseSOSWebViewUI.f119060K2, true, baseSOSWebViewUI.mo68436da(), BaseSOSWebViewUI.this.f118883b3);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$f */
    public class C43877f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f118825d;

        public C43877f(Map map) {
            this.f118825d = map;
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73235d0(this.f118825d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$g */
    public class C43878g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f118827d;

        /* renamed from: e */
        public final /* synthetic */ String f118828e;

        /* renamed from: f */
        public final /* synthetic */ boolean f118829f;

        /* renamed from: g */
        public final /* synthetic */ String f118830g;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$g$a */
        public class C43879a implements Runnable {
            public C43879a() {
            }

            public void run() {
                if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                    Bundle bundle = C43878g.this.f118827d;
                    if (bundle == null || bundle.getInt("isRefresh") != 1 || C43878g.this.f118827d.getString("widgetId") == null) {
                        C48590l L9 = BaseSOSWebViewUI.this.mo68521L9();
                        C43878g gVar = C43878g.this;
                        L9.mo73228Y(gVar.f118828e, gVar.f118829f, gVar.f118830g);
                        return;
                    }
                    BaseSOSWebViewUI.this.mo68521L9().mo73234c0(C43878g.this.f118827d.getString("widgetId"), C43878g.this.f118828e);
                }
            }
        }

        public C43878g(Bundle bundle, String str, boolean z, String str2) {
            this.f118827d = bundle;
            this.f118828e = str;
            this.f118829f = z;
            this.f118830g = str2;
        }

        public void run() {
            Log.m105924i("MicroMsg.WebSearch.BaseSOSWebViewUI", "[handleFTSAction] onSearchDataReady");
            BaseSOSWebViewUI.this.mo68549J9(new C43879a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$h */
    public class C43880h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118833d;

        /* renamed from: e */
        public final /* synthetic */ String f118834e;

        public C43880h(String str, String str2) {
            this.f118833d = str;
            this.f118834e = str2;
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                C48590l L9 = BaseSOSWebViewUI.this.mo68521L9();
                String str = this.f118833d;
                String str2 = this.f118834e;
                if (!L9.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onChatSearchDataReady fail, not ready");
                    return;
                }
                Log.m105924i("MicroMsg.JsApiHandler", "onChatSearchDataReady success, ready");
                HashMap hashMap = new HashMap();
                hashMap.put("json", str);
                hashMap.put("requestId", str2);
                MMHandlerThread.postToMainThread(new C48587i0(L9, C13851h1.C13852a.m13143c("onChatSearchDataReady", hashMap, L9.f130011p, L9.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$i */
    public class C43881i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118836d;

        public C43881i(String str) {
            this.f118836d = str;
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                C48590l L9 = BaseSOSWebViewUI.this.mo68521L9();
                String str = this.f118836d;
                if (!L9.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, not ready");
                    return;
                }
                Log.m105924i("MicroMsg.JsApiHandler", "onSearchHistoryReady success, ready");
                try {
                    MMHandlerThread.postToMainThread(new C48576c0(L9, C13851h1.C13852a.m13144d("onSearchHistoryReady", new JSONObject(str), L9.f130011p, L9.f130012q)));
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiHandler", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$j */
    public class C43882j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118838d;

        /* renamed from: e */
        public final /* synthetic */ String f118839e;

        public C43882j(int i, String str) {
            this.f118838d = i;
            this.f118839e = str;
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73229Z(this.f118838d, this.f118839e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$k */
    public class C43883k implements View.OnClickListener {
        public C43883k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(BaseSOSWebViewUI.this.f118884c3)) {
                BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                baseSOSWebViewUI.f118894m3.put(SearchIntents.EXTRA_QUERY, baseSOSWebViewUI.f118884c3);
            } else {
                BaseSOSWebViewUI baseSOSWebViewUI2 = BaseSOSWebViewUI.this;
                baseSOSWebViewUI2.f118894m3.put(SearchIntents.EXTRA_QUERY, baseSOSWebViewUI2.mo68436da());
            }
            BaseSOSWebViewUI.this.f118894m3.put("exittype", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            BaseSOSWebViewUI.this.mo68444la();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$l */
    public class C43884l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118842d;

        /* renamed from: e */
        public final /* synthetic */ String f118843e;

        /* renamed from: f */
        public final /* synthetic */ int f118844f;

        public C43884l(int i, String str, int i2) {
            this.f118842d = i;
            this.f118843e = str;
            this.f118844f = i2;
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73240i0(this.f118842d, this.f118843e, this.f118844f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$m */
    public class C43885m implements Runnable {
        public C43885m() {
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73239h0(BaseSOSWebViewUI.this.mo68440ha(), BaseSOSWebViewUI.this.mo68436da(), BaseSOSWebViewUI.this.mo68439ga(), (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$n */
    public class C43886n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118847d;

        public C43886n(String str) {
            this.f118847d = str;
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73233b0(this.f118847d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$o */
    public class C43887o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f118849d;

        /* renamed from: e */
        public final /* synthetic */ int f118850e;

        public C43887o(String str, int i) {
            this.f118849d = str;
            this.f118850e = i;
        }

        public void run() {
            if (BaseSOSWebViewUI.this.mo68521L9() != null) {
                BaseSOSWebViewUI.this.mo68521L9().mo73223T(this.f118849d, this.f118850e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$p */
    public class C43888p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f118852d;

        /* renamed from: e */
        public final /* synthetic */ long f118853e;

        /* renamed from: f */
        public final /* synthetic */ String f118854f;

        public C43888p(int i, long j, String str) {
            this.f118852d = i;
            this.f118853e = j;
            this.f118854f = str;
        }

        public void run() {
            C48590l lVar = BaseSOSWebViewUI.this.f118508Z;
            if (lVar != null) {
                lVar.mo73241j0(this.f118852d, this.f118853e, this.f118854f);
                Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "wxaapp_opsearch resp, ret = %d, reqId = %d, json = %s", Integer.valueOf(this.f118852d), Long.valueOf(this.f118853e), this.f118854f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$s */
    public class C43889s implements SOSEditTextView.C43473b {
        public C43889s() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$t */
    public class C43890t implements Runnable {
        public C43890t() {
        }

        public void run() {
            BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
            int visibility = baseSOSWebViewUI.f118812u3.getSearchBarCancelTextContainer().getVisibility();
            View searchBarCancelTextContainer = BaseSOSWebViewUI.this.f118812u3.getSearchBarCancelTextContainer();
            searchBarCancelTextContainer.postDelayed(new C43959b(baseSOSWebViewUI, visibility, searchBarCancelTextContainer), 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$u */
    public class C43891u implements View.OnClickListener {
        public C43891u() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(BaseSOSWebViewUI.this.f118884c3)) {
                BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                baseSOSWebViewUI.f118894m3.put(SearchIntents.EXTRA_QUERY, baseSOSWebViewUI.f118884c3);
            } else {
                BaseSOSWebViewUI baseSOSWebViewUI2 = BaseSOSWebViewUI.this;
                baseSOSWebViewUI2.f118894m3.put(SearchIntents.EXTRA_QUERY, baseSOSWebViewUI2.mo68436da());
            }
            BaseSOSWebViewUI.this.f118894m3.put("exittype", "3");
            BaseSOSWebViewUI.this.mo68443ka();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$w */
    public class C43892w implements Runnable {
        public C43892w() {
        }

        public void run() {
            BaseSOSWebViewUI.this.f118812u3.mo70355k();
            BaseSOSWebViewUI.this.f118812u3.mo70361q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$x */
    public class C43893x implements FTSSearchView.C6996f {

        /* renamed from: d */
        public String f118860d;

        /* renamed from: e */
        public int f118861e;

        /* renamed from: f */
        public String f118862f;

        public C43893x(BaseSOSWebViewUI baseSOSWebViewUI) {
        }

        /* renamed from: SE */
        public String mo8025SE() {
            return this.f118860d;
        }

        public int compareTo(Object obj) {
            if (obj == null || !(obj instanceof FTSBaseWebViewUI.C43920o)) {
                return -1;
            }
            return this.f118860d.compareTo(((FTSBaseWebViewUI.C43920o) obj).f118974d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$y */
    public class C43894y extends C43505b0 {

        /* renamed from: c */
        public C43895a f118863c = new C43895a((C43883k) null);

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$y$a */
        public class C43895a extends C43519u {
            public C43895a(C43883k kVar) {
            }

            /* renamed from: c */
            public void mo64753c(WebView webView, String str) {
                Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "scene %d, onPageFinished %s", Integer.valueOf(BaseSOSWebViewUI.this.f118880Y2), str);
                BaseSOSWebViewUI.this.showOptionMenu(false);
                BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                if (baseSOSWebViewUI.f118812u3 != null && !baseSOSWebViewUI.f118873R2) {
                    baseSOSWebViewUI.getClass();
                    BaseSOSWebViewUI.this.f118812u3.mo70335c();
                    BaseSOSWebViewUI.this.hideVKB();
                }
                BaseSOSWebViewUI baseSOSWebViewUI2 = BaseSOSWebViewUI.this;
                boolean z = baseSOSWebViewUI2.f119058I2;
                if (!z) {
                    C14136q0.m13472d(baseSOSWebViewUI2.f118880Y2, baseSOSWebViewUI2.f119059J2, baseSOSWebViewUI2.f119060K2, true, baseSOSWebViewUI2.f118884c3, baseSOSWebViewUI2.f118882a3, "", z, baseSOSWebViewUI2.f118886e3);
                }
            }

            /* renamed from: d */
            public void mo62156d(WebView webView, String str) {
                Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "scene %d,onPageStarted %s", Integer.valueOf(BaseSOSWebViewUI.this.f118880Y2), str);
                BaseSOSWebViewUI.this.showOptionMenu(false);
                BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                if (baseSOSWebViewUI.f118812u3 != null && !baseSOSWebViewUI.f118873R2) {
                    baseSOSWebViewUI.getClass();
                    BaseSOSWebViewUI.this.f118812u3.mo70335c();
                    BaseSOSWebViewUI.this.hideVKB();
                }
                BaseSOSWebViewUI baseSOSWebViewUI2 = BaseSOSWebViewUI.this;
                boolean z = baseSOSWebViewUI2.f119058I2;
                if (!z) {
                    C14136q0.m13473e(baseSOSWebViewUI2.f118880Y2, baseSOSWebViewUI2.f119059J2, baseSOSWebViewUI2.f119060K2, true, baseSOSWebViewUI2.f118884c3, baseSOSWebViewUI2.f118882a3, "", z, baseSOSWebViewUI2.f118886e3);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$y$b */
        public class C43896b extends C43558z {
            public C43896b(C43883k kVar) {
            }

            /* renamed from: j */
            public void mo63706j() {
                BaseSOSWebViewUI baseSOSWebViewUI = BaseSOSWebViewUI.this;
                baseSOSWebViewUI.f118806G3 = true;
                baseSOSWebViewUI.mo68448pa();
            }
        }

        public C43894y(C43883k kVar) {
        }

        /* renamed from: b */
        public C43519u mo67776b() {
            return this.f118863c;
        }

        /* renamed from: d */
        public C43558z mo63687d() {
            return new C43896b((C43883k) null);
        }

        /* renamed from: f */
        public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
            InputStream inputStream;
            if (webResourceRequest == null || webResourceRequest.getUrl() == null || !webResourceRequest.getUrl().toString().startsWith("weixin://fts")) {
                return null;
            }
            String uri = webResourceRequest.getUrl().toString();
            Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "url=%s | thread=%d", uri, Long.valueOf(Thread.currentThread().getId()));
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

        /* renamed from: o */
        public boolean mo67784o(String str) {
            if (BaseSOSWebViewUI.this.f119058I2) {
                return true;
            }
            C87412m.m108594g(str, "url");
            return false;
        }

        /* renamed from: p */
        public boolean mo67785p(String str, Intent intent) {
            BaseSOSWebViewUI.this.mo68449qa();
            C87412m.m108594g(str, "url");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI$z */
    public class C43897z {

        /* renamed from: a */
        public String f118867a = "";

        /* renamed from: b */
        public String f118868b = "";

        /* renamed from: c */
        public List<FTSSearchView.C6996f> f118869c;

        /* renamed from: d */
        public int f118870d;

        /* renamed from: e */
        public Map<String, Object> f118871e = new HashMap();

        public C43897z(BaseSOSWebViewUI baseSOSWebViewUI) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C43897z)) {
                return false;
            }
            C43897z zVar = (C43897z) obj;
            return zVar.f118870d == this.f118870d && zVar.f118868b.equals(this.f118868b);
        }
    }

    /* renamed from: ba */
    public static void m48042ba(String str, String str2, String str3, int i, int i2, int i3, String str4, long j, String str5) {
        ((C119157j) C119157j.f356862d).mo183875f(new C24298q(str, str2, str3, i, i2, i3, str4, j, str5));
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z && !Util.isNullOrNil(mo68440ha())) {
            Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "needSosEditTextToBeTouchOnly = %s.", Boolean.valueOf(this.f118803D3));
            if (!this.f118803D3) {
                this.f118501W1.post(new C43875d());
            }
        }
    }

    /* renamed from: E8 */
    public boolean mo68232E8() {
        return true;
    }

    /* renamed from: K3 */
    public void mo68431K3() {
        this.f118812u3.mo70335c();
        hideVKB();
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        C43522y M7 = super.mo63701M7();
        M7.mo67679J(this.f118807H3);
        return M7;
    }

    /* renamed from: N8 */
    public void mo68246N8() {
        mo68443ka();
    }

    /* renamed from: Q8 */
    public boolean mo68254Q8() {
        return false;
    }

    /* renamed from: S9 */
    public void mo68432S9(int i, String str, Map<String, Object> map) {
        boolean z = false;
        boolean z2 = true;
        Log.m105927v("MicroMsg.WebSearch.BaseSOSWebViewUI", "adding history cgi params type %d, inEditQuery %s, params %s", Integer.valueOf(i), str, map);
        int i2 = this.f118883b3;
        this.f118883b3 = i;
        if (i2 != i) {
            mo68447oa();
        }
        if (this.f118801B3 == null) {
            this.f118801B3 = new ArrayList();
        }
        if (mo68440ha().length() > 0) {
            C43897z zVar = new C43897z(this);
            zVar.f118870d = this.f118883b3;
            zVar.f118869c = new ArrayList(this.f118812u3.getTagList());
            zVar.f118868b = this.f118812u3.getInEditTextQuery();
            zVar.f118867a = this.f118812u3.getTotalQuery();
            if (this.f118801B3.size() == 0) {
                this.f118801B3.add(zVar);
            } else if (!zVar.equals(this.f118801B3.get(0))) {
                this.f118801B3.add(0, zVar);
            }
            mo68441ia(this.f118801B3);
        }
        List<C43897z> list = this.f118801B3;
        if (list != null && !list.isEmpty()) {
            C43897z zVar2 = this.f118801B3.get(0);
            C43897z zVar3 = new C43897z(this);
            zVar3.f118870d = i;
            zVar3.f118867a = str;
            zVar3.f118871e = map;
            if (zVar2 != null) {
                if (zVar2 != zVar3) {
                    if (i == zVar2.f118870d && str.trim().equals(zVar2.f118867a.trim())) {
                        z = true;
                    }
                    z2 = z;
                }
                if (z2) {
                    zVar2.f118871e = map;
                }
            }
        }
    }

    /* renamed from: T7 */
    public boolean mo68257T7() {
        return false;
    }

    /* renamed from: Y9 */
    public boolean mo68433Y9() {
        return false;
    }

    /* renamed from: aa */
    public boolean mo68434aa() {
        return true;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onEditTextChange %s %s %s %s", str, str2, mVar, Boolean.valueOf(this.f118803D3));
        if (mVar == FTSEditTextView.C45052m.UserInput || mVar == FTSEditTextView.C45052m.ClearText) {
            this.f118501W1.post(new C43874c());
        } else if (mVar == FTSEditTextView.C45052m.SetText && this.f118812u3.mo70354j()) {
            this.f118812u3.mo70359o();
        }
    }

    /* renamed from: ca */
    public String mo68435ca() {
        return null;
    }

    /* renamed from: da */
    public String mo68436da() {
        return this.f118812u3.getInEditTextQuery();
    }

    /* renamed from: ea */
    public int mo68437ea() {
        return 0;
    }

    /* renamed from: fa */
    public String mo68438fa() {
        return "";
    }

    /* renamed from: ga */
    public JSONArray mo68439ga() {
        List<FTSSearchView.C6996f> tagList = this.f118812u3.getTagList();
        JSONArray jSONArray = new JSONArray();
        Iterator<FTSSearchView.C6996f> it = tagList.iterator();
        while (it.hasNext()) {
            C43893x xVar = (C43893x) it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tagName", xVar.f118860d);
                jSONObject.put("tagType", xVar.f118861e);
                jSONObject.put("userName", xVar.f118862f);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: ha */
    public String mo68440ha() {
        SOSEditTextView sOSEditTextView = this.f118812u3;
        return sOSEditTextView != null ? sOSEditTextView.getTotalQuery() : "";
    }

    /* renamed from: ia */
    public void mo68441ia(List<C43897z> list) {
    }

    /* renamed from: ja */
    public boolean mo68442ja() {
        Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "isBackToHistory isHomePage = %s", Boolean.valueOf(this.f118816y3));
        List<C43897z> list = this.f118801B3;
        return list != null && list.size() > 1;
    }

    /* renamed from: ka */
    public void mo68443ka() {
        hideVKB();
        mo68477V9();
        if (mo68442ja()) {
            ((ArrayList) this.f118801B3).remove(0);
            C43897z zVar = (C43897z) ((ArrayList) this.f118801B3).get(0);
            this.f118812u3.mo70356l(zVar.f118868b, zVar.f118869c);
            this.f118501W1.post(new C43871a(zVar));
        } else if (this.f118804E3) {
            if (!Util.isNullOrNil(this.f118884c3)) {
                this.f118894m3.put(SearchIntents.EXTRA_QUERY, this.f118884c3);
            } else {
                this.f118894m3.put(SearchIntents.EXTRA_QUERY, mo68436da());
            }
            this.f118894m3.put("exittype", "3");
            mo68444la();
        } else {
            finish();
        }
    }

    /* renamed from: la */
    public void mo68444la() {
        if (!this.f118813v3) {
            this.f118812u3.mo70356l("", (List<FTSSearchView.C6996f>) null);
        }
        hideVKB();
        this.f118805F3 = true;
        this.f118501W1.post(new C43872b());
        this.f118801B3 = null;
        this.f118804E3 = false;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
        if (!this.f118812u3.mo70354j()) {
            this.f118812u3.mo70355k();
            showVKB();
        }
    }

    /* renamed from: ma */
    public void mo68445ma() {
    }

    /* renamed from: na */
    public void mo68446na() {
    }

    /* renamed from: oa */
    public void mo68447oa() {
    }

    public void onBackPressed() {
        if (!Util.isNullOrNil(this.f118884c3)) {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, this.f118884c3);
        } else {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, mo68436da());
        }
        this.f118894m3.put("exittype", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        mo68443ka();
    }

    public void onClickClearTextBtn(View view) {
        SOSEditTextView sOSEditTextView = this.f118812u3;
        if (sOSEditTextView != null) {
            if (!sOSEditTextView.mo70354j()) {
                this.f118812u3.mo70355k();
                showVKB();
            }
            this.f118812u3.setHint(mo68435ca());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f118813v3 = getIntent().getBooleanExtra("ftsInitToSearch", false);
        this.f118814w3 = getIntent().getBooleanExtra("ftsNeedShowCamera", true);
        this.f118815x3 = getIntent().getBooleanExtra("need_show_query_first", false);
        this.f118816y3 = "1".equals(mo68551O9().get("isHomePage"));
        this.f118803D3 = getIntent().getBooleanExtra("fts_need_sos_edittext_tobe_touch_only", false);
        getSupportActionBar().mo91104o();
        this.f118809r3 = findViewById(C0966R.C0970id.lwo);
        this.f118810s3 = findViewById(C0966R.C0970id.lwn);
        this.f118811t3 = findViewById(C0966R.C0970id.j4u);
        this.f118808q3 = findViewById(C0966R.C0970id.f359138j62);
        SOSEditTextView sOSEditTextView = (SOSEditTextView) findViewById(C0966R.C0970id.jy7);
        this.f118812u3 = sOSEditTextView;
        sOSEditTextView.setFtsEditTextListener(this);
        this.f118812u3.setHint(mo68435ca());
        this.f118812u3.setCancelTextViewClickListener(new C43883k());
        if (this.f118812u3.getEditText() != null) {
            this.f118812u3.getEditText().setText(this.f118884c3);
        }
        this.f118817z3 = (ImageView) findViewById(C0966R.C0970id.f357484a32);
        if (this.f118803D3) {
            View view = this.f118811t3;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f118812u3.setFocusable(false);
            this.f118812u3.mo70335c();
            View view2 = this.f118810s3;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f118809r3;
            if (view3 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f118809r3.setOnClickListener(new C6161r());
                this.f118812u3.setCancelTextViewCallback(new C43889s());
            }
            this.f118812u3.setForceDisable(true);
            this.f118812u3.mo70337e();
            View view5 = this.f118808q3;
            if (view5 != null) {
                view5.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.b4x));
            }
            if (this.f118812u3.getSearchBarCancelTextContainer() != null) {
                this.f118812u3.getSearchBarCancelTextContainer().postDelayed(new C43890t(), 200);
            }
            Log.m105924i("MicroMsg.WebSearch.BaseSOSWebViewUI", "searchInputLayout = " + this.f118808q3 + ", searchSosEditTextMask = " + this.f118809r3);
        } else {
            View view6 = this.f118809r3;
            if (view6 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f118817z3.setOnClickListener(new C43891u());
        this.f118523f.setOnTouchListener(new C6162v());
        if (this.f118873R2) {
            getContentView().postDelayed(new C43892w(), 128);
        }
        Log.m105924i("MicroMsg.WebSearch.BaseSOSWebViewUI", "oncreate isNeedShowCamera = " + this.f118814w3);
        if (!this.f118814w3) {
            this.f118812u3.setNeedForceHideCameraIcon(true);
            this.f118812u3.setCommonRightImageButtonVisibile(8);
        }
        C44125o1 o1Var = this.f118531h2;
        if (o1Var != null) {
            o1Var.mo68760e(true);
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
        this.f118513b1.mo67693R0(this.f118807H3);
        this.f118513b1.mo67723h(this.f118807H3.f118863c);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: pa */
    public void mo68448pa() {
        Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onWebViewPageLoaded %b", Boolean.valueOf(this.f119058I2));
    }

    /* renamed from: qa */
    public void mo68449qa() {
        Log.m105924i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onWebViewPageStartLoad");
    }

    /* renamed from: u8 */
    public void mo63388u8(int i, Bundle bundle) {
        if (i == 138) {
            String string = bundle.getString("fts_key_data");
            if (Util.isNullOrNil(string)) {
                this.f118802C3 = 0;
            } else if (FirebaseAnalytics.C113379b.INDEX.equals(string)) {
                this.f118802C3 = 1;
            } else if ("result".equals(string)) {
                this.f118802C3 = 2;
            } else if ("suggestion".equals(string)) {
                this.f118802C3 = 3;
            } else if ("teach".equals(string)) {
                this.f118802C3 = 4;
            } else if (ImagesContract.LOCAL.equals(string)) {
                this.f118802C3 = 5;
            } else if ("history".equals(string)) {
                this.f118802C3 = 6;
            } else {
                this.f118802C3 = 0;
            }
            this.f118888g3 = this.f118802C3;
        } else if (i == 147) {
            this.f118501W1.post(new C43888p(bundle.getInt("ret"), bundle.getLong("reqId"), bundle.getString("json", "")));
        } else if (i == 100001) {
        } else {
            if (i == 143) {
                this.f118501W1.post(new C43881i(bundle.getString("data")));
            } else if (i != 144) {
                switch (i) {
                    case 60:
                        if (!mo68434aa()) {
                            Log.m105928w("MicroMsg.WebSearch.BaseSOSWebViewUI", "current state is not search");
                            return;
                        }
                        return;
                    case 61:
                    case 62:
                        return;
                    default:
                        switch (i) {
                            case 119:
                                String string2 = bundle.getString("fts_key_req_id");
                                String string3 = bundle.getString("fts_key_json_data");
                                boolean z = bundle.getBoolean("fts_key_new_query", true);
                                this.f118501W1.post(new C43878g(bundle.getBundle("fts_key_data"), string3, z, string2));
                                return;
                            case 120:
                                this.f118501W1.post(new C43882j(bundle.getInt("fts_key_ret", 0), bundle.getString("fts_key_data")));
                                return;
                            case 121:
                                mo68549J9(new C43884l(bundle.getInt("fts_key_teach_request_type", 0), bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0)));
                                return;
                            case 122:
                                String string4 = bundle.getString("fts_key_new_query");
                                String string5 = bundle.getString("fts_key_custom_query");
                                boolean z2 = bundle.getBoolean("fts_key_need_keyboard", false);
                                String string6 = bundle.getString("fts_key_tag_list");
                                Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b, needSosEditTextToBeTouchOnly %b", string4, Boolean.valueOf(z2), Boolean.valueOf(this.f118803D3));
                                ArrayList arrayList = new ArrayList();
                                try {
                                    if (!Util.isNullOrNil(string6)) {
                                        JSONArray jSONArray = new JSONArray(string6);
                                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                            C43893x xVar = new C43893x(this);
                                            xVar.f118860d = jSONObject.getString("tagName");
                                            xVar.f118861e = jSONObject.getInt("tagType");
                                            xVar.f118862f = jSONObject.getString("userName");
                                            arrayList.add(xVar);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                if (this.f118812u3 != null) {
                                    if (arrayList.size() > 0) {
                                        this.f118812u3.mo70356l(string5, arrayList);
                                    } else {
                                        this.f118812u3.mo70356l(string4, arrayList);
                                    }
                                }
                                if (z2) {
                                    this.f118501W1.post(new C43885m());
                                    return;
                                }
                                SOSEditTextView sOSEditTextView = this.f118812u3;
                                if (sOSEditTextView != null) {
                                    sOSEditTextView.mo70335c();
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 124:
                                        this.f118501W1.post(new C43886n(bundle.getString("fts_key_json_data")));
                                        return;
                                    case 125:
                                        this.f118501W1.post(new C43887o(bundle.getString("fts_key_sns_id"), bundle.getInt("fts_key_status", 0)));
                                        return;
                                    case 126:
                                        bundle.getString("fts_key_json_data");
                                        bundle.getBoolean("fts_key_new_query", true);
                                        HashMap hashMap = new HashMap();
                                        for (String next : bundle.keySet()) {
                                            hashMap.put(next, bundle.get(next));
                                        }
                                        this.f118501W1.post(new C43877f(hashMap));
                                        return;
                                    case 127:
                                        mo68549J9(new C43880h(bundle.getString("fts_key_json_data"), bundle.getString("fts_key_req_id")));
                                        return;
                                    default:
                                        super.mo63388u8(i, bundle);
                                        return;
                                }
                        }
                }
            }
        }
    }

    /* renamed from: y */
    public boolean mo3009y() {
        this.f118812u3.mo70335c();
        hideVKB();
        if (mo68440ha().length() > 0) {
            this.f118501W1.post(new C43876e());
            hideVKB();
            this.f118804E3 = true;
        }
        return true;
    }
}
