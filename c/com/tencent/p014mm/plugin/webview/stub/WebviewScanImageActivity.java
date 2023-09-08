package com.tencent.p014mm.plugin.webview.stub;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CancelDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.NotifyDealQBarStrResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import ex0.C45696d;
import f40.C86709a0;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity */
public class WebviewScanImageActivity extends MMActivity {

    /* renamed from: d */
    public boolean f283047d = false;

    /* renamed from: e */
    public String f283048e = null;

    /* renamed from: f */
    public int f283049f;

    /* renamed from: g */
    public int f283050g;

    /* renamed from: h */
    public String f283051h;

    /* renamed from: i */
    public String f283052i;

    /* renamed from: j */
    public String f283053j;

    /* renamed from: n */
    public IListener f283054n = new IListener<NotifyDealQBarStrResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1280295539;
        }

        public boolean callback(IEvent iEvent) {
            NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = (NotifyDealQBarStrResultEvent) iEvent;
            if (notifyDealQBarStrResultEvent != null) {
                Log.m105925i("MicroMsg.WebviewScanImageActivity", "notify Event: %d", Integer.valueOf(notifyDealQBarStrResultEvent.f264935d.f264938c));
                Log.m105919d("MicroMsg.WebviewScanImageActivity", "%s, %s", notifyDealQBarStrResultEvent.f264935d.f264937b, WebviewScanImageActivity.this);
                NotifyDealQBarStrResultEvent.C92533a aVar = notifyDealQBarStrResultEvent.f264935d;
                Activity activity = aVar.f264937b;
                WebviewScanImageActivity webviewScanImageActivity = WebviewScanImageActivity.this;
                if (activity != webviewScanImageActivity || !aVar.f264936a.equals(webviewScanImageActivity.f283048e)) {
                    Log.m105921e("MicroMsg.WebviewScanImageActivity", "not the same, eventStr: %s, origin: %s", notifyDealQBarStrResultEvent.f264935d.f264936a, WebviewScanImageActivity.this.f283048e);
                } else {
                    NotifyDealQBarStrResultEvent.C92533a aVar2 = notifyDealQBarStrResultEvent.f264935d;
                    Bundle bundle = aVar2.f264939d;
                    int i = aVar2.f264938c;
                    if (i == 0 || i == 1 || i == 2) {
                        WebviewScanImageActivity.this.f283054n.dead();
                        WebviewScanImageActivity.this.finish();
                    } else if (i == 3) {
                        WebviewScanImageActivity.this.f283054n.dead();
                        WebviewScanImageActivity.this.finish();
                    }
                }
            } else {
                Log.m105920e("MicroMsg.WebviewScanImageActivity", "event is null or not a instant of NotifyDealQBarStrResultEvent");
            }
            return false;
        }
    };

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.WebviewScanImageActivity", "hy: on create");
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (Util.isNullOrNil(getIntent().getStringExtra("img_gallery_session_id"))) {
            String stringExtra = getIntent().getStringExtra("key_string_for_url");
            if (!Util.isNullOrNil(stringExtra)) {
                String a = C86493v0.m107223a("WebviewQrCode");
                int i = 1;
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                c.mo120962i("url", stringExtra);
                if (!((C45696d) C86709a0.m107533q(C45696d.class)).B60(stringExtra)) {
                    i = 6;
                }
                c.mo120962i("Contact_Sub_Scene", Integer.valueOf(i));
                c.mo120962i("Contact_Scene_Note", stringExtra);
                getIntent().putExtra("img_gallery_session_id", a);
            }
        }
        setContentView((int) C0966R.C0971layout.b47);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.WebviewScanImageActivity", "hy: on pause");
        CancelDealQBarStrEvent cancelDealQBarStrEvent = new CancelDealQBarStrEvent();
        CancelDealQBarStrEvent.C92466a aVar = cancelDealQBarStrEvent.f264642d;
        aVar.f264644b = this;
        aVar.f264643a = this.f283048e;
        cancelDealQBarStrEvent.publish();
        this.f283054n.dead();
        finish();
    }

    public void onStart() {
        super.onStart();
        Log.m105924i("MicroMsg.WebviewScanImageActivity", "hy: on start");
        if (!this.f283047d && getIntent() != null) {
            this.f283048e = getIntent().getStringExtra("key_string_for_scan");
            this.f283049f = getIntent().getIntExtra("key_codetype_for_scan", 0);
            this.f283050g = getIntent().getIntExtra("key_codeversion_for_scan", 0);
            this.f283051h = getIntent().getStringExtra("key_string_for_url");
            this.f283052i = getIntent().getStringExtra("key_string_for_image_url");
            this.f283053j = getIntent().getStringExtra("key_string_for_wxapp_id");
            if (this.f283048e != null) {
                this.f283054n.alive();
                DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
                DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
                aVar.f264650b = this;
                aVar.f264649a = this.f283048e;
                aVar.f264652d = this.f283050g;
                aVar.f264651c = this.f283049f;
                aVar.f264653e = 6;
                aVar.f264658j = this.f283052i;
                aVar.f264657i = getIntent().getIntExtra("geta8key_scene", 40);
                Bundle bundle = new Bundle();
                bundle.putString("stat_app_id", this.f283053j);
                bundle.putString("stat_url", this.f283051h);
                bundle.putInt("stat_scene", 4);
                bundle.putString("stat_send_msg_user", getIntent().getStringExtra("key_string_for_from_username"));
                bundle.putString("wxappPathWithQuery", getIntent().getStringExtra("wxappPathWithQuery"));
                if (Util.isNullOrNil(this.f283053j)) {
                    Log.m105924i("MicroMsg.WebviewScanImageActivity", "addStatInfo4AppBrand, from h5");
                    bundle.putInt("LaunchCodeScene_ScanScene", 3);
                    bundle.putInt("pay_qrcode_session_type", 4);
                    bundle.putString("pay_qrcode_session_name", this.f283051h);
                } else {
                    Log.m105924i("MicroMsg.WebviewScanImageActivity", "addStatInfo4AppBrand, from wxapp");
                    bundle.putInt("LaunchCodeScene_ScanScene", 5);
                    bundle.putInt("pay_qrcode_session_type", 5);
                    bundle.putString("pay_qrcode_session_name", this.f283053j);
                }
                dealQBarStrEvent.f264648d.f264660l = bundle;
                dealQBarStrEvent.publish();
            }
        }
        this.f283047d = true;
    }
}
