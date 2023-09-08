package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import a63.C67008a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b63.C67183e;
import b63.C67185g;
import b63.C67205s0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import e63.C75556b;
import eb0.C75592q0;
import g63.C75886j;
import gr3.C76024a;
import h81.C32735h;
import ie3.C76324c;
import ie3.C76331i;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import k53.C76492a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p755xs.C102720b;
import r43.C12942a;
import u43.C78129e;
import ub3.C78144b;
import v53.C78345h0;
import v53.C78351m0;
import y43.C79029b0;
import yq3.C79144b;
import yq3.C79148e;

@C88989a(2)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI */
public class WalletBalanceSaveUI extends WalletBaseUI implements WcPayKeyboard.C75086f {

    /* renamed from: A */
    public static final /* synthetic */ int f207831A = 0;

    /* renamed from: d */
    public double f207832d;

    /* renamed from: e */
    public ArrayList<Bankcard> f207833e;

    /* renamed from: f */
    public Bankcard f207834f;

    /* renamed from: g */
    public String f207835g;

    /* renamed from: h */
    public WalletFormView f207836h;

    /* renamed from: i */
    public LinearLayout f207837i;

    /* renamed from: j */
    public ViewGroup f207838j;

    /* renamed from: n */
    public LinearLayout f207839n;

    /* renamed from: o */
    public TextView f207840o;

    /* renamed from: p */
    public TextView f207841p;

    /* renamed from: q */
    public WcPayBannerView f207842q;

    /* renamed from: r */
    public C78351m0 f207843r;

    /* renamed from: s */
    public boolean f207844s = false;

    /* renamed from: t */
    public C76492a f207845t;

    /* renamed from: u */
    public String f207846u;

    /* renamed from: v */
    public boolean f207847v = false;

    /* renamed from: w */
    public int f207848w = 0;

    /* renamed from: x */
    public Runnable f207849x = new WalletBalanceSaveUI$$g(this);

    /* renamed from: y */
    public Runnable f207850y = new WalletBalanceSaveUI$$h(this);

    /* renamed from: z */
    public HashMap<String, Integer> f207851z = new HashMap<>();

    public WalletBalanceSaveUI() {
        C76577a.m92151b(MMApplicationContext.getContext(), 270);
    }

    /* renamed from: H7 */
    public void mo98874H7() {
        if (this.f207834f == null) {
            C67185g a = C67185g.m79463a();
            if (a.mo91288b()) {
                C76879j.m92748s(this, a.f192891b, getString(C0966R.string.a3h));
            } else if (mo98876J7()) {
                mo98877K7(this.f207832d, "CNY", "", "");
            } else {
                doSceneProgress(new C78129e(this.f207832d, "CNY", "", ""));
            }
        } else if (mo98876J7()) {
            double d = this.f207832d;
            Bankcard bankcard = this.f207834f;
            mo98877K7(d, "CNY", bankcard.field_bindSerial, bankcard.field_bankcardType);
        } else {
            double d2 = this.f207832d;
            Bankcard bankcard2 = this.f207834f;
            doSceneProgress(new C78129e(d2, "CNY", bankcard2.field_bindSerial, bankcard2.field_bankcardType));
        }
    }

    /* renamed from: I7 */
    public final void mo98875I7() {
        if (this.f207843r == null) {
            this.f207839n.setVisibility(8);
            return;
        }
        this.f207839n.setVisibility(0);
        this.f207840o.setText(this.f207843r.f229599a);
        this.f207841p.setText(this.f207843r.f229600b);
        this.f207839n.setOnClickListener(new WalletBalanceSaveUI$$f(this));
    }

    /* renamed from: J7 */
    public final boolean mo98876J7() {
        C79144b.m95773a().getClass();
        boolean c = C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_open_kinda_wallet_balance_save, false);
        Log.m105925i("MicroMsg.WalletBalanceSaveUI", "wallet balance save isOpenKinda isKindaEnable: %s，isKindaWalletBalanceSave: %s", Boolean.TRUE, Boolean.valueOf(c));
        return c;
    }

    /* renamed from: K7 */
    public final void mo98877K7(double d, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putInt("payScene", 11);
        bundle.putString("totalFee", C75228t.m90230W("" + d, "100", 0, RoundingMode.HALF_UP).toString());
        bundle.putString("feeType", str);
        bundle.putString("bankType", str3);
        bundle.putString("bindSerial", str2);
        bundle.putString("reportSessionId", this.f207846u);
        Log.m105925i("MicroMsg.WalletBalanceSaveUI", "startWalletBalanceSaveUseCase totalFee：%s reportSessionId %s", C75228t.m90230W("" + d, "100", 0, RoundingMode.HALF_UP).toString(), this.f207846u);
        this.f207847v = true;
        ((C76324c) C86312j.m106911c(C76324c.class)).startWalletBalanceSaveUseCase(this, bundle);
    }

    /* renamed from: L7 */
    public final void mo98878L7() {
        if (Util.getDouble(this.f207836h.getText(), 0.0d) <= 0.0d || !this.f207836h.mo105094l()) {
            this.mWcKeyboard.mo104738c(false);
        } else {
            this.mWcKeyboard.mo104738c(true);
        }
    }

    /* renamed from: M7 */
    public final void mo98879M7() {
        Class cls = C102720b.class;
        LinearLayout linearLayout = this.f207837i;
        if (linearLayout != null) {
            if (this.f207834f != null) {
                ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.f357503a72);
                Bankcard bankcard = this.f207834f;
                C67183e c = C75556b.m90593c(this, bankcard.field_bankcardType, bankcard.mo99394u2());
                String str = c != null ? c.f192875a : "";
                imageView.setImageBitmap((Bitmap) null);
                if (this.f207834f.mo99388n2()) {
                    imageView.setBackgroundResource(C0966R.C0969drawable.cek);
                } else {
                    Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(str));
                    ((C102720b) C86312j.m106911c(cls)).Lu0(new WalletBalanceSaveUI$$e(this, imageView));
                    if (N6 != null) {
                        imageView.setImageBitmap(BitmapUtil.extractThumbNail(N6, getResources().getDimensionPixelOffset(C0966R.dimen.atf), getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false));
                    }
                }
                Bankcard bankcard2 = this.f207834f;
                ((TextView) this.f207837i.findViewById(C0966R.C0970id.f357494a51)).setText(getString(C0966R.string.km6, new Object[]{bankcard2.field_bankName, bankcard2.field_bankcardTail}));
                if (!Util.isNullOrNil(this.f207834f.field_avail_save_wording)) {
                    ((TextView) this.f207837i.findViewById(C0966R.C0970id.ew6)).setText(this.f207834f.field_avail_save_wording);
                    ((TextView) this.f207837i.findViewById(C0966R.C0970id.ew6)).setVisibility(0);
                } else {
                    Log.m105924i("MicroMsg.WalletBalanceSaveUI", "hy: wording's missing. use default");
                    ((TextView) this.f207837i.findViewById(C0966R.C0970id.ew6)).setText("");
                }
            } else {
                ((TextView) linearLayout.findViewById(C0966R.C0970id.f357494a51)).setText(this.f207835g);
                ((TextView) this.f207837i.findViewById(C0966R.C0970id.ew6)).setText("");
                ((ImageView) this.f207837i.findViewById(C0966R.C0970id.f357503a72)).setImageBitmap((Bitmap) null);
            }
            ((TextView) this.f207837i.findViewById(C0966R.C0970id.ljn)).setText(C0966R.string.km5);
        }
    }

    /* renamed from: R2 */
    public void mo95768R2(float f) {
        ViewGroup viewGroup = this.f207838j;
        if (viewGroup != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.bottomMargin = (int) f;
            Log.m105919d("MicroMsg.WalletBalanceSaveUI", "onUpdateWcPayKeyboardHeight() height: %s rootView.height: %s", Float.valueOf(f), Integer.valueOf(layoutParams.height));
            this.f207838j.setLayoutParams(layoutParams);
        }
    }

    public final void fetchData() {
        C67205s0 wx02 = C79029b0.vx0().wx0();
        ArrayList<Bankcard> j = wx02.mo91328j();
        this.f207833e = j;
        Bankcard k = wx02.mo91329k(j, (String) null, false, true);
        this.f207834f = k;
        if (k != null && Util.isNullOrNil(k.field_forbidWord)) {
            this.f207834f = null;
            int i = 0;
            while (true) {
                if (i < this.f207833e.size()) {
                    if (this.f207833e.get(i) != null && Util.isNullOrNil(this.f207833e.get(i).field_forbidWord)) {
                        this.f207834f = this.f207833e.get(i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        Bankcard bankcard = this.f207834f;
        if (bankcard != null && !Util.isNullOrNil(bankcard.field_forbidWord)) {
            this.f207834f = null;
        }
        ArrayList<Bankcard> arrayList = this.f207833e;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Log.m105927v("MicroMsg.WalletBalanceSaveUI", "pos %s word %s", Integer.valueOf(i2), arrayList.get(i2).field_forbidWord);
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdp;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.kme);
        this.f207838j = (ViewGroup) findViewById(C0966R.C0970id.j0r);
        this.f207836h = (WalletFormView) findViewById(C0966R.C0970id.gym);
        this.f207839n = (LinearLayout) findViewById(C0966R.C0970id.ga4);
        this.f207840o = (TextView) findViewById(C0966R.C0970id.ga5);
        this.f207841p = (TextView) findViewById(C0966R.C0970id.f358655ga3);
        this.mWcKeyboard = new WcPayKeyboard(this);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f207842q = wcPayBannerView;
        wcPayBannerView.mo105020a();
        C76024a.m91326g(this.f207836h);
        this.f207836h.getTitleTv().setText(C45121z0.m49962b());
        this.mWcKeyboard.mo104737b(this, -1);
        setWPKeyboard(this.f207836h.getContentEt(), true, false);
        this.mWcKeyboard.setActionText(getString(C0966R.string.klo));
        ((C12942a) C39818r.f106831a.mo62444c(getContext()).mo75002a(C12942a.class)).setValue("keyboard_title_key", getString(C0966R.string.klo));
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "19";
        walletGetBulletinEvent.callback = new WalletBalanceSaveUI$$a(this, walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
        this.f207836h.mo105069a(new WalletBalanceSaveUI$$i(this));
        this.f207836h.getContentEt().setOnEditorActionListener(new WalletBalanceSaveUI$$b(this, new WalletBalanceSaveUI$$j(this)));
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f357493a50);
        this.f207837i = linearLayout;
        if (linearLayout != null) {
            C75228t.m90240d((TextView) linearLayout.findViewById(C0966R.C0970id.f357494a51));
            this.f207837i.setOnClickListener(new WalletBalanceSaveUI$$c(this));
        }
        setTenpayKBStateListener(new WalletBalanceSaveUI$$d(this));
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        Log.m105919d("MicroMsg.WalletBalanceSaveUI", "isHandleAutoShowNormalStWcKb() mWxKbInterceptState:%s isAutoShowNormalStWcKb:%s", Boolean.FALSE, Boolean.valueOf(this.mWcKeyboard.mo104746j()));
        return this.mWcKeyboard.mo104746j();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        this.f207846u = UUID.randomUUID().toString();
        if (!C75592q0.m90763K()) {
            doSceneProgress(new C78345h0((String) null, 3), false);
        }
        setActionbarColor(getResources().getColor(C0966R.color.BW_BG_95));
        hideActionbarLine();
        fetchData();
        this.f207835g = getString(C0966R.string.km8);
        initView();
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_BALANCE_LQT_OPERATION_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            try {
                this.f207843r = C78351m0.m94631a(new JSONObject(str));
                mo98875I7();
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.WalletBalanceSaveUI", e, "", new Object[0]);
            }
        }
        mo98879M7();
        C75136r0.m90122d(3, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        MMHandlerThread.removeRunnable(this.f207849x);
        MMHandlerThread.removeRunnable(this.f207850y);
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.WalletBalanceSaveUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f207849x, 300);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        if (!this.mWcKeyboard.mo104747k()) {
            this.f207848w = 3;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f207844s) {
            doSceneProgress(new C78345h0((String) null, 3), false);
        }
        if (this.f207848w == 3 && isHandleAutoShowNormalStWcKb() && !this.f207847v) {
            MMHandlerThread.postToMainThreadDelayed(this.f207850y, 300);
        }
        this.f207848w = 2;
        mo98878L7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C78129e eVar;
        boolean z;
        int i3 = i2;
        C117747y yVar2 = yVar;
        String str2 = "";
        if (i == 0 && i3 == 0) {
            if (yVar2 instanceof C78129e) {
                C78129e eVar2 = (C78129e) yVar2;
                if ("1".equals(eVar2.f228959e)) {
                    Log.m105924i("MicroMsg.WalletBalanceSaveUI", "need realname verify");
                    Bundle bundle = new Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceSaveUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet");
                    eVar = eVar2;
                    z = C67008a.m79172h(this, eVar2.f228960f, 0, eVar2.f228961g, eVar2.f228962h, bundle, isTransparent(), (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 0, 2);
                } else {
                    eVar = eVar2;
                    if ("2".equals(eVar.f228959e)) {
                        Log.m105924i("MicroMsg.WalletBalanceSaveUI", "need upload credit");
                        C67008a.m79173i(this, eVar.f228960f, eVar.f228963i, eVar.f228961g, eVar.f228962h, isTransparent(), (DialogInterface.OnClickListener) null);
                        z = true;
                    } else {
                        Log.m105924i("MicroMsg.WalletBalanceSaveUI", "realnameGuideFlag =  " + eVar.f228959e);
                        z = false;
                    }
                }
                if (z) {
                    return false;
                }
                String str3 = eVar.f228958d;
                C75155x0.m90137c(11, str3, i3);
                Bankcard bankcard = this.f207834f;
                if (bankcard != null) {
                    str2 = bankcard.field_bindSerial;
                }
                if (!Util.isNullOrNil(str3)) {
                    C76331i.m91762f(this, true, str2, C76331i.m91757a(str3, "", (String) null, (String) null, 11, 0), (String) null, new Intent(), 1);
                }
            } else if (yVar2 instanceof C78345h0) {
                C78345h0 h0Var = (C78345h0) yVar2;
                if (!this.f207844s) {
                    fetchData();
                    mo98879M7();
                }
                this.f207844s = false;
                this.f207843r = h0Var.f229580E;
                mo98875I7();
            }
        } else if (yVar2 instanceof C78129e) {
            C75155x0.m90137c(11, str2, i3);
            MMHandlerThread.postToMainThreadDelayed(this.f207849x, 300);
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12942a.class);
    }
}
