package com.tencent.p014mm.plugin.wallet_core.p125ui;

import a70.C112760b;
import al3.C0086a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanBankCardResultEvent;
import com.tencent.p014mm.autogen.events.WalletEntryChangeAccountEvent;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.ndk.Encrypt;
import di3.C86312j;
import e63.C75556b;
import f40.C86709a0;
import gc0.C20828a;
import gr3.C76024a;
import gr3.C76036c;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import qo3.C77389a;
import qo3.C77398g;
import v53.C78358z;
import y43.C79030d0;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI */
public class WalletBankcardIdUI extends WalletBaseUI implements WalletFormView.C75209c {

    /* renamed from: r */
    public static final /* synthetic */ int f209763r = 0;

    /* renamed from: d */
    public Button f209764d;

    /* renamed from: e */
    public WalletFormView f209765e;

    /* renamed from: f */
    public WalletFormView f209766f;

    /* renamed from: g */
    public TextView f209767g;

    /* renamed from: h */
    public Bankcard f209768h;

    /* renamed from: i */
    public C72210h f209769i;

    /* renamed from: j */
    public boolean f209770j = false;

    /* renamed from: n */
    public int f209771n = -1;

    /* renamed from: o */
    public boolean f209772o;

    /* renamed from: p */
    public IListener f209773p;

    /* renamed from: q */
    public IListener f209774q;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$a */
    public class C72203a implements View.OnClickListener {
        public C72203a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(11353, 1, 0);
            WalletBankcardIdUI walletBankcardIdUI = WalletBankcardIdUI.this;
            if (walletBankcardIdUI.getProcess() == null) {
                Log.m105920e("Micromsg.WalletInputCardIDUI", "WalletBankcardIdUI doNext, process is null");
            } else {
                String string = walletBankcardIdUI.getProcess().f232423c.getString("kreq_token");
                int i = walletBankcardIdUI.getInput().getInt("entry_scene", -1);
                int i2 = walletBankcardIdUI.getInput().getInt("real_name_verify_mode") == 4 ? 1 : 0;
                if (walletBankcardIdUI.f209768h != null) {
                    C78358z zVar = new C78358z(walletBankcardIdUI.getPayReqKey(), (String) null, (PayInfo) walletBankcardIdUI.getInput().getParcelable("key_pay_info"), string, walletBankcardIdUI.f209771n, i, i2);
                    zVar.f229624g = walletBankcardIdUI.f209768h.field_bankcardType;
                    walletBankcardIdUI.getInput().putParcelable("key_history_bankcard", walletBankcardIdUI.f209768h);
                    walletBankcardIdUI.doSceneProgress(zVar);
                } else if (walletBankcardIdUI.mo99494H7()) {
                    walletBankcardIdUI.doSceneProgress(new C78358z(walletBankcardIdUI.getPayReqKey(), walletBankcardIdUI.f209765e.getText(), (PayInfo) walletBankcardIdUI.getInput().getParcelable("key_pay_info"), string, walletBankcardIdUI.f209771n, i, i2));
                } else {
                    C76879j.m92738i(walletBankcardIdUI, C0966R.string.kzl, C0966R.string.a3h);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$b */
    public class C72204b implements C72478z.C72479a {
        public C72204b() {
        }

        public void onClick(View view) {
            Log.m105924i("Micromsg.WalletInputCardIDUI", "hy: clickable span on click");
            WalletBankcardIdUI walletBankcardIdUI = WalletBankcardIdUI.this;
            int i = WalletBankcardIdUI.f209763r;
            LayoutInflater layoutInflater = (LayoutInflater) walletBankcardIdUI.getContext().getSystemService("layout_inflater");
            TextView textView = (TextView) layoutInflater.inflate(C0966R.C0971layout.azz, (ViewGroup) null);
            textView.setText(walletBankcardIdUI.getString(C0966R.string.kq9));
            int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            C76879j.m92752w(walletBankcardIdUI.getContext(), walletBankcardIdUI.getString(C0966R.string.kq8), walletBankcardIdUI.getString(C0966R.string.ktq), textView, new C72426s(walletBankcardIdUI));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$c */
    public class C72205c implements View.OnClickListener {
        public C72205c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBankcardIdUI.this.showDialog(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$d */
    public class C72206d implements TextWatcher {
        public C72206d() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (WalletBankcardIdUI.this.f209765e.mo105094l()) {
                WalletBankcardIdUI walletBankcardIdUI = WalletBankcardIdUI.this;
                if (!walletBankcardIdUI.f209770j) {
                    walletBankcardIdUI.f209770j = true;
                    walletBankcardIdUI.f209765e.mo105071c();
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$e */
    public class C72207e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RealNameBundle f209781d;

        public C72207e(RealNameBundle realNameBundle) {
            this.f209781d = realNameBundle;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0039, code lost:
            r8 = r7.f209781d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$6"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r0 = 11353(0x2c59, float:1.5909E-41)
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3 = 0
                r2[r3] = r1
                r1 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r1] = r3
                r8.mo160131h(r0, r2)
                com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI r8 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI.this
                boolean r8 = r8.f209772o
                if (r8 == 0) goto L_0x004a
                com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle r8 = r7.f209781d
                if (r8 == 0) goto L_0x004a
                java.lang.String r8 = r8.f209301d
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 != 0) goto L_0x004a
                com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle r8 = r7.f209781d
                java.lang.String r8 = r8.f209301d
                goto L_0x005a
            L_0x004a:
                java.lang.Class<yz.v> r8 = p281yz.C79173v.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                yz.v r8 = (p281yz.C79173v) r8
                b63.s0 r8 = r8.Ex0()
                java.lang.String r8 = r8.mo91335q()
            L_0x005a:
                com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI.this
                com.tencent.p014mm.wallet_core.p137ui.C75228t.m90265p0(r0, r8)
                java.lang.String r8 = "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$6"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI.C72207e.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$f */
    public class C72208f implements DialogInterface.OnClickListener {
        public C72208f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((RealNameVerifyProcess) WalletBankcardIdUI.this.getProcess()).mo91257c(WalletBankcardIdUI.this, 0);
            WalletBankcardIdUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$g */
    public class C72209g implements DialogInterface.OnClickListener {
        public C72209g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBankcardIdUI walletBankcardIdUI = WalletBankcardIdUI.this;
            int i2 = WalletBankcardIdUI.f209763r;
            View findFocus = walletBankcardIdUI.getContentView() == null ? null : WalletBankcardIdUI.this.getContentView().findFocus();
            if (findFocus != null && (findFocus instanceof EditText)) {
                WalletBankcardIdUI.this.showVKB();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$h */
    public static class C72210h extends BaseAdapter {

        /* renamed from: d */
        public LayoutInflater f209785d = null;

        /* renamed from: e */
        public List<C79030d0> f209786e = new LinkedList();

        /* renamed from: f */
        public Context f209787f;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI$h$a */
        public class C72211a {

            /* renamed from: a */
            public ImageView f209788a;

            /* renamed from: b */
            public TextView f209789b;

            /* renamed from: c */
            public TextView f209790c;

            /* renamed from: d */
            public TextView f209791d;

            public C72211a(C72210h hVar) {
            }
        }

        public C72210h(Context context, List<C79030d0> list) {
            this.f209785d = LayoutInflater.from(context);
            this.f209786e = list;
            this.f209787f = context;
        }

        public int getCount() {
            List<C79030d0> list = this.f209786e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f209786e.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C72211a aVar;
            if (view == null) {
                view = this.f209785d.inflate(C0966R.C0971layout.ce4, viewGroup, false);
                aVar = new C72211a(this);
                aVar.f209788a = (ImageView) view.findViewById(C0966R.C0970id.lfe);
                aVar.f209789b = (TextView) view.findViewById(C0966R.C0970id.lfd);
                aVar.f209790c = (TextView) view.findViewById(C0966R.C0970id.lfg);
                aVar.f209791d = (TextView) view.findViewById(C0966R.C0970id.lff);
                view.setTag(aVar);
            } else {
                aVar = (C72211a) view.getTag();
            }
            C79030d0 d0Var = (C79030d0) getItem(i);
            if (!Util.isNullOrNil(d0Var.f232058t)) {
                aVar.f209789b.setText(d0Var.f232058t);
                aVar.f209789b.setVisibility(0);
            } else {
                aVar.f209789b.setVisibility(8);
            }
            if (!Util.isNullOrNil(d0Var.f232050i)) {
                aVar.f209790c.setText(d0Var.f232050i);
                aVar.f209790c.setVisibility(0);
            } else {
                aVar.f209790c.setVisibility(8);
            }
            if (!Util.isNullOrNil(d0Var.f232052n)) {
                aVar.f209791d.setText(d0Var.f232052n);
                aVar.f209791d.setVisibility(0);
            } else {
                aVar.f209791d.setVisibility(8);
            }
            String str = d0Var.f232059u;
            Log.m105926v("Micromsg.WalletInputCardIDUI", "bankType:" + d0Var.f232057s + ", logurl:" + str);
            aVar.f209788a.setImageBitmap((Bitmap) null);
            if (!Util.isNullOrNil(str)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C112760b.m154195C();
                bVar.f59350f = C75556b.m90591a(str);
                bVar.f59346b = true;
                bVar.f59363s = true;
                C20828a.m22825b().mo32519h(str, aVar.f209788a, bVar.mo32666a());
            }
            return view;
        }
    }

    public WalletBankcardIdUI() {
        C40008f fVar = C40008f.f107254d;
        this.f209773p = new IListener<WalletEntryChangeAccountEvent>(fVar) {
            {
                this.__eventId = 92672998;
            }

            public boolean callback(IEvent iEvent) {
                WalletEntryChangeAccountEvent walletEntryChangeAccountEvent = (WalletEntryChangeAccountEvent) iEvent;
                WalletBankcardIdUI.this.finish();
                return false;
            }
        };
        this.f209774q = new IListener<ScanBankCardResultEvent>(fVar) {
            {
                this.__eventId = 96068484;
            }

            public boolean callback(IEvent iEvent) {
                ScanBankCardResultEvent scanBankCardResultEvent = (ScanBankCardResultEvent) iEvent;
                if (!(scanBankCardResultEvent instanceof ScanBankCardResultEvent)) {
                    Log.m105922f("Micromsg.WalletInputCardIDUI", "mismatched ScanBankCardResultEvent event");
                    return false;
                }
                Encrypt encrypt = new Encrypt();
                String randomKey = encrypt.getRandomKey();
                String desedeEncode = encrypt.desedeEncode(scanBankCardResultEvent.f9465d.f9466a, randomKey);
                Bitmap bitmap = scanBankCardResultEvent.f9465d.f9467b;
                WalletBankcardIdUI walletBankcardIdUI = WalletBankcardIdUI.this;
                int i = WalletBankcardIdUI.f209763r;
                walletBankcardIdUI.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("key_bankcard_id", desedeEncode);
                bundle.putString("key_bankcard_des", randomKey);
                bundle.putParcelable("key_bankcard_cropimg", bitmap);
                C79148e g = C79143a.m95768g(walletBankcardIdUI);
                if (g != null) {
                    g.mo109103B(walletBankcardIdUI, WalletConfirmCardIDUI.class, bundle);
                }
                return true;
            }
        };
    }

    /* renamed from: H7 */
    public final boolean mo99494H7() {
        if (this.f209765e.mo105070b((View) null)) {
            this.f209764d.setEnabled(true);
            this.f209764d.setClickable(true);
            return true;
        }
        this.f209764d.setEnabled(false);
        this.f209764d.setClickable(false);
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdx;
    }

    public void initView() {
        Class cls = C79173v.class;
        this.f209764d = (Button) findViewById(C0966R.C0970id.hfe);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.aw9);
        this.f209765e = walletFormView;
        C76024a.m91320a(walletFormView);
        this.f209766f = (WalletFormView) findViewById(C0966R.C0970id.h_9);
        if (getInput().getBoolean("key_bind_show_change_card", false)) {
            WalletFormView walletFormView2 = this.f209766f;
            if (walletFormView2 == null) {
                Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
            } else {
                walletFormView2.setOnInfoIvClickListener(new C76036c(this));
                walletFormView2.setFilterChar("\\x20\\t\\r\\n".toCharArray());
            }
        } else {
            C76024a.m91327h(this, this.f209766f);
        }
        this.f209765e.setOnInputValidChangeListener(this);
        this.f209764d.setOnClickListener(new C72203a());
        C79148e process = getProcess();
        if (process != null) {
            this.f209772o = process.f232423c.getBoolean("key_is_realname_verify_process", false);
        } else {
            this.f209772o = false;
        }
        if (this.f209772o) {
            setMMTitle((int) C0966R.string.l6b);
        } else {
            setMMTitle((int) C0966R.string.kuv);
        }
        this.f209767g = (TextView) findViewById(C0966R.C0970id.f7w);
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91343y() || ((C79173v) C86312j.m106911c(cls)).Ex0().mo91342x()) {
            C72478z zVar = new C72478z(this);
            zVar.f210835d = new C72204b();
            String string = getString(C0966R.string.kuo);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(zVar, string.length() - 6, string.length(), 33);
            this.f209767g.setText(spannableString);
            this.f209767g.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            this.f209767g.setVisibility(0);
            String string2 = getInput().getString("key_custom_bind_tips");
            if (!Util.isNullOrNil(string2)) {
                this.f209767g.setText(string2);
            }
        }
        FavorPayInfo favorPayInfo = (FavorPayInfo) getInput().getParcelable("key_favor_pay_info");
        Orders orders = (Orders) getInput().getParcelable("key_orders");
        if (!(favorPayInfo == null || orders == null)) {
            C72394l a = C72400m.INSTANCE.mo99776a(orders);
            TextView textView = (TextView) findViewById(C0966R.C0970id.lfx);
            if (a != null) {
                String c = a.mo99767c(favorPayInfo.f209524d, false);
                LinkedList linkedList = new LinkedList();
                if (a.f210614a.f232072h != null) {
                    Map<String, C72394l.C72395a> b = a.mo99766b(c, false);
                    for (int i = 0; i < a.f210614a.f232072h.size(); i++) {
                        C79030d0 d0Var = a.f210614a.f232072h.get(i);
                        if (d0Var != null) {
                            if (d0Var.f232056r != 0) {
                                if (((HashMap) b).containsKey(d0Var.f232057s)) {
                                    linkedList.add(d0Var);
                                }
                            }
                        }
                    }
                } else {
                    Log.m105928w("MicroMsg.FavorLogicHelper", "fucn[getBankFavorListWithSelectedCompId] mFavorInfo.tradeFavList null");
                }
                if (linkedList.size() > 0) {
                    this.f209769i = new C72210h(getContext(), linkedList);
                    textView.setText(C0966R.string.kum);
                    textView.setOnClickListener(new C72205c());
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            } else {
                Log.m105928w("Micromsg.WalletInputCardIDUI", "favorlogichelper null");
                textView.setVisibility(8);
            }
        }
        RealNameBundle realNameBundle = (RealNameBundle) getInput().getParcelable("realname_verify_process_bundle");
        C67205s0 Ex0 = ((C79173v) C86312j.m106911c(cls)).Ex0();
        if (this.f209772o && realNameBundle != null && !Util.isNullOrNil(realNameBundle.f209301d)) {
            this.f209766f.setVisibility(0);
            this.f209766f.setText(realNameBundle.f209301d);
            this.f209765e.setHint(getString(C0966R.string.kpn));
            this.f209766f.setClickable(false);
            this.f209766f.setEnabled(false);
            this.f209767g.setText(C0966R.string.kuu);
        } else if (!Ex0.mo91341w() || Ex0.mo91335q() == null || Util.isNullOrNil(Ex0.mo91335q().trim()) || !Ex0.mo91338t()) {
            this.f209766f.setVisibility(8);
            this.f209765e.setHint(getString(C0966R.string.kuq));
        } else {
            this.f209766f.setVisibility(0);
            this.f209766f.setText(Ex0.mo91335q());
            this.f209765e.setHint(getString(C0966R.string.kpn));
            this.f209766f.setClickable(false);
            this.f209766f.setEnabled(false);
        }
        if (getInput().getInt("key_bind_scene") == 18 || getInput().getInt("key_bind_scene") == 19) {
            this.f209765e.setHint(getString(C0966R.string.kus));
        }
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_SUPPORT_BANK_WORD_STRING, (Object) null);
        if (!Util.isNullOrNil(str)) {
            this.f209765e.setHint(str);
        }
        Bankcard bankcard = (Bankcard) getInput().getParcelable("key_history_bankcard");
        this.f209768h = bankcard;
        if (bankcard != null) {
            this.f209765e.setText(bankcard.f209410e2);
            this.f209765e.mo105069a(new C72206d());
        }
        mo99494H7();
        C72517z.m84856d(this, getInput(), 2);
        setEditFocusListener(this.f209765e, 0, false);
        this.f209765e.setOnInfoIvClickListener(new C72207e(realNameBundle));
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91334p().mo91307g()) {
            this.f209765e.getInfoIv().setVisibility(0);
            this.f209765e.getInfoIv().setImageResource(C0966R.raw.wallet_scan_camera);
        }
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.kuv);
        initView();
        this.f209773p.alive();
        this.f209774q.alive();
        this.f209771n = getInput().getInt("key_bind_scene");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            View inflate = getLayoutInflater().inflate(C0966R.C0971layout.cf4, (ViewGroup) null);
            ((ListViewInScrollView) inflate.findViewById(C0966R.C0970id.f5610jr)).setAdapter(this.f209769i);
            C77389a aVar = new C77389a();
            aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.kul);
            aVar.f225627J = inflate;
            aVar.f225622E = null;
            aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.ktq);
            C77398g gVar = new C77398g(this, C0966R.style.a66);
            gVar.mo107525e(aVar);
            return gVar;
        } else if (!this.f209772o || i != 1000) {
            return super.onCreateDialog(i);
        } else {
            String string = getString(C0966R.string.kun);
            C79148e g = C79143a.m95768g(this);
            int q = g != null ? g.mo91266q(this, 1) : -1;
            if (q != -1) {
                string = getString(q);
            }
            return C76879j.m92717K(this, true, string, "", getString(C0966R.string.a4h), getString(C0966R.string.f360090a14), new C72208f(), new C72209g());
        }
    }

    public void onDestroy() {
        this.f209773p.dead();
        this.f209774q.dead();
        super.onDestroy();
    }

    public void onInputValidChange(boolean z) {
        if (!z) {
            this.f209768h = null;
            getInput().putParcelable("key_history_bankcard", (Parcelable) null);
        }
        mo99494H7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("Micromsg.WalletInputCardIDUI", " errCode: " + i2 + " errMsg :" + str);
        Bundle bundle = new Bundle();
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78358z) {
                C78358z zVar = (C78358z) yVar;
                bundle.putBoolean("key_need_area", zVar.f229626i == 1);
                bundle.putBoolean("key_need_profession", zVar.f229627j == 1);
                bundle.putParcelableArray("key_profession_list", zVar.f229628n);
                bundle.putBoolean("key_need_country", zVar.f229629o == 1);
                bundle.putStringArray("key_country_excludes", zVar.f229630p);
                ElementQuery elementQuery = zVar.f229622e;
                if (elementQuery == null) {
                    bundle.putString("bank_name", "");
                    bundle.putParcelable("elemt_query", new ElementQuery());
                    bundle.putString("key_card_id", this.f209765e.getText());
                    C79143a.m95765d(this, bundle);
                } else if (!elementQuery.f209513p || !elementQuery.mo99417c()) {
                    bundle.putString("bank_name", zVar.f229622e.f209505e);
                    bundle.putParcelable("elemt_query", zVar.f229622e);
                    bundle.putString("key_card_id", this.f209765e.getText());
                    C79143a.m95765d(this, bundle);
                    return true;
                } else {
                    C76879j.m92738i(this, C0966R.string.kmh, C0966R.string.a3h);
                    return true;
                }
            }
        } else if (i2 == 1 && (yVar instanceof C78358z)) {
            bundle.putString("bank_name", "");
            bundle.putParcelable("elemt_query", new ElementQuery());
            bundle.putString("key_card_id", this.f209765e.getText());
            C79143a.m95765d(this, bundle);
            return true;
        }
        return false;
    }
}
