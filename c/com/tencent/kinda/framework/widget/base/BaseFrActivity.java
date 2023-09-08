package com.tencent.kinda.framework.widget.base;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.tencent.kinda.framework.app.ModalFragment;
import com.tencent.kinda.framework.widget.tools.ActivityController;
import com.tencent.kinda.framework.widget.tools.ConstantsKinda;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import yq3.C79145c;

public abstract class BaseFrActivity extends MMActivity {
    public static final int HARDCODE_TENPAY_KEYBOARD_HEIGHT = C76577a.m92151b(MMApplicationContext.getContext(), 270);
    public static final String TAG = "MicroMsg.BaseFrActivity";
    private final int PWD_INPUT_VIEW_AND_KEYBOARD_GAP_PX = 26;
    private byte _hellAccFlag_;
    private boolean isDestroyByThisFinish = false;
    public boolean isVKBFirstTimeShown = false;
    public IWalletTenpayKBStateCallBackListener mTenpayKBStateCallBackListener;
    private C75217h mTenpayKBStateListener;
    /* access modifiers changed from: private */
    public View m_scrollViewBecouseOfKeyBoard = null;

    public interface IEditFocusChangeCallback {
        boolean shouldKeepKeyboardOnEditClearFocus();
    }

    public interface IWalletTenpayKBStateCallBackListener {
        void onCallBackKinda(boolean z, float f, BaseFragment baseFragment);
    }

    public static BaseFragment topShowFragmentOf(List<Fragment> list) {
        if (list == null) {
            Log.m105920e(TAG, "fragmentList == null.");
            return null;
        }
        ListIterator<Fragment> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            BaseFragment baseFragment = (BaseFragment) listIterator.previous();
            if (!(baseFragment instanceof BaseFragment)) {
                Log.m105920e(TAG, "not a BaseFragment.");
            } else if (!baseFragment.isHidden()) {
                return baseFragment;
            } else {
                Log.m105920e(TAG, "fragment is hidden, next.");
            }
        }
        return null;
    }

    private boolean useKeyboardCoverMode(WeakReference<MMFragment> weakReference) {
        MMFragment mMFragment;
        if (weakReference == null || (mMFragment = weakReference.get()) == null || !(mMFragment instanceof BaseFragment)) {
            return false;
        }
        return ((BaseFragment) mMFragment).useKeyboardCoverMode();
    }

    public void attachOnlyActivity() {
        ActivityController.attachOnlyActivity(this);
    }

    public View findViewById(int i) {
        return super.findViewById(i);
    }

    public void finish() {
        super.finish();
        this.isDestroyByThisFinish = true;
        ActivityController.detach(this);
        Log.m105924i(TAG, "BaseFrActivity finish exec! " + android.util.Log.getStackTraceString(new Throwable("the stack of finish: ")));
    }

    public View getKBLayout(MMFragment mMFragment) {
        if (mMFragment != null) {
            return mMFragment.findViewById(C0966R.C0970id.f359359kh1);
        }
        Log.m105924i(TAG, "fragment == null");
        return getKBLayout();
    }

    public MyKeyboardWindow getKeyboard(MMFragment mMFragment) {
        if (mMFragment != null) {
            return (MyKeyboardWindow) mMFragment.findViewById(C7112R.C7115id.f361869tenpay_num_keyboard);
        }
        Log.m105924i(TAG, "fragment == null");
        return getKeyboard();
    }

    public TenpaySecureEditText getTenpaySecureEditText() {
        BaseFragment baseFragment = topShowFragment();
        if (baseFragment == null) {
            Log.m105920e(TAG, "fragment == null.");
            return null;
        }
        View findViewById = baseFragment.findViewById(C0966R.C0970id.lg_);
        if (findViewById instanceof TenpaySecureEditText) {
            return (TenpaySecureEditText) findViewById;
        }
        return null;
    }

    public void hideTenpayKB() {
        hideTenpayKB((View) null, (WeakReference<MMFragment>) null);
    }

    public boolean needToShowClearIcon(TenpaySecureEditText tenpaySecureEditText) {
        return (tenpaySecureEditText.getText().toString().equals("") || TenpaySecureEditText.EditState.PASSWORD == tenpaySecureEditText.getEditState() || TenpaySecureEditText.EditState.CVV_PAYMENT == tenpaySecureEditText.getEditState() || TenpaySecureEditText.EditState.CVV_4_PAYMENT == tenpaySecureEditText.getEditState()) ? false : true;
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i(TAG, "onCreate");
        super.onCreate(bundle);
        ActivityController.attach(this);
        int intExtra = getIntent().getIntExtra(ConstantsKinda.INTENT_ENTER_ANIMATION, -1);
        if (intExtra != -1) {
            overridePendingTransition(intExtra, 0);
        }
    }

    public void onDestroy() {
        Log.m105924i(TAG, "onDestroy");
        if (!this.isDestroyByThisFinish) {
            ActivityController.detach(this);
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        ActivityController.attach(this);
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
            int j = C76577a.m92159j(getContext());
            int b = (j - height) - C76577a.m92151b(getContext(), i);
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

    public void setTenpayKBStateCallBackListener(IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener) {
        this.mTenpayKBStateCallBackListener = iWalletTenpayKBStateCallBackListener;
    }

    public void setTenpayKBStateListener(C75217h hVar) {
        this.mTenpayKBStateListener = hVar;
    }

    public void showTenpayKB(final View view, WeakReference<MMFragment> weakReference) {
        if (view != null && !view.isShown()) {
            if (useKeyboardCoverMode(weakReference)) {
                View findViewById = view.findViewById(C7112R.C7115id.f361868tenpay_keyboard_top_line);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = view.findViewById(C7112R.C7115id.kh4);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                final C75217h hVar = this.mTenpayKBStateListener;
                final IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = this.mTenpayKBStateCallBackListener;
                Animation loadAnimation = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2492eg);
                loadAnimation.setInterpolator(new LinearInterpolator());
                loadAnimation.setDuration(200);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    private byte _hellAccFlag_;

                    public void onAnimationEnd(Animation animation) {
                        Log.m105918d(BaseFrActivity.TAG, "keyboard anim end");
                        C75217h hVar = hVar;
                        if (hVar != null) {
                            hVar.onVisibleStateChange(true);
                        }
                        IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = iWalletTenpayKBStateCallBackListener;
                        if (iWalletTenpayKBStateCallBackListener != null) {
                            iWalletTenpayKBStateCallBackListener.onCallBackKinda(true, (float) view.getHeight(), (BaseFragment) null);
                        }
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                        Log.m105918d(BaseFrActivity.TAG, "keyboard anim start");
                        View view = view;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/kinda/framework/widget/base/BaseFrActivity$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                });
                view.startAnimation(loadAnimation);
                return;
            }
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75217h hVar2 = this.mTenpayKBStateListener;
            if (hVar2 != null) {
                hVar2.onVisibleStateChange(true);
            }
            if (this.mTenpayKBStateCallBackListener != null) {
                view.post(new Runnable() {
                    public void run() {
                        BaseFrActivity.this.mTenpayKBStateCallBackListener.onCallBackKinda(true, (float) view.getHeight(), (BaseFragment) null);
                    }
                });
            }
        }
    }

    public void showVKB() {
        View currentFocus;
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    public BaseFragment topShowFragment() {
        return topShowFragmentOf(getSupportFragmentManager().getFragments());
    }

    public void hideTenpayKB(final View view, WeakReference<MMFragment> weakReference) {
        if (view != null && view.isShown()) {
            if (useKeyboardCoverMode(weakReference)) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2493eh);
                loadAnimation.setDuration(200);
                loadAnimation.setInterpolator(new LinearInterpolator());
                final C75217h hVar = this.mTenpayKBStateListener;
                final IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = this.mTenpayKBStateCallBackListener;
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    private byte _hellAccFlag_;

                    public void onAnimationEnd(Animation animation) {
                        View view = view;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C75217h hVar = hVar;
                        if (hVar != null) {
                            hVar.onVisibleStateChange(false);
                        }
                        IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = iWalletTenpayKBStateCallBackListener;
                        if (iWalletTenpayKBStateCallBackListener != null) {
                            iWalletTenpayKBStateCallBackListener.onCallBackKinda(false, (float) view.getHeight(), (BaseFragment) null);
                        }
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }
                });
                view.startAnimation(loadAnimation);
                return;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "hideTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "hideTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75217h hVar2 = this.mTenpayKBStateListener;
            if (hVar2 != null) {
                hVar2.onVisibleStateChange(false);
            }
            IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener2 = this.mTenpayKBStateCallBackListener;
            if (iWalletTenpayKBStateCallBackListener2 != null) {
                iWalletTenpayKBStateCallBackListener2.onCallBackKinda(false, (float) view.getHeight(), (BaseFragment) null);
            }
        }
    }

    public void setEditFocusListener(View view, int i, boolean z, boolean z2) {
        setEditFocusListener(view, i, z, z2, (MMFragment) null, false, (IEditFocusChangeCallback) null);
    }

    public void setEditFocusListener(View view, int i, boolean z, boolean z2, MMFragment mMFragment, boolean z3, IEditFocusChangeCallback iEditFocusChangeCallback) {
        View view2 = view;
        MMFragment mMFragment2 = mMFragment;
        MyKeyboardWindow keyboard = getKeyboard(mMFragment2);
        final View kBLayout = getKBLayout(mMFragment2);
        if (keyboard == null || kBLayout == null) {
            return;
        }
        View findViewById = kBLayout.findViewById(C7112R.C7115id.kh4);
        View findViewById2 = kBLayout.findViewById(C7112R.C7115id.f361868tenpay_keyboard_top_line);
        if (z3) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = findViewById2;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view5 = findViewById;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = findViewById2;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        EditText editText = view2 instanceof TenpaySecureEditText ? (EditText) view2 : (EditText) view2.findViewById(C0966R.C0970id.lg_);
        if (editText != null) {
            C75228t.m90251i0(editText);
            WeakReference weakReference = new WeakReference(mMFragment2);
            final boolean z4 = z;
            final MMFragment mMFragment3 = mMFragment;
            final View view7 = kBLayout;
            final boolean z5 = z2;
            final WeakReference weakReference2 = weakReference;
            final View view8 = view;
            final MyKeyboardWindow myKeyboardWindow = keyboard;
            C675671 r122 = r0;
            final EditText editText2 = editText;
            WeakReference weakReference3 = weakReference;
            final int i2 = i;
            View view9 = findViewById;
            final IEditFocusChangeCallback iEditFocusChangeCallback2 = iEditFocusChangeCallback;
            C675671 r0 = new View.OnFocusChangeListener() {
                public void onFocusChange(final View view, boolean z) {
                    if (!view.isFocused() || z4) {
                        IEditFocusChangeCallback iEditFocusChangeCallback = iEditFocusChangeCallback2;
                        final boolean shouldKeepKeyboardOnEditClearFocus = iEditFocusChangeCallback != null ? iEditFocusChangeCallback.shouldKeepKeyboardOnEditClearFocus() : false;
                        C675692 r2 = new Runnable() {
                            public void run() {
                                if (!shouldKeepKeyboardOnEditClearFocus) {
                                    C675671 r0 = C675671.this;
                                    BaseFrActivity.this.hideTenpayKB(view7, weakReference2);
                                }
                                if (BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard != null) {
                                    BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard.scrollTo(0, 0);
                                    View unused = BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard = null;
                                }
                                C675671 r05 = C675671.this;
                                if (z4) {
                                    ((InputMethodManager) BaseFrActivity.this.getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
                                }
                            }
                        };
                        WeakReference weakReference = weakReference2;
                        if (weakReference != null && (weakReference.get() instanceof ModalFragment) && ((ModalFragment) weakReference2.get()).useImmediateKeyboardAnimation()) {
                            view.post(r2);
                        } else {
                            new MMHandler().postDelayed(r2, 200);
                        }
                    } else {
                        ((InputMethodManager) BaseFrActivity.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        C675681 r7 = new Runnable() {
                            public void run() {
                                C675671 r0 = C675671.this;
                                View kBLayout = BaseFrActivity.this.getKBLayout(mMFragment3);
                                View view = view7;
                                if (view == kBLayout) {
                                    if (!view.isShown() && view.getVisibility() == 0) {
                                        C675671 r05 = C675671.this;
                                        if (z5 || BaseFrActivity.this.isVKBFirstTimeShown) {
                                            BaseFrActivity baseFrActivity = BaseFrActivity.this;
                                            baseFrActivity.isVKBFirstTimeShown = true;
                                            baseFrActivity.showTenpayKB(view7, weakReference2);
                                        }
                                    }
                                    View view2 = view8;
                                    if (view2 instanceof WalletFormView) {
                                        WalletFormView walletFormView = (WalletFormView) view2;
                                        if ((C75592q0.m90763K() || walletFormView.getEncrptType() == 100) && (!C75592q0.m90763K() || walletFormView.getEncrptType() == 0)) {
                                            myKeyboardWindow.resetSecureAccessibility();
                                            editText2.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                                        } else {
                                            C79145c cVar = new C79145c();
                                            myKeyboardWindow.setSecureAccessibility(cVar);
                                            editText2.setAccessibilityDelegate(cVar);
                                        }
                                    }
                                    if (view8 instanceof EditHintPasswdView) {
                                        C79145c cVar2 = new C79145c();
                                        myKeyboardWindow.setSecureAccessibility(cVar2);
                                        editText2.setAccessibilityDelegate(cVar2);
                                    }
                                    C675671 r06 = C675671.this;
                                    myKeyboardWindow.setXMode(i2);
                                    myKeyboardWindow.setInputEditText((EditText) view);
                                    ((InputMethodManager) BaseFrActivity.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                                }
                            }
                        };
                        WeakReference weakReference2 = weakReference2;
                        if (weakReference2 != null && (weakReference2.get() instanceof ModalFragment) && ((ModalFragment) weakReference2.get()).useImmediateKeyboardAnimation()) {
                            view.post(r7);
                        } else {
                            new MMHandler().postDelayed(r7, 300);
                        }
                    }
                    if (view instanceof TenpaySecureEditText) {
                        TenpaySecureEditText tenpaySecureEditText = (TenpaySecureEditText) view;
                        if (tenpaySecureEditText.getTag() instanceof MMKEditText) {
                            MMKEditText mMKEditText = (MMKEditText) tenpaySecureEditText.getTag();
                            if (!tenpaySecureEditText.isFocused()) {
                                mMKEditText.setVisibleClearIcon(false);
                                mMKEditText.callBackKindaTextEndEditing();
                            } else if (BaseFrActivity.this.needToShowClearIcon(tenpaySecureEditText)) {
                                mMKEditText.setVisibleClearIcon(true);
                            }
                        } else if (tenpaySecureEditText.getTag() instanceof KindaSecureEditTextImpl) {
                            if (!tenpaySecureEditText.isFocused()) {
                                ((KindaSecureEditTextImpl) tenpaySecureEditText.getTag()).setVisibleClearIcon(false);
                            } else if (BaseFrActivity.this.needToShowClearIcon(tenpaySecureEditText)) {
                                ((KindaSecureEditTextImpl) tenpaySecureEditText.getTag()).setVisibleClearIcon(true);
                            }
                        } else if (!tenpaySecureEditText.isFocused()) {
                            tenpaySecureEditText.setCompoundDrawables(tenpaySecureEditText.getCompoundDrawables()[0], tenpaySecureEditText.getCompoundDrawables()[1], (Drawable) null, tenpaySecureEditText.getCompoundDrawables()[3]);
                        } else if (BaseFrActivity.this.needToShowClearIcon(tenpaySecureEditText)) {
                            tenpaySecureEditText.setCompoundDrawables(tenpaySecureEditText.getCompoundDrawables()[0], tenpaySecureEditText.getCompoundDrawables()[1], tenpaySecureEditText.getClearBtnDrawable(), tenpaySecureEditText.getCompoundDrawables()[3]);
                        }
                    }
                }
            };
            editText.setOnFocusChangeListener(r122);
            final View view10 = kBLayout;
            final boolean z6 = z;
            final WeakReference weakReference4 = weakReference3;
            final MyKeyboardWindow myKeyboardWindow2 = keyboard;
            final int i3 = i;
            final EditText editText3 = editText;
            editText.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/kinda/framework/widget/base/BaseFrActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    if (!view10.isShown() && !z6) {
                        BaseFrActivity.this.showTenpayKB(view10, weakReference4);
                        myKeyboardWindow2.setXMode(i3);
                    } else if (z6) {
                        BaseFrActivity.this.hideTenpayKB(view10, weakReference4);
                        ((InputMethodManager) BaseFrActivity.this.getContext().getSystemService("input_method")).showSoftInput(editText3, 0);
                    }
                    C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/BaseFrActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            final WeakReference weakReference5 = weakReference3;
            view9.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/kinda/framework/widget/base/BaseFrActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    BaseFrActivity.this.hideTenpayKB(kBLayout, weakReference5);
                    if (BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard != null) {
                        BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard.scrollTo(0, 0);
                        View unused = BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard = null;
                    }
                    C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/BaseFrActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }

    public View getKBLayout() {
        BaseFragment baseFragment = topShowFragment();
        if (baseFragment != null) {
            return baseFragment.findViewById(C0966R.C0970id.f359359kh1);
        }
        Log.m105920e(TAG, "fragment == null.");
        return null;
    }

    public MyKeyboardWindow getKeyboard() {
        BaseFragment baseFragment = topShowFragment();
        if (baseFragment != null) {
            return (MyKeyboardWindow) baseFragment.findViewById(C7112R.C7115id.f361869tenpay_num_keyboard);
        }
        Log.m105920e(TAG, "fragment == null.");
        return null;
    }
}
