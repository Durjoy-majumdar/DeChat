package com.tencent.p014mm.plugin.wallet.wecoin.p124ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import de3.C75355a0;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ke3.C88144b;
import kotlin.Metadata;
import ob0.C117747y;
import p206nj.C11171e;
import p53.C11844l;
import p53.C11847n;
import q53.C12046a1;
import q53.C12050b1;
import q53.C12075h1;
import q53.C12110q0;
import q53.C12114r0;
import q53.C12120t0;
import q53.C47761g1;
import q53.C47762p0;
import q53.C47764s0;
import q53.C47765u0;
import q53.C47766w0;
import q53.C47768y0;
import q53.C47769z0;
import r53.C12953c;
import te3.g45;
import te3.h35;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView */
public class WeCoinEncashView extends WalletBaseUI {

    /* renamed from: v */
    public static WeakReference<C12075h1> f117264v = new WeakReference<>((Object) null);

    /* renamed from: d */
    public TextView f117265d;

    /* renamed from: e */
    public ViewGroup f117266e;

    /* renamed from: f */
    public WalletFormView f117267f;

    /* renamed from: g */
    public TextView f117268g;

    /* renamed from: h */
    public ScrollView f117269h;

    /* renamed from: i */
    public C11844l f117270i;

    /* renamed from: j */
    public CharSequence f117271j;

    /* renamed from: n */
    public boolean f117272n;

    /* renamed from: o */
    public int f117273o = MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1);

    /* renamed from: p */
    public int f117274p;

    /* renamed from: q */
    public ViewGroup f117275q;

    /* renamed from: r */
    public TextView f117276r;

    /* renamed from: s */
    public TextView f117277s;

    /* renamed from: t */
    public String f117278t;

    /* renamed from: u */
    public final Runnable f117279u = new C43364a(this);

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView$a */
    public static final class C43364a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WeCoinEncashView f117280d;

        public C43364a(WeCoinEncashView weCoinEncashView) {
            this.f117280d = weCoinEncashView;
        }

        public final void run() {
            this.f117280d.showNormalStWcKb();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView$b */
    public static final class C43365b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinEncashView f117281d;

        public C43365b(WeCoinEncashView weCoinEncashView) {
            this.f117281d = weCoinEncashView;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C11844l lVar = this.f117281d.f117270i;
            if (lVar != null) {
                lVar.mo11729e3(20);
                WeCoinEncashView weCoinEncashView = this.f117281d;
                weCoinEncashView.mPayResultType = 4;
                if (weCoinEncashView.needConfirmFinish()) {
                    this.f117281d.hideVKB();
                    this.f117281d.showDialog(1000);
                    return true;
                }
                this.f117281d.finish();
                return true;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView$c */
    public static final class C43366c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinEncashView f117282d;

        public C43366c(WeCoinEncashView weCoinEncashView) {
            this.f117282d = weCoinEncashView;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C11844l lVar = this.f117282d.f117270i;
            if (lVar != null) {
                h35 value = lVar.f34642q.getValue();
                if (!(value == null || (str = value.f134436f) == null)) {
                    C75228t.m90220M(this.f117282d, str, false, 1001);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    /* renamed from: H7 */
    public static final void m46890H7(WeCoinEncashView weCoinEncashView, g45 g45) {
        weCoinEncashView.getClass();
        Log.m105924i("MicroMsg.WeCoinEncashView", "startCheckPwdUI, params " + g45);
        C115669n.INSTANCE.mo175911u(1581, 93);
        if (g45 != null) {
            Intent intent = new Intent();
            intent.putExtra("appId", g45.f133849d);
            intent.putExtra("timeStamp", g45.f133852g);
            intent.putExtra("nonceStr", g45.f133854i);
            intent.putExtra("packageExt", g45.f133850e);
            intent.putExtra("signtype", g45.f133851f);
            intent.putExtra("paySignature", g45.f133853h);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
            C88144b.m109796n(weCoinEncashView, "wallet_core", ".ui.WalletCheckPwdUI", intent, 3001, false);
        }
    }

    /* renamed from: I7 */
    public final void mo67561I7(boolean z) {
        Log.m105925i("MicroMsg.WeCoinEncashView", "check enable: %s", Boolean.valueOf(z));
        if (!z || !this.f117272n) {
            this.mWcKeyboard.mo104738c(false);
        } else {
            this.mWcKeyboard.mo104738c(true);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6333bz;
    }

    public void initView() {
        setBackBtn(new C43365b(this));
        setActionbarColor(getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        View findViewById = findViewById(C0966R.C0970id.f7t);
        C87412m.m108593f(findViewById, "findViewById(R.id.input_money_wv)");
        this.f117267f = (WalletFormView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cjo);
        C87412m.m108593f(findViewById2, "findViewById(R.id.encash_money_title_tv)");
        this.f117265d = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.gkr);
        C87412m.m108593f(findViewById3, "findViewById(R.id.main_content)");
        this.f117266e = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.ksr);
        C87412m.m108593f(findViewById4, "findViewById(R.id.total_balance_hint)");
        this.f117268g = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.gb5);
        C87412m.m108593f(findViewById5, "findViewById(R.id.lqt_root_view)");
        this.f117269h = (ScrollView) findViewById5;
        WalletFormView walletFormView = this.f117267f;
        if (walletFormView != null) {
            walletFormView.getTitleTv().setText("¥");
            TextView textView = this.f117268g;
            if (textView != null) {
                textView.setText("");
                TextView textView2 = this.f117268g;
                if (textView2 != null) {
                    textView2.setClickable(true);
                    TextView textView3 = this.f117268g;
                    if (textView3 != null) {
                        textView3.setOnTouchListener(new C75355a0(this));
                        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.g9c)).getPaint(), 0.8f);
                        setMMTitle((int) C0966R.string.kll);
                        this.f117274p = 1;
                        View findViewById6 = findViewById(C0966R.C0970id.byg);
                        C87412m.m108593f(findViewById6, "findViewById(R.id.cut_tax_entrance)");
                        ViewGroup viewGroup = (ViewGroup) findViewById6;
                        this.f117275q = viewGroup;
                        viewGroup.setOnClickListener(new C43366c(this));
                        View findViewById7 = findViewById(C0966R.C0970id.byh);
                        C87412m.m108593f(findViewById7, "findViewById(R.id.cut_tax_title)");
                        this.f117276r = (TextView) findViewById7;
                        View findViewById8 = findViewById(C0966R.C0970id.byi);
                        C87412m.m108593f(findViewById8, "findViewById(R.id.cut_taxt_desc)");
                        this.f117277s = (TextView) findViewById8;
                        WcPayKeyboard wcPayKeyboard = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
                        this.mWcKeyboard = wcPayKeyboard;
                        ViewGroup.LayoutParams layoutParams = wcPayKeyboard.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.addRule(12);
                        this.mWcKeyboard.setLayoutParams(layoutParams2);
                        WalletFormView walletFormView2 = this.f117267f;
                        if (walletFormView2 != null) {
                            setWPKeyboard(walletFormView2.getContentEt(), false, false);
                            this.mWcKeyboard.setActionText(getString(C0966R.string.kll));
                            if (C11171e.m11045b(27)) {
                                WalletFormView walletFormView3 = this.f117267f;
                                if (walletFormView3 != null) {
                                    walletFormView3.mo105095m();
                                } else {
                                    C87412m.m108603p("mInputMoneyText");
                                    throw null;
                                }
                            }
                            ViewGroup viewGroup2 = this.f117266e;
                            if (viewGroup2 != null) {
                                viewGroup2.setOnTouchListener(new C47766w0(this));
                                mo67561I7(false);
                                WalletFormView walletFormView4 = this.f117267f;
                                if (walletFormView4 != null) {
                                    walletFormView4.mo105069a(new C47768y0(this));
                                    setTenpayKBStateListener(new C47769z0(this));
                                    C12050b1 b1Var = new C12050b1(this);
                                    WalletFormView walletFormView5 = this.f117267f;
                                    if (walletFormView5 != null) {
                                        walletFormView5.getContentEt().setOnEditorActionListener(new C12046a1(b1Var));
                                        long longExtra = getIntent().getLongExtra("wecoin_income_balance", 0);
                                        if (longExtra > 0) {
                                            String string = getString(C0966R.string.ljn, new Object[]{Double.valueOf(C12953c.m12393b(longExtra + "", "100", 2))});
                                            C87412m.m108593f(string, "getString(R.string.wecoi…igDecimal.ROUND_CEILING))");
                                            int length = string.length();
                                            SpannableString spannableString = new SpannableString(string + ' ' + getString(C0966R.string.ljo));
                                            spannableString.setSpan(new C7092q((C7092q.C7093a) new C47761g1(this, longExtra), true), length, spannableString.length(), 18);
                                            this.f117271j = spannableString;
                                            TextView textView4 = this.f117268g;
                                            if (textView4 != null) {
                                                textView4.setText(spannableString);
                                            } else {
                                                C87412m.m108603p("mTotalBalanceWithdrawTip");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        C87412m.m108603p("mInputMoneyText");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mInputMoneyText");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mainContent");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mInputMoneyText");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mTotalBalanceWithdrawTip");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mTotalBalanceWithdrawTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("mTotalBalanceWithdrawTip");
                throw null;
            }
        } else {
            C87412m.m108603p("mInputMoneyText");
            throw null;
        }
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        Log.m105919d("MicroMsg.WeCoinEncashView", "isHandleAutoShowNormalStWcKb() mWxKbInterceptState:%s isAutoShowNormalStWcKb:%s", Boolean.FALSE, Boolean.valueOf(this.mWcKeyboard.mo104746j()));
        return this.mWcKeyboard.mo104746j();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        Log.m105925i("MicroMsg.WeCoinEncashView", "onActivityResult() requestCode:%s, resultCode:%s", Integer.valueOf(i), Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        if (i != 3001) {
            return;
        }
        if (i2 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN) : null;
            this.f117278t = stringExtra;
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                z = false;
            }
            if (!z) {
                C115669n.INSTANCE.mo175911u(1581, 95);
                String str = this.f117278t;
                if (str != null) {
                    C11844l lVar = this.f117270i;
                    if (lVar != null) {
                        lVar.mo11727c3(str, (String) null, 0, this);
                    } else {
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                }
            } else {
                C11844l lVar2 = this.f117270i;
                if (lVar2 != null) {
                    lVar2.mo11729e3(5);
                    C115669n.INSTANCE.mo175911u(1581, 94);
                    return;
                }
                C87412m.m108603p("mViewModel");
                throw null;
            }
        } else if (i2 == 0) {
            C11844l lVar3 = this.f117270i;
            if (lVar3 != null) {
                lVar3.mo11729e3(5);
                C115669n.INSTANCE.mo175911u(1581, 94);
                return;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39622i0 a = C39629l0.m42233a(this, new C11847n(getIntent().getByteArrayExtra("WECOIN_TAX_CUT_ENTRANCE_INFO"), getIntent().getIntExtra("WECOIN_BUSINESS_ID", 1))).mo75002a(C11844l.class);
        C87412m.m108593f(a, "of(this, factory).get(We…ashViewModel::class.java)");
        this.f117270i = (C11844l) a;
        initView();
        C11844l lVar = this.f117270i;
        if (lVar != null) {
            lVar.f34642q.observe(this, new C47762p0(this));
            C11844l lVar2 = this.f117270i;
            if (lVar2 != null) {
                lVar2.f34633e.observe(this, new C12110q0(this));
                C11844l lVar3 = this.f117270i;
                if (lVar3 != null) {
                    lVar3.f34634f.observe(this, new C12114r0(this));
                    C11844l lVar4 = this.f117270i;
                    if (lVar4 != null) {
                        lVar4.f34635g.observe(this, new C47764s0(this));
                        C11844l lVar5 = this.f117270i;
                        if (lVar5 != null) {
                            lVar5.f34636h.observe(this, new C12120t0(this));
                            C11844l lVar6 = this.f117270i;
                            if (lVar6 != null) {
                                lVar6.f34637i.observe(this, new C47765u0(this));
                                C11844l lVar7 = this.f117270i;
                                if (lVar7 != null) {
                                    lVar7.f34641p = (WecoinEncashKVData) getIntent().getParcelableExtra("wecoin_enter_encash_business_kv_data");
                                } else {
                                    C87412m.m108603p("mViewModel");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mViewModel");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mViewModel");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        MMHandlerThread.removeRunnable(this.f117279u);
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.WeCoinEncashView", "onDialogDismiss()");
        if (this.f117274p == 2 && isHandleAutoShowNormalStWcKb()) {
            MMHandlerThread.postToMainThreadDelayed(this.f117279u, 300);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.WeCoinEncashView", "onPause()");
        if (!this.mWcKeyboard.mo104747k()) {
            this.f117274p = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.WeCoinEncashView", "onResume()");
        if (this.f117274p == 3 && isHandleAutoShowNormalStWcKb()) {
            MMHandlerThread.postToMainThreadDelayed(this.f117279u, 300);
        }
        this.f117274p = 2;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return true;
    }
}
