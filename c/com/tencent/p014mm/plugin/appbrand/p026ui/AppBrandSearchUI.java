package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.FTSSearchTabWebViewUI;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kb0.C9575d;
import ke3.C88144b;
import p206nj.C47264o;
import t83.C13851h1;
import t83.C48590l;
import t83.C48596n0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI */
public class AppBrandSearchUI extends FTSSearchTabWebViewUI {

    /* renamed from: J3 */
    public static Boolean f108892J3;

    /* renamed from: F3 */
    public View f108893F3;

    /* renamed from: G3 */
    public String f108894G3;

    /* renamed from: H3 */
    public String f108895H3;

    /* renamed from: I3 */
    public int f108896I3;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI$a */
    public class C1978a implements View.OnClickListener {
        public C1978a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (TextUtils.isEmpty(AppBrandSearchUI.this.f108894G3)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", AppBrandSearchUI.this.f108894G3);
            intent.putExtra("geta8key_scene", 41);
            intent.putExtra("show_long_click_popup_menu", false);
            C88144b.m109791i(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI$b */
    public class C40538b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f108897d;

        /* renamed from: e */
        public final /* synthetic */ int f108898e;

        /* renamed from: f */
        public final /* synthetic */ int f108899f;

        /* renamed from: g */
        public final /* synthetic */ int f108900g;

        public C40538b(String str, int i, int i2, int i3) {
            this.f108897d = str;
            this.f108898e = i;
            this.f108899f = i2;
            this.f108900g = i3;
        }

        public void run() {
            C48590l lVar = AppBrandSearchUI.this.f118508Z;
            if (lVar != null) {
                String str = this.f108897d;
                int i = this.f108898e;
                int i2 = this.f108899f;
                int i3 = this.f108900g;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onSearchGuideDataReady fail, not ready");
                    return;
                }
                Log.m105924i("MicroMsg.JsApiHandler", "onSearchGuideDataReady success, ready");
                HashMap hashMap = new HashMap();
                hashMap.put("json", str);
                hashMap.put("isCacheData", Integer.valueOf(i));
                hashMap.put("isExpired", Integer.valueOf(i2));
                hashMap.put("isPreload", Integer.valueOf(i3));
                MMHandlerThread.postToMainThread(new C48596n0(lVar, C13851h1.C13852a.m13143c("onSearchGuideDataReady", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: a9 */
    public void mo63385a9() {
        super.mo63385a9();
        if (this.f118935q3 != null && !Util.isNullOrNil(this.f118884c3)) {
            this.f118935q3.getFtsEditText().mo70356l(this.f118884c3, (List<FTSSearchView.C6996f>) null);
            this.f118935q3.getFtsEditText().mo70335c();
            hideVKB();
        }
    }

    /* renamed from: aa */
    public String mo63386aa() {
        String stringExtra = getIntent().getStringExtra("key_search_place_holder");
        return (stringExtra == null || stringExtra.length() <= 0) ? super.mo63386aa() : stringExtra;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        View view;
        if (!TextUtils.isEmpty(str2) && (view = this.f108893F3) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C43791l lVar = this.f118511a1;
        if (lVar == null) {
            Log.m105924i("MicroMsg.AppBrandSearchUI", "invoker is null");
        } else {
            try {
                lVar.mo68114V5(10001, (Bundle) null);
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.AppBrandSearchUI", "refresh keyword id error : %s", e);
            }
        }
        super.mo3001b3(str, str2, list, mVar);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.tencent.mm.vfs.f0$h, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        f108892J3 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r0 != 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        if (f108892J3.booleanValue() == false) goto L_0x009b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0083 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo63387d8() {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x00a7
            boolean r0 = p206nj.C88956h.m111063d()
            if (r0 == 0) goto L_0x009b
            java.lang.Boolean r0 = f108892J3
            if (r0 != 0) goto L_0x0093
            r0 = 0
            java.io.File r1 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r2 = "build.prop"
            if (r1 != 0) goto L_0x001b
            r1 = r0
            goto L_0x0023
        L_0x001b:
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0083 }
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)     // Catch:{ Exception -> 0x0083 }
        L_0x0023:
            if (r1 != 0) goto L_0x002f
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0083 }
            r1.<init>()     // Catch:{ Exception -> 0x0083 }
            android.net.Uri$Builder r1 = r1.path(r2)     // Catch:{ Exception -> 0x0083 }
            goto L_0x0036
        L_0x002f:
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ Exception -> 0x0083 }
            r1.appendPath(r2)     // Catch:{ Exception -> 0x0083 }
        L_0x0036:
            android.net.Uri r2 = r1.build()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = r2.getPath()     // Catch:{ Exception -> 0x0083 }
            if (r3 == 0) goto L_0x0057
            r4 = 0
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r4, r4)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r4 = r2.getPath()     // Catch:{ Exception -> 0x0083 }
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x0083 }
            if (r4 != 0) goto L_0x0057
            android.net.Uri$Builder r1 = r1.path(r3)     // Catch:{ Exception -> 0x0083 }
            android.net.Uri r2 = r1.build()     // Catch:{ Exception -> 0x0083 }
        L_0x0057:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0083 }
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r2, r0)     // Catch:{ Exception -> 0x0083 }
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106421C(r2, r1)     // Catch:{ Exception -> 0x0083 }
            java.util.Properties r1 = new java.util.Properties     // Catch:{ Exception -> 0x0083 }
            r1.<init>()     // Catch:{ Exception -> 0x0083 }
            r1.load(r0)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getProperty(r2, r3)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r2 = "V8"
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x0083 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0083 }
            f108892J3 = r1     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0093
            goto L_0x0089
        L_0x0081:
            r1 = move-exception
            goto L_0x008d
        L_0x0083:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0081 }
            f108892J3 = r1     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0093
        L_0x0089:
            r0.close()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0093
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            r0.close()     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            throw r1
        L_0x0093:
            java.lang.Boolean r0 = f108892J3
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a7
        L_0x009b:
            android.view.Window r0 = r5.getWindow()
            r1 = 1
            com.tencent.p014mm.p136ui.C85875k4.m106175c0(r0, r1)
            r0 = -855310(0xfffffffffff2f2f2, float:NaN)
            return r0
        L_0x00a7:
            int r0 = com.tencent.p014mm.plugin.appbrand.C40573v2.f108972a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandSearchUI.mo63387d8():int");
    }

    public void dealContentView(View view) {
        View view2 = view;
        super.dealContentView(view);
        this.f108894G3 = getIntent().getStringExtra("key_nearby_url");
        getIntent().getStringExtra("key_nearby_list_id");
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f6464fk, (ViewGroup) view2, false);
        this.f108893F3 = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.h_p);
        findViewById.setOnClickListener(new C1978a());
        if (TextUtils.isEmpty(this.f108894G3)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f108893F3;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = findViewById;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f108893F3;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view2 instanceof FrameLayout) {
            ((FrameLayout) view2).addView(this.f108893F3);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (getWindow().hasFeature(9)) {
            View view9 = this.f108893F3;
            int paddingLeft = view9.getPaddingLeft();
            Rect rect = new Rect();
            int X7 = mo68265X7();
            View decorView = getWindow().getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            int height = decorView.getHeight();
            int[] iArr = new int[2];
            decorView.getLocationOnScreen(iArr);
            if (height == 0) {
                X7 += C47264o.m52556a(getContext(), 0);
            }
            view9.setPadding(paddingLeft, ((height - rect.height() < 0 || iArr[1] <= 200) ? X7 + rect.top : X7 + (height - rect.height())) + this.f108893F3.getPaddingTop(), this.f108893F3.getPaddingRight(), this.f108893F3.getPaddingBottom());
        }
        addContentView(this.f108893F3, layoutParams);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C43471q.f117492a = C43471q.m46977a(3);
        this.f108895H3 = getIntent().getStringExtra("key_session_id");
        this.f108896I3 = getIntent().getIntExtra("ftsbizscene", 0);
        Log.m105925i("MicroMsg.AppBrandSearchUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", this.f108895H3);
        C115669n.INSTANCE.mo160131h(13929, this.f108895H3, "", 1, Integer.valueOf(this.f108896I3));
        Intent intent = new Intent();
        intent.putExtra("key_session_id", this.f108895H3);
        intent.putExtra("ftsbizscene", this.f108896I3);
        setResult(-1, intent);
    }

    public void onDestroy() {
        int i = this.f108896I3;
        if (i == 3 || i == 16) {
            C115669n.INSTANCE.mo160131h(13929, this.f108895H3, C9575d.f29814a, 2, Integer.valueOf(this.f108896I3));
        }
        super.onDestroy();
    }

    /* renamed from: u8 */
    public void mo63388u8(int i, Bundle bundle) {
        super.mo63388u8(i, bundle);
        if (i == 142) {
            this.f118501W1.post(new C40538b(bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0), bundle.getInt("fts_key_is_expired", 1), bundle.getInt("fts_key_is_preload", 0)));
        }
    }

    /* renamed from: y */
    public boolean mo3009y() {
        View view = this.f108893F3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.mo3009y();
        return false;
    }
}
