package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import b63.C113146l;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FuckOfflinePayResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1774p4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75105d;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import ie3.C8883h;
import java.util.HashMap;
import kd2.C76559f;
import ke3.C88144b;
import l31.C61212e;
import nj3.C88989a;
import o31.C11345b;
import o31.C76986a;
import ob0.C117747y;
import p281yz.C79173v;
import p640ox.C77049b;
import te3.C51567um2;
import v53.C78339d;
import v53.C78342e0;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI */
public class WalletOfflineEntranceUI extends WalletBaseUI {

    /* renamed from: d */
    public boolean f201996d = true;

    /* renamed from: e */
    public int f201997e = -1;

    /* renamed from: f */
    public int f201998f;

    /* renamed from: g */
    public boolean f201999g = false;

    /* renamed from: h */
    public IListener<FuckOfflinePayResultEvent> f202000h = new IListener<FuckOfflinePayResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = -675083759;
        }

        public boolean callback(IEvent iEvent) {
            FuckOfflinePayResultEvent fuckOfflinePayResultEvent = (FuckOfflinePayResultEvent) iEvent;
            Log.m105925i("MicroMsg.WalletOfflineEntranceUI", "rcv funk event: %s", fuckOfflinePayResultEvent.f193628d.f193629a);
            Intent intent = new Intent();
            intent.putExtra("key_callback", fuckOfflinePayResultEvent.f193628d.f193629a);
            WalletOfflineEntranceUI.this.setResult(-1, intent);
            WalletOfflineEntranceUI.this.finish();
            return false;
        }
    };

    /* renamed from: H7 */
    public final void mo96330H7() {
        int i;
        Log.m105926v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onCreate()");
        C113146l.m154807e(1);
        C75228t.m90243e0(30, 1);
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_from_scene", 0);
            Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "parserCardData(), scene is " + intExtra);
            if (intExtra == 3) {
                C76559f.f224089g = intExtra;
                int intExtra2 = getIntent().getIntExtra("key_expire_time", 0);
                long longExtra = getIntent().getLongExtra("key_begin_time", 0);
                boolean booleanExtra = getIntent().getBooleanExtra("key_is_mark", false);
                Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "expire_time:" + intExtra2 + " beginTime:" + longExtra + " isMark:" + booleanExtra);
                C76559f.f224090h = intExtra2;
                C76559f.f224091i = longExtra;
                C76559f.f224092j = booleanExtra;
                C76559f.f224093k = getIntent().getStringExtra("key_card_id");
                C76559f.f224094l = getIntent().getStringExtra("key_user_card_id");
                C76559f.f224095m = getIntent().getStringExtra("key_card_code");
            } else if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
                C76559f.f224089g = intExtra;
                C76559f.f224090h = 0;
                C76559f.f224091i = 0;
                C76559f.f224092j = false;
                C76559f.f224093k = "";
                C76559f.f224094l = "";
                C76559f.f224095m = "";
            }
        }
        this.f201998f = getIntent().getIntExtra("key_from_scene", 0);
        if (getIntent().getBooleanExtra("is_offline_create", false) || !((i = this.f201998f) == 6 || i == 7)) {
            init();
            this.f201996d = false;
            return;
        }
        Log.m105925i("MicroMsg.WalletOfflineEntranceUI", "from h5 or wxapp check sign: %s", Integer.valueOf(i));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("appId");
        String stringExtra2 = intent.getStringExtra("timeStamp");
        String stringExtra3 = intent.getStringExtra("nonceStr");
        String stringExtra4 = intent.getStringExtra("packageExt");
        String stringExtra5 = intent.getStringExtra("signtype");
        String stringExtra6 = intent.getStringExtra("paySignature");
        int intExtra3 = intent.getIntExtra("pay_channel", 0);
        C78339d dVar = this.f201998f == 6 ? new C78339d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, intent.getStringExtra("url"), 16, C1774p4.NAME, intExtra3) : new C78339d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, 16, intent.getStringExtra("wxapp_username"), intent.getStringExtra("wxapp_path"), C1774p4.NAME, intExtra3);
        addSceneEndListener(580);
        doSceneProgress(dVar, true);
        this.f201996d = false;
    }

    public void finish() {
        Log.m105918d("MicroMsg.WalletOfflineEntranceUI", "finish");
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public final void init() {
        Class cls = C79173v.class;
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("key_from_scene")) {
            int intExtra = intent.getIntExtra("key_from_scene", 0);
            int i = 7;
            if (intExtra == 1) {
                this.f201997e = 1;
                i = 2;
            } else {
                if (intExtra == 2) {
                    this.f201997e = 2;
                } else if (intExtra == 3) {
                    this.f201997e = 3;
                    i = 3;
                } else if (intExtra == 4) {
                    this.f201997e = 4;
                    i = 6;
                } else if (intExtra == 5) {
                    this.f201997e = 8;
                    i = 4;
                } else if (intExtra == 6) {
                    this.f201997e = 10;
                } else if (intExtra == 7) {
                    this.f201997e = 11;
                    i = 8;
                } else if (intExtra == 8) {
                    this.f201997e = 12;
                    i = 9;
                } else {
                    this.f201997e = 0;
                    Log.m105925i("MicroMsg.WalletOfflineEntranceUI", "unknown scene: %d", Integer.valueOf(intExtra));
                }
                i = 1;
            }
            C115669n.INSTANCE.mo160131h(14021, 1, Integer.valueOf(i));
        }
        HashMap hashMap = null;
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91337s() || ((C79173v) C86312j.m106911c(cls)).Ex0().f192955h == null) {
            Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isDataInvalid()");
            doSceneProgress(new C78342e0((String) null, 8), true);
            this.f201996d = false;
        } else if (!this.mKindaEnable || !C76559f.m92113i()) {
            Intent intent2 = new Intent();
            intent2.putExtra("key_entry_scene", this.f201997e);
            intent2.putExtra("key_from_scene", this.f201998f);
            String stringExtra = getIntent().getStringExtra("key_business_attach");
            if (!Util.isNullOrNil(stringExtra)) {
                intent2.putExtra("key_business_attach", stringExtra);
            }
            intent2.putExtra("is_offline_create", getIntent().getBooleanExtra("is_offline_create", false));
            intent2.putExtra("key_appid", getIntent().getStringExtra("key_appid"));
            C88144b.m109795m(getContext(), "offline", ".ui.WalletOfflineCoinPurseUI", intent2, 1);
        } else {
            if (C76559f.f224089g == 3) {
                hashMap = new HashMap();
                String str = C76559f.f224093k;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                hashMap.put("card_id", str);
                String str3 = C76559f.f224094l;
                if (str3 == null) {
                    str3 = str2;
                }
                hashMap.put("user_card_id", str3);
                String str4 = C76559f.f224095m;
                if (str4 != null) {
                    str2 = str4;
                }
                hashMap.put("card_code", str2);
            }
            int intExtra2 = getIntent().getIntExtra("pay_channel", 0);
            ((C76324c) C86312j.m106911c(C76324c.class)).startOfflinePrePay(getContext(), this.f201997e, intExtra2, this.f201998f, hashMap);
            finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "do not finish");
        } else {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (26 != Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        C75105d.m90074e().mo104805i(getApplicationContext());
        this.f202000h.alive();
        mo96330H7();
        C51567um2 um22 = (C51567um2) ((C77049b) C86312j.m106911c(C77049b.class)).mo72358wi(this, 1, 3, C51567um2.class);
        if (um22 != null && "launch_type_offline_wallet".equals(um22.f142940d)) {
            WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct = new WC3DTouchHomeShortCutStruct();
            wC3DTouchHomeShortCutStruct.f10090d = 1;
            wC3DTouchHomeShortCutStruct.f10091e = 1;
            wC3DTouchHomeShortCutStruct.mo86054n();
            wC3DTouchHomeShortCutStruct.mo86056r();
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.WalletOfflineEntranceUI).mo86179qs(this, C76986a.Money);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f202000h.dead();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return true;
        }
        finish();
        return true;
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "onNewIntent");
        if (intent == null || !intent.hasExtra("is_offline_create")) {
            this.f201996d = false;
            this.f201999g = true;
            setIntent(intent);
            mo96330H7();
            return;
        }
        this.f201996d = true;
        this.f201999g = true;
        setIntent(intent);
        mo96330H7();
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onResume()");
        if (this.f201996d) {
            Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is true , finish activity");
            if (C76559f.m92115k()) {
                Log.m105926v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() true");
                Intent intent = new Intent();
                intent.putExtra("key_entry_scene", this.f201997e);
                intent.putExtra("key_from_scene", 0);
                return;
            }
            Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() false");
            return;
        }
        Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is false , not finish activity");
        this.f201996d = true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C78339d) {
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
                C8883h.f28150a = ((C78339d) yVar).mo108331j1();
                int i3 = this.f201998f;
                if (i3 == 6 || i3 == 7) {
                    Intent intent = new Intent();
                    if (this.f201999g) {
                        intent.putExtra("key_callback", "return");
                    } else {
                        intent.putExtra("key_callback", "ok");
                    }
                    setResult(-1, intent);
                }
                init();
                return true;
            }
            Log.m105925i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
            int i4 = this.f201998f;
            if (i4 == 6 || i4 == 7) {
                Intent intent2 = new Intent();
                intent2.putExtra("key_callback", "fail");
                setResult(0, intent2);
            }
            finish();
            return true;
        } else if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
            init();
            return true;
        } else {
            Log.m105925i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
            init();
            Log.m105920e("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd FAIL");
            finish();
            return false;
        }
    }
}
