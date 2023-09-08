package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import oi2.C77010f;
import p196ln.C76705f;
import p206nj.C11171e;
import p629ny.C76979h;
import st1.C77781t;
import t14.C77820c;
import te3.C50158kp;
import yq3.C79148e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI */
public class RemittanceResultNewUI extends RemittanceResultUI {

    /* renamed from: E */
    public static int[] f205158E;

    /* renamed from: A */
    public C50158kp f205159A;

    /* renamed from: B */
    public boolean f205160B = false;

    /* renamed from: C */
    public IListener<WalletPayResultEvent> f205161C = new IListener<WalletPayResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 520089918;
        }

        public boolean callback(IEvent iEvent) {
            Log.m105924i("MicroMsg.RemittanceResultNewUI", "receive pay result event, do finish");
            int i = ((WalletPayResultEvent) iEvent).f194085d.f194087b;
            if (i != 1000 && i != 1001) {
                return false;
            }
            Log.m105924i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
            C79148e process = RemittanceResultNewUI.this.getProcess();
            if (process != null) {
                process.mo109119z(RemittanceResultNewUI.this);
            }
            new MMHandler().postDelayed(new C70933p1(this), 100);
            return false;
        }
    };

    /* renamed from: D */
    public int f205162D = 0;

    /* renamed from: e */
    public Orders f205163e;

    /* renamed from: f */
    public int f205164f;

    /* renamed from: g */
    public String f205165g;

    /* renamed from: h */
    public boolean f205166h;

    /* renamed from: i */
    public PayInfo f205167i;

    /* renamed from: j */
    public ViewGroup f205168j;

    /* renamed from: n */
    public TextView f205169n;

    /* renamed from: o */
    public WalletTextView f205170o;

    /* renamed from: p */
    public ViewGroup f205171p;

    /* renamed from: q */
    public ViewGroup f205172q;

    /* renamed from: r */
    public TextView f205173r;

    /* renamed from: s */
    public TextView f205174s;

    /* renamed from: t */
    public TextView f205175t;

    /* renamed from: u */
    public ViewGroup f205176u;

    /* renamed from: v */
    public TextView f205177v;

    /* renamed from: w */
    public TextView f205178w;

    /* renamed from: x */
    public WalletTextView f205179x;

    /* renamed from: y */
    public WalletSuccPageAwardWidget f205180y;

    /* renamed from: z */
    public C77820c f205181z;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI$a */
    public class C70839a extends C7089c0 {
        public C70839a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            RemittanceResultNewUI remittanceResultNewUI = RemittanceResultNewUI.this;
            int[] iArr = RemittanceResultNewUI.f205158E;
            remittanceResultNewUI.mo97502L7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI$b */
    public class C70840b implements C11184p0 {
        public C70840b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            if (Util.isEqual(RemittanceResultNewUI.this.f205162D, (int) C0966R.C0970id.im5)) {
                str = RemittanceResultNewUI.this.f205173r.getText().toString().trim();
            } else if (Util.isEqual(RemittanceResultNewUI.this.f205162D, (int) C0966R.C0970id.ila)) {
                StringBuilder sb = new StringBuilder();
                sb.append(RemittanceResultNewUI.this.f205174s.getText().toString().trim() + " ");
                String trim = RemittanceResultNewUI.this.f205175t.getText().toString().trim();
                if (trim.endsWith(RemittanceResultNewUI.this.getString(C0966R.string.i0l))) {
                    sb.append(trim.substring(0, trim.length() - 4));
                } else {
                    sb.append(trim);
                }
                str = sb.toString();
            } else {
                str = "";
            }
            ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, str);
            RemittanceResultNewUI remittanceResultNewUI = RemittanceResultNewUI.this;
            C76879j.m92726T(remittanceResultNewUI, remittanceResultNewUI.getString(C0966R.string.f7938wv));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI$c */
    public class C70841c implements DialogInterface.OnClickListener {
        public C70841c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RemittanceResultNewUI remittanceResultNewUI = RemittanceResultNewUI.this;
            int[] iArr = RemittanceResultNewUI.f205158E;
            remittanceResultNewUI.mo97501K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI$d */
    public class C70842d implements DialogInterface.OnClickListener {
        public C70842d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RemittanceResultNewUI remittanceResultNewUI = RemittanceResultNewUI.this;
            int[] iArr = RemittanceResultNewUI.f205158E;
            remittanceResultNewUI.mo97501K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI$e */
    public class C70843e implements Runnable {
        public C70843e() {
        }

        public void run() {
            RemittanceResultNewUI remittanceResultNewUI = RemittanceResultNewUI.this;
            int i = remittanceResultNewUI.f205164f;
            if (i == 33 || i == 32 || i == 48) {
                remittanceResultNewUI.finish();
            } else if (Util.isNullOrNil(remittanceResultNewUI.f205165g) || RemittanceResultNewUI.this.f205166h) {
                RemittanceResultNewUI.this.finish();
            } else {
                Intent intent = new Intent();
                intent.putExtra("Chat_User", RemittanceResultNewUI.this.f205165g);
                intent.putExtra("finish_direct", false);
                C88144b.m109801s(RemittanceResultNewUI.this, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            }
        }
    }

    public RemittanceResultNewUI() {
        new C70840b();
    }

    /* renamed from: J7 */
    public static int m83355J7(Context context, String str, int i) {
        int b = C76577a.m92151b(context, 16);
        if (f205158E == null) {
            f205158E = KeyBoardUtil.getScreenWH(context);
        }
        boolean z = false;
        int b2 = ((f205158E[0] - C76577a.m92151b(context, 88)) - i) / b;
        int length = str.length();
        int i2 = length / b2;
        if (i2 > 2 || (i2 == 2 && length % b2 > 0)) {
            z = true;
        }
        return z ? (b2 * 2) - 5 : str.length();
    }

    /* renamed from: K7 */
    public final void mo97501K7() {
        Log.m105924i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
        getProcess().mo91259f(this, getInput());
        new MMHandler().postDelayed(new C70843e(), 100);
    }

    /* renamed from: L7 */
    public final void mo97502L7() {
        Log.m105924i("MicroMsg.RemittanceResultNewUI", "endRemittance");
        if (getInput().containsKey("key_realname_guide_helper")) {
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
                bundle.putString("realname_verify_process_jump_plugin", "remittance");
                realnameGuideHelper.mo99370a(this, bundle, new C70841c(), (C79148e.C79149a) null);
                realnameGuideHelper.mo99372c(this, bundle, new C70842d(), (C79148e.C79149a) null, false);
                getInput().remove("key_realname_guide_helper");
                return;
            }
            return;
        }
        mo97501K7();
    }

    /* renamed from: M7 */
    public final View mo97503M7() {
        Orders orders = this.f205163e;
        if (orders == null) {
            return null;
        }
        boolean z = true;
        Object[] objArr = new Object[1];
        if (orders.f209569n <= 0.0d) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.RemittanceResultNewUI", "need set charge fee: %s", objArr);
        if (this.f205163e.f209569n <= 0.0d) {
            return null;
        }
        String string = getString(C0966R.string.i2v);
        Orders orders2 = this.f205163e;
        String m = C75228t.m90258m(orders2.f209569n, orders2.f209568j);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.a5_, this.f205172q, false);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.kpm)).setText(string);
        ((ImageView) viewGroup.findViewById(C0966R.C0970id.a27)).setVisibility(8);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.c2h)).setText(m);
        this.f205172q.addView(viewGroup);
        return viewGroup;
    }

    /* renamed from: N7 */
    public final ViewGroup mo97504N7(String str, boolean z) {
        Class cls = C76705f.class;
        Log.m105924i("MicroMsg.RemittanceResultNewUI", "setF2FNameView");
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.a5c, this.f205172q, false);
            CdnImageView cdnImageView = (CdnImageView) viewGroup.findViewById(C0966R.C0970id.ils);
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.id5);
            if (!Util.isNullOrNil(this.f205165g) || this.f205167i.f212600u == null) {
                ((C76705f) C86312j.m106911c(cls)).D20(cdnImageView, this.f205165g, 0.06f);
            } else {
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 56.0f);
                cdnImageView.setRoundCorner(true);
                cdnImageView.mo100288c(this.f205167i.f212600u.getString("extinfo_key_27"), fromDPToPix, fromDPToPix, C0966R.C0969drawable.bfa);
            }
            textView.setText(str);
            this.f205172q.addView(viewGroup);
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.a5b, this.f205172q, false);
        CdnImageView cdnImageView2 = (CdnImageView) viewGroup2.findViewById(C0966R.C0970id.ils);
        TextView textView2 = (TextView) viewGroup2.findViewById(C0966R.C0970id.id5);
        if (!Util.isNullOrNil(this.f205165g) || this.f205167i.f212600u == null) {
            ((C76705f) C86312j.m106911c(cls)).D20(cdnImageView2, this.f205165g, 0.06f);
        } else {
            int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 28.0f);
            cdnImageView2.setRoundCorner(true);
            cdnImageView2.mo100288c(this.f205167i.f212600u.getString("extinfo_key_27"), fromDPToPix2, fromDPToPix2, C0966R.C0969drawable.bfa);
        }
        textView2.setText(str);
        this.f205172q.addView(viewGroup2);
        return viewGroup2;
    }

    public void finish() {
        Log.m105925i("MicroMsg.RemittanceResultNewUI", "finish this %s %s", this, Util.getStack());
        if (!this.f205160B) {
            super.finish();
            this.f205160B = true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bru;
    }

    public void initView() {
        ViewGroup viewGroup;
        Bundle bundle;
        ViewGroup viewGroup2 = null;
        setBackBtn((MenuItem.OnMenuItemClickListener) null);
        showHomeBtn(false);
        enableBackMenu(false);
        TextView textView = (TextView) findViewById(C0966R.C0970id.hsb);
        this.f205168j = (ViewGroup) findViewById(C0966R.C0970id.cot);
        this.f205169n = (TextView) findViewById(C0966R.C0970id.col);
        this.f205170o = (WalletTextView) findViewById(C0966R.C0970id.coj);
        this.f205171p = (ViewGroup) findViewById(C0966R.C0970id.coq);
        this.f205172q = (ViewGroup) findViewById(C0966R.C0970id.cor);
        this.f205176u = (ViewGroup) findViewById(C0966R.C0970id.hhs);
        this.f205177v = (TextView) findViewById(C0966R.C0970id.hhr);
        this.f205178w = (TextView) findViewById(C0966R.C0970id.hhm);
        this.f205179x = (WalletTextView) findViewById(C0966R.C0970id.hhl);
        ((Button) findViewById(C0966R.C0970id.kto)).setOnClickListener(new C70839a());
        this.f205180y = (WalletSuccPageAwardWidget) findViewById(C0966R.C0970id.a2p);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.imz);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0966R.C0970id.f359067im3);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(C0966R.C0970id.il_);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(C0966R.C0970id.ila);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.im8);
        this.f205173r = (TextView) findViewById(C0966R.C0970id.im5);
        this.f205174s = (TextView) findViewById(C0966R.C0970id.h_c);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.f5618jz);
        this.f205175t = (TextView) findViewById(C0966R.C0970id.f5617jy);
        String r = C75228t.m90268r(this.f205165g);
        int i = this.f205164f;
        if (i == 31 || i == 5) {
            this.f205178w.setText(C75228t.m90266q(this.f205163e.f209568j));
            this.f205179x.setText(C75228t.m90260n(this.f205163e.f209566h));
            if (this.f205164f == 31) {
                String string = getString(C0966R.string.i2y, new Object[]{r});
                if (!Util.isNullOrNil(string)) {
                    this.f205177v.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, string, this.f205177v.getTextSize()));
                } else {
                    this.f205177v.setVisibility(8);
                }
            } else {
                Bundle bundle2 = this.f205167i.f212600u;
                boolean z = bundle2 != null && bundle2.getBoolean("extinfo_key_10");
                Log.m105925i("MicroMsg.RemittanceResultNewUI", "isEmojiReward: %s", Boolean.valueOf(z));
                if (z) {
                    this.f205177v.setText(getString(C0966R.string.i1q));
                } else {
                    List<Orders.Commodity> list = this.f205163e.f209542M;
                    if (!(list == null || ((ArrayList) list).get(0) == null || TextUtils.isEmpty(((Orders.Commodity) ((ArrayList) this.f205163e.f209542M).get(0)).f209598g))) {
                        this.f205177v.setText(((Orders.Commodity) ((ArrayList) this.f205163e.f209542M).get(0)).f209598g);
                    }
                }
            }
            this.f205176u.setVisibility(0);
            if (this.f205163e.f209569n > 0.0d) {
                mo97503M7();
                ((ViewGroup.MarginLayoutParams) this.f205171p.getLayoutParams()).topMargin = C76577a.m92151b(this, 20);
                this.f205171p.setVisibility(0);
                this.f205172q.setVisibility(0);
            }
        } else {
            byte[] byteArray = getInput().getByteArray("key_succpage_resp");
            if (byteArray != null) {
                C50158kp kpVar = new C50158kp();
                this.f205159A = kpVar;
                try {
                    kpVar.parseFrom(byteArray);
                    this.f205181z = this.f205159A.f136924g;
                } catch (Exception e) {
                    this.f205159A = null;
                    this.f205181z = null;
                    Log.printErrStackTrace("MicroMsg.RemittanceResultNewUI", e, "parse f2FPaySucPageResp error: %s", e.getMessage());
                }
            }
            String r2 = C75228t.m90268r(this.f205165g);
            this.f205169n.setText(C75228t.m90266q(this.f205163e.f209568j));
            this.f205170o.setText(C75228t.m90260n(this.f205163e.f209566h));
            this.f205172q.removeAllViews();
            int i2 = this.f205164f;
            if (i2 == 32 || i2 == 33 || i2 == 48) {
                if (Util.isNullOrNil(r2) && (bundle = this.f205167i.f212600u) != null) {
                    r2 = bundle.getString("extinfo_key_28");
                }
                Bundle bundle3 = this.f205167i.f212600u;
                String string2 = bundle3 != null ? bundle3.getString("extinfo_key_2") : "";
                if (r2 != null && r2.length() > 10) {
                    r2 = r2.substring(0, 10) + "...";
                }
                if (!Util.isNullOrNil(string2)) {
                    if (!Util.isNullOrNil(r2)) {
                        string2 = r2 + "(" + C75228t.m90270s(string2) + ")";
                    }
                    r2 = string2;
                }
                Log.m105924i("MicroMsg.RemittanceResultNewUI", "setF2FReceiverRemarkView");
                String string3 = this.f205167i.f212600u.getString("extinfo_key_3");
                String string4 = this.f205167i.f212600u.getString("extinfo_key_8");
                if (!Util.isNullOrNil(string3)) {
                    viewGroup = (ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.a5a, this.f205172q, false);
                    TextView textView4 = (TextView) viewGroup.findViewById(C0966R.C0970id.kpm);
                    TextView textView5 = (TextView) viewGroup.findViewById(C0966R.C0970id.c2h);
                    if (!Util.isNullOrNil(string4)) {
                        textView4.setText(string4);
                    } else {
                        textView4.setText(getString(C0966R.string.bg8));
                    }
                    textView5.setText(string3);
                } else {
                    viewGroup = null;
                }
                Log.m105924i("MicroMsg.RemittanceResultNewUI", "setF2FPayerRemarkView");
                String string5 = this.f205167i.f212600u.getString("extinfo_key_6");
                String string6 = this.f205167i.f212600u.getString("extinfo_key_7");
                if (!Util.isNullOrNil(string6)) {
                    viewGroup2 = (ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.a5a, this.f205172q, false);
                    TextView textView6 = (TextView) viewGroup2.findViewById(C0966R.C0970id.kpm);
                    TextView textView7 = (TextView) viewGroup2.findViewById(C0966R.C0970id.c2h);
                    if (!Util.isNullOrNil(string5)) {
                        textView6.setText(string5);
                    } else {
                        textView6.setText(getString(C0966R.string.bg7));
                    }
                    textView7.setText(string6);
                }
                ViewGroup viewGroup3 = viewGroup2;
                View M7 = mo97503M7();
                boolean z2 = viewGroup == null && viewGroup3 == null && M7 == null;
                this.f205171p.setVisibility(0);
                this.f205172q.setVisibility(0);
                if (WalletSuccPageAwardWidget.m84798e(this.f205181z)) {
                    String str = ((ArrayList) this.f205163e.f209542M).size() > 0 ? ((Orders.Commodity) ((ArrayList) this.f205163e.f209542M).get(0)).f209606r : "";
                    Log.m105925i("MicroMsg.RemittanceResultNewUI", "transId: %s", str);
                    this.f205180y.mo99841n(this, this.f205181z, str, true, (ImageView) findViewById(C0966R.C0970id.a3a));
                    this.f205180y.mo99834g();
                    this.f205180y.setVisibility(0);
                    mo97504N7(r2, false);
                } else {
                    this.f205180y.setVisibility(8);
                    mo97504N7(r2, z2);
                }
                if (viewGroup != null) {
                    this.f205172q.addView(viewGroup);
                }
                if (viewGroup3 != null) {
                    this.f205172q.addView(viewGroup3);
                }
                if (M7 != null) {
                    this.f205172q.addView(M7);
                }
            }
            this.f205168j.setVisibility(0);
        }
        ((C77781t) C86312j.m106911c(C77781t.class)).mo107897LJ(this);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        if (C11171e.m11046c(21)) {
            if (C11171e.m11046c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.al6));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.BW_90));
            }
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        this.f205161C.alive();
        this.f205163e = (Orders) getInput().getParcelable("key_orders");
        PayInfo payInfo = (PayInfo) getInput().getParcelable("key_pay_info");
        this.f205167i = payInfo;
        if (payInfo == null) {
            Log.m105920e("MicroMsg.RemittanceResultNewUI", "payInfo is null!!!");
            finish();
            return;
        }
        Bundle bundle2 = payInfo.f212600u;
        if (bundle2 != null) {
            this.f205166h = bundle2.getBoolean("extinfo_key_4");
            str = this.f205167i.f212600u.getString("extinfo_key_1");
            str2 = this.f205167i.f212600u.getString("extinfo_key_16");
        } else {
            str = "";
            str2 = str;
        }
        int i = this.f205167i.f212587e;
        this.f205164f = i;
        this.f205165g = str;
        Log.m105925i("MicroMsg.RemittanceResultNewUI", "payScene: %s", Integer.valueOf(i));
        initView();
        if (this.f205164f == 31) {
            Log.m105925i("MicroMsg.RemittanceResultNewUI", "transId: %s", str2);
            C77010f.vx0().xx0().mo97262d(str2, this.f205165g, "");
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        contextMenu.add(0, 0, 0, getString(C0966R.string.f7936wt));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f205161C.dead();
        if (WalletSuccPageAwardWidget.m84798e(this.f205181z)) {
            this.f205180y.mo99837j();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            mo97502L7();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        if (WalletSuccPageAwardWidget.m84798e(this.f205181z)) {
            this.f205180y.mo99838k();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return WalletSuccPageAwardWidget.m84798e(this.f205181z) ? this.f205180y.mo99839l(i, i2, str, yVar) : super.onSceneEnd(i, i2, str, yVar);
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceResultNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
