package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.ConsoleMessage;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import dg2.C45338f;
import di3.C86312j;
import e00.C45519s0;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import p910lj.C76701a;
import xf2.C91196d;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI */
public class MailWebViewUI extends MMActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f115845i = 0;

    /* renamed from: d */
    public MMWebView f115846d;

    /* renamed from: e */
    public String f115847e;

    /* renamed from: f */
    public MMHandler f115848f;

    /* renamed from: g */
    public C91196d.C91197a f115849g = new C42790a();

    /* renamed from: h */
    public C96905d f115850h = new C96905d(this);

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI$a */
    public class C42790a extends C91196d.C91197a {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI$a$a */
        public class C42791a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f115852d;

            public C42791a(String str) {
                this.f115852d = str;
            }

            public void run() {
                MailWebViewUI mailWebViewUI = MailWebViewUI.this;
                String str = this.f115852d;
                MMWebView mMWebView = mailWebViewUI.f115846d;
                if (mMWebView != null && str != null) {
                    String str2 = mailWebViewUI.f115847e;
                    if (str2 == null) {
                        mMWebView.loadData(str, "text/html", "utf-8");
                    } else {
                        mMWebView.loadDataWithBaseURL(str2, str, "text/html", "utf-8", (String) null);
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI$a$b */
        public class C42792b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f115854d;

            public C42792b(String str) {
                this.f115854d = str;
            }

            public void run() {
                C76701a.makeText((Context) MailWebViewUI.this, (CharSequence) this.f115854d, 0).show();
            }
        }

        public C42790a() {
        }

        /* renamed from: b */
        public void mo66936b(int i, String str) {
            MailWebViewUI.this.f115848f.post(new C42792b(str));
        }

        /* renamed from: d */
        public void mo66938d(String str, Map map) {
            MailWebViewUI.this.f115848f.post(new C42791a(str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI$b */
    public class C42793b implements Runnable {
        public C42793b() {
        }

        public void run() {
            MailWebViewUI mailWebViewUI = MailWebViewUI.this;
            int i = MailWebViewUI.f115845i;
            String stringExtra = mailWebViewUI.getIntent().getStringExtra("uri");
            String[] stringArrayExtra = mailWebViewUI.getIntent().getStringArrayExtra("params");
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
                int indexOf = stringArrayExtra[i2].indexOf("=");
                hashMap.put(stringArrayExtra[i2].substring(0, indexOf), stringArrayExtra[i2].substring(indexOf + 1));
            }
            mailWebViewUI.f115847e = mailWebViewUI.getIntent().getStringExtra("baseurl");
            String nullAs = Util.nullAs(mailWebViewUI.getIntent().getStringExtra(FirebaseAnalytics.C113379b.METHOD), "get");
            if (nullAs == null || nullAs.length() == 0 || stringExtra == null || stringExtra.length() == 0) {
                Log.m105920e("MicroMsg.QQMail.WebViewUI", "doSend invalid argument.");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("qqmail_httpoptions_expired", false);
            bundle.putBoolean("qqmail_httpoptions_needcache", true);
            bundle.putBoolean("qqmail_httpoptions_needparse", false);
            try {
                if (nullAs.equals("get")) {
                    ((Long) new ReadMailProxy(mailWebViewUI.f115850h, mailWebViewUI.f115849g).REMOTE_CALL("get", stringExtra, hashMap, bundle)).longValue();
                    return;
                }
                ((Long) new ReadMailProxy(mailWebViewUI.f115850h, mailWebViewUI.f115849g).REMOTE_CALL("post", stringExtra, hashMap, bundle)).longValue();
            } catch (Exception e) {
                Log.m105929w("MicroMsg.QQMail.WebViewUI", "get/post, method = %s, ex = %s", nullAs, e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI$c */
    public class C42794c extends WebViewClient {
        public C42794c() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ((C45519s0) C86312j.m106911c(C45519s0.class)).l40(webView, "weixin://private/getcontentwidth/", "document.getElementsByTagName('html')[0].scrollWidth;");
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            MailWebViewUI.this.f115846d.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("weixin://private/getcontentwidth/")) {
                Log.m105918d("MicroMsg.QQMail.WebViewUI", "shouldOverride, url is getContentWidth scheme, url = " + str);
                MailWebViewUI.m46465H7(MailWebViewUI.this, str);
                return true;
            }
            webView.loadUrl(str);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI$d */
    public class C42795d extends WebChromeClient {
        public C42795d() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String Oq0 = ((C45519s0) C86312j.m106911c(C45519s0.class)).Oq0(consoleMessage != null ? consoleMessage.message() : null);
            if (!Oq0.startsWith("weixin://private/getcontentwidth/")) {
                return super.onConsoleMessage(consoleMessage);
            }
            Log.m105918d("MicroMsg.QQMail.WebViewUI", "onConsoleMessage, url is getContentWidth scheme, url = " + Oq0);
            MailWebViewUI.m46465H7(MailWebViewUI.this, Oq0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.MailWebViewUI$e */
    public class C42796e implements MenuItem.OnMenuItemClickListener {
        public C42796e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MailWebViewUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m46465H7(MailWebViewUI mailWebViewUI, String str) {
        mailWebViewUI.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.QQMail.WebViewUI", "dealGetContentWidthScheme fail, url is null");
            return;
        }
        String substring = str.substring(33);
        int i = Util.getInt(substring, 480);
        Log.m105918d("MicroMsg.QQMail.WebViewUI", "getContentWidth:" + substring);
        mailWebViewUI.f115846d.post(new C45338f(mailWebViewUI, i));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359934bp2;
    }

    public void initView() {
        Boolean valueOf = Boolean.valueOf(getIntent().getBooleanExtra("singleColumn", false));
        MMWebView a = MMWebView.C45103b.m49948a(getContext());
        this.f115846d = a;
        a.setBackgroundDrawable(C76577a.m92158i(this, C0966R.color.f356961a70));
        ((FrameLayout) findViewById(C0966R.C0970id.f357785br0)).addView(this.f115846d);
        this.f115846d.getSettings().setJavaScriptEnabled(true);
        if (valueOf.booleanValue()) {
            this.f115846d.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        }
        this.f115846d.getSettings().setDefaultFontSize(8);
        this.f115846d.getSettings().setSupportZoom(true);
        this.f115846d.getSettings().setBuiltInZoomControls(true);
        this.f115846d.setWebViewClient(new C42794c());
        this.f115846d.setWebChromeClient(new C42795d());
        this.f115846d.mo70469W();
        setBackBtn(new C42796e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f115848f = new MMHandler();
        initView();
        String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra != null) {
            setMMTitle(stringExtra);
        }
        this.f115850h.mo135257a(new C42793b());
    }

    public void onDestroy() {
        this.f115846d.setVisibility(8);
        this.f115846d.destroy();
        this.f115846d = null;
        this.f115850h.mo135260d();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStop() {
        this.f115846d.stopLoading();
        super.onStop();
    }
}
