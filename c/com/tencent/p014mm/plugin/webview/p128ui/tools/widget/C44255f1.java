package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43512f;
import com.tencent.p014mm.plugin.webview.stub.C43783b;
import com.tencent.p014mm.plugin.webview.webcompt.C44463z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45298c;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import qo3.C77407n;
import rx3.C13598b0;
import t83.C13841a;
import t83.C48590l;
import te3.C48869bk2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.f1 */
public class C44255f1 extends C43783b {

    /* renamed from: e */
    public final WeakReference<BaseWebViewController> f119919e;

    /* renamed from: f */
    public WeakReference<Context> f119920f;

    /* renamed from: g */
    public WeakReference<C43512f> f119921g;

    /* renamed from: h */
    public Bundle f119922h;

    /* renamed from: i */
    public Bundle f119923i;

    /* renamed from: j */
    public boolean f119924j;

    /* renamed from: n */
    public int f119925n = MMApplicationContext.getContext().getResources().getColor(C0966R.color.akq);

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.f1$a */
    public static final class C44256a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44255f1 f119926d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119927e;

        /* renamed from: f */
        public final /* synthetic */ C48590l f119928f;

        public C44256a(C44255f1 f1Var, Bundle bundle, C48590l lVar) {
            this.f119926d = f1Var;
            this.f119927e = bundle;
            this.f119928f = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ Exception -> 0x0047 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.lang.String r0 = "MicroMsg.PreloadWebViewStubCallback"
                com.tencent.mm.plugin.webview.ui.tools.widget.f1 r1 = r6.f119926d     // Catch:{ Exception -> 0x0047 }
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.BaseWebViewController> r1 = r1.f119919e     // Catch:{ Exception -> 0x0047 }
                java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0047 }
                com.tencent.mm.plugin.webview.core.BaseWebViewController r1 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r1     // Catch:{ Exception -> 0x0047 }
                if (r1 == 0) goto L_0x0011
                d93.h r1 = r1.f117539M     // Catch:{ Exception -> 0x0047 }
                goto L_0x0012
            L_0x0011:
                r1 = 0
            L_0x0012:
                android.os.Bundle r2 = r6.f119927e     // Catch:{ Exception -> 0x0047 }
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0022
                java.lang.String r5 = "jsapi_preverify_fun_list"
                boolean r2 = r2.containsKey(r5)     // Catch:{ Exception -> 0x0047 }
                if (r2 != r3) goto L_0x0022
                r2 = 1
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                if (r2 == 0) goto L_0x002e
                if (r1 != 0) goto L_0x0028
                goto L_0x002e
            L_0x0028:
                android.os.Bundle r2 = r6.f119927e     // Catch:{ Exception -> 0x0047 }
                r1.mo70866i(r2)     // Catch:{ Exception -> 0x0047 }
                goto L_0x003f
            L_0x002e:
                java.lang.String r2 = "has JSAPI_CONTROL_BYTES wvPerm %b"
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0047 }
                if (r1 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r3 = 0
            L_0x0036:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0047 }
                r5[r4] = r1     // Catch:{ Exception -> 0x0047 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r5)     // Catch:{ Exception -> 0x0047 }
            L_0x003f:
                t83.l r1 = r6.f119928f     // Catch:{ Exception -> 0x0047 }
                if (r1 == 0) goto L_0x005c
                r1.mo8700d()     // Catch:{ Exception -> 0x0047 }
                goto L_0x005c
            L_0x0047:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "stubCallback.callback(AC_ON_UPDATE_JSAPI_CONTROL_BYTES), exception:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1.C44256a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.f1$b */
    public static final class C44257b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C48590l f119929d;

        /* renamed from: e */
        public final /* synthetic */ String f119930e;

        /* renamed from: f */
        public final /* synthetic */ String f119931f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119932g;

        /* renamed from: h */
        public final /* synthetic */ boolean f119933h;

        public C44257b(C48590l lVar, String str, String str2, Bundle bundle, boolean z) {
            this.f119929d = lVar;
            this.f119930e = str;
            this.f119931f = str2;
            this.f119932g = bundle;
            this.f119933h = z;
        }

        public final void run() {
            try {
                C48590l lVar = this.f119929d;
                if (lVar != null) {
                    lVar.mo8702g(this.f119930e, this.f119931f, C13841a.m13131a(this.f119932g), this.f119933h);
                }
            } catch (Throwable unused) {
                Log.m105920e("MicroMsg.PreloadWebViewStubCallback", "In jsapi onHandleEnd method, it happens something unwanted!");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.f1$c */
    public static final class C44258c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C44255f1 f119934d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f119935e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44258c(C44255f1 f1Var, C8478d0 d0Var) {
            super(0);
            this.f119934d = f1Var;
            this.f119935e = d0Var;
        }

        public Object invoke() {
            C43512f fVar;
            WeakReference<C43512f> weakReference = this.f119934d.f119921g;
            if (!(weakReference == null || (fVar = weakReference.get()) == null)) {
                fVar.mo67803p(this.f119935e.f27483d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.f1$d */
    public static final class C44259d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f119936d;

        /* renamed from: e */
        public final /* synthetic */ C44255f1 f119937e;

        /* renamed from: f */
        public final /* synthetic */ int f119938f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119939g;

        public C44259d(Activity activity, C44255f1 f1Var, int i, Bundle bundle) {
            this.f119936d = activity;
            this.f119937e = f1Var;
            this.f119938f = i;
            this.f119939g = bundle;
        }

        public final void run() {
            BaseWebViewController baseWebViewController;
            WeakReference<C43512f> weakReference;
            C43512f fVar;
            C44272i w;
            if (!this.f119936d.isFinishing() && (baseWebViewController = this.f119937e.f119919e.get()) != null) {
                HashSet hashSet = new HashSet();
                int i = this.f119938f;
                if (i == 3003 || i == 3004) {
                    hashSet.add("menuItem:share:appMessage");
                    hashSet.add("menuItem:share:timeline");
                    hashSet.add("menuItem:copyUrl");
                } else {
                    Bundle bundle = this.f119939g;
                    if (bundle != null) {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("menu_item_list");
                        if (stringArrayList == null || stringArrayList.size() == 0) {
                            Log.m105928w("MicroMsg.PreloadWebViewStubCallback", "setMenuItemsVisible menuItems is null or nil.");
                            return;
                        } else {
                            hashSet.addAll(stringArrayList);
                            hashSet.remove("menuItem:exposeArticle");
                        }
                    } else {
                        return;
                    }
                }
                String url = baseWebViewController.f117553a.getUrl();
                if (url != null && (weakReference = this.f119937e.f119921g) != null && (fVar = weakReference.get()) != null && (w = fVar.mo67804w()) != null) {
                    HashMap<String, SparseBooleanArray> hashMap = w.f119964g;
                    SparseBooleanArray sparseBooleanArray = hashMap.get(url);
                    boolean z = false;
                    switch (this.f119938f) {
                        case 3001:
                        case 3003:
                            if (sparseBooleanArray == null) {
                                sparseBooleanArray = new SparseBooleanArray();
                                hashMap.put(url, sparseBooleanArray);
                                if (w.f119964g.get(url) == null) {
                                    w.f119964g.put(url, new SparseBooleanArray());
                                }
                            }
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                Integer num = w.f119965h.get((String) it.next());
                                if (num == null) {
                                    num = -1;
                                }
                                C87412m.m108593f(num, "menuHelper.menuItemIdMap[item] ?: -1");
                                int intValue = num.intValue();
                                if (intValue > 0) {
                                    sparseBooleanArray.put(intValue, true);
                                }
                            }
                            C77407n nVar = w.f119958a;
                            if (nVar != null && nVar.mo107563h()) {
                                z = true;
                            }
                            if (z) {
                                w.mo68978h();
                                return;
                            }
                            return;
                        case 3002:
                        case 3004:
                            if (sparseBooleanArray != null) {
                                Iterator it4 = hashSet.iterator();
                                while (it4.hasNext()) {
                                    Integer num2 = w.f119965h.get((String) it4.next());
                                    if (num2 == null) {
                                        num2 = -1;
                                    }
                                    C87412m.m108593f(num2, "menuHelper.menuItemIdMap[item] ?: -1");
                                    int intValue2 = num2.intValue();
                                    if (intValue2 > 0) {
                                        sparseBooleanArray.delete(intValue2);
                                    }
                                }
                                C77407n nVar2 = w.f119958a;
                                if (nVar2 != null && nVar2.mo107563h()) {
                                    z = true;
                                }
                                if (z) {
                                    w.mo68978h();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    public C44255f1(WeakReference<BaseWebViewController> weakReference) {
        C87412m.m108594g(weakReference, "controller");
        this.f119919e = weakReference;
    }

    /* renamed from: B7 */
    public void mo7025B7(String str) {
        C8478d0 d0Var = new C8478d0();
        int i = 0;
        try {
            i = Util.getInt(str, 0);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.PreloadWebViewStubCallback", "setFontSizeCb, ex = " + e.getMessage());
        }
        d0Var.f27483d = i;
        C61926c.m72668M(new C44258c(this, d0Var));
    }

    /* renamed from: F7 */
    public int mo7027F7() {
        C45298c U;
        BaseWebViewController baseWebViewController = this.f119919e.get();
        if (baseWebViewController == null || (U = baseWebViewController.mo67698U()) == null) {
            return 0;
        }
        return U.f122685b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = r2.mo63683n0();
     */
    /* renamed from: Ni */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo7029Ni() {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.PreloadWebViewStubCallback"
            java.lang.String r2 = "getCurrentUrl"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.BaseWebViewController> r2 = r5.f119919e     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x001c }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r2 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r2     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x001b
            java.lang.String r1 = r2.mo63683n0()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            return r0
        L_0x001c:
            r2 = move-exception
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "getCommitUrl exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1.mo7029Ni():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: d93.h} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r9 = r9.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.PreloadWebViewStubCallback", "Failed to parse color: %s", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01aa, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.PreloadWebViewStubCallback", "In invokeAsResult method, it happens something unwanted!");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:20:0x0049, B:67:0x0147] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle mo7031V5(int r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invokeAsResult actionCode="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.PreloadWebViewStubCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2 = 38
            r3 = 1
            r4 = 0
            r5 = 0
            if (r8 == r2) goto L_0x018b
            r2 = 43
            if (r8 == r2) goto L_0x0179
            r2 = 53
            if (r8 == r2) goto L_0x0167
            r2 = 72
            if (r8 == r2) goto L_0x013c
            r2 = 88
            if (r8 == r2) goto L_0x012b
            r2 = 99
            if (r8 == r2) goto L_0x0113
            r2 = 101(0x65, float:1.42E-43)
            if (r8 == r2) goto L_0x00d5
            r9 = 207(0xcf, float:2.9E-43)
            if (r8 == r9) goto L_0x00b5
            r9 = 302(0x12e, float:4.23E-43)
            if (r8 == r9) goto L_0x0095
            r9 = 90001(0x15f91, float:1.26118E-40)
            if (r8 == r9) goto L_0x0049
            goto L_0x01af
        L_0x0049:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.BaseWebViewController> r8 = r7.f119919e     // Catch:{ all -> 0x01aa }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r8 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r8     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            java.lang.String r9 = r8.getCurrentUrl()     // Catch:{ all -> 0x01aa }
            com.tencent.xweb.CookieManager r2 = com.tencent.xweb.CookieManager.getInstance()     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = r2.getCookie(r9)     // Catch:{ all -> 0x01aa }
            java.lang.String r4 = "url = %s, cookie = %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x01aa }
            r6[r5] = r9     // Catch:{ all -> 0x01aa }
            r6[r3] = r2     // Catch:{ all -> 0x01aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r6)     // Catch:{ all -> 0x01aa }
            java.lang.String r9 = "cookie"
            r0.putString(r9, r2)     // Catch:{ all -> 0x01aa }
            com.tencent.mm.ui.widget.MMWebView r8 = r8.f117553a     // Catch:{ all -> 0x01aa }
            float r8 = r8.getMMDensity()     // Catch:{ all -> 0x01aa }
            java.lang.String r9 = "density"
            r0.putFloat(r9, r8)     // Catch:{ all -> 0x01aa }
            java.lang.String r8 = "topOffset"
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.f> r9 = r7.f119921g     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.f r9 = (com.tencent.p014mm.plugin.webview.core.C43512f) r9     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x008f
            int r9 = r9.mo67802j()     // Catch:{ all -> 0x01aa }
            goto L_0x0090
        L_0x008f:
            r9 = -1
        L_0x0090:
            r0.putInt(r8, r9)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x0095:
            java.lang.ref.WeakReference<android.content.Context> r8 = r7.f119920f     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x00a0
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x01aa }
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            boolean r9 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x00a8
            r4 = r8
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x01aa }
        L_0x00a8:
            if (r4 == 0) goto L_0x01af
            java.lang.String r8 = "delegate"
            com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r9 = com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.m893a(r4)     // Catch:{ all -> 0x01aa }
            r0.putParcelable(r8, r9)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x00b5:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.BaseWebViewController> r8 = r7.f119919e     // Catch:{ all -> 0x01aa }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r8 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r8     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x00c1
            d93.h r4 = r8.f117539M     // Catch:{ all -> 0x01aa }
        L_0x00c1:
            if (r4 == 0) goto L_0x00cd
            com.tencent.mm.protocal.GeneralControlWrapper r8 = r4.mo70859b()     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x00cd
            boolean r5 = r8.mo69431c()     // Catch:{ all -> 0x01aa }
        L_0x00cd:
            java.lang.String r8 = "webview_allow_msg_tail"
            r0.putBoolean(r8, r5)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x00d5:
            java.lang.ref.WeakReference<android.content.Context> r8 = r7.f119920f     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x0112
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x01aa }
            if (r8 != 0) goto L_0x00e2
            goto L_0x0112
        L_0x00e2:
            if (r9 == 0) goto L_0x01af
            java.lang.ClassLoader r2 = r8.getClassLoader()     // Catch:{ all -> 0x01aa }
            r9.setClassLoader(r2)     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = "open_ui_with_webview_ui_extras"
            android.os.Bundle r2 = r9.getBundle(r2)     // Catch:{ all -> 0x01aa }
            java.lang.String r3 = "open_ui_with_webview_ui_plugin_name"
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getString(r9, r3)     // Catch:{ all -> 0x01aa }
            java.lang.String r5 = "open_ui_with_webview_ui_plugin_entry"
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getString(r9, r5)     // Catch:{ all -> 0x01aa }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x01aa }
            r5.<init>()     // Catch:{ all -> 0x01aa }
            if (r2 != 0) goto L_0x0109
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x01aa }
            r2.<init>()     // Catch:{ all -> 0x01aa }
        L_0x0109:
            android.content.Intent r2 = r5.putExtras(r2)     // Catch:{ all -> 0x01aa }
            ke3.C88144b.m109791i(r8, r3, r9, r2, r4)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x0112:
            return r0
        L_0x0113:
            int r8 = r7.mo7027F7()     // Catch:{ all -> 0x01aa }
            java.lang.String r9 = "geta8key_scene"
            r0.putInt(r9, r8)     // Catch:{ all -> 0x01aa }
            java.lang.String r9 = "Key value: getA8KeyScene(%d)"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x01aa }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01aa }
            r2[r5] = r8     // Catch:{ all -> 0x01aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r2)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x012b:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.f> r8 = r7.f119921g     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.f r8 = (com.tencent.p014mm.plugin.webview.core.C43512f) r8     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            r8.mo67797A()     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x013c:
            if (r9 == 0) goto L_0x0166
            java.lang.String r8 = "key_set_bounce_background_color"
            java.lang.String r8 = r9.getString(r8)     // Catch:{ all -> 0x01aa }
            if (r8 != 0) goto L_0x0147
            goto L_0x0166
        L_0x0147:
            int r8 = android.graphics.Color.parseColor(r8)     // Catch:{ Exception -> 0x015d }
            r7.f119925n = r8     // Catch:{ all -> 0x01aa }
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.f> r9 = r7.f119921g     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x01af
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.f r9 = (com.tencent.p014mm.plugin.webview.core.C43512f) r9     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x01af
            r9.mo67800f(r8)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x015d:
            java.lang.String r9 = "Failed to parse color: %s"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x01aa }
            r2[r5] = r8     // Catch:{ all -> 0x01aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r9, r2)     // Catch:{ all -> 0x01aa }
        L_0x0166:
            return r0
        L_0x0167:
            r7.f119922h = r9     // Catch:{ all -> 0x01aa }
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.f> r8 = r7.f119921g     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.f r8 = (com.tencent.p014mm.plugin.webview.core.C43512f) r8     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            r8.mo67799e(r9)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x0179:
            r7.f119923i = r9     // Catch:{ all -> 0x01aa }
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.f> r8 = r7.f119921g     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.f r8 = (com.tencent.p014mm.plugin.webview.core.C43512f) r8     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            r8.mo67801i(r9)     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x018b:
            gy3.C87412m.m108591d(r9)     // Catch:{ all -> 0x01aa }
            java.lang.String r8 = "webview_disable_bounce_scroll_top"
            int r8 = r9.getInt(r8, r5)     // Catch:{ all -> 0x01aa }
            if (r8 > 0) goto L_0x0198
            return r4
        L_0x0198:
            r7.f119924j = r3     // Catch:{ all -> 0x01aa }
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.f> r8 = r7.f119921g     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x01aa }
            com.tencent.mm.plugin.webview.core.f r8 = (com.tencent.p014mm.plugin.webview.core.C43512f) r8     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x01af
            r8.mo67805x()     // Catch:{ all -> 0x01aa }
            goto L_0x01af
        L_0x01aa:
            java.lang.String r8 = "In invokeAsResult method, it happens something unwanted!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x01af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1.mo7031V5(int, android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: XB */
    public void mo7032XB(int i, Bundle bundle) {
        WeakReference<Context> weakReference = this.f119920f;
        Activity activity = null;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C44259d(activity, this, i, bundle));
        }
    }

    public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
        Log.m105926v("MicroMsg.PreloadWebViewStubCallback", "getCurrentUrl");
        try {
            BaseWebViewController baseWebViewController = this.f119919e.get();
            ((C119157j) C119157j.f356862d).mo183895z(new C44257b(baseWebViewController != null ? baseWebViewController.mo67720g0() : null, str, str2, bundle, z));
            return false;
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.PreloadWebViewStubCallback", "In onHandleEnd method, it happens something unwanted!");
            return false;
        }
    }

    public boolean callback(int i, Bundle bundle) {
        ArrayList<String> stringArrayList;
        BaseWebViewController baseWebViewController = this.f119919e.get();
        C48590l g0 = baseWebViewController != null ? baseWebViewController.mo67720g0() : null;
        C87412m.m108592e(g0, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        if (i == 1006) {
            ((C119157j) C119157j.f356862d).mo183895z(new C44256a(this, bundle, g0));
        } else if (i == 1013) {
            try {
                LinkedList linkedList = new LinkedList();
                if (bundle != null) {
                    String string = bundle.getString("__appId");
                    if (string != null) {
                        String string2 = bundle.getString("__url");
                        if (string2 == null) {
                            return false;
                        }
                        if (bundle.containsKey("__webComptList") && (stringArrayList = bundle.getStringArrayList("__webComptList")) != null) {
                            for (String byteArray : stringArrayList) {
                                C48869bk2 bk22 = new C48869bk2();
                                bk22.parseFrom(bundle.getByteArray(byteArray));
                                linkedList.add(bk22);
                            }
                        }
                        C44463z z = g0.mo73268z();
                        if (z != null) {
                            z.mo69226b(string, string2, linkedList);
                        }
                        return true;
                    }
                }
                return false;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.PreloadWebViewStubCallback", e, "parse webCompt", new Object[0]);
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo7036d(Bundle bundle) {
        C43512f fVar;
        WeakReference<C43512f> weakReference = this.f119921g;
        if (weakReference != null && (fVar = weakReference.get()) != null) {
            fVar.mo67798d(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = r2.f117522C;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo7037e3() {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.PreloadWebViewStubCallback"
            java.lang.String r2 = "getCommitUrl"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.BaseWebViewController> r2 = r5.f119919e     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x001a }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r2 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r2     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0019
            java.lang.String r1 = r2.f117522C     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            return r0
        L_0x001a:
            r2 = move-exception
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "getCommitUrl exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1.mo7037e3():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = r2.getCurrentUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getCurrentUrl() {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.PreloadWebViewStubCallback"
            java.lang.String r2 = "getCurrentUrl"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.core.BaseWebViewController> r2 = r5.f119919e     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x001c }
            com.tencent.mm.plugin.webview.core.BaseWebViewController r2 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r2     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x001b
            java.lang.String r1 = r2.getCurrentUrl()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            return r0
        L_0x001c:
            r2 = move-exception
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "getCommitUrl exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1.getCurrentUrl():java.lang.String");
    }
}
