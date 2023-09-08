package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WxPayPrivacyDutyResultEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C31371l0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C88989a;
import vo3.C90852c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI */
public class ShowWxPayAgreementsUI extends MMActivity {

    /* renamed from: d */
    public MMWebView f117293d;

    /* renamed from: e */
    public Button f117294e;

    /* renamed from: f */
    public Button f117295f;

    /* renamed from: g */
    public View f117296g;

    /* renamed from: h */
    public String f117297h;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI$a */
    public class C43373a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI$a$a */
        public class C43374a implements ValueCallback<String> {
            public C43374a() {
            }

            public void onReceiveValue(Object obj) {
                String str = (String) obj;
                Log.m105925i("MicroMsg.ShowWxPayAgreementsUI", "agree, marketingSwitchClosed = %s", str);
                boolean parseBoolean = Boolean.parseBoolean(str);
                WxPayPrivacyDutyResultEvent wxPayPrivacyDutyResultEvent = new WxPayPrivacyDutyResultEvent();
                WxPayPrivacyDutyResultEvent.C40189a aVar = wxPayPrivacyDutyResultEvent.f107846d;
                aVar.f107847a = true;
                aVar.f107848b = parseBoolean;
                wxPayPrivacyDutyResultEvent.publish();
                C115669n.INSTANCE.mo160131h(15236, 2);
                Intent intent = new Intent();
                intent.putExtra("key_marketing_switch_closed", parseBoolean);
                ShowWxPayAgreementsUI.this.setResult(-1, intent);
                ShowWxPayAgreementsUI.this.finish();
            }
        }

        public C43373a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ShowWxPayAgreementsUI.this.f117293d.evaluateJavascript("marketingSwitchClosed()", new C43374a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI$b */
    public class C43375b implements View.OnClickListener {
        public C43375b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WxPayPrivacyDutyResultEvent wxPayPrivacyDutyResultEvent = new WxPayPrivacyDutyResultEvent();
            WxPayPrivacyDutyResultEvent.C40189a aVar = wxPayPrivacyDutyResultEvent.f107846d;
            aVar.f107847a = false;
            aVar.f107848b = false;
            wxPayPrivacyDutyResultEvent.publish();
            C115669n.INSTANCE.mo160131h(15236, 3);
            ShowWxPayAgreementsUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI$c */
    public static class C43376c {
        public C43376c(C43373a aVar) {
        }

        @JavascriptInterface
        public void marketingSwitchChanged(boolean z) {
            Log.m105925i("MicroMsg.ShowWxPayAgreementsUI", "marketing switch changed, opened = %s", Boolean.valueOf(z));
            if (z) {
                C115669n.INSTANCE.mo160131h(15236, 4);
                return;
            }
            C115669n.INSTANCE.mo160131h(15236, 5);
        }
    }

    public void finish() {
        Log.m105924i("MicroMsg.ShowWxPayAgreementsUI", "onRefreshed");
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bzf;
    }

    public void initView() {
        C115669n.INSTANCE.mo160131h(15236, 1);
        getSupportActionBar().mo91104o();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        getIntent().getIntExtra("agreement_type", 0);
        MMWebView mMWebView = (MMWebView) getContentView().findViewById(C0966R.C0970id.f5669ld);
        mMWebView.getClass();
        this.f117293d = mMWebView;
        mMWebView.getSettings().setJavaScriptEnabled(true);
        this.f117293d.addJavascriptInterface(new C43376c((C43373a) null), "privacyPageTools");
        this.f117294e = (Button) findViewById(C0966R.C0970id.f5667lb);
        this.f117295f = (Button) findViewById(C0966R.C0970id.f5664l9);
        this.f117297h = getIntent().getStringExtra("agreement_content");
        this.f117296g = findViewById(C0966R.C0970id.f5658l3);
        if (C85875k4.m106211z()) {
            this.f117296g.setBackground(getContext().getResources().getDrawable(C0966R.raw.wxpay_agreement_bg_dark));
        } else {
            this.f117296g.setBackground(getContext().getResources().getDrawable(C0966R.raw.wxpay_agreement_bg_normal));
        }
        this.f117295f.setOnClickListener(new C43373a());
        this.f117294e.setOnClickListener(new C43375b());
        this.f117293d.setWebViewClient(new C43410q(this));
        if (getContext().getApplicationInfo().targetSdkVersion >= 29) {
            this.f117293d.loadData(Base64.encodeToString(this.f117297h.getBytes(), 0), "text/html; charset=UTF-8", "base64");
        } else {
            this.f117293d.loadData(this.f117297h, "text/html; charset=UTF-8", (String) null);
        }
        int pe02 = ((C31371l0) C86312j.m106911c(C31371l0.class)).pe0(getContext());
        if (pe02 < 1 || pe02 > 8) {
            pe02 = 2;
        }
        Log.m105924i("MicroMsg.ShowWxPayAgreementsUI", "localSetFontSize, fontSize = " + pe02);
        switch (pe02) {
            case 1:
                this.f117293d.getSettings().setTextZoom(80);
                return;
            case 2:
                this.f117293d.getSettings().setTextZoom(100);
                return;
            case 3:
                this.f117293d.getSettings().setTextZoom(110);
                return;
            case 4:
                this.f117293d.getSettings().setTextZoom(112);
                return;
            case 5:
                this.f117293d.getSettings().setTextZoom(112);
                return;
            case 6:
                this.f117293d.getSettings().setTextZoom(140);
                return;
            case 7:
                this.f117293d.getSettings().setTextZoom(155);
                return;
            case 8:
                this.f117293d.getSettings().setTextZoom(165);
                return;
            default:
                this.f117293d.getSettings().setTextZoom(100);
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        MMWebView mMWebView = this.f117293d;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
