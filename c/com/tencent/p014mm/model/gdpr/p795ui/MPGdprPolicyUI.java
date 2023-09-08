package com.tencent.p014mm.model.gdpr.p795ui;

import a70.C112760b;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.model.gdpr.C1289a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMFalseProgressBar;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C30610e0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44234a0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44243c0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44386y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44389z;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.WebSettings;
import f40.C86709a0;
import java.util.Locale;
import js0.C46574u;
import kg3.C76577a;
import nj3.C88989a;
import ob0.C47350c;
import ob0.C89132b;
import p224ra.C89909e;
import te3.C50627o24;
import te3.C50772p24;

@C88989a(1)
/* renamed from: com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI */
public class MPGdprPolicyUI extends MMActivity {

    /* renamed from: i */
    public static final String f108433i = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/newreadtemplate?t=gdpr/confirm&business=%s&lang=%s&cc=%s");

    /* renamed from: d */
    public MMFalseProgressBar f108434d;

    /* renamed from: e */
    public MMWebView f108435e;

    /* renamed from: f */
    public C1289a f108436f;

    /* renamed from: g */
    public String f108437g;

    /* renamed from: h */
    public ResultReceiver f108438h;

    /* renamed from: com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI$a */
    public class C40345a implements C44243c0 {

        /* renamed from: com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI$a$a */
        public class C40346a implements Runnable {
            public C40346a() {
            }

            public void run() {
                MPGdprPolicyUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI$a$b */
        public class C40347b implements Runnable {
            public C40347b() {
            }

            public void run() {
                MPGdprPolicyUI.this.f108434d.mo25983c();
            }
        }

        /* renamed from: com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI$a$c */
        public class C40348c implements Runnable {
            public C40348c() {
            }

            public void run() {
                MPGdprPolicyUI.this.f108434d.mo25981a();
            }
        }

        public C40345a() {
        }

        /* renamed from: a */
        public void mo63036a(MMWebView mMWebView, String str) {
            MPGdprPolicyUI.this.runOnUiThread(new C40347b());
        }

        /* renamed from: b */
        public boolean mo63037b(String str) {
            return false;
        }

        /* renamed from: c */
        public void mo63038c(MMWebView mMWebView, String str) {
            MPGdprPolicyUI.this.runOnUiThread(new C40348c());
        }

        public boolean callback(int i, Bundle bundle) {
            if (i == 200) {
                boolean z = bundle.getBoolean("OnMPGdprPolicyAgreement_KIsAgree", false);
                MPGdprPolicyUI mPGdprPolicyUI = MPGdprPolicyUI.this;
                String str = MPGdprPolicyUI.f108433i;
                ResultReceiver resultReceiver = mPGdprPolicyUI.f108438h;
                if (resultReceiver != null) {
                    resultReceiver.send(z ? 1 : -1, (Bundle) null);
                }
                MPGdprPolicyUI mPGdprPolicyUI2 = MPGdprPolicyUI.this;
                mPGdprPolicyUI2.f108438h = null;
                if (z && !Util.isNullOrNil(mPGdprPolicyUI2.f108437g) && MPGdprPolicyUI.this.f108436f.f10392e != 0) {
                    C89132b bVar = new C89132b();
                    C50627o24 o242 = new C50627o24();
                    MPGdprPolicyUI mPGdprPolicyUI3 = MPGdprPolicyUI.this;
                    o242.f138913d = mPGdprPolicyUI3.f108437g;
                    o242.f138914e = mPGdprPolicyUI3.f108436f.f10392e;
                    C47350c.C47352b bVar2 = new C47350c.C47352b();
                    bVar2.f127066a = o242;
                    bVar2.f127067b = new C50772p24();
                    bVar2.f127069d = 2734;
                    bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/setgdrpauth";
                    bVar.mo123453j(bVar2.mo72403a());
                    bVar.mo9225i();
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo63040d(Bundle bundle) {
            MPGdprPolicyUI.this.runOnUiThread(new C40346a());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI$b */
    public class C40349b implements C44389z {
        public C40349b() {
        }
    }

    /* renamed from: com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI$c */
    public class C40350c implements MenuItem.OnMenuItemClickListener {
        public C40350c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MPGdprPolicyUI.this.finish();
            return true;
        }
    }

    public void dealContentView(View view) {
        super.dealContentView(view);
        MMWebView a = C30610e0.C30611a.f82425a.mo57505a(this);
        this.f108435e = a;
        a.getSettings().setDomStorageEnabled(true);
        this.f108435e.getSettings().setJavaScriptEnabled(true);
        this.f108435e.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f108435e.getSettings().setMixedContentMode(0);
        this.f108435e.getSettings().setUserAgentString(C46574u.m51897a(getContext(), this.f108435e.getSettings().getUserAgentString(), (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class)));
        this.f108435e.getView().setHorizontalScrollBarEnabled(false);
        this.f108435e.getView().setVerticalScrollBarEnabled(false);
        this.f108435e.getSettings().setBuiltInZoomControls(true);
        this.f108435e.getSettings().setUseWideViewPort(true);
        this.f108435e.getSettings().setLoadWithOverviewMode(true);
        this.f108435e.getSettings().setSavePassword(false);
        this.f108435e.getSettings().setSaveFormData(false);
        this.f108435e.getSettings().setGeolocationEnabled(true);
        this.f108435e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f108435e.getSettings().setAppCacheMaxSize(10485760);
        this.f108435e.getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
        this.f108435e.getSettings().setAppCacheEnabled(true);
        this.f108435e.getSettings().setDatabaseEnabled(true);
        WebSettings settings = this.f108435e.getSettings();
        settings.setDatabasePath(C112760b.m154216X() + "databases/");
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("KInitialParam_Force_wcPrivacyPolicyResult_DoInService", true);
        MMWebView mMWebView = this.f108435e;
        mMWebView.setWebViewClient(C44234a0.C30609a.f82424a.mo68940Nl(mMWebView, false, new C40345a(), bundle));
        MMWebView mMWebView2 = this.f108435e;
        mMWebView2.setWebChromeClient(C44386y.C30619a.f82440a.mo69163MN(mMWebView2, new C40349b()));
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.addView(this.f108435e, -1, -1);
        MMFalseProgressBar mMFalseProgressBar = new MMFalseProgressBar(this);
        this.f108434d = mMFalseProgressBar;
        mMFalseProgressBar.setProgressDrawable(C76577a.m92158i(this, C0966R.C0969drawable.agt));
        frameLayout.addView(this.f108434d, -1, C76577a.m92151b(this, 3));
    }

    public void finish() {
        super.finish();
        ResultReceiver resultReceiver = this.f108438h;
        if (resultReceiver != null) {
            if (resultReceiver != null) {
                resultReceiver.send(-1, (Bundle) null);
            }
            this.f108438h = null;
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (getIntent() != null) {
                ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("MPGdprPolicyUI_KEY_RECEIVER");
                this.f108438h = resultReceiver;
                if (resultReceiver != null) {
                    C1289a a = C1289a.m1379a(getIntent().getStringExtra("MPGdprPolicyUI_KEY_BUSINESS"));
                    this.f108436f = a;
                    if (a == null) {
                        Log.m105920e("MicroMsg.MPGdprPolicyUI", "onCreate get empty business");
                        ResultReceiver resultReceiver2 = this.f108438h;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(-1, (Bundle) null);
                        }
                        finish();
                        return;
                    }
                    this.f108437g = getIntent().getStringExtra("MPGdprPolicyUI_KEY_APPID");
                    return;
                }
            }
            finish();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MPGdprPolicyUI", "onCreate get receiver ex = %s", e);
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            this.f108435e.destroy();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MPGdprPolicyUI", "destroy WebView e = %s", e);
        } catch (Throwable th) {
            this.f108435e = null;
            throw th;
        }
        this.f108435e = null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f108435e.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f108435e.goBack();
        return true;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        setBackBtn(new C40350c(), C0966R.raw.actionbar_icon_dark_close);
        setActionbarColor(-1);
        this.f108435e.loadUrl(String.format(Locale.US, f108433i, new Object[]{this.f108436f.f10391d, LocaleUtil.getCurrentLanguage(this), (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null)}));
    }
}
