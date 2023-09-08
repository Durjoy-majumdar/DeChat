package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.C7112R;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import yq3.C79145c;

public class BaseUI implements IExtendUI {
    public static final int HARDCODE_TENPAY_KEYBOARD_HEIGHT = C76577a.m92151b(MMApplicationContext.getContext(), 270);
    public static final String TAG = "MicroMsg.BaseUI";
    private byte _hellAccFlag_;
    public boolean isVKBFirstTimeShown = false;
    public View mKBLayout;
    public MyKeyboardWindow mKeyboard;
    private C75217h mTenpayKBStateListener;
    /* access modifiers changed from: private */
    public IBaseUIWrap wrap;

    public interface IBaseUIWrap {
        View findViewById(int i);

        Context getContext();

        View getCurrentFocus();
    }

    public BaseUI(IBaseUIWrap iBaseUIWrap) {
        this.wrap = iBaseUIWrap;
    }

    public void hideTenpayKB() {
        View view = this.mKBLayout;
        if (view != null && view.isShown()) {
            View view2 = this.mKBLayout;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/kinda/framework/widget/base/BaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(false);
            }
        }
    }

    public void scrollTo(View view, int i, int i2) {
        if (view != null) {
            view.scrollTo(i, i2);
        }
    }

    public void scrollToFormEditPosAfterShowTenPay(final View view, View view2, int i) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int height = iArr[1] + view2.getHeight();
            int j = C76577a.m92159j(this.wrap.getContext());
            int b = (j - height) - C76577a.m92151b(this.wrap.getContext(), i);
            int i2 = HARDCODE_TENPAY_KEYBOARD_HEIGHT;
            Log.m105919d(TAG, "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", Integer.valueOf(height), Integer.valueOf(j), Integer.valueOf(b), Integer.valueOf(i2));
            if (b > 0 && b < i2) {
                final int i3 = i2 - b;
                Log.m105919d(TAG, "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", Integer.valueOf(i3));
                view.post(new Runnable() {
                    public void run() {
                        view.scrollBy(0, i3);
                    }
                });
            }
        }
    }

    public void setEditFocusListener(View view, int i, boolean z) {
        setEditFocusListener(view, i, z, true);
    }

    public void setKBMode(int i) {
        this.mKeyboard.setXMode(i);
    }

    public void setTenpayKBStateListener(C75217h hVar) {
        this.mTenpayKBStateListener = hVar;
    }

    public void showTenpayKB() {
        View view = this.mKBLayout;
        if (view != null && !view.isShown()) {
            View view2 = this.mKBLayout;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/kinda/framework/widget/base/BaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75217h hVar = this.mTenpayKBStateListener;
            if (hVar != null) {
                hVar.onVisibleStateChange(true);
            }
        }
    }

    public void showVKB() {
        View currentFocus;
        InputMethodManager inputMethodManager = (InputMethodManager) this.wrap.getContext().getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = this.wrap.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    public void setEditFocusListener(View view, final int i, final boolean z, boolean z2) {
        this.mKeyboard = (MyKeyboardWindow) this.wrap.findViewById(C7112R.C7115id.f361869tenpay_num_keyboard);
        this.mKBLayout = this.wrap.findViewById(C0966R.C0970id.f359359kh1);
        View findViewById = this.wrap.findViewById(C7112R.C7115id.kh4);
        final EditText editText = view instanceof TenpaySecureEditText ? (EditText) view : (EditText) view.findViewById(C0966R.C0970id.lg_);
        if (this.mKeyboard != null && editText != null && this.mKBLayout != null) {
            C75228t.m90251i0(editText);
            final boolean z3 = z;
            final boolean z4 = z2;
            final View view2 = view;
            final EditText editText2 = editText;
            final int i2 = i;
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                public void onFocusChange(final View view, boolean z) {
                    if (!view.isFocused() || z3) {
                        new MMHandler().postDelayed(new Runnable() {
                            public void run() {
                                BaseUI.this.hideTenpayKB();
                                ((InputMethodManager) BaseUI.this.wrap.getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
                            }
                        }, 200);
                        return;
                    }
                    ((InputMethodManager) BaseUI.this.wrap.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    new MMHandler().postDelayed(new Runnable() {
                        public void run() {
                            if (!BaseUI.this.mKBLayout.isShown() && view.isShown()) {
                                C675791 r0 = C675791.this;
                                if (z4 || BaseUI.this.isVKBFirstTimeShown) {
                                    BaseUI baseUI = BaseUI.this;
                                    baseUI.isVKBFirstTimeShown = true;
                                    baseUI.showTenpayKB();
                                }
                            }
                            View view = view2;
                            if (view instanceof WalletFormView) {
                                WalletFormView walletFormView = (WalletFormView) view;
                                if ((C75592q0.m90763K() || walletFormView.getEncrptType() == 100) && (!C75592q0.m90763K() || walletFormView.getEncrptType() == 0)) {
                                    BaseUI.this.mKeyboard.resetSecureAccessibility();
                                    editText2.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                                } else {
                                    C79145c cVar = new C79145c();
                                    BaseUI.this.mKeyboard.setSecureAccessibility(cVar);
                                    editText2.setAccessibilityDelegate(cVar);
                                }
                            }
                            if (view2 instanceof EditHintPasswdView) {
                                C79145c cVar2 = new C79145c();
                                BaseUI.this.mKeyboard.setSecureAccessibility(cVar2);
                                editText2.setAccessibilityDelegate(cVar2);
                            }
                            C675791 r05 = C675791.this;
                            BaseUI.this.setKBMode(i2);
                            BaseUI.this.mKeyboard.setInputEditText((EditText) view);
                            ((InputMethodManager) BaseUI.this.wrap.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        }
                    }, 300);
                }
            });
            editText.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/kinda/framework/widget/base/BaseUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    if (!BaseUI.this.mKBLayout.isShown() && !z) {
                        BaseUI.this.showTenpayKB();
                        BaseUI.this.setKBMode(i);
                    } else if (z) {
                        BaseUI.this.hideTenpayKB();
                        ((InputMethodManager) BaseUI.this.wrap.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                    }
                    C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/BaseUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/kinda/framework/widget/base/BaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    BaseUI.this.hideTenpayKB();
                    C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/BaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }
}
