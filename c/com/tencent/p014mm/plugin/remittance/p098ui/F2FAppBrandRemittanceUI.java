package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BusiF2fPaySuccEvent;
import com.tencent.p014mm.p136ui.C7038w;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.remittance.model.C42848o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e21.C75484o;
import eb0.C75592q0;
import f40.C86709a0;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p755xs.C102720b;
import qo3.C101218e0;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import te3.C49879ip;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI */
public class F2FAppBrandRemittanceUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public String f116060d = "";

    /* renamed from: e */
    public String f116061e = "";

    /* renamed from: f */
    public ImageView f116062f;

    /* renamed from: g */
    public Bitmap f116063g;

    /* renamed from: h */
    public C101218e0 f116064h;

    /* renamed from: i */
    public C77398g f116065i;

    /* renamed from: j */
    public IListener<BusiF2fPaySuccEvent> f116066j = new IListener<BusiF2fPaySuccEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1359897903;
        }

        public boolean callback(IEvent iEvent) {
            BusiF2fPaySuccEvent busiF2fPaySuccEvent = (BusiF2fPaySuccEvent) iEvent;
            C7038w wVar = C7038w.CANCEL;
            if (busiF2fPaySuccEvent == null) {
                return false;
            }
            BusiF2fPaySuccEvent.C67663a aVar = busiF2fPaySuccEvent.f193493d;
            if (!aVar.f193496c) {
                return false;
            }
            Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "f2f appbrand callback data.pay_fail_reason :%s，event.data.pay_success_action: %s，event.data.pay_channel:%s ,event.data.app_id :%s ", Integer.valueOf(aVar.f193499f), Integer.valueOf(busiF2fPaySuccEvent.f193493d.f193500g), Integer.valueOf(busiF2fPaySuccEvent.f193493d.f193501h), busiF2fPaySuccEvent.f193493d.f193502i);
            BusiF2fPaySuccEvent.C67663a aVar2 = busiF2fPaySuccEvent.f193493d;
            if (aVar2.f193501h != 56) {
                Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "is not from F2FAppBrandRemittance，reutrn ");
            } else if (!F2FAppBrandRemittanceUI.this.f116060d.equals(aVar2.f193502i)) {
                Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "is not the same appid ");
            } else {
                BusiF2fPaySuccEvent.C67663a aVar3 = busiF2fPaySuccEvent.f193493d;
                if (aVar3.f193500g == 1) {
                    Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "event.data.pay_success_action == 1，reutrn ");
                } else {
                    int i = aVar3.f193499f;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    C115669n.INSTANCE.mo160131h(19821, 9, F2FAppBrandRemittanceUI.this.f116060d, 0);
                                    F2FAppBrandRemittanceUI.this.mo67019H7(C7038w.SUCCESS, "");
                                } else if (i != 4) {
                                    Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "unknown pay failreason");
                                    F2FAppBrandRemittanceUI.this.mo67019H7(wVar, "");
                                } else {
                                    F2FAppBrandRemittanceUI.this.mo67019H7(wVar, "");
                                }
                            }
                        }
                    }
                    F2FAppBrandRemittanceUI.this.mo67019H7(C7038w.FAIL, "pay fail");
                }
            }
            return true;
        }
    };

    /* renamed from: n */
    public C102720b.C78973a f116067n = new C42858b(this);

    /* renamed from: com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI$a */
    public class C42857a implements C47883u {
        public C42857a(F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI$b */
    public class C42858b implements C102720b.C78973a {
        public C42858b(F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI) {
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
        }
    }

    /* renamed from: H7 */
    public final void mo67019H7(Enum enumR, String str) {
        Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "setActivityResultData result :%s , errmsg : %s", enumR, str);
        Intent intent = new Intent();
        intent.putExtra("key_result_pay_result", enumR);
        intent.putExtra("key_result_error_msg", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: I7 */
    public final void mo67020I7(String str) {
        Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "showErrorDialog,errMsg:%s", str);
        C77426q qVar = new C77426q(getContext());
        qVar.mo107606r("");
        qVar.mo107595g(str);
        qVar.mo107589a(true);
        qVar.mo107601m(C0966R.string.lkg);
        qVar.mo107600l(new C42857a(this));
        qVar.mo107603o();
        C77398g gVar = qVar.f225839c;
        if (gVar != null) {
            this.f116065i = gVar;
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        mo67019H7(C7038w.CANCEL, "");
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "onCreate（）");
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().setFlags(1024, 1024);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        this.f116060d = getIntent().getStringExtra("key_app_id");
        String stringExtra = getIntent().getStringExtra("key_confirm_id");
        this.f116061e = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            mo67019H7(C7038w.FAIL, "confirm_id is empty");
        }
        C86709a0.m107524d().mo123455a(2850, this);
        C86709a0.m107524d().mo123460f(new C42848o(this.f116061e, this.f116060d));
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "onDestroy()");
        super.onDestroy();
        ImageView imageView = this.f116062f;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        Bitmap bitmap = this.f116063g;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this.f116067n);
        this.f116066j.dead();
        C86709a0.m107524d().mo123470p(2850, this);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "onPause()");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "onResume()");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49879ip ipVar;
        View view;
        String str2 = str;
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "on Scene End：errType %s , errCode：%s，errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str2);
        if (!(yVar2 instanceof C42848o)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            C49879ip ipVar2 = ((C42848o) yVar2).f116040f;
            if (ipVar2 == null) {
                ipVar2 = new C49879ip();
            }
            C49879ip ipVar3 = ipVar2;
            Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd ok，retcode:%s, retMsg：%s", Integer.valueOf(ipVar3.f135558d), ipVar3.f135559e);
            if (ipVar3.f135558d == 0) {
                Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "showHalfDialog");
                if (Util.isNullOrNil(ipVar3.f135561g)) {
                    Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "res == null || Util.isNullOrNil(res.qrcode)");
                    mo67019H7(C7038w.FAIL, "get qrcode fail");
                    return;
                }
                C115669n.INSTANCE.mo160131h(19821, 1, this.f116060d, 0);
                this.f116064h = new C101218e0(getContext(), 2, 3);
                View inflate = View.inflate(getContext(), C0966R.C0971layout.a59, (ViewGroup) null);
                ((ImageView) inflate.findViewById(C0966R.C0970id.f357486a34)).setOnClickListener(new C42869c(this));
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cob);
                textView.setText(ipVar3.f135560f);
                textView.getPaint().setFakeBoldText(true);
                this.f116064h.mo140672r(inflate);
                View inflate2 = View.inflate(getContext(), C0966R.C0971layout.a58, (ViewGroup) null);
                ImageView imageView = (ImageView) inflate2.findViewById(C0966R.C0970id.co9);
                this.f116062f = imageView;
                imageView.setImageBitmap((Bitmap) null);
                if (Util.isNullOrNil(ipVar3.f135562h)) {
                    Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "qrcode： res.head_img null");
                    view = inflate2;
                    ipVar = ipVar3;
                } else {
                    String str3 = ipVar3.f135561g;
                    String str4 = ipVar3.f135562h;
                    Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "contentUrl： %s ， headUrl：%s", str3, str4);
                    String str5 = str4;
                    view = inflate2;
                    ipVar = ipVar3;
                    this.f116063g = C75484o.m90513a(this, str3, C75592q0.m90789s(), 1, str5, true, BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 197.0f), this.f116067n, false, 1, 2.0f, false);
                }
                Bitmap bitmap = this.f116063g;
                if (bitmap == null || bitmap.isRecycled()) {
                    Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "qrcode： bmp null ");
                } else {
                    this.f116062f.setImageBitmap(this.f116063g);
                }
                ((TextView) view.findViewById(C0966R.C0970id.coa)).setText(ipVar.f135563i);
                TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.coc);
                textView2.setText(ipVar.f135564j);
                textView2.getPaint().setFakeBoldText(true);
                this.f116064h.mo140663j(view);
                this.f116064h.mo140677w(ipVar.f135565n);
                this.f116064h.mo140676v(0);
                C101218e0 e0Var = this.f116064h;
                e0Var.f296375F = new C42870d(this, ipVar);
                e0Var.mo140655A();
                return;
            }
            mo67020I7(ipVar3.f135559e);
            return;
        }
        Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd faile show error dialog ");
        mo67020I7(str2);
    }

    public void onWindowFocusChanged(boolean z) {
        Log.m105924i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged");
        C101218e0 e0Var = this.f116064h;
        if (e0Var != null && !e0Var.mo140661h()) {
            Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged：mHalfBottomDialog isShowHalfDialog %s, finish Activity", Boolean.valueOf(this.f116064h.mo140661h()));
            this.f116064h = null;
            mo67019H7(C7038w.CANCEL, "");
            C115669n.INSTANCE.mo160131h(19821, 3, this.f116060d, 0);
        }
        C77398g gVar = this.f116065i;
        if (gVar != null && !gVar.isShowing()) {
            Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged isShowing:%s,finish Activity", Boolean.valueOf(this.f116065i.isShowing()));
            this.f116065i = null;
            mo67019H7(C7038w.FAIL, "get qrcode fail");
        }
        super.onWindowFocusChanged(z);
    }
}
