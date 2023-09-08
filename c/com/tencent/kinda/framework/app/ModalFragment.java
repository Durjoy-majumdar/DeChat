package com.tencent.kinda.framework.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.PlatformWrapLayout;
import com.tencent.kinda.framework.widget.base.BaseFragment;
import com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.IUIModal;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import vo3.C90852c;

@C90852c(0)
public class ModalFragment extends BaseFragment {
    public static final String TAG = "MicroMsg.ModalFragment";
    private byte _hellAccFlag_;
    private Fragment mPreFragment;
    private View mViewCenterPadding;
    private int orientationOnCreate = 0;
    private IUIModal page;

    private int getBlackMaskColorRes() {
        return C85875k4.m106211z() ? C0966R.color.aiw : C0966R.color.aix;
    }

    private void initCenterPaddingView(View view) {
        if (view != null) {
            this.mViewCenterPadding = view.findViewById(C67448R.C67449id.l8b);
            int o = C85875k4.m106198o(getContext());
            View view2 = this.mViewCenterPadding;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/kinda/framework/app/ModalFragment", "initCenterPaddingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/kinda/framework/app/ModalFragment", "initCenterPaddingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewGroup.LayoutParams layoutParams = this.mViewCenterPadding.getLayoutParams();
            layoutParams.height = o;
            this.mViewCenterPadding.setLayoutParams(layoutParams);
        }
    }

    private void initPage() {
        IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            iUIModal.setPlatformDelegate(this.pagePlatformDelegate);
            this.page.setFuncDelegate(this.uiModalFuncDelegate);
            covertPlatformData(getActivity().getIntent().getBundleExtra("key_platform_data"));
            if (useKeyboardCoverMode()) {
                View findViewById = findViewById(C0966R.C0970id.f359359kh1);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/kinda/framework/app/ModalFragment", "initPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/kinda/framework/app/ModalFragment", "initPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((ViewGroup) findViewById(C67448R.C67449id.fge)).removeView(findViewById);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                ((ViewGroup) findViewById(C67448R.C67449id.br4)).addView(findViewById, layoutParams);
            }
            Log.m105924i(TAG, "finish init page");
        }
    }

    private void setCenterPaddingColor(int i) {
        View view = this.mViewCenterPadding;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    private void setupActionAndStatusBarColor() {
        IUIModal iUIModal = this.page;
        if (iUIModal == null || iUIModal.statusbarColor() == null || this.page.statusbarColor().mNormalColor <= 0) {
            Log.m105928w(TAG, "uimodal should override statusbarColor");
            Fragment prevFragment = getPrevFragment();
            this.mPreFragment = prevFragment;
            if (prevFragment == null) {
                int color = getContext().getResources().getColor(getBlackMaskColorRes());
                setActionBarColor(color);
                setCenterPaddingColor(color);
            } else if (prevFragment instanceof ModalFragment) {
                ((ModalFragment) prevFragment).getController().mo177091q();
                setCenterPaddingColor(getContext().getResources().getColor(C0966R.color.ahf));
                setActionBarColor(0);
            } else if (prevFragment instanceof MainFragment) {
                int q = ((MainFragment) prevFragment).getController().mo177091q();
                int color2 = getContext().getResources().getColor(getBlackMaskColorRes());
                setActionBarColor((int) ColorUtil.MergeColors((long) q, (long) color2));
                setCenterPaddingColor(color2);
            }
        } else {
            setActionBarColor((int) ColorUtil.getColorByModeNoCompat(this.page.statusbarColor()));
        }
        refreshNavigationBar();
    }

    public void attachModal(IUIModal iUIModal) {
        this.page = iUIModal;
        this.mReportUrl = getReportUrl();
    }

    public void finalize() {
        super.finalize();
        Log.m105924i(TAG, "finalize " + this.page);
    }

    public IUIModal getPage() {
        return this.page;
    }

    public String getReportUrl() {
        IUIModal iUIModal = this.page;
        return iUIModal != null ? iUIModal.getReportUrl() : "";
    }

    public String getTagName() {
        return TAG;
    }

    public void initOnCreate() {
        getController().f348065F.mo91104o();
        initPage();
        if (this.page != null) {
            initPageView();
        }
    }

    public boolean onBackPressed() {
        IUIModal iUIModal = this.page;
        if (iUIModal == null) {
            return false;
        }
        iUIModal.onClickAndroidBack();
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        IUIModal iUIModal;
        super.onConfigurationChanged(configuration);
        if (!(configuration.orientation == this.orientationOnCreate || (iUIModal = this.page) == null)) {
            iUIModal.viewDidTransitionToNewSize();
        }
        this.orientationOnCreate = configuration.orientation;
    }

    public void onCreateLayout(PlatformWrapLayout platformWrapLayout) {
        this.page.onCreateLayout(platformWrapLayout);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getContext() != null && this.page.IsShowAndroidCenterPadding()) {
            initCenterPaddingView(onCreateView);
        }
        this.orientationOnCreate = getMMResources().getConfiguration().orientation;
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            iUIModal.onDestroy();
        }
        this.page = null;
    }

    public void onFirstRenderFinish() {
        IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            iUIModal.onFirstRenderFinish();
        }
    }

    public void onFragmentOnResume() {
        super.onFragmentOnResume();
        setupActionAndStatusBarColor();
    }

    public void onKeyboardShow(boolean z, int i) {
        UIPagePlatformFuncDelegateImpl uIPagePlatformFuncDelegateImpl = this.pagePlatformFuncDelegate;
        if (uIPagePlatformFuncDelegateImpl != null) {
            uIPagePlatformFuncDelegateImpl.onKeyboardShow(z, i);
        }
        UIModalFuncDelegateImpl uIModalFuncDelegateImpl = this.uiModalFuncDelegate;
        if (uIModalFuncDelegateImpl != null) {
            uIModalFuncDelegateImpl.onKeyboardShow(z, i);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.page != null && getIsEnterBackground()) {
            this.page.onModalEnterForeground();
            setIsEnterBackground(false);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.page != null && !getWillBeRemoved()) {
            this.page.onModalEnterBackground();
            setIsEnterBackground(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setupActionAndStatusBarColor();
    }

    public void refreshNavigationBar() {
        IUIModal iUIModal = this.page;
        if (iUIModal != null && iUIModal.navigationBarColor() != null && this.page.navigationBarColor().mNormalColor > 0) {
            getController().mo177103x0((int) ColorUtil.getColorByModeNoCompat(this.page.navigationBarColor()));
        }
    }

    public void restoreActionBarColor() {
    }

    public void setTopRightBtnImage(String str) {
        this.pagePlatformFuncDelegate.setTopRightBtnImage(str);
    }

    public void setTopRightBtnTitle(String str, DynamicColor dynamicColor) {
        this.pagePlatformFuncDelegate.setTopRightBtnTitle(str, MMKViewUtil.colorToString(ColorUtil.getColorByMode(dynamicColor)));
    }

    public boolean useImmediateKeyboardAnimation() {
        IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            return iUIModal.useImmediateKeyboardAnimation();
        }
        return false;
    }

    public boolean useKeyboardCoverMode() {
        IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            return iUIModal.useKeyboardCoverMode();
        }
        return false;
    }

    public boolean usePanelModalMode() {
        IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            return iUIModal.usePanelModalMode();
        }
        return false;
    }

    public void willActive() {
        super.willActive();
    }

    public void willDeActive() {
        super.willDeActive();
    }
}
