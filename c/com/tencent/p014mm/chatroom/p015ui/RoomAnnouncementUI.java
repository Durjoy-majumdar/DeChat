package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import nj3.C76879j;

@Deprecated
/* renamed from: com.tencent.mm.chatroom.ui.RoomAnnouncementUI */
public class RoomAnnouncementUI extends MMActivity {

    /* renamed from: d */
    public WebView f108131d;

    /* renamed from: e */
    public boolean f108132e;

    /* renamed from: f */
    public String f108133f;

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAnnouncementUI$a */
    public class C40209a extends WebChromeClient {

        /* renamed from: com.tencent.mm.chatroom.ui.RoomAnnouncementUI$a$a */
        public class C40210a implements DialogInterface.OnClickListener {
            public C40210a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RoomAnnouncementUI.this.f108131d.requestFocus();
            }
        }

        public C40209a() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            C76879j.m92749t(RoomAnnouncementUI.this, str2, (String) null, new C40210a());
            jsResult.cancel();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAnnouncementUI$b */
    public class C40211b extends WebViewClient {
        public C40211b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.equals("weixin://chatroom/upgradeagree")) {
                return false;
            }
            RoomAnnouncementUI roomAnnouncementUI = RoomAnnouncementUI.this;
            C1226y1.m1351a(roomAnnouncementUI, roomAnnouncementUI.f108133f, roomAnnouncementUI.f108132e);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.RoomAnnouncementUI$c */
    public class C40212c implements MenuItem.OnMenuItemClickListener {
        public C40212c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RoomAnnouncementUI.this.setResult(0);
            RoomAnnouncementUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6808p4;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.i_4);
        MMWebView mMWebView = (MMWebView) findViewById(C0966R.C0970id.lm8);
        mMWebView.getClass();
        this.f108131d = mMWebView;
        mMWebView.getSettings().setJavaScriptEnabled(true);
        this.f108131d.getSettings().setDomStorageEnabled(true);
        this.f108131d.getSettings().setBuiltInZoomControls(true);
        this.f108131d.getSettings().setUseWideViewPort(true);
        this.f108131d.getSettings().setLoadWithOverviewMode(true);
        this.f108131d.getSettings().setSavePassword(false);
        this.f108131d.getSettings().setSaveFormData(false);
        this.f108131d.getSettings().setGeolocationEnabled(false);
        this.f108131d.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        this.f108131d.setWebChromeClient(new C40209a());
        this.f108131d.setWebViewClient(new C40211b());
        setBackBtn(new C40212c());
        this.f108131d.loadUrl(getString(C0966R.string.b65, new Object[]{LocaleUtil.getApplicationLanguage()}));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108132e = getIntent().getBooleanExtra("need_bind_mobile", false);
        this.f108133f = getIntent().getStringExtra("RoomInfo_Id");
        initView();
    }

    public void onDestroy() {
        WebView webView = this.f108131d;
        if (webView != null) {
            webView.setVisibility(8);
            ((ViewGroup) this.f108131d.getParent()).removeView(this.f108131d);
            this.f108131d.removeAllViews();
            this.f108131d.destroy();
            this.f108131d = null;
            System.gc();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
