package com.tencent.p014mm.wallet_core.p137ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PayLoopInterruptEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C45120z;
import com.tencent.p014mm.wallet_core.model.C75117g0;
import com.tencent.p014mm.wallet_core.model.C75125m;
import com.tencent.p014mm.wallet_core.model.C75127o;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.C7112R;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;
import cr3.C75278c;
import cr3.C75281f;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76332j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C117747y;
import p156gj.C87199n;
import p156gj.C87203t;
import p206nj.C11171e;
import rt3.C22252b;
import ub3.C78144b;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79145c;
import yq3.C79148e;

/* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI */
public abstract class WalletBaseUI extends MMSecDataActivity implements C75281f, C75125m {
    public static final int CLEAN_UI_DATA_ACTION_CODE_CLEAN_PASSWORD = 1;
    public static final int CLEAN_UI_DATA_ACTION_CODE_DEFAULT = 0;
    public static final int DIALOG_ID_CONFIRM_FINISH = 1000;
    public static final int HARDCODE_TENPAY_KEYBOARD_HEIGHT = C76577a.m92151b(MMApplicationContext.getContext(), 270);
    private static final String TAG = "MicroMsg.WalletBaseUI";
    private static Set<String> mLockSet = new HashSet();
    private boolean _hasFinish = false;
    private byte _hellAccFlag_;
    private MenuItem.OnMenuItemClickListener backListener;
    private LinkedList<C75127o> callbacks = new LinkedList<>();
    public boolean isVKBFirstTimeShown = false;
    private Bundle mBundle = new Bundle();
    private C75117g0 mCurrentNetScene = null;
    private boolean mIsAuthDoing;
    public View mKBLayout;
    public MyKeyboardWindow mKeyboard;
    public boolean mKindaEnable;
    private C75282g mNetController = null;
    public C75296i mNetSceneMgr = null;
    private IListener<PayLoopInterruptEvent> mPayLoopInterruptListener = new IListener<PayLoopInterruptEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1264607315;
        }

        public boolean callback(IEvent iEvent) {
            if (1 != ((PayLoopInterruptEvent) iEvent).f193821d.f193822a) {
                return false;
            }
            WalletBaseUI.this.finish();
            return false;
        }
    };
    public int mPayResultType = 0;
    private C79148e mProcess = null;
    private C79148e.C79149a mProcessEnd;
    private Dialog mProgressDialog;
    private C75217h mTenpayKBStateListener;
    /* access modifiers changed from: private */
    public Dialog mTipDialog = null;
    public WcPayKeyboard mWcKeyboard;
    private MenuItem.OnMenuItemClickListener nextListener;

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$i */
    public class C45122i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f122393d;

        public C45122i(boolean z) {
            this.f122393d = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (this.f122393d) {
                WalletBaseUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$k */
    public class C45123k implements MenuItem.OnMenuItemClickListener {
        public C45123k() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletBaseUI walletBaseUI = WalletBaseUI.this;
            walletBaseUI.mPayResultType = 4;
            if (walletBaseUI.needConfirmFinish()) {
                WalletBaseUI.this.hideVKB();
                WalletBaseUI.this.showDialog(1000);
                return true;
            }
            WalletBaseUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$p */
    public class C45124p implements View.OnClickListener {
        public C45124p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/WalletBaseUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBaseUI.this.showNormalStWcKb();
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/WalletBaseUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$a */
    public class C75169a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f221177d;

        /* renamed from: e */
        public final /* synthetic */ int f221178e;

        /* renamed from: f */
        public final /* synthetic */ EditText f221179f;

        public C75169a(boolean z, int i, EditText editText) {
            this.f221177d = z;
            this.f221178e = i;
            this.f221179f = editText;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/WalletBaseUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!WalletBaseUI.this.mKBLayout.isShown() && !this.f221177d) {
                WalletBaseUI.this.showTenpayKB();
                WalletBaseUI.this.setKBMode(this.f221178e);
            } else if (this.f221177d) {
                WalletBaseUI.this.hideTenpayKB();
                ((InputMethodManager) WalletBaseUI.this.getContext().getSystemService("input_method")).showSoftInput(this.f221179f, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/WalletBaseUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$b */
    public class C75170b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f221181d;

        public C75170b(WalletBaseUI walletBaseUI, EditText editText) {
            this.f221181d = editText;
        }

        public void run() {
            if (this.f221181d.findFocus() == null) {
                this.f221181d.requestFocus();
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$c */
    public class C75171c implements View.OnClickListener {
        public C75171c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/WalletBaseUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBaseUI.this.hideTenpayKB();
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/WalletBaseUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$d */
    public class C75172d extends C75282g {
        public C75172d(WalletBaseUI walletBaseUI, MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$e */
    public class C75173e implements DialogInterface.OnCancelListener {
        public C75173e() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            WalletBaseUI.this.forceCancel();
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$f */
    public class C75174f implements DialogInterface.OnCancelListener {
        public C75174f(WalletBaseUI walletBaseUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$g */
    public class C75175g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f221184d;

        /* renamed from: e */
        public final /* synthetic */ int f221185e;

        public C75175g(WalletBaseUI walletBaseUI, View view, int i) {
            this.f221184d = view;
            this.f221185e = i;
        }

        public void run() {
            this.f221184d.scrollBy(0, this.f221185e);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$h */
    public class C75176h implements DialogInterface.OnCancelListener {
        public C75176h() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (WalletBaseUI.this.mTipDialog != null && WalletBaseUI.this.mTipDialog.isShowing()) {
                WalletBaseUI.this.mTipDialog.dismiss();
            }
            if (WalletBaseUI.this.getContentView().getVisibility() == 8 || WalletBaseUI.this.getContentView().getVisibility() == 4) {
                Log.m105924i(WalletBaseUI.TAG, "usr cancel, & visibility not visiable, so finish");
                WalletBaseUI.this.finish();
            }
            WalletBaseUI.this.forceCancel();
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$j */
    public class C75177j implements DialogInterface.OnClickListener {
        public C75177j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C79143a.m95764c(WalletBaseUI.this, (Bundle) null, -10000);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$l */
    public class C75178l implements DialogInterface.OnClickListener {
        public C75178l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBaseUI.this.cancelQRPay();
            C79148e g = C79143a.m95768g(WalletBaseUI.this);
            WalletBaseUI walletBaseUI = WalletBaseUI.this;
            walletBaseUI.mPayResultType = 4;
            if (g == null) {
                walletBaseUI.finish();
            } else if (!g.mo106737v(walletBaseUI, walletBaseUI.getInput())) {
                WalletBaseUI walletBaseUI2 = WalletBaseUI.this;
                g.mo91259f(walletBaseUI2, walletBaseUI2.getInput());
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$m */
    public class C75179m implements DialogInterface.OnClickListener {
        public C75179m() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            View findFocus = WalletBaseUI.this.getContentView() == null ? null : WalletBaseUI.this.getContentView().findFocus();
            if (findFocus != null) {
                boolean z = findFocus instanceof EditText;
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$n */
    public class C75180n implements View.OnFocusChangeListener {

        /* renamed from: d */
        public boolean f221190d = true;

        /* renamed from: e */
        public final /* synthetic */ boolean f221191e;

        /* renamed from: f */
        public final /* synthetic */ EditText f221192f;

        /* renamed from: g */
        public final /* synthetic */ View.OnFocusChangeListener f221193g;

        /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$n$a */
        public class C75181a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f221195d;

            public C75181a(View view) {
                this.f221195d = view;
            }

            public void run() {
                if (!WalletBaseUI.this.mWcKeyboard.isShown() && this.f221195d.isShown()) {
                    C75180n nVar = C75180n.this;
                    if (nVar.f221191e || !nVar.f221190d) {
                        WalletBaseUI.this.showNormalStWcKb();
                    }
                    C75180n.this.f221190d = false;
                }
                C75180n nVar2 = C75180n.this;
                WalletBaseUI.this.mWcKeyboard.setInputEditText(nVar2.f221192f);
                ((InputMethodManager) WalletBaseUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f221195d.getWindowToken(), 0);
            }
        }

        /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$n$b */
        public class C75182b implements Runnable {
            public C75182b() {
            }

            public void run() {
                WalletBaseUI.this.hideWcKb();
            }
        }

        public C75180n(boolean z, EditText editText, View.OnFocusChangeListener onFocusChangeListener) {
            this.f221191e = z;
            this.f221192f = editText;
            this.f221193g = onFocusChangeListener;
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                ((InputMethodManager) WalletBaseUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                new MMHandler().postDelayed(new C75181a(view), 300);
            } else {
                new MMHandler().postDelayed(new C75182b(), 200);
            }
            View.OnFocusChangeListener onFocusChangeListener = this.f221193g;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$o */
    public class C75183o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f221198d;

        public C75183o(WalletBaseUI walletBaseUI, EditText editText) {
            this.f221198d = editText;
        }

        public void run() {
            if (this.f221198d.findFocus() == null) {
                this.f221198d.requestFocus();
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$q */
    public class C75184q implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f221199d;

        /* renamed from: e */
        public final /* synthetic */ View f221200e;

        /* renamed from: f */
        public final /* synthetic */ EditText f221201f;

        /* renamed from: g */
        public final /* synthetic */ int f221202g;

        /* renamed from: h */
        public final /* synthetic */ View.OnFocusChangeListener f221203h;

        /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$q$a */
        public class C75185a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f221205d;

            public C75185a(View view) {
                this.f221205d = view;
            }

            public void run() {
                if (!WalletBaseUI.this.mKBLayout.isShown() && this.f221205d.isShown()) {
                    WalletBaseUI.this.showTenpayKB();
                }
                View view = C75184q.this.f221200e;
                if (view instanceof WalletFormView) {
                    WalletFormView walletFormView = (WalletFormView) view;
                    if ((C75592q0.m90763K() || walletFormView.getEncrptType() == 100) && (!C75592q0.m90763K() || walletFormView.getEncrptType() == 0)) {
                        WalletBaseUI.this.mKeyboard.resetSecureAccessibility();
                        C75184q.this.f221201f.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                    } else {
                        C79145c cVar = new C79145c();
                        WalletBaseUI.this.mKeyboard.setSecureAccessibility(cVar);
                        C75184q.this.f221201f.setAccessibilityDelegate(cVar);
                    }
                }
                if (C75184q.this.f221200e instanceof EditHintPasswdView) {
                    C79145c cVar2 = new C79145c();
                    WalletBaseUI.this.mKeyboard.setSecureAccessibility(cVar2);
                    C75184q.this.f221201f.setAccessibilityDelegate(cVar2);
                }
                C75184q qVar = C75184q.this;
                WalletBaseUI.this.setKBMode(qVar.f221202g);
                WalletBaseUI.this.mKeyboard.setInputEditText((EditText) this.f221205d);
                ((InputMethodManager) WalletBaseUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f221205d.getWindowToken(), 0);
            }
        }

        /* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI$q$b */
        public class C75186b implements Runnable {
            public C75186b() {
            }

            public void run() {
                WalletBaseUI.this.hideTenpayKB();
                C75184q qVar = C75184q.this;
                if (qVar.f221199d) {
                    ((InputMethodManager) WalletBaseUI.this.getContext().getSystemService("input_method")).showSoftInput(C75184q.this.f221201f, 0);
                }
            }
        }

        public C75184q(boolean z, View view, EditText editText, int i, View.OnFocusChangeListener onFocusChangeListener) {
            this.f221199d = z;
            this.f221200e = view;
            this.f221201f = editText;
            this.f221202g = i;
            this.f221203h = onFocusChangeListener;
        }

        public void onFocusChange(View view, boolean z) {
            if (!view.isFocused() || this.f221199d) {
                new MMHandler().postDelayed(new C75186b(), 200);
            } else {
                ((InputMethodManager) WalletBaseUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                new MMHandler().postDelayed(new C75185a(view), 300);
            }
            View.OnFocusChangeListener onFocusChangeListener = this.f221203h;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    private void dispatchOnActivityResult(int i, int i2, Intent intent) {
        for (C75127o onActivityResult : (List) this.callbacks.clone()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    private void dispatchOnCreate() {
        for (C75127o onCreate : (List) this.callbacks.clone()) {
            onCreate.onCreate();
        }
    }

    private void dispatchOnDestroy() {
        for (C75127o onDestroy : (List) this.callbacks.clone()) {
            onDestroy.onDestroy();
        }
    }

    public static boolean ifAutoReqFocusTarget28() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_target28_pay_keyboard_focus, 1);
        Log.m105925i(TAG, "ifAutoReqFocusTarget28() swt:%s", Integer.valueOf(Qe));
        return Qe == 1;
    }

    private void setContentViewVisibility() {
        if (getLayoutId() <= 0) {
            setContentViewVisibility(4);
        } else if (isTransparent()) {
            setContentViewVisibility(4);
        } else {
            setContentViewVisibility(0);
        }
    }

    private void setProcessBundle() {
        C79148e process = getProcess();
        if (process != null) {
            this.mNetSceneMgr.f221443n = process.f232423c;
        }
    }

    public void addSceneEndListener(int i) {
        this.mNetSceneMgr.mo105624c(i);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.nextListener = onMenuItemClickListener;
        super.addTextOptionMenu(i, str, onMenuItemClickListener);
    }

    public void cancelNetScene(C117747y yVar) {
        Dialog dialog;
        C75296i iVar = this.mNetSceneMgr;
        iVar.getClass();
        Log.m105925i("MicroMsg.WalletNetSceneMgr", "cancel scene: %s %s", iVar, yVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123458d(yVar);
        iVar.f221439g.remove(yVar);
        iVar.f221438f.remove(yVar);
        if (iVar.f221439g.isEmpty() && iVar.f221438f.isEmpty() && (dialog = iVar.f221440h) != null && dialog.isShowing()) {
            iVar.f221440h.dismiss();
        }
    }

    public void cancelQRPay() {
        PayInfo payInfo = (PayInfo) getInput().getParcelable("key_pay_info");
        if (payInfo == null) {
            payInfo = (PayInfo) getIntent().getParcelableExtra("key_pay_info");
        }
        if (payInfo != null && !Util.isNullOrNil(payInfo.f212593n)) {
            this.mNetSceneMgr.mo105625d(new C45120z(payInfo.f212593n, payInfo.f212592j), true);
            payInfo.f212593n = null;
        }
    }

    public boolean checkProcLife() {
        return true;
    }

    public void cleanScenes() {
        this.mNetSceneMgr.mo105627f();
    }

    public void cleanUiData(int i) {
    }

    public void clearErr() {
        C75190a0.f221224a = 0;
        C75190a0.f221225b = 0;
        C75190a0.f221226c = null;
    }

    public void doSceneForceProgress(C117747y yVar) {
        doSceneProgress(yVar, true, false);
    }

    public void doSceneProgress(C117747y yVar, boolean z) {
        doSceneProgress(yVar, z, false);
    }

    public void doSceneProgressWithVerify(C117747y yVar) {
        setProcessBundle();
        this.mNetSceneMgr.mo105626e(yVar, true, 3, 0);
    }

    public void doSceneSafeProgress(C117747y yVar) {
        doSceneProgress(yVar, true, true);
    }

    public void finish() {
        super.finish();
        hideLoading();
        hideTenpayKB();
        hideWcKb();
        this._hasFinish = true;
    }

    public void forceCancel() {
        Log.m105918d(TAG, "cancelforceScene");
        this.mNetSceneMgr.mo105627f();
        finish();
    }

    public boolean getCancelable() {
        return true;
    }

    public int getContentViewVisibility() {
        return getContentView().getVisibility();
    }

    public Bundle getInput() {
        return this.mBundle;
    }

    public C75282g getNetController() {
        if (this.mNetController == null) {
            C79148e process = getProcess();
            if (process != null) {
                this.mNetController = process.mo91265p(this, this.mNetSceneMgr);
            }
            if (this.mNetController == null) {
                this.mNetController = new C75172d(this, this, this.mNetSceneMgr);
            }
        }
        return this.mNetController;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = (com.tencent.p014mm.pluginsdk.wallet.PayInfo) r0.getParcelable("key_pay_info");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getPayReqKey() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.mBundle
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r2 = "key_pay_info"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = (com.tencent.p014mm.pluginsdk.wallet.PayInfo) r0
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.f212592j
            return r0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI.getPayReqKey():java.lang.String");
    }

    public C79148e getProcess() {
        if (this.mProcess == null) {
            this.mProcess = C79143a.m95768g(this);
        }
        return this.mProcess;
    }

    public Class<? extends C75227s> getReportUIC() {
        return C75227s.class;
    }

    public String getSubTitle() {
        return "";
    }

    public CharSequence getTips(int i) {
        C75282g gVar = this.mNetController;
        if (gVar == null) {
            return null;
        }
        return gVar.mo91282a(i);
    }

    public void handleKeyboardTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !this.mWcKeyboard.mo104749m()) {
            showCircleStWcKb();
        }
    }

    public boolean hasFinish() {
        return this._hasFinish;
    }

    public void hideKeyboardPushDownBtn() {
        View findViewById = findViewById(C0966R.C0970id.kh4);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById2 = findViewById(C7112R.C7115id.f361868tenpay_keyboard_top_line);
        if (findViewById2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void hideLoading() {
        Dialog dialog = this.mTipDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mTipDialog.dismiss();
        }
    }

    public void hideProgress() {
        Dialog dialog = this.mProgressDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void hideTenpayKB() {
        View view = this.mKBLayout;
        if (view != null && view.isShown()) {
            View view2 = this.mKBLayout;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(false);
            }
        }
    }

    public void hideWcKb() {
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.mo104741f();
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(false);
            }
            ((C75227s) component(getReportUIC())).mo105155i3(2);
        }
    }

    public boolean isAuthDoing() {
        return this.mIsAuthDoing;
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        return false;
    }

    public boolean isProcessing() {
        return this.mNetSceneMgr.mo105628g();
    }

    public boolean isTransparent() {
        return getLayoutId() <= 0 || this.mNetSceneMgr.mo105628g();
    }

    public void keepProcessEnd(C79148e.C79149a aVar) {
        this.mProcessEnd = aVar;
    }

    public boolean lockPage() {
        String simpleName = getClass().getSimpleName();
        if (!mLockSet.contains(simpleName)) {
            return mLockSet.add(simpleName);
        }
        Log.m105929w(TAG, "has contain lock key: %s", simpleName);
        finish();
        return false;
    }

    public boolean needConfirmFinish() {
        return false;
    }

    public boolean needExecuteBackListener() {
        return true;
    }

    public boolean needLockPage() {
        return false;
    }

    public void next() {
        getProcess().mo91264o(this, 0, getInput());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        getNetController().mo99282b(i, i2, intent);
        dispatchOnActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        if (needLockPage()) {
            lockPage();
        }
        shouldFixStatusBar();
        if (shouldEnsureSoterConnection()) {
            ((C78144b) C86312j.m106911c(C78144b.class)).mo107985v6();
            C22252b.m25805b();
        }
        super.onCreate(bundle);
        setStatusColor();
        if (!C86709a0.m107522a()) {
            Log.m105920e(TAG, "hy: account not ready. finish now");
            C76879j.m92713G(this, getString(C0966R.string.kk8), "", false, new C75177j());
        }
        C75296i iVar = new C75296i(this, this);
        this.mNetSceneMgr = iVar;
        iVar.mo105624c(385);
        this.mNetSceneMgr.mo105624c(1518);
        this.mPayLoopInterruptListener.alive();
        Log.m105918d(TAG, "current process:" + getIntent().getIntExtra("process_id", 0));
        C79148e g = C79143a.m95768g(this);
        if (g != null) {
            this.mNetSceneMgr.f221442j = g.mo91258e();
            g.mo91263b(this);
        }
        Log.m105918d(TAG, "proc " + g);
        Bundle e = C79143a.m95766e(this);
        this.mBundle = e;
        if (e == null) {
            this.mBundle = new Bundle();
        }
        this.mNetSceneMgr.f221443n = this.mBundle;
        if (checkProcLife()) {
            if (!(C79143a.m95768g(this) != null)) {
                Log.m105920e(TAG, "Activity extends WalletBaseUI but not in process!!!");
            }
        }
        if (getLayoutId() > 0) {
            String subTitle = getSubTitle();
            if (!Util.isNullOrNil(subTitle)) {
                setMMSubTitle(subTitle);
            }
        }
        setBackBtn(new C45123k());
        C75282g netController = getNetController();
        this.mNetController = netController;
        if (netController == null || !netController.mo91280c(new Object[0])) {
            setContentViewVisibility();
        } else {
            setContentViewVisibility(4);
        }
        dispatchOnCreate();
        C79144b.m95773a().getClass();
        this.mKindaEnable = true;
        Log.m105925i(TAG, "old id: %s, new id: %s", (String) C87199n.m108254a().f252865a.get(256), C87203t.m108273i());
        String simpleName = getClass().getSimpleName();
        if (C75226r.f221345e == null) {
            C75226r.f221345e = new Stack<>();
        }
        Stack<String> stack = C75226r.f221345e;
        if (stack.size() == 0) {
            C75226r.f221342b = "";
            C75226r.f221343c = 0;
            C75226r.f221341a = null;
            C75226r.f221345e.clear();
            C75226r.m90204d(1, 1, "[Begin]" + simpleName, "");
        }
        stack.push(simpleName);
        C75226r.m90204d(2, 1, simpleName, "");
    }

    public Dialog onCreateDialog(int i) {
        Log.m105924i(TAG, "onCreateDialog id = " + i);
        if (i != 1000) {
            return super.onCreateDialog(i);
        }
        C79148e g = C79143a.m95768g(this);
        int q = g != null ? g.mo91266q(this, 1) : -1;
        if (q != -1) {
            return C76879j.m92717K(this, true, getString(q), "", getString(C0966R.string.a4h), getString(C0966R.string.f360090a14), new C75178l(), new C75179m());
        }
        if (g != null) {
            g.mo91259f(this, getInput());
        } else {
            this.mPayResultType = 4;
            finish();
        }
        return super.onCreateDialog(i);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.mo105630i(385);
        this.mNetSceneMgr.mo105630i(1518);
        this.mPayLoopInterruptListener.dead();
        C79148e process = getProcess();
        if (process != null) {
            process.mo91270y(this);
        }
        unlockPage();
        dispatchOnDestroy();
        this.callbacks.clear();
        keepProcessEnd((C79148e.C79149a) null);
        String simpleName = getClass().getSimpleName();
        if (C75226r.f221345e == null) {
            C75226r.f221345e = new Stack<>();
        }
        Stack<String> stack = C75226r.f221345e;
        if (stack.size() > 0) {
            stack.pop();
        }
        if (stack.size() == 0) {
            C75226r.m90204d(1, 2, "[End]" + simpleName, "");
            stack.clear();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View view = this.mKBLayout;
            if (view != null && view.isShown()) {
                hideTenpayKB();
                return true;
            } else if (needConfirmFinish()) {
                hideVKB();
                showDialog(1000);
                return true;
            } else if (this.backListener == null || !needExecuteBackListener()) {
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.nextListener;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick((MenuItem) null);
                    return true;
                }
            } else {
                this.backListener.onMenuItemClick((MenuItem) null);
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("key_process_is_end", false) && !intent.getBooleanExtra("key_process_is_stay", true)) {
            setIntent(intent);
            Bundle extras = getIntent().getExtras();
            int i = (extras == null || !extras.containsKey("key_process_result_code")) ? 0 : extras.getInt("key_process_result_code", 0);
            if (i == -1) {
                Log.m105924i(TAG, "process end ok!");
                setResult(-1, getIntent());
            } else {
                Log.m105924i(TAG, "process end with user cancel or err! resultCode : " + i);
                setResult(0, getIntent());
            }
            finish();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreSceneEnd(int i, int i2, String str, C117747y yVar) {
        return true;
    }

    public boolean onProgressFinish() {
        return false;
    }

    public void onResume() {
        super.onResume();
        TenpaySecureEditText.setSalt(C75228t.m90271t());
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r25, int r26, java.lang.String r27, ob0.C117747y r28, boolean r29) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "errType = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", errCode = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", errMsg = "
            r4.append(r5)
            r5 = r27
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "MicroMsg.WalletBaseUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            java.lang.String r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90271t()
            com.tenpay.android.wechat.TenpaySecureEditText.setSalt(r4)
            boolean r4 = r3 instanceof com.tencent.p014mm.wallet_core.model.C75117g0
            if (r4 == 0) goto L_0x0085
            r6 = r3
            com.tencent.mm.wallet_core.model.g0 r6 = (com.tencent.p014mm.wallet_core.model.C75117g0) r6
            r0.mCurrentNetScene = r6
            android.os.Bundle r7 = r0.mBundle
            if (r7 == 0) goto L_0x0085
            int r8 = r6.is_gen_cert
            if (r8 <= 0) goto L_0x004d
            java.lang.String r9 = "key_is_gen_cert"
            r7.putInt(r9, r8)
        L_0x004d:
            int r7 = r6.is_hint_cert
            if (r7 <= 0) goto L_0x0058
            android.os.Bundle r8 = r0.mBundle
            java.lang.String r9 = "key_is_hint_crt"
            r8.putInt(r9, r7)
        L_0x0058:
            int r7 = r6.is_ignore_cert
            if (r7 <= 0) goto L_0x0063
            android.os.Bundle r8 = r0.mBundle
            java.lang.String r9 = "key_is_ignore_cert"
            r8.putInt(r9, r7)
        L_0x0063:
            java.lang.String r7 = r6.crt_token
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0074
            android.os.Bundle r7 = r0.mBundle
            java.lang.String r8 = r6.crt_token
            java.lang.String r9 = "key_crt_token"
            r7.putString(r9, r8)
        L_0x0074:
            java.lang.String r7 = r6.crt_wording
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0085
            android.os.Bundle r7 = r0.mBundle
            java.lang.String r6 = r6.crt_wording
            java.lang.String r8 = "key_crt_wording"
            r7.putString(r8, r6)
        L_0x0085:
            r24.onPreSceneEnd(r25, r26, r27, r28)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)
            if (r6 == 0) goto L_0x0095
            r5 = 2131839734(0x7f114af6, float:1.9312728E38)
            java.lang.String r5 = r0.getString(r5)
        L_0x0095:
            r6 = 1
            if (r4 == 0) goto L_0x00a0
            r7 = r3
            com.tencent.mm.wallet_core.model.g0 r7 = (com.tencent.p014mm.wallet_core.model.C75117g0) r7
            boolean r7 = r7.isBlock()
            goto L_0x00a1
        L_0x00a0:
            r7 = 1
        L_0x00a1:
            boolean r8 = r3 instanceof com.tencent.p014mm.wallet_core.model.C75102b0
            if (r8 == 0) goto L_0x00aa
            r7 = r3
            com.tencent.mm.wallet_core.model.b0 r7 = (com.tencent.p014mm.wallet_core.model.C75102b0) r7
            boolean r7 = r7.f221014f
        L_0x00aa:
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r25)
            r10 = 0
            r8[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r26)
            r8[r6] = r9
            r9 = 2
            r8[r9] = r5
            r9 = 3
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            r8[r9] = r11
            r9 = 4
            r8[r9] = r3
            java.lang.String r11 = "MicroMsg.WalletDispatcher"
            java.lang.String r12 = "dispatch errType:%d errCode %s ,errMsg: %s, isBlock %s scene: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r8)
            java.lang.String r8 = "wallet base consume this response in the end!"
            if (r4 == 0) goto L_0x018a
            r12 = r3
            com.tencent.mm.wallet_core.model.g0 r12 = (com.tencent.p014mm.wallet_core.model.C75117g0) r12
            boolean r13 = r12.isPayEnd()
            java.lang.String r14 = "intent_pay_end"
            java.lang.String r15 = "intent_wap_pay_jump_url"
            java.lang.String r9 = "intent_pay_app_url"
            java.lang.String r10 = "intent_pay_end_errcode"
            if (r13 == 0) goto L_0x010d
            java.lang.String r13 = "order pay end!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r13)
            android.os.Bundle r13 = r24.getInput()
            r13.putInt(r10, r2)
            java.lang.String r10 = r12.getReturnUrl()
            r13.putString(r9, r10)
            java.lang.String r9 = r12.getWappayJumpUrl()
            r13.putString(r15, r9)
            r13.putBoolean(r14, r6)
            yq3.e r9 = yq3.C79143a.m95768g(r24)
            if (r9 == 0) goto L_0x0142
            android.os.Bundle r9 = r9.f232423c
            r9.putAll(r13)
            goto L_0x0142
        L_0x010d:
            boolean r13 = r3 instanceof com.tencent.p014mm.wallet_core.tenpay.model.C75160b
            if (r13 == 0) goto L_0x0142
            r13 = r3
            com.tencent.mm.wallet_core.tenpay.model.b r13 = (com.tencent.p014mm.wallet_core.tenpay.model.C75160b) r13
            boolean r13 = r13.checkPaySuccess()
            if (r13 == 0) goto L_0x0142
            java.lang.String r13 = "delay order pay end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            android.os.Bundle r13 = r24.getInput()
            r13.putInt(r10, r2)
            java.lang.String r10 = r12.getReturnUrl()
            r13.putString(r9, r10)
            java.lang.String r9 = r12.getWappayJumpUrl()
            r13.putString(r15, r9)
            r13.putBoolean(r14, r6)
            yq3.e r9 = yq3.C79143a.m95768g(r24)
            if (r9 == 0) goto L_0x0142
            android.os.Bundle r9 = r9.f232423c
            r9.putAll(r13)
        L_0x0142:
            if (r7 == 0) goto L_0x0152
            boolean r9 = cr3.C75283h.m90311a(r0, r3, r1, r2, r5)
            if (r9 == 0) goto L_0x0152
            boolean r9 = r12.callbackUIWhenWalletError()
            if (r9 != 0) goto L_0x0152
            r9 = 0
            goto L_0x0153
        L_0x0152:
            r9 = 1
        L_0x0153:
            if (r9 == 0) goto L_0x0183
            yq3.e r9 = r24.getProcess()
            if (r9 == 0) goto L_0x0165
            cr3.g r9 = r24.getNetController()
            boolean r9 = r9.mo91272e(r1, r2, r5, r3)
            if (r9 != 0) goto L_0x01b7
        L_0x0165:
            boolean r9 = r0.onSceneEnd(r1, r2, r5, r12)
            if (r9 != 0) goto L_0x01b7
            if (r7 == 0) goto L_0x01b7
            if (r1 != 0) goto L_0x0179
            if (r2 == 0) goto L_0x0172
            goto L_0x0179
        L_0x0172:
            java.lang.String r1 = "wallet this response havn't error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)
            goto L_0x01b7
        L_0x0179:
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221224a = r1
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221225b = r2
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221226c = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r8)
            goto L_0x01b7
        L_0x0183:
            java.lang.String r1 = "wallet base consume this response before subclass!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)
            goto L_0x01b7
        L_0x018a:
            yq3.e r9 = r24.getProcess()
            if (r9 == 0) goto L_0x019a
            cr3.g r9 = r24.getNetController()
            boolean r9 = r9.mo91272e(r1, r2, r5, r3)
            if (r9 != 0) goto L_0x01b7
        L_0x019a:
            boolean r9 = r0.onSceneEnd(r1, r2, r5, r3)
            if (r9 != 0) goto L_0x01b7
            if (r7 == 0) goto L_0x01b7
            if (r1 != 0) goto L_0x01ae
            if (r2 == 0) goto L_0x01a7
            goto L_0x01ae
        L_0x01a7:
            java.lang.String r1 = "wallet other scene this response havn't error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)
            goto L_0x01b7
        L_0x01ae:
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221224a = r1
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221225b = r2
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221226c = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r8)
        L_0x01b7:
            if (r29 == 0) goto L_0x0255
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            r5 = 0
            r1[r5] = r2
            java.lang.String r2 = "scenes & forcescenes isEmpty! %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r2, r1)
            int r1 = com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221225b
            if (r1 == 0) goto L_0x024b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "showAlert! mErrCode : "
            r1.append(r2)
            int r2 = com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221225b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            if (r4 == 0) goto L_0x0225
            r1 = r3
            com.tencent.mm.wallet_core.model.g0 r1 = (com.tencent.p014mm.wallet_core.model.C75117g0) r1
            java.lang.String r2 = r1.getErrDetailUrl()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x0225
            java.lang.String r4 = "error_detail_url is not null "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            androidx.appcompat.app.AppCompatActivity r16 = r24.getContext()
            java.lang.String r17 = com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221226c
            r18 = 0
            java.lang.String r19 = r1.getErrDialogOkBtnText()
            java.lang.String r20 = r1.getErrDialogCancelBtnText()
            r21 = 1
            com.tencent.mm.wallet_core.ui.y r1 = new com.tencent.mm.wallet_core.ui.y
            r1.<init>(r0, r2)
            com.tencent.mm.wallet_core.ui.z r2 = new com.tencent.mm.wallet_core.ui.z
            r2.<init>(r0)
            r22 = r1
            r23 = r2
            nj3.C76879j.m92709C(r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 0
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221224a = r1
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221225b = r1
            r1 = 0
            com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221226c = r1
            r1 = 4
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r1, r6)
            goto L_0x0226
        L_0x0225:
            r6 = 0
        L_0x0226:
            if (r6 == 0) goto L_0x0229
            goto L_0x0255
        L_0x0229:
            java.lang.String r1 = "error_detail_url is null "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            androidx.appcompat.app.AppCompatActivity r2 = r24.getContext()
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75190a0.f221226c
            r4 = 0
            android.content.res.Resources r5 = r24.getResources()
            r6 = 2131838771(0x7f114733, float:1.9310775E38)
            java.lang.String r5 = r5.getString(r6)
            r6 = 0
            com.tencent.mm.wallet_core.ui.x r7 = new com.tencent.mm.wallet_core.ui.x
            r7.<init>(r0, r3)
            r3 = r1
            nj3.C76879j.m92711E(r2, r3, r4, r5, r6, r7)
            goto L_0x0255
        L_0x024b:
            boolean r1 = r24.onProgressFinish()
            if (r1 != 0) goto L_0x0255
            r1 = 0
            r0.setContentViewVisibility(r1)
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI.onSceneEnd(int, int, java.lang.String, ob0.y, boolean):void");
    }

    public abstract boolean onSceneEnd(int i, int i2, String str, C117747y yVar);

    public boolean onSwipeBackFinish() {
        hideWcKb();
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.backListener;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick((MenuItem) null);
            return true;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener2 = this.nextListener;
        if (onMenuItemClickListener2 == null) {
            return super.onSwipeBackFinish();
        }
        onMenuItemClickListener2.onMenuItemClick((MenuItem) null);
        return true;
    }

    public void regeistQueryOrder(int i, C75278c cVar) {
        C75296i iVar = this.mNetSceneMgr;
        iVar.getClass();
        cVar.f221416e = i;
        cVar.f221415d = iVar;
        iVar.f221446q.put(Integer.valueOf(i), cVar);
    }

    public void register(C75127o oVar) {
        if (!this.callbacks.contains(oVar)) {
            this.callbacks.add(oVar);
        }
    }

    public void removeSceneEndListener(int i) {
        this.mNetSceneMgr.mo105630i(i);
    }

    public boolean resend(boolean z) {
        C75117g0 g0Var = this.mCurrentNetScene;
        if (g0Var == null) {
            return false;
        }
        if (!g0Var.resend() && !z) {
            return false;
        }
        this.mNetSceneMgr.mo95362b(this.mCurrentNetScene, true);
        return true;
    }

    public void scrollToFormEditPosAfterShowTenPay(View view, View view2, int i) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = iArr[1] + view2.getHeight();
            int j = C76577a.m92159j(this);
            int b = (j - height) - C76577a.m92151b(this, i);
            int i2 = HARDCODE_TENPAY_KEYBOARD_HEIGHT;
            Log.m105919d(TAG, "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", Integer.valueOf(height), Integer.valueOf(j), Integer.valueOf(b), Integer.valueOf(i2));
            if (b > 0 && b < i2) {
                int i3 = i2 - b;
                Log.m105919d(TAG, "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", Integer.valueOf(i3));
                view.post(new C75175g(this, view, i3));
            }
        }
    }

    public void setAuthState(boolean z) {
        C76332j jVar;
        this.mIsAuthDoing = z;
        synchronized (C76332j.class) {
            jVar = C76332j.C76334b.f223590a;
        }
        jVar.f223589a.put("key_pay_offline_is_auth_doing", Boolean.valueOf(z));
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.backListener = onMenuItemClickListener;
        super.setBackBtn(onMenuItemClickListener);
    }

    public void setEditFocusListener(View view, int i, boolean z) {
        setEditFocusListener(view, i, z, true);
    }

    public void setKBMode(int i) {
        this.mKeyboard.setXMode(i);
    }

    public void setStatusColor() {
        setActionbarColor(getActionbarColor());
    }

    public void setTenpayKBStateListener(C75217h hVar) {
        this.mTenpayKBStateListener = hVar;
    }

    public void setWPKeyboard(EditText editText, boolean z, boolean z2) {
        if (this.mWcKeyboard == null) {
            this.mWcKeyboard = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        }
        if (this.mWcKeyboard != null && editText != null) {
            View.OnFocusChangeListener onFocusChangeListener = null;
            if (z2) {
                onFocusChangeListener = editText.getOnFocusChangeListener();
            }
            C75228t.m90251i0(editText);
            editText.setOnFocusChangeListener(new C75180n(z, editText, onFocusChangeListener));
            if (C11171e.m11046c(28) && z && (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || ifAutoReqFocusTarget28())) {
                editText.post(new C75183o(this, editText));
            }
            editText.setOnClickListener(new C45124p());
        }
    }

    public void setWcKbHeightListener(WcPayKeyboard.C75086f fVar) {
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.setHeightListener(fVar);
        }
    }

    public void setmPayResultType(int i) {
        this.mPayResultType = i;
    }

    public boolean shouldEnsureSoterConnection() {
        return false;
    }

    public void shouldFixStatusBar() {
    }

    public void showCircleStWcKb() {
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.mo104753p();
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(true);
            }
            ((C75227s) component(getReportUIC())).mo105156j3(2);
            ((C75227s) component(getReportUIC())).mo105155i3(1);
        }
    }

    public void showLoading(boolean z) {
        Dialog dialog = this.mTipDialog;
        if (dialog != null) {
            dialog.show();
            return;
        }
        if (z) {
            this.mTipDialog = C75197d0.m90165f(getContext(), false, false, new C75176h());
        } else {
            this.mTipDialog = C75197d0.m90163d(getContext(), true, false, (DialogInterface.OnCancelListener) null);
        }
        Dialog dialog2 = this.mTipDialog;
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
    }

    public void showNetErrorDialog(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = getString(C0966R.string.l_3);
        }
        C76879j.m92711E(this, str, (String) null, getContext().getString(C0966R.string.f8028zq), false, new C45122i(z));
    }

    public void showNormalStWcKb() {
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.mo104751o();
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(true);
            }
            ((C75227s) component(getReportUIC())).mo105156j3(1);
        }
    }

    public void showProgress() {
        Dialog dialog = this.mProgressDialog;
        if (dialog == null || (dialog != null && !dialog.isShowing())) {
            Dialog dialog2 = this.mProgressDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.mProgressDialog = C75197d0.m90163d(this, false, false, new C75174f(this));
        }
    }

    public void showSafeProgress() {
        Dialog dialog = this.mProgressDialog;
        if (dialog == null || (dialog != null && !dialog.isShowing())) {
            Dialog dialog2 = this.mProgressDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.mProgressDialog = C75197d0.m90164e(this, false, new C75173e());
        }
    }

    public void showTenpayKB() {
        View view = this.mKBLayout;
        if (view != null && !view.isShown()) {
            View view2 = this.mKBLayout;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(true);
            }
        }
    }

    public void showWcKb() {
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard != null && !wcPayKeyboard.isShown()) {
            this.mWcKeyboard.mo104754q(true);
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(true);
            }
            ((C75227s) component(getReportUIC())).mo105156j3(1);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(getReportUIC());
    }

    public void unlockPage() {
        mLockSet.remove(getClass().getSimpleName());
    }

    public void unregister(C75127o oVar) {
        if (this.callbacks.contains(oVar)) {
            this.callbacks.remove(oVar);
        }
    }

    public void doSceneForceProgress(C117747y yVar, int i) {
        doSceneProgress(yVar, true, false, i);
    }

    public void doSceneProgress(C117747y yVar, boolean z, boolean z2) {
        doSceneProgress(yVar, z, z2, 0);
    }

    public void setEditFocusListener(View view, int i, boolean z, boolean z2) {
        setEditFocusListener(view, i, z, true, z2);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener, MMActivityController.C73075r rVar) {
        this.nextListener = onMenuItemClickListener;
        super.addTextOptionMenu(i, str, onMenuItemClickListener, (View.OnLongClickListener) null, rVar);
    }

    public void doSceneProgress(C117747y yVar, boolean z, boolean z2, int i) {
        setProcessBundle();
        this.mNetSceneMgr.mo105626e(yVar, z, !z2 ? 2 : 1, i);
    }

    public void next(Bundle bundle) {
        getProcess().mo91264o(this, 0, bundle);
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i) {
        this.backListener = onMenuItemClickListener;
        super.setBackBtn(onMenuItemClickListener, i);
    }

    public void setEditFocusListener(View view, int i, boolean z, boolean z2, boolean z3) {
        setEditFocusListener(view, (EditText) null, i, z, z2, z3);
    }

    public void setEditFocusListener(View view, EditText editText, int i, boolean z, boolean z2, boolean z3) {
        this.mKeyboard = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.mKBLayout = findViewById(C0966R.C0970id.f359359kh1);
        View findViewById = findViewById(C0966R.C0970id.kh4);
        if (editText == null) {
            editText = (EditText) view.findViewById(C0966R.C0970id.lg_);
        }
        if (this.mKeyboard != null && editText != null && this.mKBLayout != null) {
            View.OnFocusChangeListener onFocusChangeListener = z3 ? editText.getOnFocusChangeListener() : null;
            C75228t.m90251i0(editText);
            editText.setOnFocusChangeListener(new C75184q(z, view, editText, i, onFocusChangeListener));
            editText.setOnClickListener(new C75169a(z, i, editText));
            if (C11171e.m11046c(28) && z2 && (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || ifAutoReqFocusTarget28())) {
                editText.post(new C75170b(this, editText));
            }
            findViewById.setOnClickListener(new C75171c());
        }
    }

    public void doSceneProgress(C117747y yVar) {
        doSceneProgress(yVar, true, true);
    }

    public void setContentViewVisibility(int i) {
        super.setContentViewVisibility(i);
    }

    public void showLoading() {
        showLoading(true);
    }
}
