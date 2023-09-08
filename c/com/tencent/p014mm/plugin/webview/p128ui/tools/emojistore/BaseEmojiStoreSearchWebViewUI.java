package com.tencent.p014mm.plugin.webview.p128ui.tools.emojistore;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.C106757l0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44125o1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import r93.C47956a;
import r93.C47957b;
import t83.C13851h1;
import t83.C48590l;
import t83.C48600p0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI */
public class BaseEmojiStoreSearchWebViewUI extends WebViewUI implements C106742j1.C106756o {

    /* renamed from: I2 */
    public C106742j1 f118766I2;

    /* renamed from: J2 */
    public String f118767J2;

    /* renamed from: K2 */
    public int f118768K2;

    /* renamed from: L2 */
    public boolean f118769L2;

    /* renamed from: M2 */
    public boolean f118770M2 = true;

    /* renamed from: N2 */
    public int f118771N2;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI$a */
    public class C43853a implements View.OnTouchListener {
        public C43853a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/emojistore/BaseEmojiStoreSearchWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            BaseEmojiStoreSearchWebViewUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/emojistore/BaseEmojiStoreSearchWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI$b */
    public class C43854b implements View.OnLongClickListener {
        public C43854b(BaseEmojiStoreSearchWebViewUI baseEmojiStoreSearchWebViewUI) {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/emojistore/BaseEmojiStoreSearchWebViewUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/emojistore/BaseEmojiStoreSearchWebViewUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI$c */
    public class C43855c extends C43519u {
        public C43855c(C43853a aVar) {
        }

        /* renamed from: c */
        public void mo64753c(WebView webView, String str) {
            Log.m105925i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "onPageFinished url:%s", str);
            BaseEmojiStoreSearchWebViewUI.this.showOptionMenu(false);
            BaseEmojiStoreSearchWebViewUI baseEmojiStoreSearchWebViewUI = BaseEmojiStoreSearchWebViewUI.this;
            baseEmojiStoreSearchWebViewUI.f118766I2.mo23884r(baseEmojiStoreSearchWebViewUI.f118767J2);
        }

        /* renamed from: d */
        public void mo62156d(WebView webView, String str) {
            BaseEmojiStoreSearchWebViewUI.this.showOptionMenu(false);
        }
    }

    /* renamed from: D8 */
    public boolean mo68229D8() {
        return true;
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        finish();
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        C43522y M7 = super.mo63701M7();
        M7.mo67671F(new C43855c((C43853a) null));
        return M7;
    }

    /* renamed from: N8 */
    public void mo68246N8() {
        finish();
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        if (str != null) {
            str = str.trim();
        }
        this.f118767J2 = str;
        String str2 = "";
        if (!Util.isNullOrNil(str)) {
            this.f118767J2 = str;
            this.f118501W1.post(new C47957b(this));
            Bundle bundle = new Bundle();
            bundle.putInt("type", this.f118768K2);
            bundle.putString("nextPageBuffer", str2);
            bundle.putString("keyword", this.f118767J2);
            bundle.putInt("webview_instance_id", hashCode());
            bundle.putLong("searchID", this.f118508Z.mo73257s());
            try {
                C43791l lVar = this.f118511a1;
                if (lVar != null) {
                    lVar.Q20(1, bundle);
                } else {
                    Log.m105920e("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "invoker should not be null");
                }
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", e, "doSearch", new Object[0]);
            }
        }
        hideVKB();
        if (!Util.isNullOrNil(str)) {
            str2 = str.replace(",", " ");
        }
        C115669n.INSTANCE.mo160131h(13054, Integer.valueOf(this.f118771N2), 1, str2);
        return false;
    }

    /* renamed from: S8 */
    public boolean mo68256S8() {
        return false;
    }

    /* renamed from: a9 */
    public void mo63385a9() {
        super.mo63385a9();
        this.f118767J2 = getIntent().getStringExtra("keyword");
        this.f118768K2 = getIntent().getIntExtra("type", 0);
        this.f118769L2 = getIntent().getBooleanExtra("showkeyboard", false);
        this.f118771N2 = getIntent().getIntExtra("sence", 0);
        this.f118523f.setOnTouchListener(new C43853a());
        C106742j1 j1Var = new C106742j1();
        this.f118766I2 = j1Var;
        addSearchMenu(true, j1Var);
        this.f118766I2.mo153851c(false);
        this.f118766I2.f319122j = this;
        showOptionMenu(false);
        C44125o1 o1Var = this.f118531h2;
        if (o1Var != null) {
            o1Var.mo68760e(true);
        }
        this.f118523f.setOnLongClickListener(new C43854b(this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3b;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        if (this.f118770M2 && Util.isNullOrNil(str)) {
            this.f118770M2 = false;
            if (!this.f118769L2) {
                MMHandlerThread.postToMainThreadDelayed(new C47956a(this), 500);
                return;
            }
            C106757l0 l0Var = this.f118766I2.f319121i;
            if (l0Var != null) {
                l0Var.mo153791c();
            }
            showVKB();
        }
    }

    /* renamed from: l5 */
    public void mo1325l5() {
        C106757l0 l0Var = this.f118766I2.f319121i;
        if (l0Var != null) {
            l0Var.mo153791c();
        }
        showVKB();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C106742j1 j1Var = this.f118766I2;
        if (j1Var == null) {
            return true;
        }
        j1Var.mo23882j(this, menu);
        this.f118766I2.mo153859q(getString(C0966R.string.c7k));
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: t8 */
    public void mo68312t8(int i, Bundle bundle) {
        Log.m105925i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", Integer.valueOf(i));
        switch (i) {
            case 80001:
                String string = bundle.getString("emoji_store_json_data");
                boolean z = bundle.getBoolean("emoji_store_new_query", true);
                String string2 = bundle.getString("emoji_store_page_buf");
                long j = bundle.getLong("emoji_store_search_id");
                C48590l lVar = this.f118508Z;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, not ready");
                    return;
                }
                Log.m105924i("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData success, ready");
                HashMap hashMap = new HashMap();
                hashMap.put("json", string);
                hashMap.put("newQuery", Boolean.valueOf(z));
                hashMap.put("nextPageBuffer", string2);
                Log.m105919d("MicroMsg.JsApiHandler", "cpan emoji set SearchID:%d", Long.valueOf(j));
                lVar.f129994N = j;
                String c = C13851h1.C13852a.m13143c("getSearchEmotionDataCallBack", hashMap, lVar.f130011p, lVar.f130012q);
                Log.m105925i("MicroMsg.JsApiHandler", "event:%s", c);
                MMHandlerThread.postToMainThread(new C48600p0(lVar, c));
                return;
            case 80002:
                this.f118508Z.mo73209F(true);
                return;
            default:
                super.mo68312t8(i, bundle);
                return;
        }
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
