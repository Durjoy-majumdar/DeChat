package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import b63.C67203r0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanBankCardResultEvent;
import com.tencent.p014mm.autogen.events.WalletEntryChangeAccountEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletConfirmCardIDUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.ndk.Encrypt;
import di3.C86312j;
import gr3.C76024a;
import gr3.C76036c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import qo3.C77389a;
import qo3.C77398g;
import v53.C78342e0;
import v53.C78358z;
import y43.C79029b0;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI */
public class WalletForgotPwdUI extends WalletBaseUI implements WalletFormView.C75209c {

    /* renamed from: t */
    public static final /* synthetic */ int f208801t = 0;

    /* renamed from: d */
    public ArrayList<Bankcard> f208802d = new ArrayList<>();

    /* renamed from: e */
    public List<ElementQuery> f208803e = new LinkedList();

    /* renamed from: f */
    public Bankcard f208804f;

    /* renamed from: g */
    public C71991e f208805g;

    /* renamed from: h */
    public ListView f208806h;

    /* renamed from: i */
    public Button f208807i;

    /* renamed from: j */
    public LinearLayout f208808j;

    /* renamed from: n */
    public WalletFormView f208809n;

    /* renamed from: o */
    public WalletFormView f208810o;

    /* renamed from: p */
    public boolean f208811p = false;

    /* renamed from: q */
    public boolean f208812q = false;

    /* renamed from: r */
    public IListener f208813r;

    /* renamed from: s */
    public IListener f208814s;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI$a */
    public class C71987a extends C7089c0 {
        public C71987a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C115669n.INSTANCE.mo160131h(11353, 1, 0);
            WalletForgotPwdUI walletForgotPwdUI = WalletForgotPwdUI.this;
            int i = WalletForgotPwdUI.f208801t;
            walletForgotPwdUI.mo99198I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI$b */
    public class C71988b extends C7089c0 {
        public C71988b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletForgotPwdUI walletForgotPwdUI = WalletForgotPwdUI.this;
            C75228t.m90219L(walletForgotPwdUI, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_product.html?scene_id=kf3258", false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI$c */
    public class C71989c extends C7089c0 {
        public C71989c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C115669n.INSTANCE.mo160131h(11353, 2, 0);
            C75228t.m90265p0(WalletForgotPwdUI.this, C79029b0.vx0().wx0().mo91335q());
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI$d */
    public class C71990d implements Runnable {
        public C71990d() {
        }

        public void run() {
            SpannableString spannableString;
            WalletForgotPwdUI.this.f208805g.notifyDataSetChanged();
            WalletForgotPwdUI walletForgotPwdUI = WalletForgotPwdUI.this;
            walletForgotPwdUI.getClass();
            Class cls = C79173v.class;
            if (!"1".equals(((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_reset_passwd_flag)) {
                Log.m105924i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new");
            } else if (!Util.isNullOrNil(((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_find_passwd_url)) {
                Log.m105924i("MicroMsg.WalletForgotPwdUI", "hy: support bind new h5");
                ((ViewStub) walletForgotPwdUI.findViewById(C0966R.C0970id.ee5)).inflate();
                TextView textView = (TextView) walletForgotPwdUI.findViewById(C0966R.C0970id.ee6);
                C72478z zVar = new C72478z(walletForgotPwdUI);
                zVar.f210835d = new C72031c(walletForgotPwdUI);
                if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91338t()) {
                    String string = walletForgotPwdUI.getString(C0966R.string.l1m);
                    spannableString = new SpannableString(string);
                    spannableString.setSpan(zVar, string.length() - 12, string.length(), 33);
                } else {
                    String string2 = walletForgotPwdUI.getString(C0966R.string.l1n);
                    spannableString = new SpannableString(string2);
                    spannableString.setSpan(zVar, 0, string2.length(), 18);
                }
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                Log.m105924i("MicroMsg.WalletForgotPwdUI", "hy: support bind new directly");
                ((ViewStub) walletForgotPwdUI.findViewById(C0966R.C0970id.ee4)).inflate();
                ((WalletFormView) walletForgotPwdUI.findViewById(C0966R.C0970id.a_1)).setOnClickListener(new C72033d(walletForgotPwdUI));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI$e */
    public class C71991e extends BaseAdapter {

        /* renamed from: d */
        public Context f208820d;

        /* renamed from: e */
        public List<Bankcard> f208821e = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI$e$a */
        public class C71992a extends C7089c0 {

            /* renamed from: g */
            public final /* synthetic */ Bankcard f208823g;

            /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI$e$a$a */
            public class C71993a implements DialogInterface.OnClickListener {
                public C71993a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Context context = C71991e.this.f208820d;
                    C75228t.m90219L(context, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/sappfaq/180704b6Zb2q180704IfqY3u.html?scene_id=kf1&platform=15", true);
                }
            }

            public C71992a(Bankcard bankcard) {
                this.f208823g = bankcard;
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                Bankcard bankcard = this.f208823g;
                if (bankcard == null || bankcard.field_bankcardState != 1) {
                    WalletForgotPwdUI walletForgotPwdUI = WalletForgotPwdUI.this;
                    walletForgotPwdUI.f208804f = bankcard;
                    walletForgotPwdUI.f208811p = false;
                    walletForgotPwdUI.mo99198I7();
                    return;
                }
                Context context = C71991e.this.f208820d;
                C77389a aVar = new C77389a();
                aVar.f225660q = C0086a.m38a(context).getString(C0966R.string.ktb);
                aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.ktc);
                aVar.f225620C = new C71993a();
                aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f8029zr);
                aVar.f225668y = false;
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar);
                gVar.show();
            }
        }

        public C71991e(Context context) {
            this.f208820d = context;
        }

        public int getCount() {
            return this.f208821e.size();
        }

        public Object getItem(int i) {
            if (i < 0 || i > this.f208821e.size() - 1) {
                return null;
            }
            return this.f208821e.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Bankcard bankcard = null;
            WalletFormView walletFormView = view == null ? (WalletFormView) View.inflate(this.f208820d, C0966R.C0971layout.cdq, (ViewGroup) null) : (WalletFormView) view;
            if (i >= 0 && i <= this.f208821e.size() - 1) {
                bankcard = this.f208821e.get(i);
            }
            if (bankcard != null) {
                String str = bankcard.field_desc;
                if (bankcard.field_bankcardState == 1) {
                    str = str + this.f208820d.getString(C0966R.string.ktd);
                }
                walletFormView.setText(str);
            }
            walletFormView.setOnClickListener(new C71992a(bankcard));
            return walletFormView;
        }
    }

    public WalletForgotPwdUI() {
        C40008f fVar = C40008f.f107254d;
        this.f208813r = new IListener<ScanBankCardResultEvent>(fVar) {
            {
                this.__eventId = 96068484;
            }

            public boolean callback(IEvent iEvent) {
                ScanBankCardResultEvent scanBankCardResultEvent = (ScanBankCardResultEvent) iEvent;
                if (!(scanBankCardResultEvent instanceof ScanBankCardResultEvent)) {
                    Log.m105922f("MicroMsg.WalletForgotPwdUI", "mismatched ScanBankCardResultEvent event");
                    return false;
                }
                Encrypt encrypt = new Encrypt();
                String randomKey = encrypt.getRandomKey();
                String desedeEncode = encrypt.desedeEncode(scanBankCardResultEvent.f9465d.f9466a, randomKey);
                Bitmap bitmap = scanBankCardResultEvent.f9465d.f9467b;
                WalletForgotPwdUI walletForgotPwdUI = WalletForgotPwdUI.this;
                int i = WalletForgotPwdUI.f208801t;
                walletForgotPwdUI.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("key_bankcard_id", desedeEncode);
                bundle.putString("key_bankcard_des", randomKey);
                bundle.putParcelable("key_bankcard_cropimg", bitmap);
                bundle.putBoolean("key_is_reset_with_new_card", true);
                C79148e g = C79143a.m95768g(walletForgotPwdUI);
                if (g == null) {
                    return true;
                }
                g.mo109106E(walletForgotPwdUI, WalletConfirmCardIDUI.class, bundle, 1);
                return true;
            }
        };
        this.f208814s = new IListener<WalletEntryChangeAccountEvent>(this, fVar) {
            {
                this.__eventId = 92672998;
            }

            public /* bridge */ /* synthetic */ boolean callback(IEvent iEvent) {
                WalletEntryChangeAccountEvent walletEntryChangeAccountEvent = (WalletEntryChangeAccountEvent) iEvent;
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public final boolean mo99197H7() {
        if (this.f208806h.getVisibility() == 0 || (this.f208810o.mo105094l() && this.f208809n.mo105094l())) {
            this.f208807i.setEnabled(true);
            this.f208807i.setClickable(true);
            return true;
        }
        this.f208807i.setEnabled(false);
        this.f208807i.setClickable(false);
        return false;
    }

    /* renamed from: I7 */
    public final void mo99198I7() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_reset_with_new_card", getInput().getBoolean("key_is_reset_with_new_card", false));
        mo99199J7();
        if (this.f208804f == null && !this.f208811p) {
            doSceneProgress(new C78358z((String) null, this.f208809n.getText(), (PayInfo) null));
        } else if (this.f208811p) {
            C67203r0 jo = ((C79173v) C86312j.m106911c(C79173v.class)).Dx0().mo105873jo();
            if (!Util.isNullOrNil(jo.field_find_passwd_url)) {
                Log.m105924i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new bankcard. start to url");
                C75228t.m90219L(this, jo.field_find_passwd_url, false);
                return;
            }
            bundle.putBoolean("key_is_force_bind", true);
            bundle.putBoolean("key_is_reset_with_new_card", true);
            if (getProcess() != null) {
                getProcess().mo91264o(this, 0, bundle);
            }
        } else {
            C79148e g = C79143a.m95768g(this);
            bundle.putParcelable("key_bankcard", this.f208804f);
            ElementQuery elementQuery = new ElementQuery();
            Iterator<ElementQuery> it = this.f208803e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ElementQuery next = it.next();
                Log.m105924i("MicroMsg.WalletForgotPwdUI", "helios:::" + next.f209516s);
                if (!Util.isNullOrNil(next.f209516s) && !Util.isNullOrNil(this.f208804f.field_bankcardType) && next.f209516s.trim().equals(this.f208804f.field_bankcardType.trim())) {
                    elementQuery = next;
                    break;
                }
            }
            bundle.putParcelable("elemt_query", elementQuery);
            if (g != null) {
                g.mo91264o(this, 0, bundle);
            }
        }
    }

    /* renamed from: J7 */
    public final void mo99199J7() {
        getInput().remove("elemt_query");
        getInput().remove("key_bankcard");
        getInput().remove("bank_name");
        getInput().remove("key_card_id");
    }

    /* renamed from: K7 */
    public final void mo99200K7() {
        ArrayList<Bankcard> h = C79029b0.vx0().wx0().mo91326h();
        this.f208802d = h;
        if (h == null || h.size() == 0 || this.f208812q) {
            Log.m105925i("MicroMsg.WalletForgotPwdUI", "No bound bankcard process %s", Boolean.valueOf(this.f208812q));
            this.f208802d = new ArrayList<>();
            this.f208808j.setVisibility(0);
            this.f208806h.setVisibility(8);
            setMMTitle((int) C0966R.string.ksj);
            ((TextView) findViewById(C0966R.C0970id.lgz)).setText(getString(C0966R.string.l1r));
            this.f208810o.setText(C75228t.m90228U(C79029b0.vx0().wx0().mo91335q()));
            return;
        }
        Log.m105924i("MicroMsg.WalletForgotPwdUI", "domestic process!");
        if (C79143a.m95768g(this) != null) {
            doSceneForceProgress(new C78358z(3, (String) null, (String) null, (PayInfo) null, (String) null, -1, -1, 0));
        }
        this.f208808j.setVisibility(8);
        this.f208807i.setVisibility(8);
        View findViewById = findViewById(C0966R.C0970id.gza);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C71991e eVar = new C71991e(this);
        this.f208805g = eVar;
        this.f208806h.setAdapter(eVar);
        C71991e eVar2 = this.f208805g;
        eVar2.f208821e = this.f208802d;
        eVar2.notifyDataSetChanged();
    }

    public boolean checkProcLife() {
        return true;
    }

    public boolean getCancelable() {
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ceu;
    }

    public void initView() {
        this.f208806h = (ListView) findViewById(C0966R.C0970id.jeq);
        this.f208808j = (LinearLayout) findViewById(C0966R.C0970id.f358317ee1);
        this.f208810o = (WalletFormView) findViewById(C0966R.C0970id.h_9);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.au5);
        this.f208809n = walletFormView;
        C76024a.m91320a(walletFormView);
        if (getInput().getBoolean("key_is_paymanager", false)) {
            WalletFormView walletFormView2 = this.f208810o;
            if (walletFormView2 == null) {
                Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
            } else {
                walletFormView2.setOnInfoIvClickListener(new C76036c(this));
                walletFormView2.setFilterChar("\\x20\\t\\r\\n".toCharArray());
            }
        } else {
            C76024a.m91327h(this, this.f208810o);
        }
        this.f208810o.setOnInputValidChangeListener(this);
        this.f208809n.setOnInputValidChangeListener(this);
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        this.f208807i = button;
        button.setOnClickListener(new C71987a());
        this.f208811p = false;
        this.f208802d = C79029b0.vx0().wx0().mo91326h();
        mo99200K7();
        findViewById(C0966R.C0970id.gza).setOnClickListener(new C71988b());
        mo99197H7();
        setEditFocusListener(this.f208809n, 0, false, false);
        this.f208809n.setOnInfoIvClickListener(new C71989c());
        this.f208809n.getInfoIv().setClickable(true);
        this.f208809n.getInfoIv().setImageResource(C0966R.raw.wallet_scan_camera);
        this.f208809n.getInfoIv().setVisibility(0);
    }

    public boolean isTransparent() {
        ArrayList<Bankcard> arrayList = this.f208802d;
        if (arrayList != null && arrayList.size() != 0) {
            return false;
        }
        C67203r0 jo = ((C79173v) C86312j.m106911c(C79173v.class)).Dx0().mo105873jo();
        return !Util.isNullOrNil(jo.field_find_passwd_url) || !Util.isNullOrNil(jo.field_forget_passwd_url);
    }

    public boolean needConfirmFinish() {
        return !(this instanceof WalletForgotPwdBindNewUI);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i, intent);
        if (i2 == -1 && 1 == i) {
            this.f208809n.set3DesValStr(intent.getStringExtra("key_bankcard_id"));
            mo99198I7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f361593l30);
        boolean z = getInput().getBoolean("key_is_force_bind", false);
        this.f208812q = z;
        if (!z) {
            doSceneProgress(new C78342e0((String) null, 6));
            setContentViewVisibility(4);
        }
        initView();
        this.f208813r.alive();
        this.f208814s.alive();
    }

    public void onDestroy() {
        this.f208813r.dead();
        this.f208814s.dead();
        super.onDestroy();
    }

    public void onInputValidChange(boolean z) {
        mo99197H7();
    }

    public boolean onProgressFinish() {
        setContentViewVisibility(isTransparent() ? 4 : 0);
        return true;
    }

    public void onResume() {
        super.onResume();
        mo99200K7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C79173v.class;
        Log.m105925i("MicroMsg.WalletForgotPwdUI", " errCode: %s errMsg :  scene: ", Integer.valueOf(i2), str, yVar);
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78358z) {
                C78358z zVar = (C78358z) yVar;
                Bundle bundle = new Bundle();
                if (Util.isNullOrNil(zVar.f229623f)) {
                    this.f208803e = zVar.f229621d;
                    Log.m105924i("MicroMsg.WalletForgotPwdUI", "scene case 1 mCardId is null");
                    return true;
                }
                ElementQuery elementQuery = zVar.f229622e;
                if (elementQuery == null) {
                    bundle.putString("bank_name", "");
                    bundle.putParcelable("elemt_query", new ElementQuery());
                    bundle.putString("key_card_id", this.f208809n.getText());
                    bundle.putBoolean("key_is_reset_with_new_card", true);
                    C79143a.m95765d(this, bundle);
                } else if (elementQuery.mo99417c()) {
                    Log.m105924i("MicroMsg.WalletForgotPwdUI", "scene case 2 mTargetElement is error");
                    C76879j.m92738i(this, C0966R.string.kmh, C0966R.string.a3h);
                    return true;
                } else {
                    Object[] objArr = new Object[1];
                    ArrayList<Bankcard> arrayList = this.f208802d;
                    objArr[0] = Integer.valueOf(arrayList == null ? 0 : arrayList.size());
                    Log.m105925i("MicroMsg.WalletForgotPwdUI", "scene case 3 bankcards size %d", objArr);
                    ArrayList<Bankcard> arrayList2 = this.f208802d;
                    if (arrayList2 == null || arrayList2.size() == 0) {
                        mo99199J7();
                        bundle.putString("bank_name", zVar.f229622e.f209505e);
                        bundle.putParcelable("elemt_query", zVar.f229622e);
                        bundle.putString("key_card_id", this.f208809n.getText());
                        bundle.putBoolean("key_is_reset_with_new_card", true);
                        C79143a.m95765d(this, bundle);
                        return true;
                    }
                }
            } else if (yVar instanceof C78342e0) {
                Object[] objArr2 = new Object[1];
                objArr2[0] = Boolean.valueOf(this.f208805g == null);
                Log.m105925i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter is null ? %s", objArr2);
                if (this.f208805g != null) {
                    ArrayList<Bankcard> arrayList3 = null;
                    if (((C79173v) C86312j.m106911c(cls)).Ex0() != null) {
                        arrayList3 = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91326h();
                    }
                    C79148e g = C79143a.m95768g(this);
                    if (g != null) {
                        g.f232423c.getInt("key_support_bankcard", 1);
                        ArrayList<Bankcard> arrayList4 = new ArrayList<>();
                        ArrayList<Bankcard> arrayList5 = new ArrayList<>();
                        Iterator<Bankcard> it = arrayList3.iterator();
                        while (it.hasNext()) {
                            Bankcard next = it.next();
                            int i3 = next.field_bankcardTag;
                            if (i3 == 1) {
                                arrayList4.add(next);
                            } else if (i3 == 2) {
                                arrayList5.add(next);
                            }
                        }
                        if (arrayList4.size() > 0) {
                            this.f208802d = arrayList4;
                        } else {
                            this.f208802d = arrayList5;
                        }
                    }
                    Object[] objArr3 = new Object[1];
                    ArrayList<Bankcard> arrayList6 = this.f208802d;
                    objArr3[0] = Integer.valueOf(arrayList6 == null ? 0 : arrayList6.size());
                    Log.m105925i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter update bankcardsize:  %d", objArr3);
                    this.f208805g.f208821e = this.f208802d;
                    new MMHandler(Looper.getMainLooper()).post(new C71990d());
                }
            }
        }
        return false;
    }
}
