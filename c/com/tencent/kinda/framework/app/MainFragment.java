package com.tencent.kinda.framework.app;

import android.os.Bundle;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.PlatformWrapLayout;
import com.tencent.kinda.framework.widget.base.BaseFragment;
import com.tencent.kinda.framework.widget.base.MMKViewLayout;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.IUIPage;
import com.tencent.p014mm.sdk.platformtools.Log;
import vo3.C90852c;

@C90852c(0)
public class MainFragment extends BaseFragment {
    public static final String TAG = "MicroMsg.MainFragment";
    private boolean hasInvokedOnBack = false;
    private IUIPage page;
    private MMKViewLayout root;

    private void initPage() {
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.setPlatformFuncDelegate(this.pagePlatformFuncDelegate);
            this.page.setPlatformDelegate(this.pagePlatformDelegate);
            covertPlatformData(getActivity().getIntent().getBundleExtra("key_platform_data"));
            initWithNavigationBarConfig(this.page.defaultNavigationBarConfig());
            if (this.page.fullPageMode() && getController().f348065F != null) {
                Log.m105924i(TAG, "UIPage is fullPageMode, so hide Actionbar.");
                getController().f348065F.mo91104o();
            }
            Log.m105924i(TAG, "finish init page");
        }
    }

    private void setSystemUIByFullMode() {
        int colorByMode = (int) ColorUtil.getColorByMode(this.page.defaultNavigationBarConfig().mBackgroundColor);
        setActionBarColor(colorByMode);
        getController().mo177103x0(colorByMode);
    }

    public void attachPage(IUIPage iUIPage) {
        this.page = iUIPage;
        this.mReportUrl = getReportUrl();
    }

    public void finalize() {
        super.finalize();
        Log.m105924i(TAG, "finalize " + this.page);
    }

    public int getLayoutId() {
        return C67448R.C67450layout.b3g;
    }

    public String getReportUrl() {
        IUIPage iUIPage = this.page;
        return iUIPage != null ? iUIPage.getReportUrl() : "";
    }

    public String getTagName() {
        return TAG;
    }

    public void initOnCreate() {
        initPage();
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onCreate();
            initPageView();
        }
    }

    public void initPagePlatformDelegate() {
        super.initPagePlatformDelegate();
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.setPlatformFuncDelegate(this.pagePlatformFuncDelegate);
            this.page.setPlatformDelegate(this.pagePlatformDelegate);
        }
    }

    public boolean onBackPressed() {
        IUIPage iUIPage = this.page;
        if (iUIPage == null) {
            return false;
        }
        iUIPage.onClickAndroidBack();
        return true;
    }

    public void onCreate(Bundle bundle) {
        IUIPage iUIPage;
        if (!(this.mCustomActioinBarController == null || (iUIPage = this.page) == null || !iUIPage.forceShowInLightMode())) {
            this.mCustomActioinBarController.f348087a0 = false;
        }
        super.onCreate(bundle);
    }

    public void onCreateLayout(PlatformWrapLayout platformWrapLayout) {
        this.root = platformWrapLayout;
        this.page.onCreateLayout(platformWrapLayout);
    }

    public void onDestroy() {
        super.onDestroy();
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            if (!this.hasInvokedOnBack) {
                iUIPage.onBack();
                this.hasInvokedOnBack = true;
            }
            this.page.onDestroy();
        }
        this.page = null;
    }

    public void onFirstLayoutFinished() {
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onFirstLayoutFinished();
        }
    }

    public void onFragmentOnResume() {
        super.onFragmentOnResume();
        setSystemUIByFullMode();
    }

    public void onKeyboardShow(boolean z, int i) {
        UIPagePlatformFuncDelegateImpl uIPagePlatformFuncDelegateImpl = this.pagePlatformFuncDelegate;
        if (uIPagePlatformFuncDelegateImpl != null) {
            uIPagePlatformFuncDelegateImpl.onKeyboardShow(z, i);
        }
        IUIPage iUIPage = this.page;
        if (iUIPage == null) {
            return;
        }
        if (z) {
            iUIPage.keyboardWillShow((float) i);
        } else {
            iUIPage.keyboardWillHide();
        }
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        IUIPage iUIPage = this.page;
        if (iUIPage != null && !this.hasInvokedOnBack) {
            iUIPage.onBack();
            this.hasInvokedOnBack = true;
        }
    }

    public void refreshNavigationBar() {
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            initWithNavigationBarConfig(iUIPage.defaultNavigationBarConfig());
        }
    }

    public void setTopRightBtnImage(String str) {
        this.pagePlatformFuncDelegate.setTopRightBtnImage(str);
    }

    public void setTopRightBtnTitle(String str, DynamicColor dynamicColor) {
        this.pagePlatformFuncDelegate.setTopRightBtnTitle(str, MMKViewUtil.colorToString(ColorUtil.getColorByMode(dynamicColor)));
    }

    public boolean supportNavigationSwipeBack() {
        IUIPage iUIPage = this.page;
        if (iUIPage == null) {
            return false;
        }
        return iUIPage.enableInteractivePop();
    }

    public void willActive() {
        super.willActive();
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onVisible();
        }
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(true);
        }
    }

    public void willDeActive() {
        super.willDeActive();
        IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onInvisible();
            hideKeyboard();
        }
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }
}
