package com.tencent.kinda.framework.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.base.BaseFragment;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.framework.widget.tools.ResourcesUtils;
import com.tencent.kinda.gen.AndroidWindowAdjustMode;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.IUIPagePlatformFuncDelegate;
import com.tencent.kinda.gen.ReportEvent;
import com.tencent.kinda.gen.ViewReportStruct;
import com.tencent.kinda.gen.VoidBoolI32Callback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import kr0.C76630x0;
import xb3.C78781k;
import yb3.C79064a;
import zt3.C119157j;
import zt3.C119179t;

public class UIPagePlatformFuncDelegateImpl implements IUIPagePlatformFuncDelegate {
    private static final String TAG = "UIPagePlatformFuncDelegateImpl";
    private byte _hellAccFlag_;
    private C74779i mAndroidBug5497Workaround;
    /* access modifiers changed from: private */
    public Dialog mTipDialog = null;
    private String mmTitle = "";
    /* access modifiers changed from: private */
    public VoidBoolI32Callback onKeyboardShowCallback;
    private VoidCallback topLeftBtnCallback;
    /* access modifiers changed from: private */
    public VoidCallback topRightBtnCallback;
    private String topRightBtnColor;
    private int topRightBtnResId = -1;
    private String topRightBtnTitle;
    /* access modifiers changed from: private */
    public WeakReference<MMFragment> weakFragment;

    /* renamed from: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl$6 */
    public static /* synthetic */ class C675396 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.kinda.gen.AndroidWindowAdjustMode[] r0 = com.tencent.kinda.gen.AndroidWindowAdjustMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode = r0
                com.tencent.kinda.gen.AndroidWindowAdjustMode r1 = com.tencent.kinda.gen.AndroidWindowAdjustMode.RESIZE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.AndroidWindowAdjustMode r1 = com.tencent.kinda.gen.AndroidWindowAdjustMode.PAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.AndroidWindowAdjustMode r1 = com.tencent.kinda.gen.AndroidWindowAdjustMode.NOTHING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.C675396.<clinit>():void");
        }
    }

    public UIPagePlatformFuncDelegateImpl(MMFragment mMFragment) {
        this.weakFragment = new WeakReference<>(mMFragment);
    }

    private void recreateTopRightBtn() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
            return;
        }
        mMFragment.removeAllOptionMenu();
        Drawable drawable = null;
        if (this.topRightBtnResId > 0 && (drawable = mMFragment.getResources().getDrawable(this.topRightBtnResId)) != null && !Util.isNullOrNil(this.topRightBtnColor)) {
            try {
                drawable.setColorFilter(Color.parseColor(this.topRightBtnColor), PorterDuff.Mode.SRC_ATOP);
            } catch (Exception unused) {
            }
        }
        mMFragment.addIconOptionMenu(1, this.topRightBtnTitle, drawable, (MenuItem.OnMenuItemClickListener) new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (UIPagePlatformFuncDelegateImpl.this.topRightBtnCallback == null) {
                    return false;
                }
                UIPagePlatformFuncDelegateImpl.this.topRightBtnCallback.call();
                return true;
            }
        });
    }

    public void addReportInfo(ViewReportStruct viewReportStruct) {
        BaseFragment baseFragment = (BaseFragment) this.weakFragment.get();
        if (baseFragment != null) {
            String str = viewReportStruct.mViewId;
            boolean z = viewReportStruct.mCheckViewExposure;
            boolean z2 = viewReportStruct.mCheckBtnNoResponse;
            boolean z3 = viewReportStruct.mCheckColor;
            int i = viewReportStruct.mBgColor;
            int i2 = C67448R.C67449id.fge;
            MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) baseFragment.getActivity();
            ReportEvent reportEvent = viewReportStruct.mEvent;
            if (reportEvent == ReportEvent.CUSTOM) {
                baseFragment.addCustomReportEvent(viewReportStruct.mCustomKey, new C79064a(z, z2, 300, (View) null, 0, str, mMFragmentActivity, z3, i, i2));
            } else if (reportEvent == ReportEvent.CREATE) {
                baseFragment.addLifecycleReportEvent(C78781k.C78782a.Event_OnCreate, new C79064a(z, z2, 300, (View) null, 0, str, mMFragmentActivity, z3, i, i2));
            } else if (reportEvent == ReportEvent.RESUME) {
                baseFragment.addLifecycleReportEvent(C78781k.C78782a.Event_OnResume, new C79064a(z, z2, 300, (View) null, 0, str, mMFragmentActivity, z3, i, i2));
            }
        }
    }

    public void beginIgnoringInteractionEvents() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else {
            mMFragment.getWindow().addFlags(16);
        }
    }

    public void closeUI(boolean z) {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else if (mMFragment instanceof BaseFragment) {
            BaseFragment baseFragment = (BaseFragment) mMFragment;
            if (baseFragment.isTinyApp && baseFragment.tinyAppUserName != null) {
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106894i7(baseFragment.tinyAppUserName, "", -1, false);
            }
            baseFragment.popFragment();
        }
    }

    public void endEditing() {
        BaseFragment baseFragment;
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
            return;
        }
        mMFragment.hideVKB();
        if (mMFragment.getActivity() != null) {
            View kBLayout = getKBLayout();
            if (kBLayout != null && kBLayout.isShown()) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(kBLayout, aVar.mo10232b(), "com/tencent/kinda/framework/app/UIPagePlatformFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                kBLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(kBLayout, "com/tencent/kinda/framework/app/UIPagePlatformFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            WcPayKeyboard wcPayKeyboard = getWcPayKeyboard();
            if (wcPayKeyboard != null && (baseFragment = (BaseFragment) this.weakFragment.get()) != null) {
                baseFragment.hideWcPayKeyboard();
                EditText editText = wcPayKeyboard.f220918y;
                if (editText != null) {
                    editText.clearFocus();
                }
            }
        }
    }

    public void endIgnoringInteractionEvents() {
        new MMHandler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                MMFragment mMFragment = (MMFragment) UIPagePlatformFuncDelegateImpl.this.weakFragment.get();
                if (mMFragment == null) {
                    Log.m105924i(UIPagePlatformFuncDelegateImpl.TAG, "activity == null.");
                } else {
                    mMFragment.getWindow().clearFlags(16);
                }
            }
        });
    }

    public View getKBLayout() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment != null) {
            return mMFragment.findViewById(C0966R.C0970id.f359359kh1);
        }
        Log.m105924i(TAG, "activity == null.");
        return null;
    }

    public String getTitle() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
            return "";
        }
        return mMFragment.getMMTitle() + "";
    }

    public WcPayKeyboard getWcPayKeyboard() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment != null) {
            return (WcPayKeyboard) mMFragment.findViewById(C67448R.C67449id.lkw);
        }
        Log.m105924i(TAG, "activity == null.");
        return null;
    }

    public void onKeyboardShow(final boolean z, final int i) {
        if (this.onKeyboardShowCallback != null) {
            C119179t tVar = C119157j.f356862d;
            C675374 r1 = new Runnable() {
                public void run() {
                    UIPagePlatformFuncDelegateImpl.this.onKeyboardShowCallback.call(z, i);
                }
            };
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(r1, 100, false);
        }
    }

    public void refreshNavigationBar() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment instanceof MainFragment) {
            ((MainFragment) mMFragment).refreshNavigationBar();
        }
    }

    public void reset() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
            return;
        }
        mMFragment.setMMNormalView();
        if (!Util.isNullOrNil(this.mmTitle)) {
            mMFragment.setMMTitle(this.mmTitle);
        }
        recreateTopRightBtn();
        VoidCallback voidCallback = this.topLeftBtnCallback;
        if (voidCallback != null) {
            setTopLeftBackBtnCallbackImpl(voidCallback);
        }
    }

    public void setBackgroundColor(DynamicColor dynamicColor) {
    }

    public void setKeyBoardShowCallbackImpl(VoidBoolI32Callback voidBoolI32Callback) {
        this.onKeyboardShowCallback = voidBoolI32Callback;
    }

    public void setTitle(String str) {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
            return;
        }
        mMFragment.setMMTitle(str);
        this.mmTitle = str;
    }

    public void setTopLeftBackBtnCallbackImpl(final VoidCallback voidCallback) {
        this.topLeftBtnCallback = voidCallback;
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else {
            mMFragment.setBackBtn(new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    VoidCallback voidCallback = voidCallback;
                    if (voidCallback == null) {
                        return false;
                    }
                    voidCallback.call();
                    return true;
                }
            });
        }
    }

    public void setTopRightBtnImage(String str) {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else if (!Util.isNullOrNil(str)) {
            int drawableId = ResourcesUtils.getDrawableId(mMFragment.getContext(), str);
            this.topRightBtnResId = drawableId;
            if (drawableId <= 0) {
                this.topRightBtnResId = ResourcesUtils.getResId(mMFragment.getContext(), str, ShareConstants.DEXMODE_RAW);
            }
            recreateTopRightBtn();
        }
    }

    public void setTopRightBtnTitle(String str, String str2) {
        this.topRightBtnTitle = str;
        this.topRightBtnColor = str2;
    }

    public void setTopRightCallbackImpl(VoidCallback voidCallback) {
        this.topRightBtnCallback = voidCallback;
        recreateTopRightBtn();
    }

    public void setWindowSoftInputAdjustMode(AndroidWindowAdjustMode androidWindowAdjustMode) {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else if (mMFragment.getActivity().getWindow() != null) {
            int i = C675396.$SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode[androidWindowAdjustMode.ordinal()];
            mMFragment.getActivity().getWindow().setSoftInputMode((i != 1 ? i != 2 ? i != 3 ? 0 : 48 : 32 : 16) | 3);
            if (androidWindowAdjustMode == AndroidWindowAdjustMode.RESIZE) {
                this.mAndroidBug5497Workaround = new C74779i(mMFragment.getActivity(), false);
                return;
            }
            C74779i iVar = this.mAndroidBug5497Workaround;
            if (iVar != null) {
                iVar.f219898d.getViewTreeObserver().removeOnGlobalLayoutListener(iVar.f219903i);
                iVar.f219900f.height = -1;
                iVar.f219898d.requestLayout();
            }
        }
    }

    public void startLoading(String str, boolean z) {
        Dialog dialog = this.mTipDialog;
        if (dialog != null) {
            dialog.show();
            return;
        }
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e(TAG, "IUIPagePlatformFuncDelegate can't startLoading because the activity is null!");
            return;
        }
        Dialog c = C75197d0.m90162c(topOrUIPageFragmentActivity, topOrUIPageFragmentActivity.getString(C0966R.string.l4f), true, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                if (UIPagePlatformFuncDelegateImpl.this.mTipDialog != null && UIPagePlatformFuncDelegateImpl.this.mTipDialog.isShowing()) {
                    UIPagePlatformFuncDelegateImpl.this.mTipDialog.dismiss();
                }
            }
        });
        this.mTipDialog = c;
        c.setCancelable(false);
    }

    public void stopLoading() {
        Dialog dialog = this.mTipDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mTipDialog.dismiss();
        }
    }

    public void triggerReport(ReportEvent reportEvent, String str) {
        BaseFragment baseFragment = (BaseFragment) this.weakFragment.get();
        if (baseFragment == null) {
            return;
        }
        if (reportEvent == ReportEvent.CUSTOM) {
            baseFragment.triggerReport(C78781k.C78782a.Event_Custom, str);
        } else if (reportEvent == ReportEvent.CREATE) {
            baseFragment.triggerReport(C78781k.C78782a.Event_OnCreate, "");
        } else if (reportEvent == ReportEvent.RESUME) {
            baseFragment.triggerReport(C78781k.C78782a.Event_OnResume, "");
        }
    }
}
