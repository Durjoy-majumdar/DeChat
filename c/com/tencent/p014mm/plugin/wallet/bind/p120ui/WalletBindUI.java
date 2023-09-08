package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.WalletEndResultEvent;
import com.tencent.p014mm.autogen.events.WalletEntryChangeAccountEvent;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import ie3.C8883h;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import pe3.C47465a;
import t53.C77866b;
import te3.C64592nu;
import v53.C78339d;
import v53.C78342e0;
import w43.C78515c;
import y43.C79029b0;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI */
public class WalletBindUI extends WalletBaseUI {

    /* renamed from: r */
    public static final /* synthetic */ int f208474r = 0;

    /* renamed from: d */
    public PayInfo f208475d = new PayInfo();

    /* renamed from: e */
    public boolean f208476e = false;

    /* renamed from: f */
    public String f208477f;

    /* renamed from: g */
    public int f208478g = -1;

    /* renamed from: h */
    public String f208479h = null;

    /* renamed from: i */
    public boolean f208480i = false;

    /* renamed from: j */
    public String f208481j = null;

    /* renamed from: n */
    public C78339d f208482n = null;

    /* renamed from: o */
    public boolean f208483o = false;

    /* renamed from: p */
    public IListener f208484p;

    /* renamed from: q */
    public IListener<KindaBindCardEvent> f208485q;

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI$a */
    public class C71874a implements Runnable {
        public C71874a() {
        }

        public void run() {
            WalletBindUI walletBindUI = WalletBindUI.this;
            if (!walletBindUI.f208483o) {
                walletBindUI.mo99059I7();
                WalletBindUI walletBindUI2 = WalletBindUI.this;
                if (!walletBindUI2.f208483o) {
                    walletBindUI2.f208483o = true;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI$b */
    public class C71875b implements C77866b.C77873e {
        public C71875b() {
        }

        public void run(int i) {
            if (i == -1) {
                WalletBindUI.this.setResult(-1);
                WalletBindUI walletBindUI = WalletBindUI.this;
                int i2 = WalletBindUI.f208474r;
                walletBindUI.mo99061K7(-1);
                return;
            }
            WalletBindUI.this.setResult(0);
            WalletBindUI walletBindUI2 = WalletBindUI.this;
            int i3 = WalletBindUI.f208474r;
            walletBindUI2.mo99061K7(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI$c */
    public class C71876c implements C79148e.C79149a {
        public C71876c() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            return new Intent(WalletBindUI.this.getContext(), WalletBankcardManageUI.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI$d */
    public class C71877d implements DialogInterface.OnClickListener {
        public C71877d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBindUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI$e */
    public class C71878e implements DialogInterface.OnClickListener {
        public C71878e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBindUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI$f */
    public class C71879f implements DialogInterface.OnClickListener {
        public C71879f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBindUI.this.setResult(0);
            WalletBindUI walletBindUI = WalletBindUI.this;
            int i2 = WalletBindUI.f208474r;
            walletBindUI.mo99061K7(0);
            WalletBindUI.this.finish();
        }
    }

    public WalletBindUI() {
        C40008f fVar = C40008f.f107254d;
        this.f208484p = new IListener<WalletEntryChangeAccountEvent>(fVar) {
            {
                this.__eventId = 92672998;
            }

            public boolean callback(IEvent iEvent) {
                WalletEntryChangeAccountEvent walletEntryChangeAccountEvent = (WalletEntryChangeAccountEvent) iEvent;
                WalletBindUI.this.finish();
                return false;
            }
        };
        this.f208485q = new IListener<KindaBindCardEvent>(fVar) {
            {
                this.__eventId = 572563856;
            }

            public boolean callback(IEvent iEvent) {
                KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
                Log.m105924i("MicroMsg.WalletBindUI", "KindaBindCardEvent callback");
                if (kindaBindCardEvent == null) {
                    return false;
                }
                C75133p0.m90117a();
                KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
                if (aVar != null) {
                    WalletBindUI walletBindUI = WalletBindUI.this;
                    boolean z = aVar.f193699a;
                    boolean z2 = aVar.f193700b;
                    int i = WalletBindUI.f208474r;
                    walletBindUI.getClass();
                    if (z) {
                        Log.m105924i("MicroMsg.WalletBindUI", "kindaBindCardCallback bindCard Succ");
                        if (walletBindUI.f208478g == 4) {
                            walletBindUI.doSceneForceProgress(new C78342e0((String) null, 20));
                        } else {
                            walletBindUI.doSceneForceProgress(new C78342e0((String) null, 12));
                        }
                        if (z2 && walletBindUI.f208476e) {
                            walletBindUI.setResult(-1);
                            walletBindUI.mo99061K7(-1);
                            walletBindUI.finish();
                        }
                    } else {
                        Log.m105924i("MicroMsg.WalletBindUI", "kindaBindCardCallback bindCard Cancel");
                        if (z2 && walletBindUI.f208476e) {
                            walletBindUI.setResult(0);
                            walletBindUI.mo99061K7(0);
                            walletBindUI.finish();
                        }
                    }
                }
                WalletBindUI.this.f208485q.dead();
                return true;
            }
        };
    }

    /* renamed from: H7 */
    public final void mo99058H7() {
        if (C79029b0.vx0().wx0().mo91337s()) {
            doSceneForceProgress(new C78342e0((String) null, 12));
            return;
        }
        String str = getIntent().getStringExtra("packageExt") + "";
        String[] split = str.split("&");
        if (!Util.isNullOrNil(str) && split.length >= 2) {
            boolean z = false;
            String str2 = null;
            String str3 = null;
            for (String str4 : split) {
                if (str4.startsWith("bankType=")) {
                    str3 = str4.replace("bankType=", "");
                } else if (str4.startsWith("bankName=")) {
                    str2 = str4.replace("bankName=", "");
                }
            }
            if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str3)) {
                C67205s0 wx02 = C79029b0.vx0().wx0();
                wx02.getClass();
                if (!Util.isNullOrNil(str3)) {
                    ArrayList<Bankcard> arrayList = wx02.f192951d;
                    if (arrayList != null) {
                        Iterator<Bankcard> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Bankcard next = it.next();
                            if (str3.equals(next.field_bankcardType) && next.mo99394u2()) {
                                break;
                            }
                        }
                    }
                    ArrayList<Bankcard> arrayList2 = wx02.f192952e;
                    if (arrayList2 != null) {
                        Iterator<Bankcard> it4 = arrayList2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Bankcard next2 = it4.next();
                            if (str3.equals(next2.field_bankcardType) && next2.field_bankcardState == 0) {
                                break;
                            }
                        }
                    }
                    z = true;
                }
                if (z) {
                    Bundle bundle = new Bundle();
                    Bankcard bankcard = new Bankcard();
                    bankcard.field_bankName = str2;
                    bankcard.field_bankcardType = str3;
                    bundle.putParcelable("key_bankcard", bankcard);
                    bundle.putString("key_bank_type", bankcard.field_bankcardType);
                    C79143a.m95772k(this, "wxcredit", "WXCreditOpenProcess", bundle, (C79148e.C79149a) null);
                    return;
                }
            }
        }
        finish();
    }

    /* renamed from: I7 */
    public final void mo99059I7() {
        this.f208475d.f212586d = this.f208478g;
        getInput().putParcelable("key_pay_info", this.f208475d);
        int i = this.f208478g;
        if (i == 2) {
            if (!Util.isNullOrNil(this.f208477f)) {
                Log.m105918d("MicroMsg.WalletBindUI", "importKey " + this.f208477f);
                doSceneForceProgress(new C78515c(this.f208477f, this.f208475d));
                return;
            }
            mo99062L7("");
        } else if (i == 4) {
            C75133p0.m90118b(4);
            if (getIntent() == null) {
                mo99062L7("");
                return;
            }
            String stringExtra = getIntent().getStringExtra("appId");
            String stringExtra2 = getIntent().getStringExtra("timeStamp");
            String stringExtra3 = getIntent().getStringExtra("nonceStr");
            String stringExtra4 = getIntent().getStringExtra("packageExt");
            String stringExtra5 = getIntent().getStringExtra("signtype");
            String stringExtra6 = getIntent().getStringExtra("paySignature");
            String stringExtra7 = getIntent().getStringExtra("url");
            int intExtra = getIntent().getIntExtra("pay_channel", 0);
            if (this.f208478g == 6) {
                this.f208482n = new C78339d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, 2, "getBrandWCPayCreateCreditCardRequest", intExtra);
            } else {
                this.f208482n = new C78339d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, 1, "getBrandWCPayBindCardRequest", intExtra);
            }
            doSceneForceProgress(this.f208482n);
        } else if (i == 6) {
            mo99058H7();
        } else {
            mo99060J7(i);
        }
    }

    /* renamed from: J7 */
    public final void mo99060J7(int i) {
        Class<C77866b> cls = C77866b.class;
        Log.m105924i("MicroMsg.WalletBindUI", "doBindCardForOtherScene " + Util.getStack().toString());
        Bundle input = getInput();
        input.putParcelable("key_pay_info", this.f208475d);
        input.putBoolean("key_need_bind_response", true);
        input.putString("key_custom_bind_tips", getIntent().getStringExtra("key_custom_bind_tips"));
        boolean booleanExtra = getIntent().getBooleanExtra("from_kinda", false);
        if (booleanExtra) {
            input.putBoolean("is_from_new_cashier", true);
            input.putString("start_activity_class", getClass().getName());
        }
        if (C79029b0.vx0().wx0().mo91337s()) {
            Log.m105924i("MicroMsg.WalletBindUI", "user status invalid");
            if (i == 4) {
                doSceneForceProgress(new C78342e0((String) null, 20));
            } else {
                doSceneForceProgress(new C78342e0((String) null, 12));
            }
        } else if (C79029b0.vx0().wx0().mo91341w()) {
            Log.m105924i("MicroMsg.WalletBindUI", "user status reg");
            this.f208476e = true;
            PayInfo payInfo = this.f208475d;
            int i2 = this.f208478g;
            payInfo.f212586d = i2;
            input.putInt("key_bind_scene", i2);
            if (!Util.isNullOrNil(this.f208479h)) {
                input.putString("kreq_token", this.f208479h);
            }
            if (!this.f208480i || Util.isNullOrNil(this.f208481j)) {
                input.putBoolean("key_bind_card_can_pass_pwd", false);
            } else {
                input.putBoolean("key_bind_card_can_pass_pwd", true);
                input.putString("key_bind_card_user_token", this.f208481j);
            }
            String str = C8883h.f28150a;
            if (str != null) {
                input.putString("jsapi_reqkey", str);
            }
            if (C79144b.m95773a().mo109087b()) {
                this.f208485q.alive();
                mo99063M7(input);
                return;
            }
            getIntent().putExtra("process_id", cls.hashCode());
            C79143a.m95771j(this, cls, input, (C79148e.C79149a) null);
        } else {
            Log.m105924i("MicroMsg.WalletBindUI", "user status unreg");
            this.f208476e = true;
            int i3 = this.f208478g;
            if (i3 >= 0) {
                this.f208475d.f212586d = i3;
            } else {
                this.f208475d.f212586d = 1;
            }
            input.putInt("key_bind_scene", this.f208475d.f212586d);
            if (!this.f208480i || Util.isNullOrNil(this.f208481j)) {
                input.putBoolean("key_bind_card_can_pass_pwd", false);
            } else {
                input.putBoolean("key_bind_card_can_pass_pwd", true);
                input.putString("key_bind_card_user_token", this.f208481j);
            }
            if (C79144b.m95773a().mo109087b()) {
                this.f208485q.alive();
                mo99063M7(input);
                return;
            }
            getIntent().putExtra("process_id", cls.hashCode());
            C79143a.m95771j(this, cls, input, (C79148e.C79149a) null);
        }
        if (booleanExtra) {
            C79148e g = C79143a.m95768g(this);
            if (g instanceof C77866b) {
                ((C77866b) g).f226891d = new C71875b();
            }
        }
    }

    /* renamed from: K7 */
    public final void mo99061K7(int i) {
        if (getIntent().getBooleanExtra("from_kinda", false)) {
            WalletEndResultEvent walletEndResultEvent = new WalletEndResultEvent();
            walletEndResultEvent.f194034d.f194035a = i;
            walletEndResultEvent.publish();
        }
    }

    /* renamed from: L7 */
    public final void mo99062L7(String str) {
        if (Util.isNullOrNil(str)) {
            str = getString(C0966R.string.l_3);
        }
        C76879j.m92713G(this, str, (String) null, false, new C71879f());
    }

    /* renamed from: M7 */
    public final void mo99063M7(Bundle bundle) {
        Log.m105918d("MicroMsg.WalletBindUI", "startKindaBindCard");
        if (bundle != null) {
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
        } else {
            C75136r0.m90122d(6, 0);
            C75133p0.m90118b(0);
        }
        ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(this, bundle);
    }

    public boolean checkProcLife() {
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(580);
        this.f208477f = getIntent().getStringExtra("key_import_key");
        int i = -1;
        this.f208478g = getIntent().getIntExtra("key_req_bind_scene", -1);
        getWindow().setStatusBarColor(0);
        if (getIntent() != null) {
            i = getIntent().getIntExtra("key_req_bind_scene", 13);
        }
        WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
        if (i == 4) {
            walletGetUserInfoEvent.f194038d.f194040a = 20;
        } else {
            walletGetUserInfoEvent.f194038d.f194040a = 13;
        }
        walletGetUserInfoEvent.callback = new C71874a();
        walletGetUserInfoEvent.publish();
        this.f208484p.alive();
        C75136r0.m90122d(6, 0);
    }

    public void onDestroy() {
        removeSceneEndListener(580);
        this.f208484p.dead();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        if (intent == null) {
            Log.m105920e("MicroMsg.WalletBindUI", "onNewIntent intent null");
            setResult(0);
            mo99061K7(0);
            finish();
            return;
        }
        super.onNewIntent(intent);
        Log.m105926v("MicroMsg.WalletBindUI", "onNewIntent");
        setIntent(intent);
        if (intent.getBooleanExtra("intent_bind_end", false)) {
            Log.m105918d("MicroMsg.WalletBindUI", "pay done... errCode:" + intent.getBooleanExtra("intent_bind_end", false));
            setResult(-1, getIntent());
            mo99061K7(-1);
        } else {
            Log.m105924i("MicroMsg.WalletBindUI", "pay cancel");
            setResult(0);
            mo99061K7(0);
        }
        finish();
    }

    public void onPause() {
        super.onPause();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f208476e = bundle.getBoolean("key_is_jump", false);
    }

    public void onResume() {
        if (this.f208476e) {
            finish();
        }
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_jump", this.f208476e);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = yVar instanceof C78515c;
        if (z) {
            this.f208476e = true;
        }
        if (i != 0 || i2 != 0) {
            mo99062L7(str);
            return true;
        } else if (yVar instanceof C78342e0) {
            if (this.f208478g == 6) {
                mo99058H7();
            } else {
                mo99059I7();
            }
            return true;
        } else if (z) {
            C78515c cVar = (C78515c) yVar;
            Bundle input = getInput();
            input.putBoolean("key_is_import_bind", true);
            ArrayList<Bankcard> arrayList = cVar.f229969d;
            if (arrayList == null || arrayList.size() <= 0) {
                if (Util.isNullOrNil(str)) {
                    str = getString(C0966R.string.knf);
                }
                C76879j.m92713G(this, str, (String) null, false, new C71878e());
            } else {
                Bankcard bankcard = cVar.f229969d.get(0);
                if (!bankcard.f209426u2) {
                    input.putBoolean("key_need_bind_response", true);
                    input.putString("kreq_token", cVar.f229971f);
                    input.putString("key_bank_username", cVar.f229972g);
                    input.putString("key_recommand_desc", cVar.f229973h);
                    input.putParcelable("key_import_bankcard", bankcard);
                    this.f208476e = true;
                    input.putInt("key_bind_scene", 2);
                    C79143a.m95771j(this, C77866b.class, input, new C71876c());
                } else {
                    C76879j.m92744o(this, C0966R.string.kpc, 0, false, new C71877d());
                }
            }
            return true;
        } else {
            if (yVar instanceof C78339d) {
                C78339d dVar = this.f208482n;
                if (dVar == null || !dVar.equals(yVar)) {
                    C75133p0.m90117a();
                } else {
                    C78339d dVar2 = (C78339d) yVar;
                    C8883h.f28150a = dVar2.mo108331j1();
                    C47465a aVar = dVar2.f229547e.f127056b.f127083a;
                    this.f208479h = ((C64592nu) aVar).f184559f;
                    C64592nu nuVar = (C64592nu) aVar;
                    this.f208480i = nuVar.f184562i;
                    this.f208481j = nuVar.f184563j;
                    mo99060J7(4);
                    return true;
                }
            }
            return false;
        }
    }
}
