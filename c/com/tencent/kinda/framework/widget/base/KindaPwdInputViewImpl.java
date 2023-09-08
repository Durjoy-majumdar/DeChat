package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.os.Build;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.widget.base.BaseFrActivity;
import com.tencent.kinda.gen.IUIModal;
import com.tencent.kinda.gen.IUIModalPlatformFuncDelegate;
import com.tencent.kinda.gen.IUIPage;
import com.tencent.kinda.gen.IUIPagePlatformFuncDelegate;
import com.tencent.kinda.gen.KPwdInputView;
import com.tencent.kinda.gen.KPwdInputViewOnEndEnterPasswordCallback;
import com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback;
import com.tencent.kinda.gen.PwdEncryptMode;
import com.tencent.kinda.gen.PwdViewStyle;
import com.tencent.kinda.gen.Sm2HashType;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;
import di3.C86312j;
import f40.C86709a0;
import gr3.C76024a;
import h81.C32735h;
import java.lang.ref.WeakReference;

public class KindaPwdInputViewImpl extends MMKView<View> implements KPwdInputView, BaseFrActivity.IEditFocusChangeCallback {
    private final int HKSOFT_RSA2048WithMD5 = 0;
    private final int HKSOFT_RSA2048WithPBKDF2 = 1;
    private LinearLayout dummyFocusView = null;
    private boolean keyboardDisabled = false;
    private WeakReference<Context> mContext;
    /* access modifiers changed from: private */
    public KPwdInputViewOnPasswordChangeCallback pwdChangeCallback;
    /* access modifiers changed from: private */
    public PwdEncryptMode pwdEncryptMode = PwdEncryptMode.RSA;
    /* access modifiers changed from: private */
    public KPwdInputViewOnEndEnterPasswordCallback pwdEndCallback;
    /* access modifiers changed from: private */
    public String pwdNonce = "";
    private PwdViewStyle pwdStyle = PwdViewStyle.CHECKPWDSTYLE;
    /* access modifiers changed from: private */
    public long pwdTimestamp = 0;
    /* access modifiers changed from: private */
    public EditHintPasswdView pwdView;
    private boolean shouldKeepKeyboardOnClearFocus = false;
    /* access modifiers changed from: private */
    public String softEncryptSalt = "";
    /* access modifiers changed from: private */
    public int softEncryptVersion = 0;

    /* access modifiers changed from: private */
    public boolean isPwdNullAndSm2EncryptMode(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        PwdEncryptMode pwdEncryptMode2 = this.pwdEncryptMode;
        return pwdEncryptMode2 == PwdEncryptMode.SM2WITHMD5 || pwdEncryptMode2 == PwdEncryptMode.SM2WITHPBKDF2;
    }

    private void setupPwdView(Context context) {
        EditHintPasswdView editHintPasswdView = new EditHintPasswdView(context);
        this.pwdView = editHintPasswdView;
        TenpaySecureEditText tenpaySecureEditText = editHintPasswdView.f221247d;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setMovementMethod((MovementMethod) null);
        }
        PwdViewStyle pwdViewStyle = this.pwdStyle;
        if (pwdViewStyle == PwdViewStyle.CHECKPWDSTYLE || pwdViewStyle == PwdViewStyle.HALFPAGECASHIERSTYLE) {
            this.pwdView.mo105045c(1);
        } else {
            this.pwdView.mo105045c(0);
        }
        C76024a.m91321b(this.pwdView);
        this.pwdView.setEditTextMaxLength(6);
        if (context instanceof BaseFrActivity) {
            ((BaseFrActivity) context).setEditFocusListener(this.pwdView, 0, false, true, (MMFragment) null, true, this);
        }
        this.pwdView.setOnInputValidListener(new EditHintPasswdView.C75206c() {
            public void onInputValidChange(boolean z) {
                EditHintPasswdView access$000 = KindaPwdInputViewImpl.this.pwdView;
                if (access$000.f221247d != null) {
                    if (access$000.f221255o.length() > 0) {
                        TenpaySecureEditText.setSalt(access$000.f221255o);
                    } else {
                        TenpaySecureEditText.setSalt(C75228t.m90271t());
                    }
                }
                if (z) {
                    if (KindaPwdInputViewImpl.this.pwdEncryptMode == PwdEncryptMode.SM2WITHMD5) {
                        KindaPwdInputViewImpl.this.pwdView.setEncrType(4);
                    } else if (KindaPwdInputViewImpl.this.pwdEncryptMode == PwdEncryptMode.SM2WITHPBKDF2) {
                        KindaPwdInputViewImpl.this.pwdView.setEncrType(5);
                    } else if (KindaPwdInputViewImpl.this.pwdEncryptMode == PwdEncryptMode.RSAWITHHKSOFT) {
                        if (KindaPwdInputViewImpl.this.softEncryptVersion == 0) {
                            KindaPwdInputViewImpl.this.pwdView.setEncrType(6);
                        } else if (KindaPwdInputViewImpl.this.softEncryptVersion == 1) {
                            KindaPwdInputViewImpl.this.pwdView.setEncrType(7);
                        }
                    }
                    KindaPwdInputViewImpl.this.pwdView.setPwdNonce(KindaPwdInputViewImpl.this.pwdNonce);
                    KindaPwdInputViewImpl.this.pwdView.setPwdTimestamp(KindaPwdInputViewImpl.this.pwdTimestamp);
                    KindaPwdInputViewImpl.this.pwdView.setEncryptSoftSalt(KindaPwdInputViewImpl.this.softEncryptSalt);
                    String text = KindaPwdInputViewImpl.this.pwdView.getText();
                    boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_sm2_downgrade_to_rsa, false);
                    if (KindaPwdInputViewImpl.this.isPwdNullAndSm2EncryptMode(text) || (wf && KindaPwdInputViewImpl.this.pwdEncryptMode != PwdEncryptMode.RSAWITHHKSOFT)) {
                        KindaPwdInputViewImpl.this.pwdView.setEncrType(1);
                        KindaPwdInputViewImpl.this.pwdView.setPwdNonce("");
                        EditHintPasswdView access$0002 = KindaPwdInputViewImpl.this.pwdView;
                        if (access$0002.f221247d != null) {
                            if (access$0002.f221255o.length() > 0) {
                                TenpaySecureEditText.setSalt(access$0002.f221255o);
                            } else {
                                TenpaySecureEditText.setSalt(C75228t.m90271t());
                            }
                        }
                        KindaPwdInputViewImpl.this.pwdView.getText();
                    }
                    if (KindaPwdInputViewImpl.this.pwdEndCallback != null) {
                        KindaPwdInputViewImpl.this.pwdEndCallback.onEndEnterPassword(KindaPwdInputViewImpl.this.pwdView.getText(), KindaPwdInputViewImpl.this.pwdView.getMd5Value());
                    }
                    if (KindaPwdInputViewImpl.this.pwdChangeCallback != null) {
                        KindaPwdInputViewImpl.this.pwdChangeCallback.onPasswordChange(6, KindaPwdInputViewImpl.this.pwdView.getText(), KindaPwdInputViewImpl.this.pwdView.getMd5Value());
                    }
                } else if (KindaPwdInputViewImpl.this.pwdChangeCallback != null) {
                    KindaPwdInputViewImpl.this.pwdChangeCallback.onPasswordChange(KindaPwdInputViewImpl.this.pwdView.getEditText().getText().toString().length(), KindaPwdInputViewImpl.this.pwdView.getText(), KindaPwdInputViewImpl.this.pwdView.getMd5Value());
                }
            }
        });
    }

    public View createView(Context context) {
        this.mContext = new WeakReference<>(context);
        boolean z = Build.VERSION.SDK_INT < 26;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_kinda_pwd_input_dummy_focus_enable, false);
        if (z || wf) {
            LinearLayout linearLayout = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.dummyFocusView = linearLayout2;
            linearLayout2.setFocusable(true);
            this.dummyFocusView.setFocusableInTouchMode(true);
            linearLayout.addView(this.dummyFocusView, layoutParams);
            setupPwdView(context);
            linearLayout.addView(this.pwdView, new LinearLayout.LayoutParams(-1, -1));
            return linearLayout;
        }
        setupPwdView(context);
        return this.pwdView;
    }

    public boolean getAutoRemarkKeyBoradType() {
        return false;
    }

    public boolean getChearInput() {
        return false;
    }

    public boolean getFocus() {
        return false;
    }

    public String getHashData() {
        return null;
    }

    public boolean getKeyboardDisabled() {
        return this.keyboardDisabled;
    }

    public PwdEncryptMode getPwdEncryptMode() {
        return this.pwdEncryptMode;
    }

    public String getPwdNonce() {
        return this.pwdNonce;
    }

    public PwdViewStyle getPwdStyle() {
        return this.pwdStyle;
    }

    public long getPwdTimestamp() {
        return this.pwdTimestamp;
    }

    public long getTextLength() {
        return 0;
    }

    public void setAccessible(boolean z) {
        super.setAccessible(z);
        this.pwdView.getEditText().setImportantForAccessibility(2);
    }

    public void setAutoRemarkKeyBoradType(boolean z) {
    }

    public void setChearInput(boolean z) {
        if (z) {
            this.pwdView.mo105043a();
        }
    }

    public void setEncryptSoftSaltAndVersion(String str, int i) {
        this.softEncryptSalt = str;
        this.softEncryptVersion = i;
    }

    public void setFocus(boolean z) {
        if (z && this.pwdView.getVisibility() == 0 && !this.pwdView.hasFocus()) {
            MMHandlerThread.postToMainThread(new Runnable() {
                public void run() {
                    KindaPwdInputViewImpl.this.pwdView.requestFocus();
                }
            });
        } else if (!z) {
            MMHandlerThread.postToMainThread(new Runnable() {
                public void run() {
                    KindaPwdInputViewImpl.this.pwdView.clearFocus();
                }
            });
        }
    }

    public void setFocusModalListener(IUIModal iUIModal) {
        if (iUIModal == null) {
            Log.m105924i(MMKView.TAG, "modal == null.");
            return;
        }
        IUIModalPlatformFuncDelegate funcDelegate = iUIModal.getFuncDelegate();
        if (funcDelegate instanceof UIModalFuncDelegateImpl) {
            MMFragment mMFragment = ((UIModalFuncDelegateImpl) funcDelegate).weakFragment.get();
            if (mMFragment == null) {
                Log.m105924i(MMKView.TAG, "delegateImpl.activity == null.");
                return;
            }
            WeakReference<Context> weakReference = this.mContext;
            if (weakReference == null) {
                Log.m105924i(MMKView.TAG, "mContext == null.");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                Log.m105924i(MMKView.TAG, "tempContext == null.");
            } else if (context instanceof BaseFrActivity) {
                BaseFrActivity baseFrActivity = (BaseFrActivity) context;
                baseFrActivity.setEditFocusListener(this.pwdView, 0, false, true, mMFragment, true, this);
                MyKeyboardWindow keyboard = baseFrActivity.getKeyboard(mMFragment);
                if (keyboard != null) {
                    keyboard.setKeyboardDisabled(this.keyboardDisabled);
                }
            }
        }
    }

    public void setFocusUIPageListener(IUIPage iUIPage) {
        if (iUIPage == null) {
            Log.m105924i(MMKView.TAG, "page == null.");
            return;
        }
        IUIPagePlatformFuncDelegate platformFuncDelegate = iUIPage.getPlatformFuncDelegate();
        if (platformFuncDelegate instanceof UIPagePlatformDelegateImpl) {
            MMFragment mMFragment = ((UIModalFuncDelegateImpl) platformFuncDelegate).weakFragment.get();
            if (mMFragment == null) {
                Log.m105924i(MMKView.TAG, "delegateImpl.activity == null.");
                return;
            }
            WeakReference<Context> weakReference = this.mContext;
            if (weakReference == null) {
                Log.m105924i(MMKView.TAG, "mContext == null.");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                Log.m105924i(MMKView.TAG, "tempContext == null.");
            } else if (context instanceof BaseFrActivity) {
                ((BaseFrActivity) context).setEditFocusListener(this.pwdView, 0, false, true, mMFragment, true, this);
            }
        }
    }

    public void setHashData(String str) {
    }

    public void setKeepKeyboardOnClearFocus(boolean z) {
        this.shouldKeepKeyboardOnClearFocus = z;
    }

    public void setKeyboardDisabled(boolean z) {
        Context context;
        MyKeyboardWindow keyboard;
        this.keyboardDisabled = z;
        WeakReference<Context> weakReference = this.mContext;
        if (weakReference != null && (context = weakReference.get()) != null && (context instanceof BaseFrActivity) && (keyboard = ((BaseFrActivity) context).getKeyboard()) != null) {
            keyboard.setKeyboardDisabled(z);
        }
    }

    public void setOnEndEnterPasswordCallback(KPwdInputViewOnEndEnterPasswordCallback kPwdInputViewOnEndEnterPasswordCallback) {
        if (kPwdInputViewOnEndEnterPasswordCallback != null) {
            this.pwdEndCallback = kPwdInputViewOnEndEnterPasswordCallback;
        }
    }

    public void setOnPasswordChangeCallback(KPwdInputViewOnPasswordChangeCallback kPwdInputViewOnPasswordChangeCallback) {
        if (kPwdInputViewOnPasswordChangeCallback != null) {
            this.pwdChangeCallback = kPwdInputViewOnPasswordChangeCallback;
        }
    }

    public void setPwdEncryptMode(PwdEncryptMode pwdEncryptMode2) {
        this.pwdEncryptMode = pwdEncryptMode2;
    }

    public void setPwdNonce(String str) {
        this.pwdNonce = str;
    }

    public void setPwdStyle(PwdViewStyle pwdViewStyle) {
        Log.m105919d(MMKView.TAG, "set pwd: %s", pwdViewStyle);
        this.pwdStyle = pwdViewStyle;
        if (pwdViewStyle == PwdViewStyle.CHECKPWDSTYLE || pwdViewStyle == PwdViewStyle.HALFPAGECASHIERSTYLE) {
            this.pwdView.mo105045c(1);
        } else {
            this.pwdView.mo105045c(0);
        }
    }

    public void setPwdTimestamp(long j) {
        this.pwdTimestamp = j;
    }

    public void setTextLength(long j) {
    }

    public boolean shouldKeepKeyboardOnEditClearFocus() {
        return this.shouldKeepKeyboardOnClearFocus;
    }

    public Sm2HashType sm2HashType() {
        C86709a0.m107528h();
        return Sm2HashType.values()[((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SMCRYPTO_FLAG_TYPE_INT_SYNC, 0)).intValue()];
    }
}
