package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import eb0.C75592q0;
import ep3.C97688c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C117747y;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity */
public abstract class BaseAAPresenterActivity extends WalletBaseUI {

    /* renamed from: f */
    public static final int f196014f = C76577a.m92151b(MMApplicationContext.getContext(), 300);

    /* renamed from: d */
    public View f196015d;

    /* renamed from: e */
    public C97688c f196016e = new C97688c();

    /* renamed from: com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity$a */
    public class C68187a implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f196017d;

        /* renamed from: e */
        public final /* synthetic */ boolean f196018e;

        /* renamed from: f */
        public final /* synthetic */ EditText f196019f;

        /* renamed from: g */
        public final /* synthetic */ View f196020g;

        /* renamed from: h */
        public final /* synthetic */ int f196021h;

        /* renamed from: com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity$a$a */
        public class C68188a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f196023d;

            public C68188a(View view) {
                this.f196023d = view;
            }

            public void run() {
                BaseAAPresenterActivity baseAAPresenterActivity = BaseAAPresenterActivity.this;
                int i = BaseAAPresenterActivity.f196014f;
                if (!baseAAPresenterActivity.mKBLayout.isShown() && this.f196023d.isShown()) {
                    C68187a aVar = C68187a.this;
                    if (aVar.f196018e) {
                        BaseAAPresenterActivity.this.showTenpayKB();
                    } else {
                        BaseAAPresenterActivity baseAAPresenterActivity2 = BaseAAPresenterActivity.this;
                        if (!baseAAPresenterActivity2.isVKBFirstTimeShown) {
                            baseAAPresenterActivity2.showTenpayKB();
                        }
                    }
                    C68187a aVar2 = C68187a.this;
                    BaseAAPresenterActivity baseAAPresenterActivity3 = BaseAAPresenterActivity.this;
                    baseAAPresenterActivity3.isVKBFirstTimeShown = false;
                    BaseAAPresenterActivity.m80612H7(baseAAPresenterActivity3, aVar2.f196019f);
                }
                View view = C68187a.this.f196020g;
                if (view instanceof WalletFormView) {
                    WalletFormView walletFormView = (WalletFormView) view;
                    if ((C75592q0.m90763K() || walletFormView.getEncrptType() == 100) && (!C75592q0.m90763K() || walletFormView.getEncrptType() == 0)) {
                        BaseAAPresenterActivity.this.mKeyboard.resetSecureAccessibility();
                        C68187a.this.f196019f.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                    } else {
                        C79145c cVar = new C79145c();
                        BaseAAPresenterActivity.this.mKeyboard.setSecureAccessibility(cVar);
                        C68187a.this.f196019f.setAccessibilityDelegate(cVar);
                    }
                }
                if (C68187a.this.f196020g instanceof EditHintPasswdView) {
                    C79145c cVar2 = new C79145c();
                    BaseAAPresenterActivity.this.mKeyboard.setSecureAccessibility(cVar2);
                    C68187a.this.f196019f.setAccessibilityDelegate(cVar2);
                }
                C68187a aVar3 = C68187a.this;
                BaseAAPresenterActivity.this.setKBMode(aVar3.f196021h);
                BaseAAPresenterActivity.this.mKeyboard.setInputEditText((EditText) this.f196023d);
                ((InputMethodManager) BaseAAPresenterActivity.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f196023d.getWindowToken(), 0);
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity$a$b */
        public class C68189b implements Runnable {
            public C68189b() {
            }

            public void run() {
                BaseAAPresenterActivity.this.hideTenpayKB();
                C68187a aVar = C68187a.this;
                if (aVar.f196017d) {
                    ((InputMethodManager) BaseAAPresenterActivity.this.getContext().getSystemService("input_method")).showSoftInput(C68187a.this.f196019f, 0);
                }
            }
        }

        public C68187a(boolean z, boolean z2, EditText editText, View view, int i) {
            this.f196017d = z;
            this.f196018e = z2;
            this.f196019f = editText;
            this.f196020g = view;
            this.f196021h = i;
        }

        public void onFocusChange(View view, boolean z) {
            if (!view.isFocused() || this.f196017d) {
                new MMHandler().postDelayed(new C68189b(), 200);
                return;
            }
            ((InputMethodManager) BaseAAPresenterActivity.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new MMHandler().postDelayed(new C68188a(view), 300);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity$b */
    public class C68190b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ boolean f196026g;

        /* renamed from: h */
        public final /* synthetic */ EditText f196027h;

        /* renamed from: i */
        public final /* synthetic */ int f196028i;

        public C68190b(boolean z, EditText editText, int i) {
            this.f196026g = z;
            this.f196027h = editText;
            this.f196028i = i;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            BaseAAPresenterActivity baseAAPresenterActivity = BaseAAPresenterActivity.this;
            int i = BaseAAPresenterActivity.f196014f;
            if (!baseAAPresenterActivity.mKBLayout.isShown() && !this.f196026g) {
                BaseAAPresenterActivity.this.showTenpayKB();
                BaseAAPresenterActivity.m80612H7(BaseAAPresenterActivity.this, this.f196027h);
                BaseAAPresenterActivity.this.setKBMode(this.f196028i);
            } else if (this.f196026g) {
                BaseAAPresenterActivity.this.hideTenpayKB();
                ((InputMethodManager) BaseAAPresenterActivity.this.getContext().getSystemService("input_method")).showSoftInput(this.f196027h, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity$c */
    public class C68191c extends C7089c0 {
        public C68191c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            BaseAAPresenterActivity.this.hideTenpayKB();
        }
    }

    /* renamed from: H7 */
    public static void m80612H7(BaseAAPresenterActivity baseAAPresenterActivity, EditText editText) {
        if (baseAAPresenterActivity.f196015d != null) {
            int[] iArr = new int[2];
            editText.getLocationInWindow(iArr);
            int height = iArr[1] + editText.getHeight();
            int height2 = baseAAPresenterActivity.getWindow().getDecorView().getHeight() - baseAAPresenterActivity.getSupportActionBar().mo91101l();
            int i = height2 - height;
            int i2 = f196014f;
            Log.m105925i("MicroMsg.BaseAAPresenterActivity", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", Integer.valueOf(height), Integer.valueOf(height2), Integer.valueOf(i), Integer.valueOf(i2));
            if (i > 0 && i < i2) {
                int b = (i2 - i) + C76577a.m92151b(baseAAPresenterActivity, 10);
                Log.m105925i("MicroMsg.BaseAAPresenterActivity", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", Integer.valueOf(b));
                baseAAPresenterActivity.f196015d.scrollBy(0, b);
            }
        }
    }

    public void hideTenpayKB() {
        super.hideTenpayKB();
        View view = this.f196015d;
        if (view != null) {
            view.scrollTo(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f196016e.mo136942d(getIntent(), this);
        this.isVKBFirstTimeShown = true;
    }

    public void onDestroy() {
        super.onDestroy();
        C97688c cVar = this.f196016e;
        cVar.f286535g.dead();
        cVar.mo136944f(4);
    }

    public void onPause() {
        super.onPause();
        this.f196016e.mo136944f(3);
    }

    public void onResume() {
        super.onResume();
        this.f196016e.mo136944f(2);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void setEditFocusListener(View view, int i, boolean z, boolean z2) {
        View view2;
        this.mKeyboard = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.mKBLayout = findViewById(C0966R.C0970id.f359359kh1);
        View findViewById = findViewById(C0966R.C0970id.kh4);
        EditText editText = (EditText) view.findViewById(C0966R.C0970id.lg_);
        if (this.mKeyboard != null && editText != null && (view2 = this.mKBLayout) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity", "setEditFocusListener", "(Landroid/view/View;IZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity", "setEditFocusListener", "(Landroid/view/View;IZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75228t.m90251i0(editText);
            boolean z3 = z;
            editText.setOnFocusChangeListener(new C68187a(z3, z2, editText, view, i));
            editText.setOnClickListener(new C68190b(z3, editText, i));
            findViewById.setOnClickListener(new C68191c());
        }
    }
}
